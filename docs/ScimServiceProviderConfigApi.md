# ScimServiceProviderConfigApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serviceProviderConfigGetObjectScimV2**](ScimServiceProviderConfigApi.md#serviceProviderConfigGetObjectScimV2) | **GET** /2/scim/ServiceProviderConfig | Get Service Provider Configuration



## serviceProviderConfigGetObjectScimV2

> ScimServiceProviderConfig serviceProviderConfigGetObjectScimV2()

Get Service Provider Configuration

### Example

```java
// Import classes:
//import org.openapitools.client.api.ScimServiceProviderConfigApi;

ScimServiceProviderConfigApi apiInstance = new ScimServiceProviderConfigApi();
try {
    ScimServiceProviderConfig result = apiInstance.serviceProviderConfigGetObjectScimV2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimServiceProviderConfigApi#serviceProviderConfigGetObjectScimV2");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ScimServiceProviderConfig**](ScimServiceProviderConfig.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

