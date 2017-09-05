(ns ctim.schemas.campaign
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq]])))

(def type-identifier "campaign")

(def-eq CampaignTypeIdentifier type-identifier)

(def campaign-desc
  "Represents a campaign by an [actor](actor.md) pursing an intent")

(def campaign-desc-link
  "[CampaignType](http://stixproject.github.io/data-model/1.2/campaign/CampaignType/)")

(def-entity-type Campaign
  {:description campaign-desc
   :reference campaign-desc-link}
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type CampaignTypeIdentifier)
   (f/entry :valid_time c/ValidTime
            :description (str "Timestamp for the definition of a specific "
                              "version of a campaign"))
   (f/entry :campaign_type c/ShortString
            :comment "Should we define a vocabulary for this?"))
  (f/optional-entries
   (f/entry :names (f/seq-of c/ShortString)
            :description "Names used to identify this campaign")
   (f/entry :intended_effect [v/IntendedEffect]
            :description (str "Characterizes the intended effect of this cyber "
                              "threat campaign"))
   (f/entry :status v/CampaignStatus
            :description "Status of this Campaign")
   (f/entry :confidence v/HighMedLow
            :description (str "Level of confidence held in the characterization "
                              "of this Campaign"))
   (f/entry :activity [c/Activity]
            :description "Actions taken in regards to this Campaign")))
  ;; Not provided: Handling
  ;; Not provided: related_packages (deprecated)

(def-entity-type NewCampaign
  "Schema for submitting new Campaigns"
  (:entries Campaign)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type CampaignTypeIdentifier)
   (f/entry :valid_time c/ValidTime)))

(def-entity-type StoredCampaign
  "An campaign as stored in the data store"
  (:entries Campaign)
  c/base-stored-entity-entries)

(def CampaignRef
  (c/ref-for-type type-identifier))
