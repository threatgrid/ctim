(ns ctim.schemas.incident
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])
            #?(:clj [clojure.test.check.generators :as gen])))

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
  (str "[NIST Computer Security Incident Handling "
       "Guide](https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf)"))

(def sample-score-types
  #{:ttp
    :global
    :asset})

(defn valid-score?
  [score]
  (<= 0 score))

(def ScoreType
  (f/enum sample-score-types
          :open? true))

(def Score
  (f/num
   :description "A non-negative score number."
   :spec valid-score?
   #?@(:clj [:gen (gen/double* {:min 0 :NaN? false :infinite? false})])))

(def-map-type IncidentScores
  (f/optional-entries
   (f/entry ScoreType Score
            :description
            (str
             "Field is used to indicate the severity or impact of the threat represented by the incident.\n"
             "It's an open-type dictionary object with score types and numeric value of the score.\n\n"
             "For example, systems can have the following score types:"
             "\n\n"
             "- `asset` - assesses the potential damage or harm that the threat can cause to the affected asset(s). "
             "The scale ranges from 0 to 10, with 10 indicating the highest potential harm. "
             "\n\n"
             "- `global` - assesses the overall impact or significance of the threat to the organization or wider "
             "community. The scale ranges from 0 to 1000, with 1000 indicating the highest impact."
             "\n\n"
             "- `ttp` - a measure of the threat actor's proficiency in utilizing TTPs. "
             "Typically, ranges from 0-100, with a higher score indicating a greater threat or concern."))))

(def-map-type MetaData
  (f/optional-entries
   (f/entry f/any f/any
            :description "custom field relevant to attach meta data to.")))

(def-entity-type Incident
  {:description incident-desc}
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type IncidentTypeIdentifier)
   (f/entry :meta MetaData
            :description "metadata associated to the incident.")
   (f/entry :confidence v/HighMedLow
            :description
            (str "Represents the level of certainty or trustworthiness associated with the "
                 "incident. It denotes the reliability of the intelligence associated with the "
                 "incident."
                 "\n"
                 "The `confidence` field can take on several values, including:"
                 "\n"
                 "- `info`: Indicates that the incident information is based on sources with no "
                 "previous track record or there is no track record for the source reporting the "
                 "incident."
                 "\n"
                 "- `low`: Indicates that the incident information is based on sources "
                 "with a questionable track record or there is limited information about the "
                 "accuracy of the source."
                 "\n"
                 "- `medium`: Indicates that the incident information is "
                 "based on sources with a mixed track record or of uncertain reliability."
                 "\n"
                 "- `high`: Indicates that the incident information is based on sources with a "
                 "proven track record and high degree of reliability."
                 "\n"
                 "The `confidence` field can be used to indicate the level of trust and confidence "
                 "that can be attributed to the incident, and it may impact how the incident is "
                 "prioritized, analyzed and addressed. It can also help in the decision-making "
                 "process associated with the incident response activities."
                 "\n"
                 "It is important to note that the `confidence` field is subjective and can be "
                 "interpreted differently by different organizations or analysts. As such, it is "
                 "often used in conjunction with other intelligence attributes, such as the "
                 "`severity` field, to provide a more complete picture of the incident."))
   (f/entry :status v/Status
            :description (str "The `status` field represents the current state of an incident within the "
                              "incident management process. Its values help in tracking and reporting the "
                              "progress of the incident from its discovery to its resolution."))
   (f/entry :incident_time IncidentTime
            :comment "Was 'time'; renamed for clarity"
            :description "Relevant time values associated with this Incident."))
  (f/optional-entries
   (f/entry :scores IncidentScores
            :description "Used to indicate the severity or impact score of the threat represented by the incident.")
   (f/entry :status_disposition v/StatusDisposition
            :description "The status disposition of the incident that explains why the incident has some status set.")
   (f/entry :categories [v/IncidentCategory]
            :description "A set of categories for this incident.")
   (f/entry :discovery_method v/DiscoveryMethod
            :description "Identifies how the incident was discovered.")
   (f/entry :intended_effect v/IntendedEffect
            :description "Specifies the suspected intended effect of this incident")
   (f/entry :assignees [c/ShortString]
            :description "A set of owners assigned to this incident.")
   (f/entry :promotion_method v/PromotionMethod
            :description (str "Describes method for promoting an Incident, whether manually or automatically. "
                              "An Incident may be created manually by a SOAR analyst or SOC operator, or "
                              "through an automated correlation or aggregation rule or engine that matches a "
                              "specific set of events or alerts, and promotes them to Incident(s)."))
   (f/entry :severity v/Severity
            :description (str "Represents the potential impact of an incident on an organization's security "
                              "posture and business operations. It helps organizations prioritize and allocate "
                              "resources for incident response based on the severity level of the incident "
                              "\n"
                              "It helps analysts and incident handlers prioritize incidents by indicating the "
                              "level of risk and potential impact associated with the incident. This enables "
                              "organizations to allocate resources efficiently and address the most critical "
                              "incidents first."
                              "\n"
                              "Can also be used to generate reports and metrics for measuring the effectiveness "
                              "of the incident response process and to identify trends and patterns in the "
                              "threat landscape."
                              "\n"
                              "It is important to note that the `severity` field is subjective and can be "
                              "interpreted differently by different organizations or analysts. Therefore, it "
                              "should be used in conjunction with other intelligence attributes, such as the "
                              "`confidence` field, to provide a more comprehensive view of the incident."))
   (f/entry :tactics [c/ShortString]
            :description (str "Represents the offensive techniques, approaches, or procedures that an adversary "
                              "may use to achieve their objectives during an attack. It helps in understanding "
                              "the intent and capabilities of the adversary and can be used to identify "
                              "indicators of attack (IoAs) or indicators of compromise (IoCs) that are "
                              "associated with the adversary's tactics."))
   (f/entry :techniques [c/ShortString]
            :description (str "Represents the specific methods or actions used by an attacker "
                              "to carry out an offensive maneuver or achieve their goals."))))

(def-entity-type NewIncident
  "For submitting a new Incident."
  (:entries Incident)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type IncidentTypeIdentifier)))

(def IncidentRef
  (c/ref-for-type type-identifier))
