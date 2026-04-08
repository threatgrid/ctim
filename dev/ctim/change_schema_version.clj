(ns ctim.change-schema-version)

(defn -main
  [version]
  (spit "./resources/ctim/version.txt" version))
