(ns ctim.domain.disposition-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing]]
               :cljs [cljs.test :refer-macros [deftest is testing]])
            [ctim.domain.disposition :as sut]))

(deftest sort-by-importance-test
  (testing "sorting disposition strings"
    (is (= (sut/sort-by-importance
            ["Malicious" "Clean" "Unknown" "Foo"])
           ["Clean" "Malicious" "Unknown" "Foo"])))

  (testing "sorting a map with disposition keys"
    (is (= (sut/sort-by-importance
            first
            {"Malicious" 2
             "Clean" 4
             "Suspicious" 6
             "Unknown" 10})
           [["Clean" 4]
            ["Malicious" 2]
            ["Suspicious" 6]
            ["Unknown" 10]])))

  (testing "sorting maps by :disposition key"
    (is (= (sut/sort-by-importance
            :disposition
            [{:disposition "Unknown"}
             {:disposition "Clean"}
             {:disposition "Malicious"}])
           [{:disposition "Clean"}
            {:disposition "Malicious"}
            {:disposition "Unknown"}]))))
