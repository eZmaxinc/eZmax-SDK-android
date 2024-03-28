# ObjectCountryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countryGetAutocompleteV2**](ObjectCountryApi.md#countryGetAutocompleteV2) | **GET** /2/object/country/getAutocomplete/{sSelector} | Retrieve Countries and IDs



## countryGetAutocompleteV2

> CountryGetAutocompleteV2Response countryGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Countries and IDs

Get the list of Country to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCountryApi;

ObjectCountryApi apiInstance = new ObjectCountryApi();
String sSelector = null; // String | The type of Countries to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    CountryGetAutocompleteV2Response result = apiInstance.countryGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCountryApi#countryGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Countries to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**CountryGetAutocompleteV2Response**](CountryGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

