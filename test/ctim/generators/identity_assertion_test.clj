(ns ctim.generators.identity-assertion-test
  (:require [clj-momo.test-helpers.core :as mth]
            [clojure.test :refer [use-fixtures]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [ctim.schemas.identity-assertion :as identity-assertion]
            [ctim.test-helpers
             [core :as th]
             [properties :as property]]
            [flanders.utils :as fu]))

(use-fixtures :once
  th/fixture-spec-validation
  mth/fixture-schema-validation
  (th/fixture-spec identity-assertion/IdentityAssertion
                   "test.identity-assertion")
  (th/fixture-spec identity-assertion/NewIdentityAssertion
                   "test.new-identity-assertion")
  (th/fixture-spec (fu/require-all identity-assertion/IdentityAssertion)
                  "test.max.identity-assertion")
  (th/fixture-spec (fu/require-all identity-assertion/NewIdentityAssertion)
                  "test.max.new-identity-assertion"))

;; Identity Assertion

(defspec ^:gen spec-generated-identity-assertion-is-valid
  (property/generated-entity-is-valid :test.identity-assertion/map))

(defspec ^:gen spec-generated-max-identity-assertion-is-valid
  (property/generated-entity-is-valid :test.max.identity-assertion/map))

(defspec ^:gen spec-generated-identity-assertion-id-is-valid
  (property/generated-entity-id-is-valid :test.identity-assertion/map
                                         "identity-assertion"))

;; New Identity Assertion

(defspec ^:gen spec-generated-new-identity-assertion-is-valid
  (property/generated-entity-is-valid :test.new-identity-assertion/map))

(defspec ^:gen spec-generated-max-new-identity-assertion-is-valid
  (property/generated-entity-is-valid :test.max.identity-assertion/map))

(defspec ^:gen spec-generated-new-identity-assertion-id-is-valid
  (property/generated-entity-id-is-valid :test.new-identity-assertion/map
                                         "identity-assertion"
                                         :optional))
