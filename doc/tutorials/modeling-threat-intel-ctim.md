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
	- [ ] indicator
		- [ ] field summary
		- [ ] pattern matching indicators
		- [ ] observable-based watchlists
		- [ ] example indicator
	- [ ] judgement
		- [ ] field summary
		- [ ] verdicts vs judgements
		- [ ] example judgement
	- [ ] sighting
		- [ ] field summary
		- [ ] observables vs observed relations
		- [ ] example sighting
	- [ ] relationship
		- [ ] field summary
		- [ ] polarity
		- [ ] relationship types
		- [ ] getting UUIDs
			- [ ] The old way: Using UUIDs
			- [ ] The new way: Using transient IDs
	- [ ] bundle
		- [ ] field summary
		- [ ] example bundle

----

## Introduction
- Audience
	- CTIA client developers with API access via Cisco Threat Intel
- Objective
	1. How to build a bundle correctly.
		- getting all of the bundle contents correct.
	2. How to POST the bundle to private CTIA.
	3. Testing your bundles locally.
- history
	- STIX
	- CTIA
	- CTIM

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

```
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

```
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
    ;; PKI Certificate serial numbers for revoked
    ;; code signing or server certificates
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

#### 1.3.1: Field Summary

**Required Fields**:
- **type**: This **must** be the string `"indicator"`.
- **valid_time**:
- **producer**:

**Optional Fields**:
- confidence
- severity
- negate
- indicator_type
- tags
- composite_indicator_expression
- likely_impact
- kill_chain_phases
- test_mechanisms


#### 1.3.2: Types of Indicators
Broadly speaking, indicators come in two types:
1. **Pattern or rule based** indicators, such as those you would execute in an expert system (such as Threat Grid), or inside of a rule engine (such as Snort), or even a next generation firewall.
2. **Observable based** feed and watchlist indicators, such as a feed containing known malicious IP addresses, or a feed containing URLs that are used in botnet Command and Control networks, or perhaps a feed containing known malicious SSL certificate hashes.  These tend to contain lists of observables, and are updated periodically.  How much stock you place in these feeds can depend on the age of their contents, the reputation of their source, and their false positive rate.  Unlike the pattern or rule based indicators, observable-based feeds and watchlists often obscure the precise combinations of rules or patterns that led to the inclusion of a given observable in the feed.

#### 1.3.3: Example Indicator

```
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
  "confidence": "Low",
  "severity": "Low",
  "tags": ["example"],
  "tlp": "white",
  "producer": "Cisco Systems",
  "external_ids": [
      "ctim-tutorial-indicator-5206f31d14f7b1965dc97c1ec8febfbe45439e8872ff19782f6ac7c49a0ffc68"
  ],
  "id": "transient:ctim-tutorial-indicator-5206f31d14f7b1965dc97c1ec8febfbe45439e8872ff19782f6ac7c49a0ffc68"
}
```




### 1.4: Judgement Entities
	- example judgement
----

### 1.5: Verdict Entities
### 1.6 Sighting Entities
	- observables vs observed relations
	- example sighting
### 1.7 Relationship Entities
	- polarity
	- relationship types
	- getting UUIDs
		- the old way
		- the best way
	- example relationship
### 1.8 Bundle Entities
	- transient IDs
	- features of the CTIA bundle import API endpoint
	- the final product: our example bundle

## Part 2: POSTing bundles to CTIA
	- does our bundle pass schema?
	- troubleshooting bundle contents
		- POST individual entities
	- 