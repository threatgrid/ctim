(ns ctim.examples.sightings
  (:require [ctim.schemas.common :as c]))

(def sighting-maximal
  {:id "sighting-eb965192-9f85-4bc8-baa2-0766f9f63db3"
   :external_ids ["http://ex.tld/ctia/sighting/sighting-123"
                  "http://ex.tld/ctia/sighting/sighting-456"]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                   :end_time #inst "2016-02-11T00:40:48.212-00:00"}
   :description "a sighting"
   :short_description "short desc"
   :tlp "amber"
   :source "source"
   :source_uri "http://example.com"
   :sensor "endpoint.sensor"
   :target {:hostname "Demo_Cta"
            :computer_guid "68e94bf7-e239-4821-90d6-b7eaa0233443"
            :internal_ip "100.213.110.122"
            :external_ip "136.184.130.98"
            :mac_address "85:28:cb:6a:21:41"}
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
                :related {:type "ipv6" :value "bar"}}]})

(def sighting-minimal
  {:id "sighting-eb965192-9f85-4bc8-baa2-0766f9f63db3"
   :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                   :end_time #inst "2016-02-11T00:40:48.212-00:00"}
   :confidence "High"
   :type "sighting"
   :schema_version c/ctim-schema-version
   :count 1})

(def new-sighting-maximal
  {:id "sighting-eb965192-9f85-4bc8-baa2-0766f9f63db3"
   :external_ids ["http://ex.tld/ctia/sighting/sighting-123"
                  "http://ex.tld/ctia/sighting/sighting-456"]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                   :end_time #inst "2016-02-11T00:40:48.212-00:00"}
   :description "a sighting"
   :short_description "short desc"
   :tlp "amber"
   :source "source"
   :source_uri "http://example.com"
   :sensor "endpoint.sensor"
   :target {:hostname "Demo_Cta"
            :computer_guid "68e94bf7-e239-4821-90d6-b7eaa0233443"
            :internal_ip "100.213.110.122"
            :external_ip "136.184.130.98"
            :mac_address "85:28:cb:6a:21:41"}
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
                :related {:type "ipv6" :value "bar"}}]})

(def new-sighting-minimal
  {:observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                   :end_time #inst "2016-02-11T00:40:48.212-00:00"}})

(def stored-sighting-maximal
  {:id "sighting-eb965192-9f85-4bc8-baa2-0766f9f63db3"
   :external_ids ["http://ex.tld/ctia/sighting/sighting-123"
                  "http://ex.tld/ctia/sighting/sighting-456"]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                   :end_time #inst "2016-02-11T00:40:48.212-00:00"}
   :description "a sighting"
   :short_description "short desc"
   :tlp "amber"
   :source "source"
   :source_uri "http://example.com"
   :sensor "endpoint.sensor"
   :target {:hostname "Demo_Cta"
            :computer_guid "68e94bf7-e239-4821-90d6-b7eaa0233443"
            :internal_ip "100.213.110.122"
            :external_ip "136.184.130.98"
            :mac_address "85:28:cb:6a:21:41"}
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
   :modified #inst "2016-02-11T00:40:48.212-00:00"})

(def stored-sighting-minimal
  {:id "sighting-eb965192-9f85-4bc8-baa2-0766f9f63db3"
   :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                   :end_time #inst "2016-02-11T00:40:48.212-00:00"}
   :confidence "High"
   :type "sighting"
   :schema_version c/ctim-schema-version
   :count 1
   :owner "foouser"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"})
