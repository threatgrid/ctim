(ns ctim.domain.observables.ip
  (:require [clojure.string :as string]
            [clojure.pprint :refer [pprint]]
            [schema.core :as s]
            [clojure.network.ip :refer [make-network make-ip-address]]))

(def ipv4-regex #"(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)")


(def ipv6-regex #"(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))")

(def private-ipv4-masks
  ["10.0.0.0/8"
   "172.16.0.0/12"
   "192.168.0.0/16"])

(def private-ipv6-mask "fc00::/7")

(def special-ipv4-masks
  ;;https://www.iana.org/assignments/iana-ipv4-special-registry/iana-ipv4-special-registry.xhtml
  (concat private-ipv4-masks
          ["0.0.0.0/8"
           "100.64.0.0/10"
           "127.0.0.0/8"
           "169.254.0.0/16"
           "192.0.0.0/24"
           "192.0.2.0/24"
           "192.88.99.0/24"
           "198.18.0.0/15"
           "198.51.100.0/24"
           "203.0.113.0/24"
           "224.0.0.0/4"
           "240.0.0.0/4"
           "255.255.255.255/32"]))

(def special-ipv6-masks
  ;;https://www.iana.org/assignments/iana-ipv6-special-registry/iana-ipv6-special-registry.xhtml
  [private-ipv6-mask
   "::1/128"
   "::/128"
   "100::/64"
   "2001::/23"
   "2001::/32"
   "2001:1::1/128"
   "2001:1::2/128"
   "2001:2::/48"
   "2001:3::/32"
   "2001:4:112::/48"
   "2001:5::/32"
   "2001:10::/28"
   "2001:20::/28"
   "2001:db8::/32"
   "2002::/16"
   "2620:4f:8000::/48"
   "fe80::/10"])

(s/defn match-mask? :- s/Bool
  "Does this ip match given mask?"
  [ip-str :- s/Str
   mask :- s/Str]
  (-> (make-network mask)
      (contains? ip-str)))

(s/defn match-some-masks? :- s/Bool
  "Does this ip match one of given masks?"
  [ip-str :- s/Str
   masks :- [s/Str]]
  (true? (some (partial match-mask? ip-str) masks)))

(s/defn special-ip? :- s/Bool
  "Is this IP within a special block of IPs?"
  [ip-str :- s/Str]
  (match-some-masks? ip-str
                     (concat special-ipv4-masks special-ipv6-masks)))

(s/defn private-ip? :- s/Bool
  "Is this a IP reserved for private network usage"
  [ip-str :- s/Str]
  (match-some-masks? ip-str (cons private-ipv6-mask private-ipv4-masks)))

(s/defn valid-ipv4? :- s/Bool
  "Is this a valid ipv4 address?"
  [ip-str :- s/Str]
  (some? (re-matches ipv4-regex ip-str)))

(s/defn valid-ipv6? :- s/Bool
  "Is this a valid ipv6 address?"
  [ip-str :- s/Str]
  (some? (re-matches ipv6-regex ip-str)))

(s/defn valid-ip? :- s/Bool
  "Is this a valid ipv4 or ipv6 address?"
  [ip-str :- s/Str]
  (or (valid-ipv4? ip-str)
      (valid-ipv6? ip-str)))

(s/defn normalize-ip :- (s/maybe s/Str)
  "Normalizes an ip that was modified with a known transformation"
  [ip-str :- s/Str]
  (let [normal-ip-form-str (string/replace ip-str #"\[\.\]" ".")]
    (when (valid-ip? normal-ip-form-str)
      normal-ip-form-str)))
