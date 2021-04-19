<a id="map70"></a>
# *SensorCoordinates*

*SensorCoordinates* Describes the device that made the sighting (sensor) and contains identifying observables for the sensor.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#observables-observableobservablemdmap79)|[[*Observable*](./Observable.md#map79)]| |**Required**|
|[type](#type-sensorstring)|SensorString| |**Required**|
|[os](#os-string)|String| |_Optional_|


<a id="observables-observableobservablemdmap79"></a>
### `observables` ∷ [[*Observable*](./Observable.md#map79)]

* This entry is **required**
* This entry's type is sequential (allows zero or more values)


<a id="os-string"></a>
### `os` ∷ String

* This entry is _optional_



<a id="type-sensorstring"></a>
### `type` ∷ SensorString

* This entry is **required**


  * *Sensor* The sensor/actuator name that best fits a device

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
