(ns ctim.schemas.incident-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.incident :as i]
            [ctim.schemas.common :as c]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-incident-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema i/Incident)
         {:id "incident-123"
          :external_ids ["http://ex.tld/ctia/incident/incident-123"
                         "http://ex.tld/ctia/incident/incident-456"]
          :type "incident"
          :title "incident"
          :description "description"
          :short_description "short desc"
          :tlp "green"
          :schema_version c/ctim-schema-version
          :revision 1
          :timestamp #inst "2016-02-11T00:40:48.212-00:00"
          :language "language"
          :source "source"
          :source_uri "http://example.com"
          :confidence "High"
          :categories ["Denial of Service"
                       "Improper Usage"]
          :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                       :end_time #inst "2525-01-01T00:00:00.000-00:00"}
          :status "Open"
          :incident_time {:first_malicious_action #inst "2016-02-11T00:40:48.212-00:00"
                          :initial_compromise #inst "2016-02-11T00:40:48.212-00:00"
                          :first_data_exfiltration #inst "2016-02-11T00:40:48.212-00:00"
                          :incident_discovery #inst "2016-02-11T00:40:48.212-00:00"
                          :incident_opened #inst "2016-02-11T00:40:48.212-00:00"
                          :containment_achieved #inst "2016-02-11T00:40:48.212-00:00"
                          :restoration_achieved #inst "2016-02-11T00:40:48.212-00:00"
                          :incident_reported #inst "2016-02-11T00:40:48.212-00:00"
                          :incident_closed #inst "2016-02-11T00:40:48.212-00:00"}
          :reporter "reporter"
          :responder "responder"
          :coordinator "coordinator"
          :victim "victim"
          :affected_assets [{:type "thing"
                             :description "description"
                             :ownership_class "Partner-Owned"
                             :management_class "CO-Management"
                             :location_class "Mobile"
                             :property_affected {:property "Non-Repudiation"
                                                 :description_of_effect "foo"
                                                 :type_of_availability_loss "foo"
                                                 :duration_of_availability_loss "Seconds"
                                                 :non_public_data_compromised {:security_compromise "Yes"
                                                                               :data_encrypted false}}}]
          :impact_assessment {:direct_impact_summary {:asset_losses "Moderate"
                                                      :business_mission_distruption "Major"
                                                      :response_and_recovery_costs "Minor"}
                              :indirect_impact_summary {:loss_of_competitive_advantage "Yes"
                                                        :brand_and_market_damage "No"
                                                        :increased_operating_costs "Yes"
                                                        :local_and_regulatory_costs "Yes"}
                              :total_loss_estimation {:initial_reported_total_loss_estimation {:amount 100
                                                                                               :iso_currency_code "foo"}
                                                      :actual_total_loss_estimation {:amount 100
                                                                                     :iso_currency_code "foo"}}
                              :impact_qualification "Painful"
                              :effects ["Data Breach or Compromise"]}
          :security_compromise "Yes"
          :discovery_method "Log Review"
          :COA_requested [{:COA "coa-123"
                           :time #inst "2016-02-11T00:40:48.212-00:00"
                           :contributors [{:role "role"
                                           :name "name"
                                           :email "email"
                                           :phone "phone"
                                           :organization "org"
                                           :date #inst "2016-02-11T00:40:48.212-00:00"
                                           :contribution_location "location"}]}]
          :COA_taken [{:COA "coa-123"
                       :time #inst "2016-02-11T00:40:48.212-00:00"
                       :contributors [{:role "role"
                                       :name "name"
                                       :email "email"
                                       :phone "phone"
                                       :organization "org"
                                       :date #inst "2016-02-11T00:40:48.212-00:00"
                                       :contribution_location "location"}]}]
          :contact "contact"
          :history [{:action_entry [{:COA "coa-123"
                                     :time #inst "2016-02-11T00:40:48.212-00:00"
                                     :contributors [{:role "role"
                                                     :name "name"
                                                     :email "email"
                                                     :phone "phone"
                                                     :organization "org"
                                                     :date #inst "2016-02-11T00:40:48.212-00:00"
                                                     :contribution_location "location"}]}]
                     :journal_entry "history"}]
          :related_indicators [{:confidence "High"
                                :source "source"
                                :relationship "relationship"
                                :indicator_id "indicator-123"}]
          :related_observables [{:value "value"
                                 :type "ipv6"}]
          :leveraged_TTPs [{:ttp_id "ttp-123"
                            :confidence "Low"
                            :source "source"
                            :relationship "relationship"}]
          :attributed_actors [{:actor_id "actor-123"
                               :confidence "Low"
                               :source "source"
                               :relationship "relationship"}]
          :related_incidents [{:incident_id "incident-123"
                               :confidence "High"
                               :source "source"
                               :relationship "relationship"}
                              {:incident_id "indicent-789"
                               :confidence "High"
                               :source "source"
                               :relationship "relationship"}]
          :intended_effect "Extortion"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema i/Incident)
         {:id "incident-123"
          :type "incident"
          :schema_version c/ctim-schema-version
          :confidence "High"
          :valid_time {}}))))

