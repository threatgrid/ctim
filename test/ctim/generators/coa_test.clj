(ns ctim.generators.coa-test
  (:require [clj-momo.test-helpers.core :as mth]
            [clojure.test :refer [use-fixtures]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [ctim.schemas.coa :as coa]
            [ctim.test-helpers
             [core :as th]
             [properties :as property]]
            [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  mth/fixture-schema-validation
  (th/fixture-spec coa/COA
                   "test.coa")
  (th/fixture-spec coa/NewCOA
                   "test.new-coa")
  (th/fixture-spec coa/StoredCOA
                   "test.stored-coa")
  (th/fixture-spec (fu/require-all coa/COA)
                   "test.max.coa")
  (th/fixture-spec (fu/require-all coa/NewCOA)
                   "test.max.new-coa")
  (th/fixture-spec (fu/require-all coa/StoredCOA)
                   "test.max.stored-coa"))

;; COA

(defspec ^:gen spec-generated-coa-is-valid
  (property/generated-entity-is-valid :test.coa/map))

(defspec ^:gen spec-generated-max-coa-is-valid
  (property/generated-entity-is-valid :test.max.coa/map))

(defspec ^:gen spec-generated-coa-id-is-valid
  (property/generated-entity-id-is-valid :test.coa/map
                                         "coa"))

;; New COA

(defspec ^:gen spec-generated-new-coa-is-valid
  (property/generated-entity-is-valid :test.new-coa/map))

(defspec ^:gen spec-generated-max-new-coa-is-valid
  (property/generated-entity-is-valid :test.max.coa/map))

(defspec ^:gen spec-generated-new-coa-id-is-valid
  (property/generated-entity-id-is-valid :test.new-coa/map
                                         "coa"
                                         :optional))

;; Stored COA

(defspec ^:gen spec-generated-stored-coa-is-valid
  (property/generated-entity-is-valid :test.stored-coa/map))

(defspec ^:gen spec-generated-max-stored-coa-is-valid
  (property/generated-entity-is-valid :test.max.stored-coa/map))

(defspec ^:gen spec-generated-stored-coa-id-is-valid
  (property/generated-entity-id-is-valid :test.stored-coa/map
                                         "coa"))
