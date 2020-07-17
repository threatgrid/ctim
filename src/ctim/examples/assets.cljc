(ns ctim.examples.assets
  (:require [ctim.schemas.common :as c]))

(def asset-maximal
  {:id                  "http://ex.tld/ctia/asset/asset-61884b14-e273-4930-a5ff-dcce69207724"
   :type                "asset"
   :schema_version      c/ctim-schema-version
   :revision            1
   :external_ids        ["http://ex.tld/ctia/asset/asset-61884b14-e273-4930-a5ff-dcce69207724"]
   :description         "description"
   :short_description   "short description"
   :external_references [{:source_name "source"
                          :external_id "T1061"
                          :url         "https://ex.tld/wiki/T1061"
                          :hashes      ["#section1"]
                          :description "Description text"}]
   :timestamp           #inst "2016-02-11T00:40:48.212-00:00"
   :language            "language"
   :tlp                 "green"
   :source              "source"
   :source_uri          "http://example.com/asset"
   :asset_type          "device"
   :title               "CBROZEFS-DH-123"
   :valid_time          {:start_time #inst "2020-01-11T00:40:48.212-00:00"
                         :end_time   #inst "2525-01-01T00:00:00.000-00:00"}})

(def asset-minimal
  {:id             "http://ex.tld/ctia/asset/asset-61884b14-e273-4930-a5ff-dcce69207724"
   :type           "asset"
   :schema_version c/ctim-schema-version
   :asset_type     "device"
   :source         "a source"
   :valid_time     {}})

(def new-asset-maximal asset-maximal)

(def new-asset-minimal asset-minimal)

;;;;;;;;;;;;;;;;;;
;; AssetMapping ;;
;;;;;;;;;;;;;;;;;;

(def asset-mapping-maximal
  {:id             "https://private.intel.amp.cisco.com/asset_mapping/1",
   :type           "asset_mapping",
   :schema_version c/ctim-schema-version
   :revision       1
   :confidence     "high"
   :specificity    "unique"
   :stability      "managed"
   :valid_time     {:start "2019-10-02T23:25:42Z"}
   :observable     {:type  "cisco:uc:id"
                    :value "6ef3dada-8bfd-484f-a350-5b177ef8e77d"}
   :asset_ref      "https://private.intel.amp.cisco.com/assets/1"
   :source         "cisco:unified_connect"})

(def asset-mapping-minimal {})

(def new-asset-mapping-maximal asset-mapping-maximal)

(def new-asset-mapping-minimal asset-mapping-minimal)
