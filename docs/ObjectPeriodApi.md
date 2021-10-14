# ObjectPeriodApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**periodGetAutocompleteV1**](ObjectPeriodApi.md#periodGetAutocompleteV1) | **GET** /1/object/period/getAutocomplete/{sSelector} | Retrieve Periods and IDs



## periodGetAutocompleteV1

> CommonGetAutocompleteV1Response periodGetAutocompleteV1(sSelector, sQuery)

Retrieve Periods and IDs

Get the list of Periods to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPeriodApi;

ObjectPeriodApi apiInstance = new ObjectPeriodApi();
String sSelector = null; // String | The types of Periods to return
String sQuery = null; // String | Allow to filter the returned results
try {
    CommonGetAutocompleteV1Response result = apiInstance.periodGetAutocompleteV1(sSelector, sQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPeriodApi#periodGetAutocompleteV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The types of Periods to return | [default to null] [enum: ActiveNormal, ActiveNormalAndEndOfYear, AllNormal, AllNormalAndEndOfYear]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]

### Return type

[**CommonGetAutocompleteV1Response**](CommonGetAutocompleteV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

