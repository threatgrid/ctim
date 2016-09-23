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
            [ctim.schemas.sighting :refer [StoredSighting]]
            [ctim.schemas.ttp :refer [StoredTTP]]
            [ctim.schemas.verdict :refer [StoredVerdict]]
            [schema-tools.core :as st]
            [schema.core :as s]))

(s/defschema TypeIdentifier
  (s/enum "bundle"))

(s/defschema ReferenceSet #{c/ID})

(s/defschema Objects
  (st/optional-keys
   {:actors #{StoredActor}
    :campaigns #{StoredCampaign}
    :coas #{StoredCOA}
    :exploit-targets #{StoredExploitTarget}
    :feedbacks #{StoredFeedback}
    :incidents #{StoredIncident}
    :indicators #{StoredIndicator}
    :judgements #{StoredJudgement}
    :sightings #{StoredSighting}
    :ttps #{StoredTTP}
    :verdicts #{StoredVerdict}
    :others #{s/Any}}))

(s/defschema References
  (st/optional-keys
   {:actor_refs ReferenceSet
    :campaign_refs ReferenceSet
    :coa_refs ReferenceSet
    :exploit-target_refs ReferenceSet
    :feedback_refs ReferenceSet
    :incident_refs ReferenceSet
    :indicator_refs ReferenceSet
    :judgement_refs ReferenceSet
    :sighting_refs ReferenceSet
    :ttp_refs ReferenceSet
    :verdict_refs ReferenceSet
    :other_refs #{s/Any}}))

(s/defschema Bundle
  (st/merge
   c/BaseEntity
   c/SourcedObject
   c/DescribableEntity
   Objects
   References
   {:valid_time c/ValidTime}))

(s/defschema NewBundle
  "Schema for submitting new Bundles."
  (st/merge
   Bundle
   c/NewBaseEntity
   (st/optional-keys
    {:valid_time c/ValidTime
     :type TypeIdentifier})))

(s/defschema StoredBundle
  "A bundle as stored in the data store"
  (c/stored-schema "bundle" Bundle))
