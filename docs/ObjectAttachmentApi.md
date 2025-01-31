# ObjectAttachmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachmentDownloadV1**](ObjectAttachmentApi.md#attachmentDownloadV1) | **GET** /1/object/attachment/{pkiAttachmentID}/download | Retrieve the content
[**attachmentGetAttachmentlogsV1**](ObjectAttachmentApi.md#attachmentGetAttachmentlogsV1) | **GET** /1/object/attachment/{pkiAttachmentID}/getAttachmentlogs | Retrieve the Attachmentlogs



## attachmentDownloadV1

> attachmentDownloadV1(pkiAttachmentID)

Retrieve the content

Using this endpoint, you can retrieve the content of an attachment.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAttachmentApi;

ObjectAttachmentApi apiInstance = new ObjectAttachmentApi();
Integer pkiAttachmentID = null; // Integer | 
try {
    apiInstance.attachmentDownloadV1(pkiAttachmentID);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAttachmentApi#attachmentDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAttachmentID** | **Integer**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization), [Presigned](../README.md#Presigned)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attachmentGetAttachmentlogsV1

> AttachmentGetAttachmentlogsV1Response attachmentGetAttachmentlogsV1(pkiAttachmentID)

Retrieve the Attachmentlogs

Using this endpoint, you can retrieve the Attachmentlogs of an attachment.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAttachmentApi;

ObjectAttachmentApi apiInstance = new ObjectAttachmentApi();
Integer pkiAttachmentID = null; // Integer | 
try {
    AttachmentGetAttachmentlogsV1Response result = apiInstance.attachmentGetAttachmentlogsV1(pkiAttachmentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAttachmentApi#attachmentGetAttachmentlogsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAttachmentID** | **Integer**|  | [default to null]

### Return type

[**AttachmentGetAttachmentlogsV1Response**](AttachmentGetAttachmentlogsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

