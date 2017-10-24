(ns ctim.schemas.investigation-test
  (:require
   #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
      :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
   [ctim.schemas.common :as c]
   [ctim.schemas.investigation :as inv]
   [ctim.examples.investigations :as ex]
   [flanders.schema :as fs]
   [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest investigation-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema inv/Investigation)
         ex/investigation-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema inv/Investigation)
         ex/investigation-minimal))))

(deftest new-investigation-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema inv/NewInvestigation)
         ex/new-investigation-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema inv/NewInvestigation)
         ex/new-investigation-minimal))))

(deftest stored-investigation-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema inv/StoredInvestigation)
         ex/stored-investigation-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema inv/StoredInvestigation)
         ex/stored-investigation-minimal))))
