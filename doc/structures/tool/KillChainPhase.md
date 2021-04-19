<a id="map2"></a>
# *KillChainPhase*

> Reference: [Kill Chain Phase](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.i4tjv75ce50h)

*KillChainPhase* The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[kill_chain_name](#kill_chain_name-string)|String|The name of the kill chain.|**Required**|
|[phase_name](#phase_name-string)|String|The name of the phase in the kill chain.|**Required**|


<a id="kill_chain_name-string"></a>
### `kill_chain_name` ∷ String

The name of the kill chain.

* This entry is **required**


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Must equal: `"lockheed-martin-cyber-kill-chain"`
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)


<a id="phase_name-string"></a>
### `phase_name` ∷ String

The name of the phase in the kill chain.

* This entry is **required**


  * SHOULD be all lowercase (where lowercase is defined by the locality conventions) and SHOULD use hyphens instead of spaces or underscores as word separators.
  * Allowed values:
    * `"actions-on-objective"`
    * `"command-and-control"`
    * `"delivery"`
    * `"exploitation"`
    * `"installation"`
    * `"reconnaissance"`
    * `"weaponization"`
  * Reference: [Open Vocabulary](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.u4s6d165nk3c)

