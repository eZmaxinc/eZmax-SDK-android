# ObjectInscriptiontypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inscriptiontypeGetAutocompleteV2**](ObjectInscriptiontypeApi.md#inscriptiontypeGetAutocompleteV2) | **GET** /2/object/inscriptiontype/getAutocomplete/{sSelector} | Retrieve Inscriptiontypes and IDs



## inscriptiontypeGetAutocompleteV2

> InscriptiontypeGetAutocompleteV2Response inscriptiontypeGetAutocompleteV2(sSelector, sQuery, acceptLanguage)

Retrieve Inscriptiontypes and IDs

Get the list of Inscriptiontype to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptiontypeApi;

ObjectInscriptiontypeApi apiInstance = new ObjectInscriptiontypeApi();
String sSelector = null; // String | The type of Inscriptiontypes to return
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    InscriptiontypeGetAutocompleteV2Response result = apiInstance.inscriptiontypeGetAutocompleteV2(sSelector, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptiontypeApi#inscriptiontypeGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Inscriptiontypes to return | [default to null] [enum: All]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**InscriptiontypeGetAutocompleteV2Response**](InscriptiontypeGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

