(ns ctim.schemas.target-record
  (:require
   #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq]]
      :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq]])
   [ctim.schemas.common :as c]))

(def ^:private type-identifier "target-record")

(def-eq TargetRecordTypeIdentifier type-identifier)

(def ^:private description
  "A TargetRecord is a Sighting that has no threat or observables associated
  with it, it's a way of saying they saw a set of observables together as a Target.")

(def ^:private description-link "[TargetRecord](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#targetrecord)")

(def-entity-type Target
  "Schema for TargetRecord Targets"
  (:entries c/IdentitySpecification)
  (f/optional-entries
   (f/entry :os f/any-str
            :description (str "Source Operating System where TargetRecord was originated."))
   (f/entry :internal (f/bool :default false)
            :description "Is it internal to our network?")
   (f/entry :sensor f/any-str
            :description (str "The OpenC2 Actuator name that best fits the "
                              "device that is creating this TargetRecord (e.g.: "
                              "network.firewall, etc.)"))
   (f/entry :source_uri c/URI)))

(def-entity-type TargetRecord
  {:description description
   :reference   description-link}
  c/base-entity-entries
  c/sourced-object-entries
  c/describable-entity-entries
  (f/required-entries
   (f/entry :type TargetRecordTypeIdentifier)
   (f/entry :targets (f/seq-of Target))))

(def-entity-type NewTargetRecord
  "Schema for submitting new TargetRecord."
  (:entries TargetRecord)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type TargetRecordTypeIdentifier)))

(def TargetRecordRef (c/ref-for-type type-identifier))
