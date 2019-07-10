(ns ctim.domain.id-test
  (:require [ctim.domain.id :as id]
            [ctim.generators.id :as gen]
            #?(:clj [clojure.test :refer [deftest is testing]]
               :cljs [cljs.test :refer-macros [deftest is testing]])

            [clojure.test.check.clojure-test
             #?(:clj :refer :cljs :refer-macros) [defspec]]

            #?(:cljs [clojure.test.check :refer-macros [quick-check]])
            [clojure.test.check.properties #?(:clj :refer :cljs :refer-macros) [for-all]]))

(defspec ^:gen spec-new-id-from-short-id
  (for-all [[{:keys [protocol hostname port path-prefix short-id type]} _]
            gen/gen-long-id-with-parts]
    (= (id/map->CtiaId
        {:hostname hostname
         :short-id short-id
         :path-prefix (not-empty path-prefix)
         :port port
         :protocol protocol
         :type type})
       (id/short-id->id type
                        short-id
                        {:protocol protocol
                         :hostname hostname
                         :path-prefix path-prefix
                         :port port}))))

(defspec ^:gen spec-new-id-from-url-id
  (for-all [[{:keys [short-id type]} long-id]
            gen/gen-long-id-with-parts

            local-hostname gen/gen-host
            local-port gen/gen-port
            local-protocol gen/gen-proto
            local-path-prefix gen/gen-path]

    (= (id/map->CtiaId
        {:hostname local-hostname
         :short-id short-id
         :path-prefix (not-empty local-path-prefix)
         :port local-port
         :protocol local-protocol
         :type type})
       (id/localize
        (id/long-id->id long-id)
        {:hostname local-hostname
         :path-prefix local-path-prefix
         :port local-port
         :protocol local-protocol}))))

(deftest test-parsing-and-transforming-ids
  (is (= "http://ctia.com/bar/ctia/sighting/sighting-1aa088c0-e2af-4ec2-91ee-bbec4f93267c"
         (id/long-id
          (id/long-id->id
           "https://foo.net/foo/ctia/sighting/sighting-1aa088c0-e2af-4ec2-91ee-bbec4f93267c")
          {:protocol "http"
           :hostname "ctia.com"
           :path-prefix "/bar"})))
  (is (nil?
       (id/long-id->id
        "https://foo.net/foo/ctia/sighting/some-bad-thing-happened")))
  (is (nil?
       (id/short-id->id
        "sighting"
        "some bad thing happened"
        {:protocol "https"
         :hostname "ctia.example.com"
         :path-prefix "/bar"})))
  (is (nil?
       (id/long-id->id
        "http://www.example.com/not-a-ctia/path/at_all.html"))))

(deftest test-valid-short-id?
  (is (true?  (id/valid-short-id? "foo-7d24c22a-96e3-40fb-81d3-eae158f0770c")))
  (is (true?  (id/valid-short-id? "bar-9baa492f-8ac8-463c-b193-f2d3cc429e3d")))
  (is (false? (id/valid-short-id? "9baa492f-8ac8-463c-b193-f2d3cc429e3d")))
  (is (false? (id/valid-short-id? "foo-123-7d24c22a-96e3-40fb-81d3-eae158f0770c")))
  (is (true?  (id/valid-short-id? "transient:196c5af9-0810-4b11-b04f-542ef5efdd7a"))))

(deftest test-short-id->long-id
  (is (nil? (id/short-id->long-id nil
                                  (constantly
                                   {:protocol "http"
                                    :hostname "ctia.com"
                                    :path-prefix "/bar"}))))

  (is (= "http://ctia.com/bar/ctia/sighting/sighting-1aa088c0-e2af-4ec2-91ee-bbec4f93267c"
         (id/short-id->long-id "sighting-1aa088c0-e2af-4ec2-91ee-bbec4f93267c"
                               (constantly
                                {:protocol "http"
                                 :hostname "ctia.com"
                                 :path-prefix "/bar"})))))

(deftest test-long-id->id
  (testing "with hyphens in the entity type"
    (let [short-id "attack-pattern-d51dfc7b-df40-46a4-9b06-c396e3dfdbcf"]
      (is (= (id/map->CtiaId {:hostname "localhost",
                              :short-id short-id
                              :path-prefix nil,
                              :port 3001,
                              :protocol "http",
                              :type "attack-pattern"})
             (id/long-id->id
              (str "http://localhost:3001/ctia/attack-pattern/" short-id)))))))
