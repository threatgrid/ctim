(ns ^{:doc "Work with java.util.Date objects"}
    ctim.lib.time
  (:require #?(:clj [clj-time.core :as time]
               :cljs [cljs-time.core :as time])

            #?(:clj [clj-time.format :as time-format]
               :cljs [cljs-time.format :as time-format])

            #?(:clj [clj-time.coerce :as time-coerce]
               :cljs [cljs-time.coerce :as time-coerce])

            #?(:clj [clj-time.periodic :refer [periodic-seq] :as periodic]
               :cljs [cljs-time.periodic :refer [periodic-seq] :as periodic]))

  #?(:clj (:import [java.sql Time Timestamp]
                   [java.util Date]
                   [org.joda.time DateTime DateTimeZone])))

#?(:clj (defn- datetime-from-long [^Long millis]
          (DateTime. millis ^DateTimeZone (DateTimeZone/UTC))))

(defn- coerce-to-datetime [d]
  #?(:clj (cond
            (instance? DateTime d) d
            (instance? Date d) (datetime-from-long (.getTime d))
            (instance? Timestamp d) (datetime-from-long (.getTime d)))
     :cljs (cond
             (instance? goog.date.DateTime d) d
             (instance? js/Date d) (time-coerce/from-date d))))

(defn- coerce-to-date [d]
  #?(:clj (cond
            (instance? Date d) d
            (instance? DateTime d) (Date. (.getMillis d))
            (instance? Timestamp d) (Date. (.getTime d)))

     :cljs (cond
             (instance? js/Date d) d
             (instance? goog.date.DateTime d) (time-coerce/to-date d))))

(defn timestamp
  ([]
   #?(:clj (Date.)
      :cljs (js/Date.)))
  ([time-str]
   (if (nil? time-str)
     (timestamp)
     (coerce-to-date
      (time-format/parse (time-format/formatters :date-time)
                         time-str)))))

(def now timestamp)

(def default-expire-date #?(:clj (coerce-to-date (time/date-time 2525 1 1))
                            :cljs (js/Date. 2525 1 1)))

(defn after?
  "like clj-time.core/after? but uses java.util.Date/ js Date"
  [left right]
  (time/after? (coerce-to-datetime left)
               (coerce-to-datetime right)))

(defn plus-n [p t n]
  (coerce-to-date
   (time/plus (coerce-to-datetime t)
              ((case p
                 :years time/years
                 :months time/months
                 :weeks time/weeks
                 :days time/days
                 :hours time/hours
                 :minutes time/minutes
                 :seconds time/seconds)
               n))))

(def plus-n-weeks (partial plus-n :weeks))

(defn format-date-time [d]
  (->> d
       (time-coerce/from-date)
       (time-format/unparse (time-format/formatters :date-time))))

(defn format-index-time [d]
  (->> d
       (time-coerce/from-date)
       (time-format/unparse (time-format/formatter "YYYY.MM.dd.HH.mm"))))

(defn round-date [d granularity]
  (let [parsed (time-coerce/from-date d)
        year (time/year parsed)
        month (time/month parsed)
        day (time/day parsed)
        hour (time/hour parsed)
        minute (time/minute parsed)]

    (-> (case granularity
          :week (-> (time/date-time year month day)
                    (.dayOfWeek)
                    (.withMinimumValue))
          :minute (time/date-time year month day hour minute)
          :hour   (time/date-time year month day hour)
          :day    (time/date-time year month day)
          :month  (time/date-time year month)
          :year   (time/date-time year))

        (time-coerce/to-date))))

(defn date-range [start end step]
  (let [inf-range (periodic-seq start step)
        below-end? (fn [t] (time/within? (time/interval start end) t))]
    (take-while below-end? inf-range)))
