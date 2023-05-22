

# ActivesessionGetCurrentV1ResponseMPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eActivesessionUsertype** | [**FieldEActivesessionUsertype**](FieldEActivesessionUsertype.md) |  | 
**eActivesessionOrigin** | [**FieldEActivesessionOrigin**](FieldEActivesessionOrigin.md) |  | 
**eActivesessionWeekdaystart** | [**FieldEActivesessionWeekdaystart**](FieldEActivesessionWeekdaystart.md) |  | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sCompanyNameX** | **String** | The Name of the Company in the language of the requester | 
**sDepartmentNameX** | **String** | The Name of the Department in the language of the requester | 
**bActivesessionDebug** | **Boolean** | Whether the active session is in debug or not | 
**bActivesessionIssuperadmin** | **Boolean** | Whether the active session is superadmin or not | 
**pksCustomerCode** | **String** | The customer code assigned to your account | 
**fkiSystemconfigurationtypeID** | **Integer** | The unique ID of the Systemconfigurationtype |  [optional]
**aPkiPermissionID** | **List&lt;Integer&gt;** | An array of permissions granted to the user or api key | 
**objUserReal** | [**ActivesessionResponseCompoundUser**](ActivesessionResponseCompoundUser.md) |  | 
**objUserCloned** | [**ActivesessionResponseCompoundUser**](ActivesessionResponseCompoundUser.md) |  |  [optional]
**objApikey** | [**ActivesessionResponseCompoundApikey**](ActivesessionResponseCompoundApikey.md) |  |  [optional]
**aEModuleInternalname** | **List&lt;String&gt;** | An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key. | 




