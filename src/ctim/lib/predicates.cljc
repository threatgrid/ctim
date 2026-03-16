(ns ctim.lib.predicates)

(defn max-len [len]
  (with-meta
    (fn [test]
      (>= len (count test)))
    {:max-len len}))

(defn max-non-neg-int [max-num]
  (fn [test]
    (<= 0 test max-num)))
