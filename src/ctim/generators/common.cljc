(ns ctim.generators.common
  (:refer-clojure :exclude [vector set])
  (:require [clj-momo.lib.clj-time.core :as time]
            [clojure.test.check.generators :as gen]
            [schema-generators.complete :as sec]
            [schema-generators.generators :as seg]
            [schema.core :as s]))

(def generator-complexity 6)

(defn ^{:deprecated "1.0.15"} gen-vector
  "Build a vector generator (like gen/vector) that uses a
   max-complexity to limit the size of the generated sequences.
   Note that this overrides optional inputs like quantity or min/max
   such that max-complexity is honored.
  
   WARNING: Does not conform to gen/vector spec,
   do not redef gen/vector with this function."
  [max-complexity]
  (let [orig-vector gen/vector]
    (fn vector
      ([generator]
       (gen/bind (gen/choose 1 max-complexity)
                 (fn [mc]
                   (orig-vector generator 0 mc))))
      ([generator quantity]
       (orig-vector generator (min quantity max-complexity)))
      ([generator min- max-]
       (orig-vector generator
                    (min min- max-complexity)
                    (min max- max-complexity))))))

(def ^{:deprecated "1.0.15"} vector
  "WARNING: Does not conform to gen/vector spec,
  do not redef gen/vector with this function."
  (gen-vector generator-complexity))


(defn ^{:deprecated "1.0.15"} gen-set
  "Build a set generator (like gen/set) that uses a
   max-complexity to limit the size of the generated sequences.
   Note that this overrides optional inputs like quantity or min/max
   such that max-complexity is honored.
  
   WARNING: Does not conform to gen/set spec,
   do not redef gen/set with this function."
  [max-complexity]
  (let [orig-set gen/set]
    (fn vector
      ([generator]
       (gen/bind (gen/choose 1 max-complexity)
                 (fn [mc]
                   (orig-set generator
                             {:min-elements 0
                              :max-elements mc}))))
      ([generator quantity]
       (orig-set generator
                 {:min-elements (min quantity max-complexity)}))
      ([generator min- max-]
       (orig-set generator
                 {:min-elements (min min- max-complexity)
                  :max-elements (min max- max-complexity)})))))

(def ^{:deprecated "1.0.15"} set
  "WARNING: Does not conform to gen/set spec,
  do not redef gen/set with this function."
  (gen-set generator-complexity))

(defn ^{:deprecated "1.0.15"} generator
  "WARNING: Overrides gen/vector with a non-conformant
  function.

  Alternative to schema-generators.generators/generator that limits
   the size of generated vectors (complex objects can take too long to
   generate).  Note that it uses with-redefs to replace the vector
   generator with gen-vector (see above)."
  [schema & args]
  (with-redefs [gen/vector vector]
    (apply (partial seg/generator schema) args)))

(defn maybe [gen]
  (gen/frequency [[1 (gen/return nil)]
                  [2 gen]]))

(defn gen-str-3+ [gen-char]
  (gen/fmap (comp (partial apply str) flatten)
            (gen/tuple gen-char
                       gen-char
                       gen-char
                       (gen/vector gen-char))))

(def gen-char-alpha-lower (gen/fmap char
                                    (gen/choose 97 122)))

(def leaf-generators
  {s/Inst (gen/fmap #(time/plus (time/internal-now) (time/weeks %))
                    gen/int)})

(defn generate-entity [schema]
  (seg/generator schema leaf-generators))

(defn complete [schema m]
  (sec/complete m schema {} leaf-generators))

(def gen-valid-time-tuple
  (gen/tuple (maybe (get leaf-generators s/Inst))
             (maybe (get leaf-generators s/Inst))))
