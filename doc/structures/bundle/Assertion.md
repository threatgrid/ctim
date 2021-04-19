<a id="map87"></a>
# *Assertion*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[name](#name-assertiontypestring)|AssertionTypeString| |**Required**|
|[value](#value-string)|String| |**Required**|


<a id="name-assertiontypestring"></a>
### `name` ∷ AssertionTypeString

* This entry is **required**


  * *AssertionType* an open vocabulary containing well known assertion types
  * Allowed values:
    * `"cisco:ctr:ad:host_domain_name"`
    * `"cisco:ctr:ad:host_resolved_dns"`
    * `"cisco:ctr:ad:host_resolved_identities"`
    * `"cisco:ctr:ad:normalized_user"`
    * `"cisco:ctr:ad:user_domain_name"`
    * `"cisco:ctr:ad:user_net_bios_name"`
    * `"cisco:ctr:ad:user_resolved_dns"`
    * `"cisco:ctr:ad:user_resolved_identities"`
    * `"cisco:ctr:common:business_value"`
    * `"cisco:ctr:common:ir_attributes"`
    * `"cisco:ctr:common:node_label"`
    * `"cisco:ctr:device:administrators"`
    * `"cisco:ctr:device:connector_version"`
    * `"cisco:ctr:device:endpoint_profile"`
    * `"cisco:ctr:device:hardware_version"`
    * `"cisco:ctr:device:has_ip_blocking"`
    * `"cisco:ctr:device:id"`
    * `"cisco:ctr:device:last_sync_status"`
    * `"cisco:ctr:device:last_sync_time"`
    * `"cisco:ctr:device:location"`
    * `"cisco:ctr:device:manufacturer"`
    * `"cisco:ctr:device:mdm_compliant"`
    * `"cisco:ctr:device:mdm_imei"`
    * `"cisco:ctr:device:mdm_jail_broken"`
    * `"cisco:ctr:device:mdm_registered"`
    * `"cisco:ctr:device:model"`
    * `"cisco:ctr:device:name"`
    * `"cisco:ctr:device:os_version"`
    * `"cisco:ctr:device:os_version_name"`
    * `"cisco:ctr:device:owner"`
    * `"cisco:ctr:device:posture"`
    * `"cisco:ctr:device:security_group"`
    * `"cisco:ctr:device:serial_number"`
    * `"cisco:ctr:device:software_version"`
    * `"cisco:ctr:device:status"`
    * `"cisco:ctr:device:type"`
    * `"cisco:ctr:device:vendor"`
    * `"cisco:ctr:user:building"`
    * `"cisco:ctr:user:department"`
    * `"cisco:ctr:user:emails"`
    * `"cisco:ctr:user:entitlements"`
    * `"cisco:ctr:user:first_name"`
    * `"cisco:ctr:user:groups"`
    * `"cisco:ctr:user:last_name"`
    * `"cisco:ctr:user:manager"`
    * `"cisco:ctr:user:phone_numbers"`
    * `"cisco:ctr:user:roles"`
    * `"cisco:ctr:user:status"`
    * `"cisco:ctr:user:timezone"`
    * `"cisco:ctr:user:title"`
    * `"cisco:ctr:user:two_factor_enable"`

<a id="value-string"></a>
### `value` ∷ String

* This entry is **required**


