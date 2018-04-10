(ns ctim.examples.feedbacks
  (:require [ctim.schemas.common :as c]))

(def feedback-maximal
  {:id "http://ex.tld/ctia/feedback/feedback-5023697b-3857-4652-9b53-ccda297f9c3e"
   :type "feedback"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["http://ex.tld/ctia/feedback/feedback-5023697b-3857-4652-9b53-ccda297f9c3e"
                  "http://ex.tld/ctia/feedback/feedback-82f9b9b3-0aa4-4676-8254-02deef8aa8ef"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :tlp "green"
   :source "source"
   :source_uri "http://example.com"
   :entity_id "http://ex.tld/ctia/actor/actor-5023697b-3857-4652-9b53-ccda297f9c3e"
   :feedback 0
   :reason "Reason"})

(def feedback-minimal
  {:id "http://ex.tld/ctia/feedback/feedback-5023697b-3857-4652-9b53-ccda297f9c3e"
   :schema_version c/ctim-schema-version
   :type "feedback"
   :entity_id "http://ex.tld/ctia/actor/actor-5023697b-3857-4652-9b53-ccda297f9c3e"
   :feedback 0
   :reason "Reason"})

(def new-feedback-maximal
  feedback-maximal)

(def new-feedback-minimal
  {:entity_id "http://ex.tld/ctia/actor/actor-5023697b-3857-4652-9b53-ccda297f9c3e"
   :feedback 0
   :reason "Reason"})

(def stored-feedback-maximal
  (into feedback-maximal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))

(def stored-feedback-minimal
  (into feedback-minimal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))
