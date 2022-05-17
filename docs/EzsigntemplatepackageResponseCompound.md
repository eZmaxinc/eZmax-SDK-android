

# EzsigntemplatepackageResponseCompound

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigntemplatepackageID** | **Integer** | The unique ID of the Ezsigntemplatepackage | 
**fkiEzsignfoldertypeID** | **Integer** | The unique ID of the Ezsignfoldertype. | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sLanguageNameX** | **String** | The Name of the Language in the language of the requester | 
**sEzsigntemplatepackageDescription** | **String** | The description of the Ezsigntemplatepackage | 
**bEzsigntemplatepackageAdminonly** | **Boolean** | Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType&#x3D;Normal) | 
**bEzsigntemplatepackageNeedvalidation** | **Boolean** | Whether the Ezsignbulksend was automatically modified and needs a manual validation | 
**bEzsigntemplatepackageIsactive** | **Boolean** | Whether the Ezsigntemplatepackage is active or not | 
**sEzsignfoldertypeNameX** | **String** | The name of the Ezsignfoldertype in the language of the requester | 
**aObjEzsigntemplatepackagesigner** | [**List&lt;EzsigntemplatepackagesignerResponseCompound&gt;**](EzsigntemplatepackagesignerResponseCompound.md) |  | 
**aObjEzsigntemplatepackagemembership** | [**List&lt;EzsigntemplatepackagemembershipResponseCompound&gt;**](EzsigntemplatepackagemembershipResponseCompound.md) |  | 




