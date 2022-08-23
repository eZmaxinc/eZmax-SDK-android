# ObjectBrandingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandingCreateObjectV1**](ObjectBrandingApi.md#brandingCreateObjectV1) | **POST** /1/object/branding | Create a new Branding
[**brandingEditObjectV1**](ObjectBrandingApi.md#brandingEditObjectV1) | **PUT** /1/object/branding/{pkiBrandingID} | Edit an existing Branding
[**brandingGetAutocompleteV1**](ObjectBrandingApi.md#brandingGetAutocompleteV1) | **GET** /1/object/branding/getAutocomplete/{sSelector} | Retrieve Brandings and IDs
[**brandingGetListV1**](ObjectBrandingApi.md#brandingGetListV1) | **GET** /1/object/branding/getList | Retrieve Branding list
[**brandingGetObjectV1**](ObjectBrandingApi.md#brandingGetObjectV1) | **GET** /1/object/branding/{pkiBrandingID} | Retrieve an existing Branding



## brandingCreateObjectV1

> BrandingCreateObjectV1Response brandingCreateObjectV1(brandingCreateObjectV1Request)

Create a new Branding

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrandingApi;

ObjectBrandingApi apiInstance = new ObjectBrandingApi();
BrandingCreateObjectV1Request brandingCreateObjectV1Request = new BrandingCreateObjectV1Request(); // BrandingCreateObjectV1Request | 
try {
    BrandingCreateObjectV1Response result = apiInstance.brandingCreateObjectV1(brandingCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrandingApi#brandingCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandingCreateObjectV1Request** | [**BrandingCreateObjectV1Request**](BrandingCreateObjectV1Request.md)|  |

### Return type

[**BrandingCreateObjectV1Response**](BrandingCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## brandingEditObjectV1

> BrandingEditObjectV1Response brandingEditObjectV1(pkiBrandingID, brandingEditObjectV1Request)

Edit an existing Branding



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrandingApi;

ObjectBrandingApi apiInstance = new ObjectBrandingApi();
Integer pkiBrandingID = null; // Integer | 
BrandingEditObjectV1Request brandingEditObjectV1Request = new BrandingEditObjectV1Request(); // BrandingEditObjectV1Request | 
try {
    BrandingEditObjectV1Response result = apiInstance.brandingEditObjectV1(pkiBrandingID, brandingEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrandingApi#brandingEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBrandingID** | **Integer**|  | [default to null]
 **brandingEditObjectV1Request** | [**BrandingEditObjectV1Request**](BrandingEditObjectV1Request.md)|  |

### Return type

[**BrandingEditObjectV1Response**](BrandingEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## brandingGetAutocompleteV1

> CommonGetAutocompleteV1Response brandingGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)

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
    CommonGetAutocompleteV1Response result = apiInstance.brandingGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrandingApi#brandingGetAutocompleteV1");
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

[**CommonGetAutocompleteV1Response**](CommonGetAutocompleteV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## brandingGetListV1

> BrandingGetListV1Response brandingGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Branding list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eBrandingLogo | Default&lt;br&gt;JPEG&lt;br&gt;PNG |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrandingApi;

ObjectBrandingApi apiInstance = new ObjectBrandingApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = null; // Integer | 
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
 **iRowOffset** | **Integer**|  | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**BrandingGetListV1Response**](BrandingGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## brandingGetObjectV1

> BrandingGetObjectV1Response brandingGetObjectV1(pkiBrandingID)

Retrieve an existing Branding



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrandingApi;

ObjectBrandingApi apiInstance = new ObjectBrandingApi();
Integer pkiBrandingID = null; // Integer | 
try {
    BrandingGetObjectV1Response result = apiInstance.brandingGetObjectV1(pkiBrandingID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrandingApi#brandingGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBrandingID** | **Integer**|  | [default to null]

### Return type

[**BrandingGetObjectV1Response**](BrandingGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

