(ns ctim.schemas.openc2-network-sdn
  (:require #?(:clj  [flanders.core :as f :refer [def-map-type]]
               :cljs [flanders.core :as f :refer-macros [def-map-type]])))


(def ScanMethods
  (f/enum #{"arp"
            "ping"
            "tcpsyn"
            "udpprobe"}))

(def-map-type Scan
  [(f/entry :type (f/eq "Scan"))
   (f/entry :method ScanMethods)
   (f/entry :search f/any-str)])
