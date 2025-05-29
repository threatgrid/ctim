(ns ctim.version
  (:require [clojure.java.io :as io]))

(defmacro ctim-version
  "This is a macro to support cljs compile-time inlining of the version string
  from the JVM resource."
  []
  (slurp (io/resource "ctim/version.txt")))
