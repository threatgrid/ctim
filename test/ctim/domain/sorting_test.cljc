(ns ctim.domain.sorting-test
  (:require [clj-momo.lib.clj-time.core :as time]
            [clj-momo.lib.clj-time.coerce :as time-coerce]
            [ctim.domain.sorting :as sut]
            #?(:clj [clojure.test :refer [deftest is testing]]
               :cljs [cljs.test :refer-macros [deftest is testing]])))

(deftest sort-judgements-test
  (with-redefs [time/internal-now
                (constantly
                  (time/internal-date 2017 5 12))]
    (is (= (sut/sort-judgements
            [{:disposition 5,
              :disposition_name "Unknown",
              :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                           :end_time "2017-05-15T21:46:41.690Z"}}
             {:disposition 2,
              :disposition_name "Malicious",
              :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                           :end_time "2017-05-15T21:46:41.690Z"}}
             {:disposition 2,
              :disposition_name "Malicious",
              :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                           ;; This one is expired based on mocked 'now'
                           :end_time "2017-05-10T21:46:41.690Z"}}
             {:disposition 1,
              :disposition_name "Clean",
              :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                           :end_time "2017-05-15T21:46:41.690Z"}}
             {:disposition 3,
              :disposition_name "Suspicious",
              :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                           :end_time "2017-05-15T21:46:41.690Z"}}
             {:disposition 2,
              :disposition_name "Malicious",
              :valid_time {:start_time "2017-05-01T21:46:41.690Z",
                           :end_time "2017-05-15T22:46:41.690Z"}}
             {:disposition 4,
              :disposition_name "Common",
              :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                           :end_time "2017-05-15T21:46:41.690Z"}}])
           [{:disposition 1,
             :disposition_name "Clean",
             :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                          :end_time "2017-05-15T21:46:41.690Z"}}
            {:disposition 2,
             :disposition_name "Malicious",
             :valid_time {:start_time "2017-05-01T21:46:41.690Z",
                          :end_time "2017-05-15T22:46:41.690Z"}}
            {:disposition 2,
             :disposition_name "Malicious",
             :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                          :end_time "2017-05-15T21:46:41.690Z"}}
            {:disposition 3,
             :disposition_name "Suspicious",
             :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                          :end_time "2017-05-15T21:46:41.690Z"}}
            {:disposition 4,
             :disposition_name "Common",
             :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                          :end_time "2017-05-15T21:46:41.690Z"}}
            {:disposition 5,
             :disposition_name "Unknown",
             :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                          :end_time "2017-05-15T21:46:41.690Z"}}
            {:disposition 2,
             :disposition_name "Malicious",
             :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                          ;; Expired one comes last
                          :end_time "2017-05-10T21:46:41.690Z"}}]))))

(deftest sort-judgements-with-internal-date-test
  (with-redefs [time/internal-now
                (constantly
                 (time/internal-date 2017 5 12))]
    (is (= (->> [{:disposition 5,
                  :disposition_name "Unknown",
                  :valid_time {:start_time (time-coerce/to-internal-date
                                            "2017-05-01T20:46:41.690Z"),
                               :end_time (time-coerce/to-internal-date
                                          "2017-05-15T21:46:41.690Z")}}
                 {:disposition 2,
                  :disposition_name "Malicious",
                  :valid_time {:start_time (time-coerce/to-internal-date
                                            "2017-05-01T20:46:41.690Z"),
                               :end_time (time-coerce/to-internal-date
                                          "2017-05-15T21:46:41.690Z")}}
                 {:disposition 2,
                  :disposition_name "Malicious",
                  :valid_time {:start_time (time-coerce/to-internal-date
                                            "2017-05-01T20:46:41.690Z"),
                               ;; This one is expired based on mocked 'now'
                               :end_time (time-coerce/to-internal-date
                                          "2017-05-10T21:46:41.690Z")}}
                 {:disposition 1,
                  :disposition_name "Clean",
                  :valid_time {:start_time (time-coerce/to-internal-date
                                            "2017-05-01T20:46:41.690Z"),
                               :end_time (time-coerce/to-internal-date
                                          "2017-05-15T21:46:41.690Z")}}
                 {:disposition 3,
                  :disposition_name "Suspicious",
                  :valid_time {:start_time (time-coerce/to-internal-date
                                            "2017-05-01T20:46:41.690Z"),
                               :end_time (time-coerce/to-internal-date
                                          "2017-05-15T21:46:41.690Z")}}
                 {:disposition 2,
                  :disposition_name "Malicious",
                  :valid_time {:start_time (time-coerce/to-internal-date
                                            "2017-05-01T21:46:41.690Z"),
                               :end_time (time-coerce/to-internal-date
                                          "2017-05-15T22:46:41.690Z")}}
                 {:disposition 4,
                  :disposition_name "Common",
                  :valid_time {:start_time (time-coerce/to-internal-date
                                            "2017-05-01T20:46:41.690Z"),
                               :end_time (time-coerce/to-internal-date
                                          "2017-05-15T21:46:41.690Z")}}]
                sut/sort-judgements
                ;; JS dates of the same instant are still not equal, so
                ;; convert them back to strings for equality check
                (map (fn [m]
                       (-> m
                           (update-in [:valid_time :start_time]
                                      time-coerce/to-internal-string)
                           (update-in [:valid_time :end_time]
                                      time-coerce/to-internal-string)))))
           [{:disposition 1,
             :disposition_name "Clean",
             :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                          :end_time "2017-05-15T21:46:41.690Z"}}
            {:disposition 2,
             :disposition_name "Malicious",
             :valid_time {:start_time "2017-05-01T21:46:41.690Z",
                          :end_time "2017-05-15T22:46:41.690Z"}}
            {:disposition 2,
             :disposition_name "Malicious",
             :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                          :end_time "2017-05-15T21:46:41.690Z"}}
            {:disposition 3,
             :disposition_name "Suspicious",
             :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                          :end_time "2017-05-15T21:46:41.690Z"}}
            {:disposition 4,
             :disposition_name "Common",
             :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                          :end_time "2017-05-15T21:46:41.690Z"}}
            {:disposition 5,
             :disposition_name "Unknown",
             :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                          :end_time "2017-05-15T21:46:41.690Z"}}
            {:disposition 2,
             :disposition_name "Malicious",
             :valid_time {:start_time "2017-05-01T20:46:41.690Z",
                          ;; Expired one comes last
                          :end_time "2017-05-10T21:46:41.690Z"}}]))))

(deftest sort-sightings-test
  (testing "sort sightings"
    (is (= (sut/sort-sightings
            [{:id 1 :observed_time {:start_time "2017-01-12T00:00:00.002Z"}}
             {:id 2 :observed_time {:start_time "2017-01-12T00:00:00.001Z"}}
             {:id 3 :observed_time {:start_time "2017-01-12T00:00:00.000Z"}}])
           [{:id 3 :observed_time {:start_time "2017-01-12T00:00:00.000Z"}}
            {:id 2 :observed_time {:start_time "2017-01-12T00:00:00.001Z"}}
            {:id 1 :observed_time {:start_time "2017-01-12T00:00:00.002Z"}}]))))
