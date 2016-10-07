<a name="top"/>
# *Indicator* Map

http://stixproject.github.io/data-model/1.2/indicator/IndicatorType/


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

## MapEntry: :title -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :title

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :description -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :description

### String Value

Markdown text

* Plumatic Schema: Str

## MapEntry: :short_description -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :short_description

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :source -> String

* This entry is optional

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

* Plumatic Schema: (enum "indicator")
* Must equal: "indicator"

## MapEntry: :valid_time -> Map

* This entry is required

### Keyword Key

* Plumatic Schema: :valid_time

<a name="map1-ref"/>
### Map Value

[Map](#map1)

## MapEntry: :producer -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :producer

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :alternate_ids -> [String]

alternative identifier (or alias)

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :alternate_ids

#### String Value

* Plumatic Schema: [java.lang.String]

## MapEntry: :negate -> Boolean

specifies the absence of the pattern

* This entry is optional

### Keyword Key

* Plumatic Schema: :negate

### Boolean Value

* Plumatic Schema: Bool

## MapEntry: :indicator_type -> [String]

Specifies the type or types for this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :indicator_type

#### String Value

* Plumatic Schema: [(enum "File Hash Watchlist" "IMEI Watchlist" "Malicious E-mail" "Exfiltration" "C2" "URL Watchlist" "IMSI Watchlist" "Malware Artifacts" "Domain Watchlist" "Anonymization" "Host Characteristics" "IP Watchlist" "Compromised PKI Certificate" "Login Name")]
* Allowed Values: ("Anonymization" "C2" "Compromised PKI Certificate" "Domain Watchlist" "Exfiltration" "File Hash Watchlist" "Host Characteristics" "IMEI Watchlist" "IMSI Watchlist" "IP Watchlist" "Login Name" "Malicious E-mail" "Malware Artifacts" "URL Watchlist")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/IndicatorTypeVocab-1.1/

## MapEntry: :tags -> [String]

Descriptors for this indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :tags

#### String Value

* Plumatic Schema: [java.lang.String]

## MapEntry: :judgements -> [*RelatedJudgement* Map]

related Judgements for this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :judgements

<a name="map2-ref"/>
#### *RelatedJudgement* Map Value

[*RelatedJudgement* Map](#map2)

## MapEntry: :composite_indicator_expression -> *CompositeIndicatorExpression* Map

* This entry is optional

### Keyword Key

* Plumatic Schema: :composite_indicator_expression

<a name="map3-ref"/>
### *CompositeIndicatorExpression* Map Value

[*CompositeIndicatorExpression* Map](#map3)

## MapEntry: :indicated_TTP -> [*RelatedTTP* Map]

the relevant TTP indicated by this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :indicated_TTP

<a name="map4-ref"/>
#### *RelatedTTP* Map Value

[*RelatedTTP* Map](#map4)

## MapEntry: :likely_impact -> String

likely potential impact within the relevant context if this Indicator were to occur

* This entry is optional

### Keyword Key

* Plumatic Schema: :likely_impact

### String Value

* Plumatic Schema: Str

## MapEntry: :suggested_COAs -> [*RelatedCOA* Map]

suggested Courses of Action

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :suggested_COAs

<a name="map5-ref"/>
#### *RelatedCOA* Map Value

[*RelatedCOA* Map](#map5)

## MapEntry: :confidence -> String

level of confidence held in the accuracy of this Indicator

* This entry is optional

### Keyword Key

* Plumatic Schema: :confidence

### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

## MapEntry: :related_indicators -> [*RelatedIndicator* Map]

relationship between the enclosing indicator and a disparate indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :related_indicators

<a name="map6-ref"/>
#### *RelatedIndicator* Map Value

[*RelatedIndicator* Map](#map6)

## MapEntry: :related_campaigns -> [*RelatedCampaign* Map]

references to related campaigns

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :related_campaigns

<a name="map7-ref"/>
#### *RelatedCampaign* Map Value

[*RelatedCampaign* Map](#map7)

## MapEntry: :related_COAs -> [*RelatedCOA* Map]

related Courses of Actions for this cyber threat Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :related_COAs

<a name="map8-ref"/>
#### *RelatedCOA* Map Value

[*RelatedCOA* Map](#map8)

## MapEntry: :kill_chain_phases -> [String]

relevant kill chain phases indicated by this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :kill_chain_phases

#### String Value

* Plumatic Schema: [java.lang.String]

## MapEntry: :test_mechanisms -> [String]

Test Mechanisms effective at identifying the cyber Observables specified in this cyber threat Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :test_mechanisms

#### String Value

* Plumatic Schema: [java.lang.String]

## MapEntry: :specification -> Either

* This entry is optional

### Keyword Key

* Plumatic Schema: :specification

### Either Value

conditional choice

* Only one of the following schemas will match

<a name="map9-ref"/>
#### *JudgementSpecification* Map Value

[*JudgementSpecification* Map](#map9)

<a name="map10-ref"/>
#### *ThreatBrainSpecification* Map Value

[*ThreatBrainSpecification* Map](#map10)

<a name="map11-ref"/>
#### *SnortSpecification* Map Value

[*SnortSpecification* Map](#map11)

<a name="map12-ref"/>
#### *SIOCSpecification* Map Value

[*SIOCSpecification* Map](#map12)

<a name="map13-ref"/>
#### *OpenIOCSpecification* Map Value

[*OpenIOCSpecification* Map](#map13)

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
# *RelatedJudgement* Map

[return](#map2-ref)


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

## MapEntry: :judgement_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :judgement_id

### String Value

A URI leading to a judgement

* Plumatic Schema: Str

<a name="map3"/>
# *CompositeIndicatorExpression* Map

[return](#map3-ref)

* Reference: http://stixproject.github.io/data-model/1.2/indicator/CompositeIndicatorExpressionType/

## MapEntry: :operator -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :operator

### String Value

* Plumatic Schema: (enum "and")
* Must equal: "and"

## MapEntry: :indicator_ids -> [String]

* This entry is required
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :indicator_ids

#### String Value

A URI leading to an indicator

* Plumatic Schema: [Str]

<a name="map4"/>
# *RelatedTTP* Map

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

## MapEntry: :ttp_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :ttp_id

### String Value

A URI leading to a TTP

* Plumatic Schema: Str

<a name="map5"/>
# *RelatedCOA* Map

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

## MapEntry: :COA_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :COA_id

### String Value

A URI leading to a COA

* Plumatic Schema: Str

<a name="map6"/>
# *RelatedIndicator* Map

[return](#map6-ref)


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

## MapEntry: :indicator_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :indicator_id

### String Value

A URI leading to an indicator

* Plumatic Schema: Str

<a name="map7"/>
# *RelatedCampaign* Map

[return](#map7-ref)


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

<a name="map8"/>
# *RelatedCOA* Map

[return](#map8-ref)


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

## MapEntry: :COA_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :COA_id

### String Value

A URI leading to a COA

* Plumatic Schema: Str

<a name="map9"/>
# *JudgementSpecification* Map

[return](#map9-ref)

An indicator based on a list of judgements.  If any of the Observables in it's judgements are encountered, than it may be matches against.  If there are any required judgements, they all must be matched in order for the indicator to be considered a match.


## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "Judgement")
* Must equal: "Judgement"

## MapEntry: :judgements -> [String]

* This entry is required
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :judgements

#### String Value

A URI leading to a judgement

* Plumatic Schema: [Str]

## MapEntry: :required_judgements -> [*RelatedJudgement* Map]

* This entry is required
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :required_judgements

<a name="map5-ref"/>
#### *RelatedJudgement* Map Value

[*RelatedJudgement* Map](#map5)

<a name="map5"/>
# *RelatedJudgement* Map

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

## MapEntry: :judgement_id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :judgement_id

### String Value

A URI leading to a judgement

* Plumatic Schema: Str

<a name="map10"/>
# *ThreatBrainSpecification* Map

[return](#map10-ref)

An indicator which runs in threatbrain...


## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "ThreatBrain")
* Must equal: "ThreatBrain"

## MapEntry: :query -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :query

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :variables -> [String]

* This entry is required
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :variables

#### String Value

* Plumatic Schema: [java.lang.String]

<a name="map11"/>
# *SnortSpecification* Map

[return](#map11-ref)

An indicator which runs in snort...


## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "Snort")
* Must equal: "Snort"

## MapEntry: :snort_sig -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :snort_sig

### String Value

* Plumatic Schema: java.lang.String

<a name="map12"/>
# *SIOCSpecification* Map

[return](#map12-ref)

An indicator which runs in snort...


## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "SIOC")
* Must equal: "SIOC"

## MapEntry: :SIOC -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :SIOC

### String Value

* Plumatic Schema: java.lang.String

<a name="map13"/>
# *OpenIOCSpecification* Map

[return](#map13-ref)

An indicator which contains an XML blob of an openIOC indicator..


## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "OpenIOC")
* Must equal: "OpenIOC"

## MapEntry: :open_IOC -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :open_IOC

### String Value

* Plumatic Schema: java.lang.String
