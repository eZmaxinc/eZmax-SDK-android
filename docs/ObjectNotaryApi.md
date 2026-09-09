# ObjectNotaryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notaryBatchDownloadV1**](ObjectNotaryApi.md#notaryBatchDownloadV1) | **POST** /1/object/notary/{pkiNotaryID}/batchDownload | Download multiples attachments from a Notary
[**notaryGetAttachmentsV1**](ObjectNotaryApi.md#notaryGetAttachmentsV1) | **GET** /1/object/notary/{pkiNotaryID}/getAttachments | Retrieve Notary&#39;s attachments
[**notaryImportIntoEDMV1**](ObjectNotaryApi.md#notaryImportIntoEDMV1) | **POST** /1/object/notary/{pkiNotaryID}/importIntoEDM | Import attachments into the Notary



## notaryBatchDownloadV1

> File notaryBatchDownloadV1(pkiNotaryID, notaryBatchDownloadV1Request)

Download multiples attachments from a Notary

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectNotaryApi;

ObjectNotaryApi apiInstance = new ObjectNotaryApi();
Integer pkiNotaryID = null; // Integer | 
NotaryBatchDownloadV1Request notaryBatchDownloadV1Request = new NotaryBatchDownloadV1Request(); // NotaryBatchDownloadV1Request | 
try {
    File result = apiInstance.notaryBatchDownloadV1(pkiNotaryID, notaryBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectNotaryApi#notaryBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiNotaryID** | **Integer**|  | [default to null]
 **notaryBatchDownloadV1Request** | [**NotaryBatchDownloadV1Request**](NotaryBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## notaryGetAttachmentsV1

> NotaryGetAttachmentsV1Response notaryGetAttachmentsV1(pkiNotaryID)

Retrieve Notary&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectNotaryApi;

ObjectNotaryApi apiInstance = new ObjectNotaryApi();
Integer pkiNotaryID = null; // Integer | 
try {
    NotaryGetAttachmentsV1Response result = apiInstance.notaryGetAttachmentsV1(pkiNotaryID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectNotaryApi#notaryGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiNotaryID** | **Integer**|  | [default to null]

### Return type

[**NotaryGetAttachmentsV1Response**](NotaryGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## notaryImportIntoEDMV1

> NotaryImportIntoEDMV1Response notaryImportIntoEDMV1(pkiNotaryID, notaryImportIntoEDMV1Request)

Import attachments into the Notary

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectNotaryApi;

ObjectNotaryApi apiInstance = new ObjectNotaryApi();
Integer pkiNotaryID = null; // Integer | 
NotaryImportIntoEDMV1Request notaryImportIntoEDMV1Request = new NotaryImportIntoEDMV1Request(); // NotaryImportIntoEDMV1Request | 
try {
    NotaryImportIntoEDMV1Response result = apiInstance.notaryImportIntoEDMV1(pkiNotaryID, notaryImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectNotaryApi#notaryImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiNotaryID** | **Integer**|  | [default to null]
 **notaryImportIntoEDMV1Request** | [**NotaryImportIntoEDMV1Request**](NotaryImportIntoEDMV1Request.md)|  |

### Return type

[**NotaryImportIntoEDMV1Response**](NotaryImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

