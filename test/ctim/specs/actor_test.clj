(ns ctim.specs.actor-test
  (:require [clojure.spec.alpha :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.actor :as a]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.examples.actors :as e]
            [flanders.spec :as fs]))

(use-fixtures :once fixture-spec-validation)

(def kwns "actor")

(deftest actor-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec a/Actor kwns)
         e/actor-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec a/Actor kwns)
         e/actor-minimal))))

(deftest new-actor-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec a/NewActor kwns)
         e/new-actor-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec a/NewActor kwns)
         e/new-actor-minimal))))

(deftest stored-actor-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec a/StoredActor kwns)
         e/stored-actor-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec a/StoredActor kwns)
         e/stored-actor-minimal))))
