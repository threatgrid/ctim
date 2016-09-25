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

(defn entry [key_ type_ & {:keys [description reference required?]
                         :or {required? true}}]
  (let [key_ (if (keyword? key_) (key key_) key_)
        type_ (cond
                (set? type_) (enum type_)
                (vector? type_) (seq-of (first type_))
                :else type_)]
    (ft/->MapEntry key_ type_ required? description reference)))

(defn map
  "Make a MapType containing the given entries.
  Note that nothing is done to enforce uniqueness of the entries keys.
  Duplicate keys are handled at the discretion of the fn that is
  walking the DDL tree, though it should be assumed that later
  duplicates replace earlier ones (as when merging maps)."
  [entries & {:keys [description name reference]}]
  (ft/->MapType entries name description reference))

(defn map-of
  "Build a MapType with a map of options followed by lists of entries.
   Useful when composing lists of required-entries, optional-entries,
   and predefined entries."
  [{:keys [description name reference]}
   & field-lists]
  (ft/->MapType (apply concat field-lists) name description reference))

(defn seq-of [type_ & {:keys [description reference]}]
  (let [type_ (cond
                (set? type_) (enum type_)
                :else type_)]
    (ft/->SequenceOfType type_ description reference)))

;; ----------------------------------------------------------------------
;; Defining Leaf Nodes
;; ----------------------------------------------------------------------

(defn anything [& {:keys [description reference]}]
  (ft/->AnythingType description reference))

(defn bool [& {:keys [description equals reference]}]
  (ft/map->BooleanType {:description description
                        :open? (not equals)
                        :default (when equals equals)
                        :reference reference}))

(defn inst [& {:keys [description reference]}]
  (ft/->InstType description reference))

(defn int [& {:keys [description equals reference]}]
  (ft/map->IntegerType {:description description
                        :open? (not equals)
                        :values (when equals #{equals})
                        :default (when equals equals)
                        :reference reference}))

(defn num [& {:keys [description equals reference]}]
  (ft/map->NumberType {:description description
                       :open? (not equals)
                       :values (when equals #{equals})
                       :default (when equals equals)
                       :reference reference}))

(defn keyword [& {:keys [description equals reference]}]
  (ft/map->KeywordType {:description description
                        :open? (not equals)
                        :values (when equals #{equals})
                        :default (when equals equals)
                        :reference reference}))

(defn key [equals & {:keys [description reference]}]
  (ft/map->KeywordType {:description description
                        :open? false
                        :values #{equals}
                        :default equals
                        :reference reference}))

(defn str [& {:keys [description equals reference]}]
  (ft/map->StringType {:description description
                       :open? (not equals)
                       :values (when equals #{equals})
                       :default (when equals equals)
                       :reference reference}))

(defn enum [values & {:keys [open?]
                      :or {open? false}
                      :as opts}]
  (let [v (first values)]
    (cond
      (integer? v) (ft/map->IntegerType (merge opts {:values values :open? open?}))
      (number? v)  (ft/map->NumberType  (merge opts {:values values :open? open?}))
      (keyword? v) (ft/map->KeywordType (merge opts {:values values :open? open?}))
      (string? v)  (ft/map->StringType  (merge opts {:values values :open? open?})))))

(defn eq [value & {:keys [description reference]}]
  (enum #{value}
        :open? false
        :default value
        :description description
        :reference reference))

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
