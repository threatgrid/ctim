# *Sighting* Map

http://stixproject.github.io/data-model/1.2/indicator/SightingType/


## MapEntry: :id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :id

### String Value

The URI of this entity.

* Plumatic Schema: Str

## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :schema_version -> String

CTIM schema version for this entity

* This entry is required

### Keyword Key

* Plumatic Schema: :schema_version

### String Value

* Plumatic Schema: (enum "0.1.8")
* Must equal: "0.1.8"

## MapEntry: :uri -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :uri

### String Value

A URI

* Plumatic Schema: Str

## MapEntry: :revision -> Integer

* This entry is optional

### Keyword Key

* Plumatic Schema: :revision

### Integer Value

* Plumatic Schema: Int

## MapEntry: :external_ids -> [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :external_ids

#### String Value

* Plumatic Schema: [java.lang.String]

## MapEntry: :timestamp -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :timestamp

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :language -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :language

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :tlp -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :tlp

### String Value

TLP Stand for Traffic Light Protocol (https://www.us-cert.gov/tlp). Precise how this resource is intended to be shared, replicated, copied...

* Plumatic Schema: (enum "white" "green" "red" "amber")
* Default: green
* Allowed Values: ("amber" "green" "red" "white")

## MapEntry: :source -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :source

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :source_uri -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :source_uri

### String Value

A URI

* Plumatic Schema: Str

## MapEntry: :title -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :title

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :description -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :description

### String Value

Markdown text

* Plumatic Schema: Str

## MapEntry: :short_description -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :short_description

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "sighting")
* Must equal: "sighting"

## MapEntry: :observed_time -> Map

* This entry is required

### Keyword Key

* Plumatic Schema: :observed_time

### Map Value

* Reference: http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/

#### MapEntry: :start_time -> Inst (Date)

Time of the observation.  If the observation was made over a period of time, than this ield indicated the start of that period

* This entry is required

##### Keyword Key

* Plumatic Schema: :start_time

##### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

#### MapEntry: :end_time -> Inst (Date)

If the observation was made over a period of time, than this field indicates the end of that period

* This entry is optional

##### Keyword Key

* Plumatic Schema: :end_time

##### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :confidence -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :confidence

### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :count -> Integer

* This entry is required

### Keyword Key

* Plumatic Schema: :count

### Integer Value

* Plumatic Schema: Int

## MapEntry: :sensor -> String

The OpenC2 Actuator name that best gits the device that is creating this sighting (e.g. network.firewall)

* This entry is optional

### Keyword Key

* Plumatic Schema: :sensor

### String Value

The openC2 Actuator name that best fits a device
See also the Open C2 Language Description, Actuator Vocabulary, page 24.

* Plumatic Schema: (enum "endpoint.sensor" "process.network-scanner" "network.switch" "network.security_manager" "process.vulnerability-scanner" "network.hub" "network.ids" "network.firewall" "process" "network.sense_making" "process.sandbox" "network.modem" "process.email-service" "process.dns-server" "network.vpn" "process.connection-scanner" "network.nic" "endpoint.printer" "network.gateway" "process.reputation-service" "process.remediation-service" "network" "process.virtualization-service" "network.ips" "endpoint.smart-meter" "endpoint.digital-telephone-handset" "endpoint.workstation" "endpoint.server" "network.wap" "endpoint.laptop" "process.aaa-server" "process.directory-service" "endpoint.pos-terminal" "network.bridge" "process.file-scanner" "network.proxy" "endpoint" "process.location-service" "network.sensor" "endpoint.smart-phone" "network.hips" "process.anti-virus-scanner" "endpoint.tablet" "network.guard" "network.router")
* Allowed Values: ("endpoint" "endpoint.digital-telephone-handset" "endpoint.laptop" "endpoint.pos-terminal" "endpoint.printer" "endpoint.sensor" "endpoint.server" "endpoint.smart-meter" "endpoint.smart-phone" "endpoint.tablet" "endpoint.workstation" "network" "network.bridge" "network.firewall" "network.gateway" "network.guard" "network.hips" "network.hub" "network.ids" "network.ips" "network.modem" "network.nic" "network.proxy" "network.router" "network.security_manager" "network.sense_making" "network.sensor" "network.switch" "network.vpn" "network.wap" "process" "process.aaa-server" "process.anti-virus-scanner" "process.connection-scanner" "process.directory-service" "process.dns-server" "process.email-service" "process.file-scanner" "process.location-service" "process.network-scanner" "process.remediation-service" "process.reputation-service" "process.sandbox" "process.virtualization-service" "process.vulnerability-scanner")
* Reference: http://openc2.org/docs/OpenC2%20%20Language%20Descrip%20Doc%20Draft%20%28Rev%200%206f%29%2003012016.pdf

