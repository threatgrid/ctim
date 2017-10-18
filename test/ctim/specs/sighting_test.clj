(ns ctim.specs.sighting-test
  (:require [clojure.spec :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.sighting :as si]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.examples.sightings :as e]
            [flanders.spec :as fs]
            [ctim.domain.id :as id]))

(use-fixtures :once fixture-spec-validation)

(def kwns "sighting")

(deftest test-sighting-schema
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec si/Sighting kwns)
         e/sighting-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec si/Sighting kwns)
         e/sighting-minimal))))

(deftest test-new-sighting-schema
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec si/NewSighting kwns)
         e/new-sighting-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec si/NewSighting kwns)
         e/new-sighting-minimal))))

(deftest test-stored-sighting-schema
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec si/StoredSighting kwns)
         e/stored-sighting-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec si/StoredSighting kwns)
         e/stored-sighting-minimal)))

  (testing "example with short id"
    (is (s/assert
         (fs/->spec si/StoredSighting kwns)
         (update e/stored-sighting-minimal
                 :id id/str->short-id)))))
