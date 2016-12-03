(ns ctim.generators.feedback-test
  (:require [clj-momo.test-helpers.core :as mth]
            [clojure.test :refer [use-fixtures]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [ctim.schemas.feedback :as feedback]
            [ctim.test-helpers
             [core :as th]
             [properties :as property]]
            [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  mth/fixture-schema-validation
  (th/fixture-spec feedback/Feedback
                   "test.feedback")
  (th/fixture-spec feedback/NewFeedback
                   "test.new-feedback")
  (th/fixture-spec feedback/StoredFeedback
                   "test.stored-feedback")
  (th/fixture-spec (fu/require-all feedback/Feedback)
                   "test.max.feedback")
  (th/fixture-spec (fu/require-all feedback/NewFeedback)
                   "test.max.new-feedback")
  (th/fixture-spec (fu/require-all feedback/StoredFeedback)
                   "test.max.stored-feedback"))

;; Feedback

(defspec ^:gen spec-generated-feedback-is-valid
  (property/generated-entity-is-valid :test.feedback/map))

(defspec ^:gen spec-generated-max-feedback-is-valid
  (property/generated-entity-is-valid :test.max.feedback/map))

(defspec ^:gen spec-generated-feedback-id-is-valid
  (property/generated-entity-id-is-valid :test.feedback/map
                                         "feedback"))

;; New Feedback

(defspec ^:gen spec-generated-new-feedback-is-valid
  (property/generated-entity-is-valid :test.new-feedback/map))

(defspec ^:gen spec-generated-max-new-feedback-is-valid
  (property/generated-entity-is-valid :test.max.feedback/map))

(defspec ^:gen spec-generated-new-feedback-id-is-valid
  (property/generated-entity-id-is-valid :test.new-feedback/map
                                         "feedback"
                                         :optional))

;; Stored Feedback

(defspec ^:gen spec-generated-stored-feedback-is-valid
  (property/generated-entity-is-valid :test.stored-feedback/map))

(defspec ^:gen spec-generated-max-stored-feedback-is-valid
  (property/generated-entity-is-valid :test.max.stored-feedback/map))

(defspec ^:gen spec-generated-stored-feedback-id-is-valid
  (property/generated-entity-id-is-valid :test.stored-feedback/map
                                         "feedback"))
