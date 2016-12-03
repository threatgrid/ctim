(ns ctim.schemas.sighting
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type]])))

(def type-identifier "sighting")

(def TypeIdentifier (f/eq type-identifier))

(def sighting-desc
  "A single sighting of an [indicator](indicator.md)")

(def sighting-desc-link
  "[SightingType](http://stixproject.github.io/data-model/1.2/indicator/SightingType/)")

(def-entity-type Sighting
  {:description sighting-desc
   :reference sighting-desc-link}
  ;; Using s/pred break generative testing
  ;; So for now we check the predicate at creation with
  ;; `check-new-sighting`.
  ;; -- (s/pred
  ;; --  ;; We need either an observable or an indicator,
  ;; --  ;; as a Sighting is useless without one of them.
  ;; --  #(not (and (empty? (:observables %))
  ;; --             (empty? (:indicators %)))))
  c/base-entity-entries
  c/sourcable-object-entries
  c/describable-entity-entries
  (f/required-entries
   (f/entry :type TypeIdentifier)
   (f/entry :observed_time c/ObservedTime)
   (f/entry :confidence v/HighMedLow)
   (f/entry :count f/any-int
            :descrption "number of times the sighting was seen"))
  (f/optional-entries
   (f/entry :sensor v/Sensor
            :description (str "The OpenC2 Actuator name that best gits the "
                              "device that is creating this sighting (e.g. "
                              "network.firewall)"))
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
   (f/entry :type TypeIdentifier)
   (f/entry :count f/any-int)
   (f/entry :confidence v/HighMedLow)))

(def-entity-type StoredSighting
  "A sighting as stored in the data store"
  (:entries Sighting)
  c/base-stored-entity-entries)

(def SightingRef
  (c/ref-for-type type-identifier))
