# ModuleAuthenticateApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticateAuthenticateV2**](ModuleAuthenticateApi.md#authenticateAuthenticateV2) | **POST** /2/module/authenticate/authenticate/{eSessionType} | Authenticate a user



## authenticateAuthenticateV2

> AuthenticateAuthenticateV2Response authenticateAuthenticateV2(eSessionType, authenticateAuthenticateV2Request)

Authenticate a user

This endpoint authenticates a user.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleAuthenticateApi;

ModuleAuthenticateApi apiInstance = new ModuleAuthenticateApi();
String eSessionType = null; // String | 
AuthenticateAuthenticateV2Request authenticateAuthenticateV2Request = new AuthenticateAuthenticateV2Request(); // AuthenticateAuthenticateV2Request | 
try {
    AuthenticateAuthenticateV2Response result = apiInstance.authenticateAuthenticateV2(eSessionType, authenticateAuthenticateV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleAuthenticateApi#authenticateAuthenticateV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eSessionType** | **String**|  | [default to null] [enum: ezsignuser]
 **authenticateAuthenticateV2Request** | [**AuthenticateAuthenticateV2Request**](AuthenticateAuthenticateV2Request.md)|  |

### Return type

[**AuthenticateAuthenticateV2Response**](AuthenticateAuthenticateV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

