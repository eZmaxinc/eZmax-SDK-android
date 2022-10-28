

# VersionhistoryResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiVersionhistoryID** | **Integer** | The unique ID of the Versionhistory | 
**fkiModuleID** | **Integer** | The unique ID of the Module |  [optional]
**fkiModulesectionID** | **Integer** | The unique ID of the Modulesection |  [optional]
**sModuleNameX** | **String** | The Name of the Module in the language of the requester |  [optional]
**sModulesectionNameX** | **String** | The Name of the Modulesection in the language of the requester |  [optional]
**eVersionhistoryUsertype** | [**FieldEVersionhistoryUsertype**](FieldEVersionhistoryUsertype.md) |  |  [optional]
**objVersionhistoryDetail** | [**MultilingualVersionhistoryDetail**](MultilingualVersionhistoryDetail.md) |  | 
**dtVersionhistoryDate** | **String** | The date  at which the Versionhistory was published or should be published | 
**dtVersionhistoryDateend** | **String** | The date  at which the Versionhistory will no longer be visible |  [optional]
**eVersionhistoryType** | [**FieldEVersionhistoryType**](FieldEVersionhistoryType.md) |  | 
**bVersionhistoryDraft** | **Boolean** | Whether the Versionhistory is published or still a draft | 




