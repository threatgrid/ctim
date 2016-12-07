(ns ctim.schemas.coa-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.coa :as coa]
            [ctim.schemas.common :as c]
            [ctim.examples.coas :as e]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-coa-openc2-variants
  (testing "openc2 deny using acl"
    (is (s/validate
         (fs/->schema coa/COA)
         e/coa-openc2-variant1)))

  (testing "openc2 contain using vlan"
    (is (s/validate
         (fs/->schema coa/COA)
         e/coa-openc2-variant2))))

(deftest coa-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema coa/COA)
         e/coa-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema coa/COA)
         e/coa-minimal))))

(deftest new-coa-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema coa/NewCOA)
         e/new-coa-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema coa/NewCOA)
         e/new-coa-minimal))))

(deftest stored-coa-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema coa/StoredCOA)
         e/stored-coa-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema coa/StoredCOA)
         e/stored-coa-minimal))))
