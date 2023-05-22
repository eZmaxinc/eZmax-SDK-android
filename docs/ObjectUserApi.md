# ObjectUserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userGetAutocompleteV2**](ObjectUserApi.md#userGetAutocompleteV2) | **GET** /2/object/user/getAutocomplete/{sSelector} | Retrieve Users and IDs



## userGetAutocompleteV2

> UserGetAutocompleteV2Response userGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Users and IDs

Get the list of User to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
String sSelector = null; // String | The type of Users to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    UserGetAutocompleteV2Response result = apiInstance.userGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Users to return | [default to null] [enum: All, AgentBrokerEmployeeEzsignUserNormal, AgentBrokerEmployeeNormalBuiltIn, ClonableUsers, EzsignuserBuiltIn, Normal, NormalEzsignSigner]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**UserGetAutocompleteV2Response**](UserGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

