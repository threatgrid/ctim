<a name="top"/>
# *COA* Map

Course of Action. A corrective or preventative action to be taken in response to a threat

| key | type | required? |
| --- | ---- | --------- |
|[:coa_type](#mapentry-coa_type-string)|String||
|[:cost](#mapentry-cost-string)|String||
|[:description](#mapentry-description-string)|String||
|[:efficacy](#mapentry-efficacy-string)|String||
|[:external_ids](#mapentry-external_ids-string)|String||
|[:id](#mapentry-id-string)|String|&#10003;|
|[:impact](#mapentry-impact-string)|String||
|[:language](#mapentry-language-string)|String||
|[:objective](#mapentry-objective-string)|String||
|[:open_c2_coa](#mapentry-open_c2_coa-openc2coamap)|*OpenC2COA* Map||
|[:related_COAs](#mapentry-related_coas-relatedcoamap)|*RelatedCOA* Map||
|[:revision](#mapentry-revision-integer)|Integer||
|[:schema_version](#mapentry-schema_version-string)|String|&#10003;|
|[:short_description](#mapentry-short_description-string)|String||
|[:source](#mapentry-source-string)|String||
|[:source_uri](#mapentry-source_uri-string)|String||
|[:stage](#mapentry-stage-string)|String||
|[:structured_coa_type](#mapentry-structured_coa_type-string)|String||
|[:timestamp](#mapentry-timestamp-instdate)|Inst (Date)||
|[:title](#mapentry-title-string)|String||
|[:tlp](#mapentry-tlp-string)|String||
|[:type](#mapentry-type-string)|String|&#10003;|
|[:valid_time](#mapentry-valid_time-validtimemap)|*ValidTime* Map|&#10003;|
* Reference: [CourseOfActionType](http://stixproject.github.io/data-model/1.2/coa/CourseOfActionType/)

<a name="mapentry-coa_type-string"/>
## MapEntry :coa_type ∷ String

The type of this COA

* This entry is optional

* Keyword Key
  * Plumatic Schema: :coa_type

* String Value
  * Plumatic Schema: (enum ...)
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

<a name="mapentry-cost-string"/>
## MapEntry :cost ∷ String

Characterizes the estimated cost for applying this course of action

* This entry is optional

* Keyword Key
  * Plumatic Schema: :cost

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a name="mapentry-description-string"/>
## MapEntry :description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

<a name="mapentry-efficacy-string"/>
## MapEntry :efficacy ∷ String

Effectiveness of this course of action in achieving its targeted objective

* This entry is optional

* Keyword Key
  * Plumatic Schema: :efficacy

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a name="mapentry-external_ids-string"/>
## MapEntry :external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :external_ids

* String Value
  * Plumatic Schema: [Str]

<a name="mapentry-id-string"/>
## MapEntry :id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :id

* String Value
  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.
  * Plumatic Schema: Str

<a name="mapentry-impact-string"/>
## MapEntry :impact ∷ String

Characterizes the estimated impact of applying this course of action

* This entry is optional

* Keyword Key
  * Plumatic Schema: :impact

* String Value
  * Plumatic Schema: Str

<a name="mapentry-language-string"/>
## MapEntry :language ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :language

* String Value
  * Plumatic Schema: Str

<a name="mapentry-objective-string"/>
## MapEntry :objective ∷ [String]

Characterizes the objective of this course of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Squashed / simplified

* Keyword Key
  * Plumatic Schema: :objective

* String Value
  * Plumatic Schema: [Str]

<a name="mapentry-open_c2_coa-openc2coamap"/>
## MapEntry :open_c2_coa ∷ *OpenC2COA* Map

* This entry is optional

* Keyword Key
  * Plumatic Schema: :open_c2_coa

<a name="map3-ref"/>
* *OpenC2COA* Map Value
  * Details: [*OpenC2COA* Map](#map3)

<a name="mapentry-related_coas-relatedcoamap"/>
## MapEntry :related_COAs ∷ [*RelatedCOA* Map]

Identifies or characterizes relationships to one or more related courses of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_COAs

<a name="map2-ref"/>
* *RelatedCOA* Map Value
  * Details: [*RelatedCOA* Map](#map2)

<a name="mapentry-revision-integer"/>
## MapEntry :revision ∷ Integer

* This entry is optional

* Keyword Key
  * Plumatic Schema: :revision

* Integer Value
  * Plumatic Schema: Int

<a name="mapentry-schema_version-string"/>
## MapEntry :schema_version ∷ String

CTIM schema version for this entity

* This entry is required

* Keyword Key
  * Plumatic Schema: :schema_version

* String Value
  * A semantic version matching the CTIM version against which this object should be valid.
  * Plumatic Schema: Str

<a name="mapentry-short_description-string"/>
## MapEntry :short_description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source_uri-string"/>
## MapEntry :source_uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source_uri

* String Value
  * A URI
  * Plumatic Schema: Str

<a name="mapentry-stage-string"/>
## MapEntry :stage ∷ String

Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to

* This entry is optional

* Keyword Key
  * Plumatic Schema: :stage

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Remedy
    * Response
  * Reference: [COAStageVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/COAStageVocab-1.0/)

<a name="mapentry-structured_coa_type-string"/>
## MapEntry :structured_coa_type ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :structured_coa_type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "openc2"

<a name="mapentry-timestamp-instdate"/>
## MapEntry :timestamp ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :timestamp

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-title-string"/>
## MapEntry :title ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :title

* String Value
  * Plumatic Schema: Str

<a name="mapentry-tlp-string"/>
## MapEntry :tlp ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :tlp

* String Value
  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Plumatic Schema: (enum ...)
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "coa"

<a name="mapentry-valid_time-validtimemap"/>
## MapEntry :valid_time ∷ *ValidTime* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :valid_time

<a name="map1-ref"/>
* *ValidTime* Map Value
  * Details: [*ValidTime* Map](#map1)

<a name="map1"/>
# *ValidTime* Map

Period of time when a cyber observation is valid.

| key | type | required? |
| --- | ---- | --------- |
|[:end_time](#mapentry-end_time-instdate)|Inst (Date)||
|[:start_time](#mapentry-start_time-instdate)|Inst (Date)||
* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a name="mapentry-end_time-instdate"/>
## MapEntry :end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional

* Keyword Key
  * Plumatic Schema: :end_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-start_time-instdate"/>
## MapEntry :start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

* Keyword Key
  * Plumatic Schema: :start_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="map2"/>
# *RelatedCOA* Map

| key | type | required? |
| --- | ---- | --------- |
|[:COA_id](#mapentry-coa_id-string)|String|&#10003;|
|[:confidence](#mapentry-confidence-string)|String||
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||

<a name="mapentry-coa_id-string"/>
## MapEntry :COA_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :COA_id

* String Value
  * A URI leading to a COA
  * Plumatic Schema: Str

<a name="mapentry-confidence-string"/>
## MapEntry :confidence ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a name="mapentry-relationship-string"/>
## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

<a name="map3"/>
# *OpenC2COA* Map

| key | type | required? |
| --- | ---- | --------- |
|[:action](#mapentry-action-actiontypemap)|*ActionType* Map|&#10003;|
|[:actuator](#mapentry-actuator-actuatortypemap)|*ActuatorType* Map||
|[:id](#mapentry-id-string)|String|&#10003;|
|[:modifiers](#mapentry-modifiers-modifiertypemap)|*ModifierType* Map||
|[:target](#mapentry-target-targettypemap)|*TargetType* Map||
|[:type](#mapentry-type-string)|String|&#10003;|

<a name="mapentry-action-actiontypemap"/>
## MapEntry :action ∷ *ActionType* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :action

<a name="map4-ref"/>
* *ActionType* Map Value
  * Details: [*ActionType* Map](#map4)

<a name="mapentry-actuator-actuatortypemap"/>
## MapEntry :actuator ∷ *ActuatorType* Map

* This entry is optional

* Keyword Key
  * Plumatic Schema: :actuator

<a name="map6-ref"/>
* *ActuatorType* Map Value
  * Details: [*ActuatorType* Map](#map6)

<a name="mapentry-id-string"/>
## MapEntry :id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :id

* String Value
  * Plumatic Schema: Str

<a name="mapentry-modifiers-modifiertypemap"/>
## MapEntry :modifiers ∷ *ModifierType* Map

* This entry is optional

* Keyword Key
  * Plumatic Schema: :modifiers

<a name="map7-ref"/>
* *ModifierType* Map Value
  * Details: [*ModifierType* Map](#map7)

<a name="mapentry-target-targettypemap"/>
## MapEntry :target ∷ *TargetType* Map

* This entry is optional

* Keyword Key
  * Plumatic Schema: :target

<a name="map5-ref"/>
* *TargetType* Map Value
  * Details: [*TargetType* Map](#map5)

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "structured_coa"

<a name="map7"/>
# *ModifierType* Map

| key | type | required? |
| --- | ---- | --------- |
|[:additional_properties](#mapentry-additional_properties-additionalpropertiesmap)|*AdditionalProperties* Map||
|[:delay](#mapentry-delay-instdate)|Inst (Date)||
|[:destination](#mapentry-destination-string)|String||
|[:duration](#mapentry-duration-instdate)|Inst (Date)||
|[:frequency](#mapentry-frequency-string)|String||
|[:id](#mapentry-id-string)|String||
|[:location](#mapentry-location-string)|String||
|[:method](#mapentry-method-string)|String||
|[:option](#mapentry-option-string)|String||
|[:response](#mapentry-response-string)|String||
|[:search](#mapentry-search-string)|String||
|[:source](#mapentry-source-string)|String||
|[:time](#mapentry-time-validtimemap)|*ValidTime* Map||

<a name="mapentry-additional_properties-additionalpropertiesmap"/>
## MapEntry :additional_properties ∷ *AdditionalProperties* Map

* This entry is optional

* Keyword Key
  * Plumatic Schema: :additional_properties

<a name="map9-ref"/>
* *AdditionalProperties* Map Value
  * Details: [*AdditionalProperties* Map](#map9)

<a name="mapentry-delay-instdate"/>
## MapEntry :delay ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :delay

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-destination-string"/>
## MapEntry :destination ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :destination

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * copy-to
    * modify-to
    * move-to
    * report-to
    * restore-point
    * save-to
    * set-to

<a name="mapentry-duration-instdate"/>
## MapEntry :duration ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :duration

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-frequency-string"/>
## MapEntry :frequency ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :frequency

* String Value
  * Plumatic Schema: Str

<a name="mapentry-id-string"/>
## MapEntry :id ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :id

* String Value
  * Plumatic Schema: Str

<a name="mapentry-location-string"/>
## MapEntry :location ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :location

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * internal
    * perimeter

<a name="mapentry-method-string"/>
## MapEntry :method ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :method

* String Value
  * Plumatic Schema: [(enum ...)]
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

<a name="mapentry-option-string"/>
## MapEntry :option ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :option

* String Value
  * Plumatic Schema: Str

<a name="mapentry-response-string"/>
## MapEntry :response ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :response

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * acknowledge
    * command-ref
    * query
    * status

<a name="mapentry-search-string"/>
## MapEntry :search ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :search

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * cve
    * patch
    * signature
    * vendor_bulletin

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

<a name="mapentry-time-validtimemap"/>
## MapEntry :time ∷ *ValidTime* Map

* This entry is optional

* Keyword Key
  * Plumatic Schema: :time

<a name="map8-ref"/>
* *ValidTime* Map Value
  * Details: [*ValidTime* Map](#map8)

<a name="map9"/>
# *AdditionalProperties* Map

| key | type | required? |
| --- | ---- | --------- |
|[:context](#mapentry-context-string)|String|&#10003;|

<a name="mapentry-context-string"/>
## MapEntry :context ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :context

* String Value
  * Plumatic Schema: Str

<a name="map8"/>
# *ValidTime* Map

Period of time when a cyber observation is valid.

| key | type | required? |
| --- | ---- | --------- |
|[:end_time](#mapentry-end_time-instdate)|Inst (Date)||
|[:start_time](#mapentry-start_time-instdate)|Inst (Date)||
* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a name="mapentry-end_time-instdate"/>
## MapEntry :end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional

* Keyword Key
  * Plumatic Schema: :end_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-start_time-instdate"/>
## MapEntry :start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

* Keyword Key
  * Plumatic Schema: :start_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="map6"/>
# *ActuatorType* Map

| key | type | required? |
| --- | ---- | --------- |
|[:specifiers](#mapentry-specifiers-string)|String||
|[:type](#mapentry-type-string)|String|&#10003;|

<a name="mapentry-specifiers-string"/>
## MapEntry :specifiers ∷ [String]

list of additional properties describing the actuator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :specifiers

* String Value
  * Plumatic Schema: [Str]

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
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

<a name="map5"/>
# *TargetType* Map

| key | type | required? |
| --- | ---- | --------- |
|[:specifiers](#mapentry-specifiers-string)|String||
|[:type](#mapentry-type-string)|String|&#10003;|

<a name="mapentry-specifiers-string"/>
## MapEntry :specifiers ∷ String

Cybox object representing the target

* This entry is optional

* Keyword Key
  * Plumatic Schema: :specifiers

* String Value
  * Plumatic Schema: Str

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: Str

<a name="map4"/>
# *ActionType* Map

| key | type | required? |
| --- | ---- | --------- |
|[:type](#mapentry-type-string)|String|&#10003;|

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
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
