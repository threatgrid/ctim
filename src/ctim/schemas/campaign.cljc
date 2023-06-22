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
  c/described-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type CampaignTypeIdentifier)
   (f/entry :valid_time c/ValidTime
            :description (str "Timestamp for the definition of a specific "
                              "version of a campaign"))
   (f/entry :campaign_type c/ShortString
            :description (str "String value that describes the type of campaign. For example, a campaign type "
                              "could be 'Ransomware', 'Advanced Persistent Threat', 'Business Email Compromise', 'Phishing', etc. ")
            :comment "Should we define a vocabulary for this?"))
  (f/optional-entries
   (f/entry :names (f/seq-of c/ShortString)
            :description (str "Used to capture alternate names or aliases associated with the campaign. "
                              "A cyberattack campaign may have multiple names or aliases depending on the group "
                              "or actor(s) behind the attack, "
                              "e.g., 'Wannacry' is also known as 'WannaCrypt', 'WCry', or 'Wanna Decryptor' "))
   (f/entry :intended_effect [v/IntendedEffect]
            :description (str "Characterizes the intended effect of this cyber "
                              "threat campaign"))
   (f/entry :status v/CampaignStatus
            :description (str "Indicates current Status of the Campaign. "
                              "\n\n"
                              "Can have one of the following values: "
                              "\n\n"
                              "- Ongoing: Indicates that the campaign is currently active and ongoing. For "
                              "  example, a mass phishing campaign that is actively targeting users is "
                              "  considered 'ongoing'."
                              "\n\n"
                              "- Historic: Campaign has already occurred and is now in the past."
                              "\n\n"
                              "- Future: This indicates that a campaign is planned or expected to occur in the "
                              "  future. For example, a threat actor may announce their intention to launch a "
                              "  specific cyberattack campaign at a future date."))
   (f/entry :confidence v/HighMedLow
            :description (str "Level of confidence held in the characterization "
                              "of this Campaign"))
   (f/entry :activity [c/Activity]
            :description (str "Used to capture specific activities or tactics associated with the campaign.\n"
                              "The 'activity' field is an array of objects, and each element represents a "
                              "specific activity and time associated with the campaign. Examples of activities "
                              "may include malicious software delivery, command and control communication, "
                              "network reconnaissance, data exfiltration, etc. By capturing these activities "
                              "analysts can identify the specific tactics used by the threat actor(s) behind "
                              "the campaign."))))
  ;; Not provided: Handling
  ;; Not provided: related_packages (deprecated)

(def-entity-type NewCampaign
  "Schema for submitting new Campaigns"
  (:entries Campaign)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type CampaignTypeIdentifier)
   (f/entry :valid_time c/ValidTime)))

(def CampaignRef
  (c/ref-for-type type-identifier))
