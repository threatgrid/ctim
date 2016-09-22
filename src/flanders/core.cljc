(ns flanders.core
  (:refer-clojure :exclude [key name type])
  (:require [clojure.zip :as z]
            [schema.core :as s]))

;; - RECORDS -------------------------------------------
;; define the tree nodes

(defprotocol TreeNode
  (branch? [node] "Can the node have children?")
  (node-children [node] "Get the children of this node")
  (make-node [node children] "Make a new node with updated children"))

(extend-type #?(:clj Object :cljs object) TreeNode
   (branch? [_] false)
   (node-children [node] nil)
   (make-node [node children] node))

(defrecord Entity [name type description fields]
  TreeNode
  (branch? [_] true)
  (node-children [_]
    (seq fields))
  (make-node [_ new-fields]
    (Entity. name type description new-fields)))

(defrecord AnonStructure [fields many?]
  TreeNode
  (branch? [_] true)
  (node-children [entity]
    (seq fields))
  (make-node [_ new-fields]
    (AnonStructure. new-fields many?)))

(defrecord Field [key value description optional?]
  TreeNode
  (branch? [_] true)
  (node-children [_]
    (list key value))
  (make-node [_ kv]
    (Field. (nth kv 0) (nth kv 1) description optional?)))

(defrecord FieldKey [name])

(defrecord FieldValue [schema many? description])

(defrecord FieldEnumValue [values many? description default open?])


;; - HELPERS -------------------------------------------
;; for building and working with trees

(defn tree-zip
  [root]
  (z/zipper branch? node-children make-node root))

(defn entity
  [& {:keys [name type description fields]
      :or {description ""}}]
  (Entity. name type description fields))

(def entity? (partial instance? Entity))

(defn structure [fields & {:keys [many?]
                           :or {many? false}}]
  (AnonStructure. fields many?))

(defn structure-seq [fields]
  (AnonStructure. fields true))

(def structure? (partial instance? AnonStructure))

(def structure-seq? (every-pred structure? :many?))

(defn key [name]
  (FieldKey. name))

(def key? (partial instance? FieldKey))

(defn value [schema & {:keys [many? description]
                       :or {many? false}}]
  (FieldValue. schema many? description))

(defn value-seq [schema & {:keys [description]}]
  (FieldValue. schema true description))

(def value_? (partial instance? FieldValue))

(defn enum [values & {:keys [many? description default open?]
                      :or {many? false
                           description ""
                           default nil
                           open? false}}]
  (FieldEnumValue. values many? description default open?))

(def enum? (partial instance? FieldEnumValue))

(def value? (some-fn value_? enum?))

(defn field
  [kv & {:keys [description optional?]
         :or {optional? false
              description ""}}]
  (let [[k v] (first kv)]
    (->Field (cond
               (keyword? k) (key k)
               (string? k) (key (keyword k))
               :else k)
             (cond
               (satisfies? s/Schema v) (value v :many? false)
               :else v)
             description
             optional?)))

(def field? (partial instance? Field))

(defn required-fields [& fields]
  (map #(assoc % :optional? false) fields))

(defn optional-fields [& fields]
  (map #(assoc % :optional? true) fields))
