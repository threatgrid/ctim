(ns ctim.generators.entities
  (:require [clojure.test.check.generators :as gen :include-macros true]
            [ctim.examples.actors :refer [actor-maximal]]
            [ctim.examples.assets :refer [asset-maximal]]
            [ctim.examples.asset-mappings :refer [asset-mapping-maximal]]
            [ctim.examples.asset-properties :refer [asset-properties-maximal]]
            [ctim.examples.attack-patterns :refer [attack-pattern-maximal]]
            [ctim.examples.campaigns :refer [campaign-maximal]]
            [ctim.examples.coas :refer [coa-maximal]]
            [ctim.examples.incidents :refer [incident-maximal]]
            [ctim.examples.indicators :refer [indicator-maximal]]
            [ctim.examples.judgements :refer [judgement-maximal]]
            [ctim.examples.malwares :refer [malware-maximal]]
            [ctim.examples.relationships :refer [relationship-maximal]]
            [ctim.examples.sightings :refer [sighting-maximal]]
            [ctim.examples.identity-assertions :refer [identity-assertion-maximal]]
            [ctim.examples.target-records :refer [target-record-maximal]]
            [ctim.examples.tools :refer [tool-maximal]]
            [ctim.examples.weaknesses :refer [weakness-maximal]]))

(def gen-any-example-entity
  (gen/elements [actor-maximal
                 asset-maximal
                 asset-mapping-maximal
                 asset-properties-maximal
                 attack-pattern-maximal
                 campaign-maximal
                 coa-maximal
                 incident-maximal
                 indicator-maximal
                 judgement-maximal
                 malware-maximal
                 relationship-maximal
                 sighting-maximal
                 identity-assertion-maximal
                 target-record-maximal
                 tool-maximal
                 weakness-maximal]))
