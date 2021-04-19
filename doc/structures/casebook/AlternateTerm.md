<a id="map45"></a>
# *AlternateTerm*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[term](#term-shortstring)|ShortString|the actual alternate term|**Required**|
|[description](#description-markdownstring)|MarkdownString|provides context for the alternate term by which this weakness may be known.|_Optional_|


<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

provides context for the alternate term by which this weakness may be known.

* This entry is _optional_


  * *Markdown* Markdown string with at most 5000 characters

<a id="term-shortstring"></a>
### `term` ∷ ShortString

the actual alternate term

* This entry is **required**


  * *ShortString* String with at most 1024 characters
