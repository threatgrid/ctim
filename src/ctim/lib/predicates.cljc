(ns ctim.lib.predicates)

(defn max-len [len]
  (fn [test]
    (>= len (count test))))

(defn max-non-neg-int [max-num]
  (fn [test]
    (<= 0 test max-num)))
