(ns ctim.schemas.asset-properties
  (:require #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq]])
            [ctim.schemas.asset :as asset]
            [ctim.schemas.common :as c]))

(def ^:private properties-type-identifier "asset-properties")

(def-eq AssetPropertiesTypeIdentifier properties-type-identifier)

(def ^:private properties-desc "Assets do not have any product specific properties, those are represented in AssetProperties")

(def ^:private properties-desc-link "[AssetProperties](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#assetproperties)")

(f/def-map-type AssetProperty
  (concat
   (f/required-entries
    (f/entry :name f/any-str)
    (f/entry :value f/any-str))))

(def-entity-type AssetProperties
  {:description properties-desc
   :reference   properties-desc-link}
  c/base-entity-entries
  c/sourced-object-entries
  c/describable-entity-entries
  (f/required-entries
   (f/entry :type AssetPropertiesTypeIdentifier)
   (f/entry :valid_time c/ValidTime)
   (f/entry :asset_ref asset/AssetRef))
  (f/optional-entries
   (f/entry :properties [AssetProperty])))

(def-entity-type NewAssetProperties
  "Schema for submitting new AssetProperties"
  (:entries AssetProperties)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type AssetPropertiesTypeIdentifier)))

(def AssetPropertiesRef (c/ref-for-type properties-type-identifier))
