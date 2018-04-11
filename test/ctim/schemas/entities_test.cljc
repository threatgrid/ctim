(ns ctim.schemas.entities-test
  (:require #?(:clj [clojure.test :refer [deftest testing is use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest testing is use-fixtures]])
            [ctim.examples.actors :as ae]
            [ctim.examples.attack-patterns :as ape]
            [ctim.examples.bundles :as be]
            [ctim.examples.campaigns :as cpe]
            [ctim.examples.casebooks :as cbe]
            [ctim.examples.coas :as coae]
            [ctim.examples.exploit-targets :as ete]
            [ctim.examples.feedbacks :as fbe]
            [ctim.examples.incidents :as ice]
            [ctim.examples.indicators :as ide]
            [ctim.examples.investigations :as ive]
            [ctim.examples.judgements :as je]
            [ctim.examples.malwares :as me]
            [ctim.examples.relationships :as re]
            [ctim.examples.sightings :as se]
            [ctim.examples.tools :as te]
            [ctim.examples.verdicts :as ve]
            [ctim.schemas.actor :as as]
            [ctim.schemas.attack-pattern :as aps]
            [ctim.schemas.bundle :as bs]
            [ctim.schemas.campaign :as cps]
            [ctim.schemas.casebook :as cbs]
            [ctim.schemas.coa :as coas]
            [ctim.schemas.exploit-target :as ets]
            [ctim.schemas.feedback :as fbs]
            [ctim.schemas.incident :as ics]
            [ctim.schemas.indicator :as ids]
            [ctim.schemas.investigation :as ivs]
            [ctim.schemas.judgement :as jus]
            [ctim.schemas.malware :as ms]
            [ctim.schemas.relationship :as rs]
            [ctim.schemas.sighting :as ss]
            [ctim.schemas.tool :as ts]
            [ctim.schemas.verdict :as vs]
            #?(:clj [ctim.test-helpers.core :refer [fixture-spec-validation]])
            [ctim.test-helpers.schema :refer [validate-entities]]
            [flanders.utils :as fu]))

#?(:clj (use-fixtures :once fixture-spec-validation))

(deftest actor-test
  (validate-entities
   [ae/actor-maximal as/Actor]
   [ae/actor-minimal as/Actor]
   [ae/actor-maximal (fu/require-all as/Actor)]
   [ae/new-actor-maximal as/NewActor]
   [ae/new-actor-minimal as/NewActor]
   [ae/stored-actor-maximal as/StoredActor]
   [ae/stored-actor-minimal as/StoredActor]))

(deftest attack-pattern-test
  (validate-entities
   [ape/attack-pattern-maximal aps/AttackPattern]
   [ape/attack-pattern-minimal aps/AttackPattern]
   [ape/attack-pattern-maximal (fu/require-all aps/AttackPattern)]
   [ape/new-attack-pattern-maximal aps/NewAttackPattern]
   [ape/new-attack-pattern-minimal aps/NewAttackPattern]
   [ape/stored-attack-pattern-maximal aps/StoredAttackPattern]
   [ape/stored-attack-pattern-minimal aps/StoredAttackPattern]))

(deftest bundle-test
  (validate-entities
   [be/bundle-maximal bs/Bundle]
   [be/bundle-minimal bs/Bundle]
   [be/bundle-maximal (-> bs/Bundle
                          fu/replace-either-with-any
                          fu/require-all)]
   [be/new-bundle-maximal bs/NewBundle]
   [be/new-bundle-minimal bs/NewBundle]))

(deftest campaign-test
  (validate-entities
   [cpe/campaign-maximal cps/Campaign]
   [cpe/campaign-minimal cps/Campaign]
   [cpe/campaign-maximal (fu/require-all cps/Campaign)]
   [cpe/new-campaign-maximal cps/NewCampaign]
   [cpe/new-campaign-minimal cps/NewCampaign]
   [cpe/stored-campaign-maximal cps/StoredCampaign]
   [cpe/stored-campaign-minimal cps/StoredCampaign]))

(deftest casebook-test
  (validate-entities
   [cbe/casebook-maximal cbs/Casebook]
   [cbe/casebook-minimal cbs/Casebook]
   [cbe/casebook-maximal (-> cbs/Casebook
                             fu/replace-either-with-any
                             fu/require-all)]
   [cbe/new-casebook-maximal cbs/NewCasebook]
   [cbe/new-casebook-minimal cbs/NewCasebook]
   [cbe/stored-casebook-maximal cbs/StoredCasebook]
   [cbe/stored-casebook-minimal cbs/StoredCasebook]))

(deftest coa-test
  (validate-entities
   [coae/coa-openc2-variant1 coas/COA]
   [coae/coa-openc2-variant2 coas/COA]
   [coae/coa-maximal coas/COA]
   [coae/coa-minimal coas/COA]
   [coae/coa-maximal (fu/require-all coas/COA)]
   [coae/new-coa-maximal coas/NewCOA]
   [coae/new-coa-minimal coas/NewCOA]
   [coae/stored-coa-maximal coas/StoredCOA]
   [coae/stored-coa-minimal coas/StoredCOA]))

