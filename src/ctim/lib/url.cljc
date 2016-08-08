(ns ctim.lib.url
  (:require [cemerick.url :refer [url-encode url-decode]]))

(def url-chars-re #"[-A-Za-z0-9._~:/?#\[\]@!$&'()*+,;=%]+")

(def encode url-encode)

(def decode url-decode)

(defn encoded? [s]
  (boolean
   (re-matches url-chars-re s)))
