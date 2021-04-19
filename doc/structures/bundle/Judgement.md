<a id="map12"></a>
# *Judgement*

*Judgement* A judgement about the intent or nature of an observable.  For
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
|[confidence](#confidence-highmedlowstring)|HighMedLowString| |**Required**|
|[disposition](#disposition-dispositionnumberinteger)|DispositionNumberInteger|Matches :disposition_name as in {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}|**Required**|
|[disposition_name](#disposition_name-dispositionnamestring)|DispositionNameString| |**Required**|
|[id](#id-string)|String|Globally unique URI identifying this object.|**Required**|
|[observable](#observable-observableobservablemdmap66)|[*Observable*](./Observable.md#map66)| |**Required**|
|[priority](#priority-integer)|Integer| |**Required**|
|[schema_version](#schema_version-string)|String|CTIM schema version for this entity|**Required**|
|[severity](#severity-highmedlowstring)|HighMedLowString| |**Required**|
|[source](#source-medstring)|MedString| |**Required**|
|[type](#type-judgementtypeidentifierstring)|JudgementTypeIdentifierString| |**Required**|
|[valid_time](#valid_time-validtimevalidtimemdmap67)|[*ValidTime*](./ValidTime.md#map67)| |**Required**|
|[external_ids](#external_ids-string)|[String]| |_Optional_|
|[external_references](#external_references-externalreferenceexternalreferencemdmap65)|[[*ExternalReference*](./ExternalReference.md#map65)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#language-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[reason](#reason-shortstring)|ShortString| |_Optional_|
|[reason_uri](#reason_uri-string)|String| |_Optional_|
|[revision](#revision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|
|[timestamp](#timestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#tlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<a id="confidence-highmedlowstring"></a>
### `confidence` ∷ HighMedLowString

* This entry is **required**


  * Allowed values:
    * `"High"`
    * `"Info"`
    * `"Low"`
    * `"Medium"`
    * `"None"`
    * `"Unknown"`
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="disposition-dispositionnumberinteger"></a>
### `disposition` ∷ DispositionNumberInteger

Matches :disposition_name as in {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}

* This entry is **required**


  * *DispositionNumber* Numeric verdict identifiers
  * Allowed values:
    * `1`
    * `2`
    * `3`
    * `4`
    * `5`

<a id="disposition_name-dispositionnamestring"></a>
### `disposition_name` ∷ DispositionNameString

* This entry is **required**


  * *DispositionName* String verdict identifiers
  * Allowed values:
    * `"Clean"`
    * `"Common"`
    * `"Malicious"`
    * `"Suspicious"`
    * `"Unknown"`

<a id="external_ids-string"></a>
### `external_ids` ∷ [String]

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)



<a id="external_references-externalreferenceexternalreferencemdmap65"></a>
### `external_references` ∷ [[*ExternalReference*](./ExternalReference.md#map65)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="id-string"></a>
### `id` ∷ String

Globally unique URI identifying this object.

* This entry is **required**


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](https://github.com/threatgrid/ctim/blob/subdoc/doc/structures/judgement/Judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="language-shortstring"></a>
### `language` ∷ ShortString

The human language this object is specified in.

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="observable-observableobservablemdmap66"></a>
### `observable` ∷ [*Observable*](./Observable.md#map66)

* This entry is **required**


<a id="priority-integer"></a>
### `priority` ∷ Integer

* This entry is **required**


  * A value 0-100 that determine the priority of a judgement. Curated feeds of black/white lists, for example known good products within your organizations, should use a 95. All automated systems should use a priority of 90, or less.  Human judgements should have a priority of 100, so that humans can always override machines.

<a id="reason-shortstring"></a>
### `reason` ∷ ShortString

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="reason_uri-string"></a>
### `reason_uri` ∷ String

* This entry is _optional_


  * A URI

<a id="revision-integer"></a>
### `revision` ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is _optional_


  * Zero, or a positive integer

<a id="schema_version-string"></a>
### `schema_version` ∷ String

CTIM schema version for this entity

* This entry is **required**


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="severity-highmedlowstring"></a>
### `severity` ∷ HighMedLowString

* This entry is **required**


  * Allowed values:
    * `"High"`
    * `"Info"`
    * `"Low"`
    * `"Medium"`
    * `"None"`
    * `"Unknown"`
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="source-medstring"></a>
### `source` ∷ MedString

* This entry is **required**


  * *MedString* String with at most 2048 characters

<a id="source_uri-string"></a>
### `source_uri` ∷ String

* This entry is _optional_


  * A URI

<a id="timestamp-datetime"></a>
### `timestamp` ∷ DateTime

The time this object was created at, or last modified.

* This entry is _optional_


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="tlp-tlpstring"></a>
### `tlp` ∷ TLPString

Specification for how, and to whom, this object can be shared.

* This entry is _optional_


  * *TLP* TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: `"green"`
  * Allowed values:
    * `"amber"`
    * `"green"`
    * `"red"`
    * `"white"`

<a id="type-judgementtypeidentifierstring"></a>
### `type` ∷ JudgementTypeIdentifierString

* This entry is **required**


  * Must equal: `"judgement"`

<a id="valid_time-validtimevalidtimemdmap67"></a>
### `valid_time` ∷ [*ValidTime*](./ValidTime.md#map67)

* This entry is **required**

