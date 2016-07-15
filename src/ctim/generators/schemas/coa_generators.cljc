(ns ctim.generators.schemas.coa-generators
  (:require [clojure.test.check.generators :as gen]
            [schema-generators.generators :as seg]
            [ctim.lib.time :as time]
            [ctim.schemas.coa :refer [NewCOA StoredCOA]]
            [ctim.schemas.common :as schemas-common]
            [ctim.generators.common
             :refer [complete leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]))

(def gen-coa
  (gen/fmap
   (fn [[s id]]
     (assoc s :id id))
   (gen/tuple (seg/generator StoredCOA)
              (gen-id/gen-short-id-of-type :coa))))

(def gen-new-coa
  (gen/fmap
   (fn [[s id [start-time end-time]]]
     (cond-> (dissoc s :id :valid_time :type)
       id (assoc :id id)
       start-time (assoc-in [:valid_time :start_time] start-time)
       end-time (assoc-in [:valid_time :end_time] end-time)))
   (gen/tuple
    (seg/generator NewCOA)
    (maybe (gen-id/gen-short-id-of-type :coa))
    ;; complete doesn't seem to generate :valid_time values, so do it manually
    common/gen-valid-time-tuple)))
