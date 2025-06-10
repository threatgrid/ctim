(ns ctim.version
  (:require [clojure.java.io :as io]
            [clojure.string :as str]))

(defmacro ctim-version
  "This is a macro to support cljs compile-time inlining of the version string
  from the JVM resource."
  []
  (let [properties (when-some [f (io/resource "META-INF/maven/threatgrid/ctim/pom.properties")]
                     (with-open [pom-properties-reader (io/reader f)]
                       (doto (java.util.Properties.)
                         (.load pom-properties-reader))))]
    (or (get properties "version")
        (System/getProperty "ctim.version-override")
        (when (= "true" (System/getProperty "ctim.dev"))
          (-> "VERSION_TEMPLATE"
              slurp
              str/trim
              (str/replace "GENERATED_VERSION" "999999")
              (str "-SNAPSHOT")))
        (throw (ex-info "Unable to resolve ctim version" {})))))
