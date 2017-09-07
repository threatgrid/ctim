(ns ctim.lib.generators
  (:require
   [clojure.test.check.generators :as gen]))

(defn string-max-len [max-len]
  (gen/fmap (fn [size]
              (apply str
                     (repeatedly size (constantly \0))))
            (gen/resize max-len
                        gen/pos-int)))
