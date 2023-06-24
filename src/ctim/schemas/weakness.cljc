(ns ctim.schemas.weakness
  (:require #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])
            [ctim.schemas.common :as c]
            [ctim.schemas.vocabularies :as v]))

(def type-identifier "weakness")

(def-eq WeaknessTypeIdentifier type-identifier
  :description "The fixed value \"weakness\"")

(def weakness-desc
  (str "A mistake or condition that, if left unaddressed, could under the "
       "proper conditions contribute to a cyber-enabled capability being "
       "vulnerable to attack, allowing an adversary to make items function in "
       "unintended ways."))

(def weakness-desc-link
  "[WeaknessType](https://cwe.mitre.org/documents/schema/#WeaknessType)")

(def-map-type ModeOfIntroduction
  (concat
   (f/required-entries
    (f/entry :phase v/SoftwarePhase
             :description (str "Identifies the point in the software life cycle "
                               "at which the weakness may be introduced.")))
   (f/optional-entries
    (f/entry :note c/Markdown
             :description (str "Provides a typical scenario related to "
                               "introduction during the given phase."))))
  :reference "[ModesOfIntroductionType](https://cwe.mitre.org/documents/schema/#ModesOfIntroductionType)")

(def applicable-platform-entries
  [(f/entry :prevalence v/Prevalence
            :description (str "Defines the different regularities that guide "
                              "the applicability of platforms.")
            :required? true)])

(def-map-type Language
  (concat
   applicable-platform-entries
   (f/optional-entries
    (f/entry :name c/ShortString
             :description "Language name (Clojure, Java, ...)")
    (f/entry :class v/LanguageClass
             :description "Class of language."))))

(def-map-type OperatingSystem
  (concat
   applicable-platform-entries
   (f/optional-entries
    (f/entry :name c/ShortString)
    (f/entry :version c/ShortString)
    (f/entry :cpe_id c/ShortString)
    (f/entry :class v/OperatingSystemClass))))

(def-map-type Architecture
  (concat
   applicable-platform-entries
   (f/optional-entries
    (f/entry :name c/ShortString
             :description "Architecture name (ARM, x86, ...)")
    (f/entry :class v/ArchitectureClass
             :description "Class of architecture"))))

(def-map-type Paradigm
  (concat
   applicable-platform-entries
   (f/optional-entries
    (f/entry :name c/ShortString
             :description "Paradigm name (Client Server, Mainframe)"))))

(def-map-type Technology
  (concat
   applicable-platform-entries
   (f/optional-entries
    (f/entry :name c/ShortString
             :description "Technology name (Web Server, Web Client)"))))

(def-map-type AlternateTerm
  (concat
   (f/required-entries
    (f/entry :term c/ShortString
             :description "The actual alternate term."))
   (f/optional-entries
    (f/entry :description c/Markdown
             :description (str "Provides context for the alternate term "
                               "by which this weakness may be known.")))))

(def-map-type Consequence
  (concat
   (f/required-entries
    (f/entry :scopes [v/ConsequenceScope]
             :description "Identifies the security property that is violated."))
   (f/optional-entries
    (f/entry :impacts [v/TechnicalImpact]
             :description (str "Describes the technical impact that arises if "
                               "an adversary succeeds in exploiting this weakness."))
    (f/entry :likelihood v/HighMedLow
             :description (str "How likely the specific consequence is expected "
                               "to be seen relative to the other consequences."))
    (f/entry :note c/Markdown
             :description "Additional commentary about a consequence.")))
  :reference "[CommonConsequencesType](https://cwe.mitre.org/documents/schema/#CommonConsequencesType)")

(def-map-type DetectionMethod
  (concat
   (f/required-entries
    (f/entry :method v/DetectionMethod
             :description (str "Identifies the particular detection method "
                               "being described."))
    (f/entry :description c/Markdown
             :description (str "Provides some context of how this method can "
                               "be applied to a specific weakness.")))
   (f/optional-entries
    (f/entry :effectiveness v/DetectionEffectiveness
             :description (str "How effective the detection method may be in "
                               "detecting the associated weakness."))
    (f/entry :effectiveness_notes c/Markdown
             :description (str "Provides additional discussion of the "
                               "strengths and shortcomings of this detection "
                               "method."))))
  :reference "[DetectionMethodsType](https://cwe.mitre.org/documents/schema/#DetectionMethodsType)")

