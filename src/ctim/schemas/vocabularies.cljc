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
    "Response"
    "Preparation"
    "Identification"
    "Containment"
    "Eradication"
    "Recovery"
    "Lessons Learned"})

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
    "Playbook"
    "Phase"
    "Task"
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

(def severity
  #{"Info"
    "Low"
    "Medium"
    "High"
    "None"
    "Unknown"
    "Critical"})

(def-enum-type Severity
  severity
  :gen (cs/gen severity))

(def incident-category
  #{"Exercise/Network Defense Testing"
    "Unauthorized Access"
    "Denial of Service"
    "Malicious Code"
    "Improper Usage"
    "Scans/Probes/Attempted Access"
    "Investigation"
    "Exercise"
    "Root Level"
    "User Level"
    "Unsuccessful"
    "Attrition"
    "Non-Compliant"
    "Reconnaissance"
    "Malicious Logic"
    "Investigating"
    "Explained Anomaly"
    "eDiscovery"
    "Forensics"
    "Intelligence"})

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
    "IMSI Watchlist"
    "Private Threat Feed"})

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
  #{"acudid" ;; AnyConnect ID
    "amp_computer_guid"
    "certificate_common_name"
    "certificate_issuer"
    "certificate_serial"
    "cisco_cm_id"          ;; Cisco NVM UUID
    "cisco_mid"
    "cisco_uc_id"          ;; Cisco Unified Connector ID
    "cortex_agent_id"      ;; PAN Cortex XDR Agent ID
    "crowdstrike_id"
    "cvm_id"
    "cybereason_id"
    "darktrace_id"         ;; Darktrace ID
    "device"
    "domain"
    "email"
    "email_messageid"
    "email_subject"
    "file_name"
    "file_path"
    "hostname"
    "imei"
    "imsi"
    "ip"
    "ipv6"
    "mac_address"
    "md5"
    "meraki_network_id"
    "meraki_node_sn"
    "meraki_org_id"
    "ms_machine_id"         ;; Microsoft Windows Defender Machine ID
    "mutex"
    "ngfw_id"
    "ngfw_name"
    "odns_identity"
    "odns_identity_label"
    "orbital_node_id"
    "pki_serial"            ;; PKI Certificate serial numbers for revoked code signing or server certificates
    "process_args"
    "process_hash"
    "process_name"
    "process_path"
    "process_uid"           ;; used to correlate process_name to specific process attributes
    "process_username"
    "processor_id"
    "registry_key"
    "registry_name"
    "registry_path"
    "s1_agent_id"           ;; Sentinel One Agent ID
    "serial_number"
    "sha1"
    "sha256"
    "swc_device_id"
    "trend_micro_id"
    "url"
    "user"
    "user_agent"})

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
                    "instance a Firewall blocking the IP."))

(def sophistication
  #{"Innovator"
    "Expert"
    "Practitioner"
    "Novice"
    "Aspirant"})

(def-enum-type Sophistication sophistication)

(def status
  #{"New: Processing"
    "New: Presented"
    "Open: Investigating"
    "Open: Reported"
    "Open: Contained"
    "Open: Recovered"
    "Hold: Internal"
    "Hold: External"
    "Hold: Legal"
    "Closed: Under Review"
    "Closed: Confirmed Threat"
    "Closed: Suspected"
    "Closed: False Positive"
    "Closed: Near-Miss"
    "Closed: Other"
    "New"
    "Open"
    "Stalled" ;; deprecated, use Hold
    "Hold"
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
  :description (str "The sensor/actuator name that best fits a device."))

(def relationship-type
  #{"attributed-to"
    "based-on"
    "derived-from"
    "detects"
    "duplicate-of"
    "element-of"
    "exploits"
    "indicates"
    "member-of"
    "mitigates"
    "related-to"
    "sighting-of"
    "subtechnique-of"
    "targets"
    "technique-of"
    "uses"
    "variant-of"
    "phase-of"
    "task-of"})

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

(def note-types
  #{"Applicable Platform"
    "Maintenance"
    "Relationship"
    "Research Gap"
    "Terminology"
    "Theoretical"})

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

(def-enum-type NoteType
  note-types
  :open? true
  :description "Defines the different types of notes that can be associated with a weakness."
  :reference "[NoteTypeEnumeration] (https://cwe.mitre.org/documents/schema/#NoteTypeEnumeration)")

(def-enum-type SoftwarePhase
  software-phases
  :open? true
  :description (str "Defines the different regularities that guide the "
                    "applicability of platforms.")
  :reference "[PhaseEnumeration](https://cwe.mitre.org/documents/schema/#PhaseEnumeration)")

(def prevalences
  #{"Often"
    "Sometimes"
    "Rarely"
    "Undetermined"})

(def-enum-type Prevalence
  prevalences
  :description (str "Defines the different regularities that guide the "
                    "applicability of platforms.")
  :reference "[PrevalenceEnumeration](https://cwe.mitre.org/documents/schema/#PrevalenceEnumeration)")

(def language-classes
  #{"Assembly"
    "Compiled"
    "Interpreted"})

