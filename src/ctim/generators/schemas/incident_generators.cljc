(ns ctim.generators.schemas.incident-generators
  (:require [clj-momo.lib.time :as time]
            [clojure.test.check.generators :as gen]
            [ctim.schemas.common :as schemas-common]
            [ctim.schemas.incident :refer [NewIncident StoredIncident]]
            [ctim.generators.common
             :refer [complete leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]
            [schema-generators.generators :as seg]))

(def gen-incident
  (gen/fmap
   (fn [[s id]]
     (assoc s :id id))
   (gen/tuple (seg/generator StoredIncident)
              (gen-id/gen-short-id-of-type :incident))))


(def gen-new-incident
  (gen/fmap
   (fn [[s id [start-time end-time]]]
     (cond-> (dissoc s :id :valid_time)
       id (assoc :id id)
       start-time (assoc-in [:valid_time :start_time] start-time)
       end-time (assoc-in [:valid_time :end_time] end-time)))
   (gen/tuple
    (seg/generator NewIncident)
    (maybe (gen-id/gen-short-id-of-type :incident))
    ;; complete doesn't seem to generate :valid_time values, so do it manually
    common/gen-valid-time-tuple)))
