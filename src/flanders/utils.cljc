(ns flanders.utils
  (:require [clojure.zip :as z]
            [flanders.protocols :refer [branch? node-children make-node]]))

(defn right-loc-seq
  "Lazy seq of loc and its right siblings"
  [loc]
  (if (nil? loc)
    nil
    (lazy-seq (cons loc
                    (right-loc-seq (z/right loc))))))

(defn children-locs [loc]
  (some-> loc z/down right-loc-seq))

(defn ->ddl-zip [root]
  (z/zipper branch? node-children make-node root))

;; Adds zip support for maps.
;; (Source: http://stackoverflow.com/a/15020649/42188)
(defn ->map-zip [m]
  (z/zipper
   (fn [x] (or (map? x) (map? (nth x 1))))
   (fn [x] (seq (if (map? x) x (nth x 1))))
   (fn [x children]
     (if (map? x)
       (into {} children)
       (assoc x 1 (into {} children))))
   m))
