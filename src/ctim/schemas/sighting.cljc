(ns ctim.schemas.sighting
  #?@
  (:clj
   [(:require
     [ctim.schemas.common :as c]
     [ctim.schemas.relationship :as rel]
     [ctim.schemas.vocabularies :as v]
     [flanders.core :as f :refer [def-entity-type def-eq def-map-type]])]
   :cljs
   [(:require
     [ctim.schemas.common :as c]
     [ctim.schemas.relationship :as rel]
     [ctim.schemas.vocabularies :as v]
     [flanders.core
      :as
      f
      :refer-macros
      [def-entity-type def-eq def-map-type]])]))

(def-map-type SightingTarget
  (concat
   (f/required-entries
    (f/entry :type v/Sensor)
    (f/entry :observables [c/Observable])
    (f/entry :observed_time c/ObservedTime))
   (f/optional-entries
    (f/entry :os f/any-str)
    (f/entry :properties_data_tables rel/DataTableReference)))
  :description "Describes a target device where a sighting came from.")

(def type-identifier "sighting")

(def-eq SightingTypeIdentifier type-identifier)

(def sighting-desc
  "A single sighting of an [indicator](indicator.md)")

(def sighting-desc-link
  "[SightingType](http://stixproject.github.io/data-model/1.2/indicator/SightingType/)")

(def-entity-type Sighting
  {:description sighting-desc
   :reference sighting-desc-link}
  c/base-entity-entries
  c/sourcable-object-entries
  c/describable-entity-entries
  (f/required-entries
   (f/entry :type SightingTypeIdentifier)
   (f/entry :observed_time c/ObservedTime)
   (f/entry :confidence v/HighMedLow)
   (f/entry :count c/PosInt
            :description "The number of times the sighting was seen"))
  (f/optional-entries
   (f/entry :internal (f/bool :default false)
            :description "Is it internal to our network")
   (f/entry :severity v/HighMedLow)
   (f/entry :resolution v/Resolution)
   (f/entry :sensor v/Sensor
            :description (str "The OpenC2 Actuator name that best fits the "
                              "device that is creating this sighting (e.g. "
                              "network.firewall)"))
   (f/entry :target SightingTarget
            :description (str "The target device. Where the sighting came from."))
   (f/entry :observables [c/Observable]
            :description "The object(s) of interest")
   (f/entry :relations [c/ObservedRelation]
            :description (str "Provide any context we can about where the "
                              "observable came from"))))

(def-entity-type NewSighting
  "For submitting a new Sighting"
  (:entries Sighting)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type SightingTypeIdentifier)
   (f/entry :count c/PosInt)
   (f/entry :confidence v/HighMedLow)))

(def-entity-type StoredSighting
  "A sighting as stored in the data store"
  (:entries Sighting)
  c/base-stored-entity-entries)

(def SightingRef
  (c/ref-for-type type-identifier))
