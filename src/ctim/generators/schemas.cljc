(ns ctim.generators.schemas
  (:require [clojure.test.check.generators :as gen :include-macros true]
            [ctim.domain.id :as id]
            [ctim.schemas.common :refer [Observable]]
            [ctim.schemas.feedback :refer [Feedback]]
            [ctim.schemas.verdict :refer [Verdict]]
            [ctim.generators.common :refer [generate-entity]]
            [ctim.generators.schemas.actor-generators :as ag]
            [ctim.generators.schemas.campaign-generators :as cg]
            [ctim.generators.schemas.coa-generators :as og]
            [ctim.generators.schemas.exploit-target-generators :as eg]
            [ctim.generators.schemas.feedback-generators :as fg]
            [ctim.generators.schemas.incident-generators :as ig]
            [ctim.generators.schemas.indicator-generators :as ng]
            [ctim.generators.schemas.judgement-generators :as jg]
            [ctim.generators.schemas.sighting-generators :as sg]
            [ctim.generators.schemas.ttp-generators :as tg]))

(defn gen-new-indicator-with-new-sightings [url-params-fn]
  (gen/let [indicator ng/gen-new-indicator-with-id
            sightings (gen/vector
                       (sg/gen-new-sighting-with-indicator
                        (id/short-id->long-id (:id indicator) url-params-fn))
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

(def entity-types [:actor :campaign :coa :exploit-target :feedback :incident
                   :indicator :judgement :sighting :ttp])

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
