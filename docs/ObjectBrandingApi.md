# ObjectBrandingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandingCreateObjectV2**](ObjectBrandingApi.md#brandingCreateObjectV2) | **POST** /2/object/branding | Create a new Branding
[**brandingEditObjectV2**](ObjectBrandingApi.md#brandingEditObjectV2) | **PUT** /2/object/branding/{pkiBrandingID} | Edit an existing Branding
[**brandingGetAutocompleteV2**](ObjectBrandingApi.md#brandingGetAutocompleteV2) | **GET** /2/object/branding/getAutocomplete/{sSelector} | Retrieve Brandings and IDs
[**brandingGetListV1**](ObjectBrandingApi.md#brandingGetListV1) | **GET** /1/object/branding/getList | Retrieve Branding list
[**brandingGetObjectV3**](ObjectBrandingApi.md#brandingGetObjectV3) | **GET** /3/object/branding/{pkiBrandingID} | Retrieve an existing Branding



## brandingCreateObjectV2

> BrandingCreateObjectV2Response brandingCreateObjectV2(brandingCreateObjectV2Request)

Create a new Branding

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrandingApi;

ObjectBrandingApi apiInstance = new ObjectBrandingApi();
BrandingCreateObjectV2Request brandingCreateObjectV2Request = new BrandingCreateObjectV2Request(); // BrandingCreateObjectV2Request | 
try {
    BrandingCreateObjectV2Response result = apiInstance.brandingCreateObjectV2(brandingCreateObjectV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrandingApi#brandingCreateObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandingCreateObjectV2Request** | [**BrandingCreateObjectV2Request**](BrandingCreateObjectV2Request.md)|  |

### Return type

[**BrandingCreateObjectV2Response**](BrandingCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## brandingEditObjectV2

> CommonResponse brandingEditObjectV2(pkiBrandingID, brandingEditObjectV2Request)

Edit an existing Branding



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrandingApi;

ObjectBrandingApi apiInstance = new ObjectBrandingApi();
Integer pkiBrandingID = null; // Integer | 
BrandingEditObjectV2Request brandingEditObjectV2Request = new BrandingEditObjectV2Request(); // BrandingEditObjectV2Request | 
try {
    CommonResponse result = apiInstance.brandingEditObjectV2(pkiBrandingID, brandingEditObjectV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrandingApi#brandingEditObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBrandingID** | **Integer**|  | [default to null]
 **brandingEditObjectV2Request** | [**BrandingEditObjectV2Request**](BrandingEditObjectV2Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## brandingGetAutocompleteV2

> BrandingGetAutocompleteV2Response brandingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Brandings and IDs

Get the list of Branding to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrandingApi;

ObjectBrandingApi apiInstance = new ObjectBrandingApi();
String sSelector = null; // String | The type of Brandings to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    BrandingGetAutocompleteV2Response result = apiInstance.brandingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrandingApi#brandingGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Brandings to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**BrandingGetAutocompleteV2Response**](BrandingGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## brandingGetListV1

> BrandingGetListV1Response brandingGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Branding list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eBrandingLogo | Default&lt;br&gt;JPEG&lt;br&gt;PNG | | eBrandingLogointerface | Default&lt;br&gt;JPEG&lt;br&gt;PNG |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrandingApi;

ObjectBrandingApi apiInstance = new ObjectBrandingApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    BrandingGetListV1Response result = apiInstance.brandingGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrandingApi#brandingGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiBrandingID_ASC, pkiBrandingID_DESC, sBrandingDescriptionX_ASC, sBrandingDescriptionX_DESC, iBrandingColortext_ASC, iBrandingColortext_DESC, iBrandingColortextlinkbox_ASC, iBrandingColortextlinkbox_DESC, iBrandingColortextbutton_ASC, iBrandingColortextbutton_DESC, iBrandingColorbackground_ASC, iBrandingColorbackground_DESC, iBrandingColorbackgroundbutton_ASC, iBrandingColorbackgroundbutton_DESC, iBrandingColorbackgroundsmallbox_ASC, iBrandingColorbackgroundsmallbox_DESC, bBrandingIsactive_ASC, bBrandingIsactive_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**BrandingGetListV1Response**](BrandingGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## brandingGetObjectV3

> BrandingGetObjectV3Response brandingGetObjectV3(pkiBrandingID)

Retrieve an existing Branding



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrandingApi;

ObjectBrandingApi apiInstance = new ObjectBrandingApi();
Integer pkiBrandingID = null; // Integer | 
try {
    BrandingGetObjectV3Response result = apiInstance.brandingGetObjectV3(pkiBrandingID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrandingApi#brandingGetObjectV3");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBrandingID** | **Integer**|  | [default to null]

### Return type

[**BrandingGetObjectV3Response**](BrandingGetObjectV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

