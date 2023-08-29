

# EzsigntemplateformfieldgroupResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigntemplateformfieldgroupID** | **Integer** | The unique ID of the Ezsigntemplateformfieldgroup | 
**fkiEzsigntemplatedocumentID** | **Integer** | The unique ID of the Ezsigntemplatedocument | 
**eEzsigntemplateformfieldgroupType** | [**FieldEEzsigntemplateformfieldgroupType**](FieldEEzsigntemplateformfieldgroupType.md) |  | 
**eEzsigntemplateformfieldgroupSignerrequirement** | [**FieldEEzsigntemplateformfieldgroupSignerrequirement**](FieldEEzsigntemplateformfieldgroupSignerrequirement.md) |  | 
**sEzsigntemplateformfieldgroupLabel** | **String** | The Label for the Ezsigntemplateformfieldgroup | 
**iEzsigntemplateformfieldgroupStep** | **Integer** | The step when the Ezsigntemplatesigner will be invited to fill the form fields | 
**sEzsigntemplateformfieldgroupDefaultvalue** | **String** | The default value for the Ezsigntemplateformfieldgroup |  [optional]
**iEzsigntemplateformfieldgroupFilledmin** | **Integer** | The minimum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup | 
**iEzsigntemplateformfieldgroupFilledmax** | **Integer** | The maximum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup | 
**bEzsigntemplateformfieldgroupReadonly** | **Boolean** | Whether the Ezsigntemplateformfieldgroup is read only or not. | 
**iEzsigntemplateformfieldgroupMaxlength** | **Integer** | The maximum length for the value in the Ezsigntemplateformfieldgroup  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional]
**bEzsigntemplateformfieldgroupEncrypted** | **Boolean** | Whether the Ezsigntemplateformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional]
**sEzsigntemplateformfieldgroupRegexp** | **String** | A regular expression to indicate what values are acceptable for the Ezsigntemplateformfieldgroup.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional]
**eEzsigntemplateformfieldgroupTextvalidation** | [**EnumTextvalidation**](EnumTextvalidation.md) |  |  [optional]
**tEzsigntemplateformfieldgroupTooltip** | **String** | A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplateformfieldgroup |  [optional]
**eEzsigntemplateformfieldgroupTooltipposition** | [**FieldEEzsigntemplateformfieldgroupTooltipposition**](FieldEEzsigntemplateformfieldgroupTooltipposition.md) |  |  [optional]




