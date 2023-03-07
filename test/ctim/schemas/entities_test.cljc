(ns ctim.schemas.entities-test
  (:require #?(:clj [clojure.test :refer [deftest testing is use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest testing is use-fixtures]])
            [ctim.examples.actors :as ae]
            [ctim.examples.assets :as asset-e]
            [ctim.examples.asset-mappings :as asset-mapping-e]
            [ctim.examples.asset-properties :as asset-properties-e]
            [ctim.examples.attack-patterns :as ape]
            [ctim.examples.bundles :as be]
            [ctim.examples.campaigns :as cpe]
            [ctim.examples.casebooks :as cbe]
            [ctim.examples.coas :as coae]
            [ctim.examples.feedbacks :as fbe]
            [ctim.examples.incidents :as ice]
            [ctim.examples.indicators :as ide]
            [ctim.examples.investigations :as ive]
            [ctim.examples.judgements :as je]
            [ctim.examples.malwares :as me]
            [ctim.examples.relationships :as re]
            [ctim.examples.sightings :as se]
            [ctim.examples.identity-assertions :as tae]
            [ctim.examples.target-records :as target-record-e]
            [ctim.examples.tools :as te]
            [ctim.examples.verdicts :as ve]
            [ctim.examples.vulnerabilities :as vule]
            [ctim.examples.weaknesses :as wke]
            [ctim.schemas.actor :as as]
            [ctim.schemas.asset :as asset]
            [ctim.schemas.asset-mapping :as asset-mapping]
            [ctim.schemas.asset-properties :as asset-properties]
            [ctim.schemas.attack-pattern :as aps]
            [ctim.schemas.bundle :as bs]
            [ctim.schemas.campaign :as cps]
            [ctim.schemas.casebook :as cbs]
            [ctim.schemas.coa :as coas]
            [ctim.schemas.feedback :as fbs]
            [ctim.schemas.incident :as ics]
            [ctim.schemas.indicator :as ids]
            [ctim.schemas.investigation :as ivs]
            [ctim.schemas.judgement :as jus]
            [ctim.schemas.malware :as ms]
            [ctim.schemas.relationship :as rs]
            [ctim.schemas.sighting :as ss]
            [ctim.schemas.identity-assertion :as tas]
            [ctim.schemas.target-record :as target-record]
            [ctim.schemas.tool :as ts]
            [ctim.schemas.verdict :as vs]
            [ctim.schemas.vulnerability :as vul]
            [ctim.schemas.weakness :as wks]
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
   [ae/new-actor-minimal as/NewActor]))

(deftest asset-test
  (validate-entities
   [asset-e/asset-maximal asset/Asset]
   [asset-e/asset-minimal asset/Asset]
   [asset-e/asset-maximal (fu/require-all asset/Asset)]
   [asset-e/new-asset-maximal asset/NewAsset]
   [asset-e/new-asset-minimal asset/NewAsset]))

(deftest asset-mapping-test
  (validate-entities
   [asset-mapping-e/asset-mapping-maximal asset-mapping/AssetMapping]
   [asset-mapping-e/asset-mapping-minimal asset-mapping/AssetMapping]
   [asset-mapping-e/asset-mapping-maximal (fu/require-all asset-mapping/AssetMapping)]
   [asset-mapping-e/new-asset-mapping-maximal asset-mapping/NewAssetMapping]
   [asset-mapping-e/new-asset-mapping-minimal asset-mapping/NewAssetMapping]))

(deftest asset-properties-test
  (validate-entities
   [asset-properties-e/asset-properties-maximal asset-properties/AssetProperties]
   [asset-properties-e/asset-properties-minimal asset-properties/AssetProperties]
   [asset-properties-e/asset-properties-maximal (fu/require-all asset-properties/AssetProperties)]
   [asset-properties-e/new-asset-properties-maximal asset-properties/NewAssetProperties]
   [asset-properties-e/new-asset-properties-minimal asset-properties/NewAssetProperties]))

(deftest attack-pattern-test
  (validate-entities
   [ape/attack-pattern-maximal aps/AttackPattern]
   [ape/attack-pattern-minimal aps/AttackPattern]
   [ape/attack-pattern-maximal (fu/require-all aps/AttackPattern)]
   [ape/new-attack-pattern-maximal aps/NewAttackPattern]
   [ape/new-attack-pattern-minimal aps/NewAttackPattern]))

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
   [cpe/new-campaign-minimal cps/NewCampaign]))

(deftest casebook-test
  (validate-entities
   [cbe/casebook-maximal cbs/Casebook]
   [cbe/casebook-minimal cbs/Casebook]
   [cbe/casebook-maximal (-> cbs/Casebook
                             fu/replace-either-with-any
                             fu/require-all)]
   [cbe/new-casebook-maximal cbs/NewCasebook]
   [cbe/new-casebook-minimal cbs/NewCasebook]))

(deftest coa-test
  (validate-entities
   [coae/coa-openc2-variant1 coas/COA]
   [coae/coa-openc2-variant2 coas/COA]
   [coae/coa-maximal coas/COA]
   [coae/coa-minimal coas/COA]
   [coae/coa-maximal (fu/require-all coas/COA)]
   [coae/new-coa-maximal coas/NewCOA]
   [coae/new-coa-minimal coas/NewCOA]))

