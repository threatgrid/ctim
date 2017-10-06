(ns ctim.specs.fields-test
  (:require
   [clj-momo.test-helpers.core :as mth]
   [clojure.spec :as spec]
   [clojure.test :refer [are deftest testing use-fixtures]]
   [ctim.examples
    [actors :refer [actor-maximal
                    new-actor-maximal
                    stored-actor-maximal
                    actor-minimal
                    new-actor-minimal
                    stored-actor-minimal]]
    [campaigns :refer [campaign-minimal
                       new-campaign-minimal
                       stored-campaign-minimal
                       campaign-maximal
                       new-campaign-maximal
                       stored-campaign-maximal]]
    [coas :refer [coa-maximal
                  new-coa-maximal
                  stored-coa-maximal
                  coa-minimal
                  new-coa-minimal
                  stored-coa-minimal]]
    [exploit-targets :refer [exploit-target-maximal
                             new-exploit-target-maximal
                             stored-exploit-target-maximal
                             exploit-target-minimal
                             new-exploit-target-minimal
                             stored-exploit-target-minimal]]
    [incidents :refer [incident-maximal
                       new-incident-maximal
                       stored-incident-maximal
                       incident-minimal
                       new-incident-minimal
                       stored-incident-minimal]]
    [indicators :refer [indicator-minimal
                        new-indicator-minimal
                        stored-indicator-minimal
                        indicator-maximal
                        new-indicator-maximal
                        stored-indicator-maximal]]
    [judgements :refer [judgement-minimal
                        new-judgement-minimal
                        stored-judgement-minimal
                        judgement-maximal
                        new-judgement-maximal
                        stored-judgement-maximal]]
    [relationships :refer [relationship-minimal
                           new-relationship-minimal
                           stored-relationship-minimal
                           relationship-maximal
                           new-relationship-maximal
                           stored-relationship-maximal]]
    [sightings :refer [sighting-maximal
                       new-sighting-maximal
                       stored-sighting-maximal
                       sighting-minimal
                       new-sighting-minimal
                       stored-sighting-minimal]]]
   [ctim.schemas
    [actor :as actor]
    [campaign :as campaign]
    [coa :as coa]
    [exploit-target :as exploit-target]
    [incident :as incident]
    [indicator :as indicator]
    [judgement :as judgement]
    [relationship :as relationship]
    [sighting :as sighting]]
   [ctim.test-helpers.core :as th
    :refer [rand-str
            short-id-str
            long-id-str
            transient-id-str]]))

(use-fixtures :once
  th/fixture-spec-validation
  th/fixture-fast-gen
  mth/fixture-schema-validation
  (th/fixture-spec actor/Actor
                   "test.actor")
  (th/fixture-spec actor/NewActor
                   "test.new-actor")
  (th/fixture-spec actor/StoredActor
                   "test.stored-actor")

  (th/fixture-spec campaign/Campaign
                   "test.campaign")
  (th/fixture-spec campaign/NewCampaign
                   "test.new-campaign")
  (th/fixture-spec campaign/StoredCampaign
                   "test.stored-campaign")

  (th/fixture-spec coa/COA
                   "test.coa")
  (th/fixture-spec coa/NewCOA
                   "test.new-coa")
  (th/fixture-spec coa/StoredCOA
                   "test.stored-coa")

  (th/fixture-spec exploit-target/ExploitTarget
                   "test.exploit-target")
  (th/fixture-spec exploit-target/NewExploitTarget
                   "test.new-exploit-target")
  (th/fixture-spec exploit-target/StoredExploitTarget
                   "test.stored-exploit-target")

  (th/fixture-spec incident/Incident
                   "test.incident")
  (th/fixture-spec incident/NewIncident
                   "test.new-incident")
  (th/fixture-spec incident/StoredIncident
                   "test.stored-incident")

  (th/fixture-spec indicator/Indicator
                   "test.indicator")
  (th/fixture-spec indicator/NewIndicator
                   "test.new-indicator")
  (th/fixture-spec indicator/StoredIndicator
                   "test.stored-indicator")

  (th/fixture-spec judgement/Judgement
                   "test.judgement")
  (th/fixture-spec judgement/NewJudgement
                   "test.new-judgement")
  (th/fixture-spec judgement/StoredJudgement
                   "test.stored-judgement")

  (th/fixture-spec relationship/Relationship
                   "test.relationship")
  (th/fixture-spec relationship/NewRelationship
                   "test.new-relationship")
  (th/fixture-spec relationship/StoredRelationship
                   "test.stored-relationship")

  (th/fixture-spec sighting/Sighting
                   "test.sighting")
  (th/fixture-spec sighting/NewSighting
                   "test.new-sighting")
  (th/fixture-spec sighting/StoredSighting
                   "test.stored-sighting"))

