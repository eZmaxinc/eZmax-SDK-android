# ObjectPaymentpreparationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentpreparationBatchDownloadV1**](ObjectPaymentpreparationApi.md#paymentpreparationBatchDownloadV1) | **POST** /1/object/paymentpreparation/{pkiPaymentpreparationID}/batchDownload | Download multiples attachments from an Paymentpreparation
[**paymentpreparationGetAttachmentsV1**](ObjectPaymentpreparationApi.md#paymentpreparationGetAttachmentsV1) | **GET** /1/object/paymentpreparation/{pkiPaymentpreparationID}/getAttachments | Retrieve Paymentpreparation&#39;s attachments
[**paymentpreparationImportIntoEDMV1**](ObjectPaymentpreparationApi.md#paymentpreparationImportIntoEDMV1) | **POST** /1/object/paymentpreparation/{pkiPaymentpreparationID}/importIntoEDM | Import attachments into the Paymentpreparation



## paymentpreparationBatchDownloadV1

> File paymentpreparationBatchDownloadV1(pkiPaymentpreparationID, paymentpreparationBatchDownloadV1Request)

Download multiples attachments from an Paymentpreparation

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymentpreparationApi;

ObjectPaymentpreparationApi apiInstance = new ObjectPaymentpreparationApi();
Integer pkiPaymentpreparationID = null; // Integer | 
PaymentpreparationBatchDownloadV1Request paymentpreparationBatchDownloadV1Request = new PaymentpreparationBatchDownloadV1Request(); // PaymentpreparationBatchDownloadV1Request | 
try {
    File result = apiInstance.paymentpreparationBatchDownloadV1(pkiPaymentpreparationID, paymentpreparationBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymentpreparationApi#paymentpreparationBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPaymentpreparationID** | **Integer**|  | [default to null]
 **paymentpreparationBatchDownloadV1Request** | [**PaymentpreparationBatchDownloadV1Request**](PaymentpreparationBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## paymentpreparationGetAttachmentsV1

> PaymentpreparationGetAttachmentsV1Response paymentpreparationGetAttachmentsV1(pkiPaymentpreparationID)

Retrieve Paymentpreparation&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymentpreparationApi;

ObjectPaymentpreparationApi apiInstance = new ObjectPaymentpreparationApi();
Integer pkiPaymentpreparationID = null; // Integer | 
try {
    PaymentpreparationGetAttachmentsV1Response result = apiInstance.paymentpreparationGetAttachmentsV1(pkiPaymentpreparationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymentpreparationApi#paymentpreparationGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPaymentpreparationID** | **Integer**|  | [default to null]

### Return type

[**PaymentpreparationGetAttachmentsV1Response**](PaymentpreparationGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## paymentpreparationImportIntoEDMV1

> PaymentpreparationImportIntoEDMV1Response paymentpreparationImportIntoEDMV1(pkiPaymentpreparationID, paymentpreparationImportIntoEDMV1Request)

Import attachments into the Paymentpreparation

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymentpreparationApi;

ObjectPaymentpreparationApi apiInstance = new ObjectPaymentpreparationApi();
Integer pkiPaymentpreparationID = null; // Integer | 
PaymentpreparationImportIntoEDMV1Request paymentpreparationImportIntoEDMV1Request = new PaymentpreparationImportIntoEDMV1Request(); // PaymentpreparationImportIntoEDMV1Request | 
try {
    PaymentpreparationImportIntoEDMV1Response result = apiInstance.paymentpreparationImportIntoEDMV1(pkiPaymentpreparationID, paymentpreparationImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymentpreparationApi#paymentpreparationImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPaymentpreparationID** | **Integer**|  | [default to null]
 **paymentpreparationImportIntoEDMV1Request** | [**PaymentpreparationImportIntoEDMV1Request**](PaymentpreparationImportIntoEDMV1Request.md)|  |

### Return type

[**PaymentpreparationImportIntoEDMV1Response**](PaymentpreparationImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

