(defproject ctim "0.1.0-SNAPSHOT"
  :description "Cisco Threat Intelligence Model"
  :url "http://github.com/threatbrain/ctim"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 ;; what compojure-api 1.0.0 wants
                 [prismatic/schema "1.0.4"]
                 ;; for describe
                 [metosin/ring-swagger "0.22.4"]
                 ;; for merge and such
                 [metosin/schema-tools "0.7.0"]]
  :uberjar-name "ctim.jar"
  :resource-paths ["doc"]
  :profiles {:dev {:dependencies [[cheshire "5.5.0"]
                                  [com.h2database/h2 "1.4.191"]
                                  [org.clojure/test.check "0.9.0"]
                                  [com.gfredericks/test.chuck "0.2.6"]
                                  [prismatic/schema-generators "0.1.0"
                                   :exclusions [prismatic/schema]]]
                   :resource-paths ["model"
                                    "test/resources"]}
             :test {:dependencies [[cheshire "5.5.0"]
                                   [com.h2database/h2 "1.4.191"]
                                   [org.clojure/test.check "0.9.0"]
                                   [com.gfredericks/test.chuck "0.2.6"]
                                   [prismatic/schema-generators "0.1.0"]]
                    :java-source-paths ["hooks/ctia"
                                        "test/java"]
                    :resource-paths ["model"
                                     "test/resources"
                                     "test/resources/hooks/JarHook.jar"
                                     "test/resources/hooks/AutoloadHook.jar"
                                     "test/resources/hooks/hook-example-0.1.0-SNAPSHOT.jar"]}})
