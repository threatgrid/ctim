<a id="top"></a>
# *Judgement* Object

A judgement about the intent or nature of an observable.  For
  example, is it malicious, meaning is is malware and subverts system
  operations?  It could also be clean and be from a known benign, or
  trusted source.  It could also be common, something so widespread
  that it's not likely to be malicious.

  Since a core goal of the CTIA is to provide a simple verdict service,
  these judgements are the basis for the returned verdicts.  These are
  also the primary means by which users of the CTIA go from
  observables on their system, to the indicators and threat
  intelligence data in CTIA.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| |&#10003;|
|[disposition](#propertydisposition-dispositionnumberinteger)|DispositionNumberInteger|Matches :disposition_name as in {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}|&#10003;|
|[disposition_name](#propertydisposition_name-dispositionnamestring)|DispositionName String| |&#10003;|
|[id](#propertyid-string)| String| |&#10003;|
|[observable](#propertyobservable-observableobject)|*Observable* Object| |&#10003;|
|[priority](#propertypriority-integer)|Integer| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[severity](#propertyseverity-highmedlowstring)|HighMedLow String| |&#10003;|
|[source](#propertysource-string)| String| |&#10003;|
|[type](#propertytype-judgementtypeidentifierstring)|JudgementTypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[language](#propertylanguage-string)| String| ||
|[reason](#propertyreason-string)| String| ||
|[reason_uri](#propertyreason_uri-string)| String| ||
|[revision](#propertyrevision-integer)|Integer| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||


<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

* This entry is required


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertydisposition-dispositionnumberinteger"></a>
## Property disposition ∷ DispositionNumberInteger

Matches :disposition_name as in {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}

* This entry is required


  * Numeric verdict identifiers
  * Allowed Values:
    * 1
    * 2
    * 3
    * 4
    * 5

<a id="propertydisposition_name-dispositionnamestring"></a>
## Property disposition_name ∷ DispositionName String

* This entry is required


  * String verdict identifiers
  * Allowed Values:
    * Clean
    * Common
    * Malicious
    * Suspicious
    * Unknown

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyobservable-observableobject"></a>
## Property observable ∷ *Observable* Object

* This entry is required


<a id="map1-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map1)

<a id="propertypriority-integer"></a>
## Property priority ∷ Integer

* This entry is required


  * A value 0-100 that determine the priority of a judgement. Curated feeds of black/white lists, for example known good products within your organizations, should use a 95. All automated systems should use a priority of 90, or less.  Human judgements should have a priority of 100, so that humans can always override machines.

<a id="propertyreason-string"></a>
## Property reason ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyreason_uri-string"></a>
## Property reason_uri ∷  String

* This entry is optional


  * A URI

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyseverity-highmedlowstring"></a>
## Property severity ∷ HighMedLow String

* This entry is required


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is required


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

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

<a id="propertytype-judgementtypeidentifierstring"></a>
## Property type ∷ JudgementTypeIdentifier String

* This entry is required


  * Must equal: "judgement"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map2-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map2)

<a id="map1"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



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
