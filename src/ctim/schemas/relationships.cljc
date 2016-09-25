(ns ctim.schemas.relationships
  (:require #?(:clj  [flanders.core :as f :refer [def-map-type]]
               :cljs [flanders.core :as f :refer-macros [def-map-type]])
            [ctim.schemas.common :as c]
            [ctim.schemas.vocabularies :as v]))

(def ActorReference (f/str :description "A URI leading to an actor"))
(def CampaignReference (f/str :description "A URI leading to a campaign"))
(def COAReference (f/str :description "A URI leading to a COA"))
(def ExploitTargetReference (f/str :description "A URI leading to an exploit target"))
(def FeedbackReference (f/str :description "A URI leading to a feedback"))
(def IncidentReference (f/str :description "A URI leading to an incident"))
(def IndicatorReference (f/str :description "A URI leading to an indicator"))
(def JudgementReference (f/str :description "A URI leading to a judgement"))
(def SightingReference (f/str :description "A URI leading to a sighting"))
(def TTPReference (f/str :description "A URI leading to a TTP"))
(def VerdictReference (f/str :description "A URI leading to a verdict"))

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
   [(f/entry :ttp_id TTPReference)]))

(def RelatedTTPs
  (f/seq-of RelatedTTP))
