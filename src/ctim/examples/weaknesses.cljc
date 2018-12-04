(ns ctim.examples.weaknesses
  (:require [ctim.schemas.common :as c]))

(def weakness-maximal
  {:id "http://ex.tld/ctia/weakness/weakness-6c5a8540-cec7-4647-abb6-84cd2d2fa544"
   :type "weakness"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["http://ex.tld/ctia/weakness/cisco-weakness-6c5a8540-cec7-4647-abb6-84cd2d2fa544"
                  "https://cwe.mitre.org/data/definitions/95.html"]
   :external_references
   [{:source_name "CWE"
     :external_id "CWE-95"
     :url "https://cwe.mitre.org/data/definitions/95.html"
     :description "Improper Neutralization of Directives in Dynamically Evaluated Code ('Eval Injection')"
     :hashes ["#Common_Consequences"]}]
   :timestamp #inst "2016-05-11T00:40:48.212-00:00"
   :language "language"
   :tlp "green"
   :source "source"
   :source_uri "http://example.com"
   :description "The software receives input from an upstream component, but it does not neutralize or incorrectly neutralizes code syntax before using the input in a dynamic evaluation call (e.g. \"eval\")."
   :short_description "Short description"
   :title "Improper Neutralization of Directives in Dynamically Evaluated Code ('Eval Injection')"
   :structure "Simple"
   :languages [{:name "JavaScript"
                :class "Interpreted"
                :prevalence "Undetermined"}]
   :operating_systems [{:name "Windows 9x"
                        :version "95"
                        :cpe_id "ID"
                        :class "Windows"
                        :prevalence "Undetermined"}]
   :architectures [{:name "x86"
                    :class "Workstation"
                    :prevalence "Undetermined"}]
   :paradigms [{:name "Mobile"
                :prevalence "Undetermined"}]
   :technologies [{:name "Web Server"
                   :prevalence "Undetermined"}]
   :background_details "Background details"
   :alternate_terms [{:term "term1"
                      :description "Description term1"}
                     {:term "term2"
                      :description "Description term2"}]
   :modes_of_introduction [{:phase "Architecture and Design"
                            :note "This weakness is prevalent in handler/dispatch procedures that might want to invoke a large number of functions, or set a large number of variables."}]
   :likelihood "Medium"
   :common_consequences [{:scopes ["Confidentiality"]
                          :impacts ["Read Files or Directories"
                                    "Read Application Data"]
                          :note "The injected code could access restricted data / files."
                          :likelihood "Medium"}]
   :detection_methods [{:method "Black Box"
                        :description "This specific weakness is impossible to detect using black box methods"
                        :effectiveness "High"
                        :effectiveness_notes "Without visibility into the code, black box methods may not be able to sufficiently distinguish this weakness from others"}]
   :potential_mitigations [{:phases ["Architecture and Design"
                                     "Implementation"]
                            :description "If possible, refactor your code so that it does not need to use eval() at all."
                            :strategy "Input Validation"
                            :effectiveness "High"
                            :effectiveness_notes "The effectiveness of this mitigation depends on the prevention capabilities"}]
   :functional_areas ["String Processing"]
   :affected_resources ["File or Directory"]
   :notes [{:type "Relationship"
            :note "This weakness is primary to all weaknesses related to injection (CWE-74) since the inherent nature of injection involves the violation of structured messages."}
           {:type "Terminology"
            :note "The usage of the 'encoding' and 'escaping' terms varies widely. For example, in some programming languages, the terms are used interchangeably, while other languages provide APIs that use both terms for different tasks. This overlapping usage extends to the Web, such as the 'escape' JavaScript function whose purpose is stated to be encoding. Of course, the concepts of encoding and escaping predate the Web by decades. Given such a context, it is difficult for
CWE to adopt a consistent vocabulary that will not be misinterpreted by some constituency."}]
   :abstraction_level "Base"})

(def weakness-minimal
  {:id "http://ex.tld/ctia/weakness/weakness-6c5a8540-cec7-4647-abb6-84cd2d2fa544"
   :type "weakness"
   :schema_version c/ctim-schema-version
   :description "The software receives input from an upstream component, but it does not neutralize or incorrectly neutralizes code syntax before using the input in a dynamic evaluation call (e.g. \"eval\")."})

(def new-weakness-maximal
  weakness-maximal)

(def new-weakness-minimal
  {:description "The software receives input from an upstream component, but it does not neutralize or incorrectly neutralizes code syntax before using the input in a dynamic evaluation call (e.g. \"eval\")."})
