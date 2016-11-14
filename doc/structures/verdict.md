<a name="top"/>
# *StoredVerdict* Map

A Verdict as stored in the data store

| key | type | required? |
| --- | ---- | --------- |
|[:created](#mapentry-created-instdate)|Inst (Date)|&#10003;|
|[:disposition](#mapentry-disposition-integer)|Integer|&#10003;|
|[:disposition_name](#mapentry-disposition_name-string)|String||
|[:id](#mapentry-id-string)|String|&#10003;|
|[:judgement_id](#mapentry-judgement_id-string)|String||
|[:modified](#mapentry-modified-instdate)|Inst (Date)||
|[:observable](#mapentry-observable-observablemap)|*Observable* Map|&#10003;|
|[:schema_version](#mapentry-schema_version-string)|String|&#10003;|
|[:type](#mapentry-type-string)|String|&#10003;|

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

The disposition_name field is optional, but is intended to be shown to a user.  Applications must therefore remember the mapping of numbers to human words, as in: {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}

* This entry is optional

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

<a name="mapentry-id-string"/>
## MapEntry :id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :id

* String Value
  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.
  * Plumatic Schema: Str

<a name="mapentry-judgement_id-string"/>
## MapEntry :judgement_id ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :judgement_id

* String Value
  * A URI leading to a judgement
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

<a name="mapentry-schema_version-string"/>
## MapEntry :schema_version ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :schema_version

* String Value
  * Plumatic Schema: Str

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "verdict"

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
