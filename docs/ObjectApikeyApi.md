# ObjectApikeyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apikeyCreateObjectV1**](ObjectApikeyApi.md#apikeyCreateObjectV1) | **POST** /1/object/apikey | Create a new Apikey



## apikeyCreateObjectV1

> ApikeyCreateObjectV1Response apikeyCreateObjectV1(apikeyCreateObjectV1Request)

Create a new Apikey

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectApikeyApi;

ObjectApikeyApi apiInstance = new ObjectApikeyApi();
List<ApikeyCreateObjectV1Request> apikeyCreateObjectV1Request = Arrays.asList(new ApikeyCreateObjectV1Request()); // List<ApikeyCreateObjectV1Request> | 
try {
    ApikeyCreateObjectV1Response result = apiInstance.apikeyCreateObjectV1(apikeyCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectApikeyApi#apikeyCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikeyCreateObjectV1Request** | [**List&lt;ApikeyCreateObjectV1Request&gt;**](ApikeyCreateObjectV1Request.md)|  |

### Return type

[**ApikeyCreateObjectV1Response**](ApikeyCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

