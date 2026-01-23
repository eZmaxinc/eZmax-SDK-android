# ObjectRealestateassociationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**realestateassociationGetAutocompleteV2**](ObjectRealestateassociationApi.md#realestateassociationGetAutocompleteV2) | **GET** /2/object/realestateassociation/getAutocomplete/{sSelector} | Retrieve Realestateassociations and IDs



## realestateassociationGetAutocompleteV2

> RealestateassociationGetAutocompleteV2Response realestateassociationGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Realestateassociations and IDs

Get the list of realestateassociation to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectRealestateassociationApi;

ObjectRealestateassociationApi apiInstance = new ObjectRealestateassociationApi();
String sSelector = null; // String | The type of Realestateassociations to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    RealestateassociationGetAutocompleteV2Response result = apiInstance.realestateassociationGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectRealestateassociationApi#realestateassociationGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Realestateassociations to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**RealestateassociationGetAutocompleteV2Response**](RealestateassociationGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

