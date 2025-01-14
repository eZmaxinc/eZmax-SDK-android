

# ContactResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiContactID** | **Integer** | The unique ID of the Contact | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**fkiContacttitleID** | **Integer** | The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)| | 
**fkiContactinformationsID** | **Integer** | The unique ID of the Contactinformations | 
**dtContactBirthdate** | **String** | The Birth Date of the contact |  [optional]
**eContactType** | [**FieldEContactType**](FieldEContactType.md) |  | 
**sContactFirstname** | **String** | The First name of the contact | 
**sContactLastname** | **String** | The Last name of the contact | 
**sContactCompany** | **String** | The Company name of the contact |  [optional]
**sContactOccupation** | **String** | The occupation of the Contact |  [optional]
**tContactNote** | **String** | The note of the Contact |  [optional]
**bContactIsactive** | **Boolean** | Whether the contact is active or not | 
**objContactinformations** | [**ContactinformationsResponseCompound**](ContactinformationsResponseCompound.md) |  | 




