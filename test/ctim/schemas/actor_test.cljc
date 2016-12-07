(ns ctim.schemas.actor-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.common :as c]
            [ctim.schemas.actor :as a]
            [ctim.examples.actors :as e]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest actor-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema a/Actor)
         e/actor-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema a/Actor)
         e/actor-minimal))))

(deftest new-actor-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema a/NewActor)
         e/new-actor-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema a/NewActor)
         e/new-actor-minimal))))

(deftest stored-actor-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema a/StoredActor)
         e/stored-actor-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema a/StoredActor)
         e/stored-actor-minimal))))
