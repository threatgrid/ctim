(ns ctim.schemas.data-table-test
  (:require
   [schema.core :as s]
   [flanders.schema :as fs]
   #?(:clj [clojure.test :refer [deftest testing is use-fixtures]]
      :cljs [cljs.test :refer-macros [deftest testing is use-fixtures]])
   [ctim.schemas.common :as c]
   [ctim.schemas.data-table :as dt]))

(use-fixtures :once (fn [t] (s/with-fn-validation (t))))

(deftest test-datatable-schema
  (testing "a valid datatable shall pass validation"
    (let [t {:id "data-table-1"
             :type "data-table"
             :row_count 1
             :schema_version c/ctim-schema-version
             :columns [{:name "Column1"
                        :type "string"}
                       {:name "Column2"
                        :type "string"}]
             :rows [["foo"] ["bar"]]}]

      (is (s/validate (fs/->schema-tree dt/DataTable) t))
      (is (dt/check-datatable t))))

  (testing "a datatable with mismatching column config shall throw"
    (let [t {:id "data-table-1"
             :type "data-table"
             :schema_version c/ctim-schema-version
             :row_count 1
             :columns [{:name "Column1"
                        :type "string"}]
             :rows [["foo"] ["bar"]]}]
      (is (s/validate (fs/->schema-tree dt/DataTable) t))
      (is (= "Assert failed: Columns spec/rows mismatch\n(= (count columns) (count rows))"
             (try (dt/check-datatable t)
                  (catch java.lang.AssertionError e (.getMessage e)))))))

  (testing "a datatable with empty rows shall fail validation"
    (let [t {:id "data-table-1"
             :type "data-table"
             :schema_version c/ctim-schema-version
             :row_count 0
             :columns []
             :rows []}]
      (is (s/validate (fs/->schema-tree dt/DataTable) t))
      (is (= "Assert failed: Empty columns\n(seq columns)"
             (try (dt/check-datatable t)
                  (catch java.lang.AssertionError e (.getMessage e)))))))

  (testing "a datatable with no rows shall fail validation"
    (let [t {:id "data-table-1"
             :type "data-table"
             :schema_version c/ctim-schema-version
             :row_count 0
             :columns [{:name "Column1"
                        :type "string"}]
             :rows []}]
      (is (s/validate (fs/->schema-tree dt/DataTable) t))
      (is (= "Assert failed: Empty rows\n(seq rows)"
             (try (dt/check-datatable t)
                  (catch java.lang.AssertionError e (.getMessage e)))))))

  (testing "a datatable with mismatching row row_count shall fail validation"
    (let [t {:id "data-table-1"
             :type "data-table"
             :schema_version c/ctim-schema-version
             :row_count 2
             :columns [{:name "Column1"
                        :type "string"}]
             :rows [["foo"]]}]
      (is (s/validate (fs/->schema-tree dt/DataTable) t))
      (is (= "Column row count mismatch"
             (try (dt/check-datatable t)
                  (catch clojure.lang.ExceptionInfo e (.getMessage e))))))))
