(ns ctim.schemas.coa
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationships :as rel]
            [ctim.schemas.vocabularies :as v]
            [ctim.schemas.openc2vocabularies :as openc2v]
            [ctim.schemas.openc2-network :as open_c2_network_coa]
            [ctim.schemas.openc2-network-sdn :as open_c2_network_sdn_coa]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type]])))

(def TypeIdentifier
  (f/eq "coa"))

(def structured-coa-entries
  [(f/entry :type (f/eq "structured_coa"))
   (f/entry :id c/ID)])

(def-map-type ActionType
  [(f/entry :type openc2v/COAType)])

(def-map-type TargetType
  [(f/entry :type f/any-str)
   (f/entry :specifiers f/any-str
            ;; str is a temporary type; will become an object
            :required? false
            :description "Cybox object representing the target")])

(def-map-type ActuatorType
  [(f/entry :type openc2v/ActuatorType)
   (f/entry :specifiers f/any-str-seq
            ;; str is a temporary type; will become an object
            :required? false
            :description "list of additional properties describing the actuator")])

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
  [(f/entry :context f/any-str)])

(def-map-type ModifierType
  (f/optional-entries
   (f/entry :delay c/Time)
   (f/entry :duration c/Time)
   (f/entry :frequency f/any-str)
   (f/entry :id f/any-str)
   (f/entry :time c/ValidTime)
   (f/entry :response #{"acknowledge", "status", "query", "command-ref"})
   (f/entry :source f/any-str)
   (f/entry :destination destination)
   (f/entry :method (f/seq-of method))
   (f/entry :search search)
   (f/entry :location #{"perimeter", "internal"})
   ;; s/Str is a temporary type; will become an object
   (f/entry :option f/any-str)
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

(def-entity-type COA
  "Course of Action"
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type TypeIdentifier)
   (f/entry :valid_time c/ValidTime))
  (f/optional-entries
   (f/entry :stage v/COAStage
            :description (str "specifies what stage in the cyber threat "
                              "management lifecycle this Course Of Action is "
                              "relevant to"))
   (f/entry :coa_type v/COAType
            :description "type of this COA")
   (f/entry :objective f/any-str-seq
            :comment "Squashed / simplified"
            :description "characterizes the objective of this Course Of Action")
   (f/entry :impact f/any-str
            :description (str "characterizes the estimated impact of applying "
                              "this Course Of Action"))
   (f/entry :cost v/HighMedLow
            :description (str "characterizes the estimated cost for applying "
                              "this Course Of Action"))
   (f/entry :efficacy v/HighMedLow
            :description (str "effectiveness of this Course Of Action in "
                              "achieving its targeted Objective"))
   (f/entry :related_COAs rel/RelatedCOAs
            :description (str "identifies or characterizes relationships to"
                              " one or more related courses of action"))
   ;; Technical params using the CybOX language
   (f/entry :structured_coa_type (f/eq "openc2"))
   (f/entry :open_c2_coa OpenC2COA))
  ;; Not provided: handling
  ;; Not provided: parameter_observables
  )


(def-entity-type NewCOA
  "Schema for submitting new COAs"
  (:entries COA)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type TypeIdentifier)
   (f/entry :valid_time c/ValidTime)))

(def-entity-type StoredCOA
  "An coa as stored in the data store"
  (:entries COA)
  c/base-stored-entity-entries)
