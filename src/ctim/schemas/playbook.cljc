(ns ctim.schemas.playbook
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.coa :refer [COA]]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])))


(def type-identifier "playbook")

(def playbook-desc
  "Describes a Playbook as an organized collection of COAs.")

(def-eq PlaybookTypeIdentifier type-identifier)

(def-entity-type Playbook
  {:description playbook-desc}
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type PlaybookTypeIdentifier)
   (f/entry :valid_time c/ValidTime))
  (f/optional-entries
   (f/entry :containment (f/set-of COA)
            :description "A collection of COAs matching the containment stage.")
   (f/entry :eradication (f/set-of COA)
            :description "A collection of COAs matching the eradication stage.")
   (f/entry :identification (f/set-of COA)
            :description "A collection of COAs matching the identification stage.")
   (f/entry :lessons-learned (f/set-of COA)
            :description "A collection of COAs matching the lessons learned stage.")
   (f/entry :preparation (f/set-of COA)
            :description "A collection of COAs matching the preparation stage.")
   (f/entry :recovery (f/set-of COA)
            :description "A collection of COAs matching the recovery stage.")
   (f/entry :remedy (f/set-of COA)
            :description "A collection of COAs matching the remedy stage.")
   (f/entry :response (f/set-of COA)
            :description "A collection of COAs matching the response stage.")))

(def-entity-type NewPlaybook
  "Schema for submitting new Playbooks"
  (:entries Playbook)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type PlaybookTypeIdentifier)))

(def PlaybookRef
  (c/ref-for-type type-identifier))
