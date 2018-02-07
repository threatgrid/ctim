(ns ctim.schemas.scratchpad-test
  (:require [ctim.schemas.scratchpad :as sut]
            [ctim.examples.scratchpads :as e]
            #?(:clj [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [flanders.schema :as fs]
            [schema.core :as s]
            [schema.test :as st]))

(use-fixtures :once st/validate-schemas)

(deftest scratchpad-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema sut/Scratchpad)
         e/scratchpad-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema sut/Scratchpad)
         e/scratchpad-minimal))))

(deftest stored-scratchpad-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema sut/StoredScratchpad)
         e/stored-scratchpad-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema sut/StoredScratchpad)
         e/stored-scratchpad-minimal))))

(deftest new-scratchpad-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema sut/NewScratchpad)
         e/new-scratchpad-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema sut/NewScratchpad)
         e/new-scratchpad-minimal))))
