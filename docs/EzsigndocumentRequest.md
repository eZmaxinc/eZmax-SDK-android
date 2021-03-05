

# EzsigndocumentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eEzsigndocumentSource** | [**EEzsigndocumentSourceEnum**](#EEzsigndocumentSourceEnum) | Indicates where to look for the document binary content. | 
**eEzsigndocumentFormat** | [**EEzsigndocumentFormatEnum**](#EEzsigndocumentFormatEnum) | Indicates the format of the document. | 
**sEzsigndocumentBase64** | **byte[]** | The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource &#x3D; Base64. |  [optional]
**fkiEzsignfolderID** | **Integer** | A reference to a valid Ezsignfolder.  That value is returned after a successful Ezsignfolder Creation. | 
**dtEzsigndocumentDuedate** | **String** | Represent a Date Time. The timezone is the one configured in the User&#39;s profile. | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sEzsigndocumentName** | **String** | The name of the document that will be presented to Ezsignfoldersignerassociations | 


## Enum: EEzsigndocumentSourceEnum

Name | Value
---- | -----


## Enum: EEzsigndocumentFormatEnum

Name | Value
---- | -----




