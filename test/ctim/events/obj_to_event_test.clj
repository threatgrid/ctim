(ns ctim.events.obj-to-event-test
  (:require [clojure.data :refer [diff]]
            [clojure.spec.alpha :as cs]
            [clojure.test :refer [deftest is use-fixtures]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check.properties :refer [for-all]]
            [ctim.events.obj-to-event :as evt]
            [ctim.events.schemas :refer [CreateEvent
                                         UpdateEvent
                                         DeleteEvent]]
            [ctim.schemas.actor :as actor]
            [ctim.test-helpers.core :as th]
            [schema.core :as s]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  (th/fixture-spec actor/StoredActor
                   "test.stored-actor"))

(defspec ^:gen spec-to-create-event
  (for-all [actor (cs/gen :test.stored-actor/map)]
    (s/validate CreateEvent (evt/to-create-event actor))))

(defspec ^:gen spec-to-update-event
  (for-all [actor (cs/gen :test.stored-actor/map)]
    (s/validate UpdateEvent (evt/to-update-event actor actor))))

(defspec ^:gen spec-to-delete-event
  (for-all [actor (cs/gen :test.stored-actor/map)]
    (s/validate DeleteEvent (evt/to-delete-event actor))))

(deftest test-triplet-generation
  (is
   (=
    #{[:to-remove "deleted" {}]
      [:to-change "modified" {0 1}]
      [:to-add "added" {}]}
    (set (evt/diff-to-list-of-triplet (diff {:to-remove 0
                                             :to-stay 0
                                             :to-change 0}
                                            {:to-stay 0
                                             :to-change 1
                                             :to-add 0}))))))
