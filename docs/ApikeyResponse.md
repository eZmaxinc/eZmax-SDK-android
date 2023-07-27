

# ApikeyResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiApikeyID** | **Integer** | The unique ID of the Apikey | 
**fkiUserID** | **Integer** | The unique ID of the User | 
**objApikeyDescription** | [**MultilingualApikeyDescription**](MultilingualApikeyDescription.md) |  | 
**objContactName** | [**CustomContactNameResponse**](CustomContactNameResponse.md) |  | 
**sApikeyApikey** | **String** | The Apikey for the API key.  This will be hidden if we are not creating or regenerating the Apikey. |  [optional]
**sApikeySecret** | **String** | The Secret for the API key.  This will be hidden if we are not creating or regenerating the Apikey. |  [optional]
**bApikeyIsactive** | **Boolean** | Whether the apikey is active or not | 
**bApikeyIssigned** | **Boolean** | Whether the apikey is signed or not |  [optional]
**objAudit** | [**CommonAudit**](CommonAudit.md) |  | 




