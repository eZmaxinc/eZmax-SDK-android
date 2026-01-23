# ObjectInfrastructureregionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**infrastructureregionGetAutocompleteV2**](ObjectInfrastructureregionApi.md#infrastructureregionGetAutocompleteV2) | **GET** /2/object/infrastructureregion/getAutocomplete/{sSelector} | Retrieve Infrastructureregions and IDs



## infrastructureregionGetAutocompleteV2

> InfrastructureregionGetAutocompleteV2Response infrastructureregionGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Infrastructureregions and IDs

Get the list of Infrastructureregion to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInfrastructureregionApi;

ObjectInfrastructureregionApi apiInstance = new ObjectInfrastructureregionApi();
String sSelector = null; // String | The type of Infrastructureregions  to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    InfrastructureregionGetAutocompleteV2Response result = apiInstance.infrastructureregionGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInfrastructureregionApi#infrastructureregionGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Infrastructureregions  to return | [default to null] [enum: AWS, Programmer]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**InfrastructureregionGetAutocompleteV2Response**](InfrastructureregionGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

