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
      (println "Working directory is not clean, please commit changes first.")
      (System/exit 1))))

(defn -main []
  (assert-clean)
  (loop [prev-version nil
         version (-ctim-version)]
    (if (= prev-version version)
      (do (sh ["git" "add" "resources/ctim/version.edn"])
          (sh ["git" "commit" "-m" (format "[release ctim] " version)])
          (System/exit 0))
      (do (println (str "Press enter to prepare release `" (-ctim-version) "`. To customize, update `resources/ctim/version.edn`, then press enter for another confirmation prompt."))
          (read-line)
          (recur version
                 (-ctim-version))))))
