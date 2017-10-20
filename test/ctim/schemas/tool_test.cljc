(ns ctim.schemas.tool-test
  (:require [ctim.schemas.tool :as sut]
            [ctim.examples.tools :as e]
            #?(:clj [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [flanders.schema :as fs]
            [schema.core :as s]
            [schema.test :as st]))

(use-fixtures :once st/validate-schemas)

(deftest tool-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema sut/Tool)
         e/tool-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema sut/Tool)
         e/tool-minimal))))

(deftest new-tool-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema sut/NewTool)
         e/new-tool-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema sut/NewTool)
         e/new-tool-minimal))))

(deftest stored-tool-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema sut/StoredTool)
         e/stored-tool-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema sut/StoredTool)
         e/stored-tool-minimal))))
