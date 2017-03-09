(ns ctim.domain.disposition)

(def ^:private weights
  {"Clean"      1
   "Malicious"  2
   "Suspicious" 3
   "Unknown"    4})

(defn importance [a b]
  (compare
   (get weights a 99)
   (get weights b 99)))

(defn sort-by-importance
  ([f objs]
   (sort-by f importance objs))
  ([dispositions]
   (sort-by-importance identity dispositions)))
