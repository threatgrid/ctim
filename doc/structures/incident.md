<a id="top"></a>
# *Incident* Object

*Incident* Information about computer security incident response. A computer security
   incident is a violation or imminent threat of violation of computer
   security policies, acceptable use policies, or standard security practices.
   Incidents pertain to one or more *adverse events*, each of which is modeled
   as a [sighting](sighting.md).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|level of confidence held in the characterization of this Incident|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[incident_time](#propertyincident_time-incidenttimeobject)|*IncidentTime* Object|relevant time values associated with this Incident|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[status](#propertystatus-statusstring)|StatusString|current status of the incident|&#10003;|
|[type](#propertytype-incidenttypeidentifierstring)|IncidentTypeIdentifierString| |&#10003;|
|[assignees](#propertyassignees-shortstringstringlist)|ShortStringString List|a set of owners assigned to this incident||
|[categories](#propertycategories-incidentcategorystringlist)|IncidentCategoryString List|a set of categories for this incident||
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[discovery_method](#propertydiscovery_method-discoverymethodstring)|DiscoveryMethodString|identifies how the incident was discovered||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[intended_effect](#propertyintended_effect-intendedeffectstring)|IntendedEffectString|specifies the suspected intended effect of this incident||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[promotion_method](#propertypromotion_method-promotionmethodstring)|PromotionMethodString|identifies how the incident was promoted||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[scores](#propertyscores-incidentscoresobject)|*IncidentScores* Object|the scores associated to the incident||
|[severity](#propertyseverity-severitystring)|SeverityString|specifies the severity level of an Incident||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[tactics](#propertytactics-shortstringstringlist)|ShortStringString List|specifies the list of tactic ids (ex: mitre tactic id) of an Incident||
|[techniques](#propertytechniques-shortstringstringlist)|ShortStringString List|specifies the list of technique ids (ex: mitre technique id) of an Incident||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||


<a id="propertyassignees-shortstringstringlist"></a>
## Property assignees ∷ ShortStringString List

a set of owners assigned to this incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertycategories-incidentcategorystringlist"></a>
## Property categories ∷ IncidentCategoryString List

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
## Property confidence ∷ HighMedLowString

level of confidence held in the characterization of this Incident

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
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

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

relevant time values associated with this Incident

* This entry is required
* Dev Notes: Was 'time'; renamed for clarity


<a id="map2-ref"></a>
* *IncidentTime* Object Value
  * Details: [*IncidentTime* Object](#map2)

<a id="propertyintended_effect-intendedeffectstring"></a>
## Property intended_effect ∷ IntendedEffectString

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

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertypromotion_method-promotionmethodstring"></a>
## Property promotion_method ∷ PromotionMethodString

identifies how the incident was promoted

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

the scores associated to the incident

* This entry is optional


<a id="map3-ref"></a>
* *IncidentScores* Object Value
  * Details: [*IncidentScores* Object](#map3)

<a id="propertyseverity-severitystring"></a>
## Property severity ∷ SeverityString

specifies the severity level of an Incident

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

current status of the incident

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

specifies the list of tactic ids (ex: mitre tactic id) of an Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertytechniques-shortstringstringlist"></a>
## Property techniques ∷ ShortStringString List

specifies the list of technique ids (ex: mitre technique id) of an Incident

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

Specification for how, and to whom, this object can be shared.

* This entry is optional


  * *TLP* TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
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
|[Any](#propertyanything-number)|Number|A map of scores.||


<a id="propertyanything-number"></a>
## Property Anything ∷ Number

A map of scores.

* This entry is optional


  * a non-negative score number
