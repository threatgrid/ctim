(ns ctim.schemas.sighting.event
  #?@
   (:clj
    [(:require
      [ctim.schemas.common :as c]
      [flanders.core :as f :refer [def-enum-type def-eq def-map-type]])]
    :cljs
    [(:require
      [ctim.schemas.common :as c]
      [flanders.core
       :as
       f
       :refer-macros
       [def-enum-type def-eq def-map-type]])]))

;;--- Base Event

(def-map-type BaseEvent
  (f/required-entries
   (f/entry :time c/ObservedTime)))

;;--- Process Create Event

(def process-create-type-identifier "ProcessCreateEvent")
(def-eq ProcessCreateTypeIdentifier process-create-type-identifier)

(def-map-type ProcessCreateType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type ProcessCreateTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_name c/ShortString))
   (f/optional-entries
    (f/entry :process_guid f/any-int)
    (f/entry :process_args c/MedString)
    (f/entry :process_username c/ShortString)
    (f/entry :process_hash c/MedString)
    (f/entry :process_size f/any-int)
    (f/entry :process_disposition c/ShortString)
    (f/entry :parent_creation_time c/ValidTime)
    (f/entry :parent_process_id f/any-int)
    (f/entry :parent_process_guid f/any-int)
    (f/entry :parent_process_name c/ShortString)
    (f/entry :parent_process_args c/MedString)
    (f/entry :parent_process_username c/ShortString)
    (f/entry :parent_process_hash c/MedString)
    (f/entry :parent_process_size f/any-int)
    (f/entry :parent_process_disposition c/ShortString))))

;;--- Library Load Event

(def library-load-type-identifier "LibraryLoadEvent")
(def-eq LibraryLoadTypeIdentifier library-load-type-identifier)

(def-map-type LibraryLoadType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type LibraryLoadTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_guid f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :dll_library_name c/ShortString)
    (f/entry :dll_library_path c/MedString))))

;;--- File Create Event

(def file-create-type-identifier "FileCreateEvent")
(def-eq FileCreateTypeIdentifier file-create-type-identifier)

(def-map-type FileCreateType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type FileCreateTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_guid f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :file_name c/ShortString)
    (f/entry :file_path c/MedString)
    (f/entry :failed (f/bool :default false)))))

;;--- File Delete Event

(def file-delete-type-identifier "FileDeleteEvent")
(def-eq FileDeleteTypeIdentifier file-delete-type-identifier)

(def-map-type FileDeleteType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type FileDeleteTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_guid f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :file_name c/ShortString)
    (f/entry :file_path c/MedString)
    (f/entry :failed (f/bool :default false)))))

;;--- File Modify Event

(def file-modify-type-identifier "FileModifyEvent")
(def-eq FileModifyTypeIdentifier file-modify-type-identifier)

(def-map-type FileModifyType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type FileModifyTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_guid f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :file_name c/ShortString)
    (f/entry :file_path c/MedString)
    (f/entry :success (f/bool :default false)))))

;;--- File Move Event

(def file-move-type-identifier "FileMoveEvent")
(def-eq FileMoveTypeIdentifier file-move-type-identifier)

(def-map-type FileMoveType
  (concat
   (f/required-entries
    (f/entry :type FileMoveTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_guid f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :file_name c/ShortString)
    (f/entry :file_path c/MedString)
    (f/entry :old_name c/ShortString)
    (f/entry :new_name c/ShortString))))

;;--- NetflowOut Event

(def protocol
  #{"TCP"
    "UDP"
    "ICMP"
    "Any"})

(def-enum-type Protocol protocol)

(def-map-type Traffic
  (concat
   (f/required-entries
    (f/entry :protocol Protocol)
    (f/entry :source_ipv4 f/any-str)
    (f/entry :destination_ipv4 f/any-str)
    (f/entry :source_port f/any-int)
    (f/entry :destination_port f/any-int))
   (f/optional-entries
    (f/entry :source_ipv6 f/any-str)
    (f/entry :destination_ipv6 f/any-str))))

(def netflow-out-type-identifier "NetflowOutEvent")
(def-eq NetflowOutTypeIdentifier netflow-out-type-identifier)

(def-map-type NetflowOutType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type NetflowOutTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_guid f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :traffic Traffic))))

;;--- HTTPOut Event

(def http-out-type-identifier "HTTPOutEvent")
(def-eq HTTPOutTypeIdentifier http-out-type-identifier)

(def-map-type HTTPOutType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type HTTPOutTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_guid f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :host c/ShortString)
    (f/entry :url_port c/ShortString)
    (f/entry :method #{"GET" "POST"})
    (f/entry :query c/LongString)
    (f/entry :encrypted f/bool)
    (f/entry :server_push c/ShortString)
    (f/entry :traffic Traffic))))

;;--- Registry Create Event

(def registry-create-type-identifier "RegistryCreateEvent")
(def-eq RegistryCreateTypeIdentifier registry-create-type-identifier)

(def-map-type RegistryCreateType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type RegistryCreateTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_guid f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :registry_key c/ShortString))))

;;--- Registry Set Event

(def registry-set-type-identifier "RegistrySetEvent")
(def-eq RegistrySetTypeIdentifier registry-set-type-identifier)

(def-map-type RegistrySetType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type RegistrySetTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_guid f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :registry_key c/ShortString)
    (f/entry :registry_value c/MedString)
    (f/entry :registry_data c/LongString)
    (f/entry :registry_data_length f/any-int))))

;;--- Registry Delete Event

(def registry-delete-type-identifier "RegistryDeleteEvent")
(def-eq RegistryDeleteTypeIdentifier registry-delete-type-identifier)

(def-map-type RegistryDeleteType
  (concat
   (f/required-entries
    (f/entry :type RegistryDeleteTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_guid f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :registry_key c/ShortString)
    (f/entry :registry_value c/MedString))))

;;--- Registry Rename Event

(def registry-rename-type-identifier "RegistryRenameEvent")
(def-eq RegistryRenameTypeIdentifier registry-rename-type-identifier)

(def-map-type RegistryRenameType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type RegistryRenameTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_guid f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :registry_key c/ShortString)
    (f/entry :registry_old_key c/ShortString))))

(def-map-type Event
  (f/conditional
   #(= process-create-type-identifier (:type %)) ProcessCreateType
   #(= library-load-type-identifier (:type %)) LibraryLoadType
   #(= file-create-type-identifier (:type %)) FileCreateType
   #(= file-delete-type-identifier (:type %)) FileDeleteType
   #(= file-modify-type-identifier (:type %)) FileModifyType
   #(= file-move-type-identifier (:type %)) FileMoveType
   #(= netflow-out-type-identifier (:type %)) NetflowOutType
   #(= http-out-type-identifier (:type %)) HTTPOutType
   #(= registry-create-type-identifier (:type %)) RegistryCreateType
   #(= registry-set-type-identifier (:type %)) RegistrySetType
   #(= registry-delete-type-identifier (:type %)) RegistryDeleteType
   #(= registry-rename-type-identifier (:type %)) RegistryRenameType))
