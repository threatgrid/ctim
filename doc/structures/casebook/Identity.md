<a id="map126"></a>
# *Identity*

> Reference: [IdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/)

*Identity* Describes a person or an organization

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#description-markdownstring)|MarkdownString| |**Required**|
|[related_identities](#related_identities-relatedidentityrelatedidentitymdmap127)|[[*RelatedIdentity*](./RelatedIdentity.md#map127)]|Identifies other entity Identities related to this Identity|**Required**|


<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

* This entry is **required**


  * *Markdown* Markdown string with at most 5000 characters

<a id="related_identities-relatedidentityrelatedidentitymdmap127"></a>
### `related_identities` ∷ [[*RelatedIdentity*](./RelatedIdentity.md#map127)]

Identifies other entity Identities related to this Identity

* This entry is **required**
* This entry's type is sequential (allows zero or more values)