(def ^:dynamic *type-sym* nil)
(def ^:dynamic *example-sym* nil)

(defn get-type-kw [type-variety]
  (-> (condp = type-variety
        'plain  (str "test."        *type-sym*)
        'new    (str "test.new-"    *type-sym*)
        'stored (str "test.stored-" *type-sym*))
      (keyword "map")))

(def get-example
  (let [examples
        {'actor {'maximal {'plain  actor-maximal
                           'new    new-actor-maximal
                           'stored stored-actor-maximal}
                 'minimal {'plain  actor-minimal
                           'new    new-actor-minimal
                           'stored stored-actor-minimal}}
         'campaign {'maximal {'plain  campaign-maximal
                              'new    new-campaign-maximal
                              'stored stored-campaign-maximal}
                    'minimal {'plain  campaign-minimal
                              'new    new-campaign-minimal
                              'stored stored-campaign-minimal}}
         'coa {'maximal {'plain  coa-maximal
                         'new    new-coa-maximal
                         'stored stored-coa-maximal}
               'minimal {'plain  coa-minimal
                         'new    new-coa-minimal
                         'stored stored-coa-minimal}}
         'exploit-target {'maximal {'plain  exploit-target-maximal
                                    'new    new-exploit-target-maximal
                                    'stored stored-exploit-target-maximal}
                          'minimal {'plain  exploit-target-minimal
                                    'new    new-exploit-target-minimal
                                    'stored stored-exploit-target-maximal}}
         'incident {'maximal {'plain  incident-maximal
                              'new    new-incident-maximal
                              'stored stored-incident-maximal}
                    'minimal {'plain  incident-minimal
                              'new    new-incident-minimal
                              'stored stored-incident-minimal}}
         'indicator {'minimal {'plain indicator-minimal
                               'new   new-indicator-minimal
                               'stored stored-indicator-minimal}
                     'maximal {'plain indicator-maximal
                               'new   new-indicator-maximal
                               'stored stored-indicator-maximal}}
         'judgement {'minimal {'plain judgement-minimal
                               'new   new-judgement-minimal
                               'stored stored-judgement-minimal}
                     'maximal {'plain judgement-maximal
                               'new   new-judgement-maximal
                               'stored stored-judgement-maximal}}
         'relationship {'minimal {'plain relationship-minimal
                                  'new   new-relationship-minimal
                                  'stored stored-relationship-minimal}
                        'maximal {'plain relationship-maximal
                                  'new   new-relationship-maximal
                                  'stored stored-relationship-maximal}}
         'sighting {'maximal {'plain  sighting-maximal
                              'new    new-sighting-maximal
                              'stored stored-sighting-maximal}
                    'minimal {'plain  sighting-minimal
                              'new    new-sighting-minimal
                              'stored stored-sighting-minimal}}}]
    (fn get-example-impl [type-variety]
      (get-in examples [*type-sym* *example-sym* type-variety]))))

(defn test-pos-int [key]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key)
      (are [expected value spec entity]
          (= expected
             (spec/valid? spec
                          (assoc entity key value)))
        false nil plain-kw  plain-ex
        false nil new-kw    new-ex
        false nil stored-kw stored-ex
        false -1  plain-kw  plain-ex
        false -1  new-kw    new-ex
        false -1  stored-kw stored-ex
        true  0   plain-kw  plain-ex
        true  0   new-kw    new-ex
        true  0   stored-kw stored-ex
        true  1   plain-kw  plain-ex
        true  1   new-kw    new-ex
        true  1   stored-kw stored-ex
        true  1000000 plain-kw  plain-ex
        true  1000000 new-kw    new-ex
        true  1000000 stored-kw stored-ex))))

(defn test-uri [key]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key)
      (are [expected value spec entity]
          (= expected
             (spec/valid? spec
                          (assoc entity key value)))
        false nil   plain-kw plain-ex
        false nil   new-kw new-ex
        false nil   stored-kw stored-ex
        false ""    plain-kw plain-ex
        false ""    new-kw new-ex
        false ""    stored-kw stored-ex
        true  "foo" plain-kw plain-ex
        true  "foo" new-kw new-ex
        true  "foo" stored-kw stored-ex
        false ")^^)&)&" plain-kw plain-ex
        false ")^^)&)&" new-kw new-ex
        false ")^^)&)&" stored-kw stored-ex
        true  "http://www.example.com" plain-kw plain-ex
        true  "http://www.example.com" new-kw new-ex
        true  "http://www.example.com" stored-kw stored-ex))))

(defn test-uri-in [key-path]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key-path)
      (are [expected value spec entity]
          (= expected
             (spec/valid? spec
                          (assoc-in entity key-path value)))
        false nil   plain-kw plain-ex
        false nil   new-kw new-ex
        false nil   stored-kw stored-ex
        false ""    plain-kw plain-ex
        false ""    new-kw new-ex
        false ""    stored-kw stored-ex
        true  "foo" plain-kw plain-ex
        true  "foo" new-kw new-ex
        true  "foo" stored-kw stored-ex
        false ")^^)&)&" plain-kw plain-ex
        false ")^^)&)&" new-kw new-ex
        false ")^^)&)&" stored-kw stored-ex
        true  "http://www.example.com" plain-kw plain-ex
        true  "http://www.example.com" new-kw new-ex
        true  "http://www.example.com" stored-kw stored-ex))))

(defn test-uri-seq [key]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key)
      (are [expected value spec entity]
          (= expected
             (spec/valid? spec
                          (assoc entity key value)))
        false nil   plain-kw plain-ex
        false nil   new-kw new-ex
        false nil   stored-kw stored-ex
        false [nil] plain-kw plain-ex
        false [nil] new-kw new-ex
        false [nil] stored-kw stored-ex
        false [""]  plain-kw plain-ex
        false [""]  new-kw new-ex
        false [""]  stored-kw stored-ex
        true  ["foo"] plain-kw plain-ex
        true  ["foo"] new-kw new-ex
        true  ["foo"] stored-kw stored-ex
        false [")^^)&)&"] plain-kw plain-ex
        false [")^^)&)&"] new-kw new-ex
        false [")^^)&)&"] stored-kw stored-ex
        true  ["http://www.example.com"] plain-kw plain-ex
        true  ["http://www.example.com"] new-kw new-ex
        true  ["http://www.example.com"] stored-kw stored-ex))))

