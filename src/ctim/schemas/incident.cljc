(ns ctim.schemas.incident
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])))

(def-map-type COARequested
  (concat
   (f/required-entries
    (f/entry :COA rel/COAReference
             :description "COA reference"))
   (f/optional-entries
    (f/entry :time c/Time
             :description "relative time criteria for this taken CourseOfAction")
    (f/entry :contributors [c/Contributor]
             :description "contributing actors for the CourseOfAction taken")))
  :reference ["[COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/)"
              "[COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)"])

(def-map-type NonPublicDataCompromised
  ;; Simplified schema
  [(f/entry :security_compromise v/SecurityCompromise
            :description "related security compromise")
   (f/entry :data_encrypted f/any-bool
            :required? false
            :description (str "whether the data that was compromised was "
                              "encrypted or not"))]
  :reference "[NonPublicDataCompromisedType](http://stixproject.github.io/data-model/1.2/incident/NonPublicDataCompromisedType/)")

(def-map-type PropertyAffected
  (f/optional-entries
   (f/entry :property v/LossProperty
            :description "security property that was affected by the incident")
   (f/entry :description_of_effect f/any-str
            :description (str "a brief prose description of how the security"
                              " property was affected"))
   (f/entry :type_of_availability_loss f/any-str
            :comment "empty vocabulary"
            :description (str "characterizes in what manner the"
                              " availability of this asset was affected"))
   (f/entry :duration_of_availability_loss v/LossDuration
            :description (str "approximate length of time availability was "
                              "affected"))
   (f/entry :non_public_data_compromised NonPublicDataCompromised
            :description (str "approximate length of time availability was "
                              "affected")))
  :reference "[PropertyAffectedTpye](http://stixproject.github.io/data-model/1.2/incident/PropertyAffectedType/)")

(def-map-type AffectedAsset
  (f/optional-entries
   (f/entry :type f/any-str
            :description (str "type of the asset impacted by the incident"
                              " (a security attribute was negatively affected)."))
   (f/entry :description f/any-str
            :description "text description of the asset")
   (f/entry :ownership_class v/OwnershipClass
            :description (str "high-level characterization of who owns (or "
                              "controls) this asset"))
   (f/entry :management_class v/ManagementClass
            :description (str "high-level characterization of who is responsible"
                              " for the day-to-day management and administration"
                              " of this asset"))
   (f/entry :location_class v/LocationClass
            :description (str "high-level characterization of where this asset is"
                              " physically located"))
   (f/entry :property_affected PropertyAffected
            :comment "Unnested NatureOfSecurityEffect"
            :description "affected property")
   (f/entry :identifying_observables [c/Observable])
   ;; Not Provided: business_function_or_role
   ;; Not Provided: location (undefined/abstract type); Could be f/any-str-seq
   )
  :reference "[AffectedAssetType](http://stixproject.github.io/data-model/1.2/incident/AffectedAssetType/)")

(def-map-type DirectImpactSummary
  (f/optional-entries
   (f/entry :asset_losses v/ImpactRating
            :description (str "level of asset-related losses that occured in the "
                              "Incident"))
   (f/entry :business_mission_distruption v/ImpactRating
            :description (str "characterizes (at a high level) the level of "
                              "business or mission disruption impact that "
                              "occured in the Incident"))
   (f/entry :response_and_recovery_costs v/ImpactRating
            :description (str "characterizes (at a high level) the level of "
                              "response and recovery RELATED costs that occurred "
                              "in the Incident")))
  :reference "[DirectImpactSummaryType](http://stixproject.github.io/data-model/1.2/incident/DirectImpactSummaryType/)")

(def-map-type IndirectImpactSummary
  (f/optional-entries
   (f/entry :loss_of_competitive_advantage v/SecurityCompromise
            :description (str "characterizes (at a high level) the level of "
                              "impact based on loss of competitive advantage "
                              "that occured in the Incident"))
   (f/entry :brand_and_market_damage v/SecurityCompromise
            :description (str "characterizes (at a high level) the level of "
                              "impact based on brand or market damage that "
                              "occured in the Incident"))
   (f/entry :increased_operating_costs v/SecurityCompromise
            :description (str "characterizes (at a high level) the level of "
                              "impact based on increased operating costs that "
                              "occured in the Incident"))
   (f/entry :local_and_regulatory_costs v/SecurityCompromise))
  :reference "[IndirectImpactSummaryType](http://stixproject.github.io/data-model/1.2/incident/IndirectImpactSummaryType/)")

(def-map-type LossEstimation
  (f/optional-entries
   (f/entry :amount f/any-int
            :description "the estimated financial loss for the Incident")
   (f/entry :iso_currency_code f/any-str
            :description "ISO 4217 currency code if other than USD"))
  :reference "[LossEstimationType](http://stixproject.github.io/data-model/1.2/incident/LossEstimationType/)")

(def-map-type TotalLossEstimation
  (f/optional-entries
   (f/entry :initial_reported_total_loss_estimation LossEstimation
            :description (str "specifies the initially reported level of total "
                              "estimated financial loss for the Incident"))
   (f/entry :actual_total_loss_estimation LossEstimation
            :description (str "specifies the actual level of total estimated "
                              "financial loss for the Incident")))
  :reference "[TotalLossEstimationType](http://stixproject.github.io/data-model/1.2/incident/TotalLossEstimationType/)")

