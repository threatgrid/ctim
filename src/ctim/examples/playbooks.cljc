(ns ctim.examples.playbooks
  (:require [ctim.schemas.common :as c]
            [ctim.examples.coas :refer [coa-minimal]]))

(def playbook-maximal
  {:id "http://ex.tld/ctia/playbook/playbook-5023697b-3857-4652-9b53-ccda297f9c3e" ;; base-entity-entries fields
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

   :title "title" ;; additional describable-entity-entries
   :short_description "short-description"

   :source "source" ;; additional sourcable-entity-entries
   :source_uri "http://ex.tld.com"

   :type "playbook"
   :valid_time c/ValidTime ;; additional Playbook entries

   :containment [coa-minimal] ;; additional playbook-stage-entries
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
   :valid_time c/ValidTime})

(def new-playbook-maximal
  playbook-maximal)

(def new-playbook-minimal
  {:title "title"
   :description "description"
   :short_description "short description"
   :source "a source"})
