<a id="map8"></a>
# *COA*

> Reference: [CourseOfActionType](http://stixproject.github.io/data-model/1.2/coa/CourseOfActionType/)

*COA* Course of Action. A corrective or preventative action to be taken in response to a threat.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#id-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#schema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#type-coatypeidentifierstring)|COATypeIdentifierString| |**Required**|
|[valid_time](#valid_time-validtimevalidtimemdmap43)|[*ValidTime*](./ValidTime.md#map43)| |**Required**|
|[coa_type](#coa_type-coatypestring)|COATypeString|The type of this COA|_Optional_|
|[cost](#cost-highmedlowstring)|HighMedLowString|Characterizes the estimated cost for applying this course of action|_Optional_|
|[description](#description-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[efficacy](#efficacy-highmedlowstring)|HighMedLowString|Effectiveness of this course of action in achieving its targeted objective|_Optional_|
|[external_ids](#external_ids-string)|[String]| |_Optional_|
|[external_references](#external_references-externalreferenceexternalreferencemdmap42)|[[*ExternalReference*](./ExternalReference.md#map42)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[impact](#impact-shortstring)|ShortString|Characterizes the estimated impact of applying this course of action|_Optional_|
|[language](#language-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[objective](#objective-shortstring)|[ShortString]|Characterizes the objective of this course of action|_Optional_|
|[open_c2_coa](#open_c2_coa-openc2coaopenc2coamdmap45)|[*OpenC2COA*](./OpenC2COA.md#map45)| |_Optional_|
|[related_COAs](#related_coas-relatedcoarelatedcoamdmap44)|[[*RelatedCOA*](./RelatedCOA.md#map44)]|Identifies or characterizes relationships to one or more related courses of action|_Optional_|
|[revision](#revision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#short_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#source-medstring)|MedString| |_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|
|[stage](#stage-coastagestring)|COAStageString|Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to|_Optional_|
|[structured_coa_type](#structured_coa_type-openc2structuredcoatypestring)|OpenC2StructuredCOATypeString| |_Optional_|
|[timestamp](#timestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#title-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#tlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<a id="coa_type-coatypestring"></a>
### `coa_type` ∷ COATypeString

The type of this COA

* This entry is _optional_


  * Allowed values:
    * `"Diplomatic Actions"`
    * `"Eradication"`
    * `"Hardening"`
    * `"Internal Blocking"`
    * `"Logical Access Restrictions"`
    * `"Monitoring"`
    * `"Other"`
    * `"Patching"`
    * `"Perimeter Blocking"`
    * `"Physical Access Restrictions"`
    * `"Policy Actions"`
    * `"Public Disclosure"`
    * `"Rebuilding"`
    * `"Redirection"`
    * `"Redirection (Honey Pot)"`
    * `"Training"`
  * Reference: [CourseOfActionTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/CourseOfActionTypeVocab-1.0/)


<a id="cost-highmedlowstring"></a>
### `cost` ∷ HighMedLowString

Characterizes the estimated cost for applying this course of action

* This entry is _optional_


  * Allowed values:
    * `"High"`
    * `"Info"`
    * `"Low"`
    * `"Medium"`
    * `"None"`
    * `"Unknown"`
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

A description of object, which may be detailed.

* This entry is _optional_


  * *Markdown* Markdown string with at most 5000 characters

<a id="efficacy-highmedlowstring"></a>
### `efficacy` ∷ HighMedLowString

Effectiveness of this course of action in achieving its targeted objective

* This entry is _optional_


  * Allowed values:
    * `"High"`
    * `"Info"`
    * `"Low"`
    * `"Medium"`
    * `"None"`
    * `"Unknown"`
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="external_ids-string"></a>
### `external_ids` ∷ [String]

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)



<a id="external_references-externalreferenceexternalreferencemdmap42"></a>
### `external_references` ∷ [[*ExternalReference*](./ExternalReference.md#map42)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="id-string"></a>
### `id` ∷ String

Globally unique URI identifying this object.

* This entry is **required**


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](https://github.com/threatgrid/ctim/blob/subdoc/doc/structures/judgement/Judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="impact-shortstring"></a>
### `impact` ∷ ShortString

Characterizes the estimated impact of applying this course of action

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="language-shortstring"></a>
### `language` ∷ ShortString

The human language this object is specified in.

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="objective-shortstring"></a>
### `objective` ∷ [ShortString]

Characterizes the objective of this course of action

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Squashed / simplified


  * *ShortString* String with at most 1024 characters

<a id="open_c2_coa-openc2coaopenc2coamdmap45"></a>
### `open_c2_coa` ∷ [*OpenC2COA*](./OpenC2COA.md#map45)

* This entry is _optional_


<a id="related_coas-relatedcoarelatedcoamdmap44"></a>
### `related_COAs` ∷ [[*RelatedCOA*](./RelatedCOA.md#map44)]

Identifies or characterizes relationships to one or more related courses of action

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


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

* This entry is _optional_


  * *MedString* String with at most 2048 characters

<a id="source_uri-string"></a>
### `source_uri` ∷ String

* This entry is _optional_


  * A URI

<a id="stage-coastagestring"></a>
### `stage` ∷ COAStageString

Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to

* This entry is _optional_


  * Allowed values:
    * `"Remedy"`
    * `"Response"`
  * Reference: [COAStageVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/COAStageVocab-1.0/)


<a id="structured_coa_type-openc2structuredcoatypestring"></a>
### `structured_coa_type` ∷ OpenC2StructuredCOATypeString

* This entry is _optional_


  * Must equal: `"openc2"`

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

<a id="type-coatypeidentifierstring"></a>
### `type` ∷ COATypeIdentifierString

* This entry is **required**


  * Must equal: `"coa"`

<a id="valid_time-validtimevalidtimemdmap43"></a>
### `valid_time` ∷ [*ValidTime*](./ValidTime.md#map43)

* This entry is **required**