## MapEntry: :observables -> [Map]

The object(s) of interest

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :observables

#### Map Value

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.


##### MapEntry: :value -> String

* This entry is required

###### Keyword Key

* Plumatic Schema: :value

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :type -> String

* This entry is required

###### Keyword Key

* Plumatic Schema: :type

###### String Value

Observable type names

* Plumatic Schema: (enum "device" "url" "pki-serial" "user" "ipv6" "email" "sha256" "sha1" "md5" "ip" "domain" "imei" "imsi" "amp-device")
* Allowed Values: ("amp-device" "device" "domain" "email" "imei" "imsi" "ip" "ipv6" "md5" "pki-serial" "sha1" "sha256" "url" "user")

## MapEntry: :indicators -> [*RelatedIndicator* Map]

The indicators with think we are seeing

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :indicators

#### *RelatedIndicator* Map Value


##### MapEntry: :confidence -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :confidence

###### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

##### MapEntry: :source -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :source

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :relationship -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :relationship

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :indicator_id -> String

* This entry is required

###### Keyword Key

* Plumatic Schema: :indicator_id

###### String Value

A URI leading to an indicator

* Plumatic Schema: Str

## MapEntry: :relations -> [Map]

Provide any context we can about where the observable came from

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :relations

#### Map Value

A relation inside a Sighting.


##### MapEntry: :origin -> String

* This entry is required

###### Keyword Key

* Plumatic Schema: :origin

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :origin_uri -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :origin_uri

###### String Value

A URI

* Plumatic Schema: Str

##### MapEntry: :relation -> String

* This entry is required

###### Keyword Key

* Plumatic Schema: :relation

###### String Value

* Plumatic Schema: (enum "Injected_Into" "Unlocked_By" "Suspended" "Loaded_From" "Closed" "Dropped" "Encoded" "Sent_Via_Upload" "Joined" "Unhooked_By" "Created" "Values_Enumerated_By" "Monitored_By" "Child_Of" "Packed_By" "Compressed_From" "Sub-domain_Of" "Moved_To" "Received_From" "Merged_By" "Decompressed_By" "Dropped_By" "Connected_To" "Sent_To" "Listened_On_By" "Contains" "Encrypted_By" "Searched_For_By" "Uploaded" "Packed_From" "Encrypted" "Decompressed" "Copied_By" "Freed_By" "Decoded_By" "Deleted_By" "Set_From" "Used" "Modified_Properties_Of" "Supra-domain_Of" "Received_By" "Copied_From" "Renamed_From" "Encrypted_To" "Downloaded_From" "Read_From" "Unlocked" "Locked" "Characterized_By" "Renamed_To" "Joined_By" "Hooked" "Deleted_From" "Listened_On" "Downloaded_By" "Injected" "Freed" "Compressed_By" "Extracted_From" "Paused_By" "Sent" "Wrote_To" "Sent_By" "Packed" "Compressed" "Renamed_By" "Moved" "Set_To" "Packed_Into" "Received_Via_Upload" "Resumed" "Mapped_By" "Moved_By" "Encoded_By" "Decoded" "Properties_Modified_By" "Injected_As" "Monitored" "Properties_Queried" "Bound_By" "Initialized_To" "Deleted" "Paused" "Copied_To" "Injected_By" "Parent_Of" "Redirects_To" "Bound" "Suspended_By" "Contained_Within" "Loaded_Into" "Opened" "Resumed_By" "Created_By" "Root_Domain_Of" "Unpacked" "Compressed_Into" "FQDN_Of" "Unhooked" "Killed" "Properties_Queried_By" "Locked_By" "Killed_By" "Values_Enumerated" "Written_To_By" "Unpacked_By" "Uploaded_By" "Decrypted_By" "Previously_Contained" "Read_From_By" "Characterizes" "Uploaded_From" "Mapped_Into" "Received" "Resolved_To" "Initialized_By" "Closed_By" "Copied" "Merged" "Connected_From" "Installed_By" "Renamed" "Downloaded_To" "Encrypted_From" "Hooked_By" "Opened_By" "Allocated" "Allocated_By" "Used_By" "Decrypted" "Uploaded_To" "Downloaded" "Related_To" "Searched_For" "Installed" "Moved_From")
* Allowed Values: ("Allocated" "Allocated_By" "Bound" "Bound_By" "Characterized_By" "Characterizes" "Child_Of" "Closed" "Closed_By" "Compressed" "Compressed_By" "Compressed_From" "Compressed_Into" "Connected_From" "Connected_To" "Contained_Within" "Contains" "Copied" "Copied_By" "Copied_From" "Copied_To" "Created" "Created_By" "Decoded" "Decoded_By" "Decompressed" "Decompressed_By" "Decrypted" "Decrypted_By" "Deleted" "Deleted_By" "Deleted_From" "Downloaded" "Downloaded_By" "Downloaded_From" "Downloaded_To" "Dropped" "Dropped_By" "Encoded" "Encoded_By" "Encrypted" "Encrypted_By" "Encrypted_From" "Encrypted_To" "Extracted_From" "FQDN_Of" "Freed" "Freed_By" "Hooked" "Hooked_By" "Initialized_By" "Initialized_To" "Injected" "Injected_As" "Injected_By" "Injected_Into" "Installed" "Installed_By" "Joined" "Joined_By" "Killed" "Killed_By" "Listened_On" "Listened_On_By" "Loaded_From" "Loaded_Into" "Locked" "Locked_By" "Mapped_By" "Mapped_Into" "Merged" "Merged_By" "Modified_Properties_Of" "Monitored" "Monitored_By" "Moved" "Moved_By" "Moved_From" "Moved_To" "Opened" "Opened_By" "Packed" "Packed_By" "Packed_From" "Packed_Into" "Parent_Of" "Paused" "Paused_By" "Previously_Contained" "Properties_Modified_By" "Properties_Queried" "Properties_Queried_By" "Read_From" "Read_From_By" "Received" "Received_By" "Received_From" "Received_Via_Upload" "Redirects_To" "Related_To" "Renamed" "Renamed_By" "Renamed_From" "Renamed_To" "Resolved_To" "Resumed" "Resumed_By" "Root_Domain_Of" "Searched_For" "Searched_For_By" "Sent" "Sent_By" "Sent_To" "Sent_Via_Upload" "Set_From" "Set_To" "Sub-domain_Of" "Supra-domain_Of" "Suspended" "Suspended_By" "Unhooked" "Unhooked_By" "Unlocked" "Unlocked_By" "Unpacked" "Unpacked_By" "Uploaded" "Uploaded_By" "Uploaded_From" "Uploaded_To" "Used" "Used_By" "Values_Enumerated" "Values_Enumerated_By" "Written_To_By" "Wrote_To")

