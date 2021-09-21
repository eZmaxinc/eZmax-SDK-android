# GlobalCustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalCustomerGetEndpointV1**](GlobalCustomerApi.md#globalCustomerGetEndpointV1) | **GET** /1/customer/{pksCustomerCode}/endpoint | Get customer endpoint



## globalCustomerGetEndpointV1

> GlobalCustomerGetEndpointV1Response globalCustomerGetEndpointV1(pksCustomerCode, sInfrastructureproductCode)

Get customer endpoint

Retrieve the customer&#39;s specific server endpoint where to send requests. This will help locate the proper region (ie: sInfrastructureregionCode) and the proper environment (ie: sInfrastructureenvironmenttypeDescription) where the customer&#39;s data is stored.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GlobalCustomerApi;

GlobalCustomerApi apiInstance = new GlobalCustomerApi();
String pksCustomerCode = null; // String | 
String sInfrastructureproductCode = null; // String | The infrastructure product Code  If undefined, \"appcluster01\" is assumed
try {
    GlobalCustomerGetEndpointV1Response result = apiInstance.globalCustomerGetEndpointV1(pksCustomerCode, sInfrastructureproductCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalCustomerApi#globalCustomerGetEndpointV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pksCustomerCode** | **String**|  | [default to null]
 **sInfrastructureproductCode** | **String**| The infrastructure product Code  If undefined, \&quot;appcluster01\&quot; is assumed | [optional] [default to null] [enum: appcluster01, ezsignuser]

### Return type

[**GlobalCustomerGetEndpointV1Response**](GlobalCustomerGetEndpointV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

