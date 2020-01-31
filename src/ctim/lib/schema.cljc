(ns ctim.lib.schema
  #?(:clj (:require [ring.swagger.json-schema :as rs])))

;; passthrough to ring swagger only for clj
#?(:cljs (defn describe [s desc] s)
   :clj (def describe rs/describe))
