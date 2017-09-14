(ns ctim.lib.generators
  (:require
   [clojure.test.check.generators :as gen]))

(defn string-max-len [max-len]
  (gen/fmap (fn [base-str]
              (when base-str
                (subs base-str
                      0
                      (min max-len
                           (count base-str)))))
            gen/string-ascii))
