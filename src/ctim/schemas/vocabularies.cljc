(ns ctim.schemas.vocabularies
  (:require #?(:clj  [clojure.spec.alpha :as cs]
               :cljs [cljs.spec.alpha :as cs])
            [clojure.test.check.generators]
            #?(:clj [flanders.core :as f :refer [def-enum-type]]
               :cljs [flanders.core :as f :refer-macros [def-enum-type]])
            [ctim.lib.predicates :as pred]
            [clojure.string :as str]
            [clojure.test.check.generators :as gen]))

(def campaign-status
  #{"Ongoing"
    "Historic"
    "Future"})

(def-enum-type CampaignStatus
  campaign-status)

(def COA-stage
  #{"Remedy"
    "Response"})

(def-enum-type COAStage
  COA-stage
  :reference "[COAStageVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/COAStageVocab-1.0/)")

(def COA-type
  #{"Perimeter Blocking"
    "Internal Blocking"
    "Redirection"
    "Redirection (Honey Pot)"
    "Hardening"
    "Patching"
    "Eradication"
    "Rebuilding"
    "Training"
    "Monitoring"
    "Physical Access Restrictions"
    "Logical Access Restrictions"
    "Public Disclosure"
    "Diplomatic Actions"
    "Policy Actions"
    "Other"})

(def-enum-type COAType
  COA-type
  :reference "[CourseOfActionTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/CourseOfActionTypeVocab-1.0/)")

(def discovery-method
  #{"Agent Disclosure"
    "External - Fraud Detection"
    "Monitoring Service"
    "Law Enforcement"
    "Customer"
    "Unrelated Party"
    "Audit"
    "Antivirus"
    "Incident Response"
    "Financial Audit"
    "Internal - Fraud Detection"
    "HIPS"
    "IT Audit"
    "Log Review"
    "NIDS"
    "Security Alarm"
    "User"
    "Unknown"})

(def-enum-type DiscoveryMethod discovery-method)

(def effect
  #{"Brand or Image Degradation"
    "Loss of Competitive Advantage"
    "Loss of Competitive Advantage - Economic"
    "Loss of Competitive Advantage - Military"
    "Loss of Competitive Advantage - Political"
    "Data Breach or Compromise"
    "Degradation of Service"
    "Destruction"
    "Disruption of Service / Operations"
    "Financial Loss"
    "Loss of Confidential / Proprietary Information or Intellectual Property"
    "Regulatory, Compliance or Legal Impact"
    "Unintended Access"
    "User Data Loss"})

(def-enum-type Effect effect)

(def high-med-low
  #{"Info"
    "Low"
    "Medium"
    "High"
    "None"
    "Unknown"})

(def-enum-type HighMedLow
  high-med-low
  :reference (str "[HighMedLowVocab](http://stixproject.github.io/"
                           "data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)"))

(def impact-qualification
  #{"Insignificant"
    "Distracting"
    "Painful"
    "Damaging"
    "Catastrophic"
    "Unknown"})

(def-enum-type ImpactQualification impact-qualification)

(def impact-rating
  #{"None"
    "Minor"
    "Moderate"
    "Major"
    "Unknown"})

(def-enum-type ImpactRating impact-rating)

(def incident-category
  #{"Exercise/Network Defense Testing"
    "Unauthorized Access"
    "Denial of Service"
    "Malicious Code"
    "Improper Usage"
    "Scans/Probes/Attempted Access"
    "Investigation"})

(def-enum-type IncidentCategory incident-category)

(def indicator-type
  #{"Malicious E-mail"
    "IP Watchlist"
    "File Hash Watchlist"
    "Domain Watchlist"
    "URL Watchlist"
    "Malware Artifacts"
    "C2"
    "Anonymization"
    "Exfiltration"
    "Host Characteristics"
    "Compromised PKI Certificate"
    "Login Name"
    "IMEI Watchlist"
    "IMSI Watchlist"})

(def-enum-type IndicatorType
  indicator-type
  :reference "[IndicatorTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/IndicatorTypeVocab-1.1/)")

