<a id="top"></a>
# *Actor* Object

Describes malicious actors (or adversaries) related to a cyber attack

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:actor_type](#property-actor_type-threatactortypestring)|ThreatActorType String| |&#10003;|
|[:id](#property-id-string)| String| |&#10003;|
|[:schema_version](#property-schema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[:source](#property-source-string)| String| |&#10003;|
|[:type](#property-type-actortypeidentifierstring)|ActorTypeIdentifier String| |&#10003;|
|[:valid_time](#property-valid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[:confidence](#property-confidence-highmedlowstring)|HighMedLow String| ||
|[:description](#property-description-string)| String| ||
|[:external_ids](#property-external_ids-stringlist)| String List| ||
|[:identity](#property-identity-identityobject)|*Identity* Object| ||
|[:intended_effect](#property-intended_effect-intendedeffectstring)|IntendedEffect String| ||
|[:language](#property-language-string)| String| ||
|[:motivation](#property-motivation-motivationstring)|Motivation String| ||
|[:planning_and_operational_support](#property-planning_and_operational_support-string)| String| ||
|[:revision](#property-revision-integer)|Integer| ||
|[:short_description](#property-short_description-string)| String| ||
|[:sophistication](#property-sophistication-sophisticationstring)|Sophistication String| ||
|[:source_uri](#property-source_uri-string)| String| ||
|[:timestamp](#property-timestamp-instdate)|Inst (Date)| ||
|[:title](#property-title-string)| String| ||
|[:tlp](#property-tlp-tlpstring)|TLP String| ||

* Reference: [ThreatActorType](http://stixproject.github.io/data-model/1.2/ta/ThreatActorType/)

<a id="property-actor_type-threatactortypestring"></a>
## Property :actor_type ∷ ThreatActorType String

* This entry is required


  * Allowed Values:
    * Cyber Espionage Operations
    * Disgruntled Customer / User
    * Hacker
    * Hacker - Black hat
    * Hacker - Gray hat
    * Hacker - White hat
    * Hacktivist
    * Insider Threat
    * State Actor / Agency
    * eCrime Actor - Credential Theft Botnet Operator
    * eCrime Actor - Credential Theft Botnet Service
    * eCrime Actor - Malware Developer
    * eCrime Actor - Money Laundering Network
    * eCrime Actor - Organized Crime Actor
    * eCrime Actor - Spam Service
    * eCrime Actor - Traffic Service
    * eCrime Actor - Underground Call Service

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

<a id="property-description-string"></a>
## Property :description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="property-external_ids-stringlist"></a>
## Property :external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="property-id-string"></a>
## Property :id ∷  String

* This entry is required


  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.

<a id="property-identity-identityobject"></a>
## Property :identity ∷ *Identity* Object

* This entry is optional


<a id="map2-ref"></a>
* *Identity* Object Value
  * Details: [*Identity* Object](#map2)

<a id="property-intended_effect-intendedeffectstring"></a>
## Property :intended_effect ∷ IntendedEffect String

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

<a id="property-motivation-motivationstring"></a>
## Property :motivation ∷ Motivation String

* This entry is optional


  * Allowed Values:
    * Ego
    * Financial or Economic
    * Ideological
    * Ideological - Anti-Corruption
    * Ideological - Anti-Establishment
    * Ideological - Environmental
    * Ideological - Ethnic / Nationalist
    * Ideological - Human Rights
    * Ideological - Information Freedom
    * Ideological - Religious
    * Ideological - Security Awareness
    * Military
    * Opportunistic
    * Political

<a id="property-planning_and_operational_support-string"></a>
## Property :planning_and_operational_support ∷  String

* This entry is optional


  * String with at most 5000 characters

<a id="property-revision-integer"></a>
## Property :revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="property-schema_version-string"></a>
## Property :schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="property-short_description-string"></a>
## Property :short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="property-sophistication-sophisticationstring"></a>
## Property :sophistication ∷ Sophistication String

* This entry is optional


  * Allowed Values:
    * Aspirant
    * Expert
    * Innovator
    * Novice
    * Practitioner

<a id="property-source-string"></a>
## Property :source ∷  String

* This entry is required


  * String with at most 2048 characters

<a id="property-source_uri-string"></a>
## Property :source_uri ∷  String

* This entry is optional


  * A URI

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

<a id="property-type-actortypeidentifierstring"></a>
## Property :type ∷ ActorTypeIdentifier String

* This entry is required


  * Must equal: "actor"

<a id="property-valid_time-validtimeobject"></a>
## Property :valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map1-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map1)

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
# *Identity* Object

Describes a person or an organization

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:description](#property-description-string)| String| |&#10003;|
|[:related_identities](#property-related_identities-relatedidentityobjectlist)|*RelatedIdentity* Object List|Identifies other entity Identities related to this Identity|&#10003;|

* Reference: [IdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/)

<a id="property-description-string"></a>
## Property :description ∷  String

* This entry is required


  * Markdown string with at most 5000 characters

<a id="property-related_identities-relatedidentityobjectlist"></a>
## Property :related_identities ∷ *RelatedIdentity* Object List

Identifies other entity Identities related to this Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map3-ref"></a>
* *RelatedIdentity* Object Value
  * Details: [*RelatedIdentity* Object](#map3)

<a id="map3"></a>
# *RelatedIdentity* Object

Describes a related Identity

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:identity](#property-identity-string)| String|The reference (URI) of the related Identity object|&#10003;|
|[:confidence](#property-confidence-highmedlowstring)|HighMedLow String|Specifies the level of confidence in the assertion of the relationship between the two objects||
|[:information_source](#property-information_source-string)| String|Specifies the source of the information about the relationship between the two components||
|[:relationship](#property-relationship-string)| String| ||

* Reference: [RelatedIdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/)

<a id="property-confidence-highmedlowstring"></a>
## Property :confidence ∷ HighMedLow String

Specifies the level of confidence in the assertion of the relationship between the two objects

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="property-identity-string"></a>
## Property :identity ∷  String

The reference (URI) of the related Identity object

* This entry is required


  * A URI

<a id="property-information_source-string"></a>
## Property :information_source ∷  String

Specifies the source of the information about the relationship between the two components

* This entry is optional



<a id="property-relationship-string"></a>
## Property :relationship ∷  String

* This entry is optional


