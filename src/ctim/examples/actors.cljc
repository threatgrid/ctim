(ns ctim.examples.actors
  (:require [ctim.schemas.common :as c]))

(def actor-maximal
  {:id "actor-5023697b-3857-4652-9b53-ccda297f9c3e"
   :type "actor"
   :schema_version c/ctim-schema-version
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
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2016-07-11T00:40:48.212-00:00"}
   :tlp "green"
   :owner "foouser"
   :groups ["bar"]
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
   :groups ["bar"]
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})
