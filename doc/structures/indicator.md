<a id="top"></a>
# *Indicator* Object

*Indicator* An indicator is a test, or a collection of judgements that define
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
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|&#10003;|
|[producer](#propertyproducer-shortstringstring)|ShortStringString| |&#10003;|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-indicatortypeidentifierstring)|IndicatorTypeIdentifierString|The fixed value indicator|&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object|The time range during which this Indicator is considered valid.|&#10003;|
|[composite_indicator_expression](#propertycomposite_indicator_expression-compositeindicatorexpressionobject)|*CompositeIndicatorExpression* Object| ||
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|level of confidence held in the accuracy of this Indicator||
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.||
|[external_ids](#propertyexternal_ids-stringlist)|String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[indicator_type](#propertyindicator_type-indicatortypestringlist)|IndicatorTypeString List|Specifies the type or types for this Indicator||
|[kill_chain_phases](#propertykill_chain_phases-killchainphaseobjectlist)|*KillChainPhase* Object List|relevant kill chain phases indicated by this Indicator||
|[language](#propertylanguage-shortstringstring)|ShortStringString|The human language this object is specified in.||
|[likely_impact](#propertylikely_impact-longstringstring)|LongStringString|likely potential impact within the relevant context if this Indicator were to occur||
|[negate](#propertynegate-boolean)|Boolean|specifies the absence of the pattern||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[severity](#propertyseverity-severitystring)|SeverityString| ||
|[short_description](#propertyshort_description-medstringstring)|MedStringString|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedStringString| ||
|[source_uri](#propertysource_uri-string)|String| ||
|[specification](#propertyspecification-either)|*JudgementSpecification* Object| ||
|[tags](#propertytags-shortstringstringlist)|ShortStringString List|Descriptors for this indicator||
|[test_mechanisms](#propertytest_mechanisms-medstringstringlist)|MedStringString List|Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortStringString|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.||

* Reference: [IndicatorType](http://stixproject.github.io/data-model/1.2/indicator/IndicatorType/)

<a id="propertycomposite_indicator_expression-compositeindicatorexpressionobject"></a>
## Property composite_indicator_expression ∷ *CompositeIndicatorExpression* Object

* This entry is optional


<a id="map3-ref"></a>
* *CompositeIndicatorExpression* Object Value
  * Details: [*CompositeIndicatorExpression* Object](#map3)

<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

level of confidence held in the accuracy of this Indicator

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

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷ String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

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

<a id="propertyindicator_type-indicatortypestringlist"></a>
## Property indicator_type ∷ IndicatorTypeString List

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
    * Private Threat Feed
    * URL Watchlist
  * Reference: [IndicatorTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/IndicatorTypeVocab-1.1/)

<a id="propertykill_chain_phases-killchainphaseobjectlist"></a>
## Property kill_chain_phases ∷ *KillChainPhase* Object List

relevant kill chain phases indicated by this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


<a id="map4-ref"></a>
* *KillChainPhase* Object Value
  * Details: [*KillChainPhase* Object](#map4)

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortStringString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylikely_impact-longstringstring"></a>
## Property likely_impact ∷ LongStringString

likely potential impact within the relevant context if this Indicator were to occur

* This entry is optional


  * *LongString* String with at most 5000 characters

<a id="propertynegate-boolean"></a>
## Property negate ∷ Boolean

specifies the absence of the pattern

* This entry is optional



<a id="propertyproducer-shortstringstring"></a>
## Property producer ∷ ShortStringString

* This entry is required
* Dev Notes: TODO - Document what is supposed to be in this field!


  * *ShortString* String with at most 1024 characters

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyseverity-severitystring"></a>
## Property severity ∷ SeverityString

* This entry is optional


  * Allowed Values:
    * Critical
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedStringString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedStringString

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷ String

* This entry is optional


  * A URI

<a id="propertyspecification-either"></a>
## Property specification ∷ Either

* This entry is optional


  * Only one of the following schemas will match

<a id="map5-ref"></a>
* *JudgementSpecification* Object Value
  * Details: [*JudgementSpecification* Object](#map5)

<a id="map6-ref"></a>
* *ThreatBrainSpecification* Object Value
  * Details: [*ThreatBrainSpecification* Object](#map6)

<a id="map7-ref"></a>
* *SnortSpecification* Object Value
  * Details: [*SnortSpecification* Object](#map7)

<a id="map8-ref"></a>
* *SIOCSpecification* Object Value
  * Details: [*SIOCSpecification* Object](#map8)

<a id="map9-ref"></a>
* *OpenIOCSpecification* Object Value
  * Details: [*OpenIOCSpecification* Object](#map9)

<a id="propertytags-shortstringstringlist"></a>
## Property tags ∷ ShortStringString List

Descriptors for this indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertytest_mechanisms-medstringstringlist"></a>
## Property test_mechanisms ∷ MedStringString List

Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


  * *MedString* String with at most 2048 characters

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortStringString

A short title for this object, used as primary display and reference value

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLPString

Specification for how, and to whom, this object can be shared.

* This entry is optional


  * *TLP* TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-indicatortypeidentifierstring"></a>
## Property type ∷ IndicatorTypeIdentifierString

The fixed value indicator

* This entry is required


  * *IndicatorTypeIdentifier* The fixed value "indicator"
  * Must equal: "indicator"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

The time range during which this Indicator is considered valid.

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
|[url](#propertyurl-string)|String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

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


  * *MedString* String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map2"></a>
# *ValidTime* Object

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="map3"></a>
# *CompositeIndicatorExpression* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[indicator_ids](#propertyindicator_ids-stringlist)|String List| |&#10003;|
|[operator](#propertyoperator-booleanoperatorstring)|BooleanOperatorString| |&#10003;|

* Reference: [CompositeIndicatorExpressionType](http://stixproject.github.io/data-model/1.2/indicator/CompositeIndicatorExpressionType/)

<a id="propertyindicator_ids-stringlist"></a>
## Property indicator_ids ∷ String List

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * A URI leading to an indicator

<a id="propertyoperator-booleanoperatorstring"></a>
## Property operator ∷ BooleanOperatorString

* This entry is required


  * Allowed Values:
    * and
    * not
    * or

<a id="map4"></a>
# *KillChainPhase* Object

*KillChainPhase* The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)|String|The name of the kill chain.|&#10003;|
|[phase_name](#propertyphase_name-string)|String|The name of the phase in the kill chain.|&#10003;|

* Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

<a id="propertykill_chain_name-string"></a>
## Property kill_chain_name ∷ String

The name of the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Must equal: "lockheed-martin-cyber-kill-chain"
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)

<a id="propertyphase_name-string"></a>
## Property phase_name ∷ String

The name of the phase in the kill chain.

* This entry is required


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Allowed Values:
    * actions-on-objective
    * command-and-control
    * delivery
    * exploitation
    * installation
    * reconnaissance
    * weaponization
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)

<a id="map5"></a>
# *JudgementSpecification* Object

*JudgementSpecification* An indicator based on a list of judgements.  If any of the Observables in it's judgements are encountered, than it may be matches against.  If there are any required judgements, they all must be matched in order for the indicator to be considered a match.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[judgements](#propertyjudgements-stringlist)|String List| |&#10003;|
|[required_judgements](#propertyrequired_judgements-relatedjudgementobjectlist)|*RelatedJudgement* Object List| |&#10003;|
|[type](#propertytype-judgementspecificationtypestring)|JudgementSpecificationTypeString| |&#10003;|


<a id="propertyjudgements-stringlist"></a>
## Property judgements ∷ String List

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * A URI leading to a judgement

<a id="propertyrequired_judgements-relatedjudgementobjectlist"></a>
## Property required_judgements ∷ *RelatedJudgement* Object List

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map10-ref"></a>
* *RelatedJudgement* Object Value
  * Details: [*RelatedJudgement* Object](#map10)

<a id="propertytype-judgementspecificationtypestring"></a>
## Property type ∷ JudgementSpecificationTypeString

* This entry is required


  * Must equal: "Judgement"

<a id="map10"></a>
# *RelatedJudgement* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[judgement_id](#propertyjudgement_id-string)|String| |&#10003;|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| ||
|[relationship](#propertyrelationship-string)|String| ||
|[source](#propertysource-string)|String| ||


<a id="propertyconfidence-highmedlowstring"></a>
## Property confidence ∷ HighMedLowString

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)

<a id="propertyjudgement_id-string"></a>
## Property judgement_id ∷ String

* This entry is required


  * A URI leading to a judgement

<a id="propertyrelationship-string"></a>
## Property relationship ∷ String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷ String

* This entry is optional



<a id="map6"></a>
# *ThreatBrainSpecification* Object

*ThreatBrainSpecification* An indicator which runs in threatbrain...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-threatbrainspecificationtypestring)|ThreatBrainSpecificationTypeString| |&#10003;|
|[variables](#propertyvariables-stringlist)|String List| |&#10003;|
|[query](#propertyquery-string)|String| ||


<a id="propertyquery-string"></a>
## Property query ∷ String

* This entry is optional



<a id="propertytype-threatbrainspecificationtypestring"></a>
## Property type ∷ ThreatBrainSpecificationTypeString

* This entry is required


  * Must equal: "ThreatBrain"

<a id="propertyvariables-stringlist"></a>
## Property variables ∷ String List

* This entry is required
* This entry's type is sequential (allows zero or more values)



<a id="map7"></a>
# *SnortSpecification* Object

*SnortSpecification* An indicator which runs in snort...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[snort_sig](#propertysnort_sig-string)|String| |&#10003;|
|[type](#propertytype-snortspecificationtypestring)|SnortSpecificationTypeString| |&#10003;|


<a id="propertysnort_sig-string"></a>
## Property snort_sig ∷ String

* This entry is required



<a id="propertytype-snortspecificationtypestring"></a>
## Property type ∷ SnortSpecificationTypeString

* This entry is required


  * Must equal: "Snort"

<a id="map8"></a>
# *SIOCSpecification* Object

*SIOCSpecification* An indicator which runs in snort...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[SIOC](#propertysioc-string)|String| |&#10003;|
|[type](#propertytype-siocspecificationtypestring)|SIOCSpecificationTypeString| |&#10003;|


<a id="propertysioc-string"></a>
## Property SIOC ∷ String

* This entry is required



<a id="propertytype-siocspecificationtypestring"></a>
## Property type ∷ SIOCSpecificationTypeString

* This entry is required


  * Must equal: "SIOC"

<a id="map9"></a>
# *OpenIOCSpecification* Object

*OpenIOCSpecification* An indicator which contains an XML blob of an openIOC indicator..

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[open_IOC](#propertyopen_ioc-string)|String| |&#10003;|
|[type](#propertytype-openiocspecificationtypestring)|OpenIOCSpecificationTypeString| |&#10003;|


<a id="propertyopen_ioc-string"></a>
## Property open_IOC ∷ String

* This entry is required



<a id="propertytype-openiocspecificationtypestring"></a>
## Property type ∷ OpenIOCSpecificationTypeString

* This entry is required


  * Must equal: "OpenIOC"
