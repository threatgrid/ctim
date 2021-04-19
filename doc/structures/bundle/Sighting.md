<a id="map15"></a>
# *Sighting*

> Reference: [SightingType](http://stixproject.github.io/data-model/1.2/indicator/SightingType/)

*Sighting* A single sighting of an [indicator](https://github.com/threatgrid/ctim/blob/subdoc/doc/structures/indicator/Indicator.md).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[confidence](#confidence-highmedlowstring)|HighMedLowString| |**Required**|
|[count](#count-integer)|Integer|The number of times the sighting was seen|**Required**|
|[id](#id-string)|String|Globally unique URI identifying this object.|**Required**|
|[observed_time](#observed_time-observedtimeobservedtimemdmap72)|[*ObservedTime*](./ObservedTime.md#map72)| |**Required**|
|[schema_version](#schema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#type-sightingtypeidentifierstring)|SightingTypeIdentifierString| |**Required**|
|[data](#data-sightingdatatablesightingdatatablemdmap73)|[*SightingDataTable*](./SightingDataTable.md#map73)|An embedded data table for the Sighting.|_Optional_|
|[description](#description-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#external_ids-string)|[String]| |_Optional_|
|[external_references](#external_references-externalreferenceexternalreferencemdmap71)|[[*ExternalReference*](./ExternalReference.md#map71)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[internal](#internal-boolean)|Boolean|Is it internal to our network|_Optional_|
|[language](#language-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[observables](#observables-observableobservablemdmap76)|[[*Observable*](./Observable.md#map76)]|The object(s) of interest|_Optional_|
|[relations](#relations-observedrelationobservedrelationmdmap77)|[[*ObservedRelation*](./ObservedRelation.md#map77)]|Provide any context we can about where the observable came from|_Optional_|
|[resolution](#resolution-resolutionstring)|ResolutionString| |_Optional_|
|[revision](#revision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[sensor](#sensor-sensorstring)|SensorString|The OpenC2 Actuator name that best fits the device that is creating this sighting (e.g. network.firewall)|_Optional_|
|[sensor_coordinates](#sensor_coordinates-sensorcoordinatessensorcoordinatesmdmap74)|[*SensorCoordinates*](./SensorCoordinates.md#map74)| |_Optional_|
|[severity](#severity-highmedlowstring)|HighMedLowString| |_Optional_|
|[short_description](#short_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#source-medstring)|MedString| |_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|
|[targets](#targets-identityspecificationidentityspecificationmdmap75)|[[*IdentitySpecification*](./IdentitySpecification.md#map75)]|The target device. Where the sighting came from.|_Optional_|
|[timestamp](#timestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#title-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#tlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<a id="confidence-highmedlowstring"></a>
### `confidence` ∷ HighMedLowString

* This entry is **required**


  * Allowed values:
    * `"High"`
    * `"Info"`
    * `"Low"`
    * `"Medium"`
    * `"None"`
    * `"Unknown"`
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="count-integer"></a>
### `count` ∷ Integer

The number of times the sighting was seen

* This entry is **required**


  * Zero, or a positive integer

<a id="data-sightingdatatablesightingdatatablemdmap73"></a>
### `data` ∷ [*SightingDataTable*](./SightingDataTable.md#map73)

An embedded data table for the Sighting.

* This entry is _optional_


<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

A description of object, which may be detailed.

* This entry is _optional_


  * *Markdown* Markdown string with at most 5000 characters

<a id="external_ids-string"></a>
### `external_ids` ∷ [String]

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)



<a id="external_references-externalreferenceexternalreferencemdmap71"></a>
### `external_references` ∷ [[*ExternalReference*](./ExternalReference.md#map71)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="id-string"></a>
### `id` ∷ String

Globally unique URI identifying this object.

* This entry is **required**


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](https://github.com/threatgrid/ctim/blob/subdoc/doc/structures/judgement/Judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="internal-boolean"></a>
### `internal` ∷ Boolean

Is it internal to our network

* This entry is _optional_



<a id="language-shortstring"></a>
### `language` ∷ ShortString

The human language this object is specified in.

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="observables-observableobservablemdmap76"></a>
### `observables` ∷ [[*Observable*](./Observable.md#map76)]

The object(s) of interest

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="observed_time-observedtimeobservedtimemdmap72"></a>
### `observed_time` ∷ [*ObservedTime*](./ObservedTime.md#map72)

* This entry is **required**


<a id="relations-observedrelationobservedrelationmdmap77"></a>
### `relations` ∷ [[*ObservedRelation*](./ObservedRelation.md#map77)]

Provide any context we can about where the observable came from

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="resolution-resolutionstring"></a>
### `resolution` ∷ ResolutionString

* This entry is _optional_


  * *Resolution* indicates if the sensor that is reporting the Sighting already took action on it, for instance a Firewall blocking the IP
  * Default: `"detected"`
  * Allowed values:
    * `"allowed"`
    * `"blocked"`
    * `"contained"`
    * `"detected"`

<a id="revision-integer"></a>
### `revision` ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is _optional_


  * Zero, or a positive integer

<a id="schema_version-string"></a>
### `schema_version` ∷ String

CTIM schema version for this entity

* This entry is **required**


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="sensor-sensorstring"></a>
### `sensor` ∷ SensorString

The OpenC2 Actuator name that best fits the device that is creating this sighting (e.g. network.firewall)

* This entry is _optional_


  * *Sensor* The sensor/actuator name that best fits a device

  * Allowed values:
    * `"endpoint"`
    * `"endpoint.digital-telephone-handset"`
    * `"endpoint.laptop"`
    * `"endpoint.pos-terminal"`
    * `"endpoint.printer"`
    * `"endpoint.sensor"`
    * `"endpoint.server"`
    * `"endpoint.smart-meter"`
    * `"endpoint.smart-phone"`
    * `"endpoint.tablet"`
    * `"endpoint.workstation"`
    * `"network"`
    * `"network.bridge"`
    * `"network.firewall"`
    * `"network.gateway"`
    * `"network.guard"`
    * `"network.hips"`
    * `"network.hub"`
    * `"network.ids"`
    * `"network.ips"`
    * `"network.modem"`
    * `"network.nic"`
    * `"network.proxy"`
    * `"network.router"`
    * `"network.security_manager"`
    * `"network.sense_making"`
    * `"network.sensor"`
    * `"network.switch"`
    * `"network.vpn"`
    * `"network.wap"`
    * `"process"`
    * `"process.aaa-server"`
    * `"process.anti-virus-scanner"`
    * `"process.connection-scanner"`
    * `"process.directory-service"`
    * `"process.dns-server"`
    * `"process.email-service"`
    * `"process.file-scanner"`
    * `"process.location-service"`
    * `"process.network-scanner"`
    * `"process.remediation-service"`
    * `"process.reputation-service"`
    * `"process.sandbox"`
    * `"process.virtualization-service"`
    * `"process.vulnerability-scanner"`

<a id="sensor_coordinates-sensorcoordinatessensorcoordinatesmdmap74"></a>
### `sensor_coordinates` ∷ [*SensorCoordinates*](./SensorCoordinates.md#map74)

* This entry is _optional_


<a id="severity-highmedlowstring"></a>
### `severity` ∷ HighMedLowString

* This entry is _optional_


  * Allowed values:
    * `"High"`
    * `"Info"`
    * `"Low"`
    * `"Medium"`
    * `"None"`
    * `"Unknown"`
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="short_description-medstring"></a>
### `short_description` ∷ MedString

A single line, short summary of the object.

* This entry is _optional_


  * *MedString* String with at most 2048 characters

<a id="source-medstring"></a>
### `source` ∷ MedString

* This entry is _optional_


  * *MedString* String with at most 2048 characters

<a id="source_uri-string"></a>
### `source_uri` ∷ String

* This entry is _optional_


  * A URI

<a id="targets-identityspecificationidentityspecificationmdmap75"></a>
### `targets` ∷ [[*IdentitySpecification*](./IdentitySpecification.md#map75)]

The target device. Where the sighting came from.

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="timestamp-datetime"></a>
### `timestamp` ∷ DateTime

The time this object was created at, or last modified.

* This entry is _optional_


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="title-shortstring"></a>
### `title` ∷ ShortString

A short title for this object, used as primary display and reference value

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="tlp-tlpstring"></a>
### `tlp` ∷ TLPString

Specification for how, and to whom, this object can be shared.

* This entry is _optional_


  * *TLP* TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: `"green"`
  * Allowed values:
    * `"amber"`
    * `"green"`
    * `"red"`
    * `"white"`

<a id="type-sightingtypeidentifierstring"></a>
### `type` ∷ SightingTypeIdentifierString

* This entry is **required**


  * Must equal: `"sighting"`
