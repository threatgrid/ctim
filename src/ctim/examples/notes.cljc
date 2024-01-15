(ns ctim.examples.notes
  (:require [ctim.schemas.common :as c]))

(def note-maximal
  {:schema_version c/ctim-schema-version
   :revision 3
   :content "Task completed!"
   :type "note"
   :note_class :default
   :source "Cisco Threat Response"
   :external_ids
   ["1234-456"]
   :external_references
   [{:source_name "Sample Source"
     :description "a sample external reference"
     :url "http://ex.tld/foo/bar"
     :hashes ["C6"]
     :external_id "123"}]
   :author "John Doe"
   :source_uri "http://ex.tld/foo/bar"
   :language "en"
   :id
   "https://ex.tld/ctia/note/note-0ecb71f3-6b04-4bbe-ba81-a0acf6f78394"
   :tlp "amber"
   :related_entities [{:entity_type "incident"
                       :entity_id "https://ex.tld/ctia/incident/incident-0ecb71f3-6b04-4bbe-ba81-a0acf6f78395"}
                      {:entity_type "coa"
                       :entity_id "https://ex.tld/ctia/coa/coa-8703b709-e668-4461-bd3f-ef0cd2925fbd"}]
   :timestamp #inst "2010-01-01T00:00:00.048-00:00"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})

(def note-minimal
  {:id "https://ex.tld/ctia/note/note-0ecb71f3-6b04-4bbe-ba81-a0acf6f78394"
   :schema_version c/ctim-schema-version
   :content "This is a Note"
   :type "note"
   :note_class :default
   :source "Cisco Threat Response"
   :related_entities [{:entity_type "incident"
                       :entity_id "https://ex.tld/ctia/incident/incident-0ecb71f3-6b04-4bbe-ba81-a0acf6f78395"}]
   :timestamp #inst "2010-01-01T00:00:00.048-00:00"})

(def new-note-maximal note-maximal)

(def new-note-minimal
  {:content "This is a Note"
   :source "Cisco Threat Response"
   :note_class :default
   :related_entities [{:entity_type "incident"
                       :entity_id "https://ex.tld/ctia/incident/incident-0ecb71f3-6b04-4bbe-ba81-a0acf6f78395"}]})
