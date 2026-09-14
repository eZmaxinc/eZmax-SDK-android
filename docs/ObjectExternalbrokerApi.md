# ObjectExternalbrokerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**externalbrokerBatchDownloadV1**](ObjectExternalbrokerApi.md#externalbrokerBatchDownloadV1) | **POST** /1/object/externalbroker/{pkiExternalbrokerID}/batchDownload | Download multiples attachments from an Externalbroker
[**externalbrokerGetAttachmentsV1**](ObjectExternalbrokerApi.md#externalbrokerGetAttachmentsV1) | **GET** /1/object/externalbroker/{pkiExternalbrokerID}/getAttachments | Retrieve Externalbroker&#39;s attachments
[**externalbrokerGetCommunicationCountV1**](ObjectExternalbrokerApi.md#externalbrokerGetCommunicationCountV1) | **GET** /1/object/externalbroker/{pkiExternalbrokerID}/getCommunicationCount | Retrieve Communication count
[**externalbrokerGetCommunicationListV1**](ObjectExternalbrokerApi.md#externalbrokerGetCommunicationListV1) | **GET** /1/object/externalbroker/{pkiExternalbrokerID}/getCommunicationList | Retrieve Communication list
[**externalbrokerGetCommunicationrecipientsV1**](ObjectExternalbrokerApi.md#externalbrokerGetCommunicationrecipientsV1) | **GET** /1/object/externalbroker/{pkiExternalbrokerID}/getCommunicationrecipients | Retrieve Communication recipients
[**externalbrokerGetCommunicationsendersV1**](ObjectExternalbrokerApi.md#externalbrokerGetCommunicationsendersV1) | **GET** /1/object/externalbroker/{pkiExternalbrokerID}/getCommunicationsenders | Retrieve Communication senders
[**externalbrokerImportIntoEDMV1**](ObjectExternalbrokerApi.md#externalbrokerImportIntoEDMV1) | **POST** /1/object/externalbroker/{pkiExternalbrokerID}/importIntoEDM | Import attachments into the Externalbroker



## externalbrokerBatchDownloadV1

> File externalbrokerBatchDownloadV1(pkiExternalbrokerID, externalbrokerBatchDownloadV1Request)

Download multiples attachments from an Externalbroker

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectExternalbrokerApi;

ObjectExternalbrokerApi apiInstance = new ObjectExternalbrokerApi();
Integer pkiExternalbrokerID = null; // Integer | 
ExternalbrokerBatchDownloadV1Request externalbrokerBatchDownloadV1Request = new ExternalbrokerBatchDownloadV1Request(); // ExternalbrokerBatchDownloadV1Request | 
try {
    File result = apiInstance.externalbrokerBatchDownloadV1(pkiExternalbrokerID, externalbrokerBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectExternalbrokerApi#externalbrokerBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiExternalbrokerID** | **Integer**|  | [default to null]
 **externalbrokerBatchDownloadV1Request** | [**ExternalbrokerBatchDownloadV1Request**](ExternalbrokerBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## externalbrokerGetAttachmentsV1

> ExternalbrokerGetAttachmentsV1Response externalbrokerGetAttachmentsV1(pkiExternalbrokerID)

Retrieve Externalbroker&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectExternalbrokerApi;

ObjectExternalbrokerApi apiInstance = new ObjectExternalbrokerApi();
Integer pkiExternalbrokerID = null; // Integer | 
try {
    ExternalbrokerGetAttachmentsV1Response result = apiInstance.externalbrokerGetAttachmentsV1(pkiExternalbrokerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectExternalbrokerApi#externalbrokerGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiExternalbrokerID** | **Integer**|  | [default to null]

### Return type

[**ExternalbrokerGetAttachmentsV1Response**](ExternalbrokerGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## externalbrokerGetCommunicationCountV1

> ExternalbrokerGetCommunicationCountV1Response externalbrokerGetCommunicationCountV1(pkiExternalbrokerID)

Retrieve Communication count

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectExternalbrokerApi;

ObjectExternalbrokerApi apiInstance = new ObjectExternalbrokerApi();
Integer pkiExternalbrokerID = null; // Integer | 
try {
    ExternalbrokerGetCommunicationCountV1Response result = apiInstance.externalbrokerGetCommunicationCountV1(pkiExternalbrokerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectExternalbrokerApi#externalbrokerGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiExternalbrokerID** | **Integer**|  | [default to null]

### Return type

[**ExternalbrokerGetCommunicationCountV1Response**](ExternalbrokerGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## externalbrokerGetCommunicationListV1

> ExternalbrokerGetCommunicationListV1Response externalbrokerGetCommunicationListV1(pkiExternalbrokerID)

Retrieve Communication list

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectExternalbrokerApi;

ObjectExternalbrokerApi apiInstance = new ObjectExternalbrokerApi();
Integer pkiExternalbrokerID = null; // Integer | 
try {
    ExternalbrokerGetCommunicationListV1Response result = apiInstance.externalbrokerGetCommunicationListV1(pkiExternalbrokerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectExternalbrokerApi#externalbrokerGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiExternalbrokerID** | **Integer**|  | [default to null]

### Return type

[**ExternalbrokerGetCommunicationListV1Response**](ExternalbrokerGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## externalbrokerGetCommunicationrecipientsV1

> ExternalbrokerGetCommunicationrecipientsV1Response externalbrokerGetCommunicationrecipientsV1(pkiExternalbrokerID)

Retrieve Communication recipients

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectExternalbrokerApi;

ObjectExternalbrokerApi apiInstance = new ObjectExternalbrokerApi();
Integer pkiExternalbrokerID = null; // Integer | 
try {
    ExternalbrokerGetCommunicationrecipientsV1Response result = apiInstance.externalbrokerGetCommunicationrecipientsV1(pkiExternalbrokerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectExternalbrokerApi#externalbrokerGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiExternalbrokerID** | **Integer**|  | [default to null]

### Return type

[**ExternalbrokerGetCommunicationrecipientsV1Response**](ExternalbrokerGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## externalbrokerGetCommunicationsendersV1

> ExternalbrokerGetCommunicationsendersV1Response externalbrokerGetCommunicationsendersV1(pkiExternalbrokerID)

Retrieve Communication senders

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectExternalbrokerApi;

ObjectExternalbrokerApi apiInstance = new ObjectExternalbrokerApi();
Integer pkiExternalbrokerID = null; // Integer | 
try {
    ExternalbrokerGetCommunicationsendersV1Response result = apiInstance.externalbrokerGetCommunicationsendersV1(pkiExternalbrokerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectExternalbrokerApi#externalbrokerGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiExternalbrokerID** | **Integer**|  | [default to null]

### Return type

[**ExternalbrokerGetCommunicationsendersV1Response**](ExternalbrokerGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## externalbrokerImportIntoEDMV1

> ExternalbrokerImportIntoEDMV1Response externalbrokerImportIntoEDMV1(pkiExternalbrokerID, externalbrokerImportIntoEDMV1Request)

Import attachments into the Externalbroker



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectExternalbrokerApi;

ObjectExternalbrokerApi apiInstance = new ObjectExternalbrokerApi();
Integer pkiExternalbrokerID = null; // Integer | 
ExternalbrokerImportIntoEDMV1Request externalbrokerImportIntoEDMV1Request = new ExternalbrokerImportIntoEDMV1Request(); // ExternalbrokerImportIntoEDMV1Request | 
try {
    ExternalbrokerImportIntoEDMV1Response result = apiInstance.externalbrokerImportIntoEDMV1(pkiExternalbrokerID, externalbrokerImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectExternalbrokerApi#externalbrokerImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiExternalbrokerID** | **Integer**|  | [default to null]
 **externalbrokerImportIntoEDMV1Request** | [**ExternalbrokerImportIntoEDMV1Request**](ExternalbrokerImportIntoEDMV1Request.md)|  |

### Return type

[**ExternalbrokerImportIntoEDMV1Response**](ExternalbrokerImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

