<a id="map5"></a>
# *Paradigm*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[prevalence](#prevalence-prevalencestring)|PrevalenceString|defines the different regularities that guide the applicability of platforms|**Required**|
|[name](#name-shortstring)|ShortString|paradigm name (Client Server, Mainframe)|_Optional_|


<a id="name-shortstring"></a>
### `name` ∷ ShortString

paradigm name (Client Server, Mainframe)

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

