<a id="top"></a>
# *TargetRecord* Object

*TargetRecord* A TargetRecord is a Sighting that has no threat or observables associated
  with it, it's a way of saying they saw a set of observables together as a Target.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[source](#propertysource-medstringstring)|MedStringString| |&#10003;|
|[targets](#propertytargets-targetobjectlist)|*Target* Object List| |&#10003;|
|[type](#propertytype-targetrecordtypeidentifierstring)|TargetRecordTypeIdentifierString| |&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source_uri](#propertysource_uri-string)|String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [TargetRecord](https://github.com/threatgrid/response/blob/master/features/assets/assets.org#targetrecord)

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

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

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

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertytargets-targetobjectlist"></a>
## Property targets ∷ *Target* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map2-ref"></a>
* *Target* Object Value
  * Details: [*Target* Object](#map2)

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

<a id="propertytype-targetrecordtypeidentifierstring"></a>
## Property type ∷ TargetRecordTypeIdentifierString

* This entry is required


  * Must equal: "target-record"

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
# *Target* Object

*Target* Schema for TargetRecord Targets

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#propertyobservables-observableobjectlist)|*Observable* Object List| |&#10003;|
|[observed_time](#propertyobserved_time-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[type](#propertytype-sensorstring)|SensorString| |&#10003;|
|[internal](#propertyinternal-boolean)|Boolean|Is it internal to our network?||
|[os](#propertyos-string)|String|Source Operating System where TargetRecord was originated.||
|[sensor](#propertysensor-string)|String|The OpenC2 Actuator name that best fits the device that is creating this TargetRecord (e.g.: network.firewall, etc.)||
|[source_uri](#propertysource_uri-string)|String| ||


<a id="propertyinternal-boolean"></a>
## Property internal ∷ Boolean

Is it internal to our network?

* This entry is optional



<a id="propertyobservables-observableobjectlist"></a>
## Property observables ∷ *Observable* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map3-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map3)

<a id="propertyobserved_time-observedtimeobject"></a>
## Property observed_time ∷ *ObservedTime* Object

* This entry is required


<a id="map4-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map4)

<a id="propertyos-string"></a>
## Property os ∷ String

Source Operating System where TargetRecord was originated.

* This entry is optional



<a id="propertysensor-string"></a>
## Property sensor ∷ String

The OpenC2 Actuator name that best fits the device that is creating this TargetRecord (e.g.: network.firewall, etc.)

* This entry is optional



<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

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

<a id="map4"></a>
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


