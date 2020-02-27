(ns ctim.generators.attack-pattern-test
  (:require  [clojure.test :refer [use-fixtures]]
             [clojure.test.check.clojure-test :refer [defspec]]
             [ctim.test-helpers.core :as th]
             [clj-momo.test-helpers.core :as mth]
             [ctim.schemas.attack-pattern :as sut]
             [ctim.test-helpers.properties :as property]
             [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  mth/fixture-schema-validation
  (th/fixture-spec sut/AttackPattern
                   "test.attack-pattern")
  (th/fixture-spec sut/NewAttackPattern
                   "test.new-attack-pattern")
  (th/fixture-spec (fu/require-all sut/AttackPattern)
                   "test.max.attack-pattern")
  (th/fixture-spec (fu/require-all sut/NewAttackPattern)
                   "test.max.new-attack-pattern"))

;; Attack Pattern

(defspec ^:gen spec-generated-attack-pattern-is-valid
  (property/generated-entity-is-valid :test.attack-pattern/map))

(defspec ^:gen spec-generated-max-attack-pattern-is-valid
  (property/generated-entity-is-valid :test.max.attack-pattern/map))

(defspec ^:gen spec-generated-attack-pattern-id-is-valid
  (property/generated-entity-id-is-valid :test.attack-pattern/map
                                         "attack-pattern"))

;; New Attack Pattern

(defspec ^:gen spec-generated-new-attack-pattern-is-valid
  (property/generated-entity-is-valid :test.new-attack-pattern/map))

(defspec ^:gen spec-generated-max-new-attack-pattern-is-valid
  (property/generated-entity-is-valid :test.max.attack-pattern/map))

(defspec ^:gen spec-generated-new-attack-pattern-id-is-valid
  (property/generated-entity-id-is-valid :test.new-attack-pattern/map
                                         "attack-pattern"
                                         :optional))
