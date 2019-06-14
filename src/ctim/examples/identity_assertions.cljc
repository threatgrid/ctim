(ns ctim.examples.identity-assertions
  (:require [ctim.schemas.common :as c]))

(def identity-assertion-maximal
  {:id "http://ex.tld/ctia/identity-assertion/identity-assertion-eb965192-9f85-4bc8-baa2-0766f9f63db3"
   :type "identity-assertion"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["http://ex.tld/ctia/identity-assertion/identity-assertion-5023697b-3857-4652-9b53-ccda297f9c3e"
                  "http://ex.tld/ctia/identity-assertion/identity-assertion-82f9b9b3-0aa4-4676-8254-02deef8aa8ef"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :tlp "green"
   :source "source"
   :source_uri "http://example.com"
   :identity {:type "endpoint"
              :os "Windows 95"
              :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                              :end_time #inst "2016-02-11T00:40:48.212-00:00"}
              :observables [{:type "hostname" :value "Demo_Cta"}
                            {:type "amp_computer_guid" :value "68e94bf7-e239-4821-90d6-b7eaa0233443"}
                            {:type "ip" :value "100.213.110.122"}
                            {:type "ip" :value "136.184.130.98"}
                            {:type "mac_address" :value "85:28:cb:6a:21:41"}]}
   :assertions [{:name "cisco:ctr:group" :value "employees, executives"}
                {:name "tag" :value "foo"}]
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}})

(def identity-assertion-minimal
  {:id "http://ex.tld/ctia/identity-assertion/identity-assertion-eb965192-9f85-4bc8-baa2-0766f9f63db3"
   :type "identity-assertion"
   :schema_version c/ctim-schema-version
   :identity {:type "endpoint"
              :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                              :end_time #inst "2016-02-11T00:40:48.212-00:00"}
              :observables [{:type "ip" :value "100.213.110.122"}]}

   :assertions [{:name "cisco:ctr:group"
                 :value "contractors"}]})

(def new-identity-assertion-maximal
  identity-assertion-maximal)

(def new-identity-assertion-minimal
  identity-assertion-minimal)
