<a name="top"/>
# *TTP* Map

http://stixproject.github.io/data-model/1.2/ttp/TTPType/


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

* Plumatic Schema: (enum "ttp")
* Must equal: "ttp"

## MapEntry: :valid_time -> Map

a timestamp for the definition of a specific version of a TTP item

* This entry is required

### Keyword Key

* Plumatic Schema: :valid_time

<a name="map1-ref"/>
### Map Value

[Map](#map1)

## MapEntry: :ttp_type -> String

type of this TTP

* This entry is required

### Keyword Key

* Plumatic Schema: :ttp_type

### String Value

* Plumatic Schema: Str

## MapEntry: :indicators -> [*RelatedIndicator* Map]

related indicators

* This entry is required
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :indicators

<a name="map2-ref"/>
#### *RelatedIndicator* Map Value

[*RelatedIndicator* Map](#map2)

## MapEntry: :intended_effect -> [String]

the suspected intended effect for this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :intended_effect

#### String Value

* Plumatic Schema: [(enum "Denial and Deception" "Destruction" "Fraud" "Extortion" "Advantage - Military" "Disruption" "Account Takeover" "Theft - Theft of Proprietary Information" "Degradation of Service" "Theft - Identity Theft" "Advantage - Political" "Exposure" "Traffic Diversion" "Embarrassment" "Theft - Intellectual Property" "Theft - Credential Theft" "Competitive Advantage" "Brand Damage" "Advantage - Economic" "Harassment" "Unauthorized Access" "ICS Control" "Theft" "Advantage")]
* Allowed Values: ("Account Takeover" "Advantage" "Advantage - Economic" "Advantage - Military" "Advantage - Political" "Brand Damage" "Competitive Advantage" "Degradation of Service" "Denial and Deception" "Destruction" "Disruption" "Embarrassment" "Exposure" "Extortion" "Fraud" "Harassment" "ICS Control" "Theft" "Theft - Credential Theft" "Theft - Identity Theft" "Theft - Intellectual Property" "Theft - Theft of Proprietary Information" "Traffic Diversion" "Unauthorized Access")

## MapEntry: :behavior -> *Behavior* Map

describes the attack patterns, malware, or exploits that the attacker leverages to execute this TTP

* This entry is optional

### Keyword Key

* Plumatic Schema: :behavior

<a name="map3-ref"/>
### *Behavior* Map Value

[*Behavior* Map](#map3)

## MapEntry: :resources -> *Resource* Map

infrastructure or tools that the adversary uses to execute this TTP

* This entry is optional

### Keyword Key

* Plumatic Schema: :resources

<a name="map4-ref"/>
### *Resource* Map Value

[*Resource* Map](#map4)

## MapEntry: :victim_targeting -> *VictimTargeting* Map

characterizes the people, organizations, information or access being targeted

* This entry is optional

### Keyword Key

* Plumatic Schema: :victim_targeting

<a name="map5-ref"/>
### *VictimTargeting* Map Value

[*VictimTargeting* Map](#map5)

## MapEntry: :exploit_targets -> [*RelatedExploitTarget* Map]

potential vulnerability, weakness or configuration targets for exploitation by this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :exploit_targets

<a name="map6-ref"/>
#### *RelatedExploitTarget* Map Value

[*RelatedExploitTarget* Map](#map6)

## MapEntry: :related_TTPs -> [*RelatedTTP* Map]

specifies other TTPs asserted to be related to this cyber threat TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :related_TTPs

<a name="map7-ref"/>
#### *RelatedTTP* Map Value

[*RelatedTTP* Map](#map7)

## MapEntry: :kill_chains -> [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :kill_chains

#### String Value

* Plumatic Schema: [(enum "Actions on Objectives" "Installation" "Delivery" "Reconnaissance" "Command & Control" "Exploitation" "Weaponization")]
* Allowed Values: ("Actions on Objectives" "Command & Control" "Delivery" "Exploitation" "Installation" "Reconnaissance" "Weaponization")

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
# *RelatedIndicator* Map

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

## MapEntry: :indicator_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :indicator_id

### String Value

A URI leading to an indicator

* Plumatic Schema: Str

<a name="map3"/>
# *Behavior* Map

[return](#map3-ref)

* Reference: http://stixproject.github.io/data-model/1.2/ttp/BehaviorType/

## MapEntry: :attack_patterns -> [*AttackPattern* Map]

one or more Attack Patterns for this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :attack_patterns

<a name="map5-ref"/>
#### *AttackPattern* Map Value

[*AttackPattern* Map](#map5)

## MapEntry: :malware_type -> [*MalwareInstance* Map]

one or more instances of Malware for this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :malware_type

<a name="map6-ref"/>
#### *MalwareInstance* Map Value

[*MalwareInstance* Map](#map6)

<a name="map6"/>
# *MalwareInstance* Map

[return](#map6-ref)

* Reference: http://stixproject.github.io/data-model/1.2/ttp/MalwareInstanceType/

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

## MapEntry: :type -> [String]

a characterization of what type of malware this

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :type

#### String Value

* Plumatic Schema: [(enum "Automated Transfer Scripts" "Ransomware" "DoS/ DDoS" "Remote Access Trojan" "DoS / DDoS - Script" "Bot - Loader" "Exploit Kit" "Bot - DDoS" "Rootkit" "Bot - Spam" "POS / ATM Malware" "Adware" "DoS / DDoS - Participatory" "Bot" "DoS / DDoS - Stress Test Tools" "Bot - Credential Theft" "Rogue Antivirus" "Dialer")]
* Allowed Values: ("Adware" "Automated Transfer Scripts" "Bot" "Bot - Credential Theft" "Bot - DDoS" "Bot - Loader" "Bot - Spam" "Dialer" "DoS / DDoS - Participatory" "DoS / DDoS - Script" "DoS / DDoS - Stress Test Tools" "DoS/ DDoS" "Exploit Kit" "POS / ATM Malware" "Ransomware" "Remote Access Trojan" "Rogue Antivirus" "Rootkit")

<a name="map5"/>
# *AttackPattern* Map

[return](#map5-ref)

* Reference: http://stixproject.github.io/data-model/1.2/ttp/AttackPatternType/

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

## MapEntry: :capec_id -> String

a reference to a particular entry within the Common Attack Pattern Enumeration and Classification

* This entry is optional

### Keyword Key

* Plumatic Schema: :capec_id

### String Value

* Plumatic Schema: Str

<a name="map4"/>
# *Resource* Map

[return](#map4-ref)

* Reference: http://stixproject.github.io/data-model/1.2/ttp/ResourceType/

## MapEntry: :tools -> Map

The tool leveraged by this TTP

* This entry is optional

### Keyword Key

* Plumatic Schema: :tools

<a name="map4-ref"/>
### Map Value

[Map](#map4)

## MapEntry: :infrastructure -> *Infrastructure* Map

infrastructure observed to have been utilized for cyber attack

* This entry is optional

### Keyword Key

* Plumatic Schema: :infrastructure

<a name="map5-ref"/>
### *Infrastructure* Map Value

[*Infrastructure* Map](#map5)

## MapEntry: :personas -> Map

* This entry is optional

### Keyword Key

* Plumatic Schema: :personas

<a name="map6-ref"/>
### Map Value

[Map](#map6)

<a name="map6"/>
# Map

[return](#map6-ref)

* Reference: http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/

## MapEntry: :description -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :description

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :related_identities -> [Map]

identifies other entity Identities related to this entity Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :related_identities

<a name="map6-ref"/>
#### Map Value

[Map](#map6)

<a name="map6"/>
# Map

[return](#map6-ref)

* Reference: http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/

## MapEntry: :identity -> String

specifies the level of confidence in the assertion of the relationship between the two components

* This entry is required

### Keyword Key

* Plumatic Schema: :identity

### String Value

A URI leading to an entity

* Plumatic Schema: Str

## MapEntry: :confidence -> String

specifies the level of confidence in the assertion of the relationship between the two components

* This entry is optional

### Keyword Key

* Plumatic Schema: :confidence

### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :information_source -> String

specifies the source of the information about the relationship between the two components

* This entry is optional

### Keyword Key

* Plumatic Schema: :information_source

### String Value

* Plumatic Schema: Str

## MapEntry: :relationship -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :relationship

### String Value

* Plumatic Schema: java.lang.String

<a name="map5"/>
# *Infrastructure* Map

[return](#map5-ref)

* Reference: http://stixproject.github.io/data-model/1.2/ttp/Infrastructure Type/

## MapEntry: :title -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :title

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :description -> String

text (Markdown) description of specific classes or instances of infrastructure utilized for cyber attack

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

represents the type of infrastructure being described

* This entry is optional

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "Communications" "Electronic Payment Methods" "Hosting - Legitimate Hosting" "Hosting - Cloud Hosting" "Anonymization - VPN" "Hosting - Bulletproof / Rogue Hosting" "Domain Registration - Dynamic DNS Services" "Domain Registration - Malicious Domain Registrars" "Domain Registration" "Communications - User-Generated Content Websites" "Anonymization - Proxy" "Domain Registration - Top-Level Domain Registrars" "Hosting - Fast Flux Botnet Hosting" "Anonymization" "Domain Registration - Legitimate Domain Registration Services" "Communications - Blogs" "Communications - Internet Relay Chat" "Hosting - Compromised Server" "Communications - Mobile Communications" "Communications - Forums" "Communications - Micro-Blogs" "Communications - Social Networks" "Anonymization - TOR Network" "Hosting")
* Allowed Values: ("Anonymization" "Anonymization - Proxy" "Anonymization - TOR Network" "Anonymization - VPN" "Communications" "Communications - Blogs" "Communications - Forums" "Communications - Internet Relay Chat" "Communications - Micro-Blogs" "Communications - Mobile Communications" "Communications - Social Networks" "Communications - User-Generated Content Websites" "Domain Registration" "Domain Registration - Dynamic DNS Services" "Domain Registration - Legitimate Domain Registration Services" "Domain Registration - Malicious Domain Registrars" "Domain Registration - Top-Level Domain Registrars" "Electronic Payment Methods" "Hosting" "Hosting - Bulletproof / Rogue Hosting" "Hosting - Cloud Hosting" "Hosting - Compromised Server" "Hosting - Fast Flux Botnet Hosting" "Hosting - Legitimate Hosting")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/AttackerInfrastructureTypeVocab-1.0/

<a name="map4"/>
# Map

[return](#map4-ref)

* Reference: http://stixproject.github.io/data-model/1.2/cyboxCommon/ToolInformationType/

## MapEntry: :description -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :description

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :type -> [String]

type of the tool leveraged

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :type

#### String Value

* Plumatic Schema: [(enum "Password Cracking" "Port Scanner" "Traffic Scanner" "Application Scanner" "Penetration Testing" "Malware" "Vulnerability Scanner")]
* Allowed Values: ("Application Scanner" "Malware" "Password Cracking" "Penetration Testing" "Port Scanner" "Traffic Scanner" "Vulnerability Scanner")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/AttackerToolTypeVocab-1.0/

## MapEntry: :references -> [String]

references to instances or additional information for this tool

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :references

#### String Value

* Plumatic Schema: [java.lang.String]

## MapEntry: :vendor -> String

information identifying the vendor organization for this tool

* This entry is optional

### Keyword Key

* Plumatic Schema: :vendor

### String Value

* Plumatic Schema: Str

## MapEntry: :service_pack -> String

service pack descriptor for this tool

* This entry is optional

### Keyword Key

* Plumatic Schema: :service_pack

### String Value

* Plumatic Schema: Str

<a name="map5"/>
# *VictimTargeting* Map

[return](#map5-ref)

* Reference: See http://stixproject.github.io/data-model/1.2/ttp/VictimTargetingType/

## MapEntry: :identity -> Map

infrastructure observed to have been utilized for cyber attack

* This entry is optional

### Keyword Key

* Plumatic Schema: :identity

<a name="map3-ref"/>
### Map Value

[Map](#map3)

## MapEntry: :targeted_systems -> [String]

type of system that is targeted

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :targeted_systems

#### String Value

* Plumatic Schema: [(enum "Third-Party Services" "Industrial Control Systems - Equipment Under Control" "Industrial Control Systems - Safety, Protection and Local Control" "Third-Party Services - Software Update" "Mobile Systems - Mobile Operating Systems" "Industrial Control Systems - Operations Management" "Mobile Systems - Mobile Devices" "Industrial Control Systems" "Enterprise Systems - Enterprise Technologies and Support Infrastructure" "Third-Party Services - Social Media" "Enterprise Systems - VoIP" "Enterprise Systems - Database Layer" "Industrial Control Systems - Supervisory Control" "Enterprise Systems - Application Layer" "Mobile Systems" "Users" "Third-Party Services - Security Vendors" "Third-Party Services - Application Stores" "Enterprise Systems - Networking Devices" "Mobile Systems - Near Field Communications" "Users - Workstation" "Users - Application And Software" "Enterprise Systems - Web Layer" "Users - Removable Media" "Enterprise Systems" "Third-Party Services - Cloud Services" "Enterprise Systems - Network Systems")]
* Allowed Values: ("Enterprise Systems" "Enterprise Systems - Application Layer" "Enterprise Systems - Database Layer" "Enterprise Systems - Enterprise Technologies and Support Infrastructure" "Enterprise Systems - Network Systems" "Enterprise Systems - Networking Devices" "Enterprise Systems - VoIP" "Enterprise Systems - Web Layer" "Industrial Control Systems" "Industrial Control Systems - Equipment Under Control" "Industrial Control Systems - Operations Management" "Industrial Control Systems - Safety, Protection and Local Control" "Industrial Control Systems - Supervisory Control" "Mobile Systems" "Mobile Systems - Mobile Devices" "Mobile Systems - Mobile Operating Systems" "Mobile Systems - Near Field Communications" "Third-Party Services" "Third-Party Services - Application Stores" "Third-Party Services - Cloud Services" "Third-Party Services - Security Vendors" "Third-Party Services - Social Media" "Third-Party Services - Software Update" "Users" "Users - Application And Software" "Users - Removable Media" "Users - Workstation")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/SystemTypeVocab-1.0/

## MapEntry: :targeted_information -> [String]

a type of information that is targeted

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :targeted_information

#### String Value

* Plumatic Schema: [(enum "Information Assets" "Information Assets - User Credentials" "Information Assets - Mobile Phone Contacts" "Authentication Cookies" "Information Assets - Customer PII" "Information Assets - Corporate Employee Information" "Information Assets - Email Lists / Archives" "Information Assets - Financial Data" "Information Assets - Intellectual Property")]
* Allowed Values: ("Authentication Cookies" "Information Assets" "Information Assets - Corporate Employee Information" "Information Assets - Customer PII" "Information Assets - Email Lists / Archives" "Information Assets - Financial Data" "Information Assets - Intellectual Property" "Information Assets - Mobile Phone Contacts" "Information Assets - User Credentials")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/InformationTypeVocab-1.0/

## MapEntry: :targeted_observables -> [Map]

targeted observables

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :targeted_observables

<a name="map4-ref"/>
#### Map Value

[Map](#map4)

<a name="map4"/>
# Map

[return](#map4-ref)

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.


## MapEntry: :value -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :value

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

Observable type names

* Plumatic Schema: (enum "device" "url" "pki-serial" "user" "ipv6" "email" "sha256" "sha1" "md5" "ip" "domain" "imei" "imsi" "amp-device")
* Allowed Values: ("amp-device" "device" "domain" "email" "imei" "imsi" "ip" "ipv6" "md5" "pki-serial" "sha1" "sha256" "url" "user")

<a name="map3"/>
# Map

[return](#map3-ref)

* Reference: http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/

## MapEntry: :description -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :description

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :related_identities -> [Map]

identifies other entity Identities related to this entity Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :related_identities

<a name="map3-ref"/>
#### Map Value

[Map](#map3)

<a name="map3"/>
# Map

[return](#map3-ref)

* Reference: http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/

## MapEntry: :identity -> String

specifies the level of confidence in the assertion of the relationship between the two components

* This entry is required

### Keyword Key

* Plumatic Schema: :identity

### String Value

A URI leading to an entity

* Plumatic Schema: Str

## MapEntry: :confidence -> String

specifies the level of confidence in the assertion of the relationship between the two components

* This entry is optional

### Keyword Key

* Plumatic Schema: :confidence

### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :information_source -> String

specifies the source of the information about the relationship between the two components

* This entry is optional

### Keyword Key

* Plumatic Schema: :information_source

### String Value

* Plumatic Schema: Str

## MapEntry: :relationship -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :relationship

### String Value

* Plumatic Schema: java.lang.String

<a name="map6"/>
# *RelatedExploitTarget* Map

[return](#map6-ref)


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

## MapEntry: :exploit_target_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :exploit_target_id

### String Value

A URI leading to an exploit target

* Plumatic Schema: Str

<a name="map7"/>
# *RelatedTTP* Map

[return](#map7-ref)


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

## MapEntry: :ttp_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :ttp_id

### String Value

A URI leading to a TTP

* Plumatic Schema: Str