(def intended-effect
  #{"Advantage"
    "Advantage - Economic"
    "Advantage - Military"
    "Advantage - Political"
    "Theft"
    "Theft - Intellectual Property"
    "Theft - Credential Theft"
    "Theft - Identity Theft"
    "Theft - Theft of Proprietary Information"
    "Account Takeover"
    "Brand Damage"
    "Competitive Advantage"
    "Degradation of Service"
    "Denial and Deception"
    "Destruction"
    "Disruption"
    "Embarrassment"
    "Exposure"
    "Extortion"
    "Fraud"
    "Harassment"
    "ICS Control"
    "Traffic Diversion"
    "Unauthorized Access"})

(def-enum-type IntendedEffect intended-effect)

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

(def kill-chain-name
  "lockheed-martin-cyber-kill-chain")

(def kill-chain-phases
  ;; Lockheed-Martin Cyber Kill Chain phases
  #{"reconnaissance"
    "weaponization"
    "delivery"
    "exploitation"
    "installation"
    "command-and-control"
    "actions-on-objective"})

(def-enum-type LossDuration loss-duration)

(def loss-property
  #{"Confidentiality"
    "Integrity"
    "Availability"
    "Accountability"
    "Non-Repudiation"})

(def-enum-type LossProperty loss-property)

(def malware-labels
  #{"adware"
    "backdoor"
    "bot"
    "ddos"
    "dropper"
    "exploit-kit"
    "keylogger"
    "ransomware"
    "remote-access-trojan"
    "resource-exploitation"
    "rogue-security-software"
    "rootkit"
    "screen-capture"
    "spyware"
    "trojan"
    "virus"
    "worm"})

(def-enum-type MalwareLabel
  malware-labels
  :open? true
  :description (str "Malware label is an open vocabulary that represents "
                    "different types and functions of malware. Malware labels "
                    "are not mutually exclusive; a malware instance can be both "
                    "spyware and a screen capture tool.")
  :reference "[Malware Label](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.8cyb6e9yqzwr)")

(def management-class
  #{"Internally-Managed"
    "Externally-Management" ;; SIC
    "CO-Management"
    "Unknown"})

(def-enum-type ManagementClass management-class)

(def motivation
  #{"Ideological"
    "Ideological - Anti-Corruption"
    "Ideological - Anti-Establishment"
    "Ideological - Environmental"
    "Ideological - Ethnic / Nationalist"
    "Ideological - Information Freedom"
    "Ideological - Religious"
    "Ideological - Security Awareness"
    "Ideological - Human Rights"
    "Ego"
    "Financial or Economic"
    "Military"
    "Opportunistic"
    "Political"})

(def-enum-type Motivation motivation)

(def observable-type-identifier
  #{"ip"
    "ipv6"
    "device" ;; Was "mac"
    "user"
    "domain"
    "sha256"
    "md5"
    "sha1"
    "url"
    ;; PKI Certificate serial numbers for revoked
    ;; code signing or server certificates
    "pki-serial"
    "email"
    "imei"
    "imsi"
    "amp-device"
    "amp_computer_guid"
    "hostname"
    "mac_address"
    "file_name"
    "file_path"})

(def-enum-type ObservableTypeIdentifier
  observable-type-identifier
  :description "Observable type names")

(def ownership-class
  #{"Internally-Owned"
    "Employee-Owned"
    "Partner-Owned"
    "Customer-Owned"
    "Unknown"})

(def-enum-type OwnershipClass ownership-class)

(def scope
  #{"inclusive"
    "exclusive"})

(def-enum-type Scope scope)

(def security-compromise
  #{"Yes"
    "Suspected"
    "No"
    "Unknown"})

(def default-resolution "detected")

(def resolution #{"detected" "blocked" "allowed" "contained"})

(def-enum-type Resolution
  resolution
  :default default-resolution
  :open? true
  :description (str "indicates if the sensor that is reporting "
                    "the Sighting already took action on it, for "
                    "instance a Firewall blocking the IP"))


(def-enum-type SecurityCompromise security-compromise)

(def sophistication
  #{"Innovator"
    "Expert"
    "Practitioner"
    "Novice"
    "Aspirant"})

