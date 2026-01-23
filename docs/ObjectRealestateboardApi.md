# ObjectRealestateboardApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**realestateboardGetAutocompleteV2**](ObjectRealestateboardApi.md#realestateboardGetAutocompleteV2) | **GET** /2/object/realestateboard/getAutocomplete/{sSelector} | Retrieve Realestateboards and IDs



## realestateboardGetAutocompleteV2

> RealestateboardGetAutocompleteV2Response realestateboardGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiProvinceID)

Retrieve Realestateboards and IDs

Get the list of realestateboard to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectRealestateboardApi;

ObjectRealestateboardApi apiInstance = new ObjectRealestateboardApi();
String sSelector = null; // String | The type of Realestateboards to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String fkiProvinceID = null; // String | The province ID to filter the results expected
try {
    RealestateboardGetAutocompleteV2Response result = apiInstance.realestateboardGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiProvinceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectRealestateboardApi#realestateboardGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Realestateboards to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **fkiProvinceID** | **String**| The province ID to filter the results expected | [optional] [default to null]

### Return type

[**RealestateboardGetAutocompleteV2Response**](RealestateboardGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

