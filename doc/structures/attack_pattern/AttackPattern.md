<a id="top"></a>
# *AttackPattern*

> Reference: [Attack Pattern](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/pub#h.axjijf603msy)

*AttackPattern* Attack Patterns are a type of TTP that describe ways that adversaries attempt to compromise targets.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#description-markdownstring)|MarkdownString|A description of object, which may be detailed.|**Required**|
|[id](#id-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#schema_version-string)|String|CTIM schema version for this entity|**Required**|
|[short_description](#short_description-medstring)|MedString|A single line, short summary of the object.|**Required**|
|[title](#title-shortstring)|ShortString|A short title for this object, used as primary display and reference value|**Required**|
|[type](#type-attackpatterntypeidentifierstring)|AttackPatternTypeIdentifierString| |**Required**|
|[abstraction_level](#abstraction_level-attackpatternabstractionsstring)|AttackPatternAbstractionsString|The CAPEC abstraction level for patterns describing techniques to attack a system.|_Optional_|
|[external_ids](#external_ids-string)|[String]| |_Optional_|
|[external_references](#external_references-externalreferenceexternalreferencemdmap2)|[[*ExternalReference*](./ExternalReference.md#map2)]|A list of external references which refer to non-STIX information. This property MAY be used to provide one or more Attack Pattern identifiers, such as a CAPEC ID. When specifying a CAPEC ID, the source_name property of the external reference MUST be set to capec and the external_id property MUST be formatted as CAPEC-[id].|_Optional_|
|[kill_chain_phases](#kill_chain_phases-killchainphasekillchainphasemdmap3)|[[*KillChainPhase*](./KillChainPhase.md#map3)]|The list of Kill Chain Phases for which this Attack Pattern is used.|_Optional_|
|[language](#language-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#revision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source](#source-medstring)|MedString| |_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|
|[timestamp](#timestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#tlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|
|[x_mitre_contributors](#x_mitre_contributors-shortstring)|[ShortString]|ATT&CK Technique.Contributors|_Optional_|
|[x_mitre_data_sources](#x_mitre_data_sources-shortstring)|[ShortString]|ATT&CK Technique.Data Sources|_Optional_|
|[x_mitre_platforms](#x_mitre_platforms-shortstring)|[ShortString]|ATT&CK Technique.Platforms|_Optional_|


<a id="abstraction_level-attackpatternabstractionsstring"></a>
### `abstraction_level` ∷ AttackPatternAbstractionsString

The CAPEC abstraction level for patterns describing techniques to attack a system.

* This entry is _optional_


  * *AttackPatternAbstractions* Abstraction levels corresponding to CAPEC data describing attack-pattern objects.
  * Allowed values:
    * `"aggregate"`
    * `"category"`
    * `"detailed"`
    * `"meta"`
    * `"standard"`
  * Reference: [Common Attack Pattern Enumeration and Classification](https://capec.mitre.org)


<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

A description of object, which may be detailed.

* This entry is **required**


  * *Markdown* Markdown string with at most 5000 characters

<a id="external_ids-string"></a>
### `external_ids` ∷ [String]

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)



<a id="external_references-externalreferenceexternalreferencemdmap2"></a>
### `external_references` ∷ [[*ExternalReference*](./ExternalReference.md#map2)]

A list of external references which refer to non-STIX information. This property MAY be used to provide one or more Attack Pattern identifiers, such as a CAPEC ID. When specifying a CAPEC ID, the source_name property of the external reference MUST be set to capec and the external_id property MUST be formatted as CAPEC-[id].

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="id-string"></a>
### `id` ∷ String

Globally unique URI identifying this object.

* This entry is **required**


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](https://github.com/threatgrid/ctim/blob/subdoc/doc/structures/judgement/Judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="kill_chain_phases-killchainphasekillchainphasemdmap3"></a>
### `kill_chain_phases` ∷ [[*KillChainPhase*](./KillChainPhase.md#map3)]

The list of Kill Chain Phases for which this Attack Pattern is used.

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


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

* This entry is **required**


  * *MedString* String with at most 2048 characters

<a id="source-medstring"></a>
### `source` ∷ MedString

* This entry is _optional_


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

<a id="title-shortstring"></a>
### `title` ∷ ShortString

A short title for this object, used as primary display and reference value

* This entry is **required**


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

<a id="type-attackpatterntypeidentifierstring"></a>
### `type` ∷ AttackPatternTypeIdentifierString

* This entry is **required**


  * Must equal: `"attack-pattern"`

<a id="x_mitre_contributors-shortstring"></a>
### `x_mitre_contributors` ∷ [ShortString]

ATT&CK Technique.Contributors

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="x_mitre_data_sources-shortstring"></a>
### `x_mitre_data_sources` ∷ [ShortString]

ATT&CK Technique.Data Sources

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="x_mitre_platforms-shortstring"></a>
### `x_mitre_platforms` ∷ [ShortString]

ATT&CK Technique.Platforms

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters
