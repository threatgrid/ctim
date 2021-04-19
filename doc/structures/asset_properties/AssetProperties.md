<a id="top"></a>
# *AssetProperties*

> Reference: [AssetProperties](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#assetproperties)

*AssetProperties* Assets do not have any product specific properties, those are represented in AssetProperties - which is a record that asserts one or more properties of an Asset for a specific time.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[asset_ref](#asset_ref-string)|String|URI that points to the associated Asset.|**Required**|
|[id](#id-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#schema_version-string)|String|CTIM schema version for this entity|**Required**|
|[source](#source-medstring)|MedString| |**Required**|
|[type](#type-assetpropertiestypeidentifierstring)|AssetPropertiesTypeIdentifierString| |**Required**|
|[valid_time](#valid_time-validtimevalidtimemdmap2)|[*ValidTime*](./ValidTime.md#map2)|The time range during which the AssetProperties is considered valid.|**Required**|
|[external_ids](#external_ids-string)|[String]| |_Optional_|
|[external_references](#external_references-externalreferenceexternalreferencemdmap1)|[[*ExternalReference*](./ExternalReference.md#map1)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#language-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[properties](#properties-assetpropertyassetpropertymdmap3)|[[*AssetProperty*](./AssetProperty.md#map3)]| |_Optional_|
|[revision](#revision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|
|[timestamp](#timestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#tlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<a id="asset_ref-string"></a>
### `asset_ref` ∷ String

URI that points to the associated Asset.

* This entry is **required**


  * A URI leading to an entity

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

<a id="language-shortstring"></a>
### `language` ∷ ShortString

The human language this object is specified in.

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="properties-assetpropertyassetpropertymdmap3"></a>
### `properties` ∷ [[*AssetProperty*](./AssetProperty.md#map3)]

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

<a id="type-assetpropertiestypeidentifierstring"></a>
### `type` ∷ AssetPropertiesTypeIdentifierString

* This entry is **required**


  * Must equal: `"asset-properties"`

<a id="valid_time-validtimevalidtimemdmap2"></a>
### `valid_time` ∷ [*ValidTime*](./ValidTime.md#map2)

The time range during which the AssetProperties is considered valid.

* This entry is **required**

