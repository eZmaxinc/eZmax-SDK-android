# ObjectEzsignimportdocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignimportdocumentDownloadV1**](ObjectEzsignimportdocumentApi.md#ezsignimportdocumentDownloadV1) | **GET** /1/object/ezsignimportdocument/{pkiEzsignimportdocumentID}/download | Retrieve the content



## ezsignimportdocumentDownloadV1

> EzsignimportdocumentDownloadV1Response ezsignimportdocumentDownloadV1(pkiEzsignimportdocumentID)

Retrieve the content

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignimportdocumentApi;

ObjectEzsignimportdocumentApi apiInstance = new ObjectEzsignimportdocumentApi();
Integer pkiEzsignimportdocumentID = null; // Integer | 
try {
    EzsignimportdocumentDownloadV1Response result = apiInstance.ezsignimportdocumentDownloadV1(pkiEzsignimportdocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignimportdocumentApi#ezsignimportdocumentDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignimportdocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsignimportdocumentDownloadV1Response**](EzsignimportdocumentDownloadV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

