

# EzsigntemplatedocumentRequestCompound

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigntemplatedocumentID** | **Integer** | The unique ID of the Ezsigntemplatedocument |  [optional]
**fkiEzsigntemplateID** | **Integer** | The unique ID of the Ezsigntemplate | 
**fkiEzsigndocumentID** | **Integer** | The unique ID of the Ezsigndocument |  [optional]
**fkiEzsigntemplatesignerID** | **Integer** | The unique ID of the Ezsigntemplatesigner |  [optional]
**sEzsigntemplatedocumentName** | **String** | The name of the Ezsigntemplatedocument. | 
**eEzsigntemplatedocumentSource** | [**EEzsigntemplatedocumentSourceEnum**](#EEzsigntemplatedocumentSourceEnum) | Indicates where to look for the document binary content. | 
**eEzsigntemplatedocumentFormat** | [**EEzsigntemplatedocumentFormatEnum**](#EEzsigntemplatedocumentFormatEnum) | Indicates the format of the template. |  [optional]
**sEzsigntemplatedocumentBase64** | **byte[]** | The Base64 encoded binary content of the document.  This field is Required when eEzsigntemplatedocumentSource &#x3D; Base64. |  [optional]
**sEzsigntemplatedocumentUrl** | **String** | The url where the document content resides.  This field is Required when eEzsigntemplatedocumentSource &#x3D; Url. |  [optional]
**bEzsigntemplatedocumentForcerepair** | **Boolean** | Try to repair the document or flatten it if it cannot be used for electronic signature. |  [optional]
**eEzsigntemplatedocumentForm** | [**EEzsigntemplatedocumentFormEnum**](#EEzsigntemplatedocumentFormEnum) | If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsigntemplateformfieldgroups and assign them to the specified **fkiEzsigntemplatesignerID** |  [optional]
**sEzsigntemplatedocumentPassword** | **String** | If the source template is password protected, the password to open/modify it. |  [optional]


## Enum: EEzsigntemplatedocumentSourceEnum

Name | Value
---- | -----


## Enum: EEzsigntemplatedocumentFormatEnum

Name | Value
---- | -----


## Enum: EEzsigntemplatedocumentFormEnum

Name | Value
---- | -----




