<a id="map5"></a>
# *ExternalReference*

> Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#source_name-medstring)|MedString|The source within which the external-reference is defined (system, registry, organization, etc.)|**Required**|
|[description](#description-markdownstring)|MarkdownString| |_Optional_|
|[external_id](#external_id-string)|String|An identifier for the external reference content.|_Optional_|
|[hashes](#hashes-string)|[String]|Specifies a dictionary of hashes for the contents of the url.|_Optional_|
|[url](#url-string)|String|A URL reference to an external resource|_Optional_|


<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

* This entry is _optional_


  * *Markdown* Markdown string with at most 5000 characters

<a id="external_id-string"></a>
### `external_id` ∷ String

An identifier for the external reference content.

* This entry is _optional_



<a id="hashes-string"></a>
### `hashes` ∷ [String]

Specifies a dictionary of hashes for the contents of the url.

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)



<a id="source_name-medstring"></a>
### `source_name` ∷ MedString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is **required**


  * *MedString* String with at most 2048 characters

<a id="url-string"></a>
### `url` ∷ String

A URL reference to an external resource

* This entry is _optional_


  * A URI
