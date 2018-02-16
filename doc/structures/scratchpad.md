<a id="top"></a>
# *Scratchpad* Object

Describes a CTIM Scratchpad which works like a structured gist

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)| String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-scratchpadtypeidentifierstring)|ScratchpadTypeIdentifier String| |&#10003;|
|[bundle](#propertybundle-bundleobject)|*Bundle* Object| ||
|[description](#propertydescription-string)| String| ||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-string)| String| ||
|[observables](#propertyobservables-observableobjectlist)|*Observable* Object List| ||
|[revision](#propertyrevision-integer)|Integer| ||
|[short_description](#propertyshort_description-string)| String| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[texts](#propertytexts-textobjectlist)|*Text* Object List| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||

* Reference: #

<a id="propertybundle-bundleobject"></a>
## Property bundle ∷ *Bundle* Object

* This entry is optional


<a id="map3-ref"></a>
* *Bundle* Object Value
  * Details: [*Bundle* Object](#map3)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

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
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyobservables-observableobjectlist"></a>
## Property observables ∷ *Observable* Object List

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map2-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map2)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

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

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-scratchpadtypeidentifierstring"></a>
## Property type ∷ ScratchpadTypeIdentifier String

* This entry is required


  * Must equal: "scratchpad"

<a id="map1"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map2"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



<a id="map3"></a>
# *Bundle* Object

Describes a Bundle of any set of CTIM entities

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)| String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[source](#propertysource-string)| String| |&#10003;|
|[type](#propertytype-bundletypeidentifierstring)|BundleTypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[actor_refs](#propertyactor_refs-string)|#{ String}| ||
|[actors](#propertyactors-actorobject)|#{*Actor* Object}|a list of `Actor`||
|[attack_pattern_refs](#propertyattack_pattern_refs-string)|#{ String}| ||
|[attack_patterns](#propertyattack_patterns-attackpatternobject)|#{*AttackPattern* Object}|a list of `AttackPattern`||
|[campaign_refs](#propertycampaign_refs-string)|#{ String}| ||
|[campaigns](#propertycampaigns-campaignobject)|#{*Campaign* Object}|a list of `Campaign`||
|[coa_refs](#propertycoa_refs-string)|#{ String}| ||
|[coas](#propertycoas-coaobject)|#{*COA* Object}|a list of `COA`||
|[data_table_refs](#propertydata_table_refs-string)|#{ String}| ||
|[data_tables](#propertydata_tables-datatableobject)|#{*DataTable* Object}|a list of `DataTable`||
|[description](#propertydescription-string)| String| ||
|[exploit_target_refs](#propertyexploit_target_refs-string)|#{ String}| ||
|[exploit_targets](#propertyexploit_targets-exploittargetobject)|#{*ExploitTarget* Object}|a list of `ExploitTarget`||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[feedback_refs](#propertyfeedback_refs-string)|#{ String}| ||
|[feedbacks](#propertyfeedbacks-feedbackobject)|#{*Feedback* Object}|a list of `Feedback`||
|[incident_refs](#propertyincident_refs-string)|#{ String}| ||
|[incidents](#propertyincidents-incidentobject)|#{*Incident* Object}|a list of `Incident`||
|[indicator_refs](#propertyindicator_refs-string)|#{ String}| ||
|[indicators](#propertyindicators-indicatorobject)|#{*Indicator* Object}|a list of `Indicator`||
|[judgement_refs](#propertyjudgement_refs-string)|#{ String}| ||
|[judgements](#propertyjudgements-judgementobject)|#{*Judgement* Object}|a list of `Judgement`||
|[language](#propertylanguage-string)| String| ||
|[malware_refs](#propertymalware_refs-string)|#{ String}| ||
|[malwares](#propertymalwares-malwareobject)|#{*Malware* Object}|a list of `Malware`||
|[relationship_refs](#propertyrelationship_refs-string)|#{ String}| ||
|[relationships](#propertyrelationships-relationshipobject)|#{*Relationship* Object}|a list of `Relationship`||
|[revision](#propertyrevision-integer)|Integer| ||
|[short_description](#propertyshort_description-string)| String| ||
|[sighting_refs](#propertysighting_refs-string)|#{ String}| ||
|[sightings](#propertysightings-sightingobject)|#{*Sighting* Object}|a list of `Sighting`||
|[source_uri](#propertysource_uri-string)| String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||
|[tool_refs](#propertytool_refs-string)|#{ String}| ||
|[tools](#propertytools-toolobject)|#{*Tool* Object}|a list of `Tool`||
|[verdict_refs](#propertyverdict_refs-string)|#{ String}| ||
|[verdicts](#propertyverdicts-verdictobject)|#{*Verdict* Object}|a list of `Verdict`||

* Reference: #

<a id="propertyactor_refs-string"></a>
## Property actor_refs ∷ #{ String}

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

<a id="propertyattack_pattern_refs-string"></a>
## Property attack_pattern_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyattack_patterns-attackpatternobject"></a>
## Property attack_patterns ∷ #{*AttackPattern* Object}

a list of `AttackPattern`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map7-ref"></a>
* *AttackPattern* Object Value
  * Details: [*AttackPattern* Object](#map7)

<a id="propertycampaign_refs-string"></a>
## Property campaign_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertycampaigns-campaignobject"></a>
## Property campaigns ∷ #{*Campaign* Object}

a list of `Campaign`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map8-ref"></a>
* *Campaign* Object Value
  * Details: [*Campaign* Object](#map8)

<a id="propertycoa_refs-string"></a>
## Property coa_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertycoas-coaobject"></a>
## Property coas ∷ #{*COA* Object}

a list of `COA`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map9-ref"></a>
* *COA* Object Value
  * Details: [*COA* Object](#map9)

<a id="propertydata_table_refs-string"></a>
## Property data_table_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertydata_tables-datatableobject"></a>
## Property data_tables ∷ #{*DataTable* Object}

a list of `DataTable`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map20-ref"></a>
* *DataTable* Object Value
  * Details: [*DataTable* Object](#map20)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexploit_target_refs-string"></a>
## Property exploit_target_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyexploit_targets-exploittargetobject"></a>
## Property exploit_targets ∷ #{*ExploitTarget* Object}

a list of `ExploitTarget`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map10-ref"></a>
* *ExploitTarget* Object Value
  * Details: [*ExploitTarget* Object](#map10)

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

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
## Property feedback_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyfeedbacks-feedbackobject"></a>
## Property feedbacks ∷ #{*Feedback* Object}

a list of `Feedback`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map11-ref"></a>
* *Feedback* Object Value
  * Details: [*Feedback* Object](#map11)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyincident_refs-string"></a>
## Property incident_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyincidents-incidentobject"></a>
## Property incidents ∷ #{*Incident* Object}

a list of `Incident`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map12-ref"></a>
* *Incident* Object Value
  * Details: [*Incident* Object](#map12)

<a id="propertyindicator_refs-string"></a>
## Property indicator_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyindicators-indicatorobject"></a>
## Property indicators ∷ #{*Indicator* Object}

a list of `Indicator`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map13-ref"></a>
* *Indicator* Object Value
  * Details: [*Indicator* Object](#map13)

<a id="propertyjudgement_refs-string"></a>
## Property judgement_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyjudgements-judgementobject"></a>
## Property judgements ∷ #{*Judgement* Object}

a list of `Judgement`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map14-ref"></a>
* *Judgement* Object Value
  * Details: [*Judgement* Object](#map14)

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertymalware_refs-string"></a>
## Property malware_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertymalwares-malwareobject"></a>
## Property malwares ∷ #{*Malware* Object}

a list of `Malware`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map15-ref"></a>
* *Malware* Object Value
  * Details: [*Malware* Object](#map15)

<a id="propertyrelationship_refs-string"></a>
## Property relationship_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyrelationships-relationshipobject"></a>
## Property relationships ∷ #{*Relationship* Object}

a list of `Relationship`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map16-ref"></a>
* *Relationship* Object Value
  * Details: [*Relationship* Object](#map16)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysighting_refs-string"></a>
## Property sighting_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertysightings-sightingobject"></a>
## Property sightings ∷ #{*Sighting* Object}

a list of `Sighting`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map17-ref"></a>
* *Sighting* Object Value
  * Details: [*Sighting* Object](#map17)

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is required


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytool_refs-string"></a>
## Property tool_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertytools-toolobject"></a>
## Property tools ∷ #{*Tool* Object}

a list of `Tool`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map18-ref"></a>
* *Tool* Object Value
  * Details: [*Tool* Object](#map18)

<a id="propertytype-bundletypeidentifierstring"></a>
## Property type ∷ BundleTypeIdentifier String

* This entry is required


  * Must equal: "bundle"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map21-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map21)

<a id="propertyverdict_refs-string"></a>
## Property verdict_refs ∷ #{ String}

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


  * A URI leading to an entity

<a id="propertyverdicts-verdictobject"></a>
## Property verdicts ∷ #{*Verdict* Object}

a list of `Verdict`

* This entry is optional
* This entry's type is a set (allows zero or more distinct values)


<a id="map19-ref"></a>
* *Verdict* Object Value
  * Details: [*Verdict* Object](#map19)

<a id="map21"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map20"></a>
# *DataTable* Object

A generic table of data, consisting of types and documented
  columns, and 1 or more rows of data.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[columns](#propertycolumns-columndefinitionobjectlist)|*ColumnDefinition* Object List|an ordered list of column definitions|&#10003;|
|[id](#propertyid-string)| String| |&#10003;|
|[rows](#propertyrows-anythinglistlist)|Anything List|an ordered list of rows|&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-datatabletypeidentifierstring)|DataTableTypeIdentifier String| |&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-string)| String| ||
|[revision](#propertyrevision-integer)|Integer| ||
|[row_count](#propertyrow_count-integer)|Integer|The number of rows in the data table.||
|[short_description](#propertyshort_description-string)| String| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| ||


<a id="propertycolumns-columndefinitionobjectlist"></a>
## Property columns ∷ *ColumnDefinition* Object List

an ordered list of column definitions

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map23-ref"></a>
* *ColumnDefinition* Object Value
  * Details: [*ColumnDefinition* Object](#map23)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map22-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map22)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

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
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-datatabletypeidentifierstring"></a>
## Property type ∷ DataTableTypeIdentifier String

* This entry is required


  * Must equal: "data-table"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is optional


<a id="map24-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map24)

<a id="map24"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map23"></a>
# *ColumnDefinition* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[name](#propertyname-string)| String| |&#10003;|
|[type](#propertytype-columntypestring)|ColumnType String| |&#10003;|
|[description](#propertydescription-string)| String| ||
|[required](#propertyrequired-boolean)|Boolean|If true, the row entries for this column cannot contain nulls. Defaults to true||
|[short_description](#propertyshort_description-string)| String| ||


<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyname-string"></a>
## Property name ∷  String

* This entry is required



<a id="propertyrequired-boolean"></a>
## Property required ∷ Boolean

If true, the row entries for this column cannot contain nulls. Defaults to true

* This entry is optional



<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional



<a id="propertytype-columntypestring"></a>
## Property type ∷ ColumnType String

* This entry is required


  * Allowed Values:
    * integer
    * markdown
    * number
    * observable
    * string
    * url

<a id="map22"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map19"></a>
# *Verdict* Object

A Verdict is chosen from all of the Judgements on that Observable which have not yet expired.  The highest priority Judgement becomes the active verdict.  If there is more than one Judgement with that priority, then Clean disposition has priority over all others, then Malicious disposition, and so on down to Unknown.

 The ID of a verdict is a a str of the form "observable.type:observable.value" for example, "ip:1.1.1.1"

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[disposition](#propertydisposition-dispositionnumberinteger)|DispositionNumberInteger| |&#10003;|
|[observable](#propertyobservable-observableobject)|*Observable* Object| |&#10003;|
|[type](#propertytype-verdicttypeidentifierstring)|VerdictTypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[disposition_name](#propertydisposition_name-dispositionnamestring)|DispositionName String|The disposition_name field is optional, but is intended to be shown to a user.  Applications must therefore remember the mapping of numbers to human words, as in: {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}||
|[judgement_id](#propertyjudgement_id-string)| String| ||


<a id="propertydisposition-dispositionnumberinteger"></a>
## Property disposition ∷ DispositionNumberInteger

* This entry is required


  * Numeric verdict identifiers
  * Allowed Values:
    * 1
    * 2
    * 3
    * 4
    * 5

<a id="propertydisposition_name-dispositionnamestring"></a>
## Property disposition_name ∷ DispositionName String

The disposition_name field is optional, but is intended to be shown to a user.  Applications must therefore remember the mapping of numbers to human words, as in: {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}

* This entry is optional


  * String verdict identifiers
  * Allowed Values:
    * Clean
    * Common
    * Malicious
    * Suspicious
    * Unknown

<a id="propertyjudgement_id-string"></a>
## Property judgement_id ∷  String

* This entry is optional


  * A URI leading to a judgement

<a id="propertyobservable-observableobject"></a>
## Property observable ∷ *Observable* Object

* This entry is required


<a id="map25-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map25)

<a id="propertytype-verdicttypeidentifierstring"></a>
## Property type ∷ VerdictTypeIdentifier String

* This entry is required


  * Must equal: "verdict"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map26-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map26)

<a id="map26"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map25"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



<a id="map18"></a>
# *Tool* Object

Tools are legitimate software that can be used by threat actors to perform attacks. Knowing how and when threat actors use such tools can be important for understanding how campaigns are executed. Unlike malware, these tools or software packages are often found on a system and have legitimate purposes for power users, system administrators, network administrators, or even normal users. Remote access tools (e.g., RDP) and network scanning tools (e.g., Nmap) are examples of Tools that may be used by a Threat Actor during an attack.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)| String| |&#10003;|
|[labels](#propertylabels-toollabelstringlist)|ToolLabel String List|The kind(s) of tool(s) being described.|&#10003;|
|[name](#propertyname-string)| String|The name used to identify the Tool.|&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-tooltypeidentifierstring)|ToolTypeIdentifier String| |&#10003;|
|[description](#propertydescription-string)| String|A description that provides more details and context about the Tool, potentially including its purpose and its key characteristics.||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[kill_chain_phases](#propertykill_chain_phases-killchainphaseobjectlist)|*KillChainPhase* Object List|The list of kill chain phases for which this Tool can be used.||
|[language](#propertylanguage-string)| String| ||
|[revision](#propertyrevision-integer)|Integer| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||
|[tool_version](#propertytool_version-string)| String|The version identifier associated with the Tool.||
|[x_mitre_aliases](#propertyx_mitre_aliases-stringlist)| String List|ATT&CK Software.aliases||

* Reference: [Tool](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/pub#h.z4voa9ndw8v)

<a id="propertydescription-string"></a>
## Property description ∷  String

A description that provides more details and context about the Tool, potentially including its purpose and its key characteristics.

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map27-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map27)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertykill_chain_phases-killchainphaseobjectlist"></a>
## Property kill_chain_phases ∷ *KillChainPhase* Object List

The list of kill chain phases for which this Tool can be used.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map28-ref"></a>
* *KillChainPhase* Object Value
  * Details: [*KillChainPhase* Object](#map28)

<a id="propertylabels-toollabelstringlist"></a>
## Property labels ∷ ToolLabel String List

The kind(s) of tool(s) being described.

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * Tool labels describe the categories of tools that can be used to perform attacks.
  * Allowed Values:
    * credential-exploitation
    * denial-of-service
    * exploitation
    * information-gathering
    * network-capture
    * remote-access
    * vulnerability-scanning
  * Reference: [Tool Label](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.cozm95emj8qk)

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyname-string"></a>
## Property name ∷  String

The name used to identify the Tool.

* This entry is required


  * String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytool_version-string"></a>
## Property tool_version ∷  String

The version identifier associated with the Tool.

* This entry is optional


  * String with at most 1024 characters

<a id="propertytype-tooltypeidentifierstring"></a>
## Property type ∷ ToolTypeIdentifier String

* This entry is required


  * Must equal: "tool"

<a id="propertyx_mitre_aliases-stringlist"></a>
## Property x_mitre_aliases ∷  String List

ATT&CK Software.aliases

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * String with at most 1024 characters

<a id="map28"></a>
# *KillChainPhase* Object

The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)| String|The name of the kill chain.|&#10003;|
|[phase_name](#propertyphase_name-string)| String|The name of the phase in the kill chain.|&#10003;|

* Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

<a id="propertykill_chain_name-string"></a>
## Property kill_chain_name ∷  String

The name of the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Must equal: "lockheed-martin-cyber-kill-chain"
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)

<a id="propertyphase_name-string"></a>
## Property phase_name ∷  String

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

<a id="map27"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map17"></a>
# *Sighting* Object

A single sighting of an [indicator](indicator.md)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| |&#10003;|
|[count](#propertycount-integer)|Integer|The number of times the sighting was seen|&#10003;|
|[id](#propertyid-string)| String| |&#10003;|
|[observed_time](#propertyobserved_time-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-sightingtypeidentifierstring)|SightingTypeIdentifier String| |&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-string)| String| ||
|[observables](#propertyobservables-observableobjectlist)|*Observable* Object List|The object(s) of interest||
|[relations](#propertyrelations-observedrelationobjectlist)|*ObservedRelation* Object List|Provide any context we can about where the observable came from||
|[revision](#propertyrevision-integer)|Integer| ||
|[sensor](#propertysensor-sensorstring)|Sensor String|The OpenC2 Actuator name that best fits the device that is creating this sighting (e.g. network.firewall)||
|[short_description](#propertyshort_description-string)| String| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[target](#propertytarget-sightingtargetobject)|*SightingTarget* Object|The target device. Where the sighting came from.||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||

* Reference: [SightingType](http://stixproject.github.io/data-model/1.2/indicator/SightingType/)

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

* This entry is required


  * Allowed Values:
    * High
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

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

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
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyobservables-observableobjectlist"></a>
## Property observables ∷ *Observable* Object List

The object(s) of interest

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map32-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map32)

<a id="propertyobserved_time-observedtimeobject"></a>
## Property observed_time ∷ *ObservedTime* Object

* This entry is required


<a id="map30-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map30)

<a id="propertyrelations-observedrelationobjectlist"></a>
## Property relations ∷ *ObservedRelation* Object List

Provide any context we can about where the observable came from

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map33-ref"></a>
* *ObservedRelation* Object Value
  * Details: [*ObservedRelation* Object](#map33)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysensor-sensorstring"></a>
## Property sensor ∷ Sensor String

The OpenC2 Actuator name that best fits the device that is creating this sighting (e.g. network.firewall)

* This entry is optional


  * The openC2 Actuator name that best fits a device
See also the Open C2 Language Description, Actuator Vocabulary, page 24.
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
  * Reference: [OpenC2 Language Description](HTTP://openc2.org/docs/OpenC2%20%20Language%20Descrip%20Doc%20Draft%20%28Rev%200%206f%29%2003012016.pdf)

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytarget-sightingtargetobject"></a>
## Property target ∷ *SightingTarget* Object

The target device. Where the sighting came from.

* This entry is optional


<a id="map31-ref"></a>
* *SightingTarget* Object Value
  * Details: [*SightingTarget* Object](#map31)

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-sightingtypeidentifierstring"></a>
## Property type ∷ SightingTypeIdentifier String

* This entry is required


  * Must equal: "sighting"

<a id="map33"></a>
# *ObservedRelation* Object

A relation inside a Sighting.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[origin](#propertyorigin-string)| String| |&#10003;|
|[related](#propertyrelated-observableobject)|*Observable* Object| |&#10003;|
|[relation](#propertyrelation-observablerelationtypestring)|ObservableRelationType String| |&#10003;|
|[source](#propertysource-observableobject)|*Observable* Object| |&#10003;|
|[origin_uri](#propertyorigin_uri-string)| String| ||
|[relation_info](#propertyrelation_info-object)|Object| ||


<a id="propertyorigin-string"></a>
## Property origin ∷  String

* This entry is required



<a id="propertyorigin_uri-string"></a>
## Property origin_uri ∷  String

* This entry is optional


  * A URI

<a id="propertyrelated-observableobject"></a>
## Property related ∷ *Observable* Object

* This entry is required


<a id="map36-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map36)

<a id="propertyrelation-observablerelationtypestring"></a>
## Property relation ∷ ObservableRelationType String

* This entry is required


  * Allowed Values:
    * Allocated
    * Allocated_By
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


<a id="map34-ref"></a>
* Object Value
  * Details: [Object](#map34)

<a id="propertysource-observableobject"></a>
## Property source ∷ *Observable* Object

* This entry is required


<a id="map35-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map35)

<a id="map36"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



<a id="map35"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



<a id="map34"></a>
# Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[Keyword](#propertykeyword-anything)|Anything| |&#10003;|


<a id="propertykeyword-anything"></a>
## Property Keyword ∷ Anything

* This entry is required



<a id="map32"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



<a id="map31"></a>
# *SightingTarget* Object

Describes a target device where a sighting came from.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#propertyobservables-observableobjectlist)|*Observable* Object List| |&#10003;|
|[type](#propertytype-sensorstring)|Sensor String| |&#10003;|
|[os](#propertyos-string)| String| ||
|[properties_data_tables](#propertyproperties_data_tables-string)| String| ||


<a id="propertyobservables-observableobjectlist"></a>
## Property observables ∷ *Observable* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map37-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map37)

<a id="propertyos-string"></a>
## Property os ∷  String

* This entry is optional



<a id="propertyproperties_data_tables-string"></a>
## Property properties_data_tables ∷  String

* This entry is optional


  * A URI leading to a data table

<a id="propertytype-sensorstring"></a>
## Property type ∷ Sensor String

* This entry is required


  * The openC2 Actuator name that best fits a device
See also the Open C2 Language Description, Actuator Vocabulary, page 24.
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
  * Reference: [OpenC2 Language Description](HTTP://openc2.org/docs/OpenC2%20%20Language%20Descrip%20Doc%20Draft%20%28Rev%200%206f%29%2003012016.pdf)

<a id="map37"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



<a id="map30"></a>
# *ObservedTime* Object

Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map29"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map16"></a>
# *Relationship* Object

Represents a relationship between two entities

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)| String| |&#10003;|
|[relationship_type](#propertyrelationship_type-relationshiptypestring)|RelationshipType String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[source_ref](#propertysource_ref-string)| String| |&#10003;|
|[target_ref](#propertytarget_ref-string)| String| |&#10003;|
|[type](#propertytype-relationshiptypeidentifierstring)|RelationshipTypeIdentifier String| |&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-string)| String| ||
|[revision](#propertyrevision-integer)|Integer| ||
|[short_description](#propertyshort_description-string)| String| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||


<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map38-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map38)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyrelationship_type-relationshiptypestring"></a>
## Property relationship_type ∷ RelationshipType String

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

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_ref-string"></a>
## Property source_ref ∷  String

* This entry is required


  * A URI leading to an entity

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytarget_ref-string"></a>
## Property target_ref ∷  String

* This entry is required


  * A URI leading to an entity

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-relationshiptypeidentifierstring"></a>
## Property type ∷ RelationshipTypeIdentifier String

* This entry is required


  * Must equal: "relationship"

<a id="map38"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map15"></a>
# *Malware* Object

Malware is a type of TTP that is also known as malicious code and malicious software, and refers to a program that is inserted into a system, usually covertly, with the intent of compromising the confidentiality, integrity, or availability of the victim's data, applications, or operating system (OS) or of otherwise annoying or disrupting the victim. Malware such as viruses and worms are usually designed to perform these nefarious functions in such a way that users are unaware of them, at least initially.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)| String| |&#10003;|
|[labels](#propertylabels-malwarelabelstringlist)|MalwareLabel String List|The type of malware being described.|&#10003;|
|[name](#propertyname-string)| String|A name used to identify the Malware sample.|&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-malwaretypeidentifierstring)|MalwareTypeIdentifier String| |&#10003;|
|[description](#propertydescription-string)| String|A description that provides more details and context about the Malware, potentially including its purpose and its key characteristics.||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[kill_chain_phases](#propertykill_chain_phases-killchainphaseobjectlist)|*KillChainPhase* Object List|The list of Kill Chain Phases for which this Malware can be used.||
|[language](#propertylanguage-string)| String| ||
|[revision](#propertyrevision-integer)|Integer| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||
|[x_mitre_aliases](#propertyx_mitre_aliases-stringlist)| String List|ATT&CK Software.aliases||

* Reference: [Malware](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/pub#h.s5l7katgbp09)

<a id="propertydescription-string"></a>
## Property description ∷  String

A description that provides more details and context about the Malware, potentially including its purpose and its key characteristics.

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map39-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map39)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertykill_chain_phases-killchainphaseobjectlist"></a>
## Property kill_chain_phases ∷ *KillChainPhase* Object List

The list of Kill Chain Phases for which this Malware can be used.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map40-ref"></a>
* *KillChainPhase* Object Value
  * Details: [*KillChainPhase* Object](#map40)

<a id="propertylabels-malwarelabelstringlist"></a>
## Property labels ∷ MalwareLabel String List

The type of malware being described.

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * Malware label is an open vocabulary that represents different types and functions of malware. Malware labels are not mutually exclusive; a malware instance can be both spyware and a screen capture tool.
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

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyname-string"></a>
## Property name ∷  String

A name used to identify the Malware sample.

* This entry is required


  * String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-malwaretypeidentifierstring"></a>
## Property type ∷ MalwareTypeIdentifier String

* This entry is required


  * Must equal: "malware"

<a id="propertyx_mitre_aliases-stringlist"></a>
## Property x_mitre_aliases ∷  String List

ATT&CK Software.aliases

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * String with at most 1024 characters

<a id="map40"></a>
# *KillChainPhase* Object

The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)| String|The name of the kill chain.|&#10003;|
|[phase_name](#propertyphase_name-string)| String|The name of the phase in the kill chain.|&#10003;|

* Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

<a id="propertykill_chain_name-string"></a>
## Property kill_chain_name ∷  String

The name of the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Must equal: "lockheed-martin-cyber-kill-chain"
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)

<a id="propertyphase_name-string"></a>
## Property phase_name ∷  String

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

<a id="map39"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map14"></a>
# *Judgement* Object

A judgement about the intent or nature of an observable.  For
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
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| |&#10003;|
|[disposition](#propertydisposition-dispositionnumberinteger)|DispositionNumberInteger|Matches :disposition_name as in {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}|&#10003;|
|[disposition_name](#propertydisposition_name-dispositionnamestring)|DispositionName String| |&#10003;|
|[id](#propertyid-string)| String| |&#10003;|
|[observable](#propertyobservable-observableobject)|*Observable* Object| |&#10003;|
|[priority](#propertypriority-integer)|Integer| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[severity](#propertyseverity-highmedlowstring)|HighMedLow String| |&#10003;|
|[source](#propertysource-string)| String| |&#10003;|
|[type](#propertytype-judgementtypeidentifierstring)|JudgementTypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-string)| String| ||
|[reason](#propertyreason-string)| String| ||
|[reason_uri](#propertyreason_uri-string)| String| ||
|[revision](#propertyrevision-integer)|Integer| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||


<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

* This entry is required


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertydisposition-dispositionnumberinteger"></a>
## Property disposition ∷ DispositionNumberInteger

Matches :disposition_name as in {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}

* This entry is required


  * Numeric verdict identifiers
  * Allowed Values:
    * 1
    * 2
    * 3
    * 4
    * 5

<a id="propertydisposition_name-dispositionnamestring"></a>
## Property disposition_name ∷ DispositionName String

* This entry is required


  * String verdict identifiers
  * Allowed Values:
    * Clean
    * Common
    * Malicious
    * Suspicious
    * Unknown

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map41-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map41)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyobservable-observableobject"></a>
## Property observable ∷ *Observable* Object

* This entry is required


<a id="map42-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map42)

<a id="propertypriority-integer"></a>
## Property priority ∷ Integer

* This entry is required


  * A value 0-100 that determine the priority of a judgement. Curated feeds of black/white lists, for example known good products within your organizations, should use a 95. All automated systems should use a priority of 90, or less.  Human judgements should have a priority of 100, so that humans can always override machines.

<a id="propertyreason-string"></a>
## Property reason ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyreason_uri-string"></a>
## Property reason_uri ∷  String

* This entry is optional


  * A URI

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyseverity-highmedlowstring"></a>
## Property severity ∷ HighMedLow String

* This entry is required


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is required


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-judgementtypeidentifierstring"></a>
## Property type ∷ JudgementTypeIdentifier String

* This entry is required


  * Must equal: "judgement"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map43-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map43)

<a id="map43"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map42"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



<a id="map41"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map13"></a>
# *Indicator* Object

An indicator is a test, or a collection of judgements that define
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
|[id](#propertyid-string)| String| |&#10003;|
|[producer](#propertyproducer-string)| String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-indicatortypeidentifierstring)|IndicatorTypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[composite_indicator_expression](#propertycomposite_indicator_expression-compositeindicatorexpressionobject)|*CompositeIndicatorExpression* Object| ||
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String|level of confidence held in the accuracy of this Indicator||
|[description](#propertydescription-string)| String| ||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[indicator_type](#propertyindicator_type-indicatortypestringlist)|IndicatorType String List|Specifies the type or types for this Indicator||
|[kill_chain_phases](#propertykill_chain_phases-killchainphaseobjectlist)|*KillChainPhase* Object List|relevant kill chain phases indicated by this Indicator||
|[language](#propertylanguage-string)| String| ||
|[likely_impact](#propertylikely_impact-string)| String|likely potential impact within the relevant context if this Indicator were to occur||
|[negate](#propertynegate-boolean)|Boolean|specifies the absence of the pattern||
|[revision](#propertyrevision-integer)|Integer| ||
|[short_description](#propertyshort_description-string)| String| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[specification](#propertyspecification-either)|*JudgementSpecification* Object| ||
|[tags](#propertytags-stringlist)| String List|Descriptors for this indicator||
|[test_mechanisms](#propertytest_mechanisms-stringlist)| String List|Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||

* Reference: [IndicatorType](http://stixproject.github.io/data-model/1.2/indicator/IndicatorType/)

<a id="propertycomposite_indicator_expression-compositeindicatorexpressionobject"></a>
## Property composite_indicator_expression ∷ *CompositeIndicatorExpression* Object

* This entry is optional


<a id="map46-ref"></a>
* *CompositeIndicatorExpression* Object Value
  * Details: [*CompositeIndicatorExpression* Object](#map46)

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

level of confidence held in the accuracy of this Indicator

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map44-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map44)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyindicator_type-indicatortypestringlist"></a>
## Property indicator_type ∷ IndicatorType String List

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
    * URL Watchlist
  * Reference: [IndicatorTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/IndicatorTypeVocab-1.1/)

<a id="propertykill_chain_phases-killchainphaseobjectlist"></a>
## Property kill_chain_phases ∷ *KillChainPhase* Object List

relevant kill chain phases indicated by this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


<a id="map47-ref"></a>
* *KillChainPhase* Object Value
  * Details: [*KillChainPhase* Object](#map47)

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertylikely_impact-string"></a>
## Property likely_impact ∷  String

likely potential impact within the relevant context if this Indicator were to occur

* This entry is optional


  * String with at most 5000 characters

<a id="propertynegate-boolean"></a>
## Property negate ∷ Boolean

specifies the absence of the pattern

* This entry is optional



<a id="propertyproducer-string"></a>
## Property producer ∷  String

* This entry is required
* Dev Notes: TODO - Document what is supposed to be in this field!


  * String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertyspecification-either"></a>
## Property specification ∷ Either

* This entry is optional


  * Only one of the following schemas will match

<a id="map48-ref"></a>
* *JudgementSpecification* Object Value
  * Details: [*JudgementSpecification* Object](#map48)

<a id="map49-ref"></a>
* *ThreatBrainSpecification* Object Value
  * Details: [*ThreatBrainSpecification* Object](#map49)

<a id="map50-ref"></a>
* *SnortSpecification* Object Value
  * Details: [*SnortSpecification* Object](#map50)

<a id="map51-ref"></a>
* *SIOCSpecification* Object Value
  * Details: [*SIOCSpecification* Object](#map51)

<a id="map52-ref"></a>
* *OpenIOCSpecification* Object Value
  * Details: [*OpenIOCSpecification* Object](#map52)

<a id="propertytags-stringlist"></a>
## Property tags ∷  String List

Descriptors for this indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * String with at most 1024 characters

<a id="propertytest_mechanisms-stringlist"></a>
## Property test_mechanisms ∷  String List

Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


  * String with at most 2048 characters

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-indicatortypeidentifierstring"></a>
## Property type ∷ IndicatorTypeIdentifier String

* This entry is required


  * Must equal: "indicator"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map45-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map45)

<a id="map52"></a>
# *OpenIOCSpecification* Object

An indicator which contains an XML blob of an openIOC indicator..

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[open_IOC](#propertyopen_ioc-string)| String| |&#10003;|
|[type](#propertytype-openiocspecificationtypestring)|OpenIOCSpecificationType String| |&#10003;|


<a id="propertyopen_ioc-string"></a>
## Property open_IOC ∷  String

* This entry is required



<a id="propertytype-openiocspecificationtypestring"></a>
## Property type ∷ OpenIOCSpecificationType String

* This entry is required


  * Must equal: "OpenIOC"

<a id="map51"></a>
# *SIOCSpecification* Object

An indicator which runs in snort...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[SIOC](#propertysioc-string)| String| |&#10003;|
|[type](#propertytype-siocspecificationtypestring)|SIOCSpecificationType String| |&#10003;|


<a id="propertysioc-string"></a>
## Property SIOC ∷  String

* This entry is required



<a id="propertytype-siocspecificationtypestring"></a>
## Property type ∷ SIOCSpecificationType String

* This entry is required


  * Must equal: "SIOC"

<a id="map50"></a>
# *SnortSpecification* Object

An indicator which runs in snort...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[snort_sig](#propertysnort_sig-string)| String| |&#10003;|
|[type](#propertytype-snortspecificationtypestring)|SnortSpecificationType String| |&#10003;|


<a id="propertysnort_sig-string"></a>
## Property snort_sig ∷  String

* This entry is required



<a id="propertytype-snortspecificationtypestring"></a>
## Property type ∷ SnortSpecificationType String

* This entry is required


  * Must equal: "Snort"

<a id="map49"></a>
# *ThreatBrainSpecification* Object

An indicator which runs in threatbrain...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-threatbrainspecificationtypestring)|ThreatBrainSpecificationType String| |&#10003;|
|[variables](#propertyvariables-stringlist)| String List| |&#10003;|
|[query](#propertyquery-string)| String| ||


<a id="propertyquery-string"></a>
## Property query ∷  String

* This entry is optional



<a id="propertytype-threatbrainspecificationtypestring"></a>
## Property type ∷ ThreatBrainSpecificationType String

* This entry is required


  * Must equal: "ThreatBrain"

<a id="propertyvariables-stringlist"></a>
## Property variables ∷  String List

* This entry is required
* This entry's type is sequential (allows zero or more values)



<a id="map48"></a>
# *JudgementSpecification* Object

An indicator based on a list of judgements.  If any of the Observables in it's judgements are encountered, than it may be matches against.  If there are any required judgements, they all must be matched in order for the indicator to be considered a match.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[judgements](#propertyjudgements-stringlist)| String List| |&#10003;|
|[required_judgements](#propertyrequired_judgements-relatedjudgementobjectlist)|*RelatedJudgement* Object List| |&#10003;|
|[type](#propertytype-judgementspecificationtypestring)|JudgementSpecificationType String| |&#10003;|


<a id="propertyjudgements-stringlist"></a>
## Property judgements ∷  String List

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * A URI leading to a judgement

<a id="propertyrequired_judgements-relatedjudgementobjectlist"></a>
## Property required_judgements ∷ *RelatedJudgement* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map53-ref"></a>
* *RelatedJudgement* Object Value
  * Details: [*RelatedJudgement* Object](#map53)

<a id="propertytype-judgementspecificationtypestring"></a>
## Property type ∷ JudgementSpecificationType String

* This entry is required


  * Must equal: "Judgement"

<a id="map53"></a>
# *RelatedJudgement* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[judgement_id](#propertyjudgement_id-string)| String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| ||
|[relationship](#propertyrelationship-string)| String| ||
|[source](#propertysource-string)| String| ||


<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyjudgement_id-string"></a>
## Property judgement_id ∷  String

* This entry is required


  * A URI leading to a judgement

<a id="propertyrelationship-string"></a>
## Property relationship ∷  String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional



<a id="map47"></a>
# *KillChainPhase* Object

The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)| String|The name of the kill chain.|&#10003;|
|[phase_name](#propertyphase_name-string)| String|The name of the phase in the kill chain.|&#10003;|

* Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

<a id="propertykill_chain_name-string"></a>
## Property kill_chain_name ∷  String

The name of the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Must equal: "lockheed-martin-cyber-kill-chain"
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)

<a id="propertyphase_name-string"></a>
## Property phase_name ∷  String

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

<a id="map46"></a>
# *CompositeIndicatorExpression* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[indicator_ids](#propertyindicator_ids-stringlist)| String List| |&#10003;|
|[operator](#propertyoperator-booleanoperatorstring)|BooleanOperator String| |&#10003;|

* Reference: [CompositeIndicatorExpressionType](http://stixproject.github.io/data-model/1.2/indicator/CompositeIndicatorExpressionType/)

<a id="propertyindicator_ids-stringlist"></a>
## Property indicator_ids ∷  String List

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * A URI leading to an indicator

<a id="propertyoperator-booleanoperatorstring"></a>
## Property operator ∷ BooleanOperator String

* This entry is required


  * Allowed Values:
    * and
    * not
    * or

<a id="map45"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map44"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map12"></a>
# *Incident* Object

Discrete instance of indicators affecting an organization as well
  as information associated with incident response

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String|level of confidence held in the characterization of this Incident|&#10003;|
|[id](#propertyid-string)| String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-incidenttypeidentifierstring)|IncidentTypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object|time stamp for the definition of a specific version of an Incident|&#10003;|
|[COA_requested](#propertycoa_requested-coarequestedobjectlist)|*COARequested* Object List|specifies and characterizes requested Course Of Action for this Incident as specified by the Producer for the Consumer of the Incident Report||
|[COA_taken](#propertycoa_taken-coarequestedobjectlist)|*COARequested* Object List|specifies and characterizes a Course Of Action taken for this Incident||
|[affected_assets](#propertyaffected_assets-affectedassetobjectlist)|*AffectedAsset* Object List|particular assets affected during the Incident||
|[attributed_actors](#propertyattributed_actors-relatedactorobjectlist)|*RelatedActor* Object List|identifies ThreatActors asserted to be attributed for this Incident||
|[categories](#propertycategories-incidentcategorystringlist)|IncidentCategory String List|a set of categories for this incident||
|[contact](#propertycontact-string)| String|identifies and characterizes organizations or personnel involved in this Incident||
|[coordinator](#propertycoordinator-string)| String|information about the assigned coordinator for this Incident||
|[description](#propertydescription-string)| String| ||
|[discovery_method](#propertydiscovery_method-discoverymethodstring)|DiscoveryMethod String|identifies how the incident was discovered||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[history](#propertyhistory-historyobjectlist)|*History* Object List|a log of events or actions taken during the handling of the Incident||
|[impact_assessment](#propertyimpact_assessment-impactassessmentobject)|*ImpactAssessment* Object|a summary assessment of impact for this cyber threat Incident||
|[incident_time](#propertyincident_time-incidenttimeobject)|*IncidentTime* Object|relevant time values associated with this Incident||
|[intended_effect](#propertyintended_effect-intendedeffectstring)|IntendedEffect String|specifies the suspected intended effect of this incident||
|[language](#propertylanguage-string)| String| ||
|[related_incidents](#propertyrelated_incidents-relatedincidentobjectlist)|*RelatedIncident* Object List|identifies or characterizes one or more other Incidents related to this cyber threat Incident||
|[related_indicators](#propertyrelated_indicators-relatedindicatorobjectlist)|*RelatedIndicator* Object List|identifies or characterizes one or more cyber threat Indicators related to this cyber threat Incident||
|[related_observables](#propertyrelated_observables-observableobjectlist)|*Observable* Object List|identifies or characterizes one or more cyber observables related to this cyber threat incident||
|[reporter](#propertyreporter-string)| String|information about the reporting source of this Incident||
|[responder](#propertyresponder-string)| String|information about the assigned responder for this Incident||
|[revision](#propertyrevision-integer)|Integer| ||
|[security_compromise](#propertysecurity_compromise-securitycompromisestring)|SecurityCompromise String|knowledge of whether the Incident involved a compromise of security properties||
|[short_description](#propertyshort_description-string)| String| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[status](#propertystatus-statusstring)|Status String|current status of the incident||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||
|[victim](#propertyvictim-string)| String|information about a victim of this Incident||

* Reference: [IncidentType](http://stixproject.github.io/data-model/1.2/incident/IncidentType/)

<a id="propertycoa_requested-coarequestedobjectlist"></a>
## Property COA_requested ∷ *COARequested* Object List

specifies and characterizes requested Course Of Action for this Incident as specified by the Producer for the Consumer of the Incident Report

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map59-ref"></a>
* *COARequested* Object Value
  * Details: [*COARequested* Object](#map59)

<a id="propertycoa_taken-coarequestedobjectlist"></a>
## Property COA_taken ∷ *COARequested* Object List

specifies and characterizes a Course Of Action taken for this Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map60-ref"></a>
* *COARequested* Object Value
  * Details: [*COARequested* Object](#map60)

<a id="propertyaffected_assets-affectedassetobjectlist"></a>
## Property affected_assets ∷ *AffectedAsset* Object List

particular assets affected during the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map57-ref"></a>
* *AffectedAsset* Object Value
  * Details: [*AffectedAsset* Object](#map57)

<a id="propertyattributed_actors-relatedactorobjectlist"></a>
## Property attributed_actors ∷ *RelatedActor* Object List

identifies ThreatActors asserted to be attributed for this Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: was attributed_threat_actors


<a id="map64-ref"></a>
* *RelatedActor* Object Value
  * Details: [*RelatedActor* Object](#map64)

<a id="propertycategories-incidentcategorystringlist"></a>
## Property categories ∷ IncidentCategory String List

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
## Property confidence ∷ HighMedLow String

level of confidence held in the characterization of this Incident

* This entry is required


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertycontact-string"></a>
## Property contact ∷  String

identifies and characterizes organizations or personnel involved in this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="propertycoordinator-string"></a>
## Property coordinator ∷  String

information about the assigned coordinator for this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertydiscovery_method-discoverymethodstring"></a>
## Property discovery_method ∷ DiscoveryMethod String

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
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map54-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map54)

<a id="propertyhistory-historyobjectlist"></a>
## Property history ∷ *History* Object List

a log of events or actions taken during the handling of the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map61-ref"></a>
* *History* Object Value
  * Details: [*History* Object](#map61)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyimpact_assessment-impactassessmentobject"></a>
## Property impact_assessment ∷ *ImpactAssessment* Object

a summary assessment of impact for this cyber threat Incident

* This entry is optional


<a id="map58-ref"></a>
* *ImpactAssessment* Object Value
  * Details: [*ImpactAssessment* Object](#map58)

<a id="propertyincident_time-incidenttimeobject"></a>
## Property incident_time ∷ *IncidentTime* Object

relevant time values associated with this Incident

* This entry is optional
* Dev Notes: Was 'time'; renamed for clarity


<a id="map56-ref"></a>
* *IncidentTime* Object Value
  * Details: [*IncidentTime* Object](#map56)

<a id="propertyintended_effect-intendedeffectstring"></a>
## Property intended_effect ∷ IntendedEffect String

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

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyrelated_incidents-relatedincidentobjectlist"></a>
## Property related_incidents ∷ *RelatedIncident* Object List

identifies or characterizes one or more other Incidents related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map65-ref"></a>
* *RelatedIncident* Object Value
  * Details: [*RelatedIncident* Object](#map65)

<a id="propertyrelated_indicators-relatedindicatorobjectlist"></a>
## Property related_indicators ∷ *RelatedIndicator* Object List

identifies or characterizes one or more cyber threat Indicators related to this cyber threat Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map62-ref"></a>
* *RelatedIndicator* Object Value
  * Details: [*RelatedIndicator* Object](#map62)

<a id="propertyrelated_observables-observableobjectlist"></a>
## Property related_observables ∷ *Observable* Object List

identifies or characterizes one or more cyber observables related to this cyber threat incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Was related_observables


<a id="map63-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map63)

<a id="propertyreporter-string"></a>
## Property reporter ∷  String

information about the reporting source of this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="propertyresponder-string"></a>
## Property responder ∷  String

information about the assigned responder for this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysecurity_compromise-securitycompromisestring"></a>
## Property security_compromise ∷ SecurityCompromise String

knowledge of whether the Incident involved a compromise of security properties

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertystatus-statusstring"></a>
## Property status ∷ Status String

current status of the incident

* This entry is optional


  * Allowed Values:
    * Closed
    * Containment Achieved
    * Deleted
    * Incident Reported
    * New
    * Open
    * Rejected
    * Restoration Achieved
    * Stalled

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-incidenttypeidentifierstring"></a>
## Property type ∷ IncidentTypeIdentifier String

* This entry is required


  * Must equal: "incident"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

time stamp for the definition of a specific version of an Incident

* This entry is required


<a id="map55-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map55)

<a id="propertyvictim-string"></a>
## Property victim ∷  String

information about a victim of this Incident

* This entry is optional


  * String with at most 1024 characters

<a id="map65"></a>
# *RelatedIncident* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[incident_id](#propertyincident_id-string)| String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| ||
|[relationship](#propertyrelationship-string)| String| ||
|[source](#propertysource-string)| String| ||


<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyincident_id-string"></a>
## Property incident_id ∷  String

* This entry is required


  * A URI leading to an incident

<a id="propertyrelationship-string"></a>
## Property relationship ∷  String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional



<a id="map64"></a>
# *RelatedActor* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[actor_id](#propertyactor_id-string)| String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| ||
|[relationship](#propertyrelationship-string)| String| ||
|[source](#propertysource-string)| String| ||


<a id="propertyactor_id-string"></a>
## Property actor_id ∷  String

* This entry is required


  * A URI leading to an actor

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyrelationship-string"></a>
## Property relationship ∷  String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional



<a id="map63"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



<a id="map62"></a>
# *RelatedIndicator* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[indicator_id](#propertyindicator_id-string)| String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| ||
|[relationship](#propertyrelationship-string)| String| ||
|[source](#propertysource-string)| String| ||


<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyindicator_id-string"></a>
## Property indicator_id ∷  String

* This entry is required


  * A URI leading to an indicator

<a id="propertyrelationship-string"></a>
## Property relationship ∷  String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional



<a id="map61"></a>
# *History* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[action_entry](#propertyaction_entry-coarequestedobjectlist)|*COARequested* Object List|a record of actions taken during the handling of the Incident||
|[journal_entry](#propertyjournal_entry-string)| String|journal notes for information discovered during the handling of the Incident||

* Reference: [HistoryItemType](http://stixproject.github.io/data-model/1.2/incident/HistoryItemType/)

<a id="propertyaction_entry-coarequestedobjectlist"></a>
## Property action_entry ∷ *COARequested* Object List

a record of actions taken during the handling of the Incident

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map66-ref"></a>
* *COARequested* Object Value
  * Details: [*COARequested* Object](#map66)

<a id="propertyjournal_entry-string"></a>
## Property journal_entry ∷  String

journal notes for information discovered during the handling of the Incident

* This entry is optional
* Dev Notes: simplified


  * String with at most 5000 characters

<a id="map66"></a>
# *COARequested* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[COA](#propertycoa-string)| String|COA reference|&#10003;|
|[contributors](#propertycontributors-contributorobjectlist)|*Contributor* Object List|contributing actors for the CourseOfAction taken||
|[time](#propertytime-instdate)|Inst (Date)|relative time criteria for this taken CourseOfAction||

* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

<a id="propertycoa-string"></a>
## Property COA ∷  String

COA reference

* This entry is required


  * A URI leading to a COA

<a id="propertycontributors-contributorobjectlist"></a>
## Property contributors ∷ *Contributor* Object List

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map67-ref"></a>
* *Contributor* Object Value
  * Details: [*Contributor* Object](#map67)

<a id="propertytime-instdate"></a>
## Property time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map67"></a>
# *Contributor* Object

Person who contributed cyber observation data

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[contribution_location](#propertycontribution_location-string)| String|information describing the location at which the contributory activity occured||
|[date](#propertydate-instdate)|Inst (Date)|description (bounding) of the timing of this contributor's involvement||
|[email](#propertyemail-string)| String|email of this contributor||
|[name](#propertyname-string)| String|name of this contributor||
|[organization](#propertyorganization-string)| String|organization name of this contributor||
|[phone](#propertyphone-string)| String|telephone number of this contributor||
|[role](#propertyrole-string)| String|role played by this contributor||

* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

<a id="propertycontribution_location-string"></a>
## Property contribution_location ∷  String

information describing the location at which the contributory activity occured

* This entry is optional



<a id="propertydate-instdate"></a>
## Property date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyemail-string"></a>
## Property email ∷  String

email of this contributor

* This entry is optional



<a id="propertyname-string"></a>
## Property name ∷  String

name of this contributor

* This entry is optional



<a id="propertyorganization-string"></a>
## Property organization ∷  String

organization name of this contributor

* This entry is optional



<a id="propertyphone-string"></a>
## Property phone ∷  String

telephone number of this contributor

* This entry is optional



<a id="propertyrole-string"></a>
## Property role ∷  String

role played by this contributor

* This entry is optional



<a id="map60"></a>
# *COARequested* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[COA](#propertycoa-string)| String|COA reference|&#10003;|
|[contributors](#propertycontributors-contributorobjectlist)|*Contributor* Object List|contributing actors for the CourseOfAction taken||
|[time](#propertytime-instdate)|Inst (Date)|relative time criteria for this taken CourseOfAction||

* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

<a id="propertycoa-string"></a>
## Property COA ∷  String

COA reference

* This entry is required


  * A URI leading to a COA

<a id="propertycontributors-contributorobjectlist"></a>
## Property contributors ∷ *Contributor* Object List

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map68-ref"></a>
* *Contributor* Object Value
  * Details: [*Contributor* Object](#map68)

<a id="propertytime-instdate"></a>
## Property time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map68"></a>
# *Contributor* Object

Person who contributed cyber observation data

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[contribution_location](#propertycontribution_location-string)| String|information describing the location at which the contributory activity occured||
|[date](#propertydate-instdate)|Inst (Date)|description (bounding) of the timing of this contributor's involvement||
|[email](#propertyemail-string)| String|email of this contributor||
|[name](#propertyname-string)| String|name of this contributor||
|[organization](#propertyorganization-string)| String|organization name of this contributor||
|[phone](#propertyphone-string)| String|telephone number of this contributor||
|[role](#propertyrole-string)| String|role played by this contributor||

* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

<a id="propertycontribution_location-string"></a>
## Property contribution_location ∷  String

information describing the location at which the contributory activity occured

* This entry is optional



<a id="propertydate-instdate"></a>
## Property date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyemail-string"></a>
## Property email ∷  String

email of this contributor

* This entry is optional



<a id="propertyname-string"></a>
## Property name ∷  String

name of this contributor

* This entry is optional



<a id="propertyorganization-string"></a>
## Property organization ∷  String

organization name of this contributor

* This entry is optional



<a id="propertyphone-string"></a>
## Property phone ∷  String

telephone number of this contributor

* This entry is optional



<a id="propertyrole-string"></a>
## Property role ∷  String

role played by this contributor

* This entry is optional



<a id="map59"></a>
# *COARequested* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[COA](#propertycoa-string)| String|COA reference|&#10003;|
|[contributors](#propertycontributors-contributorobjectlist)|*Contributor* Object List|contributing actors for the CourseOfAction taken||
|[time](#propertytime-instdate)|Inst (Date)|relative time criteria for this taken CourseOfAction||

* Reference: [COARequestedType](http://stixproject.github.io/data-model/1.2/incident/COARequestedType/), [COATakenType](http://stixproject.github.io/data-model/1.2/incident/COATakenType/)

<a id="propertycoa-string"></a>
## Property COA ∷  String

COA reference

* This entry is required


  * A URI leading to a COA

<a id="propertycontributors-contributorobjectlist"></a>
## Property contributors ∷ *Contributor* Object List

contributing actors for the CourseOfAction taken

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map69-ref"></a>
* *Contributor* Object Value
  * Details: [*Contributor* Object](#map69)

<a id="propertytime-instdate"></a>
## Property time ∷ Inst (Date)

relative time criteria for this taken CourseOfAction

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map69"></a>
# *Contributor* Object

Person who contributed cyber observation data

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[contribution_location](#propertycontribution_location-string)| String|information describing the location at which the contributory activity occured||
|[date](#propertydate-instdate)|Inst (Date)|description (bounding) of the timing of this contributor's involvement||
|[email](#propertyemail-string)| String|email of this contributor||
|[name](#propertyname-string)| String|name of this contributor||
|[organization](#propertyorganization-string)| String|organization name of this contributor||
|[phone](#propertyphone-string)| String|telephone number of this contributor||
|[role](#propertyrole-string)| String|role played by this contributor||

* Reference: [ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)

<a id="propertycontribution_location-string"></a>
## Property contribution_location ∷  String

information describing the location at which the contributory activity occured

* This entry is optional



<a id="propertydate-instdate"></a>
## Property date ∷ Inst (Date)

description (bounding) of the timing of this contributor's involvement

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyemail-string"></a>
## Property email ∷  String

email of this contributor

* This entry is optional



<a id="propertyname-string"></a>
## Property name ∷  String

name of this contributor

* This entry is optional



<a id="propertyorganization-string"></a>
## Property organization ∷  String

organization name of this contributor

* This entry is optional



<a id="propertyphone-string"></a>
## Property phone ∷  String

telephone number of this contributor

* This entry is optional



<a id="propertyrole-string"></a>
## Property role ∷  String

role played by this contributor

* This entry is optional



<a id="map58"></a>
# *ImpactAssessment* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[direct_impact_summary](#propertydirect_impact_summary-directimpactsummaryobject)|*DirectImpactSummary* Object|characterizes (at a high level) losses directly resulting from the ThreatActor's actions against organizational assets within the Incident||
|[effects](#propertyeffects-effectstringlist)|Effect String List|list of effects of this incident from a controlled vocabulary||
|[impact_qualification](#propertyimpact_qualification-impactqualificationstring)|ImpactQualification String|summarizes the subjective level of impact of the Incident||
|[indirect_impact_summary](#propertyindirect_impact_summary-indirectimpactsummaryobject)|*IndirectImpactSummary* Object|characterizes (at a high level) losses from other stakeholder reactions to the Incident||
|[total_loss_estimation](#propertytotal_loss_estimation-totallossestimationobject)|*TotalLossEstimation* Object|specifies the total estimated financial loss for the Incident||

* Reference:  [ImpactAssessmentType](http://stixproject.github.io/data-model/1.2/incident/ImpactAssessmentType/)

<a id="propertydirect_impact_summary-directimpactsummaryobject"></a>
## Property direct_impact_summary ∷ *DirectImpactSummary* Object

characterizes (at a high level) losses directly resulting from the ThreatActor's actions against organizational assets within the Incident

* This entry is optional


<a id="map70-ref"></a>
* *DirectImpactSummary* Object Value
  * Details: [*DirectImpactSummary* Object](#map70)

<a id="propertyeffects-effectstringlist"></a>
## Property effects ∷ Effect String List

list of effects of this incident from a controlled vocabulary

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * Allowed Values:
    * Brand or Image Degradation
    * Data Breach or Compromise
    * Degradation of Service
    * Destruction
    * Disruption of Service / Operations
    * Financial Loss
    * Loss of Competitive Advantage
    * Loss of Competitive Advantage - Economic
    * Loss of Competitive Advantage - Military
    * Loss of Competitive Advantage - Political
    * Loss of Confidential / Proprietary Information or Intellectual Property
    * Regulatory, Compliance or Legal Impact
    * Unintended Access
    * User Data Loss

<a id="propertyimpact_qualification-impactqualificationstring"></a>
## Property impact_qualification ∷ ImpactQualification String

summarizes the subjective level of impact of the Incident

* This entry is optional


  * Allowed Values:
    * Catastrophic
    * Damaging
    * Distracting
    * Insignificant
    * Painful
    * Unknown

<a id="propertyindirect_impact_summary-indirectimpactsummaryobject"></a>
## Property indirect_impact_summary ∷ *IndirectImpactSummary* Object

characterizes (at a high level) losses from other stakeholder reactions to the Incident

* This entry is optional


<a id="map71-ref"></a>
* *IndirectImpactSummary* Object Value
  * Details: [*IndirectImpactSummary* Object](#map71)

<a id="propertytotal_loss_estimation-totallossestimationobject"></a>
## Property total_loss_estimation ∷ *TotalLossEstimation* Object

specifies the total estimated financial loss for the Incident

* This entry is optional


<a id="map72-ref"></a>
* *TotalLossEstimation* Object Value
  * Details: [*TotalLossEstimation* Object](#map72)

<a id="map72"></a>
# *TotalLossEstimation* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[actual_total_loss_estimation](#propertyactual_total_loss_estimation-lossestimationobject)|*LossEstimation* Object|specifies the actual level of total estimated financial loss for the Incident||
|[initial_reported_total_loss_estimation](#propertyinitial_reported_total_loss_estimation-lossestimationobject)|*LossEstimation* Object|specifies the initially reported level of total estimated financial loss for the Incident||

* Reference: [TotalLossEstimationType](http://stixproject.github.io/data-model/1.2/incident/TotalLossEstimationType/)

<a id="propertyactual_total_loss_estimation-lossestimationobject"></a>
## Property actual_total_loss_estimation ∷ *LossEstimation* Object

specifies the actual level of total estimated financial loss for the Incident

* This entry is optional


<a id="map74-ref"></a>
* *LossEstimation* Object Value
  * Details: [*LossEstimation* Object](#map74)

<a id="propertyinitial_reported_total_loss_estimation-lossestimationobject"></a>
## Property initial_reported_total_loss_estimation ∷ *LossEstimation* Object

specifies the initially reported level of total estimated financial loss for the Incident

* This entry is optional


<a id="map73-ref"></a>
* *LossEstimation* Object Value
  * Details: [*LossEstimation* Object](#map73)

<a id="map74"></a>
# *LossEstimation* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[amount](#propertyamount-integer)|Integer|the estimated financial loss for the Incident||
|[iso_currency_code](#propertyiso_currency_code-string)| String|ISO 4217 currency code if other than USD||

* Reference: [LossEstimationType](http://stixproject.github.io/data-model/1.2/incident/LossEstimationType/)

<a id="propertyamount-integer"></a>
## Property amount ∷ Integer

the estimated financial loss for the Incident

* This entry is optional



<a id="propertyiso_currency_code-string"></a>
## Property iso_currency_code ∷  String

ISO 4217 currency code if other than USD

* This entry is optional


  * String with at most 1024 characters

<a id="map73"></a>
# *LossEstimation* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[amount](#propertyamount-integer)|Integer|the estimated financial loss for the Incident||
|[iso_currency_code](#propertyiso_currency_code-string)| String|ISO 4217 currency code if other than USD||

* Reference: [LossEstimationType](http://stixproject.github.io/data-model/1.2/incident/LossEstimationType/)

<a id="propertyamount-integer"></a>
## Property amount ∷ Integer

the estimated financial loss for the Incident

* This entry is optional



<a id="propertyiso_currency_code-string"></a>
## Property iso_currency_code ∷  String

ISO 4217 currency code if other than USD

* This entry is optional


  * String with at most 1024 characters

<a id="map71"></a>
# *IndirectImpactSummary* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[brand_and_market_damage](#propertybrand_and_market_damage-securitycompromisestring)|SecurityCompromise String|characterizes (at a high level) the level of impact based on brand or market damage that occured in the Incident||
|[increased_operating_costs](#propertyincreased_operating_costs-securitycompromisestring)|SecurityCompromise String|characterizes (at a high level) the level of impact based on increased operating costs that occured in the Incident||
|[local_and_regulatory_costs](#propertylocal_and_regulatory_costs-securitycompromisestring)|SecurityCompromise String| ||
|[loss_of_competitive_advantage](#propertyloss_of_competitive_advantage-securitycompromisestring)|SecurityCompromise String|characterizes (at a high level) the level of impact based on loss of competitive advantage that occured in the Incident||

* Reference: [IndirectImpactSummaryType](http://stixproject.github.io/data-model/1.2/incident/IndirectImpactSummaryType/)

<a id="propertybrand_and_market_damage-securitycompromisestring"></a>
## Property brand_and_market_damage ∷ SecurityCompromise String

characterizes (at a high level) the level of impact based on brand or market damage that occured in the Incident

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="propertyincreased_operating_costs-securitycompromisestring"></a>
## Property increased_operating_costs ∷ SecurityCompromise String

characterizes (at a high level) the level of impact based on increased operating costs that occured in the Incident

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="propertylocal_and_regulatory_costs-securitycompromisestring"></a>
## Property local_and_regulatory_costs ∷ SecurityCompromise String

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="propertyloss_of_competitive_advantage-securitycompromisestring"></a>
## Property loss_of_competitive_advantage ∷ SecurityCompromise String

characterizes (at a high level) the level of impact based on loss of competitive advantage that occured in the Incident

* This entry is optional


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="map70"></a>
# *DirectImpactSummary* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[asset_losses](#propertyasset_losses-impactratingstring)|ImpactRating String|level of asset-related losses that occured in the Incident||
|[business_mission_distruption](#propertybusiness_mission_distruption-impactratingstring)|ImpactRating String|characterizes (at a high level) the level of business or mission disruption impact that occured in the Incident||
|[response_and_recovery_costs](#propertyresponse_and_recovery_costs-impactratingstring)|ImpactRating String|characterizes (at a high level) the level of response and recovery RELATED costs that occurred in the Incident||

* Reference: [DirectImpactSummaryType](http://stixproject.github.io/data-model/1.2/incident/DirectImpactSummaryType/)

<a id="propertyasset_losses-impactratingstring"></a>
## Property asset_losses ∷ ImpactRating String

level of asset-related losses that occured in the Incident

* This entry is optional


  * Allowed Values:
    * Major
    * Minor
    * Moderate
    * None
    * Unknown

<a id="propertybusiness_mission_distruption-impactratingstring"></a>
## Property business_mission_distruption ∷ ImpactRating String

characterizes (at a high level) the level of business or mission disruption impact that occured in the Incident

* This entry is optional


  * Allowed Values:
    * Major
    * Minor
    * Moderate
    * None
    * Unknown

<a id="propertyresponse_and_recovery_costs-impactratingstring"></a>
## Property response_and_recovery_costs ∷ ImpactRating String

characterizes (at a high level) the level of response and recovery RELATED costs that occurred in the Incident

* This entry is optional


  * Allowed Values:
    * Major
    * Minor
    * Moderate
    * None
    * Unknown

<a id="map57"></a>
# *AffectedAsset* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-string)| String|text description of the asset||
|[identifying_observables](#propertyidentifying_observables-observableobjectlist)|*Observable* Object List| ||
|[location_class](#propertylocation_class-locationclassstring)|LocationClass String|high-level characterization of where this asset is physically located||
|[management_class](#propertymanagement_class-managementclassstring)|ManagementClass String|high-level characterization of who is responsible for the day-to-day management and administration of this asset||
|[ownership_class](#propertyownership_class-ownershipclassstring)|OwnershipClass String|high-level characterization of who owns (or controls) this asset||
|[property_affected](#propertyproperty_affected-propertyaffectedobject)|*PropertyAffected* Object|affected property||
|[type](#propertytype-string)| String|type of the asset impacted by the incident (a security attribute was negatively affected).||

* Reference: [AffectedAssetType](http://stixproject.github.io/data-model/1.2/incident/AffectedAssetType/)

<a id="propertydescription-string"></a>
## Property description ∷  String

text description of the asset

* This entry is optional


  * String with at most 5000 characters

<a id="propertyidentifying_observables-observableobjectlist"></a>
## Property identifying_observables ∷ *Observable* Object List

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map76-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map76)

<a id="propertylocation_class-locationclassstring"></a>
## Property location_class ∷ LocationClass String

high-level characterization of where this asset is physically located

* This entry is optional


  * Allowed Values:
    * Co-Located
    * Externally-Located
    * Internally-Located
    * Mobile
    * Unknown

<a id="propertymanagement_class-managementclassstring"></a>
## Property management_class ∷ ManagementClass String

high-level characterization of who is responsible for the day-to-day management and administration of this asset

* This entry is optional


  * Allowed Values:
    * CO-Management
    * Externally-Management
    * Internally-Managed
    * Unknown

<a id="propertyownership_class-ownershipclassstring"></a>
## Property ownership_class ∷ OwnershipClass String

high-level characterization of who owns (or controls) this asset

* This entry is optional


  * Allowed Values:
    * Customer-Owned
    * Employee-Owned
    * Internally-Owned
    * Partner-Owned
    * Unknown

<a id="propertyproperty_affected-propertyaffectedobject"></a>
## Property property_affected ∷ *PropertyAffected* Object

affected property

* This entry is optional
* Dev Notes: Unnested NatureOfSecurityEffect


<a id="map75-ref"></a>
* *PropertyAffected* Object Value
  * Details: [*PropertyAffected* Object](#map75)

<a id="propertytype-string"></a>
## Property type ∷  String

type of the asset impacted by the incident (a security attribute was negatively affected).

* This entry is optional


  * String with at most 1024 characters

<a id="map76"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



<a id="map75"></a>
# *PropertyAffected* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description_of_effect](#propertydescription_of_effect-string)| String|a brief prose description of how the security property was affected||
|[duration_of_availability_loss](#propertyduration_of_availability_loss-lossdurationstring)|LossDuration String|approximate length of time availability was affected||
|[non_public_data_compromised](#propertynon_public_data_compromised-nonpublicdatacompromisedobject)|*NonPublicDataCompromised* Object|approximate length of time availability was affected||
|[property](#propertyproperty-losspropertystring)|LossProperty String|security property that was affected by the incident||
|[type_of_availability_loss](#propertytype_of_availability_loss-string)| String|characterizes in what manner the availability of this asset was affected||

* Reference: [PropertyAffectedTpye](http://stixproject.github.io/data-model/1.2/incident/PropertyAffectedType/)

<a id="propertydescription_of_effect-string"></a>
## Property description_of_effect ∷  String

a brief prose description of how the security property was affected

* This entry is optional


  * String with at most 5000 characters

<a id="propertyduration_of_availability_loss-lossdurationstring"></a>
## Property duration_of_availability_loss ∷ LossDuration String

approximate length of time availability was affected

* This entry is optional


  * Allowed Values:
    * Days
    * Hours
    * Minutes
    * Permanent
    * Seconds
    * Unknown
    * Weeks

<a id="propertynon_public_data_compromised-nonpublicdatacompromisedobject"></a>
## Property non_public_data_compromised ∷ *NonPublicDataCompromised* Object

approximate length of time availability was affected

* This entry is optional


<a id="map77-ref"></a>
* *NonPublicDataCompromised* Object Value
  * Details: [*NonPublicDataCompromised* Object](#map77)

<a id="propertyproperty-losspropertystring"></a>
## Property property ∷ LossProperty String

security property that was affected by the incident

* This entry is optional


  * Allowed Values:
    * Accountability
    * Availability
    * Confidentiality
    * Integrity
    * Non-Repudiation

<a id="propertytype_of_availability_loss-string"></a>
## Property type_of_availability_loss ∷  String

characterizes in what manner the availability of this asset was affected

* This entry is optional
* Dev Notes: empty vocabulary


  * String with at most 1024 characters

<a id="map77"></a>
# *NonPublicDataCompromised* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[security_compromise](#propertysecurity_compromise-securitycompromisestring)|SecurityCompromise String|related security compromise|&#10003;|
|[data_encrypted](#propertydata_encrypted-boolean)|Boolean|whether the data that was compromised was encrypted or not||

* Reference: [NonPublicDataCompromisedType](http://stixproject.github.io/data-model/1.2/incident/NonPublicDataCompromisedType/)

<a id="propertydata_encrypted-boolean"></a>
## Property data_encrypted ∷ Boolean

whether the data that was compromised was encrypted or not

* This entry is optional



<a id="propertysecurity_compromise-securitycompromisestring"></a>
## Property security_compromise ∷ SecurityCompromise String

related security compromise

* This entry is required


  * Allowed Values:
    * No
    * Suspected
    * Unknown
    * Yes

<a id="map56"></a>
# *IncidentTime* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[containment_achieved](#propertycontainment_achieved-instdate)|Inst (Date)| ||
|[first_data_exfiltration](#propertyfirst_data_exfiltration-instdate)|Inst (Date)| ||
|[first_malicious_action](#propertyfirst_malicious_action-instdate)|Inst (Date)| ||
|[incident_closed](#propertyincident_closed-instdate)|Inst (Date)| ||
|[incident_discovery](#propertyincident_discovery-instdate)|Inst (Date)| ||
|[incident_opened](#propertyincident_opened-instdate)|Inst (Date)| ||
|[incident_reported](#propertyincident_reported-instdate)|Inst (Date)| ||
|[initial_compromise](#propertyinitial_compromise-instdate)|Inst (Date)| ||
|[restoration_achieved](#propertyrestoration_achieved-instdate)|Inst (Date)| ||

* Reference: [TimeType](http://stixproject.github.io/data-model/1.2/incident/TimeType/)

<a id="propertycontainment_achieved-instdate"></a>
## Property containment_achieved ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyfirst_data_exfiltration-instdate"></a>
## Property first_data_exfiltration ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyfirst_malicious_action-instdate"></a>
## Property first_malicious_action ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyincident_closed-instdate"></a>
## Property incident_closed ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyincident_discovery-instdate"></a>
## Property incident_discovery ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyincident_opened-instdate"></a>
## Property incident_opened ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyincident_reported-instdate"></a>
## Property incident_reported ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyinitial_compromise-instdate"></a>
## Property initial_compromise ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyrestoration_achieved-instdate"></a>
## Property restoration_achieved ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map55"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map54"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map11"></a>
# *Feedback* Object

Feedback on any entity.  Is it wrong?  If so why?  Was
  it right-on, and worthy of confirmation?

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[entity_id](#propertyentity_id-string)| String| |&#10003;|
|[feedback](#propertyfeedback-integer)|Integer| |&#10003;|
|[id](#propertyid-string)| String| |&#10003;|
|[reason](#propertyreason-string)| String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-feedbacktypeidentifierstring)|FeedbackTypeIdentifier String| |&#10003;|
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-string)| String| ||
|[revision](#propertyrevision-integer)|Integer| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||


<a id="propertyentity_id-string"></a>
## Property entity_id ∷  String

* This entry is required


  * A URI leading to an entity

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map78-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map78)

<a id="propertyfeedback-integer"></a>
## Property feedback ∷ Integer

* This entry is required


  * Allowed Values:
    * -1
    * 0
    * 1

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyreason-string"></a>
## Property reason ∷  String

* This entry is required



<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-feedbacktypeidentifierstring"></a>
## Property type ∷ FeedbackTypeIdentifier String

* This entry is required


  * Must equal: "feedback"

<a id="map78"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map10"></a>
# *ExploitTarget* Object

Vulnerabilities or weaknesses in software, systems, networks, or configurations

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)| String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-exploittargettypeidentifierstring)|ExploitTargetTypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[configuration](#propertyconfiguration-configurationobjectlist)|*Configuration* Object List|identifies and characterizes a Configuration as a potential Exploit Target||
|[description](#propertydescription-string)| String| ||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-string)| String| ||
|[revision](#propertyrevision-integer)|Integer| ||
|[short_description](#propertyshort_description-string)| String| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||
|[vulnerability](#propertyvulnerability-vulnerabilityobjectlist)|*Vulnerability* Object List|identifies and characterizes a Vulnerability as a potential Exploit Target||
|[weakness](#propertyweakness-weaknessobjectlist)|*Weakness* Object List|identifies and characterizes a Weakness as a potential Exploit Target||

* Reference: [ExploitTargetType](http://stixproject.github.io/data-model/1.2/et/ExploitTargetType/)

<a id="propertyconfiguration-configurationobjectlist"></a>
## Property configuration ∷ *Configuration* Object List

identifies and characterizes a Configuration as a potential Exploit Target

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map83-ref"></a>
* *Configuration* Object Value
  * Details: [*Configuration* Object](#map83)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map79-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map79)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-exploittargettypeidentifierstring"></a>
## Property type ∷ ExploitTargetTypeIdentifier String

* This entry is required


  * Must equal: "exploit-target"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map80-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map80)

<a id="propertyvulnerability-vulnerabilityobjectlist"></a>
## Property vulnerability ∷ *Vulnerability* Object List

identifies and characterizes a Vulnerability as a potential Exploit Target

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map81-ref"></a>
* *Vulnerability* Object Value
  * Details: [*Vulnerability* Object](#map81)

<a id="propertyweakness-weaknessobjectlist"></a>
## Property weakness ∷ *Weakness* Object List

identifies and characterizes a Weakness as a potential Exploit Target

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map82-ref"></a>
* *Weakness* Object Value
  * Details: [*Weakness* Object](#map82)

<a id="map83"></a>
# *Configuration* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-string)| String|text description of this Configuration|&#10003;|
|[cce_id](#propertycce_id-string)| String|CCE identifier for a configuration item||
|[short_description](#propertyshort_description-string)| String|short text description of this Configuration||

* Reference: [ConfigurationType](http://stixproject.github.io/data-model/1.2/et/ConfigurationType/)

<a id="propertycce_id-string"></a>
## Property cce_id ∷  String

CCE identifier for a configuration item

* This entry is optional


  * String with at most 1024 characters

<a id="propertydescription-string"></a>
## Property description ∷  String

text description of this Configuration

* This entry is required


  * String with at most 5000 characters

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

short text description of this Configuration

* This entry is optional


  * String with at most 2048 characters

<a id="map82"></a>
# *Weakness* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-string)| String|text description of this Weakness|&#10003;|
|[cwe_id](#propertycwe_id-string)| String|CWE identifier for a particular weakness||

* Reference: [WeaknessType](http://stixproject.github.io/data-model/1.2/et/WeaknessType/)

<a id="propertycwe_id-string"></a>
## Property cwe_id ∷  String

CWE identifier for a particular weakness

* This entry is optional


  * String with at most 1024 characters

<a id="propertydescription-string"></a>
## Property description ∷  String

text description of this Weakness

* This entry is required


  * String with at most 5000 characters

<a id="map81"></a>
# *Vulnerability* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-string)| String|Description of the Vulnerability|&#10003;|
|[title](#propertytitle-string)| String|title for this vulnerability|&#10003;|
|[affected_software](#propertyaffected_software-stringlist)| String List|list of platforms and software that are affected by this vulnerability||
|[cve_id](#propertycve_id-string)| String|CVE identifier||
|[discovered_datetime](#propertydiscovered_datetime-instdate)|Inst (Date)|date and time that this vulnerability was first discovered||
|[is_known](#propertyis_known-boolean)|Boolean|whether or not the vulnerability is known (i.e. not a 0-day) at the time of characterization.||
|[is_public_acknowledged](#propertyis_public_acknowledged-boolean)|Boolean|whether or not the vulnerability is publicly acknowledged by the vendor||
|[osvdb_id](#propertyosvdb_id-integer)|Integer|OSVDB identifier||
|[published_datetime](#propertypublished_datetime-instdate)|Inst (Date)|date and time that this vulnerability was first published||
|[references](#propertyreferences-stringlist)| String List|list of external references describing this vulnerability||
|[short_description](#propertyshort_description-string)| String|short text description of this vulnerability||
|[source](#propertysource-string)| String|the source of the CVE or OSVDB as a textual description or URL||

* Reference: [VulnerabilityType](http://stixproject.github.io/data-model/1.2/et/VulnerabilityType/)

<a id="propertyaffected_software-stringlist"></a>
## Property affected_software ∷  String List

list of platforms and software that are affected by this vulnerability

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * String with at most 1024 characters

<a id="propertycve_id-string"></a>
## Property cve_id ∷  String

CVE identifier

* This entry is optional


  * String with at most 1024 characters

<a id="propertydescription-string"></a>
## Property description ∷  String

Description of the Vulnerability

* This entry is required


  * String with at most 5000 characters

<a id="propertydiscovered_datetime-instdate"></a>
## Property discovered_datetime ∷ Inst (Date)

date and time that this vulnerability was first discovered

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyis_known-boolean"></a>
## Property is_known ∷ Boolean

whether or not the vulnerability is known (i.e. not a 0-day) at the time of characterization.

* This entry is optional



<a id="propertyis_public_acknowledged-boolean"></a>
## Property is_public_acknowledged ∷ Boolean

whether or not the vulnerability is publicly acknowledged by the vendor

* This entry is optional



<a id="propertyosvdb_id-integer"></a>
## Property osvdb_id ∷ Integer

OSVDB identifier

* This entry is optional



<a id="propertypublished_datetime-instdate"></a>
## Property published_datetime ∷ Inst (Date)

date and time that this vulnerability was first published

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyreferences-stringlist"></a>
## Property references ∷  String List

list of external references describing this vulnerability

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * A URI

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

short text description of this vulnerability

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-string"></a>
## Property source ∷  String

the source of the CVE or OSVDB as a textual description or URL

* This entry is optional


  * String with at most 1024 characters

<a id="propertytitle-string"></a>
## Property title ∷  String

title for this vulnerability

* This entry is required


  * String with at most 1024 characters

<a id="map80"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map79"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map9"></a>
# *COA* Object

Course of Action. A corrective or preventative action to be taken in response to a threat

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)| String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-coatypeidentifierstring)|COATypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[coa_type](#propertycoa_type-coatypestring)|COAType String|The type of this COA||
|[cost](#propertycost-highmedlowstring)|HighMedLow String|Characterizes the estimated cost for applying this course of action||
|[description](#propertydescription-string)| String| ||
|[efficacy](#propertyefficacy-highmedlowstring)|HighMedLow String|Effectiveness of this course of action in achieving its targeted objective||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[impact](#propertyimpact-string)| String|Characterizes the estimated impact of applying this course of action||
|[language](#propertylanguage-string)| String| ||
|[objective](#propertyobjective-stringlist)| String List|Characterizes the objective of this course of action||
|[open_c2_coa](#propertyopen_c2_coa-openc2coaobject)|*OpenC2COA* Object| ||
|[related_COAs](#propertyrelated_coas-relatedcoaobjectlist)|*RelatedCOA* Object List|Identifies or characterizes relationships to one or more related courses of action||
|[revision](#propertyrevision-integer)|Integer| ||
|[short_description](#propertyshort_description-string)| String| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[stage](#propertystage-coastagestring)|COAStage String|Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to||
|[structured_coa_type](#propertystructured_coa_type-openc2structuredcoatypestring)|OpenC2StructuredCOAType String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||

* Reference: [CourseOfActionType](http://stixproject.github.io/data-model/1.2/coa/CourseOfActionType/)

<a id="propertycoa_type-coatypestring"></a>
## Property coa_type ∷ COAType String

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
## Property cost ∷ HighMedLow String

Characterizes the estimated cost for applying this course of action

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyefficacy-highmedlowstring"></a>
## Property efficacy ∷ HighMedLow String

Effectiveness of this course of action in achieving its targeted objective

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map84-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map84)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyimpact-string"></a>
## Property impact ∷  String

Characterizes the estimated impact of applying this course of action

* This entry is optional


  * String with at most 1024 characters

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyobjective-stringlist"></a>
## Property objective ∷  String List

Characterizes the objective of this course of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Squashed / simplified


  * String with at most 1024 characters

<a id="propertyopen_c2_coa-openc2coaobject"></a>
## Property open_c2_coa ∷ *OpenC2COA* Object

* This entry is optional


<a id="map87-ref"></a>
* *OpenC2COA* Object Value
  * Details: [*OpenC2COA* Object](#map87)

<a id="propertyrelated_coas-relatedcoaobjectlist"></a>
## Property related_COAs ∷ *RelatedCOA* Object List

Identifies or characterizes relationships to one or more related courses of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map86-ref"></a>
* *RelatedCOA* Object Value
  * Details: [*RelatedCOA* Object](#map86)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertystage-coastagestring"></a>
## Property stage ∷ COAStage String

Specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to

* This entry is optional


  * Allowed Values:
    * Remedy
    * Response
  * Reference: [COAStageVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/COAStageVocab-1.0/)

<a id="propertystructured_coa_type-openc2structuredcoatypestring"></a>
## Property structured_coa_type ∷ OpenC2StructuredCOAType String

* This entry is optional


  * Must equal: "openc2"

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-coatypeidentifierstring"></a>
## Property type ∷ COATypeIdentifier String

* This entry is required


  * Must equal: "coa"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map85-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map85)

<a id="map87"></a>
# *OpenC2COA* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[action](#propertyaction-actiontypeobject)|*ActionType* Object| |&#10003;|
|[id](#propertyid-string)| String| |&#10003;|
|[type](#propertytype-structuredcoatypestring)|StructuredCOAType String| |&#10003;|
|[actuator](#propertyactuator-actuatortypeobject)|*ActuatorType* Object| ||
|[modifiers](#propertymodifiers-modifiertypeobject)|*ModifierType* Object| ||
|[target](#propertytarget-targettypeobject)|*TargetType* Object| ||


<a id="propertyaction-actiontypeobject"></a>
## Property action ∷ *ActionType* Object

* This entry is required


<a id="map88-ref"></a>
* *ActionType* Object Value
  * Details: [*ActionType* Object](#map88)

<a id="propertyactuator-actuatortypeobject"></a>
## Property actuator ∷ *ActuatorType* Object

* This entry is optional


<a id="map90-ref"></a>
* *ActuatorType* Object Value
  * Details: [*ActuatorType* Object](#map90)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * String with at most 1024 characters

<a id="propertymodifiers-modifiertypeobject"></a>
## Property modifiers ∷ *ModifierType* Object

* This entry is optional


<a id="map91-ref"></a>
* *ModifierType* Object Value
  * Details: [*ModifierType* Object](#map91)

<a id="propertytarget-targettypeobject"></a>
## Property target ∷ *TargetType* Object

* This entry is optional


<a id="map89-ref"></a>
* *TargetType* Object Value
  * Details: [*TargetType* Object](#map89)

<a id="propertytype-structuredcoatypestring"></a>
## Property type ∷ StructuredCOAType String

* This entry is required


  * Must equal: "structured_coa"

<a id="map91"></a>
# *ModifierType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[additional_properties](#propertyadditional_properties-additionalpropertiesobject)|*AdditionalProperties* Object| ||
|[delay](#propertydelay-instdate)|Inst (Date)| ||
|[destination](#propertydestination-string)| String| ||
|[duration](#propertyduration-instdate)|Inst (Date)| ||
|[frequency](#propertyfrequency-string)| String| ||
|[id](#propertyid-string)| String| ||
|[location](#propertylocation-string)| String| ||
|[method](#propertymethod-stringlist)| String List| ||
|[option](#propertyoption-string)| String| ||
|[response](#propertyresponse-string)| String| ||
|[search](#propertysearch-string)| String| ||
|[source](#propertysource-string)| String| ||
|[time](#propertytime-validtimeobject)|*ValidTime* Object| ||


<a id="propertyadditional_properties-additionalpropertiesobject"></a>
## Property additional_properties ∷ *AdditionalProperties* Object

* This entry is optional


<a id="map93-ref"></a>
* *AdditionalProperties* Object Value
  * Details: [*AdditionalProperties* Object](#map93)

<a id="propertydelay-instdate"></a>
## Property delay ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertydestination-string"></a>
## Property destination ∷  String

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


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyfrequency-string"></a>
## Property frequency ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertylocation-string"></a>
## Property location ∷  String

* This entry is optional


  * Allowed Values:
    * internal
    * perimeter

<a id="propertymethod-stringlist"></a>
## Property method ∷  String List

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

<a id="propertyoption-string"></a>
## Property option ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyresponse-string"></a>
## Property response ∷  String

* This entry is optional


  * Allowed Values:
    * acknowledge
    * command-ref
    * query
    * status

<a id="propertysearch-string"></a>
## Property search ∷  String

* This entry is optional


  * Allowed Values:
    * cve
    * patch
    * signature
    * vendor_bulletin

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytime-validtimeobject"></a>
## Property time ∷ *ValidTime* Object

* This entry is optional


<a id="map92-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map92)

<a id="map93"></a>
# *AdditionalProperties* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[context](#propertycontext-string)| String| |&#10003;|


<a id="propertycontext-string"></a>
## Property context ∷  String

* This entry is required


  * String with at most 1024 characters

<a id="map92"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map90"></a>
# *ActuatorType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-actuatortypestring)|ActuatorType String| |&#10003;|
|[specifiers](#propertyspecifiers-stringlist)| String List|list of additional properties describing the actuator||


<a id="propertyspecifiers-stringlist"></a>
## Property specifiers ∷  String List

list of additional properties describing the actuator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * String with at most 1024 characters

<a id="propertytype-actuatortypestring"></a>
## Property type ∷ ActuatorType String

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

<a id="map89"></a>
# *TargetType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-string)| String| |&#10003;|
|[specifiers](#propertyspecifiers-string)| String|Cybox object representing the target||


<a id="propertyspecifiers-string"></a>
## Property specifiers ∷  String

Cybox object representing the target

* This entry is optional


  * String with at most 1024 characters

<a id="propertytype-string"></a>
## Property type ∷  String

* This entry is required


  * String with at most 1024 characters

<a id="map88"></a>
# *ActionType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-coatypestring)|COAType String| |&#10003;|


<a id="propertytype-coatypestring"></a>
## Property type ∷ COAType String

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

<a id="map86"></a>
# *RelatedCOA* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[COA_id](#propertycoa_id-string)| String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| ||
|[relationship](#propertyrelationship-string)| String| ||
|[source](#propertysource-string)| String| ||


<a id="propertycoa_id-string"></a>
## Property COA_id ∷  String

* This entry is required


  * A URI leading to a COA

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyrelationship-string"></a>
## Property relationship ∷  String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional



<a id="map85"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map84"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map8"></a>
# *Campaign* Object

Represents a campaign by an [actor](actor.md) pursing an intent

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[campaign_type](#propertycampaign_type-string)| String| |&#10003;|
|[id](#propertyid-string)| String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-campaigntypeidentifierstring)|CampaignTypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object|Timestamp for the definition of a specific version of a campaign|&#10003;|
|[activity](#propertyactivity-activityobjectlist)|*Activity* Object List|Actions taken in regards to this Campaign||
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String|Level of confidence held in the characterization of this Campaign||
|[description](#propertydescription-string)| String| ||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[intended_effect](#propertyintended_effect-intendedeffectstringlist)|IntendedEffect String List|Characterizes the intended effect of this cyber threat campaign||
|[language](#propertylanguage-string)| String| ||
|[names](#propertynames-stringlist)| String List|Names used to identify this campaign||
|[revision](#propertyrevision-integer)|Integer| ||
|[short_description](#propertyshort_description-string)| String| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[status](#propertystatus-campaignstatusstring)|CampaignStatus String|Status of this Campaign||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||

* Reference: [CampaignType](http://stixproject.github.io/data-model/1.2/campaign/CampaignType/)

<a id="propertyactivity-activityobjectlist"></a>
## Property activity ∷ *Activity* Object List

Actions taken in regards to this Campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map96-ref"></a>
* *Activity* Object Value
  * Details: [*Activity* Object](#map96)

<a id="propertycampaign_type-string"></a>
## Property campaign_type ∷  String

* This entry is required
* Dev Notes: Should we define a vocabulary for this?


  * String with at most 1024 characters

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

Level of confidence held in the characterization of this Campaign

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map94-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map94)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyintended_effect-intendedeffectstringlist"></a>
## Property intended_effect ∷ IntendedEffect String List

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

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertynames-stringlist"></a>
## Property names ∷  String List

Names used to identify this campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertystatus-campaignstatusstring"></a>
## Property status ∷ CampaignStatus String

Status of this Campaign

* This entry is optional


  * Allowed Values:
    * Future
    * Historic
    * Ongoing

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-campaigntypeidentifierstring"></a>
## Property type ∷ CampaignTypeIdentifier String

* This entry is required


  * Must equal: "campaign"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

Timestamp for the definition of a specific version of a campaign

* This entry is required


<a id="map95-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map95)

<a id="map96"></a>
# *Activity* Object

What happend, when?

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[date_time](#propertydate_time-instdate)|Inst (Date)|Specifies the date and time at which the activity occured|&#10003;|
|[description](#propertydescription-string)| String|A description of the activity|&#10003;|

* Reference: [ActivityType](http://stixproject.github.io/data-model/1.2/stixCommon/ActivityType/)

<a id="propertydate_time-instdate"></a>
## Property date_time ∷ Inst (Date)

Specifies the date and time at which the activity occured

* This entry is required


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertydescription-string"></a>
## Property description ∷  String

A description of the activity

* This entry is required


  * Markdown string with at most 5000 characters

<a id="map95"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map94"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map7"></a>
# *AttackPattern* Object

Attack Patterns are a type of TTP that describe ways that adversaries attempt to compromise targets.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-string)| String|A description that provides more details and context about the Attack Pattern, potentially including its purpose and its key characteristics.|&#10003;|
|[id](#propertyid-string)| String| |&#10003;|
|[name](#propertyname-string)| String|A name used to identify the Attack Pattern.|&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-attackpatterntypeidentifierstring)|AttackPatternTypeIdentifier String| |&#10003;|
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|A list of external references which refer to non-STIX information. This property MAY be used to provide one or more Attack Pattern identifiers, such as a CAPEC ID. When specifying a CAPEC ID, the source_name property of the external reference MUST be set to capec and the external_id property MUST be formatted as CAPEC-[id].||
|[kill_chain_phases](#propertykill_chain_phases-killchainphaseobjectlist)|*KillChainPhase* Object List|The list of Kill Chain Phases for which this Attack Pattern is used.||
|[language](#propertylanguage-string)| String| ||
|[revision](#propertyrevision-integer)|Integer| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||
|[x_mitre_contributors](#propertyx_mitre_contributors-stringlist)| String List|ATT&CK Technique.Contributors||
|[x_mitre_data_sources](#propertyx_mitre_data_sources-stringlist)| String List|ATT&CK Technique.Data Sources||
|[x_mitre_platforms](#propertyx_mitre_platforms-stringlist)| String List|ATT&CK Technique.Platforms||

* Reference: [Attack Pattern](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/pub#h.axjijf603msy)

<a id="propertydescription-string"></a>
## Property description ∷  String

A description that provides more details and context about the Attack Pattern, potentially including its purpose and its key characteristics.

* This entry is required


  * Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

A list of external references which refer to non-STIX information. This property MAY be used to provide one or more Attack Pattern identifiers, such as a CAPEC ID. When specifying a CAPEC ID, the source_name property of the external reference MUST be set to capec and the external_id property MUST be formatted as CAPEC-[id].

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map98-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map98)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertykill_chain_phases-killchainphaseobjectlist"></a>
## Property kill_chain_phases ∷ *KillChainPhase* Object List

The list of Kill Chain Phases for which this Attack Pattern is used.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map99-ref"></a>
* *KillChainPhase* Object Value
  * Details: [*KillChainPhase* Object](#map99)

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyname-string"></a>
## Property name ∷  String

A name used to identify the Attack Pattern.

* This entry is required


  * String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-attackpatterntypeidentifierstring"></a>
## Property type ∷ AttackPatternTypeIdentifier String

* This entry is required


  * Must equal: "attack-pattern"

<a id="propertyx_mitre_contributors-stringlist"></a>
## Property x_mitre_contributors ∷  String List

ATT&CK Technique.Contributors

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * String with at most 1024 characters

<a id="propertyx_mitre_data_sources-stringlist"></a>
## Property x_mitre_data_sources ∷  String List

ATT&CK Technique.Data Sources

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * String with at most 1024 characters

<a id="propertyx_mitre_platforms-stringlist"></a>
## Property x_mitre_platforms ∷  String List

ATT&CK Technique.Platforms

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * String with at most 1024 characters

<a id="map99"></a>
# *KillChainPhase* Object

The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)| String|The name of the kill chain.|&#10003;|
|[phase_name](#propertyphase_name-string)| String|The name of the phase in the kill chain.|&#10003;|

* Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

<a id="propertykill_chain_name-string"></a>
## Property kill_chain_name ∷  String

The name of the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Must equal: "lockheed-martin-cyber-kill-chain"
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)

<a id="propertyphase_name-string"></a>
## Property phase_name ∷  String

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

<a id="map98"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map97"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map6"></a>
# *Actor* Object

Describes malicious actors (or adversaries) related to a cyber attack

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[actor_type](#propertyactor_type-threatactortypestring)|ThreatActorType String| |&#10003;|
|[id](#propertyid-string)| String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[source](#propertysource-string)| String| |&#10003;|
|[type](#propertytype-actortypeidentifierstring)|ActorTypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String| ||
|[description](#propertydescription-string)| String| ||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[identity](#propertyidentity-identityobject)|*Identity* Object| ||
|[intended_effect](#propertyintended_effect-intendedeffectstring)|IntendedEffect String| ||
|[language](#propertylanguage-string)| String| ||
|[motivation](#propertymotivation-motivationstring)|Motivation String| ||
|[planning_and_operational_support](#propertyplanning_and_operational_support-string)| String| ||
|[revision](#propertyrevision-integer)|Integer| ||
|[short_description](#propertyshort_description-string)| String| ||
|[sophistication](#propertysophistication-sophisticationstring)|Sophistication String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||

* Reference: [ThreatActorType](http://stixproject.github.io/data-model/1.2/ta/ThreatActorType/)

<a id="propertyactor_type-threatactortypestring"></a>
## Property actor_type ∷ ThreatActorType String

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

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map100-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map100)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyidentity-identityobject"></a>
## Property identity ∷ *Identity* Object

* This entry is optional


<a id="map102-ref"></a>
* *Identity* Object Value
  * Details: [*Identity* Object](#map102)

<a id="propertyintended_effect-intendedeffectstring"></a>
## Property intended_effect ∷ IntendedEffect String

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

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertymotivation-motivationstring"></a>
## Property motivation ∷ Motivation String

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

<a id="propertyplanning_and_operational_support-string"></a>
## Property planning_and_operational_support ∷  String

* This entry is optional


  * String with at most 5000 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysophistication-sophisticationstring"></a>
## Property sophistication ∷ Sophistication String

* This entry is optional


  * Allowed Values:
    * Aspirant
    * Expert
    * Innovator
    * Novice
    * Practitioner

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is required


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-actortypeidentifierstring"></a>
## Property type ∷ ActorTypeIdentifier String

* This entry is required


  * Must equal: "actor"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map101-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map101)

<a id="map102"></a>
# *Identity* Object

Describes a person or an organization

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-string)| String| |&#10003;|
|[related_identities](#propertyrelated_identities-relatedidentityobjectlist)|*RelatedIdentity* Object List|Identifies other entity Identities related to this Identity|&#10003;|

* Reference: [IdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is required


  * Markdown string with at most 5000 characters

<a id="propertyrelated_identities-relatedidentityobjectlist"></a>
## Property related_identities ∷ *RelatedIdentity* Object List

Identifies other entity Identities related to this Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map103-ref"></a>
* *RelatedIdentity* Object Value
  * Details: [*RelatedIdentity* Object](#map103)

<a id="map103"></a>
# *RelatedIdentity* Object

Describes a related Identity

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[identity](#propertyidentity-string)| String|The reference (URI) of the related Identity object|&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String|Specifies the level of confidence in the assertion of the relationship between the two objects||
|[information_source](#propertyinformation_source-string)| String|Specifies the source of the information about the relationship between the two components||
|[relationship](#propertyrelationship-string)| String| ||

* Reference: [RelatedIdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/)

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

Specifies the level of confidence in the assertion of the relationship between the two objects

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyidentity-string"></a>
## Property identity ∷  String

The reference (URI) of the related Identity object

* This entry is required


  * A URI

<a id="propertyinformation_source-string"></a>
## Property information_source ∷  String

Specifies the source of the information about the relationship between the two components

* This entry is optional



<a id="propertyrelationship-string"></a>
## Property relationship ∷  String

* This entry is optional



<a id="map101"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map100"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map5"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-string)| String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-string"></a>
## Property source_name ∷  String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map4"></a>
# *Text* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[text](#propertytext-string)| String| |&#10003;|
|[type](#propertytype-string)| String| |&#10003;|


<a id="propertytext-string"></a>
## Property text ∷  String

* This entry is required



<a id="propertytype-string"></a>
## Property type ∷  String

* This entry is required


