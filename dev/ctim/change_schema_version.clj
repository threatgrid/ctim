(ns ctim.change-schema-version)

(defn -main
  [version]
  (spit "./resources/version.txt" version))
