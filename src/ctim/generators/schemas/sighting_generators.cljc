(ns ctim.generators.schemas.sighting-generators
  (:require [clj-momo.lib.time :as time]
            [clojure.test.check.generators :as gen]
            [ctim.schemas.common :as schemas-common]
            [ctim.schemas.sighting :refer [NewSighting StoredSighting]]
            [ctim.generators.common
             :refer [leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]
            [schema-generators.generators :as seg]))

;; a sighting needs either observables or indicators
;; we set a default vec of observables to make sure it passes
;; non schema validation

(def default-observables
  [{:type "ip" :value "1.2.3.4"}])

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
     (cond-> (dissoc s :id :relations)
       (and (empty? (:observables s))
            (empty? (:indicators s))) (assoc :observables default-observables)
       id (assoc :id id)))
   (gen/tuple
    (seg/generator NewSighting)
    (maybe gen-short-id))))
