(ns ctim.schemas.observed-relationship
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type]])))

(def TypeIdentifier
  (f/eq "observed-relationship"))

(def-entity-type ObservedRelationship
  "Represents a relationship between two entities"
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type TypeIdentifier)
   (f/entry :relationship_type f/any-str
            :comment (str "Relationship_type is currently open, so using s/Str "
                          "until we can define optionally extensible fields; "
                          ":relationship_type v/DomainObjectRelationship"))
   (f/entry :source_ref c/Reference)
   (f/entry :target_ref c/Reference)))

(def-entity-type NewObservedRelationship
  "Schema for submitting new ObservedRelationships"
  (:entries ObservedRelationship)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type TypeIdentifier)))

(def-entity-type StoredObservedRelationship
  "An ObservedRelationship stored in the data store"
  (:entries ObservedRelationship)
  c/base-stored-entity-entries)
