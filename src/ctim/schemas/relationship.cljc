(ns ctim.schemas.relationship
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])))

(def type-identifier "relationship")

(def-eq RelationshipTypeIdentifier type-identifier)

(def-entity-type Relationship
  "Represents a relationship between two entities"
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type RelationshipTypeIdentifier)
   (f/entry :relationship_type v/RelationshipType)
   (f/entry :source_ref c/Reference)
   (f/entry :target_ref c/Reference)))

(def-entity-type NewRelationship
  "Schema for submitting new Relationships"
  (:entries Relationship)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type RelationshipTypeIdentifier)))

(def-entity-type StoredRelationship
  "An Relationship stored in the data store"
  (:entries Relationship)
  [(f/entry :source_ref c/StoredReference)
   (f/entry :target_ref c/StoredReference)]
  c/base-stored-entity-entries)

(def RelationshipRef
  (c/ref-for-type type-identifier))

;; These *Reference and Related* schema are for the old STIX 1.2-like
;; embedding of references to other entities within the source entity.
;; We are moving away from this model, because it requires the editing
;; of objects and also makes it difficult to add new typs of
;; relationships.

(def ActorReference (c/ref :description "A URI leading to an actor"))
(def AttackPatternReference (c/ref :description "A URI leading to an attack pattern"))
(def CampaignReference (c/ref :description "A URI leading to a campaign"))
(def COAReference (c/ref :description "A URI leading to a COA"))
(def DataTableReference (c/ref :description "A URI leading to a data table"))
(def FeedbackReference (c/ref :description "A URI leading to a feedback"))
(def IncidentReference (c/ref :description "A URI leading to an incident"))
(def IndicatorReference (c/ref :description "A URI leading to an indicator"))
(def JudgementReference (c/ref :description "A URI leading to a judgement"))
(def MalwareReference (c/ref :description "A URI leading to a malware"))
(def SightingReference (c/ref :description "A URI leading to a sighting"))
(def ToolReference (c/ref :description "A URI leading to a tool"))
(def VerdictReference (c/ref :description "A URI leading to a verdict"))

(def relationship-entries
  (f/optional-entries
   (f/entry :confidence v/HighMedLow)
   (f/entry :source f/any-str)
   (f/entry :relationship f/any-str)))

(def-map-type RelatedIndicator
  (concat
   relationship-entries
   [(f/entry :indicator_id IndicatorReference)]))

(def RelatedIndicators
  (f/seq-of RelatedIndicator))

(def-map-type RelatedActor
  (concat
   relationship-entries
   [(f/entry :actor_id ActorReference)]))

(def RelatedActors
  (f/seq-of RelatedActor))

(def-map-type RelatedAttackPattern
  (concat
   relationship-entries
   [(f/entry :attack_pattern_id AttackPatternReference)]))

(def RelatedAttackPatterns
  (f/seq-of RelatedAttackPattern))

(def-map-type RelatedCampaign
  (concat
   relationship-entries
   [(f/entry :campaign_id CampaignReference)]))

(def RelatedCampaigns
  (f/seq-of RelatedCampaign))

(def-map-type RelatedCOA
  (concat
   relationship-entries
   [(f/entry :COA_id COAReference)]))

(def RelatedCOAs
  (f/seq-of RelatedCOA))

(def-map-type RelatedIncident
  (concat
   relationship-entries
   [(f/entry :incident_id IncidentReference)]))

(def RelatedIncidents
  (f/seq-of RelatedIncident))

(def-map-type RelatedJudgement
  (concat
   relationship-entries
   [(f/entry :judgement_id JudgementReference)]))

(def RelatedJudgements
  (f/seq-of RelatedJudgement))

(def-map-type RelatedMalware
  (concat
   relationship-entries
   [(f/entry :malware_id MalwareReference)]))

(def RelatedMalwares
  (f/seq-of RelatedMalware))

(def-map-type RelatedSighting
  (concat
   relationship-entries
   [(f/entry :sighting_id SightingReference)]))

(def RelatedSightings
  (f/seq-of RelatedSighting))

(def-map-type RelatedTool
  (concat
   relationship-entries
   [(f/entry :tool_id ToolReference)]))

(def RelatedTools
  (f/seq-of RelatedTool))
