<a name="top"/>
# *StoredCampaign* Map

An campaign as stored in the data store

| key | type | required? |
| --- | ---- | --------- |
|[:activity](#mapentry-activity-activitymap)|*Activity* Map||
|[:associated_campaigns](#mapentry-associated_campaigns-relatedcampaignmap)|*RelatedCampaign* Map||
|[:attribution](#mapentry-attribution-relatedactormap)|*RelatedActor* Map||
|[:campaign_type](#mapentry-campaign_type-string)|String|&#10003;|
|[:confidence](#mapentry-confidence-string)|String||
|[:created](#mapentry-created-instdate)|Inst (Date)|&#10003;|
|[:description](#mapentry-description-string)|String||
|[:external_ids](#mapentry-external_ids-string)|String||
|[:id](#mapentry-id-string)|String|&#10003;|
|[:indicators](#mapentry-indicators-relatedindicatormap)|*RelatedIndicator* Map||
|[:intended_effect](#mapentry-intended_effect-string)|String||
|[:language](#mapentry-language-string)|String||
|[:modified](#mapentry-modified-instdate)|Inst (Date)||
|[:names](#mapentry-names-string)|String||
|[:owner](#mapentry-owner-string)|String|&#10003;|
|[:related_TTPs](#mapentry-related_ttps-relatedttpmap)|*RelatedTTP* Map||
|[:related_incidents](#mapentry-related_incidents-relatedincidentmap)|*RelatedIncident* Map||
|[:revision](#mapentry-revision-integer)|Integer||
|[:schema_version](#mapentry-schema_version-string)|String|&#10003;|
|[:short_description](#mapentry-short_description-string)|String||
|[:source](#mapentry-source-string)|String||
|[:source_uri](#mapentry-source_uri-string)|String||
|[:status](#mapentry-status-string)|String||
|[:timestamp](#mapentry-timestamp-instdate)|Inst (Date)||
|[:title](#mapentry-title-string)|String||
|[:tlp](#mapentry-tlp-string)|String||
|[:type](#mapentry-type-string)|String|&#10003;|
|[:uri](#mapentry-uri-string)|String||
|[:valid_time](#mapentry-valid_time-validtimemap)|*ValidTime* Map|&#10003;|

<a name="mapentry-activity-activitymap"/>
## MapEntry :activity ∷ [*Activity* Map]

Actions taken in regards to this Campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :activity

<a name="map7-ref"/>
* *Activity* Map Value
  * Details: [*Activity* Map](#map7)

<a name="mapentry-associated_campaigns-relatedcampaignmap"/>
## MapEntry :associated_campaigns ∷ [*RelatedCampaign* Map]

Other cyber threat Campaigns asserted to be associated with this cyber threat campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :associated_campaigns

<a name="map6-ref"/>
* *RelatedCampaign* Map Value
  * Details: [*RelatedCampaign* Map](#map6)

<a name="mapentry-attribution-relatedactormap"/>
## MapEntry :attribution ∷ [*RelatedActor* Map]

Assertions of attibuted [actors](actor.md) for this cyber threat campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :attribution

<a name="map5-ref"/>
* *RelatedActor* Map Value
  * Details: [*RelatedActor* Map](#map5)

<a name="mapentry-campaign_type-string"/>
## MapEntry :campaign_type ∷ String

* This entry is required
* Dev Notes: Should we define a vocabulary for this?

* Keyword Key
  * Plumatic Schema: :campaign_type

* String Value
  * Plumatic Schema: Str

<a name="mapentry-confidence-string"/>
## MapEntry :confidence ∷ String

Level of confidence held in the characterization of this Campaign

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

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :indicators

<a name="map2-ref"/>
* *RelatedIndicator* Map Value
  * Details: [*RelatedIndicator* Map](#map2)

<a name="mapentry-intended_effect-string"/>
## MapEntry :intended_effect ∷ [String]

Characterizes the intended effect of this cyber threat campaign

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

<a name="mapentry-names-string"/>
## MapEntry :names ∷ [String]

Names used to identify this campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :names

* String Value
  * Plumatic Schema: [Str]

<a name="mapentry-owner-string"/>
## MapEntry :owner ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :owner

* String Value
  * Plumatic Schema: Str

<a name="mapentry-related_ttps-relatedttpmap"/>
## MapEntry :related_TTPs ∷ [*RelatedTTP* Map]

Specifies TTPs asserted to be related to this cyber threat Campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_TTPs

<a name="map3-ref"/>
* *RelatedTTP* Map Value
  * Details: [*RelatedTTP* Map](#map3)

<a name="mapentry-related_incidents-relatedincidentmap"/>
## MapEntry :related_incidents ∷ [*RelatedIncident* Map]

Identifies or characterizes one or more Incidents related to this cyber threat campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_incidents

<a name="map4-ref"/>
* *RelatedIncident* Map Value
  * Details: [*RelatedIncident* Map](#map4)

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

<a name="mapentry-status-string"/>
## MapEntry :status ∷ String

Status of this Campaign

* This entry is optional

* Keyword Key
  * Plumatic Schema: :status

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Future
    * Historic
    * Ongoing

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

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "campaign"

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

Timestamp for the definition of a specific version of a campaign

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

<a name="map4"/>
# *RelatedIncident* Map

| key | type | required? |
| --- | ---- | --------- |
|[:confidence](#mapentry-confidence-string)|String||
|[:incident_id](#mapentry-incident_id-string)|String|&#10003;|
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

<a name="mapentry-incident_id-string"/>
## MapEntry :incident_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :incident_id

* String Value
  * A URI leading to an incident
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

<a name="map5"/>
# *RelatedActor* Map

| key | type | required? |
| --- | ---- | --------- |
|[:actor_id](#mapentry-actor_id-string)|String|&#10003;|
|[:confidence](#mapentry-confidence-string)|String||
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||

<a name="mapentry-actor_id-string"/>
## MapEntry :actor_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :actor_id

* String Value
  * A URI leading to an actor
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

<a name="map6"/>
# *RelatedCampaign* Map

| key | type | required? |
| --- | ---- | --------- |
|[:campaign_id](#mapentry-campaign_id-string)|String|&#10003;|
|[:confidence](#mapentry-confidence-string)|String||
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||

<a name="mapentry-campaign_id-string"/>
## MapEntry :campaign_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :campaign_id

* String Value
  * A URI leading to a campaign
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

<a name="map7"/>
# *Activity* Map

What happend, when?

| key | type | required? |
| --- | ---- | --------- |
|[:date_time](#mapentry-date_time-instdate)|Inst (Date)|&#10003;|
|[:description](#mapentry-description-string)|String|&#10003;|
* Reference: [ActivityType](http://stixproject.github.io/data-model/1.2/stixCommon/ActivityType/)

<a name="mapentry-date_time-instdate"/>
## MapEntry :date_time ∷ Inst (Date)

Specifies the date and time at which the activity occured

* This entry is required

* Keyword Key
  * Plumatic Schema: :date_time

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
  * Plumatic Schema: Inst

<a name="mapentry-description-string"/>
## MapEntry :description ∷ String

A description of the activity

* This entry is required

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Plumatic Schema: Str
