(ns ctim.examples.tools
  (:require [ctim.schemas.common :as c]))

(def tool-maximal
  {:id "tool-0663cefa-c8f0-48c2-aefd-e9fbf84551ce"
   :type "tool"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["http://ex.tld/ctia/tool/cisco-tool-0663cefa-c8f0-48c2-aefd-e9fbf84551ce"
                  "http://ex.tld/ctia/tool/mitre-tool--bba595da-b73a-4354-aa6c-224d4de7cb4e"]
   :external_references
   [{:source_name "TechNet Dir"
     :external_id "S0004"
     :url "https://technet.microsoft.com/en-us/library/cc755121.aspx"
     :description "Microsoft. (n.d.). Dir. Retrieved April 18, 2016."
     :hashes ["#section1"]}]
   :timestamp #inst "2016-05-11T00:40:48.212-00:00"
   :language "language"
   :tlp "green"
   :name "cmd"
   :labels ["tool"]
   :description "cmd is the Windows command-line interpreter"
   :kill_chain_phases [{:kill_chain_name "mitre-attack"
                        :phase_name "persistence"}]
   :tool_version "2.5.3"
   :x_mitre_aliases ["cmd.exe"]})

(def tool-minimal
  {:id "tool-0663cefa-c8f0-48c2-aefd-e9fbf84551ce"
   :type "tool"
   :schema_version c/ctim-schema-version
   :name "cmd"
   :labels ["tool"]})

(def new-tool-maximal
  tool-maximal)

(def new-tool-minimal
  {:name "cmd"
   :labels ["tool"]})

(def stored-tool-maximal
  (into tool-maximal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))

(def stored-tool-minimal
  (into tool-minimal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))
