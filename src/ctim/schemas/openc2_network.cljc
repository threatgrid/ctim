(ns ctim.schemas.openc2-network
  (:require [ctim.schemas.openc2vocabularies :as openc2v]
            #?(:clj  [flanders.core :as f :refer [def-enum-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-enum-type def-map-type def-eq]])))

(def-eq BGPBlackholeTypeIdentifier "BGPBlackhole")

(def-map-type BGPBlackhole
  [(f/entry :type BGPBlackholeTypeIdentifier)
   (f/entry :host f/any-str)])

(def-eq DNSSinkholeTypeIdentifier "DNSSinkhole")

(def-map-type DNSSinkhole
  [(f/entry :type DNSSinkholeTypeIdentifier)
   (f/entry :host f/any-str)])

(def protocol
  #{"TCP"
    "UDP"
    "ICMP"
    "Any"})

(def-enum-type Protocol protocol)

(def ACL-action
  #{"ALERT"
    "DROP"
    "DENY"
    "LOG"
    "PASS"
    "REJECT"})

(def-enum-type ACLAction ACL-action)

(def-map-type Traffic
  [(f/entry :protocol Protocol)
   (f/entry :source_address f/any-str)
   (f/entry :source_port f/any-str)
   (f/entry :destination_address f/any-str)
   (f/entry :destination_port f/any-str)])

(def-eq NetworkACLTypeIdentifier "NetworkACL")

(def-map-type NetworkACL
  [(f/entry :type NetworkACLTypeIdentifier)
   (f/entry :traffic Traffic)
   (f/entry :action ACLAction)])

(def-map-type VLANProfile
  [(f/entry :vlan_tag f/any-str)])

(def-map-type SecGroupProfile
  [(f/entry :sec_group_tag f/any-str)
   (f/entry :sec_group_ACL f/any-str)])

(def-eq RemediationTypeIdentifier "Remediation")

(def-map-type Remediation
  [(f/entry :type RemediationTypeIdentifier)
   (f/entry :server f/any-str)
   (f/entry :ACL NetworkACL)
   ;; (f/entry :containment_profile_VLAN VLANProfile
   ;;          :required? false)
   ;; (f/entry :containment_profile_sec_group SecGroupProfile
   ;;          :required? false)
   ])

(def-eq NonSensitiveTypeIdentifier "NonSensitive")

(def-map-type NonSensitive
  [(f/entry :type NonSensitiveTypeIdentifier)
   (f/entry :permissible_IPs f/any-string-seq)
   (f/entry :ACL NetworkACL)])

(def-map-type HoneyPotRoutes
  [(f/entry :prefix f/any-str)
   (f/entry :next_hop f/any-str)
   (f/entry :next_hope_type f/any-str)])

(def-eq HoneyPotTypeIdentifier "Honeypot")

(def-map-type HoneyPot
  [(f/entry :type HoneyPotTypeIdentifier)
   (f/entry :permissible_IPs f/any-str-seq)
   (f/entry :ACL NetworkACL)
   (f/entry :routes HoneyPotRoutes)])

(def-enum-type Encapsulation
  #{"GRE"
    "VXLAN"})

(def-enum-type BlockModifierType
  #{"Perimeter"
    "Internal"})

(def-map-type BlockModifier
  (concat
   [(f/entry :type BlockModifierType)]
   (f/optional-entries
    (f/entry :method_network_ACL NetworkACL)
    (f/entry :method_BGP_blackhole BGPBlackhole)
    (f/entry :method_DNS_sinkhole DNSSinkhole))))

(def-eq ContainTypeIdentifier "Contain")

(def-map-type ContainModifier
  (concat
   [(f/entry :type ContainTypeIdentifier)]
   (f/optional-entries
    (f/entry :method_remediation Remediation)
    (f/entry :method_nonsensitive NonSensitive)
    (f/entry :method_honeypot HoneyPot))))

(def-eq InspectModifierTypeIdentifier "Inspect")

(def-map-type InspectModifier
  (concat
   [(f/entry :type InspectModifierTypeIdentifier)]
   (f/optional-entries
    (f/entry :profile f/any-str)
    (f/entry :server f/any-str)
    (f/entry :encapsulation Encapsulation))))

(def-eq PacketCaptureModifierTypeIdentifier "PacketCapture")

(def-map-type PacketCaptureModifier
  (concat
   [(f/entry :type PacketCaptureModifierTypeIdentifier)]
   (f/optional-entries
    (f/entry :server f/any-str)
    (f/entry :traffic Traffic))))
