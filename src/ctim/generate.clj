(ns ctim.generate
  (:gen-class)
  (:require
   [cheshire.core :as json]
   [clojure.spec.alpha :as cs]
   [clojure.spec.gen.alpha :as csg]
   [clojure.string :as str]
   [ctim.schemas
    [actor :refer [Actor NewActor]]
    [asset :refer [Asset NewAsset]]
    [asset-mapping :refer [AssetMapping NewAssetMapping]]
    [asset-properties :refer [AssetProperties NewAssetProperties]]
    [attack-pattern :refer [AttackPattern NewAttackPattern]]
    [campaign :refer [Campaign NewCampaign]]
    [coa :refer [COA NewCOA]]
    [feedback :refer [Feedback NewFeedback]]
    [identity-assertion :refer [IdentityAssertion NewIdentityAssertion]]
    [incident :refer [Incident NewIncident]]
    [indicator :refer [Indicator NewIndicator]]
    [judgement :refer [Judgement NewJudgement]]
    [malware :refer [Malware NewMalware]]
    [relationship :refer [Relationship NewRelationship]]
    [sighting :refer [Sighting NewSighting]]
    [target-record :refer [TargetRecord NewTargetRecord]]
    [tool :refer [Tool NewTool]]
    [vulnerability :refer [Vulnerability NewVulnerability]]
    [weakness :refer [Weakness NewWeakness]]]
   [flanders.spec :as fs]
   [flanders.utils :as fu])
  (:import java.util.UUID))

(defn ->gen [ddl]
  (cs/gen (fs/->spec (fu/require-all ddl)
                     (str (UUID/randomUUID)))))

(def generators
  {:actor (->gen Actor)
   :new-actor (->gen NewActor)

   :asset (->gen Asset)
   :new-asset (->gen NewAsset)

   :asset-mapping (->gen AssetMapping)
   :new-asset-mapping (->gen NewAssetMapping)

   :asset-properties (->gen AssetProperties)
   :new-asset-properties (->gen NewAssetProperties)

   :attack-pattern (->gen AttackPattern)
   :new-attack-pattern (->gen NewAttackPattern)

   :campaign (->gen Campaign)
   :new-campaign (->gen NewCampaign)

   :coa (->gen COA)
   :new-coa (->gen NewCOA)

   :feedback (->gen Feedback)
   :new-feedback (->gen NewFeedback)

   :incident (->gen Incident)
   :new-incident (->gen NewIncident)

   :indicator (->gen Indicator)
   :new-indicator (->gen NewIndicator)

   :judgement (->gen Judgement)
   :new-judgement (->gen NewJudgement)

   :malware (->gen Malware)
   :new-malware (->gen NewMalware)

   :relationship (->gen Relationship)
   :new-relationship (->gen NewRelationship)

   :sighting (->gen Sighting)
   :new-sighting (->gen NewSighting)

   :identity-assertion (->gen IdentityAssertion)
   :new-identity-assertion (->gen NewIdentityAssertion)

   :target-record (->gen TargetRecord)
   :new-target-record (->gen NewTargetRecord)

   :tool (->gen Tool)
   :new-tool (->gen NewTool)

   :weakness (->gen Weakness)
   :new-weakness (->gen NewWeakness)

   :vulnerability (->gen Vulnerability)
   :new-vulnerability (->gen NewVulnerability)})

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
