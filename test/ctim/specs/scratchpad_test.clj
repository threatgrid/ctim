(ns ctim.specs.scratchpad-test
  (:require [clojure.spec.alpha :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.scratchpad :as i]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.examples.scratchpads :as e]
            [flanders.spec :as fs]))


(use-fixtures :once fixture-spec-validation)

(def kwns "scratchpad")

(deftest scratchpad-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec i/Scratchpad kwns)
         e/scratchpad-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec i/Scratchpad kwns)
         e/scratchpad-minimal))))

(deftest new-scratchpad-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec i/NewScratchpad kwns)
         e/new-scratchpad-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec i/NewScratchpad kwns)
         e/new-scratchpad-minimal))))

(deftest stored-scratchpad-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec i/StoredScratchpad kwns)
         e/stored-scratchpad-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec i/StoredScratchpad kwns)
         e/stored-scratchpad-minimal))))
