(ns ctim.domain.observables.cidr_block-test
  (:require [ctim.domain.observables.cidr_block :as sut]
            [clojure.test :refer [are deftest testing]]))

(deftest valid-cidr_block?-test
  (testing "valid-cidr_block? should return true on valid ipv4 cidr_block, false otherwise"
    (are [cidr_block result] (= result (sut/valid-cidr_block? cidr_block))
      "10.0.0.0/24" true
      "255.255.255.255/32" true
      "255.255.255.2550/32" false
      "10.0.0.0str" false
      "256.0.0.0" false
      "355.0.0.0" false
      "255.355.0.0" false
      "255.0.355.0" false
      "255.0.0.355" false))
  (testing "valid-cidr_block? should return true on valid ipv6 cidr_block, false otherwise"
    (are [cidr_block result] (= result (sut/valid-cidr_block? cidr_block))
      "2001:0db8:85a3:0000:0000:8a2e:0370:7334/128" true
      "::/0" true
      "::ffff:0.0.0.0/128" true
      "fdff:ffff:ffff:ffff:ffff:ffff:ffff:ffff/128" true
      "fc00::/16" true
      "gc00::/0" false
      "222001:0db8:85a3:0000:0000:8a2e:0370:7334" false
      "2001:0db8:85a3:0000" false))
  (testing "valid-cidr_block? with invalid cidr_block should return false"
    (are [cidr_block result] (= result (sut/valid-cidr_block? cidr_block))
      nil  false
      "whatever" false
      "google.com" false
      "google.com/facebook" false
      "google.com/24" false)))
