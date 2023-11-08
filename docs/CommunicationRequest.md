

# CommunicationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiCommunicationID** | **Integer** | The unique ID of the Communication. |  [optional]
**eCommunicationImportance** | [**FieldECommunicationImportance**](FieldECommunicationImportance.md) |  |  [optional]
**eCommunicationType** | [**FieldECommunicationType**](FieldECommunicationType.md) |  | 
**objCommunicationsender** | [**CustomCommunicationsenderRequest**](CustomCommunicationsenderRequest.md) |  |  [optional]
**sCommunicationSubject** | **String** | The subject of the Communication |  [optional]
**tCommunicationBody** | **String** | The Body of the Communication | 
**bCommunicationPrivate** | **Boolean** | Whether the Communication is private or not | 
**eCommunicationAttachmenttype** | [**ECommunicationAttachmenttypeEnum**](#ECommunicationAttachmenttypeEnum) | How the attachment should be included in the email.   Only used if eCommunicationType is **Email** |  [optional]
**iCommunicationAttachmentlinkexpiration** | **Integer** | The number of days before the attachment link expired.   Only used if eCommunicationType is **Email** and eCommunicationattachmentType is **Link** |  [optional]
**bCommunicationReadreceipt** | **Boolean** | Whether we ask for a read receipt or not. |  [optional]


## Enum: ECommunicationAttachmenttypeEnum

Name | Value
---- | -----




