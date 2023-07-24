(ns ctim.schemas.investigation
  (:require
   [ctim.schemas.common :as c]
   #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq]]
      :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq]])))

(def type-identifier "investigation")

(def-eq InvestigationIdentifier type-identifier)

(def-entity-type Investigation
  "Schema for an Investigation (a work in progress)."
  c/base-entity-entries
  c/sourced-object-entries
  c/describable-entity-entries
  (f/required-entries
   (f/entry :type InvestigationIdentifier)))

(def-entity-type NewInvestigation
  "Schema for submitting new Investigations."
  (:entries Investigation)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type InvestigationIdentifier)))
