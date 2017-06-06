(ns ctim.schemas.verdict
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            #?(:clj  [flanders.core :as f :refer [def-entity-type
                                                  def-enum-type
                                                  def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type
                                                         def-enum-type
                                                         def-eq]])))

(def type-identifier "verdict")

(def-eq VerdictTypeIdentifier type-identifier)

(def-entity-type Verdict
  (str
   "A Verdict is chosen from all of the Judgements on that Observable which have "
   "not yet expired.  The highest priority Judgement becomes the active verdict.  "
   "If there is more than one Judgement with that priority, then Clean "
   "disposition has priority over all others, then Malicious disposition, and so "
   "on down to Unknown.\n\n The ID of a verdict is a a str of the form "
   "\"observable.type:observable.value\" for example, \"ip:1.1.1.1\"")
  [(f/entry :type VerdictTypeIdentifier)
   (f/entry :disposition c/DispositionNumber)
   (f/entry :observable c/Observable)
   (f/entry :judgement_id rel/JudgementReference
            :required? false)
   (f/entry :disposition_name c/DispositionName
            :required? false
            :description (str "The disposition_name field is optional, but is "
                              "intended to be shown to a user.  Applications must "
                              "therefore remember the mapping of numbers to "
                              "human words, as in: "
                              (pr-str c/disposition-map)))
   (f/entry :valid_time c/ValidTime)])

(def-entity-type StoredVerdict
  "A Verdict as stored in the data store"
  (:entries Verdict)
  [(f/entry :id c/ID)
   (f/entry :created c/Time)
   (f/entry :schema_version f/any-str)
   (f/entry :modified c/Time
            :required? false)])

(def VerdictRef
  (c/ref-for-type type-identifier))
