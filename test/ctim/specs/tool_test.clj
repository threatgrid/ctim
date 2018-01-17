(ns ctim.specs.tool-test
  (:require [clojure.spec.alpha :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.tool :as sut]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.examples.tools :as e]
            [flanders.spec :as fs]))

(use-fixtures :once fixture-spec-validation)

(def kwns "tool")

(deftest tool-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec sut/Tool kwns)
         e/tool-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec sut/Tool kwns)
         e/tool-minimal))))

(deftest new-tool-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec sut/NewTool kwns)
         e/new-tool-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec sut/NewTool kwns)
         e/new-tool-minimal))))

(deftest stored-tool-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec sut/StoredTool kwns)
         e/stored-tool-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec sut/StoredTool kwns)
         e/stored-tool-minimal))))


