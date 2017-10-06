(ns ctim.schemas.bundle
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.actor :refer [ActorRef StoredActor]]
            [ctim.schemas.attack-pattern :refer [AttackPatternRef StoredAttackPattern]]
            [ctim.schemas.campaign :refer [CampaignRef StoredCampaign]]
            [ctim.schemas.coa :refer [COARef StoredCOA]]
            [ctim.schemas.data-table :refer [DataTableRef StoredDataTable]]
            [ctim.schemas.exploit-target
             :refer [ExploitTargetRef StoredExploitTarget]]
            [ctim.schemas.feedback :refer [FeedbackRef StoredFeedback]]
            [ctim.schemas.incident :refer [IncidentRef StoredIncident]]
            [ctim.schemas.indicator :refer [IndicatorRef StoredIndicator]]
            [ctim.schemas.judgement :refer [JudgementRef StoredJudgement]]
            [ctim.schemas.malware :refer [MalwareRef StoredMalware]]
            [ctim.schemas.relationship
             :refer [RelationshipRef StoredRelationship]]
            [ctim.schemas.sighting :refer [SightingRef StoredSighting]]
            [ctim.schemas.tool :refer [ToolRef StoredTool]]
            [ctim.schemas.verdict :refer [StoredVerdict VerdictRef]]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])))

(def type-identifier "bundle")

(def-eq BundleTypeIdentifier type-identifier)

(def objects-entries
  (f/optional-entries
   (f/entry :actors (f/set-of StoredActor)
            :description "a list of `StoredActor`")
   (f/entry :attack-patterns (f/set-of StoredAttackPattern)
            :description "a list of `StoredAttackPattern`")
   (f/entry :campaigns (f/set-of StoredCampaign)
            :description "a list of `StoredCampaign`")
   (f/entry :coas (f/set-of StoredCOA)
            :description "a list of `StoredCOA`")
   (f/entry :exploit-targets (f/set-of StoredExploitTarget)
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
   (f/entry :data-tables (f/set-of StoredDataTable)
            :description "a list of `StoredDataTable`")))

(def references-entries
  (f/optional-entries
   (f/entry :actor_refs (f/set-of ActorRef))
   (f/entry :attack-pattern_refs (f/set-of AttackPatternRef))
   (f/entry :campaign_refs (f/set-of CampaignRef))
   (f/entry :coa_refs (f/set-of COARef))
   (f/entry :exploit-target_refs (f/set-of ExploitTargetRef))
   (f/entry :feedback_refs (f/set-of FeedbackRef))
   (f/entry :incident_refs (f/set-of IncidentRef))
   (f/entry :indicator_refs (f/set-of IndicatorRef))
   (f/entry :judgement_refs (f/set-of JudgementRef))
   (f/entry :malware_refs (f/set-of MalwareRef))
   (f/entry :relationship_refs (f/set-of RelationshipRef))
   (f/entry :sighting_refs (f/set-of SightingRef))
   (f/entry :tool_refs (f/set-of ToolRef))
   (f/entry :verdict_refs (f/set-of VerdictRef))
   (f/entry :data-table_refs (f/set-of DataTableRef))))

(def bundle-entries
  (f/required-entries
   (f/entry :type BundleTypeIdentifier)
   (f/entry :valid_time c/ValidTime)))

(def-entity-type Bundle
  "Bundle of other entities"
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
  "Schema for submitting new Bundles."
  (:entries Bundle)
  c/base-new-entity-entries
  new-bundle-entries)

(def-entity-type StoredBundle
  "A bundle as stored in the data store"
  (:entries Bundle)
  c/base-stored-entity-entries)

(def BundleReference
  (c/ref-for-type type-identifier))
