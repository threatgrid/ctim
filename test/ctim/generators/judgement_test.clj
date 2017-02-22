(ns ctim.generators.judgement-test
  (:require [clj-momo.test-helpers.core :as mth]
            [clojure.spec :as cs]
            [clojure.test :refer [use-fixtures]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check.generators :as gen]
            [ctim.schemas.judgement :as judgement]
            [ctim.test-helpers
             [core :as th]
             [properties :as property]]
            [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  mth/fixture-schema-validation
  (th/fixture-spec judgement/Judgement
                   "test.judgement")
  (th/fixture-spec judgement/NewJudgement
                   "test.new-judgement")
  (th/fixture-spec judgement/StoredJudgement
                   "test.stored-judgement")
  (th/fixture-spec (fu/require-all judgement/Judgement)
                   "test.max.judgement")
  (th/fixture-spec (fu/require-all judgement/NewJudgement)
                   "test.max.new-judgement")
  (th/fixture-spec (fu/require-all judgement/StoredJudgement)
                   "test.max.stored-judgement"))

;; Judgement

(defspec ^:gen spec-generated-judgement-is-valid
  (property/generated-entity-is-valid :test.judgement/map
                                      (gen/fmap
                                       judgement/fix-disposition
                                       (cs/gen :test.judgement/map))))

(defspec ^:gen spec-generated-max-judgement-is-valid
  (property/generated-entity-is-valid :test.max.judgement/map
                                      (gen/fmap
                                       judgement/fix-disposition
                                       (cs/gen :test.max.judgement/map))))

(defspec ^:gen spec-generated-judgement-id-is-valid
  (property/generated-entity-id-is-valid :test.judgement/map
                                         "judgement"
                                         false
                                         (gen/fmap
                                          judgement/fix-disposition
                                          (cs/gen :test.judgement/map))))

;; New Judgement

(defspec ^:gen spec-generated-new-judgement-is-valid
  (property/generated-entity-is-valid :test.new-judgement/map
                                      (gen/fmap
                                       judgement/fix-disposition
                                       (cs/gen :test.new-judgement/map))))

(defspec ^:gen spec-generated-max-new-judgement-is-valid
  (property/generated-entity-is-valid :test.max.judgement/map
                                      (gen/fmap
                                       judgement/fix-disposition
                                       (cs/gen :test.max.new-judgement/map))))

(defspec ^:gen spec-generated-new-judgement-id-is-valid
  (property/generated-entity-id-is-valid :test.new-judgement/map
                                         "judgement"
                                         :optional
                                         (gen/fmap
                                          judgement/fix-disposition
                                          (cs/gen :test.new-judgement/map))))

;; Stored Judgement

(defspec ^:gen spec-generated-stored-judgement-is-valid
  (property/generated-entity-is-valid :test.stored-judgement/map
                                      (gen/fmap
                                       judgement/fix-disposition
                                       (cs/gen :test.stored-judgement/map))))

(defspec ^:gen spec-generated-max-stored-judgement-is-valid
  (property/generated-entity-is-valid :test.max.stored-judgement/map
                                      (gen/fmap
                                       judgement/fix-disposition
                                       (cs/gen :test.max.stored-judgement/map))))

(defspec ^:gen spec-generated-stored-judgement-id-is-valid
  (property/generated-entity-id-is-valid :test.stored-judgement/map
                                         "judgement"
                                         false
                                         (gen/fmap
                                          judgement/fix-disposition
                                          (cs/gen :test.stored-judgement/map))))

;; CTIM schema version

(defspec ^:gen spec-generated-judgement-has-ctim-schema-version
  (property/generated-entity-has-ctim-schema-version :test.judgement/map))
