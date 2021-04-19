<a id="map11"></a>
# *Indicator*

> Reference: [IndicatorType](http://stixproject.github.io/data-model/1.2/indicator/IndicatorType/)

*Indicator* An indicator is a test, or a collection of judgements that define
criteria for identifying the activity, or presence of malware, or
other unwanted software.

We follow the
[STiX IndicatorType](http://stixproject.github.io/data-model/1.2/indicator/IndicatorType/)
closely, with the exception of not including observables within the
indicator, and preferring a _specification_ object encoded in JSON as
opposed to an opaque _implementation_ block.

Additional, you will want to either define judgements against
Observables that are linked to this indicator, with the ID in the
_indicators_ field of those Judgements, or you can provide a
_specification_ value.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#id-string)|String|Globally unique URI identifying this object.|**Required**|
|[producer](#producer-shortstring)|ShortString| |**Required**|
|[schema_version](#schema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#type-indicatortypeidentifierstring)|IndicatorTypeIdentifierString|The fixed value indicator|**Required**|
|[valid_time](#valid_time-validtimevalidtimemdmap56)|[*ValidTime*](./ValidTime.md#map56)|The time range during which this Indicator is considered valid.|**Required**|
|[composite_indicator_expression](#composite_indicator_expression-compositeindicatorexpressioncompositeindicatorexpressionmdmap57)|[*CompositeIndicatorExpression*](./CompositeIndicatorExpression.md#map57)| |_Optional_|
|[confidence](#confidence-highmedlowstring)|HighMedLowString|level of confidence held in the accuracy of this Indicator|_Optional_|
|[description](#description-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#external_ids-string)|[String]| |_Optional_|
|[external_references](#external_references-externalreferenceexternalreferencemdmap55)|[[*ExternalReference*](./ExternalReference.md#map55)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[indicator_type](#indicator_type-indicatortypestring)|[IndicatorTypeString]|Specifies the type or types for this Indicator|_Optional_|
|[kill_chain_phases](#kill_chain_phases-killchainphasekillchainphasemdmap58)|[[*KillChainPhase*](./KillChainPhase.md#map58)]|relevant kill chain phases indicated by this Indicator|_Optional_|
|[language](#language-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[likely_impact](#likely_impact-longstring)|LongString|likely potential impact within the relevant context if this Indicator were to occur|_Optional_|
|[negate](#negate-boolean)|Boolean|specifies the absence of the pattern|_Optional_|
|[revision](#revision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[severity](#severity-highmedlowstring)|HighMedLowString| |_Optional_|
|[short_description](#short_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#source-medstring)|MedString| |_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|
|[specification](#specification-either)|[*JudgementSpecification*](./JudgementSpecification.md#map59)| |_Optional_|
|[tags](#tags-shortstring)|[ShortString]|Descriptors for this indicator|_Optional_|
|[test_mechanisms](#test_mechanisms-medstring)|[MedString]|Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator|_Optional_|
|[timestamp](#timestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#title-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#tlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<a id="composite_indicator_expression-compositeindicatorexpressioncompositeindicatorexpressionmdmap57"></a>
### `composite_indicator_expression` ∷ [*CompositeIndicatorExpression*](./CompositeIndicatorExpression.md#map57)

* This entry is _optional_


<a id="confidence-highmedlowstring"></a>
### `confidence` ∷ HighMedLowString

level of confidence held in the accuracy of this Indicator

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

<a id="external_ids-string"></a>
### `external_ids` ∷ [String]

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)



<a id="external_references-externalreferenceexternalreferencemdmap55"></a>
### `external_references` ∷ [[*ExternalReference*](./ExternalReference.md#map55)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="id-string"></a>
### `id` ∷ String

Globally unique URI identifying this object.

* This entry is **required**


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](https://github.com/threatgrid/ctim/blob/subdoc/doc/structures/judgement/Judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="indicator_type-indicatortypestring"></a>
### `indicator_type` ∷ [IndicatorTypeString]

Specifies the type or types for this Indicator

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


  * Allowed values:
    * `"Anonymization"`
    * `"C2"`
    * `"Compromised PKI Certificate"`
    * `"Domain Watchlist"`
    * `"Exfiltration"`
    * `"File Hash Watchlist"`
    * `"Host Characteristics"`
    * `"IMEI Watchlist"`
    * `"IMSI Watchlist"`
    * `"IP Watchlist"`
    * `"Login Name"`
    * `"Malicious E-mail"`
    * `"Malware Artifacts"`
    * `"Private Threat Feed"`
    * `"URL Watchlist"`
  * Reference: [IndicatorTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/IndicatorTypeVocab-1.1/)


<a id="kill_chain_phases-killchainphasekillchainphasemdmap58"></a>
### `kill_chain_phases` ∷ [[*KillChainPhase*](./KillChainPhase.md#map58)]

relevant kill chain phases indicated by this Indicator

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


<a id="language-shortstring"></a>
### `language` ∷ ShortString

The human language this object is specified in.

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="likely_impact-longstring"></a>
### `likely_impact` ∷ LongString

likely potential impact within the relevant context if this Indicator were to occur

* This entry is _optional_


  * *LongString* String with at most 5000 characters

<a id="negate-boolean"></a>
### `negate` ∷ Boolean

specifies the absence of the pattern

* This entry is _optional_



<a id="producer-shortstring"></a>
### `producer` ∷ ShortString

* This entry is **required**
* Dev Notes: TODO - Document what is supposed to be in this field!


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

<a id="severity-highmedlowstring"></a>
### `severity` ∷ HighMedLowString

* This entry is _optional_


  * Allowed values:
    * `"High"`
    * `"Info"`
    * `"Low"`
    * `"Medium"`
    * `"None"`
    * `"Unknown"`
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


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

<a id="specification-either"></a>
### `specification` ∷ Either

* This entry is _optional_


* Only one of the following schemas will match:

  * [*JudgementSpecification*](./JudgementSpecification.md#map59)

  * [*ThreatBrainSpecification*](./ThreatBrainSpecification.md#map60)

  * [*SnortSpecification*](./SnortSpecification.md#map61)

  * [*SIOCSpecification*](./SIOCSpecification.md#map62)

  * [*OpenIOCSpecification*](./OpenIOCSpecification.md#map63)

<a id="tags-shortstring"></a>
### `tags` ∷ [ShortString]

Descriptors for this indicator

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="test_mechanisms-medstring"></a>
### `test_mechanisms` ∷ [MedString]

Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


  * *MedString* String with at most 2048 characters

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

<a id="type-indicatortypeidentifierstring"></a>
### `type` ∷ IndicatorTypeIdentifierString

The fixed value indicator

* This entry is **required**


  * *IndicatorTypeIdentifier* The fixed value "indicator"
  * Must equal: `"indicator"`

<a id="valid_time-validtimevalidtimemdmap56"></a>
### `valid_time` ∷ [*ValidTime*](./ValidTime.md#map56)

The time range during which this Indicator is considered valid.

* This entry is **required**

