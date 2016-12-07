(ns ctim.generators.actor-test
  (:require [clj-momo.test-helpers.core :as mth]
            [clojure.test :refer [use-fixtures]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [ctim.schemas.actor :as actor]
            [ctim.test-helpers
             [core :as th]
             [properties :as property]]
            [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  mth/fixture-schema-validation
  (th/fixture-spec actor/Actor
                   "test.actor")
  (th/fixture-spec actor/NewActor
                   "test.new-actor")
  (th/fixture-spec actor/StoredActor
                   "test.stored-actor")
  (th/fixture-spec (fu/require-all actor/Actor)
                   "test.max.actor")
  (th/fixture-spec (fu/require-all actor/NewActor)
                   "test.max.new-actor")
  (th/fixture-spec (fu/require-all actor/StoredActor)
                   "test.max.stored-actor"))

;; Actor

(defspec ^:gen spec-generated-actor-is-valid
  (property/generated-entity-is-valid :test.actor/map))

(defspec ^:gen spec-generated-max-actor-is-valid
  (property/generated-entity-is-valid :test.max.actor/map))

(defspec ^:gen spec-generated-actor-id-is-valid
  (property/generated-entity-id-is-valid :test.actor/map
                                         "actor"))

;; New Actor

(defspec ^:gen spec-generated-new-actor-is-valid
  (property/generated-entity-is-valid :test.new-actor/map))

(defspec ^:gen spec-generated-max-new-actor-is-valid
  (property/generated-entity-is-valid :test.max.actor/map))

(defspec ^:gen spec-generated-new-actor-id-is-valid
  (property/generated-entity-id-is-valid :test.new-actor/map
                                         "actor"
                                         :optional))

;; Stored Actor

(defspec ^:gen spec-generated-stored-actor-is-valid
  (property/generated-entity-is-valid :test.stored-actor/map))

(defspec ^:gen spec-generated-max-stored-actor-is-valid
  (property/generated-entity-is-valid :test.max.stored-actor/map))

(defspec ^:gen spec-generated-stored-actor-id-is-valid
  (property/generated-entity-id-is-valid :test.stored-actor/map
                                         "actor"))
