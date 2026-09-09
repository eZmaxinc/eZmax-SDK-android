# ObjectFolderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**folderBatchDownloadV1**](ObjectFolderApi.md#folderBatchDownloadV1) | **POST** /1/object/folder/{pkiFolderID}/batchDownload | Download multiples attachments from an Folder
[**folderGetAttachmentsV1**](ObjectFolderApi.md#folderGetAttachmentsV1) | **GET** /1/object/folder/{pkiFolderID}/getAttachments | Retrieve Folder&#39;s attachments
[**folderImportIntoEDMV1**](ObjectFolderApi.md#folderImportIntoEDMV1) | **POST** /1/object/folder/{pkiFolderID}/importIntoEDM | Import attachments into the Folder



## folderBatchDownloadV1

> File folderBatchDownloadV1(pkiFolderID, folderBatchDownloadV1Request)

Download multiples attachments from an Folder

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectFolderApi;

ObjectFolderApi apiInstance = new ObjectFolderApi();
Integer pkiFolderID = null; // Integer | 
FolderBatchDownloadV1Request folderBatchDownloadV1Request = new FolderBatchDownloadV1Request(); // FolderBatchDownloadV1Request | 
try {
    File result = apiInstance.folderBatchDownloadV1(pkiFolderID, folderBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectFolderApi#folderBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiFolderID** | **Integer**|  | [default to null]
 **folderBatchDownloadV1Request** | [**FolderBatchDownloadV1Request**](FolderBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## folderGetAttachmentsV1

> FolderGetAttachmentsV1Response folderGetAttachmentsV1(pkiFolderID)

Retrieve Folder&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectFolderApi;

ObjectFolderApi apiInstance = new ObjectFolderApi();
Integer pkiFolderID = null; // Integer | 
try {
    FolderGetAttachmentsV1Response result = apiInstance.folderGetAttachmentsV1(pkiFolderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectFolderApi#folderGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiFolderID** | **Integer**|  | [default to null]

### Return type

[**FolderGetAttachmentsV1Response**](FolderGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## folderImportIntoEDMV1

> FolderImportIntoEDMV1Response folderImportIntoEDMV1(pkiFolderID, folderImportIntoEDMV1Request)

Import attachments into the Folder

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectFolderApi;

ObjectFolderApi apiInstance = new ObjectFolderApi();
Integer pkiFolderID = null; // Integer | 
FolderImportIntoEDMV1Request folderImportIntoEDMV1Request = new FolderImportIntoEDMV1Request(); // FolderImportIntoEDMV1Request | 
try {
    FolderImportIntoEDMV1Response result = apiInstance.folderImportIntoEDMV1(pkiFolderID, folderImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectFolderApi#folderImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiFolderID** | **Integer**|  | [default to null]
 **folderImportIntoEDMV1Request** | [**FolderImportIntoEDMV1Request**](FolderImportIntoEDMV1Request.md)|  |

### Return type

[**FolderImportIntoEDMV1Response**](FolderImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

