<a id="top"></a>
# *Campaign* Object

*Campaign* Represents a campaign by an [actor](actor.md) pursing an intent.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[campaign_type](#propertycampaign_type-shortstringstring)|ShortStringString|String value that describes the type of campaign. For example, a campaign type could be 'Ransomware', 'Advanced Persistent Threat', 'Business Email Compromise', 'Phishing', etc. |&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|&#10003;|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity.|&#10003;|
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.|&#10003;|
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value.|&#10003;|
|[type](#propertytype-campaigntypeidentifierstring)|CampaignTypeIdentifierString| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object|Timestamp for the definition of a specific version of a campaign.|&#10003;|
|[activity](#propertyactivity-activityobjectlist)|*Activity* Object List|Used to capture specific activities or tactics associated with the campaign. The 'activity' field is an array of objects, and each element represents a specific activity and time associated with the campaign. Examples of activities may include malicious software delivery, command and control communication, network reconnaissance, data exfiltration, etc. By capturing these activities analysts can identify the specific tactics used by the threat actor(s) behind the campaign.||
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|Level of confidence held in the characterization of this Campaign.||
|[external_ids](#propertyexternal_ids-stringlist)|String List|It is used to store a list of external identifiers that can be linked to the incident, providing a reliable and manageable way to correlate and group related events across multiple data sources. It is especially useful in larger organizations that rely on multiple security information and event management (SIEM) systems to detect security incidents. For instance, it can be used to track events across different network sensors, intrusion detection and prevention systems (IDPS), or log management platforms.   The field can also be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems. It can be used to cross-reference with other external tools such as threat intelligence feeds and vulnerability scanners.||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information.  Similar to `external_ids` field with major differences:  - `external_ids` field is used to store a list of external identifiers that can be used to link entities across different data sources. These identifiers are typically standardized and well-known, such as CVE IDs, US-CERT advisories, or other industry-standard threat intelligence feeds. The `external_ids` field can be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems.   - `external_references` field, on the other hand, is used to provide a more general mechanism for linking entities to external sources of information. The `external_references` field can include references to blog posts, articles, external documents, threat intelligence reports, and other sources of information that may not have a standardized format or identifier.||
|[intended_effect](#propertyintended_effect-intendedeffectstringlist)|IntendedEffectString List|Characterizes the intended effect of this cyber threat campaign.||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The `language` field is used to specify the primary language of the affected system or the target of an attack. It can be used to provide additional context and information about the entity. The primary purpose of this field is to help analysts filter and prioritize entities based on their knowledge and expertise of different languages.  For example, if an incident involves an attack on a system in a country where a specific language is predominant, the `language` field can be used to indicate that language, which can help analysts to quickly identify and respond to incidents that may be geographically or culturally relevant. This information can be used to prioritize incidents based on their potential impact. The `language` field can also be used to help with correlation of incidents across different systems and regions, as well as to help with data analysis and reporting.||
|[names](#propertynames-shortstringstringlist)|ShortStringString List|Used to capture alternate names or aliases associated with the campaign. A cyberattack campaign may have multiple names or aliases depending on the group or actor(s) behind the attack, e.g., 'Wannacry' is also known as 'WannaCrypt', 'WCry', 'Wanna Decryptor', etc.||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[source](#propertysource-medstringstring)|MedStringString|Represents the source of the intelligence that led to the creation of the entity.||
|[source_uri](#propertysource_uri-string)|String|URI of the source of the intelligence that led to the creation of the entity.||
|[status](#propertystatus-campaignstatusstring)|CampaignStatusString|Indicates current Status of the Campaign.   Can have one of the following values:   - Ongoing: Indicates that the campaign is currently active and ongoing. For   example, a mass phishing campaign that is actively targeting users is   considered 'ongoing'.  - Historic: Campaign has already occurred and is now in the past.  - Future: This indicates that a campaign is planned or expected to occur in the   future. For example, a threat actor may announce their intention to launch a   specific cyberattack campaign at a future date.||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[tlp](#propertytlp-tlpstring)|TLPString|TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how a resource is intended to be shared, replicated, copied, etc.  It is used to indicate the sensitivity of the information contained within the message. This allows recipients to determine the appropriate handling and dissemination of the information based on their clearance level and need-to-know.  For example, an entity containing information about a critical vulnerability in a widely-used software might be marked as `red`, indicating that it should only be shared with a small group of highly trusted individuals who need to know in order to take appropriate action. On the other hand, a message containing more general information about security threats might be marked as `amber` or `green`, indicating that it can be shared more broadly within an organization.||

* Reference: [CampaignType](http://stixproject.github.io/data-model/1.2/campaign/CampaignType/)

<a id="propertyactivity-activityobjectlist"></a>
## Property activity ∷ *Activity* Object List

Used to capture specific activities or tactics associated with the campaign.
The 'activity' field is an array of objects, and each element represents a specific activity and time associated with the campaign. Examples of activities may include malicious software delivery, command and control communication, network reconnaissance, data exfiltration, etc. By capturing these activities analysts can identify the specific tactics used by the threat actor(s) behind the campaign.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map3-ref"></a>
* *Activity* Object Value
  * Details: [*Activity* Object](#map3)

<a id="propertycampaign_type-shortstringstring"></a>
## Property campaign_type ∷ ShortStringString

String value that describes the type of campaign. For example, a campaign type could be 'Ransomware', 'Advanced Persistent Threat', 'Business Email Compromise', 'Phishing', etc. 

* This entry is required
* Dev Notes: Should we define a vocabulary for this?


  * *ShortString* String with at most 1024 characters.

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

Level of confidence held in the characterization of this Campaign.

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of object, which may be detailed.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters.

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

It is used to store a list of external identifiers that can be linked to the incident, providing a reliable and manageable way to correlate and group related events across multiple data sources. It is especially useful in larger organizations that rely on multiple security information and event management (SIEM) systems to detect security incidents. For instance, it can be used to track events across different network sensors, intrusion detection and prevention systems (IDPS), or log management platforms. 
 The field can also be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems. It can be used to cross-reference with other external tools such as threat intelligence feeds and vulnerability scanners.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information.

Similar to `external_ids` field with major differences:

- `external_ids` field is used to store a list of external identifiers that can be used to link entities across different data sources. These identifiers are typically standardized and well-known, such as CVE IDs, US-CERT advisories, or other industry-standard threat intelligence feeds. The `external_ids` field can be used to facilitate automation and orchestration workflows, where additional information can be shared among incident management systems. 

- `external_references` field, on the other hand, is used to provide a more general mechanism for linking entities to external sources of information. The `external_references` field can include references to blog posts, articles, external documents, threat intelligence reports, and other sources of information that may not have a standardized format or identifier.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map1-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map1)

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyintended_effect-intendedeffectstringlist"></a>
## Property intended_effect ∷ IntendedEffectString List

Characterizes the intended effect of this cyber threat campaign.

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

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The `language` field is used to specify the primary language of the affected system or the target of an attack. It can be used to provide additional context and information about the entity. The primary purpose of this field is to help analysts filter and prioritize entities based on their knowledge and expertise of different languages.

For example, if an incident involves an attack on a system in a country where a specific language is predominant, the `language` field can be used to indicate that language, which can help analysts to quickly identify and respond to incidents that may be geographically or culturally relevant. This information can be used to prioritize incidents based on their potential impact. The `language` field can also be used to help with correlation of incidents across different systems and regions, as well as to help with data analysis and reporting.

* This entry is optional


  * *ShortString* String with at most 1024 characters.

<a id="propertynames-shortstringstringlist"></a>
## Property names ∷ ShortStringString List

Used to capture alternate names or aliases associated with the campaign. A cyberattack campaign may have multiple names or aliases depending on the group or actor(s) behind the attack, e.g., 'Wannacry' is also known as 'WannaCrypt', 'WCry', 'Wanna Decryptor', etc.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters.

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer.

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity.

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is required


  * *MedString* String with at most 2048 characters.

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

Represents the source of the intelligence that led to the creation of the entity.

* This entry is optional


  * *MedString* String with at most 2048 characters.

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

URI of the source of the intelligence that led to the creation of the entity.

* This entry is optional


  * A URI

<a id="propertystatus-campaignstatusstring"></a>
## Property status ∷ CampaignStatusString

Indicates current Status of the Campaign. 

Can have one of the following values: 

- Ongoing: Indicates that the campaign is currently active and ongoing. For   example, a mass phishing campaign that is actively targeting users is   considered 'ongoing'.

- Historic: Campaign has already occurred and is now in the past.

- Future: This indicates that a campaign is planned or expected to occur in the   future. For example, a threat actor may announce their intention to launch a   specific cyberattack campaign at a future date.

* This entry is optional


  * Allowed Values:
    * Future
    * Historic
    * Ongoing

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

A short title for this object, used as primary display and reference value.

* This entry is required


  * *ShortString* String with at most 1024 characters.

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLPString

TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how a resource is intended to be shared, replicated, copied, etc.

It is used to indicate the sensitivity of the information contained within the message. This allows recipients to determine the appropriate handling and dissemination of the information based on their clearance level and need-to-know.

For example, an entity containing information about a critical vulnerability in a widely-used software might be marked as `red`, indicating that it should only be shared with a small group of highly trusted individuals who need to know in order to take appropriate action. On the other hand, a message containing more general information about security threats might be marked as `amber` or `green`, indicating that it can be shared more broadly within an organization.

* This entry is optional


  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-campaigntypeidentifierstring"></a>
## Property type ∷ CampaignTypeIdentifierString

* This entry is required


  * Must equal: "campaign"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

Timestamp for the definition of a specific version of a campaign.

* This entry is required


<a id="map2-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map2)

<a id="map1"></a>
# *ExternalReference* Object

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedStringString|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString| ||
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)|String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)|String|A URL reference to an external resource.||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters.

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷ String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedStringString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters.

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource.

* This entry is optional


  * A URI

<a id="map2"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound.||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map3"></a>
# *Activity* Object

*Activity* Captures the specific activities or tactics associated with the entity. Examples of activities may include malicious software delivery, command and control communication, network reconnaissance, data exfiltration, etc.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[date_time](#propertydate_time-instdate)|Inst (Date)|Specifies the date and time at which the activity occured.|&#10003;|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of the activity.|&#10003;|

* Reference: [ActivityType](http://stixproject.github.io/data-model/1.2/stixCommon/ActivityType/)

<a id="propertydate_time-instdate"></a>
## Property date_time ∷ Inst (Date)

Specifies the date and time at which the activity occured.

* This entry is required


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

A description of the activity.

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters.
