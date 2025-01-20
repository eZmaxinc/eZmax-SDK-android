

# UserRequestCompoundV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiUserID** | **Integer** | The unique ID of the User |  [optional]
**fkiAgentID** | **Integer** | The unique ID of the Agent. |  [optional]
**fkiBrokerID** | **Integer** | The unique ID of the Broker. |  [optional]
**fkiAssistantID** | **Integer** | The unique ID of the Assistant. |  [optional]
**fkiEmployeeID** | **Integer** | The unique ID of the Employee. |  [optional]
**fkiCompanyIDDefault** | **Integer** | The unique ID of the Company | 
**fkiDepartmentIDDefault** | **Integer** | The unique ID of the Department | 
**fkiTimezoneID** | **Integer** | The unique ID of the Timezone | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**objEmail** | [**EmailRequest**](EmailRequest.md) | An Email Object and children to create a complete structure | 
**fkiBillingentityinternalID** | **Integer** | The unique ID of the Billingentityinternal. | 
**objPhoneHome** | [**PhoneRequestV2**](PhoneRequestV2.md) | A Phone Object and children to create a complete structure |  [optional]
**objPhoneSMS** | [**PhoneRequestV2**](PhoneRequestV2.md) | A Phone Object and children to create a complete structure |  [optional]
**fkiSecretquestionID** | **Integer** | The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father&#39;s middle name| |15|Your mother&#39;s maiden name| |16|Name of your eldest child| |17|Your spouse&#39;s middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat&#39;s name| |22|Date of Birth (YYYY-MM-DD)| |22|Secret Code| |22|Your reference code| |  [optional]
**sUserSecretresponse** | **String** | The answer to the Secretquestion |  [optional]
**fkiModuleIDForm** | **Integer** | The unique ID of the Module |  [optional]
**eUserType** | [**FieldEUserType**](FieldEUserType.md) |  | 
**eUserLogintype** | [**FieldEUserLogintype**](FieldEUserLogintype.md) |  | 
**sUserFirstname** | **String** | The first name of the user | 
**sUserLastname** | **String** | The last name of the user | 
**sUserLoginname** | **String** | The login name of the User. | 
**sUserJobtitle** | **String** | The job title of the user |  [optional]
**eUserEzsignaccess** | [**FieldEUserEzsignaccess**](FieldEUserEzsignaccess.md) |  | 
**bUserIsactive** | **Boolean** | Whether the User is active or not | 
**bUserValidatebyadministration** | **Boolean** | Whether if the transactions in which the User is implicated must be validated by administrative personnel or not |  [optional]
**bUserValidatebydirector** | **Boolean** | Whether if the transactions in which the User is implicated must be validated by a director or not |  [optional]
**bUserAttachmentautoverified** | **Boolean** | Whether if Attachments uploaded by the User must be validated or not |  [optional]
**bUserChangepassword** | **Boolean** | Whether if the User is forced to change its password |  [optional]




