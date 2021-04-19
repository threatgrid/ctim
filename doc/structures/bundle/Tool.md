<a id="map18"></a>
# *Tool*

> Reference: [Tool](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/pub#h.z4voa9ndw8v)

*Tool* Tools are legitimate software that can be used by threat actors to perform attacks. Knowing how and when threat actors use such tools can be important for understanding how campaigns are executed. Unlike malware, these tools or software packages are often found on a system and have legitimate purposes for power users, system administrators, network administrators, or even normal users. Remote access tools (e.g., RDP) and network scanning tools (e.g., Nmap) are examples of Tools that may be used by a Threat Actor during an attack.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#description-markdownstring)|MarkdownString|A description of object, which may be detailed.|**Required**|
|[id](#id-string)|String|Globally unique URI identifying this object.|**Required**|
|[labels](#labels-toollabelstring)|[ToolLabelString]|The kind(s) of tool(s) being described.|**Required**|
|[schema_version](#schema_version-string)|String|CTIM schema version for this entity|**Required**|
|[short_description](#short_description-medstring)|MedString|A single line, short summary of the object.|**Required**|
|[title](#title-shortstring)|ShortString|A short title for this object, used as primary display and reference value|**Required**|
|[type](#type-tooltypeidentifierstring)|ToolTypeIdentifierString| |**Required**|
|[external_ids](#external_ids-string)|[String]| |_Optional_|
|[external_references](#external_references-externalreferenceexternalreferencemdmap94)|[[*ExternalReference*](./ExternalReference.md#map94)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[kill_chain_phases](#kill_chain_phases-killchainphasekillchainphasemdmap95)|[[*KillChainPhase*](./KillChainPhase.md#map95)]|The list of kill chain phases for which this Tool can be used.|_Optional_|
|[language](#language-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[revision](#revision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[source](#source-medstring)|MedString| |_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|
|[timestamp](#timestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[tlp](#tlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|
|[tool_version](#tool_version-shortstring)|ShortString|The version identifier associated with the Tool.|_Optional_|
|[x_mitre_aliases](#x_mitre_aliases-shortstring)|[ShortString]|ATT&CK Software.aliases|_Optional_|


<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

A description of object, which may be detailed.

* This entry is **required**


  * *Markdown* Markdown string with at most 5000 characters

<a id="external_ids-string"></a>
### `external_ids` ∷ [String]

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)



<a id="external_references-externalreferenceexternalreferencemdmap94"></a>
### `external_references` ∷ [[*ExternalReference*](./ExternalReference.md#map94)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="id-string"></a>
### `id` ∷ String

Globally unique URI identifying this object.

* This entry is **required**


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](https://github.com/threatgrid/ctim/blob/subdoc/doc/structures/judgement/Judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="kill_chain_phases-killchainphasekillchainphasemdmap95"></a>
### `kill_chain_phases` ∷ [[*KillChainPhase*](./KillChainPhase.md#map95)]

The list of kill chain phases for which this Tool can be used.

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="labels-toollabelstring"></a>
### `labels` ∷ [ToolLabelString]

The kind(s) of tool(s) being described.

* This entry is **required**
* This entry's type is sequential (allows zero or more values)


  * *ToolLabel* Tool labels describe the categories of tools that can be used to perform attacks.
  * Allowed values:
    * `"credential-exploitation"`
    * `"denial-of-service"`
    * `"exploitation"`
    * `"information-gathering"`
    * `"network-capture"`
    * `"remote-access"`
    * `"vulnerability-scanning"`
  * Reference: [Tool Label](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.cozm95emj8qk)


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

<a id="short_description-medstring"></a>
### `short_description` ∷ MedString

A single line, short summary of the object.

* This entry is **required**


  * *MedString* String with at most 2048 characters

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

<a id="title-shortstring"></a>
### `title` ∷ ShortString

A short title for this object, used as primary display and reference value

* This entry is **required**


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

<a id="tool_version-shortstring"></a>
### `tool_version` ∷ ShortString

The version identifier associated with the Tool.

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="type-tooltypeidentifierstring"></a>
### `type` ∷ ToolTypeIdentifierString

* This entry is **required**


  * Must equal: `"tool"`

<a id="x_mitre_aliases-shortstring"></a>
### `x_mitre_aliases` ∷ [ShortString]

ATT&CK Software.aliases

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters
