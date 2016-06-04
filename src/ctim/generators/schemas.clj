(ns ctim.generators.schemas
  (:require [clojure.test.check.generators :as gen]
            [ctim.domain.id :as id]
            [ctim.schemas
             [common :refer [Observable]]
             [feedback :refer [Feedback]]
             [verdict :refer [Verdict]]]
            [ctim.generators.common :refer [generate-entity]]
            [ctim.generators.schemas
             [actor-generators :as ag]
             [campaign-generators :as cg]
             [coa-generators :as og]
             [exploit-target-generators :as eg]
             [feedback-generators :as fg]
             [incident-generators :as ig]
             [indicator-generators :as ng]
             [judgement-generators :as jg]
             [sighting-generators :as sg]
             [ttp-generators :as tg]]))

(defn gen-new-indicator-with-new-sightings [url-params-fn]
  (gen/let [{id :id :as indicator} ng/gen-new-indicator-with-id
            sightings (gen/vector
                       (sg/gen-new-sighting-with-indicator
                        (id/short-id->long-id id url-params-fn))
                       1
                       10)]
    [indicator sightings]))

(def kw->generator
  {:actor          ag/gen-actor
   :new-actor      ag/gen-new-actor
   :campaign       cg/gen-campaign
   :new-campaign   cg/gen-new-campaign
   :coa            og/gen-coa
   :new-coa        og/gen-new-coa
   :exploit-target eg/gen-exploit-target
   :new-exploit-target eg/gen-new-exploit-target
   :new-feedback   fg/gen-new-feedback
   :feedback       fg/gen-feedback
   :incident       ig/gen-incident
   :new-incident   ig/gen-new-incident
   :indicator      ng/gen-indicator
   :new-indicator  ng/gen-new-indicator
   :judgement      jg/gen-judgement
   :new-judgement  jg/gen-new-judgement
   :observable     (generate-entity Observable)
   :sighting       sg/gen-sighting
   :new-sighting   sg/gen-new-sighting
   :ttp            tg/gen-ttp
   :new-ttp        tg/gen-new-ttp
   :verdict        (generate-entity Verdict)})

(defn gen-entity [schema-kw]
  (get kw->generator schema-kw))

(def default-complexity 20)

(defn sample-by-kw
  ([schema-kw]
   (sample-by-kw default-complexity schema-kw))
  ([num schema-kw]
   "generate num records of a schema-kw"
   (gen/sample (get kw->generator schema-kw)
               num)))
