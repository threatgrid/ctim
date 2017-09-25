(ns ctim.schemas.feedback-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.feedback :as fb]
            [ctim.schemas.common :as c]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-feedback-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema fb/Feedback)
         {:id "feedback-123"
          :type "feedback"
          :schema_version c/ctim-schema-version
          :revision 1
          :external_ids ["http://ex.tld/ctia/feedback/feedback-123"
                         "http://ex.tld/ctia/feedback/feedback-456"]
          :timestamp #inst "2016-10-01T00:00:00.000-00:00"
          :language "lanugage"
          :tlp "green"
          :source "source"
          :source_uri "http://example.com"
          :feedback -1,
          :entity_id "judgement-123"
          :reason "false positive"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema fb/Feedback)
         {:id "feedback-123"
          :type "feedback"
          :schema_version c/ctim-schema-version
          :entity_id "judgement-123"
          :feedback 0
          :reason "reason"}))))

(deftest test-new-feedback-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema fb/NewFeedback)
         {:id "feedback-123"
          :type "feedback"
          :schema_version c/ctim-schema-version
          :revision 1
          :external_ids ["http://ex.tld/ctia/feedback/feedback-123"
                         "http://ex.tld/ctia/feedback/feedback-456"]
          :timestamp #inst "2016-10-01T00:00:00.000-00:00"
          :language "lanugage"
          :tlp "green"
          :source "source"
          :source_uri "http://example.com"
          :feedback -1,
          :entity_id "judgement-123"
          :reason "false positive"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema fb/NewFeedback)
         {:entity_id "judgement-123"
          :feedback 0
          :reason "reason"}))))

(deftest test-stored-feedback-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema fb/StoredFeedback)
         {:id "feedback-123"
          :type "feedback"
          :schema_version c/ctim-schema-version
          :revision 1
          :external_ids ["http://ex.tld/ctia/feedback/feedback-123"
                         "http://ex.tld/ctia/feedback/feedback-456"]
          :timestamp #inst "2016-10-01T00:00:00.000-00:00"
          :language "lanugage"
          :tlp "green"
          :source "source"
          :source_uri "http://example.com"
          :feedback -1,
          :entity_id "judgement-123"
          :reason "false positive"
          :owner "foouser"
          :groups ["bar"]
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema fb/StoredFeedback)
         {:id "feedback-123"
          :type "feedback"
          :schema_version c/ctim-schema-version
          :entity_id "judgement-123"
          :feedback 0
          :reason "reason"
          :owner "foouser"
          :groups ["bar"]
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"}))))
