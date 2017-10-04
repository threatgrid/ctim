(ns ctim.schemas.tool
  (:require #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])
            [ctim.schemas.common :as c]
            [ctim.schemas.vocabularies :as v]))

(def type-identifier "tool")

(def-eq ToolTypeIdentifier type-identifier)

(def tool-desc
  (str "Tools are legitimate software that can be used by threat actors to "
       "perform attacks. Knowing how and when threat actors use such tools can "
       "be important for understanding how campaigns are executed. Unlike "
       "malware, these tools or software packages are often found on a system "
       "and have legitimate purposes for power users, system administrators, "
       "network administrators, or even normal users. Remote access tools "
       "(e.g., RDP) and network scanning tools (e.g., Nmap) are examples of "
       "Tools that may be used by a Threat Actor during an attack."))

(def tool-desc-link
  "[Tool](https://docs.google.com/document/d/1IvkLxg_tCnICsatu2lyxKmWmh1gY2h8HUNssKIE-UIA/pub#h.z4voa9ndw8v)")

(def mitre-custom-entries
  (f/optional-entries
   (f/entry :x_mitre_aliases [c/ShortString]
            :description "ATT&CK Software.aliases")))

(def-entity-type Tool
  {:description tool-desc
   :reference tool-desc-link}
  c/base-entity-entries
  mitre-custom-entries
  (f/required-entries
   (f/entry :type ToolTypeIdentifier)
   (f/entry :name c/ShortString
            :description "The name used to identify the Tool.")
   (f/entry :labels [v/ToolLabel]
            :description "The kind(s) of tool(s) being described."))
  (f/optional-entries
   (f/entry :description c/Markdown
            :description (str "A description that provides more details and "
                              "context about the Tool, potentially including "
                              "its purpose and its key characteristics."))
   (f/entry :kill_chain_phases [c/KillChainPhase]
            :description (str "The list of kill chain phases for which this "
                              "Tool can be used."))
   (f/entry :tool_version c/ShortString
            :description (str "The version identifier associated with the Tool."))))

(def-entity-type NewTool
  "For submitting a new Tool"
  (:entries Tool)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type ToolTypeIdentifier)))

(def-entity-type StoredTool
  "A Tool as stored in the data store"
  (:entries Tool)
  c/base-stored-entity-entries)
