(ns ctim.generate
  (:gen-class)
  (:require
    [cheshire.core :as json]
    [clojure.spec :as cs]
    [clojure.spec.gen :as csg]
    [clojure.string :as str]
    [ctim.schemas
     [actor :refer [Actor NewActor StoredActor]]
     [campaign :refer [Campaign NewCampaign StoredCampaign]]
     [coa :refer [COA NewCOA StoredCOA]]
     [exploit-target :refer [ExploitTarget NewExploitTarget StoredExploitTarget]]
     [feedback :refer [Feedback NewFeedback StoredFeedback]]
     [incident :refer [Incident NewIncident StoredIncident]]
     [indicator :refer [Indicator NewIndicator StoredIndicator]]
     [judgement :refer [Judgement NewJudgement StoredJudgement]]
     [relationship :refer [Relationship NewRelationship StoredRelationship]]
     [sighting :refer [Sighting NewSighting StoredSighting]]
     [ttp :refer [NewTTP StoredTTP TTP]]]
    [flanders.spec :as fs]
    [flanders.utils :as fu])
  (:import java.util.UUID))

(defn ->gen [ddl]
  (cs/gen (fs/->spec (fu/require-all ddl)
                     (str (UUID/randomUUID)))))

(def generators
  {:actor (->gen Actor)
   :new-actor (->gen NewActor)
   :stored-actor (->gen StoredActor)

   :campaign (->gen Campaign)
   :new-campaign (->gen NewCampaign)
   :stored-campaign (->gen StoredCampaign)

   :coa (->gen COA)
   :new-coa (->gen NewCOA)
   :stored-coa (->gen StoredCOA)

   :exploit-target (->gen ExploitTarget)
   :new-exploit-target (->gen NewExploitTarget)
   :stored-exploit-target (->gen StoredExploitTarget)

   :feedback (->gen Feedback)
   :new-feedback (->gen NewFeedback)
   :stored-feedback (->gen StoredFeedback)

   :incident (->gen Incident)
   :new-incident (->gen NewIncident)
   :stored-incident (->gen StoredIncident)

   :indicator (->gen Indicator)
   :new-indicator (->gen NewIndicator)
   :stored-indicator (->gen StoredIndicator)

   :judgement (->gen Judgement)
   :new-judgement (->gen NewJudgement)
   :stored-judgment (->gen StoredJudgement)

   :relationship (->gen Relationship)
   :new-relationship (->gen NewRelationship)
   :stored-relationship (->gen StoredRelationship)

   :sighting (->gen Sighting)
   :new-sighting (->gen NewSighting)
   :stored-sighting (->gen StoredSighting)

   :ttp (->gen TTP)
   :new-ttp (->gen NewTTP)
   :stored-ttp (->gen StoredTTP)})

(defn- sample [gen-kw sample-num take-num]
  (take-last take-num
             (csg/sample (get generators gen-kw)
                         sample-num)))

(defn- usage []
  (str "Usage: lein gen <entity>\n"
       "       lein gen <entity> <amount> <complexity>\n"
       "\n"
       "Entity must be one of " (->> (keys generators)
                                     (map name)
                                     sort
                                     (str/join ", "))
       ".\n"
       "Amount and Complexity may be positive integers.\n"))

(defn -main [& [entity amount complexity]]
  (if (nil? entity)
    (println (usage))
    (let [amount (when amount (bigint amount))
          complexity (when complexity (bigint complexity))
          sample-num (apply max (filter integer? [10 amount complexity]))
          take-num (apply max (filter integer? [1 amount]))]
      (doseq [example (sample (keyword entity) sample-num take-num)]
        (println (str "**** Example " entity " *****"))
        (-> example
            (json/generate-string {:pretty true})
            println)))))
