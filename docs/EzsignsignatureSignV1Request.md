

# EzsignsignatureSignV1Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sValue** | **String** | The value required for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **City**, **FieldText** or **FieldTextarea** |  [optional]
**eAttachmentsConfirmationDecision** | [**EAttachmentsConfirmationDecisionEnum**](#EAttachmentsConfirmationDecisionEnum) | Whether the attachment are accepted or refused.  This can only be set if eEzsignsignatureType is **AttachmentsConfirmation** |  [optional]
**sAttachmentsRefusalReason** | **String** | The reason of refused.  This can only be set if eEzsignsignatureType is **AttachmentsConfirmation** |  [optional]
**sSvg** | **String** | The SVG of the handwritten signature.  This can only be set if eEzsignsignatureType is **Handwritten** and **bIsAutomatic** is false |  [optional]
**aObjFile** | [**List&lt;CommonFile&gt;**](CommonFile.md) |  |  [optional]
**bIsAutomatic** | **Boolean** | Indicates if the Ezsignsignature was part of an automatic process or not.  This can only be true if eEzsignsignatureType is **Acknowledgement**, **City**, **Handwritten**, **Initials**, **Name** or **Stamp**.  | 


## Enum: EAttachmentsConfirmationDecisionEnum

Name | Value
---- | -----




