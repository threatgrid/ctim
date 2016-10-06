(ns ctim.schemas.verdict-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.verdict :as v]
            [ctim.schemas.common :as c]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-verdict-schema
  (is (s/validate
       (fs/->schema-tree v/Verdict)
       {:type "verdict"
        :disposition 1
        :disposition_name "Clean"
        :observable {:type "ipv6" :value "foo"}
        :judgement_id "judgement-123"})))

(deftest test-stored-verdict-schema
  (is (s/validate
       (fs/->schema-tree v/StoredVerdict)
       {:id "verdict-123"
        :type "verdict"
        :disposition 1
        :disposition_name "Clean"
        :observable {:type "ipv6" :value "foo"}
        :judgement_id "judgement-123"
        :schema_version c/ctim-schema-version
        :created #inst "2016-02-11T00:40:48.212-00:00"
        :modified #inst "2016-02-11T00:40:48.212-00:00"})))
