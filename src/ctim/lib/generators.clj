(ns ctim.lib.generators
  (:require
   [clojure.test.check.generators :as gen]))

(defn string-max-len [max-len]
  (gen/fmap #(apply str %)
            (gen/vector gen/char-ascii 0 max-len)))
