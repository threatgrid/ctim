(ns ctim.lib.set)

(defn as-set [x]
  (cond (set? x) x
        (keyword? x) #{x}
        (sequential? x) (set x)))
