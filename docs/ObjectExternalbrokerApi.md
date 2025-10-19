# ObjectExternalbrokerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**externalbrokerImportIntoEDMV1**](ObjectExternalbrokerApi.md#externalbrokerImportIntoEDMV1) | **POST** /1/object/externalbroker/{pkiExternalbrokerID}/importIntoEDM | Import attachments into the Externalbroker



## externalbrokerImportIntoEDMV1

> ExternalbrokerImportIntoEDMV1Response externalbrokerImportIntoEDMV1(pkiExternalbrokerID, externalbrokerImportIntoEDMV1Request)

Import attachments into the Externalbroker



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectExternalbrokerApi;

ObjectExternalbrokerApi apiInstance = new ObjectExternalbrokerApi();
Integer pkiExternalbrokerID = null; // Integer | 
ExternalbrokerImportIntoEDMV1Request externalbrokerImportIntoEDMV1Request = new ExternalbrokerImportIntoEDMV1Request(); // ExternalbrokerImportIntoEDMV1Request | 
try {
    ExternalbrokerImportIntoEDMV1Response result = apiInstance.externalbrokerImportIntoEDMV1(pkiExternalbrokerID, externalbrokerImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectExternalbrokerApi#externalbrokerImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiExternalbrokerID** | **Integer**|  | [default to null]
 **externalbrokerImportIntoEDMV1Request** | [**ExternalbrokerImportIntoEDMV1Request**](ExternalbrokerImportIntoEDMV1Request.md)|  |

### Return type

[**ExternalbrokerImportIntoEDMV1Response**](ExternalbrokerImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

