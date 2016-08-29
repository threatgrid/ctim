(ns ctim.schemas.actor
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationships :as rel]
            [ctim.schemas.vocabularies :as v]
            [schema-tools.core :as st]
            [schema.core :as s]))

(s/defschema TypeIdentifier
  (s/enum "actor"))

(s/defschema Actor
  "http://stixproject.github.io/data-model/1.2/ta/ThreatActorType/"
  (st/merge
   c/BaseEntity
   c/DescribableEntity
   c/SourcableObject
   {:type TypeIdentifier
    :valid_time c/ValidTime
    :actor_type v/ThreatActorType}
   (st/optional-keys
    {:identity c/Identity
     :motivation v/Motivation
     :sophistication v/Sophistication
     :intended_effect v/IntendedEffect
     :planning_and_operational_support s/Str ; Empty vocab
     :observed_TTPs rel/RelatedTTPs
     :associated_campaigns rel/RelatedCampaigns
     :associated_actors rel/RelatedActors
     :confidence v/HighMedLow
     ;; Not provided: handling
     ;; Not provided: related_packages (deprecated)
     })))

(s/defschema NewActor
  "Schema for submitting new Actors"
  (st/merge
   Actor
   c/NewBaseEntity
   (st/optional-keys
    {:type TypeIdentifier
     :valid_time c/ValidTime})))

(s/defschema StoredActor
  "An actor as stored in the data store"
  (c/stored-schema "actor" Actor))
