<a id="top"></a>
# *Verdict*

*Verdict* A Verdict is chosen from all of the Judgements on that Observable which have not yet expired.  The highest priority Judgement becomes the active verdict.  If there is more than one Judgement with that priority, then Clean disposition has priority over all others, then Malicious disposition, and so on down to Unknown.

 The ID of a verdict is a a str of the form "observable.type:observable.value" for example, "ip:1.1.1.1"

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[disposition](#disposition-dispositionnumberinteger)|DispositionNumberInteger| |**Required**|
|[observable](#observable-observableobservablemdmap1)|[*Observable*](./Observable.md#map1)| |**Required**|
|[type](#type-verdicttypeidentifierstring)|VerdictTypeIdentifierString| |**Required**|
|[valid_time](#valid_time-validtimevalidtimemdmap2)|[*ValidTime*](./ValidTime.md#map2)| |**Required**|
|[disposition_name](#disposition_name-dispositionnamestring)|DispositionNameString|The disposition_name field is optional, but is intended to be shown to a user.  Applications must therefore remember the mapping of numbers to human words, as in: {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}|_Optional_|
|[judgement_id](#judgement_id-string)|String| |_Optional_|


<a id="disposition-dispositionnumberinteger"></a>
### `disposition` ∷ DispositionNumberInteger

* This entry is **required**


  * *DispositionNumber* Numeric verdict identifiers
  * Allowed values:
    * `1`
    * `2`
    * `3`
    * `4`
    * `5`

<a id="disposition_name-dispositionnamestring"></a>
### `disposition_name` ∷ DispositionNameString

The disposition_name field is optional, but is intended to be shown to a user.  Applications must therefore remember the mapping of numbers to human words, as in: {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}

* This entry is _optional_


  * *DispositionName* String verdict identifiers
  * Allowed values:
    * `"Clean"`
    * `"Common"`
    * `"Malicious"`
    * `"Suspicious"`
    * `"Unknown"`

<a id="judgement_id-string"></a>
### `judgement_id` ∷ String

* This entry is _optional_


  * A URI leading to a judgement

<a id="observable-observableobservablemdmap1"></a>
### `observable` ∷ [*Observable*](./Observable.md#map1)

* This entry is **required**


<a id="type-verdicttypeidentifierstring"></a>
### `type` ∷ VerdictTypeIdentifierString

* This entry is **required**


  * Must equal: `"verdict"`

<a id="valid_time-validtimevalidtimemdmap2"></a>
### `valid_time` ∷ [*ValidTime*](./ValidTime.md#map2)

* This entry is **required**

