(ns ctim.schemas.indicator
  (:require [ctim.schemas.common :as c]
            [ctim.schemas.relationship :as rel]
            [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-map-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-map-type]])))

(def-map-type JudgementSpecification
  (f/required-entries
   (f/entry :type (f/eq "Judgement"))
   (f/entry :judgements [rel/JudgementReference])
   (f/entry :required_judgements rel/RelatedJudgements))
  :description (str "An indicator based on a list of judgements.  If any of the "
                    "Observables in it's judgements are encountered, than it may "
                    "be matches against.  If there are any required judgements, "
                    "they all must be matched in order for the indicator to be "
                    "considered a match."))

(def-map-type ThreatBrainSpecification
  [(f/entry :type (f/eq "ThreatBrain"))
   (f/entry :query f/any-str
            :required? false)
   (f/entry :variables f/any-str-seq)]
  :description "An indicator which runs in threatbrain...")

(def-map-type SnortSpecification
  (f/required-entries
   (f/entry :type (f/eq "Snort"))
   (f/entry :snort_sig f/any-str))
  :description "An indicator which runs in snort...")

(def-map-type SIOCSpecification
  (f/required-entries
   (f/entry :type (f/eq "SIOC"))
   (f/entry :SIOC f/any-str))
  :description "An indicator which runs in snort...")

(def-map-type OpenIOCSpecification
  (f/required-entries
   (f/entry :type (f/eq "OpenIOC"))
   (f/entry :open_IOC f/any-str))
  :description "An indicator which contains an XML blob of an openIOC indicator..")

(def-map-type CompositeIndicatorExpression
  (f/required-entries
   (f/entry :operator (f/eq "and" "or" "not"))
   (f/entry :indicator_ids [rel/IndicatorReference]))
  :reference "[CompositeIndicatorExpressionType](http://stixproject.github.io/data-model/1.2/indicator/CompositeIndicatorExpressionType/)")

(def TypeIdentifier
  (f/eq "indicator"))

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

(def indicator-ref
  "[IndicatorType](http://stixproject.github.io/data-model/1.2/indicator/IndicatorType/)")

(def-entity-type Indicator
  {:description indicator-desc
   :reference indicator-ref}
  c/base-entity-entries
  c/describable-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type TypeIdentifier)
   (f/entry :valid_time c/ValidTime)
   (f/entry :producer f/any-str
            :comment "TODO - Document what is supposed to be in this field!"))
  (f/optional-entries
   (f/entry :alternate_ids f/any-str-seq
            :description "alternative identifier (or alias)")
   (f/entry :negate f/any-bool
            :description "specifies the absence of the pattern")
   (f/entry :indicator_type [v/IndicatorType]
            :description "Specifies the type or types for this Indicator")
   (f/entry :tags f/any-str-seq
            :description "Descriptors for this indicator")
   (f/entry :judgements rel/RelatedJudgements
            :description "related Judgements for this Indicator")
   (f/entry :composite_indicator_expression CompositeIndicatorExpression)
   (f/entry :indicated_TTP rel/RelatedTTPs
            :description "the relevant TTP indicated by this Indicator")
   (f/entry :likely_impact f/any-str
            :description (str "likely potential impact within the relevant "
                              "context if this Indicator were to occur"))
   (f/entry :suggested_COAs rel/RelatedCOAs
            :description "suggested Courses of Action")
   (f/entry :confidence v/HighMedLow
            :description (str "level of confidence held in the accuracy of this "
                              "Indicator"))
   (f/entry :related_indicators rel/RelatedIndicators
            :description (str "relationship between the enclosing indicator and"
                              " a disparate indicator"))
   (f/entry :related_campaigns rel/RelatedCampaigns
            :description "references to related campaigns")
   (f/entry :related_COAs rel/RelatedCOAs
            :description (str "related Courses of Actions for this cyber threat "
                              "Indicator"))
   (f/entry :kill_chain_phases f/any-str-seq
            :comment "simplified"
            :description "relevant kill chain phases indicated by this Indicator")
   (f/entry :test_mechanisms f/any-str-seq
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
   (f/entry :type TypeIdentifier)))

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
