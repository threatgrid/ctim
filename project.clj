(def schema-tools-version "0.9.1")
(def schema-version "1.1.7")

(defproject threatgrid/ctim "1.0.16-SNAPSHOT"
  :description "Cisco Threat Intelligence Model"
  :url "http://github.com/threatgrid/ctim"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/tools.reader "1.3.2"]
                 [prismatic/schema "1.1.12"]

                 ;; for schema descriptions
                 [metosin/ring-swagger "0.26.2"
                  :exclusions [com.google.code.findbugs/jsr305]]
                 [threatgrid/flanders "0.1.22"
                  :exclusions [com.google.code.findbugs/jsr305]]

                 ;; for merge and such
                 [metosin/schema-tools "0.12.2"]

                 ;; for generators
                 ; notes:
                 ; - broken somewhere between 0.10.0-alpha4...0.10.0-RC1
                 ; - bisect says 5e2734f6725de5df10c7641c2d57ff1368485207
                 ; - problem generating ctim.schemas.sighting/Sighting's optional
                 ;   SightingDataTable entry.
                 ;  - that originates from SightingDataTable's (f/seq-of (f/seq-of dt/Datum))
                 ;    required entry
                 ;   - reduces to dt/Datum, which is f/any
                 ;    - reduces to (property/generated-entity-is-valid any?) failing as
                 ;      a defspec property
                 ;     - reduces to: 
                 ;        (defspec ^:gen spec-generated-datum-is-valid
                 ;           (property/generated-entity-is-valid (cs/with-gen (constantly false)
                 ;                                                 #(do gen/size-bounded-bigint)))
                 ;      - only fails when th/fixture-fast-gen is used as fixture
                 ; - here's what's happening:
                 ;   - we're rebinding gen/vector too soon and it inteferes
                 ;     with the way defspec set ups the generative test
                 ;     - probably an internal fmap uses gen/vector somewhere
                 ;       - actually, the implementation of `gen/bounded-bigint`
                 ;         (a private function that's eventually called by generating
                 ;          `gen/any-printable`) calls `gen/vector` 
                 [org.clojure/test.check "0.10.0"] ;TODO upgrade to 0.10.0 (unit tests fail)
                 [com.gfredericks/test.chuck "0.2.10"
                  :exclusions [org.clojure/test.check
                               ;provided by threatgrid/clj-momo
                               com.andrewmcveigh/cljs-time
                               instaparse]]
                 [prismatic/schema-generators "0.1.3"]
                 ;; for url
                 [com.cemerick/url "0.1.1"]
                 ;; shared libs
                 [kovacnica/clojure.network.ip "0.1.3"]
                 [threatgrid/clj-momo "0.3.3"
                  :exclusions [;provided by metosin/ring-swagger
                               commons-codec]]

                 ;; dependency overrides

                 ;; test.chuck uses an old instaparse
                 [instaparse "1.4.10"
                  :exclusions [org.clojure/clojure]]]

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
