# ObjectSystemconfigurationtypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemconfigurationtypeGetAutocompleteV2**](ObjectSystemconfigurationtypeApi.md#systemconfigurationtypeGetAutocompleteV2) | **GET** /2/object/systemconfigurationtype/getAutocomplete/{sSelector} | Retrieve Systemconfigurationtype and IDs



## systemconfigurationtypeGetAutocompleteV2

> SystemconfigurationtypeGetAutocompleteV2Response systemconfigurationtypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Systemconfigurationtype and IDs

Get the list of Systemconfigurationtype to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSystemconfigurationtypeApi;

ObjectSystemconfigurationtypeApi apiInstance = new ObjectSystemconfigurationtypeApi();
String sSelector = null; // String | The type of Systemconfigurationtype to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    SystemconfigurationtypeGetAutocompleteV2Response result = apiInstance.systemconfigurationtypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSystemconfigurationtypeApi#systemconfigurationtypeGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Systemconfigurationtype to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**SystemconfigurationtypeGetAutocompleteV2Response**](SystemconfigurationtypeGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