(defn test-uri-seq-in [key-path]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key-path)
      (are [expected value spec entity]
          (= expected
             (spec/valid? spec
                          (assoc-in entity key-path value)))
        false nil   plain-kw plain-ex
        false nil   new-kw new-ex
        false nil   stored-kw stored-ex
        false [nil] plain-kw plain-ex
        false [nil] new-kw new-ex
        false [nil] stored-kw stored-ex
        false [""]  plain-kw plain-ex
        false [""]  new-kw new-ex
        false [""]  stored-kw stored-ex
        true  ["foo"] plain-kw plain-ex
        true  ["foo"] new-kw new-ex
        true  ["foo"] stored-kw stored-ex
        false [")^^)&)&"] plain-kw plain-ex
        false [")^^)&)&"] new-kw new-ex
        false [")^^)&)&"] stored-kw stored-ex
        true  ["http://www.example.com"] plain-kw plain-ex
        true  ["http://www.example.com"] new-kw new-ex
        true  ["http://www.example.com"] stored-kw stored-ex))))

(defn test-short-string [key]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key)
      (are [expected value spec entity]
          (= expected
             (spec/valid? spec
                          (assoc entity key value)))
          false nil              plain-kw  plain-ex
          false nil              new-kw    new-ex
          false nil              stored-kw stored-ex
          true  ""               plain-kw  plain-ex
          true  ""               new-kw    new-ex
          true  ""               stored-kw stored-ex
          true  (rand-str 100)   plain-kw  plain-ex
          true  (rand-str 100)   new-kw    new-ex
          true  (rand-str 100)   stored-kw stored-ex
          true  (rand-str 1024)  plain-kw  plain-ex
          true  (rand-str 1024)  new-kw    new-ex
          true  (rand-str 1024)  stored-kw stored-ex
          false (rand-str 1025)  plain-kw  plain-ex
          false (rand-str 1025)  new-kw    new-ex
          false (rand-str 1025)  stored-kw stored-ex
          false (rand-str 5000)  plain-kw  plain-ex
          false (rand-str 5000)  new-kw    new-ex
          false (rand-str 5000)  stored-kw stored-ex))))

