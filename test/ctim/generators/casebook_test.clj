(ns ctim.generators.casebook-test
  (:require  [clojure.test :refer [use-fixtures]]
             [clojure.test.check.clojure-test :refer [defspec]]
             [ctim.test-helpers.core :as th]
             [clj-momo.test-helpers.core :as mth]
             [ctim.schemas.casebook :as sut]
             [ctim.test-helpers.properties :as property]
             [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  mth/fixture-schema-validation
  (th/fixture-spec sut/Casebook
                   "test.casebook")
  (th/fixture-spec sut/NewCasebook
                   "test.new-casebook")
  (th/fixture-spec sut/StoredCasebook
                   "test.stored-casebook")
  (th/fixture-spec (fu/require-all sut/Casebook)
                   "test.max.casebook")
  (th/fixture-spec (fu/require-all sut/NewCasebook)
                   "test.max.new-casebook")
  (th/fixture-spec (fu/require-all sut/StoredCasebook)
                   "test.max.stored-casebook"))

;; Casebook
;; The bundle/data_tables entity crashes data generation with a StackOverFlow error
;; so we need to keep them disabled until we find how to workaround that


#_(defspec ^:gen spec-generated-casebook-is-valid
    (property/generated-entity-is-valid :test.casebook/map))

#_(defspec ^:gen spec-generated-max-casebook-is-valid
    (property/generated-entity-is-valid :test.max.casebook/map))

#_(defspec ^:gen spec-generated-casebook-id-is-valid
    (property/generated-entity-id-is-valid :test.casebook/map
                                           "casebook"))

;; New Casebook

#_(defspec ^:gen spec-generated-new-casebook-is-valid
    (property/generated-entity-is-valid :test.new-casebook/map))

#_(defspec ^:gen spec-generated-max-new-casebook-is-valid
    (property/generated-entity-is-valid :test.max.new-casebook/map))

#_(defspec ^:gen spec-generated-new-casebook-id-is-valid
    (property/generated-entity-id-is-valid :test.new-casebook/map
                                           "casebook"
                                           :optional))

;; Stored Casebook

#_(defspec ^:gen spec-generated-stored-casebook-is-valid
    (property/generated-entity-is-valid :test.stored-casebook/map))

#_(defspec ^:gen spec-generated-max-stored-casebook-is-valid
    (property/generated-entity-is-valid :test.max.stored-casebook/map))

#_(defspec ^:gen spec-generated-stored-casebook-id-is-valid
    (property/generated-entity-id-is-valid :test.stored-casebook/map
                                           "casebook"))