(def-map-type Mitigation
  (concat
   (f/required-entries
    (f/entry :description c/Markdown
             :description (str "A description of this individual mitigation "
                               "including any strengths and shortcomings of "
                               "this mitigation for the weakness.")))
   (f/optional-entries
    (f/entry :phases [v/SoftwarePhase]
             :description (str "Indicates the development life cycle phase "
                               "during which this particular mitigation may "
                               "be applied."))
    (f/entry :strategy v/MitigationStrategy
             :description (str "A general strategy for protecting a system "
                               "to which this mitigation contributes."))
    (f/entry :effectiveness v/Effectiveness
             :description (str "Summarizes how effective the mitigation may be "
                               "in preventing the weakness."))
    (f/entry :effectiveness_notes c/Markdown)))
  :reference "[PotentialMitigationsType](https://cwe.mitre.org/documents/schema/#PotentialMitigationsType)")

(def-map-type Note
  (f/required-entries
   (f/entry :type v/NoteType)
   (f/entry :note c/Markdown)))

(def-entity-type Weakness
  {:description weakness-desc
   :reference weakness-desc-link}
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type WeaknessTypeIdentifier
            :description (str "The fixed value " type-identifier))
   (f/entry :description c/Markdown
            :description (str "Should be short and limited to the key points "
                              "that define this weakness.")))
  (f/optional-entries
   (f/entry :structure v/WeaknessStructure
            :description (str "Defines the structural nature of the weakness."))
   (f/entry :languages [Language]
            :description "Applicable Languages.")
   (f/entry :operating_systems [OperatingSystem]
            :description "Applicable operating systems.")
   (f/entry :architectures [Architecture]
            :description "Applicable architectures.")
   (f/entry :paradigms [Paradigm]
            :description "Applicable paradigms.")
   (f/entry :technologies [Technology]
            :description "Applicable technologies.")
   (f/entry :background_details c/Markdown
            :description (str "Information that is relevant but not related to "
                              "the nature of the weakness itself."))
   (f/entry :alternate_terms [AlternateTerm]
            :description (str "Indicates one or more other names used to "
                              "describe this weakness."))
   (f/entry :modes_of_introduction [ModeOfIntroduction]
            :description (str "Information about how and when a given weakness "
                              "may be introduced."))
   (f/entry :likelihood v/HighMedLow
            :description "Likelihood of exploit.")
   (f/entry :common_consequences [Consequence]
            :description (str "Refers to the typical or expected negative effects that can result from "
                              "exploiting the weakness. This could include anything from unauthorized access to "
                              "data, denial of service, system crashes or other things."))
   (f/entry :detection_methods [DetectionMethod]
            :description (str "Identifies methods that may be employed to detect "
                              "this weakness, including their strengths and "
                              "limitations."))
   (f/entry :potential_mitigations [Mitigation]
            :description (str "Describes potential mitigations associated with "
                              "a weakness."))
   (f/entry :functional_areas [v/FunctionalArea]
            :description (str "Identifies the functional area of the software "
                              "in which the weakness is most likely to occur."))
   (f/entry :affected_resources [v/SystemResource]
            :description (str "Identifies system resources that can be affected "
                              "by an exploit of this weakness."))
   (f/entry :notes [Note]
            :description (str "Provides any additional comments about the "
                              "weakness."))
   (f/entry :abstraction_level v/WeaknessAbstractionLevel
            :description (str "Refers to the level of abstraction or granularity used to describe the weakness. "
                              "It helps to categorize the vulnerability based on the level of detail provided."))))

;; Does not contain these fields from CWE
;; - Extended_Description
;; - Related_Weaknesses (Relationship)
;; - Weakness_Ordinalities
;; - Demonstrative_Examples
;; - Observed_Examples
;; - Taxonomy_Mappings
;; - Related_Attack_Patterns
;; - References (external_references)
;; - Content_History
;; - Name
;; - Status

(def-entity-type NewWeakness
  "For submitting a new weakness."
  (:entries Weakness)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type WeaknessTypeIdentifier)))

(def WeaknessRef
  (c/ref-for-type type-identifier))
