<a name="top"/>
# *Incident* Map

[IncidentType](http://stixproject.github.io/data-model/1.2/incident/IncidentType/)


## MapEntry :id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :id

* String Value
  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.
  * Plumatic Schema: Str

## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: Str

## MapEntry :schema_version ∷ String

CTIM schema version for this entity

* This entry is required

* Keyword Key
  * Plumatic Schema: :schema_version

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "0.2.0"

## MapEntry :uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :uri

* String Value
  * A URI
  * Plumatic Schema: Str

## MapEntry :revision ∷ Integer

* This entry is optional

* Keyword Key
  * Plumatic Schema: :revision

* Integer Value
  * Plumatic Schema: Int

## MapEntry :external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :external_ids

* String Value
  * Plumatic Schema: [Str]

## MapEntry :timestamp ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :timestamp

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :language ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :language

* String Value
  * Plumatic Schema: Str

## MapEntry :tlp ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :tlp

* String Value
  * TLP Stand for [Traffic Light Protocol](https://www.us-cert.gov/tlp). It indicates precisely how this resource is intended to be shared, replicated, copied...
  * Plumatic Schema: (enum ...)
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

## MapEntry :title ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :title

* String Value
  * Plumatic Schema: Str

## MapEntry :description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

## MapEntry :short_description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * Plumatic Schema: Str

## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry :source_uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source_uri

* String Value
  * A URI
  * Plumatic Schema: Str

## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "incident"

## MapEntry :valid_time ∷ *ValidTime* Map

time stamp for the definition of a specific version of an Incident

* This entry is required

* Keyword Key
  * Plumatic Schema: :valid_time

<a name="map1-ref"/>
* *ValidTime* Map Value
  * Details: [*ValidTime* Map](#map1)

## MapEntry :confidence ∷ String

level of confidence held in the characterization of this Incident

* This entry is required

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

## MapEntry :status ∷ String

current status of the incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :status

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Closed
    * Containment Achieved
    * Deleted
    * Incident Reported
    * New
    * Open
    * Rejected
    * Restoration Achieved
    * Stalled

## MapEntry :incident_time ∷ *IncidentTime* Map

relevant time values associated with this Incident

* This entry is optional
* Dev Notes: Was 'time'; renamed for clarity

* Keyword Key
  * Plumatic Schema: :incident_time

<a name="map2-ref"/>
* *IncidentTime* Map Value
  * Details: [*IncidentTime* Map](#map2)

## MapEntry :categories ∷ [String]

a set of categories for this incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :categories

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values:
    * Denial of Service
    * Exercise/Network Defense Testing
    * Improper Usage
    * Investigation
    * Malicious Code
    * Scans/Probes/Attempted Access
    * Unauthorized Access

## MapEntry :reporter ∷ String

information about the reporting source of this Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :reporter

* String Value
  * Plumatic Schema: Str

## MapEntry :responder ∷ String

information about the assigned responder for this Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :responder

* String Value
  * Plumatic Schema: Str

## MapEntry :coordinator ∷ String

information about the assigned coordinator for this Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :coordinator

* String Value
  * Plumatic Schema: Str

## MapEntry :victim ∷ String

information about a victim of this Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :victim

* String Value
  * Plumatic Schema: Str

## MapEntry :affected_assets ∷ [*AffectedAsset* Map]

particular assets affected during the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :affected_assets

<a name="map3-ref"/>
* *AffectedAsset* Map Value
  * Details: [*AffectedAsset* Map](#map3)

## MapEntry :impact_assessment ∷ *ImpactAssessment* Map

a summary assessment of impact for this cyber threat Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :impact_assessment

<a name="map4-ref"/>
* *ImpactAssessment* Map Value
  * Details: [*ImpactAssessment* Map](#map4)

## MapEntry :security_compromise ∷ String

knowledge of whether the Incident involved a compromise of security properties

* This entry is optional

* Keyword Key
  * Plumatic Schema: :security_compromise

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

## MapEntry :discovery_method ∷ String

identifies how the incident was discovered

* This entry is optional

* Keyword Key
  * Plumatic Schema: :discovery_method

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Agent Disclosure
    * Antivirus
    * Audit
    * Customer
    * External - Fraud Detection
    * Financial Audit
    * HIPS
    * IT Audit
    * Incident Response
    * Internal - Fraud Detection
    * Law Enforcement
    * Log Review
    * Monitoring Service
    * NIDS
    * Security Alarm
    * Unknown
    * Unrelated Party
    * User

## MapEntry :COA_requested ∷ [*COARequested* Map]

specifies and characterizes requested Course Of Action for this Incident as specified by the Producer for the Consumer of the Incident Report

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :COA_requested

<a name="map5-ref"/>
* *COARequested* Map Value
  * Details: [*COARequested* Map](#map5)

## MapEntry :COA_taken ∷ [*COARequested* Map]

specifies and characterizes a Course Of Action taken for this Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :COA_taken

<a name="map6-ref"/>
* *COARequested* Map Value
  * Details: [*COARequested* Map](#map6)

## MapEntry :contact ∷ String

identifies and characterizes organizations or personnel involved in this Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :contact

* String Value
  * Plumatic Schema: Str

## MapEntry :history ∷ [*History* Map]

a log of events or actions taken during the handling of the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :history

<a name="map7-ref"/>
* *History* Map Value
  * Details: [*History* Map](#map7)

## MapEntry :related_indicators ∷ [*RelatedIndicator* Map]

identifies or characterizes one or more cyber threat Indicators related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_indicators

<a name="map8-ref"/>
* *RelatedIndicator* Map Value
  * Details: [*RelatedIndicator* Map](#map8)

## MapEntry :related_observables ∷ [*Observable* Map]

identifies or characterizes one or more cyber observables related to this cyber threat incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Was related_observables

* Keyword Key
  * Plumatic Schema: :related_observables

<a name="map9-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map9)

## MapEntry :leveraged_TTPs ∷ [*RelatedTTP* Map]

specifies TTPs asserted to be related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :leveraged_TTPs

<a name="map10-ref"/>
* *RelatedTTP* Map Value
  * Details: [*RelatedTTP* Map](#map10)

## MapEntry :attributed_actors ∷ [*RelatedActor* Map]

identifies ThreatActors asserted to be attributed for this Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: was attributed_threat_actors

* Keyword Key
  * Plumatic Schema: :attributed_actors

<a name="map11-ref"/>
* *RelatedActor* Map Value
  * Details: [*RelatedActor* Map](#map11)

## MapEntry :related_incidents ∷ [*RelatedIncident* Map]

identifies or characterizes one or more other Incidents related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_incidents

<a name="map12-ref"/>
* *RelatedIncident* Map Value
  * Details: [*RelatedIncident* Map](#map12)

## MapEntry :intended_effect ∷ String

specifies the suspected intended effect of this incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :intended_effect

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Account Takeover
    * Advantage
    * Advantage - Economic
    * Advantage - Military
    * Advantage - Political
    * Brand Damage
    * Competitive Advantage
    * Degradation of Service
    * Denial and Deception
    * Destruction
    * Disruption
    * Embarrassment
    * Exposure
    * Extortion
    * Fraud
    * Harassment
    * ICS Control
    * Theft
    * Theft - Credential Theft
    * Theft - Identity Theft
    * Theft - Intellectual Property
    * Theft - Theft of Proprietary Information
    * Traffic Diversion
    * Unauthorized Access

<a name="map1"/>
# *ValidTime* Map

[return](#map1-ref)

Period of time when a cyber observation is valid.

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

## MapEntry :start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

* Keyword Key
  * Plumatic Schema: :start_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :end_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

* Keyword Key
  * Plumatic Schema: :end_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

<a name="map2"/>
# *IncidentTime* Map

[return](#map2-ref)

* Reference: [TimeType](http://stixproject.github.io/data-model/1.2/incident/TimeType/)

## MapEntry :first_malicious_action ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :first_malicious_action

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :initial_compromise ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :initial_compromise

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :first_data_exfiltration ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :first_data_exfiltration

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :incident_discovery ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :incident_discovery

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :incident_opened ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :incident_opened

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :containment_achieved ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :containment_achieved

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :restoration_achieved ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :restoration_achieved

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :incident_reported ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :incident_reported

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :incident_closed ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :incident_closed

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

<a name="map3"/>
# *AffectedAsset* Map

[return](#map3-ref)

* Reference: [AffectedAssetType](http://stixproject.github.io/data-model/1.2/incident/AffectedAssetType/)

## MapEntry :type ∷ String

type of the asset impacted by the incident (a security attribute was negatively affected).

* This entry is optional

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: Str

## MapEntry :description ∷ String

text description of the asset

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Plumatic Schema: Str

## MapEntry :ownership_class ∷ String

high-level characterization of who owns (or controls) this asset

* This entry is optional

* Keyword Key
  * Plumatic Schema: :ownership_class

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Customer-Owned
    * Employee-Owned
    * Internally-Owned
    * Partner-Owned
    * Unknown

## MapEntry :management_class ∷ String

high-level characterization of who is responsible for the day-to-day management and administration of this asset

* This entry is optional

* Keyword Key
  * Plumatic Schema: :management_class

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * CO-Management
    * Externally-Management
    * Internally-Managed
    * Unknown

## MapEntry :location_class ∷ String

high-level characterization of where this asset is physically located

* This entry is optional

* Keyword Key
  * Plumatic Schema: :location_class

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Co-Located
    * Externally-Located
    * Internally-Located
    * Mobile
    * Unknown

## MapEntry :property_affected ∷ *PropertyAffected* Map

affected property

* This entry is optional
* Dev Notes: Unnested NatureOfSecurityEffect

* Keyword Key
  * Plumatic Schema: :property_affected

<a name="map13-ref"/>
* *PropertyAffected* Map Value
  * Details: [*PropertyAffected* Map](#map13)

## MapEntry :identifying_observables ∷ [*Observable* Map]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :identifying_observables

<a name="map14-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map14)

<a name="map14"/>
# *Observable* Map

[return](#map14-ref)

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.


## MapEntry :value ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Observable type names
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * amp-device
    * device
    * domain
    * email
    * imei
    * imsi
    * ip
    * ipv6
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a name="map13"/>
# *PropertyAffected* Map

[return](#map13-ref)

* Reference: [PropertyAffectedTpye](http://stixproject.github.io/data-model/1.2/incident/PropertyAffectedType/)

## MapEntry :property ∷ String

security property that was affected by the incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :property

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Accountability
    * Availability
    * Confidentiality
    * Integrity
    * Non-Repudiation

## MapEntry :description_of_effect ∷ String

a brief prose description of how the security property was affected

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description_of_effect

* String Value
  * Plumatic Schema: Str

## MapEntry :type_of_availability_loss ∷ String

characterizes in what manner the availability of this asset was affected

* This entry is optional
* Dev Notes: empty vocabulary

* Keyword Key
  * Plumatic Schema: :type_of_availability_loss

* String Value
  * Plumatic Schema: Str

## MapEntry :duration_of_availability_loss ∷ String

approximate length of time availability was affected

* This entry is optional

* Keyword Key
  * Plumatic Schema: :duration_of_availability_loss

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Days
    * Hours
    * Minutes
    * Permanent
    * Seconds
    * Unknown
    * Weeks

## MapEntry :non_public_data_compromised ∷ *NonPublicDataCompromised* Map

approximate length of time availability was affected

* This entry is optional

* Keyword Key
  * Plumatic Schema: :non_public_data_compromised

<a name="map15-ref"/>
* *NonPublicDataCompromised* Map Value
  * Details: [*NonPublicDataCompromised* Map](#map15)

<a name="map15"/>
# *NonPublicDataCompromised* Map

[return](#map15-ref)

* Reference: [NonPublicDataCompromisedType](http://stixproject.github.io/data-model/1.2/incident/NonPublicDataCompromisedType/)

## MapEntry :security_compromise ∷ String

related security compromise

* This entry is required

* Keyword Key
  * Plumatic Schema: :security_compromise

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

## MapEntry :data_encrypted ∷ Boolean

whether the data that was compromised was encrypted or not

* This entry is optional

* Keyword Key
  * Plumatic Schema: :data_encrypted

* Boolean Value
  * Plumatic Schema: Bool

<a name="map4"/>
# *ImpactAssessment* Map

[return](#map4-ref)

* Reference:  [ImpactAssessmentType](http://stixproject.github.io/data-model/1.2/incident/ImpactAssessmentType/)

## MapEntry :direct_impact_summary ∷ *DirectImpactSummary* Map

characterizes (at a high level) losses directly resulting from the ThreatActor's actions against organizational assets within the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :direct_impact_summary

<a name="map16-ref"/>
* *DirectImpactSummary* Map Value
  * Details: [*DirectImpactSummary* Map](#map16)

## MapEntry :indirect_impact_summary ∷ *IndirectImpactSummary* Map

characterizes (at a high level) losses from other stakeholder reactions to the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :indirect_impact_summary

<a name="map17-ref"/>
* *IndirectImpactSummary* Map Value
  * Details: [*IndirectImpactSummary* Map](#map17)

## MapEntry :total_loss_estimation ∷ *TotalLossEstimation* Map

specifies the total estimated financial loss for the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :total_loss_estimation

<a name="map18-ref"/>
* *TotalLossEstimation* Map Value
  * Details: [*TotalLossEstimation* Map](#map18)

## MapEntry :impact_qualification ∷ String

summarizes the subjective level of impact of the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :impact_qualification

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Catastrophic
    * Damaging
    * Distracting
    * Insignificant
    * Painful
    * Unknown

## MapEntry :effects ∷ [String]

list of effects of this incident from a controlled vocabulary

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :effects

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values:
    * Brand or Image Degradation
    * Data Breach or Compromise
    * Degradation of Service
    * Destruction
    * Disruption of Service / Operations
    * Financial Loss
    * Loss of Competitive Advantage
    * Loss of Competitive Advantage - Economic
    * Loss of Competitive Advantage - Military
    * Loss of Competitive Advantage - Political
    * Loss of Confidential / Proprietary Information or Intellectual Property
    * Regulatory, Compliance or Legal Impact
    * Unintended Access
    * User Data Loss

<a name="map18"/>
# *TotalLossEstimation* Map

[return](#map18-ref)

* Reference: [TotalLossEstimationType](http://stixproject.github.io/data-model/1.2/incident/TotalLossEstimationType/)

## MapEntry :initial_reported_total_loss_estimation ∷ *LossEstimation* Map

specifies the initially reported level of total estimated financial loss for the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :initial_reported_total_loss_estimation

<a name="map19-ref"/>
* *LossEstimation* Map Value
  * Details: [*LossEstimation* Map](#map19)

## MapEntry :actual_total_loss_estimation ∷ *LossEstimation* Map

specifies the actual level of total estimated financial loss for the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :actual_total_loss_estimation

<a name="map20-ref"/>
* *LossEstimation* Map Value
  * Details: [*LossEstimation* Map](#map20)

<a name="map20"/>
# *LossEstimation* Map

[return](#map20-ref)

* Reference: [LossEstimationType](http://stixproject.github.io/data-model/1.2/incident/LossEstimationType/)

## MapEntry :amount ∷ Integer

the estimated financial loss for the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :amount

* Integer Value
  * Plumatic Schema: Int

## MapEntry :iso_currency_code ∷ String

ISO 4217 currency code if other than USD

* This entry is optional

* Keyword Key
  * Plumatic Schema: :iso_currency_code

* String Value
  * Plumatic Schema: Str

<a name="map19"/>
# *LossEstimation* Map

[return](#map19-ref)

* Reference: [LossEstimationType](http://stixproject.github.io/data-model/1.2/incident/LossEstimationType/)

## MapEntry :amount ∷ Integer

the estimated financial loss for the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :amount

* Integer Value
  * Plumatic Schema: Int

## MapEntry :iso_currency_code ∷ String

ISO 4217 currency code if other than USD

* This entry is optional

* Keyword Key
  * Plumatic Schema: :iso_currency_code

* String Value
  * Plumatic Schema: Str

<a name="map17"/>
# *IndirectImpactSummary* Map

[return](#map17-ref)

* Reference: [IndirectImpactSummaryType](http://stixproject.github.io/data-model/1.2/incident/IndirectImpactSummaryType/)

## MapEntry :loss_of_competitive_advantage ∷ String

characterizes (at a high level) the level of impact based on loss of competitive advantage that occured in the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :loss_of_competitive_advantage

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

## MapEntry :brand_and_market_damage ∷ String

characterizes (at a high level) the level of impact based on brand or market damage that occured in the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :brand_and_market_damage

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

## MapEntry :increased_operating_costs ∷ String

characterizes (at a high level) the level of impact based on increased operating costs that occured in the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :increased_operating_costs

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

## MapEntry :local_and_regulatory_costs ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :local_and_regulatory_costs

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a name="map16"/>
# *DirectImpactSummary* Map

[return](#map16-ref)

* Reference: [DirectImpactSummaryType](http://stixproject.github.io/data-model/1.2/incident/DirectImpactSummaryType/)

## MapEntry :asset_losses ∷ String

level of asset-related losses that occured in the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :asset_losses

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Major
    * Minor
    * Moderate
    * None
    * Unknown

## MapEntry :business_mission_distruption ∷ String

characterizes (at a high level) the level of business or mission disruption impact that occured in the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :business_mission_distruption

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Major
    * Minor
    * Moderate
    * None
    * Unknown

## MapEntry :response_and_recovery_costs ∷ String

characterizes (at a high level) the level of response and recovery RELATED costs that occurred in the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :response_and_recovery_costs

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Major
    * Minor
    * Moderate
    * None
    * Unknown

<a name="map5"/>
# *COARequested* Map

[return](#map5-ref)

* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

## MapEntry :COA ∷ String

COA reference

* This entry is required

* Keyword Key
  * Plumatic Schema: :COA

* String Value
  * A URI leading to a COA
  * Plumatic Schema: Str

## MapEntry :time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional

* Keyword Key
  * Plumatic Schema: :time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :contributors ∷ [*Contributor* Map]

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :contributors

<a name="map21-ref"/>
* *Contributor* Map Value
  * Details: [*Contributor* Map](#map21)

<a name="map21"/>
# *Contributor* Map

[return](#map21-ref)

Person who contributed cyber observation data

* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

## MapEntry :role ∷ String

role played by this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :role

* String Value
  * Plumatic Schema: Str

## MapEntry :name ∷ String

name of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :name

* String Value
  * Plumatic Schema: Str

## MapEntry :email ∷ String

email of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :email

* String Value
  * Plumatic Schema: Str

## MapEntry :phone ∷ String

telephone number of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :phone

* String Value
  * Plumatic Schema: Str

## MapEntry :organization ∷ String

organization name of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :organization

* String Value
  * Plumatic Schema: Str

## MapEntry :date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional

* Keyword Key
  * Plumatic Schema: :date

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :contribution_location ∷ String

information describing the location at which the contributory activity occured

* This entry is optional

* Keyword Key
  * Plumatic Schema: :contribution_location

* String Value
  * Plumatic Schema: Str

<a name="map6"/>
# *COARequested* Map

[return](#map6-ref)

* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

## MapEntry :COA ∷ String

COA reference

* This entry is required

* Keyword Key
  * Plumatic Schema: :COA

* String Value
  * A URI leading to a COA
  * Plumatic Schema: Str

## MapEntry :time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional

* Keyword Key
  * Plumatic Schema: :time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :contributors ∷ [*Contributor* Map]

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :contributors

<a name="map22-ref"/>
* *Contributor* Map Value
  * Details: [*Contributor* Map](#map22)

<a name="map22"/>
# *Contributor* Map

[return](#map22-ref)

Person who contributed cyber observation data

* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

## MapEntry :role ∷ String

role played by this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :role

* String Value
  * Plumatic Schema: Str

## MapEntry :name ∷ String

name of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :name

* String Value
  * Plumatic Schema: Str

## MapEntry :email ∷ String

email of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :email

* String Value
  * Plumatic Schema: Str

## MapEntry :phone ∷ String

telephone number of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :phone

* String Value
  * Plumatic Schema: Str

## MapEntry :organization ∷ String

organization name of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :organization

* String Value
  * Plumatic Schema: Str

## MapEntry :date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional

* Keyword Key
  * Plumatic Schema: :date

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :contribution_location ∷ String

information describing the location at which the contributory activity occured

* This entry is optional

* Keyword Key
  * Plumatic Schema: :contribution_location

* String Value
  * Plumatic Schema: Str

<a name="map7"/>
# *History* Map

[return](#map7-ref)

* Reference: [HistoryItemType](http://stixproject.github.io/data-model/1.2/incident/HistoryItemType/)

## MapEntry :action_entry ∷ [*COARequested* Map]

a record of actions taken during the handling of the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :action_entry

<a name="map23-ref"/>
* *COARequested* Map Value
  * Details: [*COARequested* Map](#map23)

## MapEntry :journal_entry ∷ String

journal notes for information discovered during the handling of the Incident

* This entry is optional
* Dev Notes: simplified

* Keyword Key
  * Plumatic Schema: :journal_entry

* String Value
  * Plumatic Schema: Str

<a name="map23"/>
# *COARequested* Map

[return](#map23-ref)

* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

## MapEntry :COA ∷ String

COA reference

* This entry is required

* Keyword Key
  * Plumatic Schema: :COA

* String Value
  * A URI leading to a COA
  * Plumatic Schema: Str

## MapEntry :time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional

* Keyword Key
  * Plumatic Schema: :time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :contributors ∷ [*Contributor* Map]

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :contributors

<a name="map24-ref"/>
* *Contributor* Map Value
  * Details: [*Contributor* Map](#map24)

<a name="map24"/>
# *Contributor* Map

[return](#map24-ref)

Person who contributed cyber observation data

* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

## MapEntry :role ∷ String

role played by this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :role

* String Value
  * Plumatic Schema: Str

## MapEntry :name ∷ String

name of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :name

* String Value
  * Plumatic Schema: Str

## MapEntry :email ∷ String

email of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :email

* String Value
  * Plumatic Schema: Str

## MapEntry :phone ∷ String

telephone number of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :phone

* String Value
  * Plumatic Schema: Str

## MapEntry :organization ∷ String

organization name of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :organization

* String Value
  * Plumatic Schema: Str

## MapEntry :date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional

* Keyword Key
  * Plumatic Schema: :date

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :contribution_location ∷ String

information describing the location at which the contributory activity occured

* This entry is optional

* Keyword Key
  * Plumatic Schema: :contribution_location

* String Value
  * Plumatic Schema: Str

<a name="map8"/>
# *RelatedIndicator* Map

[return](#map8-ref)


## MapEntry :confidence ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

## MapEntry :indicator_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :indicator_id

* String Value
  * A URI leading to an indicator
  * Plumatic Schema: Str

<a name="map9"/>
# *Observable* Map

[return](#map9-ref)

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.


## MapEntry :value ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Observable type names
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * amp-device
    * device
    * domain
    * email
    * imei
    * imsi
    * ip
    * ipv6
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a name="map10"/>
# *RelatedTTP* Map

[return](#map10-ref)


## MapEntry :confidence ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

## MapEntry :ttp_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :ttp_id

* String Value
  * A URI leading to a TTP
  * Plumatic Schema: Str

<a name="map11"/>
# *RelatedActor* Map

[return](#map11-ref)


## MapEntry :confidence ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

## MapEntry :actor_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :actor_id

* String Value
  * A URI leading to an actor
  * Plumatic Schema: Str

<a name="map12"/>
# *RelatedIncident* Map

[return](#map12-ref)


## MapEntry :confidence ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

## MapEntry :incident_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :incident_id

* String Value
  * A URI leading to an incident
  * Plumatic Schema: Str
