(ns ctim.examples.relationships
  (:require [ctim.schemas.common :as c]))

(def relationship-maximal
  {:id "http://ex.tld/ctia/relationship/relationship-ece41fa5-a74c-4048-8a55-f0033b45701e"
   :type "relationship"
   :schema_version c/ctim-schema-version
   :title "title"
   :description "description"
   :short_description "short desc"
   :revision 1
   :external_ids ["foo" "bar"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :tlp "green"
   :source "source"
   :source_uri "http://example.com"
   :relationship_type "targets"
   :source_ref "http://example.com/ctia/sighting/sighting-ece41fa5-a74c-4048-8a55-f0033b45701e"
   :target_ref "http://example.com/ctia/incident/incident-558d3812-3434-4085-87b4-4bf32f95c42c"})

(def relationship-minimal
  {:id "http://ex.tld/ctia/relationship/relationship-ece41fa5-a74c-4048-8a55-f0033b45701e"
   :type "relationship"
   :schema_version c/ctim-schema-version
   :relationship_type "targets"
   :source_ref "http://example.com/ctia/sighting/sighting-ece41fa5-a74c-4048-8a55-f0033b45701e"
   :target_ref "http://example.com/ctia/incident/incident-558d3812-3434-4085-87b4-4bf32f95c42c"})

(def new-relationship-maximal
  relationship-maximal)

(def new-relationship-minimal
  {:relationship_type "targets"
   :source_ref "http://example.com/ctia/sighting/sighting-ece41fa5-a74c-4048-8a55-f0033b45701e"
   :target_ref "http://example.com/ctia/incident/incident-558d3812-3434-4085-87b4-4bf32f95c42c"})
