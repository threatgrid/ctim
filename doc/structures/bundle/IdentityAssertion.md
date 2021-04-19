<a id="map16"></a>
# *IdentityAssertion*

*IdentityAssertion* Context attributes about the target or any of its observables. 
   Providers could provide different types of assertions regarding a target depending on their own capabilities

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[assertions](#assertions-assertionassertionmdmap87)|[[*Assertion*](./Assertion.md#map87)]|Any known context about the identity attributes|**Required**|
|[id](#id-string)|String|Globally unique URI identifying this object.|**Required**|
|[identity](#identity-identitycoordinatesidentitycoordinatesmdmap86)|[*IdentityCoordinates*](./IdentityCoordinates.md#map86)|attributes for which the assertion is being made|**Required**|
|[schema_version](#schema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#type-identityassertiontypeidentifierstring)|IdentityAssertionTypeIdentifierString| |**Required**|
|[external_ids](#external_ids-string)|[String]| |_Optional_|
|[external_references](#external_references-externalreferenceexternalreferencemdmap85)|[[*ExternalReference*](./ExternalReference.md#map85)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#language-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#revision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source](#source-medstring)|MedString| |_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|
|[timestamp](#timestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#tlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|
|[valid_time](#valid_time-validtimevalidtimemdmap88)|[*ValidTime*](./ValidTime.md#map88)| |_Optional_|


<a id="assertions-assertionassertionmdmap87"></a>
### `assertions` ∷ [[*Assertion*](./Assertion.md#map87)]

Any known context about the identity attributes

* This entry is **required**
* This entry's type is sequential (allows zero or more values)


<a id="external_ids-string"></a>
### `external_ids` ∷ [String]

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)



<a id="external_references-externalreferenceexternalreferencemdmap85"></a>
### `external_references` ∷ [[*ExternalReference*](./ExternalReference.md#map85)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="id-string"></a>
### `id` ∷ String

Globally unique URI identifying this object.

* This entry is **required**


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](https://github.com/threatgrid/ctim/blob/subdoc/doc/structures/judgement/Judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="identity-identitycoordinatesidentitycoordinatesmdmap86"></a>
### `identity` ∷ [*IdentityCoordinates*](./IdentityCoordinates.md#map86)

attributes for which the assertion is being made

* This entry is **required**


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

<a id="type-identityassertiontypeidentifierstring"></a>
### `type` ∷ IdentityAssertionTypeIdentifierString

* This entry is **required**


  * Must equal: `"identity-assertion"`

<a id="valid_time-validtimevalidtimemdmap88"></a>
### `valid_time` ∷ [*ValidTime*](./ValidTime.md#map88)

* This entry is _optional_

