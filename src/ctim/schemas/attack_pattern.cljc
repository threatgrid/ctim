(ns ctim.schemas.attack-pattern
  (:require #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])
            [ctim.schemas.common :as c]
            [ctim.schemas.vocabularies :as v]))

(def type-identifier "attack-pattern")

(def-eq AttackPatternTypeIdentifier type-identifier)

(def attack-pattern-desc
  (str "Attack Patterns are a type of TTP that describe ways that adversaries "
       "attempt to compromise targets."))

(def attack-pattern-desc-link
  "[Attack Pattern](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/pub#h.axjijf603msy)")

(def-entity-type AttackPattern
  {:description attack-pattern-desc
   :reference attack-pattern-desc-link}
  c/base-entity-entries
  (f/required-entries
   (f/entry :type AttackPatternTypeIdentifier)
   (f/entry :name c/ShortString
            :description "A name used to identify the Attack Pattern.")
   (f/entry :description c/Markdown
            :description (str "A description that provides more details and "
                              "context about the Attack Pattern, potentially "
                              "including its purpose and its key characteristics.")))
  (f/optional-entries
   (f/entry :external_references [c/ExternalReference]
            :description (str "A list of external references which refer to "
                              "non-STIX information. This property MAY be used "
                              "to provide one or more Attack Pattern "
                              "identifiers, such as a CAPEC ID. When specifying "
                              "a CAPEC ID, the source_name property of the "
                              "external reference MUST be set to capec and the "
                              "external_id property MUST be formatted as CAPEC-[id]."))
   (f/entry :kill_chain_phases [c/KillChainPhase]
            :description (str "The list of Kill Chain Phases for which this "
                              "Attack Pattern is used."))
   (f/entry :x_mitre_data_sources [c/ShortString]
            :description "ATT&CK Technique.Data Sources")
   (f/entry :x_mitre_platforms [c/ShortString]
            :description "ATT&CK Technique.Platforms")
   (f/entry :x_mitre_contributors [c/ShortString]
            :description "ATT&CK Technique.Contributors")
   (f/entry :abstraction_level v/AttackPatternAbstractions
            :description "The CAPEC abstraction level for patterns describing techniques to attack a system.")))

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

(def AttackPatternRef
  (c/ref-for-type type-identifier))
