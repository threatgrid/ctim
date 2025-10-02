(ns ctim.print-version
  (:require [ctim.version :refer [-ctim-version]]))

(defn -main []
  (print (-ctim-version)))
