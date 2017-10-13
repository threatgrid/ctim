<a id="top"></a>
# *Sighting* Object

A single sighting of an [indicator](indicator.md)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:confidence](#property-confidence-highmedlowstring)|HighMedLow String| |&#10003;|
|[:count](#property-count-integer)|Integer|The number of times the sighting was seen|&#10003;|
|[:id](#property-id-string)| String| |&#10003;|
|[:observed_time](#property-observed_time-observedtimeobject)|*ObservedTime* Object| |&#10003;|
|[:schema_version](#property-schema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[:type](#property-type-sightingtypeidentifierstring)|SightingTypeIdentifier String| |&#10003;|
|[:description](#property-description-string)| String| ||
|[:external_ids](#property-external_ids-stringlist)| String List| ||
|[:language](#property-language-string)| String| ||
|[:observables](#property-observables-observableobjectlist)|*Observable* Object List|The object(s) of interest||
|[:relations](#property-relations-observedrelationobjectlist)|*ObservedRelation* Object List|Provide any context we can about where the observable came from||
|[:revision](#property-revision-integer)|Integer| ||
|[:sensor](#property-sensor-sensorstring)|Sensor String|The OpenC2 Actuator name that best fits the device that is creating this sighting (e.g. network.firewall)||
|[:short_description](#property-short_description-string)| String| ||
|[:source](#property-source-string)| String| ||
|[:source_uri](#property-source_uri-string)| String| ||
|[:target](#property-target-sightingtargetobject)|*SightingTarget* Object|The target device. Where the sighting came from.||
|[:timestamp](#property-timestamp-instdate)|Inst (Date)| ||
|[:title](#property-title-string)| String| ||
|[:tlp](#property-tlp-tlpstring)|TLP String| ||

* Reference: [SightingType](http://stixproject.github.io/data-model/1.2/indicator/SightingType/)

<a id="property-confidence-highmedlowstring"></a>
## Property :confidence ∷ HighMedLow String

* This entry is required


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="property-count-integer"></a>
## Property :count ∷ Integer

The number of times the sighting was seen

* This entry is required


  * Zero, or a positive integer

<a id="property-description-string"></a>
## Property :description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="property-external_ids-stringlist"></a>
## Property :external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="property-id-string"></a>
## Property :id ∷  String

* This entry is required


  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.

<a id="property-language-string"></a>
## Property :language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="property-observables-observableobjectlist"></a>
## Property :observables ∷ *Observable* Object List

The object(s) of interest

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map3-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map3)

<a id="property-observed_time-observedtimeobject"></a>
## Property :observed_time ∷ *ObservedTime* Object

* This entry is required


<a id="map1-ref"></a>
* *ObservedTime* Object Value
  * Details: [*ObservedTime* Object](#map1)

<a id="property-relations-observedrelationobjectlist"></a>
## Property :relations ∷ *ObservedRelation* Object List

Provide any context we can about where the observable came from

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map4-ref"></a>
* *ObservedRelation* Object Value
  * Details: [*ObservedRelation* Object](#map4)

<a id="property-revision-integer"></a>
## Property :revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="property-schema_version-string"></a>
## Property :schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="property-sensor-sensorstring"></a>
## Property :sensor ∷ Sensor String

The OpenC2 Actuator name that best fits the device that is creating this sighting (e.g. network.firewall)

* This entry is optional


  * The openC2 Actuator name that best fits a device
See also the Open C2 Language Description, Actuator Vocabulary, page 24.
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
  * Reference: [OpenC2 Language Description](HTTP://openc2.org/docs/OpenC2%20%20Language%20Descrip%20Doc%20Draft%20%28Rev%200%206f%29%2003012016.pdf)

<a id="property-short_description-string"></a>
## Property :short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="property-source-string"></a>
## Property :source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="property-source_uri-string"></a>
## Property :source_uri ∷  String

* This entry is optional


  * A URI

<a id="property-target-sightingtargetobject"></a>
## Property :target ∷ *SightingTarget* Object

The target device. Where the sighting came from.

* This entry is optional


<a id="map2-ref"></a>
* *SightingTarget* Object Value
  * Details: [*SightingTarget* Object](#map2)

<a id="property-timestamp-instdate"></a>
## Property :timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-title-string"></a>
## Property :title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="property-tlp-tlpstring"></a>
## Property :tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="property-type-sightingtypeidentifierstring"></a>
## Property :type ∷ SightingTypeIdentifier String

* This entry is required


  * Must equal: "sighting"

<a id="map1"></a>
# *ObservedTime* Object

Period of time when a cyber observation is valid.  `start_time` must come before `end_time` (if specified).

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:start_time](#property-start_time-instdate)|Inst (Date)|Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period|&#10003;|
|[:end_time](#property-end_time-instdate)|Inst (Date)|If the observation was made over a period of time, than this field indicates the end of that period||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="property-end_time-instdate"></a>
## Property :end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-start_time-instdate"></a>
## Property :start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this field indicates the start of that period

* This entry is required


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map2"></a>
# *SightingTarget* Object

Describes a target device where a sighting came from.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:observables](#property-observables-observableobjectlist)|*Observable* Object List| |&#10003;|
|[:type](#property-type-sensorstring)|Sensor String| |&#10003;|
|[:os](#property-os-string)| String| ||
|[:properties_data_tables](#property-properties_data_tables-string)| String| ||


<a id="property-observables-observableobjectlist"></a>
## Property :observables ∷ *Observable* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map5-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map5)

<a id="property-os-string"></a>
## Property :os ∷  String

* This entry is optional



<a id="property-properties_data_tables-string"></a>
## Property :properties_data_tables ∷  String

* This entry is optional


  * A URI leading to a data table

<a id="property-type-sensorstring"></a>
## Property :type ∷ Sensor String

* This entry is required


  * The openC2 Actuator name that best fits a device
See also the Open C2 Language Description, Actuator Vocabulary, page 24.
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
  * Reference: [OpenC2 Language Description](HTTP://openc2.org/docs/OpenC2%20%20Language%20Descrip%20Doc%20Draft%20%28Rev%200%206f%29%2003012016.pdf)

<a id="map5"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:type](#property-type-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[:value](#property-value-string)| String| |&#10003;|


<a id="property-type-observabletypeidentifierstring"></a>
## Property :type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="property-value-string"></a>
## Property :value ∷  String

* This entry is required



<a id="map3"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:type](#property-type-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[:value](#property-value-string)| String| |&#10003;|


<a id="property-type-observabletypeidentifierstring"></a>
## Property :type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="property-value-string"></a>
## Property :value ∷  String

* This entry is required



<a id="map4"></a>
# *ObservedRelation* Object

A relation inside a Sighting.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:origin](#property-origin-string)| String| |&#10003;|
|[:related](#property-related-observableobject)|*Observable* Object| |&#10003;|
|[:relation](#property-relation-observablerelationtypestring)|ObservableRelationType String| |&#10003;|
|[:source](#property-source-observableobject)|*Observable* Object| |&#10003;|
|[:origin_uri](#property-origin_uri-string)| String| ||
|[:relation_info](#property-relation_info-object)|Object| ||


<a id="property-origin-string"></a>
## Property :origin ∷  String

* This entry is required



<a id="property-origin_uri-string"></a>
## Property :origin_uri ∷  String

* This entry is optional


  * A URI

<a id="property-related-observableobject"></a>
## Property :related ∷ *Observable* Object

* This entry is required


<a id="map8-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map8)

<a id="property-relation-observablerelationtypestring"></a>
## Property :relation ∷ ObservableRelationType String

* This entry is required


  * Allowed Values:
    * Allocated
    * Allocated_By
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

<a id="property-relation_info-object"></a>
## Property :relation_info ∷ Object

* This entry is optional


<a id="map6-ref"></a>
* Object Value
  * Details: [Object](#map6)

<a id="property-source-observableobject"></a>
## Property :source ∷ *Observable* Object

* This entry is required


<a id="map7-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map7)

<a id="map8"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:type](#property-type-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[:value](#property-value-string)| String| |&#10003;|


<a id="property-type-observabletypeidentifierstring"></a>
## Property :type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="property-value-string"></a>
## Property :value ∷  String

* This entry is required



<a id="map7"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:type](#property-type-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[:value](#property-value-string)| String| |&#10003;|


<a id="property-type-observabletypeidentifierstring"></a>
## Property :type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="property-value-string"></a>
## Property :value ∷  String

* This entry is required



<a id="map6"></a>
# Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[Keyword](#propertykeyword-anything)|Anything| |&#10003;|


<a id="propertykeyword-anything"></a>
## Property Keyword ∷ Anything

* This entry is required


