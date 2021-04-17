<a id="top"></a>
# *Casebook*

*Casebook* Describes a CTIM Casebook which works like a structured gist

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#propertytype-casebooktypeidentifierstring)|CasebookTypeIdentifierString| |**Required**|
|[bundle](#propertybundle-bundle)|[*Bundle*](#map3)| |_Optional_|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap1)|[[*ExternalReference*](#map1)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[observables](#propertyobservables-observablemap2)|[[*Observable*](#map2)]| |_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[texts](#propertytexts-textmap4)|[[*Text*](#map4)]| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

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

<a id="propertytype-casebooktypeidentifierstring"></a>
## Property type ∷ CasebookTypeIdentifierString

* This entry is required


  * Must equal: "casebook"

<a id="propertybundle-bundle"></a>
## Property bundle ∷ *Bundle*

* This entry is optional


<a id="map3-ref"></a>
* *Bundle* Value
  * Details: [*Bundle*](#map3)

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

<a id="propertyobservables-observablemap2"></a>
## Property observables ∷ [[*Observable*](#map2)]

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map2-ref"></a>
* *Observable* Value
  * Details: [*Observable*](#map2)

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

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytexts-textmap4"></a>
## Property texts ∷ [[*Text*](#map4)]

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map4-ref"></a>
* *Text* Value
  * Details: [*Text*](#map4)

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

<a id="map3"></a>
# *Bundle*

*Bundle* Describes a Bundle of any set of CTIM entities

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[source](#propertysource-medstring)|MedString| |**Required**|
|[type](#propertytype-bundletypeidentifierstring)|BundleTypeIdentifierString| |**Required**|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map27)| |**Required**|
|[actor_refs](#propertyactor_refs-string)|#{String}| |_Optional_|
|[actors](#propertyactors-actor)|#{*Actor*}|a list of `Actor`|_Optional_|
|[asset_mapping_refs](#propertyasset_mapping_refs-string)|#{String}| |_Optional_|
|[asset_mappings](#propertyasset_mappings-assetmapping)|#{*AssetMapping*}|a list of `AssetMapping`|_Optional_|
|[asset_properties](#propertyasset_properties-assetproperties)|#{*AssetProperties*}|a list of `AssetProperties`|_Optional_|
|[asset_properties_refs](#propertyasset_properties_refs-string)|#{String}| |_Optional_|
|[asset_refs](#propertyasset_refs-string)|#{String}| |_Optional_|
|[assets](#propertyassets-asset)|#{*Asset*}|a list of `Asset`|_Optional_|
|[attack_pattern_refs](#propertyattack_pattern_refs-string)|#{String}| |_Optional_|
|[attack_patterns](#propertyattack_patterns-attackpattern)|#{*AttackPattern*}|a list of `AttackPattern`|_Optional_|
|[campaign_refs](#propertycampaign_refs-string)|#{String}| |_Optional_|
|[campaigns](#propertycampaigns-campaign)|#{*Campaign*}|a list of `Campaign`|_Optional_|
|[coa_refs](#propertycoa_refs-string)|#{String}| |_Optional_|
|[coas](#propertycoas-coa)|#{*COA*}|a list of `COA`|_Optional_|
|[data_table_refs](#propertydata_table_refs-string)|#{String}| |_Optional_|
|[data_tables](#propertydata_tables-datatable)|#{*DataTable*}|a list of `DataTable`|_Optional_|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap5)|[[*ExternalReference*](#map5)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[feedback_refs](#propertyfeedback_refs-string)|#{String}| |_Optional_|
|[feedbacks](#propertyfeedbacks-feedback)|#{*Feedback*}|a list of `Feedback`|_Optional_|
|[identity_assertion_refs](#propertyidentity_assertion_refs-string)|#{String}| |_Optional_|
|[identity_assertions](#propertyidentity_assertions-identityassertion)|#{*IdentityAssertion*}|a list of `IdentityAssertion`|_Optional_|
|[incident_refs](#propertyincident_refs-string)|#{String}| |_Optional_|
|[incidents](#propertyincidents-incident)|#{*Incident*}|a list of `Incident`|_Optional_|
|[indicator_refs](#propertyindicator_refs-string)|#{String}| |_Optional_|
|[indicators](#propertyindicators-indicator)|#{*Indicator*}|a list of `Indicator`|_Optional_|
|[judgement_refs](#propertyjudgement_refs-string)|#{String}| |_Optional_|
|[judgements](#propertyjudgements-judgement)|#{*Judgement*}|a list of `Judgement`|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[malware_refs](#propertymalware_refs-string)|#{String}| |_Optional_|
|[malwares](#propertymalwares-malware)|#{*Malware*}|a list of `Malware`|_Optional_|
|[relationship_refs](#propertyrelationship_refs-string)|#{String}| |_Optional_|
|[relationships](#propertyrelationships-relationship)|#{*Relationship*}|a list of `Relationship`|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[sighting_refs](#propertysighting_refs-string)|#{String}| |_Optional_|
|[sightings](#propertysightings-sighting)|#{*Sighting*}|a list of `Sighting`|_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[target_record_refs](#propertytarget_record_refs-string)|#{String}| |_Optional_|
|[target_records](#propertytarget_records-targetrecord)|#{*TargetRecord*}|a list of `TargetRecord`|_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|
|[tool_refs](#propertytool_refs-string)|#{String}| |_Optional_|
|[tools](#propertytools-tool)|#{*Tool*}|a list of `Tool`|_Optional_|
|[verdict_refs](#propertyverdict_refs-string)|#{String}| |_Optional_|
|[verdicts](#propertyverdicts-verdict)|#{*Verdict*}|a list of `Verdict`|_Optional_|
|[vulnerabilities](#propertyvulnerabilities-vulnerability)|#{*Vulnerability*}|a list of `Vulnerability`|_Optional_|
|[vulnerability_refs](#propertyvulnerability_refs-string)|#{String}| |_Optional_|
|[weakness_refs](#propertyweakness_refs-string)|#{String}| |_Optional_|
|[weaknesses](#propertyweaknesses-weakness)|#{*Weakness*}|a list of `Weakness`|_Optional_|


<details>

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

<a id="propertytype-bundletypeidentifierstring"></a>
## Property type ∷ BundleTypeIdentifierString

* This entry is required


  * Must equal: "bundle"

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

* This entry is required


<a id="map27-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map27)

<a id="propertyactor_refs-string"></a>
## Property actor_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyactors-actor"></a>
## Property actors ∷ #{*Actor*}

a list of `Actor`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map6-ref"></a>
* *Actor* Value
  * Details: [*Actor*](#map6)

<a id="propertyasset_mapping_refs-string"></a>
## Property asset_mapping_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyasset_mappings-assetmapping"></a>
## Property asset_mappings ∷ #{*AssetMapping*}

a list of `AssetMapping`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map8-ref"></a>
* *AssetMapping* Value
  * Details: [*AssetMapping*](#map8)

<a id="propertyasset_properties-assetproperties"></a>
## Property asset_properties ∷ #{*AssetProperties*}

a list of `AssetProperties`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map9-ref"></a>
* *AssetProperties* Value
  * Details: [*AssetProperties*](#map9)

<a id="propertyasset_properties_refs-string"></a>
## Property asset_properties_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyasset_refs-string"></a>
## Property asset_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyassets-asset"></a>
## Property assets ∷ #{*Asset*}

a list of `Asset`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map7-ref"></a>
* *Asset* Value
  * Details: [*Asset*](#map7)

<a id="propertyattack_pattern_refs-string"></a>
## Property attack_pattern_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyattack_patterns-attackpattern"></a>
## Property attack_patterns ∷ #{*AttackPattern*}

a list of `AttackPattern`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map10-ref"></a>
* *AttackPattern* Value
  * Details: [*AttackPattern*](#map10)

<a id="propertycampaign_refs-string"></a>
## Property campaign_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertycampaigns-campaign"></a>
## Property campaigns ∷ #{*Campaign*}

a list of `Campaign`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map11-ref"></a>
* *Campaign* Value
  * Details: [*Campaign*](#map11)

<a id="propertycoa_refs-string"></a>
## Property coa_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertycoas-coa"></a>
## Property coas ∷ #{*COA*}

a list of `COA`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map12-ref"></a>
* *COA* Value
  * Details: [*COA*](#map12)

<a id="propertydata_table_refs-string"></a>
## Property data_table_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertydata_tables-datatable"></a>
## Property data_tables ∷ #{*DataTable*}

a list of `DataTable`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map24-ref"></a>
* *DataTable* Value
  * Details: [*DataTable*](#map24)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap5"></a>
## Property external_references ∷ [[*ExternalReference*](#map5)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map5-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map5)

<a id="propertyfeedback_refs-string"></a>
## Property feedback_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyfeedbacks-feedback"></a>
## Property feedbacks ∷ #{*Feedback*}

a list of `Feedback`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map13-ref"></a>
* *Feedback* Value
  * Details: [*Feedback*](#map13)

<a id="propertyidentity_assertion_refs-string"></a>
## Property identity_assertion_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyidentity_assertions-identityassertion"></a>
## Property identity_assertions ∷ #{*IdentityAssertion*}

a list of `IdentityAssertion`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map20-ref"></a>
* *IdentityAssertion* Value
  * Details: [*IdentityAssertion*](#map20)

<a id="propertyincident_refs-string"></a>
## Property incident_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyincidents-incident"></a>
## Property incidents ∷ #{*Incident*}

a list of `Incident`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map14-ref"></a>
* *Incident* Value
  * Details: [*Incident*](#map14)

<a id="propertyindicator_refs-string"></a>
## Property indicator_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyindicators-indicator"></a>
## Property indicators ∷ #{*Indicator*}

a list of `Indicator`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map15-ref"></a>
* *Indicator* Value
  * Details: [*Indicator*](#map15)

<a id="propertyjudgement_refs-string"></a>
## Property judgement_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyjudgements-judgement"></a>
## Property judgements ∷ #{*Judgement*}

a list of `Judgement`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map16-ref"></a>
* *Judgement* Value
  * Details: [*Judgement*](#map16)

<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertymalware_refs-string"></a>
## Property malware_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertymalwares-malware"></a>
## Property malwares ∷ #{*Malware*}

a list of `Malware`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map17-ref"></a>
* *Malware* Value
  * Details: [*Malware*](#map17)

<a id="propertyrelationship_refs-string"></a>
## Property relationship_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyrelationships-relationship"></a>
## Property relationships ∷ #{*Relationship*}

a list of `Relationship`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map18-ref"></a>
* *Relationship* Value
  * Details: [*Relationship*](#map18)

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

<a id="propertysighting_refs-string"></a>
## Property sighting_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertysightings-sighting"></a>
## Property sightings ∷ #{*Sighting*}

a list of `Sighting`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map19-ref"></a>
* *Sighting* Value
  * Details: [*Sighting*](#map19)

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytarget_record_refs-string"></a>
## Property target_record_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertytarget_records-targetrecord"></a>
## Property target_records ∷ #{*TargetRecord*}

a list of `TargetRecord`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map21-ref"></a>
* *TargetRecord* Value
  * Details: [*TargetRecord*](#map21)

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

<a id="propertytool_refs-string"></a>
## Property tool_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertytools-tool"></a>
## Property tools ∷ #{*Tool*}

a list of `Tool`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map22-ref"></a>
* *Tool* Value
  * Details: [*Tool*](#map22)

<a id="propertyverdict_refs-string"></a>
## Property verdict_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyverdicts-verdict"></a>
## Property verdicts ∷ #{*Verdict*}

a list of `Verdict`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map23-ref"></a>
* *Verdict* Value
  * Details: [*Verdict*](#map23)

<a id="propertyvulnerabilities-vulnerability"></a>
## Property vulnerabilities ∷ #{*Vulnerability*}

a list of `Vulnerability`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map26-ref"></a>
* *Vulnerability* Value
  * Details: [*Vulnerability*](#map26)

<a id="propertyvulnerability_refs-string"></a>
## Property vulnerability_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyweakness_refs-string"></a>
## Property weakness_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyweaknesses-weakness"></a>
## Property weaknesses ∷ #{*Weakness*}

a list of `Weakness`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map25-ref"></a>
* *Weakness* Value
  * Details: [*Weakness*](#map25)


</details>

<a id="map27"></a>
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

<a id="map26"></a>
# *Vulnerability*

> Reference: [Vulnerability](http://docs.oasis-open.org/cti/stix/v2.0/cs01/part2-stix-objects/stix-v2.0-cs01-part2-stix-objects.html#_Toc496714334)

*Vulnerability* a mistake in software that can be directly used by a hacker to gain access to a system or network

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|A description that provides more details and context about the Vulnerability, potentially including its purpose and its key characteristics.|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#propertytype-vulnerabilitytypeidentifierstring)|VulnerabilityTypeIdentifierString|The fixed value vulnerability|**Required**|
|[configurations](#propertyconfigurations-configurations)|[*Configurations*](#map31)| |_Optional_|
|[cve](#propertycve-cve)|[*CVE*](#map29)| |_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap28)|[[*ExternalReference*](#map28)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[impact](#propertyimpact-vulnerabilityimpact)|[*VulnerabilityImpact*](#map30)| |_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[last_modified_date](#propertylast_modified_date-datetime)|DateTime| |_Optional_|
|[published_date](#propertypublished_date-datetime)|DateTime| |_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description that provides more details and context about the Vulnerability, potentially including its purpose and its key characteristics.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

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

<a id="propertytype-vulnerabilitytypeidentifierstring"></a>
## Property type ∷ VulnerabilityTypeIdentifierString

The fixed value vulnerability

* This entry is required


  * *VulnerabilityTypeIdentifier* The fixed value "vulnerability"
  * Must equal: "vulnerability"

<a id="propertyconfigurations-configurations"></a>
## Property configurations ∷ *Configurations*

* This entry is optional


<a id="map31-ref"></a>
* *Configurations* Value
  * Details: [*Configurations*](#map31)

<a id="propertycve-cve"></a>
## Property cve ∷ *CVE*

* This entry is optional


<a id="map29-ref"></a>
* *CVE* Value
  * Details: [*CVE*](#map29)

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap28"></a>
## Property external_references ∷ [[*ExternalReference*](#map28)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map28-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map28)

<a id="propertyimpact-vulnerabilityimpact"></a>
## Property impact ∷ *VulnerabilityImpact*

* This entry is optional


<a id="map30-ref"></a>
* *VulnerabilityImpact* Value
  * Details: [*VulnerabilityImpact*](#map30)

<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylast_modified_date-datetime"></a>
## Property last_modified_date ∷ DateTime

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertypublished_date-datetime"></a>
## Property published_date ∷ DateTime

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

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

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

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

<a id="map31"></a>
# *Configurations*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[CVE_data_version](#propertycve_data_version-shortstring)|ShortString| |**Required**|
|[nodes](#propertynodes-cpenodemap32)|[[*CPENode*](#map32)]| |**Required**|


<details>

<a id="propertycve_data_version-shortstring"></a>
## Property CVE_data_version ∷ ShortString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertynodes-cpenodemap32"></a>
## Property nodes ∷ [[*CPENode*](#map32)]

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map32-ref"></a>
* *CPENode* Value
  * Details: [*CPENode*](#map32)


</details>

<a id="map32"></a>
# *CPENode*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[operator](#propertyoperator-cpe-node-operator-stringstring)|cpe-node-operator-stringString| |**Required**|
|[children](#propertychildren-cpeleafnodemap34)|[[*CPELeafNode*](#map34)]| |_Optional_|
|[cpe_match](#propertycpe_match-cpematchmap33)|[[*CPEMatch*](#map33)]| |_Optional_|
|[negate](#propertynegate-boolean)|Boolean|Negates operator when true.|_Optional_|


<details>

<a id="propertyoperator-cpe-node-operator-stringstring"></a>
## Property operator ∷ cpe-node-operator-stringString

* This entry is required


  * *cpe-node-operator-string* The operator string influences how seqs of cpe matches are related to one another.
  * Allowed Values:
    * AND
    * OR

<a id="propertychildren-cpeleafnodemap34"></a>
## Property children ∷ [[*CPELeafNode*](#map34)]

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map34-ref"></a>
* *CPELeafNode* Value
  * Details: [*CPELeafNode*](#map34)

<a id="propertycpe_match-cpematchmap33"></a>
## Property cpe_match ∷ [[*CPEMatch*](#map33)]

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map33-ref"></a>
* *CPEMatch* Value
  * Details: [*CPEMatch*](#map33)

<a id="propertynegate-boolean"></a>
## Property negate ∷ Boolean

Negates operator when true.

* This entry is optional




</details>

<a id="map34"></a>
# *CPELeafNode*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[cpe_match](#propertycpe_match-cpematchmap35)|[[*CPEMatch*](#map35)]| |**Required**|
|[operator](#propertyoperator-cpe-node-operator-stringstring)|cpe-node-operator-stringString| |**Required**|
|[negate](#propertynegate-boolean)|Boolean|Negates operator when true.|_Optional_|


<details>

<a id="propertycpe_match-cpematchmap35"></a>
## Property cpe_match ∷ [[*CPEMatch*](#map35)]

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map35-ref"></a>
* *CPEMatch* Value
  * Details: [*CPEMatch*](#map35)

<a id="propertyoperator-cpe-node-operator-stringstring"></a>
## Property operator ∷ cpe-node-operator-stringString

* This entry is required


  * *cpe-node-operator-string* The operator string influences how seqs of cpe matches are related to one another.
  * Allowed Values:
    * AND
    * OR

<a id="propertynegate-boolean"></a>
## Property negate ∷ Boolean

Negates operator when true.

* This entry is optional




</details>

<a id="map35"></a>
# *CPEMatch*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[cpe23Uri](#propertycpe23uri-string)|String| |**Required**|
|[vulnerable](#propertyvulnerable-boolean)|Boolean| |**Required**|
|[versionEndExcluding](#propertyversionendexcluding-string)|String|A string representing the upper bound(exclusive) of version in the CPE.|_Optional_|
|[versionEndIncluding](#propertyversionendincluding-string)|String|A string representing the upper bound(inclusive) of version in the CPE.|_Optional_|
|[versionStartExcluding](#propertyversionstartexcluding-string)|String|A string representing the lower bound(exclusive) of version in the CPE.|_Optional_|
|[versionStartIncluding](#propertyversionstartincluding-string)|String|A string representing the lower bound(inclusive) of version in the CPE.|_Optional_|


<details>

<a id="propertycpe23uri-string"></a>
## Property cpe23Uri ∷ String

* This entry is required


  * A text representation of a software or hardware platform.

<a id="propertyvulnerable-boolean"></a>
## Property vulnerable ∷ Boolean

* This entry is required



<a id="propertyversionendexcluding-string"></a>
## Property versionEndExcluding ∷ String

A string representing the upper bound(exclusive) of version in the CPE.

* This entry is optional


  * A string representing a bound of a version in the CPE.

<a id="propertyversionendincluding-string"></a>
## Property versionEndIncluding ∷ String

A string representing the upper bound(inclusive) of version in the CPE.

* This entry is optional


  * A string representing a bound of a version in the CPE.

<a id="propertyversionstartexcluding-string"></a>
## Property versionStartExcluding ∷ String

A string representing the lower bound(exclusive) of version in the CPE.

* This entry is optional


  * A string representing a bound of a version in the CPE.

<a id="propertyversionstartincluding-string"></a>
## Property versionStartIncluding ∷ String

A string representing the lower bound(inclusive) of version in the CPE.

* This entry is optional


  * A string representing a bound of a version in the CPE.


</details>

<a id="map33"></a>
# *CPEMatch*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[cpe23Uri](#propertycpe23uri-string)|String| |**Required**|
|[vulnerable](#propertyvulnerable-boolean)|Boolean| |**Required**|
|[versionEndExcluding](#propertyversionendexcluding-string)|String|A string representing the upper bound(exclusive) of version in the CPE.|_Optional_|
|[versionEndIncluding](#propertyversionendincluding-string)|String|A string representing the upper bound(inclusive) of version in the CPE.|_Optional_|
|[versionStartExcluding](#propertyversionstartexcluding-string)|String|A string representing the lower bound(exclusive) of version in the CPE.|_Optional_|
|[versionStartIncluding](#propertyversionstartincluding-string)|String|A string representing the lower bound(inclusive) of version in the CPE.|_Optional_|


<details>

<a id="propertycpe23uri-string"></a>
## Property cpe23Uri ∷ String

* This entry is required


  * A text representation of a software or hardware platform.

<a id="propertyvulnerable-boolean"></a>
## Property vulnerable ∷ Boolean

* This entry is required



<a id="propertyversionendexcluding-string"></a>
## Property versionEndExcluding ∷ String

A string representing the upper bound(exclusive) of version in the CPE.

* This entry is optional


  * A string representing a bound of a version in the CPE.

<a id="propertyversionendincluding-string"></a>
## Property versionEndIncluding ∷ String

A string representing the upper bound(inclusive) of version in the CPE.

* This entry is optional


  * A string representing a bound of a version in the CPE.

<a id="propertyversionstartexcluding-string"></a>
## Property versionStartExcluding ∷ String

A string representing the lower bound(exclusive) of version in the CPE.

* This entry is optional


  * A string representing a bound of a version in the CPE.

<a id="propertyversionstartincluding-string"></a>
## Property versionStartIncluding ∷ String

A string representing the lower bound(inclusive) of version in the CPE.

* This entry is optional


  * A string representing a bound of a version in the CPE.


</details>

<a id="map30"></a>
# *VulnerabilityImpact*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[cvss_v2](#propertycvss_v2-cvssv2)|[*CVSSv2*](#map36)| |_Optional_|
|[cvss_v3](#propertycvss_v3-cvssv3)|[*CVSSv3*](#map37)| |_Optional_|


<details>

<a id="propertycvss_v2-cvssv2"></a>
## Property cvss_v2 ∷ *CVSSv2*

* This entry is optional


<a id="map36-ref"></a>
* *CVSSv2* Value
  * Details: [*CVSSv2*](#map36)

<a id="propertycvss_v3-cvssv3"></a>
## Property cvss_v3 ∷ *CVSSv3*

* This entry is optional


<a id="map37-ref"></a>
* *CVSSv3* Value
  * Details: [*CVSSv3*](#map37)


</details>

<a id="map37"></a>
# *CVSSv3*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[base_score](#propertybase_score-number)|Number| |**Required**|
|[base_severity](#propertybase_severity-cvssv3severitystring)|CVSSv3SeverityString| |**Required**|
|[vector_string](#propertyvector_string-string)|String| |**Required**|
|[attack_complexity](#propertyattack_complexity-cvssv3attackcomplexitystring)|CVSSv3AttackComplexityString|describes the conditions beyond the attacker's control that must exist in order to exploit the vulnerability|_Optional_|
|[attack_vector](#propertyattack_vector-cvssv3attackvectorstring)|CVSSv3AttackVectorString|Reflects the context by which vulnerability exploitation is possible|_Optional_|
|[availability_impact](#propertyavailability_impact-cvssv3availabilityimpactstring)|CVSSv3AvailabilityImpactString|measures the impact to the availability of the impacted component resulting from a successfully exploited vulnerability|_Optional_|
|[availability_requirement](#propertyavailability_requirement-cvssv3securityrequirementsstring)|CVSSv3SecurityRequirementsString| |_Optional_|
|[confidentiality_impact](#propertyconfidentiality_impact-cvssv3confidentialityimpactstring)|CVSSv3ConfidentialityImpactString|measures the impact to the confidentiality of the information resources managed by a software component due to a successfully exploited vulnerability|_Optional_|
|[confidentiality_requirement](#propertyconfidentiality_requirement-cvssv3securityrequirementsstring)|CVSSv3SecurityRequirementsString| |_Optional_|
|[environmental_score](#propertyenvironmental_score-number)|Number| |_Optional_|
|[environmental_severity](#propertyenvironmental_severity-cvssv3severitystring)|CVSSv3SeverityString| |_Optional_|
|[exploit_code_maturity](#propertyexploit_code_maturity-cvssv3exploitcodematuritystring)|CVSSv3ExploitCodeMaturityString|measures the likelihood of the vulnerability being attacked|_Optional_|
|[exploitability_score](#propertyexploitability_score-number)|Number| |_Optional_|
|[impact_score](#propertyimpact_score-number)|Number| |_Optional_|
|[integrity_impact](#propertyintegrity_impact-cvssv3integrityimpactstring)|CVSSv3IntegrityImpactString|measures the impact to integrity of a successfully exploited vulnerability|_Optional_|
|[integrity_requirement](#propertyintegrity_requirement-cvssv3securityrequirementsstring)|CVSSv3SecurityRequirementsString| |_Optional_|
|[modified_attack_complexity](#propertymodified_attack_complexity-cvssv3modifiedattackcomplexitystring)|CVSSv3ModifiedAttackComplexityString|modified attack complexity|_Optional_|
|[modified_attack_vector](#propertymodified_attack_vector-cvssv3modifiedattackvectorstring)|CVSSv3ModifiedAttackVectorString|modified attack vector|_Optional_|
|[modified_availability_impact](#propertymodified_availability_impact-cvssv3modifiedavailabilityimpactstring)|CVSSv3ModifiedAvailabilityImpactString|modified availability impact|_Optional_|
|[modified_confidentiality_impact](#propertymodified_confidentiality_impact-cvssv3modifiedconfidentialityimpactstring)|CVSSv3ModifiedConfidentialityImpactString|modified confidentiality impact|_Optional_|
|[modified_integrity_impact](#propertymodified_integrity_impact-cvssv3modifiedintegrityimpactstring)|CVSSv3ModifiedIntegrityImpactString|modified integrity impact|_Optional_|
|[modified_privileges_required](#propertymodified_privileges_required-cvssv3modifiedprivilegesrequiredstring)|CVSSv3ModifiedPrivilegesRequiredString|modified privileges required|_Optional_|
|[modified_scope](#propertymodified_scope-cvssv3modifiedscopestring)|CVSSv3ModifiedScopeString|modified scope|_Optional_|
|[modified_user_interaction](#propertymodified_user_interaction-cvssv3modifieduserinteractionstring)|CVSSv3ModifiedUserInteractionString|modified user interaction|_Optional_|
|[privileges_required](#propertyprivileges_required-cvssv3privilegesrequiredstring)|CVSSv3PrivilegesRequiredString|describes the level of privileges an attacker must possess before successfully exploiting the vulnerability|_Optional_|
|[remediation_level](#propertyremediation_level-cvssv3remediationlevelstring)|CVSSv3RemediationLevelString|Remediation Level of a vulnerability is an important factor for prioritization|_Optional_|
|[report_confidence](#propertyreport_confidence-cvssv3reportconfidencestring)|CVSSv3ReportConfidenceString|measures the degree of confidence in the existence of the vulnerability and the credibility of the known technical details|_Optional_|
|[scope](#propertyscope-cvssv3scopestring)|CVSSv3ScopeString|the ability for a vulnerability in one software component to impact resources beyond its means, or privileges|_Optional_|
|[temporal_score](#propertytemporal_score-number)|Number|Round up(CVSSv3BaseScore × CVSSv3ExploitCodeMaturity × CVSSv3RemediationLevel × CVSSv3ReportConfidence)|_Optional_|
|[temporal_severity](#propertytemporal_severity-cvssv3severitystring)|CVSSv3SeverityString|temporal severity|_Optional_|
|[user_interaction](#propertyuser_interaction-cvssv3userinteractionstring)|CVSSv3UserInteractionString|captures the requirement for a user, other than the attacker, to participate in the successful compromise of the vulnerable component|_Optional_|


<details>

<a id="propertybase_score-number"></a>
## Property base_score ∷ Number

* This entry is required


  * a Score number from 0 to 10

<a id="propertybase_severity-cvssv3severitystring"></a>
## Property base_severity ∷ CVSSv3SeverityString

* This entry is required


  * Allowed Values:
    * critical
    * high
    * low
    * medium
    * none

<a id="propertyvector_string-string"></a>
## Property vector_string ∷ String

* This entry is required


  * a text representation of a set of CVSSv3 metrics. It is commonly used to record or transfer CVSSv3 metric information in a concise form

<a id="propertyattack_complexity-cvssv3attackcomplexitystring"></a>
## Property attack_complexity ∷ CVSSv3AttackComplexityString

describes the conditions beyond the attacker's control that must exist in order to exploit the vulnerability

* This entry is optional


  * *CVSSv3AttackComplexity* describes the conditions beyond the attacker's control that must exist in order to exploit the vulnerability. As described below, such conditions may require the collection of more information about the target, the presence of certain system configuration settings, or computational exceptions. Importantly, the assessment of this metric excludes any requirements for user interaction in order to exploit the vulnerability (such conditions are captured in the User Interaction metric). this metric value is largest for the least complex attacks. The list of possible values are: `low` Specialized access conditions or extenuating circumstances do not exist. An attacker can expect repeatable success against the vulnerable component. `high` A successful attack depends on conditions beyond the attacker's control. That is, a successful attack cannot be accomplished at will, but requires the attacker to invest in some measurable amount of effort in preparation or execution against the vulnerable component before a successful attack can be expected. For example, a successful attack may depend on an attacker overcoming any of the following conditions: - The attacker must conduct target-specific reconnaissance. For example, on target configuration settings, sequence numbers, shared secrets, etc. - The attacker must prepare the target environment to improve exploit reliability. For example, repeated exploitation to win a race condition, or overcoming advanced exploit mitigation techniques. The attacker must inject herself into the logical network path between the target and the resource requested by the victim in order to read and/or modify network communications (e.g. man in the middle attack).
  * Allowed Values:
    * high
    * low
  * Reference: [Attack Complexity](https://www.first.org/cvss/specification-document#2-1-2-Attack-Complexity-AC)


<a id="propertyattack_vector-cvssv3attackvectorstring"></a>
## Property attack_vector ∷ CVSSv3AttackVectorString

Reflects the context by which vulnerability exploitation is possible

* This entry is optional


  * *CVSSv3AttackVector* This metric reflects the context by which vulnerability exploitation is possible. This metric value (and consequently the Base score) will be larger the more remote (logically, and physically) an attacker can be in order to exploit the vulnerable component. The assumption is that the number of potential attackers for a vulnerability that could be exploited from across the Internet is larger than the number of potential attackers that could exploit a vulnerability requiring physical access to a device, and therefore warrants a greater score. The list of possible values is: `network` A vulnerability exploitable with network access means the vulnerable component is bound to the network stack and the attacker's path is through OSI layer 3 (the network layer). Such a vulnerability is often termed `remotely exploitable` and can be thought of as an attack being exploitable one or more network hops away (e.g. across layer 3 boundaries from routers). An example of a network attack is an attacker causing a denial of service (DoS) by sending a specially crafted TCP packet from across the public Internet (e.g. CVE 2004 0230).`adjacent_network` A vulnerability exploitable with adjacent network access means the vulnerable component is bound to the network stack, however the attack is limited to the same shared physical (e.g. Bluetooth, IEEE 802.11) or logical (e.g. local IP subnet) network, and cannot be performed across an OSI layer 3 boundary (e.g. a router). An example of an Adjacent attack would be an ARP (IPv4) or neighbor discovery (IPv6) flood leading to a denial of service on the local LAN segment. See also CVE 2013 6014. `local` A vulnerability exploitable with Local access means that the vulnerable component is not bound to the network stack, and the attacker's path is via read/write/execute capabilities. In some cases, the attacker may be logged in locally in order to exploit the vulnerability, otherwise, she may rely on User Interaction to execute a malicious file. `physical` A vulnerability exploitable with Physical access requires the attacker to physically touch or manipulate the vulnerable component. Physical interaction may be brief (e.g. evil maid attack) or persistent. An example of such an attack is a cold boot attack which allows an attacker to access to disk encryption keys after gaining physical access to the system, or peripheral attacks such as Firewire/USB Direct Memory Access attacks.
  * Allowed Values:
    * adjacent_network
    * local
    * network
    * physical
  * Reference: [Attack Vector](https://www.first.org/cvss/specification-document#2-1-1-Attack-Vector-AV)


<a id="propertyavailability_impact-cvssv3availabilityimpactstring"></a>
## Property availability_impact ∷ CVSSv3AvailabilityImpactString

measures the impact to the availability of the impacted component resulting from a successfully exploited vulnerability

* This entry is optional


  * *CVSSv3AvailabilityImpact* This metric measures the impact to the availability of the impacted component resulting from a successfully exploited vulnerability. While the Confidentiality and Integrity impact metrics apply to the loss of confidentiality or integrity of data (e.g., information, files) used by the impacted component, this metric refers to the loss of availability of the impacted component itself, such as a networked service (e.g., web, database, email). Since availability refers to the accessibility of information resources, attacks that consume network bandwidth, processor cycles, or disk space all impact the availability of an impacted component. The list of possible values is presented is: `high`: There is total loss of availability, resulting in the attacker being able to fully deny access to resources in the impacted component; this loss is either sustained (while the attacker continues to deliver the attack) or persistent (the condition persists even after the attack has completed). Alternatively, the attacker has the ability to deny some availability, but the loss of availability presents a direct, serious consequence to the impacted component (e.g., the attacker cannot disrupt existing connections, but can prevent new connections; the attacker can repeatedly exploit a vulnerability that, in each instance of a successful attack, leaks a only small amount of memory, but after repeated exploitation causes a service to become completely unavailable). `low`: There is reduced performance or interruptions in resource availability. Even if repeated exploitation of the vulnerability is possible, the attacker does not have the ability to completely deny service to legitimate users. The resources in the impacted component are either partially available all of the time, or fully available only some of the time but overall there is no direct, serious consequence to the impacted component. `none`: There is no impact to availability within the impacted component. This metric value increases with the consequence to the impacted component.
  * Allowed Values:
    * high
    * low
    * none
  * Reference: [Availability Impact] (https://www.first.org/cvss/specification-document#2-3-3-Availability-Impact-A)


<a id="propertyavailability_requirement-cvssv3securityrequirementsstring"></a>
## Property availability_requirement ∷ CVSSv3SecurityRequirementsString

* This entry is optional


  * *CVSSv3SecurityRequirements* These metrics enable the analyst to customize the CVSS score depending on the importance of the affected IT asset to a user's organization, measured in terms of Confidentiality, Integrity, and Availability. That is, if an IT asset supports a business function for which Availability is most important, the analyst can assign a greater value to Availability relative to Confidentiality and Integrity. Each security requirement has three possible values: Low, Medium, or High. The full effect on the environmental score is determined by the corresponding Modified Base Impact metrics. That is, these metrics modify the environmental score by reweighting the Modified Confidentiality, Integrity, and Availability impact metrics. For example, the Modified Confidentialityimpact (MC) metric has increased weight if the Confidentiality Requirement (CR) is High. Likewise, the Modified Confidentiality impact metric has decreased weight if the Confidentiality Requirement is Low. The Modified Confidentiality impact metric weighting is neutral if the Confidentiality Requirement is Medium. This same process is applied to the Integrity and Availability requirements.Note that the Confidentiality Requirement will not affect the Environmental score if the (Modified Base) confidentiality impact is set to None. Also, increasing the Confidentiality Requirement from Medium to Highwill not change the Environmental score when the (Modified Base) impact metrics are set to High. This is because the modified impact sub score (part of the Modified Base score that calculates impact) is already at a maximum value of 10. The list of possible values is: `not_defined`: Assigning this value to the metric will not influence the score. It is a signal to the equation to skip this metric. `high`: Loss of [Confidentiality / Integrity / Availability] is likely to have a catastrophic adverse effect on the organization or individuals associated with the organization (e.g., employees, customers). `medium`: Loss of [Confidentiality / Integrity / Availability] is likely to have a serious adverse effect on the organization or individuals associated with the organization (e.g., employees, customers).`low`: Loss of [Confidentiality / Integrity / Availability] is likely to have only a limited adverse effect on the organization or individuals associated with the organization (e.g., employees, customers). For brevity, the same table is used for all three metrics. The greater the Security Requirement, the higher the score (recall that Medium is considered the default).
  * Allowed Values:
    * high
    * low
    * none
    * not_defined
  * Reference: [Security Requirements] (https://www.first.org/cvss/specification-document#4-1-Security-Requirements-CR-IR-AR)


<a id="propertyconfidentiality_impact-cvssv3confidentialityimpactstring"></a>
## Property confidentiality_impact ∷ CVSSv3ConfidentialityImpactString

measures the impact to the confidentiality of the information resources managed by a software component due to a successfully exploited vulnerability

* This entry is optional


  * *CVSSv3ConfidentialityImpact* measures the impact to the confidentiality of the information resources managed by a software component due to a successfully exploited vulnerability. Confidentiality refers to limiting information access and disclosure to only authorized users, as well as preventing access by, or disclosure to, unauthorized ones. The list of possible values  is: `high`: There is total loss of confidentiality, resulting in all resources within the impacted component being divulged to the attacker. Alternatively, access to only some restricted information is obtained, but the disclosed information presents a direct, serious impact. For example, an attacker steals the administrator's password, or private encryption keys of a web server. `low`: There is some loss of confidentiality. Access to some restricted information is obtained, but the attacker does not have control over what information is obtained, or the amount or kind of loss is constrained. The information disclosure does not cause a direct, serious loss to the impacted component. `none`: There is no loss of confidentiality within the impacted component. This metric value increases with the degree of loss to the impacted component.
  * Allowed Values:
    * high
    * low
    * none
  * Reference: [Confientiality Impact] (https://www.first.org/cvss/specification-document#2-3-1-Confidentiality-Impact-C)


<a id="propertyconfidentiality_requirement-cvssv3securityrequirementsstring"></a>
## Property confidentiality_requirement ∷ CVSSv3SecurityRequirementsString

* This entry is optional


  * *CVSSv3SecurityRequirements* These metrics enable the analyst to customize the CVSS score depending on the importance of the affected IT asset to a user's organization, measured in terms of Confidentiality, Integrity, and Availability. That is, if an IT asset supports a business function for which Availability is most important, the analyst can assign a greater value to Availability relative to Confidentiality and Integrity. Each security requirement has three possible values: Low, Medium, or High. The full effect on the environmental score is determined by the corresponding Modified Base Impact metrics. That is, these metrics modify the environmental score by reweighting the Modified Confidentiality, Integrity, and Availability impact metrics. For example, the Modified Confidentialityimpact (MC) metric has increased weight if the Confidentiality Requirement (CR) is High. Likewise, the Modified Confidentiality impact metric has decreased weight if the Confidentiality Requirement is Low. The Modified Confidentiality impact metric weighting is neutral if the Confidentiality Requirement is Medium. This same process is applied to the Integrity and Availability requirements.Note that the Confidentiality Requirement will not affect the Environmental score if the (Modified Base) confidentiality impact is set to None. Also, increasing the Confidentiality Requirement from Medium to Highwill not change the Environmental score when the (Modified Base) impact metrics are set to High. This is because the modified impact sub score (part of the Modified Base score that calculates impact) is already at a maximum value of 10. The list of possible values is: `not_defined`: Assigning this value to the metric will not influence the score. It is a signal to the equation to skip this metric. `high`: Loss of [Confidentiality / Integrity / Availability] is likely to have a catastrophic adverse effect on the organization or individuals associated with the organization (e.g., employees, customers). `medium`: Loss of [Confidentiality / Integrity / Availability] is likely to have a serious adverse effect on the organization or individuals associated with the organization (e.g., employees, customers).`low`: Loss of [Confidentiality / Integrity / Availability] is likely to have only a limited adverse effect on the organization or individuals associated with the organization (e.g., employees, customers). For brevity, the same table is used for all three metrics. The greater the Security Requirement, the higher the score (recall that Medium is considered the default).
  * Allowed Values:
    * high
    * low
    * none
    * not_defined
  * Reference: [Security Requirements] (https://www.first.org/cvss/specification-document#4-1-Security-Requirements-CR-IR-AR)


<a id="propertyenvironmental_score-number"></a>
## Property environmental_score ∷ Number

* This entry is optional


  * a Score number from 0 to 10

<a id="propertyenvironmental_severity-cvssv3severitystring"></a>
## Property environmental_severity ∷ CVSSv3SeverityString

* This entry is optional


  * Allowed Values:
    * critical
    * high
    * low
    * medium
    * none

<a id="propertyexploit_code_maturity-cvssv3exploitcodematuritystring"></a>
## Property exploit_code_maturity ∷ CVSSv3ExploitCodeMaturityString

measures the likelihood of the vulnerability being attacked

* This entry is optional


  * *CVSSv3ExploitCodeMaturity* This metric measures the likelihood of the vulnerability being attacked, and is typically based on the current state of exploit techniques, exploit code availability, or active, 'in-the-wild' exploitation. Public availability of easy-to-use exploit code increases the number of potential attackers by including those who are unskilled, thereby increasing the severity of the vulnerability. Initially, real-world exploitation may only be theoretical. Publication of proof-of-concept code, functional exploit code, or sufficient technical details necessary to exploit the vulnerability may follow. Furthermore, the exploit code available may progress from a proof-of-concept demonstration to exploit code that is successful in exploiting the vulnerability consistently. In severe cases, it may be delivered as the payload of a network-based worm or virus or other automated attack tools. The list of possible values is: `not_defined`: Assigning this value to the metric will not influence the score. It is a signal to a scoring equation to skip this metric. `high`: Functional autonomous code exists, or no exploit is required (manual trigger) and details are widely available. Exploit code works in every situation, or is actively being delivered via an autonomous agent (such as a worm or virus). Network-connected systems are likely to encounter scanning or exploitation attempts. Exploit development has reached the level of reliable, widely-available, easy-to-use automated tools. `functional`: Functional exploit code is available. The code works in most situations where the vulnerability exists. `proof_of_concept`: Proof-of-concept exploit code is available, or an attack demonstration is not practical for most systems. The code or technique is not functional in all situations and may require substantial modification by a skilled attacker. `unproven`: No exploit code is available, or an exploit is theoretical.
  * Allowed Values:
    * functional
    * high
    * not_defined
    * proof_of_concept
    * unproven
  * Reference: [Exploit Code Maturity] (https://www.first.org/cvss/specification-document#3-1-Exploit-Code-Maturity-E)


<a id="propertyexploitability_score-number"></a>
## Property exploitability_score ∷ Number

* This entry is optional


  * a Score number from 0 to 10

<a id="propertyimpact_score-number"></a>
## Property impact_score ∷ Number

* This entry is optional


  * a Score number from 0 to 10

<a id="propertyintegrity_impact-cvssv3integrityimpactstring"></a>
## Property integrity_impact ∷ CVSSv3IntegrityImpactString

measures the impact to integrity of a successfully exploited vulnerability

* This entry is optional


  * *CVSSv3IntegrityImpact* This metric measures the impact to integrity of a successfully exploited vulnerability. Integrity refers to the trustworthiness and veracity of information. The list of possible values  is: `high`: There is a total loss of integrity, or a complete loss of protection. For example, the attacker is able to modify any/all files protected by the impacted component. Alternatively, only some files can be modified, but malicious modification would present a direct, serious consequence to the impacted component. `low`: Modification of data is possible, but the attacker does not have control over the consequence of a modification, or the amount of modification is constrained. The data modification does not have a direct, serious impact on the impacted component.`none`: There is no loss of integrity within the impacted component.this metric value increases with the consequence to the impacted component. 
  * Allowed Values:
    * high
    * low
    * none
  * Reference: [Integrity Impact] (https://www.first.org/cvss/specification-document#2-3-2-Integrity-Impact-I)


<a id="propertyintegrity_requirement-cvssv3securityrequirementsstring"></a>
## Property integrity_requirement ∷ CVSSv3SecurityRequirementsString

* This entry is optional


  * *CVSSv3SecurityRequirements* These metrics enable the analyst to customize the CVSS score depending on the importance of the affected IT asset to a user's organization, measured in terms of Confidentiality, Integrity, and Availability. That is, if an IT asset supports a business function for which Availability is most important, the analyst can assign a greater value to Availability relative to Confidentiality and Integrity. Each security requirement has three possible values: Low, Medium, or High. The full effect on the environmental score is determined by the corresponding Modified Base Impact metrics. That is, these metrics modify the environmental score by reweighting the Modified Confidentiality, Integrity, and Availability impact metrics. For example, the Modified Confidentialityimpact (MC) metric has increased weight if the Confidentiality Requirement (CR) is High. Likewise, the Modified Confidentiality impact metric has decreased weight if the Confidentiality Requirement is Low. The Modified Confidentiality impact metric weighting is neutral if the Confidentiality Requirement is Medium. This same process is applied to the Integrity and Availability requirements.Note that the Confidentiality Requirement will not affect the Environmental score if the (Modified Base) confidentiality impact is set to None. Also, increasing the Confidentiality Requirement from Medium to Highwill not change the Environmental score when the (Modified Base) impact metrics are set to High. This is because the modified impact sub score (part of the Modified Base score that calculates impact) is already at a maximum value of 10. The list of possible values is: `not_defined`: Assigning this value to the metric will not influence the score. It is a signal to the equation to skip this metric. `high`: Loss of [Confidentiality / Integrity / Availability] is likely to have a catastrophic adverse effect on the organization or individuals associated with the organization (e.g., employees, customers). `medium`: Loss of [Confidentiality / Integrity / Availability] is likely to have a serious adverse effect on the organization or individuals associated with the organization (e.g., employees, customers).`low`: Loss of [Confidentiality / Integrity / Availability] is likely to have only a limited adverse effect on the organization or individuals associated with the organization (e.g., employees, customers). For brevity, the same table is used for all three metrics. The greater the Security Requirement, the higher the score (recall that Medium is considered the default).
  * Allowed Values:
    * high
    * low
    * none
    * not_defined
  * Reference: [Security Requirements] (https://www.first.org/cvss/specification-document#4-1-Security-Requirements-CR-IR-AR)


<a id="propertymodified_attack_complexity-cvssv3modifiedattackcomplexitystring"></a>
## Property modified_attack_complexity ∷ CVSSv3ModifiedAttackComplexityString

modified attack complexity

* This entry is optional


  * *CVSSv3ModifiedAttackComplexity* The same values as Attack Complexity, as well as not_defined (the default)
  * Default: not_defined
  * Allowed Values:
    * high
    * low
    * not_defined
  * Reference: [Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="propertymodified_attack_vector-cvssv3modifiedattackvectorstring"></a>
## Property modified_attack_vector ∷ CVSSv3ModifiedAttackVectorString

modified attack vector

* This entry is optional


  * *CVSSv3ModifiedAttackVector* The same values as Attack Vector, as well as not_defined (the default)
  * Default: not_defined
  * Allowed Values:
    * adjacent_network
    * local
    * network
    * not_defined
    * physical
  * Reference: [Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="propertymodified_availability_impact-cvssv3modifiedavailabilityimpactstring"></a>
## Property modified_availability_impact ∷ CVSSv3ModifiedAvailabilityImpactString

modified availability impact

* This entry is optional


  * *CVSSv3ModifiedAvailabilityImpact* The same values as Availability Impact, as well as not_defined (the default)
  * Default: not_defined
  * Allowed Values:
    * high
    * low
    * none
    * not_defined
  * Reference: [Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="propertymodified_confidentiality_impact-cvssv3modifiedconfidentialityimpactstring"></a>
## Property modified_confidentiality_impact ∷ CVSSv3ModifiedConfidentialityImpactString

modified confidentiality impact

* This entry is optional


  * *CVSSv3ModifiedConfidentialityImpact* The same values as Confidentiality Impact, as well as not_defined (the default)
  * Default: not_defined
  * Allowed Values:
    * high
    * low
    * none
    * not_defined
  * Reference: [Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="propertymodified_integrity_impact-cvssv3modifiedintegrityimpactstring"></a>
## Property modified_integrity_impact ∷ CVSSv3ModifiedIntegrityImpactString

modified integrity impact

* This entry is optional


  * *CVSSv3ModifiedIntegrityImpact* The same values as Integrity Impact, as well as not_defined (the default)
  * Default: not_defined
  * Allowed Values:
    * high
    * low
    * none
    * not_defined
  * Reference: [Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="propertymodified_privileges_required-cvssv3modifiedprivilegesrequiredstring"></a>
## Property modified_privileges_required ∷ CVSSv3ModifiedPrivilegesRequiredString

modified privileges required

* This entry is optional


  * *CVSSv3ModifiedPrivilegesRequired* The same values as Privileges Required, as well as not_defined (the default)
  * Default: not_defined
  * Allowed Values:
    * high
    * low
    * none
    * not_defined
  * Reference: [Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="propertymodified_scope-cvssv3modifiedscopestring"></a>
## Property modified_scope ∷ CVSSv3ModifiedScopeString

modified scope

* This entry is optional


  * *CVSSv3ModifiedScope* The same values as Scope, as well as not_defined (the default)
  * Default: not_defined
  * Allowed Values:
    * changed
    * not_defined
    * unchanged
  * Reference: [Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="propertymodified_user_interaction-cvssv3modifieduserinteractionstring"></a>
## Property modified_user_interaction ∷ CVSSv3ModifiedUserInteractionString

modified user interaction

* This entry is optional


  * *CVSSv3ModifiedUserInteraction* The same values as User Interaction, as well as not_defined (the default)
  * Allowed Values:
    * none
    * not_defined
    * required
  * Reference: [Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="propertyprivileges_required-cvssv3privilegesrequiredstring"></a>
## Property privileges_required ∷ CVSSv3PrivilegesRequiredString

describes the level of privileges an attacker must possess before successfully exploiting the vulnerability

* This entry is optional


  * *CVSSv3PrivilegesRequired* This metric describes the level of privileges an attacker must possess before successfully exploiting the vulnerability. This metric is greatest if no privileges are required. The list of possible values is: `none`: The attacker is unauthorized prior to attack, and therefore does not require any access to settings or files to carry out an attack. `low`: The attacker is authorized with (i.e. requires) privileges that provide basic user capabilities that could normally affect only settings and files owned by a user. Alternatively, an attacker with Low privileges may have the ability to cause an impact only to non-sensitive resources. `high`: The attacker is authorized with (i.e. requires) privileges that provide significant (e.g. administrative) control over the vulnerable component that could affect component-wide settings and files.
  * Allowed Values:
    * high
    * low
    * none
  * Reference: [Privileges Required] (https://www.first.org/cvss/specification-document#2-1-3-Privileges-Required-PR)


<a id="propertyremediation_level-cvssv3remediationlevelstring"></a>
## Property remediation_level ∷ CVSSv3RemediationLevelString

Remediation Level of a vulnerability is an important factor for prioritization

* This entry is optional


  * *CVSSv3RemediationLevel* The Remediation Level of a vulnerability is an important factor for prioritization. The typical vulnerability is unpatched when initially published. Workarounds or hotfixes may offer interim remediation until an official patch or upgrade is issued. Each of these respective stages adjusts the temporal score downwards, reflecting the decreasing urgency as remediation becomes final. The list of possible values is: `not_defined`: Assigning this value to the metric will not influence the score. It is a signal to a scoring equation to skip this metric. `unavailable`: There is either no solution available or it is impossible to apply. `workaround`: There is an unofficial, non-vendor solution available. In some cases, users of the affected technology will create a patch of their own or provide steps to work around or otherwise mitigate the vulnerability. `temporary_fix`: There is an official but temporary fix available. This includes instances where the vendor issues a temporary hotfix, tool, or workaround.`official_fix`: A complete vendor solution is available. Either the vendor has issued an official patch, or an upgrade is available. The less official and permanent a fix, the higher the vulnerability score. 
  * Allowed Values:
    * high
    * not_defined
    * offical_fix
    * temporary_fix
    * unavailable
    * workaround
  * Reference: [Remediation Level] (https://www.first.org/cvss/specification-document#3-2-Remediation-Level-RL)


<a id="propertyreport_confidence-cvssv3reportconfidencestring"></a>
## Property report_confidence ∷ CVSSv3ReportConfidenceString

measures the degree of confidence in the existence of the vulnerability and the credibility of the known technical details

* This entry is optional


  * *CVSSv3ReportConfidence* measures the degree of confidence in the existence of the vulnerability and the credibility of the known technical details. Sometimes only the existence of vulnerabilities are publicized, but without specific details. For example, an impact may be recognized as undesirable, but the root cause may not be known. The vulnerability may later be corroborated by research which suggests where the vulnerability may lie, though the research may not be certain. Finally, a vulnerability may be confirmed through acknowledgement by the author or vendor of the affected technology. The urgency of a vulnerability is higher when a vulnerability is known to exist with certainty. This metric also suggests the level of technical knowledge available to would-be attackers. The list of possible values  is: `not_defined`: Assigning this value to the metric will not influence the score. It is a signal to a scoring equation to skip this metric. `confirmed`: Detailed reports exist, or functional reproduction is possible (functional exploits may provide this). Source code is available to independently verify theassertions of the research, or the author or vendor of the affected code has confirmed the presence of the vulnerability. `reasonable`: Significant details are published, but researchers either do not have full confidence in the root cause, or do not have access to source code to fully confirm all of the interactions that may lead to the result. Reasonable confidence exists, however, that the bug is reproducible and at least one impact is able to be verified (proof-of-concept exploits may provide this). An example is a detailed write-up of research into a vulnerability with an explanation (possibly obfuscated or 'left as an exercise to the reader') that gives assurances on how to reproduce the results. `unknown`: There are reports of impacts that indicate a vulnerability is present. The reports indicate that the cause of the vulnerability is unknown, or reports may differ on the cause or impacts of the vulnerability. Reporters are uncertain of the true nature of the vulnerability, and there is little confidence in the validity of the reports or whether a static Base score can be applied given the differences described. An example is a bug report which notes that an intermittent but non-reproducible crash occurs, with evidence of memory corruption suggesting that denial of service, or possible more serious impacts, may result. The more a vulnerability is validated by the vendor or other reputable sources, the higher the score.
  * Allowed Values:
    * confirmed
    * reasonable
    * unknown
  * Reference: [Report Confidence] (https://www.first.org/cvss/specification-document#3-3-Report-Confidence-RC)


<a id="propertyscope-cvssv3scopestring"></a>
## Property scope ∷ CVSSv3ScopeString

the ability for a vulnerability in one software component to impact resources beyond its means, or privileges

* This entry is optional


  * *CVSSv3Scope* An important property captured by CVSS v3.0 is the ability for a vulnerability in one software component to impact resources beyond its means, or privileges. This consequence is represented by the metric Authorization Scope, or simply Scope. Formally, Scope refers to the collection of privileges defined by a computing authority (e.g. an application, an operating system, or a sandbox environment) when granting access to computing resources (e.g. files, CPU, memory, etc). These privileges are assigned based on some method of identification and authorization. In some cases, the authorization may be simple or loosely controlled based upon predefined rules or standards. For example, in the case of Ethernet traffic sent to a network switch, the switch accepts traffic that arrives on its ports and is an authority that controls the traffic flow to other switch ports. When the vulnerability of a software component governed by one authorization scope is able to affect resources governed by another authorization scope, a Scope change has occurred. Intuitively, one may think of a scope change as breaking out of a sandbox, and an example would be a vulnerability in a virtual machine that enables an attacker to delete files on the host OS (perhaps even its own VM). In this example, there are two separate authorization authorities: one that defines and enforces privileges for the virtual machine and its users, and one that defines and enforces privileges for the host system within which the virtual machine runs. a scope change would not occur, for example, with a vulnerability in Microsoft Word that allows an attacker to compromise all system files of the host OS, because the same authority enforces privileges of the user's instance of Word, and the host's system files. The Base score is greater when a scope change has occurred. The list of possible values is: `unchanged`: An exploited vulnerability can only affect resources managed by the same authority. In this case the vulnerable component and the impacted component are the same. `changed`: An exploited vulnerability can affect resources beyond the authorization privileges intended by the vulnerable component. In this case the vulnerable component and the impacted component are different.
  * Allowed Values:
    * changed
    * unchanged
  * Reference: [Scope] (https://www.first.org/cvss/specification-document#2-2-Scope-S)


<a id="propertytemporal_score-number"></a>
## Property temporal_score ∷ Number

Round up(CVSSv3BaseScore × CVSSv3ExploitCodeMaturity × CVSSv3RemediationLevel × CVSSv3ReportConfidence)

* This entry is optional


  * a Score number from 0 to 10

<a id="propertytemporal_severity-cvssv3severitystring"></a>
## Property temporal_severity ∷ CVSSv3SeverityString

temporal severity

* This entry is optional


  * Allowed Values:
    * critical
    * high
    * low
    * medium
    * none

<a id="propertyuser_interaction-cvssv3userinteractionstring"></a>
## Property user_interaction ∷ CVSSv3UserInteractionString

captures the requirement for a user, other than the attacker, to participate in the successful compromise of the vulnerable component

* This entry is optional


  * *CVSSv3UserInteraction* captures the requirement for a user, other than the attacker, to participate in the successful compromise of the vulnerable component. This metric determines whether the vulnerability can be exploited solely at the will of the attacker, or whether a separate user (or user-initiated process) must participate in some manner. This metric value is greatest when no user interaction is required. The list of possible values is: `none`: The vulnerable system can be exploited without interaction from any user. `required`: Successful exploitation of this vulnerability requires a user to take some action before the vulnerability can be exploited. For example, a successful exploit may only be possible during the installation of an application by a system administrator.
  * Allowed Values:
    * none
    * required
  * Reference: [User Interaction] (https://www.first.org/cvss/specification-document#2-1-4-User-Interaction-UI)



</details>

<a id="map36"></a>
# *CVSSv2*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[base_score](#propertybase_score-number)|Number| |**Required**|
|[base_severity](#propertybase_severity-highmedlowstring)|HighMedLowString| |**Required**|
|[vector_string](#propertyvector_string-string)|String| |**Required**|
|[access_complexity](#propertyaccess_complexity-cvssv2accesscomplexitystring)|CVSSv2AccessComplexityString| |_Optional_|
|[access_vector](#propertyaccess_vector-cvssv2accessvectorstring)|CVSSv2AccessVectorString| |_Optional_|
|[authentication](#propertyauthentication-cvssv2authenticationstring)|CVSSv2AuthenticationString| |_Optional_|
|[availability_impact](#propertyavailability_impact-cvssv2availabilityimpactstring)|CVSSv2AvailabilityImpactString| |_Optional_|
|[availability_requirement](#propertyavailability_requirement-cvssv2securityrequirementstring)|CVSSv2SecurityRequirementString| |_Optional_|
|[collateral_damage_potential](#propertycollateral_damage_potential-cvssv2collateraldamagepotentialstring)|CVSSv2CollateralDamagePotentialString| |_Optional_|
|[confidentiality_impact](#propertyconfidentiality_impact-cvssv2confidentialityimpactstring)|CVSSv2ConfidentialityImpactString| |_Optional_|
|[confidentiality_requirement](#propertyconfidentiality_requirement-cvssv2securityrequirementstring)|CVSSv2SecurityRequirementString| |_Optional_|
|[environmental_vector_string](#propertyenvironmental_vector_string-string)|String| |_Optional_|
|[exploitability](#propertyexploitability-cvssv2exploitabilitystring)|CVSSv2ExploitabilityString| |_Optional_|
|[exploitability_score](#propertyexploitability_score-number)|Number| |_Optional_|
|[impact_score](#propertyimpact_score-number)|Number| |_Optional_|
|[integrity_impact](#propertyintegrity_impact-cvssv2integrityimpactstring)|CVSSv2IntegrityImpactString| |_Optional_|
|[integrity_requirement](#propertyintegrity_requirement-cvssv2securityrequirementstring)|CVSSv2SecurityRequirementString| |_Optional_|
|[obtain_all_privilege](#propertyobtain_all_privilege-boolean)|Boolean| |_Optional_|
|[obtain_other_privilege](#propertyobtain_other_privilege-boolean)|Boolean| |_Optional_|
|[obtain_user_privilege](#propertyobtain_user_privilege-boolean)|Boolean| |_Optional_|
|[remediation_level](#propertyremediation_level-cvssv2remediationlevelstring)|CVSSv2RemediationLevelString| |_Optional_|
|[report_confidence](#propertyreport_confidence-cvssv2reportconfidencestring)|CVSSv2ReportConfidenceString| |_Optional_|
|[target_distribution](#propertytarget_distribution-cvssv2targetdistributionstring)|CVSSv2TargetDistributionString| |_Optional_|
|[temporal_vector_string](#propertytemporal_vector_string-string)|String| |_Optional_|
|[user_interaction_required](#propertyuser_interaction_required-boolean)|Boolean| |_Optional_|


<details>

<a id="propertybase_score-number"></a>
## Property base_score ∷ Number

* This entry is required


  * a Score number from 0 to 10

<a id="propertybase_severity-highmedlowstring"></a>
## Property base_severity ∷ HighMedLowString

* This entry is required


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertyvector_string-string"></a>
## Property vector_string ∷ String

* This entry is required


  * a text representation of a set of CVSSv2 metrics. It is commonly used to record or transfer CVSSv2 metric information in a concise form

<a id="propertyaccess_complexity-cvssv2accesscomplexitystring"></a>
## Property access_complexity ∷ CVSSv2AccessComplexityString

* This entry is optional


  * *CVSSv2AccessComplexity* This metric measures the complexity of the attack required to exploit the vulnerability once an attacker has gained access to the target system. For example, consider a buffer overflow in an Internet service: once the target system is located, the attacker can launch an exploit at will.
  * Default: low
  * Allowed Values:
    * high
    * low
    * medium
  * Reference: https://www.first.org/cvss/v2/guide#2-1-2-Access-Complexity-AC


<a id="propertyaccess_vector-cvssv2accessvectorstring"></a>
## Property access_vector ∷ CVSSv2AccessVectorString

* This entry is optional


  * *CVSSv2AccessVector* This metric reflects how the vulnerability is exploited.The more remote an attacker can be to attack a host, the greater the vulnerability score.
  * Default: network
  * Allowed Values:
    * adjacent network
    * local
    * network
  * Reference: https://www.first.org/cvss/v2/guide#2-1-1-Access-Vector-AV


<a id="propertyauthentication-cvssv2authenticationstring"></a>
## Property authentication ∷ CVSSv2AuthenticationString

* This entry is optional


  * *CVSSv2Authentication* This metric measures the number of times an attacker must authenticate to a target in order to exploit a vulnerability. This metric does not gauge the strength or complexity of the authentication process, only that an attacker is required to provide credentials before an exploit may occur. The fewer authentication instances that are required, the higher the vulnerability score.
  * Default: none
  * Allowed Values:
    * multiple
    * none
    * single
  * Reference: https://www.first.org/cvss/v2/guide#2-1-3-Authentication-Au


<a id="propertyavailability_impact-cvssv2availabilityimpactstring"></a>
## Property availability_impact ∷ CVSSv2AvailabilityImpactString

* This entry is optional


  * *CVSSv2AvailabilityImpact* This metric measures the impact to availability of a successfully exploited vulnerability. Availability refers to the accessibility of information resources. Attacks that consume network bandwidth, processor cycles, or disk space all impact the availability of a system. Increased availability impact increases the vulnerability score.
  * Default: complete
  * Allowed Values:
    * complete
    * none
    * partial
  * Reference: https://www.first.org/cvss/v2/guide#2-1-6-Availability-Impact-A


<a id="propertyavailability_requirement-cvssv2securityrequirementstring"></a>
## Property availability_requirement ∷ CVSSv2SecurityRequirementString

* This entry is optional


  * *CVSSv2SecurityRequirement* These metrics enable the analyst to customize the CVSS score depending on the importance of the affected IT asset to a users organization, measured in terms of confidentiality, integrity, and availability, That is, if an IT asset supports a business function for which availability is most important, the analyst can assign a greater value to availability, relative to confidentiality and integrity. Each security requirement has three possible values: low, medium, or high.
  * Default: not_defined
  * Allowed Values:
    * high
    * low
    * medium
    * not_defined
  * Reference: https://www.first.org/cvss/v2/guide#2-3-3-Security-Requirements-CR-IR-AR


<a id="propertycollateral_damage_potential-cvssv2collateraldamagepotentialstring"></a>
## Property collateral_damage_potential ∷ CVSSv2CollateralDamagePotentialString

* This entry is optional


  * *CVSSv2CollateralDamagePotential* This metric measures the potential for loss of life or physical assets through damage or theft of property or equipment.  The metric may also measure economic loss of productivity or revenue. Naturally, the greater the damage potential, the higher the vulnerability score.
  * Default: not_defined
  * Allowed Values:
    * high
    * low
    * low_medium
    * medium_high
    * none
    * not_defined
  * Reference: https://www.first.org/cvss/v2/guide#2-3-1-Collateral-Damage-Potential-CDP


<a id="propertyconfidentiality_impact-cvssv2confidentialityimpactstring"></a>
## Property confidentiality_impact ∷ CVSSv2ConfidentialityImpactString

* This entry is optional


  * *CVSSv2ConfidentialityImpact* This metric measures the impact on confidentiality of a successfully exploited vulnerability. Confidentiality refers to limiting information access and disclosure to only authorized users, as well as preventing access by, or disclosure to, unauthorized ones. Increasedconfidentiality impact increases the vulnerability score.
  * Default: complete
  * Allowed Values:
    * complete
    * none
    * partial
  * Reference: https://www.first.org/cvss/v2/guide#2-1-4-Confidentiality-Impact-C


<a id="propertyconfidentiality_requirement-cvssv2securityrequirementstring"></a>
## Property confidentiality_requirement ∷ CVSSv2SecurityRequirementString

* This entry is optional


  * *CVSSv2SecurityRequirement* These metrics enable the analyst to customize the CVSS score depending on the importance of the affected IT asset to a users organization, measured in terms of confidentiality, integrity, and availability, That is, if an IT asset supports a business function for which availability is most important, the analyst can assign a greater value to availability, relative to confidentiality and integrity. Each security requirement has three possible values: low, medium, or high.
  * Default: not_defined
  * Allowed Values:
    * high
    * low
    * medium
    * not_defined
  * Reference: https://www.first.org/cvss/v2/guide#2-3-3-Security-Requirements-CR-IR-AR


<a id="propertyenvironmental_vector_string-string"></a>
## Property environmental_vector_string ∷ String

* This entry is optional


  * A text representation of a set of CVSSv2 environmental metrics. Environmental metrics allow analysists to calculate threat scores in relation to environmental security requirements, collateral damage potential, and target availability. It is commonly used to record or transfer CVSSv2 metric information in a concise form

<a id="propertyexploitability-cvssv2exploitabilitystring"></a>
## Property exploitability ∷ CVSSv2ExploitabilityString

* This entry is optional


  * *CVSSv2Exploitability* This metric measures the current state of exploit techniques or code availability. Public availability of easy-to-use exploit code increases the number of potential attackers by including those who are unskilled thereby increasing the severity of the vulnerability.
  * Default: not_defined
  * Allowed Values:
    * functional
    * high
    * not_defined
    * proof_of_concept
    * unproven
  * Reference: https://www.first.org/cvss/v2/guide#2-2-1-Exploitability-E


<a id="propertyexploitability_score-number"></a>
## Property exploitability_score ∷ Number

* This entry is optional


  * a Score number from 0 to 10

<a id="propertyimpact_score-number"></a>
## Property impact_score ∷ Number

* This entry is optional


  * a Score number from 0 to 10

<a id="propertyintegrity_impact-cvssv2integrityimpactstring"></a>
## Property integrity_impact ∷ CVSSv2IntegrityImpactString

* This entry is optional


  * *CVSSv2IntegrityImpact* This metric measures the impact to integrity of a successfully exploited vulnerability. Integrity refers to the trustworthiness and guaranteed veracity of information. Increased integrity impact increases the vulnerability score.
  * Default: complete
  * Allowed Values:
    * complete
    * none
    * partial
  * Reference: https://www.first.org/cvss/v2/guide#2-1-5-Integrity-Impact-I


<a id="propertyintegrity_requirement-cvssv2securityrequirementstring"></a>
## Property integrity_requirement ∷ CVSSv2SecurityRequirementString

* This entry is optional


  * *CVSSv2SecurityRequirement* These metrics enable the analyst to customize the CVSS score depending on the importance of the affected IT asset to a users organization, measured in terms of confidentiality, integrity, and availability, That is, if an IT asset supports a business function for which availability is most important, the analyst can assign a greater value to availability, relative to confidentiality and integrity. Each security requirement has three possible values: low, medium, or high.
  * Default: not_defined
  * Allowed Values:
    * high
    * low
    * medium
    * not_defined
  * Reference: https://www.first.org/cvss/v2/guide#2-3-3-Security-Requirements-CR-IR-AR


<a id="propertyobtain_all_privilege-boolean"></a>
## Property obtain_all_privilege ∷ Boolean

* This entry is optional



<a id="propertyobtain_other_privilege-boolean"></a>
## Property obtain_other_privilege ∷ Boolean

* This entry is optional



<a id="propertyobtain_user_privilege-boolean"></a>
## Property obtain_user_privilege ∷ Boolean

* This entry is optional



<a id="propertyremediation_level-cvssv2remediationlevelstring"></a>
## Property remediation_level ∷ CVSSv2RemediationLevelString

* This entry is optional


  * *CVSSv2RemediationLevel* The remediation level of a vulnerability is an important factor for prioritization. The typical vulnerability is unpatched when initially published. Workarounds or hotfixes may offer interim remediation until an official patch or upgrade is issued. Each of these respective stages adjusts the temporal score downwards, reflecting the decreasing urgency as remediation becomes final. The less official and permanent a fix, the higher the vulnerability score is.
  * Default: not_defined
  * Allowed Values:
    * not_defined
    * official_fix
    * temporary_fix
    * unavailable
    * workaround
  * Reference: https://www.first.org/cvss/v2/guide#2-2-2-Remediation-Level-RL


<a id="propertyreport_confidence-cvssv2reportconfidencestring"></a>
## Property report_confidence ∷ CVSSv2ReportConfidenceString

* This entry is optional


  * *CVSSv2ReportConfidence* This metric measures the degree of confidence in the existence of the vulnerability and the credibility of the known technical details. Sometimes, only the existence of vulnerabilities are publicized, but without specific details. The vulnerability may later be corroborated and then confirmed through acknowledgement by the author or vendor of the affected technology. The urgency of a vulnerability is higher when a vulnerability is known to exist with certainty. This metric also suggests the level of technical knowledge available to would-be attackers. The more a vulnerability is validated by the vendor or other reputable sources, the higher the score.
  * Default: not_defined
  * Allowed Values:
    * confirmed
    * not_defined
    * unconfirmed
    * uncorroborated
  * Reference: https://www.first.org/cvss/v2/guide#2-2-3-Report-Confidence-RC


<a id="propertytarget_distribution-cvssv2targetdistributionstring"></a>
## Property target_distribution ∷ CVSSv2TargetDistributionString

* This entry is optional


  * *CVSSv2TargetDistribution* This metric measures the proportion of vulnerable systems. It is meant as an environment-specific indicator in order to approximate the percentage of systems that could be affected by the vulnerability. The greater the proportion of vulnerable systems, the higher the score.
  * Default: not_defined
  * Allowed Values:
    * high
    * low
    * medium
    * none
    * not_defined
  * Reference: https://www.first.org/cvss/v2/guide#2-3-2-Target-Distribution-TD


<a id="propertytemporal_vector_string-string"></a>
## Property temporal_vector_string ∷ String

* This entry is optional


  * A text representation of a set of CVSSv2 temporal metrics. Temporal metrics allow analysists to calculate threat severity based on temporal factors such as reliability of vulnerability reports, availability of mitigations, and the ease or difficulty of conducting the exploit. It is commonly used to record or transfer CVSSv2 metric information in a concise form

<a id="propertyuser_interaction_required-boolean"></a>
## Property user_interaction_required ∷ Boolean

* This entry is optional




</details>

<a id="map29"></a>
# *CVE*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[cve_data_meta](#propertycve_data_meta-cvedatameta)|[*CVEDataMeta*](#map38)| |**Required**|


<details>

<a id="propertycve_data_meta-cvedatameta"></a>
## Property cve_data_meta ∷ *CVEDataMeta*

* This entry is required


<a id="map38-ref"></a>
* *CVEDataMeta* Value
  * Details: [*CVEDataMeta*](#map38)


</details>

<a id="map38"></a>
# *CVEDataMeta*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[assigner](#propertyassigner-shortstring)|ShortString| |_Optional_|
|[id](#propertyid-shortstring)|ShortString| |_Optional_|


<details>

<a id="propertyassigner-shortstring"></a>
## Property assigner ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyid-shortstring"></a>
## Property id ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters


</details>

<a id="map28"></a>
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

<a id="map25"></a>
# *Weakness*

> Reference: [WeaknessType](https://cwe.mitre.org/documents/schema/#WeaknessType)

*Weakness* a mistake or condition that, if left unaddressed, could under the proper conditions contribute to a cyber-enabled capability being vulnerable to attack, allowing an adversary to make items function in unintended ways.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|should be short and limited to the key points that define this weakness|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#propertytype-weaknesstypeidentifierstring)|WeaknessTypeIdentifierString|The fixed value weakness|**Required**|
|[abstraction_level](#propertyabstraction_level-weaknessabstractionlevelstring)|WeaknessAbstractionLevelString|defines the abstraction level for this weakness|_Optional_|
|[affected_resources](#propertyaffected_resources-systemresourcestring)|[SystemResourceString]|identify system resources that can be affected by an exploit of this weakness|_Optional_|
|[alternate_terms](#propertyalternate_terms-alternatetermmap45)|[[*AlternateTerm*](#map45)]|indicates one or more other names used to describe this weakness|_Optional_|
|[architectures](#propertyarchitectures-architecturemap42)|[[*Architecture*](#map42)]|Applicable architectures|_Optional_|
|[background_details](#propertybackground_details-markdownstring)|MarkdownString|information that is relevant but not related to the nature of the weakness itself|_Optional_|
|[common_consequences](#propertycommon_consequences-consequencemap47)|[[*Consequence*](#map47)]|specify individual consequences associated with a weakness|_Optional_|
|[detection_methods](#propertydetection_methods-detectionmethodmap48)|[[*DetectionMethod*](#map48)]|identify methods that may be employed to detect this weakness, including their strengths and limitations|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap39)|[[*ExternalReference*](#map39)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[functional_areas](#propertyfunctional_areas-functionalareastring)|[FunctionalAreaString]|identifies the functional area of the software in which the weakness is most likely to occur|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[languages](#propertylanguages-languagemap40)|[[*Language*](#map40)]|Applicable Languages|_Optional_|
|[likelihood](#propertylikelihood-highmedlowstring)|HighMedLowString|Likelihood of exploit|_Optional_|
|[modes_of_introduction](#propertymodes_of_introduction-modeofintroductionmap46)|[[*ModeOfIntroduction*](#map46)]|information about how and when a given weakness may be introduced|_Optional_|
|[notes](#propertynotes-notemap50)|[[*Note*](#map50)]|provide any additional comments about the weakness|_Optional_|
|[operating_systems](#propertyoperating_systems-operatingsystemmap41)|[[*OperatingSystem*](#map41)]|Applicable operating systems|_Optional_|
|[paradigms](#propertyparadigms-paradigmmap43)|[[*Paradigm*](#map43)]|Applicable paradigms|_Optional_|
|[potential_mitigations](#propertypotential_mitigations-mitigationmap49)|[[*Mitigation*](#map49)]|describe potential mitigations associated with a weakness|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[structure](#propertystructure-weaknessstructurestring)|WeaknessStructureString|defines the structural nature of the weakness|_Optional_|
|[technologies](#propertytechnologies-technologymap44)|[[*Technology*](#map44)]|Applicable technologies|_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

should be short and limited to the key points that define this weakness

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

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

<a id="propertytype-weaknesstypeidentifierstring"></a>
## Property type ∷ WeaknessTypeIdentifierString

The fixed value weakness

* This entry is required


  * *WeaknessTypeIdentifier* The fixed value "weakness"
  * Must equal: "weakness"

<a id="propertyabstraction_level-weaknessabstractionlevelstring"></a>
## Property abstraction_level ∷ WeaknessAbstractionLevelString

defines the abstraction level for this weakness

* This entry is optional


  * *WeaknessAbstractionLevel* defines the different abstraction levels that apply to a weakness. A `Class` is the most abstract type of weakness, typically described independent of any specific language or technology. A `Base` is a more specific type of weakness that is still mostly independent of a resource or technology, but with sufficient details to provide specific methods for detection and prevention. A `Variant` is a weakness that is described at a very low level of detail, typically limited to a specific language or technology. A `Compound` weakness is a meaningful aggregation of several weaknesses, currently known as either a Chain or Composite.
  * Allowed Values:
    * Base
    * Class
    * Compound
    * Variant
  * Reference: [AbstractionEnumeration
](https://cwe.mitre.org/documents/schema/#AbstractionEnumeration)


<a id="propertyaffected_resources-systemresourcestring"></a>
## Property affected_resources ∷ [SystemResourceString]

identify system resources that can be affected by an exploit of this weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *SystemResource* defines a resource of a system
  * Allowed Values:
    * CPU
    * File or Directory
    * Memory
    * System Process
  * Reference: [ResourceEnumeration](https://cwe.mitre.org/documents/schema/#ResourceEnumeration)


<a id="propertyalternate_terms-alternatetermmap45"></a>
## Property alternate_terms ∷ [[*AlternateTerm*](#map45)]

indicates one or more other names used to describe this weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map45-ref"></a>
* *AlternateTerm* Value
  * Details: [*AlternateTerm*](#map45)

<a id="propertyarchitectures-architecturemap42"></a>
## Property architectures ∷ [[*Architecture*](#map42)]

Applicable architectures

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map42-ref"></a>
* *Architecture* Value
  * Details: [*Architecture*](#map42)

<a id="propertybackground_details-markdownstring"></a>
## Property background_details ∷ MarkdownString

information that is relevant but not related to the nature of the weakness itself

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertycommon_consequences-consequencemap47"></a>
## Property common_consequences ∷ [[*Consequence*](#map47)]

specify individual consequences associated with a weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map47-ref"></a>
* *Consequence* Value
  * Details: [*Consequence*](#map47)

<a id="propertydetection_methods-detectionmethodmap48"></a>
## Property detection_methods ∷ [[*DetectionMethod*](#map48)]

identify methods that may be employed to detect this weakness, including their strengths and limitations

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map48-ref"></a>
* *DetectionMethod* Value
  * Details: [*DetectionMethod*](#map48)

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap39"></a>
## Property external_references ∷ [[*ExternalReference*](#map39)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map39-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map39)

<a id="propertyfunctional_areas-functionalareastring"></a>
## Property functional_areas ∷ [FunctionalAreaString]

identifies the functional area of the software in which the weakness is most likely to occur

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *FunctionalArea* Defines the different functional areas of software in which the weakness may appear
  * Allowed Values:
    * Authentication
    * Authorization
    * Code Libraries
    * Counters
    * Cryptography
    * Error Handling
    * File Processing
    * Functional-Area-Independent
    * Interprocess Communication
    * Logging
    * Memory Management
    * Networking
    * Number Processing
    * Program Invocation
    * Protection Mechanism
    * Session Management
    * Signals
    * String Processing
  * Reference: [FunctionalAreaEnumeration](https://cwe.mitre.org/documents/schema/#FunctionalAreaEnumeration)


<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylanguages-languagemap40"></a>
## Property languages ∷ [[*Language*](#map40)]

Applicable Languages

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map40-ref"></a>
* *Language* Value
  * Details: [*Language*](#map40)

<a id="propertylikelihood-highmedlowstring"></a>
## Property likelihood ∷ HighMedLowString

Likelihood of exploit

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertymodes_of_introduction-modeofintroductionmap46"></a>
## Property modes_of_introduction ∷ [[*ModeOfIntroduction*](#map46)]

information about how and when a given weakness may be introduced

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map46-ref"></a>
* *ModeOfIntroduction* Value
  * Details: [*ModeOfIntroduction*](#map46)

<a id="propertynotes-notemap50"></a>
## Property notes ∷ [[*Note*](#map50)]

provide any additional comments about the weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map50-ref"></a>
* *Note* Value
  * Details: [*Note*](#map50)

<a id="propertyoperating_systems-operatingsystemmap41"></a>
## Property operating_systems ∷ [[*OperatingSystem*](#map41)]

Applicable operating systems

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map41-ref"></a>
* *OperatingSystem* Value
  * Details: [*OperatingSystem*](#map41)

<a id="propertyparadigms-paradigmmap43"></a>
## Property paradigms ∷ [[*Paradigm*](#map43)]

Applicable paradigms

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map43-ref"></a>
* *Paradigm* Value
  * Details: [*Paradigm*](#map43)

<a id="propertypotential_mitigations-mitigationmap49"></a>
## Property potential_mitigations ∷ [[*Mitigation*](#map49)]

describe potential mitigations associated with a weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map49-ref"></a>
* *Mitigation* Value
  * Details: [*Mitigation*](#map49)

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

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertystructure-weaknessstructurestring"></a>
## Property structure ∷ WeaknessStructureString

defines the structural nature of the weakness

* This entry is optional


  * *WeaknessStructure* structural natures of a weakness. A Simple structure represents a single weakness whose exploitation is not dependent on the presence of another weakness. A Composite is a set of weaknesses that must all be present simultaneously in order to produce an exploitable vulnerability, while a Chain is a set of weaknesses that must be reachable consecutively in order to produce an exploitable vulnerability.
  * Allowed Values:
    * Chain
    * Composite
    * Simple
  * Reference: [StructureEnumeration](https://cwe.mitre.org/documents/schema/#StructureEnumeration))


<a id="propertytechnologies-technologymap44"></a>
## Property technologies ∷ [[*Technology*](#map44)]

Applicable technologies

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map44-ref"></a>
* *Technology* Value
  * Details: [*Technology*](#map44)

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

<a id="map50"></a>
# *Note*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[note](#propertynote-markdownstring)|MarkdownString| |**Required**|
|[type](#propertytype-notetypestring)|NoteTypeString| |**Required**|


<details>

<a id="propertynote-markdownstring"></a>
## Property note ∷ MarkdownString

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertytype-notetypestring"></a>
## Property type ∷ NoteTypeString

* This entry is required


  * *NoteType* defines the different types of notes that can be associated with a weakness
  * Allowed Values:
    * Applicable Platform
    * Maintenance
    * Relationship
    * Research Gap
    * Terminology
    * Theoretical
  * Reference: [NoteTypeEnumeration] (https://cwe.mitre.org/documents/schema/#NoteTypeEnumeration)



</details>

<a id="map49"></a>
# *Mitigation*

> Reference: [PotentialMitigationsType](https://cwe.mitre.org/documents/schema/#PotentialMitigationsType)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|a description of this individual mitigation including any strengths and shortcomings of this mitigation for the weakness|**Required**|
|[effectiveness](#propertyeffectiveness-effectivenessstring)|EffectivenessString|summarizes how effective the mitigation may be in preventing the weakness|_Optional_|
|[effectiveness_notes](#propertyeffectiveness_notes-markdownstring)|MarkdownString| |_Optional_|
|[phases](#propertyphases-softwarephasestring)|[SoftwarePhaseString]|indicates the development life cycle phase during which this particular mitigation may be applied|_Optional_|
|[strategy](#propertystrategy-mitigationstrategystring)|MitigationStrategyString|a general strategy for protecting a system to which this mitigation contributes|_Optional_|


<details>

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

a description of this individual mitigation including any strengths and shortcomings of this mitigation for the weakness

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyeffectiveness-effectivenessstring"></a>
## Property effectiveness ∷ EffectivenessString

summarizes how effective the mitigation may be in preventing the weakness

* This entry is optional


  * *Effectiveness* related to how effective a mitigation may be in preventing the weakness
  * Allowed Values:
    * Defense in Depth
    * High
    * Incidental
    * Limited
    * Moderate
    * None
  * Reference: [EffectivenessEnumeration](https://cwe.mitre.org/documents/schema/#EffectivenessEnumeration)


<a id="propertyeffectiveness_notes-markdownstring"></a>
## Property effectiveness_notes ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyphases-softwarephasestring"></a>
## Property phases ∷ [SoftwarePhaseString]

indicates the development life cycle phase during which this particular mitigation may be applied

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *SoftwarePhase* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Architecture and Design
    * Build and Compilation
    * Bundling
    * Distribution
    * Documentation
    * Implementation
    * Installation
    * Operation
    * Patching and Maintenance
    * Policy
    * Porting
    * Requirements
    * System Configuration
    * Testing
  * Reference: [PhaseEnumeration](https://cwe.mitre.org/documents/schema/#PhaseEnumeration)


<a id="propertystrategy-mitigationstrategystring"></a>
## Property strategy ∷ MitigationStrategyString

a general strategy for protecting a system to which this mitigation contributes

* This entry is optional


  * *MitigationStrategy* strategy for protecting a system to which a mitigation contributes
  * Allowed Values:
    * Attack Surface Reduction
    * Compilation or Build Hardening
    * Enforcement by Conversion
    * Environment Hardening
    * Firewall
    * Input Validation
    * Language Selection
    * Libraries or Frameworks
    * Output Encoding
    * Parameterization
    * Refactoring
    * Resource Limitation
    * Sandbox or Jail
    * Separation of Privilege
  * Reference: [MitigationStrategyEnumeration](https://cwe.mitre.org/documents/schema/#MitigationStrategyEnumeration)



</details>

<a id="map48"></a>
# *DetectionMethod*

> Reference: [DetectionMethodsType](https://cwe.mitre.org/documents/schema/#DetectionMethodsType)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|provide some context of how this method can be applied to a specific weakness|**Required**|
|[method](#propertymethod-detectionmethodstring)|DetectionMethodString|identifies the particular detection method being described|**Required**|
|[effectiveness](#propertyeffectiveness-detectioneffectivenessstring)|DetectionEffectivenessString|how effective the detection method may be in detecting the associated weakness|_Optional_|
|[effectiveness_notes](#propertyeffectiveness_notes-markdownstring)|MarkdownString|provides additional discussion of the strengths and shortcomings of this detection method|_Optional_|


<details>

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

provide some context of how this method can be applied to a specific weakness

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertymethod-detectionmethodstring"></a>
## Property method ∷ DetectionMethodString

identifies the particular detection method being described

* This entry is required


  * *DetectionMethod* method used to detect a weakness
  * Allowed Values:
    * Architecture or Design Review
    * Automated Analysis
    * Automated Dynamic Analysis
    * Automated Static Analysis
    * Automated Static Analysis - Binary or Bytecode
    * Automated Static Analysis - Source Code
    * Black Box
    * Dynamic Analysis with Automated Results Interpretation
    * Dynamic Analysis with Manual Results Interpretation
    * Fuzzing
    * Manual Analysis
    * Manual Dynamic Analysis
    * Manual Static Analysis
    * Manual Static Analysis - Binary or Bytecode
    * Manual Static Analysis - Source Code
    * Other
    * White Box
  * Reference: [DetectionMethodEnumeration](https://cwe.mitre.org/documents/schema/#DetectionMethodEnumeration)


<a id="propertyeffectiveness-detectioneffectivenessstring"></a>
## Property effectiveness ∷ DetectionEffectivenessString

how effective the detection method may be in detecting the associated weakness

* This entry is optional


  * *DetectionEffectiveness* level of effectiveness that a detection method may have in detecting an associated weakness
  * Allowed Values:
    * High
    * Limited
    * Moderate
    * None
    * Opportunistic
    * SOAR Partial
  * Reference: [DetectionEffectivenessEnumeration](https://cwe.mitre.org/documents/schema/#DetectionEffectivenessEnumeration)


<a id="propertyeffectiveness_notes-markdownstring"></a>
## Property effectiveness_notes ∷ MarkdownString

provides additional discussion of the strengths and shortcomings of this detection method

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters


</details>

<a id="map47"></a>
# *Consequence*

> Reference: [CommonConsequencesType](https://cwe.mitre.org/documents/schema/#CommonConsequencesType)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[scopes](#propertyscopes-consequencescopestring)|[ConsequenceScopeString]|identifies the security property that is violated|**Required**|
|[impacts](#propertyimpacts-technicalimpactstring)|[TechnicalImpactString]|describes the technical impact that arises if an adversary succeeds in exploiting this weakness|_Optional_|
|[likelihood](#propertylikelihood-highmedlowstring)|HighMedLowString|how likely the specific consequence is expected to be seen relative to the other consequences|_Optional_|
|[note](#propertynote-markdownstring)|MarkdownString|additional commentary about a consequence|_Optional_|


<details>

<a id="propertyscopes-consequencescopestring"></a>
## Property scopes ∷ [ConsequenceScopeString]

identifies the security property that is violated

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * *ConsequenceScope* defines the different areas of software security that can be affected by exploiting a weakness.
  * Allowed Values:
    * Access Control
    * Accountability
    * Authentication
    * Authorization
    * Availability
    * Confidentiality
    * Integrity
    * Non-Repudiation
  * Reference: [ScopeEnumeration](https://cwe.mitre.org/documents/schema/#ScopeEnumeration)


<a id="propertyimpacts-technicalimpactstring"></a>
## Property impacts ∷ [TechnicalImpactString]

describes the technical impact that arises if an adversary succeeds in exploiting this weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * Allowed Values:
    * Alter Execution Logic
    * Bypass Protection Mechanism
    * DoS: Amplification
    * DoS: Crash, Exit, or Restart
    * DoS: Instability
    * DoS: Resource Consumption (CPU)
    * DoS: Resource Consumption (Memory)
    * DoS: Resource Consumption (Other)
    * Execute Unauthorized Code or Commands
    * Gain Privileges or Assume Identity
    * Hide Activities
    * Modify Application Data
    * Modify Files or Directories
    * Modify Memory
    * Quality Degradation
    * Read Application Data
    * Read Files or Directories
    * Read Memory
    * Unexpected State
    * Varies by Context
  * Reference: [TechnicalImpactEnumeration](https://cwe.mitre.org/documents/schema/#TechnicalImpactEnumeration)


<a id="propertylikelihood-highmedlowstring"></a>
## Property likelihood ∷ HighMedLowString

how likely the specific consequence is expected to be seen relative to the other consequences

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertynote-markdownstring"></a>
## Property note ∷ MarkdownString

additional commentary about a consequence

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters


</details>

<a id="map46"></a>
# *ModeOfIntroduction*

> Reference: [ModesOfIntroductionType](https://cwe.mitre.org/documents/schema/#ModesOfIntroductionType)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[phase](#propertyphase-softwarephasestring)|SoftwarePhaseString|identifies the point in the software life cycle at which the weakness may be introduced|**Required**|
|[note](#propertynote-markdownstring)|MarkdownString|provides a typical scenario related to introduction during the given phase|_Optional_|


<details>

<a id="propertyphase-softwarephasestring"></a>
## Property phase ∷ SoftwarePhaseString

identifies the point in the software life cycle at which the weakness may be introduced

* This entry is required


  * *SoftwarePhase* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Architecture and Design
    * Build and Compilation
    * Bundling
    * Distribution
    * Documentation
    * Implementation
    * Installation
    * Operation
    * Patching and Maintenance
    * Policy
    * Porting
    * Requirements
    * System Configuration
    * Testing
  * Reference: [PhaseEnumeration](https://cwe.mitre.org/documents/schema/#PhaseEnumeration)


<a id="propertynote-markdownstring"></a>
## Property note ∷ MarkdownString

provides a typical scenario related to introduction during the given phase

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters


</details>

<a id="map45"></a>
# *AlternateTerm*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[term](#propertyterm-shortstring)|ShortString|the actual alternate term|**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString|provides context for the alternate term by which this weakness may be known.|_Optional_|


<details>

<a id="propertyterm-shortstring"></a>
## Property term ∷ ShortString

the actual alternate term

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

provides context for the alternate term by which this weakness may be known.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters


</details>

<a id="map44"></a>
# *Technology*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[name](#propertyname-shortstring)|ShortString|technology name (Web Server, Web Client)|_Optional_|


<details>

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ PrevalenceString

defines the different regularities that guide the applicability of platforms

* This entry is required


  * *Prevalence* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)


<a id="propertyname-shortstring"></a>
## Property name ∷ ShortString

technology name (Web Server, Web Client)

* This entry is optional


  * *ShortString* String with at most 1024 characters


</details>

<a id="map43"></a>
# *Paradigm*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[name](#propertyname-shortstring)|ShortString|paradigm name (Client Server, Mainframe)|_Optional_|


<details>

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ PrevalenceString

defines the different regularities that guide the applicability of platforms

* This entry is required


  * *Prevalence* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)


<a id="propertyname-shortstring"></a>
## Property name ∷ ShortString

paradigm name (Client Server, Mainframe)

* This entry is optional


  * *ShortString* String with at most 1024 characters


</details>

<a id="map42"></a>
# *Architecture*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[class](#propertyclass-architectureclassstring)|ArchitectureClassString|class of architecture|_Optional_|
|[name](#propertyname-shortstring)|ShortString|architecture name (ARM, x86, ...)|_Optional_|


<details>

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ PrevalenceString

defines the different regularities that guide the applicability of platforms

* This entry is required


  * *Prevalence* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)


<a id="propertyclass-architectureclassstring"></a>
## Property class ∷ ArchitectureClassString

class of architecture

* This entry is optional


  * Allowed Values:
    * Embedded
    * Microcomputer
    * Workstation
  * Reference: [ArchitectureClassEnumeration](https://cwe.mitre.org/documents/schema/#ArchitectureClassEnumeration)


<a id="propertyname-shortstring"></a>
## Property name ∷ ShortString

architecture name (ARM, x86, ...)

* This entry is optional


  * *ShortString* String with at most 1024 characters


</details>

<a id="map41"></a>
# *OperatingSystem*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[class](#propertyclass-operatingsystemclassstring)|OperatingSystemClassString| |_Optional_|
|[cpe_id](#propertycpe_id-shortstring)|ShortString| |_Optional_|
|[name](#propertyname-shortstring)|ShortString| |_Optional_|
|[version](#propertyversion-shortstring)|ShortString| |_Optional_|


<details>

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ PrevalenceString

defines the different regularities that guide the applicability of platforms

* This entry is required


  * *Prevalence* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)


<a id="propertyclass-operatingsystemclassstring"></a>
## Property class ∷ OperatingSystemClassString

* This entry is optional


  * *OperatingSystemClass* class of operating systems
  * Allowed Values:
    * Android
    * Apple iOS
    * Cisco IOS
    * Linux
    * Unix
    * Windows
    * macOs
  * Reference: [OperatingSystemClassEnumeration](https://cwe.mitre.org/documents/schema/#OperatingSystemClassEnumeration)


<a id="propertycpe_id-shortstring"></a>
## Property cpe_id ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyname-shortstring"></a>
## Property name ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyversion-shortstring"></a>
## Property version ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters


</details>

<a id="map40"></a>
# *Language*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[class](#propertyclass-languageclassstring)|LanguageClassString|class of language|_Optional_|
|[name](#propertyname-shortstring)|ShortString|Language name (Clojure, Java, ...)|_Optional_|


<details>

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ PrevalenceString

defines the different regularities that guide the applicability of platforms

* This entry is required


  * *Prevalence* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)


<a id="propertyclass-languageclassstring"></a>
## Property class ∷ LanguageClassString

class of language

* This entry is optional


  * *LanguageClass* class of source code language
  * Allowed Values:
    * Assembly
    * Compiled
    * Interpreted
  * Reference: [LanguageClassEnumeration](https://cwe.mitre.org/documents/schema/#LanguageClassEnumeration)


<a id="propertyname-shortstring"></a>
## Property name ∷ ShortString

Language name (Clojure, Java, ...)

* This entry is optional


  * *ShortString* String with at most 1024 characters


</details>

<a id="map39"></a>
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

<a id="map24"></a>
# *DataTable*

*DataTable* A generic table of data, consisting of types and documented
  columns, and 1 or more rows of data.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[columns](#propertycolumns-columndefinitionmap52)|[[*ColumnDefinition*](#map52)]|an ordered list of column definitions|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[rows](#propertyrows-anything)|[Anything]|an ordered list of rows|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#propertytype-datatabletypeidentifierstring)|DataTableTypeIdentifierString| |**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap51)|[[*ExternalReference*](#map51)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[row_count](#propertyrow_count-integer)|Integer|The number of rows in the data table.|_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map53)| |_Optional_|


<details>

<a id="propertycolumns-columndefinitionmap52"></a>
## Property columns ∷ [[*ColumnDefinition*](#map52)]

an ordered list of column definitions

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map52-ref"></a>
* *ColumnDefinition* Value
  * Details: [*ColumnDefinition*](#map52)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyrows-anything"></a>
## Property rows ∷ [[Anything]]

an ordered list of rows

* This entry is required
* This entry's type is sequential (allows zero or more values)



<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertytype-datatabletypeidentifierstring"></a>
## Property type ∷ DataTableTypeIdentifierString

* This entry is required


  * Must equal: "data-table"

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap51"></a>
## Property external_references ∷ [[*ExternalReference*](#map51)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map51-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map51)

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

<a id="propertyrow_count-integer"></a>
## Property row_count ∷ Integer

The number of rows in the data table.

* This entry is optional



<a id="propertyshort_description-medstring"></a>
## Property short_description ∷ MedString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

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

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

* This entry is optional


<a id="map53-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map53)


</details>

<a id="map53"></a>
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

<a id="map52"></a>
# *ColumnDefinition*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[name](#propertyname-string)|String| |**Required**|
|[type](#propertytype-columntypestring)|ColumnTypeString| |**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString| |_Optional_|
|[required](#propertyrequired-boolean)|Boolean|If true, the row entries for this column cannot contain nulls. Defaults to true|_Optional_|
|[short_description](#propertyshort_description-string)|String| |_Optional_|


<details>

<a id="propertyname-string"></a>
## Property name ∷ String

* This entry is required



<a id="propertytype-columntypestring"></a>
## Property type ∷ ColumnTypeString

* This entry is required


  * Allowed Values:
    * integer
    * markdown
    * number
    * observable
    * string
    * url

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyrequired-boolean"></a>
## Property required ∷ Boolean

If true, the row entries for this column cannot contain nulls. Defaults to true

* This entry is optional



<a id="propertyshort_description-string"></a>
## Property short_description ∷ String

* This entry is optional




</details>

<a id="map51"></a>
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

<a id="map23"></a>
# *Verdict*

*Verdict* A Verdict is chosen from all of the Judgements on that Observable which have not yet expired.  The highest priority Judgement becomes the active verdict.  If there is more than one Judgement with that priority, then Clean disposition has priority over all others, then Malicious disposition, and so on down to Unknown.

 The ID of a verdict is a a str of the form "observable.type:observable.value" for example, "ip:1.1.1.1"

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[disposition](#propertydisposition-dispositionnumberinteger)|DispositionNumberInteger| |**Required**|
|[observable](#propertyobservable-observable)|[*Observable*](#map54)| |**Required**|
|[type](#propertytype-verdicttypeidentifierstring)|VerdictTypeIdentifierString| |**Required**|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map55)| |**Required**|
|[disposition_name](#propertydisposition_name-dispositionnamestring)|DispositionNameString|The disposition_name field is optional, but is intended to be shown to a user.  Applications must therefore remember the mapping of numbers to human words, as in: {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}|_Optional_|
|[judgement_id](#propertyjudgement_id-string)|String| |_Optional_|


<details>

<a id="propertydisposition-dispositionnumberinteger"></a>
## Property disposition ∷ DispositionNumberInteger

* This entry is required


  * *DispositionNumber* Numeric verdict identifiers
  * Allowed Values:
    * 1
    * 2
    * 3
    * 4
    * 5

<a id="propertyobservable-observable"></a>
## Property observable ∷ *Observable*

* This entry is required


<a id="map54-ref"></a>
* *Observable* Value
  * Details: [*Observable*](#map54)

<a id="propertytype-verdicttypeidentifierstring"></a>
## Property type ∷ VerdictTypeIdentifierString

* This entry is required


  * Must equal: "verdict"

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

* This entry is required


<a id="map55-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map55)

<a id="propertydisposition_name-dispositionnamestring"></a>
## Property disposition_name ∷ DispositionNameString

The disposition_name field is optional, but is intended to be shown to a user.  Applications must therefore remember the mapping of numbers to human words, as in: {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}

* This entry is optional


  * *DispositionName* String verdict identifiers
  * Allowed Values:
    * Clean
    * Common
    * Malicious
    * Suspicious
    * Unknown

<a id="propertyjudgement_id-string"></a>
## Property judgement_id ∷ String

* This entry is optional


  * A URI leading to a judgement


</details>

<a id="map55"></a>
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

<a id="map54"></a>
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

<a id="map22"></a>
# *Tool*

> Reference: [Tool](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/pub#h.z4voa9ndw8v)

*Tool* Tools are legitimate software that can be used by threat actors to perform attacks. Knowing how and when threat actors use such tools can be important for understanding how campaigns are executed. Unlike malware, these tools or software packages are often found on a system and have legitimate purposes for power users, system administrators, network administrators, or even normal users. Remote access tools (e.g., RDP) and network scanning tools (e.g., Nmap) are examples of Tools that may be used by a Threat Actor during an attack.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[labels](#propertylabels-toollabelstring)|[ToolLabelString]|The kind(s) of tool(s) being described.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|**Required**|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|**Required**|
|[type](#propertytype-tooltypeidentifierstring)|ToolTypeIdentifierString| |**Required**|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap56)|[[*ExternalReference*](#map56)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[kill_chain_phases](#propertykill_chain_phases-killchainphasemap57)|[[*KillChainPhase*](#map57)]|The list of kill chain phases for which this Tool can be used.|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|
|[tool_version](#propertytool_version-shortstring)|ShortString|The version identifier associated with the Tool.|_Optional_|
|[x_mitre_aliases](#propertyx_mitre_aliases-shortstring)|[ShortString]|ATT&CK Software.aliases|_Optional_|


<details>

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylabels-toollabelstring"></a>
## Property labels ∷ [ToolLabelString]

The kind(s) of tool(s) being described.

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * *ToolLabel* Tool labels describe the categories of tools that can be used to perform attacks.
  * Allowed Values:
    * credential-exploitation
    * denial-of-service
    * exploitation
    * information-gathering
    * network-capture
    * remote-access
    * vulnerability-scanning
  * Reference: [Tool Label](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.cozm95emj8qk)


<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstring"></a>
## Property short_description ∷ MedString

A single line, short summary of the object.

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertytitle-shortstring"></a>
## Property title ∷ ShortString

A short title for this object, used as primary display and reference value

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertytype-tooltypeidentifierstring"></a>
## Property type ∷ ToolTypeIdentifierString

* This entry is required


  * Must equal: "tool"

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap56"></a>
## Property external_references ∷ [[*ExternalReference*](#map56)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map56-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map56)

<a id="propertykill_chain_phases-killchainphasemap57"></a>
## Property kill_chain_phases ∷ [[*KillChainPhase*](#map57)]

The list of kill chain phases for which this Tool can be used.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map57-ref"></a>
* *KillChainPhase* Value
  * Details: [*KillChainPhase*](#map57)

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

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

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

<a id="propertytool_version-shortstring"></a>
## Property tool_version ∷ ShortString

The version identifier associated with the Tool.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyx_mitre_aliases-shortstring"></a>
## Property x_mitre_aliases ∷ [ShortString]

ATT&CK Software.aliases

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters


</details>

<a id="map57"></a>
# *KillChainPhase*

> Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

*KillChainPhase* The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)|String|The name of the kill chain.|**Required**|
|[phase_name](#propertyphase_name-string)|String|The name of the phase in the kill chain.|**Required**|


<details>

<a id="propertykill_chain_name-string"></a>
## Property kill_chain_name ∷ String

The name of the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Must equal: "lockheed-martin-cyber-kill-chain"
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)


<a id="propertyphase_name-string"></a>
## Property phase_name ∷ String

The name of the phase in the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Allowed Values:
    * actions-on-objective
    * command-and-control
    * delivery
    * exploitation
    * installation
    * reconnaissance
    * weaponization
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)



</details>

<a id="map56"></a>
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

<a id="map21"></a>
# *TargetRecord*

> Reference: [TargetRecord](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#targetrecord)

*TargetRecord* A TargetRecord is a Sighting that has no threat or observables associated
  with it, it's a way of saying they saw a set of observables together as a Target.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[source](#propertysource-medstring)|MedString| |**Required**|
|[targets](#propertytargets-targetmap59)|[[*Target*](#map59)]| |**Required**|
|[type](#propertytype-targetrecordtypeidentifierstring)|TargetRecordTypeIdentifierString| |**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap58)|[[*ExternalReference*](#map58)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

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

<a id="propertytargets-targetmap59"></a>
## Property targets ∷ [[*Target*](#map59)]

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map59-ref"></a>
* *Target* Value
  * Details: [*Target*](#map59)

<a id="propertytype-targetrecordtypeidentifierstring"></a>
## Property type ∷ TargetRecordTypeIdentifierString

* This entry is required


  * Must equal: "target-record"

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap58"></a>
## Property external_references ∷ [[*ExternalReference*](#map58)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map58-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map58)

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

<a id="map59"></a>
# *Target*

*Target* Schema for TargetRecord Targets

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#propertyobservables-observablemap60)|[[*Observable*](#map60)]| |**Required**|
|[observed_time](#propertyobserved_time-observedtime)|[*ObservedTime*](#map61)| |**Required**|
|[type](#propertytype-sensorstring)|SensorString| |**Required**|
|[internal](#propertyinternal-boolean)|Boolean|Is it internal to our network?|_Optional_|
|[os](#propertyos-string)|String|Source Operating System where TargetRecord was originated.|_Optional_|
|[sensor](#propertysensor-string)|String|The OpenC2 Actuator name that best fits the device that is creating this TargetRecord (e.g.: network.firewall, etc.)|_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|


<details>

<a id="propertyobservables-observablemap60"></a>
## Property observables ∷ [[*Observable*](#map60)]

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map60-ref"></a>
* *Observable* Value
  * Details: [*Observable*](#map60)

<a id="propertyobserved_time-observedtime"></a>
## Property observed_time ∷ *ObservedTime*

* This entry is required


<a id="map61-ref"></a>
* *ObservedTime* Value
  * Details: [*ObservedTime*](#map61)

<a id="propertytype-sensorstring"></a>
## Property type ∷ SensorString

* This entry is required


  * *Sensor* The sensor/actuator name that best fits a device

  * Allowed Values:
    * endpoint
    * endpoint.digital-telephone-handset
    * endpoint.laptop
    * endpoint.pos-terminal
    * endpoint.printer
    * endpoint.sensor
    * endpoint.server
    * endpoint.smart-meter
    * endpoint.smart-phone
    * endpoint.tablet
    * endpoint.workstation
    * network
    * network.bridge
    * network.firewall
    * network.gateway
    * network.guard
    * network.hips
    * network.hub
    * network.ids
    * network.ips
    * network.modem
    * network.nic
    * network.proxy
    * network.router
    * network.security_manager
    * network.sense_making
    * network.sensor
    * network.switch
    * network.vpn
    * network.wap
    * process
    * process.aaa-server
    * process.anti-virus-scanner
    * process.connection-scanner
    * process.directory-service
    * process.dns-server
    * process.email-service
    * process.file-scanner
    * process.location-service
    * process.network-scanner
    * process.remediation-service
    * process.reputation-service
    * process.sandbox
    * process.virtualization-service
    * process.vulnerability-scanner

<a id="propertyinternal-boolean"></a>
## Property internal ∷ Boolean

Is it internal to our network?

* This entry is optional



<a id="propertyos-string"></a>
## Property os ∷ String

Source Operating System where TargetRecord was originated.

* This entry is optional



<a id="propertysensor-string"></a>
## Property sensor ∷ String

The OpenC2 Actuator name that best fits the device that is creating this TargetRecord (e.g.: network.firewall, etc.)

* This entry is optional



<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI


</details>

<a id="map61"></a>
# *ObservedTime*

> Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-datetime)|DateTime|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|**Required**|
|[end_time](#propertyend_time-datetime)|DateTime|If the observation was made over a period of time, than this field indicates the end of that period|_Optional_|


<details>

<a id="propertystart_time-datetime"></a>
## Property start_time ∷ DateTime

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyend_time-datetime"></a>
## Property end_time ∷ DateTime

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.


</details>

<a id="map60"></a>
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

<a id="map58"></a>
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

<a id="map20"></a>
# *IdentityAssertion*

*IdentityAssertion* Context attributes about the target or any of its observables. 
   Providers could provide different types of assertions regarding a target depending on their own capabilities

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[assertions](#propertyassertions-assertionmap64)|[[*Assertion*](#map64)]|Any known context about the identity attributes|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[identity](#propertyidentity-identitycoordinates)|[*IdentityCoordinates*](#map63)|attributes for which the assertion is being made|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#propertytype-identityassertiontypeidentifierstring)|IdentityAssertionTypeIdentifierString| |**Required**|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap62)|[[*ExternalReference*](#map62)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map65)| |_Optional_|


<details>

<a id="propertyassertions-assertionmap64"></a>
## Property assertions ∷ [[*Assertion*](#map64)]

Any known context about the identity attributes

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map64-ref"></a>
* *Assertion* Value
  * Details: [*Assertion*](#map64)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyidentity-identitycoordinates"></a>
## Property identity ∷ *IdentityCoordinates*

attributes for which the assertion is being made

* This entry is required


<a id="map63-ref"></a>
* *IdentityCoordinates* Value
  * Details: [*IdentityCoordinates*](#map63)

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertytype-identityassertiontypeidentifierstring"></a>
## Property type ∷ IdentityAssertionTypeIdentifierString

* This entry is required


  * Must equal: "identity-assertion"

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap62"></a>
## Property external_references ∷ [[*ExternalReference*](#map62)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map62-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map62)

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

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

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

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

* This entry is optional


<a id="map65-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map65)


</details>

<a id="map65"></a>
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

<a id="map64"></a>
# *Assertion*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[name](#propertyname-assertiontypestring)|AssertionTypeString| |**Required**|
|[value](#propertyvalue-string)|String| |**Required**|


<details>

<a id="propertyname-assertiontypestring"></a>
## Property name ∷ AssertionTypeString

* This entry is required


  * *AssertionType* an open vocabulary containing well known assertion types
  * Allowed Values:
    * cisco:ctr:ad:host_domain_name
    * cisco:ctr:ad:host_resolved_dns
    * cisco:ctr:ad:host_resolved_identities
    * cisco:ctr:ad:normalized_user
    * cisco:ctr:ad:user_domain_name
    * cisco:ctr:ad:user_net_bios_name
    * cisco:ctr:ad:user_resolved_dns
    * cisco:ctr:ad:user_resolved_identities
    * cisco:ctr:common:business_value
    * cisco:ctr:common:ir_attributes
    * cisco:ctr:common:node_label
    * cisco:ctr:device:administrators
    * cisco:ctr:device:connector_version
    * cisco:ctr:device:endpoint_profile
    * cisco:ctr:device:hardware_version
    * cisco:ctr:device:has_ip_blocking
    * cisco:ctr:device:id
    * cisco:ctr:device:last_sync_status
    * cisco:ctr:device:last_sync_time
    * cisco:ctr:device:location
    * cisco:ctr:device:manufacturer
    * cisco:ctr:device:mdm_compliant
    * cisco:ctr:device:mdm_imei
    * cisco:ctr:device:mdm_jail_broken
    * cisco:ctr:device:mdm_registered
    * cisco:ctr:device:model
    * cisco:ctr:device:name
    * cisco:ctr:device:os_version
    * cisco:ctr:device:os_version_name
    * cisco:ctr:device:owner
    * cisco:ctr:device:posture
    * cisco:ctr:device:security_group
    * cisco:ctr:device:serial_number
    * cisco:ctr:device:software_version
    * cisco:ctr:device:status
    * cisco:ctr:device:type
    * cisco:ctr:device:vendor
    * cisco:ctr:user:building
    * cisco:ctr:user:department
    * cisco:ctr:user:emails
    * cisco:ctr:user:entitlements
    * cisco:ctr:user:first_name
    * cisco:ctr:user:groups
    * cisco:ctr:user:last_name
    * cisco:ctr:user:manager
    * cisco:ctr:user:phone_numbers
    * cisco:ctr:user:roles
    * cisco:ctr:user:status
    * cisco:ctr:user:timezone
    * cisco:ctr:user:title
    * cisco:ctr:user:two_factor_enable

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required




</details>

<a id="map63"></a>
# *IdentityCoordinates*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#propertyobservables-observablemap66)|[[*Observable*](#map66)]| |**Required**|


<details>

<a id="propertyobservables-observablemap66"></a>
## Property observables ∷ [[*Observable*](#map66)]

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map66-ref"></a>
* *Observable* Value
  * Details: [*Observable*](#map66)


</details>

<a id="map66"></a>
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

<a id="map62"></a>
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

<a id="map19"></a>
# *Sighting*

> Reference: [SightingType](http://stixproject.github.io/data-model/1.2/indicator/SightingType/)

*Sighting* A single sighting of an [indicator](indicator.md)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| |**Required**|
|[count](#propertycount-integer)|Integer|The number of times the sighting was seen|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[observed_time](#propertyobserved_time-observedtime)|[*ObservedTime*](#map68)| |**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#propertytype-sightingtypeidentifierstring)|SightingTypeIdentifierString| |**Required**|
|[data](#propertydata-sightingdatatable)|[*SightingDataTable*](#map69)|An embedded data table for the Sighting.|_Optional_|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap67)|[[*ExternalReference*](#map67)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[internal](#propertyinternal-boolean)|Boolean|Is it internal to our network|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[observables](#propertyobservables-observablemap72)|[[*Observable*](#map72)]|The object(s) of interest|_Optional_|
|[relations](#propertyrelations-observedrelationmap73)|[[*ObservedRelation*](#map73)]|Provide any context we can about where the observable came from|_Optional_|
|[resolution](#propertyresolution-resolutionstring)|ResolutionString| |_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[sensor](#propertysensor-sensorstring)|SensorString|The OpenC2 Actuator name that best fits the device that is creating this sighting (e.g. network.firewall)|_Optional_|
|[sensor_coordinates](#propertysensor_coordinates-sensorcoordinates)|[*SensorCoordinates*](#map70)| |_Optional_|
|[severity](#propertyseverity-highmedlowstring)|HighMedLowString| |_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[targets](#propertytargets-identityspecificationmap71)|[[*IdentitySpecification*](#map71)]|The target device. Where the sighting came from.|_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

* This entry is required


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertycount-integer"></a>
## Property count ∷ Integer

The number of times the sighting was seen

* This entry is required


  * Zero, or a positive integer

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyobserved_time-observedtime"></a>
## Property observed_time ∷ *ObservedTime*

* This entry is required


<a id="map68-ref"></a>
* *ObservedTime* Value
  * Details: [*ObservedTime*](#map68)

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertytype-sightingtypeidentifierstring"></a>
## Property type ∷ SightingTypeIdentifierString

* This entry is required


  * Must equal: "sighting"

<a id="propertydata-sightingdatatable"></a>
## Property data ∷ *SightingDataTable*

An embedded data table for the Sighting.

* This entry is optional


<a id="map69-ref"></a>
* *SightingDataTable* Value
  * Details: [*SightingDataTable*](#map69)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap67"></a>
## Property external_references ∷ [[*ExternalReference*](#map67)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map67-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map67)

<a id="propertyinternal-boolean"></a>
## Property internal ∷ Boolean

Is it internal to our network

* This entry is optional



<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyobservables-observablemap72"></a>
## Property observables ∷ [[*Observable*](#map72)]

The object(s) of interest

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map72-ref"></a>
* *Observable* Value
  * Details: [*Observable*](#map72)

<a id="propertyrelations-observedrelationmap73"></a>
## Property relations ∷ [[*ObservedRelation*](#map73)]

Provide any context we can about where the observable came from

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map73-ref"></a>
* *ObservedRelation* Value
  * Details: [*ObservedRelation*](#map73)

<a id="propertyresolution-resolutionstring"></a>
## Property resolution ∷ ResolutionString

* This entry is optional


  * *Resolution* indicates if the sensor that is reporting the Sighting already took action on it, for instance a Firewall blocking the IP
  * Default: detected
  * Allowed Values:
    * allowed
    * blocked
    * contained
    * detected

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertysensor-sensorstring"></a>
## Property sensor ∷ SensorString

The OpenC2 Actuator name that best fits the device that is creating this sighting (e.g. network.firewall)

* This entry is optional


  * *Sensor* The sensor/actuator name that best fits a device

  * Allowed Values:
    * endpoint
    * endpoint.digital-telephone-handset
    * endpoint.laptop
    * endpoint.pos-terminal
    * endpoint.printer
    * endpoint.sensor
    * endpoint.server
    * endpoint.smart-meter
    * endpoint.smart-phone
    * endpoint.tablet
    * endpoint.workstation
    * network
    * network.bridge
    * network.firewall
    * network.gateway
    * network.guard
    * network.hips
    * network.hub
    * network.ids
    * network.ips
    * network.modem
    * network.nic
    * network.proxy
    * network.router
    * network.security_manager
    * network.sense_making
    * network.sensor
    * network.switch
    * network.vpn
    * network.wap
    * process
    * process.aaa-server
    * process.anti-virus-scanner
    * process.connection-scanner
    * process.directory-service
    * process.dns-server
    * process.email-service
    * process.file-scanner
    * process.location-service
    * process.network-scanner
    * process.remediation-service
    * process.reputation-service
    * process.sandbox
    * process.virtualization-service
    * process.vulnerability-scanner

<a id="propertysensor_coordinates-sensorcoordinates"></a>
## Property sensor_coordinates ∷ *SensorCoordinates*

* This entry is optional


<a id="map70-ref"></a>
* *SensorCoordinates* Value
  * Details: [*SensorCoordinates*](#map70)

<a id="propertyseverity-highmedlowstring"></a>
## Property severity ∷ HighMedLowString

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertyshort_description-medstring"></a>
## Property short_description ∷ MedString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytargets-identityspecificationmap71"></a>
## Property targets ∷ [[*IdentitySpecification*](#map71)]

The target device. Where the sighting came from.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map71-ref"></a>
* *IdentitySpecification* Value
  * Details: [*IdentitySpecification*](#map71)

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

<a id="map73"></a>
# *ObservedRelation*

*ObservedRelation* A relation inside a Sighting.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[origin](#propertyorigin-string)|String| |**Required**|
|[related](#propertyrelated-observable)|[*Observable*](#map76)| |**Required**|
|[relation](#propertyrelation-observablerelationtypestring)|ObservableRelationTypeString| |**Required**|
|[source](#propertysource-observable)|[*Observable*](#map75)| |**Required**|
|[origin_uri](#propertyorigin_uri-string)|String| |_Optional_|
|[relation_info](#propertyrelation_info-object)|[Object](#map74)| |_Optional_|


<details>

<a id="propertyorigin-string"></a>
## Property origin ∷ String

* This entry is required



<a id="propertyrelated-observable"></a>
## Property related ∷ *Observable*

* This entry is required


<a id="map76-ref"></a>
* *Observable* Value
  * Details: [*Observable*](#map76)

<a id="propertyrelation-observablerelationtypestring"></a>
## Property relation ∷ ObservableRelationTypeString

* This entry is required


  * Allowed Values:
    * Allocated
    * Allocated_By
    * Attached_To
    * Bound
    * Bound_By
    * Characterized_By
    * Characterizes
    * Child_Of
    * Closed
    * Closed_By
    * Compressed
    * Compressed_By
    * Compressed_From
    * Compressed_Into
    * Connected_From
    * Connected_To
    * Contained_Within
    * Contains
    * Copied
    * Copied_By
    * Copied_From
    * Copied_To
    * Created
    * Created_By
    * Decoded
    * Decoded_By
    * Decompressed
    * Decompressed_By
    * Decrypted
    * Decrypted_By
    * Deleted
    * Deleted_By
    * Deleted_From
    * Downloaded
    * Downloaded_By
    * Downloaded_From
    * Downloaded_To
    * Dropped
    * Dropped_By
    * Encoded
    * Encoded_By
    * Encrypted
    * Encrypted_By
    * Encrypted_From
    * Encrypted_To
    * Extracted_From
    * FQDN_Of
    * Freed
    * Freed_By
    * Hooked
    * Hooked_By
    * Initialized_By
    * Initialized_To
    * Injected
    * Injected_As
    * Injected_By
    * Injected_Into
    * Installed
    * Installed_By
    * Joined
    * Joined_By
    * Killed
    * Killed_By
    * Listened_On
    * Listened_On_By
    * Loaded_From
    * Loaded_Into
    * Locked
    * Locked_By
    * Mapped_By
    * Mapped_Into
    * Merged
    * Merged_By
    * Modified_Properties_Of
    * Monitored
    * Monitored_By
    * Moved
    * Moved_By
    * Moved_From
    * Moved_To
    * Opened
    * Opened_By
    * Packed
    * Packed_By
    * Packed_From
    * Packed_Into
    * Parent_Of
    * Paused
    * Paused_By
    * Previously_Contained
    * Properties_Modified_By
    * Properties_Queried
    * Properties_Queried_By
    * Read_From
    * Read_From_By
    * Received
    * Received_By
    * Received_From
    * Received_Via_Upload
    * Redirects_To
    * Refers_To
    * Related_To
    * Renamed
    * Renamed_By
    * Renamed_From
    * Renamed_To
    * Resolved_To
    * Resumed
    * Resumed_By
    * Root_Domain_Of
    * Searched_For
    * Searched_For_By
    * Sent
    * Sent_By
    * Sent_To
    * Sent_Via_Upload
    * Set_From
    * Set_To
    * Sub-domain_Of
    * Supra-domain_Of
    * Suspended
    * Suspended_By
    * Unhooked
    * Unhooked_By
    * Unlocked
    * Unlocked_By
    * Unpacked
    * Unpacked_By
    * Uploaded
    * Uploaded_By
    * Uploaded_From
    * Uploaded_To
    * Used
    * Used_By
    * Values_Enumerated
    * Values_Enumerated_By
    * Written_To_By
    * Wrote_To

<a id="propertysource-observable"></a>
## Property source ∷ *Observable*

* This entry is required


<a id="map75-ref"></a>
* *Observable* Value
  * Details: [*Observable*](#map75)

<a id="propertyorigin_uri-string"></a>
## Property origin_uri ∷ String

* This entry is optional


  * A URI

<a id="propertyrelation_info-object"></a>
## Property relation_info ∷ Object

* This entry is optional


<a id="map74-ref"></a>
* Object Value
  * Details: [Object](#map74)


</details>

<a id="map76"></a>
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

<a id="map75"></a>
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

<a id="map74"></a>
# Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[Keyword](#propertykeyword-anything)|Anything| |**Required**|


<details>

<a id="propertykeyword-anything"></a>
## Property Keyword ∷ Anything

* This entry is required




</details>

<a id="map72"></a>
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

<a id="map71"></a>
# *IdentitySpecification*

*IdentitySpecification* Describes the target of the sighting and contains identifying observables for the target.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#propertyobservables-observablemap77)|[[*Observable*](#map77)]| |**Required**|
|[observed_time](#propertyobserved_time-observedtime)|[*ObservedTime*](#map78)| |**Required**|
|[type](#propertytype-sensorstring)|SensorString| |**Required**|
|[os](#propertyos-string)|String| |_Optional_|


<details>

<a id="propertyobservables-observablemap77"></a>
## Property observables ∷ [[*Observable*](#map77)]

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map77-ref"></a>
* *Observable* Value
  * Details: [*Observable*](#map77)

<a id="propertyobserved_time-observedtime"></a>
## Property observed_time ∷ *ObservedTime*

* This entry is required


<a id="map78-ref"></a>
* *ObservedTime* Value
  * Details: [*ObservedTime*](#map78)

<a id="propertytype-sensorstring"></a>
## Property type ∷ SensorString

* This entry is required


  * *Sensor* The sensor/actuator name that best fits a device

  * Allowed Values:
    * endpoint
    * endpoint.digital-telephone-handset
    * endpoint.laptop
    * endpoint.pos-terminal
    * endpoint.printer
    * endpoint.sensor
    * endpoint.server
    * endpoint.smart-meter
    * endpoint.smart-phone
    * endpoint.tablet
    * endpoint.workstation
    * network
    * network.bridge
    * network.firewall
    * network.gateway
    * network.guard
    * network.hips
    * network.hub
    * network.ids
    * network.ips
    * network.modem
    * network.nic
    * network.proxy
    * network.router
    * network.security_manager
    * network.sense_making
    * network.sensor
    * network.switch
    * network.vpn
    * network.wap
    * process
    * process.aaa-server
    * process.anti-virus-scanner
    * process.connection-scanner
    * process.directory-service
    * process.dns-server
    * process.email-service
    * process.file-scanner
    * process.location-service
    * process.network-scanner
    * process.remediation-service
    * process.reputation-service
    * process.sandbox
    * process.virtualization-service
    * process.vulnerability-scanner

<a id="propertyos-string"></a>
## Property os ∷ String

* This entry is optional




</details>

<a id="map78"></a>
# *ObservedTime*

> Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-datetime)|DateTime|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|**Required**|
|[end_time](#propertyend_time-datetime)|DateTime|If the observation was made over a period of time, than this field indicates the end of that period|_Optional_|


<details>

<a id="propertystart_time-datetime"></a>
## Property start_time ∷ DateTime

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyend_time-datetime"></a>
## Property end_time ∷ DateTime

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.


</details>

<a id="map77"></a>
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

<a id="map70"></a>
# *SensorCoordinates*

*SensorCoordinates* Describes the device that made the sighting (sensor) and contains identifying observables for the sensor.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#propertyobservables-observablemap79)|[[*Observable*](#map79)]| |**Required**|
|[type](#propertytype-sensorstring)|SensorString| |**Required**|
|[os](#propertyos-string)|String| |_Optional_|


<details>

<a id="propertyobservables-observablemap79"></a>
## Property observables ∷ [[*Observable*](#map79)]

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map79-ref"></a>
* *Observable* Value
  * Details: [*Observable*](#map79)

<a id="propertytype-sensorstring"></a>
## Property type ∷ SensorString

* This entry is required


  * *Sensor* The sensor/actuator name that best fits a device

  * Allowed Values:
    * endpoint
    * endpoint.digital-telephone-handset
    * endpoint.laptop
    * endpoint.pos-terminal
    * endpoint.printer
    * endpoint.sensor
    * endpoint.server
    * endpoint.smart-meter
    * endpoint.smart-phone
    * endpoint.tablet
    * endpoint.workstation
    * network
    * network.bridge
    * network.firewall
    * network.gateway
    * network.guard
    * network.hips
    * network.hub
    * network.ids
    * network.ips
    * network.modem
    * network.nic
    * network.proxy
    * network.router
    * network.security_manager
    * network.sense_making
    * network.sensor
    * network.switch
    * network.vpn
    * network.wap
    * process
    * process.aaa-server
    * process.anti-virus-scanner
    * process.connection-scanner
    * process.directory-service
    * process.dns-server
    * process.email-service
    * process.file-scanner
    * process.location-service
    * process.network-scanner
    * process.remediation-service
    * process.reputation-service
    * process.sandbox
    * process.virtualization-service
    * process.vulnerability-scanner

<a id="propertyos-string"></a>
## Property os ∷ String

* This entry is optional




</details>

<a id="map79"></a>
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

<a id="map69"></a>
# *SightingDataTable*

*SightingDataTable* An embedded data table for sightings data.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[columns](#propertycolumns-columndefinitionmap80)|[[*ColumnDefinition*](#map80)]|an ordered list of column definitions|**Required**|
|[rows](#propertyrows-anything)|[Anything]|an ordered list of rows|**Required**|
|[row_count](#propertyrow_count-integer)|Integer|The number of rows in the data table.|_Optional_|


<details>

<a id="propertycolumns-columndefinitionmap80"></a>
## Property columns ∷ [[*ColumnDefinition*](#map80)]

an ordered list of column definitions

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map80-ref"></a>
* *ColumnDefinition* Value
  * Details: [*ColumnDefinition*](#map80)

<a id="propertyrows-anything"></a>
## Property rows ∷ [[Anything]]

an ordered list of rows

* This entry is required
* This entry's type is sequential (allows zero or more values)



<a id="propertyrow_count-integer"></a>
## Property row_count ∷ Integer

The number of rows in the data table.

* This entry is optional




</details>

<a id="map80"></a>
# *ColumnDefinition*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[name](#propertyname-string)|String| |**Required**|
|[type](#propertytype-columntypestring)|ColumnTypeString| |**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString| |_Optional_|
|[required](#propertyrequired-boolean)|Boolean|If true, the row entries for this column cannot contain nulls. Defaults to true|_Optional_|
|[short_description](#propertyshort_description-string)|String| |_Optional_|


<details>

<a id="propertyname-string"></a>
## Property name ∷ String

* This entry is required



<a id="propertytype-columntypestring"></a>
## Property type ∷ ColumnTypeString

* This entry is required


  * Allowed Values:
    * integer
    * markdown
    * number
    * observable
    * string
    * url

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyrequired-boolean"></a>
## Property required ∷ Boolean

If true, the row entries for this column cannot contain nulls. Defaults to true

* This entry is optional



<a id="propertyshort_description-string"></a>
## Property short_description ∷ String

* This entry is optional




</details>

<a id="map68"></a>
# *ObservedTime*

> Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-datetime)|DateTime|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|**Required**|
|[end_time](#propertyend_time-datetime)|DateTime|If the observation was made over a period of time, than this field indicates the end of that period|_Optional_|


<details>

<a id="propertystart_time-datetime"></a>
## Property start_time ∷ DateTime

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyend_time-datetime"></a>
## Property end_time ∷ DateTime

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.


</details>

<a id="map67"></a>
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

<a id="map18"></a>
# *Relationship*

*Relationship* Represents a relationship between two entities

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[relationship_type](#propertyrelationship_type-relationshiptypestring)|RelationshipTypeString| |**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[source_ref](#propertysource_ref-string)|String| |**Required**|
|[target_ref](#propertytarget_ref-string)|String| |**Required**|
|[type](#propertytype-relationshiptypeidentifierstring)|RelationshipTypeIdentifierString| |**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap81)|[[*ExternalReference*](#map81)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyrelationship_type-relationshiptypestring"></a>
## Property relationship_type ∷ RelationshipTypeString

* This entry is required


  * Allowed Values:
    * attributed-to
    * based-on
    * derived-from
    * detects
    * duplicate-of
    * element-of
    * exploits
    * indicates
    * member-of
    * mitigates
    * related-to
    * targets
    * uses
    * variant-of

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysource_ref-string"></a>
## Property source_ref ∷ String

* This entry is required


  * A URI leading to an entity

<a id="propertytarget_ref-string"></a>
## Property target_ref ∷ String

* This entry is required


  * A URI leading to an entity

<a id="propertytype-relationshiptypeidentifierstring"></a>
## Property type ∷ RelationshipTypeIdentifierString

* This entry is required


  * Must equal: "relationship"

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap81"></a>
## Property external_references ∷ [[*ExternalReference*](#map81)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map81-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map81)

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

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

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

<a id="map81"></a>
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

<a id="map17"></a>
# *Malware*

> Reference: [Malware](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/pub#h.s5l7katgbp09)

*Malware* Malware is a type of TTP that is also known as malicious code and malicious software, and refers to a program that is inserted into a system, usually covertly, with the intent of compromising the confidentiality, integrity, or availability of the victim's data, applications, or operating system (OS) or of otherwise annoying or disrupting the victim. Malware such as viruses and worms are usually designed to perform these nefarious functions in such a way that users are unaware of them, at least initially.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[labels](#propertylabels-malwarelabelstring)|[MalwareLabelString]|The type of malware being described.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|**Required**|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|**Required**|
|[type](#propertytype-malwaretypeidentifierstring)|MalwareTypeIdentifierString| |**Required**|
|[abstraction_level](#propertyabstraction_level-malwareabstractionsstring)|MalwareAbstractionsString|Malware abstraction level|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap82)|[[*ExternalReference*](#map82)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[kill_chain_phases](#propertykill_chain_phases-killchainphasemap83)|[[*KillChainPhase*](#map83)]|The list of Kill Chain Phases for which this Malware can be used.|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|
|[x_mitre_aliases](#propertyx_mitre_aliases-shortstring)|[ShortString]|ATT&CK Software.aliases|_Optional_|


<details>

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylabels-malwarelabelstring"></a>
## Property labels ∷ [MalwareLabelString]

The type of malware being described.

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * *MalwareLabel* Malware label is an open vocabulary that represents different types and functions of malware. Malware labels are not mutually exclusive; a malware instance can be both spyware and a screen capture tool.
  * Allowed Values:
    * adware
    * backdoor
    * bot
    * ddos
    * dropper
    * exploit-kit
    * keylogger
    * ransomware
    * remote-access-trojan
    * resource-exploitation
    * rogue-security-software
    * rootkit
    * screen-capture
    * spyware
    * trojan
    * virus
    * worm
  * Reference: [Malware Label](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.8cyb6e9yqzwr)


<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstring"></a>
## Property short_description ∷ MedString

A single line, short summary of the object.

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertytitle-shortstring"></a>
## Property title ∷ ShortString

A short title for this object, used as primary display and reference value

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertytype-malwaretypeidentifierstring"></a>
## Property type ∷ MalwareTypeIdentifierString

* This entry is required


  * Must equal: "malware"

<a id="propertyabstraction_level-malwareabstractionsstring"></a>
## Property abstraction_level ∷ MalwareAbstractionsString

Malware abstraction level

* This entry is optional


  * *MalwareAbstractions* Malware Abstraction level
  * Allowed Values:
    * family
    * variant
    * version

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap82"></a>
## Property external_references ∷ [[*ExternalReference*](#map82)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map82-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map82)

<a id="propertykill_chain_phases-killchainphasemap83"></a>
## Property kill_chain_phases ∷ [[*KillChainPhase*](#map83)]

The list of Kill Chain Phases for which this Malware can be used.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map83-ref"></a>
* *KillChainPhase* Value
  * Details: [*KillChainPhase*](#map83)

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

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

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

<a id="propertyx_mitre_aliases-shortstring"></a>
## Property x_mitre_aliases ∷ [ShortString]

ATT&CK Software.aliases

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters


</details>

<a id="map83"></a>
# *KillChainPhase*

> Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

*KillChainPhase* The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)|String|The name of the kill chain.|**Required**|
|[phase_name](#propertyphase_name-string)|String|The name of the phase in the kill chain.|**Required**|


<details>

<a id="propertykill_chain_name-string"></a>
## Property kill_chain_name ∷ String

The name of the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Must equal: "lockheed-martin-cyber-kill-chain"
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)


<a id="propertyphase_name-string"></a>
## Property phase_name ∷ String

The name of the phase in the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Allowed Values:
    * actions-on-objective
    * command-and-control
    * delivery
    * exploitation
    * installation
    * reconnaissance
    * weaponization
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)



</details>

<a id="map82"></a>
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

<a id="map16"></a>
# *Judgement*

*Judgement* A judgement about the intent or nature of an observable.  For
  example, is it malicious, meaning is is malware and subverts system
  operations?  It could also be clean and be from a known benign, or
  trusted source.  It could also be common, something so widespread
  that it's not likely to be malicious.

  Since a core goal of the CTIA is to provide a simple verdict service,
  these judgements are the basis for the returned verdicts.  These are
  also the primary means by which users of the CTIA go from
  observables on their system, to the indicators and threat
  intelligence data in CTIA.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| |**Required**|
|[disposition](#propertydisposition-dispositionnumberinteger)|DispositionNumberInteger|Matches :disposition_name as in {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}|**Required**|
|[disposition_name](#propertydisposition_name-dispositionnamestring)|DispositionNameString| |**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[observable](#propertyobservable-observable)|[*Observable*](#map85)| |**Required**|
|[priority](#propertypriority-integer)|Integer| |**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[severity](#propertyseverity-highmedlowstring)|HighMedLowString| |**Required**|
|[source](#propertysource-medstring)|MedString| |**Required**|
|[type](#propertytype-judgementtypeidentifierstring)|JudgementTypeIdentifierString| |**Required**|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map86)| |**Required**|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap84)|[[*ExternalReference*](#map84)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[reason](#propertyreason-shortstring)|ShortString| |_Optional_|
|[reason_uri](#propertyreason_uri-string)|String| |_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

* This entry is required


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertydisposition-dispositionnumberinteger"></a>
## Property disposition ∷ DispositionNumberInteger

Matches :disposition_name as in {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}

* This entry is required


  * *DispositionNumber* Numeric verdict identifiers
  * Allowed Values:
    * 1
    * 2
    * 3
    * 4
    * 5

<a id="propertydisposition_name-dispositionnamestring"></a>
## Property disposition_name ∷ DispositionNameString

* This entry is required


  * *DispositionName* String verdict identifiers
  * Allowed Values:
    * Clean
    * Common
    * Malicious
    * Suspicious
    * Unknown

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyobservable-observable"></a>
## Property observable ∷ *Observable*

* This entry is required


<a id="map85-ref"></a>
* *Observable* Value
  * Details: [*Observable*](#map85)

<a id="propertypriority-integer"></a>
## Property priority ∷ Integer

* This entry is required


  * A value 0-100 that determine the priority of a judgement. Curated feeds of black/white lists, for example known good products within your organizations, should use a 95. All automated systems should use a priority of 90, or less.  Human judgements should have a priority of 100, so that humans can always override machines.

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyseverity-highmedlowstring"></a>
## Property severity ∷ HighMedLowString

* This entry is required


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertysource-medstring"></a>
## Property source ∷ MedString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertytype-judgementtypeidentifierstring"></a>
## Property type ∷ JudgementTypeIdentifierString

* This entry is required


  * Must equal: "judgement"

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

* This entry is required


<a id="map86-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map86)

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap84"></a>
## Property external_references ∷ [[*ExternalReference*](#map84)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map84-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map84)

<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyreason-shortstring"></a>
## Property reason ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyreason_uri-string"></a>
## Property reason_uri ∷ String

* This entry is optional


  * A URI

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

<a id="map86"></a>
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

<a id="map85"></a>
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

<a id="map84"></a>
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

<a id="map15"></a>
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
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[producer](#propertyproducer-shortstring)|ShortString| |**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#propertytype-indicatortypeidentifierstring)|IndicatorTypeIdentifierString|The fixed value indicator|**Required**|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map88)|The time range during which this Indicator is considered valid.|**Required**|
|[composite_indicator_expression](#propertycomposite_indicator_expression-compositeindicatorexpression)|[*CompositeIndicatorExpression*](#map89)| |_Optional_|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|level of confidence held in the accuracy of this Indicator|_Optional_|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap87)|[[*ExternalReference*](#map87)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[indicator_type](#propertyindicator_type-indicatortypestring)|[IndicatorTypeString]|Specifies the type or types for this Indicator|_Optional_|
|[kill_chain_phases](#propertykill_chain_phases-killchainphasemap90)|[[*KillChainPhase*](#map90)]|relevant kill chain phases indicated by this Indicator|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[likely_impact](#propertylikely_impact-longstring)|LongString|likely potential impact within the relevant context if this Indicator were to occur|_Optional_|
|[negate](#propertynegate-boolean)|Boolean|specifies the absence of the pattern|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[severity](#propertyseverity-highmedlowstring)|HighMedLowString| |_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[specification](#propertyspecification-either)|[*JudgementSpecification*](#map91)| |_Optional_|
|[tags](#propertytags-shortstring)|[ShortString]|Descriptors for this indicator|_Optional_|
|[test_mechanisms](#propertytest_mechanisms-medstring)|[MedString]|Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator|_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyproducer-shortstring"></a>
## Property producer ∷ ShortString

* This entry is required
* Dev Notes: TODO - Document what is supposed to be in this field!


  * *ShortString* String with at most 1024 characters

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertytype-indicatortypeidentifierstring"></a>
## Property type ∷ IndicatorTypeIdentifierString

The fixed value indicator

* This entry is required


  * *IndicatorTypeIdentifier* The fixed value "indicator"
  * Must equal: "indicator"

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

The time range during which this Indicator is considered valid.

* This entry is required


<a id="map88-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map88)

<a id="propertycomposite_indicator_expression-compositeindicatorexpression"></a>
## Property composite_indicator_expression ∷ *CompositeIndicatorExpression*

* This entry is optional


<a id="map89-ref"></a>
* *CompositeIndicatorExpression* Value
  * Details: [*CompositeIndicatorExpression*](#map89)

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

level of confidence held in the accuracy of this Indicator

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap87"></a>
## Property external_references ∷ [[*ExternalReference*](#map87)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map87-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map87)

<a id="propertyindicator_type-indicatortypestring"></a>
## Property indicator_type ∷ [IndicatorTypeString]

Specifies the type or types for this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * Allowed Values:
    * Anonymization
    * C2
    * Compromised PKI Certificate
    * Domain Watchlist
    * Exfiltration
    * File Hash Watchlist
    * Host Characteristics
    * IMEI Watchlist
    * IMSI Watchlist
    * IP Watchlist
    * Login Name
    * Malicious E-mail
    * Malware Artifacts
    * Private Threat Feed
    * URL Watchlist
  * Reference: [IndicatorTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/IndicatorTypeVocab-1.1/)


<a id="propertykill_chain_phases-killchainphasemap90"></a>
## Property kill_chain_phases ∷ [[*KillChainPhase*](#map90)]

relevant kill chain phases indicated by this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


<a id="map90-ref"></a>
* *KillChainPhase* Value
  * Details: [*KillChainPhase*](#map90)

<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylikely_impact-longstring"></a>
## Property likely_impact ∷ LongString

likely potential impact within the relevant context if this Indicator were to occur

* This entry is optional


  * *LongString* String with at most 5000 characters

<a id="propertynegate-boolean"></a>
## Property negate ∷ Boolean

specifies the absence of the pattern

* This entry is optional



<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyseverity-highmedlowstring"></a>
## Property severity ∷ HighMedLowString

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertyshort_description-medstring"></a>
## Property short_description ∷ MedString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertyspecification-either"></a>
## Property specification ∷ Either

* This entry is optional


  * Only one of the following schemas will match

<a id="map91-ref"></a>
* *JudgementSpecification* Value
  * Details: [*JudgementSpecification*](#map91)

<a id="map92-ref"></a>
* *ThreatBrainSpecification* Value
  * Details: [*ThreatBrainSpecification*](#map92)

<a id="map93-ref"></a>
* *SnortSpecification* Value
  * Details: [*SnortSpecification*](#map93)

<a id="map94-ref"></a>
* *SIOCSpecification* Value
  * Details: [*SIOCSpecification*](#map94)

<a id="map95-ref"></a>
* *OpenIOCSpecification* Value
  * Details: [*OpenIOCSpecification*](#map95)

<a id="propertytags-shortstring"></a>
## Property tags ∷ [ShortString]

Descriptors for this indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertytest_mechanisms-medstring"></a>
## Property test_mechanisms ∷ [MedString]

Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


  * *MedString* String with at most 2048 characters

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

<a id="map95"></a>
# *OpenIOCSpecification*

*OpenIOCSpecification* An indicator which contains an XML blob of an openIOC indicator..

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[open_IOC](#propertyopen_ioc-string)|String| |**Required**|
|[type](#propertytype-openiocspecificationtypestring)|OpenIOCSpecificationTypeString| |**Required**|


<details>

<a id="propertyopen_ioc-string"></a>
## Property open_IOC ∷ String

* This entry is required



<a id="propertytype-openiocspecificationtypestring"></a>
## Property type ∷ OpenIOCSpecificationTypeString

* This entry is required


  * Must equal: "OpenIOC"


</details>

<a id="map94"></a>
# *SIOCSpecification*

*SIOCSpecification* An indicator which runs in snort...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[SIOC](#propertysioc-string)|String| |**Required**|
|[type](#propertytype-siocspecificationtypestring)|SIOCSpecificationTypeString| |**Required**|


<details>

<a id="propertysioc-string"></a>
## Property SIOC ∷ String

* This entry is required



<a id="propertytype-siocspecificationtypestring"></a>
## Property type ∷ SIOCSpecificationTypeString

* This entry is required


  * Must equal: "SIOC"


</details>

<a id="map93"></a>
# *SnortSpecification*

*SnortSpecification* An indicator which runs in snort...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[snort_sig](#propertysnort_sig-string)|String| |**Required**|
|[type](#propertytype-snortspecificationtypestring)|SnortSpecificationTypeString| |**Required**|


<details>

<a id="propertysnort_sig-string"></a>
## Property snort_sig ∷ String

* This entry is required



<a id="propertytype-snortspecificationtypestring"></a>
## Property type ∷ SnortSpecificationTypeString

* This entry is required


  * Must equal: "Snort"


</details>

<a id="map92"></a>
# *ThreatBrainSpecification*

*ThreatBrainSpecification* An indicator which runs in threatbrain...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-threatbrainspecificationtypestring)|ThreatBrainSpecificationTypeString| |**Required**|
|[variables](#propertyvariables-string)|[String]| |**Required**|
|[query](#propertyquery-string)|String| |_Optional_|


<details>

<a id="propertytype-threatbrainspecificationtypestring"></a>
## Property type ∷ ThreatBrainSpecificationTypeString

* This entry is required


  * Must equal: "ThreatBrain"

<a id="propertyvariables-string"></a>
## Property variables ∷ [String]

* This entry is required
* This entry's type is sequential (allows zero or more values)



<a id="propertyquery-string"></a>
## Property query ∷ String

* This entry is optional




</details>

<a id="map91"></a>
# *JudgementSpecification*

*JudgementSpecification* An indicator based on a list of judgements.  If any of the Observables in it's judgements are encountered, than it may be matches against.  If there are any required judgements, they all must be matched in order for the indicator to be considered a match.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[judgements](#propertyjudgements-string)|[String]| |**Required**|
|[required_judgements](#propertyrequired_judgements-relatedjudgementmap96)|[[*RelatedJudgement*](#map96)]| |**Required**|
|[type](#propertytype-judgementspecificationtypestring)|JudgementSpecificationTypeString| |**Required**|


<details>

<a id="propertyjudgements-string"></a>
## Property judgements ∷ [String]

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * A URI leading to a judgement

<a id="propertyrequired_judgements-relatedjudgementmap96"></a>
## Property required_judgements ∷ [[*RelatedJudgement*](#map96)]

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map96-ref"></a>
* *RelatedJudgement* Value
  * Details: [*RelatedJudgement*](#map96)

<a id="propertytype-judgementspecificationtypestring"></a>
## Property type ∷ JudgementSpecificationTypeString

* This entry is required


  * Must equal: "Judgement"


</details>

<a id="map96"></a>
# *RelatedJudgement*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[judgement_id](#propertyjudgement_id-string)|String| |**Required**|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| |_Optional_|
|[relationship](#propertyrelationship-string)|String| |_Optional_|
|[source](#propertysource-string)|String| |_Optional_|


<details>

<a id="propertyjudgement_id-string"></a>
## Property judgement_id ∷ String

* This entry is required


  * A URI leading to a judgement

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertyrelationship-string"></a>
## Property relationship ∷ String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷ String

* This entry is optional




</details>

<a id="map90"></a>
# *KillChainPhase*

> Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

*KillChainPhase* The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)|String|The name of the kill chain.|**Required**|
|[phase_name](#propertyphase_name-string)|String|The name of the phase in the kill chain.|**Required**|


<details>

<a id="propertykill_chain_name-string"></a>
## Property kill_chain_name ∷ String

The name of the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Must equal: "lockheed-martin-cyber-kill-chain"
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)


<a id="propertyphase_name-string"></a>
## Property phase_name ∷ String

The name of the phase in the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Allowed Values:
    * actions-on-objective
    * command-and-control
    * delivery
    * exploitation
    * installation
    * reconnaissance
    * weaponization
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)



</details>

<a id="map89"></a>
# *CompositeIndicatorExpression*

> Reference: [CompositeIndicatorExpressionType](http://stixproject.github.io/data-model/1.2/indicator/CompositeIndicatorExpressionType/)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[indicator_ids](#propertyindicator_ids-string)|[String]| |**Required**|
|[operator](#propertyoperator-booleanoperatorstring)|BooleanOperatorString| |**Required**|


<details>

<a id="propertyindicator_ids-string"></a>
## Property indicator_ids ∷ [String]

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * A URI leading to an indicator

<a id="propertyoperator-booleanoperatorstring"></a>
## Property operator ∷ BooleanOperatorString

* This entry is required


  * Allowed Values:
    * and
    * not
    * or


</details>

<a id="map88"></a>
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

<a id="map87"></a>
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

<a id="map14"></a>
# *Incident*

*Incident* Discrete instance of indicators affecting an organization as well
  as information associated with incident response

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|level of confidence held in the characterization of this Incident|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[incident_time](#propertyincident_time-incidenttime)|[*IncidentTime*](#map98)|relevant time values associated with this Incident|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[status](#propertystatus-statusstring)|StatusString|current status of the incident|**Required**|
|[type](#propertytype-incidenttypeidentifierstring)|IncidentTypeIdentifierString| |**Required**|
|[assignees](#propertyassignees-shortstring)|[ShortString]|a set of owners assigned to this incident|_Optional_|
|[categories](#propertycategories-incidentcategorystring)|[IncidentCategoryString]|a set of categories for this incident|_Optional_|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[discovery_method](#propertydiscovery_method-discoverymethodstring)|DiscoveryMethodString|identifies how the incident was discovered|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap97)|[[*ExternalReference*](#map97)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[intended_effect](#propertyintended_effect-intendedeffectstring)|IntendedEffectString|specifies the suspected intended effect of this incident|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

level of confidence held in the characterization of this Incident

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

<a id="propertyincident_time-incidenttime"></a>
## Property incident_time ∷ *IncidentTime*

relevant time values associated with this Incident

* This entry is required
* Dev Notes: Was 'time'; renamed for clarity


<a id="map98-ref"></a>
* *IncidentTime* Value
  * Details: [*IncidentTime*](#map98)

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertystatus-statusstring"></a>
## Property status ∷ StatusString

current status of the incident

* This entry is required


  * Allowed Values:
    * Closed
    * Containment Achieved
    * Incident Reported
    * New
    * Open
    * Rejected
    * Restoration Achieved
    * Stalled

<a id="propertytype-incidenttypeidentifierstring"></a>
## Property type ∷ IncidentTypeIdentifierString

* This entry is required


  * Must equal: "incident"

<a id="propertyassignees-shortstring"></a>
## Property assignees ∷ [ShortString]

a set of owners assigned to this incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertycategories-incidentcategorystring"></a>
## Property categories ∷ [IncidentCategoryString]

a set of categories for this incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * Allowed Values:
    * Denial of Service
    * Exercise/Network Defense Testing
    * Improper Usage
    * Investigation
    * Malicious Code
    * Scans/Probes/Attempted Access
    * Unauthorized Access

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertydiscovery_method-discoverymethodstring"></a>
## Property discovery_method ∷ DiscoveryMethodString

identifies how the incident was discovered

* This entry is optional


  * Allowed Values:
    * Agent Disclosure
    * Antivirus
    * Audit
    * Customer
    * External - Fraud Detection
    * Financial Audit
    * HIPS
    * IT Audit
    * Incident Response
    * Internal - Fraud Detection
    * Law Enforcement
    * Log Review
    * Monitoring Service
    * NIDS
    * Security Alarm
    * Unknown
    * Unrelated Party
    * User

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap97"></a>
## Property external_references ∷ [[*ExternalReference*](#map97)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map97-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map97)

<a id="propertyintended_effect-intendedeffectstring"></a>
## Property intended_effect ∷ IntendedEffectString

specifies the suspected intended effect of this incident

* This entry is optional


  * Allowed Values:
    * Account Takeover
    * Advantage
    * Advantage - Economic
    * Advantage - Military
    * Advantage - Political
    * Brand Damage
    * Competitive Advantage
    * Degradation of Service
    * Denial and Deception
    * Destruction
    * Disruption
    * Embarrassment
    * Exposure
    * Extortion
    * Fraud
    * Harassment
    * ICS Control
    * Theft
    * Theft - Credential Theft
    * Theft - Identity Theft
    * Theft - Intellectual Property
    * Theft - Theft of Proprietary Information
    * Traffic Diversion
    * Unauthorized Access

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

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

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

<a id="map98"></a>
# *IncidentTime*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[opened](#propertyopened-datetime)|DateTime| |**Required**|
|[closed](#propertyclosed-datetime)|DateTime| |_Optional_|
|[discovered](#propertydiscovered-datetime)|DateTime| |_Optional_|
|[rejected](#propertyrejected-datetime)|DateTime| |_Optional_|
|[remediated](#propertyremediated-datetime)|DateTime| |_Optional_|
|[reported](#propertyreported-datetime)|DateTime| |_Optional_|


<details>

<a id="propertyopened-datetime"></a>
## Property opened ∷ DateTime

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyclosed-datetime"></a>
## Property closed ∷ DateTime

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertydiscovered-datetime"></a>
## Property discovered ∷ DateTime

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyrejected-datetime"></a>
## Property rejected ∷ DateTime

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyremediated-datetime"></a>
## Property remediated ∷ DateTime

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyreported-datetime"></a>
## Property reported ∷ DateTime

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.


</details>

<a id="map97"></a>
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

<a id="map13"></a>
# *Feedback*

*Feedback* Feedback on any entity.  Is it wrong?  If so why?  Was
  it right-on, and worthy of confirmation?

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[entity_id](#propertyentity_id-string)|String| |**Required**|
|[feedback](#propertyfeedback-integer)|Integer| |**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[reason](#propertyreason-string)|String| |**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#propertytype-feedbacktypeidentifierstring)|FeedbackTypeIdentifierString| |**Required**|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap99)|[[*ExternalReference*](#map99)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertyentity_id-string"></a>
## Property entity_id ∷ String

* This entry is required


  * A URI leading to an entity

<a id="propertyfeedback-integer"></a>
## Property feedback ∷ Integer

* This entry is required


  * Allowed Values:
    * -1
    * 0
    * 1

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyreason-string"></a>
## Property reason ∷ String

* This entry is required



<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertytype-feedbacktypeidentifierstring"></a>
## Property type ∷ FeedbackTypeIdentifierString

* This entry is required


  * Must equal: "feedback"

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap99"></a>
## Property external_references ∷ [[*ExternalReference*](#map99)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map99-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map99)

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

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

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

<a id="map99"></a>
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

<a id="map12"></a>
# *COA*

> Reference: [CourseOfActionType](http://stixproject.github.io/data-model/1.2/coa/CourseOfActionType/)

*COA* Course of Action. A corrective or preventative action to be taken in response to a threat

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#propertytype-coatypeidentifierstring)|COATypeIdentifierString| |**Required**|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map101)| |**Required**|
|[coa_type](#propertycoa_type-coatypestring)|COATypeString|The type of this COA|_Optional_|
|[cost](#propertycost-highmedlowstring)|HighMedLowString|Characterizes the estimated cost for applying this course of action|_Optional_|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[efficacy](#propertyefficacy-highmedlowstring)|HighMedLowString|Effectiveness of this course of action in achieving its targeted objective|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap100)|[[*ExternalReference*](#map100)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[impact](#propertyimpact-shortstring)|ShortString|Characterizes the estimated impact of applying this course of action|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[objective](#propertyobjective-shortstring)|[ShortString]|Characterizes the objective of this course of action|_Optional_|
|[open_c2_coa](#propertyopen_c2_coa-openc2coa)|[*OpenC2COA*](#map103)| |_Optional_|
|[related_COAs](#propertyrelated_coas-relatedcoamap102)|[[*RelatedCOA*](#map102)]|Identifies or characterizes relationships to one or more related courses of action|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[stage](#propertystage-coastagestring)|COAStageString|Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to|_Optional_|
|[structured_coa_type](#propertystructured_coa_type-openc2structuredcoatypestring)|OpenC2StructuredCOATypeString| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

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

<a id="propertytype-coatypeidentifierstring"></a>
## Property type ∷ COATypeIdentifierString

* This entry is required


  * Must equal: "coa"

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

* This entry is required


<a id="map101-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map101)

<a id="propertycoa_type-coatypestring"></a>
## Property coa_type ∷ COATypeString

The type of this COA

* This entry is optional


  * Allowed Values:
    * Diplomatic Actions
    * Eradication
    * Hardening
    * Internal Blocking
    * Logical Access Restrictions
    * Monitoring
    * Other
    * Patching
    * Perimeter Blocking
    * Physical Access Restrictions
    * Policy Actions
    * Public Disclosure
    * Rebuilding
    * Redirection
    * Redirection (Honey Pot)
    * Training
  * Reference: [CourseOfActionTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/CourseOfActionTypeVocab-1.0/)


<a id="propertycost-highmedlowstring"></a>
## Property cost ∷ HighMedLowString

Characterizes the estimated cost for applying this course of action

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyefficacy-highmedlowstring"></a>
## Property efficacy ∷ HighMedLowString

Effectiveness of this course of action in achieving its targeted objective

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap100"></a>
## Property external_references ∷ [[*ExternalReference*](#map100)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map100-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map100)

<a id="propertyimpact-shortstring"></a>
## Property impact ∷ ShortString

Characterizes the estimated impact of applying this course of action

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyobjective-shortstring"></a>
## Property objective ∷ [ShortString]

Characterizes the objective of this course of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Squashed / simplified


  * *ShortString* String with at most 1024 characters

<a id="propertyopen_c2_coa-openc2coa"></a>
## Property open_c2_coa ∷ *OpenC2COA*

* This entry is optional


<a id="map103-ref"></a>
* *OpenC2COA* Value
  * Details: [*OpenC2COA*](#map103)

<a id="propertyrelated_coas-relatedcoamap102"></a>
## Property related_COAs ∷ [[*RelatedCOA*](#map102)]

Identifies or characterizes relationships to one or more related courses of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map102-ref"></a>
* *RelatedCOA* Value
  * Details: [*RelatedCOA*](#map102)

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

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertystage-coastagestring"></a>
## Property stage ∷ COAStageString

Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to

* This entry is optional


  * Allowed Values:
    * Remedy
    * Response
  * Reference: [COAStageVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/COAStageVocab-1.0/)


<a id="propertystructured_coa_type-openc2structuredcoatypestring"></a>
## Property structured_coa_type ∷ OpenC2StructuredCOATypeString

* This entry is optional


  * Must equal: "openc2"

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

<a id="map103"></a>
# *OpenC2COA*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[action](#propertyaction-actiontype)|[*ActionType*](#map104)| |**Required**|
|[type](#propertytype-structuredcoatypestring)|StructuredCOATypeString| |**Required**|
|[actuator](#propertyactuator-actuatortype)|[*ActuatorType*](#map106)| |_Optional_|
|[id](#propertyid-shortstring)|ShortString| |_Optional_|
|[modifiers](#propertymodifiers-modifiertype)|[*ModifierType*](#map107)| |_Optional_|
|[target](#propertytarget-targettype)|[*TargetType*](#map105)| |_Optional_|


<details>

<a id="propertyaction-actiontype"></a>
## Property action ∷ *ActionType*

* This entry is required


<a id="map104-ref"></a>
* *ActionType* Value
  * Details: [*ActionType*](#map104)

<a id="propertytype-structuredcoatypestring"></a>
## Property type ∷ StructuredCOATypeString

* This entry is required


  * Must equal: "structured_coa"

<a id="propertyactuator-actuatortype"></a>
## Property actuator ∷ *ActuatorType*

* This entry is optional


<a id="map106-ref"></a>
* *ActuatorType* Value
  * Details: [*ActuatorType*](#map106)

<a id="propertyid-shortstring"></a>
## Property id ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertymodifiers-modifiertype"></a>
## Property modifiers ∷ *ModifierType*

* This entry is optional


<a id="map107-ref"></a>
* *ModifierType* Value
  * Details: [*ModifierType*](#map107)

<a id="propertytarget-targettype"></a>
## Property target ∷ *TargetType*

* This entry is optional


<a id="map105-ref"></a>
* *TargetType* Value
  * Details: [*TargetType*](#map105)


</details>

<a id="map107"></a>
# *ModifierType*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[additional_properties](#propertyadditional_properties-additionalproperties)|[*AdditionalProperties*](#map109)| |_Optional_|
|[delay](#propertydelay-datetime)|DateTime| |_Optional_|
|[destination](#propertydestination-string)|String| |_Optional_|
|[duration](#propertyduration-datetime)|DateTime| |_Optional_|
|[frequency](#propertyfrequency-shortstring)|ShortString| |_Optional_|
|[id](#propertyid-shortstring)|ShortString| |_Optional_|
|[location](#propertylocation-string)|String| |_Optional_|
|[method](#propertymethod-string)|[String]| |_Optional_|
|[option](#propertyoption-shortstring)|ShortString| |_Optional_|
|[response](#propertyresponse-string)|String| |_Optional_|
|[search](#propertysearch-string)|String| |_Optional_|
|[source](#propertysource-shortstring)|ShortString| |_Optional_|
|[time](#propertytime-validtime)|[*ValidTime*](#map108)| |_Optional_|


<details>

<a id="propertyadditional_properties-additionalproperties"></a>
## Property additional_properties ∷ *AdditionalProperties*

* This entry is optional


<a id="map109-ref"></a>
* *AdditionalProperties* Value
  * Details: [*AdditionalProperties*](#map109)

<a id="propertydelay-datetime"></a>
## Property delay ∷ DateTime

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertydestination-string"></a>
## Property destination ∷ String

* This entry is optional


  * Allowed Values:
    * copy-to
    * modify-to
    * move-to
    * report-to
    * restore-point
    * save-to
    * set-to

<a id="propertyduration-datetime"></a>
## Property duration ∷ DateTime

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyfrequency-shortstring"></a>
## Property frequency ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyid-shortstring"></a>
## Property id ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylocation-string"></a>
## Property location ∷ String

* This entry is optional


  * Allowed Values:
    * internal
    * perimeter

<a id="propertymethod-string"></a>
## Property method ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * Allowed Values:
    * acl
    * authenticated
    * blackhole
    * blacklist
    * graceful
    * hibernate
    * honeypot
    * immediate
    * segmentation
    * spawn
    * suspend
    * unauthenticated
    * whitelist

<a id="propertyoption-shortstring"></a>
## Property option ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyresponse-string"></a>
## Property response ∷ String

* This entry is optional


  * Allowed Values:
    * acknowledge
    * command-ref
    * query
    * status

<a id="propertysearch-string"></a>
## Property search ∷ String

* This entry is optional


  * Allowed Values:
    * cve
    * patch
    * signature
    * vendor_bulletin

<a id="propertysource-shortstring"></a>
## Property source ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-validtime"></a>
## Property time ∷ *ValidTime*

* This entry is optional


<a id="map108-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map108)


</details>

<a id="map109"></a>
# *AdditionalProperties*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[context](#propertycontext-shortstring)|ShortString| |**Required**|


<details>

<a id="propertycontext-shortstring"></a>
## Property context ∷ ShortString

* This entry is required


  * *ShortString* String with at most 1024 characters


</details>

<a id="map108"></a>
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

<a id="map106"></a>
# *ActuatorType*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-actuatortypestring)|ActuatorTypeString| |**Required**|
|[specifiers](#propertyspecifiers-shortstring)|[ShortString]|list of additional properties describing the actuator|_Optional_|


<details>

<a id="propertytype-actuatortypestring"></a>
## Property type ∷ ActuatorTypeString

* This entry is required


  * Allowed Values:
    * endpoint
    * endpoint.digital-telephone-handset
    * endpoint.laptop
    * endpoint.pos-terminal
    * endpoint.printer
    * endpoint.sensor
    * endpoint.server
    * endpoint.smart-meter
    * endpoint.smart-phone
    * endpoint.tablet
    * endpoint.workstation
    * network
    * network.bridge
    * network.firewall
    * network.gateway
    * network.guard
    * network.hips
    * network.hub
    * network.ids
    * network.ips
    * network.modem
    * network.nic
    * network.proxy
    * network.router
    * network.security_manager
    * network.sense_making
    * network.sensor
    * network.switch
    * network.vpn
    * network.wap
    * other
    * process
    * process.aaa-server
    * process.anti-virus-scanner
    * process.connection-scanner
    * process.directory-service
    * process.dns-server
    * process.email-service
    * process.file-scanner
    * process.location-service
    * process.network-scanner
    * process.remediation-service
    * process.reputation-service
    * process.sandbox
    * process.virtualization-service
    * process.vulnerability-scanner

<a id="propertyspecifiers-shortstring"></a>
## Property specifiers ∷ [ShortString]

list of additional properties describing the actuator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters


</details>

<a id="map105"></a>
# *TargetType*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-shortstring)|ShortString| |**Required**|
|[specifiers](#propertyspecifiers-shortstring)|ShortString|Cybox object representing the target|_Optional_|


<details>

<a id="propertytype-shortstring"></a>
## Property type ∷ ShortString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyspecifiers-shortstring"></a>
## Property specifiers ∷ ShortString

Cybox object representing the target

* This entry is optional


  * *ShortString* String with at most 1024 characters


</details>

<a id="map104"></a>
# *ActionType*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-coatypestring)|COATypeString| |**Required**|


<details>

<a id="propertytype-coatypestring"></a>
## Property type ∷ COATypeString

* This entry is required


  * Allowed Values:
    * alert
    * allow
    * augment
    * contain
    * delete
    * deny
    * detonate
    * distill
    * get
    * investigate
    * locate
    * mitigate
    * modify
    * move
    * notify
    * other
    * pause
    * query
    * redirect
    * remediate
    * report
    * response
    * restart
    * restore
    * resume
    * save
    * scan
    * set
    * snapshot
    * start
    * stop
    * substitute
    * sync
    * throttle
    * update
  * Reference: [OpenC2/STIX COA XML schema](https://github.com/OpenC2-org/subgroup-stix/blob/master/schema/openc2_stix_coa.xsd)



</details>

<a id="map102"></a>
# *RelatedCOA*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[COA_id](#propertycoa_id-string)|String| |**Required**|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| |_Optional_|
|[relationship](#propertyrelationship-string)|String| |_Optional_|
|[source](#propertysource-string)|String| |_Optional_|


<details>

<a id="propertycoa_id-string"></a>
## Property COA_id ∷ String

* This entry is required


  * A URI leading to a COA

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertyrelationship-string"></a>
## Property relationship ∷ String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷ String

* This entry is optional




</details>

<a id="map101"></a>
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

<a id="map100"></a>
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

<a id="map11"></a>
# *Campaign*

> Reference: [CampaignType](http://stixproject.github.io/data-model/1.2/campaign/CampaignType/)

*Campaign* Represents a campaign by an [actor](actor.md) pursing an intent

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[campaign_type](#propertycampaign_type-shortstring)|ShortString| |**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|**Required**|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|**Required**|
|[type](#propertytype-campaigntypeidentifierstring)|CampaignTypeIdentifierString| |**Required**|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map111)|Timestamp for the definition of a specific version of a campaign|**Required**|
|[activity](#propertyactivity-activitymap112)|[[*Activity*](#map112)]|Actions taken in regards to this Campaign|_Optional_|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|Level of confidence held in the characterization of this Campaign|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap110)|[[*ExternalReference*](#map110)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[intended_effect](#propertyintended_effect-intendedeffectstring)|[IntendedEffectString]|Characterizes the intended effect of this cyber threat campaign|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[names](#propertynames-shortstring)|[ShortString]|Names used to identify this campaign|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[status](#propertystatus-campaignstatusstring)|CampaignStatusString|Status of this Campaign|_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertycampaign_type-shortstring"></a>
## Property campaign_type ∷ ShortString

* This entry is required
* Dev Notes: Should we define a vocabulary for this?


  * *ShortString* String with at most 1024 characters

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

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

<a id="propertyshort_description-medstring"></a>
## Property short_description ∷ MedString

A single line, short summary of the object.

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertytitle-shortstring"></a>
## Property title ∷ ShortString

A short title for this object, used as primary display and reference value

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertytype-campaigntypeidentifierstring"></a>
## Property type ∷ CampaignTypeIdentifierString

* This entry is required


  * Must equal: "campaign"

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

Timestamp for the definition of a specific version of a campaign

* This entry is required


<a id="map111-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map111)

<a id="propertyactivity-activitymap112"></a>
## Property activity ∷ [[*Activity*](#map112)]

Actions taken in regards to this Campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map112-ref"></a>
* *Activity* Value
  * Details: [*Activity*](#map112)

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

Level of confidence held in the characterization of this Campaign

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap110"></a>
## Property external_references ∷ [[*ExternalReference*](#map110)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map110-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map110)

<a id="propertyintended_effect-intendedeffectstring"></a>
## Property intended_effect ∷ [IntendedEffectString]

Characterizes the intended effect of this cyber threat campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * Allowed Values:
    * Account Takeover
    * Advantage
    * Advantage - Economic
    * Advantage - Military
    * Advantage - Political
    * Brand Damage
    * Competitive Advantage
    * Degradation of Service
    * Denial and Deception
    * Destruction
    * Disruption
    * Embarrassment
    * Exposure
    * Extortion
    * Fraud
    * Harassment
    * ICS Control
    * Theft
    * Theft - Credential Theft
    * Theft - Identity Theft
    * Theft - Intellectual Property
    * Theft - Theft of Proprietary Information
    * Traffic Diversion
    * Unauthorized Access

<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertynames-shortstring"></a>
## Property names ∷ [ShortString]

Names used to identify this campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertystatus-campaignstatusstring"></a>
## Property status ∷ CampaignStatusString

Status of this Campaign

* This entry is optional


  * Allowed Values:
    * Future
    * Historic
    * Ongoing

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

<a id="map112"></a>
# *Activity*

> Reference: [ActivityType](http://stixproject.github.io/data-model/1.2/stixCommon/ActivityType/)

*Activity* What happend, when?

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[date_time](#propertydate_time-datetime)|DateTime|Specifies the date and time at which the activity occured|**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of the activity|**Required**|


<details>

<a id="propertydate_time-datetime"></a>
## Property date_time ∷ DateTime

Specifies the date and time at which the activity occured

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of the activity

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters


</details>

<a id="map111"></a>
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

<a id="map110"></a>
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

<a id="map10"></a>
# *AttackPattern*

> Reference: [Attack Pattern](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/pub#h.axjijf603msy)

*AttackPattern* Attack Patterns are a type of TTP that describe ways that adversaries attempt to compromise targets.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|**Required**|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|**Required**|
|[type](#propertytype-attackpatterntypeidentifierstring)|AttackPatternTypeIdentifierString| |**Required**|
|[abstraction_level](#propertyabstraction_level-attackpatternabstractionsstring)|AttackPatternAbstractionsString|The CAPEC abstraction level for patterns describing techniques to attack a system.|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap114)|[[*ExternalReference*](#map114)]|A list of external references which refer to non-STIX information. This property MAY be used to provide one or more Attack Pattern identifiers, such as a CAPEC ID. When specifying a CAPEC ID, the source_name property of the external reference MUST be set to capec and the external_id property MUST be formatted as CAPEC-[id].|_Optional_|
|[kill_chain_phases](#propertykill_chain_phases-killchainphasemap115)|[[*KillChainPhase*](#map115)]|The list of Kill Chain Phases for which this Attack Pattern is used.|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|
|[x_mitre_contributors](#propertyx_mitre_contributors-shortstring)|[ShortString]|ATT&CK Technique.Contributors|_Optional_|
|[x_mitre_data_sources](#propertyx_mitre_data_sources-shortstring)|[ShortString]|ATT&CK Technique.Data Sources|_Optional_|
|[x_mitre_platforms](#propertyx_mitre_platforms-shortstring)|[ShortString]|ATT&CK Technique.Platforms|_Optional_|


<details>

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

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

<a id="propertyshort_description-medstring"></a>
## Property short_description ∷ MedString

A single line, short summary of the object.

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertytitle-shortstring"></a>
## Property title ∷ ShortString

A short title for this object, used as primary display and reference value

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertytype-attackpatterntypeidentifierstring"></a>
## Property type ∷ AttackPatternTypeIdentifierString

* This entry is required


  * Must equal: "attack-pattern"

<a id="propertyabstraction_level-attackpatternabstractionsstring"></a>
## Property abstraction_level ∷ AttackPatternAbstractionsString

The CAPEC abstraction level for patterns describing techniques to attack a system.

* This entry is optional


  * *AttackPatternAbstractions* Abstraction levels corresponding to CAPEC data describing attack-pattern objects.
  * Allowed Values:
    * aggregate
    * category
    * detailed
    * meta
    * standard
  * Reference: [Common Attack Pattern Enumeration and Classification](https://capec.mitre.org)


<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap114"></a>
## Property external_references ∷ [[*ExternalReference*](#map114)]

A list of external references which refer to non-STIX information. This property MAY be used to provide one or more Attack Pattern identifiers, such as a CAPEC ID. When specifying a CAPEC ID, the source_name property of the external reference MUST be set to capec and the external_id property MUST be formatted as CAPEC-[id].

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map114-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map114)

<a id="propertykill_chain_phases-killchainphasemap115"></a>
## Property kill_chain_phases ∷ [[*KillChainPhase*](#map115)]

The list of Kill Chain Phases for which this Attack Pattern is used.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map115-ref"></a>
* *KillChainPhase* Value
  * Details: [*KillChainPhase*](#map115)

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

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

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

<a id="propertyx_mitre_contributors-shortstring"></a>
## Property x_mitre_contributors ∷ [ShortString]

ATT&CK Technique.Contributors

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertyx_mitre_data_sources-shortstring"></a>
## Property x_mitre_data_sources ∷ [ShortString]

ATT&CK Technique.Data Sources

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertyx_mitre_platforms-shortstring"></a>
## Property x_mitre_platforms ∷ [ShortString]

ATT&CK Technique.Platforms

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters


</details>

<a id="map115"></a>
# *KillChainPhase*

> Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

*KillChainPhase* The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)|String|The name of the kill chain.|**Required**|
|[phase_name](#propertyphase_name-string)|String|The name of the phase in the kill chain.|**Required**|


<details>

<a id="propertykill_chain_name-string"></a>
## Property kill_chain_name ∷ String

The name of the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Must equal: "lockheed-martin-cyber-kill-chain"
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)


<a id="propertyphase_name-string"></a>
## Property phase_name ∷ String

The name of the phase in the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Allowed Values:
    * actions-on-objective
    * command-and-control
    * delivery
    * exploitation
    * installation
    * reconnaissance
    * weaponization
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)



</details>

<a id="map114"></a>
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

<a id="map113"></a>
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

<a id="map9"></a>
# *AssetProperties*

> Reference: [AssetProperties](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#assetproperties)

*AssetProperties* Assets do not have any product specific properties, those are represented in AssetProperties - which is a record that asserts one or more properties of an Asset for a specific time.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[asset_ref](#propertyasset_ref-string)|String|URI that points to the associated Asset.|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[source](#propertysource-medstring)|MedString| |**Required**|
|[type](#propertytype-assetpropertiestypeidentifierstring)|AssetPropertiesTypeIdentifierString| |**Required**|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map117)|The time range during which the AssetProperties is considered valid.|**Required**|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap116)|[[*ExternalReference*](#map116)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[properties](#propertyproperties-assetpropertymap118)|[[*AssetProperty*](#map118)]| |_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertyasset_ref-string"></a>
## Property asset_ref ∷ String

URI that points to the associated Asset.

* This entry is required


  * A URI leading to an entity

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

<a id="propertytype-assetpropertiestypeidentifierstring"></a>
## Property type ∷ AssetPropertiesTypeIdentifierString

* This entry is required


  * Must equal: "asset-properties"

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

The time range during which the AssetProperties is considered valid.

* This entry is required


<a id="map117-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map117)

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap116"></a>
## Property external_references ∷ [[*ExternalReference*](#map116)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map116-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map116)

<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyproperties-assetpropertymap118"></a>
## Property properties ∷ [[*AssetProperty*](#map118)]

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map118-ref"></a>
* *AssetProperty* Value
  * Details: [*AssetProperty*](#map118)

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

<a id="map118"></a>
# *AssetProperty*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[name](#propertyname-string)|String|The properties are an open vocabulary.|**Required**|
|[value](#propertyvalue-string)|String| |**Required**|


<details>

<a id="propertyname-string"></a>
## Property name ∷ String

The properties are an open vocabulary.

* This entry is required
* Dev Notes: The properties are an open vocabulary, meaning that there is a defined set of values, but users may add their own values.See: https://github.com/threatgrid/ctim/blob/master/src/ctim/schemas/identity_assertion.cljc#L11



<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required




</details>

<a id="map117"></a>
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

<a id="map116"></a>
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

<a id="map8"></a>
# *AssetMapping*

> Reference: [AssetMapping](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#assetmapping)

*AssetMapping* a record that a specific Observable maps to an Asset for a specific time period.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[asset_ref](#propertyasset_ref-string)|String|URI that points to the mapped Asset.|**Required**|
|[asset_type](#propertyasset_type-assettypestring)|AssetTypeString|Type of the mapped Asset: Device, Person, Application, etc.|**Required**|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|Level of confidence held in the characterization of this AssetMapping e.g.: is it susceptible to manipulation or translation?|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[observable](#propertyobservable-observable)|[*Observable*](#map121)|An AssetMapping is a record that a specific Observable maps to an Asset for an indicated period of time.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[source](#propertysource-medstring)|MedString| |**Required**|
|[specificity](#propertyspecificity-specificitystring)|SpecificityString|Denotes the level of how many assets potentially could have this same identifier.|**Required**|
|[stability](#propertystability-stabilitystring)|StabilityString|Do we manage when it changes, or is it always a time bound assignment?|**Required**|
|[type](#propertytype-assetmappingtypeidentifierstring)|AssetMappingTypeIdentifierString| |**Required**|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map120)|For each asset, we allow for the assertion of time bound properties.This gives us both a record of the current state of the asset,as well as history.|**Required**|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap119)|[[*ExternalReference*](#map119)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
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


<a id="map121-ref"></a>
* *Observable* Value
  * Details: [*Observable*](#map121)

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


<a id="map120-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map120)

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap119"></a>
## Property external_references ∷ [[*ExternalReference*](#map119)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map119-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map119)

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

<a id="map121"></a>
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

<a id="map120"></a>
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

<a id="map119"></a>
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

<a id="map7"></a>
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
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map123)|The time range during which the Asset is considered valid.|**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap122)|[[*ExternalReference*](#map122)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
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


<a id="map123-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map123)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap122"></a>
## Property external_references ∷ [[*ExternalReference*](#map122)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map122-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map122)

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

<a id="map123"></a>
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

<a id="map122"></a>
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

<a id="map6"></a>
# *Actor*

> Reference: [ThreatActorType](http://stixproject.github.io/data-model/1.2/ta/ThreatActorType/)

*Actor* Describes malicious actors (or adversaries) related to a cyber attack

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[actor_type](#propertyactor_type-threatactortypestring)|ThreatActorTypeString| |**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|**Required**|
|[source](#propertysource-medstring)|MedString| |**Required**|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|**Required**|
|[type](#propertytype-actortypeidentifierstring)|ActorTypeIdentifierString| |**Required**|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map125)| |**Required**|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| |_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap124)|[[*ExternalReference*](#map124)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[identity](#propertyidentity-identity)|[*Identity*](#map126)| |_Optional_|
|[intended_effect](#propertyintended_effect-intendedeffectstring)|IntendedEffectString| |_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[motivation](#propertymotivation-motivationstring)|MotivationString| |_Optional_|
|[planning_and_operational_support](#propertyplanning_and_operational_support-longstring)|LongString| |_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[sophistication](#propertysophistication-sophisticationstring)|SophisticationString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertyactor_type-threatactortypestring"></a>
## Property actor_type ∷ ThreatActorTypeString

* This entry is required


  * Allowed Values:
    * Cyber Espionage Operations
    * Disgruntled Customer / User
    * Hacker
    * Hacker - Black hat
    * Hacker - Gray hat
    * Hacker - White hat
    * Hacktivist
    * Insider Threat
    * State Actor / Agency
    * eCrime Actor - Credential Theft Botnet Operator
    * eCrime Actor - Credential Theft Botnet Service
    * eCrime Actor - Malware Developer
    * eCrime Actor - Money Laundering Network
    * eCrime Actor - Organized Crime Actor
    * eCrime Actor - Spam Service
    * eCrime Actor - Traffic Service
    * eCrime Actor - Underground Call Service

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

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

<a id="propertyshort_description-medstring"></a>
## Property short_description ∷ MedString

A single line, short summary of the object.

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertytitle-shortstring"></a>
## Property title ∷ ShortString

A short title for this object, used as primary display and reference value

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertytype-actortypeidentifierstring"></a>
## Property type ∷ ActorTypeIdentifierString

* This entry is required


  * Must equal: "actor"

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

* This entry is required


<a id="map125-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map125)

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap124"></a>
## Property external_references ∷ [[*ExternalReference*](#map124)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map124-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map124)

<a id="propertyidentity-identity"></a>
## Property identity ∷ *Identity*

* This entry is optional


<a id="map126-ref"></a>
* *Identity* Value
  * Details: [*Identity*](#map126)

<a id="propertyintended_effect-intendedeffectstring"></a>
## Property intended_effect ∷ IntendedEffectString

* This entry is optional


  * Allowed Values:
    * Account Takeover
    * Advantage
    * Advantage - Economic
    * Advantage - Military
    * Advantage - Political
    * Brand Damage
    * Competitive Advantage
    * Degradation of Service
    * Denial and Deception
    * Destruction
    * Disruption
    * Embarrassment
    * Exposure
    * Extortion
    * Fraud
    * Harassment
    * ICS Control
    * Theft
    * Theft - Credential Theft
    * Theft - Identity Theft
    * Theft - Intellectual Property
    * Theft - Theft of Proprietary Information
    * Traffic Diversion
    * Unauthorized Access

<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertymotivation-motivationstring"></a>
## Property motivation ∷ MotivationString

* This entry is optional


  * Allowed Values:
    * Ego
    * Financial or Economic
    * Ideological
    * Ideological - Anti-Corruption
    * Ideological - Anti-Establishment
    * Ideological - Environmental
    * Ideological - Ethnic / Nationalist
    * Ideological - Human Rights
    * Ideological - Information Freedom
    * Ideological - Religious
    * Ideological - Security Awareness
    * Military
    * Opportunistic
    * Political

<a id="propertyplanning_and_operational_support-longstring"></a>
## Property planning_and_operational_support ∷ LongString

* This entry is optional


  * *LongString* String with at most 5000 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertysophistication-sophisticationstring"></a>
## Property sophistication ∷ SophisticationString

* This entry is optional


  * Allowed Values:
    * Aspirant
    * Expert
    * Innovator
    * Novice
    * Practitioner

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

<a id="map126"></a>
# *Identity*

> Reference: [IdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/)

*Identity* Describes a person or an organization

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString| |**Required**|
|[related_identities](#propertyrelated_identities-relatedidentitymap127)|[[*RelatedIdentity*](#map127)]|Identifies other entity Identities related to this Identity|**Required**|


<details>

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyrelated_identities-relatedidentitymap127"></a>
## Property related_identities ∷ [[*RelatedIdentity*](#map127)]

Identifies other entity Identities related to this Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map127-ref"></a>
* *RelatedIdentity* Value
  * Details: [*RelatedIdentity*](#map127)


</details>

<a id="map127"></a>
# *RelatedIdentity*

> Reference: [RelatedIdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/)

*RelatedIdentity* Describes a related Identity

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[identity](#propertyidentity-string)|String|The reference (URI) of the related Identity object|**Required**|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|Specifies the level of confidence in the assertion of the relationship between the two objects|_Optional_|
|[information_source](#propertyinformation_source-string)|String|Specifies the source of the information about the relationship between the two components|_Optional_|
|[relationship](#propertyrelationship-string)|String| |_Optional_|


<details>

<a id="propertyidentity-string"></a>
## Property identity ∷ String

The reference (URI) of the related Identity object

* This entry is required


  * A URI

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

Specifies the level of confidence in the assertion of the relationship between the two objects

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertyinformation_source-string"></a>
## Property information_source ∷ String

Specifies the source of the information about the relationship between the two components

* This entry is optional



<a id="propertyrelationship-string"></a>
## Property relationship ∷ String

* This entry is optional




</details>

<a id="map125"></a>
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

<a id="map124"></a>
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

<a id="map5"></a>
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

<a id="map4"></a>
# *Text*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[text](#propertytext-string)|String| |**Required**|
|[type](#propertytype-string)|String| |**Required**|


<details>

<a id="propertytext-string"></a>
## Property text ∷ String

* This entry is required



<a id="propertytype-string"></a>
## Property type ∷ String

* This entry is required




</details>
