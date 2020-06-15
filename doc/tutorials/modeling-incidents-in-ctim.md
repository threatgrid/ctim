# Modeling Incidents in CTIM

This supplement to our [Modeling Threat Intelligence in CTIM](https://github.com/threatgrid/ctim/blob/master/doc/tutorials/modeling-threat-intel-ctim.md) tutorial explains how to write CTIM Incident entities, and how to add them to your CTIM bundles.

## Table of Contents

[Introduction](#introduction)
- [Intended Audience](#intended-audience)
- [Objectives](#objectives)

[Part 1: CTIM Model, Continued](#part-1-ctim-model-continued)
- [1.8: Incident Entities](#18-bundle-entities)
  - [1.8.1: Incident Field Summary](#181-incident-field-summary)
  - [1.8.2: Example Incident](#182-example-incident)
  - [1.8.3: Relating Entities to Incidents](#183-relating-entities-to-incidents)
  - [1.8.4: Adding Incidents to CTIM Bundles](#184-adding-incidents-to-ctim-bundles)
  - [1.8.5: POSTing Incidents to CTIA](#185-posting-incidents-to-ctia)

## Introduction

This tutorial is a supplement to its parent, ["Modeling Threat Intelligence in CTIM"](https://github.com/threatgrid/ctim/blob/master/doc/tutorials/modeling-threat-intel-ctim.md), which focuses on the most fundamental and common entities in the Cisco Threat Intelligence Model:
  - **Sightings**, which model time-specific alerts and signals of threat, possibly related to observable properties
  - **Judgements**, which model reputation data around an observable
  - **Indicators**, which represent either patterns in a rule engine, or observable-based feeds, and indicate some manner of threat
  - **Relationships**, which represent directed edges in a graph model that connect all of the other entities in CTIM.

The purpose of this tutorial is to shed some light on the **CTIM Indicator** model, and to demonstrate how to create indicators, and how to use relationships to include them into CTIM bundles.

### Intended Audience
- This tutorial is aimed at CTIA client developers or threat analysts building tools to model cyber threat incident reports in CTIM, and store it in a CTIA server.
- API access via [Cisco Threat Response](https://visibility.amp.cisco.com) is not required. Developers and students without access to Cisco Threat Response can still store intel in a [local or on-premise deployment of CTIA](https://github.com/threatgrid/ctia/tree/master/containers/client-dev), if they wish.
- All of the data in this tutorial is presented in JSON format, for simplicity.

### Objectives

By the time you finish this tutorial, you should have learned the following:

1. How to build `incident` entities in CTIM
2. How to include `incident` entities in a CTIM `bundle`, with relationships to other entity types.
3. How to POST the resulting bundle to CTIA.

## Part 1: CTIM Model

This section contains documentation and best practices for defining cyber threat intelligence relating to Incident entities in CTIM.

### 1.8: Incident Entities

Broadly speaking, and independent of the Cisco Threat Intelligence Model, an "Incident" is one or more events that are detectable on a computer network, which *might* lead to the loss of, or disruption to, an organization's operations, services, or functions.

A *CTIM Incident* entity is a discrete record of the details surrounding such events that might affect an organization, as well as any information associated with that organization's response to the incident.

The CTIM incident model is intended to help organizations track data that pertain to the *incident itself*.  These include (but are not limited to) factors such as:
- The current status of the incident
- Important times in the incident's lifecycle, such as when it was first discovered or reported, opened, closed, remediated, or rejected.
- How the incident was discovered
- Personnel who are assigned to the incident

The details of the various threats and network events that pertain to the incident, as well as the details of potential mitigation or remediation steps are captured in other parts of the CTIM data model, and associated to the incident via `relationship` entities.

#### 1.8.1: Incident Field Summary

In addition to the [Common CTIM Entity Properties](https://github.com/threatgrid/ctim/blob/master/doc/tutorials/modeling-threat-intel-ctim.md#part-1-ctim-model#11-common-ctim-entity-properties) described in the parent tutorial, CTIM `incident` entities contain the following fields:

##### 1.8.1.1: Required Incident Fields
- **type**: This, **must** be the string `"incident"`.
- **confidence**: Must be one of `["Info", "Low", "Medium", "High", "None", "Unknown"]`.
- **status**: Must be one of `["New", "Open", "Stalled", "Containment Achieved", "Restoration Achieved", "Incident Reported", "Closed", "Rejected"]`
- **incident_time**: Must be an `IncidentTime` inline data type, which have the following fields:

###### 1.8.1.1.1: `IncidentTime` inline data type
`IncidentTime` are inline data types similar to observables in that they are not top level entities, but are structured entities that exist inline within a top level entity.

**Required `IncidentTime` fields**
- **opened**: The time this incident was opened.

**Optional `IncidentTime` fields**
- **discovered**: The time this incident was first discovered, if knowledge of the incident originated from within the organization.
- **reported**: The time this incident was first reported to the organization, if knowledge of the incident came from a source or service outside of the organization.
- **remediated**: The time this incident was remediated.
- **closed**: The time this incident was closed.
- **rejected**: The time this incident was rejected.

##### 1.8.1.2: Optional Incident Fields
- **categories**: One or more categories for this incident. If included, must be a vector containing one or more of the string values defined in the [CTIM `incident-category` vocabulary](https://github.com/threatgrid/ctim/blob/487a5165276fe94957341a9516603dfe5c3ab2a5/src/ctim/schemas/vocabularies.cljc#L86).  This is an open vocabulary, so you can define your own values, but we strongly encourage you to suggest additional vocabulary entries if there is not a suitable one already defined.
- **discovery_method**: Specifies how the incident came to the attention of the organization. If included, must be one of the string values defined in the [CTIM `discovery-method` vocabulary](https://github.com/threatgrid/ctim/blob/487a5165276fe94957341a9516603dfe5c3ab2a5/src/ctim/schemas/vocabularies.cljc#L49).  This is an open vocabulary, so you can define your own values, but we strongly encourage you to suggest additional vocabulary entries if there is not a suitable one already defined.
- **intended_effect**: Specifies the suspected intent of the incident. If included, must be one of the string values defined in the [CTIM `intended-effect` vocabulary](https://github.com/threatgrid/ctim/blob/487a5165276fe94957341a9516603dfe5c3ab2a5/src/ctim/schemas/vocabularies.cljc#L121).  This is an open vocabulary, so you can define your own values, but we strongly encourage you to suggest additional vocabulary entries if there is not a suitable one already defined.
- **assignees**: If included, a vector containing short strings which refer to members of the organization that are assigned to the incident.

Incident categories, discovery method, and intended effects are an open vocabulary, so you can add custom categories, but we *strongly* encourage you to use the existing categories, or to contact us with suggested additions before you define your own.

#### 1.8.2: Example Incident
```json
{"type": "incident",
  "source": "Modeling Incidents in CTIM Tutorial",
  "source_uri": "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-incidents-in-ctim.md",
  "title": "2020-06-15-0334-emotet-botnet-report",
  "short_description": "Incident Report: 2020-06-15 3:34am (Emotet Botnet Attack)",
  "description": "## Summary:\n\nOn Monday, June 15th at 3:34am GMT, a host (UUID #dc0415fe-af42-11ea-b3de-0242ac130004) on VLAN 414 established contact with a known Emotet Epoch 2 Command and Control server, triggering an event alarm. Incident responders isolated the host for further analysis.\n\n## Additional Details:\n\nSMTP traffic log analysis underway to determine the method of initial infection. Phishing attack suspected. No evidence of lateral movement across VLAN 414.",
  "external_ids": ["ctim-tutorial-incident-c56de1c94c1ce862c4e6d9883393aacc58275c0c4dc4d8b48cc4db692bf11e4f"],
  "id": "transient:ctim-tutorial-incident-c56de1c94c1ce862c4e6d9883393aacc58275c0c4dc4d8b48cc4db692bf11e4f",
  "confidence": "High",
  "status": "Containment Achieved",
  "incident_time":
  {"opened": "2020-06-15T03:43:27.368Z",
   "reported": "2020-06-15T03:34:36.298Z"},
   "assignee": ["saintx"],
   "categories": ["Malicious Code"],
   "discovery_method": "NIDS"
}
```

#### 1.8.3: Relating other CTIM Entities to Incidents

Incident entities record information about the incident itself, independent of the threat intelligence that pertains to the incident. Thus, `incident` entities do not directly reference indicators, sightings, judgements, or targets.  This is because CTIM is a normalized data model, and the connections between entities are captured by `relationship` entities.

CTIM has defined several [Recommended Relationship Types](https://github.com/threatgrid/ctim/blob/master/doc/defined_relationships.md) in their documentation, which define the current best practices for defining relationship types between entities that are to be stored in CTIA.

Each relationship is a directed edge on a graph, and requires a `source_ref`, a `target_ref`, and a `relationship-type`.

| `source-entity-type` | `relationship-type` | `target-entity-type` |
| ---- | ---- | ---- |
| `"sighting"` | `"member-of"` | `"incident"` |
| `"incident"` | `"attributed-to"` | `"actor"` |
| `"incident"` | `"attributed-to"` | `"campaign"` |
| `"incident"` | `"uses"` | `"coa"` |

Note that it is sufficient for threat analysts only to associate `sighting` entities with an `incident`.  The rest of the threat intelligence is available through graph traversal.

For example, `sighting` entities can have  relationships to `indicator` entities, which provide greater detail into the specific nature of the threat (if any), and `judgement` entities on any optional observables within the associated `sighting` can also relate to specific indicators.  Also, `sighting` entities can optionally include *inline references* to one or more`target` systems in with the organization.

So, the best practice, then, is not to make relationships from anything other than `sighting` entities to an `incident`.  However, `incident` entities *themselves* might have relationships to `actor`, `campaign` or `coa` entities.

More details on relationship entities can be found in [Section 1.6: Relationship Entities](https://github.com/threatgrid/ctim/blob/master/doc/tutorials/modeling-threat-intel-ctim.md#16-relationship-entities) in the parent tutorial.

**Example Relationship from a Sighting to an Incident**:
```json
{ "type": "relationship",
  "source": "Modeling Incidents in CTIM Tutorial",
  "source_uri": "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-incidents-in-ctim.md",
    "source_ref" : "transient:ctim-tutorial-sighting-4340e8cc49ff428e21ad1467de4b40246eb0e3b8da96caa2f71f9fe54123d498",
  "target_ref" : "transient:ctim-tutorial-incident-c56de1c94c1ce862c4e6d9883393aacc58275c0c4dc4d8b48cc4db692bf11e4f",
  "relationship_type" : "member-of",
  "external_ids" : [ "ctim-tutorial-relationship-2c1f3fcaf89d294bf7d038f470f6cb4a81dc1fad6ff5deeed18a41bf6fe14f00"]
}
```

**Note:** For a refresher on how and why we build transient IDs when creating bundles of CTIM entities, see [Section 1.6: Relationship Entities](https://github.com/threatgrid/ctim/blob/master/doc/tutorials/modeling-threat-intel-ctim.md#16-relationship-entities) and [Section 1.7: Bundle Entities](https://github.com/threatgrid/ctim/blob/master/doc/tutorials/modeling-threat-intel-ctim.md#17-bundle-entities) in the parent tutorial.

#### 1.8.4: Adding Incidents to CTIM Bundles

Within CTIM `bundle` entities, incidents are grouped together using the `incidents` key, like so:

```json
{
  "type" : "bundle",
  "source": "Modeling Incidents in CTIM Tutorial",
  "source_uri": "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-incidents-in-ctim.md",
  "incidents" : [ {
    "type": "incident",
    "source": "Modeling Incidents in CTIM Tutorial",
    "source_uri": "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-incidents-in-ctim.md",
    "title": "2020-06-15-0334-emotet-botnet-report",
    "short_description": "Incident Report: 2020-06-15 3:34am (Emotet Botnet Attack)",
    "description": "## Summary:\n\nOn Monday, June 15th at 3:34am GMT, a host (UUID #dc0415fe-af42-11ea-b3de-0242ac130004) on VLAN 414 established contact with a known Emotet Epoch 2 Command and Control server, triggering an event alarm. Incident responders isolated the host for further analysis.\n\n## Additional Details:\n\nSMTP traffic log analysis underway to determine the method of initial infection. Phishing attack suspected. No evidence of lateral movement across VLAN 414.",
    "external_ids": ["ctim-tutorial-incident-c56de1c94c1ce862c4e6d9883393aacc58275c0c4dc4d8b48cc4db692bf11e4f"],
    "id": "transient:ctim-tutorial-incident-c56de1c94c1ce862c4e6d9883393aacc58275c0c4dc4d8b48cc4db692bf11e4f",
    "confidence": "High",
    "status": "Containment Achieved",
    "incident_time":
    {"opened": "2020-06-15T03:43:27.368Z",
     "reported": "2020-06-15T03:34:36.298Z"},
     "assignee": ["saintx"],
     "categories": ["Malicious Code"],
     "discovery_method": "NIDS"
} ],
"sightings" : [ {
    "observables" : [ {
      "type" : "ip",
      "value" : "98.15.140.226"
    } ],
    "type" : "sighting",
  "source": "Modeling Incidents in CTIM Tutorial",
  "source_uri": "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-incidents-in-ctim.md",
    "external_ids" : [ "ctim-tutorial-sighting-7b36e0fa2169a3ca330c7790f63c97fd3c9f482f88ee1b350511d8a51fcecc8d" ],
    "id" : "transient:ctim-tutorial-sighting-7b36e0fa2169a3ca330c7790f63c97fd3c9f482f88ee1b350511d8a51fcecc8d",
    "count" : 1,
    "severity" : "High",
    "tlp" : "green",
    "timestamp" : "2020-06-15T03:34:36.298Z",
    "confidence" : "High",
    "observed_time" : {
      "start_time" : "2020-06-15T03:34:36.298Z"
    }
  } ],
  "relationships": [ {
    "type": "relationship",
    "source": "Modeling Incidents in CTIM Tutorial",
    "source_uri": "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-incidents-in-ctim.md",
    "source_ref" : "transient:ctim-tutorial-sighting-4340e8cc49ff428e21ad1467de4b40246eb0e3b8da96caa2f71f9fe54123d498",
    "target_ref" : "transient:ctim-tutorial-incident-c56de1c94c1ce862c4e6d9883393aacc58275c0c4dc4d8b48cc4db692bf11e4f",
    "relationship_type" : "member-of",
    "external_ids" : [ "ctim-tutorial-relationship-2c1f3fcaf89d294bf7d038f470f6cb4a81dc1fad6ff5deeed18a41bf6fe14f00"]
  },
  {
    "type": "relationship",
    "source": "Modeling Incidents in CTIM Tutorial",
    "source_uri": "https://github.com/threatgrid/ctim/blob/master/src/doc/tutorials/modeling-incidents-in-ctim.md",
    "source_ref" : "transient:ctim-tutorial-sighting-4340e8cc49ff428e21ad1467de4b40246eb0e3b8da96caa2f71f9fe54123d498",
    "target_ref" : "https://intel.tutorial.iroh.site:443/ctia/indicator/indicator-b790ade3-e45e-48d4-7d06-f0079e6453a0",
    "description": "Sighting of host communication with known Emotet Epoch 2 C&C server",
    "relationship_type" : "sighting-of",
    "external_ids" : [ "ctim-tutorial-relationship-f879541251b139dfbfbed0f5c66a7c6d20246074241fa2f814f0f3eb2250def8"]
  }]
}
```

Note this example bundle is for illustration purposes only, but it includes all of the following:
- A new `incident` entity
- A new `sighting` entity
- Two `relationship` entities:
  - One associating the new `sighting` to the new `incident`
  - One associating the new `sighting` to an existing remote `indicator` entity

#### 1.8.5: POSTing Incidents to CTIA

Once your incidents are added to a bundle, you can POST them to CTIA using the instructions from [Section 1.7.4: POSTing Bundles to CTIA](https://github.com/threatgrid/ctim/blob/master/doc/tutorials/modeling-threat-intel-ctim.md#174-posting-bundles-to-ctia) of the parent tutorial.
