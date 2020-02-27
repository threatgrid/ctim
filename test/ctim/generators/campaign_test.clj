(ns ctim.generators.campaign-test
  (:require [clj-momo.test-helpers.core :as mth]
            [clojure.test :refer [use-fixtures]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [ctim.schemas.campaign :as campaign]
            [ctim.test-helpers
             [core :as th]
             [properties :as property]]
            [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  mth/fixture-schema-validation
  (th/fixture-spec campaign/Campaign
                   "test.campaign")
  (th/fixture-spec campaign/NewCampaign
                   "test.new-campaign")
  (th/fixture-spec (fu/require-all campaign/Campaign)
                   "test.max.campaign")
  (th/fixture-spec (fu/require-all campaign/NewCampaign)
                   "test.max.new-campaign"))

;; Campaign

(defspec ^:gen spec-generated-campaign-is-valid
  (property/generated-entity-is-valid :test.campaign/map))

(defspec ^:gen spec-generated-max-campaign-is-valid
  (property/generated-entity-is-valid :test.max.campaign/map))

(defspec ^:gen spec-generated-campaign-id-is-valid
  (property/generated-entity-id-is-valid :test.campaign/map
                                         "campaign"))

;; New Campaign

(defspec ^:gen spec-generated-new-campaign-is-valid
  (property/generated-entity-is-valid :test.new-campaign/map))

(defspec ^:gen spec-generated-max-new-campaign-is-valid
  (property/generated-entity-is-valid :test.max.new-campaign/map))

(defspec ^:gen spec-generated-new-campaign-id-is-valid
  (property/generated-entity-id-is-valid :test.new-campaign/map
                                         "campaign"
                                         :optional))