(defn test-short-string-seq [key]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key)
      (are [expected value spec entity]
          (= expected
             (spec/valid? spec
                          (assoc entity key value)))
          false nil                plain-kw  plain-ex
          false nil                new-kw    new-ex
          false nil                stored-kw stored-ex
          false [nil]              plain-kw  plain-ex
          false [nil]              new-kw    new-ex
          false [nil]              stored-kw stored-ex
          true [""]                plain-kw  plain-ex
          true [""]                new-kw    new-ex
          true [""]                stored-kw stored-ex
          true [(rand-str 100)]    plain-kw  plain-ex
          true [(rand-str 100)]    new-kw    new-ex
          true [(rand-str 100)]    stored-kw stored-ex
          true [(rand-str 1024)]   plain-kw  plain-ex
          true [(rand-str 1024)]   new-kw    new-ex
          true [(rand-str 1024)]   stored-kw stored-ex
          false [(rand-str 1025)]  plain-kw  plain-ex
          false [(rand-str 1025)]  new-kw    new-ex
          false [(rand-str 1025)]  stored-kw stored-ex
          false [(rand-str 5000)]  plain-kw  plain-ex
          false [(rand-str 5000)]  new-kw    new-ex
          false [(rand-str 5000)]  stored-kw stored-ex))))

(defn test-short-string-seq-in [key-path]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key-path)
      (are [expected value spec entity]
          (= expected
             (spec/valid? spec
                          (assoc-in entity key-path value)))
          false nil                plain-kw  plain-ex
          false nil                new-kw    new-ex
          false nil                stored-kw stored-ex
          false [nil]              plain-kw  plain-ex
          false [nil]              new-kw    new-ex
          false [nil]              stored-kw stored-ex
          true [""]                plain-kw  plain-ex
          true [""]                new-kw    new-ex
          true [""]                stored-kw stored-ex
          true [(rand-str 100)]    plain-kw  plain-ex
          true [(rand-str 100)]    new-kw    new-ex
          true [(rand-str 100)]    stored-kw stored-ex
          true [(rand-str 1024)]   plain-kw  plain-ex
          true [(rand-str 1024)]   new-kw    new-ex
          true [(rand-str 1024)]   stored-kw stored-ex
          false [(rand-str 1025)]  plain-kw  plain-ex
          false [(rand-str 1025)]  new-kw    new-ex
          false [(rand-str 1025)]  stored-kw stored-ex
          false [(rand-str 5000)]  plain-kw  plain-ex
          false [(rand-str 5000)]  new-kw    new-ex
          false [(rand-str 5000)]  stored-kw stored-ex))))

