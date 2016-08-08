(ns ctim.generators.schemas.sighting-generators
  (:require [clojure.test.check.generators :as gen]
            [schema-generators.generators :as seg]
            [ctim.lib.time :as time]
            [ctim.schemas.common :as schemas-common]
            [ctim.schemas.sighting :refer [NewSighting StoredSighting]]
            [ctim.generators.common
             :refer [leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]))

(def gen-short-id
  (gen-id/gen-short-id-of-type :sighting))

(def gen-sighting
  (gen/fmap
   (fn [[s id]]
     (assoc (dissoc s :relations) :id id))
   (gen/tuple (seg/generator StoredSighting leaf-generators)
              gen-short-id)))

(defn gen-sighting-with-observables [observables]
  (gen/fmap
   (fn [[s id]]
     (assoc (dissoc s :relations)
            :id id
            :observables observables))
   (gen/tuple (seg/generator StoredSighting leaf-generators)
              gen-short-id)))

(defn gen-new-sighting-with-indicator [indicator-long-id]
  (gen/fmap
   (fn [[s id]]
     (assoc (dissoc s :relations)
            :id id
            :indicators [{:indicator_id indicator-long-id}]))
   (gen/tuple (seg/generator NewSighting leaf-generators)
              gen-short-id)))

(def gen-new-sighting
  (gen/fmap
   (fn [[s id]]
     (if id
       (assoc s :id id)
       (dissoc s :id)))
   (gen/tuple
    (seg/generator NewSighting)
    (maybe gen-short-id))))


