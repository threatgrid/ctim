(ns ctim.schemas.judgement
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type]])))

(def Severity f/any-int)

(def Priority
  (f/int :description
         (str "A value 0-100 that determine the priority of a judgement. "
              "Curated feeds of black/white lists, for example known good "
              "products within your organizations, should use a 95. All "
              "automated systems should use a priority of 90, or less.  Human "
              "judgements should have a priority of 100, so that humans can "
              "always override machines.")))

(def TypeIdentifier
  (f/eq "judgement"))

(def judgement-desc
  "A judgement about the intent or nature of an observable.  For
  example, is it malicious, meaning is is malware and subverts system
  operations?  It could also be clean and be from a known benign, or
  trusted source.  It could also be common, something so widespread
  that it's not likely to be malicious.

  Since a core goal of the CTIA is to provide a simple verdict service,
  these judgements are the basis for the returned verdicts.  These are
  also the primary means by which users of the CTIA go from
  observables on their system, to the indicators and threat
  intelligence data in CTIA.")

(def-entity-type Judgement
  judgement-desc
  c/base-entity-entries
  c/sourced-object-entries
  (f/required-entries
   (f/entry :type TypeIdentifier)
   (f/entry :observable c/Observable)
   (f/entry :disposition c/DispositionNumber
            :description (str "Matches :disposition_name as in "
                              (pr-str c/disposition-map)))
   (f/entry :disposition_name c/DispositionName)
   (f/entry :priority Priority)
   (f/entry :confidence v/HighMedLow)
   (f/entry :severity Severity)
   (f/entry :valid_time c/ValidTime))
  (f/optional-entries
   (f/entry :reason f/any-str)
   (f/entry :reason_uri c/URI)
   (f/entry :indicators rel/RelatedIndicators)))

(def-entity-type NewJudgement
  "Schema for submitting new Judgements"
  (:entries Judgement)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :disposition c/DispositionNumber)
   (f/entry :disposition_name c/DispositionName)
   (f/entry :valid_time c/ValidTime)
   (f/entry :type TypeIdentifier)))

(def-entity-type StoredJudgement
  "A judgement as stored in the data store"
  (:entries Judgement)
  c/base-stored-entity-entries)
