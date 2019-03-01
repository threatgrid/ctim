# Modeling Threat Intelligence in CTIM

Last updated on Thursday, February 28th, 2019 by [Alexander Saint Croix](https://github.com/saintx)

In this tutorial we are going to discuss methods of modeling cyber threat intelligence using the Cisco Threat Intelligence Model.  We will also introduce best practices for client developers using the Cisco Threat Intelligence API (CTIA).

## Table of Contents

- [ ] Introduction
    - [ ] audience
    - [ ] objective
    - [ ] history
		- [ ] STIX
		- [ ] CTIA
		- [ ] CTIM

- Part One: CTIM Model
	- [x] entity commonalities
		- [x] base entity
			- [x] field summary
			- [x] best practices for XIDs
		- [x] sourceable entities
			- [x] field summary
		- [x] describable entities
			- [x] field summary
	- [x] observables
		- [x] guidance on what merits an observable
		- [x] example observable
	- [x] indicator
		- [x] field summary
		- [x] pattern matching indicators
		- [x] observable-based watchlists
		- [x] example indicator
	- [x] judgement
		- [x] field summary
		- [x] verdicts vs judgements
		- [x] example judgement
	- [x] sighting
		- [x] field summary
		- [x] observables vs observed relations
		- [x] example sighting
	- [x] relationship
		- [x] field summary
		- [x] polarity
		- [x] relationship types
		- [x] example relationship
	- [x] bundle
		- [x] defining bundles
			- [x] The old way: Using UUIDs
			- [x] The new way: Using transient IDs
		- [x] field summary
		- [x] example bundle
		- [x] posting bundles to CTIA

----

## Introduction

This guide is written in the hopes that it will enable developers and threat analysts to more easily model their cyber threat intelligence assets using the [Cisco Threat Intelligence Model (CTIM)](https://github.com/threatgrid/ctim) and [Cisco Threat Intelligence API (CTIA)](https://github.com/threatgrid/ctia).

This tutorial is nowhere near exhaustive.  I do not cover the entire CTIM entity model, but focus on the most common entity types encountered by threat analysts and tool developers.

### Intended Audience

- This tutorial is aimed at CTIA client developers or threat analysts building tools to model their threat intelligence data in CTIM and store it in a CTIA server.  API access via Cisco Threat Response is not required.
- All of the data in this tutorial is presented in JSON format, for ease of use.

### Objectives

By the time you finish this tutorial, you should have learned the following:
    1. How to build common CTIM objects and package them into bundles.
    2. The advantages of using bundles:
		- Using external IDs to avoid unwanted entity duplication
		- Using transient IDs to reduce your volume of HTTP requests
	3. How to POST the resulting bundle to CTIA.

----

## Part 1: CTIM Model

This section contains documentation and best practices for defining cyber threat observables, as well as the most common entity types:

- Sightings
- Judgements
- Indicators
- Relationships
- Bundles


----

### 1.1: Common CTIM Entity Properties

In addition to having a common core set of fields built from a base entity definition, all entities in CTIM are `sourceable`, and `describable`, as defined in our [common schema]()

#### 1.1.1: Base Entity Definition

All CTIM entities are derived from the base entity.

##### Required Fields
- **id**: A globally unique URI identifying this object.
- **type**: A valid CTIM entity type
- **schema_version**: The CTIM schema version for this entity

##### Optional Fields
- **external_ids**: One or more custom, user-defined identifiers for the entity, distinct from its globally unique URI.  External IDs will be covered in great detail later in this tutorial.
- **revision**: A monotonically increasing revision, incremented each time the object is changed.
- **external_references**: Specifies a list of external references which refers to non-CTIM information. This property is used to provide one or more URLs, descriptions, or IDs to records in external systems.
- **timestamp**: The time this object was created at, or last modified.
- **language**: The human language this object is specified in.
- **tlp**: Traffic light protocol string, which declares how, and to whom, this entity can be shared.

##### 1.1.1.1: Best Practices for External IDs

External IDs (XIDs) are extremely valuable tools in your toolkit when encoding threat intelligence data in CTIM.  If you are careful and consistent about how you generate your external IDs, you can reap many benefits including faster searches, and even avoid creating duplicate entities.

- External IDs **should** be constructed in a deterministic fashion,
so that if you know some of the key characteristics of a threat intelligence object, you will be able to reconstruct its external ID.
- External IDs **should** attempt to avoid collision with IDs from other systems, if possible.
- External IDs **should** be unique within a bundle.

To this end, we recommend the following best practices:
1. All External IDs that you define should have a prefix that is likely to be unique to your organization.
2. All External IDs should be derivable from SHA256 digest (or larger), based on a deterministically constructable string.

**Example External ID:**

```json
"ctim-tutorial-indicator-d5ec33111624bbdd017dd95cfa67a771de81a183398236eb2041393b8c26cc6b"
```

**Example External ID Generation:**
In the example I present above, I used the following function to generate the external ID string:

```clojure
(defn ctim-tutorial-xid [entity-type args]
  (format "ctim-tutorial-%s-%s"
          entity-type
          (digest/sha-256 (join "|" (concat ["Cisco Systems"
                                             "CTIM Modeling Tutorial"]
                                            args)))))
```

Then, constructed the External ID like so:

```clojure
(ctim-tutorial-xid "indicator" ["ctim-tutorial" "example-indicator-title" "2019-02-28"])
=> "ctim-tutorial-indicator-d5ec33111624bbdd017dd95cfa67a771de81a183398236eb2041393b8c26cc6b"
```

- Because my External ID string has the prefix `ctim-tutorial-`, and a sha256 digest string, it is highly unlikely that it will accidentally collide with an external ID of any other entity in CTIA.
- Because I added the "indicator-" substring, I can tell at a glance that this external ID is for an indicator.  This can make relationship objects easier to reason about, as we will see later.

#### 1.1.2: Sourceable Entities

All of the entities that we cover in this tutorial have the propery of being **sourceable**.  What this means, essentially, is that we may specify where the intelligence in the entity comes from.  All of the fields for sourceable entities are *optional*, and they include the following:

##### Optional Fields

- **source**: A string representing the name of the source of the intelligence.
- **source_uri**: A URI to the source of the intelligence, if one is available.

##### Notes on Sources

Naturally, if we don't know where intel comes from, we are less likely to trust it.  Even though it is an optional field in the schema, all client developers should mark their intel with `source` and `source_uri` fields, whenever it is appropriate.

The `source` and `source_uri` fields do not describe the source of the *CTIM entity*, but the source of the *cyber threat intelligence* captured within that entity.  So, for example, if someone in the Cisco Threat Response team is packaging up data from the National Vulnerability Database, we would list the `source` as the "National Vulnerability Database", and the `source_uri` as "https://nvd.nist.gov".

The `source` field can be a very useful field when searching through your stored intelligence, and can dramatically speed up CTIA queries for your data later on.  It is a very useful and important field, and all client developers are *strongly* encouraged to use it consistently.

#### 1.1.3: Describable Entities
All of the entities that we cover in this tutorial have the propery of being **describable**.  What this means, essentially, is that we can provide additional descriptive text for them.  All describable entity fields are optional, and they include the following:

##### Optional Fields
- **title**:  A string with at most 1024 characters
- **short_description**: A string with at most 2048 characters
- **description**: Markdown string not exceeding 5000 characters

----

### 1.2: Observables
In CTIM, an **Observable** is a recognizable token which we can use as the basis of our investigation.  Observables include things like domain names, IP addresses, file hashes, URLs and other values of similar nature.

Observables are not top level entities in CTIM.  They are **inline entities**, included as part of both **Sighting** and **Judgement** entities, which we will learn about later.

Observables are required to have both a `type` field and a `value` field.

#### Example Observable

```json
{"type": "domain",
 "value": "google.com"}
 ```
 
#### Valid Observable Types

The definitive set of observable types that are supported in CTIM is available at [https://github.com/threatgrid/ctim/blob/master/src/ctim/schemas/vocabularies.cljc](https://github.com/threatgrid/ctim/blob/master/src/ctim/schemas/vocabularies.cljc)

They are enumerated here for convenience:

```
    "ip"
    "ipv6"
    "device"
    "user"
    "domain"
    "sha256"
    "md5"
    "sha1"
    "url"
    "pki_serial"
    "email"
    "imei"
    "imsi"
    "amp_computer_guid"
    "hostname"
    "mac_address"
    "file_name"
    "file_path"
    "odns_identity"
    "odns_identity_label"
    "email_messageid"
    "email_subject"
    "cisco_mid"
    "mutex"
```

#### What Merits an Observable?

Not all information that can be observed in a system is necessarily a good candidate for an observable record.  Ideally, observables are only created when they have direct bearing on a cyber threat incident.  Tokens that we can observe but which we have no reason to believe are relevant to new or ongoing cyber threats do not, therefore, need to be captured as observables in CTIM.

> **Example:** We can observe that a user's keyboard is beige, but we don't record an observable about that fact, because keyboard color is not relevant to any known threat.  However, if we notice that their system is trying to contact a known malware command and control domain, we **would** definitely record that fact.  This seems like a trivial and obvious distinction to point out, but we will use it later to help guide our thinking when we create `Sighting` and `Judgement` entities.

----

### 1.3: Indicator Entities
		- [ ] field summary
		- [ ] pattern matching indicators
		- [ ] observable-based watchlists
		- [ ] example indicator

An **Indicator** is a test, or a collection of criteria for identifying the activity, or presence of a cyber threat.  Those threats could be malware, patterns of activity that might precede an attack or indicate an attack in progress, or the presence of tools and other infrastructure for the same.  

#### 1.3.1: Indicator Field Summary

##### Required Fields
- **type**: This **must** be the string `"indicator"`.
- **valid_time**: Must include a **:start_time** datetime string, and may include an optional **end_time**, which must not be later than `"2525-01-01:00:00:00.000Z"`.  See below for examples.
- **producer**: The name of the party or organization that produced the indicator entity, distinct from the `source` of the threat intelligence.

##### Optional Fields
These are the most important of the many optional fields.  A full list of optional fields can be found in the [Indicator Schema](https://github.com/threatgrid/ctim/blob/master/src/ctim/schemas/indicator.cljc).
- **confidence**: Must be one of `["Info", "Low", "Medium", "High", "None", "Unknown"]`.
- **severity**: Must be one of `["Info", "Low", "Medium", "High", "None", "Unknown"]`.


#### 1.3.2: Types of Indicators

Broadly speaking, indicators come in two types:

1. **Pattern or rule based** indicators, such as those you would execute in an expert system (such as Threat Grid), or inside of a rule engine (such as Snort), or even a next generation firewall.
2. **Observable based feed and watchlist** indicators, such as a feed containing known malicious IP addresses, or a feed containing URLs that are used in botnet Command and Control networks, or perhaps a feed containing known malicious SSL certificate hashes.  These tend to contain lists of observables, and are updated periodically.  How much stock you place in these feeds can depend on the age of their contents, the reputation of their source, and their false positive rate.  Unlike the pattern or rule based indicators, observable-based feeds and watchlists often obscure the precise combinations of rules or patterns that led to the inclusion of a given observable in the feed.

#### 1.3.3: Example Indicator

```json
{
  "type": "indicator",
  "source": "Modeling Threat Intelligence in CTIM Tutorial",
  "source_uri": "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-threat-intel-ctim.md",
  "title": "Example Indicator Title",
  "short_description": "Example indicator entity, provided for purposes of illustrating the correct construction of indicators in a CTIM tutorial."
  "valid_time": {
      "start_time": "2019-02-28T00:00:00.000Z",
      "end_time": "2525-01-01T00:00:00.000Z"
  },
  "confidence": "None",
  "severity": "None",
  "tags": ["example"],
  "tlp": "white",
  "producer": "Cisco Systems",
  "external_ids": [
      "ctim-tutorial-indicator-5206f31d14f7b1965dc97c1ec8febfbe45439e8872ff19782f6ac7c49a0ffc68"
  ],
  "id": "transient:ctim-tutorial-indicator-5206f31d14f7b1965dc97c1ec8febfbe45439e8872ff19782f6ac7c49a0ffc68"
}
```

----

### 1.4: Judgement Entities

A judgement about the intent or nature of an observable.  For example, is it malicious, meaning is is malware and subverts system operations?  It could also be clean and be from a known benign, or trusted source.  It could also be common, something so widespread that it's not likely to be malicious.

Since a core goal of the CTIA is to provide a simple verdict service, these judgements are the basis for the returned verdicts.  These are also the primary means by which users of the CTIA go from observables on their system, to the indicators and threat intelligence data in CTIA.

#### 1.4.1: Judgement Field Summary

Judgement entities are distinct from many others in that they are **required** to have `source` and `source_uri` fields, and they do not extend `describable`, so don't have titles, long descriptions, or short descriptions.

Judgements allow us to apply a *disposition* to an observable, and to provide a little bit of metadata about how certain we are in that assessment.   Valid disposition numbers and names are defined in the CTIM schema:

##### Disposition Numbers and Names
```
  {1 "Clean"
   2 "Malicious"
   3 "Suspicious"
   4 "Common"
   5 "Unknown"}
```

##### Required Fields

- **observable**: Each judgement **must** have one observable.
- **disposition**: A disposition number, drawn from the mapping above.
- **disposition_name**: A disposition name, drawn from the mapping above.
- **priority**: An integer value 0-100 that determines the priority of a judgement.  Curated feeds of black/white lists, for example known good products within your organizations, should use a 95. All automated systems should use a priority of 90, or less.  **Human judgements should have a priority of 100**, so that humans can always override machines.
- **confidence**:  Must be one of `["Info", "Low", "Medium", "High", "None", "Unknown"]`
- **severity**: Must be one of `["Info", "Low", "Medium", "High", "None", "Unknown"]`
- **valid_time**: Must include a **:start_time** datetime string, and may include an optional **end_time**, which must not be later than `"2525-01-01:00:00:00.000Z"`.  Judgement valid times should be appropriate for the volatility of the observable.  For example, domains and IP addresses can change hands very quickly and cease being malicious, so a `valid_time` of 30 days is probably warranted for them.  However, sha256 hashes for a malicious executable are going to be malicious essentially forever, so we would set the `end_time` to `"2525-01-01:00:00:00.000Z"`.

##### Optional Fields
- **reason**: A short string explaining the reason for issuing the judgement, or to provide additional context.
- **reason_uri**: URI to the referenced reason.

#### 1.4.2 Verdicts vs. Judgements

One of the services that CTIA provides is the ability to compare multiple judgements for a given observable and very quickly render a verdict based on them.

The rules for exactly how this is performed are a bit complex, but here are some basics to know:
1. Invalid Judgements are not considered.
2. More recent Judgements matter more.
3. The priority order for dispositions is `Clean > Malicious > Suspicious > Unknown`, so a false positive can always be overruled by explicitly creating a judgement with a `Clean` disposition.

A Verdict indicates the *most recent* and *most relevant* disposition for a given cyber observable, as well as the Judgement from which the verdict was derived.

#### 1.4.3 Example Judgement

```json
{
  "type" : "judgement",
  "source": "Modeling Threat Intelligence in CTIM Tutorial",
  "source_uri": "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-threat-intel-ctim.md",
  "valid_time" : {
    "start_time" : "2019-03-01T19:22:45.531Z",
    "end_time" : "2019-03-31T19:22:45.531Z"
  },
  "observable" : {
    "type" : "ip",
    "value" : "187.75.16.75"
  },
  "external_ids" : [ "ctim-tutorial-judgement-4340e8cc49ff428e21ad1467de4b40246eb0e3b8da96caa2f71f9fe54123d498" ],
  "disposition" : 2,
  "disposition_name" : "Malicious",
  "priority" : 95,
  "id" : "transient:ctim-tutorial-judgement-4340e8cc49ff428e21ad1467de4b40246eb0e3b8da96caa2f71f9fe54123d498",
  "severity" : "High",
  "tlp" : "green",
  "timestamp" : "2019-03-01T19:22:45.531Z",
  "confidence" : "High"
}
```
----

### 1.5: Sighting Entities

A **Sighting** is a record of the appearance of a cyber observable at a given date and time.

Sightings can optionally be related to Indicators, providing threat intelligence context about the observable.

#### 1.5.1: Sighting Field Summary

##### 1.5.1.1: Required Sighting Fields

- **observed_time**:
- **confidence**: Must be one of `["Info", "Low", "Medium", "High", "None", "Unknown"]`
- **count**: The number of times the observable was seen

##### 1.5.1.2: Optional Sighting Fields

- **observables**: The object(s) of interest, structured as an observable, defined above.
- **relations**: The are relations within a sighting which help provide any context we can about where the observable(s) came from.  See below for more information.
- **internal**: A boolean value describing if this sighting is internal to our network.
- **severity**: Must be one of `["Info", "Low", "Medium", "High", "None", "Unknown"]`
- **resolution**: Must be one of `["detected" "blocked" "allowed" "contained"]`
- **sensor**: The OpenC2 Actuator name that best fits the device that is creating this sighting (e.g. network-firewall, sensor, endpoint, network-device, human).  Valid sensor types are enumerated in the [CTIM vocabularies schema](https://github.com/threatgrid/ctim/blob/74857ac6ffed206b3dcf01f171feb30e08277191/src/ctim/schemas/vocabularies.cljc#L334).
- **targets**: An enumeration of target devices where the sighting came from. See below for more information.

#### 1.5.2: Targets

**Target** entries are structured as follows:

##### 1.5.2.1: Required Target Fields

- **type**: Must be a sensor type, as defined above.
- **observables**: Must be a vector of observables, as defined above.
- **observed_time**: The time at which the observable was seen.

##### 1.5.2.2: Optional Target Fields

- **os**: Operating system name
- **properties_data_tables**: A URI leading to a data table.

##### 1.5.2.3: Example Target

```json
{"type": "network.firewall",
 "observables": [{"type": "ip", "value": "187.75.16.75"}],
 "observed_time": {"start_time" : "2019-03-01T20:01:27.368Z"}}
```

#### 1.5.3: Observables vs Observed Relations

Earlier we discussed that not everything we are *able* to observe merits being turned into an observable.  For sightings, this is made even more explicit by the inclusion of the `relations` field, which allows us to provide additional context about the observable that is the object of the sighting.

For example, imagine if we have a known malicious domain `baddomain.com`.  At the time that we saw the domain being contact (triggering the creation of a Sighting), we might know that the domain resolved to the IPv4 address `8.8.8.8`.  We know from months of tracking this malicious domain that it is bad news.  However, we would **not** create a 2nd Judgement on the associated IPv4 address.  This is because the IP isn't the actual observable that triggered our malicious judgement.  It's useful context, but it isn't actually a malicious IP address.  (It's actually the IP address of Google's DNS servers).

Instead, the fact that this domain resolved to this IP address at the time of the sighting should be captured in the `relations` key of the Sighting.

##### 1.5.3.1: Observed Relation Fields
- **origin**: Where is the origin of this relation info?
- **origin_uri**: Optional URI of origin data.
- **source**: The main observable of the sighting. 
- **related**: The related observable that is defined by the *relation*, below.
- **relation**: The nature of the relationship between the observables. The relations that can exist between observables is an "open vocabulary", so you can add your own.  However, we have a very thorough collection of predefined [observable relations in the CTIM Schema](https://github.com/threatgrid/ctim/blob/74857ac6ffed206b3dcf01f171feb30e08277191/src/ctim/schemas/common.cljc#L408). 

##### 1.5.3.2: Example Observed Relation
```json
{
  "origin": "Modeling Threat Intelligence in CTIM Tutorial",
  "origin_uri": "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-threat-intel-ctim.md",
  "source" {"type":"domain", "value": "baddomain.com"},
  "target" {"type":"ip", "value": "8.8.88"}
  "relation": "Resolved_To"
}
```

#### 1.5.4: Example Sighting

```json
{
  "type" : "sighting",
  "source": "Modeling Threat Intelligence in CTIM Tutorial",
  "source_uri": "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-threat-intel-ctim.md",
  "observables" : [ {
    "type" : "ip",
    "value" : "187.75.16.75"
  } ],
  "external_ids" : [ "ctim-tutorial-sighting-7b36e0fa2169a3ca330c7790f63c97fd3c9f482f88ee1b350511d8a51fcecc8d" ],
  "id" : "transient:ctim-tutorial-sighting-7b36e0fa2169a3ca330c7790f63c97fd3c9f482f88ee1b350511d8a51fcecc8d",
  "count" : 1,
  "severity" : "High",
  "tlp" : "green",
  "timestamp" : "2019-03-01T20:01:27.368Z",
  "confidence" : "High",
  "observed_time" : {
    "start_time" : "2019-03-01T20:01:27.368Z"
  }
}
```

----

### 1.6: Relationship Entities


### 1.6.1: Relationship Field Summary

In addition to being derived from the base, sourceable, and describable entity definitions defined above, relationships require the following fields:

#### 1.6.1.1: Required Relationship Fields
- **relationship_type**: A string describing the relationship type.  Standard supported relationship types are defined in the [CTIM Vocabulary Schema](https://github.com/threatgrid/ctim/blob/74857ac6ffed206b3dcf01f171feb30e08277191/src/ctim/schemas/vocabularies.cljc#L390), and the best practices for how to define entity relationships is documented in our [Common Relation Types](https://github.com/threatgrid/ctim/blob/master/doc/defined_relationships.md) document.
- **source_ref**: Required.  ID of the *source entity* of the relationship.  On a directed graph, this is the node the arrow begins at.
- **target_ref**:  Required ID of the *target entity* of the relationship.  On a directed graph, this is the node the arrow points to.

### 1.6.2: Notes on Relationship Polarity

The *polarity* of relationships describes the direction that the arrow points on a directed graph: Relationships always point FROM the `source_ref`, and TOWARD the `target_ref` in the relationship.

Therefore, there are some `relation_type` fields which are expected to be used in certain scenarios.  In our [Common Relation Types](https://github.com/threatgrid/ctim/blob/master/doc/defined_relationships.md) document, we define, for example, that a judgement would be "based on" an indicator, but not vice versa.  Relationships from Indicators do not point toward Judgements.  So, to represent this relationship, we'd have the Judgement entity identified as the `source_ref`, and the indicator entity identified as the `target_ref`.  These fields are not interchangeable, and the polarity of the relationship does matter.  Please read through the documentation on common relation types for more information.

### 1.6.5: Example Relationship

```json
{
  "type" : "relationship",
  "source": "Modeling Threat Intelligence in CTIM Tutorial",
  "source_uri": "",
  "source_ref" : "transient:ctim-tutorial-judgement-4340e8cc49ff428e21ad1467de4b40246eb0e3b8da96caa2f71f9fe54123d498",
  "target_ref" : "transient:ctim-tutorial-indicator-c56de1c94c1ce862c4e6d9883393aacc58275c0c4dc4d8b48cc4db692bf11e4f",
  "relationship_type" : "based-on",
  "external_ids" : [ "ctim-tutorial-relationship-2c1f3fcaf89d294bf7d038f470f6cb4a81dc1fad6ff5deeed18a41bf6fe14e4d" ]
}
```

**Note**: At this point you may be wondering what all of these `"transient:..."` ids are all about.  We'll dig into those details in the next section.

----

### 1.7: Bundle Entities

In order to really understand bundles, we need to take a step back and take another look at Relationships.

### 1.7.1: Getting UUIDs for Relationships

Up until this point we have intentionally glossed over an important detail in the creation of relationships: how do we create them if we don't have the URLs for the entities we want to relate?

If a Relationship entity requires 2 IDs, and if IDs in CTIA are always URIs, then we need the URI for the `source_ref`, and the URI for the `target_ref` before we can specify a Relationship.  As you might imagine, this can become burdensome.

#### 1.7.1.1: Defining Relationships Without Bundles

This is how we used to assemble relationships, before bundles:

1. Search for (with a `GET` request) or create and `POST` the source entity in order to get its URI for the `source_ref` (1-2 HTTP requests)
2. Search for (with a `GET` request) or create and `POST` the target entity in order to get its URI for the `target_ref` (1-2 HTTP requests)
3. Once you have both of the required URIs, create and `POST` a Relationship entity (1 HTTP request).

It used to require 3-5 HTTP requests for every relationship.  If you *knew* that both the source and target entities were brand new, you could get the job done with only 3 `POST` requests.  However, even with persistent sessions, this was never going to scale to our needs.

And so, we added the **bundle import API mechanism** to CTIA.  The purpose of the bundle import mechanism is twofold:

1. First, we needed a mechanism that would allow us to define entities AND how they relate in a single bundle, and POST all of the contents of that bundle in the same HTTP request, and let CTIA automatically handle the complications around wiring all of the relationships to point at the correct URIs for the posted entities.
2. Second, we needed a way to prevent the accidental creation of duplicate entities.  Particularly in the case of indicators, we did not want there to be duplicate entities that differ **only** in their `id` field, but are identical in every other way.

#### 1.7.1.2: Defining Relationships Using Bundles
  - [ ] The new way: Using transient IDs

	- transient IDs
	- features of the CTIA bundle import API endpoint

#### 1.7.2: Bundle Field Summary

In addition to the required `"type":"bundle"` field and the **strongly** recommended `source` and `source_uri` fields, bundles can contain lists of various CTIM entity types.  Most of them are outside the scope of this tutorial, but they are all defined in great depth in the [CTIM Bundle schema](https://github.com/threatgrid/ctim/blob/74857ac6ffed206b3dcf01f171feb30e08277191/src/ctim/schemas/bundle.cljc#L1).

##### 1.7.2.1 Optional Bundle Fields
- **actors**: A list of CTIM actor entities.
- **attack_patterns**: A list of CTIM attack pattern entities.
- **campaigns**: A list of CTIM campaign entities.
- **coas**: A list of CTIM coa entities.
- **feedbacks**: A list of CTIM feedback entities.
- **incidents**: A list of CTIM incident entities.
- **indicators**: A list of CTIM indicator entities.
- **judgements**: A list of CTIM judgement entities.
- **malwares**: A list of CTIM malware entities.
- **relationships**: A list of CTIM relationship entities.
- **sightings**: A list of CTIM sighting entities.
- **tools**: A list of CTIM tool entities.
- **verdicts**: A list of CTIM verdict entities.
- **data_tables**: A list of CTIM data_table entities.
- **weaknesses**: A list of CTIM weakness entities.
- **vulnerabilities**: A list of CTIM vulnerability entities.

#### 1.7.3: Example Bundle

At long last, we have our example bundle:

```json
{
  "type" : "bundle",
  "source" : "Modeling Threat Intelligence in CTIM Tutorial",
  "source_uri" : "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-threat-intel-ctim.md",
  "sightings" : [ {
    "observables" : [ {
      "type" : "ip",
      "value" : "187.75.16.75"
    } ],
    "type" : "sighting",
    "source" : "Modeling Threat Intelligence in CTIM Tutorial",
    "external_ids" : [ "ctim-tutorial-7b36e0fa2169a3ca330c7790f63c97fd3c9f482f88ee1b350511d8a51fcecc8d" ],
    "source_uri" : "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-threat-intel-ctim.md",
    "id" : "transient:ctim-tutorial-7b36e0fa2169a3ca330c7790f63c97fd3c9f482f88ee1b350511d8a51fcecc8d",
    "count" : 1,
    "severity" : "High",
    "tlp" : "green",
    "timestamp" : "2019-03-01T22:26:29.229Z",
    "confidence" : "High",
    "observed_time" : {
      "start_time" : "2019-03-01T22:26:29.229Z"
    }
  } ],
  "judgements" : [ {
    "valid_time" : {
      "start_time" : "2019-03-01T22:26:29.229Z",
      "end_time" : "2019-03-31T22:26:29.229Z"
    },
    "observable" : {
      "type" : "ip",
      "value" : "187.75.16.75"
    },
    "type" : "judgement",
    "source" : "Modeling Threat Intelligence in CTIM Tutorial",
    "external_ids" : [ "ctim-tutorial-4340e8cc49ff428e21ad1467de4b40246eb0e3b8da96caa2f71f9fe54123d498" ],
    "disposition" : 2,
    "source_uri" : "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-threat-intel-ctim.md",
    "disposition_name" : "Malicious",
    "priority" : 95,
    "id" : "transient:ctim-tutorial-4340e8cc49ff428e21ad1467de4b40246eb0e3b8da96caa2f71f9fe54123d498",
    "severity" : "High",
    "tlp" : "green",
    "timestamp" : "2019-03-01T22:26:29.229Z",
    "confidence" : "High"
  } ],
  "indicators" : [ {
    "description" : "The IP Blacklist is automatically updated every 15 minutes and contains a list of known malicious network threats that are flagged on all Cisco Security Products. This list is estimated to be 1% of the total Talos IP Reputation System.",
    "valid_time" : {
      "start_time" : "2019-03-01T22:26:29.229Z",
      "end_time" : "2525-01-01T00:00:00.000Z"
    },
    "producer" : "Cisco TALOS",
    "type" : "indicator",
    "source" : "Modeling Threat Intelligence in CTIM Tutorial",
    "external_ids" : [ "ctim-tutorial-c56de1c94c1ce862c4e6d9883393aacc58275c0c4dc4d8b48cc4db692bf11e4f" ],
    "short_description" : "The TALOS IP Blacklist lists all known malicious IPs in the TALOS IP Reputation System.",
    "title" : "TALOS IP Blacklist Feed",
    "source_uri" : "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-threat-intel-ctim.md",
    "id" : "transient:ctim-tutorial-c56de1c94c1ce862c4e6d9883393aacc58275c0c4dc4d8b48cc4db692bf11e4f",
    "tlp" : "green"
  } ],
  "relationships" : [ {
    "type" : "relationship",
    "source" : "Modeling Threat Intelligence in CTIM Tutorial",
    "source_uri" : "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-threat-intel-ctim.md",
    "source_ref" : "transient:ctim-tutorial-4340e8cc49ff428e21ad1467de4b40246eb0e3b8da96caa2f71f9fe54123d498",
    "target_ref" : "transient:ctim-tutorial-c56de1c94c1ce862c4e6d9883393aacc58275c0c4dc4d8b48cc4db692bf11e4f",
    "relationship_type" : "based-on",
    "external_ids" : [ "ctim-tutorial-2c1f3fcaf89d294bf7d038f470f6cb4a81dc1fad6ff5deeed18a41bf6fe14e4d" ],
    "short_description" : "judgement ctim-tutorial-4340e8cc49ff428e21ad1467de4b40246eb0e3b8da96caa2f71f9fe54123d498 is based-on indicator ctim-tutorial-c56de1c94c1ce862c4e6d9883393aacc58275c0c4dc4d8b48cc4db692bf11e4f"
  }, {
    "type" : "relationship",
    "source" : "Modeling Threat Intelligence in CTIM Tutorial",
    "source_uri" : "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-threat-intel-ctim.md",
    "source_ref" : "transient:ctim-tutorial-7b36e0fa2169a3ca330c7790f63c97fd3c9f482f88ee1b350511d8a51fcecc8d",
    "target_ref" : "transient:ctim-tutorial-c56de1c94c1ce862c4e6d9883393aacc58275c0c4dc4d8b48cc4db692bf11e4f",
    "relationship_type" : "sighting-of",
    "external_ids" : [ "ctim-tutorial-0664295d5da504180b4f232a0d5e95908fcbd6eb052b6e97f294ddfb6a7b11b8" ],
    "short_description" : "sighting ctim-tutorial-7b36e0fa2169a3ca330c7790f63c97fd3c9f482f88ee1b350511d8a51fcecc8d is sighting-of indicator ctim-tutorial-c56de1c94c1ce862c4e6d9883393aacc58275c0c4dc4d8b48cc4db692bf11e4f"
  } ]
}
```

#### 1.7.4: POSTing Bundles to CTIA

As described above, we supply the **external ID prefix** to CTIA via the `external-key-prefixes` query parameter.  So, in order to `POST` our bundle to CTIA, you'd run the following command:

```
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' --header 'Authorization: <your auth>' -d '{"type":"bundle", \ 
  "source": "Modeling Threat Intelligence in CTIM Tutorial", \
  ... }' 'https://localhost:3000/ctia/bundle/import?external-key-prefixes=ctim-tutorial-'
```

When the bundle is posted, CTIA will perform the following:
1. Search for existing entities that already have the External IDs starting with the `ctim-tutorial-` prefix.
2. If existing entities with matching `external_ids` to the ones supplied in the bundle are found in storage, then all relationship references to that entity in the bundle will be replaced with references to the URI for the existing entity in storage.  Duplicate entities with the same `"ctim-tutorial-"` external IDs will *not* be created.
3. For each entity in the bundle, if no existing entity matching the supplied  `"ctim-tutorial-"` external IDs is found in storage, CTIA will create a new entity *and* replace the transient ID reference in any relationships with the URI for the newly created entity.
4. Once all of the references are thus resolved, CTIA will `POST` the relationship entities to storage using its `bulk` route.

----