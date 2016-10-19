(ns ctim.schemas.coa-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.coa :as coa]
            [ctim.schemas.common :as c]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-coa-openc2-variants
  (testing "openc2 deny using acl"
    (is (s/validate
         (fs/->schema coa/COA)
         {:id "test_coa_2"
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
                                   :location "perimeter"}}})))

  (testing "openc2 contain using vlan"
    (is (s/validate
         (fs/->schema coa/COA)
         {:id "test_coa_3"
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
                                   :option "vlan=1002"}}}))))

(deftest coa-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema coa/COA)
         {:id "coa-123"
          :type "coa"
          :schema_version c/ctim-schema-version
          :uri "http://example.com/"
          :revision 1
          :external_ids ["http://ex.tld/ctia/coa/coa-123"
                         "http://ex.tld/ctia/coa/coa-456"]
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
          :related_COAs [{:COA_id "coa-123"
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
                                    :location "perimeter"}}})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema coa/COA)
         {:id "coa-123"
          :type "coa"
          :schema_version c/ctim-schema-version
          :valid_time {}}))))

(deftest new-coa-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema coa/NewCOA)
         {:id "coa-123"
          :type "coa"
          :schema_version c/ctim-schema-version
          :uri "http://example.com/"
          :revision 1
          :external_ids ["http://ex.tld/ctia/coa/coa-123"
                         "http://ex.tld/ctia/coa/coa-456"]
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
          :related_COAs [{:COA_id "coa-123"
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
                                    :location "perimeter"}}})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema coa/NewCOA)
         {:schema_version c/ctim-schema-version}))))

(deftest stored-coa-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema coa/StoredCOA)
         {:id "coa-123"
          :type "coa"
          :schema_version c/ctim-schema-version
          :uri "http://example.com/"
          :revision 1
          :external_ids ["http://ex.tld/ctia/coa/coa-123"
                         "http://ex.tld/ctia/coa/coa-456"]
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
          :related_COAs [{:COA_id "coa-123"
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
                                    :location "perimeter"}}
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema coa/StoredCOA)
         {:id "coa-123"
          :type "coa"
          :schema_version c/ctim-schema-version
          :valid_time {}
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"}))))
