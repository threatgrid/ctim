<a id="top"></a>
# *Weakness* Object

a mistake or condition that, if left unaddressed, could under the proper conditions contribute to a cyber-enabled capability being vulnerable to attack, allowing an adversary to make items function in unintended ways.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-markdownstring)|Markdown String|should be short and limited to the key points that define this weakness|&#10003;|
|[id](#propertyid-string)| String|Globally unique URI identifying this object.|&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[type](#propertytype-weaknesstypeidentifierstring)|WeaknessTypeIdentifier String|The fixed value weakness|&#10003;|
|[abstraction_level](#propertyabstraction_level-weaknessabstractionlevelstring)|WeaknessAbstractionLevel String|defines the abstraction level for this weakness||
|[affected_resources](#propertyaffected_resources-systemresourcestringlist)|SystemResource String List|identify system resources that can be affected by an exploit of this weakness||
|[alternate_terms](#propertyalternate_terms-alternatetermobjectlist)|*AlternateTerm* Object List|indicates one or more other names used to describe this weakness||
|[architectures](#propertyarchitectures-architectureobjectlist)|*Architecture* Object List|Applicable architectures||
|[background_details](#propertybackground_details-markdownstring)|Markdown String|information that is relevant but not related to the nature of the weakness itself||
|[common_consequences](#propertycommon_consequences-consequenceobjectlist)|*Consequence* Object List|specify individual consequences associated with a weakness||
|[detection_methods](#propertydetection_methods-detectionmethodobjectlist)|*DetectionMethod* Object List|identify methods that may be employed to detect this weakness, including their strengths and limitations||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[external_references](#propertyexternal_references-externalreferenceobjectlist)|*ExternalReference* Object List|Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.||
|[functional_areas](#propertyfunctional_areas-functionalareastringlist)|FunctionalArea String List|identifies the functional area of the software in which the weakness is most likely to occur||
|[language](#propertylanguage-shortstringstring)|ShortString String|The human language this object is specified in.||
|[languages](#propertylanguages-languageobjectlist)|*Language* Object List|Applicable Languages||
|[likelihood](#propertylikelihood-highmedlowstring)|HighMedLow String|Likelihood of exploit||
|[modes_of_introduction](#propertymodes_of_introduction-modeofintroductionobjectlist)|*ModeOfIntroduction* Object List|information about how and when a given weakness may be introduced||
|[notes](#propertynotes-noteobjectlist)|*Note* Object List|provide any additional comments about the weakness||
|[os](#propertyos-operatingsystemobjectlist)|*OperatingSystem* Object List|Applicable operating systems||
|[paradigms](#propertyparadigms-paradigmobjectlist)|*Paradigm* Object List|Applicable paradigms||
|[potential_mitigations](#propertypotential_mitigations-mitigationobjectlist)|*Mitigation* Object List|describe potential mitigations associated with a weakness||
|[revision](#propertyrevision-integer)|Integer|A monotonically increasing revision, incremented each time the object is changed.||
|[short_description](#propertyshort_description-medstringstring)|MedString String|A single line, short summary of the object.||
|[source](#propertysource-medstringstring)|MedString String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[structure](#propertystructure-weaknessstructurestring)|WeaknessStructure String|defines the structural nature of the weakness||
|[technologies](#propertytechnologies-technologyobjectlist)|*Technology* Object List|Applicable technologies||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)|The time this object was created at, or last modified.||
|[title](#propertytitle-shortstringstring)|ShortString String|A short title for this object, used as primary display and reference value||
|[tlp](#propertytlp-tlpstring)|TLP String|Specification for how, and to whom, this object can be shared.||

* Reference: [WeaknessType](https://cwe.mitre.org/documents/schema/#WeaknessType)

<a id="propertyabstraction_level-weaknessabstractionlevelstring"></a>
## Property abstraction_level ∷ WeaknessAbstractionLevel String

defines the abstraction level for this weakness

* This entry is optional


  * defines the different abstraction levels that apply to a weakness. A `Class` is the most abstract type of weakness, typically described independent of any specific language or technology. A `Base` is a more specific type of weakness that is still mostly independent of a resource or technology, but with sufficient details to provide specific methods for detection and prevention. A `Variant` is a weakness that is described at a very low level of detail, typically limited to a specific language or technology. A `Compound` weakness is a meaningful aggregation of several weaknesses, currently known as either a Chain or Composite.
  * Allowed Values:
    * Base
    * Class
    * Compound
    * Variant
  * Reference: [AbstractionEnumeration
](https://cwe.mitre.org/documents/schema/#AbstractionEnumeration)

<a id="propertyaffected_resources-systemresourcestringlist"></a>
## Property affected_resources ∷ SystemResource String List

identify system resources that can be affected by an exploit of this weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * defines a resource of a system
  * Allowed Values:
    * CPU
    * File or Directory
    * Memory
    * System Process
  * Reference: [ResourceEnumeration](https://cwe.mitre.org/documents/schema/#ResourceEnumeration)

<a id="propertyalternate_terms-alternatetermobjectlist"></a>
## Property alternate_terms ∷ *AlternateTerm* Object List

indicates one or more other names used to describe this weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map7-ref"></a>
* *AlternateTerm* Object Value
  * Details: [*AlternateTerm* Object](#map7)

<a id="propertyarchitectures-architectureobjectlist"></a>
## Property architectures ∷ *Architecture* Object List

Applicable architectures

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map4-ref"></a>
* *Architecture* Object Value
  * Details: [*Architecture* Object](#map4)

<a id="propertybackground_details-markdownstring"></a>
## Property background_details ∷ Markdown String

information that is relevant but not related to the nature of the weakness itself

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertycommon_consequences-consequenceobjectlist"></a>
## Property common_consequences ∷ *Consequence* Object List

specify individual consequences associated with a weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map9-ref"></a>
* *Consequence* Object Value
  * Details: [*Consequence* Object](#map9)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ Markdown String

should be short and limited to the key points that define this weakness

* This entry is required


  * Markdown string with at most 5000 characters

<a id="propertydetection_methods-detectionmethodobjectlist"></a>
## Property detection_methods ∷ *DetectionMethod* Object List

identify methods that may be employed to detect this weakness, including their strengths and limitations

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map10-ref"></a>
* *DetectionMethod* Object Value
  * Details: [*DetectionMethod* Object](#map10)

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyexternal_references-externalreferenceobjectlist"></a>
## Property external_references ∷ *ExternalReference* Object List

Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems.

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map1-ref"></a>
* *ExternalReference* Object Value
  * Details: [*ExternalReference* Object](#map1)

<a id="propertyfunctional_areas-functionalareastringlist"></a>
## Property functional_areas ∷ FunctionalArea String List

identifies the functional area of the software in which the weakness is most likely to occur

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * Defines the different functional areas of software in which the weakness may appear
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

<a id="propertyid-string"></a>
## Property id ∷  String

Globally unique URI identifying this object.

* This entry is required


  * IDs are URIs, for example `https://www.domain.com/ctia/judgement/judgement-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field. The optional STIX _idref_ field is not used.

<a id="propertylanguage-shortstringstring"></a>
## Property language ∷ ShortString String

The human language this object is specified in.

* This entry is optional


  * String with at most 1024 characters

<a id="propertylanguages-languageobjectlist"></a>
## Property languages ∷ *Language* Object List

Applicable Languages

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map2-ref"></a>
* *Language* Object Value
  * Details: [*Language* Object](#map2)

<a id="propertylikelihood-highmedlowstring"></a>
## Property likelihood ∷ HighMedLow String

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

<a id="propertymodes_of_introduction-modeofintroductionobjectlist"></a>
## Property modes_of_introduction ∷ *ModeOfIntroduction* Object List

information about how and when a given weakness may be introduced

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map8-ref"></a>
* *ModeOfIntroduction* Object Value
  * Details: [*ModeOfIntroduction* Object](#map8)

<a id="propertynotes-noteobjectlist"></a>
## Property notes ∷ *Note* Object List

provide any additional comments about the weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map12-ref"></a>
* *Note* Object Value
  * Details: [*Note* Object](#map12)

<a id="propertyos-operatingsystemobjectlist"></a>
## Property os ∷ *OperatingSystem* Object List

Applicable operating systems

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map3-ref"></a>
* *OperatingSystem* Object Value
  * Details: [*OperatingSystem* Object](#map3)

<a id="propertyparadigms-paradigmobjectlist"></a>
## Property paradigms ∷ *Paradigm* Object List

Applicable paradigms

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map5-ref"></a>
* *Paradigm* Object Value
  * Details: [*Paradigm* Object](#map5)

<a id="propertypotential_mitigations-mitigationobjectlist"></a>
## Property potential_mitigations ∷ *Mitigation* Object List

describe potential mitigations associated with a weakness

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map11-ref"></a>
* *Mitigation* Object Value
  * Details: [*Mitigation* Object](#map11)

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

A monotonically increasing revision, incremented each time the object is changed.

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-medstringstring"></a>
## Property short_description ∷ MedString String

A single line, short summary of the object.

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-medstringstring"></a>
## Property source ∷ MedString String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertystructure-weaknessstructurestring"></a>
## Property structure ∷ WeaknessStructure String

defines the structural nature of the weakness

* This entry is optional


  * structural natures of a weakness. A Simple structure represents a single weakness whose exploitation is not dependent on the presence of another weakness. A Composite is a set of weaknesses that must all be present simultaneously in order to produce an exploitable vulnerability, while a Chain is a set of weaknesses that must be reachable consecutively in order to produce an exploitable vulnerability.
  * Allowed Values:
    * Chain
    * Composite
    * Simple
  * Reference: [StructureEnumeration](https://cwe.mitre.org/documents/schema/#StructureEnumeration))

<a id="propertytechnologies-technologyobjectlist"></a>
## Property technologies ∷ *Technology* Object List

Applicable technologies

* This entry is optional
* This entry's type is sequential (allows zero or more values)


<a id="map6-ref"></a>
* *Technology* Object Value
  * Details: [*Technology* Object](#map6)

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

The time this object was created at, or last modified.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-shortstringstring"></a>
## Property title ∷ ShortString String

A short title for this object, used as primary display and reference value

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

Specification for how, and to whom, this object can be shared.

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-weaknesstypeidentifierstring"></a>
## Property type ∷ WeaknessTypeIdentifier String

The fixed value weakness

* This entry is required


  * The fixed value "weakness"
  * Must equal: "weakness"

<a id="map1"></a>
# *ExternalReference* Object

External references are used to describe pointers to information represented outside of CTIM. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[source_name](#propertysource_name-medstringstring)|MedString String|The source within which the external-reference is defined (system, registry, organization, etc.)|&#10003;|
|[description](#propertydescription-markdownstring)|Markdown String| ||
|[external_id](#propertyexternal_id-string)| String|An identifier for the external reference content.||
|[hashes](#propertyhashes-stringlist)| String List|Specifies a dictionary of hashes for the contents of the url.||
|[url](#propertyurl-string)| String|A URL reference to an external resource||

* Reference: [External Reference](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.72bcfr3t79jx)

<a id="propertydescription-markdownstring"></a>
## Property description ∷ Markdown String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_id-string"></a>
## Property external_id ∷  String

An identifier for the external reference content.

* This entry is optional



<a id="propertyhashes-stringlist"></a>
## Property hashes ∷  String List

Specifies a dictionary of hashes for the contents of the url.

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertysource_name-medstringstring"></a>
## Property source_name ∷ MedString String

The source within which the external-reference is defined (system, registry, organization, etc.)

* This entry is required


  * String with at most 2048 characters

<a id="propertyurl-string"></a>
## Property url ∷  String

A URL reference to an external resource

* This entry is optional


  * A URI

<a id="map2"></a>
# *Language* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|Prevalence String|defines the different regularities that guide the applicability of platforms|&#10003;|
|[class](#propertyclass-languageclassstring)|LanguageClass String|class of language||
|[name](#propertyname-shortstringstring)|ShortString String|Language name (Clojure, Java, ...)||


<a id="propertyclass-languageclassstring"></a>
## Property class ∷ LanguageClass String

class of language

* This entry is optional


  * class of source code language
  * Allowed Values:
    * Assembly
    * Compiled
    * Interpreted
  * Reference: [LanguageClassEnumeration](https://cwe.mitre.org/documents/schema/#LanguageClassEnumeration)

<a id="propertyname-shortstringstring"></a>
## Property name ∷ ShortString String

Language name (Clojure, Java, ...)

* This entry is optional


  * String with at most 1024 characters

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ Prevalence String

defines the different regularities that guide the applicability of platforms

* This entry is required


  * defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)

<a id="map3"></a>
# *OperatingSystem* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|Prevalence String|defines the different regularities that guide the applicability of platforms|&#10003;|
|[class](#propertyclass-operatingsystemclassstring)|OperatingSystemClass String| ||
|[cpe_id](#propertycpe_id-shortstringstring)|ShortString String| ||
|[name](#propertyname-shortstringstring)|ShortString String| ||
|[version](#propertyversion-shortstringstring)|ShortString String| ||


<a id="propertyclass-operatingsystemclassstring"></a>
## Property class ∷ OperatingSystemClass String

* This entry is optional


  * class of operating systems
  * Allowed Values:
    * Android
    * Apple iOS
    * Cisco IOS
    * Linux
    * Unix
    * Windows
    * macOs
  * Reference: [OperatingSystemClassEnumeration](https://cwe.mitre.org/documents/schema/#OperatingSystemClassEnumeration)

<a id="propertycpe_id-shortstringstring"></a>
## Property cpe_id ∷ ShortString String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyname-shortstringstring"></a>
## Property name ∷ ShortString String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ Prevalence String

defines the different regularities that guide the applicability of platforms

* This entry is required


  * defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)

<a id="propertyversion-shortstringstring"></a>
## Property version ∷ ShortString String

* This entry is optional


  * String with at most 1024 characters

<a id="map4"></a>
# *Architecture* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|Prevalence String|defines the different regularities that guide the applicability of platforms|&#10003;|
|[class](#propertyclass-architectureclassstring)|ArchitectureClass String|class of architecture||
|[name](#propertyname-shortstringstring)|ShortString String|architecture name (ARM, x86, ...)||


<a id="propertyclass-architectureclassstring"></a>
## Property class ∷ ArchitectureClass String

class of architecture

* This entry is optional


  * Allowed Values:
    * Embedded
    * Microcomputer
    * Workstation
  * Reference: [ArchitectureClassEnumeration](https://cwe.mitre.org/documents/schema/#ArchitectureClassEnumeration)

<a id="propertyname-shortstringstring"></a>
## Property name ∷ ShortString String

architecture name (ARM, x86, ...)

* This entry is optional


  * String with at most 1024 characters

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ Prevalence String

defines the different regularities that guide the applicability of platforms

* This entry is required


  * defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)

<a id="map5"></a>
# *Paradigm* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|Prevalence String|defines the different regularities that guide the applicability of platforms|&#10003;|
|[name](#propertyname-shortstringstring)|ShortString String|paradigm name (Client Server, Mainframe)||


<a id="propertyname-shortstringstring"></a>
## Property name ∷ ShortString String

paradigm name (Client Server, Mainframe)

* This entry is optional


  * String with at most 1024 characters

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ Prevalence String

defines the different regularities that guide the applicability of platforms

* This entry is required


  * defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)

<a id="map6"></a>
# *Technology* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#propertyprevalence-prevalencestring)|Prevalence String|defines the different regularities that guide the applicability of platforms|&#10003;|
|[name](#propertyname-shortstringstring)|ShortString String|technology name (Web Server, Web Client)||


<a id="propertyname-shortstringstring"></a>
## Property name ∷ ShortString String

technology name (Web Server, Web Client)

* This entry is optional


  * String with at most 1024 characters

<a id="propertyprevalence-prevalencestring"></a>
## Property prevalence ∷ Prevalence String

defines the different regularities that guide the applicability of platforms

* This entry is required


  * defines the different regularities that guide the applicability of platforms
  * Allowed Values:
    * Often
    * Rarely
    * Sometimes
    * Undetermined
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)

<a id="map7"></a>
# *AlternateTerm* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[term](#propertyterm-shortstringstring)|ShortString String|the actual alternate term|&#10003;|
|[description](#propertydescription-medstringstring)|MedString String|provides context for the alternate term by which this weakness may be known.||


<a id="propertydescription-medstringstring"></a>
## Property description ∷ MedString String

provides context for the alternate term by which this weakness may be known.

* This entry is optional


  * String with at most 2048 characters

<a id="propertyterm-shortstringstring"></a>
## Property term ∷ ShortString String

the actual alternate term

* This entry is required


  * String with at most 1024 characters

<a id="map8"></a>
# *ModeOfIntroduction* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[note](#propertynote-medstringstring)|MedString String|provides a typical scenario related to introduction during the given phase|&#10003;|
|[phase](#propertyphase-softwarephasestring)|SoftwarePhase String|identifies the point in the software life cycle at which the weakness may be introduced|&#10003;|

* Reference: [ModesOfIntroductionType](https://cwe.mitre.org/documents/schema/#ModesOfIntroductionType)

<a id="propertynote-medstringstring"></a>
## Property note ∷ MedString String

provides a typical scenario related to introduction during the given phase

* This entry is required


  * String with at most 2048 characters

<a id="propertyphase-softwarephasestring"></a>
## Property phase ∷ SoftwarePhase String

identifies the point in the software life cycle at which the weakness may be introduced

* This entry is required


  * defines the different regularities that guide the applicability of platforms
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

<a id="map9"></a>
# *Consequence* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[scopes](#propertyscopes-consequencescopestringlist)|ConsequenceScope String List|identifies the security property that is violated|&#10003;|
|[impacts](#propertyimpacts-technicalimpactstringlist)|TechnicalImpact String List|describes the technical impact that arises if an adversary succeeds in exploiting this weakness||
|[likelihood](#propertylikelihood-highmedlowstring)|HighMedLow String|how likely the specific consequence is expected to be seen relative to the other consequences||
|[note](#propertynote-medstringstring)|MedString String|additional commentary about a consequence||

* Reference: [CommonConsequencesType](https://cwe.mitre.org/documents/schema/#CommonConsequencesType)

<a id="propertyimpacts-technicalimpactstringlist"></a>
## Property impacts ∷ TechnicalImpact String List

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
## Property likelihood ∷ HighMedLow String

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

<a id="propertynote-medstringstring"></a>
## Property note ∷ MedString String

additional commentary about a consequence

* This entry is optional


  * String with at most 2048 characters

<a id="propertyscopes-consequencescopestringlist"></a>
## Property scopes ∷ ConsequenceScope String List

identifies the security property that is violated

* This entry is required
* This entry's type is sequential (allows zero or more values)


  * defines the different areas of software security that can be affected by exploiting a weakness.
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

<a id="map10"></a>
# *DetectionMethod* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-medstringstring)|MedString String|provide some context of how this method can be applied to a specific weakness|&#10003;|
|[method](#propertymethod-detectionmethodstring)|DetectionMethod String|identifies the particular detection method being described|&#10003;|
|[effectiveness](#propertyeffectiveness-detectioneffectivenessstring)|DetectionEffectiveness String|how effective the detection method may be in detecting the associated weakness||
|[effectiveness_notes](#propertyeffectiveness_notes-medstringstring)|MedString String|provides additional discussion of the strengths and shortcomings of this detection method||

* Reference: [DetectionMethodsType](https://cwe.mitre.org/documents/schema/#DetectionMethodsType)

<a id="propertydescription-medstringstring"></a>
## Property description ∷ MedString String

provide some context of how this method can be applied to a specific weakness

* This entry is required


  * String with at most 2048 characters

<a id="propertyeffectiveness-detectioneffectivenessstring"></a>
## Property effectiveness ∷ DetectionEffectiveness String

how effective the detection method may be in detecting the associated weakness

* This entry is optional


  * level of effectiveness that a detection method may have in detecting an associated weakness
  * Allowed Values:
    * High
    * Limited
    * Moderate
    * None
    * Opportunistic
    * SOAR Partial
  * Reference: [DetectionEffectivenessEnumeration](https://cwe.mitre.org/documents/schema/#DetectionEffectivenessEnumeration)

<a id="propertyeffectiveness_notes-medstringstring"></a>
## Property effectiveness_notes ∷ MedString String

provides additional discussion of the strengths and shortcomings of this detection method

* This entry is optional


  * String with at most 2048 characters

<a id="propertymethod-detectionmethodstring"></a>
## Property method ∷ DetectionMethod String

identifies the particular detection method being described

* This entry is required


  * method used to detect a weakness
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

<a id="map11"></a>
# *Mitigation* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[description](#propertydescription-medstringstring)|MedString String|a description of this individual mitigation including any strengths and shortcomings of this mitigation for the weakness|&#10003;|
|[effectiveness](#propertyeffectiveness-effectivenessstring)|Effectiveness String|summarizes how effective the mitigation may be in preventing the weakness||
|[effectiveness_notes](#propertyeffectiveness_notes-medstringstring)|MedString String| ||
|[phases](#propertyphases-softwarephasestringlist)|SoftwarePhase String List|indicates the development life cycle phase during which this particular mitigation may be applied||
|[strategy](#propertystrategy-mitigationstrategystring)|MitigationStrategy String|a general strategy for protecting a system to which this mitigation contributes||

* Reference: [PotentialMitigationsType](https://cwe.mitre.org/documents/schema/#PotentialMitigationsType)

<a id="propertydescription-medstringstring"></a>
## Property description ∷ MedString String

a description of this individual mitigation including any strengths and shortcomings of this mitigation for the weakness

* This entry is required


  * String with at most 2048 characters

<a id="propertyeffectiveness-effectivenessstring"></a>
## Property effectiveness ∷ Effectiveness String

summarizes how effective the mitigation may be in preventing the weakness

* This entry is optional


  * related to how effective a mitigation may be in preventing the weakness
  * Allowed Values:
    * Defense in Depth
    * High
    * Incidental
    * Limited
    * Moderate
    * None
  * Reference: [EffectivenessEnumeration](https://cwe.mitre.org/documents/schema/#EffectivenessEnumeration)

<a id="propertyeffectiveness_notes-medstringstring"></a>
## Property effectiveness_notes ∷ MedString String

* This entry is optional


  * String with at most 2048 characters

<a id="propertyphases-softwarephasestringlist"></a>
## Property phases ∷ SoftwarePhase String List

indicates the development life cycle phase during which this particular mitigation may be applied

* This entry is optional
* This entry's type is sequential (allows zero or more values)


  * defines the different regularities that guide the applicability of platforms
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
## Property strategy ∷ MitigationStrategy String

a general strategy for protecting a system to which this mitigation contributes

* This entry is optional


  * strategy for protecting a system to which a mitigation contributes
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

<a id="map12"></a>
# *Note* Object

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[note](#propertynote-markdownstring)|Markdown String| |&#10003;|
|[type](#propertytype-notetypestring)|NoteType String| |&#10003;|


<a id="propertynote-markdownstring"></a>
## Property note ∷ Markdown String

* This entry is required


  * Markdown string with at most 5000 characters

<a id="propertytype-notetypestring"></a>
## Property type ∷ NoteType String

* This entry is required


  * defines the different types of notes that can be associated with a weakness
  * Allowed Values:
    * Applicable Platform
    * Maintenance
    * Relationship
    * Research Gap
    * Terminology
    * Theoretical
  * Reference: [NoteTypeEnumeration] (https://cwe.mitre.org/documents/schema/#NoteTypeEnumeration)
