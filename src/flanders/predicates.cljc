(ns flanders.predicates
  (:refer-clojure :exclude [key map? sequential?])
  (:require [clojure.zip :as z]
            [flanders.protocols :as prots]
            #?(:clj  [flanders.types]
               :cljs [flanders.types
                      :refer [EitherType KeywordType MapEntry MapType
                              SequenceOfType]]))
  (:import #?(:clj [flanders.types
                    EitherType KeywordType MapEntry MapType SequenceOfType])))

;; ----------------------------------------------------------------------
;; about nodes
;; ----------------------------------------------------------------------

(def branch? prots/branch?)

(def either? (partial instance? EitherType))

(def entry? (partial instance? MapEntry))

(def map? (partial instance? MapType))

(def leaf? (complement branch?))

(def sequence-of? (partial instance? SequenceOfType))


;; ----------------------------------------------------------------------
;; about zipper locations
;; ----------------------------------------------------------------------

(defn entry
  "If a given loc is pointing at a MapEntry node, return the loc"
  [loc]
  (when (-> loc z/node entry?)
    loc))

(defn leaf
  "If a given loc is pointing at a leaf node, return the loc"
  [loc]
  (when (-> loc z/node leaf?)
    loc))

(defn key
  "If a given loc is pointing at a key node (1st child of an entry),
  return the loc"
  [loc]
  (when (some-> loc z/up entry z/node :key (= (z/node loc)))
    loc))

(defn sequential?
  "Given a loc that is pointing at a leaf-node, look at its parent
  node and see if it is a SequenceOfType"
  [loc]
  (boolean
   (some-> loc
           leaf
           z/up
           z/node
           sequence-of?)))
