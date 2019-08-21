(ns ctim.schemas.incident-summary
  (:require
   [ctim.schemas.common :as c]
   #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq]]
      :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq]])))

(def type-identifier "incident-summary")

(def-eq IncidentSummaryIdentifier type-identifier)

(def-entity-type IncidentSummary
  "Schema for an IncidentSummary (a work in progress)"
  c/base-entity-entries
  c/sourced-object-entries
  c/describable-entity-entries
  (f/required-entries
   (f/entry :type IncidentSummaryIdentifier)))

(def-entity-type NewIncidentSummary
  "Schema for submitting new Incident Summaries"
  (:entries IncidentSummary)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type IncidentSummaryIdentifier)))
