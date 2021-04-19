<a id="map21"></a>
# *TargetRecord*

> Reference: [TargetRecord](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#targetrecord)

*TargetRecord* A TargetRecord is a Sighting that has no threat or observables associated
  with it, it's a way of saying they saw a set of observables together as a Target.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#id-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#schema_version-string)|String|CTIM schema version for this entity|**Required**|
|[source](#source-medstring)|MedString| |**Required**|
|[targets](#targets-targettargetmdmap59)|[[*Target*](./Target.md#map59)]| |**Required**|
|[type](#type-targetrecordtypeidentifierstring)|TargetRecordTypeIdentifierString| |**Required**|
|[description](#description-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#external_ids-string)|[String]| |_Optional_|
|[external_references](#external_references-externalreferenceexternalreferencemdmap58)|[[*ExternalReference*](./ExternalReference.md#map58)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#language-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#revision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#short_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|
|[timestamp](#timestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#title-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#tlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

A description of object, which may be detailed.

* This entry is _optional_


  * *Markdown* Markdown string with at most 5000 characters

<a id="external_ids-string"></a>
### `external_ids` ∷ [String]

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)



<a id="external_references-externalreferenceexternalreferencemdmap58"></a>
### `external_references` ∷ [[*ExternalReference*](./ExternalReference.md#map58)]

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

<a id="short_description-medstring"></a>
### `short_description` ∷ MedString

A single line, short summary of the object.

* This entry is _optional_


  * *MedString* String with at most 2048 characters

<a id="source-medstring"></a>
### `source` ∷ MedString

* This entry is **required**


  * *MedString* String with at most 2048 characters

<a id="source_uri-string"></a>
### `source_uri` ∷ String

* This entry is _optional_


  * A URI

<a id="targets-targettargetmdmap59"></a>
### `targets` ∷ [[*Target*](./Target.md#map59)]

* This entry is **required**
* This entry's type is sequential (allows zero or more values)


<a id="timestamp-datetime"></a>
### `timestamp` ∷ DateTime

The time this object was created at, or last modified.

* This entry is _optional_


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="title-shortstring"></a>
### `title` ∷ ShortString

A short title for this object, used as primary display and reference value

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

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

<a id="type-targetrecordtypeidentifierstring"></a>
### `type` ∷ TargetRecordTypeIdentifierString

* This entry is **required**


  * Must equal: `"target-record"`
