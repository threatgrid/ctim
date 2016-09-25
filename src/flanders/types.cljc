(ns flanders.types
  (:refer-clojure :exclude [defrecord type])
  (:require #?(:clj  [flanders.macros :refer [defleaf]]
               :cljs [flanders.macros :refer-macros [defleaf]])
            [flanders.protocols :refer [TreeNode]]
            #?(:clj  [schema.core :as s :refer [defrecord]]
               :cljs [schema.core :as s :refer-macros [defrecord]])))

(defrecord MapEntry [key :- (s/protocol TreeNode)
                     type :- (s/protocol TreeNode)
                     required? :- s/Bool
                     description :- s/Str
                     reference :- s/Str]
  TreeNode
  (branch? [_] true)
  (node-children [_] (list key type))
  (make-node [_ [new-key new-type]]
    (MapEntry. new-key new-type required? description reference)))

(defrecord MapType [entries :- [MapEntry]
                    name :- s/Str
                    description :- s/Str
                    reference :- s/Str]
  TreeNode
  (branch? [_] true)
  (node-children [_] (seq entries))
  (make-node [_ new-entries]
    (MapType. new-entries name description reference)))

(defrecord SequenceOfType [type :- (s/protocol TreeNode)
                           description :- s/Str
                           reference :- s/Str]
  TreeNode
  (branch? [_] true)
  (node-children [_] (list type))
  (make-node [_ new-type]
    (SequenceOfType. new-type description reference)))

(defleaf AnythingType [description :- s/Str
                       reference :- s/Str])

(defleaf BooleanType [default :- (s/maybe s/Bool)
                      open? :- s/Bool
                      description :- s/Str
                      reference :- s/Str])

(defleaf IntegerType [values :- (s/maybe #{s/Int})
                      default :- (s/maybe s/Int)
                      open? :- s/Bool
                      description :- s/Str
                      reference :- s/Str])

(defleaf NumberType [values :- (s/maybe #{s/Int})
                     default :- (s/maybe s/Int)
                     open? :- s/Bool
                     description :- s/Str
                     reference :- s/Str])

(defleaf StringType [values :- (s/maybe #{s/Str})
                     default :- (s/maybe s/Str)
                     open? :- s/Bool
                     description :- s/Str
                     reference :- s/Str])

(defleaf InstType [description :- s/Str
                   reference :- s/Str])

(defleaf KeywordType [values :- (s/maybe #{s/Keyword})
                      default :- (s/maybe s/Keyword)
                      open? :- s/Bool
                      description :- s/Str
                      reference :- s/Str])
