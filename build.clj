(ns build
  (:require [clojure.edn :as edn]
            [clojure.string :as str]
            [clojure.tools.build.api :as b]
            [clojure.pprint :as pp]
            [clojure.java.io :as io]
            [clojure.walk :as walk]
            [clojure.java.shell :as sh]
            [clj-commons.digest :as digest])
  (:import (java.util.regex Pattern)))

;; copied to from ctim.version

(defn artifact-version [params]
  (let [{:keys [major minor schema release dev] :as m}
        (-> (io/file "resources/ctim/version.edn")
            slurp
            edn/read-string)]
    (str major "."
         minor "."
         schema "."
         (if (:release params) release (str dev "-SNAPSHOT")))))

(def lib 'threatgrid/ctim)
(def class-dir "target/classes")
(def basis (delay (b/create-basis {:project "deps.edn"})))

(defn clean [params]
  (b/delete {:path "target"}))

(defn jar [{:keys [version] :as params}]
  {:pre [version]}
  (clean nil)
  (b/write-pom {:class-dir class-dir
                :lib lib
                :version version
                :basis basis
                :scm {:url "https://github.com/threatgrid/ctim"
                      :connection "scm:git:git://github.com/threatgrid/ctim.git"
                      :developerConnection "scm:git:git@github.com:threatgrid/ctim.git"
                      :tag (if (str/ends-with? version "-SNAPSHOT")
                             (b/git-process {:git-args "rev-parse HEAD"})
                             ;; we commit the checksum of the jar to the repo ahead of time to ensure it is reproducible.
                             ;; so it cannot contain the release SHA.
                             ;; TODO include command to reproduce jar
                             ;; TODO push sha to maven-metadata.xml
                             version)}
                ;;TODO copy from basis
                :src-dirs ["src"]})
  (b/copy-dir {;;TODO copy from basis
               :src-dirs ["src" "doc"]
               :target-dir class-dir})
  (let [jar-file (format "target/%s-%s.jar" (name lib) version)]
    (b/jar {:class-dir class-dir
            :jar-file (format "target/%s-%s.jar" (name lib) version)})
    (assoc params :jar-file jar-file)))

(defn tag-release [{:keys [version] :as params}]
  {:pre [version]}
  (b/git-process {:git-args (format "tag %s" version)})
  params)

(defn infer-version [{:keys [release] :as params}]
  (-> params
      (update :version #(or % (artifact-version params)))))

(defn build
  "If current commit starts with [ctim-release], installs release version.
  Otherwise snapshot version.

  :release true/false to force release/snapshot
  :version <string> to override artifact version"
  [params]
  (-> params
      (update :release #(if (boolean? %)
                          %
                          (if-some [msg (not-empty (b/git-process {:git-args "show-branch --no-name HEAD"}))]
                            (str/starts-with? msg "[ctim-release]")
                            (throw (ex-info "Could not determine current commit. Use clojure -T:build build :release true/false." {})))))
      infer-version
      jar))

(defn- serialize [m]
  (binding [*print-namespace-maps* false
            *print-level* nil
            *print-length* nil]
    (with-out-str
      (pp/pprint
        (walk/postwalk
          (fn [m]
            (cond
              (map? m) (into (sorted-map) m)
              (set? m) (into (sorted-set) m)
              :else m))
          m)))))

(defn checksums [file]
  {;; clojars uses these
   :md5 (digest/md5 file)
   :sha-1 (digest/sha-1 file)
   ;; something stronger
   :sha3-512 (digest/sha3-512 file)})

(defn update-reproducible-releases [{:keys [version jar-file] :as params}]
  (let [cs (checksums (io/file jar-file))
        prev-releases (-> "reproducible-releases.edn"
                           io/file
                           slurp
                           edn/read-string)
        new-releases (assoc prev-releases version {:git-tag version
                                                   ;; release should be reproducible from parent commit also
                                                   :parent-commit (b/git-process {:git-args "rev-parse master"})
                                                   :reproduction {:command (format "clojure -T:build build :release true :version %s" version)
                                                                  :artifact->checksums {jar-file cs}}})]
    (spit "reproducible-releases.edn" (serialize new-releases))))

(defn schedule-release [params]
  (let [{:keys [version] :as params} (-> params
                                         (assoc :release true)
                                         build
                                         update-reproducible-releases)]
    ;; TODO gen docs to next stable version. keep them until the next stable version
    (b/git-process {:git-args "add ."})
    (b/git-process {:git-args (format "commit -m '[ctim-release] %s'" version)})))

(defn perform-release [params]
  (tag-release params))
