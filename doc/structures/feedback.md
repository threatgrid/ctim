<a id="top"></a>
# *Feedback* Object

Feedback on any entity.  Is it wrong?  If so why?  Was
  it right-on, and worthy of confirmation?

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[:entity_id](#property-entity_id-string)| String| |&#10003;|
|[:feedback](#property-feedback-integer)|Integer| |&#10003;|
|[:id](#property-id-string)| String| |&#10003;|
|[:reason](#property-reason-string)| String| |&#10003;|
|[:schema_version](#property-schema_version-string)| String|CTIM schema version for this entity|&#10003;|
|[:type](#property-type-feedbacktypeidentifierstring)|FeedbackTypeIdentifier String| |&#10003;|
|[:external_ids](#property-external_ids-stringlist)| String List| ||
|[:language](#property-language-string)| String| ||
|[:revision](#property-revision-integer)|Integer| ||
|[:source](#property-source-string)| String| ||
|[:source_uri](#property-source_uri-string)| String| ||
|[:timestamp](#property-timestamp-instdate)|Inst (Date)| ||
|[:tlp](#property-tlp-tlpstring)|TLP String| ||


<a id="property-entity_id-string"></a>
## Property :entity_id ∷  String

* This entry is required


  * A URI leading to an entity

<a id="property-external_ids-stringlist"></a>
## Property :external_ids ∷  String List

* This entry is optional
* This entry's type is sequential (allows zero or more values)



<a id="property-feedback-integer"></a>
## Property :feedback ∷ Integer

* This entry is required


  * Allowed Values:
    * -1
    * 0
    * 1

<a id="property-id-string"></a>
## Property :id ∷  String

* This entry is required


  * IDs are strings of the form: type-<128bitUUID>, for example `judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement](judgement.md). This _ID_ type compares to the STIX _id_ field.  The optional STIX _idref_ field is not used.

<a id="property-language-string"></a>
## Property :language ∷  String

* This entry is optional


  * String with at most 1024 characters

<a id="property-reason-string"></a>
## Property :reason ∷  String

* This entry is required



<a id="property-revision-integer"></a>
## Property :revision ∷ Integer

* This entry is optional


  * Zero, or a positive integer

<a id="property-schema_version-string"></a>
## Property :schema_version ∷  String

CTIM schema version for this entity

* This entry is required


  * A semantic version matching the CTIM version against which this object should be valid.

<a id="property-source-string"></a>
## Property :source ∷  String

* This entry is optional


  * String with at most 2048 characters

<a id="property-source_uri-string"></a>
## Property :source_uri ∷  String

* This entry is optional


  * A URI

<a id="property-timestamp-instdate"></a>
## Property :timestamp ∷ Inst (Date)

* This entry is optional


  * Schema definition for all date or timestamp values.  Time is stored internally as a java.util.Date object. Serialized as a string, the field should follow the rules of the [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) standard.

<a id="property-tlp-tlpstring"></a>
## Property :tlp ∷ TLP String

* This entry is optional


  * TLP stands for [Traffic Light Protocol](https://www.us-cert.gov/tlp), which indicates precisely how this resource is intended to be shared, replicated, copied, etc.
  * Default: green
  * Allowed Values:
    * amber
    * green
    * red
    * white

<a id="property-type-feedbacktypeidentifierstring"></a>
## Property :type ∷ FeedbackTypeIdentifier String

* This entry is required


  * Must equal: "feedback"
