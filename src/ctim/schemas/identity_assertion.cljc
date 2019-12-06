(ns ctim.schemas.identity-assertion
  (:require [ctim.schemas.common :as c]
            #?(:clj [ctim.lib.generators :as gen])
            #?(:clj  [flanders.core :as f :refer [def-entity-type def-eq def-map-type]]
               :cljs [flanders.core :as f :refer-macros [def-entity-type def-eq def-map-type]])))

(def type-identifier "identity-assertion")

(def-eq IdentityAssertionTypeIdentifier type-identifier)

(def assertion #{"cisco:ctr:device:name"
                 "cisco:ctr:device:owner"
                 "cisco:ctr:device:administrators"
                 "cisco:ctr:device:location"
                 "cisco:ctr:device:manufacturer"
                 "cisco:ctr:device:model_number"
                 "cisco:ctr:device:serial_number"
                 "cisco:ctr:device:version"

                 "cisco:ise:device:posture_status"
                 "cisco:ise:device:endpoint_profile"
                 "cisco:ise:device:security_group"
                 "cisco:ise:device:ancPolicy"
                 "cisco:ise:device:mdm_mac_address"
                 "cisco:ise:device:mdm_registered"
                 "cisco:ise:device:mdm_compliant"
                 "cisco:ise:device:mdm_jail_broken"
                 "cisco:ise:device:mdm_model"
                 "cisco:ise:device:mdm_manufacturer"
                 "cisco:ise:device:mdm_imei"
                 "cisco:ise:device:asset_id"
                 "cisco:ise:device:asset_name"
                 "cisco:ise:device:asset_ip_address"
                 "cisco:ise:device:asset_mac_address"
                 "cisco:ise:device:asset_vendor"
                 "cisco:ise:device:asset_serial_number"
                 "cisco:ise:device:asset_device_type"
                 "cisco:ise:device:asset_sw_revision"
                 "cisco:ise:device:asset_hw_revision"
                 "cisco:ise:device:asset_protocol"
                 "cisco:ise:device:asset_custom_attributes"
                 "cisco:ise:device:asset_connected_links"
                 "cisco:ise:device:source_sgt"
                 "cisco:ise:device:destination_sgt"
                 "cisco:ise:device:sgacl_name"

                 "cisco:amp:device:group_guid"
                 "cisco:amp:device:connector_version"

                 "cisco:umbrella:device:status"
                 "cisco:umbrella:device:device_id"
                 "cisco:umbrella:device:name"
                 "cisco:umbrella:device:type"
                 "cisco:umbrella:device:last_sync_status"
                 "cisco:umbrella:device:last_sync_time"
                 "cisco:umbrella:device:has_ip_blocking"
                 "cisco:umbrella:device:version"
                 "cisco:umbrella:device:os_version"
                 "cisco:umbrella:device:os_version_name"

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

                 "ad:normalized_user"
                 "ad:user_domain_name"
                 "ad:host_domain_name"
                 "ad:net_bios_name"
                 "ad:user_resolved_identities"
                 "ad:user_resolved_dns"
                 "ad:host_resolved_identities"
                 "ad:host_resolved_dns"})

(def-enum-type AssertionType
  assertion
  :open? true
  :description (str "an open vocabulary containing well known assertion types"))

(def-map-type Assertion
  (f/required-entries
   (f/entry :name AssertionType)
   (f/entry :value f/any-str)))

(def-map-type IdentityAttributes
  (concat
   (f/required-entries
    (f/entry :observables [Observable])
    (f/entry :observed_time ObservedTime))))

(def-entity-type IdentityAssertion
  "Context attributes about the target or any of its observables. 
   Providers could provide different types of assertions regarding a target depending on their own capabilities"
  c/base-entity-entries
  c/sourcable-object-entries
  (f/required-entries
   (f/entry :type IdentityAssertionTypeIdentifier)
   (f/entry :identity IdentityAttributes
            :description (str "identity attributes for which the assertion is being made"))
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
