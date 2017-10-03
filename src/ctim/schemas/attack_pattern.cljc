(ns ctim.schemas.attack-pattern
  (:require #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])
            [ctim.schemas.common :as c]))

(def type-identifier "attack-pattern")

(def-eq AttackPatternTypeIdentifier type-identifier)

(def attack-pattern-desc
  (str "Attack Patterns are a type of TTP that describe ways that adversaries "
       "attempt to compromise targets."))

(def attack-pattern-desc-link
  "[Attack Pattern](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/edit#heading=h.axjijf603msy)")

(def mitre-custom-entries
  (f/optional-entries
   (f/entry :x_mitre_data_sources [c/ShortString]
            :description "ATT&CK Technique.Data Sources")
   (f/entry :x_mitre_platforms [c/ShortString]
            :description "ATT&CK Technique.Platforms")
   (f/entry :x_mitre_contributors [c/ShortString]
            :description "ATT&CK Technique.Contributors")))

(def-entity-type AttackPattern
  {:description attack-pattern-desc
   :reference attack-pattern-desc-link}
  c/base-entity-entries
  mitre-custom-entries
  (f/required-entries
   (f/entry :type AttackPatternTypeIdentifier)
   (f/entry :name c/ShortString)
   (f/entry :description c/Markdown))
  (f/optional-entries
   (f/entry :kill_chain_phases [c/KillChainPhase])))

(def-entity-type NewAttackPattern
  "For submitting a new AttackPattern"
  (:entries AttackPattern)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type AttackPatternTypeIdentifier)))

(def-entity-type StoredAttackPattern
  "An attack pattern as stored in the data store"
  (:entries AttackPattern)
  c/base-stored-entity-entries)
