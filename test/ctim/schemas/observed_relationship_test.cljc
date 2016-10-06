(ns ctim.schemas.observed-relationship-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.observed-relationship :as o]
            [ctim.schemas.common :as c]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-observed-relationship-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema-tree o/ObservedRelationship)
         {:id "observed-relationship-123"
          :type "observed-relationship"
          :schema_version c/ctim-schema-version
          :title "title"
          :description "description"
          :short_description "short desc"
          :uri "http://example.com"
          :revision 1
          :external_ids ["foo" "bar"]
          :timestamp #inst "2016-02-11T00:40:48.212-00:00"
          :language "language"
          :tlp "green"
          :source "source"
          :source_uri "http://example.com"
          :relationship_type "targets"
          :source_ref "http://example.com"
          :target_ref "http://example.com"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema-tree o/ObservedRelationship)
         {:id "observed-relationship-123"
          :type "observed-relationship"
          :schema_version c/ctim-schema-version
          :relationship_type "targets"
          :source_ref "http://example.com"
          :target_ref "http://example.com"}))))

(deftest test-new-observed-relationship-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema-tree o/NewObservedRelationship)
         {:id "observed-relationship-123"
          :type "observed-relationship"
          :schema_version c/ctim-schema-version
          :title "title"
          :description "description"
          :short_description "short desc"
          :uri "http://example.com"
          :revision 1
          :external_ids ["foo" "bar"]
          :timestamp #inst "2016-02-11T00:40:48.212-00:00"
          :language "language"
          :tlp "green"
          :source "source"
          :source_uri "http://example.com"
          :relationship_type "targets"
          :source_ref "http://example.com"
          :target_ref "http://example.com"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema-tree o/NewObservedRelationship)
         {:relationship_type "targets"
          :source_ref "http://example.com"
          :target_ref "http://example.com"}))))

(deftest test-stored-observed-relationship-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema-tree o/StoredObservedRelationship)
         {:id "observed-relationship-123"
          :type "observed-relationship"
          :schema_version c/ctim-schema-version
          :title "title"
          :description "description"
          :short_description "short desc"
          :uri "http://example.com"
          :revision 1
          :external_ids ["foo" "bar"]
          :timestamp #inst "2016-02-11T00:40:48.212-00:00"
          :language "language"
          :tlp "green"
          :source "source"
          :source_uri "http://example.com"
          :relationship_type "targets"
          :source_ref "http://example.com"
          :target_ref "http://example.com"
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"})))

  (testing "example with only required fields"
    (is (s/validate
         (fs/->schema-tree o/StoredObservedRelationship)
         {:id "observed-relationship-123"
          :type "observed-relationship"
          :schema_version c/ctim-schema-version
          :relationship_type "targets"
          :source_ref "http://example.com"
          :target_ref "http://example.com"
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"}))))
