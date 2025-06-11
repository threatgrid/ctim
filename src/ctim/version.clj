(ns ctim.version
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]
            [clojure.string :as str]))

(defn -ctim-schema-version []
  (let [{:keys [major minor schema]} (-> (io/resource "ctim/version.edn") slurp edn/read-string)]
    (str major "." minor "." schema)))

(defmacro ctim-version
  "This is a macro to support cljs compile-time inlining of the version string
  from the JVM resource."
  []
  (-ctim-schema-version))
