(ns ctim.schemas.playbook
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.coa :refer [COA]]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])))


(def type-identifier "playbook")

(def playbook-desc
  "Describes a Playbook as an organized collection of COAs.")

(def-eq PlaybookTypeIdentifier type-identifier)

(def playbook-stage-entries
  (f/optional-entries
   (f/entry :containment [COA]
            :description "A collection of COAs matching the containment stage.")
   (f/entry :eradication [COA]
            :description "A collection of COAs matching the eradication stage.")
   (f/entry :identification [COA]
            :description "A collection of COAs matching the identification stage.")
   (f/entry :lessons-learned [COA]
            :description "A collection of COAs matching the lessons learned stage.")
   (f/entry :preparation [COA]
            :description "A collection of COAs matching the preparation stage.")
   (f/entry :recovery [COA]
            :description "A collection of COAs matching the recovery stage.")
   (f/entry :remedy [COA]
            :description "A collection of COAs matching the remedy stage.")
   (f/entry :response [COA]
            :description "A collection of COAs matching the response stage.")))

(def-entity-type Playbook
  {:description playbook-desc}
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  playbook-stage-entries
  (f/required-entries
   (f/entry :type PlaybookTypeIdentifier)
   (f/entry :valid_time c/ValidTime)))

(def-entity-type NewPlaybook
  "Schema for submitting new Playbooks"
  (:entries Playbook)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type PlaybookTypeIdentifier)))

(def PlaybookRef
  (c/ref-for-type type-identifier))
