(ns ctim.schemas.sighting-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.sighting :as si]
            [ctim.examples.sightings :as e]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-sighting-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema si/Sighting)
         e/sighting-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema si/Sighting)
         e/sighting-minimal))))

(deftest test-new-sighting-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema si/NewSighting)
         e/new-sighting-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema si/NewSighting)
         e/new-sighting-minimal))))

(deftest test-stored-sighting-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema si/StoredSighting)
         e/stored-sighting-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema si/StoredSighting)
         e/stored-sighting-minimal))))
