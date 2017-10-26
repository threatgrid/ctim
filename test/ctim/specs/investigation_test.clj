(ns ctim.specs.investigation-test
  (:require [clojure.spec :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.investigation :as i]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.examples.investigations :as e]
            [flanders.spec :as fs]))


(use-fixtures :once fixture-spec-validation)

(def kwns "investigation")

(deftest investigation-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec i/Investigation kwns)
         e/investigation-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec i/Investigation kwns)
         e/investigation-minimal))))

(deftest new-investigation-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec i/NewInvestigation kwns)
         e/new-investigation-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec i/NewInvestigation kwns)
         e/new-investigation-minimal))))

(deftest stored-investigation-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec i/StoredInvestigation kwns)
         e/stored-investigation-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec i/StoredInvestigation kwns)
         e/stored-investigation-minimal))))
