<a name="top"/>
# *StoredJudgement* Map

A judgement as stored in the data store

| key | type | required? |
| --- | ---- | --------- |
|[:confidence](#mapentry-confidence-string)|String|&#10003;|
|[:created](#mapentry-created-instdate)|Inst (Date)|&#10003;|
|[:disposition](#mapentry-disposition-integer)|Integer|&#10003;|
|[:disposition_name](#mapentry-disposition_name-string)|String|&#10003;|
|[:external_ids](#mapentry-external_ids-string)|String||
|[:id](#mapentry-id-string)|String|&#10003;|
|[:indicators](#mapentry-indicators-relatedindicatormap)|*RelatedIndicator* Map||
|[:language](#mapentry-language-string)|String||
|[:modified](#mapentry-modified-instdate)|Inst (Date)||
|[:observable](#mapentry-observable-observablemap)|*Observable* Map|&#10003;|
|[:owner](#mapentry-owner-string)|String|&#10003;|
|[:priority](#mapentry-priority-integer)|Integer|&#10003;|
|[:reason](#mapentry-reason-string)|String||
|[:reason_uri](#mapentry-reason_uri-string)|String||
|[:revision](#mapentry-revision-integer)|Integer||
|[:schema_version](#mapentry-schema_version-string)|String|&#10003;|
|[:severity](#mapentry-severity-integer)|Integer|&#10003;|
|[:source](#mapentry-source-string)|String|&#10003;|
|[:source_uri](#mapentry-source_uri-string)|String||
|[:timestamp](#mapentry-timestamp-instdate)|Inst (Date)||
|[:tlp](#mapentry-tlp-string)|String||
|[:type](#mapentry-type-string)|String|&#10003;|
|[:valid_time](#mapentry-valid_time-validtimemap)|*ValidTime* Map|&#10003;|

<a name="mapentry-confidence-string"/>
## MapEntry :confidence ∷ String

* This entry is required

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

<a name="mapentry-created-instdate"/>
## MapEntry :created ∷ Inst (Date)

* This entry is required

* Keyword Key
  * Plumatic Schema: :created

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-disposition-integer"/>
## MapEntry :disposition ∷ Integer

Matches :disposition_name as in {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}

* This entry is required

* Keyword Key
  * Plumatic Schema: :disposition

* Integer Value
  * Numeric verdict identifiers
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * 1
    * 2
    * 3
    * 4
    * 5

<a name="mapentry-disposition_name-string"/>
## MapEntry :disposition_name ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :disposition_name

* String Value
  * String verdict identifiers
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Clean
    * Common
    * Malicious
    * Suspicious
    * Unknown

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

<a name="mapentry-indicators-relatedindicatormap"/>
## MapEntry :indicators ∷ [*RelatedIndicator* Map]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :indicators

<a name="map3-ref"/>
* *RelatedIndicator* Map Value
  * Details: [*RelatedIndicator* Map](#map3)

<a name="mapentry-language-string"/>
## MapEntry :language ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :language

* String Value
  * Plumatic Schema: Str

<a name="mapentry-modified-instdate"/>
## MapEntry :modified ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :modified

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-observable-observablemap"/>
## MapEntry :observable ∷ *Observable* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :observable

<a name="map1-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map1)

<a name="mapentry-owner-string"/>
## MapEntry :owner ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :owner

* String Value
  * Plumatic Schema: Str

<a name="mapentry-priority-integer"/>
## MapEntry :priority ∷ Integer

* This entry is required

* Keyword Key
  * Plumatic Schema: :priority

* Integer Value
  * A value 0-100 that determine the priority of a judgement. Curated feeds of black/white lists, for example known good products within your organizations, should use a 95. All automated systems should use a priority of 90, or less.  Human judgements should have a priority of 100, so that humans can always override machines.
  * Plumatic Schema: Int

<a name="mapentry-reason-string"/>
## MapEntry :reason ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :reason

* String Value
  * Plumatic Schema: Str

<a name="mapentry-reason_uri-string"/>
## MapEntry :reason_uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :reason_uri

* String Value
  * A URI
  * Plumatic Schema: Str

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
  * Plumatic Schema: (enum ...)
  * Must equal: "0.3.2"

<a name="mapentry-severity-integer"/>
## MapEntry :severity ∷ Integer

* This entry is required

* Keyword Key
  * Plumatic Schema: :severity

* Integer Value
  * Plumatic Schema: Int

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is required

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

<a name="mapentry-timestamp-instdate"/>
## MapEntry :timestamp ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :timestamp

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

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
  * Must equal: "judgement"

<a name="mapentry-valid_time-validtimemap"/>
## MapEntry :valid_time ∷ *ValidTime* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :valid_time

<a name="map2-ref"/>
* *ValidTime* Map Value
  * Details: [*ValidTime* Map](#map2)

<a name="map1"/>
# *Observable* Map

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| key | type | required? |
| --- | ---- | --------- |
|[:type](#mapentry-type-string)|String|&#10003;|
|[:value](#mapentry-value-string)|String|&#10003;|

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Observable type names
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * amp-device
    * device
    * domain
    * email
    * imei
    * imsi
    * ip
    * ipv6
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a name="mapentry-value-string"/>
## MapEntry :value ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

<a name="map2"/>
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

<a name="map3"/>
# *RelatedIndicator* Map

| key | type | required? |
| --- | ---- | --------- |
|[:confidence](#mapentry-confidence-string)|String||
|[:indicator_id](#mapentry-indicator_id-string)|String|&#10003;|
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||

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

<a name="mapentry-indicator_id-string"/>
## MapEntry :indicator_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :indicator_id

* String Value
  * A URI leading to an indicator
  * Plumatic Schema: Str

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
