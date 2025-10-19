# ObjectPaymentmethodApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentmethodGetAutocompleteV2**](ObjectPaymentmethodApi.md#paymentmethodGetAutocompleteV2) | **GET** /2/object/paymentmethod/getAutocomplete/{sSelector} | Retrieve Paymentmethods and IDs



## paymentmethodGetAutocompleteV2

> PaymentmethodGetAutocompleteV2Response paymentmethodGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Paymentmethods and IDs

Get the list of Paymentmethod to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymentmethodApi;

ObjectPaymentmethodApi apiInstance = new ObjectPaymentmethodApi();
String sSelector = null; // String | The type of Paymentmethods to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    PaymentmethodGetAutocompleteV2Response result = apiInstance.paymentmethodGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymentmethodApi#paymentmethodGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Paymentmethods to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**PaymentmethodGetAutocompleteV2Response**](PaymentmethodGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

