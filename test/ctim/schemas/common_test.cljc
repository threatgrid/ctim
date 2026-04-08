(ns ctim.schemas.common-test
  (:refer-clojure :exclude [ref uri?])
  (:require
   [clojure.java.io :as io]
   [clojure.test :refer [deftest is testing]]
   [ctim.schemas.common :as sut]
   [flanders.schema :as fs]))

(defn- ->swagger [dll] (:json-schema (meta (fs/->schema dll))))

(deftest swagger-test
  (is (= {:example {:value "1.2.3.4", :type "ip"}
          :description "A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable."}
         (->swagger sut/Observable))))

(defn lein-project-version
  []
  (let [properties (with-open [pom-properties-reader (io/reader (io/resource "META-INF/maven/threatgrid/ctim/pom.properties"))]
                     (doto (java.util.Properties.)
                       (.load pom-properties-reader)))]
    (if-let [ver (get properties "version")]
      ver
      (throw (ex-info "Unable to resolve ctim version" {})))))

(deftest version-test
  (testing "The lein project version and ctim schema version are in sync."
    (is (re-matches #"[\d]+\.[\d]+\.[\d]+.*?" sut/ctim-schema-version)
        "Version follows the expected semantic versioning pattern.")
    (is (= (lein-project-version) sut/ctim-schema-version))))
