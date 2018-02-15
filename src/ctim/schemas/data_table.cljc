(ns ctim.schemas.data-table
  (:require [ctim.lib.schema :refer [describe]]
            [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type
                                                  def-enum-type
                                                  def-map-type
                                                  def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type
                                                         def-enum-type
                                                         def-map-type
                                                         def-eq]])))

(def type-identifier "data-table")

(def-eq DataTableTypeIdentifier type-identifier)

(def column-type
  #{"observable"
    "string"
    "markdown"
    "integer"
    "number"
    "url"})

(def-enum-type ColumnType column-type)

(def-map-type ColumnDefinition
  (concat
   (f/required-entries
    (f/entry :name f/any-str)
    (f/entry :type ColumnType))
   (f/optional-entries
    (f/entry :description c/Markdown)
    (f/entry :required f/any-bool
             :description "If true, the row entries for this column cannot contain nulls. Defaults to true")
    (f/entry :short_description f/any-str))))

(def Datum
  "A generic data object, this is really limited to the types
  defined in ColumnType"
  f/any)

(def-entity-type DataTable
  "A generic table of data, consisting of types and documented
  columns, and 1 or more rows of data."
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type DataTableTypeIdentifier)
   (f/entry :columns (f/seq-of ColumnDefinition)
            :description "an ordered list of column definitions")
   (f/entry :rows (f/seq-of (f/seq-of Datum))
            :description "an ordered list of rows"))

  (f/optional-entries
   (f/entry :valid_time c/ValidTime)
   (f/entry :row_count f/any-int
            :description "The number of rows in the data table.")))

(def-entity-type NewDataTable
  "Schema for submitting a NewDataTable record"
  (:entries DataTable)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type DataTableTypeIdentifier)
   (f/entry :valid_time c/ValidTime)))

(def-entity-type StoredDataTable
  "A DataTable as stored in the data store"
  (:entries DataTable)
  c/base-stored-entity-entries)

(def DataTableRef
  (c/ref-for-type type-identifier))

(defn check-datatable
  "Check a datatable for potential Column definition mismatches"
  [{:keys [rows columns row_count] :as x}]
  (assert (seq columns) "Empty columns")
  (assert (seq rows) "Empty rows")

  (assert (= (count columns)
             (count rows))
          "Columns spec/rows mismatch")

  (doseq [column-rows rows]
    (let [c (count column-rows)]
      (when (and row_count
                 (not= c row_count))
        (throw (ex-info "Column row count mismatch"
                        {:column column-rows
                         :expected-count row_count
                         :actual-count c}))))) x)
