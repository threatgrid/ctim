<a name="top"/>
# *Actor* Map

Describes malicious actors (or adversaries) related to a cyber attack

| key | type | required? |
| --- | ---- | --------- |
|[:actor_type](#mapentry-actor_type-string)|String|&#10003;|
|[:confidence](#mapentry-confidence-string)|String||
|[:description](#mapentry-description-string)|String||
|[:external_ids](#mapentry-external_ids-string)|String||
|[:id](#mapentry-id-string)|String|&#10003;|
|[:identity](#mapentry-identity-identitymap)|*Identity* Map||
|[:intended_effect](#mapentry-intended_effect-string)|String||
|[:language](#mapentry-language-string)|String||
|[:motivation](#mapentry-motivation-string)|String||
|[:planning_and_operational_support](#mapentry-planning_and_operational_support-string)|String||
|[:revision](#mapentry-revision-integer)|Integer||
|[:schema_version](#mapentry-schema_version-string)|String|&#10003;|
|[:short_description](#mapentry-short_description-string)|String||
|[:sophistication](#mapentry-sophistication-string)|String||
|[:source](#mapentry-source-string)|String|&#10003;|
|[:source_uri](#mapentry-source_uri-string)|String||
|[:timestamp](#mapentry-timestamp-instdate)|Inst (Date)||
|[:title](#mapentry-title-string)|String||
|[:tlp](#mapentry-tlp-string)|String||
|[:type](#mapentry-type-string)|String|&#10003;|
|[:valid_time](#mapentry-valid_time-validtimemap)|*ValidTime* Map|&#10003;|
* Reference: [ThreatActorType](http://stixproject.github.io/data-model/1.2/ta/ThreatActorType/)

<a name="mapentry-actor_type-string"/>
## MapEntry :actor_type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :actor_type

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Cyber Espionage Operations
    * Disgruntled Customer / User
    * Hacker
    * Hacker - Black hat
    * Hacker - Gray hat
    * Hacker - White hat
    * Hacktivist
    * Insider Threat
    * State Actor / Agency
    * eCrime Actor - Credential Theft Botnet Operator
    * eCrime Actor - Credential Theft Botnet Service
    * eCrime Actor - Malware Developer
    * eCrime Actor - Money Laundering Network
    * eCrime Actor - Organized Crime Actor
    * eCrime Actor - Spam Service
    * eCrime Actor - Traffic Service
    * eCrime Actor - Underground Call Service

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

<a name="mapentry-description-string"/>
## MapEntry :description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown string with at most 5000 characters
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

<a name="mapentry-identity-identitymap"/>
## MapEntry :identity ∷ *Identity* Map

* This entry is optional

* Keyword Key
  * Plumatic Schema: :identity

<a name="map2-ref"/>
* *Identity* Map Value
  * Details: [*Identity* Map](#map2)

<a name="mapentry-intended_effect-string"/>
## MapEntry :intended_effect ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :intended_effect

* String Value
  * Plumatic Schema: (enum ...)
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

<a name="mapentry-language-string"/>
## MapEntry :language ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :language

* String Value
  * String with at most 1024 characters
  * Plumatic Schema: Str

<a name="mapentry-motivation-string"/>
## MapEntry :motivation ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :motivation

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Ego
    * Financial or Economic
    * Ideological
    * Ideological - Anti-Corruption
    * Ideological - Anti-Establishment
    * Ideological - Environmental
    * Ideological - Ethnic / Nationalist
    * Ideological - Human Rights
    * Ideological - Information Freedom
    * Ideological - Religious
    * Ideological - Security Awareness
    * Military
    * Opportunistic
    * Political

<a name="mapentry-planning_and_operational_support-string"/>
## MapEntry :planning_and_operational_support ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :planning_and_operational_support

* String Value
  * String with at most 5000 characters
  * Plumatic Schema: Str

<a name="mapentry-revision-integer"/>
## MapEntry :revision ∷ Integer

* This entry is optional

* Keyword Key
  * Plumatic Schema: :revision

* Integer Value
  * Zero, or a positive integer
  * Plumatic Schema: Int

<a name="mapentry-schema_version-string"/>
## MapEntry :schema_version ∷ String

CTIM schema version for this entity

* This entry is required

* Keyword Key
  * Plumatic Schema: :schema_version

* String Value
  * A semantic version matching the CTIM version against which this object should be valid.
  * Plumatic Schema: Str

<a name="mapentry-short_description-string"/>
## MapEntry :short_description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * String with at most 2048 characters
  * Plumatic Schema: Str

<a name="mapentry-sophistication-string"/>
## MapEntry :sophistication ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :sophistication

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Aspirant
    * Expert
    * Innovator
    * Novice
    * Practitioner

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * String with at most 2048 characters
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
  * String with at most 1024 characters
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
  * Must equal: "actor"

<a name="mapentry-valid_time-validtimemap"/>
## MapEntry :valid_time ∷ *ValidTime* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :valid_time

<a name="map1-ref"/>
* *ValidTime* Map Value
  * Details: [*ValidTime* Map](#map1)

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
  * Markdown string with at most 5000 characters
  * Plumatic Schema: Str

<a name="mapentry-related_identities-relatedidentitymap"/>
## MapEntry :related_identities ∷ [*RelatedIdentity* Map]

Identifies other entity Identities related to this Identity

* This entry is required
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_identities

<a name="map3-ref"/>
* *RelatedIdentity* Map Value
  * Details: [*RelatedIdentity* Map](#map3)

<a name="map3"/>
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
