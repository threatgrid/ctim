(ns ctim.generators.schemas.relationship-generators
  (:require [clj-momo.lib.time :as time]
            [clojure.test.check.generators :as gen]
            [schema-generators.generators :as seg]
            [ctim.schemas.relationship :as csr]
            [ctim.schemas.common :as schemas-common]
            [ctim.generators.common
             :refer [complete leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]
            [flanders.schema :as fs]))

(def gen-relationship
  (gen/fmap
   (fn [[s id]]
     (assoc s :id id))
   (gen/tuple (seg/generator (fs/get-schema csr/StoredRelationship))
              (gen-id/gen-short-id-of-type :relationship))))

(def gen-new-relationship
  (gen/fmap
   (fn [[s id [start-time end-time]]]
     (cond-> (dissoc s :id :valid_time)
       id (assoc :id id)))
   (gen/tuple
    (seg/generator (fs/get-schema csr/NewRelationship))
    (maybe (gen-id/gen-short-id-of-type :relationship)))))
