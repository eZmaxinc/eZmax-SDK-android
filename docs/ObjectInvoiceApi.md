# ObjectInvoiceApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoiceGetAttachmentsV1**](ObjectInvoiceApi.md#invoiceGetAttachmentsV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getAttachments | Retrieve Invoice&#39;s Attachments
[**invoiceGetCommunicationCountV1**](ObjectInvoiceApi.md#invoiceGetCommunicationCountV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationCount | Retrieve Communication count
[**invoiceGetCommunicationListV1**](ObjectInvoiceApi.md#invoiceGetCommunicationListV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationList | Retrieve Communication list
[**invoiceGetCommunicationrecipientsV1**](ObjectInvoiceApi.md#invoiceGetCommunicationrecipientsV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationrecipients | Retrieve Invoice&#39;s Communicationrecipient
[**invoiceGetCommunicationsendersV1**](ObjectInvoiceApi.md#invoiceGetCommunicationsendersV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationsenders | Retrieve Invoice&#39;s Communicationsender



## invoiceGetAttachmentsV1

> InvoiceGetAttachmentsV1Response invoiceGetAttachmentsV1(pkiInvoiceID)

Retrieve Invoice&#39;s Attachments



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInvoiceApi;

ObjectInvoiceApi apiInstance = new ObjectInvoiceApi();
Integer pkiInvoiceID = null; // Integer | 
try {
    InvoiceGetAttachmentsV1Response result = apiInstance.invoiceGetAttachmentsV1(pkiInvoiceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInvoiceApi#invoiceGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInvoiceID** | **Integer**|  | [default to null]

### Return type

[**InvoiceGetAttachmentsV1Response**](InvoiceGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## invoiceGetCommunicationCountV1

> InvoiceGetCommunicationCountV1Response invoiceGetCommunicationCountV1(pkiInvoiceID)

Retrieve Communication count



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInvoiceApi;

ObjectInvoiceApi apiInstance = new ObjectInvoiceApi();
Integer pkiInvoiceID = null; // Integer | 
try {
    InvoiceGetCommunicationCountV1Response result = apiInstance.invoiceGetCommunicationCountV1(pkiInvoiceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInvoiceApi#invoiceGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInvoiceID** | **Integer**|  | [default to null]

### Return type

[**InvoiceGetCommunicationCountV1Response**](InvoiceGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## invoiceGetCommunicationListV1

> InvoiceGetCommunicationListV1Response invoiceGetCommunicationListV1(pkiInvoiceID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInvoiceApi;

ObjectInvoiceApi apiInstance = new ObjectInvoiceApi();
Integer pkiInvoiceID = null; // Integer | 
try {
    InvoiceGetCommunicationListV1Response result = apiInstance.invoiceGetCommunicationListV1(pkiInvoiceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInvoiceApi#invoiceGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInvoiceID** | **Integer**|  | [default to null]

### Return type

[**InvoiceGetCommunicationListV1Response**](InvoiceGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## invoiceGetCommunicationrecipientsV1

> InvoiceGetCommunicationrecipientsV1Response invoiceGetCommunicationrecipientsV1(pkiInvoiceID)

Retrieve Invoice&#39;s Communicationrecipient



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInvoiceApi;

ObjectInvoiceApi apiInstance = new ObjectInvoiceApi();
Integer pkiInvoiceID = null; // Integer | 
try {
    InvoiceGetCommunicationrecipientsV1Response result = apiInstance.invoiceGetCommunicationrecipientsV1(pkiInvoiceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInvoiceApi#invoiceGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInvoiceID** | **Integer**|  | [default to null]

### Return type

[**InvoiceGetCommunicationrecipientsV1Response**](InvoiceGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## invoiceGetCommunicationsendersV1

> InvoiceGetCommunicationsendersV1Response invoiceGetCommunicationsendersV1(pkiInvoiceID)

Retrieve Invoice&#39;s Communicationsender



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInvoiceApi;

ObjectInvoiceApi apiInstance = new ObjectInvoiceApi();
Integer pkiInvoiceID = null; // Integer | 
try {
    InvoiceGetCommunicationsendersV1Response result = apiInstance.invoiceGetCommunicationsendersV1(pkiInvoiceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInvoiceApi#invoiceGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInvoiceID** | **Integer**|  | [default to null]

### Return type

[**InvoiceGetCommunicationsendersV1Response**](InvoiceGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

