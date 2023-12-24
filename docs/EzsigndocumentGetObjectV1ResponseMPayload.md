

# EzsigndocumentGetObjectV1ResponseMPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigndocumentID** | **Integer** | The unique ID of the Ezsigndocument | 
**fkiEzsignfolderID** | **Integer** | The unique ID of the Ezsignfolder | 
**fkiEzsignfoldersignerassociationIDDeclinedtosign** | **Integer** | The unique ID of the Ezsignfoldersignerassociation |  [optional]
**dtEzsigndocumentDuedate** | **String** | The maximum date and time at which the Ezsigndocument can be signed. | 
**dtEzsignformCompleted** | **String** | The date and time at which the Ezsignform has been completed. |  [optional]
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| |  [optional]
**sEzsigndocumentName** | **String** | The name of the document that will be presented to Ezsignfoldersignerassociations | 
**eEzsigndocumentStep** | [**FieldEEzsigndocumentStep**](FieldEEzsigndocumentStep.md) |  | 
**dtEzsigndocumentFirstsend** | **String** | The date and time when the Ezsigndocument was first sent. |  [optional]
**dtEzsigndocumentLastsend** | **String** | The date and time when the Ezsigndocument was sent the last time. |  [optional]
**iEzsigndocumentOrder** | **Integer** | The order in which the Ezsigndocument will be presented to the signatory in the Ezsignfolder. | 
**iEzsigndocumentPagetotal** | **Integer** | The number of pages in the Ezsigndocument. | 
**iEzsigndocumentSignaturesigned** | **Integer** | The number of signatures that were signed in the document. | 
**iEzsigndocumentSignaturetotal** | **Integer** | The number of total signatures that were requested in the Ezsigndocument. | 
**sEzsigndocumentMD5initial** | **String** | MD5 Hash of the initial PDF Document before signatures were applied to it. |  [optional]
**tEzsigndocumentDeclinedtosignreason** | **String** | A custom text message that will contain the refusal message if the Ezsigndocument is declined to sign |  [optional]
**sEzsigndocumentMD5signed** | **String** | MD5 Hash of the final PDF Document after all signatures were applied to it. |  [optional]
**bEzsigndocumentEzsignform** | **Boolean** | If the Ezsigndocument contains an Ezsignform or not |  [optional]
**bEzsigndocumentHassignedsignatures** | **Boolean** | If the Ezsigndocument contains signed signatures (From internal or external sources) |  [optional]
**objAudit** | [**CommonAudit**](CommonAudit.md) |  |  [optional]
**sEzsigndocumentExternalid** | **String** | This field can be used to store an External ID from the client&#39;s system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format.  |  [optional]
**iEzsigndocumentEzsignsignatureattachmenttotal** | **Integer** | The number of Ezsigndocumentattachment total | 
**eEzsigndocumentSteptype** | [**ComputedEEzsigndocumentSteptype**](ComputedEEzsigndocumentSteptype.md) |  | 
**iEzsigndocumentStepformtotal** | **Integer** | The total number of steps in the form filling phase | 
**iEzsigndocumentStepformcurrent** | **Integer** | The current step in the form filling phase | 
**iEzsigndocumentStepsignaturetotal** | **Integer** | The total number of steps in the signature filling phase | 
**iEzsigndocumentStepsignatureCurrent** | **Integer** | The current step in the signature phase | 
**aObjEzsignfoldersignerassociationstatus** | [**List&lt;CustomEzsignfoldersignerassociationstatusResponse&gt;**](CustomEzsignfoldersignerassociationstatusResponse.md) |  | 




