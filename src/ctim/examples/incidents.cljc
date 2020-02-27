(ns ctim.examples.incidents
  (:require [ctim.schemas.common :as c]))

(def incident-maximal
  {:id "http://ex.tld/ctia/incident/incident-e1b8afdf-e3dd-45d9-961c-dd84f37a8587"
   :assignees ["fred@hogwarts.io" "george@hogwarts.io"]
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
   :status "Open"
   :incident_time {:discovered #inst "2016-02-11T00:40:48.212-00:00"
                   :opened #inst "2016-02-11T00:40:48.212-00:00"
                   :remediated #inst "2016-02-11T00:40:48.212-00:00"
                   :reported #inst "2016-02-11T00:40:48.212-00:00"
                   :closed #inst "2016-02-11T00:40:48.212-00:00"
                   :rejected #inst "2016-02-11T00:40:48.212-00:00"}
   :discovery_method "Log Review"
   :intended_effect "Extortion"})

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
