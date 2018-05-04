(ns ctim.schemas.bundle
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.actor :refer [Actor ActorRef NewActor StoredActor]]
            [ctim.schemas.attack-pattern
             :refer [AttackPattern AttackPatternRef
                     NewAttackPattern StoredAttackPattern]]
            [ctim.schemas.campaign
             :refer [Campaign CampaignRef NewCampaign StoredCampaign]]
            [ctim.schemas.coa :refer [COA COARef NewCOA StoredCOA]]
            [ctim.schemas.data-table
             :refer [DataTable DataTableRef NewDataTable StoredDataTable]]
            [ctim.schemas.exploit-target
             :refer [ExploitTarget ExploitTargetRef NewExploitTarget
                     StoredExploitTarget]]
            [ctim.schemas.feedback
             :refer [Feedback FeedbackRef NewFeedback StoredFeedback]]
            [ctim.schemas.incident
             :refer [Incident IncidentRef NewIncident StoredIncident]]
            [ctim.schemas.indicator
             :refer [Indicator IndicatorRef NewIndicator StoredIndicator]]
            [ctim.schemas.judgement
             :refer [Judgement JudgementRef NewJudgement StoredJudgement]]
            [ctim.schemas.malware
             :refer [Malware MalwareRef NewMalware StoredMalware]]
            [ctim.schemas.relationship
             :refer [Relationship RelationshipRef NewRelationship
                     StoredRelationship]]
            [ctim.schemas.sighting
             :refer [Sighting SightingRef NewSighting StoredSighting]]
            [ctim.schemas.tool :refer [NewTool Tool ToolRef StoredTool]]
            [ctim.schemas.verdict :refer [Verdict StoredVerdict VerdictRef]]
            [ctim.schemas.weakness :refer [NewWeakness Weakness StoredWeakness WeaknessRef]]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])))

(def type-identifier "bundle")

(def-eq BundleTypeIdentifier type-identifier)

(def bundle-desc
  "Describes a Bundle of any set of CTIM entities")

(def objects-entries
  (f/optional-entries
   (f/entry :actors (f/set-of Actor)
            :description "a list of `Actor`")
   (f/entry :attack_patterns (f/set-of AttackPattern)
            :description "a list of `AttackPattern`")
   (f/entry :campaigns (f/set-of Campaign)
            :description "a list of `Campaign`")
   (f/entry :coas (f/set-of COA)
            :description "a list of `COA`")
   (f/entry :exploit_targets (f/set-of ExploitTarget)
            :description "a list of `ExploitTarget`")
   (f/entry :feedbacks (f/set-of Feedback)
            :description "a list of `Feedback`")
   (f/entry :incidents (f/set-of Incident)
            :description "a list of `Incident`")
   (f/entry :indicators (f/set-of Indicator)
            :description "a list of `Indicator`")
   (f/entry :judgements (f/set-of Judgement)
            :description "a list of `Judgement`")
   (f/entry :malwares (f/set-of Malware)
            :description "a list of `Malware`")
   (f/entry :relationships (f/set-of Relationship)
            :description "a list of `Relationship`")
   (f/entry :sightings (f/set-of Sighting)
            :description "a list of `Sighting`")
   (f/entry :tools (f/set-of Tool)
            :description "a list of `Tool`")
   (f/entry :verdicts (f/set-of Verdict)
            :description "a list of `Verdict`")
   (f/entry :data_tables (f/set-of DataTable)
            :description "a list of `DataTable`")
   (f/entry :weaknesses (f/set-of Weakness)
            :description "a list of `Weakness`")))

(def stored-objects-entries
  (f/optional-entries
   (f/entry :actors (f/set-of StoredActor)
            :description "a list of `StoredActor`")
   (f/entry :attack_patterns (f/set-of StoredAttackPattern)
            :description "a list of `StoredAttackPattern`")
   (f/entry :campaigns (f/set-of StoredCampaign)
            :description "a list of `StoredCampaign`")
   (f/entry :coas (f/set-of StoredCOA)
            :description "a list of `StoredCOA`")
   (f/entry :exploit_targets (f/set-of StoredExploitTarget)
            :description "a list of `StoredExploitTarget`")
   (f/entry :feedbacks (f/set-of StoredFeedback)
            :description "a list of `StoredFeedback`")
   (f/entry :incidents (f/set-of StoredIncident)
            :description "a list of `StoredIncident`")
   (f/entry :indicators (f/set-of StoredIndicator)
            :description "a list of `StoredIndicator`")
   (f/entry :judgements (f/set-of StoredJudgement)
            :description "a list of `StoredJudgement`")
   (f/entry :malwares (f/set-of StoredMalware)
            :description "a list of `StoredMalware`")
   (f/entry :relationships (f/set-of StoredRelationship)
            :description "a list of `StoredRelationship`")
   (f/entry :sightings (f/set-of StoredSighting)
            :description "a list of `StoredSighting`")
   (f/entry :tools (f/set-of StoredTool)
            :description "a list of `StoredTool`")
   (f/entry :verdicts (f/set-of StoredVerdict)
            :description "a list of `StoredVerdict`")
   (f/entry :data_tables (f/set-of StoredDataTable)
            :description "a list of `StoredDataTable`")
   (f/entry :weaknesses (f/set-of StoredWeakness)
            :description "a list of `StoredWeakness`")))

