(ns ctim.generators.schemas.ttp-generators
  (:require [clojure.test.check.generators :as gen]
            [ctim.lib.time :as time]
            [ctim.schemas
             [common :as schemas-common]
             [ttp :refer [NewTTP StoredTTP]]]
            [ctim.generators.common
             :refer [complete leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]))

(def gen-ttp
  (gen/fmap
   (fn [id]
     (complete
      StoredTTP
      {:id id}))
   (gen-id/gen-short-id-of-type :ttp)))

(def gen-new-ttp
  (gen/fmap
   (fn [id]
     (complete
      NewTTP
      (cond-> {}
        id (assoc :id id))))
   (maybe (gen-id/gen-short-id-of-type :ttp))))
