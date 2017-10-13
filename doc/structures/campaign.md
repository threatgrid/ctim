<a id="top"></a>
# *Campaign* Object

Represents a campaign by an [actor](actor.md) pursing an intent

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:campaign_type](#property-campaign_type-string)| String| |&#10003;|
|[:id](#property-id-string)| String| |&#10003;|
|[:schema_version](#property-schema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[:type](#property-type-campaigntypeidentifierstring)|CampaignTypeIdentifier String| |&#10003;|
|[:valid_time](#property-valid_time-validtimeobject)|*ValidTime* Object|Timestamp for the definition of a specific version of a campaign|&#10003;|
|[:activity](#property-activity-activityobjectlist)|*Activity* Object List|Actions taken in regards to this Campaign||
|[:confidence](#property-confidence-highmedlowstring)|HighMedLow String|Level of confidence held in the characterization of this Campaign||
|[:description](#property-description-string)| String| ||
|[:external_ids](#property-external_ids-stringlist)| String List| ||
|[:intended_effect](#property-intended_effect-intendedeffectstringlist)|IntendedEffect String List|Characterizes the intended effect of this cyber threat campaign||
|[:language](#property-language-string)| String| ||
|[:names](#property-names-stringlist)| String List|Names used to identify this campaign||
|[:revision](#property-revision-integer)|Integer| ||
|[:short_description](#property-short_description-string)| String| ||
|[:source](#property-source-string)| String| ||
|[:source_uri](#property-source_uri-string)| String| ||
|[:status](#property-status-campaignstatusstring)|CampaignStatus String|Status of this Campaign||
|[:timestamp](#property-timestamp-instdate)|Inst (Date)| ||
|[:title](#property-title-string)| String| ||
|[:tlp](#property-tlp-tlpstring)|TLP String| ||

* Reference: [CampaignType](http://stixproject.github.io/data-model/1.2/campaign/CampaignType/)

<a id="property-activity-activityobjectlist"></a>
## Property :activity ∷ *Activity* Object List

Actions taken in regards to this Campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map2-ref"></a>
* *Activity* Object Value
  * Details: [*Activity* Object](#map2)

<a id="property-campaign_type-string"></a>
## Property :campaign_type ∷  String

* This entry is required
* Dev Notes: Should we define a vocabulary for this?


  * String with at most 1024 characters

<a id="property-confidence-highmedlowstring"></a>
## Property :confidence ∷ HighMedLow String

Level of confidence held in the characterization of this Campaign

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="property-description-string"></a>
## Property :description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="property-external_ids-stringlist"></a>
## Property :external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="property-id-string"></a>
## Property :id ∷  String

* This entry is required


  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.

<a id="property-intended_effect-intendedeffectstringlist"></a>
## Property :intended_effect ∷ IntendedEffect String List

Characterizes the intended effect of this cyber threat campaign

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

<a id="property-language-string"></a>
## Property :language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="property-names-stringlist"></a>
## Property :names ∷  String List

Names used to identify this campaign

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * String with at most 1024 characters

<a id="property-revision-integer"></a>
## Property :revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="property-schema_version-string"></a>
## Property :schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="property-short_description-string"></a>
## Property :short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="property-source-string"></a>
## Property :source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="property-source_uri-string"></a>
## Property :source_uri ∷  String

* This entry is optional


  * A URI

<a id="property-status-campaignstatusstring"></a>
## Property :status ∷ CampaignStatus String

Status of this Campaign

* This entry is optional


  * Allowed Values:
    * Future
    * Historic
    * Ongoing

<a id="property-timestamp-instdate"></a>
## Property :timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-title-string"></a>
## Property :title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="property-tlp-tlpstring"></a>
## Property :tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="property-type-campaigntypeidentifierstring"></a>
## Property :type ∷ CampaignTypeIdentifier String

* This entry is required


  * Must equal: "campaign"

<a id="property-valid_time-validtimeobject"></a>
## Property :valid_time ∷ *ValidTime* Object

Timestamp for the definition of a specific version of a campaign

* This entry is required


<a id="map1-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map1)

<a id="map1"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:end_time](#property-end_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[:start_time](#property-start_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="property-end_time-instdate"></a>
## Property :end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-start_time-instdate"></a>
## Property :start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map2"></a>
# *Activity* Object

What happend, when?

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:date_time](#property-date_time-instdate)|Inst (Date)|Specifies the date and time at which the activity occured|&#10003;|
|[:description](#property-description-string)| String|A description of the activity|&#10003;|

* Reference: [ActivityType](http://stixproject.github.io/data-model/1.2/stixCommon/ActivityType/)

<a id="property-date_time-instdate"></a>
## Property :date_time ∷ Inst (Date)

Specifies the date and time at which the activity occured

* This entry is required


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-description-string"></a>
## Property :description ∷  String

A description of the activity

* This entry is required


  * Markdown string with at most 5000 characters
