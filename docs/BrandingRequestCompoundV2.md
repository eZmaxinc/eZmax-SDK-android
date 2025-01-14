

# BrandingRequestCompoundV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiBrandingID** | **Integer** | The unique ID of the Branding |  [optional]
**objBrandingDescription** | [**MultilingualBrandingDescription**](MultilingualBrandingDescription.md) |  | 
**eBrandingLogo** | [**FieldEBrandingLogo**](FieldEBrandingLogo.md) |  | 
**eBrandingAlignlogo** | [**FieldEBrandingAlignlogo**](FieldEBrandingAlignlogo.md) |  |  [optional]
**sBrandingBase64** | **byte[]** | The Base64 encoded binary content of the branding logo. This need to match image type selected in eBrandingLogo if you supply an image. If you select &#39;Default&#39;, the logo will be deleted and the default one will be used. |  [optional]
**iBrandingColor** | **Integer** | The primary color. This is a RGB color converted into integer | 
**sBrandingName** | **String** | The name of the Branding  This value will only be set if you wish to overwrite the default name. If you want to keep the default name, leave this property empty |  [optional]
**sEmailAddress** | **String** | The email address. |  [optional]
**bBrandingIsactive** | **Boolean** | Whether the Branding is active or not | 




