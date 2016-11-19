(ns ctim.test-helpers.examples.actors
  (:require [ctim.schemas.common :as c]))

(def actor-maximal
  {:id "actor-5023697b-3857-4652-9b53-ccda297f9c3e"
   :type "actor"
   :schema_version c/ctim-schema-version
   :uri "http://example.com/ctia/actor-5023697b-3857-4652-9b53-ccda297f9c3e"
   :revision 1
   :external_ids ["http://ex.tld/ctia/actor/actor-5023697b-3857-4652-9b53-ccda297f9c3e"
                  "http://ex.tld/ctia/actor/actor-9a2860bf-e239-4355-aa7a-2ef3f9921961"]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :actor_type "Hacker",
   :confidence "High",
   :source "a source"
   :source_uri "http://example.com/somewhere-else"
   :identity {:description "identity"
              :related_identities [{:identity "http://example.com/1"
                                    :confidence "Low"
                                    :information_source "somewhere"
                                    :relationship "rel"}
                                   {:identity "http://example.com/2"
                                    :confidence "High"
                                    :information_source "nowhere"
                                    :relationship "rel"}]}
   :motivation "Ego"
   :sophistication "Innovator"
   :intended_effect "Fraud"
   :planning_and_operational_support "foo"
   :associated_actors [{:actor_id "http://example.com/ctia/actor/actor-5023697b-3857-4652-9b53-ccda297f9c3e"}
                       {:actor_id "http://example.com/ctia/actor/actor-9a2860bf-e239-4355-aa7a-2ef3f9921961"}]
   :associated_campaigns [{:campaign_id "http://example.com/ctia/campaign/campaign-8ea5abbf-e747-4e01-b5f8-c3d8b6cf0e18"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}
                          {:campaign_id "http://example.com/ctia/campaign/campaign-05349ef6-7023-4a4b-885f-c08534da4ee3"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}]
   :observed_TTPs [{:TTP_id "http://example.com/ctia/ttp/ttp-81311cc6-86ce-4356-a123-30fd74f58b89"
                    :confidence "High"
                    :source "source"
                    :relationship "rel"}
                   {:TTP_id "http://example.com/ctia/ttp/ttp-b33bbaba-7571-49d5-ba06-6e34a027dd44"
                    :confidence "High"
                    :source "source"
                    :relationship "rel"}]
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2016-07-11T00:40:48.212-00:00"}
   :tlp "green"})

(def actor-minimal
  {:id "actor-5023697b-3857-4652-9b53-ccda297f9c3e"
   :type "actor"
   :schema_version c/ctim-schema-version
   :actor_type "Hacker",
   :confidence "High",
   :source "a source"
   :valid_time {}})

(def new-actor-maximal
  {:id "actor-5023697b-3857-4652-9b53-ccda297f9c3e"
   :type "actor"
   :schema_version c/ctim-schema-version
   :uri "http://example.com/ctia/actor-5023697b-3857-4652-9b53-ccda297f9c3e"
   :revision 1
   :external_ids ["http://ex.tld/ctia/actor/actor-5023697b-3857-4652-9b53-ccda297f9c3e"
                  "http://ex.tld/ctia/actor/actor-9a2860bf-e239-4355-aa7a-2ef3f9921961"]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :actor_type "Hacker",
   :confidence "High",
   :source "a source"
   :source_uri "http://example.com/somewhere-else"
   :identity {:description "identity"
              :related_identities [{:identity "http://example.com/1"
                                    :confidence "Low"
                                    :information_source "somewhere"
                                    :relationship "rel"}
                                   {:identity "http://example.com/2"
                                    :confidence "High"
                                    :information_source "nowhere"
                                    :relationship "rel"}]}
   :motivation "Ego"
   :sophistication "Innovator"
   :intended_effect "Fraud"
   :planning_and_operational_support "foo"
   :associated_actors [{:actor_id "http://example.com/ctia/actor/actor-5023697b-3857-4652-9b53-ccda297f9c3e"}
                       {:actor_id "http://example.com/ctia/actor/actor-9a2860bf-e239-4355-aa7a-2ef3f9921961"}]
   :associated_campaigns [{:campaign_id "http://example.com/ctia/campaign/campaign-8ea5abbf-e747-4e01-b5f8-c3d8b6cf0e18"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}
                          {:campaign_id "http://example.com/ctia/campaign/campaign-05349ef6-7023-4a4b-885f-c08534da4ee3"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}]
   :observed_TTPs [{:TTP_id "http://example.com/ctia/ttp/ttp-81311cc6-86ce-4356-a123-30fd74f58b89"
                    :confidence "High"
                    :source "source"
                    :relationship "rel"}
                   {:TTP_id "http://example.com/ctia/ttp/ttp-b33bbaba-7571-49d5-ba06-6e34a027dd44"
                    :confidence "High"
                    :source "source"
                    :relationship "rel"}]
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2016-07-11T00:40:48.212-00:00"}
   :tlp "green"})

(def new-actor-minimal
  {:actor_type "Hacker",
   :confidence "High",
   :source "a source"})

(def stored-actor-maximal
  {:id "actor-5023697b-3857-4652-9b53-ccda297f9c3e"
   :type "actor"
   :schema_version c/ctim-schema-version
   :uri "http://example.com/ctia/actor-5023697b-3857-4652-9b53-ccda297f9c3e"
   :revision 1
   :external_ids ["http://ex.tld/ctia/actor/actor-5023697b-3857-4652-9b53-ccda297f9c3e"
                  "http://ex.tld/ctia/actor/actor-9a2860bf-e239-4355-aa7a-2ef3f9921961"]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :actor_type "Hacker",
   :confidence "High",
   :source "a source"
   :source_uri "http://example.com/somewhere-else"
   :identity {:description "identity"
              :related_identities [{:identity "http://example.com/1"
                                    :confidence "Low"
                                    :information_source "somewhere"
                                    :relationship "rel"}
                                   {:identity "http://example.com/2"
                                    :confidence "High"
                                    :information_source "nowhere"
                                    :relationship "rel"}]}
   :motivation "Ego"
   :sophistication "Innovator"
   :intended_effect "Fraud"
   :planning_and_operational_support "foo"
   :associated_actors [{:actor_id "http://example.com/ctia/actor/actor-5023697b-3857-4652-9b53-ccda297f9c3e"}
                       {:actor_id "http://example.com/ctia/actor/actor-9a2860bf-e239-4355-aa7a-2ef3f9921961"}]
   :associated_campaigns [{:campaign_id "http://example.com/ctia/campaign/campaign-8ea5abbf-e747-4e01-b5f8-c3d8b6cf0e18"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}
                          {:campaign_id "http://example.com/ctia/campaign/campaign-05349ef6-7023-4a4b-885f-c08534da4ee3"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}]
   :observed_TTPs [{:TTP_id "http://example.com/ctia/ttp/ttp-81311cc6-86ce-4356-a123-30fd74f58b89"
                    :confidence "High"
                    :source "source"
                    :relationship "rel"}
                   {:TTP_id "http://example.com/ctia/ttp/ttp-b33bbaba-7571-49d5-ba06-6e34a027dd44"
                    :confidence "High"
                    :source "source"
                    :relationship "rel"}]
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2016-07-11T00:40:48.212-00:00"}
   :tlp "green"
   :owner "foouser"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})

(def stored-actor-minimal
  {:id "actor-5023697b-3857-4652-9b53-ccda297f9c3e"
   :type "actor"
   :schema_version c/ctim-schema-version
   :actor_type "Hacker",
   :confidence "High",
   :source "a source"
   :valid_time {}
   :owner "foouser"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})
