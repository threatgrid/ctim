<a id="top"></a>
# *Note* Object

*Note* A Note is intended to convey informative text to provide further context and/or to provide additional analysis not contained in the Objects, assigning Text/content to the Object the Note relates to Notes can be created by anyone (not just the original object creator).
For example, an analyst may add a Note to a Campaign object created by another organization indicating that they've seen posts related to that Campaign on a hacker forum.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[content](#propertycontent-markdownstring)|MarkdownString| |&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[note_class](#propertynote_class-keyword)|Keyword| |&#10003;|
|[related_entities](#propertyrelated_entities-noterelatedentityobjectlist)|*NoteRelatedEntity* Object List| |&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-notetypeidentifierstring)|NoteTypeIdentifierString| |&#10003;|
|[author](#propertyauthor-string)|String| ||
|[external_ids](#propertyexternal_ids-stringlist)|String List|It is used to store a list of external identifiers that can be linked to the incident, providing a reliable and manageable way to correlate and group related events across multiple data sources. It is especially useful in larger organizations that rely on multiple security information and event management (SIEM) systems to detect security incidents. For instance, it can be used to track events across different network sensors, intrusion detection and prevention systems (IDPS), or log management platforms.   The field can also be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems. It can be used to cross-reference with other external tools such as threat intelligence feeds and vulnerability scanners. ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information.  Similar to `external_ids` field with major differences:  - `external_ids` field is used to store a list of external identifiers that can be used to link entities across different data sources. These identifiers are typically standardized and well-known, such as CVE IDs, US-CERT advisories, or other industry-standard threat intelligence feeds. The `external_ids` field can be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems.   - `external_references` field, on the other hand, is used to provide a more general mechanism for linking entities to external sources of information. The `external_references` field can include references to blog posts, articles, external documents, threat intelligence reports, and other sources of information that may not have a standardized format or identifier.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The `language` field is used to specify the primary language of the affected system or the target of an attack. It can be used to provide additional context and information about the entity. The primary purpose of this field is to help analysts filter and prioritize entities based on their knowledge and expertise of different languages.  For example, if an incident involves an attack on a system in a country where a specific language is predominant, the `language` field can be used to indicate that language, which can help analysts to quickly identify and respond to incidents that may be geographically or culturally relevant. This information can be used to prioritize incidents based on their potential impact. The `language` field can also be used to help with correlation of incidents across different systems and regions, as well as to help with data analysis and reporting.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[source](#propertysource-medstringstring)|MedStringString|Represents the source of the intelligence that led to the creation of the entity.||
|[source_uri](#propertysource_uri-string)|String|URI of the source of the intelligence that led to the creation of the entity.||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how a resource is intended to be shared, replicated, copied, etc.  It is used to indicate the sensitivity of the information contained within the message. This allows recipients to determine the appropriate handling and dissemination of the information based on their clearance level and need-to-know.  For example, an entity containing information about a critical vulnerability in a widely-used software might be marked as `red`, indicating that it should only be shared with a small group of highly trusted individuals who need to know in order to take appropriate action. On the other hand, a message containing more general information about security threats might be marked as `amber` or `green`, indicating that it can be shared more broadly within an organization.||


<a id="propertyauthor-string"></a>
## Property author ∷ String

* This entry is optional



<a id="propertycontent-markdownstring"></a>
## Property content ∷ MarkdownString

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

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The `language` field is used to specify the primary language of the affected system or the target of an attack. It can be used to provide additional context and information about the entity. The primary purpose of this field is to help analysts filter and prioritize entities based on their knowledge and expertise of different languages.

For example, if an incident involves an attack on a system in a country where a specific language is predominant, the `language` field can be used to indicate that language, which can help analysts to quickly identify and respond to incidents that may be geographically or culturally relevant. This information can be used to prioritize incidents based on their potential impact. The `language` field can also be used to help with correlation of incidents across different systems and regions, as well as to help with data analysis and reporting.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertynote_class-keyword"></a>
## Property note_class ∷ Keyword

* This entry is required



<a id="propertyrelated_entities-noterelatedentityobjectlist"></a>
## Property related_entities ∷ *NoteRelatedEntity* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map2-ref"></a>
* *NoteRelatedEntity* Object Value
  * Details: [*NoteRelatedEntity* Object](#map2)

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

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

Represents the source of the intelligence that led to the creation of the entity.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

URI of the source of the intelligence that led to the creation of the entity.

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

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

<a id="propertytype-notetypeidentifierstring"></a>
## Property type ∷ NoteTypeIdentifierString

* This entry is required


  * Must equal: "note"

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
# *NoteRelatedEntity* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[entity_id](#propertyentity_id-string)|String| |&#10003;|
|[entity_type](#propertyentity_type-string)|String| |&#10003;|


<a id="propertyentity_id-string"></a>
## Property entity_id ∷ String

* This entry is required


  * A URI leading to an entity

<a id="propertyentity_type-string"></a>
## Property entity_type ∷ String

* This entry is required


