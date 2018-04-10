(ns ctim.schemas.entities-test
  (:require [ctim.schemas
             [actor :as as]
             [attack-pattern :as aps]
             [bundle :as bs]
             [campaign :as cps]
             [casebook :as cbs]
             [coa :as coas]
             [exploit-target :as ets]
             [feedback :as fbs]
             [incident :as ics]
             [indicator :as ids]
             [investigation :as ivs]
             [judgement :as js]
             [malware :as ms]
             [relationship :as rs]
             [sighting :as ss]
             [tool :as ts]
             [verdict :as vs]]
            [ctim.examples
             [actors :as ae]
             [attack-patterns :as ape]
             [bundles :as be]
             [campaigns :as cpe]
             [casebooks :as cbe]
             [coas :as coae]
             [exploit-targets :as ete]
             [feedbacks :as fbe]
             [incidents :as ice]
             [indicators :as ide]
             [investigations :as ive]
             [judgements :as je]
             [malwares :as me]
             [relationships :as re]
             [sightings :as se]
             [tools :as te]
             [verdicts :as ve]]
            [ctim.test-helpers.schema :refer [validate-entities]]
            [clojure.test :refer [deftest use-fixtures]]
            [ctim.test-helpers.core :refer [fixture-spec-validation]]
            [flanders.utils :as fu]))

(use-fixtures :once fixture-spec-validation)

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
   [je/judgement-maximal js/Judgement]
   [je/judgement-minimal js/Judgement]
   [je/judgement-maximal (fu/require-all js/Judgement)]
   [je/new-judgement-maximal js/NewJudgement]
   [je/new-judgement-minimal js/NewJudgement]
   [je/stored-judgement-maximal js/StoredJudgement]
   [je/stored-judgement-minimal js/StoredJudgement]))

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
