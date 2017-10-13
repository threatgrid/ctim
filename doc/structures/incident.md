<a id="top"></a>
# *Incident* Object

Discrete instance of indicators affecting an organization as well
  as information associated with incident response

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String|level of confidence held in the characterization of this Incident|&#10003;|
|[id](#propertyid-string)| String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-incidenttypeidentifierstring)|IncidentTypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object|time stamp for the definition of a specific version of an Incident|&#10003;|
|[COA_requested](#propertycoa_requested-coarequestedobjectlist)|*COARequested* Object List|specifies and characterizes requested Course Of Action for this Incident as specified by the Producer for the Consumer of the Incident Report||
|[COA_taken](#propertycoa_taken-coarequestedobjectlist)|*COARequested* Object List|specifies and characterizes a Course Of Action taken for this Incident||
|[affected_assets](#propertyaffected_assets-affectedassetobjectlist)|*AffectedAsset* Object List|particular assets affected during the Incident||
|[attributed_actors](#propertyattributed_actors-relatedactorobjectlist)|*RelatedActor* Object List|identifies ThreatActors asserted to be attributed for this Incident||
|[categories](#propertycategories-incidentcategorystringlist)|IncidentCategory String List|a set of categories for this incident||
|[contact](#propertycontact-string)| String|identifies and characterizes organizations or personnel involved in this Incident||
|[coordinator](#propertycoordinator-string)| String|information about the assigned coordinator for this Incident||
|[description](#propertydescription-string)| String| ||
|[discovery_method](#propertydiscovery_method-discoverymethodstring)|DiscoveryMethod String|identifies how the incident was discovered||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[history](#propertyhistory-historyobjectlist)|*History* Object List|a log of events or actions taken during the handling of the Incident||
|[impact_assessment](#propertyimpact_assessment-impactassessmentobject)|*ImpactAssessment* Object|a summary assessment of impact for this cyber threat Incident||
|[incident_time](#propertyincident_time-incidenttimeobject)|*IncidentTime* Object|relevant time values associated with this Incident||
|[intended_effect](#propertyintended_effect-intendedeffectstring)|IntendedEffect String|specifies the suspected intended effect of this incident||
|[language](#propertylanguage-string)| String| ||
|[leveraged_TTPs](#propertyleveraged_ttps-relatedttpobjectlist)|*RelatedTTP* Object List|specifies TTPs asserted to be related to this cyber threat Incident||
|[related_incidents](#propertyrelated_incidents-relatedincidentobjectlist)|*RelatedIncident* Object List|identifies or characterizes one or more other Incidents related to this cyber threat Incident||
|[related_indicators](#propertyrelated_indicators-relatedindicatorobjectlist)|*RelatedIndicator* Object List|identifies or characterizes one or more cyber threat Indicators related to this cyber threat Incident||
|[related_observables](#propertyrelated_observables-observableobjectlist)|*Observable* Object List|identifies or characterizes one or more cyber observables related to this cyber threat incident||
|[reporter](#propertyreporter-string)| String|information about the reporting source of this Incident||
|[responder](#propertyresponder-string)| String|information about the assigned responder for this Incident||
|[revision](#propertyrevision-integer)|Integer| ||
|[security_compromise](#propertysecurity_compromise-securitycompromisestring)|SecurityCompromise String|knowledge of whether the Incident involved a compromise of security properties||
|[short_description](#propertyshort_description-string)| String| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[status](#propertystatus-statusstring)|Status String|current status of the incident||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||
|[victim](#propertyvictim-string)| String|information about a victim of this Incident||

* Reference: [IncidentType](http://stixproject.github.io/data-model/1.2/incident/IncidentType/)

<a id="propertycoa_requested-coarequestedobjectlist"></a>
## Property COA_requested ∷ *COARequested* Object List

specifies and characterizes requested Course Of Action for this Incident as specified by the Producer for the Consumer of the Incident Report

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map5-ref"></a>
* *COARequested* Object Value
  * Details: [*COARequested* Object](#map5)

<a id="propertycoa_taken-coarequestedobjectlist"></a>
## Property COA_taken ∷ *COARequested* Object List

specifies and characterizes a Course Of Action taken for this Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map6-ref"></a>
* *COARequested* Object Value
  * Details: [*COARequested* Object](#map6)

<a id="propertyaffected_assets-affectedassetobjectlist"></a>
## Property affected_assets ∷ *AffectedAsset* Object List

particular assets affected during the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map3-ref"></a>
* *AffectedAsset* Object Value
  * Details: [*AffectedAsset* Object](#map3)

<a id="propertyattributed_actors-relatedactorobjectlist"></a>
## Property attributed_actors ∷ *RelatedActor* Object List

identifies ThreatActors asserted to be attributed for this Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: was attributed_threat_actors


<a id="map11-ref"></a>
* *RelatedActor* Object Value
  * Details: [*RelatedActor* Object](#map11)

<a id="propertycategories-incidentcategorystringlist"></a>
## Property categories ∷ IncidentCategory String List

a set of categories for this incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * Allowed Values:
    * Denial of Service
    * Exercise/Network Defense Testing
    * Improper Usage
    * Investigation
    * Malicious Code
    * Scans/Probes/Attempted Access
    * Unauthorized Access

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

level of confidence held in the characterization of this Incident

* This entry is required


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertycontact-string"></a>
## Property contact ∷  String

identifies and characterizes organizations or personnel involved in this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="propertycoordinator-string"></a>
## Property coordinator ∷  String

information about the assigned coordinator for this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertydiscovery_method-discoverymethodstring"></a>
## Property discovery_method ∷ DiscoveryMethod String

identifies how the incident was discovered

* This entry is optional


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

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyhistory-historyobjectlist"></a>
## Property history ∷ *History* Object List

a log of events or actions taken during the handling of the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map7-ref"></a>
* *History* Object Value
  * Details: [*History* Object](#map7)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.

<a id="propertyimpact_assessment-impactassessmentobject"></a>
## Property impact_assessment ∷ *ImpactAssessment* Object

a summary assessment of impact for this cyber threat Incident

* This entry is optional


<a id="map4-ref"></a>
* *ImpactAssessment* Object Value
  * Details: [*ImpactAssessment* Object](#map4)

<a id="propertyincident_time-incidenttimeobject"></a>
## Property incident_time ∷ *IncidentTime* Object

relevant time values associated with this Incident

* This entry is optional
* Dev Notes: Was 'time'; renamed for clarity


<a id="map2-ref"></a>
* *IncidentTime* Object Value
  * Details: [*IncidentTime* Object](#map2)

<a id="propertyintended_effect-intendedeffectstring"></a>
## Property intended_effect ∷ IntendedEffect String

specifies the suspected intended effect of this incident

* This entry is optional


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

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyleveraged_ttps-relatedttpobjectlist"></a>
## Property leveraged_TTPs ∷ *RelatedTTP* Object List

specifies TTPs asserted to be related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map10-ref"></a>
* *RelatedTTP* Object Value
  * Details: [*RelatedTTP* Object](#map10)

<a id="propertyrelated_incidents-relatedincidentobjectlist"></a>
## Property related_incidents ∷ *RelatedIncident* Object List

identifies or characterizes one or more other Incidents related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map12-ref"></a>
* *RelatedIncident* Object Value
  * Details: [*RelatedIncident* Object](#map12)

<a id="propertyrelated_indicators-relatedindicatorobjectlist"></a>
## Property related_indicators ∷ *RelatedIndicator* Object List

identifies or characterizes one or more cyber threat Indicators related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map8-ref"></a>
* *RelatedIndicator* Object Value
  * Details: [*RelatedIndicator* Object](#map8)

<a id="propertyrelated_observables-observableobjectlist"></a>
## Property related_observables ∷ *Observable* Object List

identifies or characterizes one or more cyber observables related to this cyber threat incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Was related_observables


<a id="map9-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map9)

<a id="propertyreporter-string"></a>
## Property reporter ∷  String

information about the reporting source of this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="propertyresponder-string"></a>
## Property responder ∷  String

information about the assigned responder for this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysecurity_compromise-securitycompromisestring"></a>
## Property security_compromise ∷ SecurityCompromise String

knowledge of whether the Incident involved a compromise of security properties

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertystatus-statusstring"></a>
## Property status ∷ Status String

current status of the incident

* This entry is optional


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

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-incidenttypeidentifierstring"></a>
## Property type ∷ IncidentTypeIdentifier String

* This entry is required


  * Must equal: "incident"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

time stamp for the definition of a specific version of an Incident

* This entry is required


<a id="map1-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map1)

<a id="propertyvictim-string"></a>
## Property victim ∷  String

information about a victim of this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="map1"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map2"></a>
# *IncidentTime* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[containment_achieved](#propertycontainment_achieved-instdate)|Inst (Date)| ||
|[first_data_exfiltration](#propertyfirst_data_exfiltration-instdate)|Inst (Date)| ||
|[first_malicious_action](#propertyfirst_malicious_action-instdate)|Inst (Date)| ||
|[incident_closed](#propertyincident_closed-instdate)|Inst (Date)| ||
|[incident_discovery](#propertyincident_discovery-instdate)|Inst (Date)| ||
|[incident_opened](#propertyincident_opened-instdate)|Inst (Date)| ||
|[incident_reported](#propertyincident_reported-instdate)|Inst (Date)| ||
|[initial_compromise](#propertyinitial_compromise-instdate)|Inst (Date)| ||
|[restoration_achieved](#propertyrestoration_achieved-instdate)|Inst (Date)| ||

* Reference: [TimeType](http://stixproject.github.io/data-model/1.2/incident/TimeType/)

<a id="propertycontainment_achieved-instdate"></a>
## Property containment_achieved ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyfirst_data_exfiltration-instdate"></a>
## Property first_data_exfiltration ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyfirst_malicious_action-instdate"></a>
## Property first_malicious_action ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyincident_closed-instdate"></a>
## Property incident_closed ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyincident_discovery-instdate"></a>
## Property incident_discovery ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyincident_opened-instdate"></a>
## Property incident_opened ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyincident_reported-instdate"></a>
## Property incident_reported ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyinitial_compromise-instdate"></a>
## Property initial_compromise ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyrestoration_achieved-instdate"></a>
## Property restoration_achieved ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map3"></a>
# *AffectedAsset* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-string)| String|text description of the asset||
|[identifying_observables](#propertyidentifying_observables-observableobjectlist)|*Observable* Object List| ||
|[location_class](#propertylocation_class-locationclassstring)|LocationClass String|high-level characterization of where this asset is physically located||
|[management_class](#propertymanagement_class-managementclassstring)|ManagementClass String|high-level characterization of who is responsible for the day-to-day management and administration of this asset||
|[ownership_class](#propertyownership_class-ownershipclassstring)|OwnershipClass String|high-level characterization of who owns (or controls) this asset||
|[property_affected](#propertyproperty_affected-propertyaffectedobject)|*PropertyAffected* Object|affected property||
|[type](#propertytype-string)| String|type of the asset impacted by the incident (a security attribute was negatively affected).||

* Reference: [AffectedAssetType](http://stixproject.github.io/data-model/1.2/incident/AffectedAssetType/)

<a id="propertydescription-string"></a>
## Property description ∷  String

text description of the asset

* This entry is optional


  * String with at most 5000 characters

<a id="propertyidentifying_observables-observableobjectlist"></a>
## Property identifying_observables ∷ *Observable* Object List

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map14-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map14)

<a id="propertylocation_class-locationclassstring"></a>
## Property location_class ∷ LocationClass String

high-level characterization of where this asset is physically located

* This entry is optional


  * Allowed Values:
    * Co-Located
    * Externally-Located
    * Internally-Located
    * Mobile
    * Unknown

<a id="propertymanagement_class-managementclassstring"></a>
## Property management_class ∷ ManagementClass String

high-level characterization of who is responsible for the day-to-day management and administration of this asset

* This entry is optional


  * Allowed Values:
    * CO-Management
    * Externally-Management
    * Internally-Managed
    * Unknown

<a id="propertyownership_class-ownershipclassstring"></a>
## Property ownership_class ∷ OwnershipClass String

high-level characterization of who owns (or controls) this asset

* This entry is optional


  * Allowed Values:
    * Customer-Owned
    * Employee-Owned
    * Internally-Owned
    * Partner-Owned
    * Unknown

<a id="propertyproperty_affected-propertyaffectedobject"></a>
## Property property_affected ∷ *PropertyAffected* Object

affected property

* This entry is optional
* Dev Notes: Unnested NatureOfSecurityEffect


<a id="map13-ref"></a>
* *PropertyAffected* Object Value
  * Details: [*PropertyAffected* Object](#map13)

<a id="propertytype-string"></a>
## Property type ∷  String

type of the asset impacted by the incident (a security attribute was negatively affected).

* This entry is optional


  * String with at most 1024 characters

<a id="map14"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



<a id="map13"></a>
# *PropertyAffected* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description_of_effect](#propertydescription_of_effect-string)| String|a brief prose description of how the security property was affected||
|[duration_of_availability_loss](#propertyduration_of_availability_loss-lossdurationstring)|LossDuration String|approximate length of time availability was affected||
|[non_public_data_compromised](#propertynon_public_data_compromised-nonpublicdatacompromisedobject)|*NonPublicDataCompromised* Object|approximate length of time availability was affected||
|[property](#propertyproperty-losspropertystring)|LossProperty String|security property that was affected by the incident||
|[type_of_availability_loss](#propertytype_of_availability_loss-string)| String|characterizes in what manner the availability of this asset was affected||

* Reference: [PropertyAffectedTpye](http://stixproject.github.io/data-model/1.2/incident/PropertyAffectedType/)

<a id="propertydescription_of_effect-string"></a>
## Property description_of_effect ∷  String

a brief prose description of how the security property was affected

* This entry is optional


  * String with at most 5000 characters

<a id="propertyduration_of_availability_loss-lossdurationstring"></a>
## Property duration_of_availability_loss ∷ LossDuration String

approximate length of time availability was affected

* This entry is optional


  * Allowed Values:
    * Days
    * Hours
    * Minutes
    * Permanent
    * Seconds
    * Unknown
    * Weeks

<a id="propertynon_public_data_compromised-nonpublicdatacompromisedobject"></a>
## Property non_public_data_compromised ∷ *NonPublicDataCompromised* Object

approximate length of time availability was affected

* This entry is optional


<a id="map15-ref"></a>
* *NonPublicDataCompromised* Object Value
  * Details: [*NonPublicDataCompromised* Object](#map15)

<a id="propertyproperty-losspropertystring"></a>
## Property property ∷ LossProperty String

security property that was affected by the incident

* This entry is optional


  * Allowed Values:
    * Accountability
    * Availability
    * Confidentiality
    * Integrity
    * Non-Repudiation

<a id="propertytype_of_availability_loss-string"></a>
## Property type_of_availability_loss ∷  String

characterizes in what manner the availability of this asset was affected

* This entry is optional
* Dev Notes: empty vocabulary


  * String with at most 1024 characters

<a id="map15"></a>
# *NonPublicDataCompromised* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[security_compromise](#propertysecurity_compromise-securitycompromisestring)|SecurityCompromise String|related security compromise|&#10003;|
|[data_encrypted](#propertydata_encrypted-boolean)|Boolean|whether the data that was compromised was encrypted or not||

* Reference: [NonPublicDataCompromisedType](http://stixproject.github.io/data-model/1.2/incident/NonPublicDataCompromisedType/)

<a id="propertydata_encrypted-boolean"></a>
## Property data_encrypted ∷ Boolean

whether the data that was compromised was encrypted or not

* This entry is optional



<a id="propertysecurity_compromise-securitycompromisestring"></a>
## Property security_compromise ∷ SecurityCompromise String

related security compromise

* This entry is required


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="map4"></a>
# *ImpactAssessment* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[direct_impact_summary](#propertydirect_impact_summary-directimpactsummaryobject)|*DirectImpactSummary* Object|characterizes (at a high level) losses directly resulting from the ThreatActor's actions against organizational assets within the Incident||
|[effects](#propertyeffects-effectstringlist)|Effect String List|list of effects of this incident from a controlled vocabulary||
|[impact_qualification](#propertyimpact_qualification-impactqualificationstring)|ImpactQualification String|summarizes the subjective level of impact of the Incident||
|[indirect_impact_summary](#propertyindirect_impact_summary-indirectimpactsummaryobject)|*IndirectImpactSummary* Object|characterizes (at a high level) losses from other stakeholder reactions to the Incident||
|[total_loss_estimation](#propertytotal_loss_estimation-totallossestimationobject)|*TotalLossEstimation* Object|specifies the total estimated financial loss for the Incident||

* Reference:  [ImpactAssessmentType](http://stixproject.github.io/data-model/1.2/incident/ImpactAssessmentType/)

<a id="propertydirect_impact_summary-directimpactsummaryobject"></a>
## Property direct_impact_summary ∷ *DirectImpactSummary* Object

characterizes (at a high level) losses directly resulting from the ThreatActor's actions against organizational assets within the Incident

* This entry is optional


<a id="map16-ref"></a>
* *DirectImpactSummary* Object Value
  * Details: [*DirectImpactSummary* Object](#map16)

<a id="propertyeffects-effectstringlist"></a>
## Property effects ∷ Effect String List

list of effects of this incident from a controlled vocabulary

* This entry is optional
* This entry's type is sequential (allows zero or more values)


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

<a id="propertyimpact_qualification-impactqualificationstring"></a>
## Property impact_qualification ∷ ImpactQualification String

summarizes the subjective level of impact of the Incident

* This entry is optional


  * Allowed Values:
    * Catastrophic
    * Damaging
    * Distracting
    * Insignificant
    * Painful
    * Unknown

<a id="propertyindirect_impact_summary-indirectimpactsummaryobject"></a>
## Property indirect_impact_summary ∷ *IndirectImpactSummary* Object

characterizes (at a high level) losses from other stakeholder reactions to the Incident

* This entry is optional


<a id="map17-ref"></a>
* *IndirectImpactSummary* Object Value
  * Details: [*IndirectImpactSummary* Object](#map17)

<a id="propertytotal_loss_estimation-totallossestimationobject"></a>
## Property total_loss_estimation ∷ *TotalLossEstimation* Object

specifies the total estimated financial loss for the Incident

* This entry is optional


<a id="map18-ref"></a>
* *TotalLossEstimation* Object Value
  * Details: [*TotalLossEstimation* Object](#map18)

<a id="map18"></a>
# *TotalLossEstimation* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[actual_total_loss_estimation](#propertyactual_total_loss_estimation-lossestimationobject)|*LossEstimation* Object|specifies the actual level of total estimated financial loss for the Incident||
|[initial_reported_total_loss_estimation](#propertyinitial_reported_total_loss_estimation-lossestimationobject)|*LossEstimation* Object|specifies the initially reported level of total estimated financial loss for the Incident||

* Reference: [TotalLossEstimationType](http://stixproject.github.io/data-model/1.2/incident/TotalLossEstimationType/)

<a id="propertyactual_total_loss_estimation-lossestimationobject"></a>
## Property actual_total_loss_estimation ∷ *LossEstimation* Object

specifies the actual level of total estimated financial loss for the Incident

* This entry is optional


<a id="map20-ref"></a>
* *LossEstimation* Object Value
  * Details: [*LossEstimation* Object](#map20)

<a id="propertyinitial_reported_total_loss_estimation-lossestimationobject"></a>
## Property initial_reported_total_loss_estimation ∷ *LossEstimation* Object

specifies the initially reported level of total estimated financial loss for the Incident

* This entry is optional


<a id="map19-ref"></a>
* *LossEstimation* Object Value
  * Details: [*LossEstimation* Object](#map19)

<a id="map20"></a>
# *LossEstimation* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[amount](#propertyamount-integer)|Integer|the estimated financial loss for the Incident||
|[iso_currency_code](#propertyiso_currency_code-string)| String|ISO 4217 currency code if other than USD||

* Reference: [LossEstimationType](http://stixproject.github.io/data-model/1.2/incident/LossEstimationType/)

<a id="propertyamount-integer"></a>
## Property amount ∷ Integer

the estimated financial loss for the Incident

* This entry is optional



<a id="propertyiso_currency_code-string"></a>
## Property iso_currency_code ∷  String

ISO 4217 currency code if other than USD

* This entry is optional


  * String with at most 1024 characters

<a id="map19"></a>
# *LossEstimation* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[amount](#propertyamount-integer)|Integer|the estimated financial loss for the Incident||
|[iso_currency_code](#propertyiso_currency_code-string)| String|ISO 4217 currency code if other than USD||

* Reference: [LossEstimationType](http://stixproject.github.io/data-model/1.2/incident/LossEstimationType/)

<a id="propertyamount-integer"></a>
## Property amount ∷ Integer

the estimated financial loss for the Incident

* This entry is optional



<a id="propertyiso_currency_code-string"></a>
## Property iso_currency_code ∷  String

ISO 4217 currency code if other than USD

* This entry is optional


  * String with at most 1024 characters

<a id="map17"></a>
# *IndirectImpactSummary* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[brand_and_market_damage](#propertybrand_and_market_damage-securitycompromisestring)|SecurityCompromise String|characterizes (at a high level) the level of impact based on brand or market damage that occured in the Incident||
|[increased_operating_costs](#propertyincreased_operating_costs-securitycompromisestring)|SecurityCompromise String|characterizes (at a high level) the level of impact based on increased operating costs that occured in the Incident||
|[local_and_regulatory_costs](#propertylocal_and_regulatory_costs-securitycompromisestring)|SecurityCompromise String| ||
|[loss_of_competitive_advantage](#propertyloss_of_competitive_advantage-securitycompromisestring)|SecurityCompromise String|characterizes (at a high level) the level of impact based on loss of competitive advantage that occured in the Incident||

* Reference: [IndirectImpactSummaryType](http://stixproject.github.io/data-model/1.2/incident/IndirectImpactSummaryType/)

<a id="propertybrand_and_market_damage-securitycompromisestring"></a>
## Property brand_and_market_damage ∷ SecurityCompromise String

characterizes (at a high level) the level of impact based on brand or market damage that occured in the Incident

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="propertyincreased_operating_costs-securitycompromisestring"></a>
## Property increased_operating_costs ∷ SecurityCompromise String

characterizes (at a high level) the level of impact based on increased operating costs that occured in the Incident

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="propertylocal_and_regulatory_costs-securitycompromisestring"></a>
## Property local_and_regulatory_costs ∷ SecurityCompromise String

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="propertyloss_of_competitive_advantage-securitycompromisestring"></a>
## Property loss_of_competitive_advantage ∷ SecurityCompromise String

characterizes (at a high level) the level of impact based on loss of competitive advantage that occured in the Incident

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="map16"></a>
# *DirectImpactSummary* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[asset_losses](#propertyasset_losses-impactratingstring)|ImpactRating String|level of asset-related losses that occured in the Incident||
|[business_mission_distruption](#propertybusiness_mission_distruption-impactratingstring)|ImpactRating String|characterizes (at a high level) the level of business or mission disruption impact that occured in the Incident||
|[response_and_recovery_costs](#propertyresponse_and_recovery_costs-impactratingstring)|ImpactRating String|characterizes (at a high level) the level of response and recovery RELATED costs that occurred in the Incident||

* Reference: [DirectImpactSummaryType](http://stixproject.github.io/data-model/1.2/incident/DirectImpactSummaryType/)

<a id="propertyasset_losses-impactratingstring"></a>
## Property asset_losses ∷ ImpactRating String

level of asset-related losses that occured in the Incident

* This entry is optional


  * Allowed Values:
    * Major
    * Minor
    * Moderate
    * None
    * Unknown

<a id="propertybusiness_mission_distruption-impactratingstring"></a>
## Property business_mission_distruption ∷ ImpactRating String

characterizes (at a high level) the level of business or mission disruption impact that occured in the Incident

* This entry is optional


  * Allowed Values:
    * Major
    * Minor
    * Moderate
    * None
    * Unknown

<a id="propertyresponse_and_recovery_costs-impactratingstring"></a>
## Property response_and_recovery_costs ∷ ImpactRating String

characterizes (at a high level) the level of response and recovery RELATED costs that occurred in the Incident

* This entry is optional


  * Allowed Values:
    * Major
    * Minor
    * Moderate
    * None
    * Unknown

<a id="map5"></a>
# *COARequested* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[COA](#propertycoa-string)| String|COA reference|&#10003;|
|[contributors](#propertycontributors-contributorobjectlist)|*Contributor* Object List|contributing actors for the CourseOfAction taken||
|[time](#propertytime-instdate)|Inst (Date)|relative time criteria for this taken CourseOfAction||

* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

<a id="propertycoa-string"></a>
## Property COA ∷  String

COA reference

* This entry is required


  * A URI leading to a COA

<a id="propertycontributors-contributorobjectlist"></a>
## Property contributors ∷ *Contributor* Object List

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map21-ref"></a>
* *Contributor* Object Value
  * Details: [*Contributor* Object](#map21)

<a id="propertytime-instdate"></a>
## Property time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map21"></a>
# *Contributor* Object

Person who contributed cyber observation data

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[contribution_location](#propertycontribution_location-string)| String|information describing the location at which the contributory activity occured||
|[date](#propertydate-instdate)|Inst (Date)|description (bounding) of the timing of this contributor's involvement||
|[email](#propertyemail-string)| String|email of this contributor||
|[name](#propertyname-string)| String|name of this contributor||
|[organization](#propertyorganization-string)| String|organization name of this contributor||
|[phone](#propertyphone-string)| String|telephone number of this contributor||
|[role](#propertyrole-string)| String|role played by this contributor||

* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

<a id="propertycontribution_location-string"></a>
## Property contribution_location ∷  String

information describing the location at which the contributory activity occured

* This entry is optional



<a id="propertydate-instdate"></a>
## Property date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyemail-string"></a>
## Property email ∷  String

email of this contributor

* This entry is optional



<a id="propertyname-string"></a>
## Property name ∷  String

name of this contributor

* This entry is optional



<a id="propertyorganization-string"></a>
## Property organization ∷  String

organization name of this contributor

* This entry is optional



<a id="propertyphone-string"></a>
## Property phone ∷  String

telephone number of this contributor

* This entry is optional



<a id="propertyrole-string"></a>
## Property role ∷  String

role played by this contributor

* This entry is optional



<a id="map6"></a>
# *COARequested* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[COA](#propertycoa-string)| String|COA reference|&#10003;|
|[contributors](#propertycontributors-contributorobjectlist)|*Contributor* Object List|contributing actors for the CourseOfAction taken||
|[time](#propertytime-instdate)|Inst (Date)|relative time criteria for this taken CourseOfAction||

* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

<a id="propertycoa-string"></a>
## Property COA ∷  String

COA reference

* This entry is required


  * A URI leading to a COA

<a id="propertycontributors-contributorobjectlist"></a>
## Property contributors ∷ *Contributor* Object List

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map22-ref"></a>
* *Contributor* Object Value
  * Details: [*Contributor* Object](#map22)

<a id="propertytime-instdate"></a>
## Property time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map22"></a>
# *Contributor* Object

Person who contributed cyber observation data

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[contribution_location](#propertycontribution_location-string)| String|information describing the location at which the contributory activity occured||
|[date](#propertydate-instdate)|Inst (Date)|description (bounding) of the timing of this contributor's involvement||
|[email](#propertyemail-string)| String|email of this contributor||
|[name](#propertyname-string)| String|name of this contributor||
|[organization](#propertyorganization-string)| String|organization name of this contributor||
|[phone](#propertyphone-string)| String|telephone number of this contributor||
|[role](#propertyrole-string)| String|role played by this contributor||

* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

<a id="propertycontribution_location-string"></a>
## Property contribution_location ∷  String

information describing the location at which the contributory activity occured

* This entry is optional



<a id="propertydate-instdate"></a>
## Property date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyemail-string"></a>
## Property email ∷  String

email of this contributor

* This entry is optional



<a id="propertyname-string"></a>
## Property name ∷  String

name of this contributor

* This entry is optional



<a id="propertyorganization-string"></a>
## Property organization ∷  String

organization name of this contributor

* This entry is optional



<a id="propertyphone-string"></a>
## Property phone ∷  String

telephone number of this contributor

* This entry is optional



<a id="propertyrole-string"></a>
## Property role ∷  String

role played by this contributor

* This entry is optional



<a id="map7"></a>
# *History* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[action_entry](#propertyaction_entry-coarequestedobjectlist)|*COARequested* Object List|a record of actions taken during the handling of the Incident||
|[journal_entry](#propertyjournal_entry-string)| String|journal notes for information discovered during the handling of the Incident||

* Reference: [HistoryItemType](http://stixproject.github.io/data-model/1.2/incident/HistoryItemType/)

<a id="propertyaction_entry-coarequestedobjectlist"></a>
## Property action_entry ∷ *COARequested* Object List

a record of actions taken during the handling of the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map23-ref"></a>
* *COARequested* Object Value
  * Details: [*COARequested* Object](#map23)

<a id="propertyjournal_entry-string"></a>
## Property journal_entry ∷  String

journal notes for information discovered during the handling of the Incident

* This entry is optional
* Dev Notes: simplified


  * String with at most 5000 characters

<a id="map23"></a>
# *COARequested* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[COA](#propertycoa-string)| String|COA reference|&#10003;|
|[contributors](#propertycontributors-contributorobjectlist)|*Contributor* Object List|contributing actors for the CourseOfAction taken||
|[time](#propertytime-instdate)|Inst (Date)|relative time criteria for this taken CourseOfAction||

* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

<a id="propertycoa-string"></a>
## Property COA ∷  String

COA reference

* This entry is required


  * A URI leading to a COA

<a id="propertycontributors-contributorobjectlist"></a>
## Property contributors ∷ *Contributor* Object List

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map24-ref"></a>
* *Contributor* Object Value
  * Details: [*Contributor* Object](#map24)

<a id="propertytime-instdate"></a>
## Property time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map24"></a>
# *Contributor* Object

Person who contributed cyber observation data

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[contribution_location](#propertycontribution_location-string)| String|information describing the location at which the contributory activity occured||
|[date](#propertydate-instdate)|Inst (Date)|description (bounding) of the timing of this contributor's involvement||
|[email](#propertyemail-string)| String|email of this contributor||
|[name](#propertyname-string)| String|name of this contributor||
|[organization](#propertyorganization-string)| String|organization name of this contributor||
|[phone](#propertyphone-string)| String|telephone number of this contributor||
|[role](#propertyrole-string)| String|role played by this contributor||

* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

<a id="propertycontribution_location-string"></a>
## Property contribution_location ∷  String

information describing the location at which the contributory activity occured

* This entry is optional



<a id="propertydate-instdate"></a>
## Property date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyemail-string"></a>
## Property email ∷  String

email of this contributor

* This entry is optional



<a id="propertyname-string"></a>
## Property name ∷  String

name of this contributor

* This entry is optional



<a id="propertyorganization-string"></a>
## Property organization ∷  String

organization name of this contributor

* This entry is optional



<a id="propertyphone-string"></a>
## Property phone ∷  String

telephone number of this contributor

* This entry is optional



<a id="propertyrole-string"></a>
## Property role ∷  String

role played by this contributor

* This entry is optional



<a id="map8"></a>
# *RelatedIndicator* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[indicator_id](#propertyindicator_id-string)| String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| ||
|[relationship](#propertyrelationship-string)| String| ||
|[source](#propertysource-string)| String| ||


<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyindicator_id-string"></a>
## Property indicator_id ∷  String

* This entry is required


  * A URI leading to an indicator

<a id="propertyrelationship-string"></a>
## Property relationship ∷  String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional



<a id="map9"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



<a id="map10"></a>
# *RelatedTTP* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[TTP_id](#propertyttp_id-string)| String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| ||
|[relationship](#propertyrelationship-string)| String| ||
|[source](#propertysource-string)| String| ||


<a id="propertyttp_id-string"></a>
## Property TTP_id ∷  String

* This entry is required


  * A URI leading to a TTP

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyrelationship-string"></a>
## Property relationship ∷  String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional



<a id="map11"></a>
# *RelatedActor* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[actor_id](#propertyactor_id-string)| String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| ||
|[relationship](#propertyrelationship-string)| String| ||
|[source](#propertysource-string)| String| ||


<a id="propertyactor_id-string"></a>
## Property actor_id ∷  String

* This entry is required


  * A URI leading to an actor

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyrelationship-string"></a>
## Property relationship ∷  String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional



<a id="map12"></a>
# *RelatedIncident* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[incident_id](#propertyincident_id-string)| String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| ||
|[relationship](#propertyrelationship-string)| String| ||
|[source](#propertysource-string)| String| ||


<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyincident_id-string"></a>
## Property incident_id ∷  String

* This entry is required


  * A URI leading to an incident

<a id="propertyrelationship-string"></a>
## Property relationship ∷  String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


