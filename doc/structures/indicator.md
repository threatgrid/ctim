<a name="top"/>
# *Indicator* Map

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

| key | type | required? |
| --- | ---- | --------- |
|[:alternate_ids](#mapentry-alternate_ids-string)|String||
|[:composite_indicator_expression](#mapentry-composite_indicator_expression-compositeindicatorexpressionmap)|*CompositeIndicatorExpression* Map||
|[:confidence](#mapentry-confidence-string)|String||
|[:description](#mapentry-description-string)|String||
|[:external_ids](#mapentry-external_ids-string)|String||
|[:id](#mapentry-id-string)|String|&#10003;|
|[:indicated_TTP](#mapentry-indicated_ttp-relatedttpmap)|*RelatedTTP* Map||
|[:indicator_type](#mapentry-indicator_type-string)|String||
|[:kill_chain_phases](#mapentry-kill_chain_phases-string)|String||
|[:language](#mapentry-language-string)|String||
|[:likely_impact](#mapentry-likely_impact-string)|String||
|[:negate](#mapentry-negate-boolean)|Boolean||
|[:producer](#mapentry-producer-string)|String|&#10003;|
|[:related_COAs](#mapentry-related_coas-relatedcoamap)|*RelatedCOA* Map||
|[:related_campaigns](#mapentry-related_campaigns-relatedcampaignmap)|*RelatedCampaign* Map||
|[:related_indicators](#mapentry-related_indicators-relatedindicatormap)|*RelatedIndicator* Map||
|[:revision](#mapentry-revision-integer)|Integer||
|[:schema_version](#mapentry-schema_version-string)|String|&#10003;|
|[:short_description](#mapentry-short_description-string)|String||
|[:source](#mapentry-source-string)|String||
|[:source_uri](#mapentry-source_uri-string)|String||
|[:specification](#mapentry-specification-either)|*JudgementSpecification* Map||
|[:suggested_COAs](#mapentry-suggested_coas-relatedcoamap)|*RelatedCOA* Map||
|[:tags](#mapentry-tags-string)|String||
|[:test_mechanisms](#mapentry-test_mechanisms-string)|String||
|[:timestamp](#mapentry-timestamp-instdate)|Inst (Date)||
|[:title](#mapentry-title-string)|String||
|[:tlp](#mapentry-tlp-string)|String||
|[:type](#mapentry-type-string)|String|&#10003;|
|[:uri](#mapentry-uri-string)|String||
|[:valid_time](#mapentry-valid_time-validtimemap)|*ValidTime* Map|&#10003;|
* Reference: [IndicatorType](http://stixproject.github.io/data-model/1.2/indicator/IndicatorType/)

<a name="mapentry-alternate_ids-string"/>
## MapEntry :alternate_ids ∷ [String]

alternative identifier (or alias)

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :alternate_ids

* String Value
  * Plumatic Schema: [Str]

<a name="mapentry-composite_indicator_expression-compositeindicatorexpressionmap"/>
## MapEntry :composite_indicator_expression ∷ *CompositeIndicatorExpression* Map

* This entry is optional

* Keyword Key
  * Plumatic Schema: :composite_indicator_expression

<a name="map2-ref"/>
* *CompositeIndicatorExpression* Map Value
  * Details: [*CompositeIndicatorExpression* Map](#map2)

<a name="mapentry-confidence-string"/>
## MapEntry :confidence ∷ String

level of confidence held in the accuracy of this Indicator

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

<a name="mapentry-indicated_ttp-relatedttpmap"/>
## MapEntry :indicated_TTP ∷ [*RelatedTTP* Map]

the relevant TTP indicated by this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :indicated_TTP

<a name="map3-ref"/>
* *RelatedTTP* Map Value
  * Details: [*RelatedTTP* Map](#map3)

<a name="mapentry-indicator_type-string"/>
## MapEntry :indicator_type ∷ [String]

Specifies the type or types for this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :indicator_type

* String Value
  * Plumatic Schema: [(enum ...)]
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

<a name="mapentry-kill_chain_phases-string"/>
## MapEntry :kill_chain_phases ∷ [String]

relevant kill chain phases indicated by this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified

* Keyword Key
  * Plumatic Schema: :kill_chain_phases

* String Value
  * Plumatic Schema: [Str]

<a name="mapentry-language-string"/>
## MapEntry :language ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :language

* String Value
  * Plumatic Schema: Str

<a name="mapentry-likely_impact-string"/>
## MapEntry :likely_impact ∷ String

likely potential impact within the relevant context if this Indicator were to occur

* This entry is optional

* Keyword Key
  * Plumatic Schema: :likely_impact

* String Value
  * Plumatic Schema: Str

<a name="mapentry-negate-boolean"/>
## MapEntry :negate ∷ Boolean

specifies the absence of the pattern

* This entry is optional

* Keyword Key
  * Plumatic Schema: :negate

* Boolean Value
  * Plumatic Schema: Bool

<a name="mapentry-producer-string"/>
## MapEntry :producer ∷ String

* This entry is required
* Dev Notes: TODO - Document what is supposed to be in this field!

* Keyword Key
  * Plumatic Schema: :producer

* String Value
  * Plumatic Schema: Str

<a name="mapentry-related_coas-relatedcoamap"/>
## MapEntry :related_COAs ∷ [*RelatedCOA* Map]

related Courses of Actions for this cyber threat Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_COAs

<a name="map7-ref"/>
* *RelatedCOA* Map Value
  * Details: [*RelatedCOA* Map](#map7)

<a name="mapentry-related_campaigns-relatedcampaignmap"/>
## MapEntry :related_campaigns ∷ [*RelatedCampaign* Map]

references to related campaigns

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_campaigns

<a name="map6-ref"/>
* *RelatedCampaign* Map Value
  * Details: [*RelatedCampaign* Map](#map6)

<a name="mapentry-related_indicators-relatedindicatormap"/>
## MapEntry :related_indicators ∷ [*RelatedIndicator* Map]

relationship between the enclosing indicator and a disparate indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :related_indicators

<a name="map5-ref"/>
* *RelatedIndicator* Map Value
  * Details: [*RelatedIndicator* Map](#map5)

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
  * Must equal: "0.3.1"

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

<a name="mapentry-specification-either"/>
## MapEntry :specification ∷ Either

* This entry is optional

* Keyword Key
  * Plumatic Schema: :specification

* Either Value
  * Only one of the following schemas will match

<a name="map8-ref"/>
* *JudgementSpecification* Map Value
  * Details: [*JudgementSpecification* Map](#map8)

<a name="map9-ref"/>
* *ThreatBrainSpecification* Map Value
  * Details: [*ThreatBrainSpecification* Map](#map9)

<a name="map10-ref"/>
* *SnortSpecification* Map Value
  * Details: [*SnortSpecification* Map](#map10)

<a name="map11-ref"/>
* *SIOCSpecification* Map Value
  * Details: [*SIOCSpecification* Map](#map11)

<a name="map12-ref"/>
* *OpenIOCSpecification* Map Value
  * Details: [*OpenIOCSpecification* Map](#map12)

<a name="mapentry-suggested_coas-relatedcoamap"/>
## MapEntry :suggested_COAs ∷ [*RelatedCOA* Map]

suggested Courses of Action

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :suggested_COAs

<a name="map4-ref"/>
* *RelatedCOA* Map Value
  * Details: [*RelatedCOA* Map](#map4)

<a name="mapentry-tags-string"/>
## MapEntry :tags ∷ [String]

Descriptors for this indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :tags

* String Value
  * Plumatic Schema: [Str]

<a name="mapentry-test_mechanisms-string"/>
## MapEntry :test_mechanisms ∷ [String]

Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)
* Dev Notes: simplified

* Keyword Key
  * Plumatic Schema: :test_mechanisms

* String Value
  * Plumatic Schema: [Str]

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
  * Must equal: "indicator"

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
# *CompositeIndicatorExpression* Map

| key | type | required? |
| --- | ---- | --------- |
|[:indicator_ids](#mapentry-indicator_ids-string)|String|&#10003;|
|[:operator](#mapentry-operator-string)|String|&#10003;|
* Reference: [CompositeIndicatorExpressionType](http://stixproject.github.io/data-model/1.2/indicator/CompositeIndicatorExpressionType/)

<a name="mapentry-indicator_ids-string"/>
## MapEntry :indicator_ids ∷ [String]

* This entry is required
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :indicator_ids

* String Value
  * A URI leading to an indicator
  * Plumatic Schema: [Str]

<a name="mapentry-operator-string"/>
## MapEntry :operator ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :operator

* String Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * and
    * not
    * or

<a name="map3"/>
# *RelatedTTP* Map

| key | type | required? |
| --- | ---- | --------- |
|[:confidence](#mapentry-confidence-string)|String||
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||
|[:ttp_id](#mapentry-ttp_id-string)|String|&#10003;|

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

<a name="mapentry-ttp_id-string"/>
## MapEntry :ttp_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :ttp_id

* String Value
  * A URI leading to a TTP
  * Plumatic Schema: Str

<a name="map4"/>
# *RelatedCOA* Map

| key | type | required? |
| --- | ---- | --------- |
|[:COA_id](#mapentry-coa_id-string)|String|&#10003;|
|[:confidence](#mapentry-confidence-string)|String||
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||

<a name="mapentry-coa_id-string"/>
## MapEntry :COA_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :COA_id

* String Value
  * A URI leading to a COA
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

<a name="map5"/>
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
# *RelatedCOA* Map

| key | type | required? |
| --- | ---- | --------- |
|[:COA_id](#mapentry-coa_id-string)|String|&#10003;|
|[:confidence](#mapentry-confidence-string)|String||
|[:relationship](#mapentry-relationship-string)|String||
|[:source](#mapentry-source-string)|String||

<a name="mapentry-coa_id-string"/>
## MapEntry :COA_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :COA_id

* String Value
  * A URI leading to a COA
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

<a name="map8"/>
# *JudgementSpecification* Map

An indicator based on a list of judgements.  If any of the Observables in it's judgements are encountered, than it may be matches against.  If there are any required judgements, they all must be matched in order for the indicator to be considered a match.

| key | type | required? |
| --- | ---- | --------- |
|[:judgements](#mapentry-judgements-string)|String|&#10003;|
|[:required_judgements](#mapentry-required_judgements-relatedjudgementmap)|*RelatedJudgement* Map|&#10003;|
|[:type](#mapentry-type-string)|String|&#10003;|

<a name="mapentry-judgements-string"/>
## MapEntry :judgements ∷ [String]

* This entry is required
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :judgements

* String Value
  * A URI leading to a judgement
  * Plumatic Schema: [Str]

<a name="mapentry-required_judgements-relatedjudgementmap"/>
## MapEntry :required_judgements ∷ [*RelatedJudgement* Map]

* This entry is required
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :required_judgements

<a name="map13-ref"/>
* *RelatedJudgement* Map Value
  * Details: [*RelatedJudgement* Map](#map13)

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "Judgement"

<a name="map13"/>
# *RelatedJudgement* Map

| key | type | required? |
| --- | ---- | --------- |
|[:confidence](#mapentry-confidence-string)|String||
|[:judgement_id](#mapentry-judgement_id-string)|String|&#10003;|
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

<a name="mapentry-judgement_id-string"/>
## MapEntry :judgement_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :judgement_id

* String Value
  * A URI leading to a judgement
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

<a name="map9"/>
# *ThreatBrainSpecification* Map

An indicator which runs in threatbrain...

| key | type | required? |
| --- | ---- | --------- |
|[:query](#mapentry-query-string)|String||
|[:type](#mapentry-type-string)|String|&#10003;|
|[:variables](#mapentry-variables-string)|String|&#10003;|

<a name="mapentry-query-string"/>
## MapEntry :query ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :query

* String Value
  * Plumatic Schema: Str

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "ThreatBrain"

<a name="mapentry-variables-string"/>
## MapEntry :variables ∷ [String]

* This entry is required
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :variables

* String Value
  * Plumatic Schema: [Str]

<a name="map10"/>
# *SnortSpecification* Map

An indicator which runs in snort...

| key | type | required? |
| --- | ---- | --------- |
|[:snort_sig](#mapentry-snort_sig-string)|String|&#10003;|
|[:type](#mapentry-type-string)|String|&#10003;|

<a name="mapentry-snort_sig-string"/>
## MapEntry :snort_sig ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :snort_sig

* String Value
  * Plumatic Schema: Str

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "Snort"

<a name="map11"/>
# *SIOCSpecification* Map

An indicator which runs in snort...

| key | type | required? |
| --- | ---- | --------- |
|[:SIOC](#mapentry-sioc-string)|String|&#10003;|
|[:type](#mapentry-type-string)|String|&#10003;|

<a name="mapentry-sioc-string"/>
## MapEntry :SIOC ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :SIOC

* String Value
  * Plumatic Schema: Str

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "SIOC"

<a name="map12"/>
# *OpenIOCSpecification* Map

An indicator which contains an XML blob of an openIOC indicator..

| key | type | required? |
| --- | ---- | --------- |
|[:open_IOC](#mapentry-open_ioc-string)|String|&#10003;|
|[:type](#mapentry-type-string)|String|&#10003;|

<a name="mapentry-open_ioc-string"/>
## MapEntry :open_IOC ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :open_IOC

* String Value
  * Plumatic Schema: Str

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "OpenIOC"
