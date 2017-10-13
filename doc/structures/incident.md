<a id="top"></a>
# *Incident* Object

Discrete instance of indicators affecting an organization as well
  as information associated with incident response

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:confidence](#property-confidence-highmedlowstring)|HighMedLow String|level of confidence held in the characterization of this Incident|&#10003;|
|[:id](#property-id-string)| String| |&#10003;|
|[:schema_version](#property-schema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[:type](#property-type-incidenttypeidentifierstring)|IncidentTypeIdentifier String| |&#10003;|
|[:valid_time](#property-valid_time-validtimeobject)|*ValidTime* Object|time stamp for the definition of a specific version of an Incident|&#10003;|
|[:COA_requested](#property-coa_requested-coarequestedobjectlist)|*COARequested* Object List|specifies and characterizes requested Course Of Action for this Incident as specified by the Producer for the Consumer of the Incident Report||
|[:COA_taken](#property-coa_taken-coarequestedobjectlist)|*COARequested* Object List|specifies and characterizes a Course Of Action taken for this Incident||
|[:affected_assets](#property-affected_assets-affectedassetobjectlist)|*AffectedAsset* Object List|particular assets affected during the Incident||
|[:attributed_actors](#property-attributed_actors-relatedactorobjectlist)|*RelatedActor* Object List|identifies ThreatActors asserted to be attributed for this Incident||
|[:categories](#property-categories-incidentcategorystringlist)|IncidentCategory String List|a set of categories for this incident||
|[:contact](#property-contact-string)| String|identifies and characterizes organizations or personnel involved in this Incident||
|[:coordinator](#property-coordinator-string)| String|information about the assigned coordinator for this Incident||
|[:description](#property-description-string)| String| ||
|[:discovery_method](#property-discovery_method-discoverymethodstring)|DiscoveryMethod String|identifies how the incident was discovered||
|[:external_ids](#property-external_ids-stringlist)| String List| ||
|[:history](#property-history-historyobjectlist)|*History* Object List|a log of events or actions taken during the handling of the Incident||
|[:impact_assessment](#property-impact_assessment-impactassessmentobject)|*ImpactAssessment* Object|a summary assessment of impact for this cyber threat Incident||
|[:incident_time](#property-incident_time-incidenttimeobject)|*IncidentTime* Object|relevant time values associated with this Incident||
|[:intended_effect](#property-intended_effect-intendedeffectstring)|IntendedEffect String|specifies the suspected intended effect of this incident||
|[:language](#property-language-string)| String| ||
|[:leveraged_TTPs](#property-leveraged_ttps-relatedttpobjectlist)|*RelatedTTP* Object List|specifies TTPs asserted to be related to this cyber threat Incident||
|[:related_incidents](#property-related_incidents-relatedincidentobjectlist)|*RelatedIncident* Object List|identifies or characterizes one or more other Incidents related to this cyber threat Incident||
|[:related_indicators](#property-related_indicators-relatedindicatorobjectlist)|*RelatedIndicator* Object List|identifies or characterizes one or more cyber threat Indicators related to this cyber threat Incident||
|[:related_observables](#property-related_observables-observableobjectlist)|*Observable* Object List|identifies or characterizes one or more cyber observables related to this cyber threat incident||
|[:reporter](#property-reporter-string)| String|information about the reporting source of this Incident||
|[:responder](#property-responder-string)| String|information about the assigned responder for this Incident||
|[:revision](#property-revision-integer)|Integer| ||
|[:security_compromise](#property-security_compromise-securitycompromisestring)|SecurityCompromise String|knowledge of whether the Incident involved a compromise of security properties||
|[:short_description](#property-short_description-string)| String| ||
|[:source](#property-source-string)| String| ||
|[:source_uri](#property-source_uri-string)| String| ||
|[:status](#property-status-statusstring)|Status String|current status of the incident||
|[:timestamp](#property-timestamp-instdate)|Inst (Date)| ||
|[:title](#property-title-string)| String| ||
|[:tlp](#property-tlp-tlpstring)|TLP String| ||
|[:victim](#property-victim-string)| String|information about a victim of this Incident||

* Reference: [IncidentType](http://stixproject.github.io/data-model/1.2/incident/IncidentType/)

<a id="property-coa_requested-coarequestedobjectlist"></a>
## Property :COA_requested ∷ *COARequested* Object List

specifies and characterizes requested Course Of Action for this Incident as specified by the Producer for the Consumer of the Incident Report

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map5-ref"></a>
* *COARequested* Object Value
  * Details: [*COARequested* Object](#map5)

<a id="property-coa_taken-coarequestedobjectlist"></a>
## Property :COA_taken ∷ *COARequested* Object List

specifies and characterizes a Course Of Action taken for this Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map6-ref"></a>
* *COARequested* Object Value
  * Details: [*COARequested* Object](#map6)

<a id="property-affected_assets-affectedassetobjectlist"></a>
## Property :affected_assets ∷ *AffectedAsset* Object List

particular assets affected during the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map3-ref"></a>
* *AffectedAsset* Object Value
  * Details: [*AffectedAsset* Object](#map3)

<a id="property-attributed_actors-relatedactorobjectlist"></a>
## Property :attributed_actors ∷ *RelatedActor* Object List

identifies ThreatActors asserted to be attributed for this Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: was attributed_threat_actors


<a id="map11-ref"></a>
* *RelatedActor* Object Value
  * Details: [*RelatedActor* Object](#map11)

<a id="property-categories-incidentcategorystringlist"></a>
## Property :categories ∷ IncidentCategory String List

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

<a id="property-confidence-highmedlowstring"></a>
## Property :confidence ∷ HighMedLow String

level of confidence held in the characterization of this Incident

* This entry is required


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="property-contact-string"></a>
## Property :contact ∷  String

identifies and characterizes organizations or personnel involved in this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="property-coordinator-string"></a>
## Property :coordinator ∷  String

information about the assigned coordinator for this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="property-description-string"></a>
## Property :description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="property-discovery_method-discoverymethodstring"></a>
## Property :discovery_method ∷ DiscoveryMethod String

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

<a id="property-external_ids-stringlist"></a>
## Property :external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="property-history-historyobjectlist"></a>
## Property :history ∷ *History* Object List

a log of events or actions taken during the handling of the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map7-ref"></a>
* *History* Object Value
  * Details: [*History* Object](#map7)

<a id="property-id-string"></a>
## Property :id ∷  String

* This entry is required


  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.

<a id="property-impact_assessment-impactassessmentobject"></a>
## Property :impact_assessment ∷ *ImpactAssessment* Object

a summary assessment of impact for this cyber threat Incident

* This entry is optional


<a id="map4-ref"></a>
* *ImpactAssessment* Object Value
  * Details: [*ImpactAssessment* Object](#map4)

<a id="property-incident_time-incidenttimeobject"></a>
## Property :incident_time ∷ *IncidentTime* Object

relevant time values associated with this Incident

* This entry is optional
* Dev Notes: Was 'time'; renamed for clarity


<a id="map2-ref"></a>
* *IncidentTime* Object Value
  * Details: [*IncidentTime* Object](#map2)

<a id="property-intended_effect-intendedeffectstring"></a>
## Property :intended_effect ∷ IntendedEffect String

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

<a id="property-language-string"></a>
## Property :language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="property-leveraged_ttps-relatedttpobjectlist"></a>
## Property :leveraged_TTPs ∷ *RelatedTTP* Object List

specifies TTPs asserted to be related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map10-ref"></a>
* *RelatedTTP* Object Value
  * Details: [*RelatedTTP* Object](#map10)

<a id="property-related_incidents-relatedincidentobjectlist"></a>
## Property :related_incidents ∷ *RelatedIncident* Object List

identifies or characterizes one or more other Incidents related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map12-ref"></a>
* *RelatedIncident* Object Value
  * Details: [*RelatedIncident* Object](#map12)

<a id="property-related_indicators-relatedindicatorobjectlist"></a>
## Property :related_indicators ∷ *RelatedIndicator* Object List

identifies or characterizes one or more cyber threat Indicators related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map8-ref"></a>
* *RelatedIndicator* Object Value
  * Details: [*RelatedIndicator* Object](#map8)

<a id="property-related_observables-observableobjectlist"></a>
## Property :related_observables ∷ *Observable* Object List

identifies or characterizes one or more cyber observables related to this cyber threat incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Was related_observables


<a id="map9-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map9)

<a id="property-reporter-string"></a>
## Property :reporter ∷  String

information about the reporting source of this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="property-responder-string"></a>
## Property :responder ∷  String

information about the assigned responder for this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="property-revision-integer"></a>
## Property :revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="property-schema_version-string"></a>
## Property :schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="property-security_compromise-securitycompromisestring"></a>
## Property :security_compromise ∷ SecurityCompromise String

knowledge of whether the Incident involved a compromise of security properties

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="property-short_description-string"></a>
## Property :short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="property-source-string"></a>
## Property :source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="property-source_uri-string"></a>
## Property :source_uri ∷  String

* This entry is optional


  * A URI

<a id="property-status-statusstring"></a>
## Property :status ∷ Status String

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

<a id="property-timestamp-instdate"></a>
## Property :timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-title-string"></a>
## Property :title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="property-tlp-tlpstring"></a>
## Property :tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="property-type-incidenttypeidentifierstring"></a>
## Property :type ∷ IncidentTypeIdentifier String

* This entry is required


  * Must equal: "incident"

<a id="property-valid_time-validtimeobject"></a>
## Property :valid_time ∷ *ValidTime* Object

time stamp for the definition of a specific version of an Incident

* This entry is required


<a id="map1-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map1)

<a id="property-victim-string"></a>
## Property :victim ∷  String

information about a victim of this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="map1"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:end_time](#property-end_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[:start_time](#property-start_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="property-end_time-instdate"></a>
## Property :end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-start_time-instdate"></a>
## Property :start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map2"></a>
# *IncidentTime* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:containment_achieved](#property-containment_achieved-instdate)|Inst (Date)| ||
|[:first_data_exfiltration](#property-first_data_exfiltration-instdate)|Inst (Date)| ||
|[:first_malicious_action](#property-first_malicious_action-instdate)|Inst (Date)| ||
|[:incident_closed](#property-incident_closed-instdate)|Inst (Date)| ||
|[:incident_discovery](#property-incident_discovery-instdate)|Inst (Date)| ||
|[:incident_opened](#property-incident_opened-instdate)|Inst (Date)| ||
|[:incident_reported](#property-incident_reported-instdate)|Inst (Date)| ||
|[:initial_compromise](#property-initial_compromise-instdate)|Inst (Date)| ||
|[:restoration_achieved](#property-restoration_achieved-instdate)|Inst (Date)| ||

* Reference: [TimeType](http://stixproject.github.io/data-model/1.2/incident/TimeType/)

<a id="property-containment_achieved-instdate"></a>
## Property :containment_achieved ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-first_data_exfiltration-instdate"></a>
## Property :first_data_exfiltration ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-first_malicious_action-instdate"></a>
## Property :first_malicious_action ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-incident_closed-instdate"></a>
## Property :incident_closed ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-incident_discovery-instdate"></a>
## Property :incident_discovery ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-incident_opened-instdate"></a>
## Property :incident_opened ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-incident_reported-instdate"></a>
## Property :incident_reported ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-initial_compromise-instdate"></a>
## Property :initial_compromise ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-restoration_achieved-instdate"></a>
## Property :restoration_achieved ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map3"></a>
# *AffectedAsset* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:description](#property-description-string)| String|text description of the asset||
|[:identifying_observables](#property-identifying_observables-observableobjectlist)|*Observable* Object List| ||
|[:location_class](#property-location_class-locationclassstring)|LocationClass String|high-level characterization of where this asset is physically located||
|[:management_class](#property-management_class-managementclassstring)|ManagementClass String|high-level characterization of who is responsible for the day-to-day management and administration of this asset||
|[:ownership_class](#property-ownership_class-ownershipclassstring)|OwnershipClass String|high-level characterization of who owns (or controls) this asset||
|[:property_affected](#property-property_affected-propertyaffectedobject)|*PropertyAffected* Object|affected property||
|[:type](#property-type-string)| String|type of the asset impacted by the incident (a security attribute was negatively affected).||

* Reference: [AffectedAssetType](http://stixproject.github.io/data-model/1.2/incident/AffectedAssetType/)

<a id="property-description-string"></a>
## Property :description ∷  String

text description of the asset

* This entry is optional


  * String with at most 5000 characters

<a id="property-identifying_observables-observableobjectlist"></a>
## Property :identifying_observables ∷ *Observable* Object List

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map14-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map14)

<a id="property-location_class-locationclassstring"></a>
## Property :location_class ∷ LocationClass String

high-level characterization of where this asset is physically located

* This entry is optional


  * Allowed Values:
    * Co-Located
    * Externally-Located
    * Internally-Located
    * Mobile
    * Unknown

<a id="property-management_class-managementclassstring"></a>
## Property :management_class ∷ ManagementClass String

high-level characterization of who is responsible for the day-to-day management and administration of this asset

* This entry is optional


  * Allowed Values:
    * CO-Management
    * Externally-Management
    * Internally-Managed
    * Unknown

<a id="property-ownership_class-ownershipclassstring"></a>
## Property :ownership_class ∷ OwnershipClass String

high-level characterization of who owns (or controls) this asset

* This entry is optional


  * Allowed Values:
    * Customer-Owned
    * Employee-Owned
    * Internally-Owned
    * Partner-Owned
    * Unknown

<a id="property-property_affected-propertyaffectedobject"></a>
## Property :property_affected ∷ *PropertyAffected* Object

affected property

* This entry is optional
* Dev Notes: Unnested NatureOfSecurityEffect


<a id="map13-ref"></a>
* *PropertyAffected* Object Value
  * Details: [*PropertyAffected* Object](#map13)

<a id="property-type-string"></a>
## Property :type ∷  String

type of the asset impacted by the incident (a security attribute was negatively affected).

* This entry is optional


  * String with at most 1024 characters

<a id="map14"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:type](#property-type-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[:value](#property-value-string)| String| |&#10003;|


<a id="property-type-observabletypeidentifierstring"></a>
## Property :type ∷ ObservableTypeIdentifier String

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

<a id="property-value-string"></a>
## Property :value ∷  String

* This entry is required



<a id="map13"></a>
# *PropertyAffected* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:description_of_effect](#property-description_of_effect-string)| String|a brief prose description of how the security property was affected||
|[:duration_of_availability_loss](#property-duration_of_availability_loss-lossdurationstring)|LossDuration String|approximate length of time availability was affected||
|[:non_public_data_compromised](#property-non_public_data_compromised-nonpublicdatacompromisedobject)|*NonPublicDataCompromised* Object|approximate length of time availability was affected||
|[:property](#property-property-losspropertystring)|LossProperty String|security property that was affected by the incident||
|[:type_of_availability_loss](#property-type_of_availability_loss-string)| String|characterizes in what manner the availability of this asset was affected||

* Reference: [PropertyAffectedTpye](http://stixproject.github.io/data-model/1.2/incident/PropertyAffectedType/)

<a id="property-description_of_effect-string"></a>
## Property :description_of_effect ∷  String

a brief prose description of how the security property was affected

* This entry is optional


  * String with at most 5000 characters

<a id="property-duration_of_availability_loss-lossdurationstring"></a>
## Property :duration_of_availability_loss ∷ LossDuration String

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

<a id="property-non_public_data_compromised-nonpublicdatacompromisedobject"></a>
## Property :non_public_data_compromised ∷ *NonPublicDataCompromised* Object

approximate length of time availability was affected

* This entry is optional


<a id="map15-ref"></a>
* *NonPublicDataCompromised* Object Value
  * Details: [*NonPublicDataCompromised* Object](#map15)

<a id="property-property-losspropertystring"></a>
## Property :property ∷ LossProperty String

security property that was affected by the incident

* This entry is optional


  * Allowed Values:
    * Accountability
    * Availability
    * Confidentiality
    * Integrity
    * Non-Repudiation

<a id="property-type_of_availability_loss-string"></a>
## Property :type_of_availability_loss ∷  String

characterizes in what manner the availability of this asset was affected

* This entry is optional
* Dev Notes: empty vocabulary


  * String with at most 1024 characters

<a id="map15"></a>
# *NonPublicDataCompromised* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:security_compromise](#property-security_compromise-securitycompromisestring)|SecurityCompromise String|related security compromise|&#10003;|
|[:data_encrypted](#property-data_encrypted-boolean)|Boolean|whether the data that was compromised was encrypted or not||

* Reference: [NonPublicDataCompromisedType](http://stixproject.github.io/data-model/1.2/incident/NonPublicDataCompromisedType/)

<a id="property-data_encrypted-boolean"></a>
## Property :data_encrypted ∷ Boolean

whether the data that was compromised was encrypted or not

* This entry is optional



<a id="property-security_compromise-securitycompromisestring"></a>
## Property :security_compromise ∷ SecurityCompromise String

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
|[:direct_impact_summary](#property-direct_impact_summary-directimpactsummaryobject)|*DirectImpactSummary* Object|characterizes (at a high level) losses directly resulting from the ThreatActor's actions against organizational assets within the Incident||
|[:effects](#property-effects-effectstringlist)|Effect String List|list of effects of this incident from a controlled vocabulary||
|[:impact_qualification](#property-impact_qualification-impactqualificationstring)|ImpactQualification String|summarizes the subjective level of impact of the Incident||
|[:indirect_impact_summary](#property-indirect_impact_summary-indirectimpactsummaryobject)|*IndirectImpactSummary* Object|characterizes (at a high level) losses from other stakeholder reactions to the Incident||
|[:total_loss_estimation](#property-total_loss_estimation-totallossestimationobject)|*TotalLossEstimation* Object|specifies the total estimated financial loss for the Incident||

* Reference:  [ImpactAssessmentType](http://stixproject.github.io/data-model/1.2/incident/ImpactAssessmentType/)

<a id="property-direct_impact_summary-directimpactsummaryobject"></a>
## Property :direct_impact_summary ∷ *DirectImpactSummary* Object

characterizes (at a high level) losses directly resulting from the ThreatActor's actions against organizational assets within the Incident

* This entry is optional


<a id="map16-ref"></a>
* *DirectImpactSummary* Object Value
  * Details: [*DirectImpactSummary* Object](#map16)

<a id="property-effects-effectstringlist"></a>
## Property :effects ∷ Effect String List

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

<a id="property-impact_qualification-impactqualificationstring"></a>
## Property :impact_qualification ∷ ImpactQualification String

summarizes the subjective level of impact of the Incident

* This entry is optional


  * Allowed Values:
    * Catastrophic
    * Damaging
    * Distracting
    * Insignificant
    * Painful
    * Unknown

<a id="property-indirect_impact_summary-indirectimpactsummaryobject"></a>
## Property :indirect_impact_summary ∷ *IndirectImpactSummary* Object

characterizes (at a high level) losses from other stakeholder reactions to the Incident

* This entry is optional


<a id="map17-ref"></a>
* *IndirectImpactSummary* Object Value
  * Details: [*IndirectImpactSummary* Object](#map17)

<a id="property-total_loss_estimation-totallossestimationobject"></a>
## Property :total_loss_estimation ∷ *TotalLossEstimation* Object

specifies the total estimated financial loss for the Incident

* This entry is optional


<a id="map18-ref"></a>
* *TotalLossEstimation* Object Value
  * Details: [*TotalLossEstimation* Object](#map18)

<a id="map18"></a>
# *TotalLossEstimation* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:actual_total_loss_estimation](#property-actual_total_loss_estimation-lossestimationobject)|*LossEstimation* Object|specifies the actual level of total estimated financial loss for the Incident||
|[:initial_reported_total_loss_estimation](#property-initial_reported_total_loss_estimation-lossestimationobject)|*LossEstimation* Object|specifies the initially reported level of total estimated financial loss for the Incident||

* Reference: [TotalLossEstimationType](http://stixproject.github.io/data-model/1.2/incident/TotalLossEstimationType/)

<a id="property-actual_total_loss_estimation-lossestimationobject"></a>
## Property :actual_total_loss_estimation ∷ *LossEstimation* Object

specifies the actual level of total estimated financial loss for the Incident

* This entry is optional


<a id="map20-ref"></a>
* *LossEstimation* Object Value
  * Details: [*LossEstimation* Object](#map20)

<a id="property-initial_reported_total_loss_estimation-lossestimationobject"></a>
## Property :initial_reported_total_loss_estimation ∷ *LossEstimation* Object

specifies the initially reported level of total estimated financial loss for the Incident

* This entry is optional


<a id="map19-ref"></a>
* *LossEstimation* Object Value
  * Details: [*LossEstimation* Object](#map19)

<a id="map20"></a>
# *LossEstimation* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:amount](#property-amount-integer)|Integer|the estimated financial loss for the Incident||
|[:iso_currency_code](#property-iso_currency_code-string)| String|ISO 4217 currency code if other than USD||

* Reference: [LossEstimationType](http://stixproject.github.io/data-model/1.2/incident/LossEstimationType/)

<a id="property-amount-integer"></a>
## Property :amount ∷ Integer

the estimated financial loss for the Incident

* This entry is optional



<a id="property-iso_currency_code-string"></a>
## Property :iso_currency_code ∷  String

ISO 4217 currency code if other than USD

* This entry is optional


  * String with at most 1024 characters

<a id="map19"></a>
# *LossEstimation* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:amount](#property-amount-integer)|Integer|the estimated financial loss for the Incident||
|[:iso_currency_code](#property-iso_currency_code-string)| String|ISO 4217 currency code if other than USD||

* Reference: [LossEstimationType](http://stixproject.github.io/data-model/1.2/incident/LossEstimationType/)

<a id="property-amount-integer"></a>
## Property :amount ∷ Integer

the estimated financial loss for the Incident

* This entry is optional



<a id="property-iso_currency_code-string"></a>
## Property :iso_currency_code ∷  String

ISO 4217 currency code if other than USD

* This entry is optional


  * String with at most 1024 characters

<a id="map17"></a>
# *IndirectImpactSummary* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:brand_and_market_damage](#property-brand_and_market_damage-securitycompromisestring)|SecurityCompromise String|characterizes (at a high level) the level of impact based on brand or market damage that occured in the Incident||
|[:increased_operating_costs](#property-increased_operating_costs-securitycompromisestring)|SecurityCompromise String|characterizes (at a high level) the level of impact based on increased operating costs that occured in the Incident||
|[:local_and_regulatory_costs](#property-local_and_regulatory_costs-securitycompromisestring)|SecurityCompromise String| ||
|[:loss_of_competitive_advantage](#property-loss_of_competitive_advantage-securitycompromisestring)|SecurityCompromise String|characterizes (at a high level) the level of impact based on loss of competitive advantage that occured in the Incident||

* Reference: [IndirectImpactSummaryType](http://stixproject.github.io/data-model/1.2/incident/IndirectImpactSummaryType/)

<a id="property-brand_and_market_damage-securitycompromisestring"></a>
## Property :brand_and_market_damage ∷ SecurityCompromise String

characterizes (at a high level) the level of impact based on brand or market damage that occured in the Incident

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="property-increased_operating_costs-securitycompromisestring"></a>
## Property :increased_operating_costs ∷ SecurityCompromise String

characterizes (at a high level) the level of impact based on increased operating costs that occured in the Incident

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="property-local_and_regulatory_costs-securitycompromisestring"></a>
## Property :local_and_regulatory_costs ∷ SecurityCompromise String

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="property-loss_of_competitive_advantage-securitycompromisestring"></a>
## Property :loss_of_competitive_advantage ∷ SecurityCompromise String

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
|[:asset_losses](#property-asset_losses-impactratingstring)|ImpactRating String|level of asset-related losses that occured in the Incident||
|[:business_mission_distruption](#property-business_mission_distruption-impactratingstring)|ImpactRating String|characterizes (at a high level) the level of business or mission disruption impact that occured in the Incident||
|[:response_and_recovery_costs](#property-response_and_recovery_costs-impactratingstring)|ImpactRating String|characterizes (at a high level) the level of response and recovery RELATED costs that occurred in the Incident||

* Reference: [DirectImpactSummaryType](http://stixproject.github.io/data-model/1.2/incident/DirectImpactSummaryType/)

<a id="property-asset_losses-impactratingstring"></a>
## Property :asset_losses ∷ ImpactRating String

level of asset-related losses that occured in the Incident

* This entry is optional


  * Allowed Values:
    * Major
    * Minor
    * Moderate
    * None
    * Unknown

<a id="property-business_mission_distruption-impactratingstring"></a>
## Property :business_mission_distruption ∷ ImpactRating String

characterizes (at a high level) the level of business or mission disruption impact that occured in the Incident

* This entry is optional


  * Allowed Values:
    * Major
    * Minor
    * Moderate
    * None
    * Unknown

<a id="property-response_and_recovery_costs-impactratingstring"></a>
## Property :response_and_recovery_costs ∷ ImpactRating String

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
|[:COA](#property-coa-string)| String|COA reference|&#10003;|
|[:contributors](#property-contributors-contributorobjectlist)|*Contributor* Object List|contributing actors for the CourseOfAction taken||
|[:time](#property-time-instdate)|Inst (Date)|relative time criteria for this taken CourseOfAction||

* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

<a id="property-coa-string"></a>
## Property :COA ∷  String

COA reference

* This entry is required


  * A URI leading to a COA

<a id="property-contributors-contributorobjectlist"></a>
## Property :contributors ∷ *Contributor* Object List

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map21-ref"></a>
* *Contributor* Object Value
  * Details: [*Contributor* Object](#map21)

<a id="property-time-instdate"></a>
## Property :time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map21"></a>
# *Contributor* Object

Person who contributed cyber observation data

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:contribution_location](#property-contribution_location-string)| String|information describing the location at which the contributory activity occured||
|[:date](#property-date-instdate)|Inst (Date)|description (bounding) of the timing of this contributor's involvement||
|[:email](#property-email-string)| String|email of this contributor||
|[:name](#property-name-string)| String|name of this contributor||
|[:organization](#property-organization-string)| String|organization name of this contributor||
|[:phone](#property-phone-string)| String|telephone number of this contributor||
|[:role](#property-role-string)| String|role played by this contributor||

* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

<a id="property-contribution_location-string"></a>
## Property :contribution_location ∷  String

information describing the location at which the contributory activity occured

* This entry is optional



<a id="property-date-instdate"></a>
## Property :date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-email-string"></a>
## Property :email ∷  String

email of this contributor

* This entry is optional



<a id="property-name-string"></a>
## Property :name ∷  String

name of this contributor

* This entry is optional



<a id="property-organization-string"></a>
## Property :organization ∷  String

organization name of this contributor

* This entry is optional



<a id="property-phone-string"></a>
## Property :phone ∷  String

telephone number of this contributor

* This entry is optional



<a id="property-role-string"></a>
## Property :role ∷  String

role played by this contributor

* This entry is optional



<a id="map6"></a>
# *COARequested* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:COA](#property-coa-string)| String|COA reference|&#10003;|
|[:contributors](#property-contributors-contributorobjectlist)|*Contributor* Object List|contributing actors for the CourseOfAction taken||
|[:time](#property-time-instdate)|Inst (Date)|relative time criteria for this taken CourseOfAction||

* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

<a id="property-coa-string"></a>
## Property :COA ∷  String

COA reference

* This entry is required


  * A URI leading to a COA

<a id="property-contributors-contributorobjectlist"></a>
## Property :contributors ∷ *Contributor* Object List

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map22-ref"></a>
* *Contributor* Object Value
  * Details: [*Contributor* Object](#map22)

<a id="property-time-instdate"></a>
## Property :time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map22"></a>
# *Contributor* Object

Person who contributed cyber observation data

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:contribution_location](#property-contribution_location-string)| String|information describing the location at which the contributory activity occured||
|[:date](#property-date-instdate)|Inst (Date)|description (bounding) of the timing of this contributor's involvement||
|[:email](#property-email-string)| String|email of this contributor||
|[:name](#property-name-string)| String|name of this contributor||
|[:organization](#property-organization-string)| String|organization name of this contributor||
|[:phone](#property-phone-string)| String|telephone number of this contributor||
|[:role](#property-role-string)| String|role played by this contributor||

* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

<a id="property-contribution_location-string"></a>
## Property :contribution_location ∷  String

information describing the location at which the contributory activity occured

* This entry is optional



<a id="property-date-instdate"></a>
## Property :date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-email-string"></a>
## Property :email ∷  String

email of this contributor

* This entry is optional



<a id="property-name-string"></a>
## Property :name ∷  String

name of this contributor

* This entry is optional



<a id="property-organization-string"></a>
## Property :organization ∷  String

organization name of this contributor

* This entry is optional



<a id="property-phone-string"></a>
## Property :phone ∷  String

telephone number of this contributor

* This entry is optional



<a id="property-role-string"></a>
## Property :role ∷  String

role played by this contributor

* This entry is optional



<a id="map7"></a>
# *History* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:action_entry](#property-action_entry-coarequestedobjectlist)|*COARequested* Object List|a record of actions taken during the handling of the Incident||
|[:journal_entry](#property-journal_entry-string)| String|journal notes for information discovered during the handling of the Incident||

* Reference: [HistoryItemType](http://stixproject.github.io/data-model/1.2/incident/HistoryItemType/)

<a id="property-action_entry-coarequestedobjectlist"></a>
## Property :action_entry ∷ *COARequested* Object List

a record of actions taken during the handling of the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map23-ref"></a>
* *COARequested* Object Value
  * Details: [*COARequested* Object](#map23)

<a id="property-journal_entry-string"></a>
## Property :journal_entry ∷  String

journal notes for information discovered during the handling of the Incident

* This entry is optional
* Dev Notes: simplified


  * String with at most 5000 characters

<a id="map23"></a>
# *COARequested* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:COA](#property-coa-string)| String|COA reference|&#10003;|
|[:contributors](#property-contributors-contributorobjectlist)|*Contributor* Object List|contributing actors for the CourseOfAction taken||
|[:time](#property-time-instdate)|Inst (Date)|relative time criteria for this taken CourseOfAction||

* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

<a id="property-coa-string"></a>
## Property :COA ∷  String

COA reference

* This entry is required


  * A URI leading to a COA

<a id="property-contributors-contributorobjectlist"></a>
## Property :contributors ∷ *Contributor* Object List

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map24-ref"></a>
* *Contributor* Object Value
  * Details: [*Contributor* Object](#map24)

<a id="property-time-instdate"></a>
## Property :time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map24"></a>
# *Contributor* Object

Person who contributed cyber observation data

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:contribution_location](#property-contribution_location-string)| String|information describing the location at which the contributory activity occured||
|[:date](#property-date-instdate)|Inst (Date)|description (bounding) of the timing of this contributor's involvement||
|[:email](#property-email-string)| String|email of this contributor||
|[:name](#property-name-string)| String|name of this contributor||
|[:organization](#property-organization-string)| String|organization name of this contributor||
|[:phone](#property-phone-string)| String|telephone number of this contributor||
|[:role](#property-role-string)| String|role played by this contributor||

* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

<a id="property-contribution_location-string"></a>
## Property :contribution_location ∷  String

information describing the location at which the contributory activity occured

* This entry is optional



<a id="property-date-instdate"></a>
## Property :date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-email-string"></a>
## Property :email ∷  String

email of this contributor

* This entry is optional



<a id="property-name-string"></a>
## Property :name ∷  String

name of this contributor

* This entry is optional



<a id="property-organization-string"></a>
## Property :organization ∷  String

organization name of this contributor

* This entry is optional



<a id="property-phone-string"></a>
## Property :phone ∷  String

telephone number of this contributor

* This entry is optional



<a id="property-role-string"></a>
## Property :role ∷  String

role played by this contributor

* This entry is optional



<a id="map8"></a>
# *RelatedIndicator* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:indicator_id](#property-indicator_id-string)| String| |&#10003;|
|[:confidence](#property-confidence-highmedlowstring)|HighMedLow String| ||
|[:relationship](#property-relationship-string)| String| ||
|[:source](#property-source-string)| String| ||


<a id="property-confidence-highmedlowstring"></a>
## Property :confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="property-indicator_id-string"></a>
## Property :indicator_id ∷  String

* This entry is required


  * A URI leading to an indicator

<a id="property-relationship-string"></a>
## Property :relationship ∷  String

* This entry is optional



<a id="property-source-string"></a>
## Property :source ∷  String

* This entry is optional



<a id="map9"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:type](#property-type-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[:value](#property-value-string)| String| |&#10003;|


<a id="property-type-observabletypeidentifierstring"></a>
## Property :type ∷ ObservableTypeIdentifier String

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

<a id="property-value-string"></a>
## Property :value ∷  String

* This entry is required



<a id="map10"></a>
# *RelatedTTP* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:TTP_id](#property-ttp_id-string)| String| |&#10003;|
|[:confidence](#property-confidence-highmedlowstring)|HighMedLow String| ||
|[:relationship](#property-relationship-string)| String| ||
|[:source](#property-source-string)| String| ||


<a id="property-ttp_id-string"></a>
## Property :TTP_id ∷  String

* This entry is required


  * A URI leading to a TTP

<a id="property-confidence-highmedlowstring"></a>
## Property :confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="property-relationship-string"></a>
## Property :relationship ∷  String

* This entry is optional



<a id="property-source-string"></a>
## Property :source ∷  String

* This entry is optional



<a id="map11"></a>
# *RelatedActor* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:actor_id](#property-actor_id-string)| String| |&#10003;|
|[:confidence](#property-confidence-highmedlowstring)|HighMedLow String| ||
|[:relationship](#property-relationship-string)| String| ||
|[:source](#property-source-string)| String| ||


<a id="property-actor_id-string"></a>
## Property :actor_id ∷  String

* This entry is required


  * A URI leading to an actor

<a id="property-confidence-highmedlowstring"></a>
## Property :confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="property-relationship-string"></a>
## Property :relationship ∷  String

* This entry is optional



<a id="property-source-string"></a>
## Property :source ∷  String

* This entry is optional



<a id="map12"></a>
# *RelatedIncident* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:incident_id](#property-incident_id-string)| String| |&#10003;|
|[:confidence](#property-confidence-highmedlowstring)|HighMedLow String| ||
|[:relationship](#property-relationship-string)| String| ||
|[:source](#property-source-string)| String| ||


<a id="property-confidence-highmedlowstring"></a>
## Property :confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="property-incident_id-string"></a>
## Property :incident_id ∷  String

* This entry is required


  * A URI leading to an incident

<a id="property-relationship-string"></a>
## Property :relationship ∷  String

* This entry is optional



<a id="property-source-string"></a>
## Property :source ∷  String

* This entry is optional


