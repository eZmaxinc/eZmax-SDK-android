

# EzsignbulksendGetObjectV1ResponseMPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsignbulksendID** | **Integer** | The unique ID of the Ezsignbulksend | 
**fkiEzsignfoldertypeID** | **Integer** | The unique ID of the Ezsignfoldertype. | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sLanguageNameX** | **String** | The Name of the Language in the language of the requester | 
**sEzsignfoldertypeNameX** | **String** | The name of the Ezsignfoldertype in the language of the requester | 
**sEzsignbulksendDescription** | **String** | The description of the Ezsignbulksend | 
**tEzsignbulksendNote** | **String** | Note about the Ezsignbulksend | 
**bEzsignbulksendNeedvalidation** | **Boolean** | Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation | 
**bEzsignbulksendIsactive** | **Boolean** | Whether the Ezsignbulksend is active or not | 
**objAudit** | [**CommonAudit**](CommonAudit.md) |  | 
**aObjEzsignbulksenddocumentmapping** | [**List&lt;EzsignbulksenddocumentmappingResponseCompound&gt;**](EzsignbulksenddocumentmappingResponseCompound.md) |  | 
**aObjEzsignbulksendsignermapping** | [**List&lt;EzsignbulksendsignermappingResponse&gt;**](EzsignbulksendsignermappingResponse.md) |  | 




