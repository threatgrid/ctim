<a name="top"/>
# *Verdict* Map

A Verdict is chosen from all of the Judgements on that Observable which have not yet expired.  The highest priority Judgement becomes the active verdict.  If there is more than one Judgement with that priority, then Clean disposition has priority over all others, then Malicious disposition, and so on down to Unknown.

 The ID of a verdict is a a str of the form "observable.type:observable.value" for example, "ip:1.1.1.1"


## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "verdict"

## MapEntry :disposition ∷ Integer

* This entry is required

* Keyword Key
  * Plumatic Schema: :disposition

* Integer Value
  * Numeric verdict identifiers
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * 1
    * 2
    * 3
    * 4
    * 5

## MapEntry :observable ∷ *Observable* Map

* This entry is required

* Keyword Key
  * Plumatic Schema: :observable

<a name="map1-ref"/>
* *Observable* Map Value
  * Details: [*Observable* Map](#map1)

## MapEntry :judgement_id ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :judgement_id

* String Value
  * A URI leading to a judgement
  * Plumatic Schema: Str

## MapEntry :disposition_name ∷ String

The disposition_name field is optional, but is intended to be shown to a user.  Applications must therefore remember the mapping of numbers to human words, as in: {1 "Clean", 2 "Malicious", 3 "Suspicious", 4 "Common", 5 "Unknown"}

* This entry is optional

* Keyword Key
  * Plumatic Schema: :disposition_name

* String Value
  * String verdict identifiers
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * Clean
    * Common
    * Malicious
    * Suspicious
    * Unknown

<a name="map1"/>
# *Observable* Map

[return](#map1-ref)

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.


## MapEntry :value ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :value

* String Value
  * Plumatic Schema: Str

## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Observable type names
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * amp-device
    * device
    * domain
    * email
    * imei
    * imsi
    * ip
    * ipv6
    * md5
    * pki-serial
    * sha1
    * sha256
    * url
    * user
