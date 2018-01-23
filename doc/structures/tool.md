<a id="top"></a>
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


<a id="map1-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map1)

<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertykill_chain_phases-killchainphaseobjectlist"></a>
## Property kill_chain_phases ∷ *KillChainPhase* Object List

The list of kill chain phases for which this Tool can be used.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map2-ref"></a>
* *KillChainPhase* Object Value
  * Details: [*KillChainPhase* Object](#map2)

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
