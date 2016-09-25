(ns ctim.generators.schemas.actor-generators
  (:require [clj-momo.lib.time :as time]
            [clojure.test.check.generators :as gen]
            [schema-generators.generators :as seg]
            [ctim.schemas.actor :as csa]
            [ctim.schemas.common :as schemas-common]
            [ctim.generators.common
             :refer [complete leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]
            [flanders.schema :as fs]))

(def gen-actor
  (gen/fmap
   (fn [[s id]]
     (assoc s :id id))
   (gen/tuple (seg/generator (fs/get-schema csa/StoredActor))
              (gen-id/gen-short-id-of-type :actor))))

(def gen-new-actor
  (let [NewActor (fs/get-schema csa/NewActor)]
    (gen/fmap
     (fn [[s id [start-time end-time]]]
       (cond-> (dissoc s :id :valid_time)
         id (assoc :id id)
         start-time (assoc-in [:valid_time :start_time] start-time)
         end-time (assoc-in [:valid_time :end_time] end-time)))
     (gen/tuple
      (seg/generator (fs/get-schema csa/NewActor))
      (maybe (gen-id/gen-short-id-of-type :actor))
      ;; complete doesn't seem to generate :valid_time values, so do it manually
      common/gen-valid-time-tuple))))
