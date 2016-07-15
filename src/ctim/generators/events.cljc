(ns ctim.generators.events
  (:require [clojure.test.check.generators :as gen :include-macros true]
            [ctim.events.schemas :as es]
            [ctim.generators.common :as c]
            [ctim.generators.schemas :as gs]))

;; This is a work in progress

(def gen-event-type
  (gen/elements es/event-types))

(defn gen-event-of-type [event-type]
  (gen/fmap (fn [entity]
              (c/complete es/Event
                          {:entity entity
                           :type event-type
                           :id (:id entity)}))
            (gen/let [entity-type (gen/elements gs/entity-types)
                      entity (gs/gen-entity entity-type)]
              entity)))

(def gen-event
  (gen/let [event-type gen-event-type
            event      (gen-event-of-type event-type)]
    event))
