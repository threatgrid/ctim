(ns ctim.generators.schemas.feedback-generators
  (:require [clojure.test.check.generators :as gen]
            [schema-generators.generators :as seg]
            [ctim.lib.time :as time]
            [ctim.schemas.feedback :refer [NewFeedback StoredFeedback]]
            [ctim.schemas.common :as schemas-common]
            [ctim.generators.common
             :refer [complete leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]))

(def gen-feedback
  (gen/fmap
   (fn [[s id]]
     (assoc s :id id))
   (gen/tuple (seg/generator StoredFeedback)
              (gen-id/gen-short-id-of-type :feedback))))

(def gen-new-feedback
  (gen/fmap
   (fn [[s id e-id [start-time end-time]]]
     (cond-> (dissoc s :id :judgement_id)
       id (assoc :id id)
       e-id (assoc :entity_id e-id)))
   (gen/tuple
    (seg/generator NewFeedback)
    (gen-id/gen-short-id-of-type :feedback)
    (gen-id/gen-short-id-of-type :judgement))))
