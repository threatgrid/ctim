<a id="map4"></a>
# *AssetMapping*

> Reference: [AssetMapping](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#assetmapping)

*AssetMapping* a record that a specific Observable maps to an Asset for a specific time period.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[asset_ref](#asset_ref-string)|String|URI that points to the mapped Asset.|**Required**|
|[asset_type](#asset_type-assettypestring)|AssetTypeString|Type of the mapped Asset: Device, Person, Application, etc.|**Required**|
|[confidence](#confidence-highmedlowstring)|HighMedLowString|Level of confidence held in the characterization of this AssetMapping e.g.: is it susceptible to manipulation or translation?|**Required**|
|[id](#id-string)|String|Globally unique URI identifying this object.|**Required**|
|[observable](#observable-observableobservablemdmap32)|[*Observable*](./Observable.md#map32)|An AssetMapping is a record that a specific Observable maps to an Asset for an indicated period of time.|**Required**|
|[schema_version](#schema_version-string)|String|CTIM schema version for this entity|**Required**|
|[source](#source-medstring)|MedString| |**Required**|
|[specificity](#specificity-specificitystring)|SpecificityString|Denotes the level of how many assets potentially could have this same identifier.|**Required**|
|[stability](#stability-stabilitystring)|StabilityString|Do we manage when it changes, or is it always a time bound assignment?|**Required**|
|[type](#type-assetmappingtypeidentifierstring)|AssetMappingTypeIdentifierString| |**Required**|
|[valid_time](#valid_time-validtimevalidtimemdmap31)|[*ValidTime*](./ValidTime.md#map31)|For each asset, we allow for the assertion of time bound properties.This gives us both a record of the current state of the asset,as well as history.|**Required**|
|[external_ids](#external_ids-string)|[String]| |_Optional_|
|[external_references](#external_references-externalreferenceexternalreferencemdmap30)|[[*ExternalReference*](./ExternalReference.md#map30)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#language-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#revision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|
|[timestamp](#timestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#tlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<a id="asset_ref-string"></a>
### `asset_ref` ∷ String

URI that points to the mapped Asset.

* This entry is **required**


  * A URI leading to an entity

<a id="asset_type-assettypestring"></a>
### `asset_type` ∷ AssetTypeString

Type of the mapped Asset: Device, Person, Application, etc.

* This entry is **required**


  * Allowed values:
    * `"application"`
    * `"data"`
    * `"device"`
    * `"network"`
    * `"person"`

<a id="confidence-highmedlowstring"></a>
### `confidence` ∷ HighMedLowString

Level of confidence held in the characterization of this AssetMapping e.g.: is it susceptible to manipulation or translation?

* This entry is **required**


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



<a id="external_references-externalreferenceexternalreferencemdmap30"></a>
### `external_references` ∷ [[*ExternalReference*](./ExternalReference.md#map30)]

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

<a id="observable-observableobservablemdmap32"></a>
### `observable` ∷ [*Observable*](./Observable.md#map32)

An AssetMapping is a record that a specific Observable maps to an Asset for an indicated period of time.

* This entry is **required**


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

<a id="specificity-specificitystring"></a>
### `specificity` ∷ SpecificityString

Denotes the level of how many assets potentially could have this same identifier.

* This entry is **required**


  * Allowed values:
    * `"Low"`
    * `"Medium"`
    * `"Unique"`

<a id="stability-stabilitystring"></a>
### `stability` ∷ StabilityString

Do we manage when it changes, or is it always a time bound assignment?

* This entry is **required**


  * Allowed values:
    * `"Managed"`
    * `"Physical"`
    * `"Temporary"`

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

<a id="type-assetmappingtypeidentifierstring"></a>
### `type` ∷ AssetMappingTypeIdentifierString

* This entry is **required**


  * Must equal: `"asset-mapping"`

<a id="valid_time-validtimevalidtimemdmap31"></a>
### `valid_time` ∷ [*ValidTime*](./ValidTime.md#map31)

For each asset, we allow for the assertion of time bound properties.This gives us both a record of the current state of the asset,as well as history.

* This entry is **required**

