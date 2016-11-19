(ns ctim.schemas.indicator-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.indicator :as i]
            [ctim.test-helpers.examples.indicators :as e]
            [flanders.schema :as fs]
            [flanders.utils :as fu]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-indicator-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema i/Indicator)
         e/indicator-maximal)))

  (testing "example with all possible fields and with replace-either-with-any"
    (is (s/validate
         (fs/->schema (fu/replace-either-with-any i/Indicator))
         e/indicator-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema i/Indicator)
         e/indicator-minimal))))

(deftest test-new-indicator-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema i/NewIndicator)
         e/new-indicator-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema i/NewIndicator)
         e/new-indicator-minimal))))

(deftest test-stored-indicator-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema i/StoredIndicator)
         e/stored-indicator-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema i/StoredIndicator)
         e/stored-indicator-minimal))))
