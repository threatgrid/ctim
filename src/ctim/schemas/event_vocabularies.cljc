(ns ctim.schemas.event_vocabularies
  (:require [ctim.schemas.vocabularies :as v]
            [ctim.schemas.common :as c]
            #?(:clj  [flanders.core :as f :refer [def-enum-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-enum-type def-map-type def-eq]])))

(def event_type_vocabulary #{"endpoint"
                             "endpoint.process_start_event"
                             "endpoint.library_load_event"
                             "endpoint.file_create_event"
                             "endpoint.file_delete_event"
                             "endpoint.file_modify_event"
                             "endpoint.file_move_event"
                             "endpoint.netflow_event"
                             "endpoint.http_event"
                             "endpoint.registry_create_event"
                             "endpoint.registry_set_event"
                             "endpoint.registry_delete_event"
                             "endpoint.registry_rename_event"})
(def-map-type BaseEvent
  (f/required-entries
   (f/entry :time c/ObservedTime)))


(def process-create-type-identifier "ProcessCreateEvent")
(def-eq ProcessCreateTypeIdentifier process-create-type-identifier)

(def-map-type ProcessCreateType
  (concat
   (f/required-entries
    (f/entry :type ProcessCreateTypeIdentifier)
    (f/entry :creation_time c/ValidTime)
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

(def library-load-type-identifier "LibraryLoadEvent")
(def-eq LibraryLoadTypeIdentifier library-load-type-identifier)

(def-map-type LibraryLoadType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type LibraryLoadTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :dll_library_name c/ShortString)
    (f/entry :dll_library_path c/MedString))
   (f/optional-entries
    (f/entry :process_guid f/any-int)
    (f/entry :process_username c/ShortString))))


(def file-create-type-identifier "FileCreateEvent")
(def-eq FileCreateTypeIdentifier file-create-type-identifier)

(def-map-type FileCreateType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type FileCreateTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :file_name c/ShortString)
    (f/entry :file_path c/MedString))
   (f/optional-entries
    (f/entry :process_guid f/any-int)
    (f/entry :process_username c/ShortString)
    (f/entry :failed (f/bool :default false)))))

(def file-delete-type-identifier "FileDeleteEvent")
(def-eq FileDeleteTypeIdentifier file-delete-type-identifier)

(def-map-type FileDeleteType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type FileDeleteTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :file_name c/ShortString)
    (f/entry :file_path c/MedString))
   (f/optional-entries
    (f/entry :process_guid f/any-int)
    (f/entry :process_username c/ShortString)
    (f/entry :failed (f/bool :default false)))))

(def file-modify-type-identifier "FileModifyEvent")
(def-eq FileModifyTypeIdentifier file-modify-type-identifier)

(def-map-type FileModifyType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type FileModifyTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :file_name c/ShortString)
    (f/entry :file_path c/MedString))
   (f/optional-entries
    (f/entry :process_guid f/any-int)
    (f/entry :process_username c/ShortString)
    (f/entry :success (f/bool :default false)))))

(def file-move-type-identifier "FileMoveEvent")
(def-eq FileMoveTypeIdentifier file-move-type-identifier)

(def-map-type FileMoveType
  (concat
   (f/required-entries
    (f/entry :type FileMoveTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :file_name c/ShortString)
    (f/entry :file_path c/MedString)
    (f/entry :old_name c/ShortString)
    (f/entry :new_name c/ShortString))
   (f/optional-entries
    (f/entry :process_guid f/any-int)
    (f/entry :process_username c/ShortString))))

(def-enum-type Protocol protocol)

(def-map-type Traffic
  (concat
   (f/required-entries
    (f/entry :protocol f/any-int)
    (f/entry :source_ip f/any-str)
    (f/entry :destination_ip f/any-str)
    (f/entry :source_port f/any-int)
    (f/entry :destination_port f/any-int)
    (f/entry :direction #{"incoming" "outgoing"}))
   (f/optional-entries
    (f/entry :destination_host_name f/any-str)
    (f/entry :source_subnet f/any-str)
    (f/entry :destination_subnet f/any-str))))

(def netflow-type-identifier "NetflowEvent")
(def-eq NetflowTypeIdentifier netflow-type-identifier)

(def-map-type NetflowType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type NetflowTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :traffic Traffic))
   (f/optional-entries
    (f/entry :process_username c/ShortString)
    (f/entry :process_guid f/any-int)
    (f/entry :process_path c/ShortString)
    (f/entry :process_args c/ShortString)
    (f/entry :process_hash c/ShortString)
    (f/entry :process_account_type c/ShortString)
    (f/entry :process_account c/ShortString)
    (f/entry :parent_process_id f/any-int)
    (f/entry :parent_process_name c/ShortString)
    (f/entry :parent_process_path c/ShortString)
    (f/entry :parent_process_args c/ShortString)
    (f/entry :parent_process_hash c/ShortString)
    (f/entry :parent_process_account c/ShortString)
    (f/entry :parent_process_account_type c/ShortString)
    (f/entry :flow_time c/ValidTime)
    (f/entry :byte_count_out f/any-int)
    (f/entry :byte_count_in f/any-int))))

(def http-type-identifier "HTTPEvent")
(def-eq HTTPTypeIdentifier http-type-identifier)

(def-map-type HTTPType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type HTTPTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :host c/ShortString)
    (f/entry :url_port c/ShortString)
    (f/entry :method #{"GET" "POST"})
    (f/entry :traffic Traffic))
   (f/optional-entries
    (f/entry :process_guid f/any-int)
    (f/entry :process_username c/ShortString)
    (f/entry :query c/LongString)
    (f/entry :encrypted f/bool))))


(def registry-create-type-identifier "RegistryCreateEvent")
(def-eq RegistryCreateTypeIdentifier registry-create-type-identifier)

(def-map-type RegistryCreateType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type RegistryCreateTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :registry_key c/ShortString))
   (f/optional-entries
    (f/entry :process_guid f/any-int)
    (f/entry :process_username c/ShortString))))

(def registry-set-type-identifier "RegistrySetEvent")
(def-eq RegistrySetTypeIdentifier registry-set-type-identifier)

(def-map-type RegistrySetType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type RegistrySetTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :registry_key c/ShortString)
    (f/entry :registry_value c/MedString)
    (f/entry :registry_data c/LongString))
   (f/optional-entries
    (f/entry :process_guid f/any-int)
    (f/entry :process_username c/ShortString)
    (f/entry :registry_data_length f/any-int))))

(def registry-delete-type-identifier "RegistryDeleteEvent")
(def-eq RegistryDeleteTypeIdentifier registry-delete-type-identifier)

(def-map-type RegistryDeleteType
  (concat
   (f/required-entries
    (f/entry :type RegistryDeleteTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :registry_key c/ShortString)
    (f/entry :registry_value c/MedString))
   (f/optional-entries
    (f/entry :process_guid f/any-int)
    (f/entry :process_username c/ShortString))))

(def registry-rename-type-identifier "RegistryRenameEvent")
(def-eq RegistryRenameTypeIdentifier registry-rename-type-identifier)

(def-map-type RegistryRenameType
  (concat
   BaseEvent
   (f/required-entries
    (f/entry :type RegistryRenameTypeIdentifier)
    (f/entry :process_id f/any-int)
    (f/entry :process_name c/ShortString)
    (f/entry :registry_key c/ShortString)
    (f/entry :registry_old_key c/ShortString))
   (f/optional-entries
    (f/entry :process_guid f/any-int)
    (f/entry :process_username c/ShortString))))
