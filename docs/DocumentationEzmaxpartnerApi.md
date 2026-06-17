# DocumentationEzmaxpartnerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**documentationSubscribeV1**](DocumentationEzmaxpartnerApi.md#documentationSubscribeV1) | **POST** /1/documentation/subscribe | Subscribe to an Ezmaxparnerproductstage



## documentationSubscribeV1

> DocumentationSubscribeV1Response documentationSubscribeV1(documentationSubscribeV1Request)

Subscribe to an Ezmaxparnerproductstage

Subscribe to an Ezmaxparnerproductstage

### Example

```java
// Import classes:
//import org.openapitools.client.api.DocumentationEzmaxpartnerApi;

DocumentationEzmaxpartnerApi apiInstance = new DocumentationEzmaxpartnerApi();
DocumentationSubscribeV1Request documentationSubscribeV1Request = new DocumentationSubscribeV1Request(); // DocumentationSubscribeV1Request | 
try {
    DocumentationSubscribeV1Response result = apiInstance.documentationSubscribeV1(documentationSubscribeV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentationEzmaxpartnerApi#documentationSubscribeV1");
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

