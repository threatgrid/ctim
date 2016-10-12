(ns flanders.schema
  (:refer-clojure :exclude [key])
  (:require #?(:clj  [clojure.core :as core]
               :cljs [cljs.core :as core])
            #?(:clj  [clojure.core.match :refer [match]]
               :cljs [cljs.core.match :refer-macros [match]])
            [clojure.zip :as z]
            [flanders.predicates :as fp]
            [flanders.protocols :as p]
            #?(:clj  [flanders.types :as ft]
               :cljs [flanders.types
                      :as ft
                      :refer [AnythingType BooleanType EitherType InstType
                              IntegerType KeywordType MapEntry MapType
                              NumberType SequenceOfType StringType]])
            [flanders.utils :as fu]
            [ctim.lib.schema :as ls]
            [schema.core :as s]
            [schema-tools.core :as st])
  #?(:clj (:import [flanders.types
                    AnythingType BooleanType EitherType InstType IntegerType
                    KeywordType MapEntry MapType NumberType SequenceOfType
                    StringType])))

(defprotocol SchemaNode
  (->schema [node f]))

(defn- describe [schema description]
  (if description
    (ls/describe schema description)
    schema))

(extend-protocol SchemaNode

  ;; Branches

  EitherType
  (->schema [{:keys [choices tests]} f]
    (let [choice-schemas (map f choices)]
      (apply s/conditional (mapcat vector tests choice-schemas))))

  MapEntry
  (->schema [{:keys [key type required?] :as entry} f]
    [((if (not required?)
        s/optional-key
        identity)
      (f (assoc key
                :key? true
                :description (some :description [key entry]))))
     (f type)])

  MapType
  (->schema [{:keys [description entries]} f]
    (describe
     (reduce (fn [m [k v]]
               (st/assoc m k v))
             {}
             (map f entries))
     description))

  SequenceOfType
  (->schema [{:keys [type]} f]
    [(f type)])

  ;; Leaves

  AnythingType
  (->schema [{:keys [description]} _]
    (describe
     s/Any
     description))

  BooleanType
  (->schema [{:keys [open? default description]} _]
    (describe
     (match [open? default]
            [true  _] s/Bool
            [_     d] (s/enum d))
     description))

  KeywordType
  (->schema [{:keys [description key? open? values] :as node} _]
    (let [kw-schema
          (match [key? open? (seq values)]
                 [_    true  _         ] s/Keyword
                 [_    _     nil       ] s/Keyword
                 [true false ([k] :seq)] k
                 :else                   (apply s/enum values))]
      (if key?
        kw-schema
        (describe kw-schema description))))

  InstType
  (->schema [{:keys [description]} _]
    (describe s/Inst description))

  IntegerType
  (->schema [{:keys [description open? values]} _]
    (describe
     (match [open? (seq values)]
            [true  _  ] s/Int
            [_     nil] s/Int
            :else       (apply s/enum values))
     description))

  NumberType
  (->schema [{:keys [description open? values]} _]
    (describe
     (match [open? (seq values)]
            [true  _  ] s/Num
            [_     nil] s/Num
            :else       (apply s/enum values))
     description))

  StringType
  (->schema [{:keys [description open? values]} _]
    (describe
     (match [open? (seq values)]
            [true  _  ] s/Str
            [_     nil] s/Str
            :else       (apply s/enum values))
     description)))

(defn ->schema-tree
  "Get the Plumatic schema for a DDL node"
  [{:keys [description] :as ddl}]
  (->schema ddl
            ->schema-tree))

(def get-schema
  (memoize ->schema-tree))

(defn- replace-with-any [loc description]
  (z/replace loc
             (ft/map->AnythingType {:description description})))

(defn replace-either-with-any
  "Walks the DDL tree, replacing EitherType nodes with AnythingType nodes"
  [ddl]
  (loop [ddl-loc (fu/->ddl-zip ddl)]
    (cond
      ;; Terminate
      (z/end? ddl-loc)
      (z/root ddl-loc)

      ;; Replace
      (fp/either? (z/node ddl-loc))
      (recur (z/next (replace-with-any ddl-loc
                                       "Simplified conditional branch")))

      ;; Recur
      :else
      (recur (z/next ddl-loc)))))

(defn key
  "Make a node a key, as far as ->schema is concerned"
  [node]
  (assoc node :key? true))
