(ns ctim.schemas.asset-properties
  (:require
   #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq]]
      :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq]])
   [ctim.schemas.asset :as asset]
   [ctim.schemas.common :as c]))

(def ^:private properties-type-identifier "asset-properties")

(def-eq AssetPropertiesTypeIdentifier properties-type-identifier)

(def ^:private properties-desc
  (str "Assets do not have any product specific properties, those are represented in AssetProperties - "
       "which is a record that asserts one or more properties of an Asset for a specific time."))

(def ^:private properties-desc-link "[AssetProperties](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#assetproperties)")

(f/def-map-type AssetProperty
  (concat
   (f/required-entries
    (f/entry :name f/any-str
             :description "The properties are an open vocabulary."
             :comment (str "The properties are an open vocabulary, meaning that there is "
                           "a defined set of values, but users may add their own values."
                           "See: https://github.com/threatgrid/ctim/blob/master/src/ctim/schemas/identity_assertion.cljc#L11"))
    (f/entry :value f/any-str))))

(def-entity-type AssetProperties
  {:description properties-desc
   :reference   properties-desc-link}
  c/base-entity-entries
  c/sourced-object-entries
  (f/required-entries
   (f/entry :type AssetPropertiesTypeIdentifier)
   (f/entry :valid_time c/ValidTime
            :description "The time range during which the AssetProperties is considered valid.")
   (f/entry :asset_ref asset/AssetRef
            :description (str "URI that points to the associated Asset.")))
  (f/optional-entries
   (f/entry :properties [AssetProperty])))

(def-entity-type NewAssetProperties
  "Schema for submitting new AssetProperties"
  (:entries AssetProperties)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type AssetPropertiesTypeIdentifier)))

(def AssetPropertiesRef (c/ref-for-type properties-type-identifier))
