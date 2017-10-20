(ns ctim.generators.tool-test
  (:require  [clojure.test :refer [use-fixtures]]
             [clojure.test.check.clojure-test :refer [defspec]]
             [ctim.test-helpers.core :as th]
             [clj-momo.test-helpers.core :as mth]
             [ctim.schemas.tool :as sut]
             [ctim.test-helpers.properties :as property]
             [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  mth/fixture-schema-validation
  (th/fixture-spec sut/Tool
                   "test.tool")
  (th/fixture-spec sut/NewTool
                   "test.new-tool")
  (th/fixture-spec sut/StoredTool
                   "test.stored-tool")
  (th/fixture-spec (fu/require-all sut/Tool)
                   "test.max.tool")
  (th/fixture-spec (fu/require-all sut/NewTool)
                   "test.max.new-tool")
  (th/fixture-spec (fu/require-all sut/StoredTool)
                   "test.max.stored-tool"))

;; Tool

(defspec ^:gen spec-generated-tool-is-valid
  (property/generated-entity-is-valid :test.tool/map))

(defspec ^:gen spec-generated-max-tool-is-valid
  (property/generated-entity-is-valid :test.max.tool/map))

(defspec ^:gen spec-generated-tool-id-is-valid
  (property/generated-entity-id-is-valid :test.tool/map
                                         "tool"))

;; New Tool

(defspec ^:gen spec-generated-new-tool-is-valid
  (property/generated-entity-is-valid :test.new-tool/map))

(defspec ^:gen spec-generated-max-new-tool-is-valid
  (property/generated-entity-is-valid :test.max.tool/map))

(defspec ^:gen spec-generated-new-tool-id-is-valid
  (property/generated-entity-id-is-valid :test.new-tool/map
                                         "tool"
                                         :optional))

;; Stored Tool

(defspec ^:gen spec-generated-stored-tool-is-valid
  (property/generated-entity-is-valid :test.stored-tool/map))

(defspec ^:gen spec-generated-max-stored-tool-is-valid
  (property/generated-entity-is-valid :test.max.stored-tool/map))

(defspec ^:gen spec-generated-stored-tool-id-is-valid
  (property/generated-entity-id-is-valid :test.stored-tool/map
                                         "tool"))
