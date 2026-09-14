# ObjectCommissionadvanceApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commissionadvanceBatchDownloadV1**](ObjectCommissionadvanceApi.md#commissionadvanceBatchDownloadV1) | **POST** /1/object/commissionadvance/{pkiCommissionadvanceID}/batchDownload | Download multiples attachments from a Commission advance
[**commissionadvanceGetAttachmentsV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetAttachmentsV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getAttachments | Retrieve Commissionadvance&#39;s attachments
[**commissionadvanceGetCommunicationCountV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetCommunicationCountV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getCommunicationCount | Retrieve Communication count
[**commissionadvanceGetCommunicationListV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetCommunicationListV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getCommunicationList | Retrieve Communication list
[**commissionadvanceGetCommunicationrecipientsV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetCommunicationrecipientsV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getCommunicationrecipients | Retrieve Communication recipients
[**commissionadvanceGetCommunicationsendersV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetCommunicationsendersV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getCommunicationsenders | Retrieve Communication senders
[**commissionadvanceImportIntoEDMV1**](ObjectCommissionadvanceApi.md#commissionadvanceImportIntoEDMV1) | **POST** /1/object/commissionadvance/{pkiCommissionadvanceID}/importIntoEDM | Import attachments into the Commissionadvance



## commissionadvanceBatchDownloadV1

> File commissionadvanceBatchDownloadV1(pkiCommissionadvanceID, commissionadvanceBatchDownloadV1Request)

Download multiples attachments from a Commission advance

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCommissionadvanceApi;

ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi();
Integer pkiCommissionadvanceID = null; // Integer | 
CommissionadvanceBatchDownloadV1Request commissionadvanceBatchDownloadV1Request = new CommissionadvanceBatchDownloadV1Request(); // CommissionadvanceBatchDownloadV1Request | 
try {
    File result = apiInstance.commissionadvanceBatchDownloadV1(pkiCommissionadvanceID, commissionadvanceBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCommissionadvanceID** | **Integer**|  | [default to null]
 **commissionadvanceBatchDownloadV1Request** | [**CommissionadvanceBatchDownloadV1Request**](CommissionadvanceBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## commissionadvanceGetAttachmentsV1

> CommissionadvanceGetAttachmentsV1Response commissionadvanceGetAttachmentsV1(pkiCommissionadvanceID)

Retrieve Commissionadvance&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCommissionadvanceApi;

ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi();
Integer pkiCommissionadvanceID = null; // Integer | 
try {
    CommissionadvanceGetAttachmentsV1Response result = apiInstance.commissionadvanceGetAttachmentsV1(pkiCommissionadvanceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCommissionadvanceID** | **Integer**|  | [default to null]

### Return type

[**CommissionadvanceGetAttachmentsV1Response**](CommissionadvanceGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## commissionadvanceGetCommunicationCountV1

> CommissionadvanceGetCommunicationCountV1Response commissionadvanceGetCommunicationCountV1(pkiCommissionadvanceID)

Retrieve Communication count

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCommissionadvanceApi;

ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi();
Integer pkiCommissionadvanceID = null; // Integer | 
try {
    CommissionadvanceGetCommunicationCountV1Response result = apiInstance.commissionadvanceGetCommunicationCountV1(pkiCommissionadvanceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCommissionadvanceID** | **Integer**|  | [default to null]

### Return type

[**CommissionadvanceGetCommunicationCountV1Response**](CommissionadvanceGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## commissionadvanceGetCommunicationListV1

> CommissionadvanceGetCommunicationListV1Response commissionadvanceGetCommunicationListV1(pkiCommissionadvanceID)

Retrieve Communication list

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCommissionadvanceApi;

ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi();
Integer pkiCommissionadvanceID = null; // Integer | 
try {
    CommissionadvanceGetCommunicationListV1Response result = apiInstance.commissionadvanceGetCommunicationListV1(pkiCommissionadvanceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCommissionadvanceID** | **Integer**|  | [default to null]

### Return type

[**CommissionadvanceGetCommunicationListV1Response**](CommissionadvanceGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## commissionadvanceGetCommunicationrecipientsV1

> CommissionadvanceGetCommunicationrecipientsV1Response commissionadvanceGetCommunicationrecipientsV1(pkiCommissionadvanceID)

Retrieve Communication recipients

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCommissionadvanceApi;

ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi();
Integer pkiCommissionadvanceID = null; // Integer | 
try {
    CommissionadvanceGetCommunicationrecipientsV1Response result = apiInstance.commissionadvanceGetCommunicationrecipientsV1(pkiCommissionadvanceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCommissionadvanceID** | **Integer**|  | [default to null]

### Return type

[**CommissionadvanceGetCommunicationrecipientsV1Response**](CommissionadvanceGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## commissionadvanceGetCommunicationsendersV1

> CommissionadvanceGetCommunicationsendersV1Response commissionadvanceGetCommunicationsendersV1(pkiCommissionadvanceID)

Retrieve Communication senders

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCommissionadvanceApi;

ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi();
Integer pkiCommissionadvanceID = null; // Integer | 
try {
    CommissionadvanceGetCommunicationsendersV1Response result = apiInstance.commissionadvanceGetCommunicationsendersV1(pkiCommissionadvanceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCommissionadvanceID** | **Integer**|  | [default to null]

### Return type

[**CommissionadvanceGetCommunicationsendersV1Response**](CommissionadvanceGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## commissionadvanceImportIntoEDMV1

> CommissionadvanceImportIntoEDMV1Response commissionadvanceImportIntoEDMV1(pkiCommissionadvanceID, commissionadvanceImportIntoEDMV1Request)

Import attachments into the Commissionadvance

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCommissionadvanceApi;

ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi();
Integer pkiCommissionadvanceID = null; // Integer | 
CommissionadvanceImportIntoEDMV1Request commissionadvanceImportIntoEDMV1Request = new CommissionadvanceImportIntoEDMV1Request(); // CommissionadvanceImportIntoEDMV1Request | 
try {
    CommissionadvanceImportIntoEDMV1Response result = apiInstance.commissionadvanceImportIntoEDMV1(pkiCommissionadvanceID, commissionadvanceImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCommissionadvanceID** | **Integer**|  | [default to null]
 **commissionadvanceImportIntoEDMV1Request** | [**CommissionadvanceImportIntoEDMV1Request**](CommissionadvanceImportIntoEDMV1Request.md)|  |

### Return type

[**CommissionadvanceImportIntoEDMV1Response**](CommissionadvanceImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

