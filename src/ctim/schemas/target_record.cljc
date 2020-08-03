(ns ctim.schemas.target-record
  #?@
  (:clj
   [(:require
     [ctim.schemas.common :as c]
     [ctim.schemas.relationship :as rel]
     [ctim.schemas.vocabularies :as v]
     [ctim.schemas.data-table :as dt]
     [flanders.core :as f :refer [def-entity-type def-eq def-map-type]])]
   :cljs
   [(:require
     [ctim.schemas.common :as c]
     [ctim.schemas.relationship :as rel]
     [ctim.schemas.vocabularies :as v]
     [ctim.schemas.data-table :as dt]
     [flanders.core
      :as
      f
      :refer-macros
      [def-entity-type def-eq def-map-type]])]))

(def type-identifier "target-record")

(def-eq TargetRecordTypeIdentifier type-identifier)

(def target-record-desc
  "A single target-record of an [indicator](indicator.md)")

(def target-record-desc-link
  "[TargetRecordType](http://stixproject.github.io/data-model/1.2/indicator/SightingType/)")

(def-entity-type TargetRecord
  {:description targetrecord
   :reference target-record-desc-link}
  c/base-entity-entries
  c/sourcable-object-entries
  c/describable-entity-entries
  (f/required-entries
   (f/entry :type TargetRecordTypeIdentifier)
   (f/entry :observed_time c/ObservedTime))
  (f/optional-entries
   (f/entry :internal (f/bool :default false)
            :description "Is it internal to our network")
   (f/entry :sensor v/Sensor
            :description (str "The OpenC2 Actuator name that best fits the "
                              "device that is creating this sighting (e.g. "
                              "network.firewall)"))
   (f/entry :targets (f/seq-of c/IdentitySpecification)
            :description (str "The target device. Where the sighting came from."))))

(def-entity-type NewTargetRecord
  "For submitting a new TargetRecord"
  (:entries TargetRecord)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type TargetRecordTypeIdentifier)
   (f/entry :observed_time c/ObservedTime)))

(def TargetRecordRef
  (c/ref-for-type type-identifier))
