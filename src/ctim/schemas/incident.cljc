(ns ctim.schemas.incident
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])))

(def-map-type IncidentTime
  (concat
   (f/required-entries
    (f/entry :opened c/Time))
   (f/optional-entries
    (f/entry :discovered c/Time)
    (f/entry :reported c/Time)
    (f/entry :remediated c/Time)
    (f/entry :closed c/Time)
    (f/entry :rejected c/Time))))

(def type-identifier "incident")

(def-eq IncidentTypeIdentifier type-identifier)

(def incident-desc
   "Discrete instance of indicators affecting an organization as well
  as information associated with incident response")

(def-entity-type Incident
  {:description incident-desc}
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type IncidentTypeIdentifier)
   (f/entry :confidence v/HighMedLow
            :description (str "level of confidence held in the characterization "
                              "of this Incident"))
   (f/entry :status v/Status
            :description "current status of the incident")
   (f/entry :incident_time IncidentTime
            :comment "Was 'time'; renamed for clarity"
            :description "relevant time values associated with this Incident"))
  (f/optional-entries
   (f/entry :categories [v/IncidentCategory]
            :description "a set of categories for this incident")
   (f/entry :discovery_method v/DiscoveryMethod
            :description "identifies how the incident was discovered")
   (f/entry :intended_effect v/IntendedEffect
            :description "specifies the suspected intended effect of this incident")
   (f/entry :assignees [c/ShortString]
            :description "a set of owners assigned to this incident")))

(def-entity-type NewIncident
  "For submitting a new Incident"
  (:entries Incident)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type IncidentTypeIdentifier)))

(def IncidentRef
  (c/ref-for-type type-identifier))
