# ObjectFranchisebrokerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**franchisebrokerGetAutocompleteV1**](ObjectFranchisebrokerApi.md#franchisebrokerGetAutocompleteV1) | **GET** /1/object/franchisebroker/getAutocomplete/{sSelector} | Retrieve Franchisebrokers and IDs



## franchisebrokerGetAutocompleteV1

> CommonGetAutocompleteV1Response franchisebrokerGetAutocompleteV1(sSelector, sQuery)

Retrieve Franchisebrokers and IDs

Get the list of Franchisebrokers to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectFranchisebrokerApi;

ObjectFranchisebrokerApi apiInstance = new ObjectFranchisebrokerApi();
String sSelector = null; // String | The type of Franchisebrokers to return
String sQuery = null; // String | Allow to filter the returned results
try {
    CommonGetAutocompleteV1Response result = apiInstance.franchisebrokerGetAutocompleteV1(sSelector, sQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectFranchisebrokerApi#franchisebrokerGetAutocompleteV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Franchisebrokers to return | [default to null] [enum: Active, All]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]

### Return type

[**CommonGetAutocompleteV1Response**](CommonGetAutocompleteV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

