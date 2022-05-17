# ObjectSecretquestionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secretquestionGetAutocompleteV1**](ObjectSecretquestionApi.md#secretquestionGetAutocompleteV1) | **GET** /1/object/secretquestion/getAutocomplete/{sSelector} | Retrieve Secretquestions and IDs



## secretquestionGetAutocompleteV1

> CommonGetAutocompleteV1Response secretquestionGetAutocompleteV1(sSelector, sQuery, acceptLanguage)

Retrieve Secretquestions and IDs

Get the list of Secretquestions to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSecretquestionApi;

ObjectSecretquestionApi apiInstance = new ObjectSecretquestionApi();
String sSelector = null; // String | The type of Secretquestions to return
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    CommonGetAutocompleteV1Response result = apiInstance.secretquestionGetAutocompleteV1(sSelector, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSecretquestionApi#secretquestionGetAutocompleteV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Secretquestions to return | [default to null] [enum: All]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**CommonGetAutocompleteV1Response**](CommonGetAutocompleteV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

