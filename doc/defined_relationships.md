# Common Relationship Type

These relationship types can be made between any entities in the CTIM.

* `duplicate-of`  - is a copy of some other object.
* `related-to` - a generic relation to another object.  Please use one
  of the defined entity relationships below if at all applicable.
* `derived-from` - is based on another object, but is different.  For
  example, if I am making a copy of an AttackPattern record that is located in
  the global CTIA instance, so that I can edit it locally in my
  organizations CTIA instance, than I would record a `derived-from`
  relationship in my local CTIA instance.

# Defined Entity Relationships

* Judgement
  * based-on - Indicator, for pattern based indicators or engines
  * element-of - Indicator, for observable based indicators and feeds

* Sighting
  * based-on - Judgement
  * based-on - Sighting, for [complex sightings](https://github.com/threatgrid/ctim/tree/master/doc/tutorials/modeling-complex-events-ctim.md)
  * sighting-of - Indicator, for pattern based indicators or engines
  * member-of - Indicator, for observable based indicators and feeds
  * member-of - Incident

* Indicators
  * based-on - Indicator, for [complex indicators](https://github.com/threatgrid/ctim/tree/master/doc/tutorials/modeling-complex-events-ctim.md)
  * indicates - Campaign
  * indicates - Actor
  * indicates - Attack Pattern
  * indicates - Malware
  * indicates - Tool

* Incident
  * attributed-to - Campaign
  * attributed-to - Actor
  * exploits -  ExploitTarget
  * uses - COA

* Campaign
  * targets - ExploitTarget
  * uses - Attack Pattern
  * uses - Malware
  * uses - Tool
  * attributed-to - Actor

* COA
  * mitigates - Attack Pattern
  * mitigates - ExploitTarget
  * mitigates - Incident
  * mitigates - Malware
  * mitigates - Tool

* Actor
  * uses - Attack Pattern
  * uses - Malware
  * uses - Tool

* Attack Pattern
  * targets - ExploitTarget
  * uses - Malware
  * uses - Tool
  * exploits - Weakness
  * technique-of - AttackPattern (technique) -> AttackPattern (tactic)
  * subtechnique-of - AttackPattern (technique) -> AttackPattern (technique)

* Malware
  * targets - ExploitTarget
  * uses - Tool
  * variant-of - Tool

* Tool
  * targets - ExploitTarget

* Weakness
  * variant-of - Weakness
  * based-on - Weakness
