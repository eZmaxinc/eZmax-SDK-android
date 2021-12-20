

# EzsigndocumentRequestCompound

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eEzsigndocumentSource** | [**EEzsigndocumentSourceEnum**](#EEzsigndocumentSourceEnum) | Indicates where to look for the document binary content. | 
**eEzsigndocumentFormat** | [**EEzsigndocumentFormatEnum**](#EEzsigndocumentFormatEnum) | Indicates the format of the document. | 
**sEzsigndocumentBase64** | **byte[]** | The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource &#x3D; Base64. |  [optional]
**sEzsigndocumentUrl** | **String** | The url where the document content resides.  This field is Required when eEzsigndocumentSource &#x3D; Url. |  [optional]
**bEzsigndocumentForcerepair** | **Boolean** | Try to repair the document or flatten it if it cannot be used for electronic signature.  |  [optional]
**sEzsigndocumentPassword** | **String** | If the source document is password protected, the password to open/modify it. |  [optional]
**fkiEzsignfolderID** | **Integer** | The unique ID of the Ezsignfolder | 
**dtEzsigndocumentDuedate** | **String** | The maximum date and time at which the Ezsigndocument can be signed. | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sEzsigndocumentName** | **String** | The name of the document that will be presented to Ezsignfoldersignerassociations | 


## Enum: EEzsigndocumentSourceEnum

Name | Value
---- | -----


## Enum: EEzsigndocumentFormatEnum

Name | Value
---- | -----




