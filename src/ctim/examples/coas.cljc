(ns ctim.examples.coas
  (:require [ctim.schemas.common :as c]))

(def coa-openc2-variant1
  {:id "http://ex.tld/ctia/coa/coa-40c6ab14-5bda-4f79-b756-e24c9dc8c52c"
   :type "coa"
   :schema_version c/ctim-schema-version
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :structured_coa_type "openc2"
   :open_c2_coa{:type "structured_coa"
                :id "openc2_coa_1"
                :action {:type "deny"}
                :target {:type "cybox:Network_Connection"
                         :specifiers "10.10.1.0"}
                :actuator {:type "network"
                           :specifiers ["router"]}
                :modifiers {:method ["acl"]
                            :location "perimeter"}}})

(def coa-openc2-variant2
  {:id "http://ex.tld/ctia/coa/coa-cb117f67-4d17-4d6c-a220-16e04f9b712a"
   :type "coa"
   :schema_version c/ctim-schema-version
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :structured_coa_type "openc2"
   :open_c2_coa{:type "structured_coa"
                :action {:type "contain"}
                :target {:type "cybox:Network_Connection"
                         :specifiers "10.10.1.0"}
                :actuator {:type "network"
                           :specifiers ["router"]}
                :modifiers {:method ["segmentation"]
                            :location "internal"
                            :option "vlan=1002"}}})

(def coa-sans-playbook
  {:id "http://ex.tld/ctia/coa/coa-599c96cb-9e88-4d19-a3ee-a94802a40772"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "SANS PICERL incident process"
   :description " SANS PICERL incident process as a best practice describes incident response into six major phases of the incident response processes that are `preparation`, `identification`, `containment`, `eradication`, `recovery`, and `lessons learned`.
 This process is used to build effective incident response plans, processes and procedures. 
 Preparation and Lessons Learned has be removed from this playbook for initial implementation.  Future implemenations will be fully customizable.
 - Preparation defines the tasks that should be done prior to instituting a response process and should not be imported into response tools that support ingestion.
 - Lessons Learned is directly related Preparation as the activites that are the output of lessons learned should be implemented into the preventive and protection strategies.
 This particular response template aligns to the NIST 800-61r2 model (preparation, detection and analysis, containment, eradication, recovery, and post-incident) format produced by SANS Cybersecurity Training Organization."
   :short_description "Organizations should use this playbook as a template to assist in the defination of the procedure and outline the processes for their security operations teams."
   :tlp "white"
   :source "SANS Incident Handlers Notebook"
   :source_uri "https://www.sans.org/reading-room/whitepapers/incident/incident-handlers-handbook-33901"
   :coa_type "Playbook"
   :impact "Provides unified and consistent incident response processes and procedures"
   :cost "Low"
   :efficacy "Low"
   :objective ["Standardize response processes and producures into a integrated toolset and facilitates improvements in mature and consistency"]
   :related_COAs []})

(def coa-phase-identification
  {:id "http://ex.tld/ctia/coa/coa-6cdd56ba-5ffd-46a9-9dde-d25ce755c100"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Incident Identification"
   :description "Events are occurances of a systems or systems. Incidents are declared violations and incidents can occur in countless ways. 
Identification phase is about identifying an event as an incident and properly categorizing and prioritizing incident notification and documentation. 
It is infeasible to develop step-by-step instructions for handling every incident. 
This generic identification process is a template to ensure the right process is being followed."
   :short_description "This phase provides a standardized analysis process as a template to ensure the right process is being followed."
   :tlp "white"
   :source "NIST Special Publication 800-61r2  3.2 Detection and Analysis"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Identification"
   :coa_type "Phase"
   :impact "Ensures the reduction of false positive detections and validates true positive incidents"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Standardize investigation and incident identification processes"]
   :related_COAs []})

(def coa-phase-identification-task-review
  {:id "http://ex.tld/ctia/coa/coa-92ba5c50-717d-44e7-bb88-72bf6907ec83"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Review incident"
   :description "|
 - Review precursor and indicator data in Investigate and try to prove the data observed is normal activity. 
 - Knowledge of false positives detractors will support this assessment.  
 
 The objective of this step is to remove confirmation bias, validate the detection as a true positive and anomalous behavior. 
 Incident handlers are responsible for analyzing ambiguous, contradictory, and incomplete symptoms to determine what has happened.  
 Record your evidence of what has happened that provide this investigation should continue or be rejected as a false positive."
   :short_description "Add note that records the evidence (indicators and reasoning) to support the decision of status Rejected, Open or Incident Reported."
   :tlp "white"
   :source "NIST 800-61r2 3.2.2 Signs of an Incident"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :coa_type "Task"
   :impact "Determine if the detection is a false positive or confirmed event based on existing data"
   :cost "Low"
   :efficacy "Medium"
   :objective ["To remove bias and support investigation based on indicators that validates compromise or violation for continued investigation"]})

