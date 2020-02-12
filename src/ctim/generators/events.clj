(ns ctim.generators.events
  (:require [clojure.test.check.generators :as gen :include-macros true]
            [ctim.events.schemas :as es]
            [ctim.generators.common :as c]
            [ctim.generators.entities :as ge]
            [ctim.generators.id :as gi]))

;; This is a work in progress

(def gen-event-type
  (gen/elements es/event-types))

(def gen-event
  (gen/fmap (fn [[id entity event-type]]
              (c/complete es/Event
                          {:entity entity
                           :type event-type
                           :id id}))
            (gen/tuple
             (gi/gen-url-id-of-type :event)
             ge/gen-any-example-entity
             gen-event-type)))
