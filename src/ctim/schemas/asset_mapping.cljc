(ns ctim.schemas.asset-mapping
  (:require
   #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq def-enum-type]]
      :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq def-enum-type]])
   [clojure.spec.alpha :as cs]
   [ctim.schemas.common :as c]
   [ctim.schemas.vocabularies :as v]
   [ctim.schemas.asset :as asset]))

(def ^:private mapping-type-identifier "asset-mapping")

(def-eq AssetMappingTypeIdentifier mapping-type-identifier)

(def specificity #{"Unique" "Medium" "Low"})
(def-enum-type Specificity specificity :gen (cs/gen specificity))

(def stability #{"Managed" "Physical" "Temporary"})
(def-enum-type Stability stability :gen (cs/gen stability))

(def ^:private mapping-desc "a record that a specific Observable maps to an Asset for a specific time period.")
(def ^:private mapping-desc-link "[AssetMapping](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#assetmapping)")

(def-entity-type AssetMapping
  {:description mapping-desc
   :reference   mapping-desc-link}
  c/base-entity-entries
  c/sourced-object-entries
  (f/required-entries
   (f/entry :type AssetMappingTypeIdentifier)
   (f/entry :valid_time c/ValidTime
            :description (str "For each asset, we allow for the assertion of time bound properties."
                              "This gives us both a record of the current state of the asset,"
                              "as well as history."))
   (f/entry :confidence v/HighMedLow
            :description "Is it susceptible to manipulation or translation.")
   (f/entry :specificity Specificity
            :description (str "Denotes the level of how many assets "
                              "potentially could have this same identifier."))
   (f/entry :stability Stability
            :description (str "Do we manage when it changes, "
                              "or it always a time bound assignment?"))
   (f/entry :observable c/Observable
            :description (str "An AssetMapping is a record that a specific Observable "
                              "maps to an Asset for an indicated period of time."))
   (f/entry :asset_ref asset/AssetRef
            :description (str "URI that points to the mapped Asset."))
   (f/entry :asset_type asset/AssetType
            :description (str "Type of the mapped Asset: "
                              "Device, Person, Application, etc."))))

(def-entity-type NewAssetMapping
  "Schema for submitting new AssetMapping"
  (:entries AssetMapping)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type AssetMappingTypeIdentifier)))

(def AssetMappingRef (c/ref-for-type mapping-type-identifier))
