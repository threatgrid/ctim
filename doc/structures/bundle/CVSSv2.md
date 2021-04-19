<a id="map121"></a>
# *CVSSv2*

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[base_score](#base_score-number)|Number| |**Required**|
|[base_severity](#base_severity-highmedlowstring)|HighMedLowString| |**Required**|
|[vector_string](#vector_string-string)|String| |**Required**|
|[access_complexity](#access_complexity-cvssv2accesscomplexitystring)|CVSSv2AccessComplexityString| |_Optional_|
|[access_vector](#access_vector-cvssv2accessvectorstring)|CVSSv2AccessVectorString| |_Optional_|
|[authentication](#authentication-cvssv2authenticationstring)|CVSSv2AuthenticationString| |_Optional_|
|[availability_impact](#availability_impact-cvssv2availabilityimpactstring)|CVSSv2AvailabilityImpactString| |_Optional_|
|[availability_requirement](#availability_requirement-cvssv2securityrequirementstring)|CVSSv2SecurityRequirementString| |_Optional_|
|[collateral_damage_potential](#collateral_damage_potential-cvssv2collateraldamagepotentialstring)|CVSSv2CollateralDamagePotentialString| |_Optional_|
|[confidentiality_impact](#confidentiality_impact-cvssv2confidentialityimpactstring)|CVSSv2ConfidentialityImpactString| |_Optional_|
|[confidentiality_requirement](#confidentiality_requirement-cvssv2securityrequirementstring)|CVSSv2SecurityRequirementString| |_Optional_|
|[environmental_vector_string](#environmental_vector_string-string)|String| |_Optional_|
|[exploitability](#exploitability-cvssv2exploitabilitystring)|CVSSv2ExploitabilityString| |_Optional_|
|[exploitability_score](#exploitability_score-number)|Number| |_Optional_|
|[impact_score](#impact_score-number)|Number| |_Optional_|
|[integrity_impact](#integrity_impact-cvssv2integrityimpactstring)|CVSSv2IntegrityImpactString| |_Optional_|
|[integrity_requirement](#integrity_requirement-cvssv2securityrequirementstring)|CVSSv2SecurityRequirementString| |_Optional_|
|[obtain_all_privilege](#obtain_all_privilege-boolean)|Boolean| |_Optional_|
|[obtain_other_privilege](#obtain_other_privilege-boolean)|Boolean| |_Optional_|
|[obtain_user_privilege](#obtain_user_privilege-boolean)|Boolean| |_Optional_|
|[remediation_level](#remediation_level-cvssv2remediationlevelstring)|CVSSv2RemediationLevelString| |_Optional_|
|[report_confidence](#report_confidence-cvssv2reportconfidencestring)|CVSSv2ReportConfidenceString| |_Optional_|
|[target_distribution](#target_distribution-cvssv2targetdistributionstring)|CVSSv2TargetDistributionString| |_Optional_|
|[temporal_vector_string](#temporal_vector_string-string)|String| |_Optional_|
|[user_interaction_required](#user_interaction_required-boolean)|Boolean| |_Optional_|


<a id="access_complexity-cvssv2accesscomplexitystring"></a>
### `access_complexity` ∷ CVSSv2AccessComplexityString

* This entry is _optional_


  * *CVSSv2AccessComplexity* This metric measures the complexity of the attack required to exploit the vulnerability once an attacker has gained access to the target system. For example, consider a buffer overflow in an Internet service: once the target system is located, the attacker can launch an exploit at will.
  * Default: `"low"`
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"medium"`
  * Reference: https://www.first.org/cvss/v2/guide#2-1-2-Access-Complexity-AC


<a id="access_vector-cvssv2accessvectorstring"></a>
### `access_vector` ∷ CVSSv2AccessVectorString

* This entry is _optional_


  * *CVSSv2AccessVector* This metric reflects how the vulnerability is exploited.The more remote an attacker can be to attack a host, the greater the vulnerability score.
  * Default: `"network"`
  * Allowed values:
    * `"adjacent network"`
    * `"local"`
    * `"network"`
  * Reference: https://www.first.org/cvss/v2/guide#2-1-1-Access-Vector-AV


<a id="authentication-cvssv2authenticationstring"></a>
### `authentication` ∷ CVSSv2AuthenticationString

* This entry is _optional_


  * *CVSSv2Authentication* This metric measures the number of times an attacker must authenticate to a target in order to exploit a vulnerability. This metric does not gauge the strength or complexity of the authentication process, only that an attacker is required to provide credentials before an exploit may occur. The fewer authentication instances that are required, the higher the vulnerability score.
  * Default: `"none"`
  * Allowed values:
    * `"multiple"`
    * `"none"`
    * `"single"`
  * Reference: https://www.first.org/cvss/v2/guide#2-1-3-Authentication-Au


<a id="availability_impact-cvssv2availabilityimpactstring"></a>
### `availability_impact` ∷ CVSSv2AvailabilityImpactString

* This entry is _optional_


  * *CVSSv2AvailabilityImpact* This metric measures the impact to availability of a successfully exploited vulnerability. Availability refers to the accessibility of information resources. Attacks that consume network bandwidth, processor cycles, or disk space all impact the availability of a system. Increased availability impact increases the vulnerability score.
  * Default: `"complete"`
  * Allowed values:
    * `"complete"`
    * `"none"`
    * `"partial"`
  * Reference: https://www.first.org/cvss/v2/guide#2-1-6-Availability-Impact-A


<a id="availability_requirement-cvssv2securityrequirementstring"></a>
### `availability_requirement` ∷ CVSSv2SecurityRequirementString

* This entry is _optional_


  * *CVSSv2SecurityRequirement* These metrics enable the analyst to customize the CVSS score depending on the importance of the affected IT asset to a users organization, measured in terms of confidentiality, integrity, and availability, That is, if an IT asset supports a business function for which availability is most important, the analyst can assign a greater value to availability, relative to confidentiality and integrity. Each security requirement has three possible values: low, medium, or high.
  * Default: `"not_defined"`
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"medium"`
    * `"not_defined"`
  * Reference: https://www.first.org/cvss/v2/guide#2-3-3-Security-Requirements-CR-IR-AR


<a id="base_score-number"></a>
### `base_score` ∷ Number

* This entry is **required**


  * a Score number from 0 to 10

<a id="base_severity-highmedlowstring"></a>
### `base_severity` ∷ HighMedLowString

* This entry is **required**


  * Allowed values:
    * `"High"`
    * `"Info"`
    * `"Low"`
    * `"Medium"`
    * `"None"`
    * `"Unknown"`
  * Reference: [HighMedLowVocab](http://stixproject.github.io/data-model/1.2/stixVocabs/HighMediumLowVocab-1.0/)


<a id="collateral_damage_potential-cvssv2collateraldamagepotentialstring"></a>
### `collateral_damage_potential` ∷ CVSSv2CollateralDamagePotentialString

* This entry is _optional_


  * *CVSSv2CollateralDamagePotential* This metric measures the potential for loss of life or physical assets through damage or theft of property or equipment.  The metric may also measure economic loss of productivity or revenue. Naturally, the greater the damage potential, the higher the vulnerability score.
  * Default: `"not_defined"`
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"low_medium"`
    * `"medium_high"`
    * `"none"`
    * `"not_defined"`
  * Reference: https://www.first.org/cvss/v2/guide#2-3-1-Collateral-Damage-Potential-CDP


<a id="confidentiality_impact-cvssv2confidentialityimpactstring"></a>
### `confidentiality_impact` ∷ CVSSv2ConfidentialityImpactString

* This entry is _optional_


  * *CVSSv2ConfidentialityImpact* This metric measures the impact on confidentiality of a successfully exploited vulnerability. Confidentiality refers to limiting information access and disclosure to only authorized users, as well as preventing access by, or disclosure to, unauthorized ones. Increasedconfidentiality impact increases the vulnerability score.
  * Default: `"complete"`
  * Allowed values:
    * `"complete"`
    * `"none"`
    * `"partial"`
  * Reference: https://www.first.org/cvss/v2/guide#2-1-4-Confidentiality-Impact-C


<a id="confidentiality_requirement-cvssv2securityrequirementstring"></a>
### `confidentiality_requirement` ∷ CVSSv2SecurityRequirementString

* This entry is _optional_


  * *CVSSv2SecurityRequirement* These metrics enable the analyst to customize the CVSS score depending on the importance of the affected IT asset to a users organization, measured in terms of confidentiality, integrity, and availability, That is, if an IT asset supports a business function for which availability is most important, the analyst can assign a greater value to availability, relative to confidentiality and integrity. Each security requirement has three possible values: low, medium, or high.
  * Default: `"not_defined"`
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"medium"`
    * `"not_defined"`
  * Reference: https://www.first.org/cvss/v2/guide#2-3-3-Security-Requirements-CR-IR-AR


<a id="environmental_vector_string-string"></a>
### `environmental_vector_string` ∷ String

* This entry is _optional_


  * A text representation of a set of CVSSv2 environmental metrics. Environmental metrics allow analysists to calculate threat scores in relation to environmental security requirements, collateral damage potential, and target availability. It is commonly used to record or transfer CVSSv2 metric information in a concise form

<a id="exploitability-cvssv2exploitabilitystring"></a>
### `exploitability` ∷ CVSSv2ExploitabilityString

* This entry is _optional_


  * *CVSSv2Exploitability* This metric measures the current state of exploit techniques or code availability. Public availability of easy-to-use exploit code increases the number of potential attackers by including those who are unskilled thereby increasing the severity of the vulnerability.
  * Default: `"not_defined"`
  * Allowed values:
    * `"functional"`
    * `"high"`
    * `"not_defined"`
    * `"proof_of_concept"`
    * `"unproven"`
  * Reference: https://www.first.org/cvss/v2/guide#2-2-1-Exploitability-E


<a id="exploitability_score-number"></a>
### `exploitability_score` ∷ Number

* This entry is _optional_


  * a Score number from 0 to 10

<a id="impact_score-number"></a>
### `impact_score` ∷ Number

* This entry is _optional_


  * a Score number from 0 to 10

<a id="integrity_impact-cvssv2integrityimpactstring"></a>
### `integrity_impact` ∷ CVSSv2IntegrityImpactString

* This entry is _optional_


  * *CVSSv2IntegrityImpact* This metric measures the impact to integrity of a successfully exploited vulnerability. Integrity refers to the trustworthiness and guaranteed veracity of information. Increased integrity impact increases the vulnerability score.
  * Default: `"complete"`
  * Allowed values:
    * `"complete"`
    * `"none"`
    * `"partial"`
  * Reference: https://www.first.org/cvss/v2/guide#2-1-5-Integrity-Impact-I


<a id="integrity_requirement-cvssv2securityrequirementstring"></a>
### `integrity_requirement` ∷ CVSSv2SecurityRequirementString

* This entry is _optional_


  * *CVSSv2SecurityRequirement* These metrics enable the analyst to customize the CVSS score depending on the importance of the affected IT asset to a users organization, measured in terms of confidentiality, integrity, and availability, That is, if an IT asset supports a business function for which availability is most important, the analyst can assign a greater value to availability, relative to confidentiality and integrity. Each security requirement has three possible values: low, medium, or high.
  * Default: `"not_defined"`
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"medium"`
    * `"not_defined"`
  * Reference: https://www.first.org/cvss/v2/guide#2-3-3-Security-Requirements-CR-IR-AR


<a id="obtain_all_privilege-boolean"></a>
### `obtain_all_privilege` ∷ Boolean

* This entry is _optional_



<a id="obtain_other_privilege-boolean"></a>
### `obtain_other_privilege` ∷ Boolean

* This entry is _optional_



<a id="obtain_user_privilege-boolean"></a>
### `obtain_user_privilege` ∷ Boolean

* This entry is _optional_



<a id="remediation_level-cvssv2remediationlevelstring"></a>
### `remediation_level` ∷ CVSSv2RemediationLevelString

* This entry is _optional_


  * *CVSSv2RemediationLevel* The remediation level of a vulnerability is an important factor for prioritization. The typical vulnerability is unpatched when initially published. Workarounds or hotfixes may offer interim remediation until an official patch or upgrade is issued. Each of these respective stages adjusts the temporal score downwards, reflecting the decreasing urgency as remediation becomes final. The less official and permanent a fix, the higher the vulnerability score is.
  * Default: `"not_defined"`
  * Allowed values:
    * `"not_defined"`
    * `"official_fix"`
    * `"temporary_fix"`
    * `"unavailable"`
    * `"workaround"`
  * Reference: https://www.first.org/cvss/v2/guide#2-2-2-Remediation-Level-RL


<a id="report_confidence-cvssv2reportconfidencestring"></a>
### `report_confidence` ∷ CVSSv2ReportConfidenceString

* This entry is _optional_


  * *CVSSv2ReportConfidence* This metric measures the degree of confidence in the existence of the vulnerability and the credibility of the known technical details. Sometimes, only the existence of vulnerabilities are publicized, but without specific details. The vulnerability may later be corroborated and then confirmed through acknowledgement by the author or vendor of the affected technology. The urgency of a vulnerability is higher when a vulnerability is known to exist with certainty. This metric also suggests the level of technical knowledge available to would-be attackers. The more a vulnerability is validated by the vendor or other reputable sources, the higher the score.
  * Default: `"not_defined"`
  * Allowed values:
    * `"confirmed"`
    * `"not_defined"`
    * `"unconfirmed"`
    * `"uncorroborated"`
  * Reference: https://www.first.org/cvss/v2/guide#2-2-3-Report-Confidence-RC


<a id="target_distribution-cvssv2targetdistributionstring"></a>
### `target_distribution` ∷ CVSSv2TargetDistributionString

* This entry is _optional_


  * *CVSSv2TargetDistribution* This metric measures the proportion of vulnerable systems. It is meant as an environment-specific indicator in order to approximate the percentage of systems that could be affected by the vulnerability. The greater the proportion of vulnerable systems, the higher the score.
  * Default: `"not_defined"`
  * Allowed values:
    * `"high"`
    * `"low"`
    * `"medium"`
    * `"none"`
    * `"not_defined"`
  * Reference: https://www.first.org/cvss/v2/guide#2-3-2-Target-Distribution-TD


<a id="temporal_vector_string-string"></a>
### `temporal_vector_string` ∷ String

* This entry is _optional_


  * A text representation of a set of CVSSv2 temporal metrics. Temporal metrics allow analysists to calculate threat severity based on temporal factors such as reliability of vulnerability reports, availability of mitigations, and the ease or difficulty of conducting the exploit. It is commonly used to record or transfer CVSSv2 metric information in a concise form

<a id="user_interaction_required-boolean"></a>
### `user_interaction_required` ∷ Boolean

* This entry is _optional_



<a id="vector_string-string"></a>
### `vector_string` ∷ String

* This entry is **required**


  * a text representation of a set of CVSSv2 metrics. It is commonly used to record or transfer CVSSv2 metric information in a concise form
