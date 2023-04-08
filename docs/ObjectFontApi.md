# ObjectFontApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fontGetAutocompleteV2**](ObjectFontApi.md#fontGetAutocompleteV2) | **GET** /2/object/font/getAutocomplete/{sSelector} | Retrieve Fonts and IDs



## fontGetAutocompleteV2

> FontGetAutocompleteV2Response fontGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Fonts and IDs

Get the list of Font to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectFontApi;

ObjectFontApi apiInstance = new ObjectFontApi();
String sSelector = null; // String | The type of Fonts to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    FontGetAutocompleteV2Response result = apiInstance.fontGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectFontApi#fontGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Fonts to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**FontGetAutocompleteV2Response**](FontGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

