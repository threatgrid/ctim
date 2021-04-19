<a id="top"></a>
# *Bundle*

*Bundle* Describes a Bundle of any set of CTIM entities.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#id-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#schema_version-string)|String|CTIM schema version for this entity|**Required**|
|[source](#source-medstring)|MedString| |**Required**|
|[type](#type-bundletypeidentifierstring)|BundleTypeIdentifierString| |**Required**|
|[valid_time](#valid_time-validtimevalidtimemdmap23)|[*ValidTime*](./ValidTime.md#map23)| |**Required**|
|[actor_refs](#actor_refs-string)|#{String}| |_Optional_|
|[actors](#actors-actoractormdmap2)|#{[*Actor*](./Actor.md#map2)}|a list of `Actor`|_Optional_|
|[asset_mapping_refs](#asset_mapping_refs-string)|#{String}| |_Optional_|
|[asset_mappings](#asset_mappings-assetmappingassetmappingmdmap4)|#{[*AssetMapping*](./AssetMapping.md#map4)}|a list of `AssetMapping`|_Optional_|
|[asset_properties](#asset_properties-assetpropertiesassetpropertiesmdmap5)|#{[*AssetProperties*](./AssetProperties.md#map5)}|a list of `AssetProperties`|_Optional_|
|[asset_properties_refs](#asset_properties_refs-string)|#{String}| |_Optional_|
|[asset_refs](#asset_refs-string)|#{String}| |_Optional_|
|[assets](#assets-assetassetmdmap3)|#{[*Asset*](./Asset.md#map3)}|a list of `Asset`|_Optional_|
|[attack_pattern_refs](#attack_pattern_refs-string)|#{String}| |_Optional_|
|[attack_patterns](#attack_patterns-attackpatternattackpatternmdmap6)|#{[*AttackPattern*](./AttackPattern.md#map6)}|a list of `AttackPattern`|_Optional_|
|[campaign_refs](#campaign_refs-string)|#{String}| |_Optional_|
|[campaigns](#campaigns-campaigncampaignmdmap7)|#{[*Campaign*](./Campaign.md#map7)}|a list of `Campaign`|_Optional_|
|[coa_refs](#coa_refs-string)|#{String}| |_Optional_|
|[coas](#coas-coacoamdmap8)|#{[*COA*](./COA.md#map8)}|a list of `COA`|_Optional_|
|[data_table_refs](#data_table_refs-string)|#{String}| |_Optional_|
|[data_tables](#data_tables-datatabledatatablemdmap20)|#{[*DataTable*](./DataTable.md#map20)}|a list of `DataTable`|_Optional_|
|[description](#description-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#external_ids-string)|[String]| |_Optional_|
|[external_references](#external_references-externalreferenceexternalreferencemdmap1)|[[*ExternalReference*](./ExternalReference.md#map1)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[feedback_refs](#feedback_refs-string)|#{String}| |_Optional_|
|[feedbacks](#feedbacks-feedbackfeedbackmdmap9)|#{[*Feedback*](./Feedback.md#map9)}|a list of `Feedback`|_Optional_|
|[identity_assertion_refs](#identity_assertion_refs-string)|#{String}| |_Optional_|
|[identity_assertions](#identity_assertions-identityassertionidentityassertionmdmap16)|#{[*IdentityAssertion*](./IdentityAssertion.md#map16)}|a list of `IdentityAssertion`|_Optional_|
|[incident_refs](#incident_refs-string)|#{String}| |_Optional_|
|[incidents](#incidents-incidentincidentmdmap10)|#{[*Incident*](./Incident.md#map10)}|a list of `Incident`|_Optional_|
|[indicator_refs](#indicator_refs-string)|#{String}| |_Optional_|
|[indicators](#indicators-indicatorindicatormdmap11)|#{[*Indicator*](./Indicator.md#map11)}|a list of `Indicator`|_Optional_|
|[judgement_refs](#judgement_refs-string)|#{String}| |_Optional_|
|[judgements](#judgements-judgementjudgementmdmap12)|#{[*Judgement*](./Judgement.md#map12)}|a list of `Judgement`|_Optional_|
|[language](#language-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[malware_refs](#malware_refs-string)|#{String}| |_Optional_|
|[malwares](#malwares-malwaremalwaremdmap13)|#{[*Malware*](./Malware.md#map13)}|a list of `Malware`|_Optional_|
|[relationship_refs](#relationship_refs-string)|#{String}| |_Optional_|
|[relationships](#relationships-relationshiprelationshipmdmap14)|#{[*Relationship*](./Relationship.md#map14)}|a list of `Relationship`|_Optional_|
|[revision](#revision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#short_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[sighting_refs](#sighting_refs-string)|#{String}| |_Optional_|
|[sightings](#sightings-sightingsightingmdmap15)|#{[*Sighting*](./Sighting.md#map15)}|a list of `Sighting`|_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|
|[target_record_refs](#target_record_refs-string)|#{String}| |_Optional_|
|[target_records](#target_records-targetrecordtargetrecordmdmap17)|#{[*TargetRecord*](./TargetRecord.md#map17)}|a list of `TargetRecord`|_Optional_|
|[timestamp](#timestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#title-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#tlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|
|[tool_refs](#tool_refs-string)|#{String}| |_Optional_|
|[tools](#tools-tooltoolmdmap18)|#{[*Tool*](./Tool.md#map18)}|a list of `Tool`|_Optional_|
|[verdict_refs](#verdict_refs-string)|#{String}| |_Optional_|
|[verdicts](#verdicts-verdictverdictmdmap19)|#{[*Verdict*](./Verdict.md#map19)}|a list of `Verdict`|_Optional_|
|[vulnerabilities](#vulnerabilities-vulnerabilityvulnerabilitymdmap22)|#{[*Vulnerability*](./Vulnerability.md#map22)}|a list of `Vulnerability`|_Optional_|
|[vulnerability_refs](#vulnerability_refs-string)|#{String}| |_Optional_|
|[weakness_refs](#weakness_refs-string)|#{String}| |_Optional_|
|[weaknesses](#weaknesses-weaknessweaknessmdmap21)|#{[*Weakness*](./Weakness.md#map21)}|a list of `Weakness`|_Optional_|


<a id="actor_refs-string"></a>
### `actor_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="actors-actoractormdmap2"></a>
### `actors` ∷ #{[*Actor*](./Actor.md#map2)}

a list of `Actor`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="asset_mapping_refs-string"></a>
### `asset_mapping_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="asset_mappings-assetmappingassetmappingmdmap4"></a>
### `asset_mappings` ∷ #{[*AssetMapping*](./AssetMapping.md#map4)}

a list of `AssetMapping`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="asset_properties-assetpropertiesassetpropertiesmdmap5"></a>
### `asset_properties` ∷ #{[*AssetProperties*](./AssetProperties.md#map5)}

a list of `AssetProperties`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="asset_properties_refs-string"></a>
### `asset_properties_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="asset_refs-string"></a>
### `asset_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="assets-assetassetmdmap3"></a>
### `assets` ∷ #{[*Asset*](./Asset.md#map3)}

a list of `Asset`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="attack_pattern_refs-string"></a>
### `attack_pattern_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="attack_patterns-attackpatternattackpatternmdmap6"></a>
### `attack_patterns` ∷ #{[*AttackPattern*](./AttackPattern.md#map6)}

a list of `AttackPattern`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="campaign_refs-string"></a>
### `campaign_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="campaigns-campaigncampaignmdmap7"></a>
### `campaigns` ∷ #{[*Campaign*](./Campaign.md#map7)}

a list of `Campaign`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="coa_refs-string"></a>
### `coa_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="coas-coacoamdmap8"></a>
### `coas` ∷ #{[*COA*](./COA.md#map8)}

a list of `COA`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="data_table_refs-string"></a>
### `data_table_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="data_tables-datatabledatatablemdmap20"></a>
### `data_tables` ∷ #{[*DataTable*](./DataTable.md#map20)}

a list of `DataTable`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

A description of object, which may be detailed.

* This entry is _optional_


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


<a id="feedback_refs-string"></a>
### `feedback_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="feedbacks-feedbackfeedbackmdmap9"></a>
### `feedbacks` ∷ #{[*Feedback*](./Feedback.md#map9)}

a list of `Feedback`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="id-string"></a>
### `id` ∷ String

Globally unique URI identifying this object.

* This entry is **required**


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](https://github.com/threatgrid/ctim/blob/subdoc/doc/structures/judgement/Judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="identity_assertion_refs-string"></a>
### `identity_assertion_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="identity_assertions-identityassertionidentityassertionmdmap16"></a>
### `identity_assertions` ∷ #{[*IdentityAssertion*](./IdentityAssertion.md#map16)}

a list of `IdentityAssertion`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="incident_refs-string"></a>
### `incident_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="incidents-incidentincidentmdmap10"></a>
### `incidents` ∷ #{[*Incident*](./Incident.md#map10)}

a list of `Incident`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="indicator_refs-string"></a>
### `indicator_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="indicators-indicatorindicatormdmap11"></a>
### `indicators` ∷ #{[*Indicator*](./Indicator.md#map11)}

a list of `Indicator`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="judgement_refs-string"></a>
### `judgement_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="judgements-judgementjudgementmdmap12"></a>
### `judgements` ∷ #{[*Judgement*](./Judgement.md#map12)}

a list of `Judgement`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="language-shortstring"></a>
### `language` ∷ ShortString

The human language this object is specified in.

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="malware_refs-string"></a>
### `malware_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="malwares-malwaremalwaremdmap13"></a>
### `malwares` ∷ #{[*Malware*](./Malware.md#map13)}

a list of `Malware`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="relationship_refs-string"></a>
### `relationship_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="relationships-relationshiprelationshipmdmap14"></a>
### `relationships` ∷ #{[*Relationship*](./Relationship.md#map14)}

a list of `Relationship`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


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

<a id="sighting_refs-string"></a>
### `sighting_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="sightings-sightingsightingmdmap15"></a>
### `sightings` ∷ #{[*Sighting*](./Sighting.md#map15)}

a list of `Sighting`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="source-medstring"></a>
### `source` ∷ MedString

* This entry is **required**


  * *MedString* String with at most 2048 characters

<a id="source_uri-string"></a>
### `source_uri` ∷ String

* This entry is _optional_


  * A URI

<a id="target_record_refs-string"></a>
### `target_record_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="target_records-targetrecordtargetrecordmdmap17"></a>
### `target_records` ∷ #{[*TargetRecord*](./TargetRecord.md#map17)}

a list of `TargetRecord`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


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

<a id="tool_refs-string"></a>
### `tool_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="tools-tooltoolmdmap18"></a>
### `tools` ∷ #{[*Tool*](./Tool.md#map18)}

a list of `Tool`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="type-bundletypeidentifierstring"></a>
### `type` ∷ BundleTypeIdentifierString

* This entry is **required**


  * Must equal: `"bundle"`

<a id="valid_time-validtimevalidtimemdmap23"></a>
### `valid_time` ∷ [*ValidTime*](./ValidTime.md#map23)

* This entry is **required**


<a id="verdict_refs-string"></a>
### `verdict_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="verdicts-verdictverdictmdmap19"></a>
### `verdicts` ∷ #{[*Verdict*](./Verdict.md#map19)}

a list of `Verdict`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="vulnerabilities-vulnerabilityvulnerabilitymdmap22"></a>
### `vulnerabilities` ∷ #{[*Vulnerability*](./Vulnerability.md#map22)}

a list of `Vulnerability`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


<a id="vulnerability_refs-string"></a>
### `vulnerability_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="weakness_refs-string"></a>
### `weakness_refs` ∷ #{String}

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="weaknesses-weaknessweaknessmdmap21"></a>
### `weaknesses` ∷ #{[*Weakness*](./Weakness.md#map21)}

a list of `Weakness`

* This entry is _optional_
* This entry's type is a set (allows zero or more distinct values)

