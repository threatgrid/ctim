(ns ctim.schemas.openc2-network
  (:require [schema.core :as s]
            [ctim.schemas.openc2vocabularies :as openc2v]
            [schema-tools.core :as st]))




(s/defschema BGPBlackhole
  {:type (s/enum "BGPBlackhole")
   :host s/Str})

(s/defschema DNSSinkhole
  {:type (s/enum "DNSSinkhole")
   :host s/Str})

(def Protocol
  (s/enum "TCP"
          "UDP"
          "ICMP"
          "Any"))

(def ACLAction
  (s/enum "ALERT"
          "DROP"
          "DENY"
          "LOG"
          "PASS"
          "REJECT"))

(s/defschema Traffic
  {:protocol Protocol
   :sourceAddress s/Str
   :sourcePort s/Str
   :destinationAddress s/Str
   :destinationPort s/Str})

(s/defschema NetworkACL
  {:type (s/enum "NetworkACL")
   :traffic Traffic
   :action ACLAction})


(s/def vlanProfile
  (:vlanTag s/Str))

(s/def secGroupProfile
  {:secGroupTag s/Str
   :secGroupACL s/Str})


(s/defschema Remediation
  {:type (s/enum "Remediation")
   :server s/Str
   :acl NetworkACL
   ;(st/optional-keys
    ; {:containmentProfile_vlan vlanProfile
     ; :containmentProfile_secGroup secGroupProfile})
   })

(s/defschema NonSensitive
  {:type (s/enum "NonSensitive")
   :permissibleIps [s/Str]
   :acl NetworkACL})

(s/defschema Honeypot
  {:type (s/enum "Honeypot")
   :permissibleIps [s/Str]
   :acl NetworkACL
   :routes {:prefix s/Str
            :NextHop s/Str
            :NextHopType s/Str}})

(def Encapsulation
  (s/enum "GRE"
          "VXLAN"))

(s/defschema BlockModifier
  (:type (s/enum
           "Perimeter"
           "Internal")
   (st/optional-keys
     {:method_NetworkACL NetworkACL
      :method_BGPBlackhole BGPBlackhole
      :method_DNSSinkhole DNSSinkhole})))

(s/defschema ContainModifier
  (:type (s/eq "Contain")
   (st/optional-keys
     {:method_Remediation Remediation
      :method_NonSensitive NonSensitive
      :method_Honeypot Honeypot})))

(s/defschema InspectModifier
  (:type (s/eq "Inspect")
   (st/optional-keys
     {:profile s/Str
      :server s/Str
      :encapsulation Encapsulation})))


(s/defschema PacketCaptureModifier
  (:type (s/eq "PacketCapture")
  (st/optional-keys
   {:server s/Str
   :traffic Traffic})))

