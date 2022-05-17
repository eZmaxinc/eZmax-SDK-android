# ModuleEzsignApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignSuggestSignersV1**](ModuleEzsignApi.md#ezsignSuggestSignersV1) | **GET** /1/module/ezsign/suggestSigners | Suggest signers
[**ezsignSuggestTemplatesV1**](ModuleEzsignApi.md#ezsignSuggestTemplatesV1) | **GET** /1/module/ezsign/suggestTemplates | Suggest templates



## ezsignSuggestSignersV1

> EzsignSuggestSignersV1Response ezsignSuggestSignersV1()

Suggest signers

Retrieve previously used Ezsignsigners and all users from the system

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleEzsignApi;

ModuleEzsignApi apiInstance = new ModuleEzsignApi();
try {
    EzsignSuggestSignersV1Response result = apiInstance.ezsignSuggestSignersV1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleEzsignApi#ezsignSuggestSignersV1");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**EzsignSuggestSignersV1Response**](EzsignSuggestSignersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignSuggestTemplatesV1

> EzsignSuggestTemplatesV1Response ezsignSuggestTemplatesV1(fkiEzsignfoldertypeID)

Suggest templates

Retrieve Ezsigntemplates and Ezsigntemplatepackages that can be imported in a Ezsignfolder

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleEzsignApi;

ModuleEzsignApi apiInstance = new ModuleEzsignApi();
Integer fkiEzsignfoldertypeID = null; // Integer | 
try {
    EzsignSuggestTemplatesV1Response result = apiInstance.ezsignSuggestTemplatesV1(fkiEzsignfoldertypeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleEzsignApi#ezsignSuggestTemplatesV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fkiEzsignfoldertypeID** | **Integer**|  | [optional] [default to null]

### Return type

[**EzsignSuggestTemplatesV1Response**](EzsignSuggestTemplatesV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

