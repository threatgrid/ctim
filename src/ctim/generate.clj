(ns ctim.generate
  (:gen-class)
  (:require [cheshire.core :as json]
            [ctim.generators.schemas :as gen]
            [clojure.string :as str]))

(defn- sample [entity-kw sample-num take-num]
  (take-last take-num
             (gen/sample-by-kw sample-num
                               entity-kw)))

(defn- usage []
  (str "Usage: lein gen <entity>\n"
       "       lein gen <entity> <amount> <complexity>\n"
       "\n"
       "Entity must be one of " (->> gen/kw->generator keys
                                     (map name)
                                     sort
                                     (str/join ", "))
       ".\n"
       "Amount and Complexity may be positive integers.\n"))

(defn -main [& [entity amount complexity]]
  (if (nil? entity)
    (println (usage))
    (let [amount (when amount (bigint amount))
          complexity (when complexity (bigint complexity))
          sample-num (apply max (filter integer? [10 amount complexity]))
          take-num (apply max (filter integer? [1 amount]))]
      (doseq [example (sample (keyword entity) sample-num take-num)]
        (println (str "**** Example " entity " *****"))
        (-> example
            (json/generate-string {:pretty true})
            println)))))
