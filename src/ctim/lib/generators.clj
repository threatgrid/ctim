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
              (format "%s://%s/"
                      proto
                      (clojure.string/join "/" parts)))
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

(def open-vocab-char
  "Generates [a-z0-9\\-_] character"
  (gen/fmap char
            (gen/one-of
             [(gen/choose \a \z)
              (gen/choose \0 \9)
              (gen/elements [\- \_])])))

(def open-vocab-chars
  (gen/fmap
   str/join
   (gen/vector open-vocab-char 1 100)))

;; vulnerability

(def score
  gen/double)

(def attack-vectors ["N" "A" "L" "P"])
(def attack-complexities ["H" "L"])
(def privileges-required ["H" "L"])
(def user-interactions ["N" "R"])
(def vulnerability-scopes ["U" "C"])
(def confidentiality-impacts ["N" "L" "H"])
(def integrity-impacts ["N" "L" "H"])
(def availability-impacts ["N" "L" "H"])

(def vector-string
  (gen/fmap (fn [[av ac pr ui s c i a]]
              (format "CVSS:3.0/AV:%s/AC:%s/PR:%s/UI:%s/S:%s/C:%s/I:%s/A:%s"
                      av ac pr ui s c i a))
            (gen/tuple (gen/elements attack-vectors)
                       (gen/elements attack-complexities)
                       (gen/elements privileges-required)
                       (gen/elements user-interactions)
                       (gen/elements vulnerability-scopes)
                       (gen/elements confidentiality-impacts)
                       (gen/elements integrity-impacts)
                       (gen/elements availability-impacts))))

