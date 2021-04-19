<a id="map45"></a>
# *OpenC2COA*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[action](#action-actiontypeactiontypemdmap46)|[*ActionType*](./ActionType.md#map46)| |**Required**|
|[type](#type-structuredcoatypestring)|StructuredCOATypeString| |**Required**|
|[actuator](#actuator-actuatortypeactuatortypemdmap48)|[*ActuatorType*](./ActuatorType.md#map48)| |_Optional_|
|[id](#id-shortstring)|ShortString| |_Optional_|
|[modifiers](#modifiers-modifiertypemodifiertypemdmap49)|[*ModifierType*](./ModifierType.md#map49)| |_Optional_|
|[target](#target-targettypetargettypemdmap47)|[*TargetType*](./TargetType.md#map47)| |_Optional_|


<a id="action-actiontypeactiontypemdmap46"></a>
### `action` ∷ [*ActionType*](./ActionType.md#map46)

* This entry is **required**


<a id="actuator-actuatortypeactuatortypemdmap48"></a>
### `actuator` ∷ [*ActuatorType*](./ActuatorType.md#map48)

* This entry is _optional_


<a id="id-shortstring"></a>
### `id` ∷ ShortString

* This entry is _optional_


  * *ShortString* String with at most 1024 characters

<a id="modifiers-modifiertypemodifiertypemdmap49"></a>
### `modifiers` ∷ [*ModifierType*](./ModifierType.md#map49)

* This entry is _optional_


<a id="target-targettypetargettypemdmap47"></a>
### `target` ∷ [*TargetType*](./TargetType.md#map47)

* This entry is _optional_


<a id="type-structuredcoatypestring"></a>
### `type` ∷ StructuredCOATypeString

* This entry is **required**


  * Must equal: `"structured_coa"`
