<a name="top"/>
# *Campaign* Map

http://stixproject.github.io/data-model/1.2/campaign/CampaignType/


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
  * Must equal: "campaign"

## MapEntry: :valid_time -> *ValidTime* Map

timestamp for the definition of a specific version of a Campaign

* This entry is required

* Keyword Key
  * Plumatic Schema: :valid_time

<a name="map1-ref"/>
* *ValidTime* Map Value
  * Details: [*ValidTime* Map](#map1)

## MapEntry: :campaign_type -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :campaign_type

* String Value
  * Plumatic Schema: Str

## MapEntry: :names -> [String]

Names used to identify this Campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :names

* String Value
  * Plumatic Schema: [Str]

## MapEntry: :indicators -> [*RelatedIndicator* Map]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :indicators

<a name="map2-ref"/>
* *RelatedIndicator* Map Value
  * Details: [*RelatedIndicator* Map](#map2)

## MapEntry: :intended_effect -> [String]

characterizes the intended effect of this cyber threat Campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :intended_effect

* String Value
  * Plumatic Schema: [(enum ...)]
  * Allowed Values: ("Account Takeover" "Advantage" "Advantage - Economic" "Advantage - Military" "Advantage - Political" "Brand Damage" "Competitive Advantage" "Degradation of Service" "Denial and Deception" "Destruction" "Disruption" "Embarrassment" "Exposure" "Extortion" "Fraud" "Harassment" "ICS Control" "Theft" "Theft - Credential Theft" "Theft - Identity Theft" "Theft - Intellectual Property" "Theft - Theft of Proprietary Information" "Traffic Diversion" "Unauthorized Access")

## MapEntry: :status -> String

status of this Campaign

* This entry is optional

* Keyword Key
  * Plumatic Schema: :status

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values: ("Future" "Historic" "Ongoing")

## MapEntry: :related_TTPs -> [*RelatedTTP* Map]

specifies TTPs asserted to be related to this cyber threat Campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_TTPs

<a name="map3-ref"/>
* *RelatedTTP* Map Value
  * Details: [*RelatedTTP* Map](#map3)

## MapEntry: :related_incidents -> [*RelatedIncident* Map]

identifies or characterizes one or more Incidents related to this cyber threat Campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_incidents

<a name="map4-ref"/>
* *RelatedIncident* Map Value
  * Details: [*RelatedIncident* Map](#map4)

## MapEntry: :attribution -> [*RelatedActor* Map]

assertions of attibuted Threat Actors for this cyber threat Campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :attribution

<a name="map5-ref"/>
* *RelatedActor* Map Value
  * Details: [*RelatedActor* Map](#map5)

## MapEntry: :associated_campaigns -> [*RelatedCampaign* Map]

other cyber threat Campaigns asserted to be associated with this cyber threat Campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :associated_campaigns

<a name="map6-ref"/>
* *RelatedCampaign* Map Value
  * Details: [*RelatedCampaign* Map](#map6)

## MapEntry: :confidence -> String

level of confidence held in the characterization of this Campaign

* This entry is optional

* Keyword Key
  * Plumatic Schema: :confidence

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
  * Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :activity -> *Activity* Map

actions taken in regards to this Campaign

* This entry is optional

* Keyword Key
  * Plumatic Schema: :activity

<a name="map7-ref"/>
* *Activity* Map Value
  * Details: [*Activity* Map](#map7)

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
# *RelatedTTP* Map

[return](#map3-ref)


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

<a name="map4"/>
# *RelatedIncident* Map

[return](#map4-ref)


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

## MapEntry: :incident_id -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :incident_id

* String Value
  * A URI leading to an incident
  * Plumatic Schema: Str

<a name="map5"/>
# *RelatedActor* Map

[return](#map5-ref)


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

## MapEntry: :actor_id -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :actor_id

* String Value
  * A URI leading to an actor
  * Plumatic Schema: Str

<a name="map6"/>
# *RelatedCampaign* Map

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

## MapEntry: :campaign_id -> String

* This entry is required

* Keyword Key
  * Plumatic Schema: :campaign_id

* String Value
  * A URI leading to a campaign
  * Plumatic Schema: Str

<a name="map7"/>
# *Activity* Map

[return](#map7-ref)

* Reference: http://stixproject.github.io/data-model/1.2/stixCommon/ActivityType/

## MapEntry: :date_time -> Inst (Date)

specifies the date and time at which the activity occured

* This entry is required

* Keyword Key
  * Plumatic Schema: :date_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.
  * Plumatic Schema: Inst

## MapEntry: :description -> String

a description of the activity

* This entry is required

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Plumatic Schema: Str
