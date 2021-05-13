## Modeling Complex Events in CTIM

CTIM is capable of modeling arbitrarily complex event data. That is, events that are triggered by other events, which themselves might be triggered by other events.

## Synopsis

- Arbitrarily complex cybersecurity events can be modeled in CTIM.
- Pattern matching or detection rules are modeled with the `indicator` entity.
- An `indicator` entity can be `based-on` other `indicator` entities.
- When modeling `indicator` entities, less is more.
  - Don't include the patterns you match against in your `indicator` entities. They'll be used for detection evasion.
  - The `indicator` entity should only summarize the threat. Use other entities for describing threats in depth.
- When a pattern matching or detection rule described by an `indicator` is triggered, we create a `sighting` that is a `sighting-of` relationship to that `indicator`.
- A `sighting` entity can be `based-on` other `sighting` entities, in addition to being a `sighting-of` an `indicator`.

## Indicators as Detection or Pattern Matching Rules

There are [two basic indicator types](https://github.com/threatgrid/ctim/blob/master/doc/tutorials/modeling-threat-intel-ctim.md#132-types-of-indicators). This tutorial concerns itself with the first type, which is a detection or pattern matching rule. These rules look for patterns in data, and can run inside of rule engines, expert systems, firewalls, log monitors, or any other kind of scanning or monitoring system.

Pattern matching rules can be composed from other pattern matching rules, such that a series of pattern matches within a given timeframe can combine to trigger more complex pattern matches. Here are three contrived examples:

1. If DNS traffic from any host on these three VLANs exceeds a predefined threshold of requests per second for longer than 30 seconds, and filesystem name changes exceed a predefined threshold of updates per second, and system CPU usage exceeds a predefined threshold over the course of more than 4 minutes, trigger a possible ransomware attack alert.
2. If inter-VLAN traffic within these three VLANs--measured in requests per second--exceeds a predefined threshold within a week of a possible ransomware attack alert, trigger a possible lateral movement alert.
3. If outbound network traffic--measured in bits per hour--exceeds a predefined threshold from any of these three VLANs, within a week of a possible ransomware attack alert, trigger a possible data exfiltration alert.

A firewall or network intrusion detection system, or even an antivirus scan will commonly generate alerts at all of these levels of complexity. Our task in modeling these alerts in CTIM is to faithfully capture the relationships between the events, as they progress both temporally and logically:
  1. Earlier pattern matches can serve as triggers for subsequent pattern matches.
  2. Simpler pattern matches can serve as triggers for more complex pattern matches.

In CTIM, the best and easiest way to model these relationships between `indicator` entities is to use the `based-on` relationship type. For example, if one of your rules fires only when two of your other rules fire, you can model this fact with two relationships, like so:

```
 {
  "type": "relationship",
  "source": "CTIM Modeling Tutorials",
  "source_uri": "https://github.com/threatgrid/ctim",
  "source_ref": "indicator-3",
  "relationship_type": "based-on",
  "target_ref": "indicator-1"
  "description": "indicator-3 based-on indicator-1"
 },{
  "type": "relationship",
  "source": "CTIM Modeling Tutorials",
  "source_uri": "https://github.com/threatgrid/ctim",
  "source_ref": "indicator-3",
  "relationship_type": "based-on",
  "target_ref": "indicator-2"
  "description": "indicator-3 based-on indicator-2"
 }
```

In teams that design and build firewalls and network intrusion detection systems, threat analysts work with rule authors to define these types of patterns ahead of time, and also define the relationships between them. This is, ideally, when the `indicator` entities should be modeled.

Like elsewhere in CTIM, our `indicator` entities do not actually include any details of the actual patterns they detect. We don't ever add YARA rules, or OSQuery details, or any other kind of process-specific details to our `indicator` entities.

The `indicator` entities should contain a brief description of what any given match of the pattern or detection rule might imply.
- `indicator` entities never contain information about the patterns themselves.
- `indicator` entities only contain brief or summary overviews of the threat that was detected.
- Detailed information about the exact nature of the threat is modeled in *threat context entities* such as the `attack-pattern`, `malware`, `tool`, or `vulnerability` entities. Our `indicator` entities can have `indicates` relationships to these. This hybrid normalized data model dramatically reduces the edge complexity of the entity graph (by using indicators as an edge aggregator), and simplifies our ability to update and maintain our detailed threat intelligence. For example, rather than explaining over and over *and over* again in hundreds (or thousands) of `indicator` entities just what exactly "ransomware" is, we can maintain one very well written ransomware `attack-pattern` entity, and link to that from all of those indicators.
- This summary overview, in the case of a complex pattern match, could also briefly reference the simpler patterns that together triggered the pattern match, but it's not required.

The lesson to learn here is that regardless of how complex your pattern matching or detection rules are, and regardless of whether any one of your rules is composed from a collection of other rules, you can model the information about each pattern matching rule as `indicator` entities in CTIM. Complex rules--where one rule is based on a composition of one or more other rules--are modeled using the `based-on` relationship type.

## Sightings to Record Pattern Rule Matches

Whenever an event on our network or in one of our monitored systems triggers a detection or pattern matching rule, we generate a `sighting` for it. This is true whether your rule is:
 - a YARA rule in a malware engine
 - a snort rule running in a network intrusion detection system
 - a firewall rule
 - an antivirus or any other kind of filesystem or registry scan on a host endpoint
 - a monitor for an event log
 - a rule that's only triggered by *all of the above*.

Ultimately, `sighting` entities are how we record that we saw *anything* trigger any kind of detection or pattern matching rule described by one of our `indicator` entities, at a specific point in time.

In addition to being a `sighting-of` an `indicator`, a `sighting` entity can also be `based-on` other `sighting` entities, in the same way that its `indicator` is `based-on` other indicators.

Using this pattern, we can model arbitrarily complex events:

![Illustration of a complex event in CTIM](https://github.com/threatgrid/ctim/blob/master/doc/img/ctim-complex-events.png)
