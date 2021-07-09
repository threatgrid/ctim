(ns ctim.domain.observables.cidr_block
  (:require
   [clojure.edn :as edn]
   [clojure.string :as string]
   [ctim.domain.observables.ip :as ip]
   [schema.core :as s]))

(s/defn valid-ipv4-prefix-length? :- s/Bool
  [n :- s/Int]
  (<= 0 n 32))

(s/defn valid-ipv6-prefix-length? :- s/Bool
  [n :- s/Int]
  (<= 0 n 128))

(s/defn valid-cidr_block? :- s/Bool
  "Returns true when `s` is a valid ipv4 or ipv6 network
  specified in CIDR notation, otherwise false."
  [s :- s/Str]
  (if s
    (let [[prefix prefix-length-str] (string/split s #"/")
          prefix-length (edn/read-string prefix-length-str)]
      (and (number? prefix-length)
           (or (and (ip/valid-ipv4? prefix)
                    (valid-ipv4-prefix-length? prefix-length))
               (and (ip/valid-ipv6? prefix)
                    (valid-ipv6-prefix-length? prefix-length)))))
    false))
