(ns ctim.schemas.coa-test
  (:require
    [schema.core :as s]
    [clojure.test :refer :all]
    [ctim.schemas.coa :as coa]
    [ctim.schemas.common :as c]))


(deftest testfoo
  (is (s/validate
        coa/ActionType
        {:type "deny"}))

  (is (s/validate
        coa/ActionType
        {:type "allow"}))

  (is (s/validate
        coa/ActuatorType
        {:type "network"}))

  (testing "minimal coa"
  (is (s/validate
        coa/COA
        {:id "test_coa_1"
         :type "coa"
         :schema_version c/ctim-schema-version
         :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                         :end_time #inst "2525-01-01T00:00:00.000-00:00"}
         })))

  (testing "openc2 deny using acl"
  (is (s/validate
        coa/COA
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
        coa/COA
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
                                    :option "vlan=1002"}}})))

  )
