# ObjectAdjustmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjustmentBatchDownloadV1**](ObjectAdjustmentApi.md#adjustmentBatchDownloadV1) | **POST** /1/object/adjustment/{pkiAdjustmentID}/batchDownload | Download multiples attachments from an Adjustment
[**adjustmentGetAttachmentsV1**](ObjectAdjustmentApi.md#adjustmentGetAttachmentsV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getAttachments | Retrieve Adjustment&#39;s attachments
[**adjustmentGetCommunicationCountV1**](ObjectAdjustmentApi.md#adjustmentGetCommunicationCountV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getCommunicationCount | Retrieve Communication count
[**adjustmentGetCommunicationListV1**](ObjectAdjustmentApi.md#adjustmentGetCommunicationListV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getCommunicationList | Retrieve Communication list
[**adjustmentGetCommunicationrecipientsV1**](ObjectAdjustmentApi.md#adjustmentGetCommunicationrecipientsV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getCommunicationrecipients | Retrieve Communication recipients
[**adjustmentGetCommunicationsendersV1**](ObjectAdjustmentApi.md#adjustmentGetCommunicationsendersV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getCommunicationsenders | Retrieve Communication senders
[**adjustmentImportIntoEDMV1**](ObjectAdjustmentApi.md#adjustmentImportIntoEDMV1) | **POST** /1/object/adjustment/{pkiAdjustmentID}/importIntoEDM | Import attachments into the Adjustment



## adjustmentBatchDownloadV1

> File adjustmentBatchDownloadV1(pkiAdjustmentID, adjustmentBatchDownloadV1Request)

Download multiples attachments from an Adjustment

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAdjustmentApi;

ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi();
Integer pkiAdjustmentID = null; // Integer | 
AdjustmentBatchDownloadV1Request adjustmentBatchDownloadV1Request = new AdjustmentBatchDownloadV1Request(); // AdjustmentBatchDownloadV1Request | 
try {
    File result = apiInstance.adjustmentBatchDownloadV1(pkiAdjustmentID, adjustmentBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAdjustmentID** | **Integer**|  | [default to null]
 **adjustmentBatchDownloadV1Request** | [**AdjustmentBatchDownloadV1Request**](AdjustmentBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## adjustmentGetAttachmentsV1

> AdjustmentGetAttachmentsV1Response adjustmentGetAttachmentsV1(pkiAdjustmentID)

Retrieve Adjustment&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAdjustmentApi;

ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi();
Integer pkiAdjustmentID = null; // Integer | 
try {
    AdjustmentGetAttachmentsV1Response result = apiInstance.adjustmentGetAttachmentsV1(pkiAdjustmentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAdjustmentID** | **Integer**|  | [default to null]

### Return type

[**AdjustmentGetAttachmentsV1Response**](AdjustmentGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adjustmentGetCommunicationCountV1

> AdjustmentGetCommunicationCountV1Response adjustmentGetCommunicationCountV1(pkiAdjustmentID)

Retrieve Communication count

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAdjustmentApi;

ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi();
Integer pkiAdjustmentID = null; // Integer | 
try {
    AdjustmentGetCommunicationCountV1Response result = apiInstance.adjustmentGetCommunicationCountV1(pkiAdjustmentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAdjustmentID** | **Integer**|  | [default to null]

### Return type

[**AdjustmentGetCommunicationCountV1Response**](AdjustmentGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adjustmentGetCommunicationListV1

> AdjustmentGetCommunicationListV1Response adjustmentGetCommunicationListV1(pkiAdjustmentID)

Retrieve Communication list

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAdjustmentApi;

ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi();
Integer pkiAdjustmentID = null; // Integer | 
try {
    AdjustmentGetCommunicationListV1Response result = apiInstance.adjustmentGetCommunicationListV1(pkiAdjustmentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAdjustmentID** | **Integer**|  | [default to null]

### Return type

[**AdjustmentGetCommunicationListV1Response**](AdjustmentGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adjustmentGetCommunicationrecipientsV1

> AdjustmentGetCommunicationrecipientsV1Response adjustmentGetCommunicationrecipientsV1(pkiAdjustmentID)

Retrieve Communication recipients

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAdjustmentApi;

ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi();
Integer pkiAdjustmentID = null; // Integer | 
try {
    AdjustmentGetCommunicationrecipientsV1Response result = apiInstance.adjustmentGetCommunicationrecipientsV1(pkiAdjustmentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAdjustmentID** | **Integer**|  | [default to null]

### Return type

[**AdjustmentGetCommunicationrecipientsV1Response**](AdjustmentGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adjustmentGetCommunicationsendersV1

> AdjustmentGetCommunicationsendersV1Response adjustmentGetCommunicationsendersV1(pkiAdjustmentID)

Retrieve Communication senders

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAdjustmentApi;

ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi();
Integer pkiAdjustmentID = null; // Integer | 
try {
    AdjustmentGetCommunicationsendersV1Response result = apiInstance.adjustmentGetCommunicationsendersV1(pkiAdjustmentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAdjustmentID** | **Integer**|  | [default to null]

### Return type

[**AdjustmentGetCommunicationsendersV1Response**](AdjustmentGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adjustmentImportIntoEDMV1

> AdjustmentImportIntoEDMV1Response adjustmentImportIntoEDMV1(pkiAdjustmentID, adjustmentImportIntoEDMV1Request)

Import attachments into the Adjustment

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAdjustmentApi;

ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi();
Integer pkiAdjustmentID = null; // Integer | 
AdjustmentImportIntoEDMV1Request adjustmentImportIntoEDMV1Request = new AdjustmentImportIntoEDMV1Request(); // AdjustmentImportIntoEDMV1Request | 
try {
    AdjustmentImportIntoEDMV1Response result = apiInstance.adjustmentImportIntoEDMV1(pkiAdjustmentID, adjustmentImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAdjustmentID** | **Integer**|  | [default to null]
 **adjustmentImportIntoEDMV1Request** | [**AdjustmentImportIntoEDMV1Request**](AdjustmentImportIntoEDMV1Request.md)|  |

### Return type

[**AdjustmentImportIntoEDMV1Response**](AdjustmentImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

