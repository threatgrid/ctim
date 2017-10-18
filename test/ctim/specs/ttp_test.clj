(ns ctim.specs.ttp-test
  (:require [clojure.spec :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.ttp :as t]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.examples.ttps :as e]
            [flanders.spec :as fs]
            [ctim.domain.id :as id]))

(use-fixtures :once fixture-spec-validation)

(def kwns "ttp")

(deftest test-ttp-schema
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec t/TTP kwns)
         e/ttp-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec t/TTP kwns)
         e/ttp-minimal))))

(deftest test-new-ttp-schema
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec t/NewTTP kwns)
         e/new-ttp-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec t/NewTTP kwns)
         e/new-ttp-minimal))))

(deftest test-stored-ttp-schema
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec t/StoredTTP kwns)
         e/stored-ttp-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec t/StoredTTP kwns)
         e/stored-ttp-minimal)))

  (testing "example with short id"
    (is (s/assert
         (fs/->spec t/StoredTTP kwns)
         (update e/stored-ttp-minimal
                 :id id/str->short-id)))))
