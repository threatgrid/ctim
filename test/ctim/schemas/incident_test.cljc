(ns ctim.schemas.incident-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.incident :as i]
            [ctim.examples.incidents :as e]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-incident-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema i/Incident)
         e/incident-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema i/Incident)
         e/incident-minimal))))

(deftest test-new-incident-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema i/NewIncident)
         e/new-incident-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema i/NewIncident)
         e/new-incident-minimal))))

(deftest test-stored-incident-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema i/StoredIncident)
         e/stored-incident-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema i/StoredIncident)
         e/stored-incident-minimal))))
