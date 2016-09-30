(ns ctim.schemas.relationships
  (:require [flanders.core :as f]
            [ctim.schemas.common :as c]
            [ctim.schemas.vocabularies :as v]
            [schema-tools.core :as st]
            [schema.core :as s]))

(def ActorReference c/Reference)
(def CampaignReference c/Reference)
(def COAReference c/Reference)
(def ExploitTargetReference c/Reference)
(def FeedbackReference c/Reference)
(def IncidentReference c/Reference)
(def IndicatorReference c/Reference)
(def JudgementReference c/Reference)
(def SightingReference c/Reference)
(def TTPReference c/Reference)
(def VerdictReference c/Reference)

(defn enriched-ref [reference-map]
  (st/merge
   (st/optional-keys
    {:confidence v/HighMedLow
     :source s/Str
     :relationship s/Str})
   reference-map))

(s/defschema RelatedIndicator
  (enriched-ref {:indicator_id IndicatorReference}))

(s/defschema RelatedIndicators
  [RelatedIndicator])

(def related-indicators-NEW
  (f/structure-seq
   (concat
    (f/required-fields
     (f/field {:indicator_id IndicatorReference}))
    (f/optional-fields
     (f/field {:confidence (f/enum v/HighMedLow-NEW)})
     (f/field {:source s/Str})
     (f/field {:relationship s/Str})))))

(s/defschema RelatedActors
  [(enriched-ref {:actor_id ActorReference})])

(s/defschema RelatedCampaigns
  [(enriched-ref {:campaign_id CampaignReference})])

(s/defschema RelatedCOAs
  [(enriched-ref {:COA_id COAReference})])

(s/defschema RelatedExploitTargets
  [(enriched-ref {:exploit_target_id ExploitTargetReference})])

(s/defschema RelatedIncidents
  [(enriched-ref {:incident_id IncidentReference})])

(s/defschema RelatedJudgement
  (enriched-ref {:judgement_id JudgementReference}))

(s/defschema RelatedJudgements
  [RelatedJudgement])

(s/defschema RelatedSightings
  [(enriched-ref {:sighting_id SightingReference})])

(s/defschema RelatedTTP
  (enriched-ref {:ttp_id TTPReference}))

(s/defschema RelatedTTPs
  [RelatedTTP])
