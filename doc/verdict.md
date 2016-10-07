<a name="top"/>
# *Verdict* Map

A Verdict is chosen from all of the Judgements on that Observable which have not yet expired.  The highest priority Judgement becomes the active verdict.  If there is more than one Judgement with that priority, then Clean disposition has priority over all others, then Malicious disposition, and so on down to Unknown.

 The ID of a verdict is a a str of the form "observable.type:observable.value" for example, "ip:1.1.1.1"


## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "verdict")
* Must equal: "verdict"

## MapEntry: :disposition -> Integer

* This entry is required

### Keyword Key

* Plumatic Schema: :disposition

### Integer Value

Numeric verdict identifiers

* Plumatic Schema: (enum 1 4 3 2 5)
* Allowed Values: (1 2 3 4 5)

## MapEntry: :observable -> Map

* This entry is required

### Keyword Key

* Plumatic Schema: :observable

<a name="map1-ref"/>
### Map Value

[Map](#map1)

## MapEntry: :judgement_id -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :judgement_id

### String Value

A URI leading to a judgement

* Plumatic Schema: Str

## MapEntry: :disposition_name -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :disposition_name

### String Value

String verdict identifiers

* Plumatic Schema: (enum "Common" "Unknown" "Suspicious" "Malicious" "Clean")
* Allowed Values: ("Clean" "Common" "Malicious" "Suspicious" "Unknown")

<a name="map1"/>
# Map

[return](#map1-ref)

A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.


## MapEntry: :value -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :value

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

Observable type names

* Plumatic Schema: (enum "device" "url" "pki-serial" "user" "ipv6" "email" "sha256" "sha1" "md5" "ip" "domain" "imei" "imsi" "amp-device")
* Allowed Values: ("amp-device" "device" "domain" "email" "imei" "imsi" "ip" "ipv6" "md5" "pki-serial" "sha1" "sha256" "url" "user")
