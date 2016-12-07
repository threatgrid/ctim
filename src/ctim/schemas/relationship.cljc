(ns ctim.schemas.relationship
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type]])))

(def type-identifier "relationship")

(def TypeIdentifier (f/eq type-identifier))

(def-entity-type Relationship
  "Represents a relationship between two entities"
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type TypeIdentifier)
   (f/entry :relationship_type v/RelationshipType)
   (f/entry :source_ref c/Reference)
   (f/entry :target_ref c/Reference)))

(def-entity-type NewRelationship
  "Schema for submitting new Relationships"
  (:entries Relationship)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type TypeIdentifier)))

(def-entity-type StoredRelationship
  "An Relationship stored in the data store"
  (:entries Relationship)
  c/base-stored-entity-entries)

(def RelationshipRef
  (c/ref-for-type type-identifier))

;; These *Reference and Related* schema are for the old STIX 1.2-like
;; embedding of references to other entities within the source entity.
;; We are moving away from this model, because it requires the editing
;; of objects and also makes it difficult to add new typs of
;; relationships.

(def ActorReference (c/ref :description "A URI leading to an actor"))
(def CampaignReference (c/ref :description "A URI leading to a campaign"))
(def COAReference (c/ref :description "A URI leading to a COA"))
(def ExploitTargetReference (c/ref :description "A URI leading to an exploit target"))
(def FeedbackReference (c/ref :description "A URI leading to a feedback"))
(def IncidentReference (c/ref :description "A URI leading to an incident"))
(def IndicatorReference (c/ref :description "A URI leading to an indicator"))
(def JudgementReference (c/ref :description "A URI leading to a judgement"))
(def SightingReference (c/ref :description "A URI leading to a sighting"))
(def TTPReference (c/ref :description "A URI leading to a TTP"))
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

(def-map-type RelatedExploitTarget
  (concat
   relationship-entries
   [(f/entry :exploit_target_id ExploitTargetReference)]))

(def RelatedExploitTargets
  (f/seq-of RelatedExploitTarget))

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

(def-map-type RelatedSighting
  (concat
   relationship-entries
   [(f/entry :sighting_id SightingReference)]))

(def RelatedSightings
  (f/seq-of RelatedSighting))

(def-map-type RelatedTTP
  (concat
   relationship-entries
   [(f/entry :TTP_id TTPReference)]))

(def RelatedTTPs
  (f/seq-of RelatedTTP))
