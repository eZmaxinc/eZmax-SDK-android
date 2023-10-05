# ObjectLanguageApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**languageGetAutocompleteV2**](ObjectLanguageApi.md#languageGetAutocompleteV2) | **GET** /2/object/language/getAutocomplete/{sSelector} | Retrieve Languages and IDs



## languageGetAutocompleteV2

> LanguageGetAutocompleteV2Response languageGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Languages and IDs

Get the list of Language to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectLanguageApi;

ObjectLanguageApi apiInstance = new ObjectLanguageApi();
String sSelector = null; // String | The type of Languages to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    LanguageGetAutocompleteV2Response result = apiInstance.languageGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectLanguageApi#languageGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Languages to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**LanguageGetAutocompleteV2Response**](LanguageGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