(defn test-short-string-in [key-path]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key-path)
      (are [expected value spec entity]
          (= expected
             (spec/valid? spec
                          (assoc-in entity key-path value)))
          false nil              plain-kw  plain-ex
          false nil              new-kw    new-ex
          false nil              stored-kw stored-ex
          true  ""               plain-kw  plain-ex
          true  ""               new-kw    new-ex
          true  ""               stored-kw stored-ex
          true  (rand-str 100)   plain-kw  plain-ex
          true  (rand-str 100)   new-kw    new-ex
          true  (rand-str 100)   stored-kw stored-ex
          true  (rand-str 1024)  plain-kw  plain-ex
          true  (rand-str 1024)  new-kw    new-ex
          true  (rand-str 1024)  stored-kw stored-ex
          false (rand-str 1025)  plain-kw  plain-ex
          false (rand-str 1025)  new-kw    new-ex
          false (rand-str 1025)  stored-kw stored-ex
          false (rand-str 5000)  plain-kw  plain-ex
          false (rand-str 5000)  new-kw    new-ex
          false (rand-str 5000)  stored-kw stored-ex))))

(defn test-medium-string [key]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key)
      (are [expected value spec entity]
          (= expected
             (spec/valid? spec
                          (assoc entity key value)))
          false nil              plain-kw  plain-ex
          false nil              new-kw    new-ex
          false nil              stored-kw stored-ex
          true  ""               plain-kw  plain-ex
          true  ""               new-kw    new-ex
          true  ""               stored-kw stored-ex
          true  (rand-str 100)   plain-kw  plain-ex
          true  (rand-str 100)   new-kw    new-ex
          true  (rand-str 100)   stored-kw stored-ex
          true  (rand-str 2048)  plain-kw  plain-ex
          true  (rand-str 2048)  new-kw    new-ex
          true  (rand-str 2048)  stored-kw stored-ex
          false (rand-str 2049)  plain-kw  plain-ex
          false (rand-str 2049)  new-kw    new-ex
          false (rand-str 2049)  stored-kw stored-ex
          false (rand-str 5000)  plain-kw  plain-ex
          false (rand-str 5000)  new-kw    new-ex
          false (rand-str 5000)  stored-kw stored-ex))))

(defn test-medium-string-in [key-path]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key-path)
      (are [expected value spec entity]
          (= expected
             (spec/valid? spec
                          (assoc-in entity key-path value)))
          false nil              plain-kw  plain-ex
          false nil              new-kw    new-ex
          false nil              stored-kw stored-ex
          true  ""               plain-kw  plain-ex
          true  ""               new-kw    new-ex
          true  ""               stored-kw stored-ex
          true  (rand-str 100)   plain-kw  plain-ex
          true  (rand-str 100)   new-kw    new-ex
          true  (rand-str 100)   stored-kw stored-ex
          true  (rand-str 2048)  plain-kw  plain-ex
          true  (rand-str 2048)  new-kw    new-ex
          true  (rand-str 2048)  stored-kw stored-ex
          false (rand-str 2049)  plain-kw  plain-ex
          false (rand-str 2049)  new-kw    new-ex
          false (rand-str 2049)  stored-kw stored-ex
          false (rand-str 5000)  plain-kw  plain-ex
          false (rand-str 5000)  new-kw    new-ex
          false (rand-str 5000)  stored-kw stored-ex))))

