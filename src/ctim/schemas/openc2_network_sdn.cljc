(ns ctim.schemas.openc2-network-sdn
  (:require [schema.core :as s]
            [ctim.schemas.openc2vocabularies :as openc2v]))


(def ScanMethods
  (s/enum "arp"
          "ping"
          "tcpsyn"
          "udpprobe"))

(s/defschema Scan
  {:type (s/eq "Scan")
   :method ScanMethods
   :search s/Any})
