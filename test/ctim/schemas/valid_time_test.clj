(ns ctim.schemas.valid-time-test
  (:require [clj-momo.lib.clj-time.core :as time]
            [clojure.spec.alpha :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.judgement :as j]
            [ctim.test-helpers.core :as th]
            [ctim.examples.judgements :as e]
            [flanders.spec :as fs]))

(use-fixtures :once
  th/fixture-spec-validation
  (th/fixture-spec j/Judgement "test.judgement"))

(deftest test-judgement-valid-time-spec-validation
  (testing "valid valid_time"
    (is (s/valid?
         :test.judgement/map
         (assoc e/judgement-minimal
                :valid_time
                {})))

    (is (s/valid?
         :test.judgement/map
         (assoc e/judgement-minimal
                :valid_time
                {:start_time (time/internal-date 2017 10 1)})))

    (is (s/valid?
         :test.judgement/map
         (assoc e/judgement-minimal
                :valid_time
                {:end_time (time/internal-date 2017 10 1)})))

    (is (s/valid?
         :test.judgement/map
         (assoc e/judgement-minimal
                :valid_time
                {:start_time (time/internal-date 2017 10 1)
                 :end_time (time/internal-date 2017 10 2)})))

    (is (s/valid?
         :test.judgement/map
         (assoc e/judgement-minimal
                :valid_time
                {:start_time (time/internal-date 2017 10 1)
                 :end_time (time/internal-date 2017 10 1)}))))

  (testing "invalid valid_time"
    (is ((complement s/valid?)
         :test.judgement/map
         (assoc e/judgement-minimal
                :valid_time
                {:start_time (time/internal-date 2017 10 2)
                 :end_time (time/internal-date 2017 10 1)})))))
