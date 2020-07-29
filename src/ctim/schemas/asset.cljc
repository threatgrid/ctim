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

;;;;;;;;;;;;;;;;;;;;;;
;; Asset Properties ;;
;;;;;;;;;;;;;;;;;;;;;;

(def ^:private properties-type-identifier "asset-properties")

(def-eq AssetPropertiesTypeIdentifier properties-type-identifier)

(def ^:private properties-desc "Assets do not have any product specific properties, those are represented in AssetProperties")

(def ^:private properties-desc-link "[AssetProperties](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#assetproperties)")

(def-entity-type AssetProperties
  {:description properties-desc
   :reference   properties-desc-link}
  c/base-entity-entries
  c/sourced-object-entries
  (f/required-entries
   (f/entry :type AssetPropertiesTypeIdentifier)
   (f/entry :valid_time c/ValidTime)
   (f/entry :asset_ref AssetRef)))

(def-entity-type NewAssetProperties
  "Schema for submitting new AssetProperties"
  (:entries AssetProperties)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type AssetPropertiesTypeIdentifier)))

(def AssetPropertiesRef (c/ref-for-type properties-type-identifier))
