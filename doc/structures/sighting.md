<a id="top"></a>
# *Sighting* Object

*Sighting* A single sighting of an [indicator](indicator.md)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| |&#10003;|
|[count](#propertycount-integer)|Integer|The number of times the sighting was seen|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[observed_time](#propertyobserved_time-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-sightingtypeidentifierstring)|SightingTypeIdentifierString| |&#10003;|
|[context](#propertycontext-contextobject)|*Context* Object|Context including the event type that best fits the type of the sighting||
|[data](#propertydata-sightingdatatableobject)|*SightingDataTable* Object|An embedded data table for the Sighting.||
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[internal](#propertyinternal-boolean)|Boolean|Is it internal to our network||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[observables](#propertyobservables-observableobjectlist)|*Observable* Object List|The object(s) of interest||
|[relations](#propertyrelations-observedrelationobjectlist)|*ObservedRelation* Object List|Provide any context we can about where the observable came from||
|[resolution](#propertyresolution-resolutionstring)|ResolutionString| ||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[sensor](#propertysensor-sensorstring)|SensorString|The OpenC2 Actuator name that best fits the device that is creating this sighting (e.g. network.firewall)||
|[sensor_coordinates](#propertysensor_coordinates-sensorcoordinatesobject)|*SensorCoordinates* Object| ||
|[severity](#propertyseverity-severitystring)|SeverityString| ||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[targets](#propertytargets-identityspecificationobjectlist)|*IdentitySpecification* Object List|The target device. Where the sighting came from.||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [SightingType](http://stixproject.github.io/data-model/1.2/indicator/SightingType/)

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

* This entry is required


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertycontext-contextobject"></a>
## Property context ∷ *Context* Object

Context including the event type that best fits the type of the sighting

* This entry is optional


<a id="map8-ref"></a>
* *Context* Object Value
  * Details: [*Context* Object](#map8)

<a id="propertycount-integer"></a>
## Property count ∷ Integer

The number of times the sighting was seen

* This entry is required


  * Zero, or a positive integer

<a id="propertydata-sightingdatatableobject"></a>
## Property data ∷ *SightingDataTable* Object

An embedded data table for the Sighting.

* This entry is optional


<a id="map3-ref"></a>
* *SightingDataTable* Object Value
  * Details: [*SightingDataTable* Object](#map3)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map1-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map1)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyinternal-boolean"></a>
## Property internal ∷ Boolean

Is it internal to our network

* This entry is optional



<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyobservables-observableobjectlist"></a>
## Property observables ∷ *Observable* Object List

The object(s) of interest

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map6-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map6)

<a id="propertyobserved_time-observedtimeobject"></a>
## Property observed_time ∷ *ObservedTime* Object

* This entry is required


<a id="map2-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map2)

<a id="propertyrelations-observedrelationobjectlist"></a>
## Property relations ∷ *ObservedRelation* Object List

Provide any context we can about where the observable came from

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map7-ref"></a>
* *ObservedRelation* Object Value
  * Details: [*ObservedRelation* Object](#map7)

<a id="propertyresolution-resolutionstring"></a>
## Property resolution ∷ ResolutionString

* This entry is optional


  * *Resolution* indicates if the sensor that is reporting the Sighting already took action on it, for instance a Firewall blocking the IP
  * Default: detected
  * Allowed Values:
    * allowed
    * blocked
    * contained
    * detected

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertysensor-sensorstring"></a>
## Property sensor ∷ SensorString

The OpenC2 Actuator name that best fits the device that is creating this sighting (e.g. network.firewall)

* This entry is optional


  * *Sensor* The sensor/actuator name that best fits a device

  * Allowed Values:
    * endpoint
    * endpoint.digital-telephone-handset
    * endpoint.laptop
    * endpoint.pos-terminal
    * endpoint.printer
    * endpoint.sensor
    * endpoint.server
    * endpoint.smart-meter
    * endpoint.smart-phone
    * endpoint.tablet
    * endpoint.workstation
    * network
    * network.bridge
    * network.firewall
    * network.gateway
    * network.guard
    * network.hips
    * network.hub
    * network.ids
    * network.ips
    * network.modem
    * network.nic
    * network.proxy
    * network.router
    * network.security_manager
    * network.sense_making
    * network.sensor
    * network.switch
    * network.vpn
    * network.wap
    * process
    * process.aaa-server
    * process.anti-virus-scanner
    * process.connection-scanner
    * process.directory-service
    * process.dns-server
    * process.email-service
    * process.file-scanner
    * process.location-service
    * process.network-scanner
    * process.remediation-service
    * process.reputation-service
    * process.sandbox
    * process.virtualization-service
    * process.vulnerability-scanner

<a id="propertysensor_coordinates-sensorcoordinatesobject"></a>
## Property sensor_coordinates ∷ *SensorCoordinates* Object

* This entry is optional


<a id="map4-ref"></a>
* *SensorCoordinates* Object Value
  * Details: [*SensorCoordinates* Object](#map4)

<a id="propertyseverity-severitystring"></a>
## Property severity ∷ SeverityString

* This entry is optional


  * Allowed Values:
    * Critical
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytargets-identityspecificationobjectlist"></a>
## Property targets ∷ *IdentitySpecification* Object List

The target device. Where the sighting came from.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map5-ref"></a>
* *IdentitySpecification* Object Value
  * Details: [*IdentitySpecification* Object](#map5)

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

A short title for this object, used as primary display and reference value

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLPString

Specification for how, and to whom, this object can be shared.

* This entry is optional


  * *TLP* TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-sightingtypeidentifierstring"></a>
## Property type ∷ SightingTypeIdentifierString

* This entry is required


  * Must equal: "sighting"

<a id="map1"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map2"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map3"></a>
# *SightingDataTable* Object

*SightingDataTable* An embedded data table for sightings data.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[columns](#propertycolumns-columndefinitionobjectlist)|*ColumnDefinition* Object List|an ordered list of column definitions|&#10003;|
|[rows](#propertyrows-anythinglistlist)|Anything List|an ordered list of rows|&#10003;|
|[row_count](#propertyrow_count-integer)|Integer|The number of rows in the data table.||


<a id="propertycolumns-columndefinitionobjectlist"></a>
## Property columns ∷ *ColumnDefinition* Object List

an ordered list of column definitions

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map9-ref"></a>
* *ColumnDefinition* Object Value
  * Details: [*ColumnDefinition* Object](#map9)

<a id="propertyrow_count-integer"></a>
## Property row_count ∷ Integer

The number of rows in the data table.

* This entry is optional



<a id="propertyrows-anythinglistlist"></a>
## Property rows ∷ Anything List List

an ordered list of rows

* This entry is required
* This entry's type is sequential (allows zero or more values)



<a id="map9"></a>
# *ColumnDefinition* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[name](#propertyname-string)|String| |&#10003;|
|[type](#propertytype-columntypestring)|ColumnTypeString| |&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[required](#propertyrequired-boolean)|Boolean|If true, the row entries for this column cannot contain nulls. Defaults to true||
|[short_description](#propertyshort_description-string)|String| ||


<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyname-string"></a>
## Property name ∷ String

* This entry is required



<a id="propertyrequired-boolean"></a>
## Property required ∷ Boolean

If true, the row entries for this column cannot contain nulls. Defaults to true

* This entry is optional



<a id="propertyshort_description-string"></a>
## Property short_description ∷ String

* This entry is optional



<a id="propertytype-columntypestring"></a>
## Property type ∷ ColumnTypeString

* This entry is required


  * Allowed Values:
    * integer
    * markdown
    * number
    * observable
    * string
    * url

<a id="map4"></a>
# *SensorCoordinates* Object

*SensorCoordinates* Describes the device that made the sighting (sensor) and contains identifying observables for the sensor.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#propertyobservables-observableobjectlist)|*Observable* Object List| |&#10003;|
|[type](#propertytype-sensorstring)|SensorString| |&#10003;|
|[os](#propertyos-string)|String| ||


<a id="propertyobservables-observableobjectlist"></a>
## Property observables ∷ *Observable* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map10-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map10)

<a id="propertyos-string"></a>
## Property os ∷ String

* This entry is optional



<a id="propertytype-sensorstring"></a>
## Property type ∷ SensorString

* This entry is required


  * *Sensor* The sensor/actuator name that best fits a device

  * Allowed Values:
    * endpoint
    * endpoint.digital-telephone-handset
    * endpoint.laptop
    * endpoint.pos-terminal
    * endpoint.printer
    * endpoint.sensor
    * endpoint.server
    * endpoint.smart-meter
    * endpoint.smart-phone
    * endpoint.tablet
    * endpoint.workstation
    * network
    * network.bridge
    * network.firewall
    * network.gateway
    * network.guard
    * network.hips
    * network.hub
    * network.ids
    * network.ips
    * network.modem
    * network.nic
    * network.proxy
    * network.router
    * network.security_manager
    * network.sense_making
    * network.sensor
    * network.switch
    * network.vpn
    * network.wap
    * process
    * process.aaa-server
    * process.anti-virus-scanner
    * process.connection-scanner
    * process.directory-service
    * process.dns-server
    * process.email-service
    * process.file-scanner
    * process.location-service
    * process.network-scanner
    * process.remediation-service
    * process.reputation-service
    * process.sandbox
    * process.virtualization-service
    * process.vulnerability-scanner

<a id="map10"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
    * device
    * domain
    * email
    * email_messageid
    * email_subject
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * ms_machine_id
    * mutex
    * ngfw_id
    * ngfw_name
    * odns_identity
    * odns_identity_label
    * orbital_node_id
    * pki_serial
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * processor_id
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map5"></a>
# *IdentitySpecification* Object

*IdentitySpecification* Describes the target of the sighting and contains identifying observables for the target.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#propertyobservables-observableobjectlist)|*Observable* Object List| |&#10003;|
|[observed_time](#propertyobserved_time-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-sensorstring)|SensorString| |&#10003;|
|[os](#propertyos-string)|String| ||


<a id="propertyobservables-observableobjectlist"></a>
## Property observables ∷ *Observable* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map11-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map11)

<a id="propertyobserved_time-observedtimeobject"></a>
## Property observed_time ∷ *ObservedTime* Object

* This entry is required


<a id="map12-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map12)

<a id="propertyos-string"></a>
## Property os ∷ String

* This entry is optional



<a id="propertytype-sensorstring"></a>
## Property type ∷ SensorString

* This entry is required


  * *Sensor* The sensor/actuator name that best fits a device

  * Allowed Values:
    * endpoint
    * endpoint.digital-telephone-handset
    * endpoint.laptop
    * endpoint.pos-terminal
    * endpoint.printer
    * endpoint.sensor
    * endpoint.server
    * endpoint.smart-meter
    * endpoint.smart-phone
    * endpoint.tablet
    * endpoint.workstation
    * network
    * network.bridge
    * network.firewall
    * network.gateway
    * network.guard
    * network.hips
    * network.hub
    * network.ids
    * network.ips
    * network.modem
    * network.nic
    * network.proxy
    * network.router
    * network.security_manager
    * network.sense_making
    * network.sensor
    * network.switch
    * network.vpn
    * network.wap
    * process
    * process.aaa-server
    * process.anti-virus-scanner
    * process.connection-scanner
    * process.directory-service
    * process.dns-server
    * process.email-service
    * process.file-scanner
    * process.location-service
    * process.network-scanner
    * process.remediation-service
    * process.reputation-service
    * process.sandbox
    * process.virtualization-service
    * process.vulnerability-scanner

<a id="map12"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map11"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
    * device
    * domain
    * email
    * email_messageid
    * email_subject
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * ms_machine_id
    * mutex
    * ngfw_id
    * ngfw_name
    * odns_identity
    * odns_identity_label
    * orbital_node_id
    * pki_serial
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * processor_id
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map6"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
    * device
    * domain
    * email
    * email_messageid
    * email_subject
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * ms_machine_id
    * mutex
    * ngfw_id
    * ngfw_name
    * odns_identity
    * odns_identity_label
    * orbital_node_id
    * pki_serial
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * processor_id
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map7"></a>
# *ObservedRelation* Object

*ObservedRelation* A relation inside a Sighting.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[origin](#propertyorigin-string)|String| |&#10003;|
|[related](#propertyrelated-observableobject)|*Observable* Object| |&#10003;|
|[relation](#propertyrelation-observablerelationtypestring)|ObservableRelationTypeString| |&#10003;|
|[source](#propertysource-observableobject)|*Observable* Object| |&#10003;|
|[origin_uri](#propertyorigin_uri-string)|String| ||
|[relation_info](#propertyrelation_info-object)|Object| ||


<a id="propertyorigin-string"></a>
## Property origin ∷ String

* This entry is required



<a id="propertyorigin_uri-string"></a>
## Property origin_uri ∷ String

* This entry is optional


  * A URI

<a id="propertyrelated-observableobject"></a>
## Property related ∷ *Observable* Object

* This entry is required


<a id="map15-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map15)

<a id="propertyrelation-observablerelationtypestring"></a>
## Property relation ∷ ObservableRelationTypeString

* This entry is required


  * Allowed Values:
    * Allocated
    * Allocated_By
    * Attached_To
    * Bound
    * Bound_By
    * Characterized_By
    * Characterizes
    * Child_Of
    * Closed
    * Closed_By
    * Compressed
    * Compressed_By
    * Compressed_From
    * Compressed_Into
    * Connected_From
    * Connected_To
    * Contained_Within
    * Contains
    * Copied
    * Copied_By
    * Copied_From
    * Copied_To
    * Created
    * Created_By
    * Decoded
    * Decoded_By
    * Decompressed
    * Decompressed_By
    * Decrypted
    * Decrypted_By
    * Deleted
    * Deleted_By
    * Deleted_From
    * Downloaded
    * Downloaded_By
    * Downloaded_From
    * Downloaded_To
    * Dropped
    * Dropped_By
    * Encoded
    * Encoded_By
    * Encrypted
    * Encrypted_By
    * Encrypted_From
    * Encrypted_To
    * Extracted_From
    * FQDN_Of
    * Freed
    * Freed_By
    * Hooked
    * Hooked_By
    * Initialized_By
    * Initialized_To
    * Injected
    * Injected_As
    * Injected_By
    * Injected_Into
    * Installed
    * Installed_By
    * Joined
    * Joined_By
    * Killed
    * Killed_By
    * Listened_On
    * Listened_On_By
    * Loaded_From
    * Loaded_Into
    * Locked
    * Locked_By
    * Mapped_By
    * Mapped_Into
    * Merged
    * Merged_By
    * Modified_Properties_Of
    * Monitored
    * Monitored_By
    * Moved
    * Moved_By
    * Moved_From
    * Moved_To
    * Opened
    * Opened_By
    * Packed
    * Packed_By
    * Packed_From
    * Packed_Into
    * Parent_Of
    * Paused
    * Paused_By
    * Previously_Contained
    * Properties_Modified_By
    * Properties_Queried
    * Properties_Queried_By
    * Read_From
    * Read_From_By
    * Received
    * Received_By
    * Received_From
    * Received_Via_Upload
    * Redirects_To
    * Refers_To
    * Related_To
    * Renamed
    * Renamed_By
    * Renamed_From
    * Renamed_To
    * Resolved_To
    * Resumed
    * Resumed_By
    * Root_Domain_Of
    * Searched_For
    * Searched_For_By
    * Sent
    * Sent_By
    * Sent_To
    * Sent_Via_Upload
    * Set_From
    * Set_To
    * Sub-domain_Of
    * Supra-domain_Of
    * Suspended
    * Suspended_By
    * Unhooked
    * Unhooked_By
    * Unlocked
    * Unlocked_By
    * Unpacked
    * Unpacked_By
    * Uploaded
    * Uploaded_By
    * Uploaded_From
    * Uploaded_To
    * Used
    * Used_By
    * Values_Enumerated
    * Values_Enumerated_By
    * Written_To_By
    * Wrote_To

<a id="propertyrelation_info-object"></a>
## Property relation_info ∷ Object

* This entry is optional


<a id="map13-ref"></a>
* Object Value
  * Details: [Object](#map13)

<a id="propertysource-observableobject"></a>
## Property source ∷ *Observable* Object

* This entry is required


<a id="map14-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map14)

<a id="map15"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
    * device
    * domain
    * email
    * email_messageid
    * email_subject
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * ms_machine_id
    * mutex
    * ngfw_id
    * ngfw_name
    * odns_identity
    * odns_identity_label
    * orbital_node_id
    * pki_serial
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * processor_id
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map14"></a>
# *Observable* Object

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifierString| |&#10003;|
|[value](#propertyvalue-string)|String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifierString

* This entry is required


  * *ObservableTypeIdentifier* Observable type names
  * Allowed Values:
    * amp_computer_guid
    * certificate_common_name
    * certificate_issuer
    * certificate_serial
    * cisco_cm_id
    * cisco_mid
    * cisco_uc_id
    * crowdstrike_id
    * cybereason_id
    * device
    * domain
    * email
    * email_messageid
    * email_subject
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * ms_machine_id
    * mutex
    * ngfw_id
    * ngfw_name
    * odns_identity
    * odns_identity_label
    * orbital_node_id
    * pki_serial
    * process_args
    * process_hash
    * process_name
    * process_path
    * process_username
    * processor_id
    * registry_key
    * registry_name
    * registry_path
    * s1_agent_id
    * serial_number
    * sha1
    * sha256
    * swc_device_id
    * trend_micro_id
    * url
    * user
    * user_agent

<a id="propertyvalue-string"></a>
## Property value ∷ String

* This entry is required



<a id="map13"></a>
# Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[Keyword](#propertykeyword-anything)|Anything| |&#10003;|


<a id="propertykeyword-anything"></a>
## Property Keyword ∷ Anything

* This entry is required



<a id="map8"></a>
# *Context* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[file_create_events](#propertyfile_create_events-filecreatetypeobjectlist)|*FileCreateType* Object List|a list of `FileCreateType`||
|[file_delete_events](#propertyfile_delete_events-filedeletetypeobjectlist)|*FileDeleteType* Object List|a list of `FileDeleteType`||
|[file_modify_events](#propertyfile_modify_events-filemodifytypeobjectlist)|*FileModifyType* Object List|a list of `FileModifyType`||
|[file_move_events](#propertyfile_move_events-filemovetypeobjectlist)|*FileMoveType* Object List|a list of `FileMoveType`||
|[http_events](#propertyhttp_events-httptypeobjectlist)|*HTTPType* Object List|a list of `HTTPType`||
|[library_load_events](#propertylibrary_load_events-libraryloadtypeobjectlist)|*LibraryLoadType* Object List|a list of `LibraryLoadType`||
|[netflow_events](#propertynetflow_events-netflowtypeobjectlist)|*NetflowType* Object List|a list of `NetflowType`||
|[process_create_events](#propertyprocess_create_events-processcreatetypeobjectlist)|*ProcessCreateType* Object List|a list of `ProcessCreate`||
|[registry_create_events](#propertyregistry_create_events-registrycreatetypeobjectlist)|*RegistryCreateType* Object List|a list of `RegistryCreateType`||
|[registry_delete_events](#propertyregistry_delete_events-registrydeletetypeobjectlist)|*RegistryDeleteType* Object List|a list of `RegistryDeleteType`||
|[registry_rename_events](#propertyregistry_rename_events-registryrenametypeobjectlist)|*RegistryRenameType* Object List|a list of `RegistryRenameType`||
|[registry_set_events](#propertyregistry_set_events-registrysettypeobjectlist)|*RegistrySetType* Object List|a list of `RegistrySetType`||


<a id="propertyfile_create_events-filecreatetypeobjectlist"></a>
## Property file_create_events ∷ *FileCreateType* Object List

a list of `FileCreateType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map18-ref"></a>
* *FileCreateType* Object Value
  * Details: [*FileCreateType* Object](#map18)

<a id="propertyfile_delete_events-filedeletetypeobjectlist"></a>
## Property file_delete_events ∷ *FileDeleteType* Object List

a list of `FileDeleteType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map19-ref"></a>
* *FileDeleteType* Object Value
  * Details: [*FileDeleteType* Object](#map19)

<a id="propertyfile_modify_events-filemodifytypeobjectlist"></a>
## Property file_modify_events ∷ *FileModifyType* Object List

a list of `FileModifyType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map20-ref"></a>
* *FileModifyType* Object Value
  * Details: [*FileModifyType* Object](#map20)

<a id="propertyfile_move_events-filemovetypeobjectlist"></a>
## Property file_move_events ∷ *FileMoveType* Object List

a list of `FileMoveType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map21-ref"></a>
* *FileMoveType* Object Value
  * Details: [*FileMoveType* Object](#map21)

<a id="propertyhttp_events-httptypeobjectlist"></a>
## Property http_events ∷ *HTTPType* Object List

a list of `HTTPType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map23-ref"></a>
* *HTTPType* Object Value
  * Details: [*HTTPType* Object](#map23)

<a id="propertylibrary_load_events-libraryloadtypeobjectlist"></a>
## Property library_load_events ∷ *LibraryLoadType* Object List

a list of `LibraryLoadType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map17-ref"></a>
* *LibraryLoadType* Object Value
  * Details: [*LibraryLoadType* Object](#map17)

<a id="propertynetflow_events-netflowtypeobjectlist"></a>
## Property netflow_events ∷ *NetflowType* Object List

a list of `NetflowType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map22-ref"></a>
* *NetflowType* Object Value
  * Details: [*NetflowType* Object](#map22)

<a id="propertyprocess_create_events-processcreatetypeobjectlist"></a>
## Property process_create_events ∷ *ProcessCreateType* Object List

a list of `ProcessCreate`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map16-ref"></a>
* *ProcessCreateType* Object Value
  * Details: [*ProcessCreateType* Object](#map16)

<a id="propertyregistry_create_events-registrycreatetypeobjectlist"></a>
## Property registry_create_events ∷ *RegistryCreateType* Object List

a list of `RegistryCreateType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map24-ref"></a>
* *RegistryCreateType* Object Value
  * Details: [*RegistryCreateType* Object](#map24)

<a id="propertyregistry_delete_events-registrydeletetypeobjectlist"></a>
## Property registry_delete_events ∷ *RegistryDeleteType* Object List

a list of `RegistryDeleteType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map26-ref"></a>
* *RegistryDeleteType* Object Value
  * Details: [*RegistryDeleteType* Object](#map26)

<a id="propertyregistry_rename_events-registryrenametypeobjectlist"></a>
## Property registry_rename_events ∷ *RegistryRenameType* Object List

a list of `RegistryRenameType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map27-ref"></a>
* *RegistryRenameType* Object Value
  * Details: [*RegistryRenameType* Object](#map27)

<a id="propertyregistry_set_events-registrysettypeobjectlist"></a>
## Property registry_set_events ∷ *RegistrySetType* Object List

a list of `RegistrySetType`

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map25-ref"></a>
* *RegistrySetType* Object Value
  * Details: [*RegistrySetType* Object](#map25)

<a id="map27"></a>
# *RegistryRenameType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[registry_key](#propertyregistry_key-shortstringstring)|ShortStringString| |&#10003;|
|[registry_old_key](#propertyregistry_old_key-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-registryrenametypeidentifierstring)|RegistryRenameTypeIdentifierString| |&#10003;|
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_key-shortstringstring"></a>
## Property registry_key ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_old_key-shortstringstring"></a>
## Property registry_old_key ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map28-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map28)

<a id="propertytype-registryrenametypeidentifierstring"></a>
## Property type ∷ RegistryRenameTypeIdentifierString

* This entry is required


  * Must equal: "RegistryRenameEvent"

<a id="map28"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map26"></a>
# *RegistryDeleteType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[registry_key](#propertyregistry_key-shortstringstring)|ShortStringString| |&#10003;|
|[registry_value](#propertyregistry_value-medstringstring)|MedStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-registrydeletetypeidentifierstring)|RegistryDeleteTypeIdentifierString| |&#10003;|
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_key-shortstringstring"></a>
## Property registry_key ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_value-medstringstring"></a>
## Property registry_value ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map29-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map29)

<a id="propertytype-registrydeletetypeidentifierstring"></a>
## Property type ∷ RegistryDeleteTypeIdentifierString

* This entry is required


  * Must equal: "RegistryDeleteEvent"

<a id="map29"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map25"></a>
# *RegistrySetType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[registry_data](#propertyregistry_data-longstringstring)|LongStringString| |&#10003;|
|[registry_key](#propertyregistry_key-shortstringstring)|ShortStringString| |&#10003;|
|[registry_value](#propertyregistry_value-medstringstring)|MedStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-registrysettypeidentifierstring)|RegistrySetTypeIdentifierString| |&#10003;|
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||
|[registry_data_length](#propertyregistry_data_length-integer)|Integer| ||


<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_data-longstringstring"></a>
## Property registry_data ∷ LongStringString

* This entry is required


  * *LongString* String with at most 5000 characters

<a id="propertyregistry_data_length-integer"></a>
## Property registry_data_length ∷ Integer

* This entry is optional



<a id="propertyregistry_key-shortstringstring"></a>
## Property registry_key ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_value-medstringstring"></a>
## Property registry_value ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map30-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map30)

<a id="propertytype-registrysettypeidentifierstring"></a>
## Property type ∷ RegistrySetTypeIdentifierString

* This entry is required


  * Must equal: "RegistrySetEvent"

<a id="map30"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map24"></a>
# *RegistryCreateType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[registry_key](#propertyregistry_key-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-registrycreatetypeidentifierstring)|RegistryCreateTypeIdentifierString| |&#10003;|
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyregistry_key-shortstringstring"></a>
## Property registry_key ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map31-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map31)

<a id="propertytype-registrycreatetypeidentifierstring"></a>
## Property type ∷ RegistryCreateTypeIdentifierString

* This entry is required


  * Must equal: "RegistryCreateEvent"

<a id="map31"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map23"></a>
# *HTTPType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[host](#propertyhost-shortstringstring)|ShortStringString| |&#10003;|
|[method](#propertymethod-httpmethodstring)|HTTPMethodString| |&#10003;|
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[traffic](#propertytraffic-trafficobject)|*Traffic* Object| |&#10003;|
|[type](#propertytype-httptypeidentifierstring)|HTTPTypeIdentifierString| |&#10003;|
|[encrypted](#propertyencrypted-boolean)|Boolean| ||
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||
|[query](#propertyquery-longstringstring)|LongStringString| ||
|[url_port](#propertyurl_port-integer)|Integer| ||


<a id="propertyencrypted-boolean"></a>
## Property encrypted ∷ Boolean

* This entry is optional



<a id="propertyhost-shortstringstring"></a>
## Property host ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertymethod-httpmethodstring"></a>
## Property method ∷ HTTPMethodString

* This entry is required


  * Allowed Values:
    * CONNECT
    * GET
    * HEAD
    * OPTIONS
    * PATCH
    * POST
    * PUT
    * TRACE

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyquery-longstringstring"></a>
## Property query ∷ LongStringString

* This entry is optional


  * *LongString* String with at most 5000 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map32-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map32)

<a id="propertytraffic-trafficobject"></a>
## Property traffic ∷ *Traffic* Object

* This entry is required


<a id="map33-ref"></a>
* *Traffic* Object Value
  * Details: [*Traffic* Object](#map33)

<a id="propertytype-httptypeidentifierstring"></a>
## Property type ∷ HTTPTypeIdentifierString

* This entry is required


  * Must equal: "HTTPEvent"

<a id="propertyurl_port-integer"></a>
## Property url_port ∷ Integer

* This entry is optional



<a id="map33"></a>
# *Traffic* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[destination_ip](#propertydestination_ip-string)|String| |&#10003;|
|[destination_port](#propertydestination_port-integer)|Integer| |&#10003;|
|[direction](#propertydirection-trafficdirectionstring)|TrafficDirectionString| |&#10003;|
|[protocol](#propertyprotocol-integer)|Integer|The IP [protocol id](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)|&#10003;|
|[source_ip](#propertysource_ip-string)|String| |&#10003;|
|[source_port](#propertysource_port-integer)|Integer| |&#10003;|
|[destination_host_name](#propertydestination_host_name-string)|String| ||
|[destination_subnet](#propertydestination_subnet-string)|String| ||
|[source_subnet](#propertysource_subnet-string)|String| ||


<a id="propertydestination_host_name-string"></a>
## Property destination_host_name ∷ String

* This entry is optional



<a id="propertydestination_ip-string"></a>
## Property destination_ip ∷ String

* This entry is required



<a id="propertydestination_port-integer"></a>
## Property destination_port ∷ Integer

* This entry is required



<a id="propertydestination_subnet-string"></a>
## Property destination_subnet ∷ String

* This entry is optional



<a id="propertydirection-trafficdirectionstring"></a>
## Property direction ∷ TrafficDirectionString

* This entry is required


  * Allowed Values:
    * incoming
    * outgoing

<a id="propertyprotocol-integer"></a>
## Property protocol ∷ Integer

The IP [protocol id](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)

* This entry is required



<a id="propertysource_ip-string"></a>
## Property source_ip ∷ String

* This entry is required



<a id="propertysource_port-integer"></a>
## Property source_port ∷ Integer

* This entry is required



<a id="propertysource_subnet-string"></a>
## Property source_subnet ∷ String

* This entry is optional



<a id="map32"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map22"></a>
# *NetflowType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[traffic](#propertytraffic-trafficobject)|*Traffic* Object| |&#10003;|
|[type](#propertytype-netflowtypeidentifierstring)|NetflowTypeIdentifierString| |&#10003;|
|[byte_count_in](#propertybyte_count_in-integer)|Integer| ||
|[byte_count_out](#propertybyte_count_out-integer)|Integer| ||
|[flow_time](#propertyflow_time-instdate)|Inst (Date)| ||
|[parent_process_account](#propertyparent_process_account-shortstringstring)|ShortStringString| ||
|[parent_process_account_type](#propertyparent_process_account_type-shortstringstring)|ShortStringString| ||
|[parent_process_args](#propertyparent_process_args-shortstringstring)|ShortStringString| ||
|[parent_process_hash](#propertyparent_process_hash-shortstringstring)|ShortStringString| ||
|[parent_process_id](#propertyparent_process_id-integer)|Integer| ||
|[parent_process_name](#propertyparent_process_name-shortstringstring)|ShortStringString| ||
|[parent_process_path](#propertyparent_process_path-shortstringstring)|ShortStringString| ||
|[process_account](#propertyprocess_account-shortstringstring)|ShortStringString| ||
|[process_account_type](#propertyprocess_account_type-shortstringstring)|ShortStringString| ||
|[process_args](#propertyprocess_args-shortstringstring)|ShortStringString| ||
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_hash](#propertyprocess_hash-shortstringstring)|ShortStringString| ||
|[process_path](#propertyprocess_path-shortstringstring)|ShortStringString| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertybyte_count_in-integer"></a>
## Property byte_count_in ∷ Integer

* This entry is optional



<a id="propertybyte_count_out-integer"></a>
## Property byte_count_out ∷ Integer

* This entry is optional



<a id="propertyflow_time-instdate"></a>
## Property flow_time ∷ Inst (Date)

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyparent_process_account-shortstringstring"></a>
## Property parent_process_account ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_account_type-shortstringstring"></a>
## Property parent_process_account_type ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_args-shortstringstring"></a>
## Property parent_process_args ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_hash-shortstringstring"></a>
## Property parent_process_hash ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_id-integer"></a>
## Property parent_process_id ∷ Integer

* This entry is optional



<a id="propertyparent_process_name-shortstringstring"></a>
## Property parent_process_name ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_path-shortstringstring"></a>
## Property parent_process_path ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_account-shortstringstring"></a>
## Property process_account ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_account_type-shortstringstring"></a>
## Property process_account_type ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_args-shortstringstring"></a>
## Property process_args ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_hash-shortstringstring"></a>
## Property process_hash ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_path-shortstringstring"></a>
## Property process_path ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map34-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map34)

<a id="propertytraffic-trafficobject"></a>
## Property traffic ∷ *Traffic* Object

* This entry is required


<a id="map35-ref"></a>
* *Traffic* Object Value
  * Details: [*Traffic* Object](#map35)

<a id="propertytype-netflowtypeidentifierstring"></a>
## Property type ∷ NetflowTypeIdentifierString

* This entry is required


  * Must equal: "NetflowEvent"

<a id="map35"></a>
# *Traffic* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[destination_ip](#propertydestination_ip-string)|String| |&#10003;|
|[destination_port](#propertydestination_port-integer)|Integer| |&#10003;|
|[direction](#propertydirection-trafficdirectionstring)|TrafficDirectionString| |&#10003;|
|[protocol](#propertyprotocol-integer)|Integer|The IP [protocol id](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)|&#10003;|
|[source_ip](#propertysource_ip-string)|String| |&#10003;|
|[source_port](#propertysource_port-integer)|Integer| |&#10003;|
|[destination_host_name](#propertydestination_host_name-string)|String| ||
|[destination_subnet](#propertydestination_subnet-string)|String| ||
|[source_subnet](#propertysource_subnet-string)|String| ||


<a id="propertydestination_host_name-string"></a>
## Property destination_host_name ∷ String

* This entry is optional



<a id="propertydestination_ip-string"></a>
## Property destination_ip ∷ String

* This entry is required



<a id="propertydestination_port-integer"></a>
## Property destination_port ∷ Integer

* This entry is required



<a id="propertydestination_subnet-string"></a>
## Property destination_subnet ∷ String

* This entry is optional



<a id="propertydirection-trafficdirectionstring"></a>
## Property direction ∷ TrafficDirectionString

* This entry is required


  * Allowed Values:
    * incoming
    * outgoing

<a id="propertyprotocol-integer"></a>
## Property protocol ∷ Integer

The IP [protocol id](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)

* This entry is required



<a id="propertysource_ip-string"></a>
## Property source_ip ∷ String

* This entry is required



<a id="propertysource_port-integer"></a>
## Property source_port ∷ Integer

* This entry is required



<a id="propertysource_subnet-string"></a>
## Property source_subnet ∷ String

* This entry is optional



<a id="map34"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map21"></a>
# *FileMoveType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[file_name](#propertyfile_name-shortstringstring)|ShortStringString| |&#10003;|
|[file_path](#propertyfile_path-medstringstring)|MedStringString| |&#10003;|
|[new_name](#propertynew_name-shortstringstring)|ShortStringString| |&#10003;|
|[old_name](#propertyold_name-shortstringstring)|ShortStringString| |&#10003;|
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-filemovetypeidentifierstring)|FileMoveTypeIdentifierString| |&#10003;|
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyfile_name-shortstringstring"></a>
## Property file_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyfile_path-medstringstring"></a>
## Property file_path ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertynew_name-shortstringstring"></a>
## Property new_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyold_name-shortstringstring"></a>
## Property old_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map36-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map36)

<a id="propertytype-filemovetypeidentifierstring"></a>
## Property type ∷ FileMoveTypeIdentifierString

* This entry is required


  * Must equal: "FileMoveEvent"

<a id="map36"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map20"></a>
# *FileModifyType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[file_name](#propertyfile_name-shortstringstring)|ShortStringString| |&#10003;|
|[file_path](#propertyfile_path-medstringstring)|MedStringString| |&#10003;|
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-filemodifytypeidentifierstring)|FileModifyTypeIdentifierString| |&#10003;|
|[failed](#propertyfailed-boolean)|Boolean| ||
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyfailed-boolean"></a>
## Property failed ∷ Boolean

* This entry is optional



<a id="propertyfile_name-shortstringstring"></a>
## Property file_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyfile_path-medstringstring"></a>
## Property file_path ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map37-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map37)

<a id="propertytype-filemodifytypeidentifierstring"></a>
## Property type ∷ FileModifyTypeIdentifierString

* This entry is required


  * Must equal: "FileModifyEvent"

<a id="map37"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map19"></a>
# *FileDeleteType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[file_name](#propertyfile_name-shortstringstring)|ShortStringString| |&#10003;|
|[file_path](#propertyfile_path-medstringstring)|MedStringString| |&#10003;|
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-filedeletetypeidentifierstring)|FileDeleteTypeIdentifierString| |&#10003;|
|[failed](#propertyfailed-boolean)|Boolean| ||
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyfailed-boolean"></a>
## Property failed ∷ Boolean

* This entry is optional



<a id="propertyfile_name-shortstringstring"></a>
## Property file_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyfile_path-medstringstring"></a>
## Property file_path ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map38-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map38)

<a id="propertytype-filedeletetypeidentifierstring"></a>
## Property type ∷ FileDeleteTypeIdentifierString

* This entry is required


  * Must equal: "FileDeleteEvent"

<a id="map38"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map18"></a>
# *FileCreateType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[file_name](#propertyfile_name-shortstringstring)|ShortStringString| |&#10003;|
|[file_path](#propertyfile_path-medstringstring)|MedStringString| |&#10003;|
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-filecreatetypeidentifierstring)|FileCreateTypeIdentifierString| |&#10003;|
|[failed](#propertyfailed-boolean)|Boolean| ||
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyfailed-boolean"></a>
## Property failed ∷ Boolean

* This entry is optional



<a id="propertyfile_name-shortstringstring"></a>
## Property file_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyfile_path-medstringstring"></a>
## Property file_path ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map39-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map39)

<a id="propertytype-filecreatetypeidentifierstring"></a>
## Property type ∷ FileCreateTypeIdentifierString

* This entry is required


  * Must equal: "FileCreateEvent"

<a id="map39"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map17"></a>
# *LibraryLoadType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[dll_library_name](#propertydll_library_name-shortstringstring)|ShortStringString| |&#10003;|
|[dll_library_path](#propertydll_library_path-medstringstring)|MedStringString| |&#10003;|
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-libraryloadtypeidentifierstring)|LibraryLoadTypeIdentifierString| |&#10003;|
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertydll_library_name-shortstringstring"></a>
## Property dll_library_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertydll_library_path-medstringstring"></a>
## Property dll_library_path ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map40-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map40)

<a id="propertytype-libraryloadtypeidentifierstring"></a>
## Property type ∷ LibraryLoadTypeIdentifierString

* This entry is required


  * Must equal: "LibraryLoadEvent"

<a id="map40"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map16"></a>
# *ProcessCreateType* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[process_id](#propertyprocess_id-integer)|Integer| |&#10003;|
|[process_name](#propertyprocess_name-shortstringstring)|ShortStringString| |&#10003;|
|[time](#propertytime-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-processcreatetypeidentifierstring)|ProcessCreateTypeIdentifierString| |&#10003;|
|[parent_creation_time](#propertyparent_creation_time-instdate)|Inst (Date)| ||
|[parent_process_args](#propertyparent_process_args-medstringstring)|MedStringString| ||
|[parent_process_disposition](#propertyparent_process_disposition-shortstringstring)|ShortStringString| ||
|[parent_process_guid](#propertyparent_process_guid-integer)|Integer| ||
|[parent_process_hash](#propertyparent_process_hash-medstringstring)|MedStringString| ||
|[parent_process_id](#propertyparent_process_id-integer)|Integer| ||
|[parent_process_name](#propertyparent_process_name-shortstringstring)|ShortStringString| ||
|[parent_process_size](#propertyparent_process_size-integer)|Integer| ||
|[parent_process_username](#propertyparent_process_username-shortstringstring)|ShortStringString| ||
|[process_args](#propertyprocess_args-medstringstring)|MedStringString| ||
|[process_disposition](#propertyprocess_disposition-shortstringstring)|ShortStringString| ||
|[process_guid](#propertyprocess_guid-integer)|Integer| ||
|[process_hash](#propertyprocess_hash-medstringstring)|MedStringString| ||
|[process_size](#propertyprocess_size-integer)|Integer| ||
|[process_username](#propertyprocess_username-shortstringstring)|ShortStringString| ||


<a id="propertyparent_creation_time-instdate"></a>
## Property parent_creation_time ∷ Inst (Date)

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertyparent_process_args-medstringstring"></a>
## Property parent_process_args ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertyparent_process_disposition-shortstringstring"></a>
## Property parent_process_disposition ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_guid-integer"></a>
## Property parent_process_guid ∷ Integer

* This entry is optional



<a id="propertyparent_process_hash-medstringstring"></a>
## Property parent_process_hash ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertyparent_process_id-integer"></a>
## Property parent_process_id ∷ Integer

* This entry is optional



<a id="propertyparent_process_name-shortstringstring"></a>
## Property parent_process_name ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyparent_process_size-integer"></a>
## Property parent_process_size ∷ Integer

* This entry is optional



<a id="propertyparent_process_username-shortstringstring"></a>
## Property parent_process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_args-medstringstring"></a>
## Property process_args ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertyprocess_disposition-shortstringstring"></a>
## Property process_disposition ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_guid-integer"></a>
## Property process_guid ∷ Integer

* This entry is optional



<a id="propertyprocess_hash-medstringstring"></a>
## Property process_hash ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertyprocess_id-integer"></a>
## Property process_id ∷ Integer

* This entry is required



<a id="propertyprocess_name-shortstringstring"></a>
## Property process_name ∷ ShortStringString

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertyprocess_size-integer"></a>
## Property process_size ∷ Integer

* This entry is optional



<a id="propertyprocess_username-shortstringstring"></a>
## Property process_username ∷ ShortStringString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytime-observedtimeobject"></a>
## Property time ∷ *ObservedTime* Object

* This entry is required


<a id="map41-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map41)

<a id="propertytype-processcreatetypeidentifierstring"></a>
## Property type ∷ ProcessCreateTypeIdentifierString

* This entry is required


  * Must equal: "ProcessCreateEvent"

<a id="map41"></a>
# *ObservedTime* Object

*ObservedTime* Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[start_time](#propertystart_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[end_time](#propertyend_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
