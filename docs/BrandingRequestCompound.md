

# BrandingRequestCompound

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiBrandingID** | **Integer** | The unique ID of the Branding |  [optional]
**objBrandingDescription** | [**MultilingualBrandingDescription**](MultilingualBrandingDescription.md) |  | 
**eBrandingLogo** | [**FieldEBrandingLogo**](FieldEBrandingLogo.md) |  | 
**sBrandingBase64** | **byte[]** | The Base64 encoded binary content of the branding logo. This need to match image type selected in eBrandingLogo if you supply an image. If you select &#39;Default&#39;, the logo will be deleted and the default one will be used. |  [optional]
**eBrandingLogointerface** | [**FieldEBrandingLogointerface**](FieldEBrandingLogointerface.md) |  |  [optional]
**sBrandingLogointerfaceBase64** | **byte[]** | The Base64 encoded binary content of the branding logo. This need to match image type selected in eBrandingLogointerface if you supply an image. If you select &#39;Default&#39;, the logo will be deleted and the default one will be used. |  [optional]
**iBrandingColortext** | **Integer** | The color of the text. This is a RGB color converted into integer | 
**iBrandingColortextlinkbox** | **Integer** | The color of the text in the link box. This is a RGB color converted into integer | 
**iBrandingColortextbutton** | **Integer** | The color of the text in the button. This is a RGB color converted into integer | 
**iBrandingColorbackground** | **Integer** | The color of the background. This is a RGB color converted into integer | 
**iBrandingColorbackgroundbutton** | **Integer** | The color of the background of the button. This is a RGB color converted into integer | 
**iBrandingColorbackgroundsmallbox** | **Integer** | The color of the background of the small box. This is a RGB color converted into integer | 
**iBrandingInterfacecolor** | **Integer** | The color of the interface. This is a RGB color converted into integer |  [optional]
**sBrandingName** | **String** | The name of the Branding  This value will only be set if you wish to overwrite the default name. If you want to keep the default name, leave this property empty |  [optional]
**sEmailAddress** | **String** | The email address. |  [optional]
**bBrandingIsactive** | **Boolean** | Whether the Branding is active or not | 




