(ns ctia.schemas.openc2-network
  (:require [schema.core :as s]
            [ctia.schemas.openc2vocabularies :as openc2v]))




(s/defschema BGPBlackhole
  {:type (s/enum "BGPBlackhole")
   :host s/Str
   })

(s/defschema DNSSinkhole
  {:type (s/enum "DNSSinkhole")
   :host s/Str
   })

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

(s/defschema TrafficType
  {:protocol Protocol
   :sourceAddress s/Str
   :sourcePort s/Str
   :destinationAddress s/Str
   :destinationPort s/Str
   })

(s/defschema NetworkACL
  {:type (s/enum "NetworkACL")
   :traffic TrafficType
   :action ACLAction
   })


(s/def vlanProfile
  {:vlanTag s/Str})

(s/def secGroupProfile
  {:secGroupTag s/Str
   :secGroupACL s/Str
   })


(s/defschema Remediation
  {:type (s/enum "Remediation")
   :server s/Str
   :containmentProfile (s/either vlanProfile
                                 secGroupProfile)
   :acl NetworkACL 
   })

(s/defschema NonSensitive
  {:type (s/enum "NonSensitive")
   :permissibleIps [s/Str]
   :acl NetworkACL 
   })

(s/defschema Honeypot
  {:type (s/enum "Honeypot")
   :permissibleIps [s/Str]
   :acl NetworkACL 
   :routes {:prefix s/Str
            :NextHop s/Str
            :NextHopType s/Str}
   })

(def EncapsulationType
  (s/enum "GRE"
          "VXLAN"))

(s/defschema BlockModifierType
  {:type (s/enum 
           "Perimeter"
           "Internal")
   :method (s/conditional
            #(= "NetworkACL" (:type %)) NetworkACL
            #(= "BGPBlackhole" (:type %)) BGPBlackhole
            #(= "DNSSinkhole" (:type %)) DNSSinkhole)
   })


  

(s/defschema ContainModifierType
  {:type (s/eq "ContainType")
   :method (s/conditional
            #(= "Remediation" (:type %)) Remediation
            #(= "NonSensitive" (:type %)) NonSensitive
            #(= "Honeypot" (:type %)) Honeypot
   )
   })

(s/defschema InspectModifierType
  {:type (s/eq "InspectType")
   :profile s/Str
   :server s/Str
   :encapsulation EncapsulationType
   })

(s/defschema PacketCaptureModifierType
  {:type (s/eq "PacketCaptureType")
   :server s/Str
   :traffic TrafficType
   })

