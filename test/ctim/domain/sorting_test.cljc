(ns ctim.domain.sorting-test
  (:require [ctim.domain.sorting :as sut]
            #?(:clj [clojure.test :refer [deftest is testing]]
               :cljs [cljs.test :refer-macros [deftest is testing]])))

(deftest compare-judgements-test
  (testing "sorting judgements"
    (is (= (sort-by identity
                    sut/compare-judgements
                    [{:disposition "Malicious"
                      :valid_time {:start_time "2017-01-12T00:00:00.000Z"}}
                     {:disposition "Clean"
                      :valid_time {:start_time "2017-01-12T00:00:00.000Z"}}
                     {:disposition "Malicious"
                      :valid_time {:start_time "2017-01-10T00:00:00.000Z"}}])
           [{:disposition "Clean"
             :valid_time {:start_time "2017-01-12T00:00:00.000Z"}}
            {:disposition "Malicious"
             :valid_time {:start_time "2017-01-12T00:00:00.000Z"}}
            {:disposition "Malicious"
             :valid_time {:start_time "2017-01-10T00:00:00.000Z"}}]))))

(deftest sort-sightings-test
  (testing "sort sightings"
    (is (= (sut/sort-sightings
            [{:id 3 :observed_time {:start_time "2017-01-12T00:00:00.000Z"}}
             {:id 2 :observed_time {:start_time "2017-01-12T00:00:00.001Z"}}
             {:id 1 :observed_time {:start_time "2017-01-12T00:00:00.002Z"}}])
           [{:id 1 :observed_time {:start_time "2017-01-12T00:00:00.002Z"}}
            {:id 2 :observed_time {:start_time "2017-01-12T00:00:00.001Z"}}
            {:id 3 :observed_time {:start_time "2017-01-12T00:00:00.000Z"}}]))))
