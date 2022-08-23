# ObjectEzsigntsarequirementApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntsarequirementGetAutocompleteV1**](ObjectEzsigntsarequirementApi.md#ezsigntsarequirementGetAutocompleteV1) | **GET** /1/object/ezsigntsarequirement/getAutocomplete/{sSelector} | Retrieve Ezsigntsarequirements and IDs



## ezsigntsarequirementGetAutocompleteV1

> CommonGetAutocompleteDisabledV1Response ezsigntsarequirementGetAutocompleteV1(sSelector, fkiEzsignfoldertypeID, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsigntsarequirements and IDs

Get the list of Ezsigntsarequirement to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntsarequirementApi;

ObjectEzsigntsarequirementApi apiInstance = new ObjectEzsigntsarequirementApi();
String sSelector = null; // String | The type of Ezsigntsarequirements to return
Integer fkiEzsignfoldertypeID = null; // Integer | 
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    CommonGetAutocompleteDisabledV1Response result = apiInstance.ezsigntsarequirementGetAutocompleteV1(sSelector, fkiEzsignfoldertypeID, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntsarequirementApi#ezsigntsarequirementGetAutocompleteV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Ezsigntsarequirements to return | [default to null] [enum: User, Usergroup]
 **fkiEzsignfoldertypeID** | **Integer**|  | [optional] [default to null]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**CommonGetAutocompleteDisabledV1Response**](CommonGetAutocompleteDisabledV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

