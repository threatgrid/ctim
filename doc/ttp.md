<a name="top"/>
# *TTP* Map

http://stixproject.github.io/data-model/1.2/ttp/TTPType/


## MapEntry: :id -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :id

* String Value
  * The URI of this entity.
  * Plumatic Schema: Str

## MapEntry: :type -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: Str

## MapEntry: :schema_version -> String

CTIM schema version for this entity

* This entry is required

* Keyword Key
  * Plumatic Schema: :schema_version

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "0.1.8"

## MapEntry: :uri -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :uri

* String Value
  * A URI
  * Plumatic Schema: Str

## MapEntry: :revision -> Integer

* This entry is optional

* Keyword Key
  * Plumatic Schema: :revision

* Integer Value
  * Plumatic Schema: Int

## MapEntry: :external_ids -> [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :external_ids

* String Value
  * Plumatic Schema: [Str]

## MapEntry: :timestamp -> Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :timestamp

* Inst (Date) Value
  * Schema definition for all date or timestamp values.
  * Plumatic Schema: Inst

## MapEntry: :language -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :language

* String Value
  * Plumatic Schema: Str

## MapEntry: :tlp -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :tlp

* String Value
  * TLP Stand for Traffic Light Protocol (https://www.us-cert.gov/tlp). Precise how this resource is intended to be shared, replicated, copied...
  * Plumatic Schema: (enum ...)
  * Default: green
  * Allowed Values: ("amber" "green" "red" "white")

## MapEntry: :title -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :title

* String Value
  * Plumatic Schema: Str

## MapEntry: :description -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

## MapEntry: :short_description -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * Plumatic Schema: Str

## MapEntry: :source -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry: :source_uri -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source_uri

* String Value
  * A URI
  * Plumatic Schema: Str

## MapEntry: :type -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "ttp"

## MapEntry: :valid_time -> *ValidTime* Map

a timestamp for the definition of a specific version of a TTP item

* This entry is required

* Keyword Key
  * Plumatic Schema: :valid_time

<a name="map1-ref"/>
* *ValidTime* Map Value
  * Details: [*ValidTime* Map](#map1)

## MapEntry: :ttp_type -> String

type of this TTP

* This entry is required

* Keyword Key
  * Plumatic Schema: :ttp_type

* String Value
  * Plumatic Schema: Str

## MapEntry: :indicators -> [*RelatedIndicator* Map]

related indicators

* This entry is required
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :indicators

<a name="map2-ref"/>
* *RelatedIndicator* Map Value
  * Details: [*RelatedIndicator* Map](#map2)

## MapEntry: :intended_effect -> [String]

the suspected intended effect for this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :intended_effect

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values: ("Account Takeover" "Advantage" "Advantage - Economic" "Advantage - Military" "Advantage - Political" "Brand Damage" "Competitive Advantage" "Degradation of Service" "Denial and Deception" "Destruction" "Disruption" "Embarrassment" "Exposure" "Extortion" "Fraud" "Harassment" "ICS Control" "Theft" "Theft - Credential Theft" "Theft - Identity Theft" "Theft - Intellectual Property" "Theft - Theft of Proprietary Information" "Traffic Diversion" "Unauthorized Access")

## MapEntry: :behavior -> *Behavior* Map

describes the attack patterns, malware, or exploits that the attacker leverages to execute this TTP

* This entry is optional

* Keyword Key
  * Plumatic Schema: :behavior

<a name="map3-ref"/>
* *Behavior* Map Value
  * Details: [*Behavior* Map](#map3)

## MapEntry: :resources -> *Resource* Map

infrastructure or tools that the adversary uses to execute this TTP

* This entry is optional

* Keyword Key
  * Plumatic Schema: :resources

<a name="map4-ref"/>
* *Resource* Map Value
  * Details: [*Resource* Map](#map4)

## MapEntry: :victim_targeting -> *VictimTargeting* Map

characterizes the people, organizations, information or access being targeted

* This entry is optional

* Keyword Key
  * Plumatic Schema: :victim_targeting

<a name="map5-ref"/>
* *VictimTargeting* Map Value
  * Details: [*VictimTargeting* Map](#map5)

## MapEntry: :exploit_targets -> [*RelatedExploitTarget* Map]

potential vulnerability, weakness or configuration targets for exploitation by this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :exploit_targets

<a name="map6-ref"/>
* *RelatedExploitTarget* Map Value
  * Details: [*RelatedExploitTarget* Map](#map6)

## MapEntry: :related_TTPs -> [*RelatedTTP* Map]

specifies other TTPs asserted to be related to this cyber threat TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_TTPs

<a name="map7-ref"/>
* *RelatedTTP* Map Value
  * Details: [*RelatedTTP* Map](#map7)

## MapEntry: :kill_chains -> [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :kill_chains

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values: ("Actions on Objectives" "Command & Control" "Delivery" "Exploitation" "Installation" "Reconnaissance" "Weaponization")

<a name="map1"/>
# *ValidTime* Map

[return](#map1-ref)

* Reference: http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/

## MapEntry: :start_time -> Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

* Keyword Key
  * Plumatic Schema: :start_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.
  * Plumatic Schema: Inst

## MapEntry: :end_time -> Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

* Keyword Key
  * Plumatic Schema: :end_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.
  * Plumatic Schema: Inst

<a name="map2"/>
# *RelatedIndicator* Map

[return](#map2-ref)


## MapEntry: :confidence -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
  * Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :source -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry: :relationship -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

## MapEntry: :indicator_id -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :indicator_id

* String Value
  * A URI leading to an indicator
  * Plumatic Schema: Str

<a name="map3"/>
# *Behavior* Map

[return](#map3-ref)

* Reference: http://stixproject.github.io/data-model/1.2/ttp/BehaviorType/

## MapEntry: :attack_patterns -> [*AttackPattern* Map]

one or more Attack Patterns for this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :attack_patterns

<a name="map8-ref"/>
* *AttackPattern* Map Value
  * Details: [*AttackPattern* Map](#map8)

## MapEntry: :malware_type -> [*MalwareInstance* Map]

one or more instances of Malware for this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :malware_type

<a name="map9-ref"/>
* *MalwareInstance* Map Value
  * Details: [*MalwareInstance* Map](#map9)

<a name="map9"/>
# *MalwareInstance* Map

[return](#map9-ref)

* Reference: http://stixproject.github.io/data-model/1.2/ttp/MalwareInstanceType/

## MapEntry: :title -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :title

* String Value
  * Plumatic Schema: Str

## MapEntry: :description -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

## MapEntry: :short_description -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * Plumatic Schema: Str

## MapEntry: :type -> [String]

a characterization of what type of malware this

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values: ("Adware" "Automated Transfer Scripts" "Bot" "Bot - Credential Theft" "Bot - DDoS" "Bot - Loader" "Bot - Spam" "Dialer" "DoS / DDoS - Participatory" "DoS / DDoS - Script" "DoS / DDoS - Stress Test Tools" "DoS/ DDoS" "Exploit Kit" "POS / ATM Malware" "Ransomware" "Remote Access Trojan" "Rogue Antivirus" "Rootkit")

<a name="map8"/>
# *AttackPattern* Map

[return](#map8-ref)

* Reference: http://stixproject.github.io/data-model/1.2/ttp/AttackPatternType/

## MapEntry: :title -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :title

* String Value
  * Plumatic Schema: Str

## MapEntry: :description -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

## MapEntry: :short_description -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * Plumatic Schema: Str

## MapEntry: :capec_id -> String

a reference to a particular entry within the Common Attack Pattern Enumeration and Classification

* This entry is optional

* Keyword Key
  * Plumatic Schema: :capec_id

* String Value
  * Plumatic Schema: Str

<a name="map4"/>
# *Resource* Map

[return](#map4-ref)

* Reference: http://stixproject.github.io/data-model/1.2/ttp/ResourceType/

## MapEntry: :tools -> *Tool* Map

The tool leveraged by this TTP

* This entry is optional

* Keyword Key
  * Plumatic Schema: :tools

<a name="map10-ref"/>
* *Tool* Map Value
  * Details: [*Tool* Map](#map10)

## MapEntry: :infrastructure -> *Infrastructure* Map

infrastructure observed to have been utilized for cyber attack

* This entry is optional

* Keyword Key
  * Plumatic Schema: :infrastructure

<a name="map11-ref"/>
* *Infrastructure* Map Value
  * Details: [*Infrastructure* Map](#map11)

## MapEntry: :personas -> *Identity* Map

* This entry is optional

* Keyword Key
  * Plumatic Schema: :personas

<a name="map12-ref"/>
* *Identity* Map Value
  * Details: [*Identity* Map](#map12)

<a name="map12"/>
# *Identity* Map

[return](#map12-ref)

* Reference: http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/

## MapEntry: :description -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Plumatic Schema: Str

## MapEntry: :related_identities -> [*RelatedIdentity* Map]

identifies other entity Identities related to this entity Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_identities

<a name="map13-ref"/>
* *RelatedIdentity* Map Value
  * Details: [*RelatedIdentity* Map](#map13)

<a name="map13"/>
# *RelatedIdentity* Map

[return](#map13-ref)

* Reference: http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/

## MapEntry: :identity -> String

specifies the level of confidence in the assertion of the relationship between the two components

* This entry is required

* Keyword Key
  * Plumatic Schema: :identity

* String Value
  * A URI leading to an entity
  * Plumatic Schema: Str

## MapEntry: :confidence -> String

specifies the level of confidence in the assertion of the relationship between the two components

* This entry is optional

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
  * Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :information_source -> String

specifies the source of the information about the relationship between the two components

* This entry is optional

* Keyword Key
  * Plumatic Schema: :information_source

* String Value
  * Plumatic Schema: Str

## MapEntry: :relationship -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

<a name="map11"/>
# *Infrastructure* Map

[return](#map11-ref)

* Reference: http://stixproject.github.io/data-model/1.2/ttp/Infrastructure Type/

## MapEntry: :title -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :title

* String Value
  * Plumatic Schema: Str

## MapEntry: :description -> String

text (Markdown) description of specific classes or instances of infrastructure utilized for cyber attack

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

## MapEntry: :short_description -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * Plumatic Schema: Str

## MapEntry: :type -> String

represents the type of infrastructure being described

* This entry is optional

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values: ("Anonymization" "Anonymization - Proxy" "Anonymization - TOR Network" "Anonymization - VPN" "Communications" "Communications - Blogs" "Communications - Forums" "Communications - Internet Relay Chat" "Communications - Micro-Blogs" "Communications - Mobile Communications" "Communications - Social Networks" "Communications - User-Generated Content Websites" "Domain Registration" "Domain Registration - Dynamic DNS Services" "Domain Registration - Legitimate Domain Registration Services" "Domain Registration - Malicious Domain Registrars" "Domain Registration - Top-Level Domain Registrars" "Electronic Payment Methods" "Hosting" "Hosting - Bulletproof / Rogue Hosting" "Hosting - Cloud Hosting" "Hosting - Compromised Server" "Hosting - Fast Flux Botnet Hosting" "Hosting - Legitimate Hosting")
  * Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/AttackerInfrastructureTypeVocab-1.0/

<a name="map10"/>
# *Tool* Map

[return](#map10-ref)

* Reference: http://stixproject.github.io/data-model/1.2/cyboxCommon/ToolInformationType/

## MapEntry: :description -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Plumatic Schema: Str

## MapEntry: :type -> [String]

type of the tool leveraged

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values: ("Application Scanner" "Malware" "Password Cracking" "Penetration Testing" "Port Scanner" "Traffic Scanner" "Vulnerability Scanner")
  * Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/AttackerToolTypeVocab-1.0/

## MapEntry: :references -> [String]

references to instances or additional information for this tool

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :references

* String Value
  * Plumatic Schema: [Str]

## MapEntry: :vendor -> String

information identifying the vendor organization for this tool

* This entry is optional

* Keyword Key
  * Plumatic Schema: :vendor

* String Value
  * Plumatic Schema: Str

## MapEntry: :service_pack -> String

service pack descriptor for this tool

* This entry is optional

* Keyword Key
  * Plumatic Schema: :service_pack

* String Value
  * Plumatic Schema: Str

<a name="map5"/>
# *VictimTargeting* Map

[return](#map5-ref)

* Reference: See http://stixproject.github.io/data-model/1.2/ttp/VictimTargetingType/

## MapEntry: :identity -> *Identity* Map

infrastructure observed to have been utilized for cyber attack

* This entry is optional

* Keyword Key
  * Plumatic Schema: :identity

<a name="map14-ref"/>
* *Identity* Map Value
  * Details: [*Identity* Map](#map14)

## MapEntry: :targeted_systems -> [String]

type of system that is targeted

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :targeted_systems

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values: ("Enterprise Systems" "Enterprise Systems - Application Layer" "Enterprise Systems - Database Layer" "Enterprise Systems - Enterprise Technologies and Support Infrastructure" "Enterprise Systems - Network Systems" "Enterprise Systems - Networking Devices" "Enterprise Systems - VoIP" "Enterprise Systems - Web Layer" "Industrial Control Systems" "Industrial Control Systems - Equipment Under Control" "Industrial Control Systems - Operations Management" "Industrial Control Systems - Safety, Protection and Local Control" "Industrial Control Systems - Supervisory Control" "Mobile Systems" "Mobile Systems - Mobile Devices" "Mobile Systems - Mobile Operating Systems" "Mobile Systems - Near Field Communications" "Third-Party Services" "Third-Party Services - Application Stores" "Third-Party Services - Cloud Services" "Third-Party Services - Security Vendors" "Third-Party Services - Social Media" "Third-Party Services - Software Update" "Users" "Users - Application And Software" "Users - Removable Media" "Users - Workstation")
  * Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/SystemTypeVocab-1.0/

## MapEntry: :targeted_information -> [String]

a type of information that is targeted

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :targeted_information

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values: ("Authentication Cookies" "Information Assets" "Information Assets - Corporate Employee Information" "Information Assets - Customer PII" "Information Assets - Email Lists / Archives" "Information Assets - Financial Data" "Information Assets - Intellectual Property" "Information Assets - Mobile Phone Contacts" "Information Assets - User Credentials")
  * Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/InformationTypeVocab-1.0/

## MapEntry: :targeted_observables -> [*Observable* Map]

targeted observables

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :targeted_observables

<a name="map15-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map15)

<a name="map15"/>
# *Observable* Map

[return](#map15-ref)

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.


## MapEntry: :value -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

## MapEntry: :type -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Observable type names
  * Plumatic Schema: (enum ...)
  * Allowed Values: ("amp-device" "device" "domain" "email" "imei" "imsi" "ip" "ipv6" "md5" "pki-serial" "sha1" "sha256" "url" "user")

<a name="map14"/>
# *Identity* Map

[return](#map14-ref)

* Reference: http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/

## MapEntry: :description -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Plumatic Schema: Str

## MapEntry: :related_identities -> [*RelatedIdentity* Map]

identifies other entity Identities related to this entity Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_identities

<a name="map16-ref"/>
* *RelatedIdentity* Map Value
  * Details: [*RelatedIdentity* Map](#map16)

<a name="map16"/>
# *RelatedIdentity* Map

[return](#map16-ref)

* Reference: http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/

## MapEntry: :identity -> String

specifies the level of confidence in the assertion of the relationship between the two components

* This entry is required

* Keyword Key
  * Plumatic Schema: :identity

* String Value
  * A URI leading to an entity
  * Plumatic Schema: Str

## MapEntry: :confidence -> String

specifies the level of confidence in the assertion of the relationship between the two components

* This entry is optional

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
  * Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :information_source -> String

specifies the source of the information about the relationship between the two components

* This entry is optional

* Keyword Key
  * Plumatic Schema: :information_source

* String Value
  * Plumatic Schema: Str

## MapEntry: :relationship -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

<a name="map6"/>
# *RelatedExploitTarget* Map

[return](#map6-ref)


## MapEntry: :confidence -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
  * Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :source -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry: :relationship -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

## MapEntry: :exploit_target_id -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :exploit_target_id

* String Value
  * A URI leading to an exploit target
  * Plumatic Schema: Str

<a name="map7"/>
# *RelatedTTP* Map

[return](#map7-ref)


## MapEntry: :confidence -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
  * Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :source -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry: :relationship -> String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

## MapEntry: :ttp_id -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :ttp_id

* String Value
  * A URI leading to a TTP
  * Plumatic Schema: Str