(deftest test-new-incident-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema i/NewIncident)
         {:id "incident-123"
          :external_ids ["http://ex.tld/ctia/incident/incident-123"
                         "http://ex.tld/ctia/incident/incident-456"]
          :type "incident"
          :title "incident"
          :description "description"
          :short_description "short desc"
          :tlp "green"
          :schema_version c/ctim-schema-version
          :revision 1
          :timestamp #inst "2016-02-11T00:40:48.212-00:00"
          :language "language"
          :source "source"
          :source_uri "http://example.com"
          :confidence "High"
          :categories ["Denial of Service"
                       "Improper Usage"]
          :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                       :end_time #inst "2525-01-01T00:00:00.000-00:00"}
          :status "Open"
          :incident_time {:first_malicious_action #inst "2016-02-11T00:40:48.212-00:00"
                          :initial_compromise #inst "2016-02-11T00:40:48.212-00:00"
                          :first_data_exfiltration #inst "2016-02-11T00:40:48.212-00:00"
                          :incident_discovery #inst "2016-02-11T00:40:48.212-00:00"
                          :incident_opened #inst "2016-02-11T00:40:48.212-00:00"
                          :containment_achieved #inst "2016-02-11T00:40:48.212-00:00"
                          :restoration_achieved #inst "2016-02-11T00:40:48.212-00:00"
                          :incident_reported #inst "2016-02-11T00:40:48.212-00:00"
                          :incident_closed #inst "2016-02-11T00:40:48.212-00:00"}
          :reporter "reporter"
          :responder "responder"
          :coordinator "coordinator"
          :victim "victim"
          :affected_assets [{:type "thing"
                             :description "description"
                             :ownership_class "Partner-Owned"
                             :management_class "CO-Management"
                             :location_class "Mobile"
                             :property_affected {:property "Non-Repudiation"
                                                 :description_of_effect "foo"
                                                 :type_of_availability_loss "foo"
                                                 :duration_of_availability_loss "Seconds"
                                                 :non_public_data_compromised {:security_compromise "Yes"
                                                                               :data_encrypted false}}}]
          :impact_assessment {:direct_impact_summary {:asset_losses "Moderate"
                                                      :business_mission_distruption "Major"
                                                      :response_and_recovery_costs "Minor"}
                              :indirect_impact_summary {:loss_of_competitive_advantage "Yes"
                                                        :brand_and_market_damage "No"
                                                        :increased_operating_costs "Yes"
                                                        :local_and_regulatory_costs "Yes"}
                              :total_loss_estimation {:initial_reported_total_loss_estimation {:amount 100
                                                                                               :iso_currency_code "foo"}
                                                      :actual_total_loss_estimation {:amount 100
                                                                                     :iso_currency_code "foo"}}
                              :impact_qualification "Painful"
                              :effects ["Data Breach or Compromise"]}
          :security_compromise "Yes"
          :discovery_method "Log Review"
          :COA_requested [{:COA "coa-123"
                           :time #inst "2016-02-11T00:40:48.212-00:00"
                           :contributors [{:role "role"
                                           :name "name"
                                           :email "email"
                                           :phone "phone"
                                           :organization "org"
                                           :date #inst "2016-02-11T00:40:48.212-00:00"
                                           :contribution_location "location"}]}]
          :COA_taken [{:COA "coa-123"
                       :time #inst "2016-02-11T00:40:48.212-00:00"
                       :contributors [{:role "role"
                                       :name "name"
                                       :email "email"
                                       :phone "phone"
                                       :organization "org"
                                       :date #inst "2016-02-11T00:40:48.212-00:00"
                                       :contribution_location "location"}]}]
          :contact "contact"
          :history [{:action_entry [{:COA "coa-123"
                                     :time #inst "2016-02-11T00:40:48.212-00:00"
                                     :contributors [{:role "role"
                                                     :name "name"
                                                     :email "email"
                                                     :phone "phone"
                                                     :organization "org"
                                                     :date #inst "2016-02-11T00:40:48.212-00:00"
                                                     :contribution_location "location"}]}]
                     :journal_entry "history"}]
          :related_indicators [{:confidence "High"
                                :source "source"
                                :relationship "relationship"
                                :indicator_id "indicator-123"}]
          :related_observables [{:value "value"
                                 :type "ipv6"}]
          :leveraged_TTPs [{:ttp_id "ttp-123"
                            :confidence "Low"
                            :source "source"
                            :relationship "relationship"}]
          :attributed_actors [{:actor_id "actor-123"
                               :confidence "Low"
                               :source "source"
                               :relationship "relationship"}]
          :related_incidents [{:incident_id "incident-123"
                               :confidence "High"
                               :source "source"
                               :relationship "relationship"}
                              {:incident_id "indicent-789"
                               :confidence "High"
                               :source "source"
                               :relationship "relationship"}]
          :intended_effect "Extortion"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema i/NewIncident)
         {:confidence "High"}))))

