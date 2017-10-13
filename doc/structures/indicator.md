<a id="top"></a>
# *Indicator* Object

An indicator is a test, or a collection of judgements that define
criteria for identifying the activity, or presence of malware, or
other unwanted software.

We follow the
[STiX IndicatorType](http://stixproject.github.io/data-model/1.2/indicator/IndicatorType/)
closely, with the exception of not including observables within the
indicator, and preferring a _specification_ object encoded in JSON as
opposed to an opaque _implementation_ block.

Additional, you will want to either define judgements against
Observables that are linked to this indicator, with the ID in the
_indicators_ field of those Judgements, or you can provide a
_specification_ value.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:id](#property-id-string)| String| |&#10003;|
|[:producer](#property-producer-string)| String| |&#10003;|
|[:schema_version](#property-schema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[:type](#property-type-indicatortypeidentifierstring)|IndicatorTypeIdentifier String| |&#10003;|
|[:valid_time](#property-valid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[:composite_indicator_expression](#property-composite_indicator_expression-compositeindicatorexpressionobject)|*CompositeIndicatorExpression* Object| ||
|[:confidence](#property-confidence-highmedlowstring)|HighMedLow String|level of confidence held in the accuracy of this Indicator||
|[:description](#property-description-string)| String| ||
|[:external_ids](#property-external_ids-stringlist)| String List| ||
|[:indicator_type](#property-indicator_type-indicatortypestringlist)|IndicatorType String List|Specifies the type or types for this Indicator||
|[:kill_chain_phases](#property-kill_chain_phases-stringlist)| String List|relevant kill chain phases indicated by this Indicator||
|[:language](#property-language-string)| String| ||
|[:likely_impact](#property-likely_impact-string)| String|likely potential impact within the relevant context if this Indicator were to occur||
|[:negate](#property-negate-boolean)|Boolean|specifies the absence of the pattern||
|[:revision](#property-revision-integer)|Integer| ||
|[:short_description](#property-short_description-string)| String| ||
|[:source](#property-source-string)| String| ||
|[:source_uri](#property-source_uri-string)| String| ||
|[:specification](#property-specification-either)|*JudgementSpecification* Object| ||
|[:tags](#property-tags-stringlist)| String List|Descriptors for this indicator||
|[:test_mechanisms](#property-test_mechanisms-stringlist)| String List|Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator||
|[:timestamp](#property-timestamp-instdate)|Inst (Date)| ||
|[:title](#property-title-string)| String| ||
|[:tlp](#property-tlp-tlpstring)|TLP String| ||

* Reference: [IndicatorType](http://stixproject.github.io/data-model/1.2/indicator/IndicatorType/)

<a id="property-composite_indicator_expression-compositeindicatorexpressionobject"></a>
## Property :composite_indicator_expression ∷ *CompositeIndicatorExpression* Object

* This entry is optional


<a id="map2-ref"></a>
* *CompositeIndicatorExpression* Object Value
  * Details: [*CompositeIndicatorExpression* Object](#map2)

<a id="property-confidence-highmedlowstring"></a>
## Property :confidence ∷ HighMedLow String

level of confidence held in the accuracy of this Indicator

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

<a id="property-indicator_type-indicatortypestringlist"></a>
## Property :indicator_type ∷ IndicatorType String List

Specifies the type or types for this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * Allowed Values:
    * Anonymization
    * C2
    * Compromised PKI Certificate
    * Domain Watchlist
    * Exfiltration
    * File Hash Watchlist
    * Host Characteristics
    * IMEI Watchlist
    * IMSI Watchlist
    * IP Watchlist
    * Login Name
    * Malicious E-mail
    * Malware Artifacts
    * URL Watchlist
  * Reference: [IndicatorTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/IndicatorTypeVocab-1.1/)

<a id="property-kill_chain_phases-stringlist"></a>
## Property :kill_chain_phases ∷  String List

relevant kill chain phases indicated by this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


  * String with at most 2048 characters

<a id="property-language-string"></a>
## Property :language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="property-likely_impact-string"></a>
## Property :likely_impact ∷  String

likely potential impact within the relevant context if this Indicator were to occur

* This entry is optional


  * String with at most 5000 characters

<a id="property-negate-boolean"></a>
## Property :negate ∷ Boolean

specifies the absence of the pattern

* This entry is optional



<a id="property-producer-string"></a>
## Property :producer ∷  String

* This entry is required
* Dev Notes: TODO - Document what is supposed to be in this field!


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

<a id="property-specification-either"></a>
## Property :specification ∷ Either

* This entry is optional


  * Only one of the following schemas will match

<a id="map3-ref"></a>
* *JudgementSpecification* Object Value
  * Details: [*JudgementSpecification* Object](#map3)

<a id="map4-ref"></a>
* *ThreatBrainSpecification* Object Value
  * Details: [*ThreatBrainSpecification* Object](#map4)

<a id="map5-ref"></a>
* *SnortSpecification* Object Value
  * Details: [*SnortSpecification* Object](#map5)

<a id="map6-ref"></a>
* *SIOCSpecification* Object Value
  * Details: [*SIOCSpecification* Object](#map6)

<a id="map7-ref"></a>
* *OpenIOCSpecification* Object Value
  * Details: [*OpenIOCSpecification* Object](#map7)

<a id="property-tags-stringlist"></a>
## Property :tags ∷  String List

Descriptors for this indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * String with at most 1024 characters

<a id="property-test_mechanisms-stringlist"></a>
## Property :test_mechanisms ∷  String List

Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


  * String with at most 2048 characters

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

<a id="property-type-indicatortypeidentifierstring"></a>
## Property :type ∷ IndicatorTypeIdentifier String

* This entry is required


  * Must equal: "indicator"

<a id="property-valid_time-validtimeobject"></a>
## Property :valid_time ∷ *ValidTime* Object

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
# *CompositeIndicatorExpression* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:indicator_ids](#property-indicator_ids-stringlist)| String List| |&#10003;|
|[:operator](#property-operator-booleanoperatorstring)|BooleanOperator String| |&#10003;|

* Reference: [CompositeIndicatorExpressionType](http://stixproject.github.io/data-model/1.2/indicator/CompositeIndicatorExpressionType/)

<a id="property-indicator_ids-stringlist"></a>
## Property :indicator_ids ∷  String List

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * A URI leading to an indicator

<a id="property-operator-booleanoperatorstring"></a>
## Property :operator ∷ BooleanOperator String

* This entry is required


  * Allowed Values:
    * and
    * not
    * or

<a id="map3"></a>
# *JudgementSpecification* Object

An indicator based on a list of judgements.  If any of the Observables in it's judgements are encountered, than it may be matches against.  If there are any required judgements, they all must be matched in order for the indicator to be considered a match.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:judgements](#property-judgements-stringlist)| String List| |&#10003;|
|[:required_judgements](#property-required_judgements-relatedjudgementobjectlist)|*RelatedJudgement* Object List| |&#10003;|
|[:type](#property-type-judgementspecificationtypestring)|JudgementSpecificationType String| |&#10003;|


<a id="property-judgements-stringlist"></a>
## Property :judgements ∷  String List

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * A URI leading to a judgement

<a id="property-required_judgements-relatedjudgementobjectlist"></a>
## Property :required_judgements ∷ *RelatedJudgement* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map8-ref"></a>
* *RelatedJudgement* Object Value
  * Details: [*RelatedJudgement* Object](#map8)

<a id="property-type-judgementspecificationtypestring"></a>
## Property :type ∷ JudgementSpecificationType String

* This entry is required


  * Must equal: "Judgement"

<a id="map8"></a>
# *RelatedJudgement* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:judgement_id](#property-judgement_id-string)| String| |&#10003;|
|[:confidence](#property-confidence-highmedlowstring)|HighMedLow String| ||
|[:relationship](#property-relationship-string)| String| ||
|[:source](#property-source-string)| String| ||


<a id="property-confidence-highmedlowstring"></a>
## Property :confidence ∷ HighMedLow String

* This entry is optional


  * Allowed Values:
    * High
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="property-judgement_id-string"></a>
## Property :judgement_id ∷  String

* This entry is required


  * A URI leading to a judgement

<a id="property-relationship-string"></a>
## Property :relationship ∷  String

* This entry is optional



<a id="property-source-string"></a>
## Property :source ∷  String

* This entry is optional



<a id="map4"></a>
# *ThreatBrainSpecification* Object

An indicator which runs in threatbrain...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:type](#property-type-threatbrainspecificationtypestring)|ThreatBrainSpecificationType String| |&#10003;|
|[:variables](#property-variables-stringlist)| String List| |&#10003;|
|[:query](#property-query-string)| String| ||


<a id="property-query-string"></a>
## Property :query ∷  String

* This entry is optional



<a id="property-type-threatbrainspecificationtypestring"></a>
## Property :type ∷ ThreatBrainSpecificationType String

* This entry is required


  * Must equal: "ThreatBrain"

<a id="property-variables-stringlist"></a>
## Property :variables ∷  String List

* This entry is required
* This entry's type is sequential (allows zero or more values)



<a id="map5"></a>
# *SnortSpecification* Object

An indicator which runs in snort...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:snort_sig](#property-snort_sig-string)| String| |&#10003;|
|[:type](#property-type-snortspecificationtypestring)|SnortSpecificationType String| |&#10003;|


<a id="property-snort_sig-string"></a>
## Property :snort_sig ∷  String

* This entry is required



<a id="property-type-snortspecificationtypestring"></a>
## Property :type ∷ SnortSpecificationType String

* This entry is required


  * Must equal: "Snort"

<a id="map6"></a>
# *SIOCSpecification* Object

An indicator which runs in snort...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:SIOC](#property-sioc-string)| String| |&#10003;|
|[:type](#property-type-siocspecificationtypestring)|SIOCSpecificationType String| |&#10003;|


<a id="property-sioc-string"></a>
## Property :SIOC ∷  String

* This entry is required



<a id="property-type-siocspecificationtypestring"></a>
## Property :type ∷ SIOCSpecificationType String

* This entry is required


  * Must equal: "SIOC"

<a id="map7"></a>
# *OpenIOCSpecification* Object

An indicator which contains an XML blob of an openIOC indicator..

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:open_IOC](#property-open_ioc-string)| String| |&#10003;|
|[:type](#property-type-openiocspecificationtypestring)|OpenIOCSpecificationType String| |&#10003;|


<a id="property-open_ioc-string"></a>
## Property :open_IOC ∷  String

* This entry is required



<a id="property-type-openiocspecificationtypestring"></a>
## Property :type ∷ OpenIOCSpecificationType String

* This entry is required


  * Must equal: "OpenIOC"
