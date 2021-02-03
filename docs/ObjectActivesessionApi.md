# ObjectActivesessionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activesessionGetCurrentV1**](ObjectActivesessionApi.md#activesessionGetCurrentV1) | **GET** /1/object/activesession/getCurrent | Get Current Activesession



## activesessionGetCurrentV1

> ActivesessionGetCurrentV1Response activesessionGetCurrentV1()

Get Current Activesession

Retrieve the details about the current activesession

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectActivesessionApi;

ObjectActivesessionApi apiInstance = new ObjectActivesessionApi();
try {
    ActivesessionGetCurrentV1Response result = apiInstance.activesessionGetCurrentV1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectActivesessionApi#activesessionGetCurrentV1");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ActivesessionGetCurrentV1Response**](ActivesessionGetCurrentV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

