(ns ctim.schemas.asset
  (:require
   #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq def-enum-type]]
      :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq def-enum-type]])
   [clojure.spec.alpha :as cs]
   [ctim.schemas.common :as c]))

(def-eq AssetTypeIdentifier "asset")

(def ^:private asset-desc
  "Describes a protected resource. It could be a Device, User, Network, Application or Data.")

(def asset-types
  #{"device"
    "person"
    "network"
    "data"
    "application"})

(def-enum-type AssetType asset-types
  :gen (cs/gen asset-types))

(def ^:private asset-desc-link "[Assets](https://github.com/threatgrid/response/blob/master/features/assets/assets.org)")

(def-entity-type Asset
  {:description asset-desc
   :reference asset-desc-link}
  c/base-entity-entries
  c/sourced-object-entries
  c/describable-entity-entries
  (f/required-entries
   (f/entry :type AssetTypeIdentifier)
   (f/entry :valid_time c/ValidTime
            :description (str "Specifies the time range during which the asset is considered valid or "
                              "accurate.\n"
                              "For example, if an asset entity represents a device, the `valid_time` field "
                              "could be used to indicate the period during which the device's configuration "
                              "information is deemed accurate."))
   (f/entry :asset_type AssetType
            :description (str "Type of the Asset: "
                              "Device, Person, Application, etc."))))

(def-entity-type NewAsset
  "Schema for submitting new Assets"
  (:entries Asset)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type AssetTypeIdentifier)))

(def AssetRef c/Reference)
