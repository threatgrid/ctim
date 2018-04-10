(ns ctim.examples.incidents
  (:require [ctim.schemas.common :as c]))

(def incident-maximal
  {:id "http://ex.tld/ctia/incident/incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
   :external_ids ["http://ex.tld/ctia/incident/incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
                  "http://ex.tld/ctia/incident/incident-456"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
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
                                                                        :data_encrypted false}}
                      :identifying_observables [{:type "domain" :value "foo.com"}]}]
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
   :intended_effect "Extortion"
   :related_indicators [{:confidence "High"
                         :source "source"
                         :relationship "related-to"
                         :indicator_id "http://example.com/ctia/indicator/indicator-6e279a0d-6788-4cdf-957f-4e4b73823d6c"}]
   :related_incidents [{:confidence "High"
                        :source "source"
                        :relationship "related-to"
                        :incident_id "http://example.com/ctia/incident/incident-6e279a0d-6788-4cdf-957f-4e4b73823d6f"}]
   :related_observables [{:type "domain" :value "example.com"}]
   :attributed_actors [{:confidence "High"
                        :source "source"
                        :relationship "attributed-to"
                        :actor_id "http://example.com/ctia/actor/actor-6e279a0d-6788-4cdf-957f-4e4b73823d6d"}]
   :COA_taken [{:COA "http://example.com/ctia/coa/coa-6e279a0d-6788-4cdf-957f-4e4b73823f6d"
                :time #inst "2016-02-11T00:40:48.212-00:00"
                :contributors [{:role "role"
                                :name "name"
                                :email "name@foo.com"
                                :phone "+33 82222"
                                :organization "org"
                                :date #inst "2016-02-11T00:40:48.212-00:00"
                                :contribution_location "location"}]}]
   :COA_requested [{:COA "http://example.com/ctia/coa/coa-6e279a0d-6788-4ddf-957f-4e4b73823f6d"
                    :time #inst "2016-02-11T00:40:48.212-00:00"
                    :contributors [{:role "role"
                                    :name "name"
                                    :email "name@foo.com"
                                    :phone "+33 82222"
                                    :organization "org"
                                    :date #inst "2016-02-11T00:40:48.212-00:00"
                                    :contribution_location "location"}]}]})

(def incident-minimal
  {:id "http://ex.tld/ctia/incident/incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
   :type "incident"
   :schema_version c/ctim-schema-version
   :confidence "High"
   :valid_time {}})

(def new-incident-maximal
  incident-maximal)

(def new-incident-minimal
  {:confidence "High"})

(def stored-incident-maximal
  (into incident-maximal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))

(def stored-incident-minimal
  (into incident-minimal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))
