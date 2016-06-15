(ns ctim.schemas.sighting
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationships :as rel]
            [ctim.schemas.vocabularies :as v]
            [schema.core :as s]
            [schema-tools.core :as st]))

(s/defschema TypeIdentifier
  (s/enum "sighting"))

(s/defschema Sighting
  "See http://stixproject.github.io/data-model/1.2/indicator/SightingType/"
  ;; Using s/pred break generative testing
  ;; So for now we check the predicate at creation with
  ;; `check-new-sighting`.
  ;; -- (s/pred
  ;; --  ;; We need either an observable or an indicator,
  ;; --  ;; as a Sighting is useless without one of them.
  ;; --  #(not (and (empty? (:observables %))
  ;; --             (empty? (:indicators %)))))
  (st/merge
   c/BaseEntity
   c/SourcableObject
   c/DescribableEntity
   {:type TypeIdentifier
    :observed_time c/ObservedTime
    :confidence v/HighMedLow
    ;; how many times was it see
    :count s/Int}
   (st/optional-keys
    {;; The openC2 Actuator name that best fits the device that is
     ;; creating this sighting
     :sensor v/Sensor ;; eg. "network.firewall"
     ;; The object(s) of interest.
     :observables [c/Observable]
     ;; the indicators we think we are seeing
     :indicators [rel/RelatedIndicator]
     ;; provide any context we can about where the observable came from.
     ;; `ObservedRelation` should be the current ctim.relations
     ;; namespace, moved into the ctim.schema.common namespace
     :relations [c/ObservedRelation]
     :incidents [rel/RelatedIncidents]})))


(s/defschema NewSighting
  (st/merge
   Sighting
   c/NewBaseEntity
   (st/optional-keys
    {:count s/Int
     :confidence v/HighMedLow})))

(s/defschema StoredSighting
  "A sighting as stored in the data store"
  (c/stored-schema "sighting" Sighting))
