(ns ctim.schemas.actor
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq]])))

(def type-identifier "actor")

(def-eq ActorTypeIdentifier type-identifier)

(def actor-desc
  "Describes malicious actors or adversaries related to a cyber attack.")

(def actor-desc-link
  "[ThreatActorType](http://stixproject.github.io/data-model/1.2/ta/ThreatActorType/)")

(def-entity-type Actor
  {:description actor-desc
   :reference actor-desc-link}
  c/base-entity-entries
  c/sourced-object-entries
  c/described-entity-entries
  (f/required-entries
   (f/entry :type ActorTypeIdentifier)
   (f/entry :valid_time c/ValidTime
            :description (str "Indicates the time span for which the information about the Actor is relevant, "
                              "and after which it could become outdated.")))
  (f/optional-entries
   (f/entry :actor_types [v/ThreatActorType])
   (f/entry :identity c/Identity
            :description (str "Can contain information such as the name of the attacker, the group or "
                              "organization they belong to, or any other identifier that can help in the "
                              "attribution process."))
   (f/entry :motivation v/Motivation
            :description (str "The reason or purpose behind the malicious activity attributed to this Actor. "
                              "By understanding a threat actor's motivation, analysts can better predict "
                              "the attacker's behavior and anticipate future malicious actions."))
   (f/entry :sophistication v/Sophistication
            :description (str "Represents the level of expertise and skill that the threat actor has displayed "
                              "in their malicious activities. Can help security analysts assess the potential "
                              "impact of an attacker's TTPs and determine the potential attack surface. "
                              "\n\n"
                              "For example, a threat actor with a low sophistication level may primarily rely "
                              "on off-the-shelf malware and attack tools, while an attacker with high "
                              "sophistication may use custom tools with advanced evasion techniques, zero-day "
                              "exploits, and sophisticated methods for command and control of their malware. "
                              "\n\n"
                              "The sophistication level of an attacker can also be inferred based on several "
                              "factors such as the complexity of attacks, the attacker's knowledge of the "
                              "targeted organization's systems, and the attacker's ability to remain "
                              "undetected."
                              "\n\n"
                              "If an attacker shows a high level of sophistication in reconnaissances, social "
                              "engineering, and phishing, then the attacker may have a good knowledge of the "
                              "targeted organization and its employees. This means that the attacker may be "
                              "more successful in infiltrating the organization's network and compromising its "
                              "systems."))
   (f/entry :intended_effect v/IntendedEffect
            :description (str "Represents the desired outcome or impact the threat actor is trying to achieve "
                              "through their malicious activities. "
                              "\n\n "
                              "Helps security analysts to understand the attacker's goals beyond the immediate "
                              "impact of the attack. By understanding the intended effect, analysts can draw "
                              "connections between seemingly unrelated attacks and build a more complete "
                              "understanding of an attacker's long-term goals and motivations."))
   (f/entry :planning_and_operational_support c/LongString
            :description (str "Provides information about the resources and capabilities of the attacker that "
                              "could be used to assist in planning and operations related to the threat.\n\n It "
                              "can be used to describe Infrastructure, Tools, Techniques, and Capabilities used "
                              "by the threat actor."))
   (f/entry :confidence v/HighMedLow
            :description
            (str "This field can help analysts decide how much trust they can put in the "
                 "information provided by the threat intelligence sources.\n\n"
                 "For example, an Actor entity can have high confidence if the organization's "
                 "security researchers have been tracking it for a long time and have gathered a "
                 "significant amount of intelligence about it through various sources, such as "
                 "analysis of malware, network traffic, and human intelligence. In contrast, low "
                 "confidence may indicate the organization has only seen limited or circumstantial "
                 "evidence."))
   (f/entry :aliases [c/ShortString]
            :description (str "A list of other names that this Threat Actor is "
                              "believed to use.")))
  ;; Not provided: handling
  ;; Not provided: related_packages (deprecated)
  )

(def-entity-type NewActor
  "Schema for submitting new Actors"
  (:entries Actor)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type ActorTypeIdentifier)
   (f/entry :valid_time c/ValidTime)))

(def ActorRef
  (c/ref-for-type type-identifier))
