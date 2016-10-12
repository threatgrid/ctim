(ns flanders.core
  (:refer-clojure :exclude [int key keyword map name num str type])
  (:require #?(:clj  [clojure.core :as core]
               :cljs [cljs.core :as core])
            [clojure.zip :as z]
            [flanders.types :as ft]
            [schema.core :as s]))

;; ----------------------------------------------------------------------
;; Defining Branch Nodes
;; ----------------------------------------------------------------------

(declare key)
(declare enum)
(declare seq-of)

(defn entry [k t & {:keys [required?]
                    :or {required? true}
                    :as opts}]
  (let [k (if (keyword? k) (key k) k)
        t (cond
            (set? t) (enum t)
            (vector? t) (seq-of (first t))
            :else t)]
    (ft/map->MapEntry
     (merge opts
            {:key k
             :type t
             :required? required?}))))

(defn map
  "Make a MapType containing the given entries.
  Note that nothing is done to enforce uniqueness of the entries keys.
  Duplicate keys are handled at the discretion of the fn that is
  walking the DDL tree, though it should be assumed that later
  duplicates replace earlier ones (as when merging maps)."
  [entries & {:as opts}]
  (ft/map->MapType
   (merge opts
          {:entries entries})))

(defn map-of
  "Build a MapType with a map of options followed by lists of entries.
   Useful when composing lists of required-entries, optional-entries,
   and predefined entries."
  [{:as opts}
   & entry-lists]
  (ft/map->MapType
   (merge opts
          {:entries (apply concat entry-lists)})))

(defn seq-of [t & {:as opts}]
  (let [t (cond
                (set? t) (enum t)
                :else t)]
    (ft/map->SequenceOfType
     (merge opts
            {:type t}))))

(defn set-of [t & {:as opts}]
  (ft/map->SetOfType
   (merge opts
          {:type t})))

(defn conditional [& pred+types]
  (assert (even? (count pred+types)) "pred and types must be even")
  (assert (seq pred+types) "must provide pred and types")
  (let [[types tests]
        (loop [[[p t :as p+t] & more] (partition 2 pred+types)
               types []
               tests []]
          (if (nil? p+t) [types tests]
              (recur more
                     (conj types t)
                     (conj tests (let [p (if (= :else p) (constantly true) p)]
                                   #(when (p %) %))))))]
    (ft/map->EitherType {:choices types
                         :tests tests})))

;; ----------------------------------------------------------------------
;; Defining Leaf Nodes
;; ----------------------------------------------------------------------

(defn anything [& {:as opts}]
  (ft/map->AnythingType opts))

(defn bool [& {:keys [equals] :as opts}]
  (ft/map->BooleanType
   (merge opts
          {:open? (not equals)
           :default (when equals equals)})))

(defn inst [& {:as opts}]
  (ft/map->InstType opts))

(defn int [& {:keys [equals] :as opts}]
  (ft/map->IntegerType
   (merge opts
          {:open? (not equals)
           :values (when equals #{equals})
           :default (when equals equals)})))

(defn num [& {:keys [equals] :as opts}]
  (ft/map->NumberType
   (merge opts
          {:open? (not equals)
           :values (when equals #{equals})
           :default (when equals equals)})))

(defn keyword [& {:keys [equals] :as opts}]
  (ft/map->KeywordType
   (merge opts
          {:open? (not equals)
           :values (when equals #{equals})
           :default (when equals equals)})))

(defn key [equals & {:as opts}]
  (ft/map->KeywordType
   (merge opts
          {:open? false
           :values #{equals}
           :default equals})))

(defn str [& {:keys [equals] :as opts}]
  (ft/map->StringType
   (merge opts
          {:open? (not equals)
           :values (when equals #{equals})
           :default (when equals equals)})))

(defn enum [values & {:keys [open?]
                      :or {open? false}
                      :as opts}]
  (let [v (first values)]
    (cond
      (integer? v) (ft/map->IntegerType (merge opts {:values values :open? open?}))
      (number? v)  (ft/map->NumberType  (merge opts {:values values :open? open?}))
      (keyword? v) (ft/map->KeywordType (merge opts {:values values :open? open?}))
      (string? v)  (ft/map->StringType  (merge opts {:values values :open? open?})))))

(defn eq [value & {:keys [description reference comment usage]}]
  (enum #{value}
        :open? false
        :default value
        :description description
        :reference reference
        :comment comment
        :usage usage))

(def any (anything))

(def any-bool (bool))

(def any-int (int))

(def any-num (num))

(def any-inst (inst))

(def any-keyword (keyword))

(def any-str (str))

(def any-string-seq (seq-of any-str))

(def any-str-seq any-string-seq) ;; alias

;; ----------------------------------------------------------------------
;; Helpers
;; ----------------------------------------------------------------------

(defn required-entries [& entries]
  (core/map #(assoc % :required? true) entries))

(defn optional-entries [& entries]
  (core/map #(assoc % :required? false) entries))

;; ----------------------------------------------------------------------
;; Macros
;; ----------------------------------------------------------------------

(defmacro def-entity-type [name description & map-entries]
  `(def ~name
     (map-of (if (map? ~description)
               (merge ~description
                      {:name ~(core/str name)})
               {:description ~description
                :name ~(core/str name)})
             ~@map-entries)))

(defmacro def-map-type [name map-entries & {:as opts}]
  `(def ~name
     (map-of (merge ~opts
                    {:name ~(core/str name)})
             ~map-entries)))
