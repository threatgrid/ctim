<a name="top"/>
# *Incident* Map

http://stixproject.github.io/data-model/1.2/incident/IncidentType/


## MapEntry: :id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :id

### String Value

The URI of this entity.

* Plumatic Schema: Str

## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :schema_version -> String

CTIM schema version for this entity

* This entry is required

### Keyword Key

* Plumatic Schema: :schema_version

### String Value

* Plumatic Schema: (enum "0.1.8")
* Must equal: "0.1.8"

## MapEntry: :uri -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :uri

### String Value

A URI

* Plumatic Schema: Str

## MapEntry: :revision -> Integer

* This entry is optional

### Keyword Key

* Plumatic Schema: :revision

### Integer Value

* Plumatic Schema: Int

## MapEntry: :external_ids -> [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :external_ids

#### String Value

* Plumatic Schema: [java.lang.String]

## MapEntry: :timestamp -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :timestamp

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :language -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :language

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :tlp -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :tlp

### String Value

TLP Stand for Traffic Light Protocol (https://www.us-cert.gov/tlp). Precise how this resource is intended to be shared, replicated, copied...

* Plumatic Schema: (enum "white" "green" "red" "amber")
* Default: green
* Allowed Values: ("amber" "green" "red" "white")

## MapEntry: :title -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :title

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :description -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :description

### String Value

Markdown text

* Plumatic Schema: Str

## MapEntry: :short_description -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :short_description

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :source -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :source

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :source_uri -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :source_uri

### String Value

A URI

* Plumatic Schema: Str

## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "incident")
* Must equal: "incident"

## MapEntry: :valid_time -> Map

time stamp for the definition of a specific version of an Incident

* This entry is required

### Keyword Key

* Plumatic Schema: :valid_time

<a name="map1-ref"/>
### Map Value

[Map](#map1)

## MapEntry: :confidence -> String

level of confidence held in the characterization of this Incident

* This entry is required

### Keyword Key

* Plumatic Schema: :confidence

### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :status -> String

current status of the incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :status

### String Value

* Plumatic Schema: (enum "New" "Closed" "Rejected" "Open" "Restoration Achieved" "Incident Reported" "Stalled" "Deleted" "Containment Achieved")
* Allowed Values: ("Closed" "Containment Achieved" "Deleted" "Incident Reported" "New" "Open" "Rejected" "Restoration Achieved" "Stalled")

## MapEntry: :incident_time -> *IncidentTime* Map

relevant time values associated with this Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :incident_time

<a name="map2-ref"/>
### *IncidentTime* Map Value

[*IncidentTime* Map](#map2)

## MapEntry: :categories -> [String]

a set of categories for this incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :categories

#### String Value

* Plumatic Schema: [(enum "Exercise/Network Defense Testing" "Malicious Code" "Improper Usage" "Scans/Probes/Attempted Access" "Investigation" "Unauthorized Access" "Denial of Service")]
* Allowed Values: ("Denial of Service" "Exercise/Network Defense Testing" "Improper Usage" "Investigation" "Malicious Code" "Scans/Probes/Attempted Access" "Unauthorized Access")

## MapEntry: :reporter -> String

information about the reporting source of this Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :reporter

### String Value

* Plumatic Schema: Str

## MapEntry: :responder -> String

information about the assigned responder for this Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :responder

### String Value

* Plumatic Schema: Str

## MapEntry: :coordinator -> String

information about the assigned coordinator for this Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :coordinator

### String Value

* Plumatic Schema: Str

## MapEntry: :victim -> String

information about a victim of this Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :victim

### String Value

* Plumatic Schema: Str

## MapEntry: :affected_assets -> [*AffectedAsset* Map]

particular assets affected during the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :affected_assets

<a name="map3-ref"/>
#### *AffectedAsset* Map Value

[*AffectedAsset* Map](#map3)

## MapEntry: :impact_assessment -> *ImpactAssessment* Map

a summary assessment of impact for this cyber threat Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :impact_assessment

<a name="map4-ref"/>
### *ImpactAssessment* Map Value

[*ImpactAssessment* Map](#map4)

## MapEntry: :security_compromise -> String

knowledge of whether the Incident involved a compromise of security properties

* This entry is optional

### Keyword Key

* Plumatic Schema: :security_compromise

### String Value

* Plumatic Schema: (enum "Unknown" "Yes" "Suspected" "No")
* Allowed Values: ("No" "Suspected" "Unknown" "Yes")

## MapEntry: :discovery_method -> String

identifies how the incident was discovered

* This entry is optional

### Keyword Key

* Plumatic Schema: :discovery_method

### String Value

* Plumatic Schema: (enum "NIDS" "HIPS" "Law Enforcement" "Customer" "User" "IT Audit" "Unknown" "Monitoring Service" "Incident Response" "Agent Disclosure" "Log Review" "Security Alarm" "External - Fraud Detection" "Audit" "Financial Audit" "Antivirus" "Unrelated Party" "Internal - Fraud Detection")
* Allowed Values: ("Agent Disclosure" "Antivirus" "Audit" "Customer" "External - Fraud Detection" "Financial Audit" "HIPS" "IT Audit" "Incident Response" "Internal - Fraud Detection" "Law Enforcement" "Log Review" "Monitoring Service" "NIDS" "Security Alarm" "Unknown" "Unrelated Party" "User")

## MapEntry: :COA_requested -> [*COARequested* Map]

specifies and characterizes requested Course Of Action for this Incident as specified by the Producer for the Consumer of the Incident Report

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :COA_requested

<a name="map5-ref"/>
#### *COARequested* Map Value

[*COARequested* Map](#map5)

## MapEntry: :COA_taken -> [*COARequested* Map]

specifies and characterizes a Course Of Action taken for this Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :COA_taken

<a name="map6-ref"/>
#### *COARequested* Map Value

[*COARequested* Map](#map6)

## MapEntry: :contact -> String

identifies and characterizes organizations or personnel involved in this Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :contact

### String Value

* Plumatic Schema: Str

## MapEntry: :history -> [*History* Map]

a log of events or actions taken during the handling of the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :history

<a name="map7-ref"/>
#### *History* Map Value

[*History* Map](#map7)

## MapEntry: :related_indicators -> [*RelatedIndicator* Map]

identifies or characterizes one or more cyber threat Indicators related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :related_indicators

<a name="map8-ref"/>
#### *RelatedIndicator* Map Value

[*RelatedIndicator* Map](#map8)

## MapEntry: :related_observables -> [Map]

identifies or characterizes one or more cyber observables related to this cyber threat incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :related_observables

<a name="map9-ref"/>
#### Map Value

[Map](#map9)

## MapEntry: :leveraged_TTPs -> [*RelatedTTP* Map]

specifies TTPs asserted to be related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :leveraged_TTPs

<a name="map10-ref"/>
#### *RelatedTTP* Map Value

[*RelatedTTP* Map](#map10)

## MapEntry: :attributed_actors -> [*RelatedActor* Map]

identifies ThreatActors asserted to be attributed for this Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :attributed_actors

<a name="map11-ref"/>
#### *RelatedActor* Map Value

[*RelatedActor* Map](#map11)

## MapEntry: :related_incidents -> [*RelatedIncident* Map]

identifies or characterizes one or more other Incidents related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :related_incidents

<a name="map12-ref"/>
#### *RelatedIncident* Map Value

[*RelatedIncident* Map](#map12)

## MapEntry: :intended_effect -> String

specifies the suspected intended effect of this incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :intended_effect

### String Value

* Plumatic Schema: (enum "Denial and Deception" "Destruction" "Fraud" "Extortion" "Advantage - Military" "Disruption" "Account Takeover" "Theft - Theft of Proprietary Information" "Degradation of Service" "Theft - Identity Theft" "Advantage - Political" "Exposure" "Traffic Diversion" "Embarrassment" "Theft - Intellectual Property" "Theft - Credential Theft" "Competitive Advantage" "Brand Damage" "Advantage - Economic" "Harassment" "Unauthorized Access" "ICS Control" "Theft" "Advantage")
* Allowed Values: ("Account Takeover" "Advantage" "Advantage - Economic" "Advantage - Military" "Advantage - Political" "Brand Damage" "Competitive Advantage" "Degradation of Service" "Denial and Deception" "Destruction" "Disruption" "Embarrassment" "Exposure" "Extortion" "Fraud" "Harassment" "ICS Control" "Theft" "Theft - Credential Theft" "Theft - Identity Theft" "Theft - Intellectual Property" "Theft - Theft of Proprietary Information" "Traffic Diversion" "Unauthorized Access")

<a name="map1"/>
# Map

[return](#map1-ref)

* Reference: http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/

## MapEntry: :start_time -> Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

### Keyword Key

* Plumatic Schema: :start_time

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :end_time -> Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

### Keyword Key

* Plumatic Schema: :end_time

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

<a name="map2"/>
# *IncidentTime* Map

[return](#map2-ref)

* Reference: http://stixproject.github.io/data-model/1.2/incident/TimeType/

## MapEntry: :first_malicious_action -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :first_malicious_action

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :initial_compromise -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :initial_compromise

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :first_data_exfiltration -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :first_data_exfiltration

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :incident_discovery -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :incident_discovery

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :incident_opened -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :incident_opened

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :containment_achieved -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :containment_achieved

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :restoration_achieved -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :restoration_achieved

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :incident_reported -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :incident_reported

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :incident_closed -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :incident_closed

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

<a name="map3"/>
# *AffectedAsset* Map

[return](#map3-ref)

* Reference: http://stixproject.github.io/data-model/1.2/incident/AffectedAssetType/

## MapEntry: :type -> String

type of the asset impacted by the incident (a security attribute was negatively affected).

* This entry is optional

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: Str

## MapEntry: :description -> String

text description of the asset

* This entry is optional

### Keyword Key

* Plumatic Schema: :description

### String Value

* Plumatic Schema: Str

## MapEntry: :ownership_class -> String

high-level characterization of who owns (or controls) this asset

* This entry is optional

### Keyword Key

* Plumatic Schema: :ownership_class

### String Value

* Plumatic Schema: (enum "Unknown" "Internally-Owned" "Employee-Owned" "Partner-Owned" "Customer-Owned")
* Allowed Values: ("Customer-Owned" "Employee-Owned" "Internally-Owned" "Partner-Owned" "Unknown")

## MapEntry: :management_class -> String

high-level characterization of who is responsible for the day-to-day management and administration of this asset

* This entry is optional

### Keyword Key

* Plumatic Schema: :management_class

### String Value

* Plumatic Schema: (enum "Internally-Managed" "CO-Management" "Unknown" "Externally-Management")
* Allowed Values: ("CO-Management" "Externally-Management" "Internally-Managed" "Unknown")

## MapEntry: :location_class -> String

high-level characterization of where this asset is physically located

* This entry is optional

### Keyword Key

* Plumatic Schema: :location_class

### String Value

* Plumatic Schema: (enum "Unknown" "Internally-Located" "Mobile" "Externally-Located" "Co-Located")
* Allowed Values: ("Co-Located" "Externally-Located" "Internally-Located" "Mobile" "Unknown")

## MapEntry: :property_affected -> *PropertyAffected* Map

affected property

* This entry is optional

### Keyword Key

* Plumatic Schema: :property_affected

<a name="map10-ref"/>
### *PropertyAffected* Map Value

[*PropertyAffected* Map](#map10)

## MapEntry: :identifying_observables -> [Map]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :identifying_observables

<a name="map11-ref"/>
#### Map Value

[Map](#map11)

<a name="map11"/>
# Map

[return](#map11-ref)

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.


## MapEntry: :value -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :value

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

Observable type names

* Plumatic Schema: (enum "device" "url" "pki-serial" "user" "ipv6" "email" "sha256" "sha1" "md5" "ip" "domain" "imei" "imsi" "amp-device")
* Allowed Values: ("amp-device" "device" "domain" "email" "imei" "imsi" "ip" "ipv6" "md5" "pki-serial" "sha1" "sha256" "url" "user")

<a name="map10"/>
# *PropertyAffected* Map

[return](#map10-ref)

* Reference: http://stixproject.github.io/data-model/1.2/incident/PropertyAffectedType/

## MapEntry: :property -> String

security property that was affected by the incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :property

### String Value

* Plumatic Schema: (enum "Accountability" "Confidentiality" "Non-Repudiation" "Availability" "Integrity")
* Allowed Values: ("Accountability" "Availability" "Confidentiality" "Integrity" "Non-Repudiation")

## MapEntry: :description_of_effect -> String

a brief prose description of how the security property was affected

* This entry is optional

### Keyword Key

* Plumatic Schema: :description_of_effect

### String Value

* Plumatic Schema: Str

## MapEntry: :type_of_availability_loss -> String

characterizes in what manner the availability of this asset was affected

* This entry is optional

### Keyword Key

* Plumatic Schema: :type_of_availability_loss

### String Value

* Plumatic Schema: Str

## MapEntry: :duration_of_availability_loss -> String

approximate length of time availability was affected

* This entry is optional

### Keyword Key

* Plumatic Schema: :duration_of_availability_loss

### String Value

* Plumatic Schema: (enum "Permanent" "Unknown" "Minutes" "Hours" "Days" "Weeks" "Seconds")
* Allowed Values: ("Days" "Hours" "Minutes" "Permanent" "Seconds" "Unknown" "Weeks")

## MapEntry: :non_public_data_compromised -> *NonPublicDataCompromised* Map

approximate length of time availability was affected

* This entry is optional

### Keyword Key

* Plumatic Schema: :non_public_data_compromised

<a name="map10-ref"/>
### *NonPublicDataCompromised* Map Value

[*NonPublicDataCompromised* Map](#map10)

<a name="map10"/>
# *NonPublicDataCompromised* Map

[return](#map10-ref)

* Reference: http://stixproject.github.io/data-model/1.2/incident/NonPublicDataCompromisedType/

## MapEntry: :security_compromise -> String

related security compromise

* This entry is required

### Keyword Key

* Plumatic Schema: :security_compromise

### String Value

* Plumatic Schema: (enum "Unknown" "Yes" "Suspected" "No")
* Allowed Values: ("No" "Suspected" "Unknown" "Yes")

## MapEntry: :data_encrypted -> Boolean

whether the data that was compromised was encrypted or not

* This entry is optional

### Keyword Key

* Plumatic Schema: :data_encrypted

### Boolean Value

* Plumatic Schema: Bool

<a name="map4"/>
# *ImpactAssessment* Map

[return](#map4-ref)

* Reference:  http://stixproject.github.io/data-model/1.2/incident/ImpactAssessmentType/

## MapEntry: :direct_impact_summary -> *DirectImpactSummary* Map

characterizes (at a high level) losses directly resulting from the ThreatActor's actions against organizational assets within the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :direct_impact_summary

<a name="map9-ref"/>
### *DirectImpactSummary* Map Value

[*DirectImpactSummary* Map](#map9)

## MapEntry: :indirect_impact_summary -> *IndirectImpactSummary* Map

characterizes (at a high level) losses from other stakeholder reactions to the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :indirect_impact_summary

<a name="map10-ref"/>
### *IndirectImpactSummary* Map Value

[*IndirectImpactSummary* Map](#map10)

## MapEntry: :total_loss_estimation -> *TotalLossEstimation* Map

specifies the total estimated financial loss for the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :total_loss_estimation

<a name="map11-ref"/>
### *TotalLossEstimation* Map Value

[*TotalLossEstimation* Map](#map11)

## MapEntry: :impact_qualification -> String

summarizes the subjective level of impact of the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :impact_qualification

### String Value

* Plumatic Schema: (enum "Insignificant" "Damaging" "Distracting" "Unknown" "Painful" "Catastrophic")
* Allowed Values: ("Catastrophic" "Damaging" "Distracting" "Insignificant" "Painful" "Unknown")

## MapEntry: :effects -> [String]

list of effects of this incident from a controlled vocabulary

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :effects

#### String Value

* Plumatic Schema: [(enum "Destruction" "Loss of Competitive Advantage - Economic" "User Data Loss" "Loss of Competitive Advantage - Military" "Disruption of Service / Operations" "Loss of Competitive Advantage" "Unintended Access" "Data Breach or Compromise" "Degradation of Service" "Financial Loss" "Regulatory, Compliance or Legal Impact" "Loss of Competitive Advantage - Political" "Brand or Image Degradation" "Loss of Confidential / Proprietary Information or Intellectual Property")]
* Allowed Values: ("Brand or Image Degradation" "Data Breach or Compromise" "Degradation of Service" "Destruction" "Disruption of Service / Operations" "Financial Loss" "Loss of Competitive Advantage" "Loss of Competitive Advantage - Economic" "Loss of Competitive Advantage - Military" "Loss of Competitive Advantage - Political" "Loss of Confidential / Proprietary Information or Intellectual Property" "Regulatory, Compliance or Legal Impact" "Unintended Access" "User Data Loss")

<a name="map11"/>
# *TotalLossEstimation* Map

[return](#map11-ref)

* Reference: http://stixproject.github.io/data-model/1.2/incident/TotalLossEstimationType/

## MapEntry: :initial_reported_total_loss_estimation -> *LossEstimation* Map

specifies the initially reported level of total estimated financial loss for the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :initial_reported_total_loss_estimation

<a name="map11-ref"/>
### *LossEstimation* Map Value

[*LossEstimation* Map](#map11)

## MapEntry: :actual_total_loss_estimation -> *LossEstimation* Map

specifies the actual level of total estimated financial loss for the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :actual_total_loss_estimation

<a name="map12-ref"/>
### *LossEstimation* Map Value

[*LossEstimation* Map](#map12)

<a name="map12"/>
# *LossEstimation* Map

[return](#map12-ref)

* Reference: http://stixproject.github.io/data-model/1.2/incident/LossEstimationType/

## MapEntry: :amount -> Integer

the estimated financial loss for the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :amount

### Integer Value

* Plumatic Schema: Int

## MapEntry: :iso_currency_code -> String

ISO 4217 currency code if other than USD

* This entry is optional

### Keyword Key

* Plumatic Schema: :iso_currency_code

### String Value

* Plumatic Schema: Str

<a name="map11"/>
# *LossEstimation* Map

[return](#map11-ref)

* Reference: http://stixproject.github.io/data-model/1.2/incident/LossEstimationType/

## MapEntry: :amount -> Integer

the estimated financial loss for the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :amount

### Integer Value

* Plumatic Schema: Int

## MapEntry: :iso_currency_code -> String

ISO 4217 currency code if other than USD

* This entry is optional

### Keyword Key

* Plumatic Schema: :iso_currency_code

### String Value

* Plumatic Schema: Str

<a name="map10"/>
# *IndirectImpactSummary* Map

[return](#map10-ref)

* Reference: http://stixproject.github.io/data-model/1.2/incident/IndirectImpactSummaryType/

## MapEntry: :loss_of_competitive_advantage -> String

characterizes (at a high level) the level of impact based on loss of competitive advantage that occured in the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :loss_of_competitive_advantage

### String Value

* Plumatic Schema: (enum "Unknown" "Yes" "Suspected" "No")
* Allowed Values: ("No" "Suspected" "Unknown" "Yes")

## MapEntry: :brand_and_market_damage -> String

characterizes (at a high level) the level of impact based on brand or market damage that occured in the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :brand_and_market_damage

### String Value

* Plumatic Schema: (enum "Unknown" "Yes" "Suspected" "No")
* Allowed Values: ("No" "Suspected" "Unknown" "Yes")

## MapEntry: :increased_operating_costs -> String

characterizes (at a high level) the level of impact based on increased operating costs that occured in the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :increased_operating_costs

### String Value

* Plumatic Schema: (enum "Unknown" "Yes" "Suspected" "No")
* Allowed Values: ("No" "Suspected" "Unknown" "Yes")

## MapEntry: :local_and_regulatory_costs -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :local_and_regulatory_costs

### String Value

* Plumatic Schema: (enum "Unknown" "Yes" "Suspected" "No")
* Allowed Values: ("No" "Suspected" "Unknown" "Yes")

<a name="map9"/>
# *DirectImpactSummary* Map

[return](#map9-ref)

* Reference: http://stixproject.github.io/data-model/1.2/incident/DirectImpactSummaryType/

## MapEntry: :asset_losses -> String

level of asset-related losses that occured in the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :asset_losses

### String Value

* Plumatic Schema: (enum "Major" "Minor" "Moderate" "Unknown" "None")
* Allowed Values: ("Major" "Minor" "Moderate" "None" "Unknown")

## MapEntry: :business_mission_distruption -> String

characterizes (at a high level) the level of business or mission disruption impact that occured in the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :business_mission_distruption

### String Value

* Plumatic Schema: (enum "Major" "Minor" "Moderate" "Unknown" "None")
* Allowed Values: ("Major" "Minor" "Moderate" "None" "Unknown")

## MapEntry: :response_and_recovery_costs -> String

characterizes (at a high level) the level of response and recovery RELATED costs that occurred in the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :response_and_recovery_costs

### String Value

* Plumatic Schema: (enum "Major" "Minor" "Moderate" "Unknown" "None")
* Allowed Values: ("Major" "Minor" "Moderate" "None" "Unknown")

<a name="map5"/>
# *COARequested* Map

[return](#map5-ref)

* Reference: ["http://stixproject.github.io/data-model/1.2/incident/COARequestedType/" "http://stixproject.github.io/data-model/1.2/incident/COATakenType/"]

## MapEntry: :COA -> String

COA reference

* This entry is required

### Keyword Key

* Plumatic Schema: :COA

### String Value

A URI leading to a COA

* Plumatic Schema: Str

## MapEntry: :time -> Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional

### Keyword Key

* Plumatic Schema: :time

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :contributors -> [Map]

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :contributors

<a name="map8-ref"/>
#### Map Value

[Map](#map8)

<a name="map8"/>
# Map

[return](#map8-ref)

* Reference: http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/

## MapEntry: :role -> String

role played by this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :role

### String Value

* Plumatic Schema: Str

## MapEntry: :name -> String

name of this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :name

### String Value

* Plumatic Schema: Str

## MapEntry: :email -> String

email of this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :email

### String Value

* Plumatic Schema: Str

## MapEntry: :phone -> String

telephone number of this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :phone

### String Value

* Plumatic Schema: Str

## MapEntry: :organization -> String

organization name of this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :organization

### String Value

* Plumatic Schema: Str

## MapEntry: :date -> Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional

### Keyword Key

* Plumatic Schema: :date

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :contribution_location -> String

information describing the location at which the contributory activity occured

* This entry is optional

### Keyword Key

* Plumatic Schema: :contribution_location

### String Value

* Plumatic Schema: Str

<a name="map6"/>
# *COARequested* Map

[return](#map6-ref)

* Reference: ["http://stixproject.github.io/data-model/1.2/incident/COARequestedType/" "http://stixproject.github.io/data-model/1.2/incident/COATakenType/"]

## MapEntry: :COA -> String

COA reference

* This entry is required

### Keyword Key

* Plumatic Schema: :COA

### String Value

A URI leading to a COA

* Plumatic Schema: Str

## MapEntry: :time -> Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional

### Keyword Key

* Plumatic Schema: :time

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :contributors -> [Map]

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :contributors

<a name="map7-ref"/>
#### Map Value

[Map](#map7)

<a name="map7"/>
# Map

[return](#map7-ref)

* Reference: http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/

## MapEntry: :role -> String

role played by this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :role

### String Value

* Plumatic Schema: Str

## MapEntry: :name -> String

name of this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :name

### String Value

* Plumatic Schema: Str

## MapEntry: :email -> String

email of this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :email

### String Value

* Plumatic Schema: Str

## MapEntry: :phone -> String

telephone number of this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :phone

### String Value

* Plumatic Schema: Str

## MapEntry: :organization -> String

organization name of this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :organization

### String Value

* Plumatic Schema: Str

## MapEntry: :date -> Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional

### Keyword Key

* Plumatic Schema: :date

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :contribution_location -> String

information describing the location at which the contributory activity occured

* This entry is optional

### Keyword Key

* Plumatic Schema: :contribution_location

### String Value

* Plumatic Schema: Str

<a name="map7"/>
# *History* Map

[return](#map7-ref)

* Reference: http://stixproject.github.io/data-model/1.2/incident/HistoryItemType/

## MapEntry: :action_entry -> [*COARequested* Map]

a record of actions taken during the handling of the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :action_entry

<a name="map6-ref"/>
#### *COARequested* Map Value

[*COARequested* Map](#map6)

## MapEntry: :journal_entry -> String

journal notes for information discovered during the handling of the Incident

* This entry is optional

### Keyword Key

* Plumatic Schema: :journal_entry

### String Value

* Plumatic Schema: Str

<a name="map6"/>
# *COARequested* Map

[return](#map6-ref)

* Reference: ["http://stixproject.github.io/data-model/1.2/incident/COARequestedType/" "http://stixproject.github.io/data-model/1.2/incident/COATakenType/"]

## MapEntry: :COA -> String

COA reference

* This entry is required

### Keyword Key

* Plumatic Schema: :COA

### String Value

A URI leading to a COA

* Plumatic Schema: Str

## MapEntry: :time -> Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional

### Keyword Key

* Plumatic Schema: :time

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :contributors -> [Map]

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :contributors

<a name="map6-ref"/>
#### Map Value

[Map](#map6)

<a name="map6"/>
# Map

[return](#map6-ref)

* Reference: http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/

## MapEntry: :role -> String

role played by this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :role

### String Value

* Plumatic Schema: Str

## MapEntry: :name -> String

name of this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :name

### String Value

* Plumatic Schema: Str

## MapEntry: :email -> String

email of this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :email

### String Value

* Plumatic Schema: Str

## MapEntry: :phone -> String

telephone number of this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :phone

### String Value

* Plumatic Schema: Str

## MapEntry: :organization -> String

organization name of this contributor

* This entry is optional

### Keyword Key

* Plumatic Schema: :organization

### String Value

* Plumatic Schema: Str

## MapEntry: :date -> Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional

### Keyword Key

* Plumatic Schema: :date

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :contribution_location -> String

information describing the location at which the contributory activity occured

* This entry is optional

### Keyword Key

* Plumatic Schema: :contribution_location

### String Value

* Plumatic Schema: Str

<a name="map8"/>
# *RelatedIndicator* Map

[return](#map8-ref)


## MapEntry: :confidence -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :confidence

### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :source -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :source

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :relationship -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :relationship

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :indicator_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :indicator_id

### String Value

A URI leading to an indicator

* Plumatic Schema: Str

<a name="map9"/>
# Map

[return](#map9-ref)

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.


## MapEntry: :value -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :value

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

Observable type names

* Plumatic Schema: (enum "device" "url" "pki-serial" "user" "ipv6" "email" "sha256" "sha1" "md5" "ip" "domain" "imei" "imsi" "amp-device")
* Allowed Values: ("amp-device" "device" "domain" "email" "imei" "imsi" "ip" "ipv6" "md5" "pki-serial" "sha1" "sha256" "url" "user")

<a name="map10"/>
# *RelatedTTP* Map

[return](#map10-ref)


## MapEntry: :confidence -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :confidence

### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :source -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :source

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :relationship -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :relationship

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :ttp_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :ttp_id

### String Value

A URI leading to a TTP

* Plumatic Schema: Str

<a name="map11"/>
# *RelatedActor* Map

[return](#map11-ref)


## MapEntry: :confidence -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :confidence

### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :source -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :source

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :relationship -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :relationship

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :actor_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :actor_id

### String Value

A URI leading to an actor

* Plumatic Schema: Str

<a name="map12"/>
# *RelatedIncident* Map

[return](#map12-ref)


## MapEntry: :confidence -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :confidence

### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :source -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :source

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :relationship -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :relationship

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :incident_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :incident_id

### String Value

A URI leading to an incident

* Plumatic Schema: Str
