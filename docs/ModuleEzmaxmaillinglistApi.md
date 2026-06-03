# ModuleEzmaxmaillinglistApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezmaxmaillinglistSubscribeV1**](ModuleEzmaxmaillinglistApi.md#ezmaxmaillinglistSubscribeV1) | **POST** /1/module/ezmaxmaillinglist/subscribe | Subscribe to specific Ezmaxmaillinglist



## ezmaxmaillinglistSubscribeV1

> EzmaxmaillinglistSubscribeV1Response ezmaxmaillinglistSubscribeV1(ezmaxmaillinglistSubscribeV1Request)

Subscribe to specific Ezmaxmaillinglist

Users can subscribe to specific Ezmaxmaillinglist

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleEzmaxmaillinglistApi;

ModuleEzmaxmaillinglistApi apiInstance = new ModuleEzmaxmaillinglistApi();
EzmaxmaillinglistSubscribeV1Request ezmaxmaillinglistSubscribeV1Request = new EzmaxmaillinglistSubscribeV1Request(); // EzmaxmaillinglistSubscribeV1Request | 
try {
    EzmaxmaillinglistSubscribeV1Response result = apiInstance.ezmaxmaillinglistSubscribeV1(ezmaxmaillinglistSubscribeV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleEzmaxmaillinglistApi#ezmaxmaillinglistSubscribeV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezmaxmaillinglistSubscribeV1Request** | [**EzmaxmaillinglistSubscribeV1Request**](EzmaxmaillinglistSubscribeV1Request.md)|  |

### Return type

[**EzmaxmaillinglistSubscribeV1Response**](EzmaxmaillinglistSubscribeV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