(defn test-medium-string-seq [key]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key)
      (are [expected value spec entity]
          (= expected
             (spec/valid? spec
                          (assoc entity key value)))
          false  nil              plain-kw  plain-ex
          false  nil              new-kw    new-ex
          false  nil              stored-kw stored-ex
          false [nil]             plain-kw  plain-ex
          false [nil]             new-kw    new-ex
          false [nil]             stored-kw stored-ex
          true  [""]              plain-kw  plain-ex
          true  [""]              new-kw    new-ex
          true  [""]              stored-kw stored-ex
          true  [(rand-str 100)]  plain-kw  plain-ex
          true  [(rand-str 100)]  new-kw    new-ex
          true  [(rand-str 100)]  stored-kw stored-ex
          true  [(rand-str 2048)] plain-kw  plain-ex
          true  [(rand-str 2048)] new-kw    new-ex
          true  [(rand-str 2048)] stored-kw stored-ex
          false [(rand-str 2049)] plain-kw  plain-ex
          false [(rand-str 2049)] new-kw    new-ex
          false [(rand-str 2049)] stored-kw stored-ex
          false [(rand-str 5000)] plain-kw  plain-ex
          false [(rand-str 5000)] new-kw    new-ex
          false [(rand-str 5000)] stored-kw stored-ex))))

(defn test-long-string [key]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key)
         (are [expected value spec entity]
             (= expected
                (spec/valid? spec
                             (assoc entity key value)))
             false nil              plain-kw  plain-ex
             false nil              new-kw    new-ex
             false nil              stored-kw stored-ex
             true  ""               plain-kw  plain-ex
             true  ""               new-kw    new-ex
             true  ""               stored-kw stored-ex
             true  (rand-str 100)   plain-kw  plain-ex
             true  (rand-str 100)   new-kw    new-ex
             true  (rand-str 100)   stored-kw stored-ex
             true  (rand-str 1000)  plain-kw  plain-ex
             true  (rand-str 1000)  new-kw    new-ex
             true  (rand-str 1000)  stored-kw stored-ex
             true  (rand-str 5000)  plain-kw  plain-ex
             true  (rand-str 5000)  new-kw    new-ex
             true  (rand-str 5000)  stored-kw stored-ex
             false (rand-str 5001)  plain-kw  plain-ex
             false (rand-str 5001)  new-kw    new-ex
             false (rand-str 5001)  stored-kw stored-ex
             false (rand-str 10000) plain-kw  plain-ex
             false (rand-str 10000) new-kw    new-ex
             false (rand-str 10000) stored-kw stored-ex))))

(defn test-long-string-in [key-path]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str key-path)
      (are [expected value spec entity]
          (= expected
             (spec/valid? spec
                          (assoc-in entity key-path value)))
          false nil              plain-kw  plain-ex
          false nil              new-kw    new-ex
          false nil              stored-kw stored-ex
          true  ""               plain-kw  plain-ex
          true  ""               new-kw    new-ex
          true  ""               stored-kw stored-ex
          true  (rand-str 100)   plain-kw  plain-ex
          true  (rand-str 100)   new-kw    new-ex
          true  (rand-str 100)   stored-kw stored-ex
          true  (rand-str 1000)  plain-kw  plain-ex
          true  (rand-str 1000)  new-kw    new-ex
          true  (rand-str 1000)  stored-kw stored-ex
          true  (rand-str 5000)  plain-kw  plain-ex
          true  (rand-str 5000)  new-kw    new-ex
          true  (rand-str 5000)  stored-kw stored-ex
          false (rand-str 5001)  plain-kw  plain-ex
          false (rand-str 5001)  new-kw    new-ex
          false (rand-str 5001)  stored-kw stored-ex
          false (rand-str 10000) plain-kw  plain-ex
          false (rand-str 10000) new-kw    new-ex
          false (rand-str 10000) stored-kw stored-ex))))

