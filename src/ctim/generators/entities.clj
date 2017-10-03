(ns ctim.generators.entities
  (:require [clojure.test.check.generators :as gen :include-macros true]
            [ctim.examples.actors :refer [actor-maximal]]
            [ctim.examples.attack-patterns :refer [attack-pattern-maximal]]
            [ctim.examples.campaigns :refer [campaign-maximal]]
            [ctim.examples.coas :refer [coa-maximal]]
            [ctim.examples.exploit-targets :refer [exploit-target-maximal]]
            [ctim.examples.incidents :refer [incident-maximal]]
            [ctim.examples.indicators :refer [indicator-maximal]]
            [ctim.examples.judgements :refer [judgement-maximal]]
            [ctim.examples.relationships :refer [relationship-maximal]]
            [ctim.examples.sightings :refer [sighting-maximal]]
            [ctim.examples.ttps :refer [ttp-maximal]]))

(def gen-any-example-entity
  (gen/elements [actor-maximal
                 attack-pattern-maximal
                 campaign-maximal
                 coa-maximal
                 exploit-target-maximal
                 incident-maximal
                 indicator-maximal
                 judgement-maximal
                 relationship-maximal
                 sighting-maximal
                 ttp-maximal]))
