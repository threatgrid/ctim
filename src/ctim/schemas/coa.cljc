(ns ctim.schemas.coa
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            [ctim.schemas.openc2vocabularies :as openc2v]
            [ctim.schemas.openc2-network :as open_c2_network_coa]
            [ctim.schemas.openc2-network-sdn :as open_c2_network_sdn_coa]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])))

(def type-identifier "coa")

(def-eq COATypeIdentifier type-identifier)

(def-eq StructuredCOAType "structured_coa")

(def structured-coa-entries
  (concat
   (f/required-entries
    (f/entry :type StructuredCOAType))
   (f/optional-entries
    (f/entry :id c/ShortString))))

(def-map-type ActionType
  [(f/entry :type openc2v/COAType)])

(def-map-type TargetType
  [(f/entry :type openc2v/TargetTypeVocab)
   (f/entry :specifiers c/ShortString
            :required? false
            :description "Observable types that can be acted upon.")])

(def-map-type ActuatorType
  [(f/entry :type openc2v/ActuatorType)
   (f/entry :specifiers (f/seq-of c/ShortString)
            ;; str is a temporary type; will become an object
            :required? false
            :description "List of additional properties describing the actuator.")])

(def destination
  #{"report-to",
    "set-to",
    "move-to",
    "save-to",
    "modify-to",
    "copy-to",
    "restore-point"})

(def method
  #{"acl",
    "blackhole",
    "blacklist",
    "whitelist",
    "segmentation",
    "honeypot",
    "authenticated",
    "unauthenticated",
    "spawn",
    "hibernate",
    "suspend",
    "graceful",
    "immediate"})

(def search
  #{"cve",
    "patch",
    "vendor_bulletin",
    "signature"})

(def-map-type AdditionalProperties
  [(f/entry :context c/ShortString)])

(def-map-type ModifierType
  (f/optional-entries
   (f/entry :delay c/Time)
   (f/entry :duration c/Time)
   (f/entry :frequency c/ShortString)
   (f/entry :id c/ShortString)
   (f/entry :time c/ValidTime)
   (f/entry :response #{"acknowledge", "status", "query", "command-ref"})
   (f/entry :source c/ShortString)
   (f/entry :destination destination)
   (f/entry :method [method])
   (f/entry :search search)
   (f/entry :location #{"perimeter", "internal"})
   ;; s/Str is a temporary type; will become an object
   (f/entry :option c/ShortString)
   ;; s/Str is a temporary type; will become an object
   (f/entry :additional_properties AdditionalProperties)))

(def-map-type OpenC2COA
  (concat
   structured-coa-entries
   (f/required-entries
    (f/entry :action ActionType))
   (f/optional-entries
    (f/entry :target TargetType)
    (f/entry :actuator ActuatorType)
    (f/entry :modifiers ModifierType))))

(def coa-desc
  (str "Course of Action. A corrective or preventative action to be taken in "
       "response to a threat."))

(def coa-desc-link
  "[CourseOfActionType](http://stixproject.github.io/data-model/1.2/coa/CourseOfActionType/)")

(def-eq OpenC2StructuredCOAType "openc2")

(def-entity-type COA
  {:description coa-desc
   :reference coa-desc-link}
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type COATypeIdentifier)
   (f/entry :valid_time c/ValidTime))
  (f/optional-entries
   (f/entry :stage v/COAStage
            :description (str "Specifies what stage in the cyber threat "
                              "management lifecycle this Course Of Action is "
                              "relevant to."))
   (f/entry :coa_type v/COAType
            :description "The type of this COA")
   (f/entry :objective (f/seq-of c/ShortString)
            :comment "Squashed / simplified"
            :description (str "Characterizes the objective to provide guidance on how to mitigate a security "
                              "incident that has been identified."))
   (f/entry :impact c/ShortString
            :description (str "Characterizes the estimated impact of applying "
                              "this course of action."))
   (f/entry :cost v/HighMedLow
            :description (str "Characterizes the estimated cost for applying "
                              "this course of action."))
   (f/entry :efficacy v/HighMedLow
            :description (str "Effectiveness of this course of action in "
                              "achieving its targeted objective."))
   (f/entry :related_COAs rel/RelatedCOAs
            :description (str "Identifies or characterizes relationships to "
                              "one or more related courses of action."))
   ;; Technical params using the CybOX language
   (f/entry :structured_coa_type OpenC2StructuredCOAType)
   (f/entry :open_c2_coa OpenC2COA))
  ;; Not provided: handling
  ;; Not provided: parameter_observables
  )


(def-entity-type NewCOA
  "Schema for submitting new COAs"
  (:entries COA)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type COATypeIdentifier)
   (f/entry :valid_time c/ValidTime)))

(def COARef
  (c/ref-for-type type-identifier))