##### MapEntry: :relation_info -> Map

* This entry is optional

###### Keyword Key

* Plumatic Schema: :relation_info

###### Map Value


####### MapEntry: Keyword -> Anything

* This entry is required

######## Keyword Key

* Plumatic Schema: Keyword

######## Anything Value

* Plumatic Schema: Any

##### MapEntry: :source -> Map

* This entry is required

###### Keyword Key

* Plumatic Schema: :source

###### Map Value

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.


####### MapEntry: :value -> String

* This entry is required

######## Keyword Key

* Plumatic Schema: :value

######## String Value

* Plumatic Schema: java.lang.String

####### MapEntry: :type -> String

* This entry is required

######## Keyword Key

* Plumatic Schema: :type

######## String Value

Observable type names

* Plumatic Schema: (enum "device" "url" "pki-serial" "user" "ipv6" "email" "sha256" "sha1" "md5" "ip" "domain" "imei" "imsi" "amp-device")
* Allowed Values: ("amp-device" "device" "domain" "email" "imei" "imsi" "ip" "ipv6" "md5" "pki-serial" "sha1" "sha256" "url" "user")

##### MapEntry: :related -> Map

* This entry is required

###### Keyword Key

* Plumatic Schema: :related

###### Map Value

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.


####### MapEntry: :value -> String

* This entry is required

######## Keyword Key

* Plumatic Schema: :value

######## String Value

* Plumatic Schema: java.lang.String

####### MapEntry: :type -> String

* This entry is required

######## Keyword Key

* Plumatic Schema: :type

######## String Value

Observable type names

* Plumatic Schema: (enum "device" "url" "pki-serial" "user" "ipv6" "email" "sha256" "sha1" "md5" "ip" "domain" "imei" "imsi" "amp-device")
* Allowed Values: ("amp-device" "device" "domain" "email" "imei" "imsi" "ip" "ipv6" "md5" "pki-serial" "sha1" "sha256" "url" "user")

## MapEntry: :incidents -> [*RelatedIncident* Map]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :incidents

#### *RelatedIncident* Map Value


##### MapEntry: :confidence -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :confidence

###### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

##### MapEntry: :source -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :source

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :relationship -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :relationship

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :incident_id -> String

* This entry is required

###### Keyword Key

* Plumatic Schema: :incident_id

###### String Value

A URI leading to an incident

* Plumatic Schema: Str
