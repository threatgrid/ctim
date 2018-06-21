(ns ctim.examples.vulnerabilities
  (:require [ctim.schemas.common :as c]))

(def vulnerability-maximal
  {:description "Weaponized Microsoft Word document used by admin@338",
   :name "CVE-2012-0158"
   :schema_version c/ctim-schema-version,
   :revision 1,
   :type "vulnerability",
   :source "source",
   :external_ids
   ["http://ex.tld/ctia/vulnerability/cisco-vulnerability-6c5a8540-cec7-4647-abb6-84cd2d2fa544"],
   :short_description "short description",
   :title "title",
   :external_references
   [{:source_name "CWE-2012-0158"
     :external_id "CWE-2012-0158"
     :url "https://nvd.nist.gov/vuln/detail/CVE-2012-0158"
     :description "Improper Neutralization of Directives in Dynamically Evaluated Code ('Eval Injection')"
     :hashes ["#Common_Consequences"]}],
   :source_uri "http://example.com",
   :language "fr",
   :id
   "http://ex.tld/ctia/vulnerability/vulnerability-6c5a8540-cec7-4647-abb6-84cd2d2fa544",
   :tlp "green",
   :timestamp #inst "2010-01-01T00:00:00.000-00:00"})

(def vulnerability-minimal
  {:id "http://ex.tld/ctia/vulnerability/vulnerability-6c5a8540-cec7-4647-abb6-84cd2d2fa544"
   :type "vulnerability"
   :schema_version c/ctim-schema-version
   :name "CVE-2012-0158"})

(def new-vulnerability-maximal
  vulnerability-maximal)

(def new-vulnerability-minimal
  {:name "CVE-2012-0158"})

(def stored-vulnerability-maximal
  (into vulnerability-maximal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))

(def stored-vulnerability-minimal
  (into vulnerability-minimal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))
