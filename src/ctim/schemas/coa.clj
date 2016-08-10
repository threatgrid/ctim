(ns ctim.schemas.coa
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationships :as rel]
            [ctim.schemas.vocabularies :as v]
            [ctim.schemas.openc2vocabularies :as openc2v]
            [ctim.schemas.openc2-network :as open_c2_network_coa]
            [ctim.schemas.openc2-network-sdn :as open_c2_network_sdn_coa]
            [schema.core :as s]
            [ring.swagger.schema :refer [describe]]
            [schema-tools.core :as st]))

(s/defschema TypeIdentifier
  (s/enum "coa"))

(s/defschema StructuredCOA
  (st/merge
   c/BaseEntity))

(s/defschema ActionType
  {:value openc2v/COAType
   (s/optional-key :action_uri) (describe c/URI "URI for the action - REST API exposed by a different system")})

(s/defschema TargetType
  {:value s/Str
   :specifier (describe s/Any "Cybox object representing the target")})

(s/defschema ActuatorType
  {:value openc2v/ActuatorType
   (s/optional-key :specifier) (describe [s/Any] "list of additional properties describing the actuator")})

(s/defschema ModifierType
  {(s/optional-key :actuator_modifier_type) s/Any
   (s/optional-key :delay) s/Str
   (s/optional-key :duration) s/Str
   (s/optional-key :response) s/Str
   (s/optional-key :time) s/Str
   (s/optional-key :reportTo) s/Str})



(s/defschema COA
  (st/merge
   c/BaseEntity
   c/DescribableEntity
   c/SourcableObject
   {:valid_time c/ValidTime}
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
     :structured_coa_type "openc2" :open_c2_coa{st/merge StructuredCOA
                                                 {:action_type ActionType}
                                                  (st/optional-keys
                                                    {:target TargetType
                                                     :actuator ActuatorType
                                                     :modifiers ModifierType})}})))


(s/defschema NewCOA
  "Schema for submitting new COAs"
  (st/merge
   COA
   c/NewBaseEntity
   (st/optional-keys
    {:valid_time c/ValidTime})))

(s/defschema StoredCOA
  "An coa as stored in the data store"
  (c/stored-schema "COA" COA))
