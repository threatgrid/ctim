(ns ctim.prep-release
  (:require [ctim.version :refer [-ctim-version]]
            [clojure.java.shell :as sh]))

(defn- sh [& args]
  (let [{:keys [exit out err]} (apply sh/sh args)]
    (some-> (not-empty out) print)
    (some-> (not-empty err) not-empty print)
    (assert (zero? exit))))

(defn assert-clean []
  (let [{:keys [out exit]} (sh/sh "git" "status" "--short")]
    (assert (zero? exit))
    (when (seq out)
      (println out)
      (println "Working directory is not clean, exiting")
      (System/exit 1))))

(defn -main []
  (assert-clean)
  (loop [prev-version nil
         version (-ctim-version)]
    (if (= prev-version version)
      (do (sh ["git" "add" "resources/ctim/version.edn"])
          (sh ["git" "commit" "-m" (format "[release ctim] " version)])
          (System/exit 0))
      (do (println (str "Preparing to release " (-ctim-version)))
          (println (str "If this is ok, press enter. Otherwise please update `resources/ctim/version.edn` before pressing enter."))
          (read-line)
          (recur version
                 (-ctim-version))))))
