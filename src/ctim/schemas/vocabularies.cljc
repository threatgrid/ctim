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

(def-enum-type DiscoveryMethod discovery-method
  :open? true
  :gen (cs/gen discovery-method))

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

(def incident-category
  #{"Exercise/Network Defense Testing"
    "Unauthorized Access"
    "Denial of Service"
    "Malicious Code"
    "Improper Usage"
    "Scans/Probes/Attempted Access"
    "Investigation"})

(def-enum-type IncidentCategory
  incident-category
  :open? true
  :gen (cs/gen incident-category))

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

(def-enum-type IntendedEffect intended-effect
  :open? true
  :gen (cs/gen intended-effect))

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

(def-enum-type Motivation motivation
  :open? true
  :gen (cs/gen motivation))

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
    "pki_serial"
    "email"
    "imei"
    "imsi"
    "amp_computer_guid"
    "hostname"
    "mac_address"
    "file_name"
    "file_path"})

(def-enum-type ObservableTypeIdentifier
  observable-type-identifier
  :description "Observable type names")

(def scope
  #{"inclusive"
    "exclusive"})

(def-enum-type Scope scope)

(def default-resolution "detected")

(def resolution #{"detected" "blocked" "allowed" "contained"})

(def-enum-type Resolution
  resolution
  :default default-resolution
  :open? true
  :description (str "indicates if the sensor that is reporting "
                    "the Sighting already took action on it, for "
                    "instance a Firewall blocking the IP"))

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
    "Rejected"})

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

(def-enum-type ThreatActorType threat-actor-type
  :open? true
  :gen (cs/gen threat-actor-type))

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
  :open? true
  :gen (cs/gen sensor)
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

(def malware-abstraction-labels
  #{"family"
    "variant"
    "version"})

(def-enum-type MalwareAbstractions
  malware-abstraction-labels
  :description "Malware Abstraction level")

;; ---- Weakness CWE

(def software-phases
  #{"Policy"
    "Requirements"
    "Architecture and Design"
    "Implementation"
    "Build and Compilation"
    "Testing"
    "Documentation"
    "Bundling"
    "Distribution"
    "Installation"
    "System Configuration"
    "Operation"
    "Patching and Maintenance"
    "Porting"})

(def-enum-type SoftwarePhase
  software-phases
  :open? true
  :description (str "defines the different regularities that guide the "
                    "applicability of platforms")
  :reference "[PhaseEnumeration](https://cwe.mitre.org/documents/schema/#PhaseEnumeration)")

(def prevalences
  #{"Often"
    "Sometimes"
    "Rarely"
    "Undetermined"})

(def-enum-type Prevalence
  prevalences
  :description (str "defines the different regularities that guide the "
                    "applicability of platforms")
  :reference "[PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)")

(def language-classes
  #{"Assembly"
    "Compiled"
    "Interpreted"})

(def-enum-type LanguageClass
  language-classes
  :open? true
  :description "class of source code language"
  :reference "[LanguageClassEnumeration](https://cwe.mitre.org/documents/schema/#LanguageClassEnumeration)")

(def operating-system-classes
  #{"Android"
    "Cisco IOS"
    "Apple iOS"
    "Linux"
    "macOs"
    "Unix"
    "Windows"})

(def-enum-type OperatingSystemClass
  operating-system-classes
  :open? true
  :description "class of operating systems"
  :reference "[OperatingSystemClassEnumeration](https://cwe.mitre.org/documents/schema/#OperatingSystemClassEnumeration)")

(def architecture-classes
  #{"Embedded"
    "Microcomputer"
    "Workstation"})

(def-enum-type ArchitectureClass
  architecture-classes
  :open? true
  :reference "[ArchitectureClassEnumeration](https://cwe.mitre.org/documents/schema/#ArchitectureClassEnumeration)")

(def consequence-scopes
  #{"Confidentiality"
    "Integrity"
    "Availability"
    "Access Control"
    "Accountability"
    "Authentication"
    "Authorization"
    "Non-Repudiation"})

(def-enum-type ConsequenceScope
  consequence-scopes
  :open? true
  :description (str "defines the different areas of software security that "
                    "can be affected by exploiting a weakness.")
  :reference "[ScopeEnumeration](https://cwe.mitre.org/documents/schema/#ScopeEnumeration)")

(def technical-impacts
  #{"Modify Memory"
    "Read Memory"
    "Modify Files or Directories"
    "Read Files or Directories"
    "Modify Application Data"
    "Read Application Data"
    "DoS: Crash, Exit, or Restart"
    "DoS: Amplification"
    "DoS: Instability"
    "DoS: Resource Consumption (CPU)"
    "DoS: Resource Consumption (Memory)"
    "DoS: Resource Consumption (Other)"
    "Execute Unauthorized Code or Commands"
    "Gain Privileges or Assume Identity"
    "Bypass Protection Mechanism"
    "Hide Activities"
    "Alter Execution Logic"
    "Quality Degradation"
    "Unexpected State"
    "Varies by Context"})

(def-enum-type TechnicalImpact
  technical-impacts
  :open? true
  :decription (str "technical impacts that can arise if an adversary "
                   "successfully exploits a weakness.")
  :reference "[TechnicalImpactEnumeration](https://cwe.mitre.org/documents/schema/#TechnicalImpactEnumeration)")

