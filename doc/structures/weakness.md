<a id="top"></a>
# *Weakness*

> Reference: [WeaknessType](https://cwe.mitre.org/documents/schema/#WeaknessType)

*Weakness* a mistake or condition that, if left unaddressed, could under the proper conditions contribute to a cyber-enabled capability being vulnerable to attack, allowing an adversary to make items function in unintended ways.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|should be short and limited to the key points that define this weakness|**Required**|
|[id](#propertyid-string)|String|Globally unique URI identifying this object.|**Required**|
|[schema_version](#propertyschema_version-string)|String|CTIM schema version for this entity|**Required**|
|[type](#propertytype-weaknesstypeidentifierstring)|WeaknessTypeIdentifierString|The fixed value weakness|**Required**|
|[abstraction_level](#propertyabstraction_level-weaknessabstractionlevelstring)|WeaknessAbstractionLevelString|defines the abstraction level for this weakness|_Optional_|
|[affected_resources](#propertyaffected_resources-systemresourcestring)|[SystemResourceString]|identify system resources that can be affected by an exploit of this weakness|_Optional_|
|[alternate_terms](#propertyalternate_terms-alternatetermmap7)|[[*AlternateTerm*](#map7)]|indicates one or more other names used to describe this weakness|_Optional_|
|[architectures](#propertyarchitectures-architecturemap4)|[[*Architecture*](#map4)]|Applicable architectures|_Optional_|
|[background_details](#propertybackground_details-markdownstring)|MarkdownString|information that is relevant but not related to the nature of the weakness itself|_Optional_|
|[common_consequences](#propertycommon_consequences-consequencemap9)|[[*Consequence*](#map9)]|specify individual consequences associated with a weakness|_Optional_|
|[detection_methods](#propertydetection_methods-detectionmethodmap10)|[[*DetectionMethod*](#map10)]|identify methods that may be employed to detect this weakness, including their strengths and limitations|_Optional_|
|[external_ids](#propertyexternal_ids-string)|[String]| |_Optional_|
|[external_references](#propertyexternal_references-externalreferencemap1)|[[*ExternalReference*](#map1)]|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.|_Optional_|
|[functional_areas](#propertyfunctional_areas-functionalareastring)|[FunctionalAreaString]|identifies the functional area of the software in which the weakness is most likely to occur|_Optional_|
|[language](#propertylanguage-shortstring)|ShortString|The human language this object is specified in.|_Optional_|
|[languages](#propertylanguages-languagemap2)|[[*Language*](#map2)]|Applicable Languages|_Optional_|
|[likelihood](#propertylikelihood-highmedlowstring)|HighMedLowString|Likelihood of exploit|_Optional_|
|[modes_of_introduction](#propertymodes_of_introduction-modeofintroductionmap8)|[[*ModeOfIntroduction*](#map8)]|information about how and when a given weakness may be introduced|_Optional_|
|[notes](#propertynotes-notemap12)|[[*Note*](#map12)]|provide any additional comments about the weakness|_Optional_|
|[operating_systems](#propertyoperating_systems-operatingsystemmap3)|[[*OperatingSystem*](#map3)]|Applicable operating systems|_Optional_|
|[paradigms](#propertyparadigms-paradigmmap5)|[[*Paradigm*](#map5)]|Applicable paradigms|_Optional_|
|[potential_mitigations](#propertypotential_mitigations-mitigationmap11)|[[*Mitigation*](#map11)]|describe potential mitigations associated with a weakness|_Optional_|
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.|_Optional_|
|[short_description](#propertyshort_description-medstring)|MedString|A single line, short summary of the object.|_Optional_|
|[source](#propertysource-medstring)|MedString| |_Optional_|
|[source_uri](#propertysource_uri-string)|String| |_Optional_|
|[structure](#propertystructure-weaknessstructurestring)|WeaknessStructureString|defines the structural nature of the weakness|_Optional_|
|[technologies](#propertytechnologies-technologymap6)|[[*Technology*](#map6)]|Applicable technologies|_Optional_|
|[timestamp](#propertytimestamp-datetime)|DateTime|The time this object was created at, or last modified.|_Optional_|
|[title](#propertytitle-shortstring)|ShortString|A short title for this object, used as primary display and reference value|_Optional_|
|[tlp](#propertytlp-tlpstring)|TLPString|Specification for how, and to whom, this object can be shared.|_Optional_|


<details>

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

should be short and limited to the key points that define this weakness

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyid-string"></a>
## Property id ∷ String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertyschema_version-string"></a>
## Property schema_version ∷ String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertytype-weaknesstypeidentifierstring"></a>
## Property type ∷ WeaknessTypeIdentifierString

The fixed value weakness

* This entry is required


  * *WeaknessTypeIdentifier* The fixed value "weakness"
  * Must equal: "weakness"

<a id="propertyabstraction_level-weaknessabstractionlevelstring"></a>
## Property abstraction_level ∷ WeaknessAbstractionLevelString

defines the abstraction level for this weakness

* This entry is optional


  * *WeaknessAbstractionLevel* defines the different abstraction levels that apply to a weakness. A `Class` is the most abstract type of weakness, typically described independent of any specific language or technology. A `Base` is a more specific type of weakness that is still mostly independent of a resource or technology, but with sufficient details to provide specific methods for detection and prevention. A `Variant` is a weakness that is described at a very low level of detail, typically limited to a specific language or technology. A `Compound` weakness is a meaningful aggregation of several weaknesses, currently known as either a Chain or Composite.
  * Allowed Values:
    * Base
    * Class
    * Compound
    * Variant
  * Reference: [AbstractionEnumeration
](https://cwe.mitre.org/documents/schema/#AbstractionEnumeration)


<a id="propertyaffected_resources-systemresourcestring"></a>
## Property affected_resources ∷ [SystemResourceString]

identify system resources that can be affected by an exploit of this weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *SystemResource* defines a resource of a system
  * Allowed Values:
    * CPU
    * File or Directory
    * Memory
    * System Process
  * Reference: [ResourceEnumeration](https://cwe.mitre.org/documents/schema/#ResourceEnumeration)


<a id="propertyalternate_terms-alternatetermmap7"></a>
## Property alternate_terms ∷ [[*AlternateTerm*](#map7)]

indicates one or more other names used to describe this weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map7-ref"></a>
* *AlternateTerm* Value
  * Details: [*AlternateTerm*](#map7)

<a id="propertyarchitectures-architecturemap4"></a>
## Property architectures ∷ [[*Architecture*](#map4)]

Applicable architectures

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map4-ref"></a>
* *Architecture* Value
  * Details: [*Architecture*](#map4)

<a id="propertybackground_details-markdownstring"></a>
## Property background_details ∷ MarkdownString

information that is relevant but not related to the nature of the weakness itself

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertycommon_consequences-consequencemap9"></a>
## Property common_consequences ∷ [[*Consequence*](#map9)]

specify individual consequences associated with a weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map9-ref"></a>
* *Consequence* Value
  * Details: [*Consequence*](#map9)

<a id="propertydetection_methods-detectionmethodmap10"></a>
## Property detection_methods ∷ [[*DetectionMethod*](#map10)]

identify methods that may be employed to detect this weakness, including their strengths and limitations

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map10-ref"></a>
* *DetectionMethod* Value
  * Details: [*DetectionMethod*](#map10)

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

<a id="propertyfunctional_areas-functionalareastring"></a>
## Property functional_areas ∷ [FunctionalAreaString]

identifies the functional area of the software in which the weakness is most likely to occur

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *FunctionalArea* Defines the different functional areas of software in which the weakness may appear
  * Allowed Values:
    * Authentication
    * Authorization
    * Code Libraries
    * Counters
    * Cryptography
    * Error Handling
    * File Processing
    * Functional-Area-Independent
    * Interprocess Communication
    * Logging
    * Memory Management
    * Networking
    * Number Processing
    * Program Invocation
    * Protection Mechanism
    * Session Management
    * Signals
    * String Processing
  * Reference: [FunctionalAreaEnumeration](https://cwe.mitre.org/documents/schema/#FunctionalAreaEnumeration)


<a id="propertylanguage-shortstring"></a>
## Property language ∷ ShortString

The human language this object is specified in.

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertylanguages-languagemap2"></a>
## Property languages ∷ [[*Language*](#map2)]

Applicable Languages

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map2-ref"></a>
* *Language* Value
  * Details: [*Language*](#map2)

<a id="propertylikelihood-highmedlowstring"></a>
## Property likelihood ∷ HighMedLowString

Likelihood of exploit

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertymodes_of_introduction-modeofintroductionmap8"></a>
## Property modes_of_introduction ∷ [[*ModeOfIntroduction*](#map8)]

information about how and when a given weakness may be introduced

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map8-ref"></a>
* *ModeOfIntroduction* Value
  * Details: [*ModeOfIntroduction*](#map8)

<a id="propertynotes-notemap12"></a>
## Property notes ∷ [[*Note*](#map12)]

provide any additional comments about the weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map12-ref"></a>
* *Note* Value
  * Details: [*Note*](#map12)

<a id="propertyoperating_systems-operatingsystemmap3"></a>
## Property operating_systems ∷ [[*OperatingSystem*](#map3)]

Applicable operating systems

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map3-ref"></a>
* *OperatingSystem* Value
  * Details: [*OperatingSystem*](#map3)

<a id="propertyparadigms-paradigmmap5"></a>
## Property paradigms ∷ [[*Paradigm*](#map5)]

Applicable paradigms

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map5-ref"></a>
* *Paradigm* Value
  * Details: [*Paradigm*](#map5)

<a id="propertypotential_mitigations-mitigationmap11"></a>
## Property potential_mitigations ∷ [[*Mitigation*](#map11)]

describe potential mitigations associated with a weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map11-ref"></a>
* *Mitigation* Value
  * Details: [*Mitigation*](#map11)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

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

<a id="propertystructure-weaknessstructurestring"></a>
## Property structure ∷ WeaknessStructureString

defines the structural nature of the weakness

* This entry is optional


  * *WeaknessStructure* structural natures of a weakness. A Simple structure represents a single weakness whose exploitation is not dependent on the presence of another weakness. A Composite is a set of weaknesses that must all be present simultaneously in order to produce an exploitable vulnerability, while a Chain is a set of weaknesses that must be reachable consecutively in order to produce an exploitable vulnerability.
  * Allowed Values:
    * Chain
    * Composite
    * Simple
  * Reference: [StructureEnumeration](https://cwe.mitre.org/documents/schema/#StructureEnumeration))


<a id="propertytechnologies-technologymap6"></a>
## Property technologies ∷ [[*Technology*](#map6)]

Applicable technologies

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map6-ref"></a>
* *Technology* Value
  * Details: [*Technology*](#map6)

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
# *Language*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[class](#propertyclass-languageclassstring)|LanguageClassString|class of language|_Optional_|
|[name](#propertyname-shortstring)|ShortString|Language name (Clojure, Java, ...)|_Optional_|


<details>

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ PrevalenceString

defines the different regularities that guide the applicability of platforms

* This entry is required


  * *Prevalence* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)


<a id="propertyclass-languageclassstring"></a>
## Property class ∷ LanguageClassString

class of language

* This entry is optional


  * *LanguageClass* class of source code language
  * Allowed Values:
    * Assembly
    * Compiled
    * Interpreted
  * Reference: [LanguageClassEnumeration](https://cwe.mitre.org/documents/schema/#LanguageClassEnumeration)


<a id="propertyname-shortstring"></a>
## Property name ∷ ShortString

Language name (Clojure, Java, ...)

* This entry is optional


  * *ShortString* String with at most 1024 characters


</details>

<a id="map3"></a>
# *OperatingSystem*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[class](#propertyclass-operatingsystemclassstring)|OperatingSystemClassString| |_Optional_|
|[cpe_id](#propertycpe_id-shortstring)|ShortString| |_Optional_|
|[name](#propertyname-shortstring)|ShortString| |_Optional_|
|[version](#propertyversion-shortstring)|ShortString| |_Optional_|


<details>

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ PrevalenceString

defines the different regularities that guide the applicability of platforms

* This entry is required


  * *Prevalence* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)


<a id="propertyclass-operatingsystemclassstring"></a>
## Property class ∷ OperatingSystemClassString

* This entry is optional


  * *OperatingSystemClass* class of operating systems
  * Allowed Values:
    * Android
    * Apple iOS
    * Cisco IOS
    * Linux
    * Unix
    * Windows
    * macOs
  * Reference: [OperatingSystemClassEnumeration](https://cwe.mitre.org/documents/schema/#OperatingSystemClassEnumeration)


<a id="propertycpe_id-shortstring"></a>
## Property cpe_id ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyname-shortstring"></a>
## Property name ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters

<a id="propertyversion-shortstring"></a>
## Property version ∷ ShortString

* This entry is optional


  * *ShortString* String with at most 1024 characters


</details>

<a id="map4"></a>
# *Architecture*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[class](#propertyclass-architectureclassstring)|ArchitectureClassString|class of architecture|_Optional_|
|[name](#propertyname-shortstring)|ShortString|architecture name (ARM, x86, ...)|_Optional_|


<details>

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ PrevalenceString

defines the different regularities that guide the applicability of platforms

* This entry is required


  * *Prevalence* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)


<a id="propertyclass-architectureclassstring"></a>
## Property class ∷ ArchitectureClassString

class of architecture

* This entry is optional


  * Allowed Values:
    * Embedded
    * Microcomputer
    * Workstation
  * Reference: [ArchitectureClassEnumeration](https://cwe.mitre.org/documents/schema/#ArchitectureClassEnumeration)


<a id="propertyname-shortstring"></a>
## Property name ∷ ShortString

architecture name (ARM, x86, ...)

* This entry is optional


  * *ShortString* String with at most 1024 characters


</details>

<a id="map5"></a>
# *Paradigm*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[name](#propertyname-shortstring)|ShortString|paradigm name (Client Server, Mainframe)|_Optional_|


<details>

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ PrevalenceString

defines the different regularities that guide the applicability of platforms

* This entry is required


  * *Prevalence* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)


<a id="propertyname-shortstring"></a>
## Property name ∷ ShortString

paradigm name (Client Server, Mainframe)

* This entry is optional


  * *ShortString* String with at most 1024 characters


</details>

<a id="map6"></a>
# *Technology*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[name](#propertyname-shortstring)|ShortString|technology name (Web Server, Web Client)|_Optional_|


<details>

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ PrevalenceString

defines the different regularities that guide the applicability of platforms

* This entry is required


  * *Prevalence* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)


<a id="propertyname-shortstring"></a>
## Property name ∷ ShortString

technology name (Web Server, Web Client)

* This entry is optional


  * *ShortString* String with at most 1024 characters


</details>

<a id="map7"></a>
# *AlternateTerm*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[term](#propertyterm-shortstring)|ShortString|the actual alternate term|**Required**|
|[description](#propertydescription-markdownstring)|MarkdownString|provides context for the alternate term by which this weakness may be known.|_Optional_|


<details>

<a id="propertyterm-shortstring"></a>
## Property term ∷ ShortString

the actual alternate term

* This entry is required


  * *ShortString* String with at most 1024 characters

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

provides context for the alternate term by which this weakness may be known.

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters


</details>

<a id="map8"></a>
# *ModeOfIntroduction*

> Reference: [ModesOfIntroductionType](https://cwe.mitre.org/documents/schema/#ModesOfIntroductionType)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[phase](#propertyphase-softwarephasestring)|SoftwarePhaseString|identifies the point in the software life cycle at which the weakness may be introduced|**Required**|
|[note](#propertynote-markdownstring)|MarkdownString|provides a typical scenario related to introduction during the given phase|_Optional_|


<details>

<a id="propertyphase-softwarephasestring"></a>
## Property phase ∷ SoftwarePhaseString

identifies the point in the software life cycle at which the weakness may be introduced

* This entry is required


  * *SoftwarePhase* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Architecture and Design
    * Build and Compilation
    * Bundling
    * Distribution
    * Documentation
    * Implementation
    * Installation
    * Operation
    * Patching and Maintenance
    * Policy
    * Porting
    * Requirements
    * System Configuration
    * Testing
  * Reference: [PhaseEnumeration](https://cwe.mitre.org/documents/schema/#PhaseEnumeration)


<a id="propertynote-markdownstring"></a>
## Property note ∷ MarkdownString

provides a typical scenario related to introduction during the given phase

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters


</details>

<a id="map9"></a>
# *Consequence*

> Reference: [CommonConsequencesType](https://cwe.mitre.org/documents/schema/#CommonConsequencesType)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[scopes](#propertyscopes-consequencescopestring)|[ConsequenceScopeString]|identifies the security property that is violated|**Required**|
|[impacts](#propertyimpacts-technicalimpactstring)|[TechnicalImpactString]|describes the technical impact that arises if an adversary succeeds in exploiting this weakness|_Optional_|
|[likelihood](#propertylikelihood-highmedlowstring)|HighMedLowString|how likely the specific consequence is expected to be seen relative to the other consequences|_Optional_|
|[note](#propertynote-markdownstring)|MarkdownString|additional commentary about a consequence|_Optional_|


<details>

<a id="propertyscopes-consequencescopestring"></a>
## Property scopes ∷ [ConsequenceScopeString]

identifies the security property that is violated

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * *ConsequenceScope* defines the different areas of software security that can be affected by exploiting a weakness.
  * Allowed Values:
    * Access Control
    * Accountability
    * Authentication
    * Authorization
    * Availability
    * Confidentiality
    * Integrity
    * Non-Repudiation
  * Reference: [ScopeEnumeration](https://cwe.mitre.org/documents/schema/#ScopeEnumeration)


<a id="propertyimpacts-technicalimpactstring"></a>
## Property impacts ∷ [TechnicalImpactString]

describes the technical impact that arises if an adversary succeeds in exploiting this weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * Allowed Values:
    * Alter Execution Logic
    * Bypass Protection Mechanism
    * DoS: Amplification
    * DoS: Crash, Exit, or Restart
    * DoS: Instability
    * DoS: Resource Consumption (CPU)
    * DoS: Resource Consumption (Memory)
    * DoS: Resource Consumption (Other)
    * Execute Unauthorized Code or Commands
    * Gain Privileges or Assume Identity
    * Hide Activities
    * Modify Application Data
    * Modify Files or Directories
    * Modify Memory
    * Quality Degradation
    * Read Application Data
    * Read Files or Directories
    * Read Memory
    * Unexpected State
    * Varies by Context
  * Reference: [TechnicalImpactEnumeration](https://cwe.mitre.org/documents/schema/#TechnicalImpactEnumeration)


<a id="propertylikelihood-highmedlowstring"></a>
## Property likelihood ∷ HighMedLowString

how likely the specific consequence is expected to be seen relative to the other consequences

* This entry is optional


  * Allowed Values:
    * High
    * Info
    * Low
    * Medium
    * None
    * Unknown
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="propertynote-markdownstring"></a>
## Property note ∷ MarkdownString

additional commentary about a consequence

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters


</details>

<a id="map10"></a>
# *DetectionMethod*

> Reference: [DetectionMethodsType](https://cwe.mitre.org/documents/schema/#DetectionMethodsType)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|provide some context of how this method can be applied to a specific weakness|**Required**|
|[method](#propertymethod-detectionmethodstring)|DetectionMethodString|identifies the particular detection method being described|**Required**|
|[effectiveness](#propertyeffectiveness-detectioneffectivenessstring)|DetectionEffectivenessString|how effective the detection method may be in detecting the associated weakness|_Optional_|
|[effectiveness_notes](#propertyeffectiveness_notes-markdownstring)|MarkdownString|provides additional discussion of the strengths and shortcomings of this detection method|_Optional_|


<details>

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

provide some context of how this method can be applied to a specific weakness

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertymethod-detectionmethodstring"></a>
## Property method ∷ DetectionMethodString

identifies the particular detection method being described

* This entry is required


  * *DetectionMethod* method used to detect a weakness
  * Allowed Values:
    * Architecture or Design Review
    * Automated Analysis
    * Automated Dynamic Analysis
    * Automated Static Analysis
    * Automated Static Analysis - Binary or Bytecode
    * Automated Static Analysis - Source Code
    * Black Box
    * Dynamic Analysis with Automated Results Interpretation
    * Dynamic Analysis with Manual Results Interpretation
    * Fuzzing
    * Manual Analysis
    * Manual Dynamic Analysis
    * Manual Static Analysis
    * Manual Static Analysis - Binary or Bytecode
    * Manual Static Analysis - Source Code
    * Other
    * White Box
  * Reference: [DetectionMethodEnumeration](https://cwe.mitre.org/documents/schema/#DetectionMethodEnumeration)


<a id="propertyeffectiveness-detectioneffectivenessstring"></a>
## Property effectiveness ∷ DetectionEffectivenessString

how effective the detection method may be in detecting the associated weakness

* This entry is optional


  * *DetectionEffectiveness* level of effectiveness that a detection method may have in detecting an associated weakness
  * Allowed Values:
    * High
    * Limited
    * Moderate
    * None
    * Opportunistic
    * SOAR Partial
  * Reference: [DetectionEffectivenessEnumeration](https://cwe.mitre.org/documents/schema/#DetectionEffectivenessEnumeration)


<a id="propertyeffectiveness_notes-markdownstring"></a>
## Property effectiveness_notes ∷ MarkdownString

provides additional discussion of the strengths and shortcomings of this detection method

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters


</details>

<a id="map11"></a>
# *Mitigation*

> Reference: [PotentialMitigationsType](https://cwe.mitre.org/documents/schema/#PotentialMitigationsType)

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|MarkdownString|a description of this individual mitigation including any strengths and shortcomings of this mitigation for the weakness|**Required**|
|[effectiveness](#propertyeffectiveness-effectivenessstring)|EffectivenessString|summarizes how effective the mitigation may be in preventing the weakness|_Optional_|
|[effectiveness_notes](#propertyeffectiveness_notes-markdownstring)|MarkdownString| |_Optional_|
|[phases](#propertyphases-softwarephasestring)|[SoftwarePhaseString]|indicates the development life cycle phase during which this particular mitigation may be applied|_Optional_|
|[strategy](#propertystrategy-mitigationstrategystring)|MitigationStrategyString|a general strategy for protecting a system to which this mitigation contributes|_Optional_|


<details>

<a id="propertydescription-markdownstring"></a>
## Property description ∷ MarkdownString

a description of this individual mitigation including any strengths and shortcomings of this mitigation for the weakness

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyeffectiveness-effectivenessstring"></a>
## Property effectiveness ∷ EffectivenessString

summarizes how effective the mitigation may be in preventing the weakness

* This entry is optional


  * *Effectiveness* related to how effective a mitigation may be in preventing the weakness
  * Allowed Values:
    * Defense in Depth
    * High
    * Incidental
    * Limited
    * Moderate
    * None
  * Reference: [EffectivenessEnumeration](https://cwe.mitre.org/documents/schema/#EffectivenessEnumeration)


<a id="propertyeffectiveness_notes-markdownstring"></a>
## Property effectiveness_notes ∷ MarkdownString

* This entry is optional


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertyphases-softwarephasestring"></a>
## Property phases ∷ [SoftwarePhaseString]

indicates the development life cycle phase during which this particular mitigation may be applied

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * *SoftwarePhase* defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Architecture and Design
    * Build and Compilation
    * Bundling
    * Distribution
    * Documentation
    * Implementation
    * Installation
    * Operation
    * Patching and Maintenance
    * Policy
    * Porting
    * Requirements
    * System Configuration
    * Testing
  * Reference: [PhaseEnumeration](https://cwe.mitre.org/documents/schema/#PhaseEnumeration)


<a id="propertystrategy-mitigationstrategystring"></a>
## Property strategy ∷ MitigationStrategyString

a general strategy for protecting a system to which this mitigation contributes

* This entry is optional


  * *MitigationStrategy* strategy for protecting a system to which a mitigation contributes
  * Allowed Values:
    * Attack Surface Reduction
    * Compilation or Build Hardening
    * Enforcement by Conversion
    * Environment Hardening
    * Firewall
    * Input Validation
    * Language Selection
    * Libraries or Frameworks
    * Output Encoding
    * Parameterization
    * Refactoring
    * Resource Limitation
    * Sandbox or Jail
    * Separation of Privilege
  * Reference: [MitigationStrategyEnumeration](https://cwe.mitre.org/documents/schema/#MitigationStrategyEnumeration)



</details>

<a id="map12"></a>
# *Note*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[note](#propertynote-markdownstring)|MarkdownString| |**Required**|
|[type](#propertytype-notetypestring)|NoteTypeString| |**Required**|


<details>

<a id="propertynote-markdownstring"></a>
## Property note ∷ MarkdownString

* This entry is required


  * *Markdown* Markdown string with at most 5000 characters

<a id="propertytype-notetypestring"></a>
## Property type ∷ NoteTypeString

* This entry is required


  * *NoteType* defines the different types of notes that can be associated with a weakness
  * Allowed Values:
    * Applicable Platform
    * Maintenance
    * Relationship
    * Research Gap
    * Terminology
    * Theoretical
  * Reference: [NoteTypeEnumeration] (https://cwe.mitre.org/documents/schema/#NoteTypeEnumeration)



</details>
