# ObjectDeposittransitchequeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deposittransitchequeBatchDownloadV1**](ObjectDeposittransitchequeApi.md#deposittransitchequeBatchDownloadV1) | **POST** /1/object/deposittransitcheque/{pkiDeposittransitchequeID}/batchDownload | Download multiples attachments from a Deposittransitcheque
[**deposittransitchequeGetAttachmentsV1**](ObjectDeposittransitchequeApi.md#deposittransitchequeGetAttachmentsV1) | **GET** /1/object/deposittransitcheque/{pkiDeposittransitchequeID}/getAttachments | Retrieve Deposittransitcheque&#39;s attachments
[**deposittransitchequeImportIntoEDMV1**](ObjectDeposittransitchequeApi.md#deposittransitchequeImportIntoEDMV1) | **POST** /1/object/deposittransitcheque/{pkiDeposittransitchequeID}/importIntoEDM | Import attachments into the Deposittransitcheque



## deposittransitchequeBatchDownloadV1

> File deposittransitchequeBatchDownloadV1(pkiDeposittransitchequeID, deposittransitchequeBatchDownloadV1Request)

Download multiples attachments from a Deposittransitcheque

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDeposittransitchequeApi;

ObjectDeposittransitchequeApi apiInstance = new ObjectDeposittransitchequeApi();
Integer pkiDeposittransitchequeID = null; // Integer | 
DeposittransitchequeBatchDownloadV1Request deposittransitchequeBatchDownloadV1Request = new DeposittransitchequeBatchDownloadV1Request(); // DeposittransitchequeBatchDownloadV1Request | 
try {
    File result = apiInstance.deposittransitchequeBatchDownloadV1(pkiDeposittransitchequeID, deposittransitchequeBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDeposittransitchequeApi#deposittransitchequeBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDeposittransitchequeID** | **Integer**|  | [default to null]
 **deposittransitchequeBatchDownloadV1Request** | [**DeposittransitchequeBatchDownloadV1Request**](DeposittransitchequeBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## deposittransitchequeGetAttachmentsV1

> DeposittransitchequeGetAttachmentsV1Response deposittransitchequeGetAttachmentsV1(pkiDeposittransitchequeID)

Retrieve Deposittransitcheque&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDeposittransitchequeApi;

ObjectDeposittransitchequeApi apiInstance = new ObjectDeposittransitchequeApi();
Integer pkiDeposittransitchequeID = null; // Integer | 
try {
    DeposittransitchequeGetAttachmentsV1Response result = apiInstance.deposittransitchequeGetAttachmentsV1(pkiDeposittransitchequeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDeposittransitchequeApi#deposittransitchequeGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDeposittransitchequeID** | **Integer**|  | [default to null]

### Return type

[**DeposittransitchequeGetAttachmentsV1Response**](DeposittransitchequeGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deposittransitchequeImportIntoEDMV1

> DeposittransitchequeImportIntoEDMV1Response deposittransitchequeImportIntoEDMV1(pkiDeposittransitchequeID, deposittransitchequeImportIntoEDMV1Request)

Import attachments into the Deposittransitcheque

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDeposittransitchequeApi;

ObjectDeposittransitchequeApi apiInstance = new ObjectDeposittransitchequeApi();
Integer pkiDeposittransitchequeID = null; // Integer | 
DeposittransitchequeImportIntoEDMV1Request deposittransitchequeImportIntoEDMV1Request = new DeposittransitchequeImportIntoEDMV1Request(); // DeposittransitchequeImportIntoEDMV1Request | 
try {
    DeposittransitchequeImportIntoEDMV1Response result = apiInstance.deposittransitchequeImportIntoEDMV1(pkiDeposittransitchequeID, deposittransitchequeImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDeposittransitchequeApi#deposittransitchequeImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDeposittransitchequeID** | **Integer**|  | [default to null]
 **deposittransitchequeImportIntoEDMV1Request** | [**DeposittransitchequeImportIntoEDMV1Request**](DeposittransitchequeImportIntoEDMV1Request.md)|  |

### Return type

[**DeposittransitchequeImportIntoEDMV1Response**](DeposittransitchequeImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

