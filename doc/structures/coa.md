<a id="top"></a>
# *COA* Object

Course of Action. A corrective or preventative action to be taken in response to a threat

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)| String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-coatypeidentifierstring)|COATypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[coa_type](#propertycoa_type-coatypestring)|COAType String|The type of this COA||
|[cost](#propertycost-highmedlowstring)|HighMedLow String|Characterizes the estimated cost for applying this course of action||
|[description](#propertydescription-string)| String| ||
|[efficacy](#propertyefficacy-highmedlowstring)|HighMedLow String|Effectiveness of this course of action in achieving its targeted objective||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[impact](#propertyimpact-string)| String|Characterizes the estimated impact of applying this course of action||
|[language](#propertylanguage-string)| String| ||
|[objective](#propertyobjective-stringlist)| String List|Characterizes the objective of this course of action||
|[open_c2_coa](#propertyopen_c2_coa-openc2coaobject)|*OpenC2COA* Object| ||
|[related_COAs](#propertyrelated_coas-relatedcoaobjectlist)|*RelatedCOA* Object List|Identifies or characterizes relationships to one or more related courses of action||
|[revision](#propertyrevision-integer)|Integer| ||
|[short_description](#propertyshort_description-string)| String| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[stage](#propertystage-coastagestring)|COAStage String|Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to||
|[structured_coa_type](#propertystructured_coa_type-openc2structuredcoatypestring)|OpenC2StructuredCOAType String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||

* Reference: [CourseOfActionType](http://stixproject.github.io/data-model/1.2/coa/CourseOfActionType/)

<a id="propertycoa_type-coatypestring"></a>
## Property coa_type ∷ COAType String

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
## Property cost ∷ HighMedLow String

Characterizes the estimated cost for applying this course of action

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyefficacy-highmedlowstring"></a>
## Property efficacy ∷ HighMedLow String

Effectiveness of this course of action in achieving its targeted objective

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

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
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyimpact-string"></a>
## Property impact ∷  String

Characterizes the estimated impact of applying this course of action

* This entry is optional


  * String with at most 1024 characters

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyobjective-stringlist"></a>
## Property objective ∷  String List

Characterizes the objective of this course of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Squashed / simplified


  * String with at most 1024 characters

<a id="propertyopen_c2_coa-openc2coaobject"></a>
## Property open_c2_coa ∷ *OpenC2COA* Object

* This entry is optional


<a id="map4-ref"></a>
* *OpenC2COA* Object Value
  * Details: [*OpenC2COA* Object](#map4)

<a id="propertyrelated_coas-relatedcoaobjectlist"></a>
## Property related_COAs ∷ *RelatedCOA* Object List

Identifies or characterizes relationships to one or more related courses of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map3-ref"></a>
* *RelatedCOA* Object Value
  * Details: [*RelatedCOA* Object](#map3)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

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

<a id="propertystage-coastagestring"></a>
## Property stage ∷ COAStage String

Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to

* This entry is optional


  * Allowed Values:
    * Remedy
    * Response
  * Reference: [COAStageVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/COAStageVocab-1.0/)

<a id="propertystructured_coa_type-openc2structuredcoatypestring"></a>
## Property structured_coa_type ∷ OpenC2StructuredCOAType String

* This entry is optional


  * Must equal: "openc2"

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

<a id="propertytype-coatypeidentifierstring"></a>
## Property type ∷ COATypeIdentifier String

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

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map2"></a>
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

<a id="map3"></a>
# *RelatedCOA* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[COA_id](#propertycoa_id-string)| String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| ||
|[relationship](#propertyrelationship-string)| String| ||
|[source](#propertysource-string)| String| ||


<a id="propertycoa_id-string"></a>
## Property COA_id ∷  String

* This entry is required


  * A URI leading to a COA

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



<a id="map4"></a>
# *OpenC2COA* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[action](#propertyaction-actiontypeobject)|*ActionType* Object| |&#10003;|
|[id](#propertyid-string)| String| |&#10003;|
|[type](#propertytype-structuredcoatypestring)|StructuredCOAType String| |&#10003;|
|[actuator](#propertyactuator-actuatortypeobject)|*ActuatorType* Object| ||
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

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * String with at most 1024 characters

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
## Property type ∷ StructuredCOAType String

* This entry is required


  * Must equal: "structured_coa"

<a id="map8"></a>
# *ModifierType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[additional_properties](#propertyadditional_properties-additionalpropertiesobject)|*AdditionalProperties* Object| ||
|[delay](#propertydelay-instdate)|Inst (Date)| ||
|[destination](#propertydestination-string)| String| ||
|[duration](#propertyduration-instdate)|Inst (Date)| ||
|[frequency](#propertyfrequency-string)| String| ||
|[id](#propertyid-string)| String| ||
|[location](#propertylocation-string)| String| ||
|[method](#propertymethod-stringlist)| String List| ||
|[option](#propertyoption-string)| String| ||
|[response](#propertyresponse-string)| String| ||
|[search](#propertysearch-string)| String| ||
|[source](#propertysource-string)| String| ||
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


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertydestination-string"></a>
## Property destination ∷  String

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


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyfrequency-string"></a>
## Property frequency ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertylocation-string"></a>
## Property location ∷  String

* This entry is optional


  * Allowed Values:
    * internal
    * perimeter

<a id="propertymethod-stringlist"></a>
## Property method ∷  String List

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

<a id="propertyoption-string"></a>
## Property option ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyresponse-string"></a>
## Property response ∷  String

* This entry is optional


  * Allowed Values:
    * acknowledge
    * command-ref
    * query
    * status

<a id="propertysearch-string"></a>
## Property search ∷  String

* This entry is optional


  * Allowed Values:
    * cve
    * patch
    * signature
    * vendor_bulletin

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 1024 characters

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
|[context](#propertycontext-string)| String| |&#10003;|


<a id="propertycontext-string"></a>
## Property context ∷  String

* This entry is required


  * String with at most 1024 characters

<a id="map9"></a>
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

<a id="map7"></a>
# *ActuatorType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-actuatortypestring)|ActuatorType String| |&#10003;|
|[specifiers](#propertyspecifiers-stringlist)| String List|list of additional properties describing the actuator||


<a id="propertyspecifiers-stringlist"></a>
## Property specifiers ∷  String List

list of additional properties describing the actuator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * String with at most 1024 characters

<a id="propertytype-actuatortypestring"></a>
## Property type ∷ ActuatorType String

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
|[type](#propertytype-string)| String| |&#10003;|
|[specifiers](#propertyspecifiers-string)| String|Cybox object representing the target||


<a id="propertyspecifiers-string"></a>
## Property specifiers ∷  String

Cybox object representing the target

* This entry is optional


  * String with at most 1024 characters

<a id="propertytype-string"></a>
## Property type ∷  String

* This entry is required


  * String with at most 1024 characters

<a id="map5"></a>
# *ActionType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-coatypestring)|COAType String| |&#10003;|


<a id="propertytype-coatypestring"></a>
## Property type ∷ COAType String

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
