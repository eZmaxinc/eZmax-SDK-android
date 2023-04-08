

# EzsigntemplateGetObjectV1ResponseMPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigntemplateID** | **Integer** | The unique ID of the Ezsigntemplate | 
**fkiEzsigntemplatedocumentID** | **Integer** | The unique ID of the Ezsigntemplatedocument |  [optional]
**fkiEzsignfoldertypeID** | **Integer** | The unique ID of the Ezsignfoldertype. | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sLanguageNameX** | **String** | The Name of the Language in the language of the requester | 
**sEzsigntemplateDescription** | **String** | The description of the Ezsigntemplate | 
**bEzsigntemplateAdminonly** | **Boolean** | Whether the Ezsigntemplate can be accessed by admin users only (eUserType&#x3D;Normal) | 
**sEzsignfoldertypeNameX** | **String** | The name of the Ezsignfoldertype in the language of the requester | 
**objAudit** | [**CommonAudit**](CommonAudit.md) |  | 
**objEzsigntemplatedocument** | [**EzsigntemplatedocumentResponse**](EzsigntemplatedocumentResponse.md) |  |  [optional]
**aObjEzsigntemplatesigner** | [**List&lt;EzsigntemplatesignerResponseCompound&gt;**](EzsigntemplatesignerResponseCompound.md) |  | 




