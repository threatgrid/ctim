<a id="map68"></a>
# *ObservedTime*

> Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#start_time-datetime)|DateTime|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|**Required**|
|[end_time](#end_time-datetime)|DateTime|If the observation was made over a period of time, than this field indicates the end of that period|_Optional_|


<a id="end_time-datetime"></a>
### `end_time` ∷ DateTime

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is _optional_


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="start_time-datetime"></a>
### `start_time` ∷ DateTime

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is **required**


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
