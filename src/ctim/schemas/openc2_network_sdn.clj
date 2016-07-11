(ns ctia.schemas.openc2-network-sdn
  (:require [schema.core :as s]
            [ctia.schemas.openc2vocabularies :as openc2v]))


(def ScanMethods
  (s/enum "arp"
          "ping"
          "tcpsyn"
          "udpprobe"))

(s/defschema ScanModifierType
  {:type (s/eq "ScanType")
   :method ScanMethods
   :search s/Any
  })

