(ns ctim.domain.disposition
  (:require [ctim.schemas.common :as c]))

(defn importance [disp]
  (get c/disposition-map-inverted disp 99))

(defn compare-importance [a b]
  (compare
   (importance a)
   (importance b)))

(defn sort-by-importance
  ([f objs]
   (sort-by f compare-importance objs))
  ([dispositions]
   (sort-by-importance identity dispositions)))
