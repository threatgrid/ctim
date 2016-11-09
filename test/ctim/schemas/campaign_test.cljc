(ns ctim.schemas.campaign-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.campaign :as ca]
            [ctim.schemas.common :as c]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest campaign-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema ca/Campaign)
         {:id "campaign-123"
          :type "campaign"
          :names ["foo" "bar"]
          :schema_version c/ctim-schema-version
          :uri "http://example.com"
          :revision 1
          :external_ids ["http://ex.tld/ctia/campaign/campaign-123"
                         "http://ex.tld/ctia/campaign/campaign-456"]
          :timestamp #inst "2016-02-11T00:40:48.212-00:00"
          :language "language"
          :title "campaign"
          :description "description"
          :short_description "short description"
          :source "source"
          :source_uri "http://example.com/"
          :tlp "red"
          :campaign_type "anything goes here"
          :intended_effect ["Theft"]
          :indicators [{:indicator_id "indicator-foo"
                        :confidence "High"
                        :source "nowhere"
                        :relationship "rel"}
                       {:indicator_id "indicator-bar"
                        :confidence "High"
                        :source "nowhere"
                        :relationship "rel"}]
          :attribution [{:confidence "High"
                         :source "source"
                         :relationship "relationship"
                         :actor_id "actor-123"}]
          :related_incidents [{:confidence "High"
                               :source "source"
                               :relationship "relationship"
                               :incident_id "incident-222"}]
          :related_TTPs [{:confidence "High"
                          :source "source"
                          :relationship "relationship"
                          :ttp_id "ttp-999"}]
          :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                       :end_time #inst "2016-07-11T00:40:48.212-00:00"}
          :status "Future"
          :associated_campaigns [{:campaign_id "campaign-123"
                                  :confidence "High"
                                  :source "source"
                                  :relationship "rel"}]
          :confidence "High"
          :activity [{:date_time #inst "2016-02-11T00:40:48.212-00:00"
                      :description "activity"}]})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema ca/Campaign)
         {:id "campaign-123"
          :type "campaign"
          :schema_version c/ctim-schema-version
          :campaign_type "anything goes here"
          :valid_time {}}))))

(deftest new-campaign-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema ca/NewCampaign)
         {:id "campaign-123"
          :type "campaign"
          :names ["foo" "bar"]
          :schema_version c/ctim-schema-version
          :uri "http://example.com"
          :revision 1
          :external_ids ["http://ex.tld/ctia/campaign/campaign-123"
                         "http://ex.tld/ctia/campaign/campaign-456"]
          :timestamp #inst "2016-02-11T00:40:48.212-00:00"
          :language "language"
          :title "campaign"
          :description "description"
          :short_description "short description"
          :source "source"
          :source_uri "http://example.com/"
          :tlp "red"
          :campaign_type "anything goes here"
          :intended_effect ["Theft"]
          :indicators [{:indicator_id "indicator-foo"
                        :confidence "High"
                        :source "nowhere"
                        :relationship "rel"}
                       {:indicator_id "indicator-bar"
                        :confidence "High"
                        :source "nowhere"
                        :relationship "rel"}]
          :attribution [{:confidence "High"
                         :source "source"
                         :relationship "relationship"
                         :actor_id "actor-123"}]
          :related_incidents [{:confidence "High"
                               :source "source"
                               :relationship "relationship"
                               :incident_id "incident-222"}]
          :related_TTPs [{:confidence "High"
                          :source "source"
                          :relationship "relationship"
                          :ttp_id "ttp-999"}]
          :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                       :end_time #inst "2016-07-11T00:40:48.212-00:00"}
          :status "Future"
          :associated_campaigns [{:campaign_id "campaign-123"
                                  :confidence "High"
                                  :source "source"
                                  :relationship "rel"}]
          :confidence "High"
          :activity [{:date_time #inst "2016-02-11T00:40:48.212-00:00"
                      :description "activity"}]})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema ca/NewCampaign)
         {:campaign_type "anything goes here"}))))

(deftest stored-campaign-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema ca/StoredCampaign)
         {:id "campaign-123"
          :type "campaign"
          :names ["foo" "bar"]
          :schema_version c/ctim-schema-version
          :uri "http://example.com"
          :revision 1
          :external_ids ["http://ex.tld/ctia/campaign/campaign-123"
                         "http://ex.tld/ctia/campaign/campaign-456"]
          :timestamp #inst "2016-02-11T00:40:48.212-00:00"
          :language "language"
          :title "campaign"
          :description "description"
          :short_description "short description"
          :source "source"
          :source_uri "http://example.com/"
          :tlp "red"
          :campaign_type "anything goes here"
          :intended_effect ["Theft"]
          :indicators [{:indicator_id "indicator-foo"
                        :confidence "High"
                        :source "nowhere"
                        :relationship "rel"}
                       {:indicator_id "indicator-bar"
                        :confidence "High"
                        :source "nowhere"
                        :relationship "rel"}]
          :attribution [{:confidence "High"
                         :source "source"
                         :relationship "relationship"
                         :actor_id "actor-123"}]
          :related_incidents [{:confidence "High"
                               :source "source"
                               :relationship "relationship"
                               :incident_id "incident-222"}]
          :related_TTPs [{:confidence "High"
                          :source "source"
                          :relationship "relationship"
                          :ttp_id "ttp-999"}]
          :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                       :end_time #inst "2016-07-11T00:40:48.212-00:00"}
          :status "Future"
          :associated_campaigns [{:campaign_id "campaign-123"
                                  :confidence "High"
                                  :source "source"
                                  :relationship "rel"}]
          :confidence "High"
          :activity [{:date_time #inst "2016-02-11T00:40:48.212-00:00"
                      :description "activity"}]
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema ca/StoredCampaign)
         {:id "campaign-123"
          :type "campaign"
          :schema_version c/ctim-schema-version
          :campaign_type "anything goes here"
          :valid_time {}
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"}))))
