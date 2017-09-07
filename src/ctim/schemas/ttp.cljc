(ns ctim.schemas.ttp
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])))

(def-map-type AttackPattern
  (f/optional-entries
   (f/entry :title c/ShortString)
   (f/entry :description c/Markdown)
   (f/entry :short_description c/MedString)
   (f/entry :capec_id f/any-str
            :description (str "a reference to a particular entry within the "
                              "Common Attack Pattern Enumeration and Classification")))
  :reference "[AttackPatternType](http://stixproject.github.io/data-model/1.2/ttp/AttackPatternType/)")

(def-map-type MalwareInstance
  (f/optional-entries
   (f/entry :title c/ShortString)
   (f/entry :description c/Markdown)
   (f/entry :short_description c/MedString)
   (f/entry :type [v/MalwareType]
            :description "a characterization of what type of malware this"))
  :reference "[MalwareInstanceType](http://stixproject.github.io/data-model/1.2/ttp/MalwareInstanceType/)")

(def-map-type Behavior
  (f/optional-entries
   (f/entry :attack_patterns [AttackPattern]
            :description "one or more Attack Patterns for this TTP")
   (f/entry :malware_type [MalwareInstance]
            :description "one or more instances of Malware for this TTP")
   ;; Not provided: exploits ; It is abstract
   )
  :reference "[BehaviorType](http://stixproject.github.io/data-model/1.2/ttp/BehaviorType/)")

(def-map-type Infrastructure
  (f/optional-entries
   (f/entry :title c/ShortString)
   (f/entry :description c/Markdown
            :description (str "text (Markdown) description of specific classes "
                              "or instances of infrastructure utilized for cyber "
                              "attack"))
   (f/entry :short_description c/MedString)
   (f/entry :type v/AttackerInfrastructure
            :description "represents the type of infrastructure being described"))
  :reference "[Infrastructure Type](http://stixproject.github.io/data-model/1.2/ttp/Infrastructure Type/)")

(def-map-type Resource
  (f/optional-entries
   (f/entry :tools c/Tool
            :description "The tool leveraged by this TTP")
   (f/entry :infrastructure Infrastructure
            :description (str "infrastructure observed to have been utilized for "
                              "cyber attack"))
   (f/entry :personas c/Identity))
  :reference "[ResourceType](http://stixproject.github.io/data-model/1.2/ttp/ResourceType/)")

(def-map-type VictimTargeting
  (f/optional-entries
   (f/entry :identity c/Identity
            :description (str "infrastructure observed to have been utilized for "
                              "cyber attack"))
   (f/entry :targeted_systems [v/SystemType]
            :description "type of system that is targeted")
   (f/entry :targeted_information [v/InformationType]
            :description "a type of information that is targeted")
   (f/entry :targeted_observables [c/Observable]
            :comment "Was targeted_technical_details"
            :description "targeted observables"))
  :reference "[VictimTargetingType](http://stixproject.github.io/data-model/1.2/ttp/VictimTargetingType/)")

(def type-identifier "ttp")

(def-eq TTPTypeIdentifier type-identifier)

(def ttp-desc
  "A TTP is an instance of a Tool, Technique, or Procedure used by a cyber [actor](actor.md)")

(def ttp-desc-link
  "[TTPType](http://stixproject.github.io/data-model/1.2/ttp/TTPType/)")

(def-entity-type TTP
  {:description ttp-desc
   :reference ttp-desc-link}
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type TTPTypeIdentifier)
   (f/entry :valid_time c/ValidTime
            :description (str "a timestamp for the definition of a specific "
                              "version of a TTP item"))
   (f/entry :ttp_type c/ShortString
            :description "type of this TTP"))
  (f/optional-entries
   (f/entry :intended_effect [v/IntendedEffect]
            :description "the suspected intended effect for this TTP")
   (f/entry :behavior Behavior
            :description (str "describes the attack patterns, malware, or "
                              "exploits that the attacker leverages to execute "
                              "this TTP"))
   (f/entry :resources Resource
            :description (str "infrastructure or tools that the adversary uses "
                              "to execute this TTP"))
   (f/entry :victim_targeting VictimTargeting
            :description (str "characterizes the people, organizations, "
                              "information or access being targeted"))
   (f/entry :kill_chains [v/KillChain]))
  ;; Not provided: handling
  ;; Not provided: related_packages (deprecated)
  )

(def-entity-type NewTTP
  "For submitting a new TTP"
  (:entries TTP)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type TTPTypeIdentifier)
   (f/entry :valid_time c/ValidTime)))

(def-entity-type StoredTTP
  "An ttp as stored in the data store"
  (:entries TTP)
  c/base-stored-entity-entries)

(def TTPRef
  (c/ref-for-type type-identifier))