(deftest test-stored-incident-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema i/StoredIncident)
         {:id "incident-123"
          :external_ids ["http://ex.tld/ctia/incident/incident-123"
                         "http://ex.tld/ctia/incident/incident-456"]
          :type "incident"
          :title "incident"
          :description "description"
          :short_description "short desc"
          :tlp "green"
          :schema_version c/ctim-schema-version
          :revision 1
          :timestamp #inst "2016-02-11T00:40:48.212-00:00"
          :language "language"
          :source "source"
          :source_uri "http://example.com"
          :confidence "High"
          :categories ["Denial of Service"
                       "Improper Usage"]
          :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                       :end_time #inst "2525-01-01T00:00:00.000-00:00"}
          :status "Open"
          :incident_time {:first_malicious_action #inst "2016-02-11T00:40:48.212-00:00"
                          :initial_compromise #inst "2016-02-11T00:40:48.212-00:00"
                          :first_data_exfiltration #inst "2016-02-11T00:40:48.212-00:00"
                          :incident_discovery #inst "2016-02-11T00:40:48.212-00:00"
                          :incident_opened #inst "2016-02-11T00:40:48.212-00:00"
                          :containment_achieved #inst "2016-02-11T00:40:48.212-00:00"
                          :restoration_achieved #inst "2016-02-11T00:40:48.212-00:00"
                          :incident_reported #inst "2016-02-11T00:40:48.212-00:00"
                          :incident_closed #inst "2016-02-11T00:40:48.212-00:00"}
          :reporter "reporter"
          :responder "responder"
          :coordinator "coordinator"
          :victim "victim"
          :affected_assets [{:type "thing"
                             :description "description"
                             :ownership_class "Partner-Owned"
                             :management_class "CO-Management"
                             :location_class "Mobile"
                             :property_affected {:property "Non-Repudiation"
                                                 :description_of_effect "foo"
                                                 :type_of_availability_loss "foo"
                                                 :duration_of_availability_loss "Seconds"
                                                 :non_public_data_compromised {:security_compromise "Yes"
                                                                               :data_encrypted false}}}]
          :impact_assessment {:direct_impact_summary {:asset_losses "Moderate"
                                                      :business_mission_distruption "Major"
                                                      :response_and_recovery_costs "Minor"}
                              :indirect_impact_summary {:loss_of_competitive_advantage "Yes"
                                                        :brand_and_market_damage "No"
                                                        :increased_operating_costs "Yes"
                                                        :local_and_regulatory_costs "Yes"}
                              :total_loss_estimation {:initial_reported_total_loss_estimation {:amount 100
                                                                                               :iso_currency_code "foo"}
                                                      :actual_total_loss_estimation {:amount 100
                                                                                     :iso_currency_code "foo"}}
                              :impact_qualification "Painful"
                              :effects ["Data Breach or Compromise"]}
          :security_compromise "Yes"
          :discovery_method "Log Review"
          :COA_requested [{:COA "coa-123"
                           :time #inst "2016-02-11T00:40:48.212-00:00"
                           :contributors [{:role "role"
                                           :name "name"
                                           :email "email"
                                           :phone "phone"
                                           :organization "org"
                                           :date #inst "2016-02-11T00:40:48.212-00:00"
                                           :contribution_location "location"}]}]
          :COA_taken [{:COA "coa-123"
                       :time #inst "2016-02-11T00:40:48.212-00:00"
                       :contributors [{:role "role"
                                       :name "name"
                                       :email "email"
                                       :phone "phone"
                                       :organization "org"
                                       :date #inst "2016-02-11T00:40:48.212-00:00"
                                       :contribution_location "location"}]}]
          :contact "contact"
          :history [{:action_entry [{:COA "coa-123"
                                     :time #inst "2016-02-11T00:40:48.212-00:00"
                                     :contributors [{:role "role"
                                                     :name "name"
                                                     :email "email"
                                                     :phone "phone"
                                                     :organization "org"
                                                     :date #inst "2016-02-11T00:40:48.212-00:00"
                                                     :contribution_location "location"}]}]
                     :journal_entry "history"}]
          :related_indicators [{:confidence "High"
                                :source "source"
                                :relationship "relationship"
                                :indicator_id "indicator-123"}]
          :related_observables [{:value "value"
                                 :type "ipv6"}]
          :leveraged_TTPs [{:ttp_id "ttp-123"
                            :confidence "Low"
                            :source "source"
                            :relationship "relationship"}]
          :attributed_actors [{:actor_id "actor-123"
                               :confidence "Low"
                               :source "source"
                               :relationship "relationship"}]
          :related_incidents [{:incident_id "incident-123"
                               :confidence "High"
                               :source "source"
                               :relationship "relationship"}
                              {:incident_id "indicent-789"
                               :confidence "High"
                               :source "source"
                               :relationship "relationship"}]
          :intended_effect "Extortion"
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema i/StoredIncident)
         {:id "incident-123"
          :type "incident"
          :schema_version c/ctim-schema-version
          :confidence "High"
          :valid_time {}
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"}))))
