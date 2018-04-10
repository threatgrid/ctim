(ns ctim.examples.data-tables
  (:require [ctim.schemas.common :as c]))

(def data-table-maximal
  {:id "http://ex.tld/ctia/data-table/data-table-5023697b-3857-4652-9b53-ccda297f9c3e"
   :type "data-table"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["http://ex.tld/ctia/data-table/data-table-5023697b-3857-4652-9b53-ccda297f9c3e"
                  "http://ex.tld/ctia/data-table/data-table-82f9b9b3-0aa4-4676-8254-02deef8aa8ef"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :title "title"
   :description "description"
   :short_description "short description"
   :language "language"
   :tlp "green"
   :source "source"
   :source_uri "http://example.com"
   :columns [{:name "Col1"
              :type "string"
              :description "description"
              :short_description "short description"
              :required true}]
   :rows [["foo"]]
   :row_count 1
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}})

(def data-table-minimal
  {})

(def new-data-table-maximal
  data-table-maximal)

(def new-data-table-minimal
  data-table-minimal)

(def stored-data-table-maximal
  (into data-table-maximal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))

(def stored-data-table-minimal
  (into data-table-minimal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))
