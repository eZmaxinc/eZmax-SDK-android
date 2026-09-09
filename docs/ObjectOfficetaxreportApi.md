# ObjectOfficetaxreportApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**officetaxreportBatchDownloadV1**](ObjectOfficetaxreportApi.md#officetaxreportBatchDownloadV1) | **POST** /1/object/officetaxreport/{pkiOfficetaxreportID}/batchDownload | Download multiples attachments from an Officetaxreport
[**officetaxreportGetAttachmentsV1**](ObjectOfficetaxreportApi.md#officetaxreportGetAttachmentsV1) | **GET** /1/object/officetaxreport/{pkiOfficetaxreportID}/getAttachments | Retrieve Officetaxreport&#39;s attachments
[**officetaxreportImportIntoEDMV1**](ObjectOfficetaxreportApi.md#officetaxreportImportIntoEDMV1) | **POST** /1/object/officetaxreport/{pkiOfficetaxreportID}/importIntoEDM | Import attachments into the Officetaxreport



## officetaxreportBatchDownloadV1

> File officetaxreportBatchDownloadV1(pkiOfficetaxreportID, officetaxreportBatchDownloadV1Request)

Download multiples attachments from an Officetaxreport

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectOfficetaxreportApi;

ObjectOfficetaxreportApi apiInstance = new ObjectOfficetaxreportApi();
Integer pkiOfficetaxreportID = null; // Integer | 
OfficetaxreportBatchDownloadV1Request officetaxreportBatchDownloadV1Request = new OfficetaxreportBatchDownloadV1Request(); // OfficetaxreportBatchDownloadV1Request | 
try {
    File result = apiInstance.officetaxreportBatchDownloadV1(pkiOfficetaxreportID, officetaxreportBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectOfficetaxreportApi#officetaxreportBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiOfficetaxreportID** | **Integer**|  | [default to null]
 **officetaxreportBatchDownloadV1Request** | [**OfficetaxreportBatchDownloadV1Request**](OfficetaxreportBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## officetaxreportGetAttachmentsV1

> OfficetaxreportGetAttachmentsV1Response officetaxreportGetAttachmentsV1(pkiOfficetaxreportID)

Retrieve Officetaxreport&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectOfficetaxreportApi;

ObjectOfficetaxreportApi apiInstance = new ObjectOfficetaxreportApi();
Integer pkiOfficetaxreportID = null; // Integer | 
try {
    OfficetaxreportGetAttachmentsV1Response result = apiInstance.officetaxreportGetAttachmentsV1(pkiOfficetaxreportID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectOfficetaxreportApi#officetaxreportGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiOfficetaxreportID** | **Integer**|  | [default to null]

### Return type

[**OfficetaxreportGetAttachmentsV1Response**](OfficetaxreportGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## officetaxreportImportIntoEDMV1

> OfficetaxreportImportIntoEDMV1Response officetaxreportImportIntoEDMV1(pkiOfficetaxreportID, officetaxreportImportIntoEDMV1Request)

Import attachments into the Officetaxreport

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectOfficetaxreportApi;

ObjectOfficetaxreportApi apiInstance = new ObjectOfficetaxreportApi();
Integer pkiOfficetaxreportID = null; // Integer | 
OfficetaxreportImportIntoEDMV1Request officetaxreportImportIntoEDMV1Request = new OfficetaxreportImportIntoEDMV1Request(); // OfficetaxreportImportIntoEDMV1Request | 
try {
    OfficetaxreportImportIntoEDMV1Response result = apiInstance.officetaxreportImportIntoEDMV1(pkiOfficetaxreportID, officetaxreportImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectOfficetaxreportApi#officetaxreportImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiOfficetaxreportID** | **Integer**|  | [default to null]
 **officetaxreportImportIntoEDMV1Request** | [**OfficetaxreportImportIntoEDMV1Request**](OfficetaxreportImportIntoEDMV1Request.md)|  |

### Return type

[**OfficetaxreportImportIntoEDMV1Response**](OfficetaxreportImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

