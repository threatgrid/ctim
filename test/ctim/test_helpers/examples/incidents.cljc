(ns ctim.test-helpers.examples.incidents
  (:require [ctim.schemas.common :as c]))

(def incident-maximal
  {:id "incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
   :external_ids ["http://ex.tld/ctia/incident/incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
                  "http://ex.tld/ctia/incident/incident-456"]
   :type "incident"
   :title "incident"
   :description "description"
   :short_description "short desc"
   :tlp "green"
   :schema_version c/ctim-schema-version
   :uri "http://example.com"
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
   :COA_requested [{:COA "http://example.com/ctia/coa/coa-2e4eb53f-cfa3-4957-86ab-6eaf02fd0587"
                    :time #inst "2016-02-11T00:40:48.212-00:00"
                    :contributors [{:role "role"
                                    :name "name"
                                    :email "email"
                                    :phone "phone"
                                    :organization "org"
                                    :date #inst "2016-02-11T00:40:48.212-00:00"
                                    :contribution_location "location"}]}]
   :COA_taken [{:COA "http://example.com/ctia/coa/coa-2e4eb53f-cfa3-4957-86ab-6eaf02fd0587"
                :time #inst "2016-02-11T00:40:48.212-00:00"
                :contributors [{:role "role"
                                :name "name"
                                :email "email"
                                :phone "phone"
                                :organization "org"
                                :date #inst "2016-02-11T00:40:48.212-00:00"
                                :contribution_location "location"}]}]
   :contact "contact"
   :history [{:action_entry [{:COA "http://example.com/ctia/coa/coa-2e4eb53f-cfa3-4957-86ab-6eaf02fd0587"
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
                         :indicator_id "http://example.com/ctia/indicator/indicator-c44ad39f-a603-4ccc-9151-bbf1e5e4787d"}]
   :related_observables [{:value "value"
                          :type "ipv6"}]
   :leveraged_TTPs [{:TTP_id "http://example.com/ctia/ttp/ttp-fca02d7b-97ed-4c2b-b23a-38fe95d2ef66"
                     :confidence "Low"
                     :source "source"
                     :relationship "relationship"}]
   :attributed_actors [{:actor_id "http://example.com/ctia/actor/actor-96cd0d6d-b820-42e1-9494-e682e51a9fd2"
                        :confidence "Low"
                        :source "source"
                        :relationship "relationship"}]
   :related_incidents [{:incident_id "http://example.com/ctia/incident/incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
                        :confidence "High"
                        :source "source"
                        :relationship "relationship"}
                       {:incident_id "http://example.com/ctia/incident/incident-940859ba-3b6c-45cc-a5e7-bde7aee2c938"
                        :confidence "High"
                        :source "source"
                        :relationship "relationship"}]
   :intended_effect "Extortion"})

(def incident-minimal
  {:id "incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
   :type "incident"
   :schema_version c/ctim-schema-version
   :confidence "High"
   :valid_time {}})

(def new-incident-maximal
  {:id "incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
   :external_ids ["http://ex.tld/ctia/incident/incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
                  "http://ex.tld/ctia/incident/incident-456"]
   :type "incident"
   :title "incident"
   :description "description"
   :short_description "short desc"
   :tlp "green"
   :schema_version c/ctim-schema-version
   :uri "http://example.com"
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
   :COA_requested [{:COA "http://example.com/ctia/coa/coa-2e4eb53f-cfa3-4957-86ab-6eaf02fd0587"
                    :time #inst "2016-02-11T00:40:48.212-00:00"
                    :contributors [{:role "role"
                                    :name "name"
                                    :email "email"
                                    :phone "phone"
                                    :organization "org"
                                    :date #inst "2016-02-11T00:40:48.212-00:00"
                                    :contribution_location "location"}]}]
   :COA_taken [{:COA "http://example.com/ctia/coa/coa-2e4eb53f-cfa3-4957-86ab-6eaf02fd0587"
                :time #inst "2016-02-11T00:40:48.212-00:00"
                :contributors [{:role "role"
                                :name "name"
                                :email "email"
                                :phone "phone"
                                :organization "org"
                                :date #inst "2016-02-11T00:40:48.212-00:00"
                                :contribution_location "location"}]}]
   :contact "contact"
   :history [{:action_entry [{:COA "http://example.com/ctia/coa/coa-2e4eb53f-cfa3-4957-86ab-6eaf02fd0587"
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
                         :indicator_id "http://example.com/ctia/indicator/indicator-c44ad39f-a603-4ccc-9151-bbf1e5e4787d"}]
   :related_observables [{:value "value"
                          :type "ipv6"}]
   :leveraged_TTPs [{:TTP_id "http://example.com/ctia/ttp/ttp-fca02d7b-97ed-4c2b-b23a-38fe95d2ef66"
                     :confidence "Low"
                     :source "source"
                     :relationship "relationship"}]
   :attributed_actors [{:actor_id "http://example.com/ctia/actor/actor-96cd0d6d-b820-42e1-9494-e682e51a9fd2"
                        :confidence "Low"
                        :source "source"
                        :relationship "relationship"}]
   :related_incidents [{:incident_id "http://example.com/ctia/incident/incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
                        :confidence "High"
                        :source "source"
                        :relationship "relationship"}
                       {:incident_id "http://example.com/ctia/incident/incident-940859ba-3b6c-45cc-a5e7-bde7aee2c938"
                        :confidence "High"
                        :source "source"
                        :relationship "relationship"}]
   :intended_effect "Extortion"})

(def new-incident-minimal
  {:confidence "High"})

(def stored-incident-maximal
  {:id "incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
   :external_ids ["http://ex.tld/ctia/incident/incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
                  "http://ex.tld/ctia/incident/incident-456"]
   :type "incident"
   :title "incident"
   :description "description"
   :short_description "short desc"
   :tlp "green"
   :schema_version c/ctim-schema-version
   :uri "http://example.com"
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
   :COA_requested [{:COA "http://example.com/ctia/coa/coa-2e4eb53f-cfa3-4957-86ab-6eaf02fd0587"
                    :time #inst "2016-02-11T00:40:48.212-00:00"
                    :contributors [{:role "role"
                                    :name "name"
                                    :email "email"
                                    :phone "phone"
                                    :organization "org"
                                    :date #inst "2016-02-11T00:40:48.212-00:00"
                                    :contribution_location "location"}]}]
   :COA_taken [{:COA "http://example.com/ctia/coa/coa-2e4eb53f-cfa3-4957-86ab-6eaf02fd0587"
                :time #inst "2016-02-11T00:40:48.212-00:00"
                :contributors [{:role "role"
                                :name "name"
                                :email "email"
                                :phone "phone"
                                :organization "org"
                                :date #inst "2016-02-11T00:40:48.212-00:00"
                                :contribution_location "location"}]}]
   :contact "contact"
   :history [{:action_entry [{:COA "http://example.com/ctia/coa/coa-2e4eb53f-cfa3-4957-86ab-6eaf02fd0587"
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
                         :indicator_id "http://example.com/ctia/indicator/indicator-c44ad39f-a603-4ccc-9151-bbf1e5e4787d"}]
   :related_observables [{:value "value"
                          :type "ipv6"}]
   :leveraged_TTPs [{:TTP_id "http://example.com/ctia/ttp/ttp-fca02d7b-97ed-4c2b-b23a-38fe95d2ef66"
                     :confidence "Low"
                     :source "source"
                     :relationship "relationship"}]
   :attributed_actors [{:actor_id "http://example.com/ctia/actor/actor-96cd0d6d-b820-42e1-9494-e682e51a9fd2"
                        :confidence "Low"
                        :source "source"
                        :relationship "relationship"}]
   :related_incidents [{:incident_id "http://example.com/ctia/incident/incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
                        :confidence "High"
                        :source "source"
                        :relationship "relationship"}
                       {:incident_id "http://example.com/ctia/incident/incident-940859ba-3b6c-45cc-a5e7-bde7aee2c938"
                        :confidence "High"
                        :source "source"
                        :relationship "relationship"}]
   :intended_effect "Extortion"
   :owner "foouser"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})

(def stored-incident-minimal
  {:id "incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
   :type "incident"
   :schema_version c/ctim-schema-version
   :confidence "High"
   :valid_time {}
   :owner "foouser"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})
