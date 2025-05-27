(ns ctim.change-schema-version)

(defn -main
  [version]
  (spit "./resources/version.edn" (pr-str version)))
