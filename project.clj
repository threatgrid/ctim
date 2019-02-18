(def schema-tools-version "0.9.1")
(def schema-version "1.1.7")

(defproject threatgrid/ctim "1.0.9"
  :description "Cisco Threat Intelligence Model"
  :url "http://github.com/threatgrid/ctim"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :pedantic? :warn
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.reader "1.2.2"]
                 ;; what compojure-api 1.0.0 wants
                 [prismatic/schema ~schema-version]
                 ;; for schema descriptions
                 [metosin/ring-swagger "0.24.4"
                  :exclusions [clj-time
                               com.google.code.findbugs/jsr305]]
                 [threatgrid/flanders "0.1.17"
                  :exclusions [com.google.code.findbugs/jsr305]]
                 ;; for merge and such
                 [metosin/schema-tools ~schema-tools-version]
                 ;; for generators
                 [org.clojure/test.check "0.9.0"]
                 [com.gfredericks/test.chuck "0.2.8"
                  :exclusions [clj-time
                               com.andrewmcveigh/cljs-time
                               instaparse]]
                 [prismatic/schema-generators "0.1.1"
                  :exclusions [prismatic/schema]]
                 ;; for url
                 [com.cemerick/url "0.1.1"]
                 ;; shared libs
                 [threatgrid/clj-momo "0.2.18"]

                 ;; dependency overrides

                 ;; test.chuck uses an old instaparse
                 [instaparse "1.4.8"
                  :exclusions [org.clojure/clojure]]]

  :uberjar-name "ctim.jar"
  :resource-paths ["doc"]

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-doo "0.1.10"]]

  :aliases  {"doc" ^{:doc "Generate documentation"} ["run" "-m" "ctim.document"]
             "gen" ^{:doc "Generate an example"} ["run" "-m" "ctim.generate"]}

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
  :test-selectors {:no-gen #(not (:gen %))}
  :profiles {:provided
             {:dependencies [[org.clojure/clojurescript "1.9.946"]]}})
