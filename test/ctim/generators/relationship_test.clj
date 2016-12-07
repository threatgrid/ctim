(ns ctim.generators.relationship-test
  (:require [clj-momo.test-helpers.core :as mth]
            [clojure.test :refer [use-fixtures]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [ctim.schemas.relationship :as relationship]
            [ctim.test-helpers
             [core :as th]
             [properties :as property]]
            [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  mth/fixture-schema-validation
  (th/fixture-spec relationship/Relationship
                   "test.relationship")
  (th/fixture-spec relationship/NewRelationship
                   "test.new-relationship")
  (th/fixture-spec relationship/StoredRelationship
                   "test.stored-relationship")
  (th/fixture-spec (fu/require-all relationship/Relationship)
                   "test.max.relationship")
  (th/fixture-spec (fu/require-all relationship/NewRelationship)
                   "test.max.new-relationship")
  (th/fixture-spec (fu/require-all relationship/StoredRelationship)
                   "test.max.stored-relationship"))

;; Relationship

(defspec ^:gen spec-generated-relationship-is-valid
  (property/generated-entity-is-valid :test.relationship/map))

(defspec ^:gen spec-generated-max-relationship-is-valid
  (property/generated-entity-is-valid :test.max.relationship/map))

(defspec ^:gen spec-generated-relationship-id-is-valid
  (property/generated-entity-id-is-valid :test.relationship/map
                                         "relationship"))

;; New Relationship

(defspec ^:gen spec-generated-new-relationship-is-valid
  (property/generated-entity-is-valid :test.new-relationship/map))

(defspec ^:gen spec-generated-max-new-relationship-is-valid
  (property/generated-entity-is-valid :test.max.relationship/map))

(defspec ^:gen spec-generated-new-relationship-id-is-valid
  (property/generated-entity-id-is-valid :test.new-relationship/map
                                         "relationship"
                                         :optional))

;; Stored Relationship

(defspec ^:gen spec-generated-stored-relationship-is-valid
  (property/generated-entity-is-valid :test.stored-relationship/map))

(defspec ^:gen spec-generated-max-stored-relationship-is-valid
  (property/generated-entity-is-valid :test.max.stored-relationship/map))

(defspec ^:gen spec-generated-stored-relationship-id-is-valid
  (property/generated-entity-id-is-valid :test.stored-relationship/map
                                         "relationship"))
