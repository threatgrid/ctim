(ns ctim.generators.schemas.campaign-generators
  (:require [clojure.test.check.generators :as gen]
            [schema-generators.generators :as seg]
            [ctim.lib.time :as time]
            [ctim.schemas.campaign :refer [NewCampaign StoredCampaign]]
            [ctim.schemas.common :as schemas-common]
            [ctim.generators.common
             :refer [complete leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]))

(def gen-campaign
  (gen/fmap
   (fn [[s id]]
     (assoc s :id id))
   (gen/tuple (seg/generator StoredCampaign) (gen-id/gen-short-id-of-type :campaign))))

(def gen-new-campaign
  (gen/fmap
   (fn [[s id [start-time end-time]]]
     (cond-> (dissoc s :id)
       id (assoc :id id)
       start-time (assoc-in [:valid_time :start_time] start-time)
       end-time (assoc-in [:valid_time :end_time] end-time)))
   (gen/tuple
    (seg/generator NewCampaign)
    (maybe (gen-id/gen-short-id-of-type :campaign))
    ;; complete doesn't seem to generate :valid_time values, so do it manually
    common/gen-valid-time-tuple)))
