# ObjectDepositApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**depositBatchDownloadV1**](ObjectDepositApi.md#depositBatchDownloadV1) | **POST** /1/object/deposit/{pkiDepositID}/batchDownload | Download multiples attachments from a Deposit
[**depositGetAttachmentsV1**](ObjectDepositApi.md#depositGetAttachmentsV1) | **GET** /1/object/deposit/{pkiDepositID}/getAttachments | Retrieve Deposit&#39;s attachments
[**depositGetCommunicationCountV1**](ObjectDepositApi.md#depositGetCommunicationCountV1) | **GET** /1/object/deposit/{pkiDepositID}/getCommunicationCount | Retrieve Communication count
[**depositGetCommunicationListV1**](ObjectDepositApi.md#depositGetCommunicationListV1) | **GET** /1/object/deposit/{pkiDepositID}/getCommunicationList | Retrieve Communication list
[**depositGetCommunicationrecipientsV1**](ObjectDepositApi.md#depositGetCommunicationrecipientsV1) | **GET** /1/object/deposit/{pkiDepositID}/getCommunicationrecipients | Retrieve Communication recipients
[**depositGetCommunicationsendersV1**](ObjectDepositApi.md#depositGetCommunicationsendersV1) | **GET** /1/object/deposit/{pkiDepositID}/getCommunicationsenders | Retrieve Communication senders
[**depositImportIntoEDMV1**](ObjectDepositApi.md#depositImportIntoEDMV1) | **POST** /1/object/deposit/{pkiDepositID}/importIntoEDM | Import attachments into the Deposit



## depositBatchDownloadV1

> File depositBatchDownloadV1(pkiDepositID, depositBatchDownloadV1Request)

Download multiples attachments from a Deposit

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDepositApi;

ObjectDepositApi apiInstance = new ObjectDepositApi();
Integer pkiDepositID = null; // Integer | 
DepositBatchDownloadV1Request depositBatchDownloadV1Request = new DepositBatchDownloadV1Request(); // DepositBatchDownloadV1Request | 
try {
    File result = apiInstance.depositBatchDownloadV1(pkiDepositID, depositBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDepositApi#depositBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDepositID** | **Integer**|  | [default to null]
 **depositBatchDownloadV1Request** | [**DepositBatchDownloadV1Request**](DepositBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## depositGetAttachmentsV1

> DepositGetAttachmentsV1Response depositGetAttachmentsV1(pkiDepositID)

Retrieve Deposit&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDepositApi;

ObjectDepositApi apiInstance = new ObjectDepositApi();
Integer pkiDepositID = null; // Integer | 
try {
    DepositGetAttachmentsV1Response result = apiInstance.depositGetAttachmentsV1(pkiDepositID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDepositApi#depositGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDepositID** | **Integer**|  | [default to null]

### Return type

[**DepositGetAttachmentsV1Response**](DepositGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## depositGetCommunicationCountV1

> DepositGetCommunicationCountV1Response depositGetCommunicationCountV1(pkiDepositID)

Retrieve Communication count

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDepositApi;

ObjectDepositApi apiInstance = new ObjectDepositApi();
Integer pkiDepositID = null; // Integer | 
try {
    DepositGetCommunicationCountV1Response result = apiInstance.depositGetCommunicationCountV1(pkiDepositID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDepositApi#depositGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDepositID** | **Integer**|  | [default to null]

### Return type

[**DepositGetCommunicationCountV1Response**](DepositGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## depositGetCommunicationListV1

> DepositGetCommunicationListV1Response depositGetCommunicationListV1(pkiDepositID)

Retrieve Communication list

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDepositApi;

ObjectDepositApi apiInstance = new ObjectDepositApi();
Integer pkiDepositID = null; // Integer | 
try {
    DepositGetCommunicationListV1Response result = apiInstance.depositGetCommunicationListV1(pkiDepositID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDepositApi#depositGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDepositID** | **Integer**|  | [default to null]

### Return type

[**DepositGetCommunicationListV1Response**](DepositGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## depositGetCommunicationrecipientsV1

> DepositGetCommunicationrecipientsV1Response depositGetCommunicationrecipientsV1(pkiDepositID)

Retrieve Communication recipients

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDepositApi;

ObjectDepositApi apiInstance = new ObjectDepositApi();
Integer pkiDepositID = null; // Integer | 
try {
    DepositGetCommunicationrecipientsV1Response result = apiInstance.depositGetCommunicationrecipientsV1(pkiDepositID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDepositApi#depositGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDepositID** | **Integer**|  | [default to null]

### Return type

[**DepositGetCommunicationrecipientsV1Response**](DepositGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## depositGetCommunicationsendersV1

> DepositGetCommunicationsendersV1Response depositGetCommunicationsendersV1(pkiDepositID)

Retrieve Communication senders

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDepositApi;

ObjectDepositApi apiInstance = new ObjectDepositApi();
Integer pkiDepositID = null; // Integer | 
try {
    DepositGetCommunicationsendersV1Response result = apiInstance.depositGetCommunicationsendersV1(pkiDepositID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDepositApi#depositGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDepositID** | **Integer**|  | [default to null]

### Return type

[**DepositGetCommunicationsendersV1Response**](DepositGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## depositImportIntoEDMV1

> DepositImportIntoEDMV1Response depositImportIntoEDMV1(pkiDepositID, depositImportIntoEDMV1Request)

Import attachments into the Deposit

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDepositApi;

ObjectDepositApi apiInstance = new ObjectDepositApi();
Integer pkiDepositID = null; // Integer | 
DepositImportIntoEDMV1Request depositImportIntoEDMV1Request = new DepositImportIntoEDMV1Request(); // DepositImportIntoEDMV1Request | 
try {
    DepositImportIntoEDMV1Response result = apiInstance.depositImportIntoEDMV1(pkiDepositID, depositImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDepositApi#depositImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDepositID** | **Integer**|  | [default to null]
 **depositImportIntoEDMV1Request** | [**DepositImportIntoEDMV1Request**](DepositImportIntoEDMV1Request.md)|  |

### Return type

[**DepositImportIntoEDMV1Response**](DepositImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

