(ns ctim.document
  (:gen-class)
  (:require
   [cheshire.core :as json]
   [clojure.java.io :as io]
   [clojure.walk :as walk]
   [ctim.schemas.actor :as a]
   [ctim.schemas.asset :as asset]
   [ctim.schemas.asset-mapping :as asset-mapping]
   [ctim.schemas.asset-properties :as asset-properties]
   [ctim.schemas.attack-pattern :as attack]
   [ctim.schemas.bundle :as bu]
   [ctim.schemas.campaign :as c]
   [ctim.schemas.casebook :as cb]
   [ctim.schemas.coa :as co]
   [ctim.schemas.feedback :as f]
   [ctim.schemas.incident :as inc]
   [ctim.schemas.indicator :as ind]
   [ctim.schemas.judgement :as j]
   [ctim.schemas.malware :as malware]
   [ctim.schemas.note :as note]
   [ctim.schemas.relationship :as r]
   [ctim.schemas.sighting :as s]
   [ctim.schemas.target-record :as target-record]
   [ctim.schemas.tool :as tool]
   [ctim.schemas.verdict :as v]
   [ctim.schemas.vulnerability :as vu]
   [ctim.schemas.weakness :as wk]
   [flanders.example :as fe]
   [flanders.markdown :as fm]))

(defn ->ordered [v]
  (walk/postwalk (fn [v]
                   (if (and (map? v)
                            (every? (some-fn string? ident?) (keys v)))
                     (into (sorted-map) v)
                     v))
                 v))

(defn ->json [t]
  (json/generate-string (->ordered (fe/->example-tree t))
                        {:pretty true}))

(def ->markdown fm/->markdown)

(defn -main [& _args_]
  (doseq [[file-name type_ f]
          [["structures/actor.md" a/Actor ->markdown]
           ["json/actor.json" a/Actor ->json]
           ["json/asset.json" asset/Asset ->json]
           ["structures/asset.md" asset/Asset ->markdown]
           ["json/asset_mapping.json" asset-mapping/AssetMapping ->json]
           ["structures/asset_mapping.md" asset-mapping/AssetMapping ->markdown]
           ["json/asset_properties.json" asset-properties/AssetProperties ->json]
           ["structures/asset_properties.md" asset-properties/AssetProperties ->markdown]
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
           ["structures/note.md" note/Note ->markdown]
           ["json/note.json" note/Note ->json]
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
    (let [file (io/file (format "doc/%s" file-name))]
      (println (format "Writing %s ..." file))
      (spit file (f type_)))
    (println " done.")))
