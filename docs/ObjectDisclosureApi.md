# ObjectDisclosureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disclosureBatchDownloadV1**](ObjectDisclosureApi.md#disclosureBatchDownloadV1) | **POST** /1/object/disclosure/{pkiDisclosureID}/batchDownload | Download multiples attachments from a Disclosure
[**disclosureGetAttachmentsV1**](ObjectDisclosureApi.md#disclosureGetAttachmentsV1) | **GET** /1/object/disclosure/{pkiDisclosureID}/getAttachments | Retrieve Disclosure&#39;s attachments
[**disclosureGetCommunicationCountV1**](ObjectDisclosureApi.md#disclosureGetCommunicationCountV1) | **GET** /1/object/disclosure/{pkiDisclosureID}/getCommunicationCount | Retrieve Communication count
[**disclosureGetCommunicationListV1**](ObjectDisclosureApi.md#disclosureGetCommunicationListV1) | **GET** /1/object/disclosure/{pkiDisclosureID}/getCommunicationList | Retrieve Communication list
[**disclosureGetCommunicationrecipientsV1**](ObjectDisclosureApi.md#disclosureGetCommunicationrecipientsV1) | **GET** /1/object/disclosure/{pkiDisclosureID}/getCommunicationrecipients | Retrieve Communication recipients
[**disclosureGetCommunicationsendersV1**](ObjectDisclosureApi.md#disclosureGetCommunicationsendersV1) | **GET** /1/object/disclosure/{pkiDisclosureID}/getCommunicationsenders | Retrieve Communication senders
[**disclosureImportIntoEDMV1**](ObjectDisclosureApi.md#disclosureImportIntoEDMV1) | **POST** /1/object/disclosure/{pkiDisclosureID}/importIntoEDM | Import attachments into the Disclosure



## disclosureBatchDownloadV1

> File disclosureBatchDownloadV1(pkiDisclosureID, disclosureBatchDownloadV1Request)

Download multiples attachments from a Disclosure

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDisclosureApi;

ObjectDisclosureApi apiInstance = new ObjectDisclosureApi();
Integer pkiDisclosureID = null; // Integer | 
DisclosureBatchDownloadV1Request disclosureBatchDownloadV1Request = new DisclosureBatchDownloadV1Request(); // DisclosureBatchDownloadV1Request | 
try {
    File result = apiInstance.disclosureBatchDownloadV1(pkiDisclosureID, disclosureBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDisclosureApi#disclosureBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDisclosureID** | **Integer**|  | [default to null]
 **disclosureBatchDownloadV1Request** | [**DisclosureBatchDownloadV1Request**](DisclosureBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## disclosureGetAttachmentsV1

> DisclosureGetAttachmentsV1Response disclosureGetAttachmentsV1(pkiDisclosureID)

Retrieve Disclosure&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDisclosureApi;

ObjectDisclosureApi apiInstance = new ObjectDisclosureApi();
Integer pkiDisclosureID = null; // Integer | 
try {
    DisclosureGetAttachmentsV1Response result = apiInstance.disclosureGetAttachmentsV1(pkiDisclosureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDisclosureApi#disclosureGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDisclosureID** | **Integer**|  | [default to null]

### Return type

[**DisclosureGetAttachmentsV1Response**](DisclosureGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## disclosureGetCommunicationCountV1

> DisclosureGetCommunicationCountV1Response disclosureGetCommunicationCountV1(pkiDisclosureID)

Retrieve Communication count

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDisclosureApi;

ObjectDisclosureApi apiInstance = new ObjectDisclosureApi();
Integer pkiDisclosureID = null; // Integer | 
try {
    DisclosureGetCommunicationCountV1Response result = apiInstance.disclosureGetCommunicationCountV1(pkiDisclosureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDisclosureApi#disclosureGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDisclosureID** | **Integer**|  | [default to null]

### Return type

[**DisclosureGetCommunicationCountV1Response**](DisclosureGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## disclosureGetCommunicationListV1

> DisclosureGetCommunicationListV1Response disclosureGetCommunicationListV1(pkiDisclosureID)

Retrieve Communication list

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDisclosureApi;

ObjectDisclosureApi apiInstance = new ObjectDisclosureApi();
Integer pkiDisclosureID = null; // Integer | 
try {
    DisclosureGetCommunicationListV1Response result = apiInstance.disclosureGetCommunicationListV1(pkiDisclosureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDisclosureApi#disclosureGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDisclosureID** | **Integer**|  | [default to null]

### Return type

[**DisclosureGetCommunicationListV1Response**](DisclosureGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## disclosureGetCommunicationrecipientsV1

> DisclosureGetCommunicationrecipientsV1Response disclosureGetCommunicationrecipientsV1(pkiDisclosureID)

Retrieve Communication recipients

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDisclosureApi;

ObjectDisclosureApi apiInstance = new ObjectDisclosureApi();
Integer pkiDisclosureID = null; // Integer | 
try {
    DisclosureGetCommunicationrecipientsV1Response result = apiInstance.disclosureGetCommunicationrecipientsV1(pkiDisclosureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDisclosureApi#disclosureGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDisclosureID** | **Integer**|  | [default to null]

### Return type

[**DisclosureGetCommunicationrecipientsV1Response**](DisclosureGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## disclosureGetCommunicationsendersV1

> DisclosureGetCommunicationsendersV1Response disclosureGetCommunicationsendersV1(pkiDisclosureID)

Retrieve Communication senders

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDisclosureApi;

ObjectDisclosureApi apiInstance = new ObjectDisclosureApi();
Integer pkiDisclosureID = null; // Integer | 
try {
    DisclosureGetCommunicationsendersV1Response result = apiInstance.disclosureGetCommunicationsendersV1(pkiDisclosureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDisclosureApi#disclosureGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDisclosureID** | **Integer**|  | [default to null]

### Return type

[**DisclosureGetCommunicationsendersV1Response**](DisclosureGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## disclosureImportIntoEDMV1

> DisclosureImportIntoEDMV1Response disclosureImportIntoEDMV1(pkiDisclosureID, disclosureImportIntoEDMV1Request)

Import attachments into the Disclosure

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDisclosureApi;

ObjectDisclosureApi apiInstance = new ObjectDisclosureApi();
Integer pkiDisclosureID = null; // Integer | 
DisclosureImportIntoEDMV1Request disclosureImportIntoEDMV1Request = new DisclosureImportIntoEDMV1Request(); // DisclosureImportIntoEDMV1Request | 
try {
    DisclosureImportIntoEDMV1Response result = apiInstance.disclosureImportIntoEDMV1(pkiDisclosureID, disclosureImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDisclosureApi#disclosureImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDisclosureID** | **Integer**|  | [default to null]
 **disclosureImportIntoEDMV1Request** | [**DisclosureImportIntoEDMV1Request**](DisclosureImportIntoEDMV1Request.md)|  |

### Return type

[**DisclosureImportIntoEDMV1Response**](DisclosureImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

