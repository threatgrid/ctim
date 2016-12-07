(ns ctim.schemas.judgement-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.judgement :as j]
            [ctim.examples.judgements :as e]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest judgement-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema j/Judgement)
         e/judgement-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema j/Judgement)
         e/judgement-minimal))))

(deftest new-judgement-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema j/NewJudgement)
         e/new-judgement-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema j/NewJudgement)
         e/new-judgement-minimal))))

(deftest stored-judgement-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema j/StoredJudgement)
         e/stored-judgement-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema j/StoredJudgement)
         e/stored-judgement-minimal))))
