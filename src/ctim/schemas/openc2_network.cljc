(ns ctim.schemas.openc2-network
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.openc2vocabularies :as openc2v]
            #?(:clj  [flanders.core :as f :refer [def-enum-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-enum-type def-map-type def-eq]])))

(def-eq BGPBlackholeTypeIdentifier "BGPBlackhole")

(def-map-type BGPBlackhole
  [(f/entry :type BGPBlackholeTypeIdentifier)
   (f/entry :host c/ShortString)])

(def-eq DNSSinkholeTypeIdentifier "DNSSinkhole")

(def-map-type DNSSinkhole
  [(f/entry :type DNSSinkholeTypeIdentifier)
   (f/entry :host c/ShortString)])

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
   (f/entry :source_address c/ShortString)
   (f/entry :source_port c/ShortString)
   (f/entry :destination_address c/ShortString)
   (f/entry :destination_port c/ShortString)])

(def-eq NetworkACLTypeIdentifier "NetworkACL")

(def-map-type NetworkACL
  [(f/entry :type NetworkACLTypeIdentifier)
   (f/entry :traffic Traffic)
   (f/entry :action ACLAction)])

(def-map-type VLANProfile
  [(f/entry :vlan_tag c/ShortString)])

(def-map-type SecGroupProfile
  [(f/entry :sec_group_tag c/ShortString)
   (f/entry :sec_group_ACL c/ShortString)])

(def-eq RemediationTypeIdentifier "Remediation")

(def-map-type Remediation
  [(f/entry :type RemediationTypeIdentifier)
   (f/entry :server c/ShortString)
   (f/entry :ACL NetworkACL)
   ;; (f/entry :containment_profile_VLAN VLANProfile
   ;;          :required? false)
   ;; (f/entry :containment_profile_sec_group SecGroupProfile
   ;;          :required? false)
   ])

(def-eq NonSensitiveTypeIdentifier "NonSensitive")

(def-map-type NonSensitive
  [(f/entry :type NonSensitiveTypeIdentifier)
   (f/entry :permissible_IPs (f/seq-of c/ShortString))
   (f/entry :ACL NetworkACL)])

(def-map-type HoneyPotRoutes
  [(f/entry :prefix c/ShortString)
   (f/entry :next_hop c/ShortString)
   (f/entry :next_hope_type c/ShortString)])

(def-eq HoneyPotTypeIdentifier "Honeypot")

(def-map-type HoneyPot
  [(f/entry :type HoneyPotTypeIdentifier)
   (f/entry :permissible_IPs (f/seq-of c/ShortString))
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
    (f/entry :profile c/ShortString)
    (f/entry :server c/ShortString)
    (f/entry :encapsulation Encapsulation))))

(def-eq PacketCaptureModifierTypeIdentifier "PacketCapture")

(def-map-type PacketCaptureModifier
  (concat
   [(f/entry :type PacketCaptureModifierTypeIdentifier)]
   (f/optional-entries
    (f/entry :server c/ShortString)
    (f/entry :traffic Traffic))))
