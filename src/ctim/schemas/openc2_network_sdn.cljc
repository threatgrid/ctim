(ns ctim.schemas.openc2-network-sdn
  (:require #?(:clj  [flanders.core :as f :refer [def-enum-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-enum-type def-map-type def-eq]])))


(def-enum-type ScanMethods
  #{"arp"
    "ping"
    "tcpsyn"
    "udpprobe"})

(def-eq ScanTypeIdentifier "scan")

(def-map-type Scan
  [(f/entry :type ScanTypeIdentifier)
   (f/entry :method ScanMethods)
   (f/entry :search f/any-str)])
