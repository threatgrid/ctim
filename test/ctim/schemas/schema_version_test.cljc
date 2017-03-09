(ns ctim.schemas.schema-version-test
  (:require  #?(:clj [clojure.test :refer [deftest is testing use-fixtures]]
                :cljs [cljs.test :refer-macros [deftest is testing]])
             [ctim.schemas.judgement :as j]
             [ctim.examples.judgements :as e]
             [flanders.schema :as fs]
             [schema.core :as s]))

(deftest schema-version-test
  (testing "an arbitrary schema version string is allowed"
    (is (s/validate
         (fs/->schema j/Judgement)
         (assoc e/judgement-minimal
                :schema_version "foo")))))
