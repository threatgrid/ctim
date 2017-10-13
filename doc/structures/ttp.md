<a id="top"></a>
# *TTP* Object

A TTP is an instance of a Tool, Technique, or Procedure used by a cyber [actor](actor.md)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)| String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[ttp_type](#propertyttp_type-string)| String|type of this TTP|&#10003;|
|[type](#propertytype-ttptypeidentifierstring)|TTPTypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object|a timestamp for the definition of a specific version of a TTP item|&#10003;|
|[behavior](#propertybehavior-behaviorobject)|*Behavior* Object|describes the attack patterns, malware, or exploits that the attacker leverages to execute this TTP||
|[description](#propertydescription-string)| String| ||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[intended_effect](#propertyintended_effect-intendedeffectstringlist)|IntendedEffect String List|the suspected intended effect for this TTP||
|[kill_chains](#propertykill_chains-killchainstringlist)|KillChain String List| ||
|[language](#propertylanguage-string)| String| ||
|[resources](#propertyresources-resourceobject)|*Resource* Object|infrastructure or tools that the adversary uses to execute this TTP||
|[revision](#propertyrevision-integer)|Integer| ||
|[short_description](#propertyshort_description-string)| String| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||
|[victim_targeting](#propertyvictim_targeting-victimtargetingobject)|*VictimTargeting* Object|characterizes the people, organizations, information or access being targeted||

* Reference: [TTPType](http://stixproject.github.io/data-model/1.2/ttp/TTPType/)

<a id="propertybehavior-behaviorobject"></a>
## Property behavior ∷ *Behavior* Object

describes the attack patterns, malware, or exploits that the attacker leverages to execute this TTP

* This entry is optional


<a id="map2-ref"></a>
* *Behavior* Object Value
  * Details: [*Behavior* Object](#map2)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.

<a id="propertyintended_effect-intendedeffectstringlist"></a>
## Property intended_effect ∷ IntendedEffect String List

the suspected intended effect for this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)


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

<a id="propertykill_chains-killchainstringlist"></a>
## Property kill_chains ∷ KillChain String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * Allowed Values:
    * Actions on Objectives
    * Command & Control
    * Delivery
    * Exploitation
    * Installation
    * Reconnaissance
    * Weaponization

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyresources-resourceobject"></a>
## Property resources ∷ *Resource* Object

infrastructure or tools that the adversary uses to execute this TTP

* This entry is optional


<a id="map3-ref"></a>
* *Resource* Object Value
  * Details: [*Resource* Object](#map3)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertyttp_type-string"></a>
## Property ttp_type ∷  String

type of this TTP

* This entry is required


  * String with at most 1024 characters

<a id="propertytype-ttptypeidentifierstring"></a>
## Property type ∷ TTPTypeIdentifier String

* This entry is required


  * Must equal: "ttp"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

a timestamp for the definition of a specific version of a TTP item

* This entry is required


<a id="map1-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map1)

<a id="propertyvictim_targeting-victimtargetingobject"></a>
## Property victim_targeting ∷ *VictimTargeting* Object

characterizes the people, organizations, information or access being targeted

* This entry is optional


<a id="map4-ref"></a>
* *VictimTargeting* Object Value
  * Details: [*VictimTargeting* Object](#map4)

<a id="map1"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map2"></a>
# *Behavior* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[attack_patterns](#propertyattack_patterns-attackpatternobjectlist)|*AttackPattern* Object List|one or more Attack Patterns for this TTP||
|[malware_type](#propertymalware_type-malwareinstanceobjectlist)|*MalwareInstance* Object List|one or more instances of Malware for this TTP||

* Reference: [BehaviorType](http://stixproject.github.io/data-model/1.2/ttp/BehaviorType/)

<a id="propertyattack_patterns-attackpatternobjectlist"></a>
## Property attack_patterns ∷ *AttackPattern* Object List

one or more Attack Patterns for this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map5-ref"></a>
* *AttackPattern* Object Value
  * Details: [*AttackPattern* Object](#map5)

<a id="propertymalware_type-malwareinstanceobjectlist"></a>
## Property malware_type ∷ *MalwareInstance* Object List

one or more instances of Malware for this TTP

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map6-ref"></a>
* *MalwareInstance* Object Value
  * Details: [*MalwareInstance* Object](#map6)

<a id="map6"></a>
# *MalwareInstance* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-string)| String| ||
|[short_description](#propertyshort_description-string)| String| ||
|[title](#propertytitle-string)| String| ||
|[type](#propertytype-malwaretypestringlist)|MalwareType String List|a characterization of what type of malware this||

* Reference: [MalwareInstanceType](http://stixproject.github.io/data-model/1.2/ttp/MalwareInstanceType/)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytype-malwaretypestringlist"></a>
## Property type ∷ MalwareType String List

a characterization of what type of malware this

* This entry is optional
* This entry's type is sequential (allows zero or more values)


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

<a id="map5"></a>
# *AttackPattern* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[capec_id](#propertycapec_id-string)| String|a reference to a particular entry within the Common Attack Pattern Enumeration and Classification||
|[description](#propertydescription-string)| String| ||
|[short_description](#propertyshort_description-string)| String| ||
|[title](#propertytitle-string)| String| ||

* Reference: [AttackPatternType](http://stixproject.github.io/data-model/1.2/ttp/AttackPatternType/)

<a id="propertycapec_id-string"></a>
## Property capec_id ∷  String

a reference to a particular entry within the Common Attack Pattern Enumeration and Classification

* This entry is optional



<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="map3"></a>
# *Resource* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[infrastructure](#propertyinfrastructure-infrastructureobject)|*Infrastructure* Object|infrastructure observed to have been utilized for cyber attack||
|[personas](#propertypersonas-identityobject)|*Identity* Object| ||
|[tools](#propertytools-toolobject)|*Tool* Object|The tool leveraged by this TTP||

* Reference: [ResourceType](http://stixproject.github.io/data-model/1.2/ttp/ResourceType/)

<a id="propertyinfrastructure-infrastructureobject"></a>
## Property infrastructure ∷ *Infrastructure* Object

infrastructure observed to have been utilized for cyber attack

* This entry is optional


<a id="map8-ref"></a>
* *Infrastructure* Object Value
  * Details: [*Infrastructure* Object](#map8)

<a id="propertypersonas-identityobject"></a>
## Property personas ∷ *Identity* Object

* This entry is optional


<a id="map9-ref"></a>
* *Identity* Object Value
  * Details: [*Identity* Object](#map9)

<a id="propertytools-toolobject"></a>
## Property tools ∷ *Tool* Object

The tool leveraged by this TTP

* This entry is optional


<a id="map7-ref"></a>
* *Tool* Object Value
  * Details: [*Tool* Object](#map7)

<a id="map9"></a>
# *Identity* Object

Describes a person or an organization

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-string)| String| |&#10003;|
|[related_identities](#propertyrelated_identities-relatedidentityobjectlist)|*RelatedIdentity* Object List|Identifies other entity Identities related to this Identity|&#10003;|

* Reference: [IdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is required


  * Markdown string with at most 5000 characters

<a id="propertyrelated_identities-relatedidentityobjectlist"></a>
## Property related_identities ∷ *RelatedIdentity* Object List

Identifies other entity Identities related to this Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map10-ref"></a>
* *RelatedIdentity* Object Value
  * Details: [*RelatedIdentity* Object](#map10)

<a id="map10"></a>
# *RelatedIdentity* Object

Describes a related Identity

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[identity](#propertyidentity-string)| String|The reference (URI) of the related Identity object|&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String|Specifies the level of confidence in the assertion of the relationship between the two objects||
|[information_source](#propertyinformation_source-string)| String|Specifies the source of the information about the relationship between the two components||
|[relationship](#propertyrelationship-string)| String| ||

* Reference: [RelatedIdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/)

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

Specifies the level of confidence in the assertion of the relationship between the two objects

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyidentity-string"></a>
## Property identity ∷  String

The reference (URI) of the related Identity object

* This entry is required


  * A URI

<a id="propertyinformation_source-string"></a>
## Property information_source ∷  String

Specifies the source of the information about the relationship between the two components

* This entry is optional



<a id="propertyrelationship-string"></a>
## Property relationship ∷  String

* This entry is optional



<a id="map8"></a>
# *Infrastructure* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-string)| String|text (Markdown) description of specific classes or instances of infrastructure utilized for cyber attack||
|[short_description](#propertyshort_description-string)| String| ||
|[title](#propertytitle-string)| String| ||
|[type](#propertytype-attackerinfrastructurestring)|AttackerInfrastructure String|represents the type of infrastructure being described||

* Reference: [Infrastructure Type](http://stixproject.github.io/data-model/1.2/ttp/Infrastructure Type/)

<a id="propertydescription-string"></a>
## Property description ∷  String

text (Markdown) description of specific classes or instances of infrastructure utilized for cyber attack

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytype-attackerinfrastructurestring"></a>
## Property type ∷ AttackerInfrastructure String

represents the type of infrastructure being described

* This entry is optional


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

<a id="map7"></a>
# *Tool* Object

Describes a hardware or software tool used

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-string)| String| |&#10003;|
|[references](#propertyreferences-stringlist)| String List|references to instances or additional information for this tool||
|[service_pack](#propertyservice_pack-string)| String|service pack descriptor for this tool||
|[type](#propertytype-attacktooltypestringlist)|AttackToolType String List|type of the tool leveraged||
|[vendor](#propertyvendor-string)| String|information identifying the vendor organization for this tool||

* Reference: [ToolInformationType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ToolInformationType/)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is required


  * Markdown string with at most 5000 characters

<a id="propertyreferences-stringlist"></a>
## Property references ∷  String List

references to instances or additional information for this tool

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyservice_pack-string"></a>
## Property service_pack ∷  String

service pack descriptor for this tool

* This entry is optional



<a id="propertytype-attacktooltypestringlist"></a>
## Property type ∷ AttackToolType String List

type of the tool leveraged

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * Allowed Values:
    * Application Scanner
    * Malware
    * Password Cracking
    * Penetration Testing
    * Port Scanner
    * Traffic Scanner
    * Vulnerability Scanner
  * Reference: [AttackerToolTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/AttackerToolTypeVocab-1.0/)

<a id="propertyvendor-string"></a>
## Property vendor ∷  String

information identifying the vendor organization for this tool

* This entry is optional



<a id="map4"></a>
# *VictimTargeting* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[identity](#propertyidentity-identityobject)|*Identity* Object|infrastructure observed to have been utilized for cyber attack||
|[targeted_information](#propertytargeted_information-informationtypestringlist)|InformationType String List|a type of information that is targeted||
|[targeted_observables](#propertytargeted_observables-observableobjectlist)|*Observable* Object List|targeted observables||
|[targeted_systems](#propertytargeted_systems-systemtypestringlist)|SystemType String List|type of system that is targeted||

* Reference: [VictimTargetingType](http://stixproject.github.io/data-model/1.2/ttp/VictimTargetingType/)

<a id="propertyidentity-identityobject"></a>
## Property identity ∷ *Identity* Object

infrastructure observed to have been utilized for cyber attack

* This entry is optional


<a id="map11-ref"></a>
* *Identity* Object Value
  * Details: [*Identity* Object](#map11)

<a id="propertytargeted_information-informationtypestringlist"></a>
## Property targeted_information ∷ InformationType String List

a type of information that is targeted

* This entry is optional
* This entry's type is sequential (allows zero or more values)


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

<a id="propertytargeted_observables-observableobjectlist"></a>
## Property targeted_observables ∷ *Observable* Object List

targeted observables

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: Was targeted_technical_details


<a id="map12-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map12)

<a id="propertytargeted_systems-systemtypestringlist"></a>
## Property targeted_systems ∷ SystemType String List

type of system that is targeted

* This entry is optional
* This entry's type is sequential (allows zero or more values)


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

<a id="map12"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

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

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



<a id="map11"></a>
# *Identity* Object

Describes a person or an organization

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-string)| String| |&#10003;|
|[related_identities](#propertyrelated_identities-relatedidentityobjectlist)|*RelatedIdentity* Object List|Identifies other entity Identities related to this Identity|&#10003;|

* Reference: [IdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/)

<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is required


  * Markdown string with at most 5000 characters

<a id="propertyrelated_identities-relatedidentityobjectlist"></a>
## Property related_identities ∷ *RelatedIdentity* Object List

Identifies other entity Identities related to this Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map13-ref"></a>
* *RelatedIdentity* Object Value
  * Details: [*RelatedIdentity* Object](#map13)

<a id="map13"></a>
# *RelatedIdentity* Object

Describes a related Identity

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[identity](#propertyidentity-string)| String|The reference (URI) of the related Identity object|&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLow String|Specifies the level of confidence in the assertion of the relationship between the two objects||
|[information_source](#propertyinformation_source-string)| String|Specifies the source of the information about the relationship between the two components||
|[relationship](#propertyrelationship-string)| String| ||

* Reference: [RelatedIdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/)

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLow String

Specifies the level of confidence in the assertion of the relationship between the two objects

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyidentity-string"></a>
## Property identity ∷  String

The reference (URI) of the related Identity object

* This entry is required


  * A URI

<a id="propertyinformation_source-string"></a>
## Property information_source ∷  String

Specifies the source of the information about the relationship between the two components

* This entry is optional



<a id="propertyrelationship-string"></a>
## Property relationship ∷  String

* This entry is optional


