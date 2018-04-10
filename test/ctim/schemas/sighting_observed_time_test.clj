(ns ctim.schemas.sighting-observed-time-test
  (:require [clj-momo.lib.clj-time.core :as time]
            [clojure.spec.alpha :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.sighting :as si]
            [ctim.test-helpers.core :as th]
            [ctim.examples.sightings :as e]
            [flanders.spec :as fs]))

(use-fixtures :once
  th/fixture-spec-validation
  (th/fixture-spec si/Sighting "test.sighting"))

(deftest test-sighting-observed-time-spec-validation
  (testing "valid observed_time"
    (is (s/valid?
         :test.sighting/map
         (update e/sighting-minimal :observed_time
                 assoc
                 :start_time (time/internal-date 2017 10 1)
                 :end_time (time/internal-date 2017 10 2))))

    (is (s/valid?
         :test.sighting/map
         (update e/sighting-minimal :observed_time
                 assoc
                 :start_time (time/internal-date 2017 10 1)
                 :end_time (time/internal-date 2017 10 1)))))

  (testing "valid observed_time (no end_time)"
    (is (s/valid?
         :test.sighting/map
         (-> e/sighting-minimal
             (assoc-in [:observed_time :start_time]
                       (time/internal-date 2017 10 1))
             (update :observed_time
                     dissoc
                     :end_time)))))

  (testing "invalid observed_time"
    (is ((complement s/valid?)
         :test.sighting/map
         (update e/sighting-minimal :observed_time
                 assoc
                 :start_time (time/internal-date 2017 10 2)
                 :end_time (time/internal-date 2017 10 1))))))
