(ns ctim.test-helpers.core
  (:require [clojure.spec :as cs]
            [clojure.spec.test :as stest]
            [flanders.spec :as fs]))

(defn fixture-spec-validation [t]
  (with-redefs [cs/registry-ref (atom (cs/registry))]
    (stest/instrument 'fs/->spec)
    (cs/check-asserts true)
    (t)
    (cs/check-asserts false)
    (stest/unstrument 'fs/->spec)))
