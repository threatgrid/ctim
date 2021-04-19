<a id="map59"></a>
# *JudgementSpecification*

*JudgementSpecification* An indicator based on a list of judgements.  If any of the Observables in it's judgements are encountered, than it may be matches against.  If there are any required judgements, they all must be matched in order for the indicator to be considered a match.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[judgements](#judgements-string)|[String]| |**Required**|
|[required_judgements](#required_judgements-relatedjudgementrelatedjudgementmdmap64)|[[*RelatedJudgement*](./RelatedJudgement.md#map64)]| |**Required**|
|[type](#type-judgementspecificationtypestring)|JudgementSpecificationTypeString| |**Required**|


<a id="judgements-string"></a>
### `judgements` ∷ [String]

* This entry is **required**
* This entry's type is sequential (allows zero or more values)


  * A URI leading to a judgement

<a id="required_judgements-relatedjudgementrelatedjudgementmdmap64"></a>
### `required_judgements` ∷ [[*RelatedJudgement*](./RelatedJudgement.md#map64)]

* This entry is **required**
* This entry's type is sequential (allows zero or more values)


<a id="type-judgementspecificationtypestring"></a>
### `type` ∷ JudgementSpecificationTypeString

* This entry is **required**


  * Must equal: `"Judgement"`
