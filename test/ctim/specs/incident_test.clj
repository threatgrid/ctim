(ns ctim.specs.incident-test
  (:require [clojure.spec :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.incident :as i]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.examples.incidents :as e]
            [flanders.spec :as fs]
            [ctim.domain.id :as id]))

(use-fixtures :once fixture-spec-validation)

(def kwns "incident")

(deftest test-incident-spec
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec i/Incident kwns)
         e/incident-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec i/Incident kwns)
         e/incident-minimal))))

(deftest test-new-incident-spec
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec i/NewIncident kwns)
         e/new-incident-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec i/NewIncident kwns)
         e/new-incident-minimal))))

(deftest test-stored-incident-spec
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec i/StoredIncident kwns)
         e/stored-incident-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec i/StoredIncident kwns)
         e/stored-incident-minimal)))

  (testing "example with short id"
    (is (s/assert
         (fs/->spec i/StoredIncident kwns)
         (update e/stored-incident-minimal
                 :id id/str->short-id)))))
