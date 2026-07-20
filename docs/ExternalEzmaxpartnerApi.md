# ExternalEzmaxpartnerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**externalpartnerSubscribeV1**](ExternalEzmaxpartnerApi.md#externalpartnerSubscribeV1) | **POST** /1/external/ezmaxpartner/subscribe | Subscribe to an Ezmaxparnerproductstage



## externalpartnerSubscribeV1

> DocumentationSubscribeV1Response externalpartnerSubscribeV1(documentationSubscribeV1Request)

Subscribe to an Ezmaxparnerproductstage

Subscribe to an Ezmaxparnerproductstage

### Example

```java
// Import classes:
//import org.openapitools.client.api.ExternalEzmaxpartnerApi;

ExternalEzmaxpartnerApi apiInstance = new ExternalEzmaxpartnerApi();
DocumentationSubscribeV1Request documentationSubscribeV1Request = new DocumentationSubscribeV1Request(); // DocumentationSubscribeV1Request | 
try {
    DocumentationSubscribeV1Response result = apiInstance.externalpartnerSubscribeV1(documentationSubscribeV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalEzmaxpartnerApi#externalpartnerSubscribeV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentationSubscribeV1Request** | [**DocumentationSubscribeV1Request**](DocumentationSubscribeV1Request.md)|  |

### Return type

[**DocumentationSubscribeV1Response**](DocumentationSubscribeV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

