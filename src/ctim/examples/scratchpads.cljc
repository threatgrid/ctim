(ns ctim.examples.scratchpads
  (:require [ctim.schemas.common :as c]
            [ctim.examples.actors :refer [actor-maximal]]
            [ctim.examples.bundles :refer [bundle-maximal]]))

(def observables [{:type "hostname" :value "Demo_Cta"}
                  {:type "amp_computer_guid" :value "68e94bf7-e239-4821-90d6-b7eaa0233443"}
                  {:type "ip" :value "100.213.110.122"}
                  {:type "ip" :value "136.184.130.98"}
                  {:type "mac_address" :value "85:28:cb:6a:21:41"}])

(def scratchpad-maximal
  {:id "http://ex.tld/ctia/scratchpad/scratchpad-599c96cb-9e88-4d19-a3ee-a94802a39660"
   :type "scratchpad"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["http://ex.tld/ctia/scratchpad/scratchpad-599c96cb-9e88-4d19-a3ee-a94802a39660"
                  "http://ex.tld/ctia/scratchpad/scratchpad-456"]
   :timestamp #inst "2016-10-01T00:00:00.000-00:00"
   :language "language"
   :title "scratchpad"
   :description "description"
   :short_description "short description"
   :tlp "green"
   :source "source"
   :source_uri "http://example.com/"
   :observables observables
   :texts [{:type "foo"
            :text "bar"}]
   :bundle bundle-maximal})

(def scratchpad-minimal
  {:id "http://ex.tld/ctia/scratchpad/scratchpad-599c96cb-9e88-4d19-a3ee-a94802a39660"
   :type "scratchpad"
   :schema_version c/ctim-schema-version})

(def stored-scratchpad-maximal
  (into scratchpad-maximal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))

(def stored-scratchpad-minimal
  (into scratchpad-minimal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))

(def new-scratchpad-maximal scratchpad-maximal)

(def new-scratchpad-minimal {})
