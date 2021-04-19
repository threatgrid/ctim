<a id="map2"></a>
# *Observable*

*Observable* A simple, atomic value which has a consistent identity, and is stable enough to be attributed an intent or nature.  This is the classic 'indicator' which might appear in a data feed of bad IPs, or bad Domains.  These do not exist as objects within the CTIA storage model, so you never create an observable.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#type-observabletypeidentifierstring)|ObservableTypeIdentifierString| |**Required**|
|[value](#value-string)|String| |**Required**|


<a id="type-observabletypeidentifierstring"></a>
### `type` ∷ ObservableTypeIdentifierString

* This entry is **required**


  * *ObservableTypeIdentifier* Observable type names
  * Allowed values:
    * `"amp_computer_guid"`
    * `"certificate_common_name"`
    * `"certificate_issuer"`
    * `"certificate_serial"`
    * `"cisco_mid"`
    * `"cisco_uc_id"`
    * `"device"`
    * `"domain"`
    * `"email"`
    * `"email_messageid"`
    * `"email_subject"`
    * `"file_name"`
    * `"file_path"`
    * `"hostname"`
    * `"imei"`
    * `"imsi"`
    * `"ip"`
    * `"ipv6"`
    * `"mac_address"`
    * `"md5"`
    * `"ms_machine_id"`
    * `"mutex"`
    * `"ngfw_id"`
    * `"ngfw_name"`
    * `"odns_identity"`
    * `"odns_identity_label"`
    * `"orbital_node_id"`
    * `"pki_serial"`
    * `"process_name"`
    * `"registry_key"`
    * `"registry_name"`
    * `"registry_path"`
    * `"s1_agent_id"`
    * `"sha1"`
    * `"sha256"`
    * `"swc_device_id"`
    * `"url"`
    * `"user"`
    * `"user_agent"`

<a id="value-string"></a>
### `value` ∷ String

* This entry is **required**


