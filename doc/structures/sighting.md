<a name="top"/>
# *Sighting* Map

TODO: Document Sighting

* Reference: [SightingType](http://stixproject.github.io/data-model/1.2/indicator/SightingType/)

## MapEntry :id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :id

* String Value
  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.
  * Plumatic Schema: Str

## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: Str

## MapEntry :schema_version ∷ String

CTIM schema version for this entity

* This entry is required

* Keyword Key
  * Plumatic Schema: :schema_version

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "0.1.10"

## MapEntry :uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :uri

* String Value
  * A URI
  * Plumatic Schema: Str

## MapEntry :revision ∷ Integer

* This entry is optional

* Keyword Key
  * Plumatic Schema: :revision

* Integer Value
  * Plumatic Schema: Int

## MapEntry :external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :external_ids

* String Value
  * Plumatic Schema: [Str]

## MapEntry :timestamp ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :timestamp

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :language ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :language

* String Value
  * Plumatic Schema: Str

## MapEntry :tlp ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :tlp

* String Value
  * TLP Stand for [Traffic Light Protocol](https://www.us-cert.gov/tlp). It indicates precisely how this resource is intended to be shared, replicated, copied...
  * Plumatic Schema: (enum ...)
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry :source_uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source_uri

* String Value
  * A URI
  * Plumatic Schema: Str

## MapEntry :title ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :title

* String Value
  * Plumatic Schema: Str

## MapEntry :description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

## MapEntry :short_description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * Plumatic Schema: Str

## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "sighting"

## MapEntry :observed_time ∷ *ObservedTime* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :observed_time

<a name="map1-ref"/>
* *ObservedTime* Map Value
  * Details: [*ObservedTime* Map](#map1)

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

## MapEntry :count ∷ Integer

* This entry is required

* Keyword Key
  * Plumatic Schema: :count

* Integer Value
  * Plumatic Schema: Int

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

## MapEntry :observables ∷ [*Observable* Map]

The object(s) of interest

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :observables

<a name="map2-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map2)

## MapEntry :indicators ∷ [*RelatedIndicator* Map]

The indicators with think we are seeing

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :indicators

<a name="map3-ref"/>
* *RelatedIndicator* Map Value
  * Details: [*RelatedIndicator* Map](#map3)

## MapEntry :relations ∷ [*ObservedRelation* Map]

Provide any context we can about where the observable came from

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :relations

<a name="map4-ref"/>
* *ObservedRelation* Map Value
  * Details: [*ObservedRelation* Map](#map4)

## MapEntry :incidents ∷ [*RelatedIncident* Map]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :incidents

<a name="map5-ref"/>
* *RelatedIncident* Map Value
  * Details: [*RelatedIncident* Map](#map5)

<a name="map1"/>
# *ObservedTime* Map

[return](#map1-ref)

Period of time when a cyber observation is valid.

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

## MapEntry :start_time ∷ Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this ield indicated the start of that period

* This entry is required

* Keyword Key
  * Plumatic Schema: :start_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :end_time ∷ Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional

* Keyword Key
  * Plumatic Schema: :end_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

<a name="map2"/>
# *Observable* Map

[return](#map2-ref)

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.


## MapEntry :value ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

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

<a name="map3"/>
# *RelatedIndicator* Map

[return](#map3-ref)


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

## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

## MapEntry :indicator_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :indicator_id

* String Value
  * A URI leading to an indicator
  * Plumatic Schema: Str

<a name="map4"/>
# *ObservedRelation* Map

[return](#map4-ref)

A relation inside a Sighting.


## MapEntry :origin ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :origin

* String Value
  * Plumatic Schema: Str

## MapEntry :origin_uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :origin_uri

* String Value
  * A URI
  * Plumatic Schema: Str

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

## MapEntry :relation_info ∷ Map

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relation_info

<a name="map6-ref"/>
* Map Value
  * Details: [Map](#map6)

## MapEntry :source ∷ *Observable* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :source

<a name="map7-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map7)

## MapEntry :related ∷ *Observable* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :related

<a name="map8-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map8)

<a name="map8"/>
# *Observable* Map

[return](#map8-ref)

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.


## MapEntry :value ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

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

<a name="map7"/>
# *Observable* Map

[return](#map7-ref)

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.


## MapEntry :value ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

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

<a name="map6"/>
# Map

[return](#map6-ref)


## MapEntry Keyword ∷ Anything

* This entry is required

* Keyword Key
  * Plumatic Schema: Keyword

* Anything Value
  * Plumatic Schema: Any

<a name="map5"/>
# *RelatedIncident* Map

[return](#map5-ref)


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

## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

## MapEntry :incident_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :incident_id

* String Value
  * A URI leading to an incident
  * Plumatic Schema: Str
