(ns ctim.examples.indicators
  (:require [ctim.schemas.common :as c]))

(def indicator-maximal
  {:id "http://ex.tld/ctia/indicator/indicator-10b490f8-7c1d-4c3b-9be3-52a7fa5c5042"
   :type "indicator"
   :external_ids ["http://ex.tld/ctia/indicator/indicator-10b490f8-7c1d-4c3b-9be3-52a7fa5c5042"
                  "http://ex.tld/ctia/indicator/indicator-345"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
   :title "indicator-title"
   :description "description"
   :short_description "short desc"
   :producer "producer"
   :severity "High"
   :tlp "green"
   :schema_version c/ctim-schema-version
   :source "source"
   :source_uri "http://example.com"
   :revision 1
   :timestamp #inst "2016-05-11T00:40:48.212-00:00"
   :language "language"
   :indicator_type ["C2" "IP Watchlist"]
   :valid_time {:start_time #inst "2016-05-11T00:40:48.212-00:00"
                :end_time #inst "2016-07-11T00:40:48.212-00:00"}
   :negate false
   :tags ["foo" "bar"]
   :likely_impact "end of days"
   :confidence "High"
   :composite_indicator_expression {:operator "or"
                                    :indicator_ids ["http://example.com/ctia/indicator/indicator-6e279a0d-6788-4cdf-957f-4e4b73823d6c"
                                                    "http://example.com/ctia/indicator/indicator-415c97c0-2c00-4ff6-aaa3-2f8a3657c1e7"]}
   :kill_chain_phases [{:kill_chain_name "kcn1"
                        :phase_name "persistence"}
                       {:kill_chain_name "kcn2"
                        :phase_name "persistence"}]
   :test_mechanisms ["spam" "eggs"]
   :specification {:type "Judgement"
                   :judgements ["http://example.com/ctia/judgement/judgement-1000efcc-3474-498d-a655-0e0dc57f84ba"]
                   :required_judgements [{:judgement_id "http://example.com/ctia/judgement/judgement-1000efcc-3474-498d-a655-0e0dc57f84ba"
                                          :source "source"
                                          :relationship "relationship"
                                          :confidence "High"}]}})

(def indicator-minimal
  {:id "http://ex.tld/ctia/indicator/indicator-10b490f8-7c1d-4c3b-9be3-52a7fa5c5042"
   :type "indicator"
   :producer "producer"
   :schema_version c/ctim-schema-version
   :valid_time {}})

(def new-indicator-maximal
  indicator-maximal)

(def new-indicator-minimal
  {:producer "prod"})
