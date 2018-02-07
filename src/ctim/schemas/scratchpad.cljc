(ns ctim.schemas.scratchpad
  (:require
   [ctim.schemas.bundle :as bun]
   [ctim.schemas.common :as c]
   #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
      :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq]])))

(def type-identifier "scratchpad")

(def-eq ScratchpadTypeIdentifier type-identifier)

(def scratchpad-desc
  "Describes a CTIM Scratchpad which works like a structured gist")

(def-map-type Update
  (f/required-entries
   (f/entry :field f/any-str)
   (f/entry :action f/any-str)
   (f/entry :metadata (f/map [(f/entry f/any-keyword f/any)]))))

(def-map-type Text
  (f/required-entries
   (f/entry :type f/any-str)
   (f/entry :text f/any-str)))

(def-entity-type Scratchpad
  {:description scratchpad-desc
   :reference "#"}
  c/base-entity-entries
  c/sourcable-object-entries
  c/describable-entity-entries
  (f/required-entries
   (f/entry :type ScratchpadTypeIdentifier))
  (f/optional-entries
   (f/entry :observables (f/seq-of c/Observable))
   (f/entry :bundle bun/Bundle)
   (f/entry :texts (f/seq-of Text))))

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
