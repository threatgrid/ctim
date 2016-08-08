(ns ctim.generators.schemas.ttp-generators
  (:require [clojure.test.check.generators :as gen]
            [schema-generators.generators :as seg]
            [ctim.lib.time :as time]
            [ctim.schemas.common :as schemas-common]
            [ctim.schemas.ttp :refer [NewTTP StoredTTP]]
            [ctim.generators.common
             :refer [complete leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]))

(def gen-ttp
  (gen/fmap
   (fn [[s id]]
     (assoc s :id id))
   (gen/tuple (seg/generator StoredTTP)
              (gen-id/gen-short-id-of-type :ttp))))

(def gen-new-ttp
  (gen/fmap
   (fn [[s id]]
     (cond-> (dissoc s :id)
       id (assoc :id id)))
   (gen/tuple
    (seg/generator NewTTP)
    (gen-id/gen-short-id-of-type :ttp))))
