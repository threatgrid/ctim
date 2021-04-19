<a id="map57"></a>
# *CompositeIndicatorExpression*

> Reference: [CompositeIndicatorExpressionType](http://stixproject.github.io/data-model/1.2/indicator/CompositeIndicatorExpressionType/)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[indicator_ids](#indicator_ids-string)|[String]| |**Required**|
|[operator](#operator-booleanoperatorstring)|BooleanOperatorString| |**Required**|


<a id="indicator_ids-string"></a>
### `indicator_ids` ∷ [String]

* This entry is **required**
* This entry's type is sequential (allows zero or more values)


  * A URI leading to an indicator

<a id="operator-booleanoperatorstring"></a>
### `operator` ∷ BooleanOperatorString

* This entry is **required**


  * Allowed values:
    * `"and"`
    * `"not"`
    * `"or"`
