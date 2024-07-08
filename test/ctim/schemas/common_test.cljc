(ns ctim.schemas.common-test
  (:refer-clojure :exclude [ref uri?])
  (:require [ctim.schemas.common :as sut]
            [flanders.schema :as fs]
            [clojure.test :refer [deftest is]]))

(defn- ->swagger [dll] (:json-schema (meta (fs/->schema dll))))

(deftest swagger-test
  (is (= {:example {:value "1.2.3.4", :type "string"}
          :description "A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable."}
         (->swagger sut/Observable)))
  )
