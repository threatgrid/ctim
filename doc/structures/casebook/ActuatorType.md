<a id="map106"></a>
# *ActuatorType*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[type](#type-actuatortypestring)|ActuatorTypeString| |**Required**|
|[specifiers](#specifiers-shortstring)|[ShortString]|list of additional properties describing the actuator|_Optional_|


<a id="specifiers-shortstring"></a>
### `specifiers` ∷ [ShortString]

list of additional properties describing the actuator

* This entry is _optional_
* This entry's type is sequential (allows zero or more values)


  * *ShortString* String with at most 1024 characters

<a id="type-actuatortypestring"></a>
### `type` ∷ ActuatorTypeString

* This entry is **required**


  * Allowed values:
    * `"endpoint"`
    * `"endpoint.digital-telephone-handset"`
    * `"endpoint.laptop"`
    * `"endpoint.pos-terminal"`
    * `"endpoint.printer"`
    * `"endpoint.sensor"`
    * `"endpoint.server"`
    * `"endpoint.smart-meter"`
    * `"endpoint.smart-phone"`
    * `"endpoint.tablet"`
    * `"endpoint.workstation"`
    * `"network"`
    * `"network.bridge"`
    * `"network.firewall"`
    * `"network.gateway"`
    * `"network.guard"`
    * `"network.hips"`
    * `"network.hub"`
    * `"network.ids"`
    * `"network.ips"`
    * `"network.modem"`
    * `"network.nic"`
    * `"network.proxy"`
    * `"network.router"`
    * `"network.security_manager"`
    * `"network.sense_making"`
    * `"network.sensor"`
    * `"network.switch"`
    * `"network.vpn"`
    * `"network.wap"`
    * `"other"`
    * `"process"`
    * `"process.aaa-server"`
    * `"process.anti-virus-scanner"`
    * `"process.connection-scanner"`
    * `"process.directory-service"`
    * `"process.dns-server"`
    * `"process.email-service"`
    * `"process.file-scanner"`
    * `"process.location-service"`
    * `"process.network-scanner"`
    * `"process.remediation-service"`
    * `"process.reputation-service"`
    * `"process.sandbox"`
    * `"process.virtualization-service"`
    * `"process.vulnerability-scanner"`
