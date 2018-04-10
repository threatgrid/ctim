(ns ctim.schemas.kill-chain-test
  (:require [clojure.spec.alpha :as s]
            [clojure.test :refer [deftest is testing use-fixtures]]
            [ctim.schemas.malware :as malware]
            [ctim.examples.malwares :as malware-example]
            [ctim.test-helpers.core :as th]
            [flanders.spec :as fs]))

(use-fixtures :once
  th/fixture-spec-validation
  (th/fixture-spec malware/Malware "test.malware"))

(deftest test-kill-chain-validation
  (is (s/valid?
       :test.malware/map
       (assoc malware-example/malware-maximal
              :kill_chain_phases
              [{:kill_chain_name "lockheed-martin-cyber-kill-chain"
                :phase_name "delivery"}])))
  (is (not (s/valid?
            :test.malware/map
            (assoc malware-example/malware-maximal
                   :kill_chain_phases
                   [{:kill_chain_name "lockheed-martin-cyber-kill-chain"
                     :phase_name "invalid"}]))))
  (is (s/valid?
       :test.malware/map
       (assoc malware-example/malware-maximal
              :kill_chain_phases
              [{:kill_chain_name "mitre-attack"
                :phase_name "defense-evasion"}])))
  (is (not (s/valid?
            :test.malware/map
            (assoc malware-example/malware-maximal
                   :kill_chain_phases
                   [{:kill_chain_name "mitre-attack"
                     :phase_name "invalid phase name with spaces"}])))))
