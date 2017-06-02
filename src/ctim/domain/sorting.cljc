(ns ctim.domain.sorting
  (:require
   [clj-momo.lib.clj-time.core :as time]
   [clj-momo.lib.clj-time.coerce :as time-coerce]
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
   {{j1_start :start_time
     j1_end   :end_time} :valid_time
    j1_disp :disposition
    :as _judgement-1_}
   {{j2_start :start_time
     j2_end   :end_time} :valid_time
    j2_disp :disposition
    :as _judgement-2_}]
  (let [j1_start (time-coerce/to-internal-date j1_start)
        j1_end   (time-coerce/to-internal-date j1_end)
        j2_start (time-coerce/to-internal-date j2_start)
        j2_end   (time-coerce/to-internal-date j2_end)

        ;; Validity is reverse sorted so that true comes before false
        result1 (compare (validity/valid-now? dt-now j2_start j2_end)
                         (validity/valid-now? dt-now j1_start j1_end))]
    (if (not= 0 result1)
      result1
      (let [result2 (compare j1_disp j2_disp)]
        (if (not= 0 result2)
          result2
          ;; Start-time is reverse sorted
          (compare (time-coerce/to-long j2_start)
                   (time-coerce/to-long j1_start)))))))

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
