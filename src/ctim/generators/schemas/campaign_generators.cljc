(ns ctim.generators.schemas.campaign-generators
  (:require [clj-momo.lib.time :as time]
            [clojure.test.check.generators :as gen]
            [ctim.schemas.campaign :as csc]
            [ctim.schemas.common :as schemas-common]
            [ctim.generators.common
             :refer [complete leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]
            [flanders.schema :as fs]
            [schema-generators.generators :as seg]))

(def gen-campaign
  (gen/fmap
   (fn [[s id]]
     (assoc s :id id))
   (gen/tuple (seg/generator (fs/get-schema csc/StoredCampaign))
              (gen-id/gen-short-id-of-type :campaign))))

(def gen-new-campaign
  (gen/fmap
   (fn [[s id [start-time end-time]]]
     (cond-> (dissoc s :id)
       id (assoc :id id)
       start-time (assoc-in [:valid_time :start_time] start-time)
       end-time (assoc-in [:valid_time :end_time] end-time)))
   (gen/tuple
    (seg/generator (fs/get-schema csc/NewCampaign))
    (maybe (gen-id/gen-short-id-of-type :campaign))
    ;; complete doesn't seem to generate :valid_time values, so do it manually
    common/gen-valid-time-tuple)))
