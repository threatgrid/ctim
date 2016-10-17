(ns ctim.schemas.bundle
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.actor :refer [StoredActor]]
            [ctim.schemas.campaign :refer [StoredCampaign]]
            [ctim.schemas.coa :refer [StoredCOA]]
            [ctim.schemas.exploit-target :refer [StoredExploitTarget]]
            [ctim.schemas.feedback :refer [StoredFeedback]]
            [ctim.schemas.incident :refer [StoredIncident]]
            [ctim.schemas.indicator :refer [StoredIndicator]]
            [ctim.schemas.judgement :refer [StoredJudgement]]
            [ctim.schemas.relationship :refer [StoredRelationship]]
            [ctim.schemas.sighting :refer [StoredSighting]]
            [ctim.schemas.ttp :refer [StoredTTP]]
            [ctim.schemas.verdict :refer [StoredVerdict]]
            [ctim.schemas.data-table :refer [StoredDataTable]]

            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type]])))

(def TypeIdentifier
  (f/eq "bundle"))

(def ReferenceList
  (f/set-of c/ID
            :description "List of references"))

(def objects-entries
  (f/optional-entries
   (f/entry :actors (f/set-of StoredActor)
            :description "a list of `StoredActor`")

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

   (f/entry :relationships (f/set-of StoredRelationship)
            :description "a list of `StoredRelationship`")

   (f/entry :sightings (f/set-of StoredSighting)
            :description "a list of `StoredSighting`")

   (f/entry :ttps (f/set-of StoredTTP)
            :description "a list of `StoredTTP`")

   (f/entry :verdicts (f/set-of StoredVerdict)
            :description "a list of `StoredVerdict`")

   (f/entry :data-tables (f/set-of StoredDataTable)
            :description "a list of `StoredDataTable`")))

(def references-entries
  (f/optional-entries
   (f/entry :actor_refs ReferenceList)
   (f/entry :campaign_refs ReferenceList)
   (f/entry :coa_refs ReferenceList)
   (f/entry :exploit-target_refs ReferenceList)
   (f/entry :feedback_refs ReferenceList)
   (f/entry :incident_refs ReferenceList)
   (f/entry :indicator_refs ReferenceList)
   (f/entry :judgement_refs ReferenceList)
   (f/entry :relationship_refs ReferenceList)
   (f/entry :sighting_refs ReferenceList)
   (f/entry :ttp_refs ReferenceList)
   (f/entry :verdict_refs ReferenceList)
   (f/entry :data-table_refs ReferenceList)))

(def bundle-entries
  [(f/entry :type TypeIdentifier)
   (f/entry :valid_time c/ValidTime)])

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
