

# EzsignsignatureResponseCompound

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsignsignatureID** | **Integer** | The unique ID of the Ezsignsignature | 
**fkiEzsigndocumentID** | **Integer** | The unique ID of the Ezsigndocument | 
**fkiEzsignfoldersignerassociationID** | **Integer** | The unique ID of the Ezsignfoldersignerassociation | 
**fkiEzsignsigningreasonID** | **Integer** | The unique ID of the Ezsignsigningreason |  [optional]
**sEzsignsigningreasonDescriptionX** | **String** | The description of the Ezsignsigningreason in the language of the requester |  [optional]
**iEzsignpagePagenumber** | **Integer** | The page number in the Ezsigndocument | 
**iEzsignsignatureX** | **Integer** | The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. | 
**iEzsignsignatureY** | **Integer** | The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. | 
**iEzsignsignatureHeight** | **Integer** | The height of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have an height of 2 inches, you would use \&quot;200\&quot; for the iEzsignsignatureHeight. |  [optional]
**iEzsignsignatureWidth** | **Integer** | The width of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have a width of 2 inches, you would use \&quot;200\&quot; for the iEzsignsignatureWidth. |  [optional]
**iEzsignsignatureStep** | **Integer** | The step when the Ezsignsigner will be invited to sign | 
**iEzsignsignatureStepadjusted** | **Integer** | The step when the Ezsignsigner will be invited to sign |  [optional]
**eEzsignsignatureType** | [**FieldEEzsignsignatureType**](FieldEEzsignsignatureType.md) |  | 
**tEzsignsignatureTooltip** | **String** | A tooltip that will be presented to Ezsignsigner about the Ezsignsignature |  [optional]
**eEzsignsignatureTooltipposition** | [**FieldEEzsignsignatureTooltipposition**](FieldEEzsignsignatureTooltipposition.md) |  |  [optional]
**eEzsignsignatureFont** | [**FieldEEzsignsignatureFont**](FieldEEzsignsignatureFont.md) |  |  [optional]
**iEzsignsignatureValidationstep** | **Integer** | The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments |  [optional]
**sEzsignsignatureAttachmentdescription** | **String** | The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments |  [optional]
**eEzsignsignatureAttachmentnamesource** | [**FieldEEzsignsignatureAttachmentnamesource**](FieldEEzsignsignatureAttachmentnamesource.md) |  |  [optional]
**bEzsignsignatureRequired** | **Boolean** | Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType &#x3D; Attachments. |  [optional]
**fkiEzsignfoldersignerassociationIDValidation** | **Integer** | The unique ID of the Ezsignfoldersignerassociation |  [optional]
**dtEzsignsignatureDate** | **String** | The date the Ezsignsignature was signed |  [optional]
**iEzsignsignatureattachmentCount** | **Integer** | The count of Ezsignsignatureattachment |  [optional]
**sEzsignsignatureDescription** | **String** | The value entered while signing Ezsignsignature of eEzsignsignatureType **City**, **FieldText** and **FieldTextarea** |  [optional]
**iEzsignsignatureMaxlength** | **Integer** | The maximum length for the value in the Ezsignsignature  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** |  [optional]
**eEzsignsignatureTextvalidation** | [**EnumTextvalidation**](EnumTextvalidation.md) |  |  [optional]
**eEzsignsignatureDependencyrequirement** | [**FieldEEzsignsignatureDependencyrequirement**](FieldEEzsignsignatureDependencyrequirement.md) |  |  [optional]
**sEzsignsignatureRegexp** | **String** | A regular expression to indicate what values are acceptable for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** and eEzsignsignatureTextvalidation is **Custom** |  [optional]
**objContactName** | [**CustomContactNameResponse**](CustomContactNameResponse.md) |  | 
**objContactNameDelegation** | [**CustomContactNameResponse**](CustomContactNameResponse.md) |  |  [optional]
**objSignature** | [**SignatureResponseCompound**](SignatureResponseCompound.md) |  |  [optional]
**bEzsignsignatureCustomdate** | **Boolean** | Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**) |  [optional]
**aObjEzsignsignaturecustomdate** | [**List&lt;EzsignsignaturecustomdateResponseCompound&gt;**](EzsignsignaturecustomdateResponseCompound.md) | An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don&#39;t want to have a date at all. |  [optional]
**objCreditcardtransaction** | [**CustomCreditcardtransactionResponse**](CustomCreditcardtransactionResponse.md) |  |  [optional]
**aObjEzsignelementdependency** | [**List&lt;EzsignelementdependencyResponseCompound&gt;**](EzsignelementdependencyResponseCompound.md) |  |  [optional]




