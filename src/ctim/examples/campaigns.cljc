(ns ctim.examples.campaigns
  (:require [ctim.schemas.common :as c]))

(def campaign-maximal
  {:id "http://ex.tld/ctia/campaign/campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
   :type "campaign"
   :names ["foo" "bar"]
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["http://ex.tld/ctia/campaign/campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
                  "http://ex.tld/ctia/campaign/campiagn-20e0b949-2bbe-4b5d-8916-dd1cf5acd7d8"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :title "campaign"
   :description "description"
   :short_description "short description"
   :source "source"
   :source_uri "http://example.com/"
   :tlp "red"
   :campaign_type "anything goes here"
   :intended_effect ["Theft"]
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2016-07-11T00:40:48.212-00:00"}
   :status "Future"
   :confidence "High"
   :activity [{:date_time #inst "2016-02-11T00:40:48.212-00:00"
               :description "activity"}]})

(def campaign-minimal
  {:id "http://ex.tld/ctia/campaign/campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
   :type "campaign"
   :schema_version c/ctim-schema-version
   :title "campaign"
   :description "description"
   :short_description "short description"
   :campaign_type "anything goes here"
   :valid_time {}})

(def new-campaign-maximal
  {:id "http://ex.tld/ctia/campaign/campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
   :type "campaign"
   :names ["foo" "bar"]
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["http://ex.tld/ctia/campaign/campaign-b1f8e40a-0e99-48fc-bb12-32a65421cfb5"
                  "http://ex.tld/ctia/campaign/campiagn-20e0b949-2bbe-4b5d-8916-dd1cf5acd7d8"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :language "language"
   :title "campaign"
   :description "description"
   :short_description "short description"
   :source "source"
   :source_uri "http://example.com/"
   :tlp "red"
   :campaign_type "anything goes here"
   :intended_effect ["Theft"]
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2016-07-11T00:40:48.212-00:00"}
   :status "Future"
   :confidence "High"
   :activity [{:date_time #inst "2016-02-11T00:40:48.212-00:00"
               :description "activity"}]})

(def new-campaign-minimal
  {:title "campaign"
   :description "description"
   :short_description "short description"
   :campaign_type "anything goes here"})
