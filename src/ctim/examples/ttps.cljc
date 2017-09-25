(ns ctim.examples.ttps
  (:require [ctim.schemas.common :as c]))

(def ttp-maximal
  {:id "ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
   :external_ids ["http://ex.tld/ctia/ttp/ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
                  "http://ex.tld/ctia/ttp/ttp-345"]
   :type "ttp"
   :title "ttp"
   :tlp "green"
   :schema_version c/ctim-schema-version
   :revision 1
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :ttp_type "foo"
   :description "description"
   :short_description "short desc"
   :source "source"
   :source_uri "http://example.com"
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
                       :service_pack "sp"}
               :infrastructure {:title "title"
                                :description "description"
                                :short_description "short desc"
                                :type "Anonymization"}
               :personas {:description "description"
                          :related_identities [{:identity "ref-123"
                                                :confidence "Low"
                                                :information_source "foo"
                                                :relationship "rel"}]}}
   :victim_targeting {:identity {:description "desc"
                                 :related_identities [{:identity "ref-123"
                                                       :confidence "Low"
                                                       :information_source "foo"
                                                       :relationship "rel"}]}
                      :targeted_systems ["Enterprise Systems"]
                      :targeted_information ["Information Assets"]
                      :targeted_observables [{:type "ipv6" :value "foo"}]}
   :kill_chains ["Delivery"]})

(def ttp-minimal
  {:id "ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
   :type "ttp"
   :ttp_type "foo"
   :schema_version c/ctim-schema-version
   :valid_time {}})

(def new-ttp-maximal
  {:id "ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
   :external_ids ["http://ex.tld/ctia/ttp/ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
                  "http://ex.tld/ctia/ttp/ttp-345"]
   :type "ttp"
   :title "ttp"
   :tlp "green"
   :schema_version c/ctim-schema-version
   :revision 1
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :ttp_type "foo"
   :description "description"
   :short_description "short desc"
   :source "source"
   :source_uri "http://example.com"
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
                       :service_pack "sp"}
               :infrastructure {:title "title"
                                :description "description"
                                :short_description "short desc"
                                :type "Anonymization"}
               :personas {:description "description"
                          :related_identities [{:identity "ref-123"
                                                :confidence "Low"
                                                :information_source "foo"
                                                :relationship "rel"}]}}
   :victim_targeting {:identity {:description "desc"
                                 :related_identities [{:identity "ref-123"
                                                       :confidence "Low"
                                                       :information_source "foo"
                                                       :relationship "rel"}]}
                      :targeted_systems ["Enterprise Systems"]
                      :targeted_information ["Information Assets"]
                      :targeted_observables [{:type "ipv6" :value "foo"}]}
   :kill_chains ["Delivery"]})

(def new-ttp-minimal
  {:ttp_type "foo"
   :schema_version c/ctim-schema-version})

(def stored-ttp-maximal
  {:id "ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
   :external_ids ["http://ex.tld/ctia/ttp/ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
                  "http://ex.tld/ctia/ttp/ttp-345"]
   :type "ttp"
   :title "ttp"
   :tlp "green"
   :schema_version c/ctim-schema-version
   :revision 1
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :ttp_type "foo"
   :description "description"
   :short_description "short desc"
   :source "source"
   :source_uri "http://example.com"
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
                       :service_pack "sp"}
               :infrastructure {:title "title"
                                :description "description"
                                :short_description "short desc"
                                :type "Anonymization"}
               :personas {:description "description"
                          :related_identities [{:identity "ref-123"
                                                :confidence "Low"
                                                :information_source "foo"
                                                :relationship "rel"}]}}
   :victim_targeting {:identity {:description "desc"
                                 :related_identities [{:identity "ref-123"
                                                       :confidence "Low"
                                                       :information_source "foo"
                                                       :relationship "rel"}]}
                      :targeted_systems ["Enterprise Systems"]
                      :targeted_information ["Information Assets"]
                      :targeted_observables [{:type "ipv6" :value "foo"}]}
   :kill_chains ["Delivery"]
   :owner "foouser"
   :groups ["bar"]
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})

(def stored-ttp-minimal
  {:id "ttp-78b9b012-3dee-4844-ae4f-ee2744c389d1"
   :type "ttp"
   :ttp_type "foo"
   :schema_version c/ctim-schema-version
   :valid_time {}
   :owner "foouser"
   :groups ["bar"]
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})
