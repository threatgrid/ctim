(ns ctim.test-helpers.generators.schemas.ttp-generators
  (:require [clojure.test.check.generators :as gen]
            [ctim.lib.time :as time]
            [ctim.schemas
             [common :as schemas-common]
             [ttp :refer [NewTTP StoredTTP]]]
            [ctim.test-helpers.generators.common
             :refer [complete leaf-generators maybe]
             :as common]
            [ctim.test-helpers.generators.id :as gen-id]))

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
