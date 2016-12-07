(ns ctim.schemas.feedback
  (:require [ctim.schemas.common :as c]
            #?(:clj  [flanders.core :as f :refer [def-entity-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type]])))

(def type-identifier "feedback")

(def TypeIdentifier (f/eq type-identifier))

(def-entity-type Feedback
  "Feedback on any entity.  Is it wrong?  If so why?  Was
  it right-on, and worthy of confirmation?"
  c/base-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type TypeIdentifier)
   (f/entry :entity_id c/Reference)
   (f/entry :feedback #{-1 0 1})
   (f/entry :reason f/any-str)))

(def-entity-type NewFeedback
  "Schema for submitting new Feedback"
  (:entries Feedback)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type TypeIdentifier)))

(def-entity-type StoredFeedback
  "A feedback record at rest in the storage service"
  (:entries Feedback)
  c/base-stored-entity-entries)

(def FeedbackRef
  (c/ref-for-type type-identifier))
