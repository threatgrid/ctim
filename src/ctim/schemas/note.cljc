(ns ctim.schemas.note
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])))

(def type-identifier "note")

(def NoteRef
  (c/ref-for-type type-identifier))

(def-eq NoteTypeIdentifier type-identifier)

(def-map-type NoteRelatedEntity
  (f/required-entries
   (f/entry :entity_type f/any-str)
   (f/entry :entity_id c/Reference)))

(def-entity-type Note
  "A Note is intended to convey informative text to provide further context and/or to provide additional analysis not contained in the Objects, assigning Text/content to the Object the Note relates to Notes can be created by anyone (not just the original object creator).
For example, an analyst may add a Note to a Campaign object created by another organization indicating that they've seen posts related to that Campaign on a hacker forum."
  c/base-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type NoteTypeIdentifier)
   (f/entry :note_class f/any-keyword)
   (f/entry :content c/Markdown)
   (f/entry :related_entities (f/seq-of NoteRelatedEntity)))
  (f/optional-entries
   (f/entry :author f/any-str)))

(def-entity-type NewNote
  "Schema for submitting Notes"
  (:entries Note)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type NoteTypeIdentifier)))
