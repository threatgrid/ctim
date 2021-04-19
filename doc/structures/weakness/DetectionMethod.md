<a id="map10"></a>
# *DetectionMethod*

> Reference: [DetectionMethodsType](https://cwe.mitre.org/documents/schema/#DetectionMethodsType)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#description-markdownstring)|MarkdownString|provide some context of how this method can be applied to a specific weakness|**Required**|
|[method](#method-detectionmethodstring)|DetectionMethodString|identifies the particular detection method being described|**Required**|
|[effectiveness](#effectiveness-detectioneffectivenessstring)|DetectionEffectivenessString|how effective the detection method may be in detecting the associated weakness|_Optional_|
|[effectiveness_notes](#effectiveness_notes-markdownstring)|MarkdownString|provides additional discussion of the strengths and shortcomings of this detection method|_Optional_|


<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

provide some context of how this method can be applied to a specific weakness

* This entry is **required**


  * *Markdown* Markdown string with at most 5000 characters

<a id="effectiveness-detectioneffectivenessstring"></a>
### `effectiveness` ∷ DetectionEffectivenessString

how effective the detection method may be in detecting the associated weakness

* This entry is _optional_


  * *DetectionEffectiveness* level of effectiveness that a detection method may have in detecting an associated weakness
  * Allowed values:
    * `"High"`
    * `"Limited"`
    * `"Moderate"`
    * `"None"`
    * `"Opportunistic"`
    * `"SOAR Partial"`
  * Reference: [DetectionEffectivenessEnumeration](https://cwe.mitre.org/documents/schema/#DetectionEffectivenessEnumeration)


<a id="effectiveness_notes-markdownstring"></a>
### `effectiveness_notes` ∷ MarkdownString

provides additional discussion of the strengths and shortcomings of this detection method

* This entry is _optional_


  * *Markdown* Markdown string with at most 5000 characters

<a id="method-detectionmethodstring"></a>
### `method` ∷ DetectionMethodString

identifies the particular detection method being described

* This entry is **required**


  * *DetectionMethod* method used to detect a weakness
  * Allowed values:
    * `"Architecture or Design Review"`
    * `"Automated Analysis"`
    * `"Automated Dynamic Analysis"`
    * `"Automated Static Analysis"`
    * `"Automated Static Analysis - Binary or Bytecode"`
    * `"Automated Static Analysis - Source Code"`
    * `"Black Box"`
    * `"Dynamic Analysis with Automated Results Interpretation"`
    * `"Dynamic Analysis with Manual Results Interpretation"`
    * `"Fuzzing"`
    * `"Manual Analysis"`
    * `"Manual Dynamic Analysis"`
    * `"Manual Static Analysis"`
    * `"Manual Static Analysis - Binary or Bytecode"`
    * `"Manual Static Analysis - Source Code"`
    * `"Other"`
    * `"White Box"`
  * Reference: [DetectionMethodEnumeration](https://cwe.mitre.org/documents/schema/#DetectionMethodEnumeration)

