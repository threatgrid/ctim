(ns ctim.examples.casebooks
  (:require [ctim.schemas.common :as c]
            [ctim.examples.actors :refer [actor-maximal]]
            [ctim.examples.bundles :refer [bundle-maximal]]))

(def observables [{:type "hostname" :value "Demo_Cta"}
                  {:type "amp_computer_guid" :value "68e94bf7-e239-4821-90d6-b7eaa0233443"}
                  {:type "ip" :value "100.213.110.122"}
                  {:type "ip" :value "136.184.130.98"}
                  {:type "mac_address" :value "85:28:cb:6a:21:41"}])

(def casebook-maximal
  {:id "http://ex.tld/ctia/casebook/casebook-599c96cb-9e88-4d19-a3ee-a94802a39660"
   :type "casebook"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["http://ex.tld/ctia/casebook/casebook-599c96cb-9e88-4d19-a3ee-a94802a39660"
                  "http://ex.tld/ctia/casebook/casebook-456"]
   :timestamp #inst "2016-10-01T00:00:00.000-00:00"
   :language "language"
   :title "casebook"
   :description "description"
   :short_description "short description"
   :tlp "green"
   :source "source"
   :source_uri "http://example.com/"
   :observables observables
   :texts [{:type "foo"
            :text "bar"}]
   :bundle bundle-maximal})

(def casebook-minimal
  {:id "http://ex.tld/ctia/casebook/casebook-599c96cb-9e88-4d19-a3ee-a94802a39660"
   :type "casebook"
   :schema_version c/ctim-schema-version})

(def stored-casebook-maximal
  (into casebook-maximal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))

(def stored-casebook-minimal
  (into casebook-minimal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))

(def new-casebook-maximal casebook-maximal)

(def new-casebook-minimal {})
