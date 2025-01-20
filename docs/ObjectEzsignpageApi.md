# ObjectEzsignpageApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignpageConsultV1**](ObjectEzsignpageApi.md#ezsignpageConsultV1) | **POST** /1/object/ezsignpage/{pkiEzsignpageID}/consult | Consult an Ezsignpage



## ezsignpageConsultV1

> CommonResponse ezsignpageConsultV1(pkiEzsignpageID, body)

Consult an Ezsignpage

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignpageApi;

ObjectEzsignpageApi apiInstance = new ObjectEzsignpageApi();
Integer pkiEzsignpageID = null; // Integer | 
Object body = null; // Object | 
try {
    CommonResponse result = apiInstance.ezsignpageConsultV1(pkiEzsignpageID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignpageApi#ezsignpageConsultV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignpageID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

