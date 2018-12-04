(ns ctim.examples.verdicts
  (:require [ctim.schemas.common :as c]))

(def verdict-maximal
  {:type "verdict"
   :observable {:type "ip",
                :value "10.0.0.1"}
   :disposition 1
   :disposition_name "Clean"
   :judgement_id "http://ex.tld/ctia/judgement/judgement-494d13ae-e914-43f0-883b-085062a8d9a1"
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}})

(def verdict-minimal
  {:type "verdict"
   :observable {:type "ip",
                :value "10.0.0.1"}
   :disposition 1
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}})
