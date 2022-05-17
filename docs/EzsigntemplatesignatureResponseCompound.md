

# EzsigntemplatesignatureResponseCompound

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigntemplatesignatureID** | **Integer** | The unique ID of the Ezsigntemplatesignature | 
**fkiEzsigntemplatedocumentID** | **Integer** | The unique ID of the Ezsigntemplatedocument | 
**fkiEzsigntemplatesignerID** | **Integer** | The unique ID of the Ezsigntemplatesigner | 
**iEzsigntemplatedocumentpagePagenumber** | **Integer** | The page number in the Ezsigntemplatedocument | 
**iEzsigntemplatesignatureX** | **Integer** | The X coordinate (Horizontal) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. | 
**iEzsigntemplatesignatureY** | **Integer** | The Y coordinate (Vertical) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. | 
**iEzsigntemplatesignatureStep** | **Integer** | The step when the Ezsigntemplatesigner will be invited to sign | 
**eEzsigntemplatesignatureType** | [**FieldEEzsigntemplatesignatureType**](FieldEEzsigntemplatesignatureType.md) |  | 
**tEzsigntemplatesignatureTooltip** | **String** | A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature |  [optional]
**eEzsigntemplatesignatureTooltipposition** | [**FieldEEzsigntemplatesignatureTooltipposition**](FieldEEzsigntemplatesignatureTooltipposition.md) |  |  [optional]
**eEzsigntemplatesignatureFont** | [**FieldEEzsigntemplatesignatureFont**](FieldEEzsigntemplatesignatureFont.md) |  |  [optional]
**bEzsigntemplatesignatureCustomdate** | **Boolean** | Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**) |  [optional]
**aObjEzsigntemplatesignaturecustomdate** | [**List&lt;EzsigntemplatesignaturecustomdateResponseCompound&gt;**](EzsigntemplatesignaturecustomdateResponseCompound.md) | An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don&#39;t want to have a date at all. |  [optional]




