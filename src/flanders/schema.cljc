(ns flanders.schema
  (:require [clojure.zip :as z]
            #?(:clj  [flanders.core :as f]
               :cljs [flanders.core :as f
                      :refer [Entity FieldValue FieldEnumValue]])
            [ctim.lib.schema :as lib-schema]
            [schema.core :as s])
  #?(:clj (:import [flanders.core
                    Entity
                    FieldValue
                    FieldEnumValue])))

(defprotocol SchemaNode
  (->schema [node loc]
    "Get the Plumatic schema equivalent of this node, given its tree location"))

(extend-protocol SchemaNode
  FieldValue
  (->schema [{:keys [description many? schema] :as _this_} loc]
    (lib-schema/describe
     (if many?
       [schema]
       schema)
     (or description
         (-> loc z/up z/node :description))))

  FieldEnumValue
  (->schema [{:keys [description open? many? values] :as _this_} loc]
    (lib-schema/describe
     (let [enum-schema (if open?
                         s/Str
                         (apply s/enum values))]
       (if many?
         [enum-schema]
         enum-schema))
     (or description
         (-> loc z/up z/node :description)))))

(defn get-schema-key-path [loc]
  (keep (fn [n]
          (cond
            (f/field? n) (let [{optional? :optional?, {name :name} :key} n]
                           (if optional?
                             (s/optional-key name)
                             (s/required-key name)))
            (f/structure-seq? n) 0
            :else nil))
        (z/path loc)))

(s/defn ->schema-tree :- (s/protocol s/Schema)
  [entity :- Entity]
  (loop [loc (f/tree-zip entity)
         schema {}]
    (let [node (z/node loc)]
      (cond
        (z/end? loc) schema
        (f/structure-seq? node) (recur (z/next loc)
                                       (assoc-in schema
                                                 (get-schema-key-path loc)
                                                 []))
        (f/value? node) (recur (z/next loc)
                               (assoc-in schema
                                         (get-schema-key-path loc)
                                         (->schema node loc)))
        :else (recur (z/next loc)
                     schema)))))
