<a id="map8"></a>
# *ModeOfIntroduction*

> Reference: [ModesOfIntroductionType](https://cwe.mitre.org/documents/schema/#ModesOfIntroductionType)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[phase](#phase-softwarephasestring)|SoftwarePhaseString|identifies the point in the software life cycle at which the weakness may be introduced|**Required**|
|[note](#note-markdownstring)|MarkdownString|provides a typical scenario related to introduction during the given phase|_Optional_|


<a id="note-markdownstring"></a>
### `note` ∷ MarkdownString

provides a typical scenario related to introduction during the given phase

* This entry is _optional_


  * *Markdown* Markdown string with at most 5000 characters

<a id="phase-softwarephasestring"></a>
### `phase` ∷ SoftwarePhaseString

identifies the point in the software life cycle at which the weakness may be introduced

* This entry is **required**


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

