(ns ctim.schemas.vocabularies
  (:require #?(:clj  [clojure.spec :as cs]
               :cljs [cljs.spec :as cs])
            [clojure.test.check.generators]
            #?(:clj [flanders.core :as f :refer [def-enum-type]]
               :cljs [flanders.core :as f :refer-macros [def-enum-type]])))

(def attack-infrastructure
  #{"Anonymization"
    "Anonymization - Proxy"
    "Anonymization - TOR Network"
    "Anonymization - VPN"
    "Communications"
    "Communications - Blogs"
    "Communications - Forums"
    "Communications - Internet Relay Chat"
    "Communications - Micro-Blogs"
    "Communications - Mobile Communications"
    "Communications - Social Networks"
    "Communications - User-Generated Content Websites"
    "Domain Registration"
    "Domain Registration - Dynamic DNS Services"
    "Domain Registration - Legitimate Domain Registration Services"
    "Domain Registration - Malicious Domain Registrars"
    "Domain Registration - Top-Level Domain Registrars"
    "Hosting"
    "Hosting - Bulletproof / Rogue Hosting"
    "Hosting - Cloud Hosting"
    "Hosting - Compromised Server"
    "Hosting - Fast Flux Botnet Hosting"
    "Hosting - Legitimate Hosting"
    "Electronic Payment Methods"})

(def-enum-type AttackerInfrastructure
  attack-infrastructure
  :reference "[AttackInfrastructureTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/AttackerInfrastructureTypeVocab-1.0/)")

(def attack-tool-type
  #{"Malware"
    "Penetration Testing"
    "Port Scanner"
    "Traffic Scanner"
    "Vulnerability Scanner"
    "Application Scanner"
    "Password Cracking"})

(def-enum-type AttackToolType
  attack-tool-type
  :reference "[AttackerToolTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/AttackerToolTypeVocab-1.0/)")

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
  #{"Low"
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

(def information-type
  #{"Information Assets"
    "Information Assets - Corporate Employee Information"
    "Information Assets - Customer PII"
    "Information Assets - Email Lists / Archives"
    "Information Assets - Financial Data"
    "Information Assets - Intellectual Property"
    "Information Assets - Mobile Phone Contacts"
    "Information Assets - User Credentials"
    "Authentication Cookies"})

(def-enum-type InformationType
  information-type
  :reference "[InformationTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/InformationTypeVocab-1.0/)")

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

(def kill-chain
  #{"Reconnaissance"
    "Weaponization"
    "Delivery"
    "Exploitation"
    "Installation"
    "Command & Control"
    "Actions on Objectives"})

(def-enum-type KillChain kill-chain)

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

(def loss-property
  #{"Confidentiality"
    "Integrity"
    "Availability"
    "Accountability"
    "Non-Repudiation"})

(def-enum-type LossProperty loss-property)

(def malware-type
  #{"Automated Transfer Scripts"
    "Adware"
    "Dialer"
    "Bot"
    "Bot - Credential Theft"
    "Bot - DDoS"
    "Bot - Loader"
    "Bot - Spam"
    "DoS/ DDoS"
    "DoS / DDoS - Participatory"
    "DoS / DDoS - Script"
    "DoS / DDoS - Stress Test Tools"
    "Exploit Kit"
    "POS / ATM Malware"
    "Ransomware"
    "Remote Access Trojan"
    "Rogue Antivirus"
    "Rootkit"})

(def-enum-type MalwareType malware-type)

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

(def system-type
  #{"Enterprise Systems"
    "Enterprise Systems - Application Layer"
    "Enterprise Systems - Database Layer"
    "Enterprise Systems - Enterprise Technologies and Support Infrastructure"
    "Enterprise Systems - Network Systems"
    "Enterprise Systems - Networking Devices"
    "Enterprise Systems - Web Layer"
    "Enterprise Systems - VoIP"
    "Industrial Control Systems"
    "Industrial Control Systems - Equipment Under Control"
    "Industrial Control Systems - Operations Management"
    "Industrial Control Systems - Safety, Protection and Local Control"
    "Industrial Control Systems - Supervisory Control"
    "Mobile Systems"
    "Mobile Systems - Mobile Operating Systems"
    "Mobile Systems - Near Field Communications"
    "Mobile Systems - Mobile Devices"
    "Third-Party Services"
    "Third-Party Services - Application Stores"
    "Third-Party Services - Cloud Services"
    "Third-Party Services - Security Vendors"
    "Third-Party Services - Social Media"
    "Third-Party Services - Software Update"
    "Users"
    "Users - Application And Software"
    "Users - Workstation"
    "Users - Removable Media"})

(def-enum-type SystemType
  system-type
  :reference "[SystemTypeVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/SystemTypeVocab-1.0/)")

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
