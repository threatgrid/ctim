(ns ctim.test-helpers.examples.ttps
  (:require [ctim.schemas.common :as c]))

(def ttp-maximal
  {:id "ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
   :external_ids ["http://ex.tld/ctia/ttp/ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
                  "http://ex.tld/ctia/ttp/ttp-345"]
   :type "ttp"
   :title "ttp"
   :tlp "green"
   :schema_version c/ctim-schema-version
   :uri "http://example.com"
   :revision 1
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :ttp_type "foo"
   :description "description"
   :short_description "short desc"
   :source "source"
   :source_uri "http://example.com"
   :indicators [{:indicator_id "https://example.com/ctia/indicator/indicator-dee11640-13ee-421c-aacd-43098d86988d"
                 :confidence "Low"
                 :source "source"
                 :relationship "rel"}
                {:indicator_id "http://example.com/ctia/indicator/indicator-1da44c9a-eddf-4c15-a394-2fd67b105a93"
                 :confidence "Low"
                 :source "source"
                 :relationship "rel"}]
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2016-07-11T00:40:48.212-00:00"}
   :intended_effect ["Advantage"]
   :behavior {:attack_patterns [{:title "foo"
                                 :description "description"
                                 :short_description "short desc"
                                 :capec_id "foo"}]
              :malware_type [{:title "bar"
                              :description "description"
                              :short_description "short desc"
                              :type ["Rootkit"]}]}
   :resources {:tools {:description "desc"
                       :type ["Malware"]
                       :references ["foo" "bar"]
                       :vendor "vendor"
                       :service_pack "sp"}}
   :victim_targeting {:identity {:description "desc"
                                 :related_identities [{:identity "ref-123"
                                                       :confidence "Low"
                                                       :information_source "foo"
                                                       :relationship "rel"}]}
                      :targeted_systems ["Enterprise Systems"]
                      :targeted_information ["Information Assets"]
                      :targeted_observables [{:type "ipv6" :value "foo"}]}
   :exploit_targets [{:exploit_target_id "http://example.com/ctia/exploit-target/exploit-target-21442c38-6238-4b2e-85c5-c99eeaebaae0"
                      :confidence "High"
                      :source "source"
                      :relationship "rel"}]
   :related_TTPs [{:TTP_id "http://example.com/ctia/ttp/ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
                   :confidence "High"
                   :source "source"
                   :relationship "rel"}]
   :kill_chains ["Delivery"]})

(def ttp-minimal
  {:id "ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
   :type "ttp"
   :ttp_type "foo"
   :schema_version c/ctim-schema-version
   :indicators [{:indicator_id "https://example.com/ctia/indicator/indicator-dee11640-13ee-421c-aacd-43098d86988d"
                 :confidence "Low"
                 :source "source"
                 :relationship "rel"}
                {:indicator_id "http://example.com/ctia/indicator/indicator-1da44c9a-eddf-4c15-a394-2fd67b105a93"
                 :confidence "Low"
                 :source "source"
                 :relationship "rel"}]
   :valid_time {}})

(def new-ttp-maximal
  {:id "ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
   :external_ids ["http://ex.tld/ctia/ttp/ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
                  "http://ex.tld/ctia/ttp/ttp-345"]
   :type "ttp"
   :title "ttp"
   :tlp "green"
   :schema_version c/ctim-schema-version
   :uri "http://example.com"
   :revision 1
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :ttp_type "foo"
   :description "description"
   :short_description "short desc"
   :source "source"
   :source_uri "http://example.com"
   :indicators [{:indicator_id "https://example.com/ctia/indicator/indicator-dee11640-13ee-421c-aacd-43098d86988d"
                 :confidence "Low"
                 :source "source"
                 :relationship "rel"}
                {:indicator_id "http://example.com/ctia/indicator/indicator-1da44c9a-eddf-4c15-a394-2fd67b105a93"
                 :confidence "Low"
                 :source "source"
                 :relationship "rel"}]
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2016-07-11T00:40:48.212-00:00"}
   :intended_effect ["Advantage"]
   :behavior {:attack_patterns [{:title "foo"
                                 :description "description"
                                 :short_description "short desc"
                                 :capec_id "foo"}]
              :malware_type [{:title "bar"
                              :description "description"
                              :short_description "short desc"
                              :type ["Rootkit"]}]}
   :resources {:tools {:description "desc"
                       :type ["Malware"]
                       :references ["foo" "bar"]
                       :vendor "vendor"
                       :service_pack "sp"}}
   :victim_targeting {:identity {:description "desc"
                                 :related_identities [{:identity "ref-123"
                                                       :confidence "Low"
                                                       :information_source "foo"
                                                       :relationship "rel"}]}
                      :targeted_systems ["Enterprise Systems"]
                      :targeted_information ["Information Assets"]
                      :targeted_observables [{:type "ipv6" :value "foo"}]}
   :exploit_targets [{:exploit_target_id "http://example.com/ctia/exploit-target/exploit-target-21442c38-6238-4b2e-85c5-c99eeaebaae0"
                      :confidence "High"
                      :source "source"
                      :relationship "rel"}]
   :related_TTPs [{:TTP_id "http://example.com/ctia/ttp/ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
                   :confidence "High"
                   :source "source"
                   :relationship "rel"}]
   :kill_chains ["Delivery"]})

