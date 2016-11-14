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
             [ttp :as t]
             [verdict :as v]]
            [flanders.example :as fe]
            [flanders.markdown :as fm]))

(defn ->json [t]
  (json/generate-string (fe/->example-tree t)
                        {:pretty true}))

(def ->markdown fm/->markdown)

(defn -main [& _args_]
  (doseq [[file-name type_ f]
          [["structures/actor.md" a/StoredActor ->markdown]
           ["json/actor.json" a/StoredActor ->json]
           ["structures/campaign.md" c/StoredCampaign ->markdown]
           ["json/campaign.json" c/StoredCampaign ->json]
           ["structures/coa.md" co/COA ->markdown]
           ["json/coa.json" co/COA ->json]
           ["structures/exploit_target.md" e/StoredExploitTarget ->markdown]
           ["json/exploit_target.json" e/StoredExploitTarget ->json]
           ["structures/feedback.md" f/StoredFeedback ->markdown]
           ["json/feedback.json" f/StoredFeedback ->json]
           ["structures/incident.md" inc/StoredIncident ->markdown]
           ["json/incident.json" inc/StoredIncident ->json]
           ["structures/indicator.md" ind/StoredIndicator ->markdown]
           ["json/indicator.json" ind/StoredIndicator ->json]
           ["structures/judgement.md" j/StoredJudgement ->markdown]
           ["json/judgement.json" j/StoredJudgement ->json]
           ["structures/relationship.md" r/StoredRelationship ->markdown]
           ["json/relationship.json" r/StoredRelationship ->json]
           ["structures/sighting.md" s/StoredSighting ->markdown]
           ["json/sighting.json" s/StoredSighting ->json]
           ["structures/ttp.md" t/StoredTTP ->markdown]
           ["json/ttp.json" t/StoredTTP ->json]
           ["structures/verdict.md" v/StoredVerdict ->markdown]
           ["json/verdict.json" v/StoredVerdict ->json]]]
    (print (str "Writing " file-name "..."))
    (spit (io/file
           (io/resource file-name))
          (f type_))
    (println " done.")))
