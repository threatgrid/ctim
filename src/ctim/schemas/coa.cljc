(ns ctim.schemas.coa
  (:require [ctim.lib.schema :refer [describe]]
            [ctim.schemas.common :as c]
            [ctim.schemas.relationships :as rel]
            [ctim.schemas.vocabularies :as v]
            [schema-tools.core :as st]
            [schema.core :as s]))

(s/defschema TypeIdentifier
  (s/enum "coa"))

(s/defschema COA
  (st/merge
   c/BaseEntity
   c/DescribableEntity
   c/SourcableObject
   {:type TypeIdentifier}
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
     ;; Not provided: structured_COA ;; actionable structured representation for automation
     })))

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
