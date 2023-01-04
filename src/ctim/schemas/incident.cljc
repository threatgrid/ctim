(ns ctim.schemas.incident
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
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

(def-map-type AssetTarget
  (concat
   (f/required-entries
    (f/entry :id c/Reference))
   (f/optional-entries
    (f/entry :external_ids [f/any-str])
    (f/entry :score f/any-num)
    (f/entry :properties [{:name s/Str :value f/any}])
    (f/entry :observables [c/Observable]))))

(def IncidentTarget
  (concat
   (:entries c/IdentitySpecification)
   (f/optional-entries
    (f/entry :assets [AssetTarget]))))

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
   (f/entry :targets [IncidentTarget]
            :description "a set of targets identified by observables and optionnally identified assets.")
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
