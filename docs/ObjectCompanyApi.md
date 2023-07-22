# ObjectCompanyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companyGetAutocompleteV2**](ObjectCompanyApi.md#companyGetAutocompleteV2) | **GET** /2/object/company/getAutocomplete/{sSelector} | Retrieve Companys and IDs



## companyGetAutocompleteV2

> CompanyGetAutocompleteV2Response companyGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Companys and IDs

Get the list of Company to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCompanyApi;

ObjectCompanyApi apiInstance = new ObjectCompanyApi();
String sSelector = null; // String | The type of Companys to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    CompanyGetAutocompleteV2Response result = apiInstance.companyGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCompanyApi#companyGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Companys to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**CompanyGetAutocompleteV2Response**](CompanyGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

