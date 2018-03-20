(ns ctim.specs.casebook-test
  (:require [clojure.spec.alpha :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.casebook :as c]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.examples.casebooks :as e]
            [flanders.spec :as fs]))


(use-fixtures :once fixture-spec-validation)

(def kwns "casebook")

(deftest casebook-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec c/Casebook kwns)
         e/casebook-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec c/Casebook kwns)
         e/casebook-minimal))))

(deftest new-casebook-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec c/NewCasebook kwns)
         e/new-casebook-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec c/NewCasebook kwns)
         e/new-casebook-minimal))))

(deftest stored-casebook-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec c/StoredCasebook kwns)
         e/stored-casebook-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec c/StoredCasebook kwns)
         e/stored-casebook-minimal))))
