<a name="top"/>
# *ObservedRelationship* Map

Represents a relationship between two entities


## MapEntry :id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :id

* String Value
  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.
  * Plumatic Schema: Str

## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: Str

## MapEntry :schema_version ∷ String

CTIM schema version for this entity

* This entry is required

* Keyword Key
  * Plumatic Schema: :schema_version

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "0.1.10"

## MapEntry :uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :uri

* String Value
  * A URI
  * Plumatic Schema: Str

## MapEntry :revision ∷ Integer

* This entry is optional

* Keyword Key
  * Plumatic Schema: :revision

* Integer Value
  * Plumatic Schema: Int

## MapEntry :external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :external_ids

* String Value
  * Plumatic Schema: [Str]

## MapEntry :timestamp ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :timestamp

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst

## MapEntry :language ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :language

* String Value
  * Plumatic Schema: Str

## MapEntry :tlp ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :tlp

* String Value
  * TLP Stand for [Traffic Light Protocol](https://www.us-cert.gov/tlp). It indicates precisely how this resource is intended to be shared, replicated, copied...
  * Plumatic Schema: (enum ...)
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

## MapEntry :title ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :title

* String Value
  * Plumatic Schema: Str

## MapEntry :description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :description

* String Value
  * Markdown text
  * Plumatic Schema: Str

## MapEntry :short_description ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :short_description

* String Value
  * Plumatic Schema: Str

## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

## MapEntry :source_uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source_uri

* String Value
  * A URI
  * Plumatic Schema: Str

## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "observed-relationship"

## MapEntry :relationship_type ∷ String

* This entry is required
* Dev Notes: Relationship_type is currently open, so using s/Str until we can define optionally extensible fields; :relationship_type v/DomainObjectRelationship

* Keyword Key
  * Plumatic Schema: :relationship_type

* String Value
  * Plumatic Schema: Str

## MapEntry :source_ref ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :source_ref

* String Value
  * A URI leading to an entity
  * Plumatic Schema: Str

## MapEntry :target_ref ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :target_ref

* String Value
  * A URI leading to an entity
  * Plumatic Schema: Str