(def detection-methods
  #{"Automated Analysis"
    "Automated Dynamic Analysis"
    "Automated Static Analysis"
    "Automated Static Analysis - Source Code"
    "Automated Static Analysis - Binary or Bytecode"
    "Fuzzing"
    "Manual Analysis"
    "Manual Dynamic Analysis"
    "Manual Static Analysis"
    "Manual Static Analysis - Source Code"
    "Manual Static Analysis - Binary or Bytecode"
    "White Box"
    "Black Box"
    "Architecture or Design Review"
    "Dynamic Analysis with Manual Results Interpretation"
    "Dynamic Analysis with Automated Results Interpretation"
    "Other"})

(def-enum-type DetectionMethod
  detection-methods
  :open? true
  :description "method used to detect a weakness"
  :reference "[DetectionMethodEnumeration](https://cwe.mitre.org/documents/schema/#DetectionMethodEnumeration)")

(def detection-effectivness
  #{"High"
    "Moderate"
    "SOAR Partial"
    "Opportunistic"
    "Limited"
    "None"})

(def-enum-type DetectionEffectiveness
  detection-effectivness
  :open? true
  :description (str "level of effectiveness that a detection method may have "
                    "in detecting an associated weakness")
  :reference "[DetectionEffectivenessEnumeration](https://cwe.mitre.org/documents/schema/#DetectionEffectivenessEnumeration)")

(def mitigation-strategies
  #{"Attack Surface Reduction"
    "Compilation or Build Hardening"
    "Enforcement by Conversion"
    "Environment Hardening"
    "Firewall"
    "Input Validation"
    "Language Selection"
    "Libraries or Frameworks"
    "Resource Limitation"
    "Output Encoding"
    "Parameterization"
    "Refactoring"
    "Sandbox or Jail"
    "Separation of Privilege"})

(def-enum-type MitigationStrategy
  mitigation-strategies
  :open? true
  :description (str "strategy for protecting a system to which a mitigation "
                    "contributes")
  :reference "[MitigationStrategyEnumeration](https://cwe.mitre.org/documents/schema/#MitigationStrategyEnumeration)")

(def effectiveness
  #{"High"
    "Moderate"
    "Limited"
    "Incidental"
    "Defense in Depth"
    "None"})

(def-enum-type Effectiveness
  effectiveness
  :open? true
  :description (str "related to how effective a mitigation may be in preventing "
                    "the weakness")
  :reference "[EffectivenessEnumeration](https://cwe.mitre.org/documents/schema/#EffectivenessEnumeration)")

(def functional-areas
  #{"Authentication"
    "Authorization"
    "Code Libraries"
    "Counters"
    "Cryptography"
    "Error Handling"
    "Interprocess Communication"
    "File Processing"
    "Logging"
    "Memory Management"
    "Networking"
    "Number Processing"
    "Program Invocation"
    "Protection Mechanism"
    "Session Management"
    "Signals"
    "String Processing"
    "Functional-Area-Independent"})

(def-enum-type FunctionalArea
  functional-areas
  :open? true
  :description (str "Defines the different functional areas of software in "
                    "which the weakness may appear")
  :reference "[FunctionalAreaEnumeration](https://cwe.mitre.org/documents/schema/#FunctionalAreaEnumeration)")

(def system-resources
  #{"CPU"
    "File or Directory"
    "Memory"
    "System Process"})

(def-enum-type SystemResource
  system-resources
  :open? true
  :description "defines a resource of a system"
  :reference "[ResourceEnumeration](https://cwe.mitre.org/documents/schema/#ResourceEnumeration)")

(def weakness-structures
  #{"Chain"
    "Composite"
    "Simple"})

(def-enum-type WeaknessStructure
  weakness-structures
  :description (str "structural natures of a weakness. A Simple structure "
                    "represents a single weakness whose exploitation is not "
                    "dependent on the presence of another weakness. "
                    "A Composite is a set of weaknesses that must all be "
                    "present simultaneously in order to produce an exploitable "
                    "vulnerability, while a Chain is a set of weaknesses that "
                    "must be reachable consecutively in order to produce an "
                    "exploitable vulnerability.")
  :reference "[StructureEnumeration](https://cwe.mitre.org/documents/schema/#StructureEnumeration))")

(def weakness-abstraction-levels
  #{"Class"
    "Base"
    "Variant"
    "Compound"})

(def-enum-type WeaknessAbstractionLevel
  weakness-abstraction-levels
  :description (str "defines the different abstraction levels that apply to a "
                    "weakness. A `Class` is the most abstract type of weakness, "
                    "typically described independent of any specific language "
                    "or technology. A `Base` is a more specific type of weakness "
                    "that is still mostly independent of a resource or technology, "
                    "but with sufficient details to provide specific methods for "
                    "detection and prevention. A `Variant` is a weakness that is "
                    "described at a very low level of detail, typically limited "
                    "to a specific language or technology. A `Compound` weakness "
                    "is a meaningful aggregation of several weaknesses, currently "
                    "known as either a Chain or Composite.")
  :reference "[AbstractionEnumeration
](https://cwe.mitre.org/documents/schema/#AbstractionEnumeration)")
