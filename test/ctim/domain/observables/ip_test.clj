(ns ctim.domain.observables.ip-test
  (:require [ctim.domain.observables.ip :as ip]
            [clojure.test :refer :all]))

(deftest valid-ip?-test
  (testing "valid-ip? should return true on proper proper ipv4 addresses, false otherwise"
    (are [result ip-str] (= result (ip/valid-ip? ip-str))
      true "10.0.0.0"
      true "255.255.255.255"
      false "255.255.255.2550"
      false "10.0.0.0str"
      false "256.0.0.0"
      false "355.0.0.0"
      false "255.355.0.0"
      false "255.0.355.0"
      false "255.0.0.355"))
  (testing "valid-ip? should return true on proper proper ipv6 addresses, false otherwise"
    (are [result ip-str] (= result (ip/valid-ip? ip-str))
      true "2001:0db8:85a3:0000:0000:8a2e:0370:7334"
      true "::"
      true "::ffff:0.0.0.0"
      true "fdff:ffff:ffff:ffff:ffff:ffff:ffff:ffff"
      true "fc00::"
      false "gc00::"
      false "222001:0db8:85a3:0000:0000:8a2e:0370:7334"
      false "2001:0db8:85a3:0000"))
  (testing "valid-ip? with invalid ip values should return false"
    (are [result ip-str] (= result (ip/valid-ip? ip-str))
      nil  nil
      false "whatever"
      false "google.com")))

(deftest private-ip?-test
  (testing "private-ip? should return true if ip is private, false otherwise"
    (are [result ip-str] (= result (ip/private-ip? ip-str))
      true "10.0.0.0"
      true "10.255.255.255"
      true "10.198.10.2"
      true "172.16.0.0"
      true "172.31.255.255"
      true "172.20.255.255"
      true "192.168.0.0"
      true "192.168.255.255"
      true "192.168.155.28"
      true "fc00::"
      true "fdff:ffff:ffff:ffff:ffff:ffff:ffff:ffff"
      true "fc87:ffff:f33f:deff:ffff:ffff:ffff:ffff"

      false "11.0.0.0"
      false "9.255.255.255"
      false "192.169.0.0"
      false "192.167.255.255"
      false "255.255.255.255"
      false "fe00::"
      false "fbff:ffff:ffff:ffff:ffff:ffff:ffff:ffff"
      false "10.1.1.78, 192.168.10.2"
      nil nil)))


(deftest special-ip?-test
  (testing "special-ip? should return true if ip is special, false otherwise"
    (are [result ip-str] (= result (ip/special-ip? ip-str))
      true "0.0.0.0"
      true "0.255.255.255"
      true "10.0.0.0"
      true "10.255.255.255"
      true "10.198.10.2"
 	    true "100.64.0.0"
      true "100.127.255.255"
      true "127.0.0.0"
      true "127.255.255.255"
      true "169.254.0.0"
      true "169.254.255.255"
      true "172.16.0.0"
      true "172.31.255.255"
      true "172.20.255.255"
      true "192.168.0.0"
      true "192.168.255.255"
      true "192.168.155.28"
      true "fc00::"
      true "fdff:ffff:ffff:ffff:ffff:ffff:ffff:ffff"
      true "fc87:ffff:f33f:deff:ffff:ffff:ffff:ffff"
      true "127.0.0.1"
      true "::"
      true "::1"
      true "::ffff:10.0.0.0"
      true "::ffff:172.16.0.0"
      true "::ffff:255.255.255.255"
      true "100::"
      true "100::ffff:ffff:ffff:ffff"
      true "2001::"
      true "2001::ffff:ffff:ffff:ffff:ffff:ffff"
      true "2001:20::"
      true "2001:2f:ffff:ffff:ffff:ffff:ffff:ffff"
      true "2001:db8::"
      true "2001:db8:ffff:ffff:ffff:ffff:ffff:ffff"
      true "2002::"
      true "2002:ffff:ffff:ffff:ffff:ffff:ffff:ffff"
      true "fc00::"
      true "fdff:ffff:ffff:ffff:ffff:ffff:ffff:ffff"
      true "fe80::"
      true "febf:ffff:ffff:ffff:ffff:ffff:ffff:ffff"
      true "ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff"

      false "11.0.0.0"
      false "9.255.255.255"
      false "192.169.0.0"
      false "192.167.255.255"
      false "fe00::"
      false "fbff:ffff:ffff:ffff:ffff:ffff:ffff:ffff"
      false "10.1.1.78, 192.168.10.2"
      nil nil)))


(deftest normalize-ip-test
  (testing "normalize-ip should tranform alternate ip forms into valid ip"
    (are [result ip-str] (= result (ip/normalize-ip ip-str))
      "10.0.0.1" "10[.]0[.]0.1"
      "10.0.0.1" "10.0.0.1"
      "fc87:ffff:f33f:deff:ffff:ffff:ffff:ffff" "fc87:ffff:f33f:deff:ffff:ffff:ffff:ffff"
      "fc00::" "fc00::"

      nil "gc00::"
      nil "222001:0db8:85a3:0000:0000:8a2e:0370:7334"
      nil "2001:0db8:85a3:0000"
      nil "whatever")))
