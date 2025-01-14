# GlobalEzmaxclientApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalEzmaxclientVersionV1**](GlobalEzmaxclientApi.md#globalEzmaxclientVersionV1) | **GET** /1/ezmaxclient/{pksEzmaxclientOs}/version | Retrieve the latest version of the Ezmaxclient



## globalEzmaxclientVersionV1

> GlobalEzmaxclientVersionV1Response globalEzmaxclientVersionV1(pksEzmaxclientOs)

Retrieve the latest version of the Ezmaxclient

Retrieve the latest version of the Ezmaxclient that is available on the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GlobalEzmaxclientApi;

GlobalEzmaxclientApi apiInstance = new GlobalEzmaxclientApi();
FieldPksEzmaxclientOs pksEzmaxclientOs = null; // FieldPksEzmaxclientOs | 
try {
    GlobalEzmaxclientVersionV1Response result = apiInstance.globalEzmaxclientVersionV1(pksEzmaxclientOs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalEzmaxclientApi#globalEzmaxclientVersionV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pksEzmaxclientOs** | [**FieldPksEzmaxclientOs**](.md)|  | [default to null] [enum: Android, iOS, iPadOS, macOS, Windows]

### Return type

[**GlobalEzmaxclientVersionV1Response**](GlobalEzmaxclientVersionV1Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

