# ObjectEzmaxcaseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezmaxcasePatchObjectV1**](ObjectEzmaxcaseApi.md#ezmaxcasePatchObjectV1) | **PATCH** /1/object/ezmaxcase/{pkiEzmaxcaseID} | Patch an existing Ezmaxcase



## ezmaxcasePatchObjectV1

> EzmaxcasePatchObjectV1Response ezmaxcasePatchObjectV1(pkiEzmaxcaseID, ezmaxcasePatchObjectV1Request)

Patch an existing Ezmaxcase



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzmaxcaseApi;

ObjectEzmaxcaseApi apiInstance = new ObjectEzmaxcaseApi();
Integer pkiEzmaxcaseID = null; // Integer | The unique ID of the Ezmaxcase
EzmaxcasePatchObjectV1Request ezmaxcasePatchObjectV1Request = new EzmaxcasePatchObjectV1Request(); // EzmaxcasePatchObjectV1Request | 
try {
    EzmaxcasePatchObjectV1Response result = apiInstance.ezmaxcasePatchObjectV1(pkiEzmaxcaseID, ezmaxcasePatchObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzmaxcaseApi#ezmaxcasePatchObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzmaxcaseID** | **Integer**| The unique ID of the Ezmaxcase | [default to null]
 **ezmaxcasePatchObjectV1Request** | [**EzmaxcasePatchObjectV1Request**](EzmaxcasePatchObjectV1Request.md)|  |

### Return type

[**EzmaxcasePatchObjectV1Response**](EzmaxcasePatchObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