(def new-objects-entries
  (f/optional-entries
   (f/entry :actors (f/set-of NewActor)
            :description "a list of `NewActor`")
   (f/entry :attack_patterns (f/set-of NewAttackPattern)
            :description "a list of `NewAttackPattern`")
   (f/entry :campaigns (f/set-of NewCampaign)
            :description "a list of `NewCampaign`")
   (f/entry :coas (f/set-of NewCOA)
            :description "a list of `NewCOA`")
   (f/entry :exploit_targets (f/set-of NewExploitTarget)
            :description "a list of `NewExploitTarget`")
   (f/entry :feedbacks (f/set-of NewFeedback)
            :description "a list of `NewFeedback`")
   (f/entry :incidents (f/set-of NewIncident)
            :description "a list of `NewIncident`")
   (f/entry :indicators (f/set-of NewIndicator)
            :description "a list of `NewIndicator`")
   (f/entry :judgements (f/set-of NewJudgement)
            :description "a list of `NewJudgement`")
   (f/entry :malwares (f/set-of NewMalware)
            :description "a list of `NewMalware`")
   (f/entry :relationships (f/set-of NewRelationship)
            :description "a list of `NewRelationship`")
   (f/entry :sightings (f/set-of NewSighting)
            :description "a list of `NewSighting`")
   (f/entry :tools (f/set-of NewTool)
            :description "a list of `NewTool`")
   (f/entry :verdicts (f/set-of Verdict)
            :description "a list of `Verdict`")
   (f/entry :data_tables (f/set-of NewDataTable)
            :description "a list of `NewDataTable`")
   (f/entry :weaknesses (f/set-of NewWeakness)
            :description "a list of `NewWeakness`")))

(def references-entries
  (f/optional-entries
   (f/entry :actor_refs (f/set-of ActorRef))
   (f/entry :attack_pattern_refs (f/set-of AttackPatternRef))
   (f/entry :campaign_refs (f/set-of CampaignRef))
   (f/entry :coa_refs (f/set-of COARef))
   (f/entry :exploit_target_refs (f/set-of ExploitTargetRef))
   (f/entry :feedback_refs (f/set-of FeedbackRef))
   (f/entry :incident_refs (f/set-of IncidentRef))
   (f/entry :indicator_refs (f/set-of IndicatorRef))
   (f/entry :judgement_refs (f/set-of JudgementRef))
   (f/entry :malware_refs (f/set-of MalwareRef))
   (f/entry :relationship_refs (f/set-of RelationshipRef))
   (f/entry :sighting_refs (f/set-of SightingRef))
   (f/entry :tool_refs (f/set-of ToolRef))
   (f/entry :verdict_refs (f/set-of VerdictRef))
   (f/entry :data_table_refs (f/set-of DataTableRef))
   (f/entry :weakness_refs (f/set-of WeaknessRef))))

(def bundle-entries
  (f/required-entries
   (f/entry :type BundleTypeIdentifier)
   (f/entry :valid_time c/ValidTime)))

(def-entity-type Bundle
  {:description bundle-desc
   :reference "#"}
  c/base-entity-entries
  c/sourced-object-entries
  c/describable-entity-entries
  objects-entries
  references-entries
  bundle-entries)

(def new-bundle-entries
  (apply f/optional-entries
         bundle-entries))

(def-entity-type NewBundle
  {:description bundle-desc
   :reference "#"}
  (:entries Bundle)
  c/base-new-entity-entries
  new-objects-entries
  new-bundle-entries)

(def-entity-type StoredBundle
  {:description bundle-desc
   :reference "#"}
  (:entries Bundle)
  c/base-stored-entity-entries
  new-objects-entries)

(def BundleReference
  (c/ref-for-type type-identifier))
