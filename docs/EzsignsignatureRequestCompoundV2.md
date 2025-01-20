

# EzsignsignatureRequestCompoundV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsignsignatureID** | **Integer** | The unique ID of the Ezsignsignature |  [optional]
**fkiEzsignfoldersignerassociationID** | **Integer** | The unique ID of the Ezsignfoldersignerassociation | 
**iEzsignpagePagenumber** | **Integer** | The page number in the Ezsigndocument | 
**iEzsignsignatureX** | **Integer** | The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. | 
**iEzsignsignatureY** | **Integer** | The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. | 
**iEzsignsignatureWidth** | **Integer** | The width of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have a width of 2 inches, you would use \&quot;200\&quot; for the iEzsignsignatureWidth. |  [optional]
**iEzsignsignatureHeight** | **Integer** | The height of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have an height of 2 inches, you would use \&quot;200\&quot; for the iEzsignsignatureHeight. |  [optional]
**iEzsignsignatureStep** | **Integer** | The step when the Ezsignsigner will be invited to sign | 
**eEzsignsignatureType** | [**FieldEEzsignsignatureType**](FieldEEzsignsignatureType.md) |  | 
**fkiEzsigndocumentID** | **Integer** | The unique ID of the Ezsigndocument | 
**tEzsignsignatureTooltip** | **String** | A tooltip that will be presented to Ezsignsigner about the Ezsignsignature |  [optional]
**eEzsignsignatureTooltipposition** | [**FieldEEzsignsignatureTooltipposition**](FieldEEzsignsignatureTooltipposition.md) |  |  [optional]
**eEzsignsignatureFont** | [**FieldEEzsignsignatureFont**](FieldEEzsignsignatureFont.md) |  |  [optional]
**fkiEzsignfoldersignerassociationIDValidation** | **Integer** | The unique ID of the Ezsignfoldersignerassociation |  [optional]
**bEzsignsignatureHandwritten** | **Boolean** | Whether the Ezsignsignature must be handwritten or not when eEzsignsignatureType &#x3D; Signature. |  [optional]
**bEzsignsignatureReason** | **Boolean** | Whether the Ezsignsignature must include a reason or not when eEzsignsignatureType &#x3D; Signature. |  [optional]
**bEzsignsignatureRequired** | **Boolean** | Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType &#x3D; Attachments, Text or Textarea. |  [optional]
**eEzsignsignatureAttachmentnamesource** | [**FieldEEzsignsignatureAttachmentnamesource**](FieldEEzsignsignatureAttachmentnamesource.md) |  |  [optional]
**sEzsignsignatureAttachmentdescription** | **String** | The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments |  [optional]
**eEzsignsignatureConsultationtrigger** | [**FieldEEzsignsignatureConsultationtrigger**](FieldEEzsignsignatureConsultationtrigger.md) |  |  [optional]
**iEzsignsignatureValidationstep** | **Integer** | The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments |  [optional]
**iEzsignsignatureMaxlength** | **Integer** | The maximum length for the value in the Ezsignsignature  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** |  [optional]
**sEzsignsignatureDefaultvalue** | **String** | The default value for the Ezsignsignature  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 | |  [optional]
**eEzsignsignatureTextvalidation** | [**EnumTextvalidation**](EnumTextvalidation.md) |  |  [optional]
**sEzsignsignatureTextvalidationcustommessage** | **String** | Description of validation rule. Show by signatory. |  [optional]
**sEzsignsignatureRegexp** | **String** | A regular expression to indicate what values are acceptable for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** and eEzsignsignatureTextvalidation is **Custom** |  [optional]
**eEzsignsignatureDependencyrequirement** | [**FieldEEzsignsignatureDependencyrequirement**](FieldEEzsignsignatureDependencyrequirement.md) |  |  [optional]
**bEzsignsignatureCustomdate** | **Boolean** | Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**) |  [optional]
**aObjEzsignsignaturecustomdate** | [**List&lt;EzsignsignaturecustomdateRequestCompoundV2&gt;**](EzsignsignaturecustomdateRequestV2.md) | An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don&#39;t want to have a date at all. |  [optional]
**aObjEzsignelementdependency** | [**List&lt;EzsignelementdependencyRequestCompound&gt;**](EzsignelementdependencyRequest.md) |  |  [optional]




