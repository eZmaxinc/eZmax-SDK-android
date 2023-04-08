# ObjectSecretquestionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secretquestionGetAutocompleteV2**](ObjectSecretquestionApi.md#secretquestionGetAutocompleteV2) | **GET** /2/object/secretquestion/getAutocomplete/{sSelector} | Retrieve Secretquestions and IDs



## secretquestionGetAutocompleteV2

> SecretquestionGetAutocompleteV2Response secretquestionGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Secretquestions and IDs

Get the list of Secretquestion to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSecretquestionApi;

ObjectSecretquestionApi apiInstance = new ObjectSecretquestionApi();
String sSelector = null; // String | The type of Secretquestions to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    SecretquestionGetAutocompleteV2Response result = apiInstance.secretquestionGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSecretquestionApi#secretquestionGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Secretquestions to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**SecretquestionGetAutocompleteV2Response**](SecretquestionGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

