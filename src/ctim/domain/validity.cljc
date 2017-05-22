(ns ctim.domain.validity
  (:require [clj-momo.lib.clj-time.core :as time]
            [clj-momo.lib.clj-time.coerce :as time-coerce]))

(defn valid-now?
  "Determine if an entity (such as a judgement) is valid, based
  on :valid_time.  Depends on knowing the time 'now', so that is
  passed in."
  [dt-now
   {{:keys [start_time end_time]} :valid_time}]
  (let [start (time-coerce/to-internal-date start_time)
        end (time-coerce/to-internal-date end_time)]
    (cond
      (and start end)
      (time/within? start end dt-now)

      end
      (time/before? dt-now end)

      start
      (or
       (time/after? dt-now start)
       (time/equal? dt-now start))

      :else true)))
