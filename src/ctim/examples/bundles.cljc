(ns ctim.examples.bundles
  (:require
   [ctim.schemas.common :as c]
   [ctim.examples.actors :refer [actor-maximal]]
   [ctim.examples.assets :refer [asset-maximal]]
   [ctim.examples.asset-mappings :refer [asset-mapping-maximal]]
   [ctim.examples.asset-properties :refer [asset-properties-maximal]]
   [ctim.examples.attack-patterns :refer [attack-pattern-maximal]]
   [ctim.examples.campaigns :refer [campaign-maximal]]
   [ctim.examples.coas :refer [coa-maximal]]
   [ctim.examples.data-tables :refer [data-table-maximal]]
   [ctim.examples.feedbacks :refer [feedback-maximal]]
   [ctim.examples.identity-assertions :refer [identity-assertion-maximal]]
   [ctim.examples.incidents :refer [incident-maximal]]
   [ctim.examples.indicators :refer [indicator-maximal]]
   [ctim.examples.judgements :refer [judgement-maximal]]
   [ctim.examples.malwares :refer [malware-maximal]]
   [ctim.examples.notes :refer [note-maximal]]
   [ctim.examples.relationships :refer [relationship-maximal]]
   [ctim.examples.sightings :refer [sighting-maximal]]
   [ctim.examples.target-records :refer [target-record-maximal]]
   [ctim.examples.tools :refer [tool-maximal]]
   [ctim.examples.verdicts :refer [verdict-maximal]]
   [ctim.examples.vulnerabilities :refer [vulnerability-maximal]]
   [ctim.examples.weaknesses :refer [weakness-maximal]]))

(defn set-of [model]
  (set (repeat 3 model)))

(def bundle-maximal
  {:id                      "http://ex.tld/ctia/bundle/bundle-5023697b-3857-4652-9b53-ccda297f9c3e"
   :schema_version          c/ctim-schema-version
   :revision                1
   :external_ids            ["http://ex.tld/ctia/bundle/bundle-5023697b-3857-4652-9b53-ccda297f9c3e"
                             "http://ex.tld/ctia/bundle/bundle-82f9b9b3-0aa4-4676-8254-02deef8aa8ef"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url         "https://ex.tld/wiki/T1067"
     :hashes      ["#section1"]
     :description "Description text"}]
   :timestamp               #inst "2016-02-11T00:40:48.212-00:00"
   :created #inst "2016-02-11T00:40:48.212-00:00"
   :modified #inst "2016-02-11T00:40:48.212-00:00"
   :language                "language"
   :tlp                     "green"
   :description             "a sighting"
   :short_description       "short desc"
   :title                   "title"
   :source                  "source"
   :source_uri              "http://example.com"
   :type                    "bundle"
   :valid_time              {:start_time #inst "2016-05-11T00:40:48.212-00:00"
                             :end_time   #inst "2016-07-11T00:40:48.212-00:00"}
   :actor_refs              #{"http://ex.tld/ctia/actor/actor-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :actors                  (set-of actor-maximal)
   :assets                  (set-of asset-maximal)
   :asset_refs              #{"http://ex.tld/ctia/asset/asset-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :asset_mappings          (set-of asset-mapping-maximal)
   :asset_mapping_refs      #{"http://ex.tld/ctia/asset-mapping/asset-mapping-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :asset_properties        (set-of asset-properties-maximal)
   :asset_properties_refs   #{"http://ex.tld/ctia/asset-properties/asset-properties-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :attack_pattern_refs     #{"http://ex.tld/ctia/attack-pattern/attack-pattern-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :attack_patterns         (set-of attack-pattern-maximal)
   :campaign_refs           #{"http://ex.tld/ctia/campaign/campaign-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :campaigns               (set-of campaign-maximal)
   :coa_refs                #{"http://ex.tld/ctia/coa/coa-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :coas                    (set-of coa-maximal)
   :data_table_refs         #{"http://ex.tld/ctia/data-table/data-table-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :data_tables             (set-of data-table-maximal)
   :feedback_refs           #{"http://ex.tld/ctia/feedback/feedback-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :feedbacks               (set-of feedback-maximal)
   :identity_assertion_refs #{"http://ex.tld/ctia/identity-assertion/identity-assertion-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :identity_assertions     (set-of identity-assertion-maximal)
   :incident_refs           #{"http://ex.tld/ctia/incident/incident-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :incidents               (set-of incident-maximal)
   :indicator_refs          #{"http://ex.tld/ctia/indicator/indicator-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :indicators              (set-of indicator-maximal)
   :judgement_refs          #{"http://ex.tld/ctia/judgement/judgement-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :judgements              (set-of judgement-maximal)
   :malware_refs            #{"http://ex.tld/ctia/malware/malware-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :malwares                (set-of malware-maximal)
   :note_refs               #{"http://ex.tld/ctia/note/note-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :notes                   (set-of note-maximal)
   :relationship_refs       #{"http://ex.tld/ctia/relationship/relationship-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :relationships           (set-of relationship-maximal)
   :sighting_refs           #{"http://ex.tld/ctia/sighting/sighting-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :sightings               (set-of sighting-maximal)
   :target_record_refs #{"http://ex.tld/ctia/target-record/target-record-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :target_records     (set-of target-record-maximal)
   :tool_refs               #{"http://ex.tld/ctia/tool/tool-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :tools                   (set-of tool-maximal)
   :verdict_refs            #{"http://ex.tld/ctia/verdict/verdict-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :verdicts                (set-of verdict-maximal)
   :vulnerabilities         (set-of vulnerability-maximal)
   :vulnerability_refs      #{"http://ex.tld/ctia/vulnerability/vulnerability-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :weakness_refs           #{"http://ex.tld/ctia/weakness/weakness-5023697b-3857-4652-9b53-ccda297f9c3e"}
   :weaknesses              (set-of weakness-maximal)})

(def bundle-minimal
  {:id "transient:5023697b-3857-4652-9b53-ccda297f9c3e"
   :schema_version c/ctim-schema-version
   :source "source"
   :type "bundle"
   :valid_time {}})

(def new-bundle-maximal bundle-maximal)

(def new-bundle-minimal {:source "source"})
