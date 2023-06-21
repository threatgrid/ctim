<a id="top"></a>
# *Incident* Object

*Incident* Information about computer security incident response. A computer security
   incident is a violation or imminent threat of violation of computer
   security policies, acceptable use policies, or standard security practices.
   Incidents pertain to one or more *adverse events*, each of which is modeled
   as a [sighting](sighting.md).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|Represents the level of certainty or trustworthiness associated with the incident. It denotes the reliability of the intelligence associated with the incident. The `confidence` field can take on several values, including: - `info`: Indicates that the incident information is based on sources with no previous track record or there is no track record for the source reporting the incident. - `low`: Indicates that the incident information is based on sources with a questionable track record or there is limited information about the accuracy of the source. - `medium`: Indicates that the incident information is based on sources with a mixed track record or of uncertain reliability. - `high`: Indicates that the incident information is based on sources with a proven track record and high degree of reliability. The `confidence` field can be used to indicate the level of trust and confidence that can be attributed to the incident, and it may impact how the incident is prioritized, analyzed and addressed. It can also help in the decision-making process associated with the incident response activities. It is important to note that the `confidence` field is subjective and can be interpreted differently by different organizations or analysts. As such, it is often used in conjunction with other intelligence attributes, such as the `severity` field, to provide a more complete picture of the incident.|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[incident_time](#propertyincident_time-incidenttimeobject)|*IncidentTime* Object|Relevant time values associated with this Incident|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[status](#propertystatus-statusstring)|StatusString|The `status` field represents the current state of an incident within the incident management process. Its values help in tracking and reporting the progress of the incident from its discovery to its resolution.|&#10003;|
|[type](#propertytype-incidenttypeidentifierstring)|IncidentTypeIdentifierString| |&#10003;|
|[assignees](#propertyassignees-shortstringstringlist)|ShortStringString List|A set of owners assigned to this incident||
|[categories](#propertycategories-incidentcategorystringlist)|IncidentCategoryString List|A set of categories for this incident||
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[discovery_method](#propertydiscovery_method-discoverymethodstring)|DiscoveryMethodString|Identifies how the incident was discovered||
|[external_ids](#propertyexternal_ids-stringlist)|String List|It is used to store a list of external identifiers that can be linked to the incident, providing a reliable and manageable way to correlate and group related events across multiple data sources. It is especially useful in larger organizations that rely on multiple security information and event management (SIEM) systems to detect security incidents. For instance, it can be used to track events across different network sensors, intrusion detection and prevention systems (IDPS), or log management platforms. The field can also be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems. It can be used to cross-reference with other external tools such as threat intelligence feeds and vulnerability scanners.||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information.  Similar to `external_ids` field with major differences:  - `external_ids` field is used to store a list of external identifiers that can be used to link entities across different data sources. These identifiers are typically standardized and well-known, such as CVE IDs, US-CERT advisories, or other industry-standard threat intelligence feeds. The `external_ids` field can be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems.   - `external_references` field, on the other hand, is used to provide a more general mechanism for linking entities to external sources of information. The `external_references` field can include references to blog posts, articles, external documents, threat intelligence reports, and other sources of information that may not have a standardized format or identifier.||
|[intended_effect](#propertyintended_effect-intendedeffectstring)|IntendedEffectString|Specifies the suspected intended effect of this incident||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The `language` field is used to specify the primary language of the affected system or the target of an attack. It can be used to provide additional context and information about the entity. The primary purpose of this field is to help analysts filter and prioritize entities based on their knowledge and expertise of different languages.  For example, if an incident involves an attack on a system in a country where a specific language is predominant, the `language` field can be used to indicate that language, which can help analysts to quickly identify and respond to incidents that may be geographically or culturally relevant. This information can be used to prioritize incidents based on their potential impact. The `language` field can also be used to help with correlation of incidents across different systems and regions, as well as to help with data analysis and reporting.||
|[promotion_method](#propertypromotion_method-promotionmethodstring)|PromotionMethodString|Field to indicate how the incident was promoted from an alert.An alert can be promoted to an incident manually by a security analyst or automatically through a workflow.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[scores](#propertyscores-incidentscoresobject)|*IncidentScores* Object|Used to indicate the severity or impact score of the threat represented by the incident.||
|[severity](#propertyseverity-severitystring)|SeverityString|Represents the potential impact of an incident on an organization's security posture and business operations. It helps organizations prioritize and allocate resources for incident response based on the severity level of the incident  It helps analysts and incident handlers prioritize incidents by indicating the level of risk and potential impact associated with the incident. This enables organizations to allocate resources efficiently and address the most critical incidents first. Can also be used to generate reports and metrics for measuring the effectiveness of the incident response process and to identify trends and patterns in the threat landscape. It is important to note that the `severity` field is subjective and can be interpreted differently by different organizations or analysts. Therefore, it should be used in conjunction with other intelligence attributes, such as the `confidence` field, to provide a more comprehensive view of the incident.||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[tactics](#propertytactics-shortstringstringlist)|ShortStringString List|Represents the offensive techniques, approaches, or procedures that an adversary may use to achieve their objectives during an attack. It helps in understanding the intent and capabilities of the adversary and can be used to identify indicators of attack (IoAs) or indicators of compromise (IoCs) that are associated with the adversary's tactics.||
|[techniques](#propertytechniques-shortstringstringlist)|ShortStringString List|Represents the specific methods or actions used by an attacker to carry out an offensive maneuver or achieve their goals.||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how a resource is intended to be shared, replicated, copied, etc.  It is used to indicate the sensitivity of the information contained within the message. This allows recipients to determine the appropriate handling and dissemination of the information based on their clearance level and need-to-know.  For example, an entity containing information about a critical vulnerability in a widely-used software might be marked as `red`, indicating that it should only be shared with a small group of highly trusted individuals who need to know in order to take appropriate action. On the other hand, a message containing more general information about security threats might be marked as `amber` or `green`, indicating that it can be shared more broadly within an organization.||


<a id="propertyassignees-shortstringstringlist"></a>
## Property assignees ∷ ShortStringString List

A set of owners assigned to this incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertycategories-incidentcategorystringlist"></a>
## Property categories ∷ IncidentCategoryString List

A set of categories for this incident

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
## Property confidence ∷ HighMedLowString

Represents the level of certainty or trustworthiness associated with the incident. It denotes the reliability of the intelligence associated with the incident.
The `confidence` field can take on several values, including:
- `info`: Indicates that the incident information is based on sources with no previous track record or there is no track record for the source reporting the incident.
- `low`: Indicates that the incident information is based on sources with a questionable track record or there is limited information about the accuracy of the source.
- `medium`: Indicates that the incident information is based on sources with a mixed track record or of uncertain reliability.
- `high`: Indicates that the incident information is based on sources with a proven track record and high degree of reliability.
The `confidence` field can be used to indicate the level of trust and confidence that can be attributed to the incident, and it may impact how the incident is prioritized, analyzed and addressed. It can also help in the decision-making process associated with the incident response activities.
It is important to note that the `confidence` field is subjective and can be interpreted differently by different organizations or analysts. As such, it is often used in conjunction with other intelligence attributes, such as the `severity` field, to provide a more complete picture of the incident.

* This entry is required


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

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertydiscovery_method-discoverymethodstring"></a>
## Property discovery_method ∷ DiscoveryMethodString

Identifies how the incident was discovered

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

<a id="propertyincident_time-incidenttimeobject"></a>
## Property incident_time ∷ *IncidentTime* Object

Relevant time values associated with this Incident

* This entry is required
* Dev Notes: Was 'time'; renamed for clarity


<a id="map2-ref"></a>
* *IncidentTime* Object Value
  * Details: [*IncidentTime* Object](#map2)

<a id="propertyintended_effect-intendedeffectstring"></a>
## Property intended_effect ∷ IntendedEffectString

Specifies the suspected intended effect of this incident

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

<a id="propertypromotion_method-promotionmethodstring"></a>
## Property promotion_method ∷ PromotionMethodString

Field to indicate how the incident was promoted from an alert.An alert can be promoted to an incident manually by a security analyst or automatically through a workflow.

* This entry is optional


  * Allowed Values:
    * Automated
    * Manual

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

<a id="propertyscores-incidentscoresobject"></a>
## Property scores ∷ *IncidentScores* Object

Used to indicate the severity or impact score of the threat represented by the incident.

* This entry is optional


<a id="map3-ref"></a>
* *IncidentScores* Object Value
  * Details: [*IncidentScores* Object](#map3)

<a id="propertyseverity-severitystring"></a>
## Property severity ∷ SeverityString

Represents the potential impact of an incident on an organization's security posture and business operations. It helps organizations prioritize and allocate resources for incident response based on the severity level of the incident 
It helps analysts and incident handlers prioritize incidents by indicating the level of risk and potential impact associated with the incident. This enables organizations to allocate resources efficiently and address the most critical incidents first.
Can also be used to generate reports and metrics for measuring the effectiveness of the incident response process and to identify trends and patterns in the threat landscape.
It is important to note that the `severity` field is subjective and can be interpreted differently by different organizations or analysts. Therefore, it should be used in conjunction with other intelligence attributes, such as the `confidence` field, to provide a more comprehensive view of the incident.

* This entry is optional


  * Allowed Values:
    * Critical
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertystatus-statusstring"></a>
## Property status ∷ StatusString

The `status` field represents the current state of an incident within the incident management process. Its values help in tracking and reporting the progress of the incident from its discovery to its resolution.

* This entry is required


  * Allowed Values:
    * Closed
    * Containment Achieved
    * Incident Reported
    * New
    * Open
    * Rejected
    * Restoration Achieved
    * Stalled

<a id="propertytactics-shortstringstringlist"></a>
## Property tactics ∷ ShortStringString List

Represents the offensive techniques, approaches, or procedures that an adversary may use to achieve their objectives during an attack. It helps in understanding the intent and capabilities of the adversary and can be used to identify indicators of attack (IoAs) or indicators of compromise (IoCs) that are associated with the adversary's tactics.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertytechniques-shortstringstringlist"></a>
## Property techniques ∷ ShortStringString List

Represents the specific methods or actions used by an attacker to carry out an offensive maneuver or achieve their goals.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

A short title for this object, used as primary display and reference value

* This entry is optional


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

<a id="propertytype-incidenttypeidentifierstring"></a>
## Property type ∷ IncidentTypeIdentifierString

* This entry is required


  * Must equal: "incident"

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
# *IncidentTime* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[opened](#propertyopened-instdate)|Inst (Date)|Time the incident was first opened.|&#10003;|
|[closed](#propertyclosed-instdate)|Inst (Date)|Time that the incident was last closed.||
|[discovered](#propertydiscovered-instdate)|Inst (Date)|Time the incident was first discovered.||
|[rejected](#propertyrejected-instdate)|Inst (Date)|Time that the incident was first rejected.||
|[remediated](#propertyremediated-instdate)|Inst (Date)|Time that the remediation of the damage from the incident was completed.||
|[reported](#propertyreported-instdate)|Inst (Date)|Time the incident was first reported.||


<a id="propertyclosed-instdate"></a>
## Property closed ∷ Inst (Date)

Time that the incident was last closed.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertydiscovered-instdate"></a>
## Property discovered ∷ Inst (Date)

Time the incident was first discovered.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyopened-instdate"></a>
## Property opened ∷ Inst (Date)

Time the incident was first opened.

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyrejected-instdate"></a>
## Property rejected ∷ Inst (Date)

Time that the incident was first rejected.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyremediated-instdate"></a>
## Property remediated ∷ Inst (Date)

Time that the remediation of the damage from the incident was completed.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyreported-instdate"></a>
## Property reported ∷ Inst (Date)

Time the incident was first reported.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map3"></a>
# *IncidentScores* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[Keyword](#propertykeyword-number)|Number|Field is used to indicate the severity or impact of the threat represented by the incident.  - `asset` - assesses the potential damage or harm that the threat can cause to the affected asset or assets. The scale ranges from 0 to 10, with 10 indicating the highest potential harm.  `global` - assesses the overall impact or significance of the threat to the organization or wider community. The scale ranges from 0 to 1000, with 1000 indicating the highest impact. `tlp` - assesses the sophistication or complexity of the attack techniques used by the threat actor. The scale ranges from 0 to 100, with 100 indicating the highest level of sophistication||


<a id="propertykeyword-number"></a>
## Property Keyword ∷ Number

Field is used to indicate the severity or impact of the threat represented by the incident.

- `asset` - assesses the potential damage or harm that the threat can cause to the affected asset or assets. The scale ranges from 0 to 10, with 10 indicating the highest potential harm. 
`global` - assesses the overall impact or significance of the threat to the organization or wider community. The scale ranges from 0 to 1000, with 1000 indicating the highest impact.
`tlp` - assesses the sophistication or complexity of the attack techniques used by the threat actor. The scale ranges from 0 to 100, with 100 indicating the highest level of sophistication

* This entry is optional

  * Allowed Values:
    * :asset
    * :global
    * :ttp

  * a non-negative score number
