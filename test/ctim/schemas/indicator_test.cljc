(ns ctim.schemas.indicator-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.indicator :as i]
            [ctim.schemas.common :as c]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-indicator-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema-tree i/Indicator)
         {:id "indicator-123"
          :type "indicator"
          :external_ids ["http://ex.tld/ctia/indicator/indicator-123"
                         "http://ex.tld/ctia/indicator/indicator-345"]
          :title "indicator-title"
          :description "description"
          :short_description "short desc"
          :producer "producer"
          :tlp "green"
          :schema_version c/ctim-schema-version
          :uri "http://example.com"
          :source "source"
          :source_uri "http://example.com"
          :revision 1
          :timestamp #inst "2016-05-11T00:40:48.212-00:00"
          :language "language"
          :indicator_type ["C2" "IP Watchlist"]
          :valid_time {:start_time #inst "2016-05-11T00:40:48.212-00:00"
                       :end_time #inst "2016-07-11T00:40:48.212-00:00"}
          :alternate_ids ["foo" "bar"]
          :negate false
          :tags ["foo" "bar"]
          :judgements [{:judgement_id "judgement-123"
                        :confidence "High"
                        :source "source"
                        :relationship "rel"}]
          :likely_impact "end of days"
          :suggested_COAs [{:confidence "High"
                            :source "source"
                            :relationship "relationship"
                            :COA_id "coa-123"}]
          :confidence "High"
          :related_indicators [{:indicator_id "indicator-123"
                                :source "source"
                                :relationship "relationship"
                                :confidence "Low"}]
          :related_campaigns [{:confidence "High"
                               :source "source"
                               :relationship "relationship"
                               :campaign_id "campaign-123"}]
          :composite_indicator_expression {:operator "and"
                                           :indicator_ids ["test1" "test2"]}
          :related_COAs [{:confidence "High"
                          :source "source"
                          :relationship "relationship"
                          :COA_id "coa-123"}]
          :kill_chain_phases ["foo" "bar"]
          :test_mechanisms ["spam" "eggs"]
          :specification {:type "Judgment"
                          :judgements ["judgement-123"]
                          :required_judgements [{:judgement_id "judgement-123"
                                                 :source "source"
                                                 :relationship "relationship"
                                                 :confidence "High"}]}})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema-tree i/Indicator)
         {:id "indicator-123"
          :type "indicator"
          :producer "producer"
          :schema_version c/ctim-schema-version
          :valid_time {}}))))

(deftest test-new-indicator-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema-tree i/NewIndicator)
         {:id "indicator-123"
          :type "indicator"
          :external_ids ["http://ex.tld/ctia/indicator/indicator-123"
                         "http://ex.tld/ctia/indicator/indicator-345"]
          :title "indicator-title"
          :description "description"
          :short_description "short desc"
          :producer "producer"
          :tlp "green"
          :schema_version c/ctim-schema-version
          :uri "http://example.com"
          :source "source"
          :source_uri "http://example.com"
          :revision 1
          :timestamp #inst "2016-05-11T00:40:48.212-00:00"
          :language "language"
          :indicator_type ["C2" "IP Watchlist"]
          :valid_time {:start_time #inst "2016-05-11T00:40:48.212-00:00"
                       :end_time #inst "2016-07-11T00:40:48.212-00:00"}
          :alternate_ids ["foo" "bar"]
          :negate false
          :tags ["foo" "bar"]
          :judgements [{:judgement_id "judgement-123"
                        :confidence "High"
                        :source "source"
                        :relationship "rel"}]
          :likely_impact "end of days"
          :suggested_COAs [{:confidence "High"
                            :source "source"
                            :relationship "relationship"
                            :COA_id "coa-123"}]
          :confidence "High"
          :related_indicators [{:indicator_id "indicator-123"
                                :source "source"
                                :relationship "relationship"
                                :confidence "Low"}]
          :related_campaigns [{:confidence "High"
                               :source "source"
                               :relationship "relationship"
                               :campaign_id "campaign-123"}]
          :composite_indicator_expression {:operator "and"
                                           :indicator_ids ["test1" "test2"]}
          :related_COAs [{:confidence "High"
                          :source "source"
                          :relationship "relationship"
                          :COA_id "coa-123"}]
          :kill_chain_phases ["foo" "bar"]
          :test_mechanisms ["spam" "eggs"]
          :specification {:type "Judgment"
                          :judgements ["judgement-123"]
                          :required_judgements [{:judgement_id "judgement-123"
                                                 :source "source"
                                                 :relationship "relationship"
                                                 :confidence "High"}]}})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema-tree i/NewIndicator)
         {:producer "prod"}))))

(deftest test-stored-indicator-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema-tree i/StoredIndicator)
         {:id "indicator-123"
          :type "indicator"
          :external_ids ["http://ex.tld/ctia/indicator/indicator-123"
                         "http://ex.tld/ctia/indicator/indicator-345"]
          :title "indicator-title"
          :description "description"
          :short_description "short desc"
          :producer "producer"
          :tlp "green"
          :schema_version c/ctim-schema-version
          :uri "http://example.com"
          :source "source"
          :source_uri "http://example.com"
          :revision 1
          :timestamp #inst "2016-05-11T00:40:48.212-00:00"
          :language "language"
          :indicator_type ["C2" "IP Watchlist"]
          :valid_time {:start_time #inst "2016-05-11T00:40:48.212-00:00"
                       :end_time #inst "2016-07-11T00:40:48.212-00:00"}
          :alternate_ids ["foo" "bar"]
          :negate false
          :tags ["foo" "bar"]
          :judgements [{:judgement_id "judgement-123"
                        :confidence "High"
                        :source "source"
                        :relationship "rel"}]
          :likely_impact "end of days"
          :suggested_COAs [{:confidence "High"
                            :source "source"
                            :relationship "relationship"
                            :COA_id "coa-123"}]
          :confidence "High"
          :related_indicators [{:indicator_id "indicator-123"
                                :source "source"
                                :relationship "relationship"
                                :confidence "Low"}]
          :related_campaigns [{:confidence "High"
                               :source "source"
                               :relationship "relationship"
                               :campaign_id "campaign-123"}]
          :composite_indicator_expression {:operator "and"
                                           :indicator_ids ["test1" "test2"]}
          :related_COAs [{:confidence "High"
                          :source "source"
                          :relationship "relationship"
                          :COA_id "coa-123"}]
          :kill_chain_phases ["foo" "bar"]
          :test_mechanisms ["spam" "eggs"]
          :specification {:type "Judgment"
                          :judgements ["judgement-123"]
                          :required_judgements [{:judgement_id "judgement-123"
                                                 :source "source"
                                                 :relationship "relationship"
                                                 :confidence "High"}]}
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema-tree i/StoredIndicator)
         {:id "indicator-123"
          :type "indicator"
          :producer "producer"
          :schema_version c/ctim-schema-version
          :valid_time {}
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"}))))
