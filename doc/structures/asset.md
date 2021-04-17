<a id="top"></a>
# *Asset*

> Reference: [Assets](https://github.com/threatgrid/response/blob/master/features/assets/assets.org)

*Asset* Describes a protected resource. It could be a device, user, network, application or data

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[asset_type](#propertyasset_type-assettypestring)|AssetTypeString|Type of the Asset: Device, Person, Application, etc.|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[source](#propertysource-medstring)|MedString| |**Required**|
|[type](#propertytype-assettypeidentifierstring)|AssetTypeIdentifierString| |**Required**|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map2)|The time range during which the Asset is considered valid.|**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap1)|[[*ExternalReference*](#map1)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertyasset_type-assettypestring"></a>
## Property asset_type ∷ AssetTypeString

Type of the Asset: Device, Person, Application, etc.

* This entry is required


  * Allowed Values:
    * application
    * data
    * device
    * network
    * person

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertytype-assettypeidentifierstring"></a>
## Property type ∷ AssetTypeIdentifierString

* This entry is required


  * Must equal: "asset"

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

The time range during which the Asset is considered valid.

* This entry is required


<a id="map2-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map2)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap1"></a>
## Property external_references ∷ [[*ExternalReference*](#map1)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map1-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map1)

<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyshort_description-medstring"></a>
## Property short_description ∷ MedString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-datetime"></a>
## Property timestamp ∷ DateTime

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstring"></a>
## Property title ∷ ShortString

A short title for this object, used as primary display and reference value

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLPString

Specification for how, and to whom, this object can be shared.

* This entry is optional


  * *TLP* TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white


</details>

<a id="map1"></a>
# *ExternalReference*

> Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstring)|MedString|The source within which the external-reference is defined (system, registry, organization, etc.)|**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString| |_Optional_|
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.|_Optional_|
|[hashes](#propertyhashes-string)|[String]|Specifies a dictionary of hashes for the contents of the url.|_Optional_|
|[url](#propertyurl-string)|String|A URL reference to an external resource|_Optional_|


<details>

<a id="propertysource_name-medstring"></a>
## Property source_name ∷ MedString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-string"></a>
## Property hashes ∷ [String]

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI


</details>

<a id="map2"></a>
# *ValidTime*

> Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-datetime)|DateTime|If end_time is not present, then the valid time position of the object does not have an upper bound.|_Optional_|
|[start_time](#propertystart_time-datetime)|DateTime|If not present, the valid time position of the indicator does not have an upper bound|_Optional_|


<details>

<a id="propertyend_time-datetime"></a>
## Property end_time ∷ DateTime

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-datetime"></a>
## Property start_time ∷ DateTime

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.


</details>
