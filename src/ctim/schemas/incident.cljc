(ns ctim.schemas.incident
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            [ctim.schemas.asset-properties :refer [AssetProperty]]
            #?(:clj [ctim.lib.generators :as gen])
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])))

(def-map-type IncidentTime
  (concat
   (f/required-entries
    (f/entry :opened c/Time
             :description "Time the incident was first opened."))
   (f/optional-entries
    (f/entry :discovered c/Time
             :description "Time the incident was first discovered.")
    (f/entry :reported c/Time
             :description "Time the incident was first reported.")
    (f/entry :remediated c/Time
             :description "Time that the remediation of the damage from the incident was completed.")
    (f/entry :closed c/Time
             :description "Time that the incident was last closed.")
    (f/entry :rejected c/Time
             :description "Time that the incident was first rejected."))))

(def type-identifier "incident")

(def-eq IncidentTypeIdentifier type-identifier)

(def incident-desc
  "Information about computer security incident response. A computer security
   incident is a violation or imminent threat of violation of computer
   security policies, acceptable use policies, or standard security practices.
   Incidents pertain to one or more *adverse events*, each of which is modeled
   as a [sighting](sighting.md).")

(def incident-desc-link
  "[NIST Computer Security Incident Handling Guide](https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf)")

(defn valid-score?
  [score]
  (<= 0 score))

(def Score
  (f/num
   :description "a positive score number"
   :spec valid-score?
   #?(:clj :gen)
   #?(:clj gen/score)))

(def-map-type TypedScore
  (f/required-entries
   (f/entry :score Score
            :description "a numeric score")
   (f/entry :type f/any-str
            :description "a label representing the type of score"))
  :description "A score that is assigned to an incident.")

(def-map-type AssetTarget
  (concat
   (f/required-entries
    (f/entry :id c/Reference))
   (f/optional-entries
    (f/entry :external_ids [f/any-str])
    (f/entry :score Score)
    (f/entry :properties [AssetProperty])
    (f/entry :observables [c/Observable]))))

(def-map-type SummaryTarget
  (concat
   (:entries c/IdentitySpecification)
   (f/optional-entries
    (f/entry :assets [AssetTarget]))))

(def-map-type IncidentSummary
  (f/optional-entries
   (f/entry f/any f/any
            :description "any meta relevant to the context of the incident.")
   (f/entry :targets [SummaryTarget]
            :description "a set of targets identified by observables and optionnally identified assets.")))

(def-entity-type Incident
  {:description incident-desc}
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type IncidentTypeIdentifier)
   (f/entry :confidence v/HighMedLow
            :description (str "level of confidence held in the characterization "
                              "of this Incident"))
   (f/entry :status v/Status
            :description "current status of the incident")
   (f/entry :incident_time IncidentTime
            :comment "Was 'time'; renamed for clarity"
            :description "relevant time values associated with this Incident"))
  (f/optional-entries
   (f/entry :summary IncidentSummary
            :description "a summary of the threat context and sightings linked to the incident")
   (f/entry :scores [TypedScore]
            :description "the scores associated to the incident")
   (f/entry :categories [v/IncidentCategory]
            :description "a set of categories for this incident")
   (f/entry :discovery_method v/DiscoveryMethod
            :description "identifies how the incident was discovered")
   (f/entry :intended_effect v/IntendedEffect
            :description "specifies the suspected intended effect of this incident")
   (f/entry :assignees [c/ShortString]
            :description "a set of owners assigned to this incident")
   (f/entry :promotion_method v/PromotionMethod
            :description "identifies how the incident was promoted")
   (f/entry :severity v/Severity
            :description "specifies the severity level of an Incident")
   (f/entry :tactics [c/ShortString]
            :description "specifies the list of tactic ids (ex: mitre tactic id) of an Incident")
   (f/entry :techniques [c/ShortString]
            :description "specifies the list of technique ids (ex: mitre technique id) of an Incident")))

(def-entity-type NewIncident
  "For submitting a new Incident"
  (:entries Incident)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type IncidentTypeIdentifier)))

(def IncidentRef
  (c/ref-for-type type-identifier))
