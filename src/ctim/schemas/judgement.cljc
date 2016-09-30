(ns ctim.schemas.judgement
  (:require [flanders.core :as f]
            [flanders.schema :as fs]
            [ctim.schemas.common :as c]
            [ctim.schemas.relationships :as rel]
            [ctim.schemas.vocabularies :as v]
            [schema-tools.core :as st]
            [schema.core :as s]))

(def Severity s/Int)

(def Priority
  "A value 0-100 that determiend the priority of a judgement.  Curated
  feeds of black/whitelists, for example known good products within
  your organizations, should use a 95. All automated systems should
  use a priority of 90, or less.  Human judgements should have a
  priority of 100, so that humans can always override machines."
  s/Int)

(s/defschema TypeIdentifier
  (s/enum "judgement"))

(s/defschema Judgement
  "A judgement about the intent or nature of an Observable.  For
  example, is it malicious, meaning is is malware and subverts system
  operations.  It could also be clean and be from a known benign, or
  trusted source.  It could also be common, something so widespread
  that it's not likely to be malicious."
  (st/merge
   c/BaseEntity
   c/SourcedObject
   {:type TypeIdentifier
    :observable c/Observable
    :disposition c/DispositionNumber
    :disposition_name c/DispositionName
    :priority Priority
    :confidence v/HighMedLow
    :severity Severity
    :valid_time c/ValidTime}
   (st/optional-keys
    {:reason s/Str
     :reason_uri c/URI
     :indicators rel/RelatedIndicators})))

(s/defschema NewJudgement
  "Schema for submitting new Judgements."
  (st/merge
   Judgement
   c/NewBaseEntity
   (st/optional-keys
    {:disposition c/DispositionNumber
     :disposition_name c/DispositionName
     :valid_time c/ValidTime
     :type TypeIdentifier})))

(s/defschema StoredJudgement
  "A judgement as stored in the data store"
  (c/stored-schema "judgement" Judgement))


;;;;;;;;;;;;;;;;;;;  NEW TREE ;;;;;;;;;;;;;;;;;;;;;

(def judgement-tree
  "A judgement about the intent or nature of an Observable.  For
  example, is it malicious, meaning is is malware and subverts system
  operations.  It could also be clean and be from a known benign, or
  trusted source.  It could also be common, something so widespread
  that it's not likely to be malicious."
  (f/entity
   :name "Judgement"
   :type :judgement
   :fields (concat c/base-entity-NEW
                   c/sourced-object-NEW
                   (f/required-fields
                    (f/field {:type TypeIdentifier})
                    (f/field {:observable c/observable-NEW})
                    (f/field {:disposition c/DispositionNumber-NEW})
                    (f/field {:disposition_name c/DispositionName-NEW})
                    (f/field {:priority Priority})
                    (f/field {:confidence (f/enum v/HighMedLow-NEW)})
                    (f/field {:severity Severity})
                    (f/field {:valid_time c/ValidTime}))
                   (f/optional-fields
                    (f/field {:reason s/Str})
                    (f/field {:reason_uri c/URI})
                    (f/field {:indicators rel/related-indicators-NEW})))))

(s/defn get-schema
  "Returns the plumatic schema for Judgement"
  []
  (fs/->schema-tree judgement-tree))
