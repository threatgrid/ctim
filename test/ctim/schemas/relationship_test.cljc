(ns ctim.schemas.relationship-test
  (:require #?(:clj  [clojure.test :refer [deftest is testing use-fixtures]]
               :cljs [cljs.test :refer-macros [deftest is testing use-fixtures]])
            [ctim.schemas.relationship :as o]
            [ctim.schemas.common :as c]
            [flanders.schema :as fs]
            [schema.core :as s]))

(use-fixtures :once (fn [t]
                      (s/with-fn-validation (t))))

(deftest test-observed-relationship-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema-tree o/Relationship)
         {:id "relationship-123"
          :type "relationship"
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
         (fs/->schema-tree o/Relationship)
         {:id "relationship-123"
          :type "relationship"
          :schema_version c/ctim-schema-version
          :relationship_type "targets"
          :source_ref "http://example.com"
          :target_ref "http://example.com"}))))

(deftest test-new-relationship-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema-tree o/NewRelationship)
         {:id "relationship-123"
          :type "relationship"
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
         (fs/->schema-tree o/NewRelationship)
         {:relationship_type "targets"
          :source_ref "http://example.com"
          :target_ref "http://example.com"}))))

(deftest test-stored-relationship-schema
  (testing "example with all possible fields"
    (is (s/validate
         (fs/->schema-tree o/StoredRelationship)
         {:id "relationship-123"
          :type "relationship"
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
         (fs/->schema-tree o/StoredRelationship)
         {:id "relationship-123"
          :type "relationship"
          :schema_version c/ctim-schema-version
          :relationship_type "targets"
          :source_ref "http://example.com"
          :target_ref "http://example.com"
          :owner "foouser"
          :created #inst "2016-02-11T00:40:48.212-00:00"
          :modified #inst "2016-02-11T00:40:48.212-00:00"}))))
