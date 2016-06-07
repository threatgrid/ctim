(ns ctim.schemas.judgement
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationships :as rel]
            [ctim.schemas.vocabularies :as v]
            [schema.core :as s]
            [schema-tools.core :as st]))

(def Severity s/Int)

(def Priority
  "A value 0-100 that determiend the priority of a judgement.  Curated
  feeds of black/whitelists, for example known good products within
  your organizations, should use a 95. All automated systems should
  use a priority of 90, or less.  Human judgements should have a
  priority of 100, so that humans can always override machines."
  s/Int)

(s/defschema Judgement
  "A judgement about the intent or nature of an Observable.  For
  example, is it malicious, meaning is is malware and subverts system
  operations.  It could also be clean and be from a known benign, or
  trusted source.  It could also be common, something so widespread
  that it's not likely to be malicious."
  (st/merge
   {:id c/ID
    :observable c/Observable
    :disposition c/DispositionNumber
    :disposition_name c/DispositionName
    :source s/Str
    :priority Priority
    :confidence v/HighMedLow
    :severity Severity
    :valid_time c/ValidTime
    :tlp c/TLP}
   (st/optional-keys
    {:reason s/Str
     :source_uri c/URI
     :reason_uri c/URI
     :indicators rel/RelatedIndicators})))

(s/defschema Type
  (s/enum "judgement"))

(s/defschema NewJudgement
  "Schema for submitting new Judgements."
  (st/merge
   Judgement
   (st/optional-keys
    {:id c/ID
     :disposition c/DispositionNumber
     :disposition_name c/DispositionName
     :valid_time c/ValidTime
     :type Type
     :tlp c/TLP})))

(s/defschema StoredJudgement
  "A judgement as stored in the data store"
  (st/merge Judgement
            {:type Type
             :owner s/Str
             :created c/Time}))
