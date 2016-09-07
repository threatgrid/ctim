(ns ctim.schemas.data-table
  (:require [ctim.lib.schema :refer [describe]]
            [ctim.schemas.common :as c]
            [ctim.schemas.relationships :as rel]
            [ctim.schemas.vocabularies :as v]
            [schema-tools.core :as st]
            [schema.core :as s]))

(s/defschema TypeIdentifier
  (s/enum "data-table"))

(s/defschema ColumnType
  "The type of data in this column."
  (s/enum "observable" "string" "markdown" "integer" "number"
          "url"))

(s/defschema ColumnDefinition
  (st/merge
   {:name s/Str
    :type ColumnType
    }
   (st/optional-keys {:description c/Markdown
                      :required (describe s/Bool
                                          "If true, the row entires for this column cannot contain nulls. Defaults to true")
                      :short_description s/Str})))

(s/defschema Datum
  "A generic data object, this is really limited to the types defined
  in ColumnType"
  s/Any)

(s/defschema DataTable
  "A generic table of data, consisting of types and documented
  columns, and 1 or more rows of data."
  (st/merge
   c/BaseEntity
   c/SourcableObject
   c/DescribableEntity
   {:type TypeIdentifier
    :columns (describe
              [ColumnDefinition]
              "an ordered list of column definitions")
    :rows (describe [[Datum]]
                    "An ordered lists of lists, containing the rows of
     the table.  Each sub-list must have the same number of entries as
     columns defined for the table.  If the column is not required, a
     null can be used as the value for the column.")
    }
   (st/optional-keys
    {:valid_time c/ValidTime
     :count (describe s/Int
                      "The number of rows in the data table.")})))

(s/defschema NewDataTable
  "Schema for submitting ExploitTargets"
  (st/merge
   DataTable
   c/NewBaseEntity
   (st/optional-keys
    {:type TypeIdentifier
     :valid_time c/ValidTime})))

(s/defschema StoredDataTable
  "An exploit-target as stored in the data store"
  (c/stored-schema "data-table" DataTable))
