(ns ctim.schemas.sighting
  #?@
  (:clj
   [(:require
     [ctim.schemas.common :as c]
     [ctim.schemas.relationship :as rel]
     [ctim.schemas.vocabularies :as v]
     [ctim.schemas.event_vocabularies :as ev]
     [ctim.schemas.data-table :as dt]
     [flanders.core :as f :refer [def-entity-type def-eq def-map-type]])]
   :cljs
   [(:require
     [ctim.schemas.common :as c]
     [ctim.schemas.relationship :as rel]
     [ctim.schemas.vocabularies :as v]
     [ctim.schemas.event_vocabularies :as ev]
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
  "A single sighting of an [indicator](indicator.md)")

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
            :description "The number of times the sighting was seen"))
  (f/optional-entries
   (f/entry :internal (f/bool :default false)
            :description "Is it internal to our network")
   (f/entry :severity v/Severity)
   (f/entry :resolution v/Resolution)
   (f/entry :data SightingDataTable
            :description "An embedded data table for the Sighting.")
   (f/entry :sensor v/Sensor
            :description (str "The OpenC2 Actuator name that best fits the "
                              "device that is creating this sighting (e.g. "
                              "network.firewall)"))
   (f/entry :sensor_coordinates SensorCoordinates)
   (f/entry :targets (f/seq-of c/IdentitySpecification)
            :description (str "The target device. Where the sighting came from."))
   (f/entry :observables [c/Observable]
            :description "The object(s) of interest")
   (f/entry :relations [c/ObservedRelation]
            :description (str "Provide any context we can about where the "
                              "observable came from"))
   (f/entry :context [{:event_type ev/event_type_vocabulary
                       :details (f/conditional #(="endpoint.process_start_event" (:event_type %)) ev/ProcessCreateType
                                               #(="endpoint.library_load_event" (:event_type %)) ev/LibraryLoadType
                                               #(="endpoint.file_create_event" (:event_type %)) ev/FileCreateType
                                               #(="endpoint.file_delete_event" (:event_type %)) ev/FileDeleteType
                                               #(="endpoint.file_modify_event" (:event_type %)) ev/FileModifyType
                                               #(="endpoint.file_move_event" (:event_type %)) ev/FileMoveType
                                               #(="endpoint.netflow_out_event" (:event_type %)) ev/NetflowOutType
                                               #(="endpoint.http_out_event" (:event_type %)) ev/HTTPOutType
                                               #(="endpoint.registry_create_event" (:event_type %)) ev/RegistryCreateType
                                               #(="endpoint.registry_set_event" (:event_type %)) ev/RegistrySetType
                                               #(="endpoint.registry_delete_event" (:event_type %)) ev/RegistryDeleteType
                                               #(="endpoint.registry_rename_event" (:event_type %)) ev/RegistryRenameType)}]
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
