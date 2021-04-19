<a id="top"></a>
# *Actor*

> Reference: [ThreatActorType](http://stixproject.github.io/data-model/1.2/ta/ThreatActorType/)

*Actor* Describes malicious actors (or adversaries) related to a cyber attack.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[actor_type](#actor_type-threatactortypestring)|ThreatActorTypeString| |**Required**|
|[description](#description-markdownstring)|MarkdownString|A description of object, which may be detailed.|**Required**|
|[id](#id-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#schema_version-string)|String|CTIM schema version for this entity|**Required**|
|[short_description](#short_description-medstring)|MedString|A single line, short summary of the object.|**Required**|
|[source](#source-medstring)|MedString| |**Required**|
|[title](#title-shortstring)|ShortString|A short title for this object, used as primary display and reference value|**Required**|
|[type](#type-actortypeidentifierstring)|ActorTypeIdentifierString| |**Required**|
|[valid_time](#valid_time-validtimevalidtimemdmap2)|[*ValidTime*](./ValidTime.md#map2)| |**Required**|
|[confidence](#confidence-highmedlowstring)|HighMedLowString| |_Optional_|
|[external_ids](#external_ids-string)|[String]| |_Optional_|
|[external_references](#external_references-externalreferenceexternalreferencemdmap1)|[[*ExternalReference*](./ExternalReference.md#map1)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[identity](#identity-identityidentitymdmap3)|[*Identity*](./Identity.md#map3)| |_Optional_|
|[intended_effect](#intended_effect-intendedeffectstring)|IntendedEffectString| |_Optional_|
|[language](#language-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[motivation](#motivation-motivationstring)|MotivationString| |_Optional_|
|[planning_and_operational_support](#planning_and_operational_support-longstring)|LongString| |_Optional_|
|[revision](#revision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[sophistication](#sophistication-sophisticationstring)|SophisticationString| |_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|
|[timestamp](#timestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#tlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<a id="actor_type-threatactortypestring"></a>
### `actor_type` ∷ ThreatActorTypeString

* This entry is **required**


  * Allowed values:
    * `"Cyber Espionage Operations"`
    * `"Disgruntled Customer / User"`
    * `"Hacker"`
    * `"Hacker - Black hat"`
    * `"Hacker - Gray hat"`
    * `"Hacker - White hat"`
    * `"Hacktivist"`
    * `"Insider Threat"`
    * `"State Actor / Agency"`
    * `"eCrime Actor - Credential Theft Botnet Operator"`
    * `"eCrime Actor - Credential Theft Botnet Service"`
    * `"eCrime Actor - Malware Developer"`
    * `"eCrime Actor - Money Laundering Network"`
    * `"eCrime Actor - Organized Crime Actor"`
    * `"eCrime Actor - Spam Service"`
    * `"eCrime Actor - Traffic Service"`
    * `"eCrime Actor - Underground Call Service"`

<a id="confidence-highmedlowstring"></a>
### `confidence` ∷ HighMedLowString

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

* This entry is **required**


  * *Markdown* Markdown string with at most 5000 characters

<a id="external_ids-string"></a>
### `external_ids` ∷ [String]

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)



<a id="external_references-externalreferenceexternalreferencemdmap1"></a>
### `external_references` ∷ [[*ExternalReference*](./ExternalReference.md#map1)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="id-string"></a>
### `id` ∷ String

Globally unique URI identifying this object.

* This entry is **required**


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](https://github.com/threatgrid/ctim/blob/subdoc/doc/structures/judgement/Judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="identity-identityidentitymdmap3"></a>
### `identity` ∷ [*Identity*](./Identity.md#map3)

* This entry is _optional_


<a id="intended_effect-intendedeffectstring"></a>
### `intended_effect` ∷ IntendedEffectString

* This entry is _optional_


  * Allowed values:
    * `"Account Takeover"`
    * `"Advantage"`
    * `"Advantage - Economic"`
    * `"Advantage - Military"`
    * `"Advantage - Political"`
    * `"Brand Damage"`
    * `"Competitive Advantage"`
    * `"Degradation of Service"`
    * `"Denial and Deception"`
    * `"Destruction"`
    * `"Disruption"`
    * `"Embarrassment"`
    * `"Exposure"`
    * `"Extortion"`
    * `"Fraud"`
    * `"Harassment"`
    * `"ICS Control"`
    * `"Theft"`
    * `"Theft - Credential Theft"`
    * `"Theft - Identity Theft"`
    * `"Theft - Intellectual Property"`
    * `"Theft - Theft of Proprietary Information"`
    * `"Traffic Diversion"`
    * `"Unauthorized Access"`

<a id="language-shortstring"></a>
### `language` ∷ ShortString

The human language this object is specified in.

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="motivation-motivationstring"></a>
### `motivation` ∷ MotivationString

* This entry is _optional_


  * Allowed values:
    * `"Ego"`
    * `"Financial or Economic"`
    * `"Ideological"`
    * `"Ideological - Anti-Corruption"`
    * `"Ideological - Anti-Establishment"`
    * `"Ideological - Environmental"`
    * `"Ideological - Ethnic / Nationalist"`
    * `"Ideological - Human Rights"`
    * `"Ideological - Information Freedom"`
    * `"Ideological - Religious"`
    * `"Ideological - Security Awareness"`
    * `"Military"`
    * `"Opportunistic"`
    * `"Political"`

<a id="planning_and_operational_support-longstring"></a>
### `planning_and_operational_support` ∷ LongString

* This entry is _optional_


  * *LongString* String with at most 5000 characters

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

<a id="sophistication-sophisticationstring"></a>
### `sophistication` ∷ SophisticationString

* This entry is _optional_


  * Allowed values:
    * `"Aspirant"`
    * `"Expert"`
    * `"Innovator"`
    * `"Novice"`
    * `"Practitioner"`

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

<a id="type-actortypeidentifierstring"></a>
### `type` ∷ ActorTypeIdentifierString

* This entry is **required**


  * Must equal: `"actor"`

<a id="valid_time-validtimevalidtimemdmap2"></a>
### `valid_time` ∷ [*ValidTime*](./ValidTime.md#map2)

* This entry is **required**