(def-enum-type Sophistication sophistication)

(def status
  #{"New"
    "Open"
    "Stalled"
    "Containment Achieved"
    "Restoration Achieved"
    "Incident Reported"
    "Closed"
    "Rejected"
    "Deleted"})

(def-enum-type Status status)

(def threat-actor-type
  #{"Cyber Espionage Operations"
    "Hacker"
    "Hacker - White hat"
    "Hacker - Gray hat"
    "Hacker - Black hat"
    "Hacktivist"
    "State Actor / Agency"
    "eCrime Actor - Credential Theft Botnet Operator"
    "eCrime Actor - Credential Theft Botnet Service"
    "eCrime Actor - Malware Developer"
    "eCrime Actor - Money Laundering Network"
    "eCrime Actor - Organized Crime Actor"
    "eCrime Actor - Spam Service"
    "eCrime Actor - Traffic Service"
    "eCrime Actor - Underground Call Service"
    "Insider Threat"
    "Disgruntled Customer / User"})

(def-enum-type ThreatActorType threat-actor-type)

(def sensor
  #{"endpoint"
    "endpoint.digital-telephone-handset"
    "endpoint.laptop"
    "endpoint.pos-terminal"
    "endpoint.printer"
    "endpoint.sensor"
    "endpoint.server"
    "endpoint.smart-meter"
    "endpoint.smart-phone"
    "endpoint.tablet"
    "endpoint.workstation"
    "network"
    "network.bridge"
    "network.firewall"
    "network.gateway"
    "network.guard"
    "network.hips"
    "network.hub"
    "network.ids"
    "network.ips"
    "network.modem"
    "network.nic"
    "network.proxy"
    "network.router"
    "network.security_manager"
    "network.sense_making"
    "network.sensor"
    "network.switch"
    "network.vpn"
    "network.wap"
    "process"
    "process.aaa-server"
    "process.anti-virus-scanner"
    "process.connection-scanner"
    "process.directory-service"
    "process.dns-server"
    "process.email-service"
    "process.file-scanner"
    "process.location-service"
    "process.network-scanner"
    "process.remediation-service"
    "process.reputation-service"
    "process.sandbox"
    "process.virtualization-service"
    "process.vulnerability-scanner"})

(def-enum-type Sensor
  sensor
  :description (str "The openC2 Actuator name that best fits a device\n"
                             "See also the Open C2 Language Description, Actuator "
                             "Vocabulary, page 24.")
  :reference "[OpenC2 Language Description](HTTP://openc2.org/docs/OpenC2%20%20Language%20Descrip%20Doc%20Draft%20%28Rev%200%206f%29%2003012016.pdf)")

(def relationship-type
  #{"attributed-to"
    "based-on"
    "duplicate-of"
    "derived-from"
    "detects"
    "element-of"
    "exploits"
    "indicates"
    "member-of"
    "mitigates"
    "related-to"
    "targets"
    "uses"
    "variant-of"})

(def-enum-type RelationshipType
  relationship-type
  :open? true
  :gen (cs/gen relationship-type))

(def tool-labels
  #{"denial-of-service"
    "exploitation"
    "information-gathering"
    "network-capture"
    "credential-exploitation"
    "remote-access"
    "vulnerability-scanning"})

(def-enum-type ToolLabel
  tool-labels
  :open? true
  :description (str "Tool labels describe the categories of tools that can be "
                    "used to perform attacks.")
  :reference "[Tool Label](https://docs.google.com/document/d/1dIrh1Lp3KAjEMm8o2VzAmuV0Peu-jt9aAh1IHrjAroM/pub#h.cozm95emj8qk)")

(def attack-pattern-abstraction-labels
  #{"category"
    "meta"
    "standard"
    "detailed"
    "aggregate"})

(def-enum-type AttackPatternAbstractions
  attack-pattern-abstraction-labels
  :description "Abstraction levels corresponding to CAPEC data describing attack-pattern objects."
  :reference "[Common Attack Pattern Enumeration and Classification](https://capec.mitre.org)")
