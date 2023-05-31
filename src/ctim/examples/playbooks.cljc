(ns ctim.examples.playbooks
  (:require [ctim.schemas.common :as c]
            [ctim.examples.coas :refer [coa-minimal]]))

(def playbook-maximal
  {:id "http://ex.tld/ctia/playbook/playbook-5023697b-3857-4652-9b53-ccda297f9c3e"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["http://ex.tld/ctia/playbook/playbook-other-id"]
   :external_references [{:source_name "source"
                          :external_id "N/A"
                          :url "https://ex.tld/wiki/"
                          :hashes ["#test-hash"]
                          :description "External Description"}]
   :description "Max Playbook Example"
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :tlp "green"

   :title "title"
   :short_description "short-description"

   :source "source"
   :source_uri "http://ex.tld.com"

   :type "playbook"
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}

   :containment [coa-minimal]
   :eradication [coa-minimal]
   :identification [coa-minimal]
   :lessons-learned [coa-minimal]
   :preparation [coa-minimal]
   :recovery [coa-minimal]
   :remedy [coa-minimal]
   :response [coa-minimal]})

(def playbook-minimal
  {:id "http://ex.tld/ctia/playbook/playbook-5023697b-3857-4652-9b53-ccda297f9c3e"
   :type "playbook"
   :schema_version c/ctim-schema-version
   :title "title"
   :description "description"
   :short_description "short description"
   :source "a source"
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}})

(def new-playbook-maximal
  playbook-maximal)

(def new-playbook-minimal
  {:title "title"
   :description "description"
   :short_description "short description"
   :source "a source"})
