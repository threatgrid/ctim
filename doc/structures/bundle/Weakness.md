<a id="map21"></a>
# *Weakness*

> Reference: [WeaknessType](https://cwe.mitre.org/documents/schema/#WeaknessType)

*Weakness* a mistake or condition that, if left unaddressed, could under the proper conditions contribute to a cyber-enabled capability being vulnerable to attack, allowing an adversary to make items function in unintended ways.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#description-markdownstring)|MarkdownString|should be short and limited to the key points that define this weakness|**Required**|
|[id](#id-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#schema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#type-weaknesstypeidentifierstring)|WeaknessTypeIdentifierString|The fixed value weakness|**Required**|
|[abstraction_level](#abstraction_level-weaknessabstractionlevelstring)|WeaknessAbstractionLevelString|defines the abstraction level for this weakness|_Optional_|
|[affected_resources](#affected_resources-systemresourcestring)|[SystemResourceString]|identify system resources that can be affected by an exploit of this weakness|_Optional_|
|[alternate_terms](#alternate_terms-alternatetermalternatetermmdmap107)|[[*AlternateTerm*](./AlternateTerm.md#map107)]|indicates one or more other names used to describe this weakness|_Optional_|
|[architectures](#architectures-architecturearchitecturemdmap104)|[[*Architecture*](./Architecture.md#map104)]|Applicable architectures|_Optional_|
|[background_details](#background_details-markdownstring)|MarkdownString|information that is relevant but not related to the nature of the weakness itself|_Optional_|
|[common_consequences](#common_consequences-consequenceconsequencemdmap109)|[[*Consequence*](./Consequence.md#map109)]|specify individual consequences associated with a weakness|_Optional_|
|[detection_methods](#detection_methods-detectionmethoddetectionmethodmdmap110)|[[*DetectionMethod*](./DetectionMethod.md#map110)]|identify methods that may be employed to detect this weakness, including their strengths and limitations|_Optional_|
|[external_ids](#external_ids-string)|[String]| |_Optional_|
|[external_references](#external_references-externalreferenceexternalreferencemdmap101)|[[*ExternalReference*](./ExternalReference.md#map101)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[functional_areas](#functional_areas-functionalareastring)|[FunctionalAreaString]|identifies the functional area of the software in which the weakness is most likely to occur|_Optional_|
|[language](#language-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[languages](#languages-languagelanguagemdmap102)|[[*Language*](./Language.md#map102)]|Applicable Languages|_Optional_|
|[likelihood](#likelihood-highmedlowstring)|HighMedLowString|Likelihood of exploit|_Optional_|
|[modes_of_introduction](#modes_of_introduction-modeofintroductionmodeofintroductionmdmap108)|[[*ModeOfIntroduction*](./ModeOfIntroduction.md#map108)]|information about how and when a given weakness may be introduced|_Optional_|
|[notes](#notes-notenotemdmap112)|[[*Note*](./Note.md#map112)]|provide any additional comments about the weakness|_Optional_|
|[operating_systems](#operating_systems-operatingsystemoperatingsystemmdmap103)|[[*OperatingSystem*](./OperatingSystem.md#map103)]|Applicable operating systems|_Optional_|
|[paradigms](#paradigms-paradigmparadigmmdmap105)|[[*Paradigm*](./Paradigm.md#map105)]|Applicable paradigms|_Optional_|
|[potential_mitigations](#potential_mitigations-mitigationmitigationmdmap111)|[[*Mitigation*](./Mitigation.md#map111)]|describe potential mitigations associated with a weakness|_Optional_|
|[revision](#revision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#short_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#source-medstring)|MedString| |_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|
|[structure](#structure-weaknessstructurestring)|WeaknessStructureString|defines the structural nature of the weakness|_Optional_|
|[technologies](#technologies-technologytechnologymdmap106)|[[*Technology*](./Technology.md#map106)]|Applicable technologies|_Optional_|
|[timestamp](#timestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#title-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#tlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<a id="abstraction_level-weaknessabstractionlevelstring"></a>
### `abstraction_level` ∷ WeaknessAbstractionLevelString

defines the abstraction level for this weakness

* This entry is _optional_


  * *WeaknessAbstractionLevel* defines the different abstraction levels that apply to a weakness. A `Class` is the most abstract type of weakness, typically described independent of any specific language or technology. A `Base` is a more specific type of weakness that is still mostly independent of a resource or technology, but with sufficient details to provide specific methods for detection and prevention. A `Variant` is a weakness that is described at a very low level of detail, typically limited to a specific language or technology. A `Compound` weakness is a meaningful aggregation of several weaknesses, currently known as either a Chain or Composite.
  * Allowed values:
    * `"Base"`
    * `"Class"`
    * `"Compound"`
    * `"Variant"`
  * Reference: [AbstractionEnumeration
](https://cwe.mitre.org/documents/schema/#AbstractionEnumeration)


<a id="affected_resources-systemresourcestring"></a>
### `affected_resources` ∷ [SystemResourceString]

identify system resources that can be affected by an exploit of this weakness

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


  * *SystemResource* defines a resource of a system
  * Allowed values:
    * `"CPU"`
    * `"File or Directory"`
    * `"Memory"`
    * `"System Process"`
  * Reference: [ResourceEnumeration](https://cwe.mitre.org/documents/schema/#ResourceEnumeration)


<a id="alternate_terms-alternatetermalternatetermmdmap107"></a>
### `alternate_terms` ∷ [[*AlternateTerm*](./AlternateTerm.md#map107)]

indicates one or more other names used to describe this weakness

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="architectures-architecturearchitecturemdmap104"></a>
### `architectures` ∷ [[*Architecture*](./Architecture.md#map104)]

Applicable architectures

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="background_details-markdownstring"></a>
### `background_details` ∷ MarkdownString

information that is relevant but not related to the nature of the weakness itself

* This entry is _optional_


  * *Markdown* Markdown string with at most 5000 characters

<a id="common_consequences-consequenceconsequencemdmap109"></a>
### `common_consequences` ∷ [[*Consequence*](./Consequence.md#map109)]

specify individual consequences associated with a weakness

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="description-markdownstring"></a>
### `description` ∷ MarkdownString

should be short and limited to the key points that define this weakness

* This entry is **required**


  * *Markdown* Markdown string with at most 5000 characters

<a id="detection_methods-detectionmethoddetectionmethodmdmap110"></a>
### `detection_methods` ∷ [[*DetectionMethod*](./DetectionMethod.md#map110)]

identify methods that may be employed to detect this weakness, including their strengths and limitations

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="external_ids-string"></a>
### `external_ids` ∷ [String]

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)



<a id="external_references-externalreferenceexternalreferencemdmap101"></a>
### `external_references` ∷ [[*ExternalReference*](./ExternalReference.md#map101)]

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="functional_areas-functionalareastring"></a>
### `functional_areas` ∷ [FunctionalAreaString]

identifies the functional area of the software in which the weakness is most likely to occur

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


  * *FunctionalArea* Defines the different functional areas of software in which the weakness may appear
  * Allowed values:
    * `"Authentication"`
    * `"Authorization"`
    * `"Code Libraries"`
    * `"Counters"`
    * `"Cryptography"`
    * `"Error Handling"`
    * `"File Processing"`
    * `"Functional-Area-Independent"`
    * `"Interprocess Communication"`
    * `"Logging"`
    * `"Memory Management"`
    * `"Networking"`
    * `"Number Processing"`
    * `"Program Invocation"`
    * `"Protection Mechanism"`
    * `"Session Management"`
    * `"Signals"`
    * `"String Processing"`
  * Reference: [FunctionalAreaEnumeration](https://cwe.mitre.org/documents/schema/#FunctionalAreaEnumeration)


<a id="id-string"></a>
### `id` ∷ String

Globally unique URI identifying this object.

* This entry is **required**


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](https://github.com/threatgrid/ctim/blob/subdoc/doc/structures/judgement/Judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="language-shortstring"></a>
### `language` ∷ ShortString

The human language this object is specified in.

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="languages-languagelanguagemdmap102"></a>
### `languages` ∷ [[*Language*](./Language.md#map102)]

Applicable Languages

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="likelihood-highmedlowstring"></a>
### `likelihood` ∷ HighMedLowString

Likelihood of exploit

* This entry is _optional_


  * Allowed values:
    * `"High"`
    * `"Info"`
    * `"Low"`
    * `"Medium"`
    * `"None"`
    * `"Unknown"`
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="modes_of_introduction-modeofintroductionmodeofintroductionmdmap108"></a>
### `modes_of_introduction` ∷ [[*ModeOfIntroduction*](./ModeOfIntroduction.md#map108)]

information about how and when a given weakness may be introduced

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="notes-notenotemdmap112"></a>
### `notes` ∷ [[*Note*](./Note.md#map112)]

provide any additional comments about the weakness

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="operating_systems-operatingsystemoperatingsystemmdmap103"></a>
### `operating_systems` ∷ [[*OperatingSystem*](./OperatingSystem.md#map103)]

Applicable operating systems

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="paradigms-paradigmparadigmmdmap105"></a>
### `paradigms` ∷ [[*Paradigm*](./Paradigm.md#map105)]

Applicable paradigms

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="potential_mitigations-mitigationmitigationmdmap111"></a>
### `potential_mitigations` ∷ [[*Mitigation*](./Mitigation.md#map111)]

describe potential mitigations associated with a weakness

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="revision-integer"></a>
### `revision` ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is _optional_


  * Zero, or a positive integer

<a id="schema_version-string"></a>
### `schema_version` ∷ String

CTIM schema version for this entity

* This entry is **required**


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="short_description-medstring"></a>
### `short_description` ∷ MedString

A single line, short summary of the object.

* This entry is _optional_


  * *MedString* String with at most 2048 characters

<a id="source-medstring"></a>
### `source` ∷ MedString

* This entry is _optional_


  * *MedString* String with at most 2048 characters

<a id="source_uri-string"></a>
### `source_uri` ∷ String

* This entry is _optional_


  * A URI

<a id="structure-weaknessstructurestring"></a>
### `structure` ∷ WeaknessStructureString

defines the structural nature of the weakness

* This entry is _optional_


  * *WeaknessStructure* structural natures of a weakness. A Simple structure represents a single weakness whose exploitation is not dependent on the presence of another weakness. A Composite is a set of weaknesses that must all be present simultaneously in order to produce an exploitable vulnerability, while a Chain is a set of weaknesses that must be reachable consecutively in order to produce an exploitable vulnerability.
  * Allowed values:
    * `"Chain"`
    * `"Composite"`
    * `"Simple"`
  * Reference: [StructureEnumeration](https://cwe.mitre.org/documents/schema/#StructureEnumeration))


<a id="technologies-technologytechnologymdmap106"></a>
### `technologies` ∷ [[*Technology*](./Technology.md#map106)]

Applicable technologies

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="timestamp-datetime"></a>
### `timestamp` ∷ DateTime

The time this object was created at, or last modified.

* This entry is _optional_


  * *ISO8601 Timestamp* Schema definition for all date or timestamp values.  Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="title-shortstring"></a>
### `title` ∷ ShortString

A short title for this object, used as primary display and reference value

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="tlp-tlpstring"></a>
### `tlp` ∷ TLPString

Specification for how, and to whom, this object can be shared.

* This entry is _optional_


  * *TLP* TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: `"green"`
  * Allowed values:
    * `"amber"`
    * `"green"`
    * `"red"`
    * `"white"`

<a id="type-weaknesstypeidentifierstring"></a>
### `type` ∷ WeaknessTypeIdentifierString

The fixed value weakness

* This entry is **required**


  * *WeaknessTypeIdentifier* The fixed value "weakness"
  * Must equal: `"weakness"`
