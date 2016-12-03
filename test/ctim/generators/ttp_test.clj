(ns ctim.generators.ttp-test
  (:require [clj-momo.test-helpers.core :as mth]
            [clojure.test :refer [use-fixtures]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [ctim.schemas.ttp :as ttp]
            [ctim.test-helpers
             [core :as th]
             [properties :as property]]
            [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  mth/fixture-schema-validation
  (th/fixture-spec ttp/TTP
                   "test.ttp")
  (th/fixture-spec ttp/NewTTP
                   "test.new-ttp")
  (th/fixture-spec ttp/StoredTTP
                   "test.stored-ttp")
  (th/fixture-spec (fu/require-all ttp/TTP)
                   "test.max.ttp")
  (th/fixture-spec (fu/require-all ttp/NewTTP)
                   "test.max.new-ttp")
  (th/fixture-spec (fu/require-all ttp/StoredTTP)
                   "test.max.stored-ttp"))

;; TTP

(defspec ^:gen spec-generated-ttp-is-valid
  (property/generated-entity-is-valid :test.ttp/map))

(defspec ^:gen spec-generated-max-ttp-is-valid
  (property/generated-entity-is-valid :test.max.ttp/map))

(defspec ^:gen spec-generated-ttp-id-is-valid
  (property/generated-entity-id-is-valid :test.ttp/map
                                         "ttp"))

;; New TTP

(defspec ^:gen spec-generated-new-ttp-is-valid
  (property/generated-entity-is-valid :test.new-ttp/map))

(defspec ^:gen spec-generated-max-new-ttp-is-valid
  (property/generated-entity-is-valid :test.max.ttp/map))

(defspec ^:gen spec-generated-new-ttp-id-is-valid
  (property/generated-entity-id-is-valid :test.new-ttp/map
                                         "ttp"
                                         :optional))

;; Stored TTP

(defspec ^:gen spec-generated-stored-ttp-is-valid
  (property/generated-entity-is-valid :test.stored-ttp/map))

(defspec ^:gen spec-generated-max-stored-ttp-is-valid
  (property/generated-entity-is-valid :test.max.stored-ttp/map))

(defspec ^:gen spec-generated-stored-ttp-id-is-valid
  (property/generated-entity-id-is-valid :test.stored-ttp/map
                                         "ttp"))
