(ns ctim.update-version
  (:require [ctim.version :refer [ctim-version]]))

(defn -main []
  (let [{:keys [release-version dev-version]} (parse-ctim-version)
        _ (println (format "Next release version: [%s]" next-version))
        release-version (or (not-empty (read-line))
                            )
        _ (assert (re-matches))]

    ))
