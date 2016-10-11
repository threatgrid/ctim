# Cisco Threat Intel Model (CTIM)

## Data Structures

CTIM, the data model of [CTIA](https://github.com/threatgrid/ctia), is
closely based on [STIX](http://stixproject.github.io/data-model/) with
a few simplifications:

  * The base Types cannot be documented inside of each other.  It's
  like always having to use an _idref_.  This is because we intend to
  build a hypermedia threat intel web combining global and local
  threat intel.

  * It's built on top of a "verdict service" so we simplify
  Observables into their most commonly observed properties.  You no
  longer have to say, "a file, with the sha256 checksum equal to X"
  you would simple say, "a sha256 checksum".  We cross index
  everything on these observables, and distill the indicators down
  into verdicts that allow q quick looking to see if an observable is
  of interest.

  * We flatten some structured data to make it easier to deal with as
  JSON and simpler, since we are dealing with specific cases in CTIA.
  We will use default vocabularies whenever they are available.

  * We assume specific string representations for descriptions and
  such, instead of the more complex structured data which allows the
  specification of multiple formats.  This is to enforce a more secure
  representation fromat suitable for embedding in web applications.

## Models

- [Actor](structures/actor.md)
- [Campaign](structures/campaign.md)
- [Course of Action](structures/coa.md)
- [Exploit Target](structures/exploit_target.md)
- [Feedback](structures/feedback.md)
- [Incident](structures/incident.md)
- [Indicator](structures/indicator.md)
- [Judgement](structures/judgement.md)
- [Observed Relationship](structures/observed_relationship.md)
- [Sighting](structures/sighting.md)
- [Tools, Techniques, & Procedures](structures/ttp.md)
- [Verdict](structures/verdict.md)

## Graphs

- [Data Model Graph](img/model.png)
- [Data Model Graph as `.dot`](graph/model.dot)

## Examples

- [Indicator JSON example](json/indicator.json)
