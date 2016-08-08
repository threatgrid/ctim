(ns ctim.schemas.campaign
  (:require [ctim.lib.schema :refer [describe]]
            [ctim.schemas.common :as c]
            [ctim.schemas.relationships :as rel]
            [ctim.schemas.vocabularies :as v]
            [schema-tools.core :as st]
            [schema.core :as s]))

(s/defschema TypeIdentifier
  (s/enum "campaign"))

(s/defschema Campaign
  "See http://stixproject.github.io/data-model/1.2/campaign/CampaignType/"
  (st/merge
   c/BaseEntity
   c/DescribableEntity
   c/SourcableObject
   {:type TypeIdentifier
    :valid_time (describe
                 c/ValidTime
                 "timestamp for the definition of a specific version of a Campaign")
    ;; Extension fields:
    :campaign_type  s/Str}
   (st/optional-keys
    {:names (describe [s/Str] "Names used to identify this Campaign")
     :indicators rel/RelatedIndicators
     :intended_effect (describe
                       [v/IntendedEffect]
                       (str "characterizes the intended effect of"
                            " this cyber threat Campaign"))
     :status (describe v/CampaignStatus "status of this Campaign")
     :related_TTPs (describe
                    rel/RelatedTTPs
                    (str "specifies TTPs asserted to be related to"
                         " this cyber threat Campaign"))
     :related_incidents (describe
                         rel/RelatedIncidents
                         (str "identifies or characterizes one or more Incidents"
                              " related to this cyber threat Campaign"))
     :attribution (describe rel/RelatedActors
                            (str
                             "assertions of attibuted Threat Actors"
                             " for this cyber threat Campaign"))
     :associated_campaigns (describe
                            rel/RelatedCampaigns
                            (str "other cyber threat Campaigns asserted to"
                                 " be associated with this cyber threat Campaign"))
     :confidence (describe v/HighMedLow
                           (str "level of confidence held in"
                                " the characterization of this Campaign"))
     :activity (describe c/Activity
                         "actions taken in regards to this Campaign")
     ;; Not provided: Handling
     ;; Not provided: related_packages (deprecated)
     })))

(s/defschema NewCampaign
  "Schema for submitting new Campaigns"
  (st/merge
   Campaign
   c/NewBaseEntity
   (st/optional-keys
    {:type TypeIdentifier
     :valid_time c/ValidTime})))

(s/defschema StoredCampaign
  "An campaign as stored in the data store"
  (c/stored-schema "campaign" Campaign))
