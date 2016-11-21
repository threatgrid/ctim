# Common Relationship Type

These relationship types can be made between any entities in the CTIM.

* duplicate-of  - is a copy of some other object.
* related-to - a generic relation to another object.  Please use one
  of the defined entity relationships below if at all applicable.
* derived-from - is based on another object, but is different.  For
  example, if I am making a copy of a TTP record that is located in
  the global CTIA instance, so that I can edit it locally in my
  organizations CTIA instance, than I would record a `derived-from`
  relationship in my local CTIA instance.

# Defined Entity Relationships

* Judgement
  * observable-of - Indicator

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



