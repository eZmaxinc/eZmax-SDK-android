# ObjectReconciliationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reconciliationBatchDownloadV1**](ObjectReconciliationApi.md#reconciliationBatchDownloadV1) | **POST** /1/object/reconciliation/{pkiReconciliationID}/batchDownload | Download multiples attachments from a Reconciliation
[**reconciliationGetAttachmentsV1**](ObjectReconciliationApi.md#reconciliationGetAttachmentsV1) | **GET** /1/object/reconciliation/{pkiReconciliationID}/getAttachments | Retrieve Reconciliation&#39;s attachments
[**reconciliationImportIntoEDMV1**](ObjectReconciliationApi.md#reconciliationImportIntoEDMV1) | **POST** /1/object/reconciliation/{pkiReconciliationID}/importIntoEDM | Import attachments into the Reconciliation



## reconciliationBatchDownloadV1

> File reconciliationBatchDownloadV1(pkiReconciliationID, reconciliationBatchDownloadV1Request)

Download multiples attachments from a Reconciliation

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectReconciliationApi;

ObjectReconciliationApi apiInstance = new ObjectReconciliationApi();
Integer pkiReconciliationID = null; // Integer | 
ReconciliationBatchDownloadV1Request reconciliationBatchDownloadV1Request = new ReconciliationBatchDownloadV1Request(); // ReconciliationBatchDownloadV1Request | 
try {
    File result = apiInstance.reconciliationBatchDownloadV1(pkiReconciliationID, reconciliationBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectReconciliationApi#reconciliationBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiReconciliationID** | **Integer**|  | [default to null]
 **reconciliationBatchDownloadV1Request** | [**ReconciliationBatchDownloadV1Request**](ReconciliationBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## reconciliationGetAttachmentsV1

> ReconciliationGetAttachmentsV1Response reconciliationGetAttachmentsV1(pkiReconciliationID)

Retrieve Reconciliation&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectReconciliationApi;

ObjectReconciliationApi apiInstance = new ObjectReconciliationApi();
Integer pkiReconciliationID = null; // Integer | 
try {
    ReconciliationGetAttachmentsV1Response result = apiInstance.reconciliationGetAttachmentsV1(pkiReconciliationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectReconciliationApi#reconciliationGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiReconciliationID** | **Integer**|  | [default to null]

### Return type

[**ReconciliationGetAttachmentsV1Response**](ReconciliationGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## reconciliationImportIntoEDMV1

> ReconciliationImportIntoEDMV1Response reconciliationImportIntoEDMV1(pkiReconciliationID, reconciliationImportIntoEDMV1Request)

Import attachments into the Reconciliation

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectReconciliationApi;

ObjectReconciliationApi apiInstance = new ObjectReconciliationApi();
Integer pkiReconciliationID = null; // Integer | 
ReconciliationImportIntoEDMV1Request reconciliationImportIntoEDMV1Request = new ReconciliationImportIntoEDMV1Request(); // ReconciliationImportIntoEDMV1Request | 
try {
    ReconciliationImportIntoEDMV1Response result = apiInstance.reconciliationImportIntoEDMV1(pkiReconciliationID, reconciliationImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectReconciliationApi#reconciliationImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiReconciliationID** | **Integer**|  | [default to null]
 **reconciliationImportIntoEDMV1Request** | [**ReconciliationImportIntoEDMV1Request**](ReconciliationImportIntoEDMV1Request.md)|  |

### Return type

[**ReconciliationImportIntoEDMV1Response**](ReconciliationImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

