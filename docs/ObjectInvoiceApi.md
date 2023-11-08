# ObjectInvoiceApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoiceGetCommunicationListV1**](ObjectInvoiceApi.md#invoiceGetCommunicationListV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationList | Retrieve Communication list



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