(def-enum-type LanguageClass
  language-classes
  :open? true
  :description "Class of source code language."
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
  :description "Class of Operating System."
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
  :description (str "Defines the different areas of software security that "
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
  :decription (str "Technical impacts that can arise if an adversary "
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
  :description "Method used to detect a weakness."
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
  :description (str "Level of effectiveness that a detection method may have "
                    "in detecting an associated weakness.")
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
  :description (str "Strategy for protecting a system to which a mitigation "
                    "contributes.")
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
  :description (str "Related to how effective a mitigation may be in preventing "
                    "the weakness.")
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
                    "which the weakness may appear.")
  :reference "[FunctionalAreaEnumeration](https://cwe.mitre.org/documents/schema/#FunctionalAreaEnumeration)")

(def system-resources
  #{"CPU"
    "File or Directory"
    "Memory"
    "System Process"})

(def-enum-type SystemResource
  system-resources
  :open? true
  :description "Defines a resource of a system."
  :reference "[ResourceEnumeration](https://cwe.mitre.org/documents/schema/#ResourceEnumeration)")

(def weakness-structures
  #{"Chain"
    "Composite"
    "Simple"})

(def-enum-type WeaknessStructure
  weakness-structures
  :description (str "Structural nature of a weakness. Useful as it categorizes weaknesses based on "
                    "their dependencies and complexity and helps analysts to prioritize their "
                    "response efforts based on the potential impact of the vulnerability."
                    "\n\n"
                    "- Chain: A chain weakness might involve an attacker chaining together multiple "
                    "  vulnerabilities and exploits in order to achieve their end goal. For example, "
                    "  an attacker might use a phishing attack to gain access to a user's email "
                    "  account, then use information from that account to socially engineer their way "
                    "  through additional systems until they gain access to an internal network. In "
                    "  this case, the attacker is chaining multiple weaknesses together in order to "
                    "  achieve their ultimate objective."
                    "\n\n"
                    "- Composite: A composite weakness might involve multiple vulnerabilities that "
                    "  exist in different layers or components of a system. For example, a composite "
                    "  weakness in a web application might involve both an injection vulnerability "
                    "  and a cross-site scripting vulnerability. An attacker could use these "
                    "  weaknesses in tandem to steal data or take over the system."
                    "\n\n"
                    "- Simple: A simple weakness might involve a single vulnerability or exploit that "
                    "  can be used to achieve a specific objective. An example of a simple weakness "
                    "  might be a buffer overflow vulnerability in a software application. If an "
                    "  attacker can exploit this vulnerability, they may be able to execute arbitrary "
                    "  code on the system.")
  :reference "[StructureEnumeration](https://cwe.mitre.org/documents/schema/#StructureEnumeration))")

(def weakness-abstraction-levels
  #{"Class"
    "Base"
    "Variant"
    "Compound"})

