(ns ctim.domain.sorting
  (:require
   [clj-momo.lib.clj-time.core :as time]
   [ctim.domain.validity :as validity]))

;;------------------------------------------------------------------------------
;; Judgements
;;------------------------------------------------------------------------------



(defn compare-judgements
  "Compare judgements, first by validity (valid first), then by
  disposition number, and then by start-time (newest first).  It
  depends on a stable 'now', so it must be passed in.  Returns -1, 0,
  or 1, as per 'compare."
  [dt-now
   {{j1_start :start_time} :valid_time
    j1_disp :disposition
    :as j1}
   {{j2_start :start_time} :valid_time
    j2_disp :disposition
    :as j2}]
  (let [;; Validity is reverse sorted so that true comes before false
        result1 (compare (validity/valid-now? dt-now j2)
                         (validity/valid-now? dt-now j1))]
    (if (not= 0 result1)
      result1
      (let [result2 (compare j1_disp j2_disp)]
        (if (not= 0 result2)
          result2
          ;; Start-time is reverse sorted
          (compare j2_start j1_start))))))

(defn sort-judgements
  "Sorts Judgements based on validity, disposition, and finally by start-time"
  [judgements]
  (sort-by identity
           (partial compare-judgements (time/internal-now))
           judgements))

;;------------------------------------------------------------------------------
;; Sightings
;;------------------------------------------------------------------------------

(defn sort-sightings
  [sightings]
  (sort-by (comp :start_time :observed_time)
           #(compare %2 %1)
           sightings))
