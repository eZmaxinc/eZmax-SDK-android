

# EzsigntemplateformfieldRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigntemplateformfieldID** | **Integer** | The unique ID of the Ezsigntemplateformfield |  [optional]
**eEzsigntemplateformfieldPositioning** | [**FieldEEzsigntemplateformfieldPositioning**](FieldEEzsigntemplateformfieldPositioning.md) |  |  [optional]
**iEzsigntemplatedocumentpagePagenumber** | **Integer** | The page number in the Ezsigntemplatedocument | 
**sEzsigntemplateformfieldLabel** | **String** | The Label for the Ezsigntemplateformfield | 
**sEzsigntemplateformfieldValue** | **String** | The value for the Ezsigntemplateformfield |  [optional]
**iEzsigntemplateformfieldX** | **Integer** | The X coordinate (Horizontal) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. |  [optional]
**iEzsigntemplateformfieldY** | **Integer** | The Y coordinate (Vertical) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. |  [optional]
**iEzsigntemplateformfieldWidth** | **Integer** | The Width of the Ezsigntemplateformfield in pixels calculated at 100 DPI | 
**iEzsigntemplateformfieldHeight** | **Integer** | The Height of the Ezsigntemplateformfield in pixels calculated at 100 DPI  | 
**bEzsigntemplateformfieldAutocomplete** | **Boolean** | Whether the Ezsigntemplateformfield allows the use of the autocomplete of the browser.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** |  [optional]
**bEzsigntemplateformfieldSelected** | **Boolean** | Whether the Ezsigntemplateformfield is selected or not by default.  This can only be set if eEzsigntemplateformfieldgroupType is **Checkbox** or **Radio** |  [optional]
**eEzsigntemplateformfieldDependencyrequirement** | [**FieldEEzsigntemplateformfieldDependencyrequirement**](FieldEEzsigntemplateformfieldDependencyrequirement.md) |  |  [optional]
**sEzsigntemplateformfieldPositioningpattern** | **String** | The string pattern to search for the positioning. **This is not a regexp**  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates** |  [optional]
**iEzsigntemplateformfieldPositioningoffsetx** | **Integer** | The offset X  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates** |  [optional]
**iEzsigntemplateformfieldPositioningoffsety** | **Integer** | The offset Y  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates** |  [optional]
**eEzsigntemplateformfieldPositioningoccurence** | [**FieldEEzsigntemplateformfieldPositioningoccurence**](FieldEEzsigntemplateformfieldPositioningoccurence.md) |  |  [optional]
**eEzsigntemplateformfieldHorizontalalignment** | [**EnumHorizontalalignment**](EnumHorizontalalignment.md) |  |  [optional]
**objTextstylestatic** | [**TextstylestaticRequestCompound**](TextstylestaticRequestCompound.md) |  |  [optional]




