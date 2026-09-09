# ObjectSalaryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**salaryBatchDownloadV1**](ObjectSalaryApi.md#salaryBatchDownloadV1) | **POST** /1/object/salary/{pkiSalaryID}/batchDownload | Download multiples attachments from a Reconciliation
[**salaryGetAttachmentsV1**](ObjectSalaryApi.md#salaryGetAttachmentsV1) | **GET** /1/object/salary/{pkiSalaryID}/getAttachments | Retrieve Salary&#39;s attachments
[**salaryImportIntoEDMV1**](ObjectSalaryApi.md#salaryImportIntoEDMV1) | **POST** /1/object/salary/{pkiSalaryID}/importIntoEDM | Import attachments into the Salary



## salaryBatchDownloadV1

> File salaryBatchDownloadV1(pkiSalaryID, salaryBatchDownloadV1Request)

Download multiples attachments from a Reconciliation

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSalaryApi;

ObjectSalaryApi apiInstance = new ObjectSalaryApi();
Integer pkiSalaryID = null; // Integer | 
SalaryBatchDownloadV1Request salaryBatchDownloadV1Request = new SalaryBatchDownloadV1Request(); // SalaryBatchDownloadV1Request | 
try {
    File result = apiInstance.salaryBatchDownloadV1(pkiSalaryID, salaryBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSalaryApi#salaryBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSalaryID** | **Integer**|  | [default to null]
 **salaryBatchDownloadV1Request** | [**SalaryBatchDownloadV1Request**](SalaryBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## salaryGetAttachmentsV1

> SalaryGetAttachmentsV1Response salaryGetAttachmentsV1(pkiSalaryID)

Retrieve Salary&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSalaryApi;

ObjectSalaryApi apiInstance = new ObjectSalaryApi();
Integer pkiSalaryID = null; // Integer | 
try {
    SalaryGetAttachmentsV1Response result = apiInstance.salaryGetAttachmentsV1(pkiSalaryID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSalaryApi#salaryGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSalaryID** | **Integer**|  | [default to null]

### Return type

[**SalaryGetAttachmentsV1Response**](SalaryGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## salaryImportIntoEDMV1

> SalaryImportIntoEDMV1Response salaryImportIntoEDMV1(pkiSalaryID, salaryImportIntoEDMV1Request)

Import attachments into the Salary

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSalaryApi;

ObjectSalaryApi apiInstance = new ObjectSalaryApi();
Integer pkiSalaryID = null; // Integer | 
SalaryImportIntoEDMV1Request salaryImportIntoEDMV1Request = new SalaryImportIntoEDMV1Request(); // SalaryImportIntoEDMV1Request | 
try {
    SalaryImportIntoEDMV1Response result = apiInstance.salaryImportIntoEDMV1(pkiSalaryID, salaryImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSalaryApi#salaryImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSalaryID** | **Integer**|  | [default to null]
 **salaryImportIntoEDMV1Request** | [**SalaryImportIntoEDMV1Request**](SalaryImportIntoEDMV1Request.md)|  |

### Return type

[**SalaryImportIntoEDMV1Response**](SalaryImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

