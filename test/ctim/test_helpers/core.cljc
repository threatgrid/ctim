(ns ctim.test-helpers.core
  (:require [clojure.spec.alpha :as cs]
            [clojure.spec.test.alpha :as stest]
            [ctim.domain.id :as id]
            [flanders.schema :as fschema]
            [flanders.spec :as fs])
  (:import [java.util UUID]))

(defn fixture-spec-validation [t]
  (with-redefs [cs/registry-ref (atom (cs/registry))]
    (stest/instrument 'fs/->spec)
    (cs/check-asserts true)
    (t)
    (cs/check-asserts false)
    (stest/unstrument 'fs/->spec)))

(defn fixture-spec [node-to-spec ns]
  (fn [t]
    (fs/->spec node-to-spec ns)
    (t)))

(defn fixture-spec-recursion-limit [n]
  (fn [t]
    (binding [cs/*recursion-limit* n]
      (t))))

; this function used to override gen/vector with
; a function with different behavior, which broke
; internal generator logic in test.check 0.10.0.
(defn ^{:deprecated "1.0.17"} fixture-fast-gen [t]
  (t))

(defn rand-str [len]
  (apply str (repeatedly len #(char (+ (rand 26) 65)))))

(defn short-id-str
  [entity]
  (format "%s-%s"
          (:type entity)
          (UUID/randomUUID)))

(defn long-id-str
  [entity]
  (let [entity-type (:type entity)]
    (id/make-long-id-str {:hostname "intel.amp.cisco.com"
                          :short-id (short-id-str entity)
                          :protocol "https"
                          :type entity-type})))

(defn rand-transient-id-str
  [len]
  (let [prefix "transient:"
        length (max 0 (- len (count prefix)))]
    (str prefix (rand-str length))))

(defn rand-openvocab [len]
  (apply str (repeatedly
              len
              #(rand-nth "abcdefghijklmnopqrstuvwxyz-_"))))

(defn- ->swagger [dll] (:json-schema (meta (fschema/->schema dll))))
