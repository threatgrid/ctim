(ns ctim.domain.sorting
  (:require [ctim.domain.disposition :as dispositions]))

;;------------------------------------------------------------------------------
;; Judgements
;;------------------------------------------------------------------------------

(defn compare-judgements
  [{{j1_start :start_time} :valid_time
    j1_disp :disposition}
   {{j2_start :start_time} :valid_time
    j2_disp :disposition}]
  (let [result (dispositions/importance j1_disp
                                        j2_disp)]
    (if (not= 0 result)
      result
      (compare j2_start j1_start)))) ;; reverse sort

(defn sort-judgements
  "Sorts Judgements based on disposition first, then valid_time"
  [judgements]
  (sort-by identity
          compare-judgements
          judgements))

;;------------------------------------------------------------------------------
;; Sightings
;;------------------------------------------------------------------------------

(defn sort-sightings
  [sightings]
  (sort-by (comp :start_time :observed_time)
           #(compare %2 %1)
           sightings))
