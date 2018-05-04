(ns ctim.generators.weakness-test
  (:require [clj-momo.test-helpers.core :as mth]
            [clojure.test :refer [use-fixtures]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [ctim.schemas.weakness :as weakness]
            [ctim.test-helpers
             [core :as th]
             [properties :as property]]
            [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  mth/fixture-schema-validation
  (th/fixture-spec weakness/Weakness
                   "test.weakness")
  (th/fixture-spec weakness/NewWeakness
                   "test.new-weakness")
  (th/fixture-spec weakness/StoredWeakness
                   "test.stored-weakness")
  (th/fixture-spec (fu/require-all weakness/Weakness)
                   "test.max.weakness")
  (th/fixture-spec (fu/require-all weakness/NewWeakness)
                   "test.max.new-weakness")
  (th/fixture-spec (fu/require-all weakness/StoredWeakness)
                   "test.max.stored-weakness"))

;; Weakness

(defspec ^:gen spec-generated-weakness-is-valid
  (property/generated-entity-is-valid :test.weakness/map))

(defspec ^:gen spec-generated-max-weakness-is-valid
  (property/generated-entity-is-valid :test.max.weakness/map))

(defspec ^:gen spec-generated-weakness-id-is-valid
  (property/generated-entity-id-is-valid :test.weakness/map
                                         "weakness"))

;; New Weakness

(defspec ^:gen spec-generated-new-weakness-is-valid
  (property/generated-entity-is-valid :test.new-weakness/map))

(defspec ^:gen spec-generated-max-new-weakness-is-valid
  (property/generated-entity-is-valid :test.max.weakness/map))

(defspec ^:gen spec-generated-new-weakness-id-is-valid
  (property/generated-entity-id-is-valid :test.new-weakness/map
                                         "weakness"
                                         :optional))

;; Stored Weakness

(defspec ^:gen spec-generated-stored-weakness-is-valid
  (property/generated-entity-is-valid :test.stored-weakness/map))

(defspec ^:gen spec-generated-max-stored-weakness-is-valid
  (property/generated-entity-is-valid :test.max.stored-weakness/map))

(defspec ^:gen spec-generated-stored-weakness-id-is-valid
  (property/generated-entity-id-is-valid :test.stored-weakness/map
                                         "weakness"))
