(ns flanders.schema
  (:refer-clojure :exclude [assoc-in sequential?])
  (:require #?(:clj  [clojure.core :as core]
               :cljs [cljs.core :as core])
            #?(:clj  [clojure.core.match :refer [match]]
               :cljs [cljs.core.match :refer-macros [match]])
            [clojure.zip :as z]
            [flanders.predicates :as fp]
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
  (->schema [node loc]
    "Get the plumatic schema equivalent of this node, given its tree location"))

(defn- describe [schema description]
  (if description
    (ls/describe schema description)
    schema))

(defn- parent-description [loc]
  (some-> loc z/up fp/entry z/node :description))

(extend-protocol SchemaNode
  AnythingType
  (->schema [{:keys [description]} loc]
    (describe
     s/Any
     (or description
         (parent-description loc))))

  BooleanType
  (->schema [{:keys [description open? default] :as _this_} loc]
    (describe
     (match [open? default]
            [true  _] s/Bool
            [_     d] (s/enum d))
     (or description
         (parent-description loc))))

  IntegerType
  (->schema [{:keys [description open? values] :as _this_} loc]
    (describe
     (match [open? (seq values)]
            [true  _  ] s/Int
            [_     nil] s/Int
            :else       (apply s/enum values))
     (or description
         (parent-description loc))))

  NumberType
  (->schema [{:keys [description open? values] :as _this_} loc]
    (describe
     (match [open? (seq values)]
            [true  _  ] s/Num
            [_     nil] s/Num
            :else       (apply s/enum values))
     (or description
         (parent-description loc))))

  StringType
  (->schema [{:keys [description open? values] :as _this_} loc]
    (describe
     (match [open? (seq values)]
            [true  _  ] s/Str
            [_     nil] s/Str
            :else       (apply s/enum values))
     (or description
         (parent-description loc))))

  InstType
  (->schema [{:keys [description]} loc]
    (describe
     s/Inst
     (or description
         (parent-description loc))))

  KeywordType
  (->schema [{:keys [description open? values] :as this} loc]
    (let [key? (some-> loc fp/key boolean)
          schema (match [key? open? (seq values)]
                        [_    true  _         ] s/Keyword
                        [_    _     nil       ] s/Keyword
                        [true false ([k] :seq)] k
                        :else                   (apply s/enum values))]
      (if key?
        schema
        (describe schema
                  (or description
                      (parent-description loc)))))))

(defn- assoc-in [m [k & ks] v]
  (let [assoc (if (integer? k) core/assoc st/assoc)
        m (if (and (nil? m) (integer? k)) [] m)]
    (if ks
      (assoc m k (assoc-in (get m k) ks v))
      (assoc m k v))))

(defn- get-schema-key-path [loc]
  (keep (fn [n]
          (cond
            (fp/entry? n) (let [{:keys [required? key] :as entry} n]
                            ;; this is a little wonky and depends on
                            ;; what may be returned by ->schema
                            ((cond
                               (not required?) s/optional-key
                               :else identity)
                             (->schema key
                                       (-> entry fu/->ddl-zip z/down))))
            (fp/sequence-of? n) 0
            :else nil))
        (z/path loc)))

(defn replace-either-branches-with-any [ddl-root]
  (loop [ddl-loc (fu/->ddl-zip ddl-root)]
    (let [ddl-node (z/node ddl-loc)]
      (cond
        (z/end? ddl-loc)
        (z/root ddl-loc)

        (instance? EitherType ddl-node)
        (recur (z/next
                (z/replace ddl-loc
                           (ft/->AnythingType "Simplified conditional branch"
                                              nil))))

        :else
        (recur (z/next ddl-loc))))))

(defn ->schema-tree [ddl-root]
  (loop [ddl-loc (-> ddl-root
                     replace-either-branches-with-any
                     fu/->ddl-zip)
         schema {}]
    (let [ddl-node (z/node ddl-loc)]
      (cond
        (z/end? ddl-loc)
        schema

        (and (fp/leaf? ddl-node)
             (not (fp/key ddl-loc)))
        (recur (z/next ddl-loc)
               (assoc-in schema
                         (get-schema-key-path ddl-loc)
                         (->schema ddl-node ddl-loc)))

        :else
        (recur (z/next ddl-loc)
               schema)))))

(def get-schema
  (memoize ->schema-tree))
