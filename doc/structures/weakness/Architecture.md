<a id="map4"></a>
# *Architecture*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#prevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[class](#class-architectureclassstring)|ArchitectureClassString|class of architecture|_Optional_|
|[name](#name-shortstring)|ShortString|architecture name (ARM, x86, ...)|_Optional_|


<a id="class-architectureclassstring"></a>
### `class` ∷ ArchitectureClassString

class of architecture

* This entry is _optional_


  * Allowed values:
    * `"Embedded"`
    * `"Microcomputer"`
    * `"Workstation"`
  * Reference: [ArchitectureClassEnumeration](https://cwe.mitre.org/documents/schema/#ArchitectureClassEnumeration)


<a id="name-shortstring"></a>
### `name` ∷ ShortString

architecture name (ARM, x86, ...)

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="prevalence-prevalencestring"></a>
### `prevalence` ∷ PrevalenceString

defines the different regularities that guide the applicability of platforms

* This entry is **required**


  * *Prevalence* defines the different regularities that guide the applicability of platforms
  * Allowed values:
    * `"Often"`
    * `"Rarely"`
    * `"Sometimes"`
    * `"Undetermined"`
  * Reference: [PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)

