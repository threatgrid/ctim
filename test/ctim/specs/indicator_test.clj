(ns ctim.specs.indicator-test
  (:require [clojure.spec :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.indicator :as i]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.test-helpers.examples.indicators :as e]
            [flanders.spec :as fs]))

(use-fixtures :once fixture-spec-validation)

(def kwns "indicator")

(deftest indicator-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec i/Indicator kwns)
         e/indicator-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec i/Indicator kwns)
         e/indicator-minimal))))

(deftest new-indicator-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec i/NewIndicator kwns)
         e/new-indicator-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec i/NewIndicator kwns)
         e/new-indicator-minimal))))

(deftest stored-indicator-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec i/StoredIndicator kwns)
         e/stored-indicator-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec i/StoredIndicator kwns)
         e/stored-indicator-minimal))))
