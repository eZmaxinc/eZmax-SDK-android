

# UserResponseCompound

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiUserID** | **Integer** | The unique ID of the User | 
**fkiAgentID** | **Integer** | The unique ID of the Agent. |  [optional]
**fkiBrokerID** | **Integer** | The unique ID of the Broker. |  [optional]
**fkiAssistantID** | **Integer** | The unique ID of the Assistant. |  [optional]
**fkiEmployeeID** | **Integer** | The unique ID of the Employee. |  [optional]
**fkiCompanyIDDefault** | **Integer** | The unique ID of the Company | 
**sCompanyNameX** | **String** | The Name of the Company in the language of the requester | 
**fkiDepartmentIDDefault** | **Integer** | The unique ID of the Department | 
**sDepartmentNameX** | **String** | The Name of the Department in the language of the requester | 
**fkiTimezoneID** | **Integer** | The unique ID of the Timezone | 
**sTimezoneName** | **String** | The description of the Timezone | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sLanguageNameX** | **String** | The Name of the Language in the language of the requester | 
**objEmail** | [**EmailResponse**](EmailResponse.md) | An Email Object and children to create a complete structure | 
**fkiBillingentityinternalID** | **Integer** | The unique ID of the Billingentityinternal. | 
**sBillingentityinternalDescriptionX** | **String** | The description of the Billingentityinternal in the language of the requester | 
**objPhoneHome** | [**PhoneResponseCompound**](PhoneResponseCompound.md) |  |  [optional]
**objPhoneSMS** | [**PhoneResponseCompound**](PhoneResponseCompound.md) |  |  [optional]
**fkiSecretquestionID** | **Integer** | The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father&#39;s middle name| |15|Your mother&#39;s maiden name| |16|Name of your eldest child| |17|Your spouse&#39;s middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat&#39;s name| |22|Date of Birth (YYYY-MM-DD)| |22|Secret Code| |22|Your reference code| |  [optional]
**fkiModuleIDForm** | **Integer** | The unique ID of the Module |  [optional]
**sModuleNameX** | **String** | The Name of the Module in the language of the requester |  [optional]
**eUserOrigin** | [**FieldEUserOrigin**](FieldEUserOrigin.md) |  | 
**eUserType** | [**FieldEUserType**](FieldEUserType.md) |  | 
**eUserLogintype** | [**FieldEUserLogintype**](FieldEUserLogintype.md) |  | 
**sUserFirstname** | **String** | The first name of the user | 
**sUserLastname** | **String** | The last name of the user | 
**sUserLoginname** | **String** | The login name of the User. | 
**sUserJobtitle** | **String** | The job title of the user |  [optional]
**eUserEzsignaccess** | [**FieldEUserEzsignaccess**](FieldEUserEzsignaccess.md) |  | 
**dtUserLastlogondate** | **String** | The last logon date of the User |  [optional]
**dtUserPasswordchanged** | **String** | The date at which the User&#39;s password was last changed |  [optional]
**dtUserEzsignprepaidexpiration** | **String** | The eZsign prepaid expiration date |  [optional]
**bUserIsactive** | **Boolean** | Whether the User is active or not | 
**bUserValidatebyadministration** | **Boolean** | Whether if the transactions in which the User is implicated must be validated by administrative personnel or not |  [optional]
**bUserValidatebydirector** | **Boolean** | Whether if the transactions in which the User is implicated must be validated by a director or not |  [optional]
**bUserAttachmentautoverified** | **Boolean** | Whether if Attachments uploaded by the User must be validated or not |  [optional]
**bUserChangepassword** | **Boolean** | Whether if the User is forced to change its password | 
**objAudit** | [**CommonAudit**](CommonAudit.md) |  | 




