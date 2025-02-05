# ObjectCurrencyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**currencyGetAutocompleteV2**](ObjectCurrencyApi.md#currencyGetAutocompleteV2) | **GET** /2/object/currency/getAutocomplete/{sSelector} | Retrieve Currencies and IDs



## currencyGetAutocompleteV2

> CurrencyGetAutocompleteV2Response currencyGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Currencies and IDs

Get the list of Currency to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCurrencyApi;

ObjectCurrencyApi apiInstance = new ObjectCurrencyApi();
String sSelector = null; // String | The type of Currencies to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    CurrencyGetAutocompleteV2Response result = apiInstance.currencyGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCurrencyApi#currencyGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Currencies to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**CurrencyGetAutocompleteV2Response**](CurrencyGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

