(ns ctim.events.obj-to-event-test
  (:require [clojure.data :refer [diff]]
            [clojure.test.check.clojure-test
             #?(:clj :refer :cljs :refer-macros) [defspec]]

            [clojure.test.check.properties #?(:clj :refer :cljs :refer-macros) [for-all]]

            [ctim.events.obj-to-event :as evt]
            [ctim.events.schemas :refer [CreateEvent
                                         UpdateEvent
                                         DeleteEvent]]
            [ctim.generators.schemas :as gen]
            #?(:clj [clojure.test :refer [deftest is use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is use-fixtures]])

            #?(:cljs [clojure.test.check :refer-macros [quick-check]])

            [schema.core :as s]))

(defspec spec-to-create-event
  (for-all [actor (gen/gen-entity :actor)]
    (s/validate CreateEvent (evt/to-create-event actor))))

(defspec spec-to-update-event
  (for-all [actor (gen/gen-entity :actor)]
    (s/validate UpdateEvent (evt/to-update-event actor actor))))

(defspec spec-to-delete-event
  (for-all [actor (gen/gen-entity :actor)]
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
