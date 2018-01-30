(ns ctim.schemas.scratchpad
  (:require
   [ctim.schemas.bundle :as bun]
   [ctim.schemas.common :as c]
   #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq]]
      :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq]])))

(def type-identifier "scratchpad")

(def-eq ScratchpadTypeIdentifier type-identifier)

(def scratchpad-desc
  "Describes a CTIM Scratchpad which works like a structured gist")

(def-entity-type Update
  (f/required-entries
   (f/entry :field f/any-keyword)
   (f/entry :action f/any-keyword)
   (f/entry :metadata (f/map-of f/any f/any))))

(def-entity-type Event
  (f/required-entries
   (f/entry :owner f/any-str)
   (f/entry :groups f/any-str-seq)
   (f/entry :entity (f/map-of f/any-keyword f/any))
   (f/entry :type f/any-str)
   (f/entry :id f/any-str))
  (f/optional-entries
   (f/entry :fields (f/seq-of Update))))

(def-entity-type Scratchpad
  {:description scratchpad-desc
   :reference "#"}
  c/base-entity-entries
  c/sourced-object-entries
  c/describable-entity-entries
  (f/required-entries
   (f/entry :type ScratchpadTypeIdentifier))
  (f/optional-entries
   (f/entry :observables (f/seq-of c/Observable))
   (f/entry :bundle bun/Bundle)
   (f/entry :events (f/seq-of Event))))

(def-entity-type NewScratchpad
  {:description scratchpad-desc
   :reference "#"}
  (:entries Scratchpad)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type ScratchpadTypeIdentifier)))

(def-entity-type StoredScratchpad
  {:description scratchpad-desc
   :reference "#"} 
  (:entries Scratchpad)
  c/base-stored-entity-entries)

(def ScratchpadRef
  (c/ref-for-type type-identifier))
