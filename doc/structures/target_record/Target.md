<a id="map2"></a>
# *Target*

*Target* Schema for TargetRecord Targets

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[observables](#observables-observableobservablemdmap3)|[[*Observable*](./Observable.md#map3)]| |**Required**|
|[observed_time](#observed_time-observedtimeobservedtimemdmap4)|[*ObservedTime*](./ObservedTime.md#map4)| |**Required**|
|[type](#type-sensorstring)|SensorString| |**Required**|
|[internal](#internal-boolean)|Boolean|Is it internal to our network?|_Optional_|
|[os](#os-string)|String|Source Operating System where TargetRecord was originated.|_Optional_|
|[sensor](#sensor-string)|String|The OpenC2 Actuator name that best fits the device that is creating this TargetRecord (e.g.: network.firewall, etc.)|_Optional_|
|[source_uri](#source_uri-string)|String| |_Optional_|


<a id="internal-boolean"></a>
### `internal` ∷ Boolean

Is it internal to our network?

* This entry is _optional_



<a id="observables-observableobservablemdmap3"></a>
### `observables` ∷ [[*Observable*](./Observable.md#map3)]

* This entry is **required**
* This entry's type is sequential (allows zero or more values)


<a id="observed_time-observedtimeobservedtimemdmap4"></a>
### `observed_time` ∷ [*ObservedTime*](./ObservedTime.md#map4)

* This entry is **required**


<a id="os-string"></a>
### `os` ∷ String

Source Operating System where TargetRecord was originated.

* This entry is _optional_



<a id="sensor-string"></a>
### `sensor` ∷ String

The OpenC2 Actuator name that best fits the device that is creating this TargetRecord (e.g.: network.firewall, etc.)

* This entry is _optional_



<a id="source_uri-string"></a>
### `source_uri` ∷ String

* This entry is _optional_


  * A URI

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
