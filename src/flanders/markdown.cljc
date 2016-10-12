(ns flanders.markdown
  (:require [clojure.string :as str]
            [clojure.zip :as z]
            #?(:clj  [flanders.macros :refer [defleaf]]
               :cljs [flanders.macros :refer-macros [defleaf]])
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

(defleaf ReferenceNode [text anchor jump-anchor])

(defn ->default [{:keys [default values]}]
  (when (and default (> (count values) 1))
    (str "  * Default: " default "\n")))

(defn ->description
  ([node]
   (->description node false))
  ([{:keys [description]} leaf?]
   (when (seq description)
     (str (if leaf? "  * " "")
          description
          (if leaf? "\n" "\n\n")))))

(defn ->reference
  ([node]
   (->reference node false))
  ([{:keys [reference]} leaf?]
   (when (seq reference)
     (str (if leaf? "  *" "*")
          " Reference: "
          (if (vector? reference)
            (str/join ", " reference)
            reference)
          "\n"))))

(defn ->equals [{:keys [values]} loc]
  (when (and (= 1 (count values))
             (not (fp/key loc)))
    (str "  * Must equal: " (pr-str (first values)) "\n")))

(defn- ->header [loc & parts]
  (apply str (concat
              (take (inc (count (z/path loc)))
                    (repeat "#"))
              parts
              ["\n\n"])))

(defn- ->entry-header [{:keys [key type]} loc]
  (->header loc
            " MapEntry "
            (let [key-schema (fs/->schema (fs/key key))]
              (if (keyword? key-schema)
                key-schema
                (->short-description key)))
            " ∷ "
            (->short-description type)))

(defn- ->leaf-header [this loc]
  (let [type-str (->short-description this)]
    (if (fp/key loc)
      (str "* " type-str " Key\n")
      (str "* " type-str " Value\n"))))

(defn- ->schema-str [this loc]
  (let [schema (pr-str (fs/->schema this))
        schema (cond
                 (str/starts-with? schema "(enum") "(enum ...)"
                 (= "java.lang.String" schema) "Str"
                 :else schema)]
    (str "  * Plumatic Schema: "
         (if (fp/sequential? loc)
           (str "[" schema "]")
           schema)
         "\n")))

(defn- ->values [{v :values}]
  (when (and v (> (count v) 1))
    (str "  * Allowed Values:\n"
         (str/join
           (->> (sort (seq v))
                (map #(str "    * " % "\n")))))))

(defn- ->comment
  ([node]
   (->comment node false))
  ([{:keys [comment]} leaf?]
   (when (seq comment)
     (str (if leaf? "  *" "*")
          " Dev Notes: " comment "\n"))))

(defn- ->usage
  ([node]
   (->usage node false))
  ([{:keys [usage]} leaf?]
   (when (seq usage)
     (str (if leaf? "  *" "*")
          " Usage: " usage "\n"))))

(extend-protocol MarkdownNode
  MapType
  (->markdown-part [{:keys [anchor jump-anchor] :as this} loc]
    (str "<a name=\"" anchor "\"/>\n"
         (if (nil? (z/up loc))
           (->header loc " " (->short-description this))
           (->leaf-header this loc))
         (when jump-anchor
           (str "[return](#" jump-anchor ")\n\n"))
         (->description this)
         (->comment this)
         (->usage this)
         (->reference this)))
  (->short-description [{name :name}]
    (if (seq name)
      (str "*" name "* Map")
      "Map"))

  ReferenceNode
  (->markdown-part [{:keys [text anchor jump-anchor] :as this} loc]
    (str "<a name=\"" anchor "\"/>\n"
         (->leaf-header this loc)
         "  * Details: [" text "](#" jump-anchor ")\n"))
  (->short-description [{:keys [text]}] text)

  MapEntry
  (->markdown-part [{:keys [key required?] :as this} loc]
    (str (->entry-header this loc)
         (->description this)
         (if required?
           "* This entry is required"
           "* This entry is optional") "\n"
         (when (some-> loc z/down z/rightmost z/node fp/sequence-of?)
           "* This entry's type is sequential (allows zero or more values)\n")
         (->comment this)
         (->usage this)
         (->reference this)))
  (->short-description [_] "MapEntry")

  SequenceOfType
  (->markdown-part [{:keys [description]} loc]
    nil)
  (->short-description [{:keys [type]}]
    (str "[" (->short-description type) "]"))

  EitherType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this :leaf)
         (->comment this)
         (->usage this :leaf)
         (->reference this :leaf)
         "  * Only one of the following schemas will match\n"))
  (->short-description [_] "Either")

  AnythingType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this :leaf)
         (->schema-str this loc)
         (->comment this :leaf)
         (->usage this :leaf)
         (->reference this :leaf)))
  (->short-description [_] "Anything")

  BooleanType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this :leaf)
         (->schema-str this loc)
         (->comment this :leaf)
         (->usage this :leaf)
         (->reference this :leaf)))
  (->short-description [_] "Boolean")

  IntegerType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this :leaf)
         (->schema-str this loc)
         (->equals this loc)
         (->default this)
         (->values this)
         (->comment this :leaf)
         (->usage this :leaf)
         (->reference this :leaf)))
  (->short-description [_] "Integer")

  NumberType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this :leaf)
         (->schema-str this loc)
         (->equals this loc)
         (->default this)
         (->values this)
         (->comment this :leaf)
         (->usage this :leaf)
         (->reference this :leaf)))
  (->short-description [_] "Number")

  StringType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this :leaf)
         (->schema-str this loc)
         (->equals this loc)
         (->default this)
         (->values this)
         (->comment this :leaf)
         (->usage this :leaf)
         (->reference this :leaf)))
  (->short-description [_] "String")

  InstType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this :leaf)
         (->schema-str this loc)
         (->comment this :leaf)
         (->usage this :leaf)
         (->reference this :leaf)))
  (->short-description [_] "Inst (Date)")

  KeywordType
  (->markdown-part [this loc]
    (str (->leaf-header this loc)
         (->description this :leaf)
         (->schema-str this loc)
         (->equals this loc)
         (->default this)
         (->values this)
         (->comment this :leaf)
         (->usage this :leaf)
         (->reference this :leaf)))
  (->short-description [_] "Keyword"))

