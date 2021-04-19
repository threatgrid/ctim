<a id="map3"></a>
# *OperatingSystem*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#prevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[class](#class-operatingsystemclassstring)|OperatingSystemClassString| |_Optional_|
|[cpe_id](#cpe_id-shortstring)|ShortString| |_Optional_|
|[name](#name-shortstring)|ShortString| |_Optional_|
|[version](#version-shortstring)|ShortString| |_Optional_|


<a id="class-operatingsystemclassstring"></a>
### `class` ∷ OperatingSystemClassString

* This entry is _optional_


  * *OperatingSystemClass* class of operating systems
  * Allowed values:
    * `"Android"`
    * `"Apple iOS"`
    * `"Cisco IOS"`
    * `"Linux"`
    * `"Unix"`
    * `"Windows"`
    * `"macOs"`
  * Reference: [OperatingSystemClassEnumeration](https://cwe.mitre.org/documents/schema/#OperatingSystemClassEnumeration)


<a id="cpe_id-shortstring"></a>
### `cpe_id` ∷ ShortString

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="name-shortstring"></a>
### `name` ∷ ShortString

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


<a id="version-shortstring"></a>
### `version` ∷ ShortString

* This entry is _optional_


  * *ShortString* String with at most 1024 characters
