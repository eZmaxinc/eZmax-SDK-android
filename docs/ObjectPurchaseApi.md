# ObjectPurchaseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**purchaseBatchDownloadV1**](ObjectPurchaseApi.md#purchaseBatchDownloadV1) | **POST** /1/object/purchase/{pkiPurchaseID}/batchDownload | Download multiples attachments from a Purchase
[**purchaseGetAttachmentsV1**](ObjectPurchaseApi.md#purchaseGetAttachmentsV1) | **GET** /1/object/purchase/{pkiPurchaseID}/getAttachments | Retrieve Purchase&#39;s attachments
[**purchaseImportIntoEDMV1**](ObjectPurchaseApi.md#purchaseImportIntoEDMV1) | **POST** /1/object/purchase/{pkiPurchaseID}/importIntoEDM | Import attachments into the Purchase



## purchaseBatchDownloadV1

> File purchaseBatchDownloadV1(pkiPurchaseID, purchaseBatchDownloadV1Request)

Download multiples attachments from a Purchase

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPurchaseApi;

ObjectPurchaseApi apiInstance = new ObjectPurchaseApi();
Integer pkiPurchaseID = null; // Integer | 
PurchaseBatchDownloadV1Request purchaseBatchDownloadV1Request = new PurchaseBatchDownloadV1Request(); // PurchaseBatchDownloadV1Request | 
try {
    File result = apiInstance.purchaseBatchDownloadV1(pkiPurchaseID, purchaseBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPurchaseApi#purchaseBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPurchaseID** | **Integer**|  | [default to null]
 **purchaseBatchDownloadV1Request** | [**PurchaseBatchDownloadV1Request**](PurchaseBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## purchaseGetAttachmentsV1

> PurchaseGetAttachmentsV1Response purchaseGetAttachmentsV1(pkiPurchaseID)

Retrieve Purchase&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPurchaseApi;

ObjectPurchaseApi apiInstance = new ObjectPurchaseApi();
Integer pkiPurchaseID = null; // Integer | 
try {
    PurchaseGetAttachmentsV1Response result = apiInstance.purchaseGetAttachmentsV1(pkiPurchaseID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPurchaseApi#purchaseGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPurchaseID** | **Integer**|  | [default to null]

### Return type

[**PurchaseGetAttachmentsV1Response**](PurchaseGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## purchaseImportIntoEDMV1

> PurchaseImportIntoEDMV1Response purchaseImportIntoEDMV1(pkiPurchaseID, purchaseImportIntoEDMV1Request)

Import attachments into the Purchase

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPurchaseApi;

ObjectPurchaseApi apiInstance = new ObjectPurchaseApi();
Integer pkiPurchaseID = null; // Integer | 
PurchaseImportIntoEDMV1Request purchaseImportIntoEDMV1Request = new PurchaseImportIntoEDMV1Request(); // PurchaseImportIntoEDMV1Request | 
try {
    PurchaseImportIntoEDMV1Response result = apiInstance.purchaseImportIntoEDMV1(pkiPurchaseID, purchaseImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPurchaseApi#purchaseImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPurchaseID** | **Integer**|  | [default to null]
 **purchaseImportIntoEDMV1Request** | [**PurchaseImportIntoEDMV1Request**](PurchaseImportIntoEDMV1Request.md)|  |

### Return type

[**PurchaseImportIntoEDMV1Response**](PurchaseImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

