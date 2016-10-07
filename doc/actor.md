<a name="top"/>
# *Actor* Map

http://stixproject.github.io/data-model/1.2/ta/ThreatActorType/


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

* This entry is required

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

* Plumatic Schema: (enum "actor")
* Must equal: "actor"

## MapEntry: :valid_time -> Map

* This entry is required

### Keyword Key

* Plumatic Schema: :valid_time

<a name="map1-ref"/>
### Map Value

[Map](#map1)

## MapEntry: :actor_type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :actor_type

### String Value

* Plumatic Schema: (enum "Cyber Espionage Operations" "Hacktivist" "eCrime Actor - Organized Crime Actor" "eCrime Actor - Traffic Service" "Hacker - White hat" "eCrime Actor - Malware Developer" "eCrime Actor - Credential Theft Botnet Service" "State Actor / Agency" "Hacker" "Insider Threat" "eCrime Actor - Underground Call Service" "Hacker - Black hat" "Disgruntled Customer / User" "eCrime Actor - Credential Theft Botnet Operator" "eCrime Actor - Spam Service" "Hacker - Gray hat" "eCrime Actor - Money Laundering Network")
* Allowed Values: ("Cyber Espionage Operations" "Disgruntled Customer / User" "Hacker" "Hacker - Black hat" "Hacker - Gray hat" "Hacker - White hat" "Hacktivist" "Insider Threat" "State Actor / Agency" "eCrime Actor - Credential Theft Botnet Operator" "eCrime Actor - Credential Theft Botnet Service" "eCrime Actor - Malware Developer" "eCrime Actor - Money Laundering Network" "eCrime Actor - Organized Crime Actor" "eCrime Actor - Spam Service" "eCrime Actor - Traffic Service" "eCrime Actor - Underground Call Service")

## MapEntry: :identity -> Map

* This entry is optional

### Keyword Key

* Plumatic Schema: :identity

<a name="map2-ref"/>
### Map Value

[Map](#map2)

## MapEntry: :motivation -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :motivation

### String Value

* Plumatic Schema: (enum "Ideological - Security Awareness" "Ideological - Anti-Establishment" "Ideological - Anti-Corruption" "Opportunistic" "Military" "Financial or Economic" "Ideological - Human Rights" "Political" "Ideological - Religious" "Ego" "Ideological - Environmental" "Ideological - Ethnic / Nationalist" "Ideological - Information Freedom" "Ideological")
* Allowed Values: ("Ego" "Financial or Economic" "Ideological" "Ideological - Anti-Corruption" "Ideological - Anti-Establishment" "Ideological - Environmental" "Ideological - Ethnic / Nationalist" "Ideological - Human Rights" "Ideological - Information Freedom" "Ideological - Religious" "Ideological - Security Awareness" "Military" "Opportunistic" "Political")

## MapEntry: :sophistication -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :sophistication

### String Value

* Plumatic Schema: (enum "Aspirant" "Innovator" "Practitioner" "Novice" "Expert")
* Allowed Values: ("Aspirant" "Expert" "Innovator" "Novice" "Practitioner")

## MapEntry: :intended_effect -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :intended_effect

### String Value

* Plumatic Schema: (enum "Denial and Deception" "Destruction" "Fraud" "Extortion" "Advantage - Military" "Disruption" "Account Takeover" "Theft - Theft of Proprietary Information" "Degradation of Service" "Theft - Identity Theft" "Advantage - Political" "Exposure" "Traffic Diversion" "Embarrassment" "Theft - Intellectual Property" "Theft - Credential Theft" "Competitive Advantage" "Brand Damage" "Advantage - Economic" "Harassment" "Unauthorized Access" "ICS Control" "Theft" "Advantage")
* Allowed Values: ("Account Takeover" "Advantage" "Advantage - Economic" "Advantage - Military" "Advantage - Political" "Brand Damage" "Competitive Advantage" "Degradation of Service" "Denial and Deception" "Destruction" "Disruption" "Embarrassment" "Exposure" "Extortion" "Fraud" "Harassment" "ICS Control" "Theft" "Theft - Credential Theft" "Theft - Identity Theft" "Theft - Intellectual Property" "Theft - Theft of Proprietary Information" "Traffic Diversion" "Unauthorized Access")

## MapEntry: :planning_and_operational_support -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :planning_and_operational_support

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :observed_TTPs -> [*RelatedTTP* Map]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :observed_TTPs

<a name="map3-ref"/>
#### *RelatedTTP* Map Value

[*RelatedTTP* Map](#map3)

## MapEntry: :associated_campaigns -> [*RelatedCampaign* Map]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :associated_campaigns

<a name="map4-ref"/>
#### *RelatedCampaign* Map Value

[*RelatedCampaign* Map](#map4)

## MapEntry: :associated_actors -> [*RelatedActor* Map]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :associated_actors

<a name="map5-ref"/>
#### *RelatedActor* Map Value

[*RelatedActor* Map](#map5)

## MapEntry: :confidence -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :confidence

### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

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
# Map

[return](#map2-ref)

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

<a name="map4-ref"/>
#### Map Value

[Map](#map4)

<a name="map4"/>
# Map

[return](#map4-ref)

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

<a name="map3"/>
# *RelatedTTP* Map

[return](#map3-ref)


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

<a name="map4"/>
# *RelatedCampaign* Map

[return](#map4-ref)


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

## MapEntry: :campaign_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :campaign_id

### String Value

A URI leading to a campaign

* Plumatic Schema: Str

<a name="map5"/>
# *RelatedActor* Map

[return](#map5-ref)


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

## MapEntry: :actor_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :actor_id

### String Value

A URI leading to an actor

* Plumatic Schema: Str
