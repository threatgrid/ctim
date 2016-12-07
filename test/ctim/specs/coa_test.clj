(ns ctim.specs.coa-test
  (:require [clojure.spec :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.coa :as c]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.examples.coas :as e]
            [flanders.spec :as fs]))

(use-fixtures :once fixture-spec-validation)

(def kwns "coa")

(deftest test-coa-openc2-variants
  (testing "openc2 deny using acl"
    (is (s/assert
         (fs/->spec c/COA kwns)
         e/coa-openc2-variant1)))

  (testing "openc2 contain using vlan"
    (is (s/assert
         (fs/->spec c/COA kwns)
         e/coa-openc2-variant2))))

(deftest coa-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec c/COA kwns)
         e/coa-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec c/COA kwns)
         e/coa-minimal))))

(deftest new-coa-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec c/NewCOA kwns)
         e/new-coa-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec c/NewCOA kwns)
         e/new-coa-minimal))))

(deftest stored-coa-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec c/StoredCOA kwns)
         e/stored-coa-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec c/StoredCOA kwns)
         e/stored-coa-minimal))))
