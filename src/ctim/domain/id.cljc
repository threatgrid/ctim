(ns ctim.domain.id
  (:require [ctim.lib.url :as url]
            [schema.core :as s]))

(def short-id-pattern
  "(([a-z][-a-z]+)-[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})")

(def url-pattern
  "(https?):\\/\\/([-\\da-zA-Z][-\\da-zA-Z.]*)(:(\\d+))?((\\/[-\\w.]+)*)\\/ctia\\/([a-z]+)\\/")

(def short-id-re (re-pattern short-id-pattern))
(def url-re (re-pattern url-pattern))

(def long-id-re
  (re-pattern
   (str url-pattern
        short-id-pattern)))

(defn make-long-id-str
  [{:keys [hostname short-id path-prefix port protocol type]
    :as parts}]
  (when parts
    (str protocol
         "://"
         hostname
         (if port (str ":" port))
         path-prefix
         "/ctia/"
         type
         "/"
         (url/encode short-id))))

(s/defn long-id?
  "Make an educated guess if this is a long-form ID"
  [id :- s/Str]
  ;; TODO - More specific checking?
  (.startsWith id "http"))

(def short-id?
  "Make an educated guess if this is a short-form ID"
  (complement long-id?))

(defn valid-short-id? [short-id]
  (boolean (re-matches short-id-re short-id)))

(defprotocol ID
  (localize [this url-params]
    "Localize this ID")
  (short-id [this]
    "The short part of the ID")
  (long-id [this] [this url-params]
    "Convert this record to a long ID string"))

(defrecord CtiaId [hostname short-id path-prefix port protocol type]
  ID
  (localize [this url-show-params]
    (merge this
           (update url-show-params :path-prefix not-empty)))
  (short-id [this]
    short-id)
  (long-id [this]
    (make-long-id-str this))
  (long-id [this url-show-params]
    (long-id (localize this url-show-params))))

(defn long-id->id
  [long-id]
  (if-let [[_ proto host _ port path _ type id _] (re-matches long-id-re long-id)]
    (map->CtiaId
     {:hostname host
      :short-id (url/decode id)
      :path-prefix (not-empty path)
      :port (some-> port #?(:clj (Integer/parseInt)
                            :cljs (js/parseInt)))
      :protocol proto
      :type (name type)})))

(defn short-id->id
  [type short-id {:keys [hostname path-prefix port protocol]}]
  (when (valid-short-id? short-id)
    (map->CtiaId
     {:hostname hostname
      :short-id short-id
      :path-prefix (not-empty path-prefix)
      :port port
      :protocol protocol
      :type (name type)})))

(defn ->id
  "Given a string ID, build an ID instance with provided URL
   parameters.  Also ensures that the ID is encoded."
  [type id url-show-params]
  (if (long-id? id)
    (localize (long-id->id id)
              url-show-params)
    (short-id->id (name type)
                  id
                  url-show-params)))

(defn str->short-id
  "Given an unknown ID string (presumably a user provided ID string,
  which may be a URL) parse the string and return just the short form
  ID."
  [s]
  (if (long-id? s)
    (nth (re-matches long-id-re s) 8)
    s))

(defn short-id->long-id [short-id url-params-fn]
  (when-let [type (nth (re-matches short-id-re short-id) 2)]
    (long-id
     (short-id->id type
                   short-id
                   (url-params-fn)))))

(defn factory:short-id->long-id
  "Build a fn that takes a short-id and returns a long-id"
  [type url-params-fn]
  (fn [short-id]
    (long-id
     (short-id->id type
                   short-id
                   (url-params-fn)))))

(def ^:deprecated long-id-factory factory:short-id->long-id)

(defn factory:short-id+type->long-id
  "Build a fn that takes an id-type and a short-id and returns a long-id"
  [url-params-fn]
  (fn [type short-id]
    (long-id
     (short-id->id type
                   short-id
                   (url-params-fn)))))
