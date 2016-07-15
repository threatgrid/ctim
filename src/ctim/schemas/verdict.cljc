(ns ctim.schemas.verdict
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationships :as rel]
            [schema.core :as s]
            [schema-tools.core :as st]))

(s/defschema TypeIdentifier
  (s/enum "verdict"))

(s/defschema Verdict
  "A Verdict is chosen from all of the Judgements on that Observable
which have not yet expired.  The highest priority Judgement becomes
the active verdict.  If there is more than one Judgement with that
priority, then Clean disposition has priority over all others, then
Malicious disposition, and so on down to Unknown.

The ID of a verdict is a a str of the form
\"observable.type:observable.value\" for example, \"ip:1.1.1.1\"
"
  {:type TypeIdentifier
   :disposition c/DispositionNumber
   :observable c/Observable
   (s/optional-key :judgement_id) rel/JudgementReference
   (s/optional-key :disposition_name) c/DispositionName})

(s/defschema StoredVerdict
  "A Verdict as stored in the data store"
  (st/merge
   Verdict
   {:id c/ID
    :created c/Time
    :schema_version s/Str
    (s/optional-key :modified) c/Time}))
