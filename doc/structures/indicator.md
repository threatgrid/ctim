<a id="top"></a>
# *Indicator*

> Reference: [IndicatorType](http://stixproject.github.io/data-model/1.2/indicator/IndicatorType/)

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
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[producer](#propertyproducer-shortstring)|ShortString| |**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#propertytype-indicatortypeidentifierstring)|IndicatorTypeIdentifierString|The fixed value indicator|**Required**|
|[valid_time](#propertyvalid_time-validtime)|[*ValidTime*](#map2)|The time range during which this Indicator is considered valid.|**Required**|
|[composite_indicator_expression](#propertycomposite_indicator_expression-compositeindicatorexpression)|[*CompositeIndicatorExpression*](#map3)| |_Optional_|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString|level of confidence held in the accuracy of this Indicator|_Optional_|
|[description](#propertydescription-markdownstring)|MarkdownString|A description of object, which may be detailed.|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap1)|[[*ExternalReference*](#map1)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[indicator_type](#propertyindicator_type-indicatortypestring)|[IndicatorTypeString]|Specifies the type or types for this Indicator|_Optional_|
|[kill_chain_phases](#propertykill_chain_phases-killchainphasemap4)|[[*KillChainPhase*](#map4)]|relevant kill chain phases indicated by this Indicator|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[likely_impact](#propertylikely_impact-longstring)|LongString|likely potential impact within the relevant context if this Indicator were to occur|_Optional_|
|[negate](#propertynegate-boolean)|Boolean|specifies the absence of the pattern|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[severity](#propertyseverity-highmedlowstring)|HighMedLowString| |_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[specification](#propertyspecification-either)|[*JudgementSpecification*](#map5)| |_Optional_|
|[tags](#propertytags-shortstring)|[ShortString]|Descriptors for this indicator|_Optional_|
|[test_mechanisms](#propertytest_mechanisms-medstring)|[MedString]|Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator|_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyproducer-shortstring"></a>
## Property producer ∷ ShortString

* This entry is required
* Dev Notes: TODO - Document what is supposed to be in this field!


  * *ShortString* String with at most 1024 characters

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertytype-indicatortypeidentifierstring"></a>
## Property type ∷ IndicatorTypeIdentifierString

The fixed value indicator

* This entry is required


  * *IndicatorTypeIdentifier* The fixed value "indicator"
  * Must equal: "indicator"

<a id="propertyvalid_time-validtime"></a>
## Property valid_time ∷ *ValidTime*

The time range during which this Indicator is considered valid.

* This entry is required


<a id="map2-ref"></a>
* *ValidTime* Value
  * Details: [*ValidTime*](#map2)

<a id="propertycomposite_indicator_expression-compositeindicatorexpression"></a>
## Property composite_indicator_expression ∷ *CompositeIndicatorExpression*

* This entry is optional


<a id="map3-ref"></a>
* *CompositeIndicatorExpression* Value
  * Details: [*CompositeIndicatorExpression*](#map3)

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

<a id="propertyexternal_ids-string"></a>
## Property external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferencemap1"></a>
## Property external_references ∷ [[*ExternalReference*](#map1)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map1-ref"></a>
* *ExternalReference* Value
  * Details: [*ExternalReference*](#map1)

<a id="propertyindicator_type-indicatortypestring"></a>
## Property indicator_type ∷ [IndicatorTypeString]

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


<a id="propertykill_chain_phases-killchainphasemap4"></a>
## Property kill_chain_phases ∷ [[*KillChainPhase*](#map4)]

relevant kill chain phases indicated by this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


<a id="map4-ref"></a>
* *KillChainPhase* Value
  * Details: [*KillChainPhase*](#map4)

<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylikely_impact-longstring"></a>
## Property likely_impact ∷ LongString

likely potential impact within the relevant context if this Indicator were to occur

* This entry is optional


  * *LongString* String with at most 5000 characters

<a id="propertynegate-boolean"></a>
## Property negate ∷ Boolean

specifies the absence of the pattern

* This entry is optional



<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyseverity-highmedlowstring"></a>
## Property severity ∷ HighMedLowString

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertyshort_description-medstring"></a>
## Property short_description ∷ MedString

A single line, short summary of the object.

* This entry is optional


  * *MedString* String with at most 2048 characters

<a id="propertysource-medstring"></a>
## Property source ∷ MedString

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
* *JudgementSpecification* Value
  * Details: [*JudgementSpecification*](#map5)

<a id="map6-ref"></a>
* *ThreatBrainSpecification* Value
  * Details: [*ThreatBrainSpecification*](#map6)

<a id="map7-ref"></a>
* *SnortSpecification* Value
  * Details: [*SnortSpecification*](#map7)

<a id="map8-ref"></a>
* *SIOCSpecification* Value
  * Details: [*SIOCSpecification*](#map8)

<a id="map9-ref"></a>
* *OpenIOCSpecification* Value
  * Details: [*OpenIOCSpecification*](#map9)

<a id="propertytags-shortstring"></a>
## Property tags ∷ [ShortString]

Descriptors for this indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="propertytest_mechanisms-medstring"></a>
## Property test_mechanisms ∷ [MedString]

Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified


  * *MedString* String with at most 2048 characters

<a id="propertytimestamp-datetime"></a>
## Property timestamp ∷ DateTime

The time this object was created at, or last modified.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstring"></a>
## Property title ∷ ShortString

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


</details>

<a id="map1"></a>
# *ExternalReference*

> Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

*ExternalReference* External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstring)|MedString|The source within which the external-reference is defined (system, registry, organization, etc.)|**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString| |_Optional_|
|[external_id](#propertyexternal_id-string)|String|An identifier for the external reference content.|_Optional_|
|[hashes](#propertyhashes-string)|[String]|Specifies a dictionary of hashes for the contents of the url.|_Optional_|
|[url](#propertyurl-string)|String|A URL reference to an external resource|_Optional_|


<details>

<a id="propertysource_name-medstring"></a>
## Property source_name ∷ MedString

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * *MedString* String with at most 2048 characters

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷ String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-string"></a>
## Property hashes ∷ [String]

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyurl-string"></a>
## Property url ∷ String

A URL reference to an external resource

* This entry is optional


  * A URI


</details>

<a id="map2"></a>
# *ValidTime*

> Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

*ValidTime* Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-datetime)|DateTime|If end_time is not present, then the valid time position of the object does not have an upper bound.|_Optional_|
|[start_time](#propertystart_time-datetime)|DateTime|If not present, the valid time position of the indicator does not have an upper bound|_Optional_|


<details>

<a id="propertyend_time-datetime"></a>
## Property end_time ∷ DateTime

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-datetime"></a>
## Property start_time ∷ DateTime

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.


</details>

<a id="map3"></a>
# *CompositeIndicatorExpression*

> Reference: [CompositeIndicatorExpressionType](http://stixproject.github.io/data-model/1.2/indicator/CompositeIndicatorExpressionType/)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[indicator_ids](#propertyindicator_ids-string)|[String]| |**Required**|
|[operator](#propertyoperator-booleanoperatorstring)|BooleanOperatorString| |**Required**|


<details>

<a id="propertyindicator_ids-string"></a>
## Property indicator_ids ∷ [String]

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


</details>

<a id="map4"></a>
# *KillChainPhase*

> Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

*KillChainPhase* The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#propertykill_chain_name-string)|String|The name of the kill chain.|**Required**|
|[phase_name](#propertyphase_name-string)|String|The name of the phase in the kill chain.|**Required**|


<details>

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



</details>

<a id="map5"></a>
# *JudgementSpecification*

*JudgementSpecification* An indicator based on a list of judgements.  If any of the Observables in it's judgements are encountered, than it may be matches against.  If there are any required judgements, they all must be matched in order for the indicator to be considered a match.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[judgements](#propertyjudgements-string)|[String]| |**Required**|
|[required_judgements](#propertyrequired_judgements-relatedjudgementmap10)|[[*RelatedJudgement*](#map10)]| |**Required**|
|[type](#propertytype-judgementspecificationtypestring)|JudgementSpecificationTypeString| |**Required**|


<details>

<a id="propertyjudgements-string"></a>
## Property judgements ∷ [String]

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * A URI leading to a judgement

<a id="propertyrequired_judgements-relatedjudgementmap10"></a>
## Property required_judgements ∷ [[*RelatedJudgement*](#map10)]

* This entry is required
* This entry's type is sequential (allows zero or more values)


<a id="map10-ref"></a>
* *RelatedJudgement* Value
  * Details: [*RelatedJudgement*](#map10)

<a id="propertytype-judgementspecificationtypestring"></a>
## Property type ∷ JudgementSpecificationTypeString

* This entry is required


  * Must equal: "Judgement"


</details>

<a id="map10"></a>
# *RelatedJudgement*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[judgement_id](#propertyjudgement_id-string)|String| |**Required**|
|[confidence](#propertyconfidence-highmedlowstring)|HighMedLowString| |_Optional_|
|[relationship](#propertyrelationship-string)|String| |_Optional_|
|[source](#propertysource-string)|String| |_Optional_|


<details>

<a id="propertyjudgement_id-string"></a>
## Property judgement_id ∷ String

* This entry is required


  * A URI leading to a judgement

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


<a id="propertyrelationship-string"></a>
## Property relationship ∷ String

* This entry is optional



<a id="propertysource-string"></a>
## Property source ∷ String

* This entry is optional




</details>

<a id="map6"></a>
# *ThreatBrainSpecification*

*ThreatBrainSpecification* An indicator which runs in threatbrain...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-threatbrainspecificationtypestring)|ThreatBrainSpecificationTypeString| |**Required**|
|[variables](#propertyvariables-string)|[String]| |**Required**|
|[query](#propertyquery-string)|String| |_Optional_|


<details>

<a id="propertytype-threatbrainspecificationtypestring"></a>
## Property type ∷ ThreatBrainSpecificationTypeString

* This entry is required


  * Must equal: "ThreatBrain"

<a id="propertyvariables-string"></a>
## Property variables ∷ [String]

* This entry is required
* This entry's type is sequential (allows zero or more values)



<a id="propertyquery-string"></a>
## Property query ∷ String

* This entry is optional




</details>

<a id="map7"></a>
# *SnortSpecification*

*SnortSpecification* An indicator which runs in snort...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[snort_sig](#propertysnort_sig-string)|String| |**Required**|
|[type](#propertytype-snortspecificationtypestring)|SnortSpecificationTypeString| |**Required**|


<details>

<a id="propertysnort_sig-string"></a>
## Property snort_sig ∷ String

* This entry is required



<a id="propertytype-snortspecificationtypestring"></a>
## Property type ∷ SnortSpecificationTypeString

* This entry is required


  * Must equal: "Snort"


</details>

<a id="map8"></a>
# *SIOCSpecification*

*SIOCSpecification* An indicator which runs in snort...

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[SIOC](#propertysioc-string)|String| |**Required**|
|[type](#propertytype-siocspecificationtypestring)|SIOCSpecificationTypeString| |**Required**|


<details>

<a id="propertysioc-string"></a>
## Property SIOC ∷ String

* This entry is required



<a id="propertytype-siocspecificationtypestring"></a>
## Property type ∷ SIOCSpecificationTypeString

* This entry is required


  * Must equal: "SIOC"


</details>

<a id="map9"></a>
# *OpenIOCSpecification*

*OpenIOCSpecification* An indicator which contains an XML blob of an openIOC indicator..

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[open_IOC](#propertyopen_ioc-string)|String| |**Required**|
|[type](#propertytype-openiocspecificationtypestring)|OpenIOCSpecificationTypeString| |**Required**|


<details>

<a id="propertyopen_ioc-string"></a>
## Property open_IOC ∷ String

* This entry is required



<a id="propertytype-openiocspecificationtypestring"></a>
## Property type ∷ OpenIOCSpecificationTypeString

* This entry is required


  * Must equal: "OpenIOC"


</details>