(def-map-type ImpactAssessment
  (f/optional-entries
   (f/entry :direct_impact_summary DirectImpactSummary
            :description (str "characterizes (at a high level) losses directly"
                              " resulting from the ThreatActor's actions"
                              " against organizational assets within the Incident"))
   (f/entry :indirect_impact_summary IndirectImpactSummary
            :description (str "characterizes (at a high level) losses from other "
                              "stakeholder reactions to the Incident"))
   (f/entry :total_loss_estimation TotalLossEstimation
            :description (str "specifies the total estimated financial loss for "
                              "the Incident"))
   (f/entry :impact_qualification v/ImpactQualification
            :description (str "summarizes the subjective level of impact of the "
                              "Incident"))
   (f/entry :effects [v/Effect]
            :description (str "list of effects of this incident from a "
                              "controlled vocabulary"))
   ;; Not provided: external_impact_assessment_model
   )
  :reference " [ImpactAssessmentType](http://stixproject.github.io/data-model/1.2/incident/ImpactAssessmentType/)")

(def-map-type IncidentTime
  (f/optional-entries
   (f/entry :first_malicious_action c/Time) ;; Simplified structure
   (f/entry :initial_compromise c/Time)
   (f/entry :first_data_exfiltration c/Time)
   (f/entry :incident_discovery c/Time)
   (f/entry :incident_opened c/Time)
   (f/entry :containment_achieved c/Time)
   (f/entry :restoration_achieved c/Time)
   (f/entry :incident_reported c/Time)
   (f/entry :incident_closed c/Time))
  :reference "[TimeType](http://stixproject.github.io/data-model/1.2/incident/TimeType/)")

(def-map-type History
  (f/optional-entries
   (f/entry :action_entry [COARequested]
            :description (str "a record of actions taken during the handling of "
                              "the Incident"))
   (f/entry :journal_entry f/any-str
            :comment "simplified"
            :description (str "journal notes for information discovered"
                              " during the handling of the Incident")))
  :reference "[HistoryItemType](http://stixproject.github.io/data-model/1.2/incident/HistoryItemType/)")

(def type-identifier "incident")

(def-eq IncidentTypeIdentifier type-identifier)

(def incident-desc
   "Discrete instance of indicators affecting an organization as well
  as information associated with incident response")

(def incident-desc-link
  "[IncidentType](http://stixproject.github.io/data-model/1.2/incident/IncidentType/)")

(def-entity-type Incident
  {:description incident-desc
   :reference incident-desc-link}
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type IncidentTypeIdentifier)
   (f/entry :valid_time c/ValidTime
            :description (str "time stamp for the definition of a specific "
                              "version of an Incident"))
   (f/entry :confidence v/HighMedLow
            :description (str "level of confidence held in the characterization "
                              "of this Incident")))
  (f/optional-entries
   (f/entry :status v/Status
            :description "current status of the incident")
   (f/entry :incident_time IncidentTime
            :comment "Was 'time'; renamed for clarity"
            :description "relevant time values associated with this Incident")
   (f/entry :categories [v/IncidentCategory]
            :description "a set of categories for this incident")
   (f/entry :reporter f/any-str
            :description "information about the reporting source of this Incident")
   (f/entry :responder f/any-str
            :description (str "information about the assigned responder for this "
                              "Incident"))
   (f/entry :coordinator f/any-str
            :description (str "information about the assigned coordinator for "
                              "this Incident"))
   (f/entry :victim f/any-str
            :description "information about a victim of this Incident")
   (f/entry :affected_assets [AffectedAsset]
            :description "particular assets affected during the Incident")
   (f/entry :impact_assessment ImpactAssessment
            :description (str "a summary assessment of impact for this cyber "
                              "threat Incident"))
   (f/entry :security_compromise v/SecurityCompromise
            :description (str "knowledge of whether the Incident involved a"
                              " compromise of security properties"))
   (f/entry :discovery_method v/DiscoveryMethod
            :description "identifies how the incident was discovered")
   (f/entry :COA_requested [COARequested]
            :description (str "specifies and characterizes requested Course Of "
                              "Action for this Incident as specified by the "
                              "Producer for the Consumer of the Incident Report"))
   (f/entry :COA_taken [COARequested]
            :description (str "specifies and characterizes a Course Of Action"
                              " taken for this Incident"))
   (f/entry :contact f/any-str
            :description (str "identifies and characterizes organizations or"
                              " personnel involved in this Incident"))
   (f/entry :history [History]
            :description (str "a log of events or actions taken during the "
                              "handling of the Incident"))

   ;; The seqs of elements below are squashed (they leave out
   ;; structured data such as confidence and source for each element).
   (f/entry :related_indicators rel/RelatedIndicators
            :description (str "identifies or characterizes one or more cyber "
                              "threat Indicators related to this cyber threat "
                              "Incident"))
   (f/entry :related_observables [c/Observable]
            :comment "Was related_observables"
            :description (str "identifies or characterizes one or more cyber"
                              " observables related to this cyber threat incident"))
   (f/entry :leveraged_TTPs rel/RelatedTTPs
            :description (str "specifies TTPs asserted to be related to this "
                              "cyber threat Incident"))
   (f/entry :attributed_actors rel/RelatedActors
            :comment "was attributed_threat_actors"
            :description (str "identifies ThreatActors asserted to be attributed "
                              "for this Incident"))
   (f/entry :related_incidents rel/RelatedIncidents
            :description (str "identifies or characterizes one or more other "
                              "Incidents related to this cyber threat Incident"))
   (f/entry :intended_effect v/IntendedEffect
            :description "specifies the suspected intended effect of this incident")
   ;; Not provided: URL
   ;; Not provided: external_id
   ;; Not provided: handling
   ;; Not provided: related_packages (deprecated)
   ))

(def-entity-type NewIncident
  "For submitting a new Incident"
  (:entries Incident)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :valid_time c/ValidTime)
   (f/entry :type IncidentTypeIdentifier)))


(def-entity-type StoredIncident
  "An incident as stored in the data store"
  (:entries Incident)
  c/base-stored-entity-entries)

(def IncidentRef
  (c/ref-for-type type-identifier))
