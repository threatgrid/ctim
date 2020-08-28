(ns ctim.document
  (:gen-class)
  (:require [cheshire.core :as json]
            [clojure.java.io :as io]
            [ctim.schemas
             [actor :as a]
             [asset :as asset]
             [asset-mapping :as asset-mapping]
             [attack-pattern :as attack]
             [bundle :as bu]
             [campaign :as c]
             [coa :as co]
             [feedback :as f]
             [incident :as inc]
             [indicator :as ind]
             [judgement :as j]
             [malware :as malware]
             [relationship :as r]
             [casebook :as cb]
             [sighting :as s]
             [target-record :as target-record]
             [tool :as tool]
             [verdict :as v]
             [vulnerability :as vu]
             [weakness :as wk]]
            [flanders
             [example :as fe]
             [markdown :as fm]]))

(defn ->json [t]
  (json/generate-string (fe/->example-tree t)
                        {:pretty true}))

(def ->markdown fm/->markdown)

(defn -main [& _args_]
  (doseq [[file-name type_ f]
          [["structures/actor.md" a/Actor ->markdown]
           ["json/actor.json" a/Actor ->json]
           ["json/asset.json" asset/Asset ->json]
           ["structures/asset.md" asset/Asset ->markdown]
           ["json/asset_mapping.json" asset-mapping/AssetMapping ->json]
           ["structures/attack_pattern.md" attack/AttackPattern ->markdown]
           ["json/attack_pattern.json" attack/AttackPattern ->json]
           ["structures/bundle.md" bu/Bundle ->markdown]
           ["json/bundle.json" bu/Bundle ->json]
           ["structures/campaign.md" c/Campaign ->markdown]
           ["json/campaign.json" c/Campaign ->json]
           ["structures/coa.md" co/COA ->markdown]
           ["json/coa.json" co/COA ->json]
           ["structures/feedback.md" f/Feedback ->markdown]
           ["json/feedback.json" f/Feedback ->json]
           ["structures/incident.md" inc/Incident ->markdown]
           ["json/incident.json" inc/Incident ->json]
           ["structures/indicator.md" ind/Indicator ->markdown]
           ["json/indicator.json" ind/Indicator ->json]
           ["structures/judgement.md" j/Judgement ->markdown]
           ["json/judgement.json" j/Judgement ->json]
           ["structures/malware.md" malware/Malware ->markdown]
           ["json/malware.json" malware/Malware ->json]
           ["structures/relationship.md" r/Relationship ->markdown]
           ["json/relationship.json" r/Relationship ->json]
           ["structures/casebook.md" cb/Casebook ->markdown]
           ["json/casebook.json" cb/Casebook ->json]
           ["structures/sighting.md" s/Sighting ->markdown]
           ["json/sighting.json" s/Sighting ->json]
           ["json/target_record.json" target-record/TargetRecord ->json]
           ["structures/target_record.md" target-record/TargetRecord ->markdown]
           ["json/tool.json" tool/Tool ->json]
           ["structures/tool.md" tool/Tool ->markdown]
           ["structures/verdict.md" v/Verdict ->markdown]
           ["json/verdict.json" v/Verdict ->json]
           ["structures/vulnerability.md" vu/Vulnerability ->markdown]
           ["json/vulnerability.json" vu/Vulnerability ->json]
           ["structures/weakness.md" wk/Weakness ->markdown]
           ["json/weakness.json" wk/Weakness ->json]]]
    (print (str "Writing " file-name "..."))
    (spit (io/file
           (io/resource file-name))
          (f type_))
    (println " done.")))
