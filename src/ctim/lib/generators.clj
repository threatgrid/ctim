(ns ctim.lib.generators
  (:require
   [clj-momo.lib.clj-time.coerce :as time-coerce]
   [clojure.string :as string]
   [clojure.test.check.generators :as gen]))

(def pos-int gen/pos-int)

(defn string-max-len [max-len]
  (gen/fmap (fn [base-str]
              (when base-str
                (subs base-str
                      0
                      (min max-len
                           (count base-str)))))
            gen/string-alphanumeric))

(def uri
  (gen/fmap (fn [[proto parts]]
              (format "%s://%s/"
                      proto
                      (string/join "/" parts)))
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
   string/join
   (gen/vector open-vocab-char 1 100)))

;; vulnerability

(def score
  gen/double)

(def cpe-node-operators ["OR" "AND"])

(def cpe-node-operator-string
  (gen/elements cpe-node-operators))

(def cpe-parts ["a" "h" "o"])

(def formatted-cpe-23-string
  (gen/fmap (fn [part]
              (format "cpe:2.3:%s:vendor:product:version:update:*:*:*:*:*:*"
                      part))
            (gen/elements cpe-parts)))

(def semver
  (gen/fmap (partial string/join ".")
            (gen/tuple
             (gen/choose 0 5)
             (gen/choose 0 20)
             (gen/choose 0 128))))

;; CVSSv2
;; base factors
(def cvss-v2-access-vectors ["L" "A" "N"])
(def cvss-v2-access-complexities ["H" "M" "L"])
(def cvss-v2-authentications ["M" "S" "N"])
(def cvss-v2-confidentiality-impacts ["N" "P" "C"])
(def cvss-v2-integrity-impacts ["N" "P" "C"])
(def cvss-v2-availability-impacts ["N" "P" "C"])
;; temporal factors
(def cvss-v2-exploitabilities ["U" "POC" "F" "H" "ND"])
(def cvss-v2-remediation-levels ["OF" "TF" "W" "U" "ND"])
(def cvss-v2-report-confidences ["UC" "UR" "C" "ND"])
;; environmental factors
(def cvss-v2-collateral-damage-potentials ["N" "L" "LM" "MH" "H" "ND"])
(def cvss-v2-target-distributions ["N" "L" "M" "H" "ND"])
(def cvss-v2-confidentiality-requirements ["L" "M" "H" "ND"])
(def cvss-v2-integrity-requirements ["L" "M" "H" "ND"])
(def cvss-v2-availability-requirements ["L" "M" "H" "ND"])

(def cvss-v2-vector-string
  (gen/fmap (fn [[av ac au c i a]]
              (format "AV:%s/AC:%s/Au:%s/C:%s/I:%s/A:%s"
                      av ac au c i a))
            (gen/tuple (gen/elements cvss-v2-access-vectors)
                       (gen/elements cvss-v2-access-complexities)
                       (gen/elements cvss-v2-authentications)
                       (gen/elements cvss-v2-confidentiality-impacts)
                       (gen/elements cvss-v2-integrity-impacts)
                       (gen/elements cvss-v2-availability-impacts))))

(def cvss-v2-temporal-vector-string
  (gen/fmap (fn [[e rl rc]]
              (format "E:%s/RL:%s/RC:%s"
                      e rl rc))
            (gen/tuple (gen/elements cvss-v2-exploitabilities)
                       (gen/elements cvss-v2-remediation-levels)
                       (gen/elements cvss-v2-report-confidences))))

(def cvss-v2-environmental-vector-string
  (gen/fmap (fn [[cdp td cr ir ar]]
              (format "CDP:%s/TD:%s/CR:%s/IR:%s/AR:%s"
                      cdp td cr ir ar))
            (gen/tuple (gen/elements cvss-v2-collateral-damage-potentials)
                       (gen/elements cvss-v2-target-distributions)
                       (gen/elements cvss-v2-confidentiality-requirements)
                       (gen/elements cvss-v2-integrity-requirements)
                       (gen/elements cvss-v2-availability-requirements))))

;; CVSSv3
(def cvss-v3-attack-vectors ["N" "A" "L" "P"])
(def cvss-v3-attack-complexities ["H" "L"])
(def cvss-v3-privileges-required ["H" "L"])
(def cvss-v3-user-interactions ["N" "R"])
(def cvss-v3-vulnerability-scopes ["U" "C"])
(def cvss-v3-confidentiality-impacts ["N" "L" "H"])
(def cvss-v3-integrity-impacts ["N" "L" "H"])
(def cvss-v3-availability-impacts ["N" "L" "H"])

(def cvss-v3-vector-string
  (gen/fmap (fn [[av ac pr ui s c i a]]
              (format "CVSS:3.0/AV:%s/AC:%s/PR:%s/UI:%s/S:%s/C:%s/I:%s/A:%s"
                      av ac pr ui s c i a))
            (gen/tuple (gen/elements cvss-v3-attack-vectors)
                       (gen/elements cvss-v3-attack-complexities)
                       (gen/elements cvss-v3-privileges-required)
                       (gen/elements cvss-v3-user-interactions)
                       (gen/elements cvss-v3-vulnerability-scopes)
                       (gen/elements cvss-v3-confidentiality-impacts)
                       (gen/elements cvss-v3-integrity-impacts)
                       (gen/elements cvss-v3-availability-impacts))))
