(ns ctim.lib.generators
  (:require
   [clj-momo.lib.clj-time.coerce :as time-coerce]
   [clojure.string :as str]
   [clojure.test.check.generators :as gen]))

(def pos-int gen/pos-int)

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

(def gen-internal-date
  "Generate an `internal-date` that is 2017-01-01 or later"
  (gen/fmap (fn [n]
              (time-coerce/to-internal-date
               (+ 1483228800000 n)))
            gen/pos-int))

(def observed-time
  (gen/fmap (fn [dates]
              (let [[dt1 dt2] (sort (remove nil? dates))]
                (cond-> {:start_time dt1}
                  dt2 (assoc :end_time dt2))))
            (gen/tuple gen-internal-date
                       (gen/one-of [(gen/return nil)
                                    gen-internal-date]))))

(def valid-time
  (gen/fmap (fn [dates]
              (let [[dt1 dt2] (sort (remove nil? dates))]
                (cond-> {}
                  dt1 (assoc :start_time dt1)
                  dt2 (assoc :end_time dt2))))
            (gen/tuple (gen/one-of [(gen/return nil)
                                    gen-internal-date])
                       (gen/one-of [(gen/return nil)
                                    gen-internal-date]))))
