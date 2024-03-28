# ObjectModuleApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moduleGetAutocompleteV2**](ObjectModuleApi.md#moduleGetAutocompleteV2) | **GET** /2/object/module/getAutocomplete/{sSelector} | Retrieve Modules and IDs



## moduleGetAutocompleteV2

> ModuleGetAutocompleteV2Response moduleGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Modules and IDs

Get the list of Module to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectModuleApi;

ObjectModuleApi apiInstance = new ObjectModuleApi();
String sSelector = null; // String | The type of Modules to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    ModuleGetAutocompleteV2Response result = apiInstance.moduleGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectModuleApi#moduleGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Modules to return | [default to null] [enum: Forms]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**ModuleGetAutocompleteV2Response**](ModuleGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

