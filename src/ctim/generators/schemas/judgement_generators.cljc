(ns ctim.generators.schemas.judgement-generators
  (:require [clj-momo.lib.time :as time]
            [clojure.test.check.generators :as gen]
            [ctim.schemas.common :as schemas-common]
            [ctim.schemas.judgement :as csj]
            [ctim.generators.common
             :refer [complete leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]
            [flanders.schema :as fs]
            [schema-generators.generators :as seg]))

(def gen-judgement
  (gen/fmap
   (fn [[s id disp]]
     (assoc s
            :id id
            :disposition disp
            :disposition_name (get schemas-common/disposition-map disp)))
   (gen/tuple (seg/generator (fs/get-schema csj/StoredJudgement) leaf-generators)
              (gen-id/gen-short-id-of-type :judgement)
              (gen/choose 1 5))))

(defn gen-new-judgement_ [gen-id]
  (gen/fmap
   (fn [[s id [disp-num disp-num? disp-name?] [start-time end-time]]]
     (cond-> (dissoc s :id :disposition :disposition_name :valid_time)
       id (assoc :id id)

       disp-num?
       (assoc :disposition disp-num)

       disp-name?
       (assoc :disposition_name
              (get schemas-common/disposition-map disp-num))

       start-time (assoc-in [:valid_time :start_time] start-time)
       end-time (assoc-in [:valid_time :end_time] end-time)))
   (gen/tuple
    (seg/generator (fs/get-schema csj/NewJudgement) leaf-generators)
    gen-id
    (gen/tuple (gen/choose 1 5)
               gen/boolean
               gen/boolean)
    ;; complete doesn't seem to generate :valid_time values, so do it manually
    common/gen-valid-time-tuple)))

(def gen-new-judgement
  (gen-new-judgement_
   (maybe (gen-id/gen-short-id-of-type :judgement))))

(def gen-new-judgement-with-id
  (gen-new-judgement_
   (gen-id/gen-short-id-of-type :judgement)))
