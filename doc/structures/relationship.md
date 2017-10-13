<a id="top"></a>
# *Relationship* Object

Represents a relationship between two entities

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[id](#propertyid-string)| String| |&#10003;|
|[relationship_type](#propertyrelationship_type-relationshiptypestring)|RelationshipType String| |&#10003;|
|[schema_version](#propertyschema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[source_ref](#propertysource_ref-string)| String| |&#10003;|
|[target_ref](#propertytarget_ref-string)| String| |&#10003;|
|[type](#propertytype-relationshiptypeidentifierstring)|RelationshipTypeIdentifier String| |&#10003;|
|[description](#propertydescription-string)| String| ||
|[external_ids](#propertyexternal_ids-stringlist)| String List| ||
|[language](#propertylanguage-string)| String| ||
|[revision](#propertyrevision-integer)|Integer| ||
|[short_description](#propertyshort_description-string)| String| ||
|[source](#propertysource-string)| String| ||
|[source_uri](#propertysource_uri-string)| String| ||
|[timestamp](#propertytimestamp-instdate)|Inst (Date)| ||
|[title](#propertytitle-string)| String| ||
|[tlp](#propertytlp-tlpstring)|TLP String| ||


<a id="propertydescription-string"></a>
## Property description ∷  String

* This entry is optional


  * Markdown string with at most 5000 characters

<a id="propertyexternal_ids-stringlist"></a>
## Property external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="propertyid-string"></a>
## Property id ∷  String

* This entry is required


  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.

<a id="propertylanguage-string"></a>
## Property language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertyrelationship_type-relationshiptypestring"></a>
## Property relationship_type ∷ RelationshipType String

* This entry is required


  * Allowed Values:
    * attributed-to
    * based-on
    * derived-from
    * detects
    * duplicate-of
    * element-of
    * exploits
    * indicates
    * member-of
    * mitigates
    * related-to
    * targets
    * uses
    * variant-of

<a id="propertyrevision-integer"></a>
## Property revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="propertyschema_version-string"></a>
## Property schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="propertyshort_description-string"></a>
## Property short_description ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource-string"></a>
## Property source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="propertysource_ref-string"></a>
## Property source_ref ∷  String

* This entry is required


  * A URI leading to an entity

<a id="propertysource_uri-string"></a>
## Property source_uri ∷  String

* This entry is optional


  * A URI

<a id="propertytarget_ref-string"></a>
## Property target_ref ∷  String

* This entry is required


  * A URI leading to an entity

<a id="propertytimestamp-instdate"></a>
## Property timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="propertytitle-string"></a>
## Property title ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="propertytlp-tlpstring"></a>
## Property tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="propertytype-relationshiptypeidentifierstring"></a>
## Property type ∷ RelationshipTypeIdentifier String

* This entry is required


  * Must equal: "relationship"
