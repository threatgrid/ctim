(ns ctim.specs.attack-pattern-test
  (:require [clojure.spec :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.attack-pattern :as sut]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.examples.attack-patterns :as e]
            [flanders.spec :as fs]))

(use-fixtures :once fixture-spec-validation)

(def kwns "attack-pattern")

(deftest attack-pattern-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec sut/AttackPattern kwns)
         e/attack-pattern-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec sut/AttackPattern kwns)
         e/attack-pattern-minimal))))

(deftest new-attack-pattern-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec sut/NewAttackPattern kwns)
         e/new-attack-pattern-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec sut/NewAttackPattern kwns)
         e/new-attack-pattern-minimal))))

(deftest stored-attack-pattern-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec sut/StoredAttackPattern kwns)
         e/stored-attack-pattern-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec sut/StoredAttackPattern kwns)
         e/stored-attack-pattern-minimal))))

