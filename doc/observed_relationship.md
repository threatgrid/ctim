<a name="top"/>
# *ObservedRelationship* Map

Represents a relationship between two entities


## MapEntry: :id -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :id

### String Value

The URI of this entity.

* Plumatic Schema: Str

## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :schema_version -> String

CTIM schema version for this entity

* This entry is required

### Keyword Key

* Plumatic Schema: :schema_version

### String Value

* Plumatic Schema: (enum "0.1.8")
* Must equal: "0.1.8"

## MapEntry: :uri -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :uri

### String Value

A URI

* Plumatic Schema: Str

## MapEntry: :revision -> Integer

* This entry is optional

### Keyword Key

* Plumatic Schema: :revision

### Integer Value

* Plumatic Schema: Int

## MapEntry: :external_ids -> [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

### Keyword Key

* Plumatic Schema: :external_ids

#### String Value

* Plumatic Schema: [java.lang.String]

## MapEntry: :timestamp -> Inst (Date)

* This entry is optional

### Keyword Key

* Plumatic Schema: :timestamp

### Inst (Date) Value

Schema definition for all date or timestamp values.

* Plumatic Schema: Inst

## MapEntry: :language -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :language

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :tlp -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :tlp

### String Value

TLP Stand for Traffic Light Protocol (https://www.us-cert.gov/tlp). Precise how this resource is intended to be shared, replicated, copied...

* Plumatic Schema: (enum "white" "green" "red" "amber")
* Default: green
* Allowed Values: ("amber" "green" "red" "white")

## MapEntry: :title -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :title

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :description -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :description

### String Value

Markdown text

* Plumatic Schema: Str

## MapEntry: :short_description -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :short_description

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :source -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :source

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :source_uri -> String

* This entry is optional

### Keyword Key

* Plumatic Schema: :source_uri

### String Value

A URI

* Plumatic Schema: Str

## MapEntry: :type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :type

### String Value

* Plumatic Schema: (enum "observed-relationship")
* Must equal: "observed-relationship"

## MapEntry: :relationship_type -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :relationship_type

### String Value

* Plumatic Schema: java.lang.String

## MapEntry: :source_ref -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :source_ref

### String Value

A URI leading to an entity

* Plumatic Schema: Str

## MapEntry: :target_ref -> String

* This entry is required

### Keyword Key

* Plumatic Schema: :target_ref

### String Value

A URI leading to an entity

* Plumatic Schema: Str
