<a name="top"/>
# *StoredTTP* Map

An ttp as stored in the data store

| key | type | required? |
| --- | ---- | --------- |
|[:behavior](#mapentry-behavior-behaviormap)|*Behavior* Map||
|[:created](#mapentry-created-instdate)|Inst (Date)|&#10003;|
|[:description](#mapentry-description-string)|String||
|[:exploit_targets](#mapentry-exploit_targets-relatedexploittargetmap)|*RelatedExploitTarget* Map||
|[:external_ids](#mapentry-external_ids-string)|String||
|[:id](#mapentry-id-string)|String|&#10003;|
|[:indicators](#mapentry-indicators-relatedindicatormap)|*RelatedIndicator* Map|&#10003;|
|[:intended_effect](#mapentry-intended_effect-string)|String||
|[:kill_chains](#mapentry-kill_chains-string)|String||
|[:language](#mapentry-language-string)|String||
|[:modified](#mapentry-modified-instdate)|Inst (Date)||
|[:owner](#mapentry-owner-string)|String|&#10003;|
|[:related_TTPs](#mapentry-related_ttps-relatedttpmap)|*RelatedTTP* Map||
|[:resources](#mapentry-resources-resourcemap)|*Resource* Map||
|[:revision](#mapentry-revision-integer)|Integer||
|[:schema_version](#mapentry-schema_version-string)|String|&#10003;|
|[:short_description](#mapentry-short_description-string)|String||
|[:source](#mapentry-source-string)|String||
|[:source_uri](#mapentry-source_uri-string)|String||
|[:timestamp](#mapentry-timestamp-instdate)|Inst (Date)||
|[:title](#mapentry-title-string)|String||
|[:tlp](#mapentry-tlp-string)|String||
|[:ttp_type](#mapentry-ttp_type-string)|String|&#10003;|
|[:type](#mapentry-type-string)|String|&#10003;|
|[:uri](#mapentry-uri-string)|String||
|[:valid_time](#mapentry-valid_time-validtimemap)|*ValidTime* Map|&#10003;|
|[:victim_targeting](#mapentry-victim_targeting-victimtargetingmap)|*VictimTargeting* Map||

<a name="mapentry-behavior-behaviormap"/>
## MapEntry :behavior ∷ *Behavior* Map

describes the attack patterns, malware, or exploits that the attacker leverages to execute this TTP

* This entry is optional

* Keyword Key
  * Plumatic Schema: :behavior

<a name="map3-ref"/>
* *Behavior* Map Value
  * Details: [*Behavior* Map](#map3)

<a name="mapentry-created-instdate"/>
## MapEntry :created ∷ Inst (Date)

* This entry is required

* Keyword Key
  * Plumatic Schema: :created

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-description-string"/>
## MapEntry :description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

<a name="mapentry-exploit_targets-relatedexploittargetmap"/>
## MapEntry :exploit_targets ∷ [*RelatedExploitTarget* Map]

potential vulnerability, weakness or configuration targets for exploitation by this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :exploit_targets

<a name="map6-ref"/>
* *RelatedExploitTarget* Map Value
  * Details: [*RelatedExploitTarget* Map](#map6)

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

<a name="mapentry-indicators-relatedindicatormap"/>
## MapEntry :indicators ∷ [*RelatedIndicator* Map]

related indicators

* This entry is required
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :indicators

<a name="map2-ref"/>
* *RelatedIndicator* Map Value
  * Details: [*RelatedIndicator* Map](#map2)

<a name="mapentry-intended_effect-string"/>
## MapEntry :intended_effect ∷ [String]

the suspected intended effect for this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :intended_effect

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values:
    * Account Takeover
    * Advantage
    * Advantage - Economic
    * Advantage - Military
    * Advantage - Political
    * Brand Damage
    * Competitive Advantage
    * Degradation of Service
    * Denial and Deception
    * Destruction
    * Disruption
    * Embarrassment
    * Exposure
    * Extortion
    * Fraud
    * Harassment
    * ICS Control
    * Theft
    * Theft - Credential Theft
    * Theft - Identity Theft
    * Theft - Intellectual Property
    * Theft - Theft of Proprietary Information
    * Traffic Diversion
    * Unauthorized Access

<a name="mapentry-kill_chains-string"/>
## MapEntry :kill_chains ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :kill_chains

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values:
    * Actions on Objectives
    * Command & Control
    * Delivery
    * Exploitation
    * Installation
    * Reconnaissance
    * Weaponization

<a name="mapentry-language-string"/>
## MapEntry :language ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :language

* String Value
  * Plumatic Schema: Str

<a name="mapentry-modified-instdate"/>
## MapEntry :modified ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :modified

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-owner-string"/>
## MapEntry :owner ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :owner

* String Value
  * Plumatic Schema: Str

<a name="mapentry-related_ttps-relatedttpmap"/>
## MapEntry :related_TTPs ∷ [*RelatedTTP* Map]

specifies other TTPs asserted to be related to this cyber threat TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_TTPs

<a name="map7-ref"/>
* *RelatedTTP* Map Value
  * Details: [*RelatedTTP* Map](#map7)

<a name="mapentry-resources-resourcemap"/>
## MapEntry :resources ∷ *Resource* Map

infrastructure or tools that the adversary uses to execute this TTP

* This entry is optional

* Keyword Key
  * Plumatic Schema: :resources

<a name="map4-ref"/>
* *Resource* Map Value
  * Details: [*Resource* Map](#map4)

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

<a name="mapentry-ttp_type-string"/>
## MapEntry :ttp_type ∷ String

type of this TTP

* This entry is required

* Keyword Key
  * Plumatic Schema: :ttp_type

* String Value
  * Plumatic Schema: Str

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "ttp"

<a name="mapentry-uri-string"/>
## MapEntry :uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :uri

* String Value
  * A URI
  * Plumatic Schema: Str

<a name="mapentry-valid_time-validtimemap"/>
## MapEntry :valid_time ∷ *ValidTime* Map

a timestamp for the definition of a specific version of a TTP item

* This entry is required

* Keyword Key
  * Plumatic Schema: :valid_time

<a name="map1-ref"/>
* *ValidTime* Map Value
  * Details: [*ValidTime* Map](#map1)

<a name="mapentry-victim_targeting-victimtargetingmap"/>
## MapEntry :victim_targeting ∷ *VictimTargeting* Map

characterizes the people, organizations, information or access being targeted

* This entry is optional

* Keyword Key
  * Plumatic Schema: :victim_targeting

<a name="map5-ref"/>
* *VictimTargeting* Map Value
  * Details: [*VictimTargeting* Map](#map5)

<a name="map1"/>
# *ValidTime* Map

Period of time when a cyber observation is valid.

| key | type | required? |
| --- | ---- | --------- |
|[:end_time](#mapentry-end_time-instdate)|Inst (Date)||
|[:start_time](#mapentry-start_time-instdate)|Inst (Date)||
* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a name="mapentry-end_time-instdate"/>
## MapEntry :end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional

* Keyword Key
  * Plumatic Schema: :end_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-start_time-instdate"/>
## MapEntry :start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

* Keyword Key
  * Plumatic Schema: :start_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="map2"/>
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

<a name="map3"/>
# *Behavior* Map

| key | type | required? |
| --- | ---- | --------- |
|[:attack_patterns](#mapentry-attack_patterns-attackpatternmap)|*AttackPattern* Map||
|[:malware_type](#mapentry-malware_type-malwareinstancemap)|*MalwareInstance* Map||
* Reference: [BehaviorType](http://stixproject.github.io/data-model/1.2/ttp/BehaviorType/)

<a name="mapentry-attack_patterns-attackpatternmap"/>
## MapEntry :attack_patterns ∷ [*AttackPattern* Map]

one or more Attack Patterns for this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :attack_patterns

<a name="map8-ref"/>
* *AttackPattern* Map Value
  * Details: [*AttackPattern* Map](#map8)

<a name="mapentry-malware_type-malwareinstancemap"/>
## MapEntry :malware_type ∷ [*MalwareInstance* Map]

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

| key | type | required? |
| --- | ---- | --------- |
|[:description](#mapentry-description-string)|String||
|[:short_description](#mapentry-short_description-string)|String||
|[:title](#mapentry-title-string)|String||
|[:type](#mapentry-type-string)|String||
* Reference: [MalwareInstanceType](http://stixproject.github.io/data-model/1.2/ttp/MalwareInstanceType/)

<a name="mapentry-description-string"/>
## MapEntry :description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

<a name="mapentry-short_description-string"/>
## MapEntry :short_description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * Plumatic Schema: Str

<a name="mapentry-title-string"/>
## MapEntry :title ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :title

* String Value
  * Plumatic Schema: Str

<a name="mapentry-type-string"/>
## MapEntry :type ∷ [String]

a characterization of what type of malware this

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values:
    * Adware
    * Automated Transfer Scripts
    * Bot
    * Bot - Credential Theft
    * Bot - DDoS
    * Bot - Loader
    * Bot - Spam
    * Dialer
    * DoS / DDoS - Participatory
    * DoS / DDoS - Script
    * DoS / DDoS - Stress Test Tools
    * DoS/ DDoS
    * Exploit Kit
    * POS / ATM Malware
    * Ransomware
    * Remote Access Trojan
    * Rogue Antivirus
    * Rootkit

<a name="map8"/>
# *AttackPattern* Map

| key | type | required? |
| --- | ---- | --------- |
|[:capec_id](#mapentry-capec_id-string)|String||
|[:description](#mapentry-description-string)|String||
|[:short_description](#mapentry-short_description-string)|String||
|[:title](#mapentry-title-string)|String||
* Reference: [AttackPatternType](http://stixproject.github.io/data-model/1.2/ttp/AttackPatternType/)

<a name="mapentry-capec_id-string"/>
## MapEntry :capec_id ∷ String

a reference to a particular entry within the Common Attack Pattern Enumeration and Classification

* This entry is optional

* Keyword Key
  * Plumatic Schema: :capec_id

* String Value
  * Plumatic Schema: Str

<a name="mapentry-description-string"/>
## MapEntry :description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

<a name="mapentry-short_description-string"/>
## MapEntry :short_description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * Plumatic Schema: Str

<a name="mapentry-title-string"/>
## MapEntry :title ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :title

* String Value
  * Plumatic Schema: Str

<a name="map4"/>
# *Resource* Map

| key | type | required? |
| --- | ---- | --------- |
|[:infrastructure](#mapentry-infrastructure-infrastructuremap)|*Infrastructure* Map||
|[:personas](#mapentry-personas-identitymap)|*Identity* Map||
|[:tools](#mapentry-tools-toolmap)|*Tool* Map||
* Reference: [ResourceType](http://stixproject.github.io/data-model/1.2/ttp/ResourceType/)

<a name="mapentry-infrastructure-infrastructuremap"/>
## MapEntry :infrastructure ∷ *Infrastructure* Map

infrastructure observed to have been utilized for cyber attack

* This entry is optional

* Keyword Key
  * Plumatic Schema: :infrastructure

<a name="map11-ref"/>
* *Infrastructure* Map Value
  * Details: [*Infrastructure* Map](#map11)

<a name="mapentry-personas-identitymap"/>
## MapEntry :personas ∷ *Identity* Map

* This entry is optional

* Keyword Key
  * Plumatic Schema: :personas

<a name="map12-ref"/>
* *Identity* Map Value
  * Details: [*Identity* Map](#map12)

<a name="mapentry-tools-toolmap"/>
## MapEntry :tools ∷ *Tool* Map

The tool leveraged by this TTP

* This entry is optional

* Keyword Key
  * Plumatic Schema: :tools

<a name="map10-ref"/>
* *Tool* Map Value
  * Details: [*Tool* Map](#map10)

<a name="map12"/>
# *Identity* Map

Describes a person or an organization

| key | type | required? |
| --- | ---- | --------- |
|[:description](#mapentry-description-string)|String|&#10003;|
|[:related_identities](#mapentry-related_identities-relatedidentitymap)|*RelatedIdentity* Map|&#10003;|
* Reference: [IdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/)

<a name="mapentry-description-string"/>
## MapEntry :description ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Plumatic Schema: Str

<a name="mapentry-related_identities-relatedidentitymap"/>
## MapEntry :related_identities ∷ [*RelatedIdentity* Map]

Identifies other entity Identities related to this Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_identities

<a name="map13-ref"/>
* *RelatedIdentity* Map Value
  * Details: [*RelatedIdentity* Map](#map13)

<a name="map13"/>
# *RelatedIdentity* Map

Describes a related Identity

| key | type | required? |
| --- | ---- | --------- |
|[:confidence](#mapentry-confidence-string)|String||
|[:identity](#mapentry-identity-string)|String|&#10003;|
|[:information_source](#mapentry-information_source-string)|String||
|[:relationship](#mapentry-relationship-string)|String||
* Reference: [RelatedIdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/)

<a name="mapentry-confidence-string"/>
## MapEntry :confidence ∷ String

Specifies the level of confidence in the assertion of the relationship between the two objects

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

<a name="mapentry-identity-string"/>
## MapEntry :identity ∷ String

The reference (URI) of the related Identity object

* This entry is required

* Keyword Key
  * Plumatic Schema: :identity

* String Value
  * A URI
  * Plumatic Schema: Str

<a name="mapentry-information_source-string"/>
## MapEntry :information_source ∷ String

Specifies the source of the information about the relationship between the two components

* This entry is optional

* Keyword Key
  * Plumatic Schema: :information_source

* String Value
  * Plumatic Schema: Str

<a name="mapentry-relationship-string"/>
## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

<a name="map11"/>
# *Infrastructure* Map

| key | type | required? |
| --- | ---- | --------- |
|[:description](#mapentry-description-string)|String||
|[:short_description](#mapentry-short_description-string)|String||
|[:title](#mapentry-title-string)|String||
|[:type](#mapentry-type-string)|String||
* Reference: [Infrastructure Type](http://stixproject.github.io/data-model/1.2/ttp/Infrastructure Type/)

<a name="mapentry-description-string"/>
## MapEntry :description ∷ String

text (Markdown) description of specific classes or instances of infrastructure utilized for cyber attack

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

<a name="mapentry-short_description-string"/>
## MapEntry :short_description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * Plumatic Schema: Str

<a name="mapentry-title-string"/>
## MapEntry :title ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :title

* String Value
  * Plumatic Schema: Str

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

represents the type of infrastructure being described

* This entry is optional

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Anonymization
    * Anonymization - Proxy
    * Anonymization - TOR Network
    * Anonymization - VPN
    * Communications
    * Communications - Blogs
    * Communications - Forums
    * Communications - Internet Relay Chat
    * Communications - Micro-Blogs
    * Communications - Mobile Communications
    * Communications - Social Networks
    * Communications - User-Generated Content Websites
    * Domain Registration
    * Domain Registration - Dynamic DNS Services
    * Domain Registration - Legitimate Domain Registration Services
    * Domain Registration - Malicious Domain Registrars
    * Domain Registration - Top-Level Domain Registrars
    * Electronic Payment Methods
    * Hosting
    * Hosting - Bulletproof / Rogue Hosting
    * Hosting - Cloud Hosting
    * Hosting - Compromised Server
    * Hosting - Fast Flux Botnet Hosting
    * Hosting - Legitimate Hosting
  * Reference: [AttackInfrastructureTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/AttackerInfrastructureTypeVocab-1.0/)

<a name="map10"/>
# *Tool* Map

Describes a hardware or software tool used

| key | type | required? |
| --- | ---- | --------- |
|[:description](#mapentry-description-string)|String|&#10003;|
|[:references](#mapentry-references-string)|String||
|[:service_pack](#mapentry-service_pack-string)|String||
|[:type](#mapentry-type-string)|String||
|[:vendor](#mapentry-vendor-string)|String||
* Reference: [ToolInformationType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ToolInformationType/)

<a name="mapentry-description-string"/>
## MapEntry :description ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Plumatic Schema: Str

<a name="mapentry-references-string"/>
## MapEntry :references ∷ [String]

references to instances or additional information for this tool

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :references

* String Value
  * Plumatic Schema: [Str]

<a name="mapentry-service_pack-string"/>
## MapEntry :service_pack ∷ String

service pack descriptor for this tool

* This entry is optional

* Keyword Key
  * Plumatic Schema: :service_pack

* String Value
  * Plumatic Schema: Str

<a name="mapentry-type-string"/>
## MapEntry :type ∷ [String]

type of the tool leveraged

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values:
    * Application Scanner
    * Malware
    * Password Cracking
    * Penetration Testing
    * Port Scanner
    * Traffic Scanner
    * Vulnerability Scanner
  * Reference: [AttackerToolTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/AttackerToolTypeVocab-1.0/)

<a name="mapentry-vendor-string"/>
## MapEntry :vendor ∷ String

information identifying the vendor organization for this tool

* This entry is optional

* Keyword Key
  * Plumatic Schema: :vendor

* String Value
  * Plumatic Schema: Str

<a name="map5"/>
# *VictimTargeting* Map

| key | type | required? |
| --- | ---- | --------- |
|[:identity](#mapentry-identity-identitymap)|*Identity* Map||
|[:targeted_information](#mapentry-targeted_information-string)|String||
|[:targeted_observables](#mapentry-targeted_observables-observablemap)|*Observable* Map||
|[:targeted_systems](#mapentry-targeted_systems-string)|String||
* Reference: [VictimTargetingType](http://stixproject.github.io/data-model/1.2/ttp/VictimTargetingType/)

<a name="mapentry-identity-identitymap"/>
## MapEntry :identity ∷ *Identity* Map

infrastructure observed to have been utilized for cyber attack

* This entry is optional

* Keyword Key
  * Plumatic Schema: :identity

<a name="map14-ref"/>
* *Identity* Map Value
  * Details: [*Identity* Map](#map14)

<a name="mapentry-targeted_information-string"/>
## MapEntry :targeted_information ∷ [String]

a type of information that is targeted

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :targeted_information

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values:
    * Authentication Cookies
    * Information Assets
    * Information Assets - Corporate Employee Information
    * Information Assets - Customer PII
    * Information Assets - Email Lists / Archives
    * Information Assets - Financial Data
    * Information Assets - Intellectual Property
    * Information Assets - Mobile Phone Contacts
    * Information Assets - User Credentials
  * Reference: [InformationTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/InformationTypeVocab-1.0/)

<a name="mapentry-targeted_observables-observablemap"/>
## MapEntry :targeted_observables ∷ [*Observable* Map]

targeted observables

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Was targeted_technical_details

* Keyword Key
  * Plumatic Schema: :targeted_observables

<a name="map15-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map15)

<a name="mapentry-targeted_systems-string"/>
## MapEntry :targeted_systems ∷ [String]

type of system that is targeted

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :targeted_systems

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values:
    * Enterprise Systems
    * Enterprise Systems - Application Layer
    * Enterprise Systems - Database Layer
    * Enterprise Systems - Enterprise Technologies and Support Infrastructure
    * Enterprise Systems - Network Systems
    * Enterprise Systems - Networking Devices
    * Enterprise Systems - VoIP
    * Enterprise Systems - Web Layer
    * Industrial Control Systems
    * Industrial Control Systems - Equipment Under Control
    * Industrial Control Systems - Operations Management
    * Industrial Control Systems - Safety, Protection and Local Control
    * Industrial Control Systems - Supervisory Control
    * Mobile Systems
    * Mobile Systems - Mobile Devices
    * Mobile Systems - Mobile Operating Systems
    * Mobile Systems - Near Field Communications
    * Third-Party Services
    * Third-Party Services - Application Stores
    * Third-Party Services - Cloud Services
    * Third-Party Services - Security Vendors
    * Third-Party Services - Social Media
    * Third-Party Services - Software Update
    * Users
    * Users - Application And Software
    * Users - Removable Media
    * Users - Workstation
  * Reference: [SystemTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/SystemTypeVocab-1.0/)

<a name="map15"/>
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

<a name="map14"/>
# *Identity* Map

Describes a person or an organization

| key | type | required? |
| --- | ---- | --------- |
|[:description](#mapentry-description-string)|String|&#10003;|
|[:related_identities](#mapentry-related_identities-relatedidentitymap)|*RelatedIdentity* Map|&#10003;|
* Reference: [IdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/)

<a name="mapentry-description-string"/>
## MapEntry :description ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Plumatic Schema: Str

<a name="mapentry-related_identities-relatedidentitymap"/>
## MapEntry :related_identities ∷ [*RelatedIdentity* Map]

Identifies other entity Identities related to this Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_identities

<a name="map16-ref"/>
* *RelatedIdentity* Map Value
  * Details: [*RelatedIdentity* Map](#map16)

<a name="map16"/>
# *RelatedIdentity* Map

Describes a related Identity

| key | type | required? |
| --- | ---- | --------- |
|[:confidence](#mapentry-confidence-string)|String||
|[:identity](#mapentry-identity-string)|String|&#10003;|
|[:information_source](#mapentry-information_source-string)|String||
|[:relationship](#mapentry-relationship-string)|String||
* Reference: [RelatedIdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/)

<a name="mapentry-confidence-string"/>
## MapEntry :confidence ∷ String

Specifies the level of confidence in the assertion of the relationship between the two objects

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

<a name="mapentry-identity-string"/>
## MapEntry :identity ∷ String

The reference (URI) of the related Identity object

* This entry is required

* Keyword Key
  * Plumatic Schema: :identity

* String Value
  * A URI
  * Plumatic Schema: Str

<a name="mapentry-information_source-string"/>
## MapEntry :information_source ∷ String

Specifies the source of the information about the relationship between the two components

* This entry is optional

* Keyword Key
  * Plumatic Schema: :information_source

* String Value
  * Plumatic Schema: Str

<a name="mapentry-relationship-string"/>
## MapEntry :relationship ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :relationship

* String Value
  * Plumatic Schema: Str

<a name="map6"/>
# *RelatedExploitTarget* Map

| key | type | required? |
| --- | ---- | --------- |
|[:confidence](#mapentry-confidence-string)|String||
|[:exploit_target_id](#mapentry-exploit_target_id-string)|String|&#10003;|
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

<a name="mapentry-exploit_target_id-string"/>
## MapEntry :exploit_target_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :exploit_target_id

* String Value
  * A URI leading to an exploit target
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

<a name="map7"/>
# *RelatedTTP* Map

| key | type | required? |
| --- | ---- | --------- |
|[:TTP_id](#mapentry-ttp_id-string)|String|&#10003;|
|[:confidence](#mapentry-confidence-string)|String||
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||

<a name="mapentry-ttp_id-string"/>
## MapEntry :TTP_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :TTP_id

* String Value
  * A URI leading to a TTP
  * Plumatic Schema: Str

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
