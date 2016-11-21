(ns ctim.specs.judgement-test
  (:require [clojure.spec :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.judgement :as j]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.test-helpers.examples.judgements :as e]
            [flanders.spec :as fs]))

(use-fixtures :once fixture-spec-validation)

(deftest judgement-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec j/Judgement "judgement")
         e/judgement-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec j/Judgement "judgement")
         e/judgement-minimal))))

(deftest new-judgement-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec j/NewJudgement "new-judgement")
         e/new-judgement-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec j/NewJudgement "new-judgement")
         e/new-judgement-minimal))))

(deftest stored-judgement-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec j/StoredJudgement "stored-judgement")
         e/stored-judgement-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec j/StoredJudgement "stored-judgement")
         e/stored-judgement-minimal))))
