<a name="top"/>
# *Feedback* Map

Feedback on any entity.  Is it wrong?  If so why?  Was
  it right-on, and worthy of confirmation?

| key | type | required? |
| --- | ---- | --------- |
|[:feedback](#mapentry-feedback-integer)|Integer|&#10003;|
|[:schema_version](#mapentry-schema_version-string)|String|&#10003;|
|[:revision](#mapentry-revision-integer)|Integer||
|[:type](#mapentry-type-string)|String|&#10003;|
|[:source](#mapentry-source-string)|String||
|[:external_ids](#mapentry-external_ids-string)|String||
|[:reason](#mapentry-reason-string)|String|&#10003;|
|[:source_uri](#mapentry-source_uri-string)|String||
|[:language](#mapentry-language-string)|String||
|[:id](#mapentry-id-string)|String|&#10003;|
|[:tlp](#mapentry-tlp-string)|String||
|[:entity_id](#mapentry-entity_id-string)|String|&#10003;|
|[:uri](#mapentry-uri-string)|String||
|[:timestamp](#mapentry-timestamp-instdate)|Inst (Date)||

<a name="mapentry-feedback-integer"/>
## MapEntry :feedback ∷ Integer

* This entry is required

* Keyword Key
  * Plumatic Schema: :feedback

* Integer Value
  * Plumatic Schema: (enum ...)
  * Allowed Values:
    * -1
    * 0
    * 1

<a name="mapentry-schema_version-string"/>
## MapEntry :schema_version ∷ String

CTIM schema version for this entity

* This entry is required

* Keyword Key
  * Plumatic Schema: :schema_version

* String Value
  * Plumatic Schema: (enum ...)
  * Must equal: "0.3.1"

<a name="mapentry-revision-integer"/>
## MapEntry :revision ∷ Integer

* This entry is optional

* Keyword Key
  * Plumatic Schema: :revision

* Integer Value
  * Plumatic Schema: Int

<a name="mapentry-type-string"/>
## MapEntry :type ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :type

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source-string"/>
## MapEntry :source ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source

* String Value
  * Plumatic Schema: Str

<a name="mapentry-external_ids-string"/>
## MapEntry :external_ids ∷ [String]

* This entry is optional
* This entry's type is sequential (allows zero or more values)

* Keyword Key
  * Plumatic Schema: :external_ids

* String Value
  * Plumatic Schema: [Str]

<a name="mapentry-reason-string"/>
## MapEntry :reason ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :reason

* String Value
  * Plumatic Schema: Str

<a name="mapentry-source_uri-string"/>
## MapEntry :source_uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :source_uri

* String Value
  * A URI
  * Plumatic Schema: Str

<a name="mapentry-language-string"/>
## MapEntry :language ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :language

* String Value
  * Plumatic Schema: Str

<a name="mapentry-id-string"/>
## MapEntry :id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :id

* String Value
  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.
  * Plumatic Schema: Str

<a name="mapentry-tlp-string"/>
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

<a name="mapentry-entity_id-string"/>
## MapEntry :entity_id ∷ String

* This entry is required

* Keyword Key
  * Plumatic Schema: :entity_id

* String Value
  * A URI leading to an entity
  * Plumatic Schema: Str

<a name="mapentry-uri-string"/>
## MapEntry :uri ∷ String

* This entry is optional

* Keyword Key
  * Plumatic Schema: :uri

* String Value
  * A URI
  * Plumatic Schema: Str

<a name="mapentry-timestamp-instdate"/>
## MapEntry :timestamp ∷ Inst (Date)

* This entry is optional

* Keyword Key
  * Plumatic Schema: :timestamp

* Inst (Date) Value
  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object, serialized as a string the field should follow the rules of the ISO8601 standard.
  * Plumatic Schema: Inst