(def coa-phase-identification-task-analyze-indicators
  {:id "http://ex.tld/ctia/coa/coa-9e2d3e51-2e8f-4d49-8206-fb3e5fbf6620"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Analyze indicators"
   :description "|
- Review and validate observables reputation, detonation, intelligence, judgements and determine if indicators presented represent malicious activity or improper usage. 
  - Update any miscategorized observables judgements with appropriate judgement of Malicious, Suspicious or Unknown and comment on the reasoning for why the judgement was made.
  - Add a note that details what observables or indicators were updated as part of the review of the incident and indicators.
  
  Analyst should be reviewing the investigation page and validating the detection with the investigation details. 
  Do the observable(s) reputation match up with the event findings?"
   :short_description "Create judgement(s) a necessary and add a note confirming any changes to observable judgements for malicious or suspicious reputations"
   :tlp "white"
   :source "NIST 800-61r2 3.2.3 Sources of Precursors and Indicators"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :coa_type "Task"
   :impact "Adds judgements to private intelligence for future blocking and monitoring processes"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Review reputation, intelligence, judgements and other data on observables to determine if existing data aligns to indicators found"]})

(def coa-phase-identification-task-confirm-incident
  {:id "http://ex.tld/ctia/coa/coa-994298f0-75fc-4c14-b044-9b81944d3a03"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Confirm incident"
   :description "|
Upon analysis, change the incident status to match one of the following definitions:
  - OPEN is if the incident is suspicious, escalated or require additional investigation or data for disposition.
  - REJECTED is if false positive and an AUTHORIZED exception.
  - INCIDENT REPORTED is if confirmed malicious, improper usage or unauthorized activity has occured that violates company policy.
  - STALLED is if data requested or investigation cannot continue due to missing data or lack of clarity
  
  On confirmation of an incident, if your company policy allows quarantining a machine, you should quarantine a machine for malicious activity. 
  Improper or unauthorized activity should be reviewed by management to determine if quarantine is warranted."
   :short_description "Determine the incident status is either Open, Rejected, Incident Reported"
   :tlp "white"
   :source "NIST 800-61r2 3.2.4, 3.2.5 Incident Analysis"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :coa_type "Task"
   :impact "Determines the disposition/status of the incident"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Ensures the validation of the event as an incident prior to automation actions"]})

(def coa-phase-identification-task-document-and-notify
  {:id "http://ex.tld/ctia/coa/coa-3890e0b3-bb46-4b9b-8134-184dbe644a8a"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Document and notify"
   :description "|
Gather any missing information below and add 
 - Incident Title and url link
  - Summary of findings from Review Incident task note
 - Name of targets affected with Devices meta data
 - Affected Customer data if known.
 - Collect the notes from the 4 previous tasks and create a ticket specify the following fields as initial information.

  At this point, incident responder should acquire, preserve, secure, and document all evidence related to the incident. This process will be continual through the IR process. 
  The incident responder should perform notification pursuant to the organizational incident response policy and outlined procedures.
  The reasons for reordering of the documentation of the incident was to align documentation and incident notification into the same process flow.
  - The current status of the incident (new, open, stalled, rejected, incident reported, containment achieved, restoration achieved, closed)
  - A summary of the incident which is produced in Review Incident task note.
  - Indicators related to the incident (Analyze Indicators Task note).
  - Other incidents related to this incident (linked incidents)
  - Actions taken by all incident handlers on this incident (copy of Actions Taken)
  - Chain of custody, if applicable 
  - Impact assessments related to the incident (Prioritize Incident Task Note)
  - Contact information for other involved parties (e.g., system owners, system administrators)
  - List of evidence gathered during the incident investigation
  - Comments from incident handlers
  - Next steps to be taken (e.g., rebuild the host, upgrade an application)."
   :short_description "Create an incident ticket with the appropriate parameters and contextual incident information"
   :tlp "white"
   :source "NIST 800-61r2 3.2.5 Document Incident & 3.2.7 Incident Notification"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :coa_type "Task"
   :impact "Determines the impact of the overall incident with the relevant data known"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Determine if this incident requires escalation or it can be handled locally"]})

(def coa-phase-containment
  {:id "http://ex.tld/ctia/coa/coa-5d790fae-8ba6-4fc9-b288-78b67ef8370c"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Incident Containment"
   :description "The containment phase is for the acquiring, preserving, securing, and documenting of evidence that leads to the appropriate containment or mititgation of the incident. This phase will identify additional hosts and known vulnerabilities and implememt monitoring of the containment."
   :short_description "The containment phase is for the acquiring, preserving, securing, and documenting of evidence that leads to the appropriate containment or mititgation of the incident."
   :tlp "white"
   :source "NIST Special Publication 800-61r2  3.3 Containment, Eradication, and Recovery"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Containment"
   :coa_type "Phase"
   :impact "Ensures consistency and the proper containment of all known affected systems"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Standardize incident containment and validation processes"]
   :related_COAs []})

(def coa-phase-containment-task-identify-affected-hosts
  {:id "http://ex.tld/ctia/coa/coa-3d481dd1-4f30-4262-a846-78af6bdce11c"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Identify affected hosts"
   :description "|
  - Run Orbital query looking for all systems with the malicious indicators.
  - Link the investigations of hosts found with maliciious indicators.
  - Add note with summary of findings for Orbital search and hosts affected.
  - Quarantine hosts with local system containment from endpoint detection and response.

  Incident responders will find the all the hosts that are affected by indicators within the incident. 
  Malware sandboxing can provide some additional analysis about the characteristics of the infection.  
  Best practice is to have a Malware Engineer to reverse the files found to ensure all possible indicators have been found.
  Use indictors developed from the detection and analysis to find additional hosts or potentially infected hosts.  
  
  If found perform additional analysis to determine root cause analysis and any additional indictors. 
  If this is mass infection event (e.g. greater than 25 systems affected), immediate containment must be delayed until full understanding of the infection is achieved.
  - For Host infections, use persistence mechanism, dropped filenames, paths, hashs, accessed or collected files, links, network communications, network ports and protocols, netwrok flow data points, etc
  - For phishing infections, use email addresses, domains, urls, file hashes, x-origin-ip address, subject, etc
  - For Command and Control, use host communication, ports and protocols, application, url patterns, dns queries, ping data, etc
  - Escalate to an incident management team, if a massive incident to support incident response.
  - Ensure all known event information and root cause of the event is known before proceeding with containment"
   :short_description "Runs a osquery, adds a note, links investigations that find malicious indicators for affected hosts and quarantine affected hosts."
   :tlp "white"
   :source "NIST 800-61r2 3.3.1 Choosing a Containment Strategy & 3.3.2 Evidence Gathering and Handling"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Containment"
   :coa_type "Task"
   :impact "Ensure the proper scope impact and provide immediate containment of affected hosts"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Use Orbital to identify any additonal affected systems with the indicators found in the identification task and quarantine affected hosts."]
   :external_references
   [{:source_name "workflow"
     :external_id "D001-SecureEndpoint-HostIsolationWithApproval__definition_workflow_01R2NJMBE8TMJ0BBC1MvXonQ9sNA8qdIVlx"
     :description "This workflow requests approval to isolate an endpoint using Cisco Secure Endpoint host isolation. If approved, isolation is enabled using the Cisco Threat Response host isolation response action. Supported observable: amp_computer_guid\n\nTarget Group: Default TargetGroup\n\nTargets: CTR_API, CTR_For_Access_Token, SMTP Endpoint (optional)\n\nSteps:\n[] Make sure the observable is supported\n[] Generate an access token for Threat Response\n[] Fetch available response actions\n[] Check that Secure Endpoint actions are available (if not, end the workflow)\n[] Extract the module instance ID for Secure Endpoint\n[] Create the approval request and wait...\n[] (Optional) Send an email notification (requires an SMTP Endpoint target)\n[] If the request is approved, trigger the response action to isolate the endpoint\n\nMore information: https://ciscosecurity.github.io/sxo-05-security-workflows/workflows/oob-01"}]
   :structured_coa_type "openc2"
   :open_c2_coa {:type "structured_coa"
                 :id "openc2_coa_1"
                 :action {:type "deny"}
                 :target {:type "device"}
                 :actuator {:type "network"}}})

(def coa-phase-containment-task-contain-incident
  {:id "http://ex.tld/ctia/coa/5d790fae-8ba6-4fc9-b288-78b67ef8370c"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Contain incident"
   :description "|
 - Determine the appropriate containment technique either with soft block (localized blocking of a specific indictors) or hard block (regionalized blocking, quarantine whole hosts, net blocks, etc) techniques
  - Determine if the contianment is working and stopping additional infections or activity. This phase is not complete if containment is not working.
  
  Incident responders use the atomic indicators found in the investigation to block and contain malicious activity. 
  By using host and network protection tools to block, pause, drop, or quarantine affected machines to apply the preventative protection from additional infections. 
  Incident responders want to be able to move up to the highest level of indicator possible (e.g. using the pyramid of pain is a good example)."
   :short_description "Contain indicators of compromise to stop the spread of malicious activity"
   :tlp "white"
   :source "NIST 800-61r2 3.3.1 Choosing a Containment Strategy"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Containment"
   :coa_type "Task"
   :impact "Blocks all indicators of compromise at external to endpoint (e.g. IPs, Domains, URLs, Process, Filehash)"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Blocks and halts all indicators of compromise and ensures to stop the attack progression."]
   :external_references
   [{:source_name "workflow"
     :external_id "workflow_unique_name"
     :description "This workflow blocks presented indicators with the configured integrations/targets presented"}]})

(def coa-phase-containment-task-contain-incident-ips
  {:id "http://ex.tld/ctia/coa/5d790fae-8ba6-4fc9-b288-78b67ef8370c"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Contain incident IPs"
   :description "|
 - Determine the appropriate containment technique either with soft block (localized blocking of a specific indictors) or hard block (regionalized blocking, quarantine whole hosts, net blocks, etc) techniques
  - Determine if the contianment is working and stopping additional infections or activity. This phase is not complete if containment is not working.
  
  Incident responders use the atomic indicators found in the investigation to block and contain malicious activity. 
  By using host and network protection tools to block, pause, drop, or quarantine affected machines to apply the preventative protection from additional infections. 
  Incident responders want to be able to move up to the highest level of indicator possible (e.g. using the pyramid of pain is a good example)."
   :short_description "Contain indicators of compromise to stop the spread of malicious activity"
   :tlp "white"
   :source "NIST 800-61r2 3.3.1 Choosing a Containment Strategy"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Containment"
   :coa_type "Task"
   :impact "Blocks all IPs of the incident"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Blocks and halts all indicators of compromise involving IPs and ensures to stop the attack progression."]
   :external_references
   [{:source_name "workflow"
     :external_id "workflow_unique_name"
     :description "This workflow blocks presented indicators with the configured integrations/targets presented"}]
   :structured_coa_type "openc2"
   :open_c2_coa {:type "structured_coa"
                 :id "openc2_coa_1"
                 :action {:type "deny"}
                 :target {:type "ip"}
                 :actuator {:type "network"}}})

(def coa-phase-containment-task-contain-incident-domains
  {:id "http://ex.tld/ctia/coa/5d790fae-8ba6-4fc9-b288-78b67ef8370c"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Contain incident Domains"
   :description "|
 - Determine the appropriate containment technique either with soft block (localized blocking of a specific indictors) or hard block (regionalized blocking, quarantine whole hosts, net blocks, etc) techniques
  - Determine if the contianment is working and stopping additional infections or activity. This phase is not complete if containment is not working.
  
  Incident responders use the atomic indicators found in the investigation to block and contain malicious activity. 
  By using host and network protection tools to block, pause, drop, or quarantine affected machines to apply the preventative protection from additional infections. 
  Incident responders want to be able to move up to the highest level of indicator possible (e.g. using the pyramid of pain is a good example)."
   :short_description "Contain indicators of compromise to stop the spread of malicious activity"
   :tlp "white"
   :source "NIST 800-61r2 3.3.1 Choosing a Containment Strategy"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Containment"
   :coa_type "Task"
   :impact "Blocks Domains of the incident"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Blocks and halts indicators of compromise involving domains and ensures to stop the attack progression."]
   :external_references
   [{:source_name "workflow"
     :external_id "workflow_unique_name"
     :description "This workflow blocks presented indicators with the configured integrations/targets presented"}]
   :structured_coa_type "openc2"
   :open_c2_coa {:type "structured_coa"
                 :id "openc2_coa_1"
                 :action {:type "deny"}
                 :target {:type "domain"}
                 :actuator {:type "network"}}})

(def coa-phase-containment-task-contain-incident-urls
  {:id "http://ex.tld/ctia/coa/5d790fae-8ba6-4fc9-b288-78b67ef8370c"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Contain incident URLs"
   :description "|
 - Determine the appropriate containment technique either with soft block (localized blocking of a specific indictors) or hard block (regionalized blocking, quarantine whole hosts, net blocks, etc) techniques
  - Determine if the contianment is working and stopping additional infections or activity. This phase is not complete if containment is not working.
  
  Incident responders use the atomic indicators found in the investigation to block and contain malicious activity. 
  By using host and network protection tools to block, pause, drop, or quarantine affected machines to apply the preventative protection from additional infections. 
  Incident responders want to be able to move up to the highest level of indicator possible (e.g. using the pyramid of pain is a good example)."
   :short_description "Contain indicators of compromise to stop the spread of malicious activity"
   :tlp "white"
   :source "NIST 800-61r2 3.3.1 Choosing a Containment Strategy"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Containment"
   :coa_type "Task"
   :impact "Blocks URLs of the incident"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Blocks and halts indicators of compromise involving URLs and ensures to stop the attack progression."]
   :external_references
   [{:source_name "workflow"
     :external_id "workflow_unique_name"
     :description "This workflow blocks presented indicators with the configured integrations/targets presented"}]
   :structured_coa_type "openc2"
   :open_c2_coa {:type "structured_coa"
                 :id "openc2_coa_1"
                 :action {:type "deny"}
                 :target {:type "url"}
                 :actuator {:type "network"}}})

(def coa-phase-containment-task-contain-incident-file-hashes
  {:id "http://ex.tld/ctia/coa/5d790fae-8ba6-4fc9-b288-78b67ef8370c"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Contain incident File Hashes"
   :description "|
 - Determine the appropriate containment technique either with soft block (localized blocking of a specific indictors) or hard block (regionalized blocking, quarantine whole hosts, net blocks, etc) techniques
  - Determine if the contianment is working and stopping additional infections or activity. This phase is not complete if containment is not working.
  
  Incident responders use the atomic indicators found in the investigation to block and contain malicious activity. 
  By using host and network protection tools to block, pause, drop, or quarantine affected machines to apply the preventative protection from additional infections. 
  Incident responders want to be able to move up to the highest level of indicator possible (e.g. using the pyramid of pain is a good example)."
   :short_description "Contain indicators of compromise to stop the spread of malicious activity"
   :tlp "white"
   :source "NIST 800-61r2 3.3.1 Choosing a Containment Strategy"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Containment"
   :coa_type "Task"
   :impact "Blocks File Hashes of the incident"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Blocks and halts indicators of compromise involving File Hashes and ensures to stop the attack progression."]
   :external_references
   [{:source_name "workflow"
     :external_id "workflow_unique_name"
     :description "This workflow blocks presented indicators with the configured integrations/targets presented"}]
   :structured_coa_type "openc2"
   :open_c2_coa {:type "structured_coa"
                 :id "openc2_coa_1"
                 :action {:type "deny"}
                 :target {:type "sha256"}
                 :actuator {:type "network"}}})

(def coa-phase-containment-task-contain-incident-assets
  {:id "http://ex.tld/ctia/coa/5d790fae-8ba6-4fc9-b288-78b67ef8370c"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Contain incident Assets"
   :description "|
 - Determine the appropriate containment technique either with soft block (localized blocking of a specific indictors) or hard block (regionalized blocking, quarantine whole hosts, net blocks, etc) techniques
  - Determine if the contianment is working and stopping additional infections or activity. This phase is not complete if containment is not working.
  
  Incident responders use the atomic indicators found in the investigation to block and contain malicious activity. 
  By using host and network protection tools to block, pause, drop, or quarantine affected machines to apply the preventative protection from additional infections. 
  Incident responders want to be able to move up to the highest level of indicator possible (e.g. using the pyramid of pain is a good example)."
   :short_description "Contain identified assets of the incident"
   :tlp "white"
   :source "NIST 800-61r2 3.3.1 Choosing a Containment Strategy"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Containment"
   :coa_type "Task"
   :impact "Quarantines assets of the incident"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Quarantines assets of the incident"]
   :external_references
   [{:source_name "workflow"
     :external_id "workflow_unique_name"
     :description "This workflow blocks presented assets with the configured integrations/targets presented"}]
   :structured_coa_type "openc2"
   :open_c2_coa {:type "structured_coa"
                 :id "openc2_coa_1"
                 :action {:type "deny"}
                 :target {:type "device"}
                 :actuator {:type "network"}}})

(def coa-phase-containment-task-implement-additional-monitoring
  {:id "http://ex.tld/ctia/coa/edb7867c-2e81-4356-a422-92781f4fa34c"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Implement additional monitoring"
   :description "|
 - Determine necessary policy changes and monitoring to ensure that you can detect any malicious activity related to the incident.
 - Add a note with the recommendation and follow on actions to ensure additional monitoring is in place. 

 Incident responders monitor infections to ensure that containment techniques are successful.
 If possible, use a Malware engineer to reverse the malware thru static and dynamic means to determine any zero day vulnerabilities. 
 If malware persistence is still available the adversary could change the payload and then you would have new infections.
 Sometimes, it is appropriate to conduct a change freeze for ~24 hours to see if the adversary still has access to your systems.
 
 Implement additional monitoring that reviews not only host/network containment or eradication success. Monitor network blocks for additional hosts that might not have been identified. Reassess containment and eradication as needed depending on any new information. If this is a mass infection, it's advised that a 24 hour no change process be implemented.
 - Create additional monitoring for network and host detection for abnormal activity to ensure containment is effective.
 - Re-investigate new hosts found but not on the containment list
 Are the affected system numbers stopping (containment) or down now (eradication)?
 Sometimes containment and eradication techniques are accomplished in the same task. 
 These two processes (containment & eradication) should still be determined, as new infections are getting removed eventually"
   :short_description "Implement additional monitoring that reviews not only host/network containment or eradication success."
   :tlp "white"
   :source "NIST 800-61r2 3.2.4 Incident Analysis"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Containment"
   :coa_type "Task"
   :impact "Ensure new events are detected and remediated as quick as possible"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Informs the team if the containment mechanisms are not working as expected."]})

(def coa-phase-containment-task-identify-vulnerabilities
  {:id "http://ex.tld/ctia/coa/f28177ae-78de-43c9-8692-e972e8a0aa62"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Identify vulnerabilities"
   :description "|
 - Scan host(s) for vulnerabilities. 
 - Add a note on the recommended patches and service request information if submitted for immediate patching.

 Ensure any recovery work includes patching to the appropriate security level for the system according to company policy.
 If possible, use a Malware engineer to reverse the malware thru static and dynamic means to determine any zero day vulnerabilities.
  1. Scan host(s) with infection and determine any vulnerabilities that can remediate infection. (e.g. finding a SMB MS17-010 - Windows SMB Remote Code Execution Vulnerability)
  2. Identify any common vulnerabilities among the hosts infected
  3. Reverse engineer malware for any zero day vulnerabilities."
   :short_description "Scan host(s) for vulnerabilities and add a note on the recommended patches to be applied and service request to have them installed, if submitted."
   :tlp "white"
   :source "NIST 800-61r2 3.3.3 Identifying the Attacking Hosts"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Containment"
   :coa_type "Task"
   :impact "Patching systems may impact some applications and platform usability."
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Identify any vulnerabilites associated with the infection if possible, otherwise patch to current security patch levels."]
   :external_references
   [{:source_name "workflow"
     :external_id "workflow1_unique_name"
     :description "This workflow either creates new or updates an existing ticket associated to this event."}]})


(def coa-phase-eradication
  {:id "http://ex.tld/ctia/coa/coa-d3b80e0e-4e85-4259-a13c-69ef20987e1c"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Incident Eradication"
   :description "The eradication phase is focused on removing any further exposure from vulnerabiliies, malware or activities that produced the incident."
   :short_description "The eradication phase is focused on removing any further exposure from vulnerabiliies, malware or activities that produced the incident."
   :tlp "white"
   :source "NIST Special Publication 800-61r2 3.3 Containment, Eradication, and Recovery"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Eradication"
   :coa_type "Phase"
   :impact "Ensure consistency in the removal of malware or malicious activities"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Standardize incident eradication and validation processes"]
   :related_COAs []})

(def coa-phase-eradication-task-mitigate-vulnerabilities
  {:id "http://ex.tld/ctia/coa/70362de1-bfef-4a0f-893f-3e0d605ed9b7"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Mitigate or remediate vulnerabilities"
   :description "|
 - Add a note on what vulnerabilities that are related to the incident
 - Add activities to support the mitigations or actions that support remediation of the vulnerabilites to innoculate all systems regardless of infection. (sometimes this is as easy as creating a IT service ticket)
  
 Incident Responders are responsible determining root cause of the incident, but they also review the vulnerabilities and prioritize their mitigation/remediation to prevent further infection elsewhere.
 Mitigations are controls that block and lower the risk, but don't remove the vulnerability and still could be exploited.
 Mitigations can be applied by an intrusion prevention system (IPS) or endpoint detection and response system (EDR).
 Remediation is patching and removing and eliminates the risk from the known vulnerability from being exploited.
 Remediation are controls that remove or eliminate the vulnerability. This normally accomplished by applying a patch to the system via an IT Systems management tools or security patch update process.
 SMB MS17-010 - Windows SMB Remote Code Execution Vulnerability is an example of critical vulnerability that must be patched and is related to EternalBlue expoitation packages.
 
 Additional considerations are below 
 - Apply remediations (e.g. patches) to infected and not infected hosts that pertain to the vulnerability found being used by the incident (remove the risk). 
 Identify and fix any systems not accepting or validating the patch (e.g. needing reboots) as soon as possible.
 - This may require scheduling due to business needs. In a mass incident, emergency change requests can be used to support patching.
 In single instance events, the risk to outage vs the risk to mitigate may be acceptable. If acceptable, then move remediations to lessons learned processing before closing out the request.  
 Put in place, mitigations for at least detections and if possible protection rules to minimize impact while remediation is being scheduled.
 - Apply mitigations such as IPS and host based firewall rules to mitigate (reduce the risk) of the vulnerability being exploited for at least detection to notify when occurring and if containment and eradication has failed.
 - Monitor detections to ensure containment is working and determine when eradication is beginning to be effective."
   :short_description "Add a note on what are the affecting vulnerabilites linked to the incident and how mitigations or remediatiion is going to be done."
   :tlp "white"
   :source "NIST 800-61r2 3.3.4 Eradication and Recovery"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Eradication"
   :coa_type "Task"
   :impact "Mititgate or Remediate vulnerabilities that are related to the incident and may require a system reboot to resolve."
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Identify and prioritize vulnerabitlies that are related to the incident and innoculate all systems regardless of infection."]})

(def coa-phase-eradication-task-remove-malicious-content
  {:id "http://ex.tld/ctia/coa/26cd22c6-4b67-4dc5-b8d1-f5ef9b5d8226"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Remove malicious content"
   :description "|
 - Remove malicious content. There are multiple ways to accomplish this within the organization either by an endpoint detection and response tool or by re-imaging.
 This task can be skipped if the system(s) are being reimaged and restored. 
 
 Surgical removal of malware may reduce re-infection as some malware tools like ransomware, root kits, remote access trojans (RAT) and some polymorphic malware are usually beyond simple removal. 
 Work with your Endpoint Detection and response tool vendor for the best solution based on thier intelligence and capabilities.
 
 Depending on the maturity and size of the incident, this can be as simple as re-imaging a single system to full remediation via a deployable package from your antivirus vendor or removal of offending file via your enterprise detection and response (EDR) tool. 
 Network attacks external to your environment will need to be managed with the support of your ISP. 
 Internal attacks should be segmented for containment and then removing offending systems or malicious content from those offending systems.
 - Determine the correct approach based on maturity and size of the incident. Events larger than 25 systems its recommended to use your EPP or EDR vendor tool set to remove malware.
 - Employ eradication and monitor the process to ensure the system does not get re-infected. Reinfection is an indication that your containment measures are inadequate to stop the incident.
 - Apply any new gold image with up to date patches on re-imaged systems."
   :short_description "Add a note on the action achieved to ensure the removal of the malware."
   :tlp "white"
   :source "NIST 800-61r2 3.3.4 Eradication and Recovery"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Eradication"
   :coa_type "Task"
   :impact "Removes the presence of malware on the endpoint or device and can affect existing system functionality"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Remove the malware from the system to ensure it cannot be activated and prepare the system for recovery and operational activity."]})

(def coa-phase-eradication-task-validate-hosts-eradicated
  {:id "http://ex.tld/ctia/coa/b678705c-12a6-428b-a631-ed579332bc99"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Validate hosts eradicated"
   :description "|
  Add a note to confirm and acknowledge eradication steps are working as expected and number of infected host(s) is dropping.  
  This task can be skipped if the system(s) are being reimaged and restored.
  
  The balidation below will allow the incident responder to move to recovery phase. 
  1. If single instance, validate the reimage process was completed by validating new image creation date.
  - win - 'systeminfo | find Original'
  - linux - 'ls -ld /var/log/installer'
  - macOS - /var/log/install.log.# (oldest))
  2. If this host has been reinfected more than once, conduct a formal forensic review to ensure all malicious content has been removed.
  3. If mass incident follows steps 2-5, determine if the number of infected host is reducing
  4. Determine if the number of (re)infected host is increasing
  5. If the eradication process isn't reducing the number of infected hosts, eradication is missing an persistence mechanism or containment has failed
  6. If the eradication process shows new hosts are being infected, your containment process is failing and/or the incident has mutated. (e.g. polymorphic malware with a active vulnerability or actor changed tactics and is now using ping for command and control and uploaded new malware). If this occurs return to Detection and Analysis Phase and continue forensic analysis."
   :short_description "Confirm and acknowledge eradication steps are working as expected and number of infected host(s) is dropping."
   :tlp "white"
   :source "NIST 800-61r2 3.3.4 Eradication and Recovery"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Eradication"
   :coa_type "Task"
   :impact "Validates the hosts are no longer affected by the malware and may require a reboot to achieve this."
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Validate that the infected system isn't exhibing signs of the infection and can be returned to normal activities."]})

(def coa-phase-recovery
  {:id "http://ex.tld/ctia/coa/coa-cae4dcdb-f81b-45ec-b0d6-a00cec468e9a"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Incident Recovery"
   :description "The recovery phase is the restoration of normal operations for system(s) and customers affected by the incident."
   :short_description "The recovery phase is the restoration of normal operations for system(s) and customers affected by the incident."
   :tlp "white"
   :source "NIST Special Publication 800-61r2 3.3 Containment, Eradication, and Recovery"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Recovery"
   :coa_type "Phase"
   :impact "Ensure only properly recovered systems are returned to normal operations"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Standardize incident recovery and validation processes"]
   :related_COAs []})

(def coa-phase-recovery-task-restore-systems
  {:id "http://ex.tld/ctia/coa/bb515cf6-40b5-4005-af04-6f63439df7b4"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Restore systems"
   :description "|
 - Use the workflow to create a ticket with your integration or manually add a note on the systems requested for re-image.
 
 Conduct a backup of the system if not already completed or if possible a forensic disk capture (follow chain of custody rules)
 Re-imaging should not restore customer files not placed in a shared server location.  Individual files can restored when there is time to go thru them.
 The goal here is to get the customer up and operational and not optimal operations.  This is a balancing act to do correctly.
 
 Depending on the sized of the incident, reimaging systems maybe a viable eradication and recovery process combined.
 Once restored to gold image (standardized corporate image) with immediate patching and updating of all known vulnerabilities.
 Create a service request for the Help Desk to re-image the host.
 Server or network equipment should be baselined and restored by the owning team.
 - Create a request for re-imaging system for eradication and recovery. Re-imaging will not be possible in a mass incident.
 - For mass incidents, provide immediate patching and reporting of non-compliant patching or antivirus removal tools. 
 Thorough forensic and reverse malware engineering will provide the necessary details to minimize complete recovery processes.
 - Do not restore localized customer files (/home/user, or /User/<username>), but only on a case by case basis and thorough review of the files being restored.
 - If the eradication process isn't reducing the number of infected hosts, eradication is missing a persistence mechanism and containment has failed. 
 Escalate to a third-party Incident Response firm and report this to your Endpoint Detection and Response vendor to support looking for missing components."
   :short_description "Add a note or create a IT Help Desk ticket created to reimaging systems as needed."
   :tlp "white"
   :source "NIST 800-61r2 3.3.4 Eradication and Recovery"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Recovery"
   :coa_type "Task"
   :impact "Removes the presence of malware on the endpoint or device and will likely be an outage for the user"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Begins the proces of restoring the system back to operational capacity"]
   :external_references
   [{:source_name "workflow"
     :external_id "workflow_unique_name"
     :description "This workflow either creates new or updates an existing ticket associated to this event."}]})

(def coa-phase-eradication-task-validate-restored-hosts
  {:id "http://ex.tld/ctia/coa/8218bcf6-739b-4f76-8952-eb133480ad8d"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Validate restored hosts"
   :description "|
 Validate each reimaged system was completed by validating new image creation date. ** win: systeminfo | find Original ** linux: ls -ld /var/log/installer ** macOS: /var/log/install.log.# (oldest date of entry). If more surgical, antivirus package or enterprise detection and response removal process has successfully completed and system is showing no signs of indicators of the incident.
  1. If single instance, validate the reimage process was completed by validating new image creation date
    a. win - 'systeminfo | find Original''
    b. linux - 'ls -ld /var/log/installer'
    c. macOS - /var/log/install.log.# (oldest))
  2. Review existing monitoring to ensure host is working as expected and within normal parameters"
   :short_description "Validate each reimaged system was completed by validating new image creation date"
   :tlp "white"
   :source "NIST 800-61r2 3.3.4 Eradication and Recovery"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Eradication"
   :coa_type "Task"
   :impact "Ensure that systems have been properly reimaged without reintroducing malware"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Restore the customers back to operational capacity"]})

(def coa-phase-eradication-task-implement-recovery-monitoring
  {:id "http://ex.tld/ctia/coa/ecf89e9b-106a-46d1-b236-a2716f71d7ae"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :language "english"
   :title "Implement recovery monitoring"
   :description "|
 - Add a note on how you are going to monitor newly recovered systems for additional monitoring for any anomalies or newly created incidents. 
 Any new infections should be reviewed to ensure malware persistence mechanisms weren't missed or malware was restored back to the system.
 
 Adding single host to a previously infected list for a specified period will allow the incident responder to quickly assess a re-infection or subsequent new infection. 
 - At this stage in recovery, you should be unquarantining devices and removing any host-based blocks, if necessary. 
 - Monitor restored systems for any new anomalies and ensure that operations have been returned to normal.
 - Begin to remove emergency blocks to permanent block and remediation alerts for infected systems returning the network (e.g. laptops that were unreachable during the incident)."
   :short_description "Add a note on how you are going to monitor newly recovered systems for additional monitoring for any anomalies or newly created incidents."
   :tlp "white"
   :source "NIST 800-61r2 3.3.4 Eradication and Recovery"
   :source_uri "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-61r2.pdf"
   :stage "Recovery"
   :coa_type "Task"
   :impact "Ensure new events are detected and remediated as quick as possible"
   :cost "Medium"
   :efficacy "Medium"
   :objective ["Creates an actionable true-positive detection that supports automated actions"]})


(def coa-maximal
  {:id "http://ex.tld/ctia/coa/coa-599c96cb-9e88-4d19-a3ee-a94802a39660"
   :type "coa"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["http://ex.tld/ctia/coa/coa-599c96cb-9e88-4d19-a3ee-a94802a39660"
                  "http://ex.tld/ctia/coa/coa-456"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
   :timestamp #inst "2016-10-01T00:00:00.000-00:00"
   :language "language"
   :title "coa"
   :description "description"
   :short_description "short description"
   :tlp "green"
   :source "source"
   :source_uri "http://example.com/"
   :valid_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                :end_time #inst "2525-01-01T00:00:00.000-00:00"}
   :stage "Remedy"
   :coa_type "Eradication"
   :impact "yoooge"
   :cost "High"
   :efficacy "Low"
   :objective ["foo" "bar"]
   :related_COAs [{:COA_id "http://example.com/ctia/coa/coa-599c96cb-9e88-4d19-a3ee-a94802a39660"
                   :confidence "Low"
                   :source "source"
                   :relationship "rel"}]
   :structured_coa_type "openc2"
   :open_c2_coa {:type "structured_coa"
                 :id "openc2_coa_1"
                 :action {:type "deny"}
                 :target {:type "cybox:Network_Connection"
                          :specifiers "10.10.1.0"}
                 :actuator {:type "network"
                            :specifiers ["router"]}
                 :modifiers {:method ["acl"]
                             :location "perimeter"
                             :option "vlan=1002"
                             :response "acknowledge"
                             :additional_properties {:context "context"}
                             :time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                                    :end_time #inst "2016-02-11T00:40:48.212-00:00"}
                             :frequency "frequency"
                             :duration #inst "2016-02-11T00:40:48.212-00:00"
                             :source "source"
                             :search "patch"
                             :id "modifier id"
                             :delay #inst "2016-02-11T00:40:48.212-00:00"
                             :destination "set-to"}}})

(def coa-minimal
  {:id "http://ex.tld/ctia/coa/coa-599c96cb-9e88-4d19-a3ee-a94802a39660"
   :type "coa"
   :schema_version c/ctim-schema-version
   :valid_time {}})

(def new-coa-maximal
  coa-maximal)

(def new-coa-minimal
  {:schema_version c/ctim-schema-version})
