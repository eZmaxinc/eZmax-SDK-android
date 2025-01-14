

# EzsignsignatureSignV1Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fkiEzsignsigningreasonID** | **Integer** | The unique ID of the Ezsignsigningreason |  [optional]
**fkiFontID** | **Integer** | The unique ID of the Font |  [optional]
**sValue** | **String** | The value required for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **City**, **FieldText** or **FieldTextarea** |  [optional]
**eAttachmentsConfirmationDecision** | [**EAttachmentsConfirmationDecisionEnum**](#EAttachmentsConfirmationDecisionEnum) | Whether the attachment are accepted or refused.  This can only be set if eEzsignsignatureType is **AttachmentsConfirmation** |  [optional]
**sAttachmentsRefusalReason** | **String** | The reason of refused.  This can only be set if eEzsignsignatureType is **AttachmentsConfirmation** |  [optional]
**sSvg** | **String** | The SVG of the signature.  This can only be set if eEzsignsignatureType is **Signature**_/_**Initials** and **bIsAutomatic** is false |  [optional]
**aObjFile** | [**List&lt;CommonFile&gt;**](CommonFile.md) |  |  [optional]
**bIsAutomatic** | **Boolean** | Indicates if the Ezsignsignature was part of an automatic process or not.  This can only be true if eEzsignsignatureType is **Acknowledgement**, **City**, **Signature**, **Initials** or **Stamp**.  | 


## Enum: EAttachmentsConfirmationDecisionEnum

Name | Value
---- | -----




