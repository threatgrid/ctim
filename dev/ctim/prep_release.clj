(ns ctim.prep-release
  (:require [ctim.version :refer [-ctim-version]]
            [clojure.java.shell :as sh]))

(defn -main []
  (loop [prev-version nil
         version (-ctim-version)]
    (if (= prev-version version)
      (do (sh/sh ["git" "add" "resources/ctim/version.edn"])
          (sh/sh ["git" "commit" "-m" (format "[release ctim] " version)]))
      (do (println (str "Preparing to release " (-ctim-version)))
          (println (str "If this is ok, press enter. Otherwise please update `resources/ctim/version.edn` before pressing enter."))
          (read-line)
          (recur version
                 (-ctim-version))))))
