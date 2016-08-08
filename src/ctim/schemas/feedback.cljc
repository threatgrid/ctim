(ns ctim.schemas.feedback
  (:require [ctim.schemas.common :as c]
            [schema-tools.core :as st]
            [schema.core :as s]))

(s/defschema TypeIdentifier
  (s/enum "feedback"))

(s/defschema Feedback
  "Feedback on any entity.  Is it wrong?  If so why?  Was
  it right-on, and worthy of confirmation?"
  (st/merge
   c/BaseEntity
   c/SourcableObject
   {:entity_id c/Reference
    :feedback (s/enum -1 0 1)
    :reason s/Str}))


(s/defschema NewFeedback
  "Schema for submitting new Feedback"
  (st/merge
   Feedback
   c/NewBaseEntity
   (st/optional-keys
    {:type TypeIdentifier})))

(s/defschema StoredFeedback
  "A feedback record at rest in the storage service"
  (c/stored-schema "feedback" Feedback))
