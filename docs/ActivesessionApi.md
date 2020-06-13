# ActivesessionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrent**](ActivesessionApi.md#getCurrent) | **GET** /1/object/activesession/getCurrent | Get Current Activesession



## getCurrent

> getCurrent()

Get Current Activesession

Todo Description

### Example

```java
// Import classes:
//import org.openapitools.client.api.ActivesessionApi;

ActivesessionApi apiInstance = new ActivesessionApi();
try {
    apiInstance.getCurrent();
} catch (ApiException e) {
    System.err.println("Exception when calling ActivesessionApi#getCurrent");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

