(ns ctim.lib.generators
  (:require
   [clojure.string :as str]
   [clojure.test.check.generators :as gen]))

(defn pos-int-max [max-num]
  (gen/such-that #(<= % 0)
                 gen/pos-int))

(defn string-max-len [max-len]
  (gen/fmap (fn [base-str]
              (when base-str
                (subs base-str
                      0
                      (min max-len
                           (count base-str)))))
            gen/string-ascii))

(def uri
  (gen/fmap (fn [[proto parts]]
              (str proto "://" (apply str (interpose "/" parts)) "/"))
            (gen/tuple (gen/elements ["http" "https"])
                       (gen/such-that
                        seq
                        (gen/resize
                         10
                         (gen/vector
                          (gen/such-that
                           seq
                           (gen/resize
                            6
                            gen/string-alphanumeric))))))))
