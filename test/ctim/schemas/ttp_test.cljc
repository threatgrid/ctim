(ns ctim.schemas.ttp-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.ttp :as t]
            [ctim.schemas.common :as c]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-ttp-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema-tree t/TTP)
         {:id "ttp-123"
          :external_ids ["http://ex.tld/ctia/ttp/ttp-123"
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
          :indicators [{:indicator_id "indicator-1"
                        :confidence "Low"
                        :source "source"
                        :relationship "rel"}
                       {:indicator_id "indicator-2"
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
          :exploit_targets [{:exploit_target_id "exploit-target-123"
                             :confidence "High"
                             :source "source"
                             :relationship "rel"}]
          :related_TTPs [{:ttp_id "ttp-123"
                          :confidence "High"
                          :source "source"
                          :relationship "rel"}]
          :kill_chains ["Delivery"]})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema-tree t/TTP)
         {:id "ttp-123"
          :type "ttp"
          :ttp_type "foo"
          :schema_version c/ctim-schema-version
          :indicators [{:indicator_id "indicator-1"
                        :confidence "Low"
                        :source "source"
                        :relationship "rel"}
                       {:indicator_id "indicator-2"
                        :confidence "Low"
                        :source "source"
                        :relationship "rel"}]
          :valid_time {}}))))

(deftest test-new-ttp-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema-tree t/NewTTP)
         {:id "ttp-123"
          :external_ids ["http://ex.tld/ctia/ttp/ttp-123"
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
          :indicators [{:indicator_id "indicator-1"
                        :confidence "Low"
                        :source "source"
                        :relationship "rel"}
                       {:indicator_id "indicator-2"
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
          :exploit_targets [{:exploit_target_id "exploit-target-123"
                             :confidence "High"
                             :source "source"
                             :relationship "rel"}]
          :related_TTPs [{:ttp_id "ttp-123"
                          :confidence "High"
                          :source "source"
                          :relationship "rel"}]
          :kill_chains ["Delivery"]})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema-tree t/NewTTP)
         {:ttp_type "foo"
          :schema_version c/ctim-schema-version
          :indicators [{:indicator_id "indicator-1"
                        :confidence "Low"
                        :source "source"
                        :relationship "rel"}
                       {:indicator_id "indicator-2"
                        :confidence "Low"
                        :source "source"
                        :relationship "rel"}]}))))

(deftest test-stored-ttp-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema-tree t/StoredTTP)
         {:id "ttp-123"
          :external_ids ["http://ex.tld/ctia/ttp/ttp-123"
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
          :indicators [{:indicator_id "indicator-1"
                        :confidence "Low"
                        :source "source"
                        :relationship "rel"}
                       {:indicator_id "indicator-2"
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
          :exploit_targets [{:exploit_target_id "exploit-target-123"
                             :confidence "High"
                             :source "source"
                             :relationship "rel"}]
          :related_TTPs [{:ttp_id "ttp-123"
                          :confidence "High"
                          :source "source"
                          :relationship "rel"}]
          :kill_chains ["Delivery"]
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema-tree t/StoredTTP)
         {:id "ttp-123"
          :type "ttp"
          :ttp_type "foo"
          :schema_version c/ctim-schema-version
          :indicators [{:indicator_id "indicator-1"
                        :confidence "Low"
                        :source "source"
                        :relationship "rel"}
                       {:indicator_id "indicator-2"
                        :confidence "Low"
                        :source "source"
                        :relationship "rel"}]
          :valid_time {}
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"}))))
