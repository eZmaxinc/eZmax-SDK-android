# ObjectFranchiseofficeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**franchiseofficeGetAutocompleteV1**](ObjectFranchiseofficeApi.md#franchiseofficeGetAutocompleteV1) | **GET** /1/object/franchiseoffice/getAutocomplete/{sSelector} | Retrieve Franchiseoffices and IDs



## franchiseofficeGetAutocompleteV1

> CommonGetAutocompleteV1Response franchiseofficeGetAutocompleteV1(sSelector, sQuery)

Retrieve Franchiseoffices and IDs

Get the list of Franchiseoffices to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectFranchiseofficeApi;

ObjectFranchiseofficeApi apiInstance = new ObjectFranchiseofficeApi();
String sSelector = null; // String | The type of Franchiseoffices to return
String sQuery = null; // String | Allow to filter on the option value
try {
    CommonGetAutocompleteV1Response result = apiInstance.franchiseofficeGetAutocompleteV1(sSelector, sQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectFranchiseofficeApi#franchiseofficeGetAutocompleteV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Franchiseoffices to return | [default to null] [enum: Active, All]
 **sQuery** | **String**| Allow to filter on the option value | [optional] [default to null]

### Return type

[**CommonGetAutocompleteV1Response**](CommonGetAutocompleteV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

