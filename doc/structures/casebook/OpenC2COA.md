<a id="map103"></a>
# *OpenC2COA*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[action](#action-actiontypeactiontypemdmap104)|[*ActionType*](./ActionType.md#map104)| |**Required**|
|[type](#type-structuredcoatypestring)|StructuredCOATypeString| |**Required**|
|[actuator](#actuator-actuatortypeactuatortypemdmap106)|[*ActuatorType*](./ActuatorType.md#map106)| |_Optional_|
|[id](#id-shortstring)|ShortString| |_Optional_|
|[modifiers](#modifiers-modifiertypemodifiertypemdmap107)|[*ModifierType*](./ModifierType.md#map107)| |_Optional_|
|[target](#target-targettypetargettypemdmap105)|[*TargetType*](./TargetType.md#map105)| |_Optional_|


<a id="action-actiontypeactiontypemdmap104"></a>
### `action` ∷ [*ActionType*](./ActionType.md#map104)

* This entry is **required**


<a id="actuator-actuatortypeactuatortypemdmap106"></a>
### `actuator` ∷ [*ActuatorType*](./ActuatorType.md#map106)

* This entry is _optional_


<a id="id-shortstring"></a>
### `id` ∷ ShortString

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="modifiers-modifiertypemodifiertypemdmap107"></a>
### `modifiers` ∷ [*ModifierType*](./ModifierType.md#map107)

* This entry is _optional_


<a id="target-targettypetargettypemdmap105"></a>
### `target` ∷ [*TargetType*](./TargetType.md#map105)

* This entry is _optional_


<a id="type-structuredcoatypestring"></a>
### `type` ∷ StructuredCOATypeString

* This entry is **required**


  * Must equal: `"structured_coa"`
