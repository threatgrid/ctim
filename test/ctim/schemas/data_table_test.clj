(ns ctim.schemas.data-table-test
  (:require
   [schema.core :as s]
   [clojure.test :refer :all]
   [ctim.schemas.data-table :as dt]
   [ctim.schemas.common :as c]))

(deftest test-base-schema
  (is (s/validate
       dt/DataTable
       {:id "data-table-1"
        :type "data-table"
        :schema_version c/ctim-schema-version
        :columns [{:name "Column1"
                   :type "string"}]
        :rows [["foo"] ["bar"]]}))

  (is (s/validate
       dt/DataTable
       {:id "data-table-1"
        :type "data-table"
        :count 1
        :schema_version c/ctim-schema-version
        :columns [{:name "Column1"
                   :type "string"}]
        :rows [["foo"] ["bar"]]}))


  (is (s/validate
       dt/DataTable
       {:id "data-table-1"
        :type "data-table"
        :count 0
        :schema_version c/ctim-schema-version
        :columns []
        :rows []}
       
       
       )
      "Empty columns and rows")

    (is (s/validate
         dt/DataTable
         {:id "data-table-1"
          :type "data-table"
          :count 0
          :schema_version c/ctim-schema-version
          :columns [{:name "Column1"
                     :type "string"}]
          :rows []}
       
       
       )
      "Empty rows")



  )
