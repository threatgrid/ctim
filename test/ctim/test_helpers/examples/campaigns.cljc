(ns ctim.test-helpers.examples.campaigns
  (:require [ctim.schemas.common :as c]))

(def campaign-maximal
  {:id "campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
   :type "campaign"
   :names ["foo" "bar"]
   :schema_version c/ctim-schema-version
   :uri "http://example.com"
   :revision 1
   :external_ids ["http://ex.tld/ctia/campaign/campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
                  "http://ex.tld/ctia/campaign/campiagn-20e0b949-2bbe-4b5d-8916-dd1cf5acd7d8"]
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
   :indicators [{:indicator_id "http://example.com/ctia/indicator/indicator-b686e0c2-4bd2-4adf-863b-33c0b777ad6f"
                 :confidence "High"
                 :source "nowhere"
                 :relationship "rel"}
                {:indicator_id "http://example.com/ctia/indicator/indicator-116a9a7d-709c-4372-8c25-a9b061659ea3"
                 :confidence "High"
                 :source "nowhere"
                 :relationship "rel"}]
   :attribution [{:confidence "High"
                  :source "source"
                  :relationship "relationship"
                  :actor_id "http://example.com/ctia/actor/actor-0256f6c5-1981-46e9-b702-88f8382bd47a"}]
   :related_incidents [{:confidence "High"
                        :source "source"
                        :relationship "relationship"
                        :incident_id "http://example.com/ctia/incident/incident-96ed2b23-e996-4168-bf47-377331281e99"}]
   :related_TTPs [{:confidence "High"
                   :source "source"
                   :relationship "relationship"
                   :TTP_id "http://example.com/ctia/ttp/ttp-eb08d2a6-1e84-4a1d-abe0-4122cebd8716"}]
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2016-07-11T00:40:48.212-00:00"}
   :status "Future"
   :associated_campaigns [{:campaign_id "http://example.com/ctia/campaign/campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}]
   :confidence "High"
   :activity [{:date_time #inst "2016-02-11T00:40:48.212-00:00"
               :description "activity"}]})

(def campaign-minimal
  {:id "campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
   :type "campaign"
   :schema_version c/ctim-schema-version
   :campaign_type "anything goes here"
   :valid_time {}})

(def new-campaign-maximal
  {:id "campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
   :type "campaign"
   :names ["foo" "bar"]
   :schema_version c/ctim-schema-version
   :uri "http://example.com"
   :revision 1
   :external_ids ["http://ex.tld/ctia/campaign/campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
                  "http://ex.tld/ctia/campaign/campiagn-20e0b949-2bbe-4b5d-8916-dd1cf5acd7d8"]
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
   :indicators [{:indicator_id "http://example.com/ctia/indicator/indicator-b686e0c2-4bd2-4adf-863b-33c0b777ad6f"
                 :confidence "High"
                 :source "nowhere"
                 :relationship "rel"}
                {:indicator_id "http://example.com/ctia/indicator/indicator-116a9a7d-709c-4372-8c25-a9b061659ea3"
                 :confidence "High"
                 :source "nowhere"
                 :relationship "rel"}]
   :attribution [{:confidence "High"
                  :source "source"
                  :relationship "relationship"
                  :actor_id "http://example.com/ctia/actor/actor-0256f6c5-1981-46e9-b702-88f8382bd47a"}]
   :related_incidents [{:confidence "High"
                        :source "source"
                        :relationship "relationship"
                        :incident_id "http://example.com/ctia/incident/incident-96ed2b23-e996-4168-bf47-377331281e99"}]
   :related_TTPs [{:confidence "High"
                   :source "source"
                   :relationship "relationship"
                   :TTP_id "http://example.com/ctia/ttp/ttp-eb08d2a6-1e84-4a1d-abe0-4122cebd8716"}]
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2016-07-11T00:40:48.212-00:00"}
   :status "Future"
   :associated_campaigns [{:campaign_id "http://example.com/ctia/campaign/campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}]
   :confidence "High"
   :activity [{:date_time #inst "2016-02-11T00:40:48.212-00:00"
               :description "activity"}]})

(def new-campaign-minimal
  {:campaign_type "anything goes here"})

(def stored-campaign-maximal
  {:id "campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
   :type "campaign"
   :names ["foo" "bar"]
   :schema_version c/ctim-schema-version
   :uri "http://example.com"
   :revision 1
   :external_ids ["http://ex.tld/ctia/campaign/campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
                  "http://ex.tld/ctia/campaign/campiagn-20e0b949-2bbe-4b5d-8916-dd1cf5acd7d8"]
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
   :indicators [{:indicator_id "http://example.com/ctia/indicator/indicator-b686e0c2-4bd2-4adf-863b-33c0b777ad6f"
                 :confidence "High"
                 :source "nowhere"
                 :relationship "rel"}
                {:indicator_id "http://example.com/ctia/indicator/indicator-116a9a7d-709c-4372-8c25-a9b061659ea3"
                 :confidence "High"
                 :source "nowhere"
                 :relationship "rel"}]
   :attribution [{:confidence "High"
                  :source "source"
                  :relationship "relationship"
                  :actor_id "http://example.com/ctia/actor/actor-0256f6c5-1981-46e9-b702-88f8382bd47a"}]
   :related_incidents [{:confidence "High"
                        :source "source"
                        :relationship "relationship"
                        :incident_id "http://example.com/ctia/incident/incident-96ed2b23-e996-4168-bf47-377331281e99"}]
   :related_TTPs [{:confidence "High"
                   :source "source"
                   :relationship "relationship"
                   :TTP_id "http://example.com/ctia/ttp/ttp-eb08d2a6-1e84-4a1d-abe0-4122cebd8716"}]
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2016-07-11T00:40:48.212-00:00"}
   :status "Future"
   :associated_campaigns [{:campaign_id "http://example.com/ctia/campaign/campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}]
   :confidence "High"
   :activity [{:date_time #inst "2016-02-11T00:40:48.212-00:00"
               :description "activity"}]
   :owner "foouser"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})

(def stored-campaign-minimal
  {:id "campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
   :type "campaign"
   :schema_version c/ctim-schema-version
   :campaign_type "anything goes here"
   :valid_time {}
   :owner "foouser"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})
