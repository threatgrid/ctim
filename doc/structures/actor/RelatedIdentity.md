<a id="map4"></a>
# *RelatedIdentity*

> Reference: [RelatedIdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/)

*RelatedIdentity* Describes a related Identity

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[identity](#identity-string)|String|The reference (URI) of the related Identity object|**Required**|
|[confidence](#confidence-highmedlowstring)|HighMedLowString|Specifies the level of confidence in the assertion of the relationship between the two objects|_Optional_|
|[information_source](#information_source-string)|String|Specifies the source of the information about the relationship between the two components|_Optional_|
|[relationship](#relationship-string)|String| |_Optional_|


<a id="confidence-highmedlowstring"></a>
### `confidence` ∷ HighMedLowString

Specifies the level of confidence in the assertion of the relationship between the two objects

* This entry is _optional_


  * Allowed values:
    * `"High"`
    * `"Info"`
    * `"Low"`
    * `"Medium"`
    * `"None"`
    * `"Unknown"`
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="identity-string"></a>
### `identity` ∷ String

The reference (URI) of the related Identity object

* This entry is **required**


  * A URI

<a id="information_source-string"></a>
### `information_source` ∷ String

Specifies the source of the information about the relationship between the two components

* This entry is _optional_



<a id="relationship-string"></a>
### `relationship` ∷ String

* This entry is _optional_


