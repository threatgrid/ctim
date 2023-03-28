<a id="top"></a>
# *Casebook* Object

*Casebook* Describes a CTIM Casebook which works like a structured gist

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-casebooktypeidentifierstring)|CasebookTypeIdentifierString| |&#10003;|
|[bundle](#propertybundle-bundleobject)|*Bundle* Object| ||
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[observables](#propertyobservables-observableobjectlist)|*Observable* Object List| ||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[texts](#propertytexts-textobjectlist)|*Text* Object List| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: #

<a id="propertybundle-bundleobject"></a>
## Property bundle ∷ *Bundle* Object

* This entry is optional


<a id="map3-ref"></a>
* *Bundle* Object Value
  * Details: [*Bundle* Object](#map3)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map1-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map1)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyobservables-observableobjectlist"></a>
## Property observables ∷ *Observable* Object List

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map2-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map2)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytexts-textobjectlist"></a>
## Property texts ∷ *Text* Object List

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map4-ref"></a>
* *Text* Object Value
  * Details: [*Text* Object](#map4)

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

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

<a id="propertytype-casebooktypeidentifierstring"></a>
## Property type ∷ CasebookTypeIdentifierString

* This entry is required


  * Must equal: "casebook"

<a id="map1"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map2"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
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
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map3"></a>
# *Bundle* Object

*Bundle* Describes a Bundle of any set of CTIM entities

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[source](#propertysource-medstringstring)|MedStringString| |&#10003;|
|[type](#propertytype-bundletypeidentifierstring)|BundleTypeIdentifierString| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[actor_refs](#propertyactor_refs-string)|#{String}| ||
|[actors](#propertyactors-actorobject)|#{*Actor* Object}|a list of `Actor`||
|[asset_mapping_refs](#propertyasset_mapping_refs-string)|#{String}| ||
|[asset_mappings](#propertyasset_mappings-assetmappingobject)|#{*AssetMapping* Object}|a list of `AssetMapping`||
|[asset_properties](#propertyasset_properties-assetpropertiesobject)|#{*AssetProperties* Object}|a list of `AssetProperties`||
|[asset_properties_refs](#propertyasset_properties_refs-string)|#{String}| ||
|[asset_refs](#propertyasset_refs-string)|#{String}| ||
|[assets](#propertyassets-assetobject)|#{*Asset* Object}|a list of `Asset`||
|[attack_pattern_refs](#propertyattack_pattern_refs-string)|#{String}| ||
|[attack_patterns](#propertyattack_patterns-attackpatternobject)|#{*AttackPattern* Object}|a list of `AttackPattern`||
|[campaign_refs](#propertycampaign_refs-string)|#{String}| ||
|[campaigns](#propertycampaigns-campaignobject)|#{*Campaign* Object}|a list of `Campaign`||
|[coa_refs](#propertycoa_refs-string)|#{String}| ||
|[coas](#propertycoas-coaobject)|#{*COA* Object}|a list of `COA`||
|[data_table_refs](#propertydata_table_refs-string)|#{String}| ||
|[data_tables](#propertydata_tables-datatableobject)|#{*DataTable* Object}|a list of `DataTable`||
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[feedback_refs](#propertyfeedback_refs-string)|#{String}| ||
|[feedbacks](#propertyfeedbacks-feedbackobject)|#{*Feedback* Object}|a list of `Feedback`||
|[identity_assertion_refs](#propertyidentity_assertion_refs-string)|#{String}| ||
|[identity_assertions](#propertyidentity_assertions-identityassertionobject)|#{*IdentityAssertion* Object}|a list of `IdentityAssertion`||
|[incident_refs](#propertyincident_refs-string)|#{String}| ||
|[incidents](#propertyincidents-incidentobject)|#{*Incident* Object}|a list of `Incident`||
|[indicator_refs](#propertyindicator_refs-string)|#{String}| ||
|[indicators](#propertyindicators-indicatorobject)|#{*Indicator* Object}|a list of `Indicator`||
|[judgement_refs](#propertyjudgement_refs-string)|#{String}| ||
|[judgements](#propertyjudgements-judgementobject)|#{*Judgement* Object}|a list of `Judgement`||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[malware_refs](#propertymalware_refs-string)|#{String}| ||
|[malwares](#propertymalwares-malwareobject)|#{*Malware* Object}|a list of `Malware`||
|[note_refs](#propertynote_refs-string)|#{String}| ||
|[notes](#propertynotes-noteobject)|#{*Note* Object}|a list of `Note`||
|[relationship_refs](#propertyrelationship_refs-string)|#{String}| ||
|[relationships](#propertyrelationships-relationshipobject)|#{*Relationship* Object}|a list of `Relationship`||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[sighting_refs](#propertysighting_refs-string)|#{String}| ||
|[sightings](#propertysightings-sightingobject)|#{*Sighting* Object}|a list of `Sighting`||
|[source_uri](#propertysource_uri-string)|String| ||
|[target_record_refs](#propertytarget_record_refs-string)|#{String}| ||
|[target_records](#propertytarget_records-targetrecordobject)|#{*TargetRecord* Object}|a list of `TargetRecord`||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||
|[tool_refs](#propertytool_refs-string)|#{String}| ||
|[tools](#propertytools-toolobject)|#{*Tool* Object}|a list of `Tool`||
|[verdict_refs](#propertyverdict_refs-string)|#{String}| ||
|[verdicts](#propertyverdicts-verdictobject)|#{*Verdict* Object}|a list of `Verdict`||
|[vulnerabilities](#propertyvulnerabilities-vulnerabilityobject)|#{*Vulnerability* Object}|a list of `Vulnerability`||
|[vulnerability_refs](#propertyvulnerability_refs-string)|#{String}| ||
|[weakness_refs](#propertyweakness_refs-string)|#{String}| ||
|[weaknesses](#propertyweaknesses-weaknessobject)|#{*Weakness* Object}|a list of `Weakness`||

* Reference: #

<a id="propertyactor_refs-string"></a>
## Property actor_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyactors-actorobject"></a>
## Property actors ∷ #{*Actor* Object}

a list of `Actor`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map6-ref"></a>
* *Actor* Object Value
  * Details: [*Actor* Object](#map6)

<a id="propertyasset_mapping_refs-string"></a>
## Property asset_mapping_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyasset_mappings-assetmappingobject"></a>
## Property asset_mappings ∷ #{*AssetMapping* Object}

a list of `AssetMapping`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map8-ref"></a>
* *AssetMapping* Object Value
  * Details: [*AssetMapping* Object](#map8)

<a id="propertyasset_properties-assetpropertiesobject"></a>
## Property asset_properties ∷ #{*AssetProperties* Object}

a list of `AssetProperties`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map9-ref"></a>
* *AssetProperties* Object Value
  * Details: [*AssetProperties* Object](#map9)

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

<a id="propertyassets-assetobject"></a>
## Property assets ∷ #{*Asset* Object}

a list of `Asset`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map7-ref"></a>
* *Asset* Object Value
  * Details: [*Asset* Object](#map7)

<a id="propertyattack_pattern_refs-string"></a>
## Property attack_pattern_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyattack_patterns-attackpatternobject"></a>
## Property attack_patterns ∷ #{*AttackPattern* Object}

a list of `AttackPattern`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map10-ref"></a>
* *AttackPattern* Object Value
  * Details: [*AttackPattern* Object](#map10)

<a id="propertycampaign_refs-string"></a>
## Property campaign_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertycampaigns-campaignobject"></a>
## Property campaigns ∷ #{*Campaign* Object}

a list of `Campaign`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map11-ref"></a>
* *Campaign* Object Value
  * Details: [*Campaign* Object](#map11)

<a id="propertycoa_refs-string"></a>
## Property coa_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertycoas-coaobject"></a>
## Property coas ∷ #{*COA* Object}

a list of `COA`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map12-ref"></a>
* *COA* Object Value
  * Details: [*COA* Object](#map12)

<a id="propertydata_table_refs-string"></a>
## Property data_table_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertydata_tables-datatableobject"></a>
## Property data_tables ∷ #{*DataTable* Object}

a list of `DataTable`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map25-ref"></a>
* *DataTable* Object Value
  * Details: [*DataTable* Object](#map25)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map5-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map5)

<a id="propertyfeedback_refs-string"></a>
## Property feedback_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyfeedbacks-feedbackobject"></a>
## Property feedbacks ∷ #{*Feedback* Object}

a list of `Feedback`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map13-ref"></a>
* *Feedback* Object Value
  * Details: [*Feedback* Object](#map13)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyidentity_assertion_refs-string"></a>
## Property identity_assertion_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyidentity_assertions-identityassertionobject"></a>
## Property identity_assertions ∷ #{*IdentityAssertion* Object}

a list of `IdentityAssertion`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map21-ref"></a>
* *IdentityAssertion* Object Value
  * Details: [*IdentityAssertion* Object](#map21)

<a id="propertyincident_refs-string"></a>
## Property incident_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyincidents-incidentobject"></a>
## Property incidents ∷ #{*Incident* Object}

a list of `Incident`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map14-ref"></a>
* *Incident* Object Value
  * Details: [*Incident* Object](#map14)

<a id="propertyindicator_refs-string"></a>
## Property indicator_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyindicators-indicatorobject"></a>
## Property indicators ∷ #{*Indicator* Object}

a list of `Indicator`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map15-ref"></a>
* *Indicator* Object Value
  * Details: [*Indicator* Object](#map15)

<a id="propertyjudgement_refs-string"></a>
## Property judgement_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyjudgements-judgementobject"></a>
## Property judgements ∷ #{*Judgement* Object}

a list of `Judgement`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map16-ref"></a>
* *Judgement* Object Value
  * Details: [*Judgement* Object](#map16)

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertymalware_refs-string"></a>
## Property malware_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertymalwares-malwareobject"></a>
## Property malwares ∷ #{*Malware* Object}

a list of `Malware`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map17-ref"></a>
* *Malware* Object Value
  * Details: [*Malware* Object](#map17)

<a id="propertynote_refs-string"></a>
## Property note_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertynotes-noteobject"></a>
## Property notes ∷ #{*Note* Object}

a list of `Note`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map18-ref"></a>
* *Note* Object Value
  * Details: [*Note* Object](#map18)

<a id="propertyrelationship_refs-string"></a>
## Property relationship_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyrelationships-relationshipobject"></a>
## Property relationships ∷ #{*Relationship* Object}

a list of `Relationship`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map19-ref"></a>
* *Relationship* Object Value
  * Details: [*Relationship* Object](#map19)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysighting_refs-string"></a>
## Property sighting_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertysightings-sightingobject"></a>
## Property sightings ∷ #{*Sighting* Object}

a list of `Sighting`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map20-ref"></a>
* *Sighting* Object Value
  * Details: [*Sighting* Object](#map20)

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytarget_record_refs-string"></a>
## Property target_record_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertytarget_records-targetrecordobject"></a>
## Property target_records ∷ #{*TargetRecord* Object}

a list of `TargetRecord`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map22-ref"></a>
* *TargetRecord* Object Value
  * Details: [*TargetRecord* Object](#map22)

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

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

<a id="propertytools-toolobject"></a>
## Property tools ∷ #{*Tool* Object}

a list of `Tool`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map23-ref"></a>
* *Tool* Object Value
  * Details: [*Tool* Object](#map23)

<a id="propertytype-bundletypeidentifierstring"></a>
## Property type ∷ BundleTypeIdentifierString

* This entry is required


  * Must equal: "bundle"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map28-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map28)

<a id="propertyverdict_refs-string"></a>
## Property verdict_refs ∷ #{String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyverdicts-verdictobject"></a>
## Property verdicts ∷ #{*Verdict* Object}

a list of `Verdict`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map24-ref"></a>
* *Verdict* Object Value
  * Details: [*Verdict* Object](#map24)

<a id="propertyvulnerabilities-vulnerabilityobject"></a>
## Property vulnerabilities ∷ #{*Vulnerability* Object}

a list of `Vulnerability`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map27-ref"></a>
* *Vulnerability* Object Value
  * Details: [*Vulnerability* Object](#map27)

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

<a id="propertyweaknesses-weaknessobject"></a>
## Property weaknesses ∷ #{*Weakness* Object}

a list of `Weakness`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map26-ref"></a>
* *Weakness* Object Value
  * Details: [*Weakness* Object](#map26)

<a id="map28"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map27"></a>
# *Vulnerability* Object

*Vulnerability* a mistake in software that can be directly used by a hacker to gain access to a system or network

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|A description that provides more details and context about the Vulnerability, potentially including its purpose and its key characteristics.|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-vulnerabilitytypeidentifierstring)|VulnerabilityTypeIdentifierString|The fixed value vulnerability|&#10003;|
|[configurations](#propertyconfigurations-configurationsobject)|*Configurations* Object| ||
|[cve](#propertycve-cveobject)|*CVE* Object| ||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[impact](#propertyimpact-vulnerabilityimpactobject)|*VulnerabilityImpact* Object| ||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[last_modified_date](#propertylast_modified_date-instdate)|Inst (Date)| ||
|[published_date](#propertypublished_date-instdate)|Inst (Date)| ||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [Vulnerability](http://docs.oasis-open.org/cti/stix/v2.0/cs01/part2-stix-objects/stix-v2.0-cs01-part2-stix-objects.html#_Toc496714334)

<a id="propertyconfigurations-configurationsobject"></a>
## Property configurations ∷ *Configurations* Object

* This entry is optional


<a id="map32-ref"></a>
* *Configurations* Object Value
  * Details: [*Configurations* Object](#map32)

<a id="propertycve-cveobject"></a>
## Property cve ∷ *CVE* Object

* This entry is optional


<a id="map30-ref"></a>
* *CVE* Object Value
  * Details: [*CVE* Object](#map30)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description that provides more details and context about the Vulnerability, potentially including its purpose and its key characteristics.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map29-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map29)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyimpact-vulnerabilityimpactobject"></a>
## Property impact ∷ *VulnerabilityImpact* Object

* This entry is optional


<a id="map31-ref"></a>
* *VulnerabilityImpact* Object Value
  * Details: [*VulnerabilityImpact* Object](#map31)

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylast_modified_date-instdate"></a>
## Property last_modified_date ∷ Inst (Date)

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertypublished_date-instdate"></a>
## Property published_date ∷ Inst (Date)

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

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

<a id="propertytype-vulnerabilitytypeidentifierstring"></a>
## Property type ∷ VulnerabilityTypeIdentifierString

The fixed value vulnerability

* This entry is required


  * *VulnerabilityTypeIdentifier* The fixed value "vulnerability"
  * Must equal: "vulnerability"

<a id="map32"></a>
# *Configurations* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[CVE_data_version](#propertycve_data_version-shortstringstring)|ShortStringString| |&#10003;|
|[nodes](#propertynodes-cpenodeobjectlist)|*CPENode* Object List| |&#10003;|


<a id="propertycve_data_version-shortstringstring"></a>
## Property CVE_data_version ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertynodes-cpenodeobjectlist"></a>
## Property nodes ∷ *CPENode* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map33-ref"></a>
* *CPENode* Object Value
  * Details: [*CPENode* Object](#map33)

<a id="map33"></a>
# *CPENode* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[operator](#propertyoperator-cpe-node-operator-stringstring)|cpe-node-operator-stringString| |&#10003;|
|[children](#propertychildren-cpeleafnodeobjectlist)|*CPELeafNode* Object List| ||
|[cpe_match](#propertycpe_match-cpematchobjectlist)|*CPEMatch* Object List| ||
|[negate](#propertynegate-boolean)|Boolean|Negates operator when true.||


<a id="propertychildren-cpeleafnodeobjectlist"></a>
## Property children ∷ *CPELeafNode* Object List

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map35-ref"></a>
* *CPELeafNode* Object Value
  * Details: [*CPELeafNode* Object](#map35)

<a id="propertycpe_match-cpematchobjectlist"></a>
## Property cpe_match ∷ *CPEMatch* Object List

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map34-ref"></a>
* *CPEMatch* Object Value
  * Details: [*CPEMatch* Object](#map34)

<a id="propertynegate-boolean"></a>
## Property negate ∷ Boolean

Negates operator when true.

* This entry is optional



<a id="propertyoperator-cpe-node-operator-stringstring"></a>
## Property operator ∷ cpe-node-operator-stringString

* This entry is required


  * *cpe-node-operator-string* The operator string influences how seqs of cpe matches are related to one another.
  * Allowed Values:
    * AND
    * OR

<a id="map35"></a>
# *CPELeafNode* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[cpe_match](#propertycpe_match-cpematchobjectlist)|*CPEMatch* Object List| |&#10003;|
|[operator](#propertyoperator-cpe-node-operator-stringstring)|cpe-node-operator-stringString| |&#10003;|
|[negate](#propertynegate-boolean)|Boolean|Negates operator when true.||


<a id="propertycpe_match-cpematchobjectlist"></a>
## Property cpe_match ∷ *CPEMatch* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map36-ref"></a>
* *CPEMatch* Object Value
  * Details: [*CPEMatch* Object](#map36)

<a id="propertynegate-boolean"></a>
## Property negate ∷ Boolean

Negates operator when true.

* This entry is optional



<a id="propertyoperator-cpe-node-operator-stringstring"></a>
## Property operator ∷ cpe-node-operator-stringString

* This entry is required


  * *cpe-node-operator-string* The operator string influences how seqs of cpe matches are related to one another.
  * Allowed Values:
    * AND
    * OR

<a id="map36"></a>
# *CPEMatch* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[cpe23Uri](#propertycpe23uri-string)|String| |&#10003;|
|[vulnerable](#propertyvulnerable-boolean)|Boolean| |&#10003;|
|[versionEndExcluding](#propertyversionendexcluding-string)|String|A string representing the upper bound(exclusive) of version in the CPE.||
|[versionEndIncluding](#propertyversionendincluding-string)|String|A string representing the upper bound(inclusive) of version in the CPE.||
|[versionStartExcluding](#propertyversionstartexcluding-string)|String|A string representing the lower bound(exclusive) of version in the CPE.||
|[versionStartIncluding](#propertyversionstartincluding-string)|String|A string representing the lower bound(inclusive) of version in the CPE.||


<a id="propertycpe23uri-string"></a>
## Property cpe23Uri ∷ String

* This entry is required


  * A text representation of a software or hardware platform.

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

<a id="propertyvulnerable-boolean"></a>
## Property vulnerable ∷ Boolean

* This entry is required



<a id="map34"></a>
# *CPEMatch* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[cpe23Uri](#propertycpe23uri-string)|String| |&#10003;|
|[vulnerable](#propertyvulnerable-boolean)|Boolean| |&#10003;|
|[versionEndExcluding](#propertyversionendexcluding-string)|String|A string representing the upper bound(exclusive) of version in the CPE.||
|[versionEndIncluding](#propertyversionendincluding-string)|String|A string representing the upper bound(inclusive) of version in the CPE.||
|[versionStartExcluding](#propertyversionstartexcluding-string)|String|A string representing the lower bound(exclusive) of version in the CPE.||
|[versionStartIncluding](#propertyversionstartincluding-string)|String|A string representing the lower bound(inclusive) of version in the CPE.||


<a id="propertycpe23uri-string"></a>
## Property cpe23Uri ∷ String

* This entry is required


  * A text representation of a software or hardware platform.

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

<a id="propertyvulnerable-boolean"></a>
## Property vulnerable ∷ Boolean

* This entry is required



<a id="map31"></a>
# *VulnerabilityImpact* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[cvss_v2](#propertycvss_v2-cvssv2object)|*CVSSv2* Object| ||
|[cvss_v3](#propertycvss_v3-cvssv3object)|*CVSSv3* Object| ||


<a id="propertycvss_v2-cvssv2object"></a>
## Property cvss_v2 ∷ *CVSSv2* Object

* This entry is optional


<a id="map37-ref"></a>
* *CVSSv2* Object Value
  * Details: [*CVSSv2* Object](#map37)

<a id="propertycvss_v3-cvssv3object"></a>
## Property cvss_v3 ∷ *CVSSv3* Object

* This entry is optional


<a id="map38-ref"></a>
* *CVSSv3* Object Value
  * Details: [*CVSSv3* Object](#map38)

<a id="map38"></a>
# *CVSSv3* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[base_score](#propertybase_score-number)|Number| |&#10003;|
|[base_severity](#propertybase_severity-cvssv3severitystring)|CVSSv3SeverityString| |&#10003;|
|[vector_string](#propertyvector_string-string)|String| |&#10003;|
|[attack_complexity](#propertyattack_complexity-cvssv3attackcomplexitystring)|CVSSv3AttackComplexityString|describes the conditions beyond the attacker's control that must exist in order to exploit the vulnerability||
|[attack_vector](#propertyattack_vector-cvssv3attackvectorstring)|CVSSv3AttackVectorString|Reflects the context by which vulnerability exploitation is possible||
|[availability_impact](#propertyavailability_impact-cvssv3availabilityimpactstring)|CVSSv3AvailabilityImpactString|measures the impact to the availability of the impacted component resulting from a successfully exploited vulnerability||
|[availability_requirement](#propertyavailability_requirement-cvssv3securityrequirementsstring)|CVSSv3SecurityRequirementsString| ||
|[confidentiality_impact](#propertyconfidentiality_impact-cvssv3confidentialityimpactstring)|CVSSv3ConfidentialityImpactString|measures the impact to the confidentiality of the information resources managed by a software component due to a successfully exploited vulnerability||
|[confidentiality_requirement](#propertyconfidentiality_requirement-cvssv3securityrequirementsstring)|CVSSv3SecurityRequirementsString| ||
|[environmental_score](#propertyenvironmental_score-number)|Number| ||
|[environmental_severity](#propertyenvironmental_severity-cvssv3severitystring)|CVSSv3SeverityString| ||
|[exploit_code_maturity](#propertyexploit_code_maturity-cvssv3exploitcodematuritystring)|CVSSv3ExploitCodeMaturityString|measures the likelihood of the vulnerability being attacked||
|[exploitability_score](#propertyexploitability_score-number)|Number| ||
|[impact_score](#propertyimpact_score-number)|Number| ||
|[integrity_impact](#propertyintegrity_impact-cvssv3integrityimpactstring)|CVSSv3IntegrityImpactString|measures the impact to integrity of a successfully exploited vulnerability||
|[integrity_requirement](#propertyintegrity_requirement-cvssv3securityrequirementsstring)|CVSSv3SecurityRequirementsString| ||
|[modified_attack_complexity](#propertymodified_attack_complexity-cvssv3modifiedattackcomplexitystring)|CVSSv3ModifiedAttackComplexityString|modified attack complexity||
|[modified_attack_vector](#propertymodified_attack_vector-cvssv3modifiedattackvectorstring)|CVSSv3ModifiedAttackVectorString|modified attack vector||
|[modified_availability_impact](#propertymodified_availability_impact-cvssv3modifiedavailabilityimpactstring)|CVSSv3ModifiedAvailabilityImpactString|modified availability impact||
|[modified_confidentiality_impact](#propertymodified_confidentiality_impact-cvssv3modifiedconfidentialityimpactstring)|CVSSv3ModifiedConfidentialityImpactString|modified confidentiality impact||
|[modified_integrity_impact](#propertymodified_integrity_impact-cvssv3modifiedintegrityimpactstring)|CVSSv3ModifiedIntegrityImpactString|modified integrity impact||
|[modified_privileges_required](#propertymodified_privileges_required-cvssv3modifiedprivilegesrequiredstring)|CVSSv3ModifiedPrivilegesRequiredString|modified privileges required||
|[modified_scope](#propertymodified_scope-cvssv3modifiedscopestring)|CVSSv3ModifiedScopeString|modified scope||
|[modified_user_interaction](#propertymodified_user_interaction-cvssv3modifieduserinteractionstring)|CVSSv3ModifiedUserInteractionString|modified user interaction||
|[privileges_required](#propertyprivileges_required-cvssv3privilegesrequiredstring)|CVSSv3PrivilegesRequiredString|describes the level of privileges an attacker must possess before successfully exploiting the vulnerability||
|[remediation_level](#propertyremediation_level-cvssv3remediationlevelstring)|CVSSv3RemediationLevelString|Remediation Level of a vulnerability is an important factor for prioritization||
|[report_confidence](#propertyreport_confidence-cvssv3reportconfidencestring)|CVSSv3ReportConfidenceString|measures the degree of confidence in the existence of the vulnerability and the credibility of the known technical details||
|[scope](#propertyscope-cvssv3scopestring)|CVSSv3ScopeString|the ability for a vulnerability in one software component to impact resources beyond its means, or privileges||
|[temporal_score](#propertytemporal_score-number)|Number|Round up(CVSSv3BaseScore × CVSSv3ExploitCodeMaturity × CVSSv3RemediationLevel × CVSSv3ReportConfidence)||
|[temporal_severity](#propertytemporal_severity-cvssv3severitystring)|CVSSv3SeverityString|temporal severity||
|[user_interaction](#propertyuser_interaction-cvssv3userinteractionstring)|CVSSv3UserInteractionString|captures the requirement for a user, other than the attacker, to participate in the successful compromise of the vulnerable component||


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

<a id="propertyvector_string-string"></a>
## Property vector_string ∷ String

* This entry is required


  * a text representation of a set of CVSSv3 metrics. It is commonly used to record or transfer CVSSv3 metric information in a concise form

<a id="map37"></a>
# *CVSSv2* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[base_score](#propertybase_score-number)|Number| |&#10003;|
|[base_severity](#propertybase_severity-highmedlowstring)|HighMedLowString| |&#10003;|
|[vector_string](#propertyvector_string-string)|String| |&#10003;|
|[access_complexity](#propertyaccess_complexity-cvssv2accesscomplexitystring)|CVSSv2AccessComplexityString| ||
|[access_vector](#propertyaccess_vector-cvssv2accessvectorstring)|CVSSv2AccessVectorString| ||
|[authentication](#propertyauthentication-cvssv2authenticationstring)|CVSSv2AuthenticationString| ||
|[availability_impact](#propertyavailability_impact-cvssv2availabilityimpactstring)|CVSSv2AvailabilityImpactString| ||
|[availability_requirement](#propertyavailability_requirement-cvssv2securityrequirementstring)|CVSSv2SecurityRequirementString| ||
|[collateral_damage_potential](#propertycollateral_damage_potential-cvssv2collateraldamagepotentialstring)|CVSSv2CollateralDamagePotentialString| ||
|[confidentiality_impact](#propertyconfidentiality_impact-cvssv2confidentialityimpactstring)|CVSSv2ConfidentialityImpactString| ||
|[confidentiality_requirement](#propertyconfidentiality_requirement-cvssv2securityrequirementstring)|CVSSv2SecurityRequirementString| ||
|[environmental_vector_string](#propertyenvironmental_vector_string-string)|String| ||
|[exploitability](#propertyexploitability-cvssv2exploitabilitystring)|CVSSv2ExploitabilityString| ||
|[exploitability_score](#propertyexploitability_score-number)|Number| ||
|[impact_score](#propertyimpact_score-number)|Number| ||
|[integrity_impact](#propertyintegrity_impact-cvssv2integrityimpactstring)|CVSSv2IntegrityImpactString| ||
|[integrity_requirement](#propertyintegrity_requirement-cvssv2securityrequirementstring)|CVSSv2SecurityRequirementString| ||
|[obtain_all_privilege](#propertyobtain_all_privilege-boolean)|Boolean| ||
|[obtain_other_privilege](#propertyobtain_other_privilege-boolean)|Boolean| ||
|[obtain_user_privilege](#propertyobtain_user_privilege-boolean)|Boolean| ||
|[remediation_level](#propertyremediation_level-cvssv2remediationlevelstring)|CVSSv2RemediationLevelString| ||
|[report_confidence](#propertyreport_confidence-cvssv2reportconfidencestring)|CVSSv2ReportConfidenceString| ||
|[target_distribution](#propertytarget_distribution-cvssv2targetdistributionstring)|CVSSv2TargetDistributionString| ||
|[temporal_vector_string](#propertytemporal_vector_string-string)|String| ||
|[user_interaction_required](#propertyuser_interaction_required-boolean)|Boolean| ||


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



<a id="propertyvector_string-string"></a>
## Property vector_string ∷ String

* This entry is required


  * a text representation of a set of CVSSv2 metrics. It is commonly used to record or transfer CVSSv2 metric information in a concise form

<a id="map30"></a>
# *CVE* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[cve_data_meta](#propertycve_data_meta-cvedatametaobject)|*CVEDataMeta* Object| |&#10003;|


<a id="propertycve_data_meta-cvedatametaobject"></a>
## Property cve_data_meta ∷ *CVEDataMeta* Object

* This entry is required


<a id="map39-ref"></a>
* *CVEDataMeta* Object Value
  * Details: [*CVEDataMeta* Object](#map39)

<a id="map39"></a>
# *CVEDataMeta* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[assigner](#propertyassigner-shortstringstring)|ShortStringString| ||
|[id](#propertyid-shortstringstring)|ShortStringString| ||


<a id="propertyassigner-shortstringstring"></a>
## Property assigner ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyid-shortstringstring"></a>
## Property id ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="map29"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map26"></a>
# *Weakness* Object

*Weakness* a mistake or condition that, if left unaddressed, could under the proper conditions contribute to a cyber-enabled capability being vulnerable to attack, allowing an adversary to make items function in unintended ways.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|should be short and limited to the key points that define this weakness|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-weaknesstypeidentifierstring)|WeaknessTypeIdentifierString|The fixed value weakness|&#10003;|
|[abstraction_level](#propertyabstraction_level-weaknessabstractionlevelstring)|WeaknessAbstractionLevelString|defines the abstraction level for this weakness||
|[affected_resources](#propertyaffected_resources-systemresourcestringlist)|SystemResourceString List|identify system resources that can be affected by an exploit of this weakness||
|[alternate_terms](#propertyalternate_terms-alternatetermobjectlist)|*AlternateTerm* Object List|indicates one or more other names used to describe this weakness||
|[architectures](#propertyarchitectures-architectureobjectlist)|*Architecture* Object List|Applicable architectures||
|[background_details](#propertybackground_details-markdownstring)|MarkdownString|information that is relevant but not related to the nature of the weakness itself||
|[common_consequences](#propertycommon_consequences-consequenceobjectlist)|*Consequence* Object List|specify individual consequences associated with a weakness||
|[detection_methods](#propertydetection_methods-detectionmethodobjectlist)|*DetectionMethod* Object List|identify methods that may be employed to detect this weakness, including their strengths and limitations||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[functional_areas](#propertyfunctional_areas-functionalareastringlist)|FunctionalAreaString List|identifies the functional area of the software in which the weakness is most likely to occur||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[languages](#propertylanguages-languageobjectlist)|*Language* Object List|Applicable Languages||
|[likelihood](#propertylikelihood-highmedlowstring)|HighMedLowString|Likelihood of exploit||
|[modes_of_introduction](#propertymodes_of_introduction-modeofintroductionobjectlist)|*ModeOfIntroduction* Object List|information about how and when a given weakness may be introduced||
|[notes](#propertynotes-noteobjectlist)|*Note* Object List|provide any additional comments about the weakness||
|[operating_systems](#propertyoperating_systems-operatingsystemobjectlist)|*OperatingSystem* Object List|Applicable operating systems||
|[paradigms](#propertyparadigms-paradigmobjectlist)|*Paradigm* Object List|Applicable paradigms||
|[potential_mitigations](#propertypotential_mitigations-mitigationobjectlist)|*Mitigation* Object List|describe potential mitigations associated with a weakness||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[structure](#propertystructure-weaknessstructurestring)|WeaknessStructureString|defines the structural nature of the weakness||
|[technologies](#propertytechnologies-technologyobjectlist)|*Technology* Object List|Applicable technologies||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [WeaknessType](https://cwe.mitre.org/documents/schema/#WeaknessType)

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

<a id="propertyaffected_resources-systemresourcestringlist"></a>
## Property affected_resources ∷ SystemResourceString List

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

<a id="propertyalternate_terms-alternatetermobjectlist"></a>
## Property alternate_terms ∷ *AlternateTerm* Object List

indicates one or more other names used to describe this weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map46-ref"></a>
* *AlternateTerm* Object Value
  * Details: [*AlternateTerm* Object](#map46)

<a id="propertyarchitectures-architectureobjectlist"></a>
## Property architectures ∷ *Architecture* Object List

Applicable architectures

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map43-ref"></a>
* *Architecture* Object Value
  * Details: [*Architecture* Object](#map43)

<a id="propertybackground_details-markdownstring"></a>
## Property background_details ∷ MarkdownString

information that is relevant but not related to the nature of the weakness itself

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertycommon_consequences-consequenceobjectlist"></a>
## Property common_consequences ∷ *Consequence* Object List

specify individual consequences associated with a weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map48-ref"></a>
* *Consequence* Object Value
  * Details: [*Consequence* Object](#map48)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

should be short and limited to the key points that define this weakness

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertydetection_methods-detectionmethodobjectlist"></a>
## Property detection_methods ∷ *DetectionMethod* Object List

identify methods that may be employed to detect this weakness, including their strengths and limitations

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map49-ref"></a>
* *DetectionMethod* Object Value
  * Details: [*DetectionMethod* Object](#map49)

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map40-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map40)

<a id="propertyfunctional_areas-functionalareastringlist"></a>
## Property functional_areas ∷ FunctionalAreaString List

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

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylanguages-languageobjectlist"></a>
## Property languages ∷ *Language* Object List

Applicable Languages

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map41-ref"></a>
* *Language* Object Value
  * Details: [*Language* Object](#map41)

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

<a id="propertymodes_of_introduction-modeofintroductionobjectlist"></a>
## Property modes_of_introduction ∷ *ModeOfIntroduction* Object List

information about how and when a given weakness may be introduced

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map47-ref"></a>
* *ModeOfIntroduction* Object Value
  * Details: [*ModeOfIntroduction* Object](#map47)

<a id="propertynotes-noteobjectlist"></a>
## Property notes ∷ *Note* Object List

provide any additional comments about the weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map51-ref"></a>
* *Note* Object Value
  * Details: [*Note* Object](#map51)

<a id="propertyoperating_systems-operatingsystemobjectlist"></a>
## Property operating_systems ∷ *OperatingSystem* Object List

Applicable operating systems

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map42-ref"></a>
* *OperatingSystem* Object Value
  * Details: [*OperatingSystem* Object](#map42)

<a id="propertyparadigms-paradigmobjectlist"></a>
## Property paradigms ∷ *Paradigm* Object List

Applicable paradigms

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map44-ref"></a>
* *Paradigm* Object Value
  * Details: [*Paradigm* Object](#map44)

<a id="propertypotential_mitigations-mitigationobjectlist"></a>
## Property potential_mitigations ∷ *Mitigation* Object List

describe potential mitigations associated with a weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map50-ref"></a>
* *Mitigation* Object Value
  * Details: [*Mitigation* Object](#map50)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

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

<a id="propertytechnologies-technologyobjectlist"></a>
## Property technologies ∷ *Technology* Object List

Applicable technologies

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map45-ref"></a>
* *Technology* Object Value
  * Details: [*Technology* Object](#map45)

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

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

<a id="propertytype-weaknesstypeidentifierstring"></a>
## Property type ∷ WeaknessTypeIdentifierString

The fixed value weakness

* This entry is required


  * *WeaknessTypeIdentifier* The fixed value "weakness"
  * Must equal: "weakness"

<a id="map51"></a>
# *Note* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[note](#propertynote-markdownstring)|MarkdownString| |&#10003;|
|[type](#propertytype-notetypestring)|NoteTypeString| |&#10003;|


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

<a id="map50"></a>
# *Mitigation* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|a description of this individual mitigation including any strengths and shortcomings of this mitigation for the weakness|&#10003;|
|[effectiveness](#propertyeffectiveness-effectivenessstring)|EffectivenessString|summarizes how effective the mitigation may be in preventing the weakness||
|[effectiveness_notes](#propertyeffectiveness_notes-markdownstring)|MarkdownString| ||
|[phases](#propertyphases-softwarephasestringlist)|SoftwarePhaseString List|indicates the development life cycle phase during which this particular mitigation may be applied||
|[strategy](#propertystrategy-mitigationstrategystring)|MitigationStrategyString|a general strategy for protecting a system to which this mitigation contributes||

* Reference: [PotentialMitigationsType](https://cwe.mitre.org/documents/schema/#PotentialMitigationsType)

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

<a id="propertyphases-softwarephasestringlist"></a>
## Property phases ∷ SoftwarePhaseString List

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

<a id="map49"></a>
# *DetectionMethod* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|provide some context of how this method can be applied to a specific weakness|&#10003;|
|[method](#propertymethod-detectionmethodstring)|DetectionMethodString|identifies the particular detection method being described|&#10003;|
|[effectiveness](#propertyeffectiveness-detectioneffectivenessstring)|DetectionEffectivenessString|how effective the detection method may be in detecting the associated weakness||
|[effectiveness_notes](#propertyeffectiveness_notes-markdownstring)|MarkdownString|provides additional discussion of the strengths and shortcomings of this detection method||

* Reference: [DetectionMethodsType](https://cwe.mitre.org/documents/schema/#DetectionMethodsType)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

provide some context of how this method can be applied to a specific weakness

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

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

<a id="map48"></a>
# *Consequence* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[scopes](#propertyscopes-consequencescopestringlist)|ConsequenceScopeString List|identifies the security property that is violated|&#10003;|
|[impacts](#propertyimpacts-technicalimpactstringlist)|TechnicalImpactString List|describes the technical impact that arises if an adversary succeeds in exploiting this weakness||
|[likelihood](#propertylikelihood-highmedlowstring)|HighMedLowString|how likely the specific consequence is expected to be seen relative to the other consequences||
|[note](#propertynote-markdownstring)|MarkdownString|additional commentary about a consequence||

* Reference: [CommonConsequencesType](https://cwe.mitre.org/documents/schema/#CommonConsequencesType)

<a id="propertyimpacts-technicalimpactstringlist"></a>
## Property impacts ∷ TechnicalImpactString List

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

<a id="propertyscopes-consequencescopestringlist"></a>
## Property scopes ∷ ConsequenceScopeString List

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

<a id="map47"></a>
# *ModeOfIntroduction* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[phase](#propertyphase-softwarephasestring)|SoftwarePhaseString|identifies the point in the software life cycle at which the weakness may be introduced|&#10003;|
|[note](#propertynote-markdownstring)|MarkdownString|provides a typical scenario related to introduction during the given phase||

* Reference: [ModesOfIntroductionType](https://cwe.mitre.org/documents/schema/#ModesOfIntroductionType)

<a id="propertynote-markdownstring"></a>
## Property note ∷ MarkdownString

provides a typical scenario related to introduction during the given phase

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

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

<a id="map46"></a>
# *AlternateTerm* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[term](#propertyterm-shortstringstring)|ShortStringString|the actual alternate term|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString|provides context for the alternate term by which this weakness may be known.||


<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

provides context for the alternate term by which this weakness may be known.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyterm-shortstringstring"></a>
## Property term ∷ ShortStringString

the actual alternate term

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="map45"></a>
# *Technology* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|&#10003;|
|[name](#propertyname-shortstringstring)|ShortStringString|technology name (Web Server, Web Client)||


<a id="propertyname-shortstringstring"></a>
## Property name ∷ ShortStringString

technology name (Web Server, Web Client)

* This entry is optional


  * *ShortString* String with at most 1024 characters

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

<a id="map44"></a>
# *Paradigm* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|&#10003;|
|[name](#propertyname-shortstringstring)|ShortStringString|paradigm name (Client Server, Mainframe)||


<a id="propertyname-shortstringstring"></a>
## Property name ∷ ShortStringString

paradigm name (Client Server, Mainframe)

* This entry is optional


  * *ShortString* String with at most 1024 characters

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

<a id="map43"></a>
# *Architecture* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|&#10003;|
|[class](#propertyclass-architectureclassstring)|ArchitectureClassString|class of architecture||
|[name](#propertyname-shortstringstring)|ShortStringString|architecture name (ARM, x86, ...)||


<a id="propertyclass-architectureclassstring"></a>
## Property class ∷ ArchitectureClassString

class of architecture

* This entry is optional


  * Allowed Values:
    * Embedded
    * Microcomputer
    * Workstation
  * Reference: [ArchitectureClassEnumeration](https://cwe.mitre.org/documents/schema/#ArchitectureClassEnumeration)

<a id="propertyname-shortstringstring"></a>
## Property name ∷ ShortStringString

architecture name (ARM, x86, ...)

* This entry is optional


  * *ShortString* String with at most 1024 characters

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

<a id="map42"></a>
# *OperatingSystem* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|&#10003;|
|[class](#propertyclass-operatingsystemclassstring)|OperatingSystemClassString| ||
|[cpe_id](#propertycpe_id-shortstringstring)|ShortStringString| ||
|[name](#propertyname-shortstringstring)|ShortStringString| ||
|[version](#propertyversion-shortstringstring)|ShortStringString| ||


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

<a id="propertycpe_id-shortstringstring"></a>
## Property cpe_id ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyname-shortstringstring"></a>
## Property name ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

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

<a id="propertyversion-shortstringstring"></a>
## Property version ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="map41"></a>
# *Language* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|&#10003;|
|[class](#propertyclass-languageclassstring)|LanguageClassString|class of language||
|[name](#propertyname-shortstringstring)|ShortStringString|Language name (Clojure, Java, ...)||


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

<a id="propertyname-shortstringstring"></a>
## Property name ∷ ShortStringString

Language name (Clojure, Java, ...)

* This entry is optional


  * *ShortString* String with at most 1024 characters

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

<a id="map40"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map25"></a>
# *DataTable* Object

*DataTable* A generic table of data, consisting of types and documented
  columns, and 1 or more rows of data.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[columns](#propertycolumns-columndefinitionobjectlist)|*ColumnDefinition* Object List|an ordered list of column definitions|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[rows](#propertyrows-anythinglistlist)|Anything List|an ordered list of rows|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-datatabletypeidentifierstring)|DataTableTypeIdentifierString| |&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[row_count](#propertyrow_count-integer)|Integer|The number of rows in the data table.||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| ||


<a id="propertycolumns-columndefinitionobjectlist"></a>
## Property columns ∷ *ColumnDefinition* Object List

an ordered list of column definitions

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map53-ref"></a>
* *ColumnDefinition* Object Value
  * Details: [*ColumnDefinition* Object](#map53)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map52-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map52)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

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



<a id="propertyrows-anythinglistlist"></a>
## Property rows ∷ Anything List List

an ordered list of rows

* This entry is required
* This entry's type is sequential (allows zero or more values)



<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

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

<a id="propertytype-datatabletypeidentifierstring"></a>
## Property type ∷ DataTableTypeIdentifierString

* This entry is required


  * Must equal: "data-table"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is optional


<a id="map54-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map54)

<a id="map54"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map53"></a>
# *ColumnDefinition* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[name](#propertyname-string)|String| |&#10003;|
|[type](#propertytype-columntypestring)|ColumnTypeString| |&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[required](#propertyrequired-boolean)|Boolean|If true, the row entries for this column cannot contain nulls. Defaults to true||
|[short_description](#propertyshort_description-string)|String| ||


<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyname-string"></a>
## Property name ∷ String

* This entry is required



<a id="propertyrequired-boolean"></a>
## Property required ∷ Boolean

If true, the row entries for this column cannot contain nulls. Defaults to true

* This entry is optional



<a id="propertyshort_description-string"></a>
## Property short_description ∷ String

* This entry is optional



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

<a id="map52"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map24"></a>
# *Verdict* Object

*Verdict* A Verdict is chosen from all of the Judgements on that Observable which have not yet expired.  The highest priority Judgement becomes the active verdict.  If there is more than one Judgement with that priority, then Clean disposition has priority over all others, then Malicious disposition, and so on down to Unknown.

 The ID of a verdict is a a str of the form "observable.type:observable.value" for example, "ip:1.1.1.1"

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[disposition](#propertydisposition-dispositionnumberinteger)|DispositionNumberInteger| |&#10003;|
|[observable](#propertyobservable-observableobject)|*Observable* Object| |&#10003;|
|[type](#propertytype-verdicttypeidentifierstring)|VerdictTypeIdentifierString| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[disposition_name](#propertydisposition_name-dispositionnamestring)|DispositionNameString|The disposition_name field is optional, but is intended to be shown to a user.  Applications must therefore remember the mapping of numbers to human words, as in: {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}||
|[judgement_id](#propertyjudgement_id-string)|String| ||


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

<a id="propertyobservable-observableobject"></a>
## Property observable ∷ *Observable* Object

* This entry is required


<a id="map55-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map55)

<a id="propertytype-verdicttypeidentifierstring"></a>
## Property type ∷ VerdictTypeIdentifierString

* This entry is required


  * Must equal: "verdict"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map56-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map56)

<a id="map56"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map55"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
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
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map23"></a>
# *Tool* Object

*Tool* Tools are legitimate software that can be used by threat actors to perform attacks. Knowing how and when threat actors use such tools can be important for understanding how campaigns are executed. Unlike malware, these tools or software packages are often found on a system and have legitimate purposes for power users, system administrators, network administrators, or even normal users. Remote access tools (e.g., RDP) and network scanning tools (e.g., Nmap) are examples of Tools that may be used by a Threat Actor during an attack.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[labels](#propertylabels-toollabelstringlist)|ToolLabelString List|The kind(s) of tool(s) being described.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.|&#10003;|
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value|&#10003;|
|[type](#propertytype-tooltypeidentifierstring)|ToolTypeIdentifierString| |&#10003;|
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[kill_chain_phases](#propertykill_chain_phases-killchainphaseobjectlist)|*KillChainPhase* Object List|The list of kill chain phases for which this Tool can be used.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||
|[tool_version](#propertytool_version-shortstringstring)|ShortStringString|The version identifier associated with the Tool.||
|[x_mitre_aliases](#propertyx_mitre_aliases-shortstringstringlist)|ShortStringString List|ATT&CK Software.aliases||

* Reference: [Tool](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/pub#h.z4voa9ndw8v)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map57-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map57)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertykill_chain_phases-killchainphaseobjectlist"></a>
## Property kill_chain_phases ∷ *KillChainPhase* Object List

The list of kill chain phases for which this Tool can be used.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map58-ref"></a>
* *KillChainPhase* Object Value
  * Details: [*KillChainPhase* Object](#map58)

<a id="propertylabels-toollabelstringlist"></a>
## Property labels ∷ ToolLabelString List

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

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

A short title for this object, used as primary display and reference value

* This entry is required


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

<a id="propertytool_version-shortstringstring"></a>
## Property tool_version ∷ ShortStringString

The version identifier associated with the Tool.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytype-tooltypeidentifierstring"></a>
## Property type ∷ ToolTypeIdentifierString

* This entry is required


  * Must equal: "tool"

<a id="propertyx_mitre_aliases-shortstringstringlist"></a>
## Property x_mitre_aliases ∷ ShortStringString List

ATT&CK Software.aliases

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="map58"></a>
# *KillChainPhase* Object

*KillChainPhase* The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)|String|The name of the kill chain.|&#10003;|
|[phase_name](#propertyphase_name-string)|String|The name of the phase in the kill chain.|&#10003;|

* Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

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

<a id="map57"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map22"></a>
# *TargetRecord* Object

*TargetRecord* A TargetRecord is a Sighting that has no threat or observables associated
  with it, it's a way of saying they saw a set of observables together as a Target.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[source](#propertysource-medstringstring)|MedStringString| |&#10003;|
|[targets](#propertytargets-targetobjectlist)|*Target* Object List| |&#10003;|
|[type](#propertytype-targetrecordtypeidentifierstring)|TargetRecordTypeIdentifierString| |&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [TargetRecord](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#targetrecord)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map59-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map59)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytargets-targetobjectlist"></a>
## Property targets ∷ *Target* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map60-ref"></a>
* *Target* Object Value
  * Details: [*Target* Object](#map60)

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

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

<a id="propertytype-targetrecordtypeidentifierstring"></a>
## Property type ∷ TargetRecordTypeIdentifierString

* This entry is required


  * Must equal: "target-record"

<a id="map60"></a>
# *Target* Object

*Target* Schema for TargetRecord Targets

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#propertyobservables-observableobjectlist)|*Observable* Object List| |&#10003;|
|[observed_time](#propertyobserved_time-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-sensorstring)|SensorString| |&#10003;|
|[internal](#propertyinternal-boolean)|Boolean|Is it internal to our network?||
|[os](#propertyos-string)|String|Source Operating System where TargetRecord was originated.||
|[sensor](#propertysensor-string)|String|The OpenC2 Actuator name that best fits the device that is creating this TargetRecord (e.g.: network.firewall, etc.)||
|[source_uri](#propertysource_uri-string)|String| ||


<a id="propertyinternal-boolean"></a>
## Property internal ∷ Boolean

Is it internal to our network?

* This entry is optional



<a id="propertyobservables-observableobjectlist"></a>
## Property observables ∷ *Observable* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map61-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map61)

<a id="propertyobserved_time-observedtimeobject"></a>
## Property observed_time ∷ *ObservedTime* Object

* This entry is required


<a id="map62-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map62)

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

<a id="map62"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map61"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
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
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map59"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map21"></a>
# *IdentityAssertion* Object

*IdentityAssertion* Context attributes about the target or any of its observables. 
   Providers could provide different types of assertions regarding a target depending on their own capabilities

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[assertions](#propertyassertions-assertionobjectlist)|*Assertion* Object List|Any known context about the identity attributes|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[identity](#propertyidentity-identitycoordinatesobject)|*IdentityCoordinates* Object|attributes for which the assertion is being made|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-identityassertiontypeidentifierstring)|IdentityAssertionTypeIdentifierString| |&#10003;|
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| ||


<a id="propertyassertions-assertionobjectlist"></a>
## Property assertions ∷ *Assertion* Object List

Any known context about the identity attributes

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map65-ref"></a>
* *Assertion* Object Value
  * Details: [*Assertion* Object](#map65)

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map63-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map63)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyidentity-identitycoordinatesobject"></a>
## Property identity ∷ *IdentityCoordinates* Object

attributes for which the assertion is being made

* This entry is required


<a id="map64-ref"></a>
* *IdentityCoordinates* Object Value
  * Details: [*IdentityCoordinates* Object](#map64)

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

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

<a id="propertytype-identityassertiontypeidentifierstring"></a>
## Property type ∷ IdentityAssertionTypeIdentifierString

* This entry is required


  * Must equal: "identity-assertion"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is optional


<a id="map66-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map66)

<a id="map66"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map65"></a>
# *Assertion* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[name](#propertyname-assertiontypestring)|AssertionTypeString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


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



<a id="map64"></a>
# *IdentityCoordinates* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#propertyobservables-observableobjectlist)|*Observable* Object List| |&#10003;|


<a id="propertyobservables-observableobjectlist"></a>
## Property observables ∷ *Observable* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map67-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map67)

<a id="map67"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
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
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map63"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map20"></a>
# *Sighting* Object

*Sighting* A single sighting of an [indicator](indicator.md)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| |&#10003;|
|[count](#propertycount-integer)|Integer|The number of times the sighting was seen|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[observed_time](#propertyobserved_time-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-sightingtypeidentifierstring)|SightingTypeIdentifierString| |&#10003;|
|[context](#propertycontext-contextobject)|*Context* Object|Context including the event type that best fits the type of the sighting||
|[data](#propertydata-sightingdatatableobject)|*SightingDataTable* Object|An embedded data table for the Sighting.||
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[internal](#propertyinternal-boolean)|Boolean|Is it internal to our network||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[observables](#propertyobservables-observableobjectlist)|*Observable* Object List|The object(s) of interest||
|[relations](#propertyrelations-observedrelationobjectlist)|*ObservedRelation* Object List|Provide any context we can about where the observable came from||
|[resolution](#propertyresolution-resolutionstring)|ResolutionString| ||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[sensor](#propertysensor-sensorstring)|SensorString|The OpenC2 Actuator name that best fits the device that is creating this sighting (e.g. network.firewall)||
|[sensor_coordinates](#propertysensor_coordinates-sensorcoordinatesobject)|*SensorCoordinates* Object| ||
|[severity](#propertyseverity-severitystring)|SeverityString| ||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[targets](#propertytargets-identityspecificationobjectlist)|*IdentitySpecification* Object List|The target device. Where the sighting came from.||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [SightingType](http://stixproject.github.io/data-model/1.2/indicator/SightingType/)

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

<a id="propertycontext-contextobject"></a>
## Property context ∷ *Context* Object

Context including the event type that best fits the type of the sighting

* This entry is optional


<a id="map75-ref"></a>
* *Context* Object Value
  * Details: [*Context* Object](#map75)

<a id="propertycount-integer"></a>
## Property count ∷ Integer

The number of times the sighting was seen

* This entry is required


  * Zero, or a positive integer

<a id="propertydata-sightingdatatableobject"></a>
## Property data ∷ *SightingDataTable* Object

An embedded data table for the Sighting.

* This entry is optional


<a id="map70-ref"></a>
* *SightingDataTable* Object Value
  * Details: [*SightingDataTable* Object](#map70)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map68-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map68)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyinternal-boolean"></a>
## Property internal ∷ Boolean

Is it internal to our network

* This entry is optional



<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyobservables-observableobjectlist"></a>
## Property observables ∷ *Observable* Object List

The object(s) of interest

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map73-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map73)

<a id="propertyobserved_time-observedtimeobject"></a>
## Property observed_time ∷ *ObservedTime* Object

* This entry is required


<a id="map69-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map69)

<a id="propertyrelations-observedrelationobjectlist"></a>
## Property relations ∷ *ObservedRelation* Object List

Provide any context we can about where the observable came from

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map74-ref"></a>
* *ObservedRelation* Object Value
  * Details: [*ObservedRelation* Object](#map74)

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

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

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

<a id="propertysensor_coordinates-sensorcoordinatesobject"></a>
## Property sensor_coordinates ∷ *SensorCoordinates* Object

* This entry is optional


<a id="map71-ref"></a>
* *SensorCoordinates* Object Value
  * Details: [*SensorCoordinates* Object](#map71)

<a id="propertyseverity-severitystring"></a>
## Property severity ∷ SeverityString

* This entry is optional


  * Allowed Values:
    * Critical
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytargets-identityspecificationobjectlist"></a>
## Property targets ∷ *IdentitySpecification* Object List

The target device. Where the sighting came from.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map72-ref"></a>
* *IdentitySpecification* Object Value
  * Details: [*IdentitySpecification* Object](#map72)

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

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

<a id="propertytype-sightingtypeidentifierstring"></a>
## Property type ∷ SightingTypeIdentifierString

* This entry is required


  * Must equal: "sighting"

<a id="map75"></a>
# *Context* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[file_create_events](#propertyfile_create_events-filecreatetypeobjectlist)|*FileCreateType* Object List|a list of `FileCreateType`||
|[file_delete_events](#propertyfile_delete_events-filedeletetypeobjectlist)|*FileDeleteType* Object List|a list of `FileDeleteType`||
|[file_modify_events](#propertyfile_modify_events-filemodifytypeobjectlist)|*FileModifyType* Object List|a list of `FileModifyType`||
|[file_move_events](#propertyfile_move_events-filemovetypeobjectlist)|*FileMoveType* Object List|a list of `FileMoveType`||
|[http_events](#propertyhttp_events-httptypeobjectlist)|*HTTPType* Object List|a list of `HTTPType`||
|[library_load_events](#propertylibrary_load_events-libraryloadtypeobjectlist)|*LibraryLoadType* Object List|a list of `LibraryLoadType`||
|[netflow_events](#propertynetflow_events-netflowtypeobjectlist)|*NetflowType* Object List|a list of `NetflowType`||
|[process_create_events](#propertyprocess_create_events-processcreatetypeobjectlist)|*ProcessCreateType* Object List|a list of `ProcessCreate`||
|[registry_create_events](#propertyregistry_create_events-registrycreatetypeobjectlist)|*RegistryCreateType* Object List|a list of `RegistryCreateType`||
|[registry_delete_events](#propertyregistry_delete_events-registrydeletetypeobjectlist)|*RegistryDeleteType* Object List|a list of `RegistryDeleteType`||
|[registry_rename_events](#propertyregistry_rename_events-registryrenametypeobjectlist)|*RegistryRenameType* Object List|a list of `RegistryRenameType`||
|[registry_set_events](#propertyregistry_set_events-registrysettypeobjectlist)|*RegistrySetType* Object List|a list of `RegistrySetType`||


<a id="propertyfile_create_events-filecreatetypeobjectlist"></a>
## Property file_create_events ∷ *FileCreateType* Object List

a list of `FileCreateType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map78-ref"></a>
* *FileCreateType* Object Value
  * Details: [*FileCreateType* Object](#map78)

<a id="propertyfile_delete_events-filedeletetypeobjectlist"></a>
## Property file_delete_events ∷ *FileDeleteType* Object List

a list of `FileDeleteType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map79-ref"></a>
* *FileDeleteType* Object Value
  * Details: [*FileDeleteType* Object](#map79)

<a id="propertyfile_modify_events-filemodifytypeobjectlist"></a>
## Property file_modify_events ∷ *FileModifyType* Object List

a list of `FileModifyType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map80-ref"></a>
* *FileModifyType* Object Value
  * Details: [*FileModifyType* Object](#map80)

<a id="propertyfile_move_events-filemovetypeobjectlist"></a>
## Property file_move_events ∷ *FileMoveType* Object List

a list of `FileMoveType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map81-ref"></a>
* *FileMoveType* Object Value
  * Details: [*FileMoveType* Object](#map81)

<a id="propertyhttp_events-httptypeobjectlist"></a>
## Property http_events ∷ *HTTPType* Object List

a list of `HTTPType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map83-ref"></a>
* *HTTPType* Object Value
  * Details: [*HTTPType* Object](#map83)

<a id="propertylibrary_load_events-libraryloadtypeobjectlist"></a>
## Property library_load_events ∷ *LibraryLoadType* Object List

a list of `LibraryLoadType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map77-ref"></a>
* *LibraryLoadType* Object Value
  * Details: [*LibraryLoadType* Object](#map77)

<a id="propertynetflow_events-netflowtypeobjectlist"></a>
## Property netflow_events ∷ *NetflowType* Object List

a list of `NetflowType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map82-ref"></a>
* *NetflowType* Object Value
  * Details: [*NetflowType* Object](#map82)

<a id="propertyprocess_create_events-processcreatetypeobjectlist"></a>
## Property process_create_events ∷ *ProcessCreateType* Object List

a list of `ProcessCreate`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map76-ref"></a>
* *ProcessCreateType* Object Value
  * Details: [*ProcessCreateType* Object](#map76)

<a id="propertyregistry_create_events-registrycreatetypeobjectlist"></a>
## Property registry_create_events ∷ *RegistryCreateType* Object List

a list of `RegistryCreateType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map84-ref"></a>
* *RegistryCreateType* Object Value
  * Details: [*RegistryCreateType* Object](#map84)

<a id="propertyregistry_delete_events-registrydeletetypeobjectlist"></a>
## Property registry_delete_events ∷ *RegistryDeleteType* Object List

a list of `RegistryDeleteType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map86-ref"></a>
* *RegistryDeleteType* Object Value
  * Details: [*RegistryDeleteType* Object](#map86)

<a id="propertyregistry_rename_events-registryrenametypeobjectlist"></a>
## Property registry_rename_events ∷ *RegistryRenameType* Object List

a list of `RegistryRenameType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map87-ref"></a>
* *RegistryRenameType* Object Value
  * Details: [*RegistryRenameType* Object](#map87)

<a id="propertyregistry_set_events-registrysettypeobjectlist"></a>
## Property registry_set_events ∷ *RegistrySetType* Object List

a list of `RegistrySetType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map85-ref"></a>
* *RegistrySetType* Object Value
  * Details: [*RegistrySetType* Object](#map85)

<a id="map87"></a>
# *RegistryRenameType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[registry_key](#propertyregistry_key-shortstringstring)|ShortStringString| |&#10003;|
|[registry_old_key](#propertyregistry_old_key-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-registryrenametypeidentifierstring)|RegistryRenameTypeIdentifierString| |&#10003;|
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_key-shortstringstring"></a>
## Property registry_key ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_old_key-shortstringstring"></a>
## Property registry_old_key ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map88-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map88)

<a id="propertytype-registryrenametypeidentifierstring"></a>
## Property type ∷ RegistryRenameTypeIdentifierString

* This entry is required


  * Must equal: "RegistryRenameEvent"

<a id="map88"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map86"></a>
# *RegistryDeleteType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[registry_key](#propertyregistry_key-shortstringstring)|ShortStringString| |&#10003;|
|[registry_value](#propertyregistry_value-medstringstring)|MedStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-registrydeletetypeidentifierstring)|RegistryDeleteTypeIdentifierString| |&#10003;|
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_key-shortstringstring"></a>
## Property registry_key ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_value-medstringstring"></a>
## Property registry_value ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map89-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map89)

<a id="propertytype-registrydeletetypeidentifierstring"></a>
## Property type ∷ RegistryDeleteTypeIdentifierString

* This entry is required


  * Must equal: "RegistryDeleteEvent"

<a id="map89"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map85"></a>
# *RegistrySetType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[registry_data](#propertyregistry_data-longstringstring)|LongStringString| |&#10003;|
|[registry_key](#propertyregistry_key-shortstringstring)|ShortStringString| |&#10003;|
|[registry_value](#propertyregistry_value-medstringstring)|MedStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-registrysettypeidentifierstring)|RegistrySetTypeIdentifierString| |&#10003;|
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||
|[registry_data_length](#propertyregistry_data_length-integer)|Integer| ||


<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_data-longstringstring"></a>
## Property registry_data ∷ LongStringString

* This entry is required


  * *LongString* String with at most 5000 characters

<a id="propertyregistry_data_length-integer"></a>
## Property registry_data_length ∷ Integer

* This entry is optional



<a id="propertyregistry_key-shortstringstring"></a>
## Property registry_key ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_value-medstringstring"></a>
## Property registry_value ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map90-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map90)

<a id="propertytype-registrysettypeidentifierstring"></a>
## Property type ∷ RegistrySetTypeIdentifierString

* This entry is required


  * Must equal: "RegistrySetEvent"

<a id="map90"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map84"></a>
# *RegistryCreateType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[registry_key](#propertyregistry_key-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-registrycreatetypeidentifierstring)|RegistryCreateTypeIdentifierString| |&#10003;|
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_key-shortstringstring"></a>
## Property registry_key ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map91-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map91)

<a id="propertytype-registrycreatetypeidentifierstring"></a>
## Property type ∷ RegistryCreateTypeIdentifierString

* This entry is required


  * Must equal: "RegistryCreateEvent"

<a id="map91"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map83"></a>
# *HTTPType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[host](#propertyhost-shortstringstring)|ShortStringString| |&#10003;|
|[method](#propertymethod-httpmethodstring)|HTTPMethodString| |&#10003;|
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[traffic](#propertytraffic-trafficobject)|*Traffic* Object| |&#10003;|
|[type](#propertytype-httptypeidentifierstring)|HTTPTypeIdentifierString| |&#10003;|
|[url_port](#propertyurl_port-integer)|Integer| |&#10003;|
|[encrypted](#propertyencrypted-boolean)|Boolean| ||
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||
|[query](#propertyquery-longstringstring)|LongStringString| ||


<a id="propertyencrypted-boolean"></a>
## Property encrypted ∷ Boolean

* This entry is optional



<a id="propertyhost-shortstringstring"></a>
## Property host ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertymethod-httpmethodstring"></a>
## Property method ∷ HTTPMethodString

* This entry is required


  * Allowed Values:
    * CONNECT
    * GET
    * HEAD
    * OPTIONS
    * PATCH
    * POST
    * PUT
    * TRACE

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyquery-longstringstring"></a>
## Property query ∷ LongStringString

* This entry is optional


  * *LongString* String with at most 5000 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map92-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map92)

<a id="propertytraffic-trafficobject"></a>
## Property traffic ∷ *Traffic* Object

* This entry is required


<a id="map93-ref"></a>
* *Traffic* Object Value
  * Details: [*Traffic* Object](#map93)

<a id="propertytype-httptypeidentifierstring"></a>
## Property type ∷ HTTPTypeIdentifierString

* This entry is required


  * Must equal: "HTTPEvent"

<a id="propertyurl_port-integer"></a>
## Property url_port ∷ Integer

* This entry is required



<a id="map93"></a>
# *Traffic* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[destination_ip](#propertydestination_ip-string)|String| |&#10003;|
|[destination_port](#propertydestination_port-integer)|Integer| |&#10003;|
|[direction](#propertydirection-trafficdirectionstring)|TrafficDirectionString| |&#10003;|
|[protocol](#propertyprotocol-integer)|Integer|The IP [protocol id](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)|&#10003;|
|[source_ip](#propertysource_ip-string)|String| |&#10003;|
|[source_port](#propertysource_port-integer)|Integer| |&#10003;|
|[destination_host_name](#propertydestination_host_name-string)|String| ||
|[destination_subnet](#propertydestination_subnet-string)|String| ||
|[source_subnet](#propertysource_subnet-string)|String| ||


<a id="propertydestination_host_name-string"></a>
## Property destination_host_name ∷ String

* This entry is optional



<a id="propertydestination_ip-string"></a>
## Property destination_ip ∷ String

* This entry is required



<a id="propertydestination_port-integer"></a>
## Property destination_port ∷ Integer

* This entry is required



<a id="propertydestination_subnet-string"></a>
## Property destination_subnet ∷ String

* This entry is optional



<a id="propertydirection-trafficdirectionstring"></a>
## Property direction ∷ TrafficDirectionString

* This entry is required


  * Allowed Values:
    * incoming
    * outgoing

<a id="propertyprotocol-integer"></a>
## Property protocol ∷ Integer

The IP [protocol id](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)

* This entry is required



<a id="propertysource_ip-string"></a>
## Property source_ip ∷ String

* This entry is required



<a id="propertysource_port-integer"></a>
## Property source_port ∷ Integer

* This entry is required



<a id="propertysource_subnet-string"></a>
## Property source_subnet ∷ String

* This entry is optional



<a id="map92"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map82"></a>
# *NetflowType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[traffic](#propertytraffic-trafficobject)|*Traffic* Object| |&#10003;|
|[type](#propertytype-netflowtypeidentifierstring)|NetflowTypeIdentifierString| |&#10003;|
|[byte_count_in](#propertybyte_count_in-integer)|Integer| ||
|[byte_count_out](#propertybyte_count_out-integer)|Integer| ||
|[flow_time](#propertyflow_time-instdate)|Inst (Date)| ||
|[parent_process_account](#propertyparent_process_account-shortstringstring)|ShortStringString| ||
|[parent_process_account_type](#propertyparent_process_account_type-shortstringstring)|ShortStringString| ||
|[parent_process_args](#propertyparent_process_args-shortstringstring)|ShortStringString| ||
|[parent_process_hash](#propertyparent_process_hash-shortstringstring)|ShortStringString| ||
|[parent_process_id](#propertyparent_process_id-integer)|Integer| ||
|[parent_process_name](#propertyparent_process_name-shortstringstring)|ShortStringString| ||
|[parent_process_path](#propertyparent_process_path-shortstringstring)|ShortStringString| ||
|[process_account](#propertyprocess_account-shortstringstring)|ShortStringString| ||
|[process_account_type](#propertyprocess_account_type-shortstringstring)|ShortStringString| ||
|[process_args](#propertyprocess_args-shortstringstring)|ShortStringString| ||
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_hash](#propertyprocess_hash-shortstringstring)|ShortStringString| ||
|[process_path](#propertyprocess_path-shortstringstring)|ShortStringString| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertybyte_count_in-integer"></a>
## Property byte_count_in ∷ Integer

* This entry is optional



<a id="propertybyte_count_out-integer"></a>
## Property byte_count_out ∷ Integer

* This entry is optional



<a id="propertyflow_time-instdate"></a>
## Property flow_time ∷ Inst (Date)

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyparent_process_account-shortstringstring"></a>
## Property parent_process_account ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_account_type-shortstringstring"></a>
## Property parent_process_account_type ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_args-shortstringstring"></a>
## Property parent_process_args ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_hash-shortstringstring"></a>
## Property parent_process_hash ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_id-integer"></a>
## Property parent_process_id ∷ Integer

* This entry is optional



<a id="propertyparent_process_name-shortstringstring"></a>
## Property parent_process_name ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_path-shortstringstring"></a>
## Property parent_process_path ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_account-shortstringstring"></a>
## Property process_account ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_account_type-shortstringstring"></a>
## Property process_account_type ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_args-shortstringstring"></a>
## Property process_args ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_hash-shortstringstring"></a>
## Property process_hash ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_path-shortstringstring"></a>
## Property process_path ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map94-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map94)

<a id="propertytraffic-trafficobject"></a>
## Property traffic ∷ *Traffic* Object

* This entry is required


<a id="map95-ref"></a>
* *Traffic* Object Value
  * Details: [*Traffic* Object](#map95)

<a id="propertytype-netflowtypeidentifierstring"></a>
## Property type ∷ NetflowTypeIdentifierString

* This entry is required


  * Must equal: "NetflowEvent"

<a id="map95"></a>
# *Traffic* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[destination_ip](#propertydestination_ip-string)|String| |&#10003;|
|[destination_port](#propertydestination_port-integer)|Integer| |&#10003;|
|[direction](#propertydirection-trafficdirectionstring)|TrafficDirectionString| |&#10003;|
|[protocol](#propertyprotocol-integer)|Integer|The IP [protocol id](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)|&#10003;|
|[source_ip](#propertysource_ip-string)|String| |&#10003;|
|[source_port](#propertysource_port-integer)|Integer| |&#10003;|
|[destination_host_name](#propertydestination_host_name-string)|String| ||
|[destination_subnet](#propertydestination_subnet-string)|String| ||
|[source_subnet](#propertysource_subnet-string)|String| ||


<a id="propertydestination_host_name-string"></a>
## Property destination_host_name ∷ String

* This entry is optional



<a id="propertydestination_ip-string"></a>
## Property destination_ip ∷ String

* This entry is required



<a id="propertydestination_port-integer"></a>
## Property destination_port ∷ Integer

* This entry is required



<a id="propertydestination_subnet-string"></a>
## Property destination_subnet ∷ String

* This entry is optional



<a id="propertydirection-trafficdirectionstring"></a>
## Property direction ∷ TrafficDirectionString

* This entry is required


  * Allowed Values:
    * incoming
    * outgoing

<a id="propertyprotocol-integer"></a>
## Property protocol ∷ Integer

The IP [protocol id](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)

* This entry is required



<a id="propertysource_ip-string"></a>
## Property source_ip ∷ String

* This entry is required



<a id="propertysource_port-integer"></a>
## Property source_port ∷ Integer

* This entry is required



<a id="propertysource_subnet-string"></a>
## Property source_subnet ∷ String

* This entry is optional



<a id="map94"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map81"></a>
# *FileMoveType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[file_name](#propertyfile_name-shortstringstring)|ShortStringString| |&#10003;|
|[file_path](#propertyfile_path-medstringstring)|MedStringString| |&#10003;|
|[new_name](#propertynew_name-shortstringstring)|ShortStringString| |&#10003;|
|[old_name](#propertyold_name-shortstringstring)|ShortStringString| |&#10003;|
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-filemovetypeidentifierstring)|FileMoveTypeIdentifierString| |&#10003;|
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyfile_name-shortstringstring"></a>
## Property file_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyfile_path-medstringstring"></a>
## Property file_path ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertynew_name-shortstringstring"></a>
## Property new_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyold_name-shortstringstring"></a>
## Property old_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map96-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map96)

<a id="propertytype-filemovetypeidentifierstring"></a>
## Property type ∷ FileMoveTypeIdentifierString

* This entry is required


  * Must equal: "FileMoveEvent"

<a id="map96"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map80"></a>
# *FileModifyType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[file_name](#propertyfile_name-shortstringstring)|ShortStringString| |&#10003;|
|[file_path](#propertyfile_path-medstringstring)|MedStringString| |&#10003;|
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-filemodifytypeidentifierstring)|FileModifyTypeIdentifierString| |&#10003;|
|[failed](#propertyfailed-boolean)|Boolean| ||
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyfailed-boolean"></a>
## Property failed ∷ Boolean

* This entry is optional



<a id="propertyfile_name-shortstringstring"></a>
## Property file_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyfile_path-medstringstring"></a>
## Property file_path ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map97-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map97)

<a id="propertytype-filemodifytypeidentifierstring"></a>
## Property type ∷ FileModifyTypeIdentifierString

* This entry is required


  * Must equal: "FileModifyEvent"

<a id="map97"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map79"></a>
# *FileDeleteType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[file_name](#propertyfile_name-shortstringstring)|ShortStringString| |&#10003;|
|[file_path](#propertyfile_path-medstringstring)|MedStringString| |&#10003;|
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-filedeletetypeidentifierstring)|FileDeleteTypeIdentifierString| |&#10003;|
|[failed](#propertyfailed-boolean)|Boolean| ||
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyfailed-boolean"></a>
## Property failed ∷ Boolean

* This entry is optional



<a id="propertyfile_name-shortstringstring"></a>
## Property file_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyfile_path-medstringstring"></a>
## Property file_path ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map98-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map98)

<a id="propertytype-filedeletetypeidentifierstring"></a>
## Property type ∷ FileDeleteTypeIdentifierString

* This entry is required


  * Must equal: "FileDeleteEvent"

<a id="map98"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map78"></a>
# *FileCreateType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[file_name](#propertyfile_name-shortstringstring)|ShortStringString| |&#10003;|
|[file_path](#propertyfile_path-medstringstring)|MedStringString| |&#10003;|
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-filecreatetypeidentifierstring)|FileCreateTypeIdentifierString| |&#10003;|
|[failed](#propertyfailed-boolean)|Boolean| ||
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyfailed-boolean"></a>
## Property failed ∷ Boolean

* This entry is optional



<a id="propertyfile_name-shortstringstring"></a>
## Property file_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyfile_path-medstringstring"></a>
## Property file_path ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map99-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map99)

<a id="propertytype-filecreatetypeidentifierstring"></a>
## Property type ∷ FileCreateTypeIdentifierString

* This entry is required


  * Must equal: "FileCreateEvent"

<a id="map99"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map77"></a>
# *LibraryLoadType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[dll_library_name](#propertydll_library_name-shortstringstring)|ShortStringString| |&#10003;|
|[dll_library_path](#propertydll_library_path-medstringstring)|MedStringString| |&#10003;|
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-libraryloadtypeidentifierstring)|LibraryLoadTypeIdentifierString| |&#10003;|
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertydll_library_name-shortstringstring"></a>
## Property dll_library_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertydll_library_path-medstringstring"></a>
## Property dll_library_path ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map100-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map100)

<a id="propertytype-libraryloadtypeidentifierstring"></a>
## Property type ∷ LibraryLoadTypeIdentifierString

* This entry is required


  * Must equal: "LibraryLoadEvent"

<a id="map100"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map76"></a>
# *ProcessCreateType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-processcreatetypeidentifierstring)|ProcessCreateTypeIdentifierString| |&#10003;|
|[parent_creation_time](#propertyparent_creation_time-instdate)|Inst (Date)| ||
|[parent_process_args](#propertyparent_process_args-medstringstring)|MedStringString| ||
|[parent_process_disposition](#propertyparent_process_disposition-shortstringstring)|ShortStringString| ||
|[parent_process_guid](#propertyparent_process_guid-integer)|Integer| ||
|[parent_process_hash](#propertyparent_process_hash-medstringstring)|MedStringString| ||
|[parent_process_id](#propertyparent_process_id-integer)|Integer| ||
|[parent_process_name](#propertyparent_process_name-shortstringstring)|ShortStringString| ||
|[parent_process_size](#propertyparent_process_size-integer)|Integer| ||
|[parent_process_username](#propertyparent_process_username-shortstringstring)|ShortStringString| ||
|[process_args](#propertyprocess_args-medstringstring)|MedStringString| ||
|[process_disposition](#propertyprocess_disposition-shortstringstring)|ShortStringString| ||
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_hash](#propertyprocess_hash-medstringstring)|MedStringString| ||
|[process_size](#propertyprocess_size-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyparent_creation_time-instdate"></a>
## Property parent_creation_time ∷ Inst (Date)

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyparent_process_args-medstringstring"></a>
## Property parent_process_args ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertyparent_process_disposition-shortstringstring"></a>
## Property parent_process_disposition ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_guid-integer"></a>
## Property parent_process_guid ∷ Integer

* This entry is optional



<a id="propertyparent_process_hash-medstringstring"></a>
## Property parent_process_hash ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertyparent_process_id-integer"></a>
## Property parent_process_id ∷ Integer

* This entry is optional



<a id="propertyparent_process_name-shortstringstring"></a>
## Property parent_process_name ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_size-integer"></a>
## Property parent_process_size ∷ Integer

* This entry is optional



<a id="propertyparent_process_username-shortstringstring"></a>
## Property parent_process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_args-medstringstring"></a>
## Property process_args ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertyprocess_disposition-shortstringstring"></a>
## Property process_disposition ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_hash-medstringstring"></a>
## Property process_hash ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_size-integer"></a>
## Property process_size ∷ Integer

* This entry is optional



<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map101-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map101)

<a id="propertytype-processcreatetypeidentifierstring"></a>
## Property type ∷ ProcessCreateTypeIdentifierString

* This entry is required


  * Must equal: "ProcessCreateEvent"

<a id="map101"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map74"></a>
# *ObservedRelation* Object

*ObservedRelation* A relation inside a Sighting.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[origin](#propertyorigin-string)|String| |&#10003;|
|[related](#propertyrelated-observableobject)|*Observable* Object| |&#10003;|
|[relation](#propertyrelation-observablerelationtypestring)|ObservableRelationTypeString| |&#10003;|
|[source](#propertysource-observableobject)|*Observable* Object| |&#10003;|
|[origin_uri](#propertyorigin_uri-string)|String| ||
|[relation_info](#propertyrelation_info-object)|Object| ||


<a id="propertyorigin-string"></a>
## Property origin ∷ String

* This entry is required



<a id="propertyorigin_uri-string"></a>
## Property origin_uri ∷ String

* This entry is optional


  * A URI

<a id="propertyrelated-observableobject"></a>
## Property related ∷ *Observable* Object

* This entry is required


<a id="map104-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map104)

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

<a id="propertyrelation_info-object"></a>
## Property relation_info ∷ Object

* This entry is optional


<a id="map102-ref"></a>
* Object Value
  * Details: [Object](#map102)

<a id="propertysource-observableobject"></a>
## Property source ∷ *Observable* Object

* This entry is required


<a id="map103-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map103)

<a id="map104"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
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
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map103"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
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
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map102"></a>
# Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[Keyword](#propertykeyword-anything)|Anything| |&#10003;|


<a id="propertykeyword-anything"></a>
## Property Keyword ∷ Anything

* This entry is required



<a id="map73"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
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
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map72"></a>
# *IdentitySpecification* Object

*IdentitySpecification* Describes the target of the sighting and contains identifying observables for the target.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#propertyobservables-observableobjectlist)|*Observable* Object List| |&#10003;|
|[observed_time](#propertyobserved_time-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-sensorstring)|SensorString| |&#10003;|
|[os](#propertyos-string)|String| ||


<a id="propertyobservables-observableobjectlist"></a>
## Property observables ∷ *Observable* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map105-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map105)

<a id="propertyobserved_time-observedtimeobject"></a>
## Property observed_time ∷ *ObservedTime* Object

* This entry is required


<a id="map106-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map106)

<a id="propertyos-string"></a>
## Property os ∷ String

* This entry is optional



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

<a id="map106"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map105"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
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
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map71"></a>
# *SensorCoordinates* Object

*SensorCoordinates* Describes the device that made the sighting (sensor) and contains identifying observables for the sensor.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#propertyobservables-observableobjectlist)|*Observable* Object List| |&#10003;|
|[type](#propertytype-sensorstring)|SensorString| |&#10003;|
|[os](#propertyos-string)|String| ||


<a id="propertyobservables-observableobjectlist"></a>
## Property observables ∷ *Observable* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map107-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map107)

<a id="propertyos-string"></a>
## Property os ∷ String

* This entry is optional



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

<a id="map107"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
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
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map70"></a>
# *SightingDataTable* Object

*SightingDataTable* An embedded data table for sightings data.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[columns](#propertycolumns-columndefinitionobjectlist)|*ColumnDefinition* Object List|an ordered list of column definitions|&#10003;|
|[rows](#propertyrows-anythinglistlist)|Anything List|an ordered list of rows|&#10003;|
|[row_count](#propertyrow_count-integer)|Integer|The number of rows in the data table.||


<a id="propertycolumns-columndefinitionobjectlist"></a>
## Property columns ∷ *ColumnDefinition* Object List

an ordered list of column definitions

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map108-ref"></a>
* *ColumnDefinition* Object Value
  * Details: [*ColumnDefinition* Object](#map108)

<a id="propertyrow_count-integer"></a>
## Property row_count ∷ Integer

The number of rows in the data table.

* This entry is optional



<a id="propertyrows-anythinglistlist"></a>
## Property rows ∷ Anything List List

an ordered list of rows

* This entry is required
* This entry's type is sequential (allows zero or more values)



<a id="map108"></a>
# *ColumnDefinition* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[name](#propertyname-string)|String| |&#10003;|
|[type](#propertytype-columntypestring)|ColumnTypeString| |&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[required](#propertyrequired-boolean)|Boolean|If true, the row entries for this column cannot contain nulls. Defaults to true||
|[short_description](#propertyshort_description-string)|String| ||


<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyname-string"></a>
## Property name ∷ String

* This entry is required



<a id="propertyrequired-boolean"></a>
## Property required ∷ Boolean

If true, the row entries for this column cannot contain nulls. Defaults to true

* This entry is optional



<a id="propertyshort_description-string"></a>
## Property short_description ∷ String

* This entry is optional



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

<a id="map69"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map68"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map19"></a>
# *Relationship* Object

*Relationship* Represents a relationship between two entities

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[relationship_type](#propertyrelationship_type-relationshiptypestring)|RelationshipTypeString| |&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[source_ref](#propertysource_ref-string)|String| |&#10003;|
|[target_ref](#propertytarget_ref-string)|String| |&#10003;|
|[type](#propertytype-relationshiptypeidentifierstring)|RelationshipTypeIdentifierString| |&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||


<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map109-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map109)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

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
    * phase-of
    * related-to
    * sighting-of
    * subtechnique-of
    * targets
    * task-of
    * technique-of
    * uses
    * variant-of

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_ref-string"></a>
## Property source_ref ∷ String

* This entry is required


  * A URI leading to an entity

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytarget_ref-string"></a>
## Property target_ref ∷ String

* This entry is required


  * A URI leading to an entity

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

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

<a id="propertytype-relationshiptypeidentifierstring"></a>
## Property type ∷ RelationshipTypeIdentifierString

* This entry is required


  * Must equal: "relationship"

<a id="map109"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map18"></a>
# *Note* Object

*Note* A Note is intended to convey informative text to provide further context and/or to provide additional analysis not contained in the Objects, assigning Text/content to the Object the Note relates to Notes can be created by anyone (not just the original object creator).
For example, an analyst may add a Note to a Campaign object created by another organization indicating that they've seen posts related to that Campaign on a hacker forum.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[content](#propertycontent-markdownstring)|MarkdownString| |&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[note_class](#propertynote_class-keyword)|Keyword| |&#10003;|
|[related_entities](#propertyrelated_entities-noterelatedentityobjectlist)|*NoteRelatedEntity* Object List| |&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-notetypeidentifierstring)|NoteTypeIdentifierString| |&#10003;|
|[author](#propertyauthor-string)|String| ||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||


<a id="propertyauthor-string"></a>
## Property author ∷ String

* This entry is optional



<a id="propertycontent-markdownstring"></a>
## Property content ∷ MarkdownString

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map110-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map110)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertynote_class-keyword"></a>
## Property note_class ∷ Keyword

* This entry is required



<a id="propertyrelated_entities-noterelatedentityobjectlist"></a>
## Property related_entities ∷ *NoteRelatedEntity* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map111-ref"></a>
* *NoteRelatedEntity* Object Value
  * Details: [*NoteRelatedEntity* Object](#map111)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

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

<a id="propertytype-notetypeidentifierstring"></a>
## Property type ∷ NoteTypeIdentifierString

* This entry is required


  * Must equal: "note"

<a id="map111"></a>
# *NoteRelatedEntity* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[entity_id](#propertyentity_id-string)|String| |&#10003;|
|[entity_type](#propertyentity_type-string)|String| |&#10003;|


<a id="propertyentity_id-string"></a>
## Property entity_id ∷ String

* This entry is required


  * A URI leading to an entity

<a id="propertyentity_type-string"></a>
## Property entity_type ∷ String

* This entry is required



<a id="map110"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map17"></a>
# *Malware* Object

*Malware* Malware is a type of TTP that is also known as malicious code and malicious software, and refers to a program that is inserted into a system, usually covertly, with the intent of compromising the confidentiality, integrity, or availability of the victim's data, applications, or operating system (OS) or of otherwise annoying or disrupting the victim. Malware such as viruses and worms are usually designed to perform these nefarious functions in such a way that users are unaware of them, at least initially.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[labels](#propertylabels-malwarelabelstringlist)|MalwareLabelString List|The type of malware being described.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.|&#10003;|
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value|&#10003;|
|[type](#propertytype-malwaretypeidentifierstring)|MalwareTypeIdentifierString| |&#10003;|
|[abstraction_level](#propertyabstraction_level-malwareabstractionsstring)|MalwareAbstractionsString|Malware abstraction level||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[kill_chain_phases](#propertykill_chain_phases-killchainphaseobjectlist)|*KillChainPhase* Object List|The list of Kill Chain Phases for which this Malware can be used.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||
|[x_mitre_aliases](#propertyx_mitre_aliases-shortstringstringlist)|ShortStringString List|ATT&CK Software.aliases||

* Reference: [Malware](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/pub#h.s5l7katgbp09)

<a id="propertyabstraction_level-malwareabstractionsstring"></a>
## Property abstraction_level ∷ MalwareAbstractionsString

Malware abstraction level

* This entry is optional


  * *MalwareAbstractions* Malware Abstraction level
  * Allowed Values:
    * family
    * variant
    * version

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map112-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map112)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertykill_chain_phases-killchainphaseobjectlist"></a>
## Property kill_chain_phases ∷ *KillChainPhase* Object List

The list of Kill Chain Phases for which this Malware can be used.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map113-ref"></a>
* *KillChainPhase* Object Value
  * Details: [*KillChainPhase* Object](#map113)

<a id="propertylabels-malwarelabelstringlist"></a>
## Property labels ∷ MalwareLabelString List

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

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

A short title for this object, used as primary display and reference value

* This entry is required


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

<a id="propertytype-malwaretypeidentifierstring"></a>
## Property type ∷ MalwareTypeIdentifierString

* This entry is required


  * Must equal: "malware"

<a id="propertyx_mitre_aliases-shortstringstringlist"></a>
## Property x_mitre_aliases ∷ ShortStringString List

ATT&CK Software.aliases

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="map113"></a>
# *KillChainPhase* Object

*KillChainPhase* The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)|String|The name of the kill chain.|&#10003;|
|[phase_name](#propertyphase_name-string)|String|The name of the phase in the kill chain.|&#10003;|

* Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

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

<a id="map112"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map16"></a>
# *Judgement* Object

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
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| |&#10003;|
|[disposition](#propertydisposition-dispositionnumberinteger)|DispositionNumberInteger|Matches :disposition_name as in {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}|&#10003;|
|[disposition_name](#propertydisposition_name-dispositionnamestring)|DispositionNameString| |&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[observable](#propertyobservable-observableobject)|*Observable* Object| |&#10003;|
|[priority](#propertypriority-integer)|Integer| |&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[severity](#propertyseverity-severitystring)|SeverityString| |&#10003;|
|[source](#propertysource-medstringstring)|MedStringString| |&#10003;|
|[type](#propertytype-judgementtypeidentifierstring)|JudgementTypeIdentifierString| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[reason](#propertyreason-shortstringstring)|ShortStringString| ||
|[reason_uri](#propertyreason_uri-string)|String| ||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||


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

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map114-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map114)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyobservable-observableobject"></a>
## Property observable ∷ *Observable* Object

* This entry is required


<a id="map115-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map115)

<a id="propertypriority-integer"></a>
## Property priority ∷ Integer

* This entry is required


  * A value 0-100 that determine the priority of a judgement. Curated feeds of black/white lists, for example known good products within your organizations, should use a 95. All automated systems should use a priority of 90, or less.  Human judgements should have a priority of 100, so that humans can always override machines.

<a id="propertyreason-shortstringstring"></a>
## Property reason ∷ ShortStringString

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

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyseverity-severitystring"></a>
## Property severity ∷ SeverityString

* This entry is required


  * Allowed Values:
    * Critical
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

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

<a id="propertytype-judgementtypeidentifierstring"></a>
## Property type ∷ JudgementTypeIdentifierString

* This entry is required


  * Must equal: "judgement"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map116-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map116)

<a id="map116"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map115"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
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
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map114"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map15"></a>
# *Indicator* Object

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
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[producer](#propertyproducer-shortstringstring)|ShortStringString| |&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-indicatortypeidentifierstring)|IndicatorTypeIdentifierString|The fixed value indicator|&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object|The time range during which this Indicator is considered valid.|&#10003;|
|[composite_indicator_expression](#propertycomposite_indicator_expression-compositeindicatorexpressionobject)|*CompositeIndicatorExpression* Object| ||
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|level of confidence held in the accuracy of this Indicator||
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[indicator_type](#propertyindicator_type-indicatortypestringlist)|IndicatorTypeString List|Specifies the type or types for this Indicator||
|[kill_chain_phases](#propertykill_chain_phases-killchainphaseobjectlist)|*KillChainPhase* Object List|relevant kill chain phases indicated by this Indicator||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[likely_impact](#propertylikely_impact-longstringstring)|LongStringString|likely potential impact within the relevant context if this Indicator were to occur||
|[negate](#propertynegate-boolean)|Boolean|specifies the absence of the pattern||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[severity](#propertyseverity-severitystring)|SeverityString| ||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[specification](#propertyspecification-either)|*JudgementSpecification* Object| ||
|[tags](#propertytags-shortstringstringlist)|ShortStringString List|Descriptors for this indicator||
|[test_mechanisms](#propertytest_mechanisms-medstringstringlist)|MedStringString List|Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [IndicatorType](http://stixproject.github.io/data-model/1.2/indicator/IndicatorType/)

<a id="propertycomposite_indicator_expression-compositeindicatorexpressionobject"></a>
## Property composite_indicator_expression ∷ *CompositeIndicatorExpression* Object

* This entry is optional


<a id="map119-ref"></a>
* *CompositeIndicatorExpression* Object Value
  * Details: [*CompositeIndicatorExpression* Object](#map119)

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

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map117-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map117)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyindicator_type-indicatortypestringlist"></a>
## Property indicator_type ∷ IndicatorTypeString List

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

<a id="propertykill_chain_phases-killchainphaseobjectlist"></a>
## Property kill_chain_phases ∷ *KillChainPhase* Object List

relevant kill chain phases indicated by this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


<a id="map120-ref"></a>
* *KillChainPhase* Object Value
  * Details: [*KillChainPhase* Object](#map120)

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylikely_impact-longstringstring"></a>
## Property likely_impact ∷ LongStringString

likely potential impact within the relevant context if this Indicator were to occur

* This entry is optional


  * *LongString* String with at most 5000 characters

<a id="propertynegate-boolean"></a>
## Property negate ∷ Boolean

specifies the absence of the pattern

* This entry is optional



<a id="propertyproducer-shortstringstring"></a>
## Property producer ∷ ShortStringString

* This entry is required
* Dev Notes: TODO - Document what is supposed to be in this field!


  * *ShortString* String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyseverity-severitystring"></a>
## Property severity ∷ SeverityString

* This entry is optional


  * Allowed Values:
    * Critical
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

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

<a id="map121-ref"></a>
* *JudgementSpecification* Object Value
  * Details: [*JudgementSpecification* Object](#map121)

<a id="map122-ref"></a>
* *ThreatBrainSpecification* Object Value
  * Details: [*ThreatBrainSpecification* Object](#map122)

<a id="map123-ref"></a>
* *SnortSpecification* Object Value
  * Details: [*SnortSpecification* Object](#map123)

<a id="map124-ref"></a>
* *SIOCSpecification* Object Value
  * Details: [*SIOCSpecification* Object](#map124)

<a id="map125-ref"></a>
* *OpenIOCSpecification* Object Value
  * Details: [*OpenIOCSpecification* Object](#map125)

<a id="propertytags-shortstringstringlist"></a>
## Property tags ∷ ShortStringString List

Descriptors for this indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertytest_mechanisms-medstringstringlist"></a>
## Property test_mechanisms ∷ MedStringString List

Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


  * *MedString* String with at most 2048 characters

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

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

<a id="propertytype-indicatortypeidentifierstring"></a>
## Property type ∷ IndicatorTypeIdentifierString

The fixed value indicator

* This entry is required


  * *IndicatorTypeIdentifier* The fixed value "indicator"
  * Must equal: "indicator"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

The time range during which this Indicator is considered valid.

* This entry is required


<a id="map118-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map118)

<a id="map125"></a>
# *OpenIOCSpecification* Object

*OpenIOCSpecification* An indicator which contains an XML blob of an openIOC indicator..

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[open_IOC](#propertyopen_ioc-string)|String| |&#10003;|
|[type](#propertytype-openiocspecificationtypestring)|OpenIOCSpecificationTypeString| |&#10003;|


<a id="propertyopen_ioc-string"></a>
## Property open_IOC ∷ String

* This entry is required



<a id="propertytype-openiocspecificationtypestring"></a>
## Property type ∷ OpenIOCSpecificationTypeString

* This entry is required


  * Must equal: "OpenIOC"

<a id="map124"></a>
# *SIOCSpecification* Object

*SIOCSpecification* An indicator which runs in snort...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[SIOC](#propertysioc-string)|String| |&#10003;|
|[type](#propertytype-siocspecificationtypestring)|SIOCSpecificationTypeString| |&#10003;|


<a id="propertysioc-string"></a>
## Property SIOC ∷ String

* This entry is required



<a id="propertytype-siocspecificationtypestring"></a>
## Property type ∷ SIOCSpecificationTypeString

* This entry is required


  * Must equal: "SIOC"

<a id="map123"></a>
# *SnortSpecification* Object

*SnortSpecification* An indicator which runs in snort...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[snort_sig](#propertysnort_sig-string)|String| |&#10003;|
|[type](#propertytype-snortspecificationtypestring)|SnortSpecificationTypeString| |&#10003;|


<a id="propertysnort_sig-string"></a>
## Property snort_sig ∷ String

* This entry is required



<a id="propertytype-snortspecificationtypestring"></a>
## Property type ∷ SnortSpecificationTypeString

* This entry is required


  * Must equal: "Snort"

<a id="map122"></a>
# *ThreatBrainSpecification* Object

*ThreatBrainSpecification* An indicator which runs in threatbrain...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-threatbrainspecificationtypestring)|ThreatBrainSpecificationTypeString| |&#10003;|
|[variables](#propertyvariables-stringlist)|String List| |&#10003;|
|[query](#propertyquery-string)|String| ||


<a id="propertyquery-string"></a>
## Property query ∷ String

* This entry is optional



<a id="propertytype-threatbrainspecificationtypestring"></a>
## Property type ∷ ThreatBrainSpecificationTypeString

* This entry is required


  * Must equal: "ThreatBrain"

<a id="propertyvariables-stringlist"></a>
## Property variables ∷ String List

* This entry is required
* This entry's type is sequential (allows zero or more values)



<a id="map121"></a>
# *JudgementSpecification* Object

*JudgementSpecification* An indicator based on a list of judgements.  If any of the Observables in it's judgements are encountered, than it may be matches against.  If there are any required judgements, they all must be matched in order for the indicator to be considered a match.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[judgements](#propertyjudgements-stringlist)|String List| |&#10003;|
|[required_judgements](#propertyrequired_judgements-relatedjudgementobjectlist)|*RelatedJudgement* Object List| |&#10003;|
|[type](#propertytype-judgementspecificationtypestring)|JudgementSpecificationTypeString| |&#10003;|


<a id="propertyjudgements-stringlist"></a>
## Property judgements ∷ String List

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * A URI leading to a judgement

<a id="propertyrequired_judgements-relatedjudgementobjectlist"></a>
## Property required_judgements ∷ *RelatedJudgement* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map126-ref"></a>
* *RelatedJudgement* Object Value
  * Details: [*RelatedJudgement* Object](#map126)

<a id="propertytype-judgementspecificationtypestring"></a>
## Property type ∷ JudgementSpecificationTypeString

* This entry is required


  * Must equal: "Judgement"

<a id="map126"></a>
# *RelatedJudgement* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[judgement_id](#propertyjudgement_id-string)|String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| ||
|[relationship](#propertyrelationship-string)|String| ||
|[source](#propertysource-string)|String| ||


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

<a id="propertyjudgement_id-string"></a>
## Property judgement_id ∷ String

* This entry is required


  * A URI leading to a judgement

<a id="propertyrelationship-string"></a>
## Property relationship ∷ String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷ String

* This entry is optional



<a id="map120"></a>
# *KillChainPhase* Object

*KillChainPhase* The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)|String|The name of the kill chain.|&#10003;|
|[phase_name](#propertyphase_name-string)|String|The name of the phase in the kill chain.|&#10003;|

* Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

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

<a id="map119"></a>
# *CompositeIndicatorExpression* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[indicator_ids](#propertyindicator_ids-stringlist)|String List| |&#10003;|
|[operator](#propertyoperator-booleanoperatorstring)|BooleanOperatorString| |&#10003;|

* Reference: [CompositeIndicatorExpressionType](http://stixproject.github.io/data-model/1.2/indicator/CompositeIndicatorExpressionType/)

<a id="propertyindicator_ids-stringlist"></a>
## Property indicator_ids ∷ String List

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

<a id="map118"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map117"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map14"></a>
# *Incident* Object

*Incident* Information about computer security incident response. A computer security
   incident is a violation or imminent threat of violation of computer
   security policies, acceptable use policies, or standard security practices.
   Incidents pertain to one or more *adverse events*, each of which is modeled
   as a [sighting](sighting.md).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|level of confidence held in the characterization of this Incident|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[incident_time](#propertyincident_time-incidenttimeobject)|*IncidentTime* Object|relevant time values associated with this Incident|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[status](#propertystatus-statusstring)|StatusString|current status of the incident|&#10003;|
|[type](#propertytype-incidenttypeidentifierstring)|IncidentTypeIdentifierString| |&#10003;|
|[assignees](#propertyassignees-shortstringstringlist)|ShortStringString List|a set of owners assigned to this incident||
|[categories](#propertycategories-incidentcategorystringlist)|IncidentCategoryString List|a set of categories for this incident||
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[discovery_method](#propertydiscovery_method-discoverymethodstring)|DiscoveryMethodString|identifies how the incident was discovered||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[intended_effect](#propertyintended_effect-intendedeffectstring)|IntendedEffectString|specifies the suspected intended effect of this incident||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[promotion_method](#propertypromotion_method-promotionmethodstring)|PromotionMethodString|identifies how the incident was promoted||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[scores](#propertyscores-incidentscoresobject)|*IncidentScores* Object|the scores associated to the incident||
|[severity](#propertyseverity-severitystring)|SeverityString|specifies the severity level of an Incident||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[tactics](#propertytactics-shortstringstringlist)|ShortStringString List|specifies the list of tactic ids (ex: mitre tactic id) of an Incident||
|[techniques](#propertytechniques-shortstringstringlist)|ShortStringString List|specifies the list of technique ids (ex: mitre technique id) of an Incident||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||


<a id="propertyassignees-shortstringstringlist"></a>
## Property assignees ∷ ShortStringString List

a set of owners assigned to this incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertycategories-incidentcategorystringlist"></a>
## Property categories ∷ IncidentCategoryString List

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

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map127-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map127)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyincident_time-incidenttimeobject"></a>
## Property incident_time ∷ *IncidentTime* Object

relevant time values associated with this Incident

* This entry is required
* Dev Notes: Was 'time'; renamed for clarity


<a id="map128-ref"></a>
* *IncidentTime* Object Value
  * Details: [*IncidentTime* Object](#map128)

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

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertypromotion_method-promotionmethodstring"></a>
## Property promotion_method ∷ PromotionMethodString

identifies how the incident was promoted

* This entry is optional


  * Allowed Values:
    * Automated
    * Manual

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyscores-incidentscoresobject"></a>
## Property scores ∷ *IncidentScores* Object

the scores associated to the incident

* This entry is optional


<a id="map129-ref"></a>
* *IncidentScores* Object Value
  * Details: [*IncidentScores* Object](#map129)

<a id="propertyseverity-severitystring"></a>
## Property severity ∷ SeverityString

specifies the severity level of an Incident

* This entry is optional


  * Allowed Values:
    * Critical
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

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

<a id="propertytactics-shortstringstringlist"></a>
## Property tactics ∷ ShortStringString List

specifies the list of tactic ids (ex: mitre tactic id) of an Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertytechniques-shortstringstringlist"></a>
## Property techniques ∷ ShortStringString List

specifies the list of technique ids (ex: mitre technique id) of an Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

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

<a id="propertytype-incidenttypeidentifierstring"></a>
## Property type ∷ IncidentTypeIdentifierString

* This entry is required


  * Must equal: "incident"

<a id="map129"></a>
# *IncidentScores* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[Keyword](#propertykeyword-number)|Number|A map of scores.||


<a id="propertykeyword-number"></a>
## Property Keyword ∷ Number

A map of scores.

* This entry is optional

  * Allowed Values:
    * :asset
    * :global
    * :ttp

  * a non-negative score number

<a id="map128"></a>
# *IncidentTime* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[opened](#propertyopened-instdate)|Inst (Date)|Time the incident was first opened.|&#10003;|
|[closed](#propertyclosed-instdate)|Inst (Date)|Time that the incident was last closed.||
|[discovered](#propertydiscovered-instdate)|Inst (Date)|Time the incident was first discovered.||
|[rejected](#propertyrejected-instdate)|Inst (Date)|Time that the incident was first rejected.||
|[remediated](#propertyremediated-instdate)|Inst (Date)|Time that the remediation of the damage from the incident was completed.||
|[reported](#propertyreported-instdate)|Inst (Date)|Time the incident was first reported.||


<a id="propertyclosed-instdate"></a>
## Property closed ∷ Inst (Date)

Time that the incident was last closed.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertydiscovered-instdate"></a>
## Property discovered ∷ Inst (Date)

Time the incident was first discovered.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyopened-instdate"></a>
## Property opened ∷ Inst (Date)

Time the incident was first opened.

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyrejected-instdate"></a>
## Property rejected ∷ Inst (Date)

Time that the incident was first rejected.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyremediated-instdate"></a>
## Property remediated ∷ Inst (Date)

Time that the remediation of the damage from the incident was completed.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyreported-instdate"></a>
## Property reported ∷ Inst (Date)

Time the incident was first reported.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map127"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map13"></a>
# *Feedback* Object

*Feedback* Feedback on any entity.  Is it wrong?  If so why?  Was
  it right-on, and worthy of confirmation?

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[entity_id](#propertyentity_id-string)|String| |&#10003;|
|[feedback](#propertyfeedback-integer)|Integer| |&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[reason](#propertyreason-string)|String| |&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-feedbacktypeidentifierstring)|FeedbackTypeIdentifierString| |&#10003;|
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||


<a id="propertyentity_id-string"></a>
## Property entity_id ∷ String

* This entry is required


  * A URI leading to an entity

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map130-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map130)

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

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyreason-string"></a>
## Property reason ∷ String

* This entry is required



<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

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

<a id="propertytype-feedbacktypeidentifierstring"></a>
## Property type ∷ FeedbackTypeIdentifierString

* This entry is required


  * Must equal: "feedback"

<a id="map130"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map12"></a>
# *COA* Object

*COA* Course of Action. A corrective or preventative action to be taken in response to a threat

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-coatypeidentifierstring)|COATypeIdentifierString| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[coa_type](#propertycoa_type-coatypestring)|COATypeString|The type of this COA||
|[cost](#propertycost-highmedlowstring)|HighMedLowString|Characterizes the estimated cost for applying this course of action||
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[efficacy](#propertyefficacy-highmedlowstring)|HighMedLowString|Effectiveness of this course of action in achieving its targeted objective||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[impact](#propertyimpact-shortstringstring)|ShortStringString|Characterizes the estimated impact of applying this course of action||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[objective](#propertyobjective-shortstringstringlist)|ShortStringString List|Characterizes the objective of this course of action||
|[open_c2_coa](#propertyopen_c2_coa-openc2coaobject)|*OpenC2COA* Object| ||
|[related_COAs](#propertyrelated_coas-relatedcoaobjectlist)|*RelatedCOA* Object List|Identifies or characterizes relationships to one or more related courses of action||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[stage](#propertystage-coastagestring)|COAStageString|Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to||
|[structured_coa_type](#propertystructured_coa_type-openc2structuredcoatypestring)|OpenC2StructuredCOATypeString| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [CourseOfActionType](http://stixproject.github.io/data-model/1.2/coa/CourseOfActionType/)

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
    * Phase
    * Physical Access Restrictions
    * Playbook
    * Policy Actions
    * Public Disclosure
    * Rebuilding
    * Redirection
    * Redirection (Honey Pot)
    * Task
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

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map131-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map131)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyimpact-shortstringstring"></a>
## Property impact ∷ ShortStringString

Characterizes the estimated impact of applying this course of action

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyobjective-shortstringstringlist"></a>
## Property objective ∷ ShortStringString List

Characterizes the objective of this course of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Squashed / simplified


  * *ShortString* String with at most 1024 characters

<a id="propertyopen_c2_coa-openc2coaobject"></a>
## Property open_c2_coa ∷ *OpenC2COA* Object

* This entry is optional


<a id="map134-ref"></a>
* *OpenC2COA* Object Value
  * Details: [*OpenC2COA* Object](#map134)

<a id="propertyrelated_coas-relatedcoaobjectlist"></a>
## Property related_COAs ∷ *RelatedCOA* Object List

Identifies or characterizes relationships to one or more related courses of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map133-ref"></a>
* *RelatedCOA* Object Value
  * Details: [*RelatedCOA* Object](#map133)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

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
    * Containment
    * Eradication
    * Identification
    * Lessons Learned
    * Preparation
    * Recovery
    * Remedy
    * Response
  * Reference: [COAStageVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/COAStageVocab-1.0/)

<a id="propertystructured_coa_type-openc2structuredcoatypestring"></a>
## Property structured_coa_type ∷ OpenC2StructuredCOATypeString

* This entry is optional


  * Must equal: "openc2"

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

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

<a id="propertytype-coatypeidentifierstring"></a>
## Property type ∷ COATypeIdentifierString

* This entry is required


  * Must equal: "coa"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map132-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map132)

<a id="map134"></a>
# *OpenC2COA* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[action](#propertyaction-actiontypeobject)|*ActionType* Object| |&#10003;|
|[type](#propertytype-structuredcoatypestring)|StructuredCOATypeString| |&#10003;|
|[actuator](#propertyactuator-actuatortypeobject)|*ActuatorType* Object| ||
|[id](#propertyid-shortstringstring)|ShortStringString| ||
|[modifiers](#propertymodifiers-modifiertypeobject)|*ModifierType* Object| ||
|[target](#propertytarget-targettypeobject)|*TargetType* Object| ||


<a id="propertyaction-actiontypeobject"></a>
## Property action ∷ *ActionType* Object

* This entry is required


<a id="map135-ref"></a>
* *ActionType* Object Value
  * Details: [*ActionType* Object](#map135)

<a id="propertyactuator-actuatortypeobject"></a>
## Property actuator ∷ *ActuatorType* Object

* This entry is optional


<a id="map137-ref"></a>
* *ActuatorType* Object Value
  * Details: [*ActuatorType* Object](#map137)

<a id="propertyid-shortstringstring"></a>
## Property id ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertymodifiers-modifiertypeobject"></a>
## Property modifiers ∷ *ModifierType* Object

* This entry is optional


<a id="map138-ref"></a>
* *ModifierType* Object Value
  * Details: [*ModifierType* Object](#map138)

<a id="propertytarget-targettypeobject"></a>
## Property target ∷ *TargetType* Object

* This entry is optional


<a id="map136-ref"></a>
* *TargetType* Object Value
  * Details: [*TargetType* Object](#map136)

<a id="propertytype-structuredcoatypestring"></a>
## Property type ∷ StructuredCOATypeString

* This entry is required


  * Must equal: "structured_coa"

<a id="map138"></a>
# *ModifierType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[additional_properties](#propertyadditional_properties-additionalpropertiesobject)|*AdditionalProperties* Object| ||
|[delay](#propertydelay-instdate)|Inst (Date)| ||
|[destination](#propertydestination-string)|String| ||
|[duration](#propertyduration-instdate)|Inst (Date)| ||
|[frequency](#propertyfrequency-shortstringstring)|ShortStringString| ||
|[id](#propertyid-shortstringstring)|ShortStringString| ||
|[location](#propertylocation-string)|String| ||
|[method](#propertymethod-stringlist)|String List| ||
|[option](#propertyoption-shortstringstring)|ShortStringString| ||
|[response](#propertyresponse-string)|String| ||
|[search](#propertysearch-string)|String| ||
|[source](#propertysource-shortstringstring)|ShortStringString| ||
|[time](#propertytime-validtimeobject)|*ValidTime* Object| ||


<a id="propertyadditional_properties-additionalpropertiesobject"></a>
## Property additional_properties ∷ *AdditionalProperties* Object

* This entry is optional


<a id="map140-ref"></a>
* *AdditionalProperties* Object Value
  * Details: [*AdditionalProperties* Object](#map140)

<a id="propertydelay-instdate"></a>
## Property delay ∷ Inst (Date)

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

<a id="propertyduration-instdate"></a>
## Property duration ∷ Inst (Date)

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyfrequency-shortstringstring"></a>
## Property frequency ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyid-shortstringstring"></a>
## Property id ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylocation-string"></a>
## Property location ∷ String

* This entry is optional


  * Allowed Values:
    * internal
    * perimeter

<a id="propertymethod-stringlist"></a>
## Property method ∷ String List

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

<a id="propertyoption-shortstringstring"></a>
## Property option ∷ ShortStringString

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

<a id="propertysource-shortstringstring"></a>
## Property source ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-validtimeobject"></a>
## Property time ∷ *ValidTime* Object

* This entry is optional


<a id="map139-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map139)

<a id="map140"></a>
# *AdditionalProperties* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[context](#propertycontext-shortstringstring)|ShortStringString| |&#10003;|


<a id="propertycontext-shortstringstring"></a>
## Property context ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="map139"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map137"></a>
# *ActuatorType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-actuatortypestring)|ActuatorTypeString| |&#10003;|
|[specifiers](#propertyspecifiers-shortstringstringlist)|ShortStringString List|list of additional properties describing the actuator||


<a id="propertyspecifiers-shortstringstringlist"></a>
## Property specifiers ∷ ShortStringString List

list of additional properties describing the actuator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

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

<a id="map136"></a>
# *TargetType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-targettypevocabstring)|TargetTypeVocabString| |&#10003;|
|[specifiers](#propertyspecifiers-shortstringstring)|ShortStringString|observable types that can be acted upon||


<a id="propertyspecifiers-shortstringstring"></a>
## Property specifiers ∷ ShortStringString

observable types that can be acted upon

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytype-targettypevocabstring"></a>
## Property type ∷ TargetTypeVocabString

* This entry is required


  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
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
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="map135"></a>
# *ActionType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-coatypestring)|COATypeString| |&#10003;|


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

<a id="map133"></a>
# *RelatedCOA* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[COA_id](#propertycoa_id-string)|String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| ||
|[relationship](#propertyrelationship-string)|String| ||
|[source](#propertysource-string)|String| ||


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



<a id="map132"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map131"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map11"></a>
# *Campaign* Object

*Campaign* Represents a campaign by an [actor](actor.md) pursing an intent

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[campaign_type](#propertycampaign_type-shortstringstring)|ShortStringString| |&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.|&#10003;|
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value|&#10003;|
|[type](#propertytype-campaigntypeidentifierstring)|CampaignTypeIdentifierString| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object|Timestamp for the definition of a specific version of a campaign|&#10003;|
|[activity](#propertyactivity-activityobjectlist)|*Activity* Object List|Actions taken in regards to this Campaign||
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|Level of confidence held in the characterization of this Campaign||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[intended_effect](#propertyintended_effect-intendedeffectstringlist)|IntendedEffectString List|Characterizes the intended effect of this cyber threat campaign||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[names](#propertynames-shortstringstringlist)|ShortStringString List|Names used to identify this campaign||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[status](#propertystatus-campaignstatusstring)|CampaignStatusString|Status of this Campaign||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [CampaignType](http://stixproject.github.io/data-model/1.2/campaign/CampaignType/)

<a id="propertyactivity-activityobjectlist"></a>
## Property activity ∷ *Activity* Object List

Actions taken in regards to this Campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map143-ref"></a>
* *Activity* Object Value
  * Details: [*Activity* Object](#map143)

<a id="propertycampaign_type-shortstringstring"></a>
## Property campaign_type ∷ ShortStringString

* This entry is required
* Dev Notes: Should we define a vocabulary for this?


  * *ShortString* String with at most 1024 characters

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

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map141-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map141)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyintended_effect-intendedeffectstringlist"></a>
## Property intended_effect ∷ IntendedEffectString List

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

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertynames-shortstringstringlist"></a>
## Property names ∷ ShortStringString List

Names used to identify this campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

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

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

A short title for this object, used as primary display and reference value

* This entry is required


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

<a id="propertytype-campaigntypeidentifierstring"></a>
## Property type ∷ CampaignTypeIdentifierString

* This entry is required


  * Must equal: "campaign"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

Timestamp for the definition of a specific version of a campaign

* This entry is required


<a id="map142-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map142)

<a id="map143"></a>
# *Activity* Object

*Activity* What happend, when?

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[date_time](#propertydate_time-instdate)|Inst (Date)|Specifies the date and time at which the activity occured|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of the activity|&#10003;|

* Reference: [ActivityType](http://stixproject.github.io/data-model/1.2/stixCommon/ActivityType/)

<a id="propertydate_time-instdate"></a>
## Property date_time ∷ Inst (Date)

Specifies the date and time at which the activity occured

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of the activity

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="map142"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map141"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map10"></a>
# *AttackPattern* Object

*AttackPattern* Attack Patterns are a type of TTP that describe ways that adversaries attempt to compromise targets.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.|&#10003;|
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value|&#10003;|
|[type](#propertytype-attackpatterntypeidentifierstring)|AttackPatternTypeIdentifierString| |&#10003;|
|[abstraction_level](#propertyabstraction_level-attackpatternabstractionsstring)|AttackPatternAbstractionsString|The CAPEC abstraction level for patterns describing techniques to attack a system.||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|A list of external references which refer to non-STIX information. This property MAY be used to provide one or more Attack Pattern identifiers, such as a CAPEC ID. When specifying a CAPEC ID, the source_name property of the external reference MUST be set to capec and the external_id property MUST be formatted as CAPEC-[id].||
|[kill_chain_phases](#propertykill_chain_phases-killchainphaseobjectlist)|*KillChainPhase* Object List|The list of Kill Chain Phases for which this Attack Pattern is used.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||
|[x_mitre_contributors](#propertyx_mitre_contributors-shortstringstringlist)|ShortStringString List|ATT&CK Technique.Contributors||
|[x_mitre_data_sources](#propertyx_mitre_data_sources-shortstringstringlist)|ShortStringString List|ATT&CK Technique.Data Sources||
|[x_mitre_platforms](#propertyx_mitre_platforms-shortstringstringlist)|ShortStringString List|ATT&CK Technique.Platforms||

* Reference: [Attack Pattern](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/pub#h.axjijf603msy)

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

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

A list of external references which refer to non-STIX information. This property MAY be used to provide one or more Attack Pattern identifiers, such as a CAPEC ID. When specifying a CAPEC ID, the source_name property of the external reference MUST be set to capec and the external_id property MUST be formatted as CAPEC-[id].

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map145-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map145)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertykill_chain_phases-killchainphaseobjectlist"></a>
## Property kill_chain_phases ∷ *KillChainPhase* Object List

The list of Kill Chain Phases for which this Attack Pattern is used.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map146-ref"></a>
* *KillChainPhase* Object Value
  * Details: [*KillChainPhase* Object](#map146)

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

A short title for this object, used as primary display and reference value

* This entry is required


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

<a id="propertytype-attackpatterntypeidentifierstring"></a>
## Property type ∷ AttackPatternTypeIdentifierString

* This entry is required


  * Must equal: "attack-pattern"

<a id="propertyx_mitre_contributors-shortstringstringlist"></a>
## Property x_mitre_contributors ∷ ShortStringString List

ATT&CK Technique.Contributors

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertyx_mitre_data_sources-shortstringstringlist"></a>
## Property x_mitre_data_sources ∷ ShortStringString List

ATT&CK Technique.Data Sources

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertyx_mitre_platforms-shortstringstringlist"></a>
## Property x_mitre_platforms ∷ ShortStringString List

ATT&CK Technique.Platforms

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="map146"></a>
# *KillChainPhase* Object

*KillChainPhase* The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)|String|The name of the kill chain.|&#10003;|
|[phase_name](#propertyphase_name-string)|String|The name of the phase in the kill chain.|&#10003;|

* Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

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

<a id="map145"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map144"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map9"></a>
# *AssetProperties* Object

*AssetProperties* Assets do not have any product specific properties, those are represented in AssetProperties - which is a record that asserts one or more properties of an Asset for a specific time.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[asset_ref](#propertyasset_ref-string)|String|URI that points to the associated Asset.|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[source](#propertysource-medstringstring)|MedStringString| |&#10003;|
|[type](#propertytype-assetpropertiestypeidentifierstring)|AssetPropertiesTypeIdentifierString| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object|The time range during which the AssetProperties is considered valid.|&#10003;|
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[properties](#propertyproperties-assetpropertyobjectlist)|*AssetProperty* Object List| ||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [AssetProperties](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#assetproperties)

<a id="propertyasset_ref-string"></a>
## Property asset_ref ∷ String

URI that points to the associated Asset.

* This entry is required


  * A URI leading to an entity

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map147-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map147)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyproperties-assetpropertyobjectlist"></a>
## Property properties ∷ *AssetProperty* Object List

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map149-ref"></a>
* *AssetProperty* Object Value
  * Details: [*AssetProperty* Object](#map149)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

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

<a id="propertytype-assetpropertiestypeidentifierstring"></a>
## Property type ∷ AssetPropertiesTypeIdentifierString

* This entry is required


  * Must equal: "asset-properties"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

The time range during which the AssetProperties is considered valid.

* This entry is required


<a id="map148-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map148)

<a id="map149"></a>
# *AssetProperty* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[name](#propertyname-string)|String|The properties are an open vocabulary.|&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertyname-string"></a>
## Property name ∷ String

The properties are an open vocabulary.

* This entry is required
* Dev Notes: The properties are an open vocabulary, meaning that there is a defined set of values, but users may add their own values.See: https://github.com/threatgrid/ctim/blob/master/src/ctim/schemas/identity_assertion.cljc#L11



<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map148"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map147"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map8"></a>
# *AssetMapping* Object

*AssetMapping* a record that a specific Observable maps to an Asset for a specific time period.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[asset_ref](#propertyasset_ref-string)|String|URI that points to the mapped Asset.|&#10003;|
|[asset_type](#propertyasset_type-assettypestring)|AssetTypeString|Type of the mapped Asset: Device, Person, Application, etc.|&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|Level of confidence held in the characterization of this AssetMapping e.g.: is it susceptible to manipulation or translation?|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[observable](#propertyobservable-observableobject)|*Observable* Object|An AssetMapping is a record that a specific Observable maps to an Asset for an indicated period of time.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[source](#propertysource-medstringstring)|MedStringString| |&#10003;|
|[specificity](#propertyspecificity-specificitystring)|SpecificityString|Denotes the level of how many assets potentially could have this same identifier.|&#10003;|
|[stability](#propertystability-stabilitystring)|StabilityString|Do we manage when it changes, or is it always a time bound assignment?|&#10003;|
|[type](#propertytype-assetmappingtypeidentifierstring)|AssetMappingTypeIdentifierString| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object|For each asset, we allow for the assertion of time bound properties.This gives us both a record of the current state of the asset,as well as history.|&#10003;|
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [AssetMapping](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#assetmapping)

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

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map150-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map150)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyobservable-observableobject"></a>
## Property observable ∷ *Observable* Object

An AssetMapping is a record that a specific Observable maps to an Asset for an indicated period of time.

* This entry is required


<a id="map152-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map152)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

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

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

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

<a id="propertytype-assetmappingtypeidentifierstring"></a>
## Property type ∷ AssetMappingTypeIdentifierString

* This entry is required


  * Must equal: "asset-mapping"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

For each asset, we allow for the assertion of time bound properties.This gives us both a record of the current state of the asset,as well as history.

* This entry is required


<a id="map151-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map151)

<a id="map152"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
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
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map151"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map150"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map7"></a>
# *Asset* Object

*Asset* Describes a protected resource. It could be a device, user, network, application or data

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[asset_type](#propertyasset_type-assettypestring)|AssetTypeString|Type of the Asset: Device, Person, Application, etc.|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[source](#propertysource-medstringstring)|MedStringString| |&#10003;|
|[type](#propertytype-assettypeidentifierstring)|AssetTypeIdentifierString| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object|The time range during which the Asset is considered valid.|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [Assets](https://github.com/threatgrid/response/blob/master/features/assets/assets.org)

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

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map153-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map153)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

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

<a id="propertytype-assettypeidentifierstring"></a>
## Property type ∷ AssetTypeIdentifierString

* This entry is required


  * Must equal: "asset"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

The time range during which the Asset is considered valid.

* This entry is required


<a id="map154-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map154)

<a id="map154"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map153"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map6"></a>
# *Actor* Object

*Actor* Describes malicious actors (or adversaries) related to a cyber attack

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.|&#10003;|
|[source](#propertysource-medstringstring)|MedStringString| |&#10003;|
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value|&#10003;|
|[type](#propertytype-actortypeidentifierstring)|ActorTypeIdentifierString| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[actor_types](#propertyactor_types-threatactortypestringlist)|ThreatActorTypeString List| ||
|[aliases](#propertyaliases-shortstringstringlist)|ShortStringString List|A list of other names that this Threat Actor is believed to use.||
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| ||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[identity](#propertyidentity-identityobject)|*Identity* Object| ||
|[intended_effect](#propertyintended_effect-intendedeffectstring)|IntendedEffectString| ||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[motivation](#propertymotivation-motivationstring)|MotivationString| ||
|[planning_and_operational_support](#propertyplanning_and_operational_support-longstringstring)|LongStringString| ||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[sophistication](#propertysophistication-sophisticationstring)|SophisticationString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [ThreatActorType](http://stixproject.github.io/data-model/1.2/ta/ThreatActorType/)

<a id="propertyactor_types-threatactortypestringlist"></a>
## Property actor_types ∷ ThreatActorTypeString List

* This entry is optional
* This entry's type is sequential (allows zero or more values)


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

<a id="propertyaliases-shortstringstringlist"></a>
## Property aliases ∷ ShortStringString List

A list of other names that this Threat Actor is believed to use.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

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

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map155-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map155)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyidentity-identityobject"></a>
## Property identity ∷ *Identity* Object

* This entry is optional


<a id="map157-ref"></a>
* *Identity* Object Value
  * Details: [*Identity* Object](#map157)

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

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

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

<a id="propertyplanning_and_operational_support-longstringstring"></a>
## Property planning_and_operational_support ∷ LongStringString

* This entry is optional


  * *LongString* String with at most 5000 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysophistication-sophisticationstring"></a>
## Property sophistication ∷ SophisticationString

* This entry is optional


  * Allowed Values:
    * Aspirant
    * Expert
    * Innovator
    * Novice
    * Practitioner

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

A short title for this object, used as primary display and reference value

* This entry is required


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

<a id="propertytype-actortypeidentifierstring"></a>
## Property type ∷ ActorTypeIdentifierString

* This entry is required


  * Must equal: "actor"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map156-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map156)

<a id="map157"></a>
# *Identity* Object

*Identity* Describes a person or an organization

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString| |&#10003;|
|[related_identities](#propertyrelated_identities-relatedidentityobjectlist)|*RelatedIdentity* Object List|Identifies other entity Identities related to this Identity|&#10003;|

* Reference: [IdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyrelated_identities-relatedidentityobjectlist"></a>
## Property related_identities ∷ *RelatedIdentity* Object List

Identifies other entity Identities related to this Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map158-ref"></a>
* *RelatedIdentity* Object Value
  * Details: [*RelatedIdentity* Object](#map158)

<a id="map158"></a>
# *RelatedIdentity* Object

*RelatedIdentity* Describes a related Identity

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[identity](#propertyidentity-string)|String|The reference (URI) of the related Identity object|&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|Specifies the level of confidence in the assertion of the relationship between the two objects||
|[information_source](#propertyinformation_source-string)|String|Specifies the source of the information about the relationship between the two components||
|[relationship](#propertyrelationship-string)|String| ||

* Reference: [RelatedIdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/)

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

<a id="propertyidentity-string"></a>
## Property identity ∷ String

The reference (URI) of the related Identity object

* This entry is required


  * A URI

<a id="propertyinformation_source-string"></a>
## Property information_source ∷ String

Specifies the source of the information about the relationship between the two components

* This entry is optional



<a id="propertyrelationship-string"></a>
## Property relationship ∷ String

* This entry is optional



<a id="map156"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map155"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map5"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map4"></a>
# *Text* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[text](#propertytext-string)|String| |&#10003;|
|[type](#propertytype-string)|String| |&#10003;|


<a id="propertytext-string"></a>
## Property text ∷ String

* This entry is required



<a id="propertytype-string"></a>
## Property type ∷ String

* This entry is required


