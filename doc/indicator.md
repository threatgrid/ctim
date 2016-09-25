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

### Map Value

* Reference: http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/

#### MapEntry: :start_time -> Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

##### Keyword Key

* Plumatic Schema: :start_time

##### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

#### MapEntry: :end_time -> Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional

##### Keyword Key

* Plumatic Schema: :end_time

##### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

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

#### *RelatedJudgement* Map Value


##### MapEntry: :confidence -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :confidence

###### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

##### MapEntry: :source -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :source

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :relationship -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :relationship

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :judgement_id -> String

* This entry is required

###### Keyword Key

* Plumatic Schema: :judgement_id

###### String Value

A URI leading to a judgement

* Plumatic Schema: Str

## MapEntry: :composite_indicator_expression -> *CompositeIndicatorExpression* Map

* This entry is optional

### Keyword Key

* Plumatic Schema: :composite_indicator_expression

### *CompositeIndicatorExpression* Map Value

* Reference: http://stixproject.github.io/data-model/1.2/indicator/CompositeIndicatorExpressionType/

#### MapEntry: :operator -> String

* This entry is required

##### Keyword Key

* Plumatic Schema: :operator

##### String Value

* Plumatic Schema: (enum "and")
* Must equal: "and"

#### MapEntry: :indicator_ids -> [String]

* This entry is required
* This entry's type is sequential (allows zero or more values)

##### Keyword Key

* Plumatic Schema: :indicator_ids

###### String Value

A URI leading to an indicator

* Plumatic Schema: [Str]

## MapEntry: :indicated_TTP -> [*RelatedTTP* Map]

the relevant TTP indicated by this Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :indicated_TTP

#### *RelatedTTP* Map Value


##### MapEntry: :confidence -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :confidence

###### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

##### MapEntry: :source -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :source

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :relationship -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :relationship

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :ttp_id -> String

* This entry is required

###### Keyword Key

* Plumatic Schema: :ttp_id

###### String Value

A URI leading to a TTP

* Plumatic Schema: Str

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

#### *RelatedCOA* Map Value


##### MapEntry: :confidence -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :confidence

###### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

##### MapEntry: :source -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :source

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :relationship -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :relationship

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :COA_id -> String

* This entry is required

###### Keyword Key

* Plumatic Schema: :COA_id

###### String Value

A URI leading to a COA

* Plumatic Schema: Str

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

#### *RelatedIndicator* Map Value


##### MapEntry: :confidence -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :confidence

###### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

##### MapEntry: :source -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :source

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :relationship -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :relationship

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :indicator_id -> String

* This entry is required

###### Keyword Key

* Plumatic Schema: :indicator_id

###### String Value

A URI leading to an indicator

* Plumatic Schema: Str

## MapEntry: :related_campaigns -> [*RelatedCampaign* Map]

references to related campaigns

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :related_campaigns

#### *RelatedCampaign* Map Value


##### MapEntry: :confidence -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :confidence

###### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

##### MapEntry: :source -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :source

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :relationship -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :relationship

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :campaign_id -> String

* This entry is required

###### Keyword Key

* Plumatic Schema: :campaign_id

###### String Value

A URI leading to a campaign

* Plumatic Schema: Str

## MapEntry: :related_COAs -> [*RelatedCOA* Map]

related Courses of Actions for this cyber threat Indicator

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :related_COAs

#### *RelatedCOA* Map Value


##### MapEntry: :confidence -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :confidence

###### String Value

* Plumatic Schema: (enum "Medium" "Unknown" "None" "High" "Low")
* Allowed Values: ("High" "Low" "Medium" "None" "Unknown")
* Reference: http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/

##### MapEntry: :source -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :source

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :relationship -> String

* This entry is optional

###### Keyword Key

* Plumatic Schema: :relationship

###### String Value

* Plumatic Schema: java.lang.String

##### MapEntry: :COA_id -> String

* This entry is required

###### Keyword Key

* Plumatic Schema: :COA_id

###### String Value

A URI leading to a COA

* Plumatic Schema: Str

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
