(ns ctim.schemas.casebook-test
  (:require [ctim.schemas.casebook :as sut]
            [ctim.examples.casebooks :as e]
            #?(:clj [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [flanders.schema :as fs]
            [schema.core :as s]
            [schema.test :as st]))

(use-fixtures :once st/validate-schemas)

(deftest casebook-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema sut/Casebook)
         e/casebook-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema sut/Casebook)
         e/casebook-minimal))))

(deftest stored-casebook-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema sut/StoredCasebook)
         e/stored-casebook-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema sut/StoredCasebook)
         e/stored-casebook-minimal))))

(deftest new-casebook-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema sut/NewCasebook)
         e/new-casebook-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema sut/NewCasebook)
         e/new-casebook-minimal))))
