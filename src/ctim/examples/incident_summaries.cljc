(ns ctim.examples.incident-summaries
  (:require [ctim.schemas.common :as c]))

(def incident-summary-maximal
  {:id "http://ex.tld/ctia/incident-summary/incident-summary-2805d697-66b3-4e14-9b32-179e7a72eab6"
   :type "incident-summary"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids [(str "http://ex.tld/ctia/incident-summary/incident-summary-"
                       "f867a601-ac76-4491-a0d6-51968c9f9021")
                  (str "http://ex.tld/ctia/incident-summary/incident-summary-"
                       "53468a66-5d95-49b5-88ec-454bdf894db9")]
   :external_references [{:source_name "source"
                          :external_id "T1067"
                          :url "https://ex.tld/wiki/T1067"
                          :hashes ["#section1"]
                          :description "Description text"}]
   :timestamp #inst "2017-10-23T19:25:27.278-00:00"
   :language "language"
   :title "incident-summary-title"
   :description "description"
   :short_description "short desc"
   :source "a source"
   :source_uri "http://example.com/somewhere-else"
   :tlp "green"})

(def incident-summary-minimal
  {:id "http://ex.tld/ctia/incident-summary/incident-summary-2805d697-66b3-4e14-9b32-179e7a72eab6"
   :source "a source"
   :schema_version c/ctim-schema-version
   :type "incident-summary"})

(def new-incident-summary-maximal
  incident-summary-maximal)

(def new-incident-summary-minimal
  {:source "a source"})
