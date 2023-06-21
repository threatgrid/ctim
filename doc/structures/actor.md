<a id="top"></a>
# *Actor* Object

*Actor* Describes malicious actors (or adversaries) related to a cyber attack

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.|&#10003;|
|[source](#propertysource-medstringstring)|MedStringString|Represents the source of the intelligencethat led to the creation of the entity.|&#10003;|
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value|&#10003;|
|[type](#propertytype-actortypeidentifierstring)|ActorTypeIdentifierString| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object|Indicates the time span for which the information about the Actor is relevant, and after which it could become outdated.|&#10003;|
|[actor_types](#propertyactor_types-threatactortypestringlist)|ThreatActorTypeString List| ||
|[aliases](#propertyaliases-shortstringstringlist)|ShortStringString List|A list of other names that this Threat Actor is believed to use.||
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|This field can help analysts decide how much trust they can put in the information provided by the threat intelligence sources.  For example, an Actor entity can have high confidence if the organization's security researchers have been tracking it for a long time and have gathered a significant amount of intelligence about it through various sources, such as analysis of malware, network traffic, and human intelligence. In contrast, low confidence may indicate the organization has only seen limited or circumstantial evidence.||
|[external_ids](#propertyexternal_ids-stringlist)|String List|It is used to store a list of external identifiers that can be linked to the incident, providing a reliable and manageable way to correlate and group related events across multiple data sources. It is especially useful in larger organizations that rely on multiple security information and event management (SIEM) systems to detect security incidents. For instance, it can be used to track events across different network sensors, intrusion detection and prevention systems (IDPS), or log management platforms.   The field can also be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems. It can be used to cross-reference with other external tools such as threat intelligence feeds and vulnerability scanners. ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information.  Similar to `external_ids` field with major differences:  - `external_ids` field is used to store a list of external identifiers that can be used to link entities across different data sources. These identifiers are typically standardized and well-known, such as CVE IDs, US-CERT advisories, or other industry-standard threat intelligence feeds. The `external_ids` field can be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems.   - `external_references` field, on the other hand, is used to provide a more general mechanism for linking entities to external sources of information. The `external_references` field can include references to blog posts, articles, external documents, threat intelligence reports, and other sources of information that may not have a standardized format or identifier.||
|[identity](#propertyidentity-identityobject)|*Identity* Object|Can contain information such as the name of the attacker, the group or organization they belong to, or any other identifier that can help in the attribution process.||
|[intended_effect](#propertyintended_effect-intendedeffectstring)|IntendedEffectString|Represents the desired outcome or impact the threat actor is trying to achieve through their malicious activities.    Helps security analysts to understand the attacker's goals beyond the immediate impact of the attack. By understanding the intended effect, analysts can draw connections between seemingly unrelated attacks and build a more complete understanding of an attacker's long-term goals and motivations.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The `language` field is used to specify the primary language of the affected system or the target of an attack. It can be used to provide additional context and information about the entity. The primary purpose of this field is to help analysts filter and prioritize entities based on their knowledge and expertise of different languages.  For example, if an incident involves an attack on a system in a country where a specific language is predominant, the `language` field can be used to indicate that language, which can help analysts to quickly identify and respond to incidents that may be geographically or culturally relevant. This information can be used to prioritize incidents based on their potential impact. The `language` field can also be used to help with correlation of incidents across different systems and regions, as well as to help with data analysis and reporting.||
|[motivation](#propertymotivation-motivationstring)|MotivationString|The reason or purpose behind the malicious activity attributed to this Actor. By understanding a threat actor's motivation, analysts can better predict the attacker's behavior and anticipate future malicious actions.||
|[planning_and_operational_support](#propertyplanning_and_operational_support-longstringstring)|LongStringString|Provides information about the resources and capabilities of the attacker that could be used to assist in planning and operations related to the threat.   It can be used to describe Infrastructure, Tools, Techniques, and Capabilities used by the threat actor.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[sophistication](#propertysophistication-sophisticationstring)|SophisticationString|Represents the level of expertise and skill that the threat actor has displayed in their malicious activities. Can help security analysts assess the potential impact of an attacker's TTPs and determine the potential attack surface.   For example, a threat actor with a low sophistication level may primarily rely on off-the-shelf malware and attack tools, while an attacker with high sophistication may use custom tools with advanced evasion techniques, zero-day exploits, and sophisticated methods for command and control of their malware.   The sophistication level of an attacker can also be inferred based on several factors such as the complexity of attacks, the attacker's knowledge of the targeted organization's systems, and the attacker's ability to remain undetected.  If an attacker shows a high level of sophistication in reconnaissances, social engineering, and phishing, then the attacker may have a good knowledge of the targeted organization and its employees. This means that the attacker may be more successful in infiltrating the organization's network and compromising its systems. ||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how a resource is intended to be shared, replicated, copied, etc.  It is used to indicate the sensitivity of the information contained within the message. This allows recipients to determine the appropriate handling and dissemination of the information based on their clearance level and need-to-know.  For example, an entity containing information about a critical vulnerability in a widely-used software might be marked as `red`, indicating that it should only be shared with a small group of highly trusted individuals who need to know in order to take appropriate action. On the other hand, a message containing more general information about security threats might be marked as `amber` or `green`, indicating that it can be shared more broadly within an organization.||

* Reference: [ThreatActorType](http://stixproject.github.io/data-model/1.2/ta/ThreatActorType/)

<a id="propertyactor_types-threatactortypestringlist"></a>
## Property actor_types ∷ ThreatActorTypeString List

* This entry is optional
* This entry's type is sequential (allows zero or more values)


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

<a id="propertyaliases-shortstringstringlist"></a>
## Property aliases ∷ ShortStringString List

A list of other names that this Threat Actor is believed to use.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

This field can help analysts decide how much trust they can put in the information provided by the threat intelligence sources.

For example, an Actor entity can have high confidence if the organization's security researchers have been tracking it for a long time and have gathered a significant amount of intelligence about it through various sources, such as analysis of malware, network traffic, and human intelligence. In contrast, low confidence may indicate the organization has only seen limited or circumstantial evidence.

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

It is used to store a list of external identifiers that can be linked to the incident, providing a reliable and manageable way to correlate and group related events across multiple data sources. It is especially useful in larger organizations that rely on multiple security information and event management (SIEM) systems to detect security incidents. For instance, it can be used to track events across different network sensors, intrusion detection and prevention systems (IDPS), or log management platforms. 
 The field can also be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems. It can be used to cross-reference with other external tools such as threat intelligence feeds and vulnerability scanners. 

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information.

Similar to `external_ids` field with major differences:

- `external_ids` field is used to store a list of external identifiers that can be used to link entities across different data sources. These identifiers are typically standardized and well-known, such as CVE IDs, US-CERT advisories, or other industry-standard threat intelligence feeds. The `external_ids` field can be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems. 

- `external_references` field, on the other hand, is used to provide a more general mechanism for linking entities to external sources of information. The `external_references` field can include references to blog posts, articles, external documents, threat intelligence reports, and other sources of information that may not have a standardized format or identifier.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map1-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map1)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyidentity-identityobject"></a>
## Property identity ∷ *Identity* Object

Can contain information such as the name of the attacker, the group or organization they belong to, or any other identifier that can help in the attribution process.

* This entry is optional


<a id="map3-ref"></a>
* *Identity* Object Value
  * Details: [*Identity* Object](#map3)

<a id="propertyintended_effect-intendedeffectstring"></a>
## Property intended_effect ∷ IntendedEffectString

Represents the desired outcome or impact the threat actor is trying to achieve through their malicious activities. 

 Helps security analysts to understand the attacker's goals beyond the immediate impact of the attack. By understanding the intended effect, analysts can draw connections between seemingly unrelated attacks and build a more complete understanding of an attacker's long-term goals and motivations.

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

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The `language` field is used to specify the primary language of the affected system or the target of an attack. It can be used to provide additional context and information about the entity. The primary purpose of this field is to help analysts filter and prioritize entities based on their knowledge and expertise of different languages.

For example, if an incident involves an attack on a system in a country where a specific language is predominant, the `language` field can be used to indicate that language, which can help analysts to quickly identify and respond to incidents that may be geographically or culturally relevant. This information can be used to prioritize incidents based on their potential impact. The `language` field can also be used to help with correlation of incidents across different systems and regions, as well as to help with data analysis and reporting.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertymotivation-motivationstring"></a>
## Property motivation ∷ MotivationString

The reason or purpose behind the malicious activity attributed to this Actor. By understanding a threat actor's motivation, analysts can better predict the attacker's behavior and anticipate future malicious actions.

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

<a id="propertyplanning_and_operational_support-longstringstring"></a>
## Property planning_and_operational_support ∷ LongStringString

Provides information about the resources and capabilities of the attacker that could be used to assist in planning and operations related to the threat.

 It can be used to describe Infrastructure, Tools, Techniques, and Capabilities used by the threat actor.

* This entry is optional


  * *LongString* String with at most 5000 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysophistication-sophisticationstring"></a>
## Property sophistication ∷ SophisticationString

Represents the level of expertise and skill that the threat actor has displayed in their malicious activities. Can help security analysts assess the potential impact of an attacker's TTPs and determine the potential attack surface. 

For example, a threat actor with a low sophistication level may primarily rely on off-the-shelf malware and attack tools, while an attacker with high sophistication may use custom tools with advanced evasion techniques, zero-day exploits, and sophisticated methods for command and control of their malware. 

The sophistication level of an attacker can also be inferred based on several factors such as the complexity of attacks, the attacker's knowledge of the targeted organization's systems, and the attacker's ability to remain undetected.

If an attacker shows a high level of sophistication in reconnaissances, social engineering, and phishing, then the attacker may have a good knowledge of the targeted organization and its employees. This means that the attacker may be more successful in infiltrating the organization's network and compromising its systems. 

* This entry is optional


  * Allowed Values:
    * Aspirant
    * Expert
    * Innovator
    * Novice
    * Practitioner

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

Represents the source of the intelligencethat led to the creation of the entity.

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

A short title for this object, used as primary display and reference value

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLPString

TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how a resource is intended to be shared, replicated, copied, etc.

It is used to indicate the sensitivity of the information contained within the message. This allows recipients to determine the appropriate handling and dissemination of the information based on their clearance level and need-to-know.

For example, an entity containing information about a critical vulnerability in a widely-used software might be marked as `red`, indicating that it should only be shared with a small group of highly trusted individuals who need to know in order to take appropriate action. On the other hand, a message containing more general information about security threats might be marked as `amber` or `green`, indicating that it can be shared more broadly within an organization.

* This entry is optional


  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-actortypeidentifierstring"></a>
## Property type ∷ ActorTypeIdentifierString

* This entry is required


  * Must equal: "actor"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

Indicates the time span for which the information about the Actor is relevant, and after which it could become outdated.

* This entry is required


<a id="map2-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map2)

<a id="map1"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map2"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map3"></a>
# *Identity* Object

*Identity* Describes a person or an organization

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString| |&#10003;|
|[related_identities](#propertyrelated_identities-relatedidentityobjectlist)|*RelatedIdentity* Object List|Identifies other entity Identities related to this Identity|&#10003;|

* Reference: [IdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyrelated_identities-relatedidentityobjectlist"></a>
## Property related_identities ∷ *RelatedIdentity* Object List

Identifies other entity Identities related to this Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map4-ref"></a>
* *RelatedIdentity* Object Value
  * Details: [*RelatedIdentity* Object](#map4)

<a id="map4"></a>
# *RelatedIdentity* Object

*RelatedIdentity* Describes a related Identity

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[identity](#propertyidentity-string)|String|The reference (URI) of the related Identity object|&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|Specifies the level of confidence in the assertion of the relationship between the two objects||
|[information_source](#propertyinformation_source-string)|String|Specifies the source of the information about the relationship between the two components||
|[relationship](#propertyrelationship-string)|String| ||

* Reference: [RelatedIdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/)

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

Specifies the level of confidence in the assertion of the relationship between the two objects

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyidentity-string"></a>
## Property identity ∷ String

The reference (URI) of the related Identity object

* This entry is required


  * A URI

<a id="propertyinformation_source-string"></a>
## Property information_source ∷ String

Specifies the source of the information about the relationship between the two components

* This entry is optional



<a id="propertyrelationship-string"></a>
## Property relationship ∷ String

* This entry is optional


