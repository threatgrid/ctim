(ns ctim.version
  (:require [clojure.java.io :as io]))

(defmacro ctim-version
  "This is a macro to support cljs compile-time inlining of the version string
  from the JVM resource."
  []
  (let [properties (when-some [f (io/resource "META-INF/maven/threatgrid/ctim/pom.properties")]
                     (with-open [pom-properties-reader (io/reader f)]
                       (doto (java.util.Properties.)
                         (.load pom-properties-reader))))]
    (or (get properties "version")
        (throw (ex-info "Unable to resolve ctim version" {})))))
