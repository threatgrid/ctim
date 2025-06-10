(ns build
  (:require [clojure.string :as str]
            [clojure.tools.build.api :as b])
  (:import (java.util.regex Pattern)))

(def lib 'threatgrid/ctim)
;(def version (format "1.2.%s" (b/git-count-revs nil)))
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
                :scm {:connection "scm:git:git://github.com/threatgrid/ctim.git"
                      :developerConnection "scm:git:git@github.com:threatgrid/ctim.git"
                      :tag (if (str/ends-with? version "-SNAPSHOT")
                             (b/git-process {:git-args "rev-parse HEAD"})
                             ;; we commit the checksum of the jar to the repo ahead of time to ensure it is reproducible.
                             ;; so it cannot contain the release SHA.
                             ;; TODO include command to reproduce jar
                             version)}
                :src-dirs ["src"]})
  (b/copy-dir {:src-dirs ["src" "resources"]
               :target-dir class-dir})
  (b/jar {:class-dir class-dir
          :jar-file (format "target/%s-%s.jar" (name lib) version)})
  params)

(defn tag-release [{:keys [version] :as params}]
  {:pre [version]}
  (b/git-process {:git-args (format "tag %s" version)})
  (b/git-process {:git-args (format "push origin tag %s" version)})
  params)

(defn deploy-branch? [params]
  (= "master" (b/git-process {:git-args (format "branch --show-current")})))

(defn version-template []
  (str/trim (slurp "VERSION_TEMPLATE")))

(defn split-version-template []
  (let [before+after (str/split (version-template) #"GENERATED_VERSION" -1)]
    (assert (= 2 (count before+after)))
    before+after))

(defn instantiate-version-template [instantiate]
  (let [[before after] (split-version-template)]
    (str before instantiate after)))

(defn generated-version [tag]
  (let [[before after] (split-version-template)
        re (re-pattern (str (Pattern/quote before)
                            "(.*)"
                            (Pattern/quote after)))]
    (Long/parseLong (peek (re-matches re tag)))))

(comment
  (= 24 (generated-version "1.3.24"))
  )

(defn prev-release-in-series []
  ;; fails silently
  (b/git-process {:git-args (format "fetch --tags")})
  (not-empty
    ;; https://stackoverflow.com/questions/3867619/how-to-get-last-git-tag-matching-regex-criteria
    (b/git-process {:git-args (format "describe --tags %s --abbrev=0 --match=%s"
                                      "master"
                                      ;; TODO quote
                                      (instantiate-version-template "*"))})))

(defn next-version []
  (b/git-process {:git-args (format "fetch tags")})
  (str (instantiate-version-template (or (some-> (prev-release-in-series)
                                                 generated-version
                                                 inc')
                                         0))
       (when-not release "-SNAPSHOT")))

(comment
  (next-version)
  )

; (b/git-count-revs nil)
(defn infer-version [{:keys [release] :as params}]
  (-> params
      (update :version #(or % (str (next-version params) (when-not release "-SNAPSHOT"))))))

(defn build-snapshot [params]
  (-> params
      (assoc :release false)
      infer-version
      jar))

(defn build-release [params]
  (-> params
      (assoc :release true)
      infer-version
      jar)
  (tag-release params))
