<a id="map11"></a>
# *Mitigation*

> Reference: [PotentialMitigationsType](https://cwe.mitre.org/documents/schema/#PotentialMitigationsType)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#description-markdownstring)|MarkdownString|a description of this individual mitigation including any strengths and shortcomings of this mitigation for the weakness|**Required**|
|[effectiveness](#effectiveness-effectivenessstring)|EffectivenessString|summarizes how effective the mitigation may be in preventing the weakness|_Optional_|
|[effectiveness_notes](#effectiveness_notes-markdownstring)|MarkdownString| |_Optional_|
|[phases](#phases-softwarephasestring)|[SoftwarePhaseString]|indicates the development life cycle phase during which this particular mitigation may be applied|_Optional_|
|[strategy](#strategy-mitigationstrategystring)|MitigationStrategyString|a general strategy for protecting a system to which this mitigation contributes|_Optional_|


<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

a description of this individual mitigation including any strengths and shortcomings of this mitigation for the weakness

* This entry is **required**


  * *Markdown* Markdown string with at most 5000 characters

<a id="effectiveness-effectivenessstring"></a>
### `effectiveness` ∷ EffectivenessString

summarizes how effective the mitigation may be in preventing the weakness

* This entry is _optional_


  * *Effectiveness* related to how effective a mitigation may be in preventing the weakness
  * Allowed values:
    * `"Defense in Depth"`
    * `"High"`
    * `"Incidental"`
    * `"Limited"`
    * `"Moderate"`
    * `"None"`
  * Reference: [EffectivenessEnumeration](https://cwe.mitre.org/documents/schema/#EffectivenessEnumeration)


<a id="effectiveness_notes-markdownstring"></a>
### `effectiveness_notes` ∷ MarkdownString

* This entry is _optional_


  * *Markdown* Markdown string with at most 5000 characters

<a id="phases-softwarephasestring"></a>
### `phases` ∷ [SoftwarePhaseString]

indicates the development life cycle phase during which this particular mitigation may be applied

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


  * *SoftwarePhase* defines the different regularities that guide the applicability of platforms
  * Allowed values:
    * `"Architecture and Design"`
    * `"Build and Compilation"`
    * `"Bundling"`
    * `"Distribution"`
    * `"Documentation"`
    * `"Implementation"`
    * `"Installation"`
    * `"Operation"`
    * `"Patching and Maintenance"`
    * `"Policy"`
    * `"Porting"`
    * `"Requirements"`
    * `"System Configuration"`
    * `"Testing"`
  * Reference: [PhaseEnumeration](https://cwe.mitre.org/documents/schema/#PhaseEnumeration)


<a id="strategy-mitigationstrategystring"></a>
### `strategy` ∷ MitigationStrategyString

a general strategy for protecting a system to which this mitigation contributes

* This entry is _optional_


  * *MitigationStrategy* strategy for protecting a system to which a mitigation contributes
  * Allowed values:
    * `"Attack Surface Reduction"`
    * `"Compilation or Build Hardening"`
    * `"Enforcement by Conversion"`
    * `"Environment Hardening"`
    * `"Firewall"`
    * `"Input Validation"`
    * `"Language Selection"`
    * `"Libraries or Frameworks"`
    * `"Output Encoding"`
    * `"Parameterization"`
    * `"Refactoring"`
    * `"Resource Limitation"`
    * `"Sandbox or Jail"`
    * `"Separation of Privilege"`
  * Reference: [MitigationStrategyEnumeration](https://cwe.mitre.org/documents/schema/#MitigationStrategyEnumeration)

