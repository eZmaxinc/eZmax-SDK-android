

# ColleagueResponseV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiColleagueID** | **Integer** | The unique ID of the Colleague | 
**fkiUserID** | **Integer** | The unique ID of the User | 
**fkiUserIDColleague** | **Integer** | The unique ID of the User | 
**bColleagueEzsignemail** | **Boolean** | Whether the email can be used by the cloning user in Ezsign | 
**bColleagueFinancial** | **Boolean** | Whether the cloning user has access to the financial | 
**bColleagueUsecloneemail** | **Boolean** | Whether the cloning user has access to the cloned user email to send communications | 
**bColleagueAttachment** | **Boolean** | Whether the cloning user has access to the attachment | 
**bColleagueCanafe** | **Boolean** | Whether the cloning user has access to canafe | 
**bColleaguePermission** | **Boolean** | Whether the cloning user copies the permission of the cloned user | 
**bColleagueRealestatecompleted** | **Boolean** | Whether if the cloning user has access to the completed folders in real estate | 
**dtColleagueFrom** | **String** | The from of the Colleague |  [optional]
**dtColleagueTo** | **String** | The to of the Colleague |  [optional]
**eColleagueEzsign** | [**FieldEColleagueEzsign**](FieldEColleagueEzsign.md) |  | 
**eColleagueRealestateinprogress** | [**FieldEColleagueRealestateinprogess**](FieldEColleagueRealestateinprogess.md) |  | 
**objUserName** | [**CustomUserNameResponse**](CustomUserNameResponse.md) |  | 
**objAudit** | [**CommonAudit**](CommonAudit.md) |  | 




