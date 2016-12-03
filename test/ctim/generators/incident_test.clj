(ns ctim.generators.incident-test
  (:require [clj-momo.test-helpers.core :as mth]
            [clojure.test :refer [use-fixtures]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [ctim.schemas.incident :as incident]
            [ctim.test-helpers
             [core :as th]
             [properties :as property]]
            [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  mth/fixture-schema-validation
  (th/fixture-spec incident/Incident
                   "test.incident")
  (th/fixture-spec incident/NewIncident
                   "test.new-incident")
  (th/fixture-spec incident/StoredIncident
                   "test.stored-incident")
  (th/fixture-spec (fu/require-all incident/Incident)
                   "test.max.incident")
  (th/fixture-spec (fu/require-all incident/NewIncident)
                   "test.max.new-incident")
  (th/fixture-spec (fu/require-all incident/StoredIncident)
                   "test.max.stored-incident"))

;; Incident

(defspec ^:gen spec-generated-incident-is-valid
  (property/generated-entity-is-valid :test.incident/map))

(defspec ^:gen spec-generated-max-incident-is-valid
  (property/generated-entity-is-valid :test.max.incident/map))

(defspec ^:gen spec-generated-incident-id-is-valid
  (property/generated-entity-id-is-valid :test.incident/map
                                         "incident"))

;; New Incident

(defspec ^:gen spec-generated-new-incident-is-valid
  (property/generated-entity-is-valid :test.new-incident/map))

(defspec ^:gen spec-generated-max-new-incident-is-valid
  (property/generated-entity-is-valid :test.max.incident/map))

(defspec ^:gen spec-generated-new-incident-id-is-valid
  (property/generated-entity-id-is-valid :test.new-incident/map
                                         "incident"
                                         :optional))

;; Stored Incident

(defspec ^:gen spec-generated-stored-incident-is-valid
  (property/generated-entity-is-valid :test.stored-incident/map))

(defspec ^:gen spec-generated-max-stored-incident-is-valid
  (property/generated-entity-is-valid :test.max.stored-incident/map))

(defspec ^:gen spec-generated-stored-incident-id-is-valid
  (property/generated-entity-id-is-valid :test.stored-incident/map
                                         "incident"))
