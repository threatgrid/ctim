(ns ctim.specs.relationship-test
  (:require [clojure.spec.alpha :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.relationship :as r]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.examples.relationships :as e]
            [flanders.spec :as fs]))

(use-fixtures :once fixture-spec-validation)

(def kwns "relationship")

(deftest test-relationship-spec
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec r/Relationship kwns)
         e/relationship-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec r/Relationship kwns)
         e/relationship-minimal))))

(deftest test-new-relationship-spec
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec r/NewRelationship kwns)
         e/new-relationship-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec r/NewRelationship kwns)
         e/new-relationship-minimal))))

(deftest test-stored-relationship-spec
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec r/StoredRelationship kwns)
         e/stored-relationship-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec r/StoredRelationship kwns)
         e/stored-relationship-minimal))))
