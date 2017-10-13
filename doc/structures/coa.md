<a id="top"></a>
# *COA* Object

Course of Action. A corrective or preventative action to be taken in response to a threat

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:id](#property-id-string)| String| |&#10003;|
|[:schema_version](#property-schema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[:type](#property-type-coatypeidentifierstring)|COATypeIdentifier String| |&#10003;|
|[:valid_time](#property-valid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[:coa_type](#property-coa_type-coatypestring)|COAType String|The type of this COA||
|[:cost](#property-cost-highmedlowstring)|HighMedLow String|Characterizes the estimated cost for applying this course of action||
|[:description](#property-description-string)| String| ||
|[:efficacy](#property-efficacy-highmedlowstring)|HighMedLow String|Effectiveness of this course of action in achieving its targeted objective||
|[:external_ids](#property-external_ids-stringlist)| String List| ||
|[:impact](#property-impact-string)| String|Characterizes the estimated impact of applying this course of action||
|[:language](#property-language-string)| String| ||
|[:objective](#property-objective-stringlist)| String List|Characterizes the objective of this course of action||
|[:open_c2_coa](#property-open_c2_coa-openc2coaobject)|*OpenC2COA* Object| ||
|[:related_COAs](#property-related_coas-relatedcoaobjectlist)|*RelatedCOA* Object List|Identifies or characterizes relationships to one or more related courses of action||
|[:revision](#property-revision-integer)|Integer| ||
|[:short_description](#property-short_description-string)| String| ||
|[:source](#property-source-string)| String| ||
|[:source_uri](#property-source_uri-string)| String| ||
|[:stage](#property-stage-coastagestring)|COAStage String|Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to||
|[:structured_coa_type](#property-structured_coa_type-openc2structuredcoatypestring)|OpenC2StructuredCOAType String| ||
|[:timestamp](#property-timestamp-instdate)|Inst (Date)| ||
|[:title](#property-title-string)| String| ||
|[:tlp](#property-tlp-tlpstring)|TLP String| ||

* Reference: [CourseOfActionType](http://stixproject.github.io/data-model/1.2/coa/CourseOfActionType/)

<a id="property-coa_type-coatypestring"></a>
## Property :coa_type ∷ COAType String

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

<a id="property-cost-highmedlowstring"></a>
## Property :cost ∷ HighMedLow String

Characterizes the estimated cost for applying this course of action

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

<a id="property-efficacy-highmedlowstring"></a>
## Property :efficacy ∷ HighMedLow String

Effectiveness of this course of action in achieving its targeted objective

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="property-external_ids-stringlist"></a>
## Property :external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="property-id-string"></a>
## Property :id ∷  String

* This entry is required


  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.

<a id="property-impact-string"></a>
## Property :impact ∷  String

Characterizes the estimated impact of applying this course of action

* This entry is optional


  * String with at most 1024 characters

<a id="property-language-string"></a>
## Property :language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="property-objective-stringlist"></a>
## Property :objective ∷  String List

Characterizes the objective of this course of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Squashed / simplified


  * String with at most 1024 characters

<a id="property-open_c2_coa-openc2coaobject"></a>
## Property :open_c2_coa ∷ *OpenC2COA* Object

* This entry is optional


<a id="map3-ref"></a>
* *OpenC2COA* Object Value
  * Details: [*OpenC2COA* Object](#map3)

<a id="property-related_coas-relatedcoaobjectlist"></a>
## Property :related_COAs ∷ *RelatedCOA* Object List

Identifies or characterizes relationships to one or more related courses of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map2-ref"></a>
* *RelatedCOA* Object Value
  * Details: [*RelatedCOA* Object](#map2)

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

<a id="property-source-string"></a>
## Property :source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="property-source_uri-string"></a>
## Property :source_uri ∷  String

* This entry is optional


  * A URI

<a id="property-stage-coastagestring"></a>
## Property :stage ∷ COAStage String

Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to

* This entry is optional


  * Allowed Values:
    * Remedy
    * Response
  * Reference: [COAStageVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/COAStageVocab-1.0/)

<a id="property-structured_coa_type-openc2structuredcoatypestring"></a>
## Property :structured_coa_type ∷ OpenC2StructuredCOAType String

* This entry is optional


  * Must equal: "openc2"

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

<a id="property-type-coatypeidentifierstring"></a>
## Property :type ∷ COATypeIdentifier String

* This entry is required


  * Must equal: "coa"

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
# *RelatedCOA* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:COA_id](#property-coa_id-string)| String| |&#10003;|
|[:confidence](#property-confidence-highmedlowstring)|HighMedLow String| ||
|[:relationship](#property-relationship-string)| String| ||
|[:source](#property-source-string)| String| ||


<a id="property-coa_id-string"></a>
## Property :COA_id ∷  String

* This entry is required


  * A URI leading to a COA

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



<a id="map3"></a>
# *OpenC2COA* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:action](#property-action-actiontypeobject)|*ActionType* Object| |&#10003;|
|[:id](#property-id-string)| String| |&#10003;|
|[:type](#property-type-structuredcoatypestring)|StructuredCOAType String| |&#10003;|
|[:actuator](#property-actuator-actuatortypeobject)|*ActuatorType* Object| ||
|[:modifiers](#property-modifiers-modifiertypeobject)|*ModifierType* Object| ||
|[:target](#property-target-targettypeobject)|*TargetType* Object| ||


<a id="property-action-actiontypeobject"></a>
## Property :action ∷ *ActionType* Object

* This entry is required


<a id="map4-ref"></a>
* *ActionType* Object Value
  * Details: [*ActionType* Object](#map4)

<a id="property-actuator-actuatortypeobject"></a>
## Property :actuator ∷ *ActuatorType* Object

* This entry is optional


<a id="map6-ref"></a>
* *ActuatorType* Object Value
  * Details: [*ActuatorType* Object](#map6)

<a id="property-id-string"></a>
## Property :id ∷  String

* This entry is required


  * String with at most 1024 characters

<a id="property-modifiers-modifiertypeobject"></a>
## Property :modifiers ∷ *ModifierType* Object

* This entry is optional


<a id="map7-ref"></a>
* *ModifierType* Object Value
  * Details: [*ModifierType* Object](#map7)

<a id="property-target-targettypeobject"></a>
## Property :target ∷ *TargetType* Object

* This entry is optional


<a id="map5-ref"></a>
* *TargetType* Object Value
  * Details: [*TargetType* Object](#map5)

<a id="property-type-structuredcoatypestring"></a>
## Property :type ∷ StructuredCOAType String

* This entry is required


  * Must equal: "structured_coa"

<a id="map7"></a>
# *ModifierType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:additional_properties](#property-additional_properties-additionalpropertiesobject)|*AdditionalProperties* Object| ||
|[:delay](#property-delay-instdate)|Inst (Date)| ||
|[:destination](#property-destination-string)| String| ||
|[:duration](#property-duration-instdate)|Inst (Date)| ||
|[:frequency](#property-frequency-string)| String| ||
|[:id](#property-id-string)| String| ||
|[:location](#property-location-string)| String| ||
|[:method](#property-method-stringlist)| String List| ||
|[:option](#property-option-string)| String| ||
|[:response](#property-response-string)| String| ||
|[:search](#property-search-string)| String| ||
|[:source](#property-source-string)| String| ||
|[:time](#property-time-validtimeobject)|*ValidTime* Object| ||


<a id="property-additional_properties-additionalpropertiesobject"></a>
## Property :additional_properties ∷ *AdditionalProperties* Object

* This entry is optional


<a id="map9-ref"></a>
* *AdditionalProperties* Object Value
  * Details: [*AdditionalProperties* Object](#map9)

<a id="property-delay-instdate"></a>
## Property :delay ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-destination-string"></a>
## Property :destination ∷  String

* This entry is optional


  * Allowed Values:
    * copy-to
    * modify-to
    * move-to
    * report-to
    * restore-point
    * save-to
    * set-to

<a id="property-duration-instdate"></a>
## Property :duration ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-frequency-string"></a>
## Property :frequency ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="property-id-string"></a>
## Property :id ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="property-location-string"></a>
## Property :location ∷  String

* This entry is optional


  * Allowed Values:
    * internal
    * perimeter

<a id="property-method-stringlist"></a>
## Property :method ∷  String List

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

<a id="property-option-string"></a>
## Property :option ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="property-response-string"></a>
## Property :response ∷  String

* This entry is optional


  * Allowed Values:
    * acknowledge
    * command-ref
    * query
    * status

<a id="property-search-string"></a>
## Property :search ∷  String

* This entry is optional


  * Allowed Values:
    * cve
    * patch
    * signature
    * vendor_bulletin

<a id="property-source-string"></a>
## Property :source ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="property-time-validtimeobject"></a>
## Property :time ∷ *ValidTime* Object

* This entry is optional


<a id="map8-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map8)

<a id="map9"></a>
# *AdditionalProperties* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:context](#property-context-string)| String| |&#10003;|


<a id="property-context-string"></a>
## Property :context ∷  String

* This entry is required


  * String with at most 1024 characters

<a id="map8"></a>
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

<a id="map6"></a>
# *ActuatorType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:type](#property-type-actuatortypestring)|ActuatorType String| |&#10003;|
|[:specifiers](#property-specifiers-stringlist)| String List|list of additional properties describing the actuator||


<a id="property-specifiers-stringlist"></a>
## Property :specifiers ∷  String List

list of additional properties describing the actuator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * String with at most 1024 characters

<a id="property-type-actuatortypestring"></a>
## Property :type ∷ ActuatorType String

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

<a id="map5"></a>
# *TargetType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:type](#property-type-string)| String| |&#10003;|
|[:specifiers](#property-specifiers-string)| String|Cybox object representing the target||


<a id="property-specifiers-string"></a>
## Property :specifiers ∷  String

Cybox object representing the target

* This entry is optional


  * String with at most 1024 characters

<a id="property-type-string"></a>
## Property :type ∷  String

* This entry is required


  * String with at most 1024 characters

<a id="map4"></a>
# *ActionType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:type](#property-type-coatypestring)|COAType String| |&#10003;|


<a id="property-type-coatypestring"></a>
## Property :type ∷ COAType String

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
