# ObjectElectronicfundstransferApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eletronicfundstransferGetCommunicationListV1**](ObjectElectronicfundstransferApi.md#eletronicfundstransferGetCommunicationListV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationList | Retrieve Communication list



## eletronicfundstransferGetCommunicationListV1

> ElectronicfundstransferGetCommunicationListV1Response eletronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectElectronicfundstransferApi;

ObjectElectronicfundstransferApi apiInstance = new ObjectElectronicfundstransferApi();
Integer pkiElectronicfundstransferID = null; // Integer | 
try {
    ElectronicfundstransferGetCommunicationListV1Response result = apiInstance.eletronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectElectronicfundstransferApi#eletronicfundstransferGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiElectronicfundstransferID** | **Integer**|  | [default to null]

### Return type

[**ElectronicfundstransferGetCommunicationListV1Response**](ElectronicfundstransferGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

