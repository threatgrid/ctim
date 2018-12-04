(ns ctim.examples.coas
  (:require [ctim.schemas.common :as c]))

(def coa-openc2-variant1
  {:id "http://ex.tld/ctia/coa/coa-40c6ab14-5bda-4f79-b756-e24c9dc8c52c"
   :type "coa"
   :schema_version c/ctim-schema-version
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :structured_coa_type "openc2"
   :open_c2_coa{:type "structured_coa"
                :id "openc2_coa_1"
                :action {:type "deny"}
                :target {:type "cybox:Network_Connection"
                         :specifiers "10.10.1.0"}
                :actuator {:type "network"
                           :specifiers ["router"]}
                :modifiers {:method ["acl"]
                            :location "perimeter"}}})

(def coa-openc2-variant2
  {:id "http://ex.tld/ctia/coa/coa-cb117f67-4d17-4d6c-a220-16e04f9b712a"
   :type "coa"
   :schema_version c/ctim-schema-version
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :structured_coa_type "openc2"
   :open_c2_coa{:type "structured_coa"
                :id "openc2_coa_2"
                :action {:type "contain"}
                :target {:type "cybox:Network_Connection"
                         :specifiers "10.10.1.0"}
                :actuator {:type "network"
                           :specifiers ["router"]}
                :modifiers {:method ["segmentation"]
                            :location "internal"
                            :option "vlan=1002"}}})

(def coa-maximal
  {:id "http://ex.tld/ctia/coa/coa-599c96cb-9e88-4d19-a3ee-a94802a39660"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["http://ex.tld/ctia/coa/coa-599c96cb-9e88-4d19-a3ee-a94802a39660"
                  "http://ex.tld/ctia/coa/coa-456"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
   :timestamp #inst "2016-10-01T00:00:00.000-00:00"
   :language "language"
   :title "coa"
   :description "description"
   :short_description "short description"
   :tlp "green"
   :source "source"
   :source_uri "http://example.com/"
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :stage "Remedy"
   :coa_type "Eradication"
   :impact "yoooge"
   :cost "High"
   :efficacy "Low"
   :objective ["foo" "bar"]
   :related_COAs [{:COA_id "http://example.com/ctia/coa/coa-599c96cb-9e88-4d19-a3ee-a94802a39660"
                   :confidence "Low"
                   :source "source"
                   :relationship "rel"}]
   :structured_coa_type "openc2"
   :open_c2_coa {:type "structured_coa"
                 :id "openc2_coa_1"
                 :action {:type "deny"}
                 :target {:type "cybox:Network_Connection"
                          :specifiers "10.10.1.0"}
                 :actuator {:type "network"
                            :specifiers ["router"]}
                 :modifiers {:method ["acl"]
                             :location "perimeter"
                             :option "vlan=1002"
                             :response "acknowledge"
                             :additional_properties {:context "context"}
                             :time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                                    :end_time #inst "2016-02-11T00:40:48.212-00:00"}
                             :frequency "frequency"
                             :duration #inst "2016-02-11T00:40:48.212-00:00"
                             :source "source"
                             :search "patch"
                             :id "modifier id"
                             :delay #inst "2016-02-11T00:40:48.212-00:00"
                             :destination "set-to"}}})

(def coa-minimal
  {:id "http://ex.tld/ctia/coa/coa-599c96cb-9e88-4d19-a3ee-a94802a39660"
   :type "coa"
   :schema_version c/ctim-schema-version
   :valid_time {}})

(def new-coa-maximal
  coa-maximal)

(def new-coa-minimal
  {:schema_version c/ctim-schema-version})
