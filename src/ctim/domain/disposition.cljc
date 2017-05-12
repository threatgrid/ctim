(ns ctim.domain.disposition
  (:require [ctim.schemas.common :as c]))

(defn importance [a b]
  (compare
   (get c/disposition-map-inverted a 99)
   (get c/disposition-map-inverted b 99)))

(defn sort-by-importance
  ([f objs]
   (sort-by f importance objs))
  ([dispositions]
   (sort-by-importance identity dispositions)))
