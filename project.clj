(defproject threatgrid/ctim "0.1.6-SNAPSHOT"
  :description "Cisco Threat Intelligence Model"
  :url "http://github.com/threatbrain/ctim"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ;; what compojure-api 1.0.0 wants
                 [prismatic/schema "1.1.2"]
                 ;; for schema descriptions
                 [metosin/ring-swagger "0.22.9"]
                 ;; for merge and such
                 [metosin/schema-tools "0.9.0"]
                 ;; for generators
                 [org.clojure/test.check "0.9.0"]
                 [com.gfredericks/test.chuck "0.2.6"]
                 [prismatic/schema-generators "0.1.0"
                  :exclusions [prismatic/schema]]
                 ;; for url
                 [com.cemerick/url "0.1.1"]
                 ;; time
                 [com.andrewmcveigh/cljs-time "0.5.0-alpha1"]
                 [clj-time "0.12.0"]]

  :uberjar-name "ctim.jar"
  :resource-paths ["doc"]

  :plugins [[lein-cljsbuild "1.1.3"]
            [lein-doo "0.1.7"]]

  :cljsbuild {:builds {:node {:source-paths ["src" "test"]
                              :compiler {:output-to "target/tests.js"
                                         :output-dir "target/node"
                                         :optimizations :advanced
                                         :main ctim.runner
                                         :pretty-print true
                                         :target :nodejs
                                         :hashbang false}}

                       :test {:source-paths ["src" "test"]
                              :compiler {:output-to "target/tests.js"
                                         :optimizations :whitespace
                                         :main ctim.runner
                                         :pretty-print true}}}}
  :profiles {:provided
             {:dependencies [[org.clojure/clojurescript "1.9.93"]]}})
