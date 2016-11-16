(ns ctim.schemas.actor-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.common :as c]
            [ctim.schemas.actor :as a]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest actor-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema a/Actor)
         {:id "actor-123"
          :type "actor"
          :schema_version c/ctim-schema-version
          :revision 1
          :external_ids ["http://ex.tld/ctia/actor/actor-123"
                         "http://ex.tld/ctia/actor/actor-456"]
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
          :associated_actors [{:actor_id "actor-123"}
                              {:actor_id "actor-456"}]
          :associated_campaigns [{:campaign_id "campaign-444"
                                  :confidence "High"
                                  :source "source"
                                  :relationship "rel"}
                                 {:campaign_id "campaign-555"
                                  :confidence "High"
                                  :source "source"
                                  :relationship "rel"}]
          :observed_TTPs [{:TTP_id "ttp-333"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}
                          {:TTP_id "ttp-999"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}]
          :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                       :end_time #inst "2016-07-11T00:40:48.212-00:00"}
          :tlp "green"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema a/Actor)
         {:id "actor-123"
          :type "actor"
          :schema_version c/ctim-schema-version
          :actor_type "Hacker",
          :confidence "High",
          :source "a source"
          :valid_time {}}))))

(deftest new-actor-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema a/NewActor)
         {:id "actor-123"
          :type "actor"
          :schema_version c/ctim-schema-version
          :revision 1
          :external_ids ["http://ex.tld/ctia/actor/actor-123"
                         "http://ex.tld/ctia/actor/actor-456"]
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
          :associated_actors [{:actor_id "actor-123"}
                              {:actor_id "actor-456"}]
          :associated_campaigns [{:campaign_id "campaign-444"
                                  :confidence "High"
                                  :source "source"
                                  :relationship "rel"}
                                 {:campaign_id "campaign-555"
                                  :confidence "High"
                                  :source "source"
                                  :relationship "rel"}]
          :observed_TTPs [{:TTP_id "ttp-333"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}
                          {:TTP_id "ttp-999"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}]
          :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                       :end_time #inst "2016-07-11T00:40:48.212-00:00"}
          :tlp "green"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema a/NewActor)
         {:actor_type "Hacker",
          :confidence "High",
          :source "a source"}))))

(deftest stored-actor-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema a/StoredActor)
         {:id "actor-123"
          :type "actor"
          :schema_version c/ctim-schema-version
          :revision 1
          :external_ids ["http://ex.tld/ctia/actor/actor-123"
                         "http://ex.tld/ctia/actor/actor-456"]
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
          :associated_actors [{:actor_id "actor-123"}
                              {:actor_id "actor-456"}]
          :associated_campaigns [{:campaign_id "campaign-444"
                                  :confidence "High"
                                  :source "source"
                                  :relationship "rel"}
                                 {:campaign_id "campaign-555"
                                  :confidence "High"
                                  :source "source"
                                  :relationship "rel"}]
          :observed_TTPs [{:TTP_id "ttp-333"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}
                          {:TTP_id "ttp-999"
                           :confidence "High"
                           :source "source"
                           :relationship "rel"}]
          :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                       :end_time #inst "2016-07-11T00:40:48.212-00:00"}
          :tlp "green"
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema a/StoredActor)
         {:id "actor-123"
          :type "actor"
          :schema_version c/ctim-schema-version
          :actor_type "Hacker",
          :confidence "High",
          :source "a source"
          :valid_time {}
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"}))))
