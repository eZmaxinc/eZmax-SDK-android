

# EzsigndocumentGetObjectV1ResponseMPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fkiEzsignfolderID** | **Integer** | The unique ID of the Ezsignfolder | 
**dtEzsigndocumentDuedate** | **String** | The maximum date and time at which the Ezsigndocument can be signed. | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sEzsigndocumentName** | **String** | The name of the document that will be presented to Ezsignfoldersignerassociations | 
**pkiEzsigndocumentID** | **Integer** | The unique ID of the Ezsigndocument | 
**eEzsigndocumentStep** | [**FieldEEzsigndocumentStep**](FieldEEzsigndocumentStep.md) |  | 
**dtEzsigndocumentFirstsend** | **String** | The date and time when the Ezsigndocument was first sent. | 
**dtEzsigndocumentLastsend** | **String** | The date and time when the Ezsigndocument was sent the last time. | 
**iEzsigndocumentOrder** | **Integer** | The order in which the Ezsigndocument will be presented to the signatory in the Ezsignfolder. | 
**iEzsigndocumentPagetotal** | **Integer** | The number of pages in the Ezsigndocument. | 
**iEzsigndocumentSignaturesigned** | **Integer** | The number of signatures that were signed in the document. | 
**iEzsigndocumentSignaturetotal** | **Integer** | The number of total signatures that were requested in the Ezsigndocument. | 
**sEzsigndocumentMD5initial** | **String** | MD5 Hash of the initial PDF Document before signatures were applied to it. | 
**sEzsigndocumentMD5signed** | **String** | MD5 Hash of the final PDF Document after all signatures were applied to it. | 
**bEzsigndocumentEzsignform** | **Boolean** | If the Ezsigndocument contains an Ezsignform or not | 
**objAudit** | [**CommonAudit**](CommonAudit.md) |  | 
**iEzsigndocumentStepformtotal** | **Integer** | The total number of steps in the form filling phase | 
**iEzsigndocumentStepformcurrent** | **Integer** | The current step in the form filling phase | 
**iEzsigndocumentStepsignaturetotal** | **Integer** | The total number of steps in the signature filling phase | 
**iEzsigndocumentStepsignatureCurrent** | **Integer** | The current step in the signature phase | 
**aObjEzsignfoldersignerassociationstatus** | [**List&lt;CustomEzsignfoldersignerassociationstatusResponse&gt;**](CustomEzsignfoldersignerassociationstatusResponse.md) |  | 




