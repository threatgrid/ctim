<a id="map3"></a>
# *Activity*

> Reference: [ActivityType](http://stixproject.github.io/data-model/1.2/stixCommon/ActivityType/)

*Activity* What happend, when?

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[date_time](#date_time-datetime)|DateTime|Specifies the date and time at which the activity occured|**Required**|
|[description](#description-markdownstring)|MarkdownString|A description of the activity|**Required**|


<a id="date_time-datetime"></a>
### `date_time` ∷ DateTime

Specifies the date and time at which the activity occured

* This entry is **required**


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

A description of the activity

* This entry is **required**


  * *Markdown* Markdown string with at most 5000 characters
