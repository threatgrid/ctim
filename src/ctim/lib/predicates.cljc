(ns ctim.lib.predicates)

(defn max-len [len]
  (fn [test]
    (>= len (count test))))
