(ns ctim.schemas.campaign-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.campaign :as ca]
            [ctim.schemas.common :as c]
            [ctim.test-helpers.examples.campaigns :as e]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest campaign-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema ca/Campaign)
         e/campaign-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema ca/Campaign)
         e/campaign-minimal))))

(deftest new-campaign-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema ca/NewCampaign)
         e/new-campaign-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema ca/NewCampaign)
         e/new-campaign-minimal))))

(deftest stored-campaign-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema ca/StoredCampaign)
         e/stored-campaign-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema ca/StoredCampaign)
         e/stored-campaign-minimal))))
