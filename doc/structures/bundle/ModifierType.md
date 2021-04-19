<a id="map49"></a>
# *ModifierType*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[additional_properties](#additional_properties-additionalpropertiesadditionalpropertiesmdmap51)|[*AdditionalProperties*](./AdditionalProperties.md#map51)| |_Optional_|
|[delay](#delay-datetime)|DateTime| |_Optional_|
|[destination](#destination-string)|String| |_Optional_|
|[duration](#duration-datetime)|DateTime| |_Optional_|
|[frequency](#frequency-shortstring)|ShortString| |_Optional_|
|[id](#id-shortstring)|ShortString| |_Optional_|
|[location](#location-string)|String| |_Optional_|
|[method](#method-string)|[String]| |_Optional_|
|[option](#option-shortstring)|ShortString| |_Optional_|
|[response](#response-string)|String| |_Optional_|
|[search](#search-string)|String| |_Optional_|
|[source](#source-shortstring)|ShortString| |_Optional_|
|[time](#time-validtimevalidtimemdmap50)|[*ValidTime*](./ValidTime.md#map50)| |_Optional_|


<a id="additional_properties-additionalpropertiesadditionalpropertiesmdmap51"></a>
### `additional_properties` ∷ [*AdditionalProperties*](./AdditionalProperties.md#map51)

* This entry is _optional_


<a id="delay-datetime"></a>
### `delay` ∷ DateTime

* This entry is _optional_


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="destination-string"></a>
### `destination` ∷ String

* This entry is _optional_


  * Allowed values:
    * `"copy-to"`
    * `"modify-to"`
    * `"move-to"`
    * `"report-to"`
    * `"restore-point"`
    * `"save-to"`
    * `"set-to"`

<a id="duration-datetime"></a>
### `duration` ∷ DateTime

* This entry is _optional_


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="frequency-shortstring"></a>
### `frequency` ∷ ShortString

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="id-shortstring"></a>
### `id` ∷ ShortString

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="location-string"></a>
### `location` ∷ String

* This entry is _optional_


  * Allowed values:
    * `"internal"`
    * `"perimeter"`

<a id="method-string"></a>
### `method` ∷ [String]

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


  * Allowed values:
    * `"acl"`
    * `"authenticated"`
    * `"blackhole"`
    * `"blacklist"`
    * `"graceful"`
    * `"hibernate"`
    * `"honeypot"`
    * `"immediate"`
    * `"segmentation"`
    * `"spawn"`
    * `"suspend"`
    * `"unauthenticated"`
    * `"whitelist"`

<a id="option-shortstring"></a>
### `option` ∷ ShortString

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="response-string"></a>
### `response` ∷ String

* This entry is _optional_


  * Allowed values:
    * `"acknowledge"`
    * `"command-ref"`
    * `"query"`
    * `"status"`

<a id="search-string"></a>
### `search` ∷ String

* This entry is _optional_


  * Allowed values:
    * `"cve"`
    * `"patch"`
    * `"signature"`
    * `"vendor_bulletin"`

<a id="source-shortstring"></a>
### `source` ∷ ShortString

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="time-validtimevalidtimemdmap50"></a>
### `time` ∷ [*ValidTime*](./ValidTime.md#map50)

* This entry is _optional_

