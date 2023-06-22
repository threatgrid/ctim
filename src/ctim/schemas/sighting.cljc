(ns ctim.schemas.sighting
  #?@
   (:clj
    [(:require
      [ctim.schemas.common :as c]
      [ctim.schemas.relationship :as rel]
      [ctim.schemas.sighting.context :as ctx]
      [ctim.schemas.vocabularies :as v]
      [ctim.schemas.data-table :as dt]
      [flanders.core :as f :refer [def-entity-type def-eq def-map-type]])]
    :cljs
    [(:require
      [ctim.schemas.common :as c]
      [ctim.schemas.relationship :as rel]
      [ctim.schemas.sighting.context :as ctx]
      [ctim.schemas.vocabularies :as v]
      [ctim.schemas.data-table :as dt]
      [flanders.core
       :as
       f
       :refer-macros
       [def-entity-type def-eq def-map-type]])]))


(def-map-type SensorCoordinates
  (concat
   (f/required-entries
    (f/entry :type v/Sensor)
    (f/entry :observables [c/Observable]))
   (f/optional-entries
    (f/entry :os f/any-str)))
  :description "Describes the device that made the sighting (sensor) and contains identifying observables for the sensor.")

;; A generic table of data, consisting of types and documented
;; columns, and 1 or more rows of data.
(def-map-type SightingDataTable
  (concat
   (f/required-entries
    (f/entry :columns (f/seq-of dt/ColumnDefinition)
             :description "an ordered list of column definitions")
    (f/entry :rows (f/seq-of (f/seq-of dt/Datum))
             :description "an ordered list of rows"))
   (f/optional-entries
    (f/entry :row_count f/any-int
             :description "The number of rows in the data table.")))
  :description "An embedded data table for sightings data.")

(def type-identifier "sighting")

(def-eq SightingTypeIdentifier type-identifier)

(def sighting-desc
  (str "A sighting indicates that a particular entity or [indicator](indicator.md) was "
       "observed in an environment and can be an indication of a current or potential threat."))

(def sighting-desc-link
  "[SightingType](http://stixproject.github.io/data-model/1.2/indicator/SightingType/)")

(def-entity-type Sighting
  {:description sighting-desc
   :reference sighting-desc-link}
  c/base-entity-entries
  c/sourcable-object-entries
  c/describable-entity-entries
  (f/required-entries
   (f/entry :type SightingTypeIdentifier)
   (f/entry :observed_time c/ObservedTime)
   (f/entry :confidence v/HighMedLow)
   (f/entry :count c/PosInt
            :description (str "The number of times an indicator was observed within a certain period of time."
                              "\n"
                              "For example, if an IP address associated with known malicious activity is "
                              "observed once within a period of time, it may indicate a low-level threat. "
                              "However, if the same IP address is observed multiple times within a short time "
                              "frame, it may indicate a more severe and persistent threat."
                              "\n"
                              "It can also be used to prioritize security alerts and indicate the urgency of a "
                              "response. High counts indicate that an indicator is actively being used in a "
                              "larger campaign, while low counts may indicate isolated incidents.")))
  (f/optional-entries
   (f/entry :internal (f/bool :default false)
            :description (str "If `true`, indicates that the sighting was reported from internal sources, such "
                              "as an organization's own internal security tools or SOC."
                              "\n "
                              "Internal sightings are often considered more reliable and actionable than "
                              "external sightings, which are reported from external sources and may have a "
                              "lower level of trustworthiness. Internal sightings can provide more context and "
                              "can help identify potential threats that are unique to a particular environment "
                              "or organization."
                              "\n "
                              "Internal sightings can also help organizations prioritize their security "
                              "response efforts by identifying threats that are specific to their environment "
                              "and may not yet be widely known."))
   (f/entry :severity v/Severity)
   (f/entry :resolution v/Resolution
            :description "Represents the disposition or actions taken on the associated threat intelligence.")
   (f/entry :data SightingDataTable
            :description "An embedded data table for the Sighting.")
   (f/entry :sensor v/Sensor
            :description (str "The OpenC2 Actuator name that best fits the "
                              "device that is creating this sighting (e.g. "
                              "network.firewall)"))
   (f/entry :sensor_coordinates SensorCoordinates)
   (f/entry :targets (f/seq-of c/IdentitySpecification)
            :description (str "May include one or more targets that observed the associated indicator. Targets "
                              "can include network devices, host devices, or other entities that are capable of "
                              "detecting indicators of compromise."
                              "\n\n"
                              "Can be used to assess the scope of potential threats, helping analysts "
                              "understand which devices or components of the network may be vulnerable to "
                              "attack. For example, if a particular malware strain is detected on several "
                              "different systems within an organization, the `targets` field may indicate which "
                              "systems are affected and which may need to be isolated or patched to prevent "
                              "further spread."))
   (f/entry :observables [c/Observable]
            :description "The object(s) of interest")
   (f/entry :relations [c/ObservedRelation]
            :description (str "Provide any context we can about where the "
                              "observable came from"))
   (f/entry :context ctx/Context
            :description (str "Context including the event type that best fits the type of the sighting"))))

(def-entity-type NewSighting
  "For submitting a new Sighting"
  (:entries Sighting)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type SightingTypeIdentifier)
   (f/entry :count c/PosInt)
   (f/entry :confidence v/HighMedLow)))

(def SightingRef
  (c/ref-for-type type-identifier))
