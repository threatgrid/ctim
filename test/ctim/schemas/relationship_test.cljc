(ns ctim.schemas.relationship-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.relationship :as o]
            [ctim.test-helpers.examples.relationships :as e]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-relationship-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema o/Relationship)
         e/relationship-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema o/Relationship)
         e/relationship-minimal))))

(deftest test-new-relationship-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema o/NewRelationship)
         e/new-relationship-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema o/NewRelationship)
         e/new-relationship-minimal))))

(deftest test-stored-relationship-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema o/StoredRelationship)
         e/stored-relationship-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema o/StoredRelationship)
         e/stored-relationship-minimal))))
