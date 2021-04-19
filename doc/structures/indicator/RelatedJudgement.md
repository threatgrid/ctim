<a id="map10"></a>
# *RelatedJudgement*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[judgement_id](#judgement_id-string)|String| |**Required**|
|[confidence](#confidence-highmedlowstring)|HighMedLowString| |_Optional_|
|[relationship](#relationship-string)|String| |_Optional_|
|[source](#source-string)|String| |_Optional_|


<a id="confidence-highmedlowstring"></a>
### `confidence` ∷ HighMedLowString

* This entry is _optional_


  * Allowed values:
    * `"High"`
    * `"Info"`
    * `"Low"`
    * `"Medium"`
    * `"None"`
    * `"Unknown"`
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="judgement_id-string"></a>
### `judgement_id` ∷ String

* This entry is **required**


  * A URI leading to a judgement

<a id="relationship-string"></a>
### `relationship` ∷ String

* This entry is _optional_



<a id="source-string"></a>
### `source` ∷ String

* This entry is _optional_


