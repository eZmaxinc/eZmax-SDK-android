

# ContactinformationsResponseCompound

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiContactinformationsID** | **Integer** | The unique ID of the Contactinformations | 
**fkiAddressIDDefault** | **Integer** | The unique ID of the Address |  [optional]
**fkiPhoneIDDefault** | **Integer** | The unique ID of the Phone. |  [optional]
**fkiEmailIDDefault** | **Integer** | The unique ID of the Email |  [optional]
**fkiWebsiteIDDefault** | **Integer** | The unique ID of the Website Default |  [optional]
**eContactinformationsType** | [**FieldEContactinformationsType**](FieldEContactinformationsType.md) |  | 
**sContactinformationsUrl** | **String** | The url of the Contactinformations |  [optional]
**objAddressDefault** | [**AddressResponse**](AddressResponse.md) | An Address Object and children to create a complete structure |  [optional]
**objPhoneDefault** | [**PhoneResponseCompound**](PhoneResponseCompound.md) |  |  [optional]
**objEmailDefault** | [**EmailResponse**](EmailResponse.md) | An Email Object and children to create a complete structure |  [optional]
**objWebsiteDefault** | [**WebsiteResponse**](WebsiteResponse.md) | A Website Object and children to create a complete structure |  [optional]
**aObjAddress** | [**List&lt;AddressResponseCompound&gt;**](AddressResponse.md) |  | 
**aObjPhone** | [**List&lt;PhoneResponseCompound&gt;**](PhoneResponseCompound.md) |  | 
**aObjEmail** | [**List&lt;EmailResponseCompound&gt;**](EmailResponse.md) |  | 
**aObjWebsite** | [**List&lt;WebsiteResponseCompound&gt;**](WebsiteResponse.md) |  | 




