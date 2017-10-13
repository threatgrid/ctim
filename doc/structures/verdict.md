<a id="top"></a>
# *Verdict* Object

A Verdict is chosen from all of the Judgements on that Observable which have not yet expired.  The highest priority Judgement becomes the active verdict.  If there is more than one Judgement with that priority, then Clean disposition has priority over all others, then Malicious disposition, and so on down to Unknown.

 The ID of a verdict is a a str of the form "observable.type:observable.value" for example, "ip:1.1.1.1"

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[disposition](#propertydisposition-dispositionnumberinteger)|DispositionNumberInteger| |&#10003;|
|[observable](#propertyobservable-observableobject)|*Observable* Object| |&#10003;|
|[type](#propertytype-verdicttypeidentifierstring)|VerdictTypeIdentifier String| |&#10003;|
|[valid_time](#propertyvalid_time-validtimeobject)|*ValidTime* Object| |&#10003;|
|[disposition_name](#propertydisposition_name-dispositionnamestring)|DispositionName String|The disposition_name field is optional, but is intended to be shown to a user.  Applications must therefore remember the mapping of numbers to human words, as in: {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}||
|[judgement_id](#propertyjudgement_id-string)| String| ||


<a id="propertydisposition-dispositionnumberinteger"></a>
## Property disposition ∷ DispositionNumberInteger

* This entry is required


  * Numeric verdict identifiers
  * Allowed Values:
    * 1
    * 2
    * 3
    * 4
    * 5

<a id="propertydisposition_name-dispositionnamestring"></a>
## Property disposition_name ∷ DispositionName String

The disposition_name field is optional, but is intended to be shown to a user.  Applications must therefore remember the mapping of numbers to human words, as in: {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}

* This entry is optional


  * String verdict identifiers
  * Allowed Values:
    * Clean
    * Common
    * Malicious
    * Suspicious
    * Unknown

<a id="propertyjudgement_id-string"></a>
## Property judgement_id ∷  String

* This entry is optional


  * A URI leading to a judgement

<a id="propertyobservable-observableobject"></a>
## Property observable ∷ *Observable* Object

* This entry is required


<a id="map1-ref"></a>
* *Observable* Object Value
  * Details: [*Observable* Object](#map1)

<a id="propertytype-verdicttypeidentifierstring"></a>
## Property type ∷ VerdictTypeIdentifier String

* This entry is required


  * Must equal: "verdict"

<a id="propertyvalid_time-validtimeobject"></a>
## Property valid_time ∷ *ValidTime* Object

* This entry is required


<a id="map2-ref"></a>
* *ValidTime* Object Value
  * Details: [*ValidTime* Object](#map2)

<a id="map1"></a>
# *Observable* Object

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#propertytype-observabletypeidentifierstring)|ObservableTypeIdentifier String| |&#10003;|
|[value](#propertyvalue-string)| String| |&#10003;|


<a id="propertytype-observabletypeidentifierstring"></a>
## Property type ∷ ObservableTypeIdentifier String

* This entry is required


  * Observable type names
  * Allowed Values:
    * amp-device
    * amp_computer_guid
    * device
    * domain
    * email
    * file_name
    * file_path
    * hostname
    * imei
    * imsi
    * ip
    * ipv6
    * mac_address
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user

<a id="propertyvalue-string"></a>
## Property value ∷  String

* This entry is required



<a id="map2"></a>
# *ValidTime* Object

Period of time when a cyber observation is valid.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[end_time](#propertyend_time-instdate)|Inst (Date)|If end_time is not present, then the valid time position of the object does not have an upper bound.||
|[start_time](#propertystart_time-instdate)|Inst (Date)|If not present, the valid time position of the indicator does not have an upper bound||

* Reference: [ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)

<a id="propertyend_time-instdate"></a>
## Property end_time ∷ Inst (Date)

If end_time is not present, then the valid time position of the object does not have an upper bound.

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertystart_time-instdate"></a>
## Property start_time ∷ Inst (Date)

If not present, the valid time position of the indicator does not have an upper bound

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
