

# EzsigndocumentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigndocumentID** | **Integer** | The unique ID of the Ezsigndocument |  [optional]
**fkiEzsignfolderID** | **Integer** | The unique ID of the Ezsignfolder | 
**fkiEzsigntemplateID** | **Integer** | The unique ID of the Ezsigntemplate |  [optional]
**fkiEzsignfoldersignerassociationID** | **Integer** | The unique ID of the Ezsignfoldersignerassociation |  [optional]
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**eEzsigndocumentSource** | [**EEzsigndocumentSourceEnum**](#EEzsigndocumentSourceEnum) | Indicates where to look for the document binary content. | 
**eEzsigndocumentFormat** | [**EEzsigndocumentFormatEnum**](#EEzsigndocumentFormatEnum) | Indicates the format of the document. |  [optional]
**sEzsigndocumentBase64** | **byte[]** | The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource &#x3D; Base64. |  [optional]
**sEzsigndocumentUrl** | **String** | The url where the document content resides.  This field is Required when eEzsigndocumentSource &#x3D; Url. |  [optional]
**bEzsigndocumentForcerepair** | **Boolean** | Try to repair the document or flatten it if it cannot be used for electronic signature.  |  [optional]
**sEzsigndocumentPassword** | **String** | If the source document is password protected, the password to open/modify it. |  [optional]
**eEzsigndocumentForm** | [**EEzsigndocumentFormEnum**](#EEzsigndocumentFormEnum) | If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsignformfieldgroups and assign them to the specified **fkiEzsignfoldersignerassociationID**  **Discard** removes the form from the document. |  [optional]
**dtEzsigndocumentDuedate** | **String** | The maximum date and time at which the Ezsigndocument can be signed. | 
**sEzsigndocumentName** | **String** | The name of the document that will be presented to Ezsignfoldersignerassociations | 
**sEzsigndocumentExternalid** | **String** | This field can be used to store an External ID from the client&#39;s system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format.  |  [optional]


## Enum: EEzsigndocumentSourceEnum

Name | Value
---- | -----


## Enum: EEzsigndocumentFormatEnum

Name | Value
---- | -----


## Enum: EEzsigndocumentFormEnum

Name | Value
---- | -----




