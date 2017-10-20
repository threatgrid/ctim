(ns ctim.examples.judgements
  (:require [ctim.schemas.common :as c]))

(def judgement-maximal
  {:id "http://ex.tld/ctia/judgement/judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
   :type "judgement"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["123" "ABC"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :tlp "green"
   :source "source"
   :source_uri "http://example.com/somewhere-else"
   :observable {:type "ip",
                :value "10.0.0.1"}
   :disposition 1
   :disposition_name "Clean"
   :priority 99
   :confidence "High"
   :severity "Medium"
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :reason "reason"
   :reason_uri "http://example.com/a-really-good-reason"})

(def judgement-minimal
  {:id "http://ex.tld/ctia/judgement/judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
   :type "judgement"
   :schema_version c/ctim-schema-version
   :source "source"
   :observable {:type "ip",
                :value "10.0.0.1"}
   :disposition 1
   :disposition_name "Clean"
   :priority 99
   :confidence "High"
   :severity "Medium"
   :valid_time {}})

(def new-judgement-maximal
  {:id "http://ex.tld/ctia/judgement/judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
   :type "judgement"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["123" "ABC"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :tlp "green"
   :source "source"
   :source_uri "http://example.com/somewhere-else"
   :observable {:type "ip",
                :value "10.0.0.1"}
   :disposition 1
   :disposition_name "Clean"
   :priority 99
   :confidence "High"
   :severity "Medium"
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :reason "reason"
   :reason_uri "http://example.com/a-really-good-reason"})

(def new-judgement-minimal
  {:observable {:type "ip",
                :value "10.0.0.1"}
   :source "source"
   :priority 99
   :confidence "High"
   :severity "Medium"})

(def stored-judgement-maximal
  {:id "http://ex.tld/ctia/judgement/judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
   :type "judgement"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["123" "ABC"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :tlp "green"
   :source "source"
   :source_uri "http://example.com/somewhere-else"
   :observable {:type "ip",
                :value "10.0.0.1"}
   :disposition 1
   :disposition_name "Clean"
   :priority 99
   :confidence "High"
   :severity "Medium"
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :reason "reason"
   :reason_uri "http://example.com/a-really-good-reason"
   :owner "owner"
   :groups ["bar"]
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})

(def stored-judgement-minimal
  {:id "http://ex.tld/ctia/judgement/judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
   :type "judgement"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["123" "ABC"]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :tlp "green"
   :source "source"
   :source_uri "http://example.com/somewhere-else"
   :observable {:type "ip",
                :value "10.0.0.1"}
   :disposition 1
   :disposition_name "Clean"
   :priority 99
   :confidence "High"
   :severity "Medium"
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :reason "reason"
   :reason_uri "http://example.com/a-really-good-reason"
   :owner "owner"
   :groups ["bar"]
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})
