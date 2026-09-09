# ObjectLeadApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadBatchDownloadV1**](ObjectLeadApi.md#leadBatchDownloadV1) | **POST** /1/object/lead/{pkiLeadID}/batchDownload | Download multiples attachments from a Lead
[**leadGetAttachmentsV1**](ObjectLeadApi.md#leadGetAttachmentsV1) | **GET** /1/object/lead/{pkiLeadID}/getAttachments | Retrieve Lead&#39;s attachments
[**leadGetListV1**](ObjectLeadApi.md#leadGetListV1) | **GET** /1/object/lead/getList | Retrieve Lead list
[**leadImportIntoEDMV1**](ObjectLeadApi.md#leadImportIntoEDMV1) | **POST** /1/object/lead/{pkiLeadID}/importIntoEDM | Import attachments into the Lead



## leadBatchDownloadV1

> File leadBatchDownloadV1(pkiLeadID, leadBatchDownloadV1Request)

Download multiples attachments from a Lead

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectLeadApi;

ObjectLeadApi apiInstance = new ObjectLeadApi();
Integer pkiLeadID = null; // Integer | 
LeadBatchDownloadV1Request leadBatchDownloadV1Request = new LeadBatchDownloadV1Request(); // LeadBatchDownloadV1Request | 
try {
    File result = apiInstance.leadBatchDownloadV1(pkiLeadID, leadBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectLeadApi#leadBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiLeadID** | **Integer**|  | [default to null]
 **leadBatchDownloadV1Request** | [**LeadBatchDownloadV1Request**](LeadBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## leadGetAttachmentsV1

> LeadGetAttachmentsV1Response leadGetAttachmentsV1(pkiLeadID)

Retrieve Lead&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectLeadApi;

ObjectLeadApi apiInstance = new ObjectLeadApi();
Integer pkiLeadID = null; // Integer | 
try {
    LeadGetAttachmentsV1Response result = apiInstance.leadGetAttachmentsV1(pkiLeadID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectLeadApi#leadGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiLeadID** | **Integer**|  | [default to null]

### Return type

[**LeadGetAttachmentsV1Response**](LeadGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## leadGetListV1

> LeadGetListV1Response leadGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Lead list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eLeadStatus | New&lt;br&gt;Dispatching&lt;br&gt;Assigned&lt;br&gt;Lost&lt;br&gt;Won |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectLeadApi;

ObjectLeadApi apiInstance = new ObjectLeadApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    LeadGetListV1Response result = apiInstance.leadGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectLeadApi#leadGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiLeadID_ASC, pkiLeadID_DESC, fkiLeadsourceID_ASC, fkiLeadsourceID_DESC, sLeadsourceNameX_ASC, sLeadsourceNameX_DESC, eLeadStatus_ASC, eLeadStatus_DESC, dtLeadExpiration_ASC, dtLeadExpiration_DESC, bLeadIsactive_ASC, bLeadIsactive_DESC, sLeadCode_ASC, sLeadCode_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**LeadGetListV1Response**](LeadGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## leadImportIntoEDMV1

> LeadImportIntoEDMV1Response leadImportIntoEDMV1(pkiLeadID, leadImportIntoEDMV1Request)

Import attachments into the Lead



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectLeadApi;

ObjectLeadApi apiInstance = new ObjectLeadApi();
Integer pkiLeadID = null; // Integer | 
LeadImportIntoEDMV1Request leadImportIntoEDMV1Request = new LeadImportIntoEDMV1Request(); // LeadImportIntoEDMV1Request | 
try {
    LeadImportIntoEDMV1Response result = apiInstance.leadImportIntoEDMV1(pkiLeadID, leadImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectLeadApi#leadImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiLeadID** | **Integer**|  | [default to null]
 **leadImportIntoEDMV1Request** | [**LeadImportIntoEDMV1Request**](LeadImportIntoEDMV1Request.md)|  |

### Return type

[**LeadImportIntoEDMV1Response**](LeadImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

