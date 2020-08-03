(ns ctim.schemas.asset
  (:require #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq def-enum-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq def-enum-type]])
            [clojure.spec.alpha :as cs]
            [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]))

(def-eq AssetTypeIdentifier "asset")

(def ^:private asset-desc
  "Describes a protected resource. It could be a device, user, network, application or data")

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
   (f/entry :valid_time c/ValidTime)
   (f/entry :asset_type AssetType)))

(def-entity-type NewAsset
  "Schema for submitting new Assets"
  (:entries Asset)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type AssetTypeIdentifier)))

(def AssetRef
  (c/ref-for-type "asset"))
