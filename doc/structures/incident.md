<a name="top"/>
# *Incident* Map

Discrete instance of indicators affecting an organization as well
  as information associated with incident response

| key | type | required? |
| --- | ---- | --------- |
|[:COA_requested](#mapentry-coa_requested-coarequestedmap)|*COARequested* Map||
|[:COA_taken](#mapentry-coa_taken-coarequestedmap)|*COARequested* Map||
|[:affected_assets](#mapentry-affected_assets-affectedassetmap)|*AffectedAsset* Map||
|[:attributed_actors](#mapentry-attributed_actors-relatedactormap)|*RelatedActor* Map||
|[:categories](#mapentry-categories-string)|String||
|[:confidence](#mapentry-confidence-string)|String|&#10003;|
|[:contact](#mapentry-contact-string)|String||
|[:coordinator](#mapentry-coordinator-string)|String||
|[:description](#mapentry-description-string)|String||
|[:discovery_method](#mapentry-discovery_method-string)|String||
|[:external_ids](#mapentry-external_ids-string)|String||
|[:history](#mapentry-history-historymap)|*History* Map||
|[:id](#mapentry-id-string)|String|&#10003;|
|[:impact_assessment](#mapentry-impact_assessment-impactassessmentmap)|*ImpactAssessment* Map||
|[:incident_time](#mapentry-incident_time-incidenttimemap)|*IncidentTime* Map||
|[:intended_effect](#mapentry-intended_effect-string)|String||
|[:language](#mapentry-language-string)|String||
|[:leveraged_TTPs](#mapentry-leveraged_ttps-relatedttpmap)|*RelatedTTP* Map||
|[:related_incidents](#mapentry-related_incidents-relatedincidentmap)|*RelatedIncident* Map||
|[:related_indicators](#mapentry-related_indicators-relatedindicatormap)|*RelatedIndicator* Map||
|[:related_observables](#mapentry-related_observables-observablemap)|*Observable* Map||
|[:reporter](#mapentry-reporter-string)|String||
|[:responder](#mapentry-responder-string)|String||
|[:revision](#mapentry-revision-integer)|Integer||
|[:schema_version](#mapentry-schema_version-string)|String|&#10003;|
|[:security_compromise](#mapentry-security_compromise-string)|String||
|[:short_description](#mapentry-short_description-string)|String||
|[:source](#mapentry-source-string)|String||
|[:source_uri](#mapentry-source_uri-string)|String||
|[:status](#mapentry-status-string)|String||
|[:timestamp](#mapentry-timestamp-instdate)|Inst (Date)||
|[:title](#mapentry-title-string)|String||
|[:tlp](#mapentry-tlp-string)|String||
|[:type](#mapentry-type-string)|String|&#10003;|
|[:valid_time](#mapentry-valid_time-validtimemap)|*ValidTime* Map|&#10003;|
|[:victim](#mapentry-victim-string)|String||
* Reference: [IncidentType](http://stixproject.github.io/data-model/1.2/incident/IncidentType/)

<a name="mapentry-coa_requested-coarequestedmap"/>
## MapEntry :COA_requested ∷ [*COARequested* Map]

specifies and characterizes requested Course Of Action for this Incident as specified by the Producer for the Consumer of the Incident Report

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :COA_requested

<a name="map5-ref"/>
* *COARequested* Map Value
  * Details: [*COARequested* Map](#map5)

<a name="mapentry-coa_taken-coarequestedmap"/>
## MapEntry :COA_taken ∷ [*COARequested* Map]

specifies and characterizes a Course Of Action taken for this Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :COA_taken

<a name="map6-ref"/>
* *COARequested* Map Value
  * Details: [*COARequested* Map](#map6)

<a name="mapentry-affected_assets-affectedassetmap"/>
## MapEntry :affected_assets ∷ [*AffectedAsset* Map]

particular assets affected during the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :affected_assets

<a name="map3-ref"/>
* *AffectedAsset* Map Value
  * Details: [*AffectedAsset* Map](#map3)

<a name="mapentry-attributed_actors-relatedactormap"/>
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

<a name="mapentry-categories-string"/>
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

<a name="mapentry-confidence-string"/>
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

<a name="mapentry-contact-string"/>
## MapEntry :contact ∷ String

identifies and characterizes organizations or personnel involved in this Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :contact

* String Value
  * Plumatic Schema: Str

<a name="mapentry-coordinator-string"/>
## MapEntry :coordinator ∷ String

information about the assigned coordinator for this Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :coordinator

* String Value
  * Plumatic Schema: Str

<a name="mapentry-description-string"/>
## MapEntry :description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

<a name="mapentry-discovery_method-string"/>
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

<a name="mapentry-external_ids-string"/>
## MapEntry :external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :external_ids

* String Value
  * Plumatic Schema: [Str]

<a name="mapentry-history-historymap"/>
## MapEntry :history ∷ [*History* Map]

a log of events or actions taken during the handling of the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :history

<a name="map7-ref"/>
* *History* Map Value
  * Details: [*History* Map](#map7)

<a name="mapentry-id-string"/>
## MapEntry :id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :id

* String Value
  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.
  * Plumatic Schema: Str

<a name="mapentry-impact_assessment-impactassessmentmap"/>
## MapEntry :impact_assessment ∷ *ImpactAssessment* Map

a summary assessment of impact for this cyber threat Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :impact_assessment

<a name="map4-ref"/>
* *ImpactAssessment* Map Value
  * Details: [*ImpactAssessment* Map](#map4)

<a name="mapentry-incident_time-incidenttimemap"/>
## MapEntry :incident_time ∷ *IncidentTime* Map

relevant time values associated with this Incident

* This entry is optional
* Dev Notes: Was 'time'; renamed for clarity

* Keyword Key
  * Plumatic Schema: :incident_time

<a name="map2-ref"/>
* *IncidentTime* Map Value
  * Details: [*IncidentTime* Map](#map2)

<a name="mapentry-intended_effect-string"/>
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

<a name="mapentry-language-string"/>
## MapEntry :language ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :language

* String Value
  * Plumatic Schema: Str

<a name="mapentry-leveraged_ttps-relatedttpmap"/>
## MapEntry :leveraged_TTPs ∷ [*RelatedTTP* Map]

specifies TTPs asserted to be related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :leveraged_TTPs

<a name="map10-ref"/>
* *RelatedTTP* Map Value
  * Details: [*RelatedTTP* Map](#map10)

<a name="mapentry-related_incidents-relatedincidentmap"/>
## MapEntry :related_incidents ∷ [*RelatedIncident* Map]

identifies or characterizes one or more other Incidents related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_incidents

<a name="map12-ref"/>
* *RelatedIncident* Map Value
  * Details: [*RelatedIncident* Map](#map12)

<a name="mapentry-related_indicators-relatedindicatormap"/>
## MapEntry :related_indicators ∷ [*RelatedIndicator* Map]

identifies or characterizes one or more cyber threat Indicators related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_indicators

<a name="map8-ref"/>
* *RelatedIndicator* Map Value
  * Details: [*RelatedIndicator* Map](#map8)

<a name="mapentry-related_observables-observablemap"/>
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

<a name="mapentry-reporter-string"/>
## MapEntry :reporter ∷ String

information about the reporting source of this Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :reporter

* String Value
  * Plumatic Schema: Str

<a name="mapentry-responder-string"/>
## MapEntry :responder ∷ String

information about the assigned responder for this Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :responder

* String Value
  * Plumatic Schema: Str

<a name="mapentry-revision-integer"/>
## MapEntry :revision ∷ Integer

* This entry is optional

* Keyword Key
  * Plumatic Schema: :revision

* Integer Value
  * Plumatic Schema: Int

<a name="mapentry-schema_version-string"/>
## MapEntry :schema_version ∷ String

CTIM schema version for this entity

* This entry is required

* Keyword Key
  * Plumatic Schema: :schema_version

* String Value
  * A semantic version matching the CTIM version against which this object should be valid.
  * Plumatic Schema: Str

<a name="mapentry-security_compromise-string"/>
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

<a name="mapentry-short_description-string"/>
## MapEntry :short_description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source_uri-string"/>
## MapEntry :source_uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source_uri

* String Value
  * A URI
  * Plumatic Schema: Str

<a name="mapentry-status-string"/>
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

<a name="mapentry-timestamp-instdate"/>
## MapEntry :timestamp ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :timestamp

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-title-string"/>
## MapEntry :title ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :title

* String Value
  * Plumatic Schema: Str

<a name="mapentry-tlp-string"/>
## MapEntry :tlp ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :tlp

* String Value
  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Plumatic Schema: (enum ...)
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "incident"

<a name="mapentry-valid_time-validtimemap"/>
## MapEntry :valid_time ∷ *ValidTime* Map

time stamp for the definition of a specific version of an Incident

* This entry is required

* Keyword Key
  * Plumatic Schema: :valid_time

<a name="map1-ref"/>
* *ValidTime* Map Value
  * Details: [*ValidTime* Map](#map1)

<a name="mapentry-victim-string"/>
## MapEntry :victim ∷ String

information about a victim of this Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :victim

* String Value
  * Plumatic Schema: Str

<a name="map1"/>
# *ValidTime* Map

Period of time when a cyber observation is valid.

| key | type | required? |
| --- | ---- | --------- |
|[:end_time](#mapentry-end_time-instdate)|Inst (Date)||
|[:start_time](#mapentry-start_time-instdate)|Inst (Date)||
* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a name="mapentry-end_time-instdate"/>
## MapEntry :end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional

* Keyword Key
  * Plumatic Schema: :end_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-start_time-instdate"/>
## MapEntry :start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

* Keyword Key
  * Plumatic Schema: :start_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="map2"/>
# *IncidentTime* Map

| key | type | required? |
| --- | ---- | --------- |
|[:containment_achieved](#mapentry-containment_achieved-instdate)|Inst (Date)||
|[:first_data_exfiltration](#mapentry-first_data_exfiltration-instdate)|Inst (Date)||
|[:first_malicious_action](#mapentry-first_malicious_action-instdate)|Inst (Date)||
|[:incident_closed](#mapentry-incident_closed-instdate)|Inst (Date)||
|[:incident_discovery](#mapentry-incident_discovery-instdate)|Inst (Date)||
|[:incident_opened](#mapentry-incident_opened-instdate)|Inst (Date)||
|[:incident_reported](#mapentry-incident_reported-instdate)|Inst (Date)||
|[:initial_compromise](#mapentry-initial_compromise-instdate)|Inst (Date)||
|[:restoration_achieved](#mapentry-restoration_achieved-instdate)|Inst (Date)||
* Reference: [TimeType](http://stixproject.github.io/data-model/1.2/incident/TimeType/)

<a name="mapentry-containment_achieved-instdate"/>
## MapEntry :containment_achieved ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :containment_achieved

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-first_data_exfiltration-instdate"/>
## MapEntry :first_data_exfiltration ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :first_data_exfiltration

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-first_malicious_action-instdate"/>
## MapEntry :first_malicious_action ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :first_malicious_action

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-incident_closed-instdate"/>
## MapEntry :incident_closed ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :incident_closed

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-incident_discovery-instdate"/>
## MapEntry :incident_discovery ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :incident_discovery

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-incident_opened-instdate"/>
## MapEntry :incident_opened ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :incident_opened

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-incident_reported-instdate"/>
## MapEntry :incident_reported ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :incident_reported

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-initial_compromise-instdate"/>
## MapEntry :initial_compromise ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :initial_compromise

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-restoration_achieved-instdate"/>
## MapEntry :restoration_achieved ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :restoration_achieved

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="map3"/>
# *AffectedAsset* Map

| key | type | required? |
| --- | ---- | --------- |
|[:description](#mapentry-description-string)|String||
|[:identifying_observables](#mapentry-identifying_observables-observablemap)|*Observable* Map||
|[:location_class](#mapentry-location_class-string)|String||
|[:management_class](#mapentry-management_class-string)|String||
|[:ownership_class](#mapentry-ownership_class-string)|String||
|[:property_affected](#mapentry-property_affected-propertyaffectedmap)|*PropertyAffected* Map||
|[:type](#mapentry-type-string)|String||
* Reference: [AffectedAssetType](http://stixproject.github.io/data-model/1.2/incident/AffectedAssetType/)

<a name="mapentry-description-string"/>
## MapEntry :description ∷ String

text description of the asset

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Plumatic Schema: Str

<a name="mapentry-identifying_observables-observablemap"/>
## MapEntry :identifying_observables ∷ [*Observable* Map]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :identifying_observables

<a name="map14-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map14)

<a name="mapentry-location_class-string"/>
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

<a name="mapentry-management_class-string"/>
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

<a name="mapentry-ownership_class-string"/>
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

<a name="mapentry-property_affected-propertyaffectedmap"/>
## MapEntry :property_affected ∷ *PropertyAffected* Map

affected property

* This entry is optional
* Dev Notes: Unnested NatureOfSecurityEffect

* Keyword Key
  * Plumatic Schema: :property_affected

<a name="map13-ref"/>
* *PropertyAffected* Map Value
  * Details: [*PropertyAffected* Map](#map13)

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

type of the asset impacted by the incident (a security attribute was negatively affected).

* This entry is optional

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: Str

<a name="map14"/>
# *Observable* Map

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| key | type | required? |
| --- | ---- | --------- |
|[:type](#mapentry-type-string)|String|&#10003;|
|[:value](#mapentry-value-string)|String|&#10003;|

<a name="mapentry-type-string"/>
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

<a name="mapentry-value-string"/>
## MapEntry :value ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

<a name="map13"/>
# *PropertyAffected* Map

| key | type | required? |
| --- | ---- | --------- |
|[:description_of_effect](#mapentry-description_of_effect-string)|String||
|[:duration_of_availability_loss](#mapentry-duration_of_availability_loss-string)|String||
|[:non_public_data_compromised](#mapentry-non_public_data_compromised-nonpublicdatacompromisedmap)|*NonPublicDataCompromised* Map||
|[:property](#mapentry-property-string)|String||
|[:type_of_availability_loss](#mapentry-type_of_availability_loss-string)|String||
* Reference: [PropertyAffectedTpye](http://stixproject.github.io/data-model/1.2/incident/PropertyAffectedType/)

<a name="mapentry-description_of_effect-string"/>
## MapEntry :description_of_effect ∷ String

a brief prose description of how the security property was affected

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description_of_effect

* String Value
  * Plumatic Schema: Str

<a name="mapentry-duration_of_availability_loss-string"/>
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

<a name="mapentry-non_public_data_compromised-nonpublicdatacompromisedmap"/>
## MapEntry :non_public_data_compromised ∷ *NonPublicDataCompromised* Map

approximate length of time availability was affected

* This entry is optional

* Keyword Key
  * Plumatic Schema: :non_public_data_compromised

<a name="map15-ref"/>
* *NonPublicDataCompromised* Map Value
  * Details: [*NonPublicDataCompromised* Map](#map15)

<a name="mapentry-property-string"/>
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

<a name="mapentry-type_of_availability_loss-string"/>
## MapEntry :type_of_availability_loss ∷ String

characterizes in what manner the availability of this asset was affected

* This entry is optional
* Dev Notes: empty vocabulary

* Keyword Key
  * Plumatic Schema: :type_of_availability_loss

* String Value
  * Plumatic Schema: Str

<a name="map15"/>
# *NonPublicDataCompromised* Map

| key | type | required? |
| --- | ---- | --------- |
|[:data_encrypted](#mapentry-data_encrypted-boolean)|Boolean||
|[:security_compromise](#mapentry-security_compromise-string)|String|&#10003;|
* Reference: [NonPublicDataCompromisedType](http://stixproject.github.io/data-model/1.2/incident/NonPublicDataCompromisedType/)

<a name="mapentry-data_encrypted-boolean"/>
## MapEntry :data_encrypted ∷ Boolean

whether the data that was compromised was encrypted or not

* This entry is optional

* Keyword Key
  * Plumatic Schema: :data_encrypted

* Boolean Value
  * Plumatic Schema: Bool

<a name="mapentry-security_compromise-string"/>
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

<a name="map4"/>
# *ImpactAssessment* Map

| key | type | required? |
| --- | ---- | --------- |
|[:direct_impact_summary](#mapentry-direct_impact_summary-directimpactsummarymap)|*DirectImpactSummary* Map||
|[:effects](#mapentry-effects-string)|String||
|[:impact_qualification](#mapentry-impact_qualification-string)|String||
|[:indirect_impact_summary](#mapentry-indirect_impact_summary-indirectimpactsummarymap)|*IndirectImpactSummary* Map||
|[:total_loss_estimation](#mapentry-total_loss_estimation-totallossestimationmap)|*TotalLossEstimation* Map||
* Reference:  [ImpactAssessmentType](http://stixproject.github.io/data-model/1.2/incident/ImpactAssessmentType/)

<a name="mapentry-direct_impact_summary-directimpactsummarymap"/>
## MapEntry :direct_impact_summary ∷ *DirectImpactSummary* Map

characterizes (at a high level) losses directly resulting from the ThreatActor's actions against organizational assets within the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :direct_impact_summary

<a name="map16-ref"/>
* *DirectImpactSummary* Map Value
  * Details: [*DirectImpactSummary* Map](#map16)

<a name="mapentry-effects-string"/>
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

<a name="mapentry-impact_qualification-string"/>
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

<a name="mapentry-indirect_impact_summary-indirectimpactsummarymap"/>
## MapEntry :indirect_impact_summary ∷ *IndirectImpactSummary* Map

characterizes (at a high level) losses from other stakeholder reactions to the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :indirect_impact_summary

<a name="map17-ref"/>
* *IndirectImpactSummary* Map Value
  * Details: [*IndirectImpactSummary* Map](#map17)

<a name="mapentry-total_loss_estimation-totallossestimationmap"/>
## MapEntry :total_loss_estimation ∷ *TotalLossEstimation* Map

specifies the total estimated financial loss for the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :total_loss_estimation

<a name="map18-ref"/>
* *TotalLossEstimation* Map Value
  * Details: [*TotalLossEstimation* Map](#map18)

<a name="map18"/>
# *TotalLossEstimation* Map

| key | type | required? |
| --- | ---- | --------- |
|[:actual_total_loss_estimation](#mapentry-actual_total_loss_estimation-lossestimationmap)|*LossEstimation* Map||
|[:initial_reported_total_loss_estimation](#mapentry-initial_reported_total_loss_estimation-lossestimationmap)|*LossEstimation* Map||
* Reference: [TotalLossEstimationType](http://stixproject.github.io/data-model/1.2/incident/TotalLossEstimationType/)

<a name="mapentry-actual_total_loss_estimation-lossestimationmap"/>
## MapEntry :actual_total_loss_estimation ∷ *LossEstimation* Map

specifies the actual level of total estimated financial loss for the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :actual_total_loss_estimation

<a name="map20-ref"/>
* *LossEstimation* Map Value
  * Details: [*LossEstimation* Map](#map20)

<a name="mapentry-initial_reported_total_loss_estimation-lossestimationmap"/>
## MapEntry :initial_reported_total_loss_estimation ∷ *LossEstimation* Map

specifies the initially reported level of total estimated financial loss for the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :initial_reported_total_loss_estimation

<a name="map19-ref"/>
* *LossEstimation* Map Value
  * Details: [*LossEstimation* Map](#map19)

<a name="map20"/>
# *LossEstimation* Map

| key | type | required? |
| --- | ---- | --------- |
|[:amount](#mapentry-amount-integer)|Integer||
|[:iso_currency_code](#mapentry-iso_currency_code-string)|String||
* Reference: [LossEstimationType](http://stixproject.github.io/data-model/1.2/incident/LossEstimationType/)

<a name="mapentry-amount-integer"/>
## MapEntry :amount ∷ Integer

the estimated financial loss for the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :amount

* Integer Value
  * Plumatic Schema: Int

<a name="mapentry-iso_currency_code-string"/>
## MapEntry :iso_currency_code ∷ String

ISO 4217 currency code if other than USD

* This entry is optional

* Keyword Key
  * Plumatic Schema: :iso_currency_code

* String Value
  * Plumatic Schema: Str

<a name="map19"/>
# *LossEstimation* Map

| key | type | required? |
| --- | ---- | --------- |
|[:amount](#mapentry-amount-integer)|Integer||
|[:iso_currency_code](#mapentry-iso_currency_code-string)|String||
* Reference: [LossEstimationType](http://stixproject.github.io/data-model/1.2/incident/LossEstimationType/)

<a name="mapentry-amount-integer"/>
## MapEntry :amount ∷ Integer

the estimated financial loss for the Incident

* This entry is optional

* Keyword Key
  * Plumatic Schema: :amount

* Integer Value
  * Plumatic Schema: Int

<a name="mapentry-iso_currency_code-string"/>
## MapEntry :iso_currency_code ∷ String

ISO 4217 currency code if other than USD

* This entry is optional

* Keyword Key
  * Plumatic Schema: :iso_currency_code

* String Value
  * Plumatic Schema: Str

<a name="map17"/>
# *IndirectImpactSummary* Map

| key | type | required? |
| --- | ---- | --------- |
|[:brand_and_market_damage](#mapentry-brand_and_market_damage-string)|String||
|[:increased_operating_costs](#mapentry-increased_operating_costs-string)|String||
|[:local_and_regulatory_costs](#mapentry-local_and_regulatory_costs-string)|String||
|[:loss_of_competitive_advantage](#mapentry-loss_of_competitive_advantage-string)|String||
* Reference: [IndirectImpactSummaryType](http://stixproject.github.io/data-model/1.2/incident/IndirectImpactSummaryType/)

<a name="mapentry-brand_and_market_damage-string"/>
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

<a name="mapentry-increased_operating_costs-string"/>
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

<a name="mapentry-local_and_regulatory_costs-string"/>
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

<a name="mapentry-loss_of_competitive_advantage-string"/>
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

<a name="map16"/>
# *DirectImpactSummary* Map

| key | type | required? |
| --- | ---- | --------- |
|[:asset_losses](#mapentry-asset_losses-string)|String||
|[:business_mission_distruption](#mapentry-business_mission_distruption-string)|String||
|[:response_and_recovery_costs](#mapentry-response_and_recovery_costs-string)|String||
* Reference: [DirectImpactSummaryType](http://stixproject.github.io/data-model/1.2/incident/DirectImpactSummaryType/)

<a name="mapentry-asset_losses-string"/>
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

<a name="mapentry-business_mission_distruption-string"/>
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

<a name="mapentry-response_and_recovery_costs-string"/>
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

| key | type | required? |
| --- | ---- | --------- |
|[:COA](#mapentry-coa-string)|String|&#10003;|
|[:contributors](#mapentry-contributors-contributormap)|*Contributor* Map||
|[:time](#mapentry-time-instdate)|Inst (Date)||
* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

<a name="mapentry-coa-string"/>
## MapEntry :COA ∷ String

COA reference

* This entry is required

* Keyword Key
  * Plumatic Schema: :COA

* String Value
  * A URI leading to a COA
  * Plumatic Schema: Str

<a name="mapentry-contributors-contributormap"/>
## MapEntry :contributors ∷ [*Contributor* Map]

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :contributors

<a name="map21-ref"/>
* *Contributor* Map Value
  * Details: [*Contributor* Map](#map21)

<a name="mapentry-time-instdate"/>
## MapEntry :time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional

* Keyword Key
  * Plumatic Schema: :time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="map21"/>
# *Contributor* Map

Person who contributed cyber observation data

| key | type | required? |
| --- | ---- | --------- |
|[:contribution_location](#mapentry-contribution_location-string)|String||
|[:date](#mapentry-date-instdate)|Inst (Date)||
|[:email](#mapentry-email-string)|String||
|[:name](#mapentry-name-string)|String||
|[:organization](#mapentry-organization-string)|String||
|[:phone](#mapentry-phone-string)|String||
|[:role](#mapentry-role-string)|String||
* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

<a name="mapentry-contribution_location-string"/>
## MapEntry :contribution_location ∷ String

information describing the location at which the contributory activity occured

* This entry is optional

* Keyword Key
  * Plumatic Schema: :contribution_location

* String Value
  * Plumatic Schema: Str

<a name="mapentry-date-instdate"/>
## MapEntry :date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional

* Keyword Key
  * Plumatic Schema: :date

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-email-string"/>
## MapEntry :email ∷ String

email of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :email

* String Value
  * Plumatic Schema: Str

<a name="mapentry-name-string"/>
## MapEntry :name ∷ String

name of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :name

* String Value
  * Plumatic Schema: Str

<a name="mapentry-organization-string"/>
## MapEntry :organization ∷ String

organization name of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :organization

* String Value
  * Plumatic Schema: Str

<a name="mapentry-phone-string"/>
## MapEntry :phone ∷ String

telephone number of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :phone

* String Value
  * Plumatic Schema: Str

<a name="mapentry-role-string"/>
## MapEntry :role ∷ String

role played by this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :role

* String Value
  * Plumatic Schema: Str

<a name="map6"/>
# *COARequested* Map

| key | type | required? |
| --- | ---- | --------- |
|[:COA](#mapentry-coa-string)|String|&#10003;|
|[:contributors](#mapentry-contributors-contributormap)|*Contributor* Map||
|[:time](#mapentry-time-instdate)|Inst (Date)||
* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

<a name="mapentry-coa-string"/>
## MapEntry :COA ∷ String

COA reference

* This entry is required

* Keyword Key
  * Plumatic Schema: :COA

* String Value
  * A URI leading to a COA
  * Plumatic Schema: Str

<a name="mapentry-contributors-contributormap"/>
## MapEntry :contributors ∷ [*Contributor* Map]

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :contributors

<a name="map22-ref"/>
* *Contributor* Map Value
  * Details: [*Contributor* Map](#map22)

<a name="mapentry-time-instdate"/>
## MapEntry :time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional

* Keyword Key
  * Plumatic Schema: :time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="map22"/>
# *Contributor* Map

Person who contributed cyber observation data

| key | type | required? |
| --- | ---- | --------- |
|[:contribution_location](#mapentry-contribution_location-string)|String||
|[:date](#mapentry-date-instdate)|Inst (Date)||
|[:email](#mapentry-email-string)|String||
|[:name](#mapentry-name-string)|String||
|[:organization](#mapentry-organization-string)|String||
|[:phone](#mapentry-phone-string)|String||
|[:role](#mapentry-role-string)|String||
* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

<a name="mapentry-contribution_location-string"/>
## MapEntry :contribution_location ∷ String

information describing the location at which the contributory activity occured

* This entry is optional

* Keyword Key
  * Plumatic Schema: :contribution_location

* String Value
  * Plumatic Schema: Str

<a name="mapentry-date-instdate"/>
## MapEntry :date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional

* Keyword Key
  * Plumatic Schema: :date

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-email-string"/>
## MapEntry :email ∷ String

email of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :email

* String Value
  * Plumatic Schema: Str

<a name="mapentry-name-string"/>
## MapEntry :name ∷ String

name of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :name

* String Value
  * Plumatic Schema: Str

<a name="mapentry-organization-string"/>
## MapEntry :organization ∷ String

organization name of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :organization

* String Value
  * Plumatic Schema: Str

<a name="mapentry-phone-string"/>
## MapEntry :phone ∷ String

telephone number of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :phone

* String Value
  * Plumatic Schema: Str

<a name="mapentry-role-string"/>
## MapEntry :role ∷ String

role played by this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :role

* String Value
  * Plumatic Schema: Str

<a name="map7"/>
# *History* Map

| key | type | required? |
| --- | ---- | --------- |
|[:action_entry](#mapentry-action_entry-coarequestedmap)|*COARequested* Map||
|[:journal_entry](#mapentry-journal_entry-string)|String||
* Reference: [HistoryItemType](http://stixproject.github.io/data-model/1.2/incident/HistoryItemType/)

<a name="mapentry-action_entry-coarequestedmap"/>
## MapEntry :action_entry ∷ [*COARequested* Map]

a record of actions taken during the handling of the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :action_entry

<a name="map23-ref"/>
* *COARequested* Map Value
  * Details: [*COARequested* Map](#map23)

<a name="mapentry-journal_entry-string"/>
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

| key | type | required? |
| --- | ---- | --------- |
|[:COA](#mapentry-coa-string)|String|&#10003;|
|[:contributors](#mapentry-contributors-contributormap)|*Contributor* Map||
|[:time](#mapentry-time-instdate)|Inst (Date)||
* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

<a name="mapentry-coa-string"/>
## MapEntry :COA ∷ String

COA reference

* This entry is required

* Keyword Key
  * Plumatic Schema: :COA

* String Value
  * A URI leading to a COA
  * Plumatic Schema: Str

<a name="mapentry-contributors-contributormap"/>
## MapEntry :contributors ∷ [*Contributor* Map]

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :contributors

<a name="map24-ref"/>
* *Contributor* Map Value
  * Details: [*Contributor* Map](#map24)

<a name="mapentry-time-instdate"/>
## MapEntry :time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional

* Keyword Key
  * Plumatic Schema: :time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="map24"/>
# *Contributor* Map

Person who contributed cyber observation data

| key | type | required? |
| --- | ---- | --------- |
|[:contribution_location](#mapentry-contribution_location-string)|String||
|[:date](#mapentry-date-instdate)|Inst (Date)||
|[:email](#mapentry-email-string)|String||
|[:name](#mapentry-name-string)|String||
|[:organization](#mapentry-organization-string)|String||
|[:phone](#mapentry-phone-string)|String||
|[:role](#mapentry-role-string)|String||
* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

<a name="mapentry-contribution_location-string"/>
## MapEntry :contribution_location ∷ String

information describing the location at which the contributory activity occured

* This entry is optional

* Keyword Key
  * Plumatic Schema: :contribution_location

* String Value
  * Plumatic Schema: Str

<a name="mapentry-date-instdate"/>
## MapEntry :date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional

* Keyword Key
  * Plumatic Schema: :date

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-email-string"/>
## MapEntry :email ∷ String

email of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :email

* String Value
  * Plumatic Schema: Str

<a name="mapentry-name-string"/>
## MapEntry :name ∷ String

name of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :name

* String Value
  * Plumatic Schema: Str

<a name="mapentry-organization-string"/>
## MapEntry :organization ∷ String

organization name of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :organization

* String Value
  * Plumatic Schema: Str

<a name="mapentry-phone-string"/>
## MapEntry :phone ∷ String

telephone number of this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :phone

* String Value
  * Plumatic Schema: Str

<a name="mapentry-role-string"/>
## MapEntry :role ∷ String

role played by this contributor

* This entry is optional

* Keyword Key
  * Plumatic Schema: :role

* String Value
  * Plumatic Schema: Str

<a name="map8"/>
# *RelatedIndicator* Map

| key | type | required? |
| --- | ---- | --------- |
|[:confidence](#mapentry-confidence-string)|String||
|[:indicator_id](#mapentry-indicator_id-string)|String|&#10003;|
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||

<a name="mapentry-confidence-string"/>
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

<a name="mapentry-indicator_id-string"/>
## MapEntry :indicator_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :indicator_id

* String Value
  * A URI leading to an indicator
  * Plumatic Schema: Str

<a name="mapentry-relationship-string"/>
## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

<a name="map9"/>
# *Observable* Map

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| key | type | required? |
| --- | ---- | --------- |
|[:type](#mapentry-type-string)|String|&#10003;|
|[:value](#mapentry-value-string)|String|&#10003;|

<a name="mapentry-type-string"/>
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

<a name="mapentry-value-string"/>
## MapEntry :value ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

<a name="map10"/>
# *RelatedTTP* Map

| key | type | required? |
| --- | ---- | --------- |
|[:TTP_id](#mapentry-ttp_id-string)|String|&#10003;|
|[:confidence](#mapentry-confidence-string)|String||
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||

<a name="mapentry-ttp_id-string"/>
## MapEntry :TTP_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :TTP_id

* String Value
  * A URI leading to a TTP
  * Plumatic Schema: Str

<a name="mapentry-confidence-string"/>
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

<a name="mapentry-relationship-string"/>
## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

<a name="map11"/>
# *RelatedActor* Map

| key | type | required? |
| --- | ---- | --------- |
|[:actor_id](#mapentry-actor_id-string)|String|&#10003;|
|[:confidence](#mapentry-confidence-string)|String||
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||

<a name="mapentry-actor_id-string"/>
## MapEntry :actor_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :actor_id

* String Value
  * A URI leading to an actor
  * Plumatic Schema: Str

<a name="mapentry-confidence-string"/>
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

<a name="mapentry-relationship-string"/>
## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

<a name="map12"/>
# *RelatedIncident* Map

| key | type | required? |
| --- | ---- | --------- |
|[:confidence](#mapentry-confidence-string)|String||
|[:incident_id](#mapentry-incident_id-string)|String|&#10003;|
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||

<a name="mapentry-confidence-string"/>
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

<a name="mapentry-incident_id-string"/>
## MapEntry :incident_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :incident_id

* String Value
  * A URI leading to an incident
  * Plumatic Schema: Str

<a name="mapentry-relationship-string"/>
## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str
