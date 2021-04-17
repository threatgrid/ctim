<a id="top"></a>
# *AssetMapping*

> Reference: [AssetMapping](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#assetmapping)

*AssetMapping* a record that a specific Observable maps to an Asset for a specific time period.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[asset_ref](#propertyasset_ref-string)|String|URI that points to the mapped Asset.|**Required**|
|[asset_type](#propertyasset_type-assettypestring)|AssetTypeString|Type of the mapped Asset: Device, Person, Application, etc.|**Required**|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|Level of confidence held in the characterization of this AssetMapping e.g.: is it susceptible to manipulation or translation?|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[observable](#propertyobservable-observable)|[*Observable*](#map3)|An AssetMapping is a record that a specific Observable maps to an Asset for an indicated period of time.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[source](#propertysource-medstring)|MedString| |**Required**|
|[specificity](#propertyspecificity-specificitystring)|SpecificityString|Denotes the level of how many assets potentially could have this same identifier.|**Required**|
|[stability](#propertystability-stabilitystring)|StabilityString|Do we manage when it changes, or is it always a time bound assignment?|**Required**|
|[type](#propertytype-assetmappingtypeidentifierstring)|AssetMappingTypeIdentifierString| |**Required**|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map2)|For each asset, we allow for the assertion of time bound properties.This gives us both a record of the current state of the asset,as well as history.|**Required**|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap1)|[[*ExternalReference*](#map1)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertyasset_ref-string"></a>
## Property asset_ref ∷ String

URI that points to the mapped Asset.

* This entry is required


  * A URI leading to an entity

<a id="propertyasset_type-assettypestring"></a>
## Property asset_type ∷ AssetTypeString

Type of the mapped Asset: Device, Person, Application, etc.

* This entry is required


  * Allowed Values:
    * application
    * data
    * device
    * network
    * person

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

Level of confidence held in the characterization of this AssetMapping e.g.: is it susceptible to manipulation or translation?

* This entry is required


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyobservable-observable"></a>
## Property observable ∷ *Observable*

An AssetMapping is a record that a specific Observable maps to an Asset for an indicated period of time.

* This entry is required


<a id="map3-ref"></a>
* *Observable* Value
  * Details: [*Observable*](#map3)

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyspecificity-specificitystring"></a>
## Property specificity ∷ SpecificityString

Denotes the level of how many assets potentially could have this same identifier.

* This entry is required


  * Allowed Values:
    * Low
    * Medium
    * Unique

<a id="propertystability-stabilitystring"></a>
## Property stability ∷ StabilityString

Do we manage when it changes, or is it always a time bound assignment?

* This entry is required


  * Allowed Values:
    * Managed
    * Physical
    * Temporary

<a id="propertytype-assetmappingtypeidentifierstring"></a>
## Property type ∷ AssetMappingTypeIdentifierString

* This entry is required


  * Must equal: "asset-mapping"

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

For each asset, we allow for the assertion of time bound properties.This gives us both a record of the current state of the asset,as well as history.

* This entry is required


<a id="map2-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map2)

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

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-datetime"></a>
## Property timestamp ∷ DateTime

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

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

<a id="map3"></a>
# *Observable*

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |**Required**|
|[value](#propertyvalue-string)|String| |**Required**|


<details>

<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_mid
    * cisco_uc_id
    * device
    * domain
    * email
    * email_messageid
    * email_subject
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * ms_machine_id
    * mutex
    * ngfw_id
    * ngfw_name
    * odns_identity
    * odns_identity_label
    * orbital_node_id
    * pki_serial
    * process_name
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * sha1
    * sha256
    * swc_device_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required




</details>
