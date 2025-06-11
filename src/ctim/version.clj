(ns ctim.version
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]
            [clojure.string :as str]))

(defn -ctim-version []
  (let [{:keys [template patch] :as m}
        (-> (io/resource "ctim/version.edn")
            slurp
            edn/read-string)]
    (str/replace template "PATCH" (str patch))))

(defmacro ctim-version
  "This is a macro to support cljs compile-time inlining of the version string
  from the JVM resource."
  []
  (-ctim-version))
