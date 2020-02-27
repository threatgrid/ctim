(ns ctim.generators.indicator-test
  (:require [clj-momo.test-helpers.core :as mth]
            [clojure.test :refer [use-fixtures]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [ctim.schemas.indicator :as indicator]
            [ctim.test-helpers
             [core :as th]
             [properties :as property]]
            [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  mth/fixture-schema-validation
  (th/fixture-spec indicator/Indicator
                   "test.indicator")
  (th/fixture-spec indicator/NewIndicator
                   "test.new-indicator")
  (th/fixture-spec (fu/require-all indicator/Indicator)
                   "test.max.indicator")
  (th/fixture-spec (fu/require-all indicator/NewIndicator)
                   "test.max.new-indicator"))

;; Indicator

(defspec ^:gen spec-generated-indicator-is-valid
  (property/generated-entity-is-valid :test.indicator/map))

(defspec ^:gen spec-generated-max-indicator-is-valid
  (property/generated-entity-is-valid :test.max.indicator/map))

(defspec ^:gen spec-generated-indicator-id-is-valid
  (property/generated-entity-id-is-valid :test.indicator/map
                                         "indicator"))

;; New Indicator

(defspec ^:gen spec-generated-new-indicator-is-valid
  (property/generated-entity-is-valid :test.new-indicator/map))

(defspec ^:gen spec-generated-max-new-indicator-is-valid
  (property/generated-entity-is-valid :test.max.indicator/map))

(defspec ^:gen spec-generated-new-indicator-id-is-valid
  (property/generated-entity-id-is-valid :test.new-indicator/map
                                         "indicator"
                                         :optional))