(defn test-id []
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing "ID"
      (are [expected value-fn spec entity]
          (= expected
             (spec/valid? spec
                          (assoc entity :id (value-fn entity))))
          false (constantly nil)   plain-kw  plain-ex
          false (constantly nil)   new-kw    new-ex
          false (constantly nil)   stored-kw stored-ex
          true  long-id-str        plain-kw  plain-ex
          true  long-id-str        new-kw    new-ex
          true  long-id-str        stored-kw stored-ex
          false short-id-str       plain-kw  plain-ex
          false short-id-str       new-kw    new-ex
          true  short-id-str       stored-kw stored-ex
          true  transient-id-str   plain-kw  plain-ex
          true  transient-id-str   new-kw    new-ex
          false transient-id-str   stored-kw stored-ex))))

(defn test-reference [kw]
  (let [plain-kw  (get-type-kw 'plain)
        new-kw    (get-type-kw 'new)
        stored-kw (get-type-kw 'stored)

        plain-ex  (get-example 'plain)
        new-ex    (get-example 'new)
        stored-ex (get-example 'stored)]
    (testing (pr-str kw)
      (are [expected value-fn spec entity]
          (= expected
             (spec/valid? spec
                          (assoc entity kw (value-fn entity))))
          false (constantly nil)   plain-kw  plain-ex
          false (constantly nil)   new-kw    new-ex
          false (constantly nil)   stored-kw stored-ex
          true  long-id-str        plain-kw  plain-ex
          true  long-id-str        new-kw    new-ex
          true  long-id-str        stored-kw stored-ex
          false short-id-str       plain-kw  plain-ex
          false short-id-str       new-kw    new-ex
          false  short-id-str       stored-kw stored-ex
          true  transient-id-str   plain-kw  plain-ex
          true  transient-id-str   new-kw    new-ex
          false transient-id-str   stored-kw stored-ex))))

(deftest test-field-validators

  (testing "Actor"
    (binding [*type-sym* 'actor]
      (binding [*example-sym* 'minimal]
        (test-long-string :description)

        (test-medium-string :short_description)

        (test-short-string :language)

        (test-short-string :title)

        (test-medium-string :source)

        (test-uri :source_uri)

        (test-long-string :planning_and_operational_support)

        (test-pos-int :revision))

      (binding [*example-sym* 'maximal]
        (test-id)

        (test-uri-in [:identity :related_identities 0 :identity]))))

  (testing "Campaign"
    (binding [*type-sym* 'campaign]
      (binding [*example-sym* 'minimal]
        (test-long-string :description)

        (test-medium-string :short_description)

        (test-short-string :language)

        (test-short-string :title)

        (test-medium-string :source)

        (test-uri :source_uri)

        (test-short-string :campaign_type)

        (test-short-string-seq :names)

        (test-pos-int :revision))

      (binding [*example-sym* 'maximal]
        (test-id))))

  (testing "COA"
    (binding [*type-sym* 'coa]
      (binding [*example-sym* 'minimal]
        (test-long-string :description)

        (test-medium-string :short_description)

        (test-short-string :language)

        (test-short-string :title)

        (test-medium-string :source)

        (test-uri :source_uri)

        (test-pos-int :revision))

      (binding [*example-sym* 'maximal]
        (test-id)

        (test-short-string-in [:open_c2_coa :id])

        (test-short-string-in [:open_c2_coa :target :type])

        (test-short-string-in [:open_c2_coa :target :specifiers])

        (test-short-string-seq-in [:open_c2_coa :actuator :specifiers])

        (test-short-string-in [:open_c2_coa :modifiers
                               :additional_properties :context])

        (test-short-string-in [:open_c2_coa :modifiers :frequency])

        (test-short-string-in [:open_c2_coa :modifiers :id])

        (test-short-string-in [:open_c2_coa :modifiers :source])

        (test-short-string-in [:open_c2_coa :modifiers :option])

        (test-short-string-seq :objective))

      (binding [*example-sym* 'minimal]
        (test-short-string :impact))))

  (testing "ExploitTarget"
    (binding [*type-sym* 'exploit-target]
      (binding [*example-sym* 'minimal]
        (test-long-string :description)

        (test-medium-string :short_description)

        (test-short-string :language)

        (test-short-string :title)

        (test-medium-string :source)

        (test-uri :source_uri)

        (test-pos-int :revision))

      (binding [*example-sym* 'maximal]
        (test-id)

        (test-short-string-in [:vulnerability 0 :title])

        (test-long-string-in [:vulnerability 0 :description])

        (test-medium-string-in [:vulnerability 0 :short_description])

        (test-short-string-in [:vulnerability 0 :cve_id])

        (test-short-string-in [:vulnerability 0 :source])

        (test-uri-seq-in [:vulnerability 0 :references])

        (test-short-string-seq-in [:vulnerability 0 :affected_software])

        (test-long-string-in [:weakness 0 :description])

        (test-short-string-in [:weakness 0 :cwe_id])

        (test-long-string-in [:configuration 0 :description])

        (test-medium-string-in [:configuration 0 :short_description])

        (test-short-string-in [:configuration 0 :cce_id]))))

  (testing "Incident"
    (binding [*type-sym* 'incident]
      (binding [*example-sym* 'minimal]
        (test-long-string :description)

        (test-medium-string :short_description)

        (test-short-string :language)

        (test-short-string :title)

        (test-medium-string :source)

        (test-uri :source_uri)

        (test-short-string :reporter)

        (test-short-string :responder)

        (test-short-string :coordinator)

        (test-short-string :victim)

        (test-short-string :contact)

        (test-pos-int :revision))

      (binding [*example-sym* 'maximal]
        (test-id)

        (test-long-string-in [:affected_assets
                              0
                              :property_affected
                              :description_of_effect])

        (test-short-string-in [:affected_assets
                               0
                               :property_affected
                               :type_of_availability_loss])

        (test-short-string-in [:affected_assets 0 :type])

        (test-long-string-in [:affected_assets 0 :description])

        (test-short-string-in [:impact_assessment
                               :total_loss_estimation
                               :actual_total_loss_estimation
                               :iso_currency_code])

        (test-long-string-in [:history 0 :journal_entry]))))

  (testing "Indicator"
    (binding [*type-sym* 'indicator]
      (binding [*example-sym* 'minimal]
        (test-long-string :description)

        (test-medium-string :short_description)

        (test-short-string :language)

        (test-short-string :title)

        (test-medium-string :source)

        (test-uri :source_uri)

        (test-short-string :producer)

        (test-short-string-seq :tags)

        (test-long-string :likely_impact)

        (test-medium-string-seq :kill_chain_phases)

        (test-medium-string-seq :test_mechanisms)

        (test-pos-int :revision))
      (binding [*example-sym* 'maximal]
        (test-id))))

  (testing "Judgement"
    (binding [*type-sym* 'judgement]
      (binding [*example-sym* 'minimal]
        (test-medium-string :source)

        (test-uri :source_uri)

        (test-short-string :reason)

        (test-uri :reason_uri)

        (test-pos-int :revision))
      (binding [*example-sym* 'maximal]
        (test-id))))

  (testing "Relationship"
    (binding [*type-sym* 'relationship]
      (binding [*example-sym* 'maximal]
        (test-id)
        (test-reference :source_ref)
        (test-reference :target_ref))))

  (testing "Sighting"
    (binding [*type-sym* 'sighting]
      (binding [*example-sym* 'minimal]
        (test-long-string :description)

        (test-medium-string :short_description)

        (test-short-string :language)

        (test-short-string :title)

        (test-medium-string :source)

        (test-uri :source_uri)

        (test-pos-int :revision))

      (binding [*example-sym* 'maximal]
        (test-id)

        (test-uri-in [:relations 0 :origin_uri])))))
