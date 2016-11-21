(ns ctim.schemas.sighting-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.sighting :as si]
            [ctim.schemas.common :as c]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-sighting-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema si/Sighting)
         {:id "sighting-123"
          :external_ids ["http://ex.tld/ctia/sighting/sighting-123"
                         "http://ex.tld/ctia/sighting/sighting-345"]
          :timestamp #inst "2016-02-11T00:40:48.212-00:00"
          :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                          :end_time #inst "2016-02-11T00:40:48.212-00:00"}
          :description "a sighting"
          :short_description "short desc"
          :tlp "amber"
          :source "source"
          :source_uri "http://example.com"
          :sensor "endpoint.sensor"
          :confidence "High"
          :type "sighting"
          :schema_version c/ctim-schema-version
          :count 1
          :revision 1
          :language "language"
          :title "title"
          :observables [{:type "ipv6" :value "blah"}]
          :relations [{:origin "origin"
                       :origin_uri "http://example.com"
                       :relation "Used_By"
                       :relation_info {:foo "bar"}
                       :source {:type "ipv6" :value "foo"}
                       :related {:type "ipv6" :value "bar"}}]})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema si/Sighting)
         {:id "sighting-123"
          :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                          :end_time #inst "2016-02-11T00:40:48.212-00:00"}
          :confidence "High"
          :type "sighting"
          :schema_version c/ctim-schema-version
          :count 1}))))

(deftest test-new-sighting-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema si/NewSighting)
         {:id "sighting-123"
          :external_ids ["http://ex.tld/ctia/sighting/sighting-123"
                         "http://ex.tld/ctia/sighting/sighting-345"]
          :timestamp #inst "2016-02-11T00:40:48.212-00:00"
          :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                          :end_time #inst "2016-02-11T00:40:48.212-00:00"}
          :description "a sighting"
          :short_description "short desc"
          :tlp "amber"
          :source "source"
          :source_uri "http://example.com"
          :sensor "endpoint.sensor"
          :confidence "High"
          :type "sighting"
          :schema_version c/ctim-schema-version
          :count 1
          :revision 1
          :language "language"
          :title "title"
          :observables [{:type "ipv6" :value "blah"}]
          :relations [{:origin "origin"
                       :origin_uri "http://example.com"
                       :relation "Used_By"
                       :relation_info {:foo "bar"}
                       :source {:type "ipv6" :value "foo"}
                       :related {:type "ipv6" :value "bar"}}]})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema si/NewSighting)
         {:observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                          :end_time #inst "2016-02-11T00:40:48.212-00:00"}}))))

(deftest test-stored-sighting-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema si/StoredSighting)
         {:id "sighting-123"
          :external_ids ["http://ex.tld/ctia/sighting/sighting-123"
                         "http://ex.tld/ctia/sighting/sighting-345"]
          :timestamp #inst "2016-02-11T00:40:48.212-00:00"
          :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                          :end_time #inst "2016-02-11T00:40:48.212-00:00"}
          :description "a sighting"
          :short_description "short desc"
          :tlp "amber"
          :source "source"
          :source_uri "http://example.com"
          :sensor "endpoint.sensor"
          :confidence "High"
          :type "sighting"
          :schema_version c/ctim-schema-version
          :count 1
          :revision 1
          :language "language"
          :title "title"
          :observables [{:type "ipv6" :value "blah"}]
          :relations [{:origin "origin"
                       :origin_uri "http://example.com"
                       :relation "Used_By"
                       :relation_info {:foo "bar"}
                       :source {:type "ipv6" :value "foo"}
                       :related {:type "ipv6" :value "bar"}}]
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema si/StoredSighting)
         {:id "sighting-123"
          :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                          :end_time #inst "2016-02-11T00:40:48.212-00:00"}
          :confidence "High"
          :type "sighting"
          :schema_version c/ctim-schema-version
          :count 1
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"}))))
