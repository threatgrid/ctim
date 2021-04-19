<a id="map40"></a>
# *Language*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#prevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[class](#class-languageclassstring)|LanguageClassString|class of language|_Optional_|
|[name](#name-shortstring)|ShortString|Language name (Clojure, Java, ...)|_Optional_|


<a id="class-languageclassstring"></a>
### `class` ∷ LanguageClassString

class of language

* This entry is _optional_


  * *LanguageClass* class of source code language
  * Allowed values:
    * `"Assembly"`
    * `"Compiled"`
    * `"Interpreted"`
  * Reference: [LanguageClassEnumeration](https://cwe.mitre.org/documents/schema/#LanguageClassEnumeration)


<a id="name-shortstring"></a>
### `name` ∷ ShortString

Language name (Clojure, Java, ...)

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

