# GlobalEzmaxcustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalEzmaxcustomerGetConfigurationV1**](GlobalEzmaxcustomerApi.md#globalEzmaxcustomerGetConfigurationV1) | **GET** /1/ezmaxcustomer/{pksEzmaxcustomerCode}/getConfiguration | Get ezmaxcustomer configuration



## globalEzmaxcustomerGetConfigurationV1

> GlobalEzmaxcustomerGetConfigurationV1Response globalEzmaxcustomerGetConfigurationV1(pksEzmaxcustomerCode)

Get ezmaxcustomer configuration

Retrieve the ezmaxcustomer&#39;s specific configuration. This will help locate the proper region (ie: sInfrastructureregionCode) and the proper environment (ie: sInfrastructureenvironmenttypeDescription) where the customer&#39;s data is stored.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GlobalEzmaxcustomerApi;

GlobalEzmaxcustomerApi apiInstance = new GlobalEzmaxcustomerApi();
String pksEzmaxcustomerCode = null; // String | 
try {
    GlobalEzmaxcustomerGetConfigurationV1Response result = apiInstance.globalEzmaxcustomerGetConfigurationV1(pksEzmaxcustomerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalEzmaxcustomerApi#globalEzmaxcustomerGetConfigurationV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pksEzmaxcustomerCode** | **String**|  | [default to null]

### Return type

[**GlobalEzmaxcustomerGetConfigurationV1Response**](GlobalEzmaxcustomerGetConfigurationV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

