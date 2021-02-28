

# SsprResetPasswordV1Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pksCustomerCode** | **String** | The customer code assigned to your account | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**eUserTypeSSPR** | [**FieldEUserTypeSSPR**](FieldEUserTypeSSPR.md) |  | 
**sEmailAddress** | **String** | The email address. |  [optional]
**sUserLoginname** | **String** | The Login name of the User. |  [optional]
**binUserSSPRtoken** | **String** | Hex Encoded Secret SSPR token | 




