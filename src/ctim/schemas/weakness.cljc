(ns ctim.schemas.weakness
  (:require #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type def-eq]])
            [ctim.schemas.common :as c]
            [ctim.schemas.vocabularies :as v]))

(def type-identifier "weakness")

(def-eq WeaknessTypeIdentifier type-identifier
  :description "The fixed value \"weakness\"")

(def weakness-desc
  (str "a mistake or condition that, if left unaddressed, could under the "
       "proper conditions contribute to a cyber-enabled capability being "
       "vulnerable to attack, allowing an adversary to make items function in "
       "unintended ways."))

(def weakness-desc-link
  "[WeaknessType](https://cwe.mitre.org/documents/schema/#WeaknessType)")

(def-map-type ModeOfIntroduction
  [(f/entry :phase v/SoftwarePhase
            :description (str "identifies the point in the software life cycle "
                              "at which the weakness may be introduced")
            :required? true)
   (f/entry :note c/MedString
            :description (str "provides a typical scenario related to "
                              "introduction during the given phase"))]
  :reference "[ModesOfIntroductionType](https://cwe.mitre.org/documents/schema/#ModesOfIntroductionType)")

(def applicable-platform-entries
  [(f/entry :prevalence v/Prevalence
            :description (str "defines the different regularities that guide "
                              "the applicability of platforms")
            :required? true)])

(def-map-type Language
  (concat
   applicable-platform-entries
   (f/optional-entries
    (f/entry :name c/ShortString
             :description "Language name (Clojure, Java, ...)")
    (f/entry :class v/LanguageClass
             :description "class of language"))))

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
             :description "architecture name (ARM, x86, ...)")
    (f/entry :class v/ArchitectureClass
             :description "class of architecture"))))

(def-map-type Paradigm
  (concat
   applicable-platform-entries
   (f/optional-entries
    (f/entry :name c/ShortString
             :description "paradigm name (Client Server, Mainframe)"))))

(def-map-type Technology
  (concat
   applicable-platform-entries
   (f/optional-entries
    (f/entry :name c/ShortString
             :description "technology name (Web Server, Web Client)"))))

(def-map-type Consequence
  (concat
   (f/required-entries
    (f/entry :scope v/ConsequenceScope
             :description "identifies the security property that is violated"))
   (f/optional-entries
    (f/entry :impact v/TechnicalImpact
             :description (str "describes the technical impact that arises if "
                               "an adversary succeeds in exploiting this weakness"))
    (f/entry :likelihood v/HighMedLow
             :description (str "how likely the specific consequence is expected "
                               "to be seen relative to the other consequences"))
    (f/entry :note c/MedString
             :description "additional commentary about a consequence")))
  :reference "[CommonConsequencesType](https://cwe.mitre.org/documents/schema/#CommonConsequencesType)")

(def-map-type DetectionMethod
  (concat
   (f/required-entries
    (f/entry :method v/DetectionMethod
             :description "")
    (f/entry :decription c/MedString))
   (f/optional-entries
    (f/entry :effectiveness v/DetectionEffectiveness)
    (f/entry :effectiveness_notes c/MedString)))
  :reference "[DetectionMethodsType](https://cwe.mitre.org/documents/schema/#DetectionMethodsType)")

(def-entity-type Weakness
  {:description weakness-desc
   :reference weakness-desc-link}
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type WeaknessTypeIdentifier
            :description (str "The fixed value " type-identifier))
   )
  (f/optional-entries
   (f/entry :languages (f/set-of Language)
            :description "Applicable Languages")
   (f/entry :os (f/set-of OperatingSystem)
            :description "Applicable operating systems")
   (f/entry :architectures (f/set-of Architecture)
            :description "Applicable architectures")
   (f/entry :paradigms (f/set-of Paradigm)
            :description "Applicable paradigms")
   (f/entry :technologies (f/set-of Technology)
            :description "Applicable technologies")
   (f/entry :background_details c/Markdown
            :description (str "information that is relevant but not related to "
                              "the nature of the weakness itself"))
   (f/entry :alternate_terms (f/set-of c/ShortString)
            :description (str "indicates one or more other names used to "
                              "describe this weakness"))
   (f/entry :modes_of_introduction (f/set-of ModeOfIntroduction)
            :description (str "information about how and when a given weakness "
                              "may be introduced"))
   (f/entry :likelihood v/HighMedLow
            :description "Likelihood of exploit")
   (f/entry :common_consequences (f/set-of Consequence)
            :description (str "specify individual consequences associated "
                              "with a weakness"))
   (f/entry :detection_methods (f/set-of DetectionMethod)
            :description (str "identify methods that may be employed to detect "
                              "this weakness, including their strengths and "
                              "limitations")))
  )
