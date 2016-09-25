(ns ctim.schemas.openc2-network
  (:require [ctim.schemas.openc2vocabularies :as openc2v]
            #?(:clj  [flanders.core :as f :refer [def-map-type]]
               :cljs [flanders.core :as f :refer-macros [def-map-type]])))

(def-map-type BGPBlackhole
  [(f/entry :type (f/eq "BGPBlackhole"))
   (f/entry :host f/any-str)])

(def-map-type DNSSinkhole
  [(f/entry :type (f/eq "DNSSinkhole"))
   (f/entry :host f/any-str)])

(def protocol
  #{"TCP"
    "UDP"
    "ICMP"
    "Any"})

(def Protocol
  (f/enum protocol))

(def ACL-action
  #{"ALERT"
    "DROP"
    "DENY"
    "LOG"
    "PASS"
    "REJECT"})

(def ACLAction
  (f/enum ACL-action))

(def-map-type Traffic
  [(f/entry :protocol Protocol)
   (f/entry :source_address f/any-str)
   (f/entry :source_port f/any-str)
   (f/entry :destination_address f/any-str)
   (f/entry :destination_port f/any-str)])

(def-map-type NetworkACL
  [(f/entry :type (f/eq "NetworkACL"))
   (f/entry :traffic Traffic)
   (f/entry :action ACLAction)])

(def-map-type VLANProfile
  [(f/entry :vlan_tag f/any-str)])

(def-map-type SecGroupProfile
  [(f/entry :sec_group_tag f/any-str)
   (f/entry :sec_group_ACL f/any-str)])

(def-map-type Remediation
  [(f/entry :type (f/eq "Remediation"))
   (f/entry :server f/any-str)
   (f/entry :ACL NetworkACL)
   ;; (f/entry :containment_profile_VLAN VLANProfile
   ;;          :required? false)
   ;; (f/entry :containment_profile_sec_group SecGroupProfile
   ;;          :required? false)
   ])

(def-map-type NonSensitive
  [(f/entry :type (f/eq "NonSensitive"))
   (f/entry :permissible_IPs f/any-string-seq)
   (f/entry :ACL NetworkACL)])

(def-map-type HoneyPotRoutes
  [(f/entry :prefix f/any-str)
   (f/entry :next_hop f/any-str)
   (f/entry :next_hope_type f/any-str)])

(def-map-type HoneyPot
  [(f/entry :type (f/eq "Honeypot"))
   (f/entry :permissible_IPs f/any-str-seq)
   (f/entry :ACL NetworkACL)
   (f/entry :routes HoneyPotRoutes)])

(def Encapsulation
  (f/enum #{"GRE"
            "VXLAN"}))

(def-map-type BlockModifier
  (concat
   [(f/entry :type (f/enum #{"Perimeter"
                             "Internal"}))]
   (f/optional-entries
    (f/entry :method_network_ACL NetworkACL)
    (f/entry :method_BGP_blackhole BGPBlackhole)
    (f/entry :method_DNS_sinkhole DNSSinkhole))))

(def-map-type ContainModifier
  (concat
   [(f/entry :type (f/eq "Contain"))]
   (f/optional-entries
    (f/entry :method_remediation Remediation)
    (f/entry :method_nonsensitive NonSensitive)
    (f/entry :method_honeypot HoneyPot))))

(def-map-type InspectModifier
  (concat
   [(f/entry :type (f/eq "Inspect"))]
   (f/optional-entries
    (f/entry :profile f/any-str)
    (f/entry :server f/any-str)
    (f/entry :encapsulation Encapsulation))))

(def-map-type PacketCaptureModifier
  (concat
   [(f/entry :type (f/eq "PacketCapture"))]
   (f/optional-entries
    (f/entry :server f/any-str)
    (f/entry :traffic Traffic))))
