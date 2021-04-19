<a id="map9"></a>
# *Consequence*

> Reference: [CommonConsequencesType](https://cwe.mitre.org/documents/schema/#CommonConsequencesType)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[scopes](#scopes-consequencescopestring)|[ConsequenceScopeString]|identifies the security property that is violated|**Required**|
|[impacts](#impacts-technicalimpactstring)|[TechnicalImpactString]|describes the technical impact that arises if an adversary succeeds in exploiting this weakness|_Optional_|
|[likelihood](#likelihood-highmedlowstring)|HighMedLowString|how likely the specific consequence is expected to be seen relative to the other consequences|_Optional_|
|[note](#note-markdownstring)|MarkdownString|additional commentary about a consequence|_Optional_|


<a id="impacts-technicalimpactstring"></a>
### `impacts` ∷ [TechnicalImpactString]

describes the technical impact that arises if an adversary succeeds in exploiting this weakness

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


  * Allowed values:
    * `"Alter Execution Logic"`
    * `"Bypass Protection Mechanism"`
    * `"DoS: Amplification"`
    * `"DoS: Crash, Exit, or Restart"`
    * `"DoS: Instability"`
    * `"DoS: Resource Consumption (CPU)"`
    * `"DoS: Resource Consumption (Memory)"`
    * `"DoS: Resource Consumption (Other)"`
    * `"Execute Unauthorized Code or Commands"`
    * `"Gain Privileges or Assume Identity"`
    * `"Hide Activities"`
    * `"Modify Application Data"`
    * `"Modify Files or Directories"`
    * `"Modify Memory"`
    * `"Quality Degradation"`
    * `"Read Application Data"`
    * `"Read Files or Directories"`
    * `"Read Memory"`
    * `"Unexpected State"`
    * `"Varies by Context"`
  * Reference: [TechnicalImpactEnumeration](https://cwe.mitre.org/documents/schema/#TechnicalImpactEnumeration)


<a id="likelihood-highmedlowstring"></a>
### `likelihood` ∷ HighMedLowString

how likely the specific consequence is expected to be seen relative to the other consequences

* This entry is _optional_


  * Allowed values:
    * `"High"`
    * `"Info"`
    * `"Low"`
    * `"Medium"`
    * `"None"`
    * `"Unknown"`
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="note-markdownstring"></a>
### `note` ∷ MarkdownString

additional commentary about a consequence

* This entry is _optional_


  * *Markdown* Markdown string with at most 5000 characters

<a id="scopes-consequencescopestring"></a>
### `scopes` ∷ [ConsequenceScopeString]

identifies the security property that is violated

* This entry is **required**
* This entry's type is sequential (allows zero or more values)


  * *ConsequenceScope* defines the different areas of software security that can be affected by exploiting a weakness.
  * Allowed values:
    * `"Access Control"`
    * `"Accountability"`
    * `"Authentication"`
    * `"Authorization"`
    * `"Availability"`
    * `"Confidentiality"`
    * `"Integrity"`
    * `"Non-Repudiation"`
  * Reference: [ScopeEnumeration](https://cwe.mitre.org/documents/schema/#ScopeEnumeration)

