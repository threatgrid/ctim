<a name="top"/>
# *COA* Map

Course of Action


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

## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "coa")
* Must equal: "coa"

## MapEntry: :valid_time -> Map

* This entry is required

### Keyword Key

* Plumatic Schema: :valid_time

<a name="map1-ref"/>
### Map Value

[Map](#map1)

## MapEntry: :stage -> String

specifies what stage in the cyber threat management lifecycle this Course Of Action is relevant to

* This entry is optional

### Keyword Key

* Plumatic Schema: :stage

### String Value

* Plumatic Schema: (enum "Remedy" "Response")
* Allowed Values: ("Remedy" "Response")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/COAStageVocab-1.0/

## MapEntry: :coa_type -> String

type of this COA

* This entry is optional

### Keyword Key

* Plumatic Schema: :coa_type

### String Value

* Plumatic Schema: (enum "Diplomatic Actions" "Physical Access Restrictions" "Policy Actions" "Internal Blocking" "Redirection" "Eradication" "Public Disclosure" "Monitoring" "Patching" "Logical Access Restrictions" "Redirection (Honey Pot)" "Rebuilding" "Perimeter Blocking" "Hardening" "Other" "Training")
* Allowed Values: ("Diplomatic Actions" "Eradication" "Hardening" "Internal Blocking" "Logical Access Restrictions" "Monitoring" "Other" "Patching" "Perimeter Blocking" "Physical Access Restrictions" "Policy Actions" "Public Disclosure" "Rebuilding" "Redirection" "Redirection (Honey Pot)" "Training")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/CourseOfActionTypeVocab-1.0/

## MapEntry: :objective -> [String]

characterizes the objective of this Course Of Action

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :objective

#### String Value

* Plumatic Schema: [java.lang.String]

## MapEntry: :impact -> String

characterizes the estimated impact of applying this Course Of Action

* This entry is optional

### Keyword Key

* Plumatic Schema: :impact

### String Value

* Plumatic Schema: Str

## MapEntry: :cost -> String

characterizes the estimated cost for applying this Course Of Action

* This entry is optional

### Keyword Key

* Plumatic Schema: :cost

### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :efficacy -> String

effectiveness of this Course Of Action in achieving its targeted Objective

* This entry is optional

### Keyword Key

* Plumatic Schema: :efficacy

### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :related_COAs -> [*RelatedCOA* Map]

identifies or characterizes relationships to one or more related courses of action

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :related_COAs

<a name="map2-ref"/>
#### *RelatedCOA* Map Value

[*RelatedCOA* Map](#map2)

## MapEntry: :structured_coa_type -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :structured_coa_type

### String Value

* Plumatic Schema: (enum "openc2")
* Must equal: "openc2"

## MapEntry: :open_c2_coa -> *OpenC2COA* Map

* This entry is optional

### Keyword Key

* Plumatic Schema: :open_c2_coa

<a name="map3-ref"/>
### *OpenC2COA* Map Value

[*OpenC2COA* Map](#map3)

<a name="map1"/>
# Map

[return](#map1-ref)

* Reference: http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/

## MapEntry: :start_time -> Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

### Keyword Key

* Plumatic Schema: :start_time

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :end_time -> Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

### Keyword Key

* Plumatic Schema: :end_time

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

<a name="map2"/>
# *RelatedCOA* Map

[return](#map2-ref)


## MapEntry: :confidence -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :confidence

### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :source -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :source

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :relationship -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :relationship

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :COA_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :COA_id

### String Value

A URI leading to a COA

* Plumatic Schema: Str

<a name="map3"/>
# *OpenC2COA* Map

[return](#map3-ref)


## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "structured_coa")
* Must equal: "structured_coa"

## MapEntry: :id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :id

### String Value

The URI of this entity.

* Plumatic Schema: Str

## MapEntry: :action -> *ActionType* Map

* This entry is required

### Keyword Key

* Plumatic Schema: :action

<a name="map1-ref"/>
### *ActionType* Map Value

[*ActionType* Map](#map1)

## MapEntry: :target -> *TargetType* Map

* This entry is optional

### Keyword Key

* Plumatic Schema: :target

<a name="map2-ref"/>
### *TargetType* Map Value

[*TargetType* Map](#map2)

## MapEntry: :actuator -> *ActuatorType* Map

* This entry is optional

### Keyword Key

* Plumatic Schema: :actuator

<a name="map3-ref"/>
### *ActuatorType* Map Value

[*ActuatorType* Map](#map3)

## MapEntry: :modifiers -> *ModifierType* Map

* This entry is optional

### Keyword Key

* Plumatic Schema: :modifiers

<a name="map4-ref"/>
### *ModifierType* Map Value

[*ModifierType* Map](#map4)

<a name="map4"/>
# *ModifierType* Map

[return](#map4-ref)


## MapEntry: :delay -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :delay

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :duration -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :duration

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :frequency -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :frequency

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :id -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :id

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :time -> Map

* This entry is optional

### Keyword Key

* Plumatic Schema: :time

<a name="map4-ref"/>
### Map Value

[Map](#map4)

## MapEntry: :response -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :response

### String Value

* Plumatic Schema: (enum "query" "status" "acknowledge" "command-ref")
* Allowed Values: ("acknowledge" "command-ref" "query" "status")

## MapEntry: :source -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :source

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :destination -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :destination

### String Value

* Plumatic Schema: (enum "modify-to" "set-to" "copy-to" "move-to" "save-to" "restore-point" "report-to")
* Allowed Values: ("copy-to" "modify-to" "move-to" "report-to" "restore-point" "save-to" "set-to")

## MapEntry: :method -> [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :method

#### String Value

* Plumatic Schema: [(enum "blackhole" "unauthenticated" "suspend" "graceful" "hibernate" "whitelist" "honeypot" "immediate" "spawn" "blacklist" "acl" "segmentation" "authenticated")]
* Allowed Values: ("acl" "authenticated" "blackhole" "blacklist" "graceful" "hibernate" "honeypot" "immediate" "segmentation" "spawn" "suspend" "unauthenticated" "whitelist")

## MapEntry: :search -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :search

### String Value

* Plumatic Schema: (enum "vendor_bulletin" "patch" "signature" "cve")
* Allowed Values: ("cve" "patch" "signature" "vendor_bulletin")

## MapEntry: :location -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :location

### String Value

* Plumatic Schema: (enum "internal" "perimeter")
* Allowed Values: ("internal" "perimeter")

## MapEntry: :option -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :option

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :additional_properties -> *AdditionalProperties* Map

* This entry is optional

### Keyword Key

* Plumatic Schema: :additional_properties

<a name="map5-ref"/>
### *AdditionalProperties* Map Value

[*AdditionalProperties* Map](#map5)

<a name="map5"/>
# *AdditionalProperties* Map

[return](#map5-ref)


## MapEntry: :context -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :context

### String Value

* Plumatic Schema: java.lang.String

<a name="map4"/>
# Map

[return](#map4-ref)

* Reference: http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/

## MapEntry: :start_time -> Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

### Keyword Key

* Plumatic Schema: :start_time

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :end_time -> Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

### Keyword Key

* Plumatic Schema: :end_time

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

<a name="map3"/>
# *ActuatorType* Map

[return](#map3-ref)


## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "endpoint.sensor" "process.network-scanner" "network.switch" "network.security_manager" "process.vulnerability-scanner" "network.hub" "network.ids" "network.firewall" "process" "network.sense_making" "process.sandbox" "network.modem" "process.email-service" "process.dns-server" "network.vpn" "process.connection-scanner" "network.nic" "endpoint.printer" "network.gateway" "process.reputation-service" "process.remediation-service" "network" "process.virtualization-service" "network.ips" "endpoint.smart-meter" "endpoint.digital-telephone-handset" "endpoint.workstation" "endpoint.server" "network.wap" "endpoint.laptop" "process.aaa-server" "process.directory-service" "endpoint.pos-terminal" "network.bridge" "other" "process.file-scanner" "network.proxy" "endpoint" "process.location-service" "network.sensor" "endpoint.smart-phone" "network.hips" "process.anti-virus-scanner" "endpoint.tablet" "network.guard" "network.router")
* Allowed Values: ("endpoint" "endpoint.digital-telephone-handset" "endpoint.laptop" "endpoint.pos-terminal" "endpoint.printer" "endpoint.sensor" "endpoint.server" "endpoint.smart-meter" "endpoint.smart-phone" "endpoint.tablet" "endpoint.workstation" "network" "network.bridge" "network.firewall" "network.gateway" "network.guard" "network.hips" "network.hub" "network.ids" "network.ips" "network.modem" "network.nic" "network.proxy" "network.router" "network.security_manager" "network.sense_making" "network.sensor" "network.switch" "network.vpn" "network.wap" "other" "process" "process.aaa-server" "process.anti-virus-scanner" "process.connection-scanner" "process.directory-service" "process.dns-server" "process.email-service" "process.file-scanner" "process.location-service" "process.network-scanner" "process.remediation-service" "process.reputation-service" "process.sandbox" "process.virtualization-service" "process.vulnerability-scanner")

## MapEntry: :specifiers -> [String]

list of additional properties describing the actuator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :specifiers

#### String Value

* Plumatic Schema: [java.lang.String]

<a name="map2"/>
# *TargetType* Map

[return](#map2-ref)


## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :specifiers -> String

Cybox object representing the target

* This entry is optional

### Keyword Key

* Plumatic Schema: :specifiers

### String Value

* Plumatic Schema: Str

<a name="map1"/>
# *ActionType* Map

[return](#map1-ref)


## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "stop" "save" "delete" "remediate" "redirect" "alert" "query" "augment" "snapshot" "update" "allow" "scan" "investigate" "modify" "sync" "start" "pause" "deny" "substitute" "distill" "move" "restart" "other" "detonate" "response" "set" "notify" "report" "restore" "get" "throttle" "mitigate" "resume" "locate" "contain")
* Allowed Values: ("alert" "allow" "augment" "contain" "delete" "deny" "detonate" "distill" "get" "investigate" "locate" "mitigate" "modify" "move" "notify" "other" "pause" "query" "redirect" "remediate" "report" "response" "restart" "restore" "resume" "save" "scan" "set" "snapshot" "start" "stop" "substitute" "sync" "throttle" "update")
* Reference: https://github.com/OpenC2-org/subgroup-stix/blob/master/schema/openc2_stix_coa.xsd
