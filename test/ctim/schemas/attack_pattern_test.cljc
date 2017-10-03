(ns ctim.schemas.attack-pattern-test
  (:require [ctim.schemas.attack-pattern :as sut]
            [ctim.examples.attack-patterns :as e]
            #?(:clj [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [flanders.schema :as fs]
            [schema.core :as s]
            [schema.test :as st]))

(use-fixtures :once st/validate-schemas)

(deftest attack-pattern-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema sut/AttackPattern)
         e/attack-pattern-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema sut/AttackPattern)
         e/attack-pattern-minimal))))

(deftest new-attack-pattern-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema sut/NewAttackPattern)
         e/new-attack-pattern-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema sut/NewAttackPattern)
         e/new-attack-pattern-minimal))))

(deftest stored-attack-pattern-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema sut/StoredAttackPattern)
         e/stored-attack-pattern-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema sut/StoredAttackPattern)
         e/stored-attack-pattern-minimal))))
