<a name="top"/>
# *Sighting* Map

A single sighting of an [indicator](indicator.md)

| key | type | required? |
| --- | ---- | --------- |
|[:confidence](#mapentry-confidence-string)|String|&#10003;|
|[:count](#mapentry-count-integer)|Integer|&#10003;|
|[:description](#mapentry-description-string)|String||
|[:external_ids](#mapentry-external_ids-string)|String||
|[:id](#mapentry-id-string)|String|&#10003;|
|[:incidents](#mapentry-incidents-relatedincidentmap)|*RelatedIncident* Map||
|[:indicators](#mapentry-indicators-relatedindicatormap)|*RelatedIndicator* Map||
|[:language](#mapentry-language-string)|String||
|[:observables](#mapentry-observables-observablemap)|*Observable* Map||
|[:observed_time](#mapentry-observed_time-observedtimemap)|*ObservedTime* Map|&#10003;|
|[:relations](#mapentry-relations-observedrelationmap)|*ObservedRelation* Map||
|[:revision](#mapentry-revision-integer)|Integer||
|[:schema_version](#mapentry-schema_version-string)|String|&#10003;|
|[:sensor](#mapentry-sensor-string)|String||
|[:short_description](#mapentry-short_description-string)|String||
|[:source](#mapentry-source-string)|String||
|[:source_uri](#mapentry-source_uri-string)|String||
|[:timestamp](#mapentry-timestamp-instdate)|Inst (Date)||
|[:title](#mapentry-title-string)|String||
|[:tlp](#mapentry-tlp-string)|String||
|[:type](#mapentry-type-string)|String|&#10003;|
* Reference: [SightingType](http://stixproject.github.io/data-model/1.2/indicator/SightingType/)

<a name="mapentry-confidence-string"/>
## MapEntry :confidence ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a name="mapentry-count-integer"/>
## MapEntry :count ∷ Integer

* This entry is required

* Keyword Key
  * Plumatic Schema: :count

* Integer Value
  * Plumatic Schema: Int

<a name="mapentry-description-string"/>
## MapEntry :description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

<a name="mapentry-external_ids-string"/>
## MapEntry :external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :external_ids

* String Value
  * Plumatic Schema: [Str]

<a name="mapentry-id-string"/>
## MapEntry :id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :id

* String Value
  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.
  * Plumatic Schema: Str

<a name="mapentry-incidents-relatedincidentmap"/>
## MapEntry :incidents ∷ [*RelatedIncident* Map]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :incidents

<a name="map5-ref"/>
* *RelatedIncident* Map Value
  * Details: [*RelatedIncident* Map](#map5)

<a name="mapentry-indicators-relatedindicatormap"/>
## MapEntry :indicators ∷ [*RelatedIndicator* Map]

The indicators with think we are seeing

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :indicators

<a name="map3-ref"/>
* *RelatedIndicator* Map Value
  * Details: [*RelatedIndicator* Map](#map3)

<a name="mapentry-language-string"/>
## MapEntry :language ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :language

* String Value
  * Plumatic Schema: Str

<a name="mapentry-observables-observablemap"/>
## MapEntry :observables ∷ [*Observable* Map]

The object(s) of interest

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :observables

<a name="map2-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map2)

<a name="mapentry-observed_time-observedtimemap"/>
## MapEntry :observed_time ∷ *ObservedTime* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :observed_time

<a name="map1-ref"/>
* *ObservedTime* Map Value
  * Details: [*ObservedTime* Map](#map1)

<a name="mapentry-relations-observedrelationmap"/>
## MapEntry :relations ∷ [*ObservedRelation* Map]

Provide any context we can about where the observable came from

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :relations

<a name="map4-ref"/>
* *ObservedRelation* Map Value
  * Details: [*ObservedRelation* Map](#map4)

<a name="mapentry-revision-integer"/>
## MapEntry :revision ∷ Integer

* This entry is optional

* Keyword Key
  * Plumatic Schema: :revision

* Integer Value
  * Plumatic Schema: Int

<a name="mapentry-schema_version-string"/>
## MapEntry :schema_version ∷ String

CTIM schema version for this entity

* This entry is required

* Keyword Key
  * Plumatic Schema: :schema_version

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "0.3.2"

<a name="mapentry-sensor-string"/>
## MapEntry :sensor ∷ String

The OpenC2 Actuator name that best gits the device that is creating this sighting (e.g. network.firewall)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :sensor

* String Value
  * The openC2 Actuator name that best fits a device
See also the Open C2 Language Description, Actuator Vocabulary, page 24.
  * Plumatic Schema: (enum ...)
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

<a name="mapentry-short_description-string"/>
## MapEntry :short_description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source_uri-string"/>
## MapEntry :source_uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source_uri

* String Value
  * A URI
  * Plumatic Schema: Str

<a name="mapentry-timestamp-instdate"/>
## MapEntry :timestamp ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :timestamp

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-title-string"/>
## MapEntry :title ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :title

* String Value
  * Plumatic Schema: Str

<a name="mapentry-tlp-string"/>
## MapEntry :tlp ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :tlp

* String Value
  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Plumatic Schema: (enum ...)
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "sighting"

<a name="map1"/>
# *ObservedTime* Map

Period of time when a cyber observation is valid.

| key | type | required? |
| --- | ---- | --------- |
|[:end_time](#mapentry-end_time-instdate)|Inst (Date)||
|[:start_time](#mapentry-start_time-instdate)|Inst (Date)|&#10003;|
* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a name="mapentry-end_time-instdate"/>
## MapEntry :end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional

* Keyword Key
  * Plumatic Schema: :end_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-start_time-instdate"/>
## MapEntry :start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this ield indicated the start of that period

* This entry is required

* Keyword Key
  * Plumatic Schema: :start_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="map2"/>
# *Observable* Map

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| key | type | required? |
| --- | ---- | --------- |
|[:type](#mapentry-type-string)|String|&#10003;|
|[:value](#mapentry-value-string)|String|&#10003;|

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Observable type names
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * amp-device
    * device
    * domain
    * email
    * imei
    * imsi
    * ip
    * ipv6
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a name="mapentry-value-string"/>
## MapEntry :value ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

<a name="map3"/>
# *RelatedIndicator* Map

| key | type | required? |
| --- | ---- | --------- |
|[:confidence](#mapentry-confidence-string)|String||
|[:indicator_id](#mapentry-indicator_id-string)|String|&#10003;|
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||

<a name="mapentry-confidence-string"/>
## MapEntry :confidence ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a name="mapentry-indicator_id-string"/>
## MapEntry :indicator_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :indicator_id

* String Value
  * A URI leading to an indicator
  * Plumatic Schema: Str

<a name="mapentry-relationship-string"/>
## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

<a name="map4"/>
# *ObservedRelation* Map

A relation inside a Sighting.

| key | type | required? |
| --- | ---- | --------- |
|[:origin](#mapentry-origin-string)|String|&#10003;|
|[:origin_uri](#mapentry-origin_uri-string)|String||
|[:related](#mapentry-related-observablemap)|*Observable* Map|&#10003;|
|[:relation](#mapentry-relation-string)|String|&#10003;|
|[:relation_info](#mapentry-relation_info-map)|Map||
|[:source](#mapentry-source-observablemap)|*Observable* Map|&#10003;|

<a name="mapentry-origin-string"/>
## MapEntry :origin ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :origin

* String Value
  * Plumatic Schema: Str

<a name="mapentry-origin_uri-string"/>
## MapEntry :origin_uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :origin_uri

* String Value
  * A URI
  * Plumatic Schema: Str

<a name="mapentry-related-observablemap"/>
## MapEntry :related ∷ *Observable* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :related

<a name="map8-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map8)

<a name="mapentry-relation-string"/>
## MapEntry :relation ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :relation

* String Value
  * Plumatic Schema: (enum ...)
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

<a name="mapentry-relation_info-map"/>
## MapEntry :relation_info ∷ Map

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relation_info

<a name="map6-ref"/>
* Map Value
  * Details: [Map](#map6)

<a name="mapentry-source-observablemap"/>
## MapEntry :source ∷ *Observable* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :source

<a name="map7-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map7)

<a name="map8"/>
# *Observable* Map

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| key | type | required? |
| --- | ---- | --------- |
|[:type](#mapentry-type-string)|String|&#10003;|
|[:value](#mapentry-value-string)|String|&#10003;|

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Observable type names
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * amp-device
    * device
    * domain
    * email
    * imei
    * imsi
    * ip
    * ipv6
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a name="mapentry-value-string"/>
## MapEntry :value ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

<a name="map7"/>
# *Observable* Map

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| key | type | required? |
| --- | ---- | --------- |
|[:type](#mapentry-type-string)|String|&#10003;|
|[:value](#mapentry-value-string)|String|&#10003;|

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Observable type names
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * amp-device
    * device
    * domain
    * email
    * imei
    * imsi
    * ip
    * ipv6
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a name="mapentry-value-string"/>
## MapEntry :value ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

<a name="map6"/>
# Map

| key | type | required? |
| --- | ---- | --------- |
|[Keyword](#mapentrykeyword-anything)|Anything|&#10003;|

<a name="mapentrykeyword-anything"/>
## MapEntry Keyword ∷ Anything

* This entry is required

* Keyword Key
  * Plumatic Schema: Keyword

* Anything Value
  * Plumatic Schema: Any

<a name="map5"/>
# *RelatedIncident* Map

| key | type | required? |
| --- | ---- | --------- |
|[:confidence](#mapentry-confidence-string)|String||
|[:incident_id](#mapentry-incident_id-string)|String|&#10003;|
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||

<a name="mapentry-confidence-string"/>
## MapEntry :confidence ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a name="mapentry-incident_id-string"/>
## MapEntry :incident_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :incident_id

* String Value
  * A URI leading to an incident
  * Plumatic Schema: Str

<a name="mapentry-relationship-string"/>
## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str
