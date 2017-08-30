(ns ctim.domain.sorting
  (:require
   [clj-momo.lib.clj-time.core :as time]
   [clj-momo.lib.clj-time.coerce :refer [to-internal-date]]
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
   {{j1-start :start_time
     j1-end   :end_time} :valid_time
    j1-disp :disposition
    :as _judgement-1_}
   {{j2-start :start_time
     j2-end   :end_time} :valid_time
    j2-disp :disposition
    :as _judgement-2_}]
  (let [dt-j1-start (to-internal-date j1-start)
        dt-j2-start (to-internal-date j2-start)

        ;; Validity is reverse sorted so that true comes before false
        validity-comp (compare
                       (validity/valid-now? dt-now
                                            dt-j2-start
                                            (to-internal-date j2-end))
                       (validity/valid-now? dt-now
                                            dt-j1-start
                                            (to-internal-date j1-end)))]
    (if (not= 0 validity-comp)
      validity-comp
      (let [disposition-comp (compare j1-disp j2-disp)]
        (if (not= 0 disposition-comp)
          disposition-comp
          ;; Start-time is reverse sorted
          (compare dt-j2-start
                   dt-j1-start))))))

(defn sort-judgements
  "Sorts Judgements based on validity, disposition, and finally by start-time"
  [judgements]
  (sort (partial compare-judgements (time/internal-now))
        judgements))


;;------------------------------------------------------------------------------
;; Sightings
;;------------------------------------------------------------------------------

(defn get-sighting-sort-field [{timestamp :timestamp
                                {start-time :start_time} :observed_time}]
  (some-> (or timestamp start-time)
          to-internal-date))

(defn sort-sightings [sightings]
  (sort-by get-sighting-sort-field
           #(compare %2 %1)
           sightings))
