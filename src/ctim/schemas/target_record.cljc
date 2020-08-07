(ns ctim.schemas.target-record
  (:require #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq def-map-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq def-map-type]])
            [ctim.schemas.common :as c]))

(def ^:private type-identifier "target-record")

(def-eq TargetRecordTypeIdentifier type-identifier)

(def ^:private description
  "A TargetRecord is a Sighting that has no threat or observables associated
  with it, it's a way of saying they saw a set of observables together as a Target.")

(def ^:private description-link "[TargetRecord](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#targetrecord)")

(def-map-type Target
  (concat
   (f/required-entries
    (f/entry :type f/any-str)
    (f/entry :observables [c/Observable])
    (f/entry :observed_time c/ValidTime)
    (f/entry :source_uri c/URI))
   (f/optional-entries
    (f/entry :os f/any-str)
    (f/entry :internal (f/bool :default false))
    (f/entry :sensor f/any-str))))

(def-entity-type TargetRecord
  {:description description
   :reference   description-link}
  c/base-entity-entries
  c/sourced-object-entries
  (f/required-entries
   (f/entry :type TargetRecordTypeIdentifier)
   (f/entry :target [Target])))

(def-entity-type NewTargetRecord
  "Schema for submitting new TargetRecord"
  (:entries TargetRecord)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type TargetRecordTypeIdentifier)))

(def TargetRecordRef (c/ref-for-type type-identifier))
