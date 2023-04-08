# ObjectApikeyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apikeyCreateObjectV2**](ObjectApikeyApi.md#apikeyCreateObjectV2) | **POST** /2/object/apikey | Create a new Apikey



## apikeyCreateObjectV2

> ApikeyCreateObjectV2Response apikeyCreateObjectV2(apikeyCreateObjectV2Request)

Create a new Apikey

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectApikeyApi;

ObjectApikeyApi apiInstance = new ObjectApikeyApi();
ApikeyCreateObjectV2Request apikeyCreateObjectV2Request = new ApikeyCreateObjectV2Request(); // ApikeyCreateObjectV2Request | 
try {
    ApikeyCreateObjectV2Response result = apiInstance.apikeyCreateObjectV2(apikeyCreateObjectV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectApikeyApi#apikeyCreateObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikeyCreateObjectV2Request** | [**ApikeyCreateObjectV2Request**](ApikeyCreateObjectV2Request.md)|  |

### Return type

[**ApikeyCreateObjectV2Response**](ApikeyCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

