<a id="map122"></a>
# *CVSSv3*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[base_score](#base_score-number)|Number| |**Required**|
|[base_severity](#base_severity-cvssv3severitystring)|CVSSv3SeverityString| |**Required**|
|[vector_string](#vector_string-string)|String| |**Required**|
|[attack_complexity](#attack_complexity-cvssv3attackcomplexitystring)|CVSSv3AttackComplexityString|describes the conditions beyond the attacker's control that must exist in order to exploit the vulnerability|_Optional_|
|[attack_vector](#attack_vector-cvssv3attackvectorstring)|CVSSv3AttackVectorString|Reflects the context by which vulnerability exploitation is possible|_Optional_|
|[availability_impact](#availability_impact-cvssv3availabilityimpactstring)|CVSSv3AvailabilityImpactString|measures the impact to the availability of the impacted component resulting from a successfully exploited vulnerability|_Optional_|
|[availability_requirement](#availability_requirement-cvssv3securityrequirementsstring)|CVSSv3SecurityRequirementsString| |_Optional_|
|[confidentiality_impact](#confidentiality_impact-cvssv3confidentialityimpactstring)|CVSSv3ConfidentialityImpactString|measures the impact to the confidentiality of the information resources managed by a software component due to a successfully exploited vulnerability|_Optional_|
|[confidentiality_requirement](#confidentiality_requirement-cvssv3securityrequirementsstring)|CVSSv3SecurityRequirementsString| |_Optional_|
|[environmental_score](#environmental_score-number)|Number| |_Optional_|
|[environmental_severity](#environmental_severity-cvssv3severitystring)|CVSSv3SeverityString| |_Optional_|
|[exploit_code_maturity](#exploit_code_maturity-cvssv3exploitcodematuritystring)|CVSSv3ExploitCodeMaturityString|measures the likelihood of the vulnerability being attacked|_Optional_|
|[exploitability_score](#exploitability_score-number)|Number| |_Optional_|
|[impact_score](#impact_score-number)|Number| |_Optional_|
|[integrity_impact](#integrity_impact-cvssv3integrityimpactstring)|CVSSv3IntegrityImpactString|measures the impact to integrity of a successfully exploited vulnerability|_Optional_|
|[integrity_requirement](#integrity_requirement-cvssv3securityrequirementsstring)|CVSSv3SecurityRequirementsString| |_Optional_|
|[modified_attack_complexity](#modified_attack_complexity-cvssv3modifiedattackcomplexitystring)|CVSSv3ModifiedAttackComplexityString|modified attack complexity|_Optional_|
|[modified_attack_vector](#modified_attack_vector-cvssv3modifiedattackvectorstring)|CVSSv3ModifiedAttackVectorString|modified attack vector|_Optional_|
|[modified_availability_impact](#modified_availability_impact-cvssv3modifiedavailabilityimpactstring)|CVSSv3ModifiedAvailabilityImpactString|modified availability impact|_Optional_|
|[modified_confidentiality_impact](#modified_confidentiality_impact-cvssv3modifiedconfidentialityimpactstring)|CVSSv3ModifiedConfidentialityImpactString|modified confidentiality impact|_Optional_|
|[modified_integrity_impact](#modified_integrity_impact-cvssv3modifiedintegrityimpactstring)|CVSSv3ModifiedIntegrityImpactString|modified integrity impact|_Optional_|
|[modified_privileges_required](#modified_privileges_required-cvssv3modifiedprivilegesrequiredstring)|CVSSv3ModifiedPrivilegesRequiredString|modified privileges required|_Optional_|
|[modified_scope](#modified_scope-cvssv3modifiedscopestring)|CVSSv3ModifiedScopeString|modified scope|_Optional_|
|[modified_user_interaction](#modified_user_interaction-cvssv3modifieduserinteractionstring)|CVSSv3ModifiedUserInteractionString|modified user interaction|_Optional_|
|[privileges_required](#privileges_required-cvssv3privilegesrequiredstring)|CVSSv3PrivilegesRequiredString|describes the level of privileges an attacker must possess before successfully exploiting the vulnerability|_Optional_|
|[remediation_level](#remediation_level-cvssv3remediationlevelstring)|CVSSv3RemediationLevelString|Remediation Level of a vulnerability is an important factor for prioritization|_Optional_|
|[report_confidence](#report_confidence-cvssv3reportconfidencestring)|CVSSv3ReportConfidenceString|measures the degree of confidence in the existence of the vulnerability and the credibility of the known technical details|_Optional_|
|[scope](#scope-cvssv3scopestring)|CVSSv3ScopeString|the ability for a vulnerability in one software component to impact resources beyond its means, or privileges|_Optional_|
|[temporal_score](#temporal_score-number)|Number|Round up(CVSSv3BaseScore × CVSSv3ExploitCodeMaturity × CVSSv3RemediationLevel × CVSSv3ReportConfidence)|_Optional_|
|[temporal_severity](#temporal_severity-cvssv3severitystring)|CVSSv3SeverityString|temporal severity|_Optional_|
|[user_interaction](#user_interaction-cvssv3userinteractionstring)|CVSSv3UserInteractionString|captures the requirement for a user, other than the attacker, to participate in the successful compromise of the vulnerable component|_Optional_|


<a id="attack_complexity-cvssv3attackcomplexitystring"></a>
### `attack_complexity` ∷ CVSSv3AttackComplexityString

describes the conditions beyond the attacker's control that must exist in order to exploit the vulnerability

* This entry is _optional_


  * *CVSSv3AttackComplexity* describes the conditions beyond the attacker's control that must exist in order to exploit the vulnerability. As described below, such conditions may require the collection of more information about the target, the presence of certain system configuration settings, or computational exceptions. Importantly, the assessment of this metric excludes any requirements for user interaction in order to exploit the vulnerability (such conditions are captured in the User Interaction metric). this metric value is largest for the least complex attacks. The list of possible values are: `low` Specialized access conditions or extenuating circumstances do not exist. An attacker can expect repeatable success against the vulnerable component. `high` A successful attack depends on conditions beyond the attacker's control. That is, a successful attack cannot be accomplished at will, but requires the attacker to invest in some measurable amount of effort in preparation or execution against the vulnerable component before a successful attack can be expected. For example, a successful attack may depend on an attacker overcoming any of the following conditions: - The attacker must conduct target-specific reconnaissance. For example, on target configuration settings, sequence numbers, shared secrets, etc. - The attacker must prepare the target environment to improve exploit reliability. For example, repeated exploitation to win a race condition, or overcoming advanced exploit mitigation techniques. The attacker must inject herself into the logical network path between the target and the resource requested by the victim in order to read and/or modify network communications (e.g. man in the middle attack).
  * Allowed values:
    * `"high"`
    * `"low"`
  * Reference: [Attack Complexity](https://www.first.org/cvss/specification-document#2-1-2-Attack-Complexity-AC)


<a id="attack_vector-cvssv3attackvectorstring"></a>
### `attack_vector` ∷ CVSSv3AttackVectorString

Reflects the context by which vulnerability exploitation is possible

* This entry is _optional_


  * *CVSSv3AttackVector* This metric reflects the context by which vulnerability exploitation is possible. This metric value (and consequently the Base score) will be larger the more remote (logically, and physically) an attacker can be in order to exploit the vulnerable component. The assumption is that the number of potential attackers for a vulnerability that could be exploited from across the Internet is larger than the number of potential attackers that could exploit a vulnerability requiring physical access to a device, and therefore warrants a greater score. The list of possible values is: `network` A vulnerability exploitable with network access means the vulnerable component is bound to the network stack and the attacker's path is through OSI layer 3 (the network layer). Such a vulnerability is often termed `remotely exploitable` and can be thought of as an attack being exploitable one or more network hops away (e.g. across layer 3 boundaries from routers). An example of a network attack is an attacker causing a denial of service (DoS) by sending a specially crafted TCP packet from across the public Internet (e.g. CVE 2004 0230).`adjacent_network` A vulnerability exploitable with adjacent network access means the vulnerable component is bound to the network stack, however the attack is limited to the same shared physical (e.g. Bluetooth, IEEE 802.11) or logical (e.g. local IP subnet) network, and cannot be performed across an OSI layer 3 boundary (e.g. a router). An example of an Adjacent attack would be an ARP (IPv4) or neighbor discovery (IPv6) flood leading to a denial of service on the local LAN segment. See also CVE 2013 6014. `local` A vulnerability exploitable with Local access means that the vulnerable component is not bound to the network stack, and the attacker's path is via read/write/execute capabilities. In some cases, the attacker may be logged in locally in order to exploit the vulnerability, otherwise, she may rely on User Interaction to execute a malicious file. `physical` A vulnerability exploitable with Physical access requires the attacker to physically touch or manipulate the vulnerable component. Physical interaction may be brief (e.g. evil maid attack) or persistent. An example of such an attack is a cold boot attack which allows an attacker to access to disk encryption keys after gaining physical access to the system, or peripheral attacks such as Firewire/USB Direct Memory Access attacks.
  * Allowed values:
    * `"adjacent_network"`
    * `"local"`
    * `"network"`
    * `"physical"`
  * Reference: [Attack Vector](https://www.first.org/cvss/specification-document#2-1-1-Attack-Vector-AV)


<a id="availability_impact-cvssv3availabilityimpactstring"></a>
### `availability_impact` ∷ CVSSv3AvailabilityImpactString

measures the impact to the availability of the impacted component resulting from a successfully exploited vulnerability

* This entry is _optional_


  * *CVSSv3AvailabilityImpact* This metric measures the impact to the availability of the impacted component resulting from a successfully exploited vulnerability. While the Confidentiality and Integrity impact metrics apply to the loss of confidentiality or integrity of data (e.g., information, files) used by the impacted component, this metric refers to the loss of availability of the impacted component itself, such as a networked service (e.g., web, database, email). Since availability refers to the accessibility of information resources, attacks that consume network bandwidth, processor cycles, or disk space all impact the availability of an impacted component. The list of possible values is presented is: `high`: There is total loss of availability, resulting in the attacker being able to fully deny access to resources in the impacted component; this loss is either sustained (while the attacker continues to deliver the attack) or persistent (the condition persists even after the attack has completed). Alternatively, the attacker has the ability to deny some availability, but the loss of availability presents a direct, serious consequence to the impacted component (e.g., the attacker cannot disrupt existing connections, but can prevent new connections; the attacker can repeatedly exploit a vulnerability that, in each instance of a successful attack, leaks a only small amount of memory, but after repeated exploitation causes a service to become completely unavailable). `low`: There is reduced performance or interruptions in resource availability. Even if repeated exploitation of the vulnerability is possible, the attacker does not have the ability to completely deny service to legitimate users. The resources in the impacted component are either partially available all of the time, or fully available only some of the time but overall there is no direct, serious consequence to the impacted component. `none`: There is no impact to availability within the impacted component. This metric value increases with the consequence to the impacted component.
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"none"`
  * Reference: [Availability Impact](https://www.first.org/cvss/specification-document#2-3-3-Availability-Impact-A)


<a id="availability_requirement-cvssv3securityrequirementsstring"></a>
### `availability_requirement` ∷ CVSSv3SecurityRequirementsString

* This entry is _optional_


  * *CVSSv3SecurityRequirements* These metrics enable the analyst to customize the CVSS score depending on the importance of the affected IT asset to a user's organization, measured in terms of Confidentiality, Integrity, and Availability. That is, if an IT asset supports a business function for which Availability is most important, the analyst can assign a greater value to Availability relative to Confidentiality and Integrity. Each security requirement has three possible values: Low, Medium, or High. The full effect on the environmental score is determined by the corresponding Modified Base Impact metrics. That is, these metrics modify the environmental score by reweighting the Modified Confidentiality, Integrity, and Availability impact metrics. For example, the Modified Confidentialityimpact (MC) metric has increased weight if the Confidentiality Requirement (CR) is High. Likewise, the Modified Confidentiality impact metric has decreased weight if the Confidentiality Requirement is Low. The Modified Confidentiality impact metric weighting is neutral if the Confidentiality Requirement is Medium. This same process is applied to the Integrity and Availability requirements.Note that the Confidentiality Requirement will not affect the Environmental score if the (Modified Base) confidentiality impact is set to None. Also, increasing the Confidentiality Requirement from Medium to Highwill not change the Environmental score when the (Modified Base) impact metrics are set to High. This is because the modified impact sub score (part of the Modified Base score that calculates impact) is already at a maximum value of 10. The list of possible values is: `not_defined`: Assigning this value to the metric will not influence the score. It is a signal to the equation to skip this metric. `high`: Loss of [Confidentiality / Integrity / Availability] is likely to have a catastrophic adverse effect on the organization or individuals associated with the organization (e.g., employees, customers). `medium`: Loss of [Confidentiality / Integrity / Availability] is likely to have a serious adverse effect on the organization or individuals associated with the organization (e.g., employees, customers).`low`: Loss of [Confidentiality / Integrity / Availability] is likely to have only a limited adverse effect on the organization or individuals associated with the organization (e.g., employees, customers). For brevity, the same table is used for all three metrics. The greater the Security Requirement, the higher the score (recall that Medium is considered the default).
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"none"`
    * `"not_defined"`
  * Reference: [Security Requirements](https://www.first.org/cvss/specification-document#4-1-Security-Requirements-CR-IR-AR)


<a id="base_score-number"></a>
### `base_score` ∷ Number

* This entry is **required**


  * a Score number from 0 to 10

<a id="base_severity-cvssv3severitystring"></a>
### `base_severity` ∷ CVSSv3SeverityString

* This entry is **required**


  * Allowed values:
    * `"critical"`
    * `"high"`
    * `"low"`
    * `"medium"`
    * `"none"`

<a id="confidentiality_impact-cvssv3confidentialityimpactstring"></a>
### `confidentiality_impact` ∷ CVSSv3ConfidentialityImpactString

measures the impact to the confidentiality of the information resources managed by a software component due to a successfully exploited vulnerability

* This entry is _optional_


  * *CVSSv3ConfidentialityImpact* measures the impact to the confidentiality of the information resources managed by a software component due to a successfully exploited vulnerability. Confidentiality refers to limiting information access and disclosure to only authorized users, as well as preventing access by, or disclosure to, unauthorized ones. The list of possible values  is: `high`: There is total loss of confidentiality, resulting in all resources within the impacted component being divulged to the attacker. Alternatively, access to only some restricted information is obtained, but the disclosed information presents a direct, serious impact. For example, an attacker steals the administrator's password, or private encryption keys of a web server. `low`: There is some loss of confidentiality. Access to some restricted information is obtained, but the attacker does not have control over what information is obtained, or the amount or kind of loss is constrained. The information disclosure does not cause a direct, serious loss to the impacted component. `none`: There is no loss of confidentiality within the impacted component. This metric value increases with the degree of loss to the impacted component.
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"none"`
  * Reference: [Confientiality Impact](https://www.first.org/cvss/specification-document#2-3-1-Confidentiality-Impact-C)


<a id="confidentiality_requirement-cvssv3securityrequirementsstring"></a>
### `confidentiality_requirement` ∷ CVSSv3SecurityRequirementsString

* This entry is _optional_


  * *CVSSv3SecurityRequirements* These metrics enable the analyst to customize the CVSS score depending on the importance of the affected IT asset to a user's organization, measured in terms of Confidentiality, Integrity, and Availability. That is, if an IT asset supports a business function for which Availability is most important, the analyst can assign a greater value to Availability relative to Confidentiality and Integrity. Each security requirement has three possible values: Low, Medium, or High. The full effect on the environmental score is determined by the corresponding Modified Base Impact metrics. That is, these metrics modify the environmental score by reweighting the Modified Confidentiality, Integrity, and Availability impact metrics. For example, the Modified Confidentialityimpact (MC) metric has increased weight if the Confidentiality Requirement (CR) is High. Likewise, the Modified Confidentiality impact metric has decreased weight if the Confidentiality Requirement is Low. The Modified Confidentiality impact metric weighting is neutral if the Confidentiality Requirement is Medium. This same process is applied to the Integrity and Availability requirements.Note that the Confidentiality Requirement will not affect the Environmental score if the (Modified Base) confidentiality impact is set to None. Also, increasing the Confidentiality Requirement from Medium to Highwill not change the Environmental score when the (Modified Base) impact metrics are set to High. This is because the modified impact sub score (part of the Modified Base score that calculates impact) is already at a maximum value of 10. The list of possible values is: `not_defined`: Assigning this value to the metric will not influence the score. It is a signal to the equation to skip this metric. `high`: Loss of [Confidentiality / Integrity / Availability] is likely to have a catastrophic adverse effect on the organization or individuals associated with the organization (e.g., employees, customers). `medium`: Loss of [Confidentiality / Integrity / Availability] is likely to have a serious adverse effect on the organization or individuals associated with the organization (e.g., employees, customers).`low`: Loss of [Confidentiality / Integrity / Availability] is likely to have only a limited adverse effect on the organization or individuals associated with the organization (e.g., employees, customers). For brevity, the same table is used for all three metrics. The greater the Security Requirement, the higher the score (recall that Medium is considered the default).
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"none"`
    * `"not_defined"`
  * Reference: [Security Requirements](https://www.first.org/cvss/specification-document#4-1-Security-Requirements-CR-IR-AR)


<a id="environmental_score-number"></a>
### `environmental_score` ∷ Number

* This entry is _optional_


  * a Score number from 0 to 10

<a id="environmental_severity-cvssv3severitystring"></a>
### `environmental_severity` ∷ CVSSv3SeverityString

* This entry is _optional_


  * Allowed values:
    * `"critical"`
    * `"high"`
    * `"low"`
    * `"medium"`
    * `"none"`

<a id="exploit_code_maturity-cvssv3exploitcodematuritystring"></a>
### `exploit_code_maturity` ∷ CVSSv3ExploitCodeMaturityString

measures the likelihood of the vulnerability being attacked

* This entry is _optional_


  * *CVSSv3ExploitCodeMaturity* This metric measures the likelihood of the vulnerability being attacked, and is typically based on the current state of exploit techniques, exploit code availability, or active, 'in-the-wild' exploitation. Public availability of easy-to-use exploit code increases the number of potential attackers by including those who are unskilled, thereby increasing the severity of the vulnerability. Initially, real-world exploitation may only be theoretical. Publication of proof-of-concept code, functional exploit code, or sufficient technical details necessary to exploit the vulnerability may follow. Furthermore, the exploit code available may progress from a proof-of-concept demonstration to exploit code that is successful in exploiting the vulnerability consistently. In severe cases, it may be delivered as the payload of a network-based worm or virus or other automated attack tools. The list of possible values is: `not_defined`: Assigning this value to the metric will not influence the score. It is a signal to a scoring equation to skip this metric. `high`: Functional autonomous code exists, or no exploit is required (manual trigger) and details are widely available. Exploit code works in every situation, or is actively being delivered via an autonomous agent (such as a worm or virus). Network-connected systems are likely to encounter scanning or exploitation attempts. Exploit development has reached the level of reliable, widely-available, easy-to-use automated tools. `functional`: Functional exploit code is available. The code works in most situations where the vulnerability exists. `proof_of_concept`: Proof-of-concept exploit code is available, or an attack demonstration is not practical for most systems. The code or technique is not functional in all situations and may require substantial modification by a skilled attacker. `unproven`: No exploit code is available, or an exploit is theoretical.
  * Allowed values:
    * `"functional"`
    * `"high"`
    * `"not_defined"`
    * `"proof_of_concept"`
    * `"unproven"`
  * Reference: [Exploit Code Maturity](https://www.first.org/cvss/specification-document#3-1-Exploit-Code-Maturity-E)


<a id="exploitability_score-number"></a>
### `exploitability_score` ∷ Number

* This entry is _optional_


  * a Score number from 0 to 10

<a id="impact_score-number"></a>
### `impact_score` ∷ Number

* This entry is _optional_


  * a Score number from 0 to 10

<a id="integrity_impact-cvssv3integrityimpactstring"></a>
### `integrity_impact` ∷ CVSSv3IntegrityImpactString

measures the impact to integrity of a successfully exploited vulnerability

* This entry is _optional_


  * *CVSSv3IntegrityImpact* This metric measures the impact to integrity of a successfully exploited vulnerability. Integrity refers to the trustworthiness and veracity of information. The list of possible values  is: `high`: There is a total loss of integrity, or a complete loss of protection. For example, the attacker is able to modify any/all files protected by the impacted component. Alternatively, only some files can be modified, but malicious modification would present a direct, serious consequence to the impacted component. `low`: Modification of data is possible, but the attacker does not have control over the consequence of a modification, or the amount of modification is constrained. The data modification does not have a direct, serious impact on the impacted component.`none`: There is no loss of integrity within the impacted component.this metric value increases with the consequence to the impacted component. 
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"none"`
  * Reference: [Integrity Impact](https://www.first.org/cvss/specification-document#2-3-2-Integrity-Impact-I)


<a id="integrity_requirement-cvssv3securityrequirementsstring"></a>
### `integrity_requirement` ∷ CVSSv3SecurityRequirementsString

* This entry is _optional_


  * *CVSSv3SecurityRequirements* These metrics enable the analyst to customize the CVSS score depending on the importance of the affected IT asset to a user's organization, measured in terms of Confidentiality, Integrity, and Availability. That is, if an IT asset supports a business function for which Availability is most important, the analyst can assign a greater value to Availability relative to Confidentiality and Integrity. Each security requirement has three possible values: Low, Medium, or High. The full effect on the environmental score is determined by the corresponding Modified Base Impact metrics. That is, these metrics modify the environmental score by reweighting the Modified Confidentiality, Integrity, and Availability impact metrics. For example, the Modified Confidentialityimpact (MC) metric has increased weight if the Confidentiality Requirement (CR) is High. Likewise, the Modified Confidentiality impact metric has decreased weight if the Confidentiality Requirement is Low. The Modified Confidentiality impact metric weighting is neutral if the Confidentiality Requirement is Medium. This same process is applied to the Integrity and Availability requirements.Note that the Confidentiality Requirement will not affect the Environmental score if the (Modified Base) confidentiality impact is set to None. Also, increasing the Confidentiality Requirement from Medium to Highwill not change the Environmental score when the (Modified Base) impact metrics are set to High. This is because the modified impact sub score (part of the Modified Base score that calculates impact) is already at a maximum value of 10. The list of possible values is: `not_defined`: Assigning this value to the metric will not influence the score. It is a signal to the equation to skip this metric. `high`: Loss of [Confidentiality / Integrity / Availability] is likely to have a catastrophic adverse effect on the organization or individuals associated with the organization (e.g., employees, customers). `medium`: Loss of [Confidentiality / Integrity / Availability] is likely to have a serious adverse effect on the organization or individuals associated with the organization (e.g., employees, customers).`low`: Loss of [Confidentiality / Integrity / Availability] is likely to have only a limited adverse effect on the organization or individuals associated with the organization (e.g., employees, customers). For brevity, the same table is used for all three metrics. The greater the Security Requirement, the higher the score (recall that Medium is considered the default).
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"none"`
    * `"not_defined"`
  * Reference: [Security Requirements](https://www.first.org/cvss/specification-document#4-1-Security-Requirements-CR-IR-AR)


<a id="modified_attack_complexity-cvssv3modifiedattackcomplexitystring"></a>
### `modified_attack_complexity` ∷ CVSSv3ModifiedAttackComplexityString

modified attack complexity

* This entry is _optional_


  * *CVSSv3ModifiedAttackComplexity* The same values as Attack Complexity, as well as not_defined (the default)
  * Default: `"not_defined"`
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"not_defined"`
  * Reference: [Modified Base Metrics](https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="modified_attack_vector-cvssv3modifiedattackvectorstring"></a>
### `modified_attack_vector` ∷ CVSSv3ModifiedAttackVectorString

modified attack vector

* This entry is _optional_


  * *CVSSv3ModifiedAttackVector* The same values as Attack Vector, as well as not_defined (the default)
  * Default: `"not_defined"`
  * Allowed values:
    * `"adjacent_network"`
    * `"local"`
    * `"network"`
    * `"not_defined"`
    * `"physical"`
  * Reference: [Modified Base Metrics](https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="modified_availability_impact-cvssv3modifiedavailabilityimpactstring"></a>
### `modified_availability_impact` ∷ CVSSv3ModifiedAvailabilityImpactString

modified availability impact

* This entry is _optional_


  * *CVSSv3ModifiedAvailabilityImpact* The same values as Availability Impact, as well as not_defined (the default)
  * Default: `"not_defined"`
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"none"`
    * `"not_defined"`
  * Reference: [Modified Base Metrics](https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="modified_confidentiality_impact-cvssv3modifiedconfidentialityimpactstring"></a>
### `modified_confidentiality_impact` ∷ CVSSv3ModifiedConfidentialityImpactString

modified confidentiality impact

* This entry is _optional_


  * *CVSSv3ModifiedConfidentialityImpact* The same values as Confidentiality Impact, as well as not_defined (the default)
  * Default: `"not_defined"`
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"none"`
    * `"not_defined"`
  * Reference: [Modified Base Metrics](https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="modified_integrity_impact-cvssv3modifiedintegrityimpactstring"></a>
### `modified_integrity_impact` ∷ CVSSv3ModifiedIntegrityImpactString

modified integrity impact

* This entry is _optional_


  * *CVSSv3ModifiedIntegrityImpact* The same values as Integrity Impact, as well as not_defined (the default)
  * Default: `"not_defined"`
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"none"`
    * `"not_defined"`
  * Reference: [Modified Base Metrics](https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="modified_privileges_required-cvssv3modifiedprivilegesrequiredstring"></a>
### `modified_privileges_required` ∷ CVSSv3ModifiedPrivilegesRequiredString

modified privileges required

* This entry is _optional_


  * *CVSSv3ModifiedPrivilegesRequired* The same values as Privileges Required, as well as not_defined (the default)
  * Default: `"not_defined"`
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"none"`
    * `"not_defined"`
  * Reference: [Modified Base Metrics](https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="modified_scope-cvssv3modifiedscopestring"></a>
### `modified_scope` ∷ CVSSv3ModifiedScopeString

modified scope

* This entry is _optional_


  * *CVSSv3ModifiedScope* The same values as Scope, as well as not_defined (the default)
  * Default: `"not_defined"`
  * Allowed values:
    * `"changed"`
    * `"not_defined"`
    * `"unchanged"`
  * Reference: [Modified Base Metrics](https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="modified_user_interaction-cvssv3modifieduserinteractionstring"></a>
### `modified_user_interaction` ∷ CVSSv3ModifiedUserInteractionString

modified user interaction

* This entry is _optional_


  * *CVSSv3ModifiedUserInteraction* The same values as User Interaction, as well as not_defined (the default)
  * Allowed values:
    * `"none"`
    * `"not_defined"`
    * `"required"`
  * Reference: [Modified Base Metrics](https://www.first.org/cvss/specification-document#4-2-Modified-Base-Metrics)


<a id="privileges_required-cvssv3privilegesrequiredstring"></a>
### `privileges_required` ∷ CVSSv3PrivilegesRequiredString

describes the level of privileges an attacker must possess before successfully exploiting the vulnerability

* This entry is _optional_


  * *CVSSv3PrivilegesRequired* This metric describes the level of privileges an attacker must possess before successfully exploiting the vulnerability. This metric is greatest if no privileges are required. The list of possible values is: `none`: The attacker is unauthorized prior to attack, and therefore does not require any access to settings or files to carry out an attack. `low`: The attacker is authorized with (i.e. requires) privileges that provide basic user capabilities that could normally affect only settings and files owned by a user. Alternatively, an attacker with Low privileges may have the ability to cause an impact only to non-sensitive resources. `high`: The attacker is authorized with (i.e. requires) privileges that provide significant (e.g. administrative) control over the vulnerable component that could affect component-wide settings and files.
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"none"`
  * Reference: [Privileges Required](https://www.first.org/cvss/specification-document#2-1-3-Privileges-Required-PR)


<a id="remediation_level-cvssv3remediationlevelstring"></a>
### `remediation_level` ∷ CVSSv3RemediationLevelString

Remediation Level of a vulnerability is an important factor for prioritization

* This entry is _optional_


  * *CVSSv3RemediationLevel* The Remediation Level of a vulnerability is an important factor for prioritization. The typical vulnerability is unpatched when initially published. Workarounds or hotfixes may offer interim remediation until an official patch or upgrade is issued. Each of these respective stages adjusts the temporal score downwards, reflecting the decreasing urgency as remediation becomes final. The list of possible values is: `not_defined`: Assigning this value to the metric will not influence the score. It is a signal to a scoring equation to skip this metric. `unavailable`: There is either no solution available or it is impossible to apply. `workaround`: There is an unofficial, non-vendor solution available. In some cases, users of the affected technology will create a patch of their own or provide steps to work around or otherwise mitigate the vulnerability. `temporary_fix`: There is an official but temporary fix available. This includes instances where the vendor issues a temporary hotfix, tool, or workaround.`official_fix`: A complete vendor solution is available. Either the vendor has issued an official patch, or an upgrade is available. The less official and permanent a fix, the higher the vulnerability score. 
  * Allowed values:
    * `"high"`
    * `"not_defined"`
    * `"offical_fix"`
    * `"temporary_fix"`
    * `"unavailable"`
    * `"workaround"`
  * Reference: [Remediation Level](https://www.first.org/cvss/specification-document#3-2-Remediation-Level-RL)


<a id="report_confidence-cvssv3reportconfidencestring"></a>
### `report_confidence` ∷ CVSSv3ReportConfidenceString

measures the degree of confidence in the existence of the vulnerability and the credibility of the known technical details

* This entry is _optional_


  * *CVSSv3ReportConfidence* measures the degree of confidence in the existence of the vulnerability and the credibility of the known technical details. Sometimes only the existence of vulnerabilities are publicized, but without specific details. For example, an impact may be recognized as undesirable, but the root cause may not be known. The vulnerability may later be corroborated by research which suggests where the vulnerability may lie, though the research may not be certain. Finally, a vulnerability may be confirmed through acknowledgement by the author or vendor of the affected technology. The urgency of a vulnerability is higher when a vulnerability is known to exist with certainty. This metric also suggests the level of technical knowledge available to would-be attackers. The list of possible values  is: `not_defined`: Assigning this value to the metric will not influence the score. It is a signal to a scoring equation to skip this metric. `confirmed`: Detailed reports exist, or functional reproduction is possible (functional exploits may provide this). Source code is available to independently verify theassertions of the research, or the author or vendor of the affected code has confirmed the presence of the vulnerability. `reasonable`: Significant details are published, but researchers either do not have full confidence in the root cause, or do not have access to source code to fully confirm all of the interactions that may lead to the result. Reasonable confidence exists, however, that the bug is reproducible and at least one impact is able to be verified (proof-of-concept exploits may provide this). An example is a detailed write-up of research into a vulnerability with an explanation (possibly obfuscated or 'left as an exercise to the reader') that gives assurances on how to reproduce the results. `unknown`: There are reports of impacts that indicate a vulnerability is present. The reports indicate that the cause of the vulnerability is unknown, or reports may differ on the cause or impacts of the vulnerability. Reporters are uncertain of the true nature of the vulnerability, and there is little confidence in the validity of the reports or whether a static Base score can be applied given the differences described. An example is a bug report which notes that an intermittent but non-reproducible crash occurs, with evidence of memory corruption suggesting that denial of service, or possible more serious impacts, may result. The more a vulnerability is validated by the vendor or other reputable sources, the higher the score.
  * Allowed values:
    * `"confirmed"`
    * `"reasonable"`
    * `"unknown"`
  * Reference: [Report Confidence](https://www.first.org/cvss/specification-document#3-3-Report-Confidence-RC)


<a id="scope-cvssv3scopestring"></a>
### `scope` ∷ CVSSv3ScopeString

the ability for a vulnerability in one software component to impact resources beyond its means, or privileges

* This entry is _optional_


  * *CVSSv3Scope* An important property captured by CVSS v3.0 is the ability for a vulnerability in one software component to impact resources beyond its means, or privileges. This consequence is represented by the metric Authorization Scope, or simply Scope. Formally, Scope refers to the collection of privileges defined by a computing authority (e.g. an application, an operating system, or a sandbox environment) when granting access to computing resources (e.g. files, CPU, memory, etc). These privileges are assigned based on some method of identification and authorization. In some cases, the authorization may be simple or loosely controlled based upon predefined rules or standards. For example, in the case of Ethernet traffic sent to a network switch, the switch accepts traffic that arrives on its ports and is an authority that controls the traffic flow to other switch ports. When the vulnerability of a software component governed by one authorization scope is able to affect resources governed by another authorization scope, a Scope change has occurred. Intuitively, one may think of a scope change as breaking out of a sandbox, and an example would be a vulnerability in a virtual machine that enables an attacker to delete files on the host OS (perhaps even its own VM). In this example, there are two separate authorization authorities: one that defines and enforces privileges for the virtual machine and its users, and one that defines and enforces privileges for the host system within which the virtual machine runs. a scope change would not occur, for example, with a vulnerability in Microsoft Word that allows an attacker to compromise all system files of the host OS, because the same authority enforces privileges of the user's instance of Word, and the host's system files. The Base score is greater when a scope change has occurred. The list of possible values is: `unchanged`: An exploited vulnerability can only affect resources managed by the same authority. In this case the vulnerable component and the impacted component are the same. `changed`: An exploited vulnerability can affect resources beyond the authorization privileges intended by the vulnerable component. In this case the vulnerable component and the impacted component are different.
  * Allowed values:
    * `"changed"`
    * `"unchanged"`
  * Reference: [Scope](https://www.first.org/cvss/specification-document#2-2-Scope-S)


<a id="temporal_score-number"></a>
### `temporal_score` ∷ Number

Round up(CVSSv3BaseScore × CVSSv3ExploitCodeMaturity × CVSSv3RemediationLevel × CVSSv3ReportConfidence)

* This entry is _optional_


  * a Score number from 0 to 10

<a id="temporal_severity-cvssv3severitystring"></a>
### `temporal_severity` ∷ CVSSv3SeverityString

temporal severity

* This entry is _optional_


  * Allowed values:
    * `"critical"`
    * `"high"`
    * `"low"`
    * `"medium"`
    * `"none"`

<a id="user_interaction-cvssv3userinteractionstring"></a>
### `user_interaction` ∷ CVSSv3UserInteractionString

captures the requirement for a user, other than the attacker, to participate in the successful compromise of the vulnerable component

* This entry is _optional_


  * *CVSSv3UserInteraction* captures the requirement for a user, other than the attacker, to participate in the successful compromise of the vulnerable component. This metric determines whether the vulnerability can be exploited solely at the will of the attacker, or whether a separate user (or user-initiated process) must participate in some manner. This metric value is greatest when no user interaction is required. The list of possible values is: `none`: The vulnerable system can be exploited without interaction from any user. `required`: Successful exploitation of this vulnerability requires a user to take some action before the vulnerability can be exploited. For example, a successful exploit may only be possible during the installation of an application by a system administrator.
  * Allowed values:
    * `"none"`
    * `"required"`
  * Reference: [User Interaction](https://www.first.org/cvss/specification-document#2-1-4-User-Interaction-UI)


<a id="vector_string-string"></a>
### `vector_string` ∷ String

* This entry is **required**


  * a text representation of a set of CVSSv3 metrics. It is commonly used to record or transfer CVSSv3 metric information in a concise form
