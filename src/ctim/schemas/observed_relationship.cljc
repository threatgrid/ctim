(ns ctim.schemas.observed_relationship
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.vocabularies :as v]
            [schema.core :as s]
            [schema-tools.core :as st]))

(s/defschema TypeIdentifier)

(s/defschema ObservedRelationship
  "Represents a relationship between two entities"
  (st/merge
   c/BaseEntity
   c/DescribableEntity
   c/SourcedObject
   {:type TypeIdentifier
    ;; Relationship_type is currently open, so using s/Str until we can define
    ;; optionally extensible fields
    ;;:relationship_type v/DomainObjectRelationship
    :relationship_type s/Str
    :source_ref c/Reference
    :target_ref c/Reference}))

(s/defschema NewObservedRelationship
  "Schema for submitting new ObservedRelationships"
  (st/merge
   ObservedRelationship
   c/NewBaseEntity
   (st/optional-keys
    :type TypeIdentifier)))

(s/defschema StoredObservedRelationship
  "An ObservedRelationship stored in the data store"
  (c/stored-schema ObservedRelationship))
