

# CustomAttachmentImportIntoEDMRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eAttachmentSource** | [**EAttachmentSourceEnum**](#EAttachmentSourceEnum) | The source of the Attachment | 
**fkiAttachmentID** | **Integer** | The unique ID of the Attachment. |  [optional]
**fkiInscriptionchecklistID** | **Integer** | The unique ID of the Inscriptionchecklist |  [optional]
**sAttachmentUrl** | **String** | The url of the file to import |  [optional]
**sAttachmentBase64** | **byte[]** | The Base64 encoded binary content of the attachment. |  [optional]
**sAttachmentName** | **String** | The name of the Attachment | 
**sAttachmentCategory** | **String** | The attachment category | 
**eAttachmentPrivacy** | [**FieldEAttachmentPrivacy**](FieldEAttachmentPrivacy.md) |  | 
**fkiUserIDSpecific** | **Integer** | The unique ID of the User |  [optional]
**sAttachmentMD5** | **String** | The MD5 of the Attachment |  [optional]
**bAttachmentForceoverwrite** | **Boolean** | Whether we force an overwrite of an existing file |  [optional]
**bAttachmentForcerestore** | **Boolean** | Whether we force a restore of a deleted file |  [optional]


## Enum: EAttachmentSourceEnum

Name | Value
---- | -----




