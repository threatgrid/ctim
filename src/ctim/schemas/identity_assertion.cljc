(ns ctim.schemas.identity-assertion
  (:require [ctim.schemas.common :as c]
            #?(:clj [ctim.lib.generators :as gen])
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq def-map-type def-enum-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq def-map-type def-enum-type]])))

(def type-identifier "identity-assertion")

(def-eq IdentityAssertionTypeIdentifier type-identifier)

(def assertion #{"cisco:ctr:device:id"
                 "cisco:ctr:device:name"
                 "cisco:ctr:device:type"
                 "cisco:ctr:device:owner"
                 "cisco:ctr:device:administrators"
                 "cisco:ctr:device:location"
                 "cisco:ctr:device:manufacturer"
                 "cisco:ctr:device:model"
                 "cisco:ctr:device:serial_number"
                 "cisco:ctr:device:software_version"
                 "cisco:ctr:device:hardware_version"
                 "cisco:ctr:device:os_version"
                 "cisco:ctr:device:os_version_name"
                 "cisco:ctr:device:posture"
                 "cisco:ctr:device:status"
                 "cisco:ctr:device:endpoint_profile"
                 "cisco:ctr:device:security_group"
                 "cisco:ctr:device:vendor"
                 "cisco:ctr:device:mdm_registered"
                 "cisco:ctr:device:mdm_compliant"
                 "cisco:ctr:device:mdm_jail_broken"
                 "cisco:ctr:device:mdm_imei"
                 "cisco:ctr:device:connector_version"
                 "cisco:ctr:device:last_sync_status"
                 "cisco:ctr:device:last_sync_time"
                 "cisco:ctr:device:has_ip_blocking"
                 ; user attributes
                 "cisco:ctr:user:first_name"
                 "cisco:ctr:user:last_name"
                 "cisco:ctr:user:emails"
                 "cisco:ctr:user:phone_numbers"
                 "cisco:ctr:user:roles"
                 "cisco:ctr:user:groups"
                 "cisco:ctr:user:entitlements"
                 "cisco:ctr:user:timezone"
                 "cisco:ctr:user:status"
                 "cisco:ctr:user:two_factor_enable"
                 "cisco:ctr:user:manager"
                 "cisco:ctr:user:department"
                 "cisco:ctr:user:building"
                 "cisco:ctr:user:title"
                 ; AD attributes
                 "cisco:ctr:ad:normalized_user"
                 "cisco:ctr:ad:user_domain_name"
                 "cisco:ctr:ad:host_domain_name"
                 "cisco:ctr:ad:user_net_bios_name"
                 "cisco:ctr:ad:user_resolved_identities"
                 "cisco:ctr:ad:user_resolved_dns"
                 "cisco:ctr:ad:host_resolved_identities"
                 "cisco:ctr:ad:host_resolved_dns"
                 ;these properties apply to common data - could be for users, devices, groups 
                 "cisco:ctr:common:node_label"
                 "cisco:ctr:common:business_value"
                 "cisco:ctr:common:ir_attributes"})

(def-enum-type AssertionType
  assertion
  :open? true
  :description (str "an open vocabulary containing well known assertion types"))

(def-map-type Assertion
  (f/required-entries
   (f/entry :name AssertionType)
   (f/entry :value f/any-str)))

(def-map-type IdentityCoordinates
  (f/required-entries
   (f/entry :observables (f/seq-of c/Observable))))

(def-entity-type IdentityAssertion
  "Context attributes about the target or any of its observables. 
   Providers could provide different types of assertions regarding a target depending on their own capabilities"
  c/base-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type IdentityAssertionTypeIdentifier)
   (f/entry :identity IdentityCoordinates
            :description (str "attributes for which the assertion is being made"))
   (f/entry :assertions (f/seq-of Assertion)
            :description (str "Any known context about the identity attributes")))
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
