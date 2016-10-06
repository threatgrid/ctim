(ns ctim.generators.schemas.bundle-generators
  (:require [clojure.test.check.generators :as gen]
            [ctim.schemas.common :as schemas-common]
            [ctim.schemas.bundle :as bundle]
            [ctim.generators.common
             :refer [complete leaf-generators maybe]
             :as common]
            [ctim.generators.id :as gen-id]
            [ctim.generators.schemas.actor-generators :refer [gen-actor]]
            [ctim.generators.schemas.campaign-generators :refer [gen-campaign]]
            [ctim.generators.schemas.coa-generators :refer [gen-coa]]
            [ctim.generators.schemas.exploit-target-generators :refer [gen-exploit-target]]
            [ctim.generators.schemas.feedback-generators :refer [gen-feedback]]
            [ctim.generators.schemas.incident-generators :refer [gen-incident]]
            [ctim.generators.schemas.indicator-generators :refer [gen-indicator]]
            [ctim.generators.schemas.judgement-generators :refer [gen-judgement]]
            [ctim.generators.schemas.sighting-generators :refer [gen-sighting]]
            [ctim.generators.schemas.ttp-generators :refer [gen-ttp]]
            #?(:clj  [flanders.core :as f :refer [def-map-type]]
               :cljs [flanders.core :as f :refer-macros [def-map-type]])
            [flanders.schema :as fs]
            [schema-generators.generators :as seg]))

(def-map-type BaseNewBundle
  (concat
   schemas-common/base-new-entity-entries
   schemas-common/sourced-object-entries
   schemas-common/describable-entity-entries
   bundle/references-entries
   bundle/new-bundle-entries)
  :comment "Not a true NewBundle")

(def-map-type BaseStoredBundle
  (concat
   schemas-common/base-stored-entity-entries
   schemas-common/sourced-object-entries
   schemas-common/describable-entity-entries
   bundle/references-entries
   bundle/bundle-entries)
  :comment "Not a true BaseStoredBundle")

(defn merge-entities [[s id actors campaigns coas
                       exploit-targets feedbacks
                       incidents indicators judgements
                       sightings ttps]]
  (cond-> (dissoc s :id)
    id (assoc :id id)
    actors (assoc :actors actors)
    campaigns (assoc :campaigns campaigns)
    coas (assoc :coas coas)
    exploit-targets (assoc :exploit-targets exploit-targets)
    feedbacks (assoc :feedbacks feedbacks)
    incidents (assoc :incidents incidents)
    indicators (assoc :indicators indicators)
    judgements (assoc :judgements judgements)
    sightings (assoc :sightings sightings)
    ttps (assoc :ttps ttps)))


(def gen-bundle
  (gen/fmap
   merge-entities
   (gen/tuple (seg/generator (fs/get-schema BaseStoredBundle)
                             leaf-generators)
              (gen-id/gen-short-id-of-type :bundle)
              (maybe (common/vector gen-actor))
              (maybe (common/vector gen-campaign))
              (maybe (common/vector gen-coa))
              (maybe (common/vector gen-exploit-target))
              (maybe (common/vector gen-feedback))
              (maybe (common/vector gen-incident))
              (maybe (common/vector gen-indicator))
              (maybe (common/vector gen-judgement))
              (maybe (common/vector gen-sighting))
              (maybe (common/vector gen-ttp)))))

(defn gen-new-bundle_ [gen-id]
  (gen/fmap
   merge-entities
   (gen/tuple (seg/generator (fs/get-schema BaseNewBundle)
                             leaf-generators)
              gen-id
              (maybe (common/vector gen-actor))
              (maybe (common/vector gen-campaign))
              (maybe (common/vector gen-coa))
              (maybe (common/vector gen-exploit-target))
              (maybe (common/vector gen-feedback))
              (maybe (common/vector gen-incident))
              (maybe (common/vector gen-indicator))
              (maybe (common/vector gen-judgement))
              (maybe (common/vector gen-sighting))
              (maybe (common/vector gen-ttp)))))

(def gen-new-bundle
  (gen-new-bundle_
   (maybe (gen-id/gen-short-id-of-type :bundle))))

(def gen-new-bundle-with-id
  (gen-new-bundle_
   (gen-id/gen-short-id-of-type :bundle)))
