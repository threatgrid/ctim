(ns ctim.examples.target-records
  (:require [ctim.schemas.common :as c]))

(def target-record-maximal
  {:id                  "http://ex.tld/ctia/target-record/target-record-7d3e0f0c-6ee7-4578-8e1a-f45a750bb37b"
   :type                "target-record"
   :schema_version      c/ctim-schema-version
   :revision            1
   :external_ids        ["http://ex.tld/ctia/target-record/target-record-7d3e0f0c-6ee7-4578-8e1a-f45a750bb37b"]
   :source              "cisco:ise:dhcp-server"
   :source_uri          "http://example.com/target-record"
   :external_references [{:source_name "source"
                          :external_id "TR042"
                          :url         "https://ex.tld/wiki/TR042"
                          :hashes      ["#section1"]
                          :description "Description text"}]
   :timestamp           #inst "2020-08-07T00:40:48.212-00:00"
   :language            "language"
   :tlp                 "green"
   :target              [{:type          "endpoint"
                          :observables   [{:value "atl.ciscothreatresponse.local"
                                           :type  "hostname"},
                                          {:value "192.168.1.204"
                                           :type  "ip"},
                                          {:value "00:50:56:b8:0c:c8"
                                           :type  "mac_address"}]
                          :os            "centos linux release 7.5"
                          :internal      true
                          :source_uri    "https://console.amp.cisco.com/computers/5229eaaa-a3f1-4a05-b961-65c8b9a28e96/trajectory?q=192.168.243.112"
                          :observed_time {:start_time #inst "2020-01-11T00:40:48.212-00:00"
                                          :end_time   #inst "2525-01-01T00:00:00.000-00:00"}
                          :sensor        "process.dhcp-server"}]})

(def target-record-minimal
  {:id             "http://ex.tld/ctia/target-record/target-record-7d3e0f0c-6ee7-4578-8e1a-f45a750bb37b"
   :type           "target-record"
   :schema_version c/ctim-schema-version
   :source         "cisco:ise:dhcp-server"
   :target         []
   })

(def new-target-record-maximal target-record-maximal)

(def new-target-record-minimal target-record-minimal)
