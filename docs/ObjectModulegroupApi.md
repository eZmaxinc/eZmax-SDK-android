# ObjectModulegroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modulegroupGetAllV1**](ObjectModulegroupApi.md#modulegroupGetAllV1) | **GET** /1/object/modulegroup/getAll/{eContext} | Retrieve all Modulegroups



## modulegroupGetAllV1

> ModulegroupGetAllV1Response modulegroupGetAllV1(eContext)

Retrieve all Modulegroups

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectModulegroupApi;

ObjectModulegroupApi apiInstance = new ObjectModulegroupApi();
String eContext = null; // String | The context of the Modulegroup
try {
    ModulegroupGetAllV1Response result = apiInstance.modulegroupGetAllV1(eContext);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectModulegroupApi#modulegroupGetAllV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eContext** | **String**| The context of the Modulegroup | [default to null] [enum: Api, User]

### Return type

[**ModulegroupGetAllV1Response**](ModulegroupGetAllV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

