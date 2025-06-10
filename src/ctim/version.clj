(ns ctim.version
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]))

(defn parse-ctim-version []
  (let [m (-> (io/resource "ctim/version.edn")
              slurp
              edn/read-string)]
    (update m :ctim-schema-version #(if (keyword? %)
                                      (get m %)
                                      %))))

(defmacro ctim-version
  "This is a macro to support cljs compile-time inlining of the version string
  from the JVM resource."
  []
  (-> (parse-ctim-version)
      :ctim-schema-version
      (throw (ex-info "Unable to resolve ctim version" {}))))
