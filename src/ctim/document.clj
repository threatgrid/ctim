(ns ctim.document
  (:gen-class)
  (:require
   [cheshire.core :as json]
   [clojure.java.io :as io]
   [ctim.schemas.actor :as actor]
   [ctim.schemas.asset :as asset]
   [ctim.schemas.asset-mapping :as asset-mapping]
   [ctim.schemas.asset-properties :as asset-properties]
   [ctim.schemas.attack-pattern :as attack-pattern]
   [ctim.schemas.bundle :as bundle]
   [ctim.schemas.campaign :as campaign]
   [ctim.schemas.casebook :as casebook]
   [ctim.schemas.coa :as coa]
   [ctim.schemas.feedback :as feedback]
   [ctim.schemas.incident :as incident]
   [ctim.schemas.indicator :as indicator]
   [ctim.schemas.judgement :as judgement]
   [ctim.schemas.malware :as malware]
   [ctim.schemas.relationship :as relationship]
   [ctim.schemas.sighting :as sighting]
   [ctim.schemas.target-record :as target-record]
   [ctim.schemas.tool :as tool]
   [ctim.schemas.verdict :as verdict]
   [ctim.schemas.vulnerability :as vulnerability]
   [ctim.schemas.weakness :as weakness]
   [flanders.example :as fe]
   [flanders.markdown :as fm :refer [->markdown]]
   [clojure.string :as string]))

(defn ->json [t]
  (json/generate-string (fe/->example-tree t)
                        {:pretty true}))

(defn -main [& _]
  (doseq [[file-name type_ f]
          [["structures/actor" actor/Actor ->markdown]
           ["json/actor.json" actor/Actor ->json]
           ["json/asset.json" asset/Asset ->json]
           ["structures/asset" asset/Asset ->markdown]
           ["json/asset_mapping.json" asset-mapping/AssetMapping ->json]
           ["structures/asset_mapping" asset-mapping/AssetMapping ->markdown]
           ["json/asset_properties.json" asset-properties/AssetProperties ->json]
           ["structures/asset_properties" asset-properties/AssetProperties ->markdown]
           ["structures/attack_pattern" attack-pattern/AttackPattern ->markdown]
           ["json/attack_pattern.json" attack-pattern/AttackPattern ->json]
           ["structures/bundle" bundle/Bundle ->markdown]
           ["json/bundle.json" bundle/Bundle ->json]
           ["structures/campaign" campaign/Campaign ->markdown]
           ["json/campaign.json" campaign/Campaign ->json]
           ["structures/coa" coa/COA ->markdown]
           ["json/coa.json" coa/COA ->json]
           ["structures/feedback" feedback/Feedback ->markdown]
           ["json/feedback.json" feedback/Feedback ->json]
           ["structures/incident" incident/Incident ->markdown]
           ["json/incident.json" incident/Incident ->json]
           ["structures/indicator" indicator/Indicator ->markdown]
           ["json/indicator.json" indicator/Indicator ->json]
           ["structures/judgement" judgement/Judgement ->markdown]
           ["json/judgement.json" judgement/Judgement ->json]
           ["structures/malware" malware/Malware ->markdown]
           ["json/malware.json" malware/Malware ->json]
           ["structures/relationship" relationship/Relationship ->markdown]
           ["json/relationship.json" relationship/Relationship ->json]
           ["structures/casebook" casebook/Casebook ->markdown]
           ["json/casebook.json" casebook/Casebook ->json]
           ["structures/sighting" sighting/Sighting ->markdown]
           ["json/sighting.json" sighting/Sighting ->json]
           ["json/target_record.json" target-record/TargetRecord ->json]
           ["structures/target_record" target-record/TargetRecord ->markdown]
           ["json/tool.json" tool/Tool ->json]
           ["structures/tool" tool/Tool ->markdown]
           ["structures/verdict" verdict/Verdict ->markdown]
           ["json/verdict.json" verdict/Verdict ->json]
           ["structures/vulnerability" vulnerability/Vulnerability ->markdown]
           ["json/vulnerability.json" vulnerability/Vulnerability ->json]
           ["structures/weakness" weakness/Weakness ->markdown]
           ["json/weakness.json" weakness/Weakness ->json]]]
    (let [file (io/file (format "doc/%s" file-name))
          _ (println (format "Writing %s ..." file))
          data (f type_)]
      (if-not (= f ->markdown)
        (spit file data)
        (do
          (-> file .mkdirs)
          (doseq [[map-typename & md] (->> data (filter some?))
                  :let [file (io/file file (str map-typename ".md"))]]
            (->> md
                 (string/join "\n")
                 (spit file))))))
    (println " done.")))
