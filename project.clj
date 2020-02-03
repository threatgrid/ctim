(def schema-tools-version "0.9.1")
(def schema-version "1.1.7")

(defproject threatgrid/ctim "1.0.16-SNAPSHOT"
  :description "Cisco Threat Intelligence Model"
  :url "http://github.com/threatgrid/ctim"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [prismatic/schema "1.1.12"]

                 [org.slf4j/slf4j-api "1.7.25"] ; pin dep for internal conflict in clj-momo
                 [instaparse "1.4.10"] ; pin version for test.chuck
                 [threatgrid/clj-momo "0.3.4-20200203.190531-1"]

                 [threatgrid/flanders "0.1.23-20200203.184028-2"]
                 ;metosin/ring-swagger goes after threatgrid/flanders to resolve cheshire dep
                 [metosin/ring-swagger "0.26.2"]

                 [org.clojure/test.check "0.10.0"]
                 [com.gfredericks/test.chuck "0.2.10"]
                 [prismatic/schema-generators "0.1.3"]

                 [kovacnica/clojure.network.ip "0.1.3"]]

  :uberjar-name "ctim.jar"
  :resource-paths ["doc"]

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-doo "0.1.11" :exclusions [org.clojure/clojure]]]

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
                                         :language-in  :ecmascript5
                                         :optimizations :whitespace
                                         :main ctim.runner
                                         :pretty-print true}}}}
  :test-selectors {:no-gen #(not (:gen %))}
  :global-vars {*warn-on-reflection* true}
  :profiles {:provided
             {:dependencies [[org.clojure/clojurescript "1.10.597"
                              :exclusions [com.google.errorprone/error_prone_annotations
                                           com.google.code.findbugs/jsr305
                                           ; provided by metosin/ring-swagger
                                           org.mozilla/rhino]]]}})
