# ObjectEzmaxcustomeruserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezmaxcustomeruserPatchObjectV1**](ObjectEzmaxcustomeruserApi.md#ezmaxcustomeruserPatchObjectV1) | **PATCH** /1/object/ezmaxcustomeruser/{pkiEzmaxcustomeruserID} | Patch an existing Ezmaxcustomeruser



## ezmaxcustomeruserPatchObjectV1

> EzmaxcustomeruserPatchObjectV1Response ezmaxcustomeruserPatchObjectV1(pkiEzmaxcustomeruserID, ezmaxcustomeruserPatchObjectV1Request)

Patch an existing Ezmaxcustomeruser



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzmaxcustomeruserApi;

ObjectEzmaxcustomeruserApi apiInstance = new ObjectEzmaxcustomeruserApi();
Integer pkiEzmaxcustomeruserID = null; // Integer | The unique ID of the Ezmaxcustomeruser
EzmaxcustomeruserPatchObjectV1Request ezmaxcustomeruserPatchObjectV1Request = new EzmaxcustomeruserPatchObjectV1Request(); // EzmaxcustomeruserPatchObjectV1Request | 
try {
    EzmaxcustomeruserPatchObjectV1Response result = apiInstance.ezmaxcustomeruserPatchObjectV1(pkiEzmaxcustomeruserID, ezmaxcustomeruserPatchObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzmaxcustomeruserApi#ezmaxcustomeruserPatchObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzmaxcustomeruserID** | **Integer**| The unique ID of the Ezmaxcustomeruser | [default to null]
 **ezmaxcustomeruserPatchObjectV1Request** | [**EzmaxcustomeruserPatchObjectV1Request**](EzmaxcustomeruserPatchObjectV1Request.md)|  |

### Return type

[**EzmaxcustomeruserPatchObjectV1Response**](EzmaxcustomeruserPatchObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

