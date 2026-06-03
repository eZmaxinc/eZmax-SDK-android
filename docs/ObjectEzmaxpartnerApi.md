# ObjectEzmaxpartnerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezmaxpartnerGetCustomDeveloppersV1**](ObjectEzmaxpartnerApi.md#ezmaxpartnerGetCustomDeveloppersV1) | **GET** /1/object/ezmaxpartner/getCustomDeveloppers | Retrieve Ezmaxpartner custom developpers list
[**ezmaxpartnerGetObjectV2**](ObjectEzmaxpartnerApi.md#ezmaxpartnerGetObjectV2) | **GET** /2/object/ezmaxpartner/{pkiEzmaxpartnerID} | Retrieve an existing Ezmaxpartner



## ezmaxpartnerGetCustomDeveloppersV1

> EzmaxpartnerGetCustomDeveloppersV1Response ezmaxpartnerGetCustomDeveloppersV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezmaxpartner custom developpers list

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzmaxpartnerApi;

ObjectEzmaxpartnerApi apiInstance = new ObjectEzmaxpartnerApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    EzmaxpartnerGetCustomDeveloppersV1Response result = apiInstance.ezmaxpartnerGetCustomDeveloppersV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzmaxpartnerApi#ezmaxpartnerGetCustomDeveloppersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiEzmaxpartnerID_ASC, pkiEzmaxpartnerID_DESC, sEzmaxpartnerAddressX_ASC, sEzmaxpartnerAddressX_DESC, sEzmaxpartnerEmailaddressX_ASC, sEzmaxpartnerEmailaddressX_DESC, sEzmaxpartnerShortdescriptionX_ASC, sEzmaxpartnerShortdescriptionX_DESC, sEzmaxpartnerNameX_ASC, sEzmaxpartnerNameX_DESC, sEzmaxpartnerPhoneE164X_ASC, sEzmaxpartnerPhoneE164X_DESC, sEzmaxpartnerUrlX_ASC, sEzmaxpartnerUrlX_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EzmaxpartnerGetCustomDeveloppersV1Response**](EzmaxpartnerGetCustomDeveloppersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## ezmaxpartnerGetObjectV2

> EzmaxpartnerGetObjectV2Response ezmaxpartnerGetObjectV2(pkiEzmaxpartnerID)

Retrieve an existing Ezmaxpartner



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzmaxpartnerApi;

ObjectEzmaxpartnerApi apiInstance = new ObjectEzmaxpartnerApi();
Integer pkiEzmaxpartnerID = null; // Integer | The unique ID of the Ezmaxpartner
try {
    EzmaxpartnerGetObjectV2Response result = apiInstance.ezmaxpartnerGetObjectV2(pkiEzmaxpartnerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzmaxpartnerApi#ezmaxpartnerGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzmaxpartnerID** | **Integer**| The unique ID of the Ezmaxpartner | [default to null]

### Return type

[**EzmaxpartnerGetObjectV2Response**](EzmaxpartnerGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

