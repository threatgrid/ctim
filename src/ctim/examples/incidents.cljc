(ns ctim.examples.incidents
  (:require [ctim.schemas.common :as c]))

(def incident-maximal
  {:id "http://ex.tld/ctia/incident/incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
   :assignees ["84991efc-c4fd-4428-a4b6-6d841db76853"
               "691858cd-8df6-4590-8452-8e23f65c6a16"]
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
   :severity "High"
   :tactics ["TA0011"],
   :techniques ["T1095", "T1001"]
   :source "source"
   :source_uri "http://example.com"
   :confidence "High"
   :categories ["Denial of Service"
                "Improper Usage"]
   :status "Open"
   :incident_time {:discovered #inst "2016-02-11T00:40:48.212-00:00"
                   :opened #inst "2016-02-11T00:40:48.212-00:00"
                   :remediated #inst "2016-02-11T00:40:48.212-00:00"
                   :reported #inst "2016-02-11T00:40:48.212-00:00"
                   :closed #inst "2016-02-11T00:40:48.212-00:00"
                   :rejected #inst "2016-02-11T00:40:48.212-00:00"}
   :discovery_method "Log Review"
   :promotion_method "Manual"
   :intended_effect "Extortion"
   :scores [{:type "asset", :score 5}
            {:type "ttp", :score 98}]
   :summary {:targets [{:type "endpoint"
                        :os "MAC OS"
                        :observed_time {:start_time #inst "2023-01-01T00:40:48.212-00:00"
                                        :end_time #inst "2023-01-01T00:40:48.212-00:00"}
                        :observables [{:type "hostname" :value "Demo_Cta"}
                                      {:type "amp_computer_guid" :value "68e94bf7-e239-4821-90d6-b7eaa0233443"}
                                      {:type "ip" :value "100.213.110.122"}]
                        :assets [{:id "http://ex.tld/ctia/asset/asset-61884b14-e273-4930-a5ff-dcce69207724"
                                  :external_ids ["http://ex.tld/ctia/asset/asset-61884b14-e273-4930-a5ff-dcce69207724"]
                                  :score 90
                                  :properties [{:name "labels" :value "dev,lead"}]
                                  :observables [{:type "amp_computer_guid" :value "68e94bf7-e239-4821-90d6-b7eaa0233443"}]}]}]}})

(def incident-minimal
  {:id "http://ex.tld/ctia/incident/incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
   :type "incident"
   :incident_time {:opened #inst "2016-02-11T00:40:48.212-00:00"}
   :status "Open"
   :schema_version c/ctim-schema-version
   :confidence "High"})

(def new-incident-maximal
  incident-maximal)

(def new-incident-minimal
  {:incident_time {:opened #inst "2016-02-11T00:40:48.212-00:00"}
   :status "Open"
   :confidence "High"})
