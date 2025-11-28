(defproject threatgrid/ctim "1.3.29-SNAPSHOT"
  :description "Cisco Threat Intelligence Model"
  :url "http://github.com/threatgrid/ctim"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :pedantic? :abort
  :managed-dependencies [[potemkin "0.4.7"]
                         [javax.xml.bind/jaxb-api "2.4.0-b180830.0359"]
                         [com.google.guava/guava "19.0"]]
  :dependencies [[org.clojure/clojure "1.12.3"]
                 [prismatic/schema "1.4.1"]
                 [com.google.protobuf/protobuf-java "4.32.1"] ;clj-momo > org.clojure/clojurescript
                 [threatgrid/clj-momo "0.4.1"]
                 [org.mozilla/rhino "1.8.0"] ;threatgrid/flanders > kovacnica/clojure.network.ip
                 [threatgrid/flanders "1.1.0"]
                 [metosin/ring-swagger "1.0.0"]
                 [org.clojure/test.check "1.1.1"]
                 [com.gfredericks/test.chuck "0.2.15"]
                 [prismatic/schema-generators "0.1.5"]
                 [kovacnica/clojure.network.ip "0.1.5"]]

  :uberjar-name "ctim.jar"
  :resource-paths ["doc"]

  :plugins [[lein-cljsbuild "1.1.7"]
            [com.google.guava/guava "20.0"] ;resolve internal conflict in `lein-doo`
            [lein-doo "0.1.11" :exclusions [org.clojure/clojure]]
            ;;uncomment for lein-git-down
            #_[reifyhealth/lein-git-down "0.3.5"]]

  ;;uncomment for lein-git-down
  ;:middleware [lein-git-down.plugin/inject-properties]
  ;:repositories [["public-github" {:url "git://github.com"}]
  ;               ["private-github" {:url "git://github.com" :protocol :ssh}]]

  :release-tasks [["clean"]
                  ["doc"]
                  ;; this command will fail if `lein doc` generates anything new
                  ;; please commit it and try again
                  ["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ;; will fail if project.clj doesn't already have -SNAPSHOT version
                  ["vcs" "commit"]
                  ["vcs" "tag" "--no-sign"]
                  ["deploy" "clojars"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ;; fails if no upstream branch is defined
                  ;; if it fails at this point you can complete the release using:
                  ;; git push --tags --set-upstream origin release-x.y.z
                  ["vcs" "push"]]

  :aliases  {"doc" ^{:doc "Generate documentation"} ["run" "-m" "ctim.document"]
             "docs" ^{:doc "Generate documentation"} ["doc"]
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
             {:dependencies [;https://clojure.atlassian.net/browse/CLJS-3047
                             [com.google.errorprone/error_prone_annotations "2.1.3"]
                             ;;https://clojure.atlassian.net/browse/CLJS-3047
                             [com.google.code.findbugs/jsr305 "3.0.2"]
                             [org.clojure/clojurescript "1.12.42"]]}})
