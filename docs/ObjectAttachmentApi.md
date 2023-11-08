# ObjectAttachmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachmentDownloadV1**](ObjectAttachmentApi.md#attachmentDownloadV1) | **GET** /1/object/attachment/{pkiAttachmentID}/download | Retrieve the content



## attachmentDownloadV1

> AttachmentDownloadV1Response attachmentDownloadV1(pkiAttachmentID)

Retrieve the content

Using this endpoint, you can retrieve the content of an attachment.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAttachmentApi;

ObjectAttachmentApi apiInstance = new ObjectAttachmentApi();
Integer pkiAttachmentID = null; // Integer | 
try {
    AttachmentDownloadV1Response result = apiInstance.attachmentDownloadV1(pkiAttachmentID);
    System.out.println(result);
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

[**AttachmentDownloadV1Response**](AttachmentDownloadV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

