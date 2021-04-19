<a id="map50"></a>
# *Note*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[note](#note-markdownstring)|MarkdownString| |**Required**|
|[type](#type-notetypestring)|NoteTypeString| |**Required**|


<a id="note-markdownstring"></a>
### `note` ∷ MarkdownString

* This entry is **required**


  * *Markdown* Markdown string with at most 5000 characters

<a id="type-notetypestring"></a>
### `type` ∷ NoteTypeString

* This entry is **required**


  * *NoteType* defines the different types of notes that can be associated with a weakness
  * Allowed values:
    * `"Applicable Platform"`
    * `"Maintenance"`
    * `"Relationship"`
    * `"Research Gap"`
    * `"Terminology"`
    * `"Theoretical"`
  * Reference: [NoteTypeEnumeration](https://cwe.mitre.org/documents/schema/#NoteTypeEnumeration)

