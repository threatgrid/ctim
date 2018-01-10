(ns ctim.test-helpers.properties
  (:require [clojure.spec.alpha :as cs]
            [clojure.string :as str]
            [clojure.test.check.properties :refer [for-all]]
            [ctim.domain.id :as id]
            [ctim.schemas.common :as c]))

(defn generated-entity-is-valid
  ([spec]
   (generated-entity-is-valid spec (cs/gen spec)))
  ([spec gen]
   (for-all [entity gen]
            (cs/valid? spec entity))))

(defn generated-entity-id-is-valid
  ([spec entity-type]
   (generated-entity-id-is-valid spec entity-type false (cs/gen spec)))
  ([spec entity-type optional?]
   (generated-entity-id-is-valid spec entity-type optional? (cs/gen spec)))
  ([spec entity-type optional? gen]
   (for-all [entity gen]
            (let [id (:id entity)]
              (if (and optional?
                       (nil? id))
                true
                (and (string? id)
                     (str/includes? id entity-type)
                     (re-matches id/long-id-re id)))))))

(defn generated-entity-has-ctim-schema-version [spec]
  (for-all [entity (cs/gen spec)]
           (let [schema-version (:schema_version entity)]
             (= schema-version
                c/ctim-schema-version))))
