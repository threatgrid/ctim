(ns ctim.schemas.coa
  (:require [ctim.lib.schema :refer [describe]]
            [ctim.schemas.common :as c]
            [ctim.schemas.relationships :as rel]
            [ctim.schemas.vocabularies :as v]
            [ctim.schemas.openc2vocabularies :as openc2v]
            [ctim.schemas.openc2-network :as open_c2_network_coa]
            [ctim.schemas.openc2-network-sdn :as open_c2_network_sdn_coa]
            [schema.core :as s]
            [schema-tools.core :as st]))

(s/defschema TypeIdentifier
  (s/enum "coa"))

(s/defschema StructuredCOA
  {:type (s/enum "structured_coa")
   :id c/ID})

(s/defschema ActionType
  {:type openc2v/COAType})

(s/defschema TargetType
  {:type s/Str
   (s/optional-key :specifiers) (describe s/Any "Cybox object representing the target")})

(s/defschema ActuatorType
  {:type openc2v/ActuatorType
   (s/optional-key :specifiers) (describe [s/Any] "list of additional properties describing the actuator")})

(s/defschema ModifierType
  {(s/optional-key :delay) c/Time
   (s/optional-key :duration) c/Time
   (s/optional-key :frequency) s/Str
   (s/optional-key :id) s/Str
   (s/optional-key :time) c/ValidTime
   (s/optional-key :response) (s/enum "acknowledge", "status", "query", "command-ref")
   (s/optional-key :source) s/Str
   (s/optional-key :destination) (s/enum "report-to", "set-to", "move-to", "save-to", "modify-to", "copy-to", "restore-point")
   (s/optional-key :method) [(s/enum "acl", "blackhole", "blacklist", "whitelist", "segmentation", "honeypot", "authenticated", "unauthenticated", "spawn", "hibernate", "suspend", "graceful", "immediate")]
   (s/optional-key :search) (s/enum "cve", "patch", "vendor_bulletin", "signature")
   (s/optional-key :location) (s/enum "perimeter", "internal")
   (s/optional-key :option) s/Any
   (s/optional-key :additional_properties) {:context s/Any}})



(s/defschema COA
  (st/merge
   c/BaseEntity
   c/DescribableEntity
   c/SourcableObject
   {:type TypeIdentifier
    :valid_time c/ValidTime}
   (st/optional-keys
    {:stage (describe
             v/COAStage
             (str "specifies what stage in the cyber threat management lifecycle"
                  " this Course Of Action is relevant to"))
     :coa_type (describe v/COAType "type of this CourseOfAction")

     :objective (describe ;; Squashed / simplified
                 [s/Str]
                 "characterizes the objective of this Course Of Action")
     :impact (describe s/Str
                       (str "characterizes the estimated impact of applying"
                            " this Course Of Action"))
     :cost (describe v/HighMedLow (str "characterizes the estimated cost"
                                       " for applying this Course Of Action"))
     :efficacy (describe v/HighMedLow
                         (str "effectiveness of this Course Of Action"
                              " in achieving its targeted Objective"))
     :related_COAs (describe
                    rel/RelatedCOAs
                    (str "identifies or characterizes relationships to"
                         " one or more related courses of action"))
     ;; Not provided: handling
     ;; Not provided: parameter_observables ;; Technical params using the CybOX language
     :structured_coa_type (s/enum "openc2")
     :open_c2_coa (st/merge StructuredCOA
                            {:action ActionType}
                            (st/optional-keys
                             {:target TargetType
                              :actuator ActuatorType
                              :modifiers ModifierType}))})))


(s/defschema NewCOA
  "Schema for submitting new COAs"
  (st/merge
   COA
   c/NewBaseEntity
   (st/optional-keys
    {:type TypeIdentifier
     :valid_time c/ValidTime})))

(s/defschema StoredCOA
  "An coa as stored in the data store"
  (c/stored-schema "COA" COA))
