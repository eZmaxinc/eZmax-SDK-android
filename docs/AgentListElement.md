

# AgentListElement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiAgentID** | **Integer** | The unique ID of the Agent. | 
**fkiAgenttypeID** | **Integer** | The unique ID of the Agenttype | 
**sAgenttypeNameX** | **String** | The name of the Agenttype in the language of the requester | 
**fkiAgentincorporationID** | **Integer** | The unique ID of the Agentincorporation. |  [optional]
**sAgentincorporationName** | **String** | The name of the Agentincorporation |  [optional]
**fkiDepartmentID** | **Integer** | The unique ID of the Department | 
**sDepartmentNameX** | **String** | The Name of the Department in the language of the requester | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sLanguageNameX** | **String** | The Name of the Language in the language of the requester | 
**sRealestateboardnumberNumber** | **String** | The number of the Realestateboardnumber |  [optional]
**sAgentCode** | **String** | The code of the Agent | 
**iAgentPhotocopiercode** | **Integer** | The photocopiercode of the Agent | 
**iAgentLongdistancecode** | **Integer** | The longdistancecode of the Agent | 
**iAgentBannernumber** | **Integer** | The bannernumber of the Agent | 
**sAgentRealestateassociationlicense** | **String** | The realestateassociationlicense of the Agent | 
**dtAgentHiredate** | **String** | The hiredate of the Agent |  [optional]
**dtAgentLeavedate** | **String** | The leavedate of the Agent |  [optional]
**dtAgentContractdate** | **String** | The contract date of the Agent |  [optional]
**dtAgentTransferdate** | **String** | The transfer date of the Agent |  [optional]
**dtAgentSenioritydate** | **String** | The seniority date of the Agent |  [optional]
**dtAgentSickleavestart** | **String** | The sick leave start date of the Agent |  [optional]
**dtAgentSickleaveend** | **String** | The sick leave end date of the Agent |  [optional]
**bAgentTranquillit** | **Boolean** | Whether if it&#39;s an tranquillit | 
**bAgentResidentiallicense** | **Boolean** | Whether if it&#39;s an residentiallicense | 
**bAgentCommerciallicense** | **Boolean** | Whether if it&#39;s an commerciallicense | 
**bAgentMortgagelicense** | **Boolean** | Whether if it&#39;s an mortgagelicense | 
**bAgentPaidbyofficetranquillit** | **Boolean** | Whether if it&#39;s an paidbyofficetranquillit | 
**dtAgentFintraccertification** | **String** | The fintraccertification of the Agent |  [optional]
**bAgentIsactive** | **Boolean** | Whether the Agent is active or not | 
**sContactFirstname** | **String** | The First name of the contact | 
**sContactLastname** | **String** | The Last name of the contact | 
**dtContactBirthdate** | **String** | The Birth Date of the contact |  [optional]
**sEmailAddress** | **String** | The email address. |  [optional]
**sPhoneE164** | **String** | A phone number in E.164 Format |  [optional]
**sAddressCivic** | **String** | The Civic number. |  [optional]
**sAddressStreet** | **String** | The Street Name |  [optional]
**sAddressSuite** | **String** | The Suite or appartment number |  [optional]
**sAddressCity** | **String** | The City name |  [optional]
**sAddressZip** | **String** | The Postal/Zip Code  The value must be entered without spaces |  [optional]
**fkiProvinceID** | **Integer** | The unique ID of the Province.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|(Canada) Alberta |2|(Canada) British Columbia| |3|(Canada) Manitoba| |3|(Canada) Manitoba| |4|(Canada) New Brunswick| |5|(Canada) Newfoundland| |6|(Canada) Northwest Territories| |7|(Canada) Nova Scotia| |8|(Canada) Nunavut| |9|(Canada) Ontario| |10|(Canada) Prince Edward Island| |11|(Canada) Quebec| |12|(Canada) Saskatchewan| |13|(Canada) Yukon| |14|(United-States) Alabama| |15|(United-States) Alaska| |16|(United-States) Arizona| |17|(United-States) Arkansas| |18|(United-States) California| |19|(United-States) Colorado| |20|(United-States) Connecticut| |21|(United-States) Delaware| |22|(United-States) District of Columbia| |23|(United-States) Florida| |24|(United-States) Georgia| |25|(United-States) Hawaii| |26|(United-States) Idaho| |27|(United-States) Illinois| |28|(United-States) Indiana| |29|(United-States) Iowa| |30|(United-States) Kansas| |31|(United-States) Kentucky| |32|(United-States) Louisiane| |33|(United-States) Maine| |34|(United-States) Maryland| |35|(United-States) Massachusetts| |36|(United-States) Michigan| |37|(United-States) Minnesota| |38|(United-States) Mississippi| |39|(United-States) Missouri| |40|(United-States) Montana| |41|(United-States) Nebraska| |42|(United-States) Nevada| |43|(United-States) New Hampshire| |44|(United-States) New Jersey| |45|(United-States) New Mexico| |46|(United-States) New York| |47|(United-States) North Carolina| |48|(United-States) North Dakota| |49|(United-States) Ohio| |50|(United-States) Oklahoma| |51|(United-States) Oregon| |52|(United-States) Pennsylvania| |53|(United-States) Rhode Island| |54|(United-States) South Carolina| |55|(United-States) South Dakota| |56|(United-States) Tennessee| |57|(United-States) Texas| |58|(United-States) Utah| |60|(United-States) Vermont| |59|(United-States) Virginia| |61|(United-States) Washington| |62|(United-States) West Virginia| |63|(United-States) Wisconsin| |64|(United-States) Wyoming| |  [optional]
**sProvinceNameX** | **String** | The name of the Province in the language of the requester |  [optional]
**fkiCountryID** | **Integer** | The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States| |  [optional]
**sCountryNameX** | **String** | The name of the Country in the language of the requester |  [optional]




