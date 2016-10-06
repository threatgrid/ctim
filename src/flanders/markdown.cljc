(ns flanders.markdown
  (:require [clojure.string :as str]
            [clojure.zip :as z]
            [flanders.predicates :as fp]
            [flanders.schema :as fs]
            #?(:clj  [flanders.types]
               :cljs [flanders.types
                      :refer [AnythingType BooleanType EitherType InstType
                              IntegerType KeywordType MapEntry MapType
                              NumberType SequenceOfType StringType]])
            [flanders.utils :as fu])
  #?(:clj (:import [flanders.types
                    AnythingType BooleanType EitherType InstType IntegerType
                    KeywordType MapEntry MapType NumberType SequenceOfType
                    StringType])))

(defprotocol MarkdownNode
  (->markdown-part [node depth])
  (->short-description [node]))

(defn ->default [{:keys [default values]}]
  (when (and default (> (count values) 1))
    (str "* Default: " default "\n")))

(defn ->description [{:keys [description]}]
  (when (seq description)
    (str description "\n\n")))

(defn ->equals [{:keys [values]} loc]
  (when (and (= 1 (count values))
             (not (fp/key loc)))
    (str "* Must equal: " (pr-str (first values)) "\n")))

(defn- ->header [loc & parts]
  (apply str (concat
              (take (inc (count (z/path loc)))
                    (repeat "#"))
              parts
              ["\n\n"])))

(defn- ->entry-header [{:keys [key type]} loc]
  (->header loc
            " MapEntry: "
            (let [key-schema (fs/->schema key (z/down loc))]
              (if (keyword? key-schema)
                key-schema
                (->short-description key)))
            " -> "
            (->short-description type)))

(defn- ->leaf-header [this loc]
  (let [type-str (->short-description this)]
    (if (fp/key loc)
      (->header loc " " type-str " Key")
      (->header loc " " type-str " Value"))))

(defn- ->reference [{:keys [reference]}]
  (when (seq reference)
    (str "* Reference: " reference "\n")))

(defn- ->schema-str [this loc]
  (str "* Plumatic Schema: "
       (pr-str (let [schema (fs/->schema this loc)]
                 (if (fp/sequential? loc)
                   [schema]
                   schema)))
       "\n"))

(defn- ->values [{v :values}]
  (when (and v (> (count v) 1))
    (str "* Allowed Values: " (sort (seq v)) "\n")))

(extend-protocol MarkdownNode
  MapType
  (->markdown-part [this loc]
    (str (if (nil? (z/up loc))
           (->header loc " " (->short-description this))
           (->leaf-header this loc))
         (->description this)
         (->reference this)))
  (->short-description [{name :name}]
    (if (seq name)
      (str "*" name "* Map")
      "Map"))

  MapEntry
  (->markdown-part [{:keys [key required?] :as this} loc]
    (str (->entry-header this loc)
         (->description this)
         (if required?
           "* This entry is required"
           "* This entry is optional") "\n"
         (when (some-> loc z/down z/rightmost z/node fp/sequence-of?)
           "* This entry's type is sequential (allows zero or more values)\n")
         (->reference this)))
  (->short-description [_] "MapEntry")

  SequenceOfType
  (->markdown-part [{:keys [description]} loc]
    nil)
  (->short-description [{:keys [type]}]
    (str "[" (->short-description type) "]"))

  AnythingType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this)
         (->schema-str this loc)
         (->reference this)))
  (->short-description [_] "Anything")

  BooleanType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this)
         (->schema-str this loc)
         (->reference this)))
  (->short-description [_] "Boolean")

  IntegerType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this)
         (->schema-str this loc)
         (->equals this loc)
         (->default this)
         (->values this)
         (->reference this)))
  (->short-description [_] "Integer")

  NumberType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this)
         (->schema-str this loc)
         (->equals this loc)
         (->default this)
         (->values this)
         (->reference this)))
  (->short-description [_] "Number")

  StringType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this)
         (->schema-str this loc)
         (->equals this loc)
         (->default this)
         (->values this)
         (->reference this)))
  (->short-description [_] "String")

  InstType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this)
         (->schema-str this loc)
         (->reference this)))
  (->short-description [_] "Inst (Date)")

  KeywordType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this)
         (->schema-str this loc)
         (->equals this loc)
         (->default this)
         (->values this)
         (->reference this)))
  (->short-description [_] "Keyword")

  EitherType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this)
         (->reference this)
         "* Only one of the following schemas will match\n"))
  (->short-description [_] "Either"))

(defn ->markdown [root]
  (loop [ddl-loc (fu/->ddl-zip root)
         markdown []]
    (if (z/end? ddl-loc)
      (str/join \newline markdown)
      (recur (z/next ddl-loc)
             (if-let [part (->markdown-part (z/node ddl-loc)
                                            ddl-loc)]
               (conj markdown part)
               markdown)))))
