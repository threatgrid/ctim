(ns ctim.generators.id-test
  (:require #?(:cljs [clojure.test.check :refer-macros [quick-check]])
            [clojure.test.check.clojure-test
             #?(:clj :refer :cljs :refer-macros) [defspec]]
            [clojure.test.check.properties
             #?(:clj :refer :cljs :refer-macros) [for-all]]
            [ctim.domain.id :as domain-id]
            [ctim.generators.id :as sut]))

(defspec ^:gen spec-gen-url-id
  (for-all
   [url-id sut/gen-url-id]

   (and
    (string? url-id)
    (re-matches domain-id/long-id-re url-id))))
