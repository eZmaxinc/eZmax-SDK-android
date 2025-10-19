# ObjectEzmaxcustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezmaxcustomerPatchObjectV1**](ObjectEzmaxcustomerApi.md#ezmaxcustomerPatchObjectV1) | **PATCH** /1/object/ezmaxcustomer/{pkiEzmaxcustomerID} | Patch an existing Ezmaxcustomer



## ezmaxcustomerPatchObjectV1

> EzmaxcustomerPatchObjectV1Response ezmaxcustomerPatchObjectV1(pkiEzmaxcustomerID, ezmaxcustomerPatchObjectV1Request)

Patch an existing Ezmaxcustomer



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzmaxcustomerApi;

ObjectEzmaxcustomerApi apiInstance = new ObjectEzmaxcustomerApi();
Integer pkiEzmaxcustomerID = null; // Integer | The unique ID of the Ezmaxcustomer
EzmaxcustomerPatchObjectV1Request ezmaxcustomerPatchObjectV1Request = new EzmaxcustomerPatchObjectV1Request(); // EzmaxcustomerPatchObjectV1Request | 
try {
    EzmaxcustomerPatchObjectV1Response result = apiInstance.ezmaxcustomerPatchObjectV1(pkiEzmaxcustomerID, ezmaxcustomerPatchObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzmaxcustomerApi#ezmaxcustomerPatchObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzmaxcustomerID** | **Integer**| The unique ID of the Ezmaxcustomer | [default to null]
 **ezmaxcustomerPatchObjectV1Request** | [**EzmaxcustomerPatchObjectV1Request**](EzmaxcustomerPatchObjectV1Request.md)|  |

### Return type

[**EzmaxcustomerPatchObjectV1Response**](EzmaxcustomerPatchObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

