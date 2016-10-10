<a name="top"/>
# *Judgement* Map

A judgement about the intent or nature of an Observable.  For example, is it malicious, meaning is is malware and subverts system operations.  It could also be clean and be from a known benign, or trusted source.  It could also be common, something so widespread that it's not likely to be malicious.


## MapEntry :id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :id

* String Value
  * The URI of this entity.
  * Plumatic Schema: Str

## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: Str

## MapEntry :schema_version ∷ String

CTIM schema version for this entity

* This entry is required

* Keyword Key
  * Plumatic Schema: :schema_version

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "0.1.8"

## MapEntry :uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :uri

* String Value
  * A URI
  * Plumatic Schema: Str

## MapEntry :revision ∷ Integer

* This entry is optional

* Keyword Key
  * Plumatic Schema: :revision

* Integer Value
  * Plumatic Schema: Int

## MapEntry :external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :external_ids

* String Value
  * Plumatic Schema: [Str]

## MapEntry :timestamp ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :timestamp

* Inst (Date) Value
  * Schema definition for all date or timestamp values.
  * Plumatic Schema: Inst

## MapEntry :language ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :language

* String Value
  * Plumatic Schema: Str

## MapEntry :tlp ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :tlp

* String Value
  * TLP Stand for Traffic Light Protocol (https://www.us-cert.gov/tlp). Precise how this resource is intended to be shared, replicated, copied...
  * Plumatic Schema: (enum ...)
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

## MapEntry :source ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry :source_uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source_uri

* String Value
  * A URI
  * Plumatic Schema: Str

## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "judgement"

## MapEntry :observable ∷ *Observable* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :observable

<a name="map1-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map1)

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

## MapEntry :priority ∷ Integer

* This entry is required

* Keyword Key
  * Plumatic Schema: :priority

* Integer Value
  * A value 0-100 that determine the priority of a judgement. Curated feeds of black/white lists, for example known good products within your organizations, should use a 95. All automated systems should use a priority of 90, or less.  Human judgements should have a priority of 100, so that humans can always override machines.
  * Plumatic Schema: Int

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
  * Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry :severity ∷ Integer

* This entry is required

* Keyword Key
  * Plumatic Schema: :severity

* Integer Value
  * Plumatic Schema: Int

## MapEntry :valid_time ∷ *ValidTime* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :valid_time

<a name="map2-ref"/>
* *ValidTime* Map Value
  * Details: [*ValidTime* Map](#map2)

## MapEntry :reason ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :reason

* String Value
  * Plumatic Schema: Str

## MapEntry :reason_uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :reason_uri

* String Value
  * A URI
  * Plumatic Schema: Str

## MapEntry :indicators ∷ [*RelatedIndicator* Map]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :indicators

<a name="map3-ref"/>
* *RelatedIndicator* Map Value
  * Details: [*RelatedIndicator* Map](#map3)

<a name="map1"/>
# *Observable* Map

[return](#map1-ref)

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.


## MapEntry :value ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

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

<a name="map2"/>
# *ValidTime* Map

[return](#map2-ref)

* Reference: http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/

## MapEntry :start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

* Keyword Key
  * Plumatic Schema: :start_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.
  * Plumatic Schema: Inst

## MapEntry :end_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

* Keyword Key
  * Plumatic Schema: :end_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.
  * Plumatic Schema: Inst

<a name="map3"/>
# *RelatedIndicator* Map

[return](#map3-ref)


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
  * Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

## MapEntry :indicator_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :indicator_id

* String Value
  * A URI leading to an indicator
  * Plumatic Schema: Str
