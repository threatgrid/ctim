(ns ctim.document
  (:gen-class)
  (:require [cheshire.core :as json]
            [clojure.java.io :as io]
            [ctim.schemas
             [actor :as a]
             [campaign :as c]
             [coa :as co]
             [exploit-target :as e]
             [feedback :as f]
             [incident :as inc]
             [indicator :as ind]
             [judgement :as j]
             [relationship :as r]
             [sighting :as s]
             [verdict :as v]]
            [flanders.example :as fe]
            [flanders.markdown :as fm]))

(defn ->json [t]
  (json/generate-string (fe/->example-tree t)
                        {:pretty true}))

(def ->markdown fm/->markdown)

(defn -main [& _args_]
  (doseq [[file-name type_ f]
          [["structures/actor.md" a/Actor ->markdown]
           ["json/actor.json" a/Actor ->json]
           ["structures/campaign.md" c/Campaign ->markdown]
           ["json/campaign.json" c/Campaign ->json]
           ["structures/coa.md" co/COA ->markdown]
           ["json/coa.json" co/COA ->json]
           ["structures/exploit_target.md" e/ExploitTarget ->markdown]
           ["json/exploit_target.json" e/ExploitTarget ->json]
           ["structures/feedback.md" f/Feedback ->markdown]
           ["json/feedback.json" f/Feedback ->json]
           ["structures/incident.md" inc/Incident ->markdown]
           ["json/incident.json" inc/Incident ->json]
           ["structures/indicator.md" ind/Indicator ->markdown]
           ["json/indicator.json" ind/Indicator ->json]
           ["structures/judgement.md" j/Judgement ->markdown]
           ["json/judgement.json" j/Judgement ->json]
           ["structures/relationship.md" r/Relationship ->markdown]
           ["json/relationship.json" r/Relationship ->json]
           ["structures/sighting.md" s/Sighting ->markdown]
           ["json/sighting.json" s/Sighting ->json]
           ["structures/verdict.md" v/Verdict ->markdown]
           ["json/verdict.json" v/Verdict ->json]]]
    (print (str "Writing " file-name "..."))
    (spit (io/file
           (io/resource file-name))
          (f type_))
    (println " done.")))
