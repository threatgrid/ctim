(ns deploy
  (:require [clojure.tools.build.api :as b]
            [clojure.java.io :as io]
            [deps-deploy.deps-deploy :as deploy])
  (:import (java.util.jar JarFile)))

(defn- tag-release [{:keys [version] :as params}]
  {:pre [version]}
  (b/git-process {:git-args (format "tag %s" version)})
  (b/git-process {:git-args (format "push tag %s" version)})
  params)

(defn- deploy* [{:keys [jar-file pom-file] :as params}]
  (deploy/deploy
    {:installer :remote
     :sign-releases? false
     :artifact (str jar-file)
     :pom-file pom-file})
  params)

(defn extract-pom [{:keys [jar-file] :as params}]
  (assert jar-file "Must supply :jar-file")
  (let [pom-file "pom.xml"
        jf (JarFile. (io/file (str jar-file)))]
    (spit pom-file
          (slurp (.getInputStream jf (.getEntry jf "META-INF/maven/threatgrid/ctim/pom.xml"))))
    (assoc params :pom-file pom-file)))

(defn- infer-version [{:keys []}])

(defn deploy-snapshot [params]
  (-> params
      extract-pom
      deploy*))

(defn deploy-release [params]
  (-> params
      extract-pom
      tag-release
      deploy*))
