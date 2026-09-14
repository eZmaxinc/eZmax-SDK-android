# ObjectAttachmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachmentDeleteV1**](ObjectAttachmentApi.md#attachmentDeleteV1) | **POST** /1/object/attachment/{pkiAttachmentID}/delete | Delete an existing attachment
[**attachmentDownloadV1**](ObjectAttachmentApi.md#attachmentDownloadV1) | **GET** /1/object/attachment/{pkiAttachmentID}/download | Retrieve the content
[**attachmentGetAttachmentlogsV1**](ObjectAttachmentApi.md#attachmentGetAttachmentlogsV1) | **GET** /1/object/attachment/{pkiAttachmentID}/getAttachmentlogs | Retrieve the Attachmentlogs
[**attachmentRenameV1**](ObjectAttachmentApi.md#attachmentRenameV1) | **POST** /1/object/attachment/{pkiAttachmentID}/rename | Rename an attachment
[**attachmentRestoreV1**](ObjectAttachmentApi.md#attachmentRestoreV1) | **POST** /1/object/attachment/{pkiAttachmentID}/restore | Restore a deleted attachment
[**attachmentValidateV1**](ObjectAttachmentApi.md#attachmentValidateV1) | **PATCH** /1/object/attachment/{pkiAttachmentID}/validate | Validate an existing attachment



## attachmentDeleteV1

> AttachmentDeleteV1Response attachmentDeleteV1(pkiAttachmentID, body)

Delete an existing attachment

Te endpoint allows to delete an attachment.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAttachmentApi;

ObjectAttachmentApi apiInstance = new ObjectAttachmentApi();
Integer pkiAttachmentID = null; // Integer | 
Object body = null; // Object | 
try {
    AttachmentDeleteV1Response result = apiInstance.attachmentDeleteV1(pkiAttachmentID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAttachmentApi#attachmentDeleteV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAttachmentID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**AttachmentDeleteV1Response**](AttachmentDeleteV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


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


## attachmentRenameV1

> AttachmentRenameV1Response attachmentRenameV1(pkiAttachmentID, attachmentRenameV1Request)

Rename an attachment

The endpoint allows to change the attachment&#39;s file name and category.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAttachmentApi;

ObjectAttachmentApi apiInstance = new ObjectAttachmentApi();
Integer pkiAttachmentID = null; // Integer | 
AttachmentRenameV1Request attachmentRenameV1Request = new AttachmentRenameV1Request(); // AttachmentRenameV1Request | 
try {
    AttachmentRenameV1Response result = apiInstance.attachmentRenameV1(pkiAttachmentID, attachmentRenameV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAttachmentApi#attachmentRenameV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAttachmentID** | **Integer**|  | [default to null]
 **attachmentRenameV1Request** | [**AttachmentRenameV1Request**](AttachmentRenameV1Request.md)|  |

### Return type

[**AttachmentRenameV1Response**](AttachmentRenameV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## attachmentRestoreV1

> AttachmentRestoreV1Response attachmentRestoreV1(pkiAttachmentID, attachmentRestoreV1Request)

Restore a deleted attachment

The endpoints allows to restore a previously deleted attachment.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAttachmentApi;

ObjectAttachmentApi apiInstance = new ObjectAttachmentApi();
Integer pkiAttachmentID = null; // Integer | 
AttachmentRestoreV1Request attachmentRestoreV1Request = new AttachmentRestoreV1Request(); // AttachmentRestoreV1Request | 
try {
    AttachmentRestoreV1Response result = apiInstance.attachmentRestoreV1(pkiAttachmentID, attachmentRestoreV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAttachmentApi#attachmentRestoreV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAttachmentID** | **Integer**|  | [default to null]
 **attachmentRestoreV1Request** | [**AttachmentRestoreV1Request**](AttachmentRestoreV1Request.md)|  |

### Return type

[**AttachmentRestoreV1Response**](AttachmentRestoreV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## attachmentValidateV1

> AttachmentValidateV1Response attachmentValidateV1(pkiAttachmentID, attachmentValidateV1Request)

Validate an existing attachment

This endpoint allows to validate or reject an attachment.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAttachmentApi;

ObjectAttachmentApi apiInstance = new ObjectAttachmentApi();
Integer pkiAttachmentID = null; // Integer | 
AttachmentValidateV1Request attachmentValidateV1Request = new AttachmentValidateV1Request(); // AttachmentValidateV1Request | 
try {
    AttachmentValidateV1Response result = apiInstance.attachmentValidateV1(pkiAttachmentID, attachmentValidateV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAttachmentApi#attachmentValidateV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAttachmentID** | **Integer**|  | [default to null]
 **attachmentValidateV1Request** | [**AttachmentValidateV1Request**](AttachmentValidateV1Request.md)|  |

### Return type

[**AttachmentValidateV1Response**](AttachmentValidateV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

