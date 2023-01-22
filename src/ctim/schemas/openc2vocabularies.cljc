(ns ctim.schemas.openc2vocabularies
  (:require #?(:clj  [flanders.core :refer [def-enum-type]]
               :cljs [flanders.core :refer-macros [def-enum-type]])
            [clojure.spec.alpha :as cs]
            [ctim.schemas.vocabularies :as v]))

(def COA-type
  #{"alert"
    "allow"
    "augment"
    "contain"
    "delete"
    "deny"
    "detonate"
    "distill"
    "get"
    "investigate"
    "locate"
    "mitigate"
    "modify"
    "move"
    "notify"
    "other"
    "pause"
    "query"
    "redirect"
    "remediate"
    "report"
    "response"
    "restart"
    "restore"
    "resume"
    "save"
    "scan"
    "set"
    "snapshot"
    "start"
    "stop"
    "substitute"
    "sync"
    "throttle"
    "update"})

(def-enum-type COAType
  COA-type
  :reference (str "[OpenC2/STIX COA XML schema](https://"
                  "github.com/OpenC2-org/subgroup-stix/blob/"
                  "master/schema/openc2_stix_coa.xsd)"))

(def-enum-type TargetTypeVocab target-type-vocab
  :open? true
  :gen (cs/gen v/observable-type-identifier))

(def actuator-type
  #{"endpoint",
    "endpoint.digital-telephone-handset",
    "endpoint.laptop",
    "endpoint.pos-terminal",
    "endpoint.printer",
    "endpoint.sensor",
    "endpoint.server",
    "endpoint.smart-meter",
    "endpoint.smart-phone",
    "endpoint.tablet",
    "endpoint.workstation",
    "network",
    "network.bridge",
    "network.firewall",
    "network.gateway",
    "network.guard",
    "network.hips",
    "network.hub",
    "network.ids",
    "network.ips",
    "network.modem",
    "network.nic",
    "network.proxy",
    "network.router",
    "network.security_manager",
    "network.sense_making",
    "network.sensor",
    "network.switch",
    "network.vpn",
    "network.wap",
    "process",
    "process.aaa-server",
    "process.anti-virus-scanner",
    "process.connection-scanner",
    "process.directory-service",
    "process.dns-server",
    "process.email-service",
    "process.file-scanner",
    "process.location-service",
    "process.network-scanner",
    "process.remediation-service",
    "process.reputation-service",
    "process.sandbox",
    "process.virtualization-service",
    "process.vulnerability-scanner",
    "other"})

(def-enum-type ActuatorType actuator-type)

(def modifier-type
  #{"delay"
    "duration"
    "frequency"
    "response"
    "time"
    "reportTo"})

(def-enum-type ModifierType modifier-type)

(def location-class
  #{"Internally-Located"
    "Externally-Located"
    "Co-Located"
    "Mobile"
    "Unknown"})

(def-enum-type LocationClass location-class)

(def loss-duration
  #{"Permanent"
    "Weeks"
    "Days"
    "Hours"
    "Minutes"
    "Seconds"
    "Unknown"})

(def-enum-type LossDuration loss-duration)
