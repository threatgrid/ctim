(ns ctim.generators.schemas.datatable-generators
  (:require [clj-momo.lib.time :as time]
            [clojure.test.check.generators :as gen]
            [schema-generators.generators :as seg]
            [ctim.schemas.data-table :as dt]
            [ctim.schemas.common :as schemas-common]
            [ctim.generators.common
             :refer [complete leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]
            [flanders.schema :as fs]
            [schema.core :as s]
            [schema-tools.core :as st]
            [ctim.schemas.data-table :as csd]
            [ctim.schemas.common :refer [Observable]]
            [ctim.generators.id :as idgen]))

(def max-rows 100)

(s/defschema BaseDataTable
  "a `StoredDatatable` stripped of the keys we need to fine tune"
  (st/dissoc
   (fs/get-schema csd/StoredDataTable)
   :columns :rows :count))

(s/defschema BaseNewDataTable
  (st/dissoc BaseDataTable :created :modified :owner))

(def gen-observable
  (seg/generator (fs/get-schema Observable)))

(def gen-url idgen/gen-url-id)

(def gen-rows-count
  (gen/such-that #(and (not (nil? %))
                       (> max-rows % 1))
                 gen/pos-int 500))

(defn gen-column-rows [c-def c]
  "given a column definition make c rows"
  (->> (case (:type c-def)
         "observable" (gen/sample (gen/such-that not-empty gen-observable) c)
         "string" (gen/sample gen/string-ascii c)
         "markdown" (gen/sample gen/string-ascii c)
         "integer" (gen/sample gen/int c)
         "number" (gen/sample gen/large-integer c)
         "url" (gen/sample gen-url c))
       (take c)
       vec))

(defn make-rows [columns c]
  "given a columns config vector and a rows
   count int make the rows for each column"
  (map #(gen-column-rows % c) columns))

(def gen-datatable
  "generate an entity that satisfies `StoredDataTable` schema"
  (gen/fmap
   (fn [[s id columns c]]
     (cond-> s
       id (assoc :id id)
       c (assoc :count c)
       columns (assoc :columns columns
                      :rows (make-rows columns c))))

   (gen/tuple (seg/generator BaseDataTable)
              (gen-id/gen-short-id-of-type :data-table)
              (gen/such-that not-empty (common/vector (seg/generator (fs/get-schema csd/ColumnDefinition))))
              gen-rows-count)))

(def gen-new-datatable
  "generate an entity that satisfies `NewDataTable` schema"
  (gen/fmap
   (fn [[s id columns c]]
     (cond-> s
       id (assoc :id id)
       c (assoc :count c)
       columns (assoc :columns columns
                      :rows (make-rows columns c))))

   (gen/tuple (seg/generator BaseNewDataTable)
              (gen-id/gen-short-id-of-type :data-table)
              (gen/such-that not-empty (common/vector (seg/generator (fs/get-schema csd/ColumnDefinition))))
              gen-rows-count)))
