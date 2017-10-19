(ns ctim.specs.campaign-test
  (:require [clojure.spec :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.campaign :as c]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [ctim.examples.campaigns :as e]
            [flanders.spec :as fs]))

(use-fixtures :once fixture-spec-validation)

(def kwns "campaign")

(deftest campaign-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec c/Campaign kwns)
         e/campaign-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec c/Campaign kwns)
         e/campaign-minimal))))

(deftest new-campaign-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec c/NewCampaign kwns)
         e/new-campaign-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec c/NewCampaign kwns)
         e/new-campaign-minimal))))

(deftest stored-campaign-spec-test
  (testing "example with all possible fields"
    (is (s/assert
         (fs/->spec c/StoredCampaign kwns)
         e/stored-campaign-maximal)))

  (testing "example with only required fields"
    (is (s/assert
         (fs/->spec c/StoredCampaign kwns)
         e/stored-campaign-minimal))))