(deftest feedback-test
  (validate-entities
   [fbe/feedback-maximal fbs/Feedback]
   [fbe/feedback-minimal fbs/Feedback]
   [fbe/feedback-maximal (fu/require-all fbs/Feedback)]
   [fbe/new-feedback-maximal fbs/NewFeedback]
   [fbe/new-feedback-minimal fbs/NewFeedback]))

(deftest incident-test
  (validate-entities
   [ice/incident-maximal ics/Incident]
   [ice/incident-minimal ics/Incident]
   [ice/incident-maximal (fu/require-all ics/Incident)]
   [ice/new-incident-maximal ics/NewIncident]
   [ice/new-incident-minimal ics/NewIncident]))

(deftest indicator-test
  (validate-entities
   [ide/indicator-maximal ids/Indicator]
   [ide/indicator-minimal ids/Indicator]
   [ide/indicator-maximal (-> ids/Indicator
                              fu/replace-either-with-any
                              fu/require-all)]
   [ide/new-indicator-maximal ids/NewIndicator]
   [ide/new-indicator-minimal ids/NewIndicator]))

(deftest investigation-test
  (validate-entities
   [ive/investigation-maximal ivs/Investigation]
   [ive/investigation-minimal ivs/Investigation]
   [ive/investigation-maximal (fu/require-all ivs/Investigation)]
   [ive/new-investigation-maximal ivs/NewInvestigation]
   [ive/new-investigation-minimal ivs/NewInvestigation]))

(deftest judgement-test
  (validate-entities
   [je/judgement-maximal jus/Judgement]
   [je/judgement-minimal jus/Judgement]
   [je/judgement-maximal (fu/require-all jus/Judgement)]
   [je/new-judgement-maximal jus/NewJudgement]
   [je/new-judgement-minimal jus/NewJudgement]))

(deftest malware-test
  (validate-entities
   [me/malware-maximal ms/Malware]
   [me/malware-minimal ms/Malware]
   [me/malware-maximal (fu/require-all ms/Malware)]
   [me/new-malware-maximal ms/NewMalware]
   [me/new-malware-minimal ms/NewMalware]))

(deftest relationship-test
  (validate-entities
   [re/relationship-maximal rs/Relationship]
   [re/relationship-minimal rs/Relationship]
   [re/relationship-maximal (fu/require-all rs/Relationship)]
   [re/new-relationship-maximal rs/NewRelationship]
   [re/new-relationship-minimal rs/NewRelationship]))

(deftest sighting-test
  (validate-entities
   [se/sighting-maximal ss/Sighting]
   [se/sighting-minimal ss/Sighting]
   [se/sighting-maximal (fu/require-all ss/Sighting)]
   [se/new-sighting-maximal ss/NewSighting]
   [se/new-sighting-minimal ss/NewSighting]))

(deftest identity-assertion-test
  (validate-entities
   [tae/identity-assertion-maximal tas/IdentityAssertion]
   [tae/identity-assertion-minimal tas/IdentityAssertion]
   [tae/identity-assertion-maximal (fu/require-all tas/IdentityAssertion)]
   [tae/new-identity-assertion-maximal tas/NewIdentityAssertion]
   [tae/new-identity-assertion-minimal tas/NewIdentityAssertion]))

(deftest target-record-test
  (validate-entities
   [target-record-e/target-record-maximal target-record/TargetRecord]
   [target-record-e/target-record-minimal target-record/TargetRecord]
   [target-record-e/target-record-maximal (fu/require-all target-record/TargetRecord)]
   [target-record-e/new-target-record-maximal target-record/NewTargetRecord]
   [target-record-e/new-target-record-minimal target-record/NewTargetRecord]))

(deftest tool-test
  (validate-entities
   [te/tool-maximal ts/Tool]
   [te/tool-minimal ts/Tool]
   [te/tool-maximal (fu/require-all ts/Tool)]
   [te/new-tool-maximal ts/NewTool]
   [te/new-tool-minimal ts/NewTool]))

(deftest verdict-test
  (validate-entities
   [ve/verdict-maximal vs/Verdict]
   [ve/verdict-minimal vs/Verdict]
   [ve/verdict-maximal (fu/require-all vs/Verdict)]))

(deftest vulnerability-test
  (validate-entities
   [vule/vulnerability-maximal vul/Vulnerability]
   [vule/vulnerability-minimal vul/Vulnerability]
   [vule/vulnerability-maximal (fu/require-all vul/Vulnerability)]
   [vule/new-vulnerability-maximal vul/NewVulnerability]
   [vule/new-vulnerability-minimal vul/NewVulnerability]))

(deftest weakness-test
  (validate-entities
   [wke/weakness-maximal wks/Weakness]
   [wke/weakness-minimal wks/Weakness]
   [wke/weakness-maximal (fu/require-all wks/Weakness)]
   [wke/new-weakness-maximal wks/NewWeakness]
   [wke/new-weakness-minimal wks/NewWeakness]))
