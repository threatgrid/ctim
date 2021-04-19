<a id="map117"></a>
# *CPENode*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[operator](#operator-cpe-node-operator-stringstring)|cpe-node-operator-stringString| |**Required**|
|[children](#children-cpeleafnodecpeleafnodemdmap119)|[[*CPELeafNode*](./CPELeafNode.md#map119)]| |_Optional_|
|[cpe_match](#cpe_match-cpematchcpematchmdmap118)|[[*CPEMatch*](./CPEMatch.md#map118)]| |_Optional_|
|[negate](#negate-boolean)|Boolean|Negates operator when true.|_Optional_|


<a id="children-cpeleafnodecpeleafnodemdmap119"></a>
### `children` ∷ [[*CPELeafNode*](./CPELeafNode.md#map119)]

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


<a id="cpe_match-cpematchcpematchmdmap118"></a>
### `cpe_match` ∷ [[*CPEMatch*](./CPEMatch.md#map118)]

* This entry is _optional_
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
