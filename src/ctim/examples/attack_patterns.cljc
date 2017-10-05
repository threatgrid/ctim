(ns ctim.examples.attack-patterns
  (:require [ctim.schemas.common :as c]))

(def attack-pattern-maximal
  {:id "attack-pattern-6c5a8540-cec7-4647-abb6-84cd2d2fa544"
   :type "attack-pattern"
   :schema_version c/ctim-schema-version
   :revision 1
   :external_ids ["http://ex.tld/ctia/attack-pattern/cisco-attack-pattern-6c5a8540-cec7-4647-abb6-84cd2d2fa544"
                  "http://ex.tld/ctia/attack-pattern/mitre-attack-pattern--02fefddc-fb1b-423f-a76b-7552dd211d4d"]
   :external_references
   [{:source_name "mitre-attack"
     :external_id "T1067"
     :url "https://attack.mitre.org/wiki/Technique/T1067"
     :description "Description text"
     :hashes ["#section1"]}]
   :timestamp #inst "2016-05-11T00:40:48.212-00:00"
   :language "language"
   :tlp "green"
   :name "Bootkit"
   :description "A bootkit is a malware variant that modifies the boot sectors of a hard drive"
   :kill_chain_phases [{:kill_chain_name "mitre-attack"
                        :phase_name "persistence"}]
   :x_mitre_data_sources ["API monitoring" "MBR" "VBR"]
   :x_mitre_platforms ["Windows Server 2003" "Linux"]
   :x_mitre_contributors ["Philippe Dubois"]})

(def attack-pattern-minimal
  {:id "attack-pattern-6c5a8540-cec7-4647-abb6-84cd2d2fa544"
   :type "attack-pattern"
   :schema_version c/ctim-schema-version
   :name "Bootkit"
   :description "A bootkit is a malware variant that modifies the boot sectors of a hard drive"})

(def new-attack-pattern-maximal
  attack-pattern-maximal)

(def new-attack-pattern-minimal
  {:name "Bootkit"
   :description "A bootkit is a malware variant that modifies the boot sectors of a hard drive"})

(def stored-attack-pattern-maximal
  (into attack-pattern-maximal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))

(def stored-attack-pattern-minimal
  (into attack-pattern-minimal
        {:owner "foouser"
         :groups ["bar"]
         :created #inst "2016-02-11T00:40:48.212-00:00"
         :modified #inst "2016-02-11T00:40:48.212-00:00"}))
