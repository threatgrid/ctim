<a id="map119"></a>
# *CPELeafNode*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[cpe_match](#cpe_match-cpematchcpematchmdmap120)|[[*CPEMatch*](./CPEMatch.md#map120)]| |**Required**|
|[operator](#operator-cpe-node-operator-stringstring)|cpe-node-operator-stringString| |**Required**|
|[negate](#negate-boolean)|Boolean|Negates operator when true.|_Optional_|


<a id="cpe_match-cpematchcpematchmdmap120"></a>
### `cpe_match` ∷ [[*CPEMatch*](./CPEMatch.md#map120)]

* This entry is **required**
* This entry's type is sequential (allows zero or more values)


<a id="negate-boolean"></a>
### `negate` ∷ Boolean

Negates operator when true.

* This entry is _optional_



<a id="operator-cpe-node-operator-stringstring"></a>
### `operator` ∷ cpe-node-operator-stringString

* This entry is **required**


  * *cpe-node-operator-string* The operator string influences how seqs of cpe matches are related to one another.
  * Allowed values:
    * `"AND"`
    * `"OR"`
