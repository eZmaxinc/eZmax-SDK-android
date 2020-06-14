# ActivesessionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**1objectActivesessionGetCurrentGet**](ActivesessionApi.md#1objectActivesessionGetCurrentGet) | **GET** /1/object/activesession/getCurrent | Get Current Activesession



## 1objectActivesessionGetCurrentGet

> Response1ObjectActivesessionGetCurrent 1objectActivesessionGetCurrentGet()

Get Current Activesession

Todo Description

### Example

```java
// Import classes:
//import org.openapitools.client.api.ActivesessionApi;

ActivesessionApi apiInstance = new ActivesessionApi();
try {
    Response1ObjectActivesessionGetCurrent result = apiInstance.1objectActivesessionGetCurrentGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivesessionApi#1objectActivesessionGetCurrentGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Response1ObjectActivesessionGetCurrent**](Response1ObjectActivesessionGetCurrent.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

