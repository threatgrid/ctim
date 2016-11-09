# Common Relationship Type

These relationship types can be made between any entities in the CTIM.

* duplicate-of
* related-to
* derived-from

# Defined Entity Relationships

* Judgement
  * indicates - Indicator


* Sighting
  * indicates - Indicator
  * member-of - Incident

* Indicators
  * indicates - Campaign
  * indicates - Actor
  * indicates - TTP

* Campaign
  * targets - ExploitTarget
  * uses - TTP
  * attributed-to - Actor
  
* COA
  * mitigates - TTP
  * mitigates - ExploitTarget
  
* TTP
  * targets - ExploitTarget



