(ns ctim.schemas.identity-assertion
  (:require [ctim.schemas.common :as c]
            #?(:clj [ctim.lib.generators :as gen])
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq def-map-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq def-map-type]])))

(def type-identifier "identity-assertion")

(def-eq IdentityAssertionTypeIdentifier type-identifier)

(def-map-type Assertion
  (f/required-entries
   (f/entry :name f/any-str)
   (f/entry :value f/any-str)))


(def-entity-type IdentityAssertion
  "Context attributes about the target or any of its observables. 
   Providers could provide different types of assertions regarding a target depending on their own capabilities"
  c/base-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type IdentityAssertionTypeIdentifier)
   (f/entry :identity c/IdentitySpecification
            :description (str "The target device for which assertion is being requested"))
   (f/entry :assertions (f/seq-of Assertion)
            :description (str "Any known context about the target or its observables")))
  (f/optional-entries
    (f/entry :valid_time c/ValidTime)))

(def-entity-type NewIdentityAssertion
  "For submitting a new IdentityAssertion"
  (:entries IdentityAssertion)
  c/base-new-entity-entries
  (f/optional-entries
   (f/entry :type IdentityAssertionTypeIdentifier)))

(def IdentityAssertionRef
  (c/ref-for-type type-identifier))
