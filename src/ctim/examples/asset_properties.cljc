(ns ctim.examples.asset-properties
  (:require [ctim.schemas.common :as c]))

(def asset-properties-maximal
  {:id                  "http://ex.tld/ctia/asset-properties/asset-properties-97c3dbb5-6deb-4eed-b6d7-b77fa632cc7b"
   :type                "asset-properties"
   :title               "APROP-CBROZEFS-DH-123"
   :description         "Asset Properties"
   :short_description   "Asset Properties"
   :schema_version      c/ctim-schema-version
   :revision            1
   :external_ids        ["http://ex.tld/ctia/asset-properties/asset-properties-97c3dbb5-6deb-4eed-b6d7-b77fa632cc7b"]
   :source              "cisco:unified_connect"
   :source_uri          "http://example.com/asset-properties"
   :external_references [{:source_name "source"
                          :external_id "T1061"
                          :url         "https://ex.tld/wiki/T1061"
                          :hashes      ["#section1"]
                          :description "Description text"}]
   :timestamp           #inst "2016-02-11T00:40:48.212-00:00"
   :language            "language"
   :tlp                 "green"

   :valid_time {:start_time #inst "2020-01-11T00:40:48.212-00:00"
                :end_time   #inst "2525-01-01T00:00:00.000-00:00"}
   :asset_ref  "http://ex.tld/ctia/asset/asset-61884b14-e273-4930-a5ff-dcce69207724"
   :properties [{:name  "cisco:securex:posture:score"
                 :value "23"}]})

(def asset-properties-minimal
  {:id             "http://ex.tld/ctia/asset-properties/asset-properties-97c3dbb5-6deb-4eed-b6d7-b77fa632cc7b"
   :type           "asset-properties"
   :schema_version c/ctim-schema-version
   :source         "cisco:unified_connect"
   :valid_time     {}
   :asset_ref      "http://ex.tld/ctia/asset/asset-61884b14-e273-4930-a5ff-dcce69207724"
   })

(def new-asset-properties-maximal asset-properties-maximal)

(def new-asset-properties-minimal asset-properties-minimal)
