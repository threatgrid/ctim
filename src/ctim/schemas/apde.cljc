(ns ctim.schemas.apde
  #?@
  (:clj
   [(:require
     [ctim.schemas.common :as c]
     [ctim.schemas.relationship :as rel]
     [ctim.schemas.vocabularies :as v]
     [ctim.schemas.data-table :as dt]
     [flanders.core :as f :refer [def-entity-type def-eq def-map-type]])]
   :cljs
   [(:require
     [ctim.schemas.common :as c]
     [ctim.schemas.relationship :as rel]
     [ctim.schemas.vocabularies :as v]
     [ctim.schemas.data-table :as dt]
     [flanders.core
      :as
      f
      :refer-macros
      [def-entity-type def-eq def-map-type]])]))

(def-map-type SightingAPDECommon
  (f/required-entries
   (f/entry :puid f/num)
   (f/entry :app f/any-str)
   (f/entry :app_path f/any-str)
   (f/entry :timestamp c/Time)
   (f/entry :user f/any-str)
   (f/entry :parent_user f/any-str)
   (f/entry :pid f/num)
   (f/entry :user_sid f/any-str)))


(def-map-type SightingAPDEProcessStartEvent
  (concat
   (f/required-entries SightingAPDECommon)
   (f/required-entries
    (f/entry :event_type (f/enum "cisco:apde:start_event"))
    (f/entry :parent_app f/any-str)
    (f/entry :surrogate_app f/any-str)
    (f/entry :cmd_line f/any-str)
    (f/entry :parent_app_path f/any-str)
    (f/entry :surrogate_user f/any-str)
    (f/entry :parent_user_sid f/any-str)
    (f/entry :args (f/seq-of f/any-str))
    (f/entry :surrogate_app_path f/any-str)
    (f/entry :parent_puid f/num)
    (f/entry :parent_pid f/num))))

(def-map-type SightingAPDEFileCreateEvent
  (concat
   (f/required-entries SightingAPDECommon)
   (f/required-entries
    (f/entry :event_type (f/enum "cisco:apde:file_create_event"))
    (f/entry :failed f/bool)
    (f/entry :path f/any-str)
    (f/entry :name f/any-str))))

(def-map-type SightingAPDEFileDeleteEvent
  (concat
   (f/required-entries
    SightingAPDECommon)
   (f/required-entries
    (f/entry :event_type (f/enum "cisco:apde:file_delete_event"))
    (f/entry :path f/any-str))))

(def-map-type SightingAPDEFileMoveEvent
  (concat
   (f/required-entries
    SightingAPDECommon)
   (f/required-entries
    (f/entry :event_type (f/enum "cisco:apde:file_move_event"))
    (f/entry :failed f/bool)
    (f/entry :path f/any-str)
    (f/entry :name f/any-str)
    (f/entry :old_path f/any-str)
    (f/entry :old_name f/any-str))))

(def-map-type SightingAPDERegistryCreateEvent
  (concat
   (f/required-entries SightingAPDECommon)
   (f/required-entries
    (f/entry :event_type (f/enum "cisco:apde:registry_create_event"))
    (f/entry :key f/any-str))))

(def-map-type SightingAPDENetflowOutEvent
  (concat
   (f/required-entries SightingAPDECommon)
   (f/required-entries
    (f/entry :event_type (f/enum "cisco:apde:netflow_out_event"))
    (f/entry :remote_port f/num)
    (f/entry :local_ipv4 f/any-str)
    (f/entry :remote_ipv4 f/any-str)
    (f/entry :protocol f/num)
    (f/entry :local_port f/num))))

(def-map-type SightingAPDELibraryLoadEvent
  (concat
   (f/required-entries SightingAPDECommon)
   (f/entry :name f/any-str)))


(def-map-type SightingAPDEEvent
  (f/conditional
   #(#{"cisco_adpe_start_event"} %) SightingAPDEProcessStartEvent
   #(#{"cisco_adpe_file_create_event"} %) SightingAPDEFileCreateEvent
   #(#{"cisco_adpe_file_delete_event"} %) SightingAPDEFileDeleteEvent
   #(#{"cisco_adpe_file_move_event"} %) SightingAPDEFileMoveEvent
   #(#{"cisco_adpe_file_create_event"} %) SightingAPDERegistryCreateEvent
   #(#{"cisco_adpe_file_create_event"} %) SightingAPDENetflowOutEvent))

(def-map-type SightingAPDEMatchedActivity
  (concat
   (f/required-entries
    (f/entry :events (f/seq-of SightingAPDEEvent)))
   (f/optional-entries
    (f/entry :limited f/num)
    (f/entry :matched f/bool))))

(def-map-type APDE
  (f/entry :matched_activity SightingAPDEMatchedActivity))