(deftest exploit-target-test
  (validate-entities
   [ete/exploit-target-maximal ets/ExploitTarget]
   [ete/exploit-target-minimal ets/ExploitTarget]
   [ete/exploit-target-maximal (fu/require-all ets/ExploitTarget)]
   [ete/new-exploit-target-maximal ets/NewExploitTarget]
   [ete/new-exploit-target-minimal ets/NewExploitTarget]
   [ete/stored-exploit-target-maximal ets/StoredExploitTarget]
   [ete/stored-exploit-target-minimal ets/StoredExploitTarget]))

(deftest feedback-test
  (validate-entities
   [fbe/feedback-maximal fbs/Feedback]
   [fbe/feedback-minimal fbs/Feedback]
   [fbe/feedback-maximal (fu/require-all fbs/Feedback)]
   [fbe/new-feedback-maximal fbs/NewFeedback]
   [fbe/new-feedback-minimal fbs/NewFeedback]
   [fbe/stored-feedback-maximal fbs/StoredFeedback]
   [fbe/stored-feedback-minimal fbs/StoredFeedback]))

(deftest incident-test
  (validate-entities
   [ice/incident-maximal ics/Incident]
   [ice/incident-minimal ics/Incident]
   [ice/incident-maximal (fu/require-all ics/Incident)]
   [ice/new-incident-maximal ics/NewIncident]
   [ice/new-incident-minimal ics/NewIncident]
   [ice/stored-incident-maximal ics/StoredIncident]
   [ice/stored-incident-minimal ics/StoredIncident]))

(deftest indicator-test
  (validate-entities
   [ide/indicator-maximal ids/Indicator]
   [ide/indicator-minimal ids/Indicator]
   [ide/indicator-maximal (-> ids/Indicator
                              fu/replace-either-with-any
                              fu/require-all)]
   [ide/new-indicator-maximal ids/NewIndicator]
   [ide/new-indicator-minimal ids/NewIndicator]
   [ide/stored-indicator-maximal ids/StoredIndicator]
   [ide/stored-indicator-minimal ids/StoredIndicator]))

(deftest investigation-test
  (validate-entities
   [ive/investigation-maximal ivs/Investigation]
   [ive/investigation-minimal ivs/Investigation]
   [ive/investigation-maximal (fu/require-all ivs/Investigation)]
   [ive/new-investigation-maximal ivs/NewInvestigation]
   [ive/new-investigation-minimal ivs/NewInvestigation]
   [ive/stored-investigation-maximal ivs/StoredInvestigation]
   [ive/stored-investigation-minimal ivs/StoredInvestigation]))

(deftest judgement-test
  (validate-entities
   [je/judgement-maximal jus/Judgement]
   [je/judgement-minimal jus/Judgement]
   [je/judgement-maximal (fu/require-all jus/Judgement)]
   [je/new-judgement-maximal jus/NewJudgement]
   [je/new-judgement-minimal jus/NewJudgement]
   [je/stored-judgement-maximal jus/StoredJudgement]
   [je/stored-judgement-minimal jus/StoredJudgement]))

(deftest malware-test
  (validate-entities
   [me/malware-maximal ms/Malware]
   [me/malware-minimal ms/Malware]
   [me/malware-maximal (fu/require-all ms/Malware)]
   [me/new-malware-maximal ms/NewMalware]
   [me/new-malware-minimal ms/NewMalware]
   [me/stored-malware-maximal ms/StoredMalware]
   [me/stored-malware-minimal ms/StoredMalware]))

(deftest relationship-test
  (validate-entities
   [re/relationship-maximal rs/Relationship]
   [re/relationship-minimal rs/Relationship]
   [re/relationship-maximal (fu/require-all rs/Relationship)]
   [re/new-relationship-maximal rs/NewRelationship]
   [re/new-relationship-minimal rs/NewRelationship]
   [re/stored-relationship-maximal rs/StoredRelationship]
   [re/stored-relationship-minimal rs/StoredRelationship]))

(deftest sighting-test
  (validate-entities
   [se/sighting-maximal ss/Sighting]
   [se/sighting-minimal ss/Sighting]
   [se/sighting-maximal (fu/require-all ss/Sighting)]
   [se/new-sighting-maximal ss/NewSighting]
   [se/new-sighting-minimal ss/NewSighting]
   [se/stored-sighting-maximal ss/StoredSighting]
   [se/stored-sighting-minimal ss/StoredSighting]))

(deftest tool-test
  (validate-entities
   [te/tool-maximal ts/Tool]
   [te/tool-minimal ts/Tool]
   [te/tool-maximal (fu/require-all ts/Tool)]
   [te/new-tool-maximal ts/NewTool]
   [te/new-tool-minimal ts/NewTool]
   [te/stored-tool-maximal ts/StoredTool]
   [te/stored-tool-minimal ts/StoredTool]))

(deftest verdict-test
  (validate-entities
   [ve/verdict-maximal vs/Verdict]
   [ve/verdict-minimal vs/Verdict]
   [ve/verdict-maximal (fu/require-all vs/Verdict)]
   [ve/stored-verdict-maximal vs/StoredVerdict]
   [ve/stored-verdict-minimal vs/StoredVerdict]))