(def new-ttp-minimal
  {:ttp_type "foo"
   :schema_version c/ctim-schema-version
   :indicators [{:indicator_id "https://example.com/ctia/indicator/indicator-dee11640-13ee-421c-aacd-43098d86988d"
                 :confidence "Low"
                 :source "source"
                 :relationship "rel"}
                {:indicator_id "http://example.com/ctia/indicator/indicator-1da44c9a-eddf-4c15-a394-2fd67b105a93"
                 :confidence "Low"
                 :source "source"
                 :relationship "rel"}]})

(def stored-ttp-maximal
  {:id "ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
   :external_ids ["http://ex.tld/ctia/ttp/ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
                  "http://ex.tld/ctia/ttp/ttp-345"]
   :type "ttp"
   :title "ttp"
   :tlp "green"
   :schema_version c/ctim-schema-version
   :uri "http://example.com"
   :revision 1
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :ttp_type "foo"
   :description "description"
   :short_description "short desc"
   :source "source"
   :source_uri "http://example.com"
   :indicators [{:indicator_id "https://example.com/ctia/indicator/indicator-dee11640-13ee-421c-aacd-43098d86988d"
                 :confidence "Low"
                 :source "source"
                 :relationship "rel"}
                {:indicator_id "http://example.com/ctia/indicator/indicator-1da44c9a-eddf-4c15-a394-2fd67b105a93"
                 :confidence "Low"
                 :source "source"
                 :relationship "rel"}]
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2016-07-11T00:40:48.212-00:00"}
   :intended_effect ["Advantage"]
   :behavior {:attack_patterns [{:title "foo"
                                 :description "description"
                                 :short_description "short desc"
                                 :capec_id "foo"}]
              :malware_type [{:title "bar"
                              :description "description"
                              :short_description "short desc"
                              :type ["Rootkit"]}]}
   :resources {:tools {:description "desc"
                       :type ["Malware"]
                       :references ["foo" "bar"]
                       :vendor "vendor"
                       :service_pack "sp"}}
   :victim_targeting {:identity {:description "desc"
                                 :related_identities [{:identity "ref-123"
                                                       :confidence "Low"
                                                       :information_source "foo"
                                                       :relationship "rel"}]}
                      :targeted_systems ["Enterprise Systems"]
                      :targeted_information ["Information Assets"]
                      :targeted_observables [{:type "ipv6" :value "foo"}]}
   :exploit_targets [{:exploit_target_id "http://example.com/ctia/exploit-target/exploit-target-21442c38-6238-4b2e-85c5-c99eeaebaae0"
                      :confidence "High"
                      :source "source"
                      :relationship "rel"}]
   :related_TTPs [{:TTP_id "http://example.com/ctia/ttp/ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
                   :confidence "High"
                   :source "source"
                   :relationship "rel"}]
   :kill_chains ["Delivery"]
   :owner "foouser"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})

(def stored-ttp-minimal
  {:id "ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
   :type "ttp"
   :ttp_type "foo"
   :schema_version c/ctim-schema-version
   :indicators [{:indicator_id "https://example.com/ctia/indicator/indicator-dee11640-13ee-421c-aacd-43098d86988d"
                 :confidence "Low"
                 :source "source"
                 :relationship "rel"}
                {:indicator_id "http://example.com/ctia/indicator/indicator-1da44c9a-eddf-4c15-a394-2fd67b105a93"
                 :confidence "Low"
                 :source "source"
                 :relationship "rel"}]
   :valid_time {}
   :owner "foouser"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})
