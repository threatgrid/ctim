(ns ctim.schemas.asset-mapping
  (:require #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq def-enum-type]]
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
   (f/entry :valid_time c/ValidTime)
   (f/entry :confidence v/HighMedLow)
   (f/entry :specificity Specificity)
   (f/entry :stability Stability)
   (f/entry :observable c/Observable)
   (f/entry :asset_ref asset/AssetRef)
   (f/entry :asset_type asset/AssetType)))

(def-entity-type NewAssetMapping
  "Schema for submitting new AssetMapping"
  (:entries AssetMapping)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type AssetMappingTypeIdentifier)))

(def AssetMappingRef (c/ref-for-type mapping-type-identifier))
