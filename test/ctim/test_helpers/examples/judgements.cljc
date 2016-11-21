(ns ctim.test-helpers.examples.judgements
  (:require [ctim.schemas.common :as c]))

(def judgement-maximal
  {:id "judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
   :type "judgement"
   :schema_version c/ctim-schema-version
   :uri "http://example.com/ctia/judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
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
   :severity 88
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :reason "reason"
   :reason_uri "http://example.com/a-really-good-reason"
   :indicators [{:indicator_id (str "http://example.com/ctia/indicator/"
                                    "indicator-af42bdcd-482a-4156-9fe0-fdb2bab7286d")
                 :confidence "Low"
                 :source "source 1"
                 :relationship "relationship 1"}
                {:indicator_id (str "http://example.com/ctia/indicator/"
                                    "indicator-f86b4603-3e36-4363-ba85-94a0501ca401")
                 :confidence "High"
                 :source "source 2"
                 :relationship "relationship 2"}]})

(def judgement-minimal
  {:id "judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
   :type "judgement"
   :schema_version c/ctim-schema-version
   :source "source"
   :observable {:type "ip",
                :value "10.0.0.1"}
   :disposition 1
   :disposition_name "Clean"
   :priority 99
   :confidence "High"
   :severity 88
   :valid_time {}})

(def new-judgement-maximal
  {:id "judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
   :type "judgement"
   :schema_version c/ctim-schema-version
   :uri "http://example.com/ctia/judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
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
   :severity 88
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :reason "reason"
   :reason_uri "http://example.com/a-really-good-reason"
   :indicators [{:indicator_id (str "http://example.com/ctia/indicator/"
                                    "indicator-af42bdcd-482a-4156-9fe0-fdb2bab7286d")
                 :confidence "Low"
                 :source "source 1"
                 :relationship "relationship 1"}
                {:indicator_id (str "http://example.com/ctia/indicator/"
                                    "indicator-f86b4603-3e36-4363-ba85-94a0501ca401")
                 :confidence "High"
                 :source "source 2"
                 :relationship "relationship 2"}]})

(def new-judgement-minimal
  {:observable {:type "ip",
                :value "10.0.0.1"}
   :source "source"
   :priority 99
   :confidence "High"
   :severity 88})

(def stored-judgement-maximal
  {:id "judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
   :type "judgement"
   :schema_version c/ctim-schema-version
   :uri "http://example.com/ctia/judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
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
   :severity 88
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :reason "reason"
   :reason_uri "http://example.com/a-really-good-reason"
   :indicators [{:indicator_id (str "http://example.com/ctia/indicator/"
                                    "indicator-af42bdcd-482a-4156-9fe0-fdb2bab7286d")
                 :confidence "Low"
                 :source "source 1"
                 :relationship "relationship 1"}
                {:indicator_id (str "http://example.com/ctia/indicator/"
                                    "indicator-f86b4603-3e36-4363-ba85-94a0501ca401")
                 :confidence "High"
                 :source "source 2"
                 :relationship "relationship 2"}]
   :owner "owner"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})

(def stored-judgement-minimal
  {:id "judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
   :type "judgement"
   :schema_version c/ctim-schema-version
   :uri "http://example.com/ctia/judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
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
   :severity 88
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :reason "reason"
   :reason_uri "http://example.com/a-really-good-reason"
   :indicators [{:indicator_id (str "http://example.com/ctia/indicator/"
                                    "indicator-af42bdcd-482a-4156-9fe0-fdb2bab7286d")
                 :confidence "Low"
                 :source "source 1"
                 :relationship "relationship 1"}
                {:indicator_id (str "http://example.com/ctia/indicator/"
                                    "indicator-f86b4603-3e36-4363-ba85-94a0501ca401")
                 :confidence "High"
                 :source "source 2"
                 :relationship "relationship 2"}]
   :owner "owner"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})
