(ns ctim.generators.entities
  (:require [clojure.test.check.generators :as gen :include-macros true]
            [ctim.examples.actors :refer [actor-maximal]]
            [ctim.examples.attack-patterns :refer [attack-pattern-maximal]]
            [ctim.examples.campaigns :refer [campaign-maximal]]
            [ctim.examples.coas :refer [coa-maximal]]
            [ctim.examples.incidents :refer [incident-maximal]]
            [ctim.examples.indicators :refer [indicator-maximal]]
            [ctim.examples.judgements :refer [judgement-maximal]]
            [ctim.examples.malwares :refer [malware-maximal]]
            [ctim.examples.relationships :refer [relationship-maximal]]
            [ctim.examples.sightings :refer [sighting-maximal]]
            [ctim.examples.tools :refer [tool-maximal]]
            [ctim.examples.weaknesses :refer [weakness-maximal]]))

(def gen-any-example-entity
  (gen/elements [actor-maximal
                 attack-pattern-maximal
                 campaign-maximal
                 coa-maximal
                 incident-maximal
                 indicator-maximal
                 judgement-maximal
                 malware-maximal
                 relationship-maximal
                 sighting-maximal
                 tool-maximal
                 weakness-maximal]))
