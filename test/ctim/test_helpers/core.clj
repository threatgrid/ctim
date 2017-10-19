(ns ctim.test-helpers.core
  (:require [clojure.spec :as cs]
            [clojure.spec.test :as stest]
            [clojure.test.check.generators :as gen]
            [ctim.generators.common :as cgc]
            [flanders.spec :as fs]
            [ctim.domain.id :as id])
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

(defn fixture-fast-gen [t]
  (with-redefs [gen/vector cgc/vector]
    (t)))

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

(defn transient-id-str
  [entity]
  (id/make-transient-id (:type entity)))
