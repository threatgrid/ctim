(ns ctim.generators.scratchpad-test
  (:require  [clojure.test :refer [use-fixtures]]
             [clojure.test.check.clojure-test :refer [defspec]]
             [ctim.test-helpers.core :as th]
             [clj-momo.test-helpers.core :as mth]
             [ctim.schemas.scratchpad :as sut]
             [ctim.test-helpers.properties :as property]
             [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  mth/fixture-schema-validation
  (th/fixture-spec sut/Scratchpad
                   "test.scratchpad")
  (th/fixture-spec sut/NewScratchpad
                   "test.new-scratchpad")
  (th/fixture-spec sut/StoredScratchpad
                   "test.stored-scratchpad")
  (th/fixture-spec (fu/require-all sut/Scratchpad)
                   "test.max.scratchpad")
  (th/fixture-spec (fu/require-all sut/NewScratchpad)
                   "test.max.new-scratchpad")
  (th/fixture-spec (fu/require-all sut/StoredScratchpad)
                   "test.max.stored-scratchpad"))

;; Scratchpad

(defspec ^:gen spec-generated-scratchpad-is-valid
  (property/generated-entity-is-valid :test.scratchpad/map))

(defspec ^:gen spec-generated-max-scratchpad-is-valid
  (property/generated-entity-is-valid :test.max.scratchpad/map))

(defspec ^:gen spec-generated-scratchpad-id-is-valid
  (property/generated-entity-id-is-valid :test.scratchpad/map
                                         "scratchpad"))

;; New Scratchpad

(defspec ^:gen spec-generated-new-scratchpad-is-valid
  (property/generated-entity-is-valid :test.new-scratchpad/map))

(defspec ^:gen spec-generated-max-new-scratchpad-is-valid
  (property/generated-entity-is-valid :test.max.new-scratchpad/map))

(defspec ^:gen spec-generated-new-scratchpad-id-is-valid
  (property/generated-entity-id-is-valid :test.new-scratchpad/map
                                         "scratchpad"
                                         :optional))

;; Stored Scratchpad

(defspec ^:gen spec-generated-stored-scratchpad-is-valid
  (property/generated-entity-is-valid :test.stored-scratchpad/map))

(defspec ^:gen spec-generated-max-stored-scratchpad-is-valid
  (property/generated-entity-is-valid :test.max.stored-scratchpad/map))

(defspec ^:gen spec-generated-stored-scratchpad-id-is-valid
  (property/generated-entity-id-is-valid :test.stored-scratchpad/map
                                         "scratchpad"))
