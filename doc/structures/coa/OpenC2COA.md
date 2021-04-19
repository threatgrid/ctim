<a id="map4"></a>
# *OpenC2COA*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[action](#action-actiontypeactiontypemdmap5)|[*ActionType*](./ActionType.md#map5)| |**Required**|
|[type](#type-structuredcoatypestring)|StructuredCOATypeString| |**Required**|
|[actuator](#actuator-actuatortypeactuatortypemdmap7)|[*ActuatorType*](./ActuatorType.md#map7)| |_Optional_|
|[id](#id-shortstring)|ShortString| |_Optional_|
|[modifiers](#modifiers-modifiertypemodifiertypemdmap8)|[*ModifierType*](./ModifierType.md#map8)| |_Optional_|
|[target](#target-targettypetargettypemdmap6)|[*TargetType*](./TargetType.md#map6)| |_Optional_|


<a id="action-actiontypeactiontypemdmap5"></a>
### `action` ∷ [*ActionType*](./ActionType.md#map5)

* This entry is **required**


<a id="actuator-actuatortypeactuatortypemdmap7"></a>
### `actuator` ∷ [*ActuatorType*](./ActuatorType.md#map7)

* This entry is _optional_


<a id="id-shortstring"></a>
### `id` ∷ ShortString

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="modifiers-modifiertypemodifiertypemdmap8"></a>
### `modifiers` ∷ [*ModifierType*](./ModifierType.md#map8)

* This entry is _optional_


<a id="target-targettypetargettypemdmap6"></a>
### `target` ∷ [*TargetType*](./TargetType.md#map6)

* This entry is _optional_


<a id="type-structuredcoatypestring"></a>
### `type` ∷ StructuredCOATypeString

* This entry is **required**


  * Must equal: `"structured_coa"`
