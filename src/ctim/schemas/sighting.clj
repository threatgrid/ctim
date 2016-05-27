(ns ctim.schemas.sighting
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationships :as rel]
            [ctim.schemas.vocabularies :as v]
            [schema.core :as s]
            [schema-tools.core :as st]))

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
   {:id c/ID
    :timestamp c/Time
    :description s/Str
    ;; wether this Sighting is intended to be shared, replicated, copied...
    ;; TLPValue is an enum "red", "yellow", "green", "white"  default green.
    :tlp c/TLP
    :version s/Str}
   (st/optional-keys
    {:source s/Str
     ;; if we have a source, we should have a source URI for more details
     :source_uri c/URI
     ;; The openC2 Actuator name that best fits the device that is
     ;; creating this sighting
     :source_device v/Sensor ;; eg. "network.firewall"
     ;; link to some random object
     :reference c/URI
     :confidence v/HighMedLow
     ;; The object(s) of interest.
     :observables [c/Observable]
     ;; the indicators we think we are seeing
     :indicators [rel/RelatedIndicator]
     ;; provide any context we can about where the observable came from.
     ;; `ObservedRelation` should be the current ctim.relations
     ;; namespace, moved into the ctim.schema.common namespace
     :relations [c/ObservedRelation]
     :incidents [rel/RelatedIncidents]})))

(s/defschema Type
  (s/enum "sighting"))

(s/defschema NewSighting
  (st/merge
   (st/dissoc Sighting :version)
   (st/optional-keys
    {:id c/ID
     :type Type
     :tlp c/TLP})))

(s/defschema StoredSighting
  "A sighting as stored in the data store"
  (c/stored-schema "sighting" Sighting))

