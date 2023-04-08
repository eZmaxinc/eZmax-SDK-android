

# EzsignannotationResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsignannotationID** | **Integer** | The unique ID of the Ezsignannotation | 
**fkiEzsigndocumentID** | **Integer** | The unique ID of the Ezsigndocument | 
**eEzsignannotationHorizontalalignment** | [**EnumHorizontalalignment**](EnumHorizontalalignment.md) |  |  [optional]
**eEzsignannotationVerticalalignment** | [**EnumVerticalalignment**](EnumVerticalalignment.md) |  |  [optional]
**eEzsignannotationType** | [**FieldEEzsignannotationType**](FieldEEzsignannotationType.md) |  | 
**iEzsignannotationX** | **Integer** | The X coordinate (Horizontal) where to put the Ezsignannotation on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignannotation 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. | 
**iEzsignannotationY** | **Integer** | The Y coordinate (Vertical) where to put the Ezsignannotation on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignannotation 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. | 
**iEzsignannotationWidth** | **Integer** | The Width of the Ezsignannotation.  Width is calculated at 100dpi (dot per inch). So for example, if you want to have the width of the Ezsignannotation to be 3 inches, you would use \&quot;300\&quot; for the Width. |  [optional]
**iEzsignannotationHeight** | **Integer** | The Height of the Ezsignannotation.  Height is calculated at 100dpi (dot per inch). So for example, if you want to have the height of the Ezsignannotation to be 2 inches, you would use \&quot;200\&quot; for the Height.  This can only be set if eEzsignannotationType is **StrikethroughBlock** or **Text** |  [optional]
**sEzsignannotationText** | **String** | The Text of the Ezsignannotation |  [optional]
**iEzsignpagePagenumber** | **Integer** | The page number in the Ezsigndocument | 




