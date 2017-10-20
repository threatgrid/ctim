(ns ctim.schemas.indicator
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type
                                                  def-enum-type
                                                  def-map-type
                                                  def-eq]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type
                                                         def-enum-type
                                                         def-map-type
                                                         def-eq]])))

(def-eq JudgementSpecificationType "Judgement")

(def-map-type JudgementSpecification
  (f/required-entries
   (f/entry :type JudgementSpecificationType)
   (f/entry :judgements [rel/JudgementReference])
   (f/entry :required_judgements rel/RelatedJudgements))
  :description (str "An indicator based on a list of judgements.  If any of the "
                    "Observables in it's judgements are encountered, than it may "
                    "be matches against.  If there are any required judgements, "
                    "they all must be matched in order for the indicator to be "
                    "considered a match."))

(def-eq ThreatBrainSpecificationType "ThreatBrain")

(def-map-type ThreatBrainSpecification
  [(f/entry :type ThreatBrainSpecificationType)
   (f/entry :query f/any-str
            :required? false)
   (f/entry :variables f/any-str-seq)]
  :description "An indicator which runs in threatbrain...")

(def-eq SnortSpecificationType "Snort")

(def-map-type SnortSpecification
  (f/required-entries
   (f/entry :type SnortSpecificationType)
   (f/entry :snort_sig f/any-str))
  :description "An indicator which runs in snort...")

(def-eq SIOCSpecificationType "SIOC")

(def-map-type SIOCSpecification
  (f/required-entries
   (f/entry :type SIOCSpecificationType)
   (f/entry :SIOC f/any-str))
  :description "An indicator which runs in snort...")

(def-eq OpenIOCSpecificationType "OpenIOC")

(def-map-type OpenIOCSpecification
  (f/required-entries
   (f/entry :type OpenIOCSpecificationType)
   (f/entry :open_IOC f/any-str))
  :description "An indicator which contains an XML blob of an openIOC indicator..")

(def-enum-type BooleanOperator
  #{"and" "or" "not"})

(def-map-type CompositeIndicatorExpression
  (f/required-entries
   (f/entry :operator BooleanOperator)
   (f/entry :indicator_ids [rel/IndicatorReference]))
  :reference "[CompositeIndicatorExpressionType](http://stixproject.github.io/data-model/1.2/indicator/CompositeIndicatorExpressionType/)")

(def type-identifier "indicator")

(def-eq IndicatorTypeIdentifier type-identifier)

(def indicator-desc
  "An indicator is a test, or a collection of judgements that define
criteria for identifying the activity, or presence of malware, or
other unwanted software.

We follow the
[STiX IndicatorType](http://stixproject.github.io/data-model/1.2/indicator/IndicatorType/)
closely, with the exception of not including observables within the
indicator, and preferring a _specification_ object encoded in JSON as
opposed to an opaque _implementation_ block.

Additional, you will want to either define judgements against
Observables that are linked to this indicator, with the ID in the
_indicators_ field of those Judgements, or you can provide a
_specification_ value.")

(def indicator-desc-link
  "[IndicatorType](http://stixproject.github.io/data-model/1.2/indicator/IndicatorType/)")

(def-entity-type Indicator
  {:description indicator-desc
   :reference indicator-desc-link}
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type IndicatorTypeIdentifier)
   (f/entry :valid_time c/ValidTime)
   (f/entry :producer c/ShortString
            :comment "TODO - Document what is supposed to be in this field!"))
  (f/optional-entries
   (f/entry :negate f/any-bool
            :description "specifies the absence of the pattern")
   (f/entry :indicator_type [v/IndicatorType]
            :description "Specifies the type or types for this Indicator")
   (f/entry :tags (f/seq-of c/ShortString)
            :description "Descriptors for this indicator")
   (f/entry :composite_indicator_expression CompositeIndicatorExpression)
   (f/entry :likely_impact c/LongString
            :description (str "likely potential impact within the relevant "
                              "context if this Indicator were to occur"))
   (f/entry :confidence v/HighMedLow
            :description (str "level of confidence held in the accuracy of this "
                              "Indicator"))
   (f/entry :kill_chain_phases [c/KillChainPhase]
            :comment "simplified"
            :description "relevant kill chain phases indicated by this Indicator")
   (f/entry :test_mechanisms [c/MedString]
            :comment "simplified"
            :description (str "Test Mechanisms effective at identifying the "
                              "cyber Observables specified in this cyber threat "
                              "Indicator"))
   (f/entry :specification (f/conditional
                            #(= "Judgement"   (:type %)) JudgementSpecification
                            #(= "ThreatBrain" (:type %)) ThreatBrainSpecification
                            #(= "Snort"       (:type %)) SnortSpecification
                            #(= "SIOC"        (:type %)) SIOCSpecification
                            #(= "OpenIOC"     (:type %)) OpenIOCSpecification)))
  ;; Not provided: handling
  )


(def-entity-type NewIndicator
  "For submitting a new Indicator"
  (:entries Indicator)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :valid_time c/ValidTime)
   (f/entry :type IndicatorTypeIdentifier)))

(def-entity-type StoredIndicator
  "An indicator as stored in the data store"
  (:entries Indicator)
  c/base-stored-entity-entries)

(defn generalize-indicator
  "Strips off realized fields"
  [indicator]
  (dissoc indicator
          :id
          :type
          :created
          :modified
          :owner))

(def IndicatorRef
  (c/ref-for-type type-identifier))