(def-enum-type WeaknessAbstractionLevel
  weakness-abstraction-levels
  :description (str "Refers to the level of abstraction or granularity used to describe the weakness. "
                    "It helps to categorize the vulnerability based on the level of detail provided. "
                    "CTIM provides four different levels of abstraction for weaknesses: Class, Base, "
                    "Variant, and Compound. "
                    "\n\n"
                    "- Class: is the highest level of abstraction and describes a general category of "
                    "weaknesses. Examples of Classes include :\"Buffer Errors\", \"Input "
                    "Validation\", or \"Authentication Issues\". "
                    "\n\n"
                    "- Base: More specific category than Class. A Base weakness is a "
                    "concrete form of a Class weakness. An example of a Base weakness could be \"SQL "
                    "Injection\"."
                    "\n\n"
                    "- Variant: Describes one specific type of Base weakness that is defined by "
                    "alterations or extensions to the Base description. For example, \"Blind SQL "
                    "Injection\" can be considered a Variant of the Base weakness \"SQL Injection\". "
                    "\n\n"
                    "- Compound: A Compound Weakness describes a weakness that combines two or more "
                    "Base weaknesses to exploit a system. For example, a \"Buffer-Overflow with "
                    "Format-String Exploit\" combines the Base weaknesses of \"Buffer-Overflow\" and "
                    "\"Format-String Vulnerability\". "
                    "\n\n"
                    "By specifying the abstraction level, cybersec professionals can more easily "
                    "identify weaknesses that are related and prioritize their response efforts based "
                    "on the potential impact of the vulnerability.")

  :reference "[AbstractionEnumeration
](https://cwe.mitre.org/documents/schema/#AbstractionEnumeration)")

;; Common Vulnerability Scoring System v3

(def cvss-v3-attack-vectors
  #{"network" "adjacent_network" "local" "physical"})

(def-enum-type CVSSv3AttackVector
  cvss-v3-attack-vectors
  :description
  (str "This metric reflects the context by which "
       "vulnerability exploitation is possible. "
       "This metric value (and consequently the Base score) "
       "will be larger the more remote (logically, and physically) "
       "an attacker can be in order to exploit the vulnerable component. "
       "The assumption is that the number of potential attackers "
       "for a vulnerability that could be exploited from across "
       "the Internet is larger than the number of potential attackers "
       "that could exploit a vulnerability requiring physical "
       "access to a device, and therefore warrants a greater score. "
       "The list of possible values is: "
       "`network` A vulnerability exploitable with network access "
       "means the vulnerable component is bound to the network "
       "stack and the attacker's path is through OSI layer 3 "
       "(the network layer). Such a vulnerability is often "
       "termed `remotely exploitable` and can be thought of "
       "as an attack being exploitable one or more network "
       "hops away (e.g. across layer 3 boundaries from routers). "
       "An example of a network attack is an attacker causing "
       "a denial of service (DoS) by sending a specially "
       "crafted TCP packet from across the public Internet "
       "(e.g. CVE 2004 0230)."
       "`adjacent_network` A vulnerability exploitable with adjacent "
       "network access means the vulnerable component is bound "
       "to the network stack, however the attack is limited "
       "to the same shared physical (e.g. Bluetooth, IEEE 802.11) "
       "or logical (e.g. local IP subnet) network, and cannot be "
       "performed across an OSI layer 3 boundary (e.g. a router). "
       "An example of an Adjacent attack would be an ARP (IPv4) "
       "or neighbor discovery (IPv6) flood leading to a denial "
       "of service on the local LAN segment. See also CVE 2013 6014. "
       "`local` A vulnerability exploitable with Local access means "
       "that the vulnerable component is not bound to the network "
       "stack, and the attacker's path is via read/write/execute "
       "capabilities. In some cases, the attacker may be logged "
       "in locally in order to exploit the vulnerability, otherwise, "
       "she may rely on User Interaction to execute a malicious file. "
       "`physical` A vulnerability exploitable with Physical access "
       "requires the attacker to physically touch or manipulate "
       "the vulnerable component. Physical interaction may be brief "
       "(e.g. evil maid attack) or persistent. An example of such "
       "an attack is a cold boot attack which allows an attacker to access "
       "to disk encryption keys after gaining physical access "
       "to the system, or peripheral attacks such as "
       "Firewire/USB Direct Memory Access attacks.")
  :reference "[Attack Vector](https://www.first.org/cvss/specification-document#2-1-1-Attack-Vector-AV)")

(def cvss-v3-modified-attack-vectors
  (conj cvss-v3-attack-vectors "not_defined"))

(def-enum-type CVSSv3ModifiedAttackVector
  cvss-v3-modified-attack-vectors
  :description (str "The same values as Attack Vector, "
                    "as well as not_defined (the default)")
  :default "not_defined"
  :reference "[Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)")

(def cvss-v3-attack-complexities
  #{"high" "low"})

(def-enum-type CVSSv3AttackComplexity
  cvss-v3-attack-complexities
  :description
  (str "Describes the conditions beyond the attacker's "
       "control that must exist in order to exploit the "
       "vulnerability. As described below, "
       "such conditions may require the collection of more "
       "information about the target, the presence of certain "
       "system configuration settings, "
       "or computational exceptions. Importantly, "
       "the assessment of this metric excludes any "
       "requirements for user interaction in order "
       "to exploit the vulnerability "
       "(such conditions are captured in the User Interaction metric). "
       "this metric value is largest for the least complex attacks. "
       "The list of possible values are: "
       "`low` Specialized access conditions or extenuating "
       "circumstances do not exist. An attacker can expect "
       "repeatable success against the vulnerable component. "
       "`high` A successful attack depends on conditions beyond "
       "the attacker's control. That is, a successful attack "
       "cannot be accomplished at will, but requires the attacker "
       "to invest in some measurable amount of effort in preparation "
       "or execution against the vulnerable component before a "
       "successful attack can be expected. "
       "For example, a successful attack may depend "
       "on an attacker overcoming any of the following conditions: "
       "- The attacker must conduct target-specific reconnaissance. "
       "For example, on target configuration settings, sequence numbers, shared secrets, etc. "
       "- The attacker must prepare the target environment to improve exploit reliability. "
       "For example, repeated exploitation to win a race condition, "
       "or overcoming advanced exploit mitigation techniques. "
       "The attacker must inject herself into the logical network "
       "path between the target and the resource requested by the victim "
       "in order to read and/or modify network communications "
       "(e.g. man in the middle attack).")
  :reference "[Attack Complexity](https://www.first.org/cvss/specification-document#2-1-2-Attack-Complexity-AC)")

(def cvss-v3-modified-attack-complexities
  (conj cvss-v3-attack-complexities "not_defined"))

(def-enum-type CVSSv3ModifiedAttackComplexity
  cvss-v3-modified-attack-complexities
  :description (str "The same values as Attack Complexity, "
                    "as well as not_defined (the default)")
  :default "not_defined"
  :reference "[Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)")

(def cvss-v3-privileges-required #{"high" "low" "none"})

(def-enum-type CVSSv3PrivilegesRequired
  cvss-v3-privileges-required
  :description
  (str "This metric describes the level of privileges an attacker "
       "must possess before successfully exploiting the vulnerability. "
       "This metric is greatest if no privileges are required. "
       "The list of possible values is: "
       "`none`: The attacker is unauthorized prior to attack, "
       "and therefore does not require any access to settings "
       "or files to carry out an attack. "
       "`low`: The attacker is authorized with (i.e. requires) "
       "privileges that provide basic user capabilities "
       "that could normally affect only settings and files "
       "owned by a user. Alternatively, an attacker with "
       "Low privileges may have the ability to cause an impact "
       "only to non-sensitive resources. "
       "`high`: The attacker is authorized "
       "with (i.e. requires) privileges that provide significant "
       "(e.g. administrative) control over the vulnerable component "
       "that could affect component-wide settings and files.")
  :reference "[Privileges Required] (https://www.first.org/cvss/specification-document#2-1-3-Privileges-Required-PR)")

(def cvss-v3-modified-privileges-required
  (conj cvss-v3-privileges-required "not_defined"))

(def-enum-type CVSSv3ModifiedPrivilegesRequired
  cvss-v3-modified-privileges-required
  :description (str "The same values as Privileges Required, "
                    "as well as not_defined (the default)")
  :default "not_defined"
  :reference "[Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)")

(def user-interactions #{"none" "required"})

(def-enum-type CVSSv3UserInteraction
  user-interactions
  :description
  (str "Captures the requirement for a user, "
       "other than the attacker, to participate in "
       "the successful compromise of the vulnerable component. "
       "This metric determines whether the vulnerability "
       "can be exploited solely at the will of the attacker, "
       "or whether a separate user (or user-initiated process) "
       "must participate in some manner. This metric value "
       "is greatest when no user interaction is required. "
       "The list of possible values is: "
       "`none`: The vulnerable system can be exploited "
       "without interaction from any user. "
       "`required`: Successful exploitation "
       "of this vulnerability requires a user to "
       "take some action before the vulnerability "
       "can be exploited. For example, a successful "
       "exploit may only be possible during the installation "
       "of an application by a system administrator.")
  :reference "[User Interaction] (https://www.first.org/cvss/specification-document#2-1-4-User-Interaction-UI)")

(def cvss-v3-modified-user-interactions
  (conj user-interactions "not_defined"))

(def-enum-type CVSSv3ModifiedUserInteraction
  cvss-v3-modified-user-interactions
  :description (str "The same values as User Interaction, "
                    "as well as not_defined (the default)")
  :reference "[Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)")

(def cvss-v3-scopes #{"unchanged" "changed"})

(def-enum-type CVSSv3Scope
  cvss-v3-scopes
  :description
  (str "An important property captured by CVSS v3.0 "
       "is the ability for a vulnerability in one "
       "software component to impact resources beyond "
       "its means, or privileges. This consequence is "
       "represented by the metric Authorization Scope, "
       "or simply Scope. Formally, Scope refers to the collection "
       "of privileges defined by a computing authority "
       "(e.g. an application, an operating system, or a sandbox environment) "
       "when granting access to computing resources "
       "(e.g. files, CPU, memory, etc). These privileges are assigned "
       "based on some method of identification and authorization. "
       "In some cases, the authorization may be simple "
       "or loosely controlled based upon predefined rules "
       "or standards. For example, in the case of Ethernet "
       "traffic sent to a network switch, the switch accepts "
       "traffic that arrives on its ports and is an authority "
       "that controls the traffic flow to other switch ports. "
       "When the vulnerability of a software component governed by "
       "one authorization scope is able to affect resources "
       "governed by another authorization scope, a Scope change "
       "has occurred. Intuitively, one may think of a scope "
       "change as breaking out of a sandbox, and an example "
       "would be a vulnerability in a virtual machine that enables "
       "an attacker to delete files on the host OS "
       "(perhaps even its own VM). In this example, there "
       "are two separate authorization authorities: one that defines "
       "and enforces privileges for the virtual machine and its users, "
       "and one that defines and enforces privileges for "
       "the host system within which the virtual machine runs. "
       "a scope change would not occur, for example, with "
       "a vulnerability in Microsoft Word that allows an attacker "
       "to compromise all system files of the host OS, because "
       "the same authority enforces privileges of the user's instance "
       "of Word, and the host's system files. "
       "The Base score is greater when a scope change has occurred. "
       "The list of possible values is: "
       "`unchanged`: An exploited vulnerability can only affect "
       "resources managed by the same authority. "
       "In this case the vulnerable component and the impacted "
       "component are the same. "
       "`changed`: An exploited vulnerability can affect "
       "resources beyond the authorization privileges "
       "intended by the vulnerable component. "
       "In this case the vulnerable component and the impacted "
       "component are different.")
  :reference "[Scope] (https://www.first.org/cvss/specification-document#2-2-Scope-S)")

(def cvss-v3-modified-scopes
  (conj cvss-v3-scopes "not_defined"))

(def-enum-type CVSSv3ModifiedScope
  cvss-v3-modified-scopes
  :description (str "The same values as Scope, "
                    "as well as not_defined (the default)")
  :default "not_defined"
  :reference "[Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)")

(def cvss-v3-confidentiality-impacts
  #{"none" "low" "high"})

(def-enum-type CVSSv3ConfidentialityImpact
  cvss-v3-confidentiality-impacts
  :description
  (str "Measures the impact to the confidentiality "
       "of the information resources managed by "
       "a software component due to a successfully exploited "
       "vulnerability. Confidentiality refers to limiting information "
       "access and disclosure to only authorized users, "
       "as well as preventing access by, or disclosure to, "
       "unauthorized ones. The list of possible values  is: "
       "`high`: There is total loss of confidentiality, "
       "resulting in all resources within the impacted component "
       "being divulged to the attacker. Alternatively, "
       "access to only some restricted information is obtained, "
       "but the disclosed information presents a direct, "
       "serious impact. For example, an attacker steals the "
       "administrator's password, or private encryption keys "
       "of a web server. "
       "`low`: There is some loss of confidentiality. "
       "Access to some restricted information is obtained, "
       "but the attacker does not have control over "
       "what information is obtained, or the amount or kind of loss "
       "is constrained. The information disclosure does not cause "
       "a direct, serious loss to the impacted component. "
       "`none`: There is no loss of confidentiality within the impacted component. "
       "This metric value increases with the degree of loss to the impacted component.")
  :reference "[Confientiality Impact] (https://www.first.org/cvss/specification-document#2-3-1-Confidentiality-Impact-C)")

(def cvss-v3-modified-confidentiality-impacts
  (conj cvss-v3-confidentiality-impacts "not_defined"))

(def-enum-type CVSSv3ModifiedConfidentialityImpact
  cvss-v3-modified-confidentiality-impacts
  :description (str "The same values as Confidentiality Impact, "
                    "as well as not_defined (the default)")
  :default "not_defined"
  :reference "[Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)")

(def cvss-v3-integrity-impacts
  #{"high" "low" "none"})

(def-enum-type CVSSv3IntegrityImpact
  cvss-v3-integrity-impacts
  :description
  (str "This metric measures the impact to integrity "
       "of a successfully exploited vulnerability. "
       "Integrity refers to the trustworthiness and veracity "
       "of information. The list of possible values  is: "
       "`high`: There is a total loss of integrity, or a complete loss of protection. "
       "For example, the attacker is able to modify any/all files protected by the "
       "impacted component. Alternatively, only some files can be modified, "
       "but malicious modification would present a direct, "
       "serious consequence to the impacted component. "
       "`low`: Modification of data is possible, "
       "but the attacker does not have control over the consequence "
       "of a modification, or the amount of modification is constrained. "
       "The data modification does not have a direct, "
       "serious impact on the impacted component."
       "`none`: There is no loss of integrity within the impacted component."
       "this metric value increases with the consequence to the impacted component. ")
  :reference "[Integrity Impact] (https://www.first.org/cvss/specification-document#2-3-2-Integrity-Impact-I)")

(def cvss-v3-modified-integrity-impacts
  (conj cvss-v3-integrity-impacts "not_defined"))

(def-enum-type CVSSv3ModifiedIntegrityImpact
  cvss-v3-modified-integrity-impacts
  :description (str "The same values as Integrity Impact, "
                    "as well as not_defined (the default)")
  :default "not_defined"
  :reference "[Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)")

(def cvss-v3-availability-impacts
  #{"high" "low" "none"})

(def-enum-type CVSSv3AvailabilityImpact
  cvss-v3-availability-impacts
  :description
  (str "This metric measures the impact to the availability "
       "of the impacted component resulting from "
       "a successfully exploited vulnerability. While the Confidentiality "
       "and Integrity impact metrics apply to the loss of confidentiality "
       "or integrity of data (e.g., information, files) used by the impacted "
       "component, this metric refers to the loss of availability of the "
       "impacted component itself, such as a networked service "
       "(e.g., web, database, email). Since availability refers to the accessibility "
       "of information resources, attacks that consume network bandwidth, "
       "processor cycles, or disk space all impact "
       "the availability of an impacted component. "
       "The list of possible values is presented is: "
       "`high`: There is total loss of availability, "
       "resulting in the attacker being able to fully "
       "deny access to resources in the impacted component; "
       "this loss is either sustained (while the attacker "
       "continues to deliver the attack) or persistent "
       "(the condition persists even after the attack has completed). "
       "Alternatively, the attacker has the ability to deny some availability, "
       "but the loss of availability presents a direct, "
       "serious consequence to the impacted component "
       "(e.g., the attacker cannot disrupt existing connections, "
       "but can prevent new connections; the attacker can repeatedly "
       "exploit a vulnerability that, in each instance of a successful "
       "attack, leaks a only small amount of memory, but after "
       "repeated exploitation causes a service to become completely unavailable). "
       "`low`: There is reduced performance or interruptions in resource "
       "availability. Even if repeated exploitation of the vulnerability is possible, "
       "the attacker does not have the ability to completely deny service "
       "to legitimate users. The resources in the impacted component are either partially "
       "available all of the time, or fully available only some of the time "
       "but overall there is no direct, serious consequence to the impacted component. "
       "`none`: There is no impact to availability within the impacted component. "
       "This metric value increases with the consequence to the impacted component.")
  :reference "[Availability Impact] (https://www.first.org/cvss/specification-document#2-3-3-Availability-Impact-A)")

(def cvss-v3-modified-availability-impacts
  (conj cvss-v3-availability-impacts "not_defined"))

(def-enum-type CVSSv3ModifiedAvailabilityImpact
  cvss-v3-modified-availability-impacts
  :description (str "The same values as Availability Impact, "
                    "as well as not_defined (the default)")
  :default "not_defined"
  :reference "[Modified Base Metrics] (https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)")

(def cvss-v3-security-requirements
  #{"none" "low" "high" "not_defined"})

(def-enum-type CVSSv3SecurityRequirements
  cvss-v3-security-requirements
  :description
  (str "These metrics enable the analyst to customize "
       "the CVSS score depending on the importance "
       "of the affected IT asset to a user's organization, "
       "measured in terms of Confidentiality, Integrity, "
       "and Availability. That is, if an IT asset supports "
       "a business function for which Availability is most "
       "important, the analyst can assign a greater value to "
       "Availability relative to Confidentiality and Integrity. "
       "Each security requirement has three possible values: "
       "Low, Medium, or High. "
       "The full effect on the environmental score "
       "is determined by the corresponding Modified Base Impact metrics. "
       "That is, these metrics modify the environmental score by "
       "reweighting the Modified Confidentiality, Integrity, and Availability "
       "impact metrics. For example, the Modified Confidentiality"
       "impact (MC) metric has increased weight if the Confidentiality "
       "Requirement (CR) is High. Likewise, the Modified Confidentiality "
       "impact metric has decreased weight if the Confidentiality "
       "Requirement is Low. The Modified Confidentiality "
       "impact metric weighting is neutral if the Confidentiality Requirement "
       "is Medium. This same process is applied to the Integrity "
       "and Availability requirements."
       "Note that the Confidentiality Requirement will not affect "
       "the Environmental score if the (Modified Base) "
       "confidentiality impact is set to None. Also, increasing the "
       "Confidentiality Requirement from Medium to High"
       "will not change the Environmental score when the (Modified Base) "
       "impact metrics are set to High. This is because the modified "
       "impact sub score (part of the Modified Base score that calculates impact) "
       "is already at a maximum value of 10. "
       "The list of possible values is: "
       "`not_defined`: Assigning this value to the metric "
       "will not influence the score. It is a signal to the "
       "equation to skip this metric. "
       "`high`: Loss of [Confidentiality / Integrity / Availability] "
       "is likely to have a catastrophic adverse effect on the organization "
       "or individuals associated with the organization "
       "(e.g., employees, customers). "
       "`medium`: Loss of [Confidentiality / Integrity / Availability] "
       "is likely to have a serious adverse effect on the organization "
       "or individuals associated with the organization "
       "(e.g., employees, customers)."
       "`low`: Loss of [Confidentiality / Integrity / Availability] "
       "is likely to have only a limited adverse effect "
       "on the organization or individuals associated "
       "with the organization (e.g., employees, customers). "
       "For brevity, the same table is used for all three metrics. "
       "The greater the Security Requirement, the higher the score "
       "(recall that Medium is considered the default).")
  :reference "[Security Requirements] (https://www.first.org/cvss/specification-document#4-1-Security-Requirements-CR-IR-AR)")

(def cvss-v3-exploit-code-maturities
  #{"unproven" "proof_of_concept" "functional" "high" "not_defined"})

(def-enum-type CVSSv3ExploitCodeMaturity
  cvss-v3-exploit-code-maturities
  :description
  (str "This metric measures the likelihood of the "
       "vulnerability being attacked, and is typically "
       "based on the current state of exploit techniques, "
       "exploit code availability, or active, "
       "'in-the-wild' exploitation. Public availability "
       "of easy-to-use exploit code increases the number "
       "of potential attackers by including those who are "
       "unskilled, thereby increasing the severity of the vulnerability. "
       "Initially, real-world exploitation may only be theoretical. "
       "Publication of proof-of-concept code, functional exploit code, "
       "or sufficient technical details necessary to exploit "
       "the vulnerability may follow. Furthermore, the exploit "
       "code available may progress from a proof-of-concept "
       "demonstration to exploit code that is successful "
       "in exploiting the vulnerability consistently. "
       "In severe cases, it may be delivered as the payload "
       "of a network-based worm or virus or other "
       "automated attack tools. "
       "The list of possible values is: "
       "`not_defined`: Assigning this value to the metric "
       "will not influence the score. It is a signal to a "
       "scoring equation to skip this metric. "
       "`high`: Functional autonomous code exists, "
       "or no exploit is required (manual trigger) and details "
       "are widely available. Exploit code works "
       "in every situation, or is actively being delivered "
       "via an autonomous agent (such as a worm or virus). "
       "Network-connected systems are likely to encounter "
       "scanning or exploitation attempts. Exploit development "
       "has reached the level of reliable, widely-available, "
       "easy-to-use automated tools. "
       "`functional`: Functional exploit code is available. "
       "The code works in most situations where the vulnerability exists. "
       "`proof_of_concept`: Proof-of-concept exploit code is available, "
       "or an attack demonstration is not practical for most systems. "
       "The code or technique is not functional in all situations "
       "and may require substantial modification by a skilled attacker. "
       "`unproven`: No exploit code is available, or an exploit is theoretical.")
  :reference "[Exploit Code Maturity] (https://www.first.org/cvss/specification-document#3-1-Exploit-Code-Maturity-E)")

(def cvss-v3-remediation-levels
  #{"offical_fix" "temporary_fix" "workaround" "high" "unavailable" "not_defined"})

(def-enum-type CVSSv3RemediationLevel
  cvss-v3-remediation-levels
  :description
  (str "The Remediation Level of a vulnerability "
       "is an important factor for prioritization. "
       "The typical vulnerability is unpatched when initially published. "
       "Workarounds or hotfixes may offer interim remediation "
       "until an official patch or upgrade is issued. Each of these respective "
       "stages adjusts the temporal score downwards, "
       "reflecting the decreasing urgency as remediation "
       "becomes final. The list of possible values is: "
       "`not_defined`: Assigning this value to the metric "
       "will not influence the score. It is a signal to a scoring "
       "equation to skip this metric. "
       "`unavailable`: There is either no solution available or it is impossible to apply. "
       "`workaround`: There is an unofficial, non-vendor solution available. "
       "In some cases, users of the affected technology will create "
       "a patch of their own or provide steps to "
       "work around or otherwise mitigate the vulnerability. "
       "`temporary_fix`: There is an official but temporary fix available. "
       "This includes instances where the vendor issues a temporary hotfix, "
       "tool, or workaround."
       "`official_fix`: A complete vendor solution is available. Either the vendor "
       "has issued an official patch, or an upgrade is available. "
       "The less official and permanent a fix, the higher the vulnerability score. ")
  :reference "[Remediation Level] (https://www.first.org/cvss/specification-document#3-2-Remediation-Level-RL)")

(def cvss-v3-report-confidences
  #{"unknown" "reasonable" "confirmed"})

(def-enum-type CVSSv3ReportConfidence
  cvss-v3-report-confidences
  :description
  (str "Measures the degree of confidence in "
       "the existence of the vulnerability and "
       "the credibility of the known technical details. "
       "Sometimes only the existence of vulnerabilities "
       "are publicized, but without specific details. "
       "For example, an impact may be recognized as undesirable, "
       "but the root cause may not be known. The vulnerability may "
       "later be corroborated by research which suggests where "
       "the vulnerability may lie, though the research may not be "
       "certain. Finally, a vulnerability may be confirmed "
       "through acknowledgement by the author or vendor of the affected "
       "technology. The urgency of a vulnerability is higher when a "
       "vulnerability is known to exist with certainty. "
       "This metric also suggests the level of technical knowledge available "
       "to would-be attackers. The list of possible values  is: "
       "`not_defined`: Assigning this value to the metric will not influence the score. "
       "It is a signal to a scoring equation to skip this metric. "
       "`confirmed`: Detailed reports exist, or functional "
       "reproduction is possible (functional exploits may provide this). "
       "Source code is available to independently verify the"
       "assertions of the research, or the author or vendor "
       "of the affected code has confirmed the presence of the vulnerability. "
       "`reasonable`: Significant details are published, but researchers either "
       "do not have full confidence in the root cause, or do not have "
       "access to source code to fully confirm all of the interactions "
       "that may lead to the result. Reasonable confidence exists, "
       "however, that the bug is reproducible and at least one impact "
       "is able to be verified (proof-of-concept exploits may provide this). "
       "An example is a detailed write-up of research "
       "into a vulnerability with an explanation "
       "(possibly obfuscated or 'left as an exercise to the reader') "
       "that gives assurances on how to reproduce the results. "
       "`unknown`: There are reports of impacts that indicate "
       "a vulnerability is present. The reports indicate that the "
       "cause of the vulnerability is unknown, or reports may "
       "differ on the cause or impacts of the vulnerability. "
       "Reporters are uncertain of the true nature of the vulnerability, "
       "and there is little confidence in the validity of the reports "
       "or whether a static Base score can be applied given "
       "the differences described. An example is a bug "
       "report which notes that an intermittent but non-reproducible "
       "crash occurs, with evidence of memory corruption suggesting "
       "that denial of service, or possible more serious impacts, may result. "
       "The more a vulnerability is validated by the vendor or other "
       "reputable sources, the higher the score.")
  :reference "[Report Confidence] (https://www.first.org/cvss/specification-document#3-3-Report-Confidence-RC)")

(def cvss-v3-severities
  #{"none" "low" "medium" "high" "critical"})

(def-enum-type CVSSv3Severity
  cvss-v3-severities)

;; Common Vulnerability Scoring System v2

(def cvss-v2-access-vectors #{"local" "adjacent network" "network"})

(def-enum-type CVSSv2AccessVector
  cvss-v2-access-vectors
  :description
  (str
   "This metric reflects how the vulnerability is exploited."
   "The more remote an attacker can be to attack a host, the "
   "greater the vulnerability score.")
  :default "network"
  :reference "https://www.first.org/cvss/v2/guide#2-1-1-Access-Vector-AV")

(def cvss-v2-access-complexities #{"high" "medium" "low"})

(def-enum-type CVSSv2AccessComplexity
  cvss-v2-access-complexities
  :description
  (str
   "This metric measures the complexity of the attack required to "
   "exploit the vulnerability once an attacker has gained access to "
   "the target system. For example, consider a buffer overflow in an "
   "Internet service: once the target system is located, the attacker "
   "can launch an exploit at will.")
  :default "low"
  :reference "https://www.first.org/cvss/v2/guide#2-1-2-Access-Complexity-AC")

(def cvss-v2-authentications #{"multiple" "single" "none"})

(def-enum-type CVSSv2Authentication
  cvss-v2-authentications
  :description
  (str
   "This metric measures the number of times an attacker must "
   "authenticate to a target in order to exploit a vulnerability. This "
   "metric does not gauge the strength or complexity of the authentication "
   "process, only that an attacker is required to provide credentials "
   "before an exploit may occur. The fewer authentication instances that "
   "are required, the higher the vulnerability score.")
  :default "none"
  :reference "https://www.first.org/cvss/v2/guide#2-1-3-Authentication-Au")

(def cvss-v2-impacts #{"none" "partial" "complete"})

(def-enum-type CVSSv2ConfidentialityImpact
  cvss-v2-impacts
  :description
  (str
   "This metric measures the impact on confidentiality of a successfully "
   "exploited vulnerability. Confidentiality refers to limiting information "
   "access and disclosure to only authorized users, as well as preventing "
   "access by, or disclosure to, unauthorized ones. Increased"
   "confidentiality impact increases the vulnerability score.")
  :default "complete"
  :reference "https://www.first.org/cvss/v2/guide#2-1-4-Confidentiality-Impact-C")

(def-enum-type CVSSv2IntegrityImpact
  cvss-v2-impacts
  :description
  (str
   "This metric measures the impact to integrity of a successfully "
   "exploited vulnerability. Integrity refers to the trustworthiness and "
   "guaranteed veracity of information. Increased integrity impact increases "
   "the vulnerability score.")
  :default "complete"
  :reference "https://www.first.org/cvss/v2/guide#2-1-5-Integrity-Impact-I")

(def-enum-type CVSSv2AvailabilityImpact
  cvss-v2-impacts
  :description
  (str
   "This metric measures the impact to availability of a successfully "
   "exploited vulnerability. Availability refers to the accessibility of "
   "information resources. Attacks that consume network bandwidth, processor "
   "cycles, or disk space all impact the availability of a system. Increased "
   "availability impact increases the vulnerability score.")
  :default "complete"
  :reference "https://www.first.org/cvss/v2/guide#2-1-6-Availability-Impact-A")

(def cvss-v2-exploitability-scores
  #{"unproven" "proof_of_concept" "functional" "high" "not_defined"})

(def-enum-type CVSSv2Exploitability
  cvss-v2-exploitability-scores
  :description
  (str
   "This metric measures the current state of exploit techniques or code "
   "availability. Public availability of easy-to-use exploit code increases "
   "the number of potential attackers by including those who are unskilled ",
   "thereby increasing the severity of the vulnerability.")
  :default "not_defined"
  :reference "https://www.first.org/cvss/v2/guide#2-2-1-Exploitability-E")

(def cvss-v2-remediation-level-scores
  #{"official_fix" "temporary_fix" "workaround" "unavailable" "not_defined"})

(def-enum-type CVSSv2RemediationLevel
  cvss-v2-remediation-level-scores
  :description
  (str
   "The remediation level of a vulnerability is an important factor "
   "for prioritization. The typical vulnerability is unpatched when initially "
   "published. Workarounds or hotfixes may offer interim remediation until an "
   "official patch or upgrade is issued. Each of these respective stages "
   "adjusts the temporal score downwards, reflecting the decreasing urgency "
   "as remediation becomes final. The less official and permanent a fix, "
   "the higher the vulnerability score is.")
  :default "not_defined"
  :reference "https://www.first.org/cvss/v2/guide#2-2-2-Remediation-Level-RL")

(def cvss-v2-report-confidence-scores
  #{"unconfirmed" "uncorroborated" "confirmed" "not_defined"})

(def-enum-type CVSSv2ReportConfidence
  cvss-v2-report-confidence-scores
  :description
  (str
   "This metric measures the degree of confidence in the existence of the "
   "vulnerability and the credibility of the known technical details. "
   "Sometimes, only the existence of vulnerabilities are publicized, but "
   "without specific details. The vulnerability may later be corroborated "
   "and then confirmed through acknowledgement by the author or vendor of "
   "the affected technology. The urgency of a vulnerability is higher when a "
   "vulnerability is known to exist with certainty. This metric also suggests "
   "the level of technical knowledge available to would-be attackers. The "
   "more a vulnerability is validated by the vendor or other reputable "
   "sources, the higher the score.")
  :default "not_defined"
  :reference "https://www.first.org/cvss/v2/guide#2-2-3-Report-Confidence-RC")

(def cvss-v2-cdp-scores
  #{"none" "low" "low_medium" "medium_high" "high" "not_defined"})

(def-enum-type CVSSv2CollateralDamagePotential
  cvss-v2-cdp-scores
  :description
  (str
   "This metric measures the potential for loss of life or physical assets "
   "through damage or theft of property or equipment.  The metric may also "
   "measure economic loss of productivity or revenue. Naturally, the greater "
   "the damage potential, the higher the vulnerability score.")
  :default "not_defined"
  :reference "https://www.first.org/cvss/v2/guide#2-3-1-Collateral-Damage-Potential-CDP")

(def cvss-v2-target-distribution-scores
  #{"none" "high" "medium" "low" "not_defined"})

(def-enum-type CVSSv2TargetDistribution
  cvss-v2-target-distribution-scores
  :description
  (str
   "This metric measures the proportion of vulnerable systems. It is meant "
   "as an environment-specific indicator in order to approximate the "
   "percentage of systems that could be affected by the vulnerability. The "
   "greater the proportion of vulnerable systems, the higher the score.")
  :default "not_defined"
  :reference "https://www.first.org/cvss/v2/guide#2-3-2-Target-Distribution-TD")

(def cvss-v2-security-requirement-scores
  #{"low" "medium" "high" "not_defined"})

(def-enum-type CVSSv2SecurityRequirement
  cvss-v2-security-requirement-scores
  :description
  (str "These metrics enable the analyst to customize the CVSS score depending "
       "on the importance of the affected IT asset to a users organization, "
       "measured in terms of confidentiality, integrity, and availability, That "
       "is, if an IT asset supports a business function for which availability is "
       "most important, the analyst can assign a greater value to availability, "
       "relative to confidentiality and integrity. Each security requirement has "
       "three possible values: low, medium, or high.")
  :default "not_defined"
  :reference "https://www.first.org/cvss/v2/guide#2-3-3-Security-Requirements-CR-IR-AR")

(def promotion-method #{"Manual" "Automated"})

(def-enum-type PromotionMethod promotion-method
  :open? false
  :gen (cs/gen promotion-method))
