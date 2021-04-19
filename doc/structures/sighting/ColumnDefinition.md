<a id="map8"></a>
# *ColumnDefinition*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[name](#name-string)|String| |**Required**|
|[type](#type-columntypestring)|ColumnTypeString| |**Required**|
|[description](#description-markdownstring)|MarkdownString| |_Optional_|
|[required](#required-boolean)|Boolean|If true, the row entries for this column cannot contain nulls. Defaults to true|_Optional_|
|[short_description](#short_description-string)|String| |_Optional_|


<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

* This entry is _optional_


  * *Markdown* Markdown string with at most 5000 characters

<a id="name-string"></a>
### `name` ∷ String

* This entry is **required**



<a id="required-boolean"></a>
### `required` ∷ Boolean

If true, the row entries for this column cannot contain nulls. Defaults to true

* This entry is _optional_



<a id="short_description-string"></a>
### `short_description` ∷ String

* This entry is _optional_



<a id="type-columntypestring"></a>
### `type` ∷ ColumnTypeString

* This entry is **required**


  * Allowed values:
    * `"integer"`
    * `"markdown"`
    * `"number"`
    * `"observable"`
    * `"string"`
    * `"url"`
