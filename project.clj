(def schema-tools-version "0.9.1")
(def schema-version "1.1.7")

(defproject threatgrid/ctim "1.0.17-SNAPSHOT"
  :description "Cisco Threat Intelligence Model"
  :url "http://github.com/threatgrid/ctim"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [prismatic/schema "1.1.12"]
                 [com.google.protobuf/protobuf-java "3.7.1"] ;clj-momo > org.clojure/clojurescript
                 [instaparse "1.4.8"] ;clj-momo > com.gfredericks/test.chuck
                 [threatgrid/clj-momo "0.3.4"]
                 [org.mozilla/rhino "1.7.7.1"] ;threatgrid/flanders > kovacnica/clojure.network.ip
                 [threatgrid/flanders "0.1.23"]
                 [metosin/ring-swagger "0.26.2"]
                 [org.clojure/test.check "1.0.0"]
                 [com.gfredericks/test.chuck "0.2.10"]
                 [prismatic/schema-generators "0.1.3"]
                 [kovacnica/clojure.network.ip "0.1.3"]]

  :uberjar-name "ctim.jar"
  :resource-paths ["doc"]

  :plugins [[org.clojure/clojure "1.10.1"] ;pin lein-cljsbuild and lein-doo version
            [lein-cljsbuild "1.1.7"]
            [com.google.guava/guava "20.0"] ;resolve internal conflict in `lein-doo`
            [lein-doo "0.1.11"]]

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
  :test-selectors {:no-gen (complement :gen)}
  :global-vars {*warn-on-reflection* true}
  :profiles {:provided
             {:dependencies [;https://clojure.atlassian.net/browse/CLJS-3047
                             [com.google.errorprone/error_prone_annotations "2.1.3"]
                             ;https://clojure.atlassian.net/browse/CLJS-3047
                             [com.google.code.findbugs/jsr305 "3.0.2"]
                             [org.clojure/clojurescript "1.10.597"]]}})
