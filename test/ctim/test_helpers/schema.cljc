(ns ctim.test-helpers.schema
  (:require #?(:clj  [clojure.test :refer [is]]
               :cljs [cljs.test :refer-macros [is]])
            [clojure.spec.alpha :as sp]
            [flanders.schema :refer [->schema]]
            #?(:clj [flanders.spec :refer [->spec]])
            [schema.core :as sc]))

(defn validate-entity
  "Validates an entity against a flanders schema"
  [entity schema]
  (is (sc/validate
       (->schema schema)
       entity))
  #?(:clj (let [t (:type entity)]
            (is (sp/assert
                 (->spec schema "test")
                 entity)))))

(defn validate-entities
  "Validates the supplied [entity schema] with `validate-entity`."
  [& entities-with-schema]
  (doseq [[entity schema] entities-with-schema]
    (validate-entity entity schema)))
