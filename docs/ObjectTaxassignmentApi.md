# ObjectTaxassignmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taxassignmentGetAutocompleteV2**](ObjectTaxassignmentApi.md#taxassignmentGetAutocompleteV2) | **GET** /2/object/taxassignment/getAutocomplete/{sSelector} | Retrieve Taxassignments and IDs



## taxassignmentGetAutocompleteV2

> TaxassignmentGetAutocompleteV2Response taxassignmentGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Taxassignments and IDs

Get the list of Taxassignment to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectTaxassignmentApi;

ObjectTaxassignmentApi apiInstance = new ObjectTaxassignmentApi();
String sSelector = null; // String | The type of Taxassignments to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    TaxassignmentGetAutocompleteV2Response result = apiInstance.taxassignmentGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectTaxassignmentApi#taxassignmentGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Taxassignments to return | [default to null] [enum: All, AllButNonrecoverable]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**TaxassignmentGetAutocompleteV2Response**](TaxassignmentGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