(defn find-maps [ddl-root]
  (loop [current-map-loc (fu/->ddl-zip (assoc ddl-root
                                              :anchor "top"))
         maps-to-walk []
         result-maps []
         map-counter 1]
    (let [node (some-> current-map-loc z/node)
          root-node (some-> current-map-loc z/root)]
      (cond
        ;; terminate
        (nil? current-map-loc)
        result-maps

        ;; end of current map, go to next map
        (z/end? current-map-loc)
        (recur (some-> maps-to-walk first fu/->ddl-zip)
               (rest maps-to-walk)
               (conj result-maps (z/root current-map-loc))
               map-counter)

        ;; map that is not the root, push it
        (and (instance? MapType node)
             (not= node root-node))
        (let [text (->short-description node)
              map-anchor (str "map" map-counter)
              ref-anchor (str map-anchor "-ref")]
          (recur (z/next (z/replace current-map-loc
                                    (->ReferenceNode text ref-anchor map-anchor)))
                 (conj maps-to-walk (assoc node
                                           :anchor map-anchor
                                           :jump-anchor ref-anchor))
                 result-maps
                 (inc map-counter)))

        ;; else go to next location
        :else
        (recur (z/next current-map-loc)
               maps-to-walk
               result-maps
               map-counter )))))

(defn ->markdown [ddl-root]
  (let [[first-map & rest-maps] (find-maps ddl-root)]
    (loop [current-map-loc (fu/->ddl-zip first-map)
           maps-to-walk rest-maps
           markdown []]
      (cond
        ;; terminate
        (nil? current-map-loc)
        (str/join \newline markdown)

        ;; end of current map, go to next map
        (z/end? current-map-loc)
        (recur (some-> maps-to-walk first fu/->ddl-zip)
               (rest maps-to-walk)
               markdown)

        ;; get markdown and then move to next
        :else
        (recur (z/next current-map-loc)
               maps-to-walk
               (if-let [part (->markdown-part (z/node current-map-loc)
                                              current-map-loc)]
                 (conj markdown part)
                 markdown))))))
