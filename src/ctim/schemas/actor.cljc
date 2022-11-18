(ns ctim.schemas.actor
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq]])))

(def type-identifier "actor")

(def-eq ActorTypeIdentifier type-identifier)

(def actor-desc
  "Describes malicious actors (or adversaries) related to a cyber attack")

(def actor-desc-link
  "[ThreatActorType](http://stixproject.github.io/data-model/1.2/ta/ThreatActorType/)")

(def-entity-type Actor
  {:description actor-desc
   :reference actor-desc-link}
  c/base-entity-entries
  c/sourced-object-entries
  c/described-entity-entries
  (f/required-entries
   (f/entry :type ActorTypeIdentifier)
   (f/entry :valid_time c/ValidTime))
  (f/optional-entries
   (f/entry :actor_types [v/ThreatActorType])
   (f/entry :identity c/Identity)
   (f/entry :motivation v/Motivation)
   (f/entry :sophistication v/Sophistication)
   (f/entry :intended_effect v/IntendedEffect)
   (f/entry :planning_and_operational_support c/LongString)
   (f/entry :confidence v/HighMedLow)
   (f/entry :aliases [c/ShortString]
            :description (str "A list of other names that this Threat Actor is "
                              "believed to use.")))
  ;; Not provided: handling
  ;; Not provided: related_packages (deprecated)
  )

(def-entity-type NewActor
  "Schema for submitting new Actors"
  (:entries Actor)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type ActorTypeIdentifier)
   (f/entry :valid_time c/ValidTime)))

(def ActorRef
  (c/ref-for-type type-identifier))
