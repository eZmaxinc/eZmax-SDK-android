# ObjectTimezoneApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**timezoneGetAutocompleteV1**](ObjectTimezoneApi.md#timezoneGetAutocompleteV1) | **GET** /1/object/timezone/getAutocomplete/{sSelector} | Retrieve Timezones and IDs



## timezoneGetAutocompleteV1

> CommonGetAutocompleteV1Response timezoneGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Timezones and IDs

Get the list of Timezone to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectTimezoneApi;

ObjectTimezoneApi apiInstance = new ObjectTimezoneApi();
String sSelector = null; // String | The type of Timezones to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    CommonGetAutocompleteV1Response result = apiInstance.timezoneGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectTimezoneApi#timezoneGetAutocompleteV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Timezones to return | [default to null] [enum: All, Active]
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

