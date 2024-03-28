# ObjectProvinceApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**provinceGetAutocompleteV2**](ObjectProvinceApi.md#provinceGetAutocompleteV2) | **GET** /2/object/province/getAutocomplete/{sSelector} | Retrieve Provinces and IDs



## provinceGetAutocompleteV2

> ProvinceGetAutocompleteV2Response provinceGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Provinces and IDs

Get the list of Province to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectProvinceApi;

ObjectProvinceApi apiInstance = new ObjectProvinceApi();
String sSelector = null; // String | The type of Provinces to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    ProvinceGetAutocompleteV2Response result = apiInstance.provinceGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectProvinceApi#provinceGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Provinces to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**ProvinceGetAutocompleteV2Response**](ProvinceGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

