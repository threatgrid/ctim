(ns ctim.generators.sighting-test
  (:require [clj-momo.test-helpers.core :as mth]
            [clojure.test :refer [use-fixtures]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [ctim.schemas.sighting :as sighting]
            [ctim.test-helpers
             [core :as th]
             [properties :as property]]
            [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  mth/fixture-schema-validation
  (th/fixture-spec sighting/Sighting
                   "test.sighting")
  (th/fixture-spec sighting/NewSighting
                   "test.new-sighting")
  (th/fixture-spec (fu/require-all sighting/Sighting)
                   "test.max.sighting")
  (th/fixture-spec (fu/require-all sighting/NewSighting)
                   "test.max.new-sighting"))

;; Sighting

(defspec ^:gen spec-generated-sighting-is-valid
  (property/generated-entity-is-valid :test.sighting/map))

(defspec ^:gen spec-generated-max-sighting-is-valid
  (property/generated-entity-is-valid :test.max.sighting/map))

(defspec ^:gen spec-generated-sighting-id-is-valid
  (property/generated-entity-id-is-valid :test.sighting/map
                                         "sighting"))

;; New Sighting

(defspec ^:gen spec-generated-new-sighting-is-valid
  (property/generated-entity-is-valid :test.new-sighting/map))

(defspec ^:gen spec-generated-max-new-sighting-is-valid
  (property/generated-entity-is-valid :test.max.sighting/map))

(defspec ^:gen spec-generated-new-sighting-id-is-valid
  (property/generated-entity-id-is-valid :test.new-sighting/map
                                         "sighting"
                                         :optional))
