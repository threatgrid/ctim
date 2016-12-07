(ns ctim.schemas.ttp-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.ttp :as t]
            [ctim.examples.ttps :as e]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-ttp-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema t/TTP)
         e/ttp-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema t/TTP)
         e/ttp-minimal))))

(deftest test-new-ttp-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema t/NewTTP)
         e/new-ttp-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema t/NewTTP)
         e/new-ttp-minimal))))

(deftest test-stored-ttp-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema t/StoredTTP)
         e/stored-ttp-maximal)))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema t/StoredTTP)
         e/stored-ttp-minimal))))
