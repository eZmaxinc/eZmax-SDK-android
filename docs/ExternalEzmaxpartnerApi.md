# ExternalEzmaxpartnerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezmaxpartnerSubscribeV1**](ExternalEzmaxpartnerApi.md#ezmaxpartnerSubscribeV1) | **POST** /1/external/ezmaxpartner/subscribe | Subscribe to an Ezmaxparnerproductstage



## ezmaxpartnerSubscribeV1

> EzmaxpartnerSubscribeV1Response ezmaxpartnerSubscribeV1(ezmaxpartnerSubscribeV1Request)

Subscribe to an Ezmaxparnerproductstage

Subscribe to an Ezmaxparnerproductstage

### Example

```java
// Import classes:
//import org.openapitools.client.api.ExternalEzmaxpartnerApi;

ExternalEzmaxpartnerApi apiInstance = new ExternalEzmaxpartnerApi();
EzmaxpartnerSubscribeV1Request ezmaxpartnerSubscribeV1Request = new EzmaxpartnerSubscribeV1Request(); // EzmaxpartnerSubscribeV1Request | 
try {
    EzmaxpartnerSubscribeV1Response result = apiInstance.ezmaxpartnerSubscribeV1(ezmaxpartnerSubscribeV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalEzmaxpartnerApi#ezmaxpartnerSubscribeV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezmaxpartnerSubscribeV1Request** | [**EzmaxpartnerSubscribeV1Request**](EzmaxpartnerSubscribeV1Request.md)|  |

### Return type

[**EzmaxpartnerSubscribeV1Response**](EzmaxpartnerSubscribeV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

