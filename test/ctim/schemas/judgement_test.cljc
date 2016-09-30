(ns ctim.schemas.judgement-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.common :as c]
            [ctim.schemas.judgement :as j]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest judgement-schema-test
  (testing "example with all possible fields"
    (is (s/validate
         (j/get-schema)
         {:id "judgement-123"
          :type "judgement"
          :schema_version c/ctim-schema-version
          :uri "http://example.com/ctia/judgement-123"
          :revision 1
          :external_ids ["123" "ABC"]
          :timestamp #inst "2016-02-11T00:40:48.212-00:00"
          :language "language"
          :tlp "green"
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
          :indicators [{:indicator_id "http://example.com/ctia/indicator/indicator-123"
                        :confidence "Low"
                        :source "source 1"
                        :relationship "relationship 1"}
                       {:indicator_id "http://example.com/ctia/indicator/indicator-234"
                        :confidence "High"
                        :source "source 2"
                        :relationship "relationship 2"}]})))

  (testing "example with only required fields"
    (is (s/validate
         (j/get-schema)
         {:id "judgement-123"
          :type "judgement"
          :schema_version c/ctim-schema-version
          :observable {:type "ip",
                       :value "10.0.0.1"}
          :disposition 1
          :disposition_name "Clean"
          :priority 99
          :confidence "High"
          :severity 88
          :valid_time {}}))))
