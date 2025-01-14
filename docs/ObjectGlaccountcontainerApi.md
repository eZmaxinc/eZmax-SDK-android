# ObjectGlaccountcontainerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**glaccountcontainerGetAutocompleteV2**](ObjectGlaccountcontainerApi.md#glaccountcontainerGetAutocompleteV2) | **GET** /2/object/glaccountcontainer/getAutocomplete/{sSelector} | Retrieve Glaccountcontainers and IDs



## glaccountcontainerGetAutocompleteV2

> GlaccountcontainerGetAutocompleteV2Response glaccountcontainerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Glaccountcontainers and IDs

Get the list of Glaccountcontainer to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectGlaccountcontainerApi;

ObjectGlaccountcontainerApi apiInstance = new ObjectGlaccountcontainerApi();
String sSelector = null; // String | The type of Glaccountcontainers to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    GlaccountcontainerGetAutocompleteV2Response result = apiInstance.glaccountcontainerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectGlaccountcontainerApi#glaccountcontainerGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Glaccountcontainers to return | [default to null] [enum: All, Supply]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**GlaccountcontainerGetAutocompleteV2Response**](GlaccountcontainerGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

