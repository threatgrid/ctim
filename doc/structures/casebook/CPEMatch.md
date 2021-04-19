<a id="map33"></a>
# *CPEMatch*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[cpe23Uri](#cpe23uri-string)|String| |**Required**|
|[vulnerable](#vulnerable-boolean)|Boolean| |**Required**|
|[versionEndExcluding](#versionendexcluding-string)|String|A string representing the upper bound(exclusive) of version in the CPE.|_Optional_|
|[versionEndIncluding](#versionendincluding-string)|String|A string representing the upper bound(inclusive) of version in the CPE.|_Optional_|
|[versionStartExcluding](#versionstartexcluding-string)|String|A string representing the lower bound(exclusive) of version in the CPE.|_Optional_|
|[versionStartIncluding](#versionstartincluding-string)|String|A string representing the lower bound(inclusive) of version in the CPE.|_Optional_|


<a id="cpe23uri-string"></a>
### `cpe23Uri` ∷ String

* This entry is **required**


  * A text representation of a software or hardware platform.

<a id="versionendexcluding-string"></a>
### `versionEndExcluding` ∷ String

A string representing the upper bound(exclusive) of version in the CPE.

* This entry is _optional_


  * A string representing a bound of a version in the CPE.

<a id="versionendincluding-string"></a>
### `versionEndIncluding` ∷ String

A string representing the upper bound(inclusive) of version in the CPE.

* This entry is _optional_


  * A string representing a bound of a version in the CPE.

<a id="versionstartexcluding-string"></a>
### `versionStartExcluding` ∷ String

A string representing the lower bound(exclusive) of version in the CPE.

* This entry is _optional_


  * A string representing a bound of a version in the CPE.

<a id="versionstartincluding-string"></a>
### `versionStartIncluding` ∷ String

A string representing the lower bound(inclusive) of version in the CPE.

* This entry is _optional_


  * A string representing a bound of a version in the CPE.

<a id="vulnerable-boolean"></a>
### `vulnerable` ∷ Boolean

* This entry is **required**


