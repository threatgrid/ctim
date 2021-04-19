<a id="map2"></a>
# *ValidTime*

> Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#end_time-datetime)|DateTime|If end_time is not present, then the valid time position of the object does not have an upper bound.|_Optional_|
|[start_time](#start_time-datetime)|DateTime|If not present, the valid time position of the indicator does not have an upper bound|_Optional_|


<a id="end_time-datetime"></a>
### `end_time` ∷ DateTime

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is _optional_


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="start_time-datetime"></a>
### `start_time` ∷ DateTime

If not present, the valid time position of the indicator does not have an upper bound

* This entry is _optional_


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
