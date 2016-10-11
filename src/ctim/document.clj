(ns ctim.document
  (:gen-class)
  (:require [clojure.java.io :as io]
            [ctim.schemas
             [actor :as a]
             [campaign :as c]
             [coa :as co]
             [exploit-target :as e]
             [feedback :as f]
             [incident :as inc]
             [indicator :as ind]
             [judgement :as j]
             [observed-relationship :as o]
             [sighting :as s]
             [ttp :as t]
             [verdict :as v]]
            [flanders.markdown :as fm]))

(defn -main [& _args_]
  (doseq [[file-name type_] [["structures/actor.md" a/Actor]
                             ["structures/campaign.md" c/Campaign]
                             ["structures/coa.md" co/COA]
                             ["structures/exploit_target.md" e/ExploitTarget]
                             ["structures/feedback.md" f/Feedback]
                             ["structures/incident.md" inc/Incident]
                             ["structures/indicator.md" ind/Indicator]
                             ["structures/judgement.md" j/Judgement]
                             ["structures/observed_relationship.md" o/ObservedRelationship]
                             ["structures/sighting.md" s/Sighting]
                             ["structures/ttp.md" t/TTP]
                             ["structures/verdict.md" v/Verdict]]]
    (print (str "Writing " file-name "..."))
    (spit (io/file
           (io/resource file-name))
          (fm/->markdown type_))
    (println " done.")))
