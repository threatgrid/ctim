<a id="top"></a>
# *COA* Object

*COA* Course of Action. A corrective or preventative action to be taken in response to a threat.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity.|&#10003;|
|[type](#propertytype-coatypeidentifierstring)|COATypeIdentifierString| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[coa_type](#propertycoa_type-coatypestring)|COATypeString|The type of this COA||
|[cost](#propertycost-highmedlowstring)|HighMedLowString|Characterizes the estimated cost for applying this course of action.||
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[efficacy](#propertyefficacy-highmedlowstring)|HighMedLowString|Effectiveness of this course of action in achieving its targeted objective.||
|[external_ids](#propertyexternal_ids-stringlist)|String List|It is used to store a list of external identifiers that can be linked to the incident, providing a reliable and manageable way to correlate and group related events across multiple data sources. It is especially useful in larger organizations that rely on multiple security information and event management (SIEM) systems to detect security incidents. For instance, it can be used to track events across different network sensors, intrusion detection and prevention systems (IDPS), or log management platforms.   The field can also be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems. It can be used to cross-reference with other external tools such as threat intelligence feeds and vulnerability scanners.||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information.  Similar to `external_ids` field with major differences:  - `external_ids` field is used to store a list of external identifiers that can be used to link entities across different data sources. These identifiers are typically standardized and well-known, such as CVE IDs, US-CERT advisories, or other industry-standard threat intelligence feeds. The `external_ids` field can be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems.   - `external_references` field, on the other hand, is used to provide a more general mechanism for linking entities to external sources of information. The `external_references` field can include references to blog posts, articles, external documents, threat intelligence reports, and other sources of information that may not have a standardized format or identifier.||
|[impact](#propertyimpact-shortstringstring)|ShortStringString|Characterizes the estimated impact of applying this course of action.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The `language` field is used to specify the primary language of the affected system or the target of an attack. It can be used to provide additional context and information about the entity. The primary purpose of this field is to help analysts filter and prioritize entities based on their knowledge and expertise of different languages.  For example, if an incident involves an attack on a system in a country where a specific language is predominant, the `language` field can be used to indicate that language, which can help analysts to quickly identify and respond to incidents that may be geographically or culturally relevant. This information can be used to prioritize incidents based on their potential impact. The `language` field can also be used to help with correlation of incidents across different systems and regions, as well as to help with data analysis and reporting.||
|[objective](#propertyobjective-shortstringstringlist)|ShortStringString List|Characterizes the objective to provide guidance on how to mitigate a security incident that has been identified.||
|[open_c2_coa](#propertyopen_c2_coa-openc2coaobject)|*OpenC2COA* Object| ||
|[related_COAs](#propertyrelated_coas-relatedcoaobjectlist)|*RelatedCOA* Object List|Identifies or characterizes relationships to one or more related courses of action.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString|Represents the source of the intelligence that led to the creation of the entity.||
|[source_uri](#propertysource_uri-string)|String|URI of the source of the intelligence that led to the creation of the entity.||
|[stage](#propertystage-coastagestring)|COAStageString|Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to.||
|[structured_coa_type](#propertystructured_coa_type-openc2structuredcoatypestring)|OpenC2StructuredCOATypeString| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value.||
|[tlp](#propertytlp-tlpstring)|TLPString|TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how a resource is intended to be shared, replicated, copied, etc.  It is used to indicate the sensitivity of the information contained within the message. This allows recipients to determine the appropriate handling and dissemination of the information based on their clearance level and need-to-know.  For example, an entity containing information about a critical vulnerability in a widely-used software might be marked as `red`, indicating that it should only be shared with a small group of highly trusted individuals who need to know in order to take appropriate action. On the other hand, a message containing more general information about security threats might be marked as `amber` or `green`, indicating that it can be shared more broadly within an organization.||

* Reference: [CourseOfActionType](http://stixproject.github.io/data-model/1.2/coa/CourseOfActionType/)

<a id="propertycoa_type-coatypestring"></a>
## Property coa_type ∷ COATypeString

The type of this COA

* This entry is optional


  * Allowed Values:
    * Diplomatic Actions
    * Eradication
    * Hardening
    * Internal Blocking
    * Logical Access Restrictions
    * Monitoring
    * Other
    * Patching
    * Perimeter Blocking
    * Phase
    * Physical Access Restrictions
    * Playbook
    * Policy Actions
    * Public Disclosure
    * Rebuilding
    * Redirection
    * Redirection (Honey Pot)
    * Task
    * Training
  * Reference: [CourseOfActionTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/CourseOfActionTypeVocab-1.0/)

<a id="propertycost-highmedlowstring"></a>
## Property cost ∷ HighMedLowString

Characterizes the estimated cost for applying this course of action.

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

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters.

<a id="propertyefficacy-highmedlowstring"></a>
## Property efficacy ∷ HighMedLowString

Effectiveness of this course of action in achieving its targeted objective.

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

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

<a id="propertyimpact-shortstringstring"></a>
## Property impact ∷ ShortStringString

Characterizes the estimated impact of applying this course of action.

* This entry is optional


  * *ShortString* String with at most 1024 characters.

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The `language` field is used to specify the primary language of the affected system or the target of an attack. It can be used to provide additional context and information about the entity. The primary purpose of this field is to help analysts filter and prioritize entities based on their knowledge and expertise of different languages.

For example, if an incident involves an attack on a system in a country where a specific language is predominant, the `language` field can be used to indicate that language, which can help analysts to quickly identify and respond to incidents that may be geographically or culturally relevant. This information can be used to prioritize incidents based on their potential impact. The `language` field can also be used to help with correlation of incidents across different systems and regions, as well as to help with data analysis and reporting.

* This entry is optional


  * *ShortString* String with at most 1024 characters.

<a id="propertyobjective-shortstringstringlist"></a>
## Property objective ∷ ShortStringString List

Characterizes the objective to provide guidance on how to mitigate a security incident that has been identified.

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Squashed / simplified


  * *ShortString* String with at most 1024 characters.

<a id="propertyopen_c2_coa-openc2coaobject"></a>
## Property open_c2_coa ∷ *OpenC2COA* Object

* This entry is optional


<a id="map4-ref"></a>
* *OpenC2COA* Object Value
  * Details: [*OpenC2COA* Object](#map4)

<a id="propertyrelated_coas-relatedcoaobjectlist"></a>
## Property related_COAs ∷ *RelatedCOA* Object List

Identifies or characterizes relationships to one or more related courses of action.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map3-ref"></a>
* *RelatedCOA* Object Value
  * Details: [*RelatedCOA* Object](#map3)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer.

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity.

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters.

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

Represents the source of the intelligence that led to the creation of the entity.

* This entry is optional


  * *MedString* String with at most 2048 characters.

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

URI of the source of the intelligence that led to the creation of the entity.

* This entry is optional


  * A URI

<a id="propertystage-coastagestring"></a>
## Property stage ∷ COAStageString

Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to.

* This entry is optional


  * Allowed Values:
    * Containment
    * Eradication
    * Identification
    * Lessons Learned
    * Preparation
    * Recovery
    * Remedy
    * Response
  * Reference: [COAStageVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/COAStageVocab-1.0/)

<a id="propertystructured_coa_type-openc2structuredcoatypestring"></a>
## Property structured_coa_type ∷ OpenC2StructuredCOATypeString

* This entry is optional


  * Must equal: "openc2"

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

A short title for this object, used as primary display and reference value.

* This entry is optional


  * *ShortString* String with at most 1024 characters.

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLPString

TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how a resource is intended to be shared, replicated, copied, etc.

It is used to indicate the sensitivity of the information contained within the message. This allows recipients to determine the appropriate handling and dissemination of the information based on their clearance level and need-to-know.

For example, an entity containing information about a critical vulnerability in a widely-used software might be marked as `red`, indicating that it should only be shared with a small group of highly trusted individuals who need to know in order to take appropriate action. On the other hand, a message containing more general information about security threats might be marked as `amber` or `green`, indicating that it can be shared more broadly within an organization.

* This entry is optional


  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-coatypeidentifierstring"></a>
## Property type ∷ COATypeIdentifierString

* This entry is required


  * Must equal: "coa"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

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
|[url](#propertyurl-string)|String|A URL reference to an external resource.||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters.

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


  * *MedString* String with at most 2048 characters.

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource.

* This entry is optional


  * A URI

<a id="map2"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound.||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map3"></a>
# *RelatedCOA* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[COA_id](#propertycoa_id-string)|String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| ||
|[relationship](#propertyrelationship-string)|String| ||
|[source](#propertysource-string)|String| ||


<a id="propertycoa_id-string"></a>
## Property COA_id ∷ String

* This entry is required


  * A URI leading to a COA.

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyrelationship-string"></a>
## Property relationship ∷ String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷ String

* This entry is optional



<a id="map4"></a>
# *OpenC2COA* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[action](#propertyaction-actiontypeobject)|*ActionType* Object| |&#10003;|
|[type](#propertytype-structuredcoatypestring)|StructuredCOATypeString| |&#10003;|
|[actuator](#propertyactuator-actuatortypeobject)|*ActuatorType* Object| ||
|[id](#propertyid-shortstringstring)|ShortStringString| ||
|[modifiers](#propertymodifiers-modifiertypeobject)|*ModifierType* Object| ||
|[target](#propertytarget-targettypeobject)|*TargetType* Object| ||


<a id="propertyaction-actiontypeobject"></a>
## Property action ∷ *ActionType* Object

* This entry is required


<a id="map5-ref"></a>
* *ActionType* Object Value
  * Details: [*ActionType* Object](#map5)

<a id="propertyactuator-actuatortypeobject"></a>
## Property actuator ∷ *ActuatorType* Object

* This entry is optional


<a id="map7-ref"></a>
* *ActuatorType* Object Value
  * Details: [*ActuatorType* Object](#map7)

<a id="propertyid-shortstringstring"></a>
## Property id ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters.

<a id="propertymodifiers-modifiertypeobject"></a>
## Property modifiers ∷ *ModifierType* Object

* This entry is optional


<a id="map8-ref"></a>
* *ModifierType* Object Value
  * Details: [*ModifierType* Object](#map8)

<a id="propertytarget-targettypeobject"></a>
## Property target ∷ *TargetType* Object

* This entry is optional


<a id="map6-ref"></a>
* *TargetType* Object Value
  * Details: [*TargetType* Object](#map6)

<a id="propertytype-structuredcoatypestring"></a>
## Property type ∷ StructuredCOATypeString

* This entry is required


  * Must equal: "structured_coa"

<a id="map8"></a>
# *ModifierType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[additional_properties](#propertyadditional_properties-additionalpropertiesobject)|*AdditionalProperties* Object| ||
|[delay](#propertydelay-instdate)|Inst (Date)| ||
|[destination](#propertydestination-string)|String| ||
|[duration](#propertyduration-instdate)|Inst (Date)| ||
|[frequency](#propertyfrequency-shortstringstring)|ShortStringString| ||
|[id](#propertyid-shortstringstring)|ShortStringString| ||
|[location](#propertylocation-string)|String| ||
|[method](#propertymethod-stringlist)|String List| ||
|[option](#propertyoption-shortstringstring)|ShortStringString| ||
|[response](#propertyresponse-string)|String| ||
|[search](#propertysearch-string)|String| ||
|[source](#propertysource-shortstringstring)|ShortStringString| ||
|[time](#propertytime-validtimeobject)|*ValidTime* Object| ||


<a id="propertyadditional_properties-additionalpropertiesobject"></a>
## Property additional_properties ∷ *AdditionalProperties* Object

* This entry is optional


<a id="map10-ref"></a>
* *AdditionalProperties* Object Value
  * Details: [*AdditionalProperties* Object](#map10)

<a id="propertydelay-instdate"></a>
## Property delay ∷ Inst (Date)

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertydestination-string"></a>
## Property destination ∷ String

* This entry is optional


  * Allowed Values:
    * copy-to
    * modify-to
    * move-to
    * report-to
    * restore-point
    * save-to
    * set-to

<a id="propertyduration-instdate"></a>
## Property duration ∷ Inst (Date)

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyfrequency-shortstringstring"></a>
## Property frequency ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters.

<a id="propertyid-shortstringstring"></a>
## Property id ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters.

<a id="propertylocation-string"></a>
## Property location ∷ String

* This entry is optional


  * Allowed Values:
    * internal
    * perimeter

<a id="propertymethod-stringlist"></a>
## Property method ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * Allowed Values:
    * acl
    * authenticated
    * blackhole
    * blacklist
    * graceful
    * hibernate
    * honeypot
    * immediate
    * segmentation
    * spawn
    * suspend
    * unauthenticated
    * whitelist

<a id="propertyoption-shortstringstring"></a>
## Property option ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters.

<a id="propertyresponse-string"></a>
## Property response ∷ String

* This entry is optional


  * Allowed Values:
    * acknowledge
    * command-ref
    * query
    * status

<a id="propertysearch-string"></a>
## Property search ∷ String

* This entry is optional


  * Allowed Values:
    * cve
    * patch
    * signature
    * vendor_bulletin

<a id="propertysource-shortstringstring"></a>
## Property source ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters.

<a id="propertytime-validtimeobject"></a>
## Property time ∷ *ValidTime* Object

* This entry is optional


<a id="map9-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map9)

<a id="map10"></a>
# *AdditionalProperties* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[context](#propertycontext-shortstringstring)|ShortStringString| |&#10003;|


<a id="propertycontext-shortstringstring"></a>
## Property context ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters.

<a id="map9"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound.||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map7"></a>
# *ActuatorType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-actuatortypestring)|ActuatorTypeString| |&#10003;|
|[specifiers](#propertyspecifiers-shortstringstringlist)|ShortStringString List|List of additional properties describing the actuator.||


<a id="propertyspecifiers-shortstringstringlist"></a>
## Property specifiers ∷ ShortStringString List

List of additional properties describing the actuator.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters.

<a id="propertytype-actuatortypestring"></a>
## Property type ∷ ActuatorTypeString

* This entry is required


  * Allowed Values:
    * endpoint
    * endpoint.digital-telephone-handset
    * endpoint.laptop
    * endpoint.pos-terminal
    * endpoint.printer
    * endpoint.sensor
    * endpoint.server
    * endpoint.smart-meter
    * endpoint.smart-phone
    * endpoint.tablet
    * endpoint.workstation
    * network
    * network.bridge
    * network.firewall
    * network.gateway
    * network.guard
    * network.hips
    * network.hub
    * network.ids
    * network.ips
    * network.modem
    * network.nic
    * network.proxy
    * network.router
    * network.security_manager
    * network.sense_making
    * network.sensor
    * network.switch
    * network.vpn
    * network.wap
    * other
    * process
    * process.aaa-server
    * process.anti-virus-scanner
    * process.connection-scanner
    * process.directory-service
    * process.dns-server
    * process.email-service
    * process.file-scanner
    * process.location-service
    * process.network-scanner
    * process.remediation-service
    * process.reputation-service
    * process.sandbox
    * process.virtualization-service
    * process.vulnerability-scanner

<a id="map6"></a>
# *TargetType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-targettypevocabstring)|TargetTypeVocabString| |&#10003;|
|[specifiers](#propertyspecifiers-shortstringstring)|ShortStringString|Observable types that can be acted upon.||


<a id="propertyspecifiers-shortstringstring"></a>
## Property specifiers ∷ ShortStringString

Observable types that can be acted upon.

* This entry is optional


  * *ShortString* String with at most 1024 characters.

<a id="propertytype-targettypevocabstring"></a>
## Property type ∷ TargetTypeVocabString

* This entry is required


  * Allowed Values:
    * acudid
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * cortex_agent_id
    * crowdstrike_id
    * cvm_id
    * cybereason_id
    * darktrace_id
    * device
    * domain
    * email
    * email_messageid
    * email_subject
    * file_name
    * file_path
    * google_chromebook_id
    * google_cloud_id
    * hostname
    * imei
    * imsi
    * intune_id
    * ip
    * ipv6
    * jamf_management_id
    * mac_address
    * md5
    * meraki_network_id
    * meraki_node_sn
    * meraki_org_id
    * ms_machine_id
    * mutex
    * ngfw_id
    * ngfw_name
    * odns_identity
    * odns_identity_label
    * orbital_node_id
    * pki_serial
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_uid
    * process_username
    * processor_id
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * secure_access_id
    * serial_number
    * service_now_id
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="map5"></a>
# *ActionType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-coatypestring)|COATypeString| |&#10003;|


<a id="propertytype-coatypestring"></a>
## Property type ∷ COATypeString

* This entry is required


  * Allowed Values:
    * alert
    * allow
    * augment
    * contain
    * delete
    * deny
    * detonate
    * distill
    * get
    * investigate
    * locate
    * mitigate
    * modify
    * move
    * notify
    * other
    * pause
    * query
    * redirect
    * remediate
    * report
    * response
    * restart
    * restore
    * resume
    * save
    * scan
    * set
    * snapshot
    * start
    * stop
    * substitute
    * sync
    * throttle
    * update
  * Reference: [OpenC2/STIX COA XML schema](https://github.com/OpenC2-org/subgroup-stix/blob/master/schema/openc2_stix_coa.xsd)
