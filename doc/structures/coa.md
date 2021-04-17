<a id="top"></a>
# *COA*

> Reference: [CourseOfActionType](http://stixproject.github.io/data-model/1.2/coa/CourseOfActionType/)

*COA* Course of Action. A corrective or preventative action to be taken in response to a threat

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#propertytype-coatypeidentifierstring)|COATypeIdentifierString| |**Required**|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map2)| |**Required**|
|[coa_type](#propertycoa_type-coatypestring)|COATypeString|The type of this COA|_Optional_|
|[cost](#propertycost-highmedlowstring)|HighMedLowString|Characterizes the estimated cost for applying this course of action|_Optional_|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[efficacy](#propertyefficacy-highmedlowstring)|HighMedLowString|Effectiveness of this course of action in achieving its targeted objective|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap1)|[[*ExternalReference*](#map1)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[impact](#propertyimpact-shortstring)|ShortString|Characterizes the estimated impact of applying this course of action|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[objective](#propertyobjective-shortstring)|[ShortString]|Characterizes the objective of this course of action|_Optional_|
|[open_c2_coa](#propertyopen_c2_coa-openc2coa)|[*OpenC2COA*](#map4)| |_Optional_|
|[related_COAs](#propertyrelated_coas-relatedcoamap3)|[[*RelatedCOA*](#map3)]|Identifies or characterizes relationships to one or more related courses of action|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[stage](#propertystage-coastagestring)|COAStageString|Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to|_Optional_|
|[structured_coa_type](#propertystructured_coa_type-openc2structuredcoatypestring)|OpenC2StructuredCOATypeString| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertytype-coatypeidentifierstring"></a>
## Property type ∷ COATypeIdentifierString

* This entry is required


  * Must equal: "coa"

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

* This entry is required


<a id="map2-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map2)

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
    * Physical Access Restrictions
    * Policy Actions
    * Public Disclosure
    * Rebuilding
    * Redirection
    * Redirection (Honey Pot)
    * Training
  * Reference: [CourseOfActionTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/CourseOfActionTypeVocab-1.0/)


<a id="propertycost-highmedlowstring"></a>
## Property cost ∷ HighMedLowString

Characterizes the estimated cost for applying this course of action

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


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyefficacy-highmedlowstring"></a>
## Property efficacy ∷ HighMedLowString

Effectiveness of this course of action in achieving its targeted objective

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap1"></a>
## Property external_references ∷ [[*ExternalReference*](#map1)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map1-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map1)

<a id="propertyimpact-shortstring"></a>
## Property impact ∷ ShortString

Characterizes the estimated impact of applying this course of action

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyobjective-shortstring"></a>
## Property objective ∷ [ShortString]

Characterizes the objective of this course of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Squashed / simplified


  * *ShortString* String with at most 1024 characters

<a id="propertyopen_c2_coa-openc2coa"></a>
## Property open_c2_coa ∷ *OpenC2COA*

* This entry is optional


<a id="map4-ref"></a>
* *OpenC2COA* Value
  * Details: [*OpenC2COA*](#map4)

<a id="propertyrelated_coas-relatedcoamap3"></a>
## Property related_COAs ∷ [[*RelatedCOA*](#map3)]

Identifies or characterizes relationships to one or more related courses of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map3-ref"></a>
* *RelatedCOA* Value
  * Details: [*RelatedCOA*](#map3)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyshort_description-medstring"></a>
## Property short_description ∷ MedString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertystage-coastagestring"></a>
## Property stage ∷ COAStageString

Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to

* This entry is optional


  * Allowed Values:
    * Remedy
    * Response
  * Reference: [COAStageVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/COAStageVocab-1.0/)


<a id="propertystructured_coa_type-openc2structuredcoatypestring"></a>
## Property structured_coa_type ∷ OpenC2StructuredCOATypeString

* This entry is optional


  * Must equal: "openc2"

<a id="propertytimestamp-datetime"></a>
## Property timestamp ∷ DateTime

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstring"></a>
## Property title ∷ ShortString

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


</details>

<a id="map1"></a>
# *ExternalReference*

> Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstring)|MedString|The source within which the external-reference is defined (system, registry, organization, etc.)|**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString| |_Optional_|
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.|_Optional_|
|[hashes](#propertyhashes-string)|[String]|Specifies a dictionary of hashes for the contents of the url.|_Optional_|
|[url](#propertyurl-string)|String|A URL reference to an external resource|_Optional_|


<details>

<a id="propertysource_name-medstring"></a>
## Property source_name ∷ MedString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-string"></a>
## Property hashes ∷ [String]

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI


</details>

<a id="map2"></a>
# *ValidTime*

> Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-datetime)|DateTime|If end_time is not present, then the valid time position of the object does not have an upper bound.|_Optional_|
|[start_time](#propertystart_time-datetime)|DateTime|If not present, the valid time position of the indicator does not have an upper bound|_Optional_|


<details>

<a id="propertyend_time-datetime"></a>
## Property end_time ∷ DateTime

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-datetime"></a>
## Property start_time ∷ DateTime

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.


</details>

<a id="map3"></a>
# *RelatedCOA*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[COA_id](#propertycoa_id-string)|String| |**Required**|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| |_Optional_|
|[relationship](#propertyrelationship-string)|String| |_Optional_|
|[source](#propertysource-string)|String| |_Optional_|


<details>

<a id="propertycoa_id-string"></a>
## Property COA_id ∷ String

* This entry is required


  * A URI leading to a COA

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




</details>

<a id="map4"></a>
# *OpenC2COA*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[action](#propertyaction-actiontype)|[*ActionType*](#map5)| |**Required**|
|[type](#propertytype-structuredcoatypestring)|StructuredCOATypeString| |**Required**|
|[actuator](#propertyactuator-actuatortype)|[*ActuatorType*](#map7)| |_Optional_|
|[id](#propertyid-shortstring)|ShortString| |_Optional_|
|[modifiers](#propertymodifiers-modifiertype)|[*ModifierType*](#map8)| |_Optional_|
|[target](#propertytarget-targettype)|[*TargetType*](#map6)| |_Optional_|


<details>

<a id="propertyaction-actiontype"></a>
## Property action ∷ *ActionType*

* This entry is required


<a id="map5-ref"></a>
* *ActionType* Value
  * Details: [*ActionType*](#map5)

<a id="propertytype-structuredcoatypestring"></a>
## Property type ∷ StructuredCOATypeString

* This entry is required


  * Must equal: "structured_coa"

<a id="propertyactuator-actuatortype"></a>
## Property actuator ∷ *ActuatorType*

* This entry is optional


<a id="map7-ref"></a>
* *ActuatorType* Value
  * Details: [*ActuatorType*](#map7)

<a id="propertyid-shortstring"></a>
## Property id ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertymodifiers-modifiertype"></a>
## Property modifiers ∷ *ModifierType*

* This entry is optional


<a id="map8-ref"></a>
* *ModifierType* Value
  * Details: [*ModifierType*](#map8)

<a id="propertytarget-targettype"></a>
## Property target ∷ *TargetType*

* This entry is optional


<a id="map6-ref"></a>
* *TargetType* Value
  * Details: [*TargetType*](#map6)


</details>

<a id="map8"></a>
# *ModifierType*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[additional_properties](#propertyadditional_properties-additionalproperties)|[*AdditionalProperties*](#map10)| |_Optional_|
|[delay](#propertydelay-datetime)|DateTime| |_Optional_|
|[destination](#propertydestination-string)|String| |_Optional_|
|[duration](#propertyduration-datetime)|DateTime| |_Optional_|
|[frequency](#propertyfrequency-shortstring)|ShortString| |_Optional_|
|[id](#propertyid-shortstring)|ShortString| |_Optional_|
|[location](#propertylocation-string)|String| |_Optional_|
|[method](#propertymethod-string)|[String]| |_Optional_|
|[option](#propertyoption-shortstring)|ShortString| |_Optional_|
|[response](#propertyresponse-string)|String| |_Optional_|
|[search](#propertysearch-string)|String| |_Optional_|
|[source](#propertysource-shortstring)|ShortString| |_Optional_|
|[time](#propertytime-validtime)|[*ValidTime*](#map9)| |_Optional_|


<details>

<a id="propertyadditional_properties-additionalproperties"></a>
## Property additional_properties ∷ *AdditionalProperties*

* This entry is optional


<a id="map10-ref"></a>
* *AdditionalProperties* Value
  * Details: [*AdditionalProperties*](#map10)

<a id="propertydelay-datetime"></a>
## Property delay ∷ DateTime

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

<a id="propertyduration-datetime"></a>
## Property duration ∷ DateTime

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyfrequency-shortstring"></a>
## Property frequency ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyid-shortstring"></a>
## Property id ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylocation-string"></a>
## Property location ∷ String

* This entry is optional


  * Allowed Values:
    * internal
    * perimeter

<a id="propertymethod-string"></a>
## Property method ∷ [String]

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

<a id="propertyoption-shortstring"></a>
## Property option ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

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

<a id="propertysource-shortstring"></a>
## Property source ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-validtime"></a>
## Property time ∷ *ValidTime*

* This entry is optional


<a id="map9-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map9)


</details>

<a id="map10"></a>
# *AdditionalProperties*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[context](#propertycontext-shortstring)|ShortString| |**Required**|


<details>

<a id="propertycontext-shortstring"></a>
## Property context ∷ ShortString

* This entry is required


  * *ShortString* String with at most 1024 characters


</details>

<a id="map9"></a>
# *ValidTime*

> Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-datetime)|DateTime|If end_time is not present, then the valid time position of the object does not have an upper bound.|_Optional_|
|[start_time](#propertystart_time-datetime)|DateTime|If not present, the valid time position of the indicator does not have an upper bound|_Optional_|


<details>

<a id="propertyend_time-datetime"></a>
## Property end_time ∷ DateTime

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-datetime"></a>
## Property start_time ∷ DateTime

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.


</details>

<a id="map7"></a>
# *ActuatorType*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-actuatortypestring)|ActuatorTypeString| |**Required**|
|[specifiers](#propertyspecifiers-shortstring)|[ShortString]|list of additional properties describing the actuator|_Optional_|


<details>

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

<a id="propertyspecifiers-shortstring"></a>
## Property specifiers ∷ [ShortString]

list of additional properties describing the actuator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters


</details>

<a id="map6"></a>
# *TargetType*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-shortstring)|ShortString| |**Required**|
|[specifiers](#propertyspecifiers-shortstring)|ShortString|Cybox object representing the target|_Optional_|


<details>

<a id="propertytype-shortstring"></a>
## Property type ∷ ShortString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyspecifiers-shortstring"></a>
## Property specifiers ∷ ShortString

Cybox object representing the target

* This entry is optional


  * *ShortString* String with at most 1024 characters


</details>

<a id="map5"></a>
# *ActionType*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-coatypestring)|COATypeString| |**Required**|


<details>

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



</details>
