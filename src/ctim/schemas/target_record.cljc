(ns ctim.schemas.target-record
  (:require #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq def-enum-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq def-enum-type]])
            [clojure.spec.alpha :as cs]
            [ctim.schemas.common :as c]
            [ctim.schemas.asset :as asset]))

(def ^:private type-identifier "target-record")

(def-eq TargetRecordTypeIdentifier type-identifier)

(def ^:private description
  "A TargetRecord is a Sighting that has no threat or observables associated
  with it, it's a way of saying they saw a set of observables together as a Target.")

(def ^:private description-link "[AssetMapping](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#targetrecord)")

(def-map-type Target
  (f/required-entries
   (f/entry :type f/any-str)
   (f/entry :observables [c/Observable])
   (f/entry :observed_time c/ValidTime))
  (f/optional-entries
   (f/entry :os f/any-str)
   (f/entry :internal f/bool)
   (f/entry :sensor f/any-str)))

(def-entity-type TargetRecord
  {:description description
   :reference   description-link}
  c/base-entity-entries
  c/sourced-object-entries
  (f/required-entries
   (f/entry :type TargetRecordTypeIdentifier)
   (f/entry :observable c/Observable)
   (f/entry :target [Target])))

(def-entity-type NewTargetRecord
  "Schema for submitting new TargetRecord"
  (:entries TargetRecord)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type TargetRecordTypeIdentifier)))

(def TargetRecordRef (c/ref-for-type type-identifier))
