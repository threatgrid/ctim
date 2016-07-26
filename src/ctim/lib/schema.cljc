(ns ctim.lib.schema
  (:require [schema-tools.core :as st]
            #?(:clj [ring.swagger.schema :as rs])))

;; passthrough to ring swagger only for clj
#?(:cljs (defn describe [s desc] s)
   :clj (def describe rs/describe))
